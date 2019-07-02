package com.github.kotvertolet.googleapitest;

import com.github.kotvertolet.googleapitest.model.Volume;
import com.github.kotvertolet.googleapitest.model.VolumesResponse;
import org.apache.commons.lang3.tuple.ImmutablePair;
import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static io.restassured.RestAssured.given;

public class TestSuite extends BaseTest {

    private String maskForOneBook = "There is %s book by %s";
    private String maskForManyBooks = "There are %s books by %s";

    @Test
    public void volumesTest() {
        VolumesResponse volumesResponse = getAllVolumesByName("омон ра");
        Set<String> authors = volumesResponse.getVolumes()
                .stream()
                .flatMap(v ->
                        Optional.ofNullable(v.getVolumeInfo().getAuthors()).map(Collection::stream).orElseGet(Stream::empty))
                .collect(Collectors.toSet());

        Map<String, List<Volume>> volumesBuAuthorMap = authors.stream()
                .flatMap(author -> {
                    List<Volume> volumesByAuthor = volumesResponse.getVolumes()
                            .stream()
                            .filter(volume -> {
                                List<String> volumeAuthors = volume.getVolumeInfo().getAuthors();
                                return volumeAuthors != null && volumeAuthors.size() > 0 && volumeAuthors.contains(author);
                            })
                            .collect(Collectors.toList());
                    return Stream.of(new ImmutablePair<>(author, volumesByAuthor));
                })
                .collect(Collectors.toMap(ImmutablePair::getLeft, ImmutablePair::getRight));

        volumesBuAuthorMap.entrySet().stream().forEach(entry -> {
            int volumesNumber = entry.getValue().size();
            String message;
            if (volumesNumber > 1) {
                message = String.format(maskForManyBooks, volumesNumber, entry.getKey());
            } else {
                message = String.format(maskForOneBook, volumesNumber, entry.getKey());
            }
            System.out.println(message);
        });

    }

    private VolumesResponse getAllVolumesByName(String name) {
        int startIndex = 0;
        VolumesResponse response = null;
        while (true) {
            VolumesResponse tempResponse = given()
                    .param("q", name)
                    .param("maxResults", 40)
                    .param("startIndex", startIndex)
                    .get("volumes")
                    .body()
                    .as(VolumesResponse.class);
            if (tempResponse.getVolumes() == null) {
                break;
            }

            if (response == null) {
                response = tempResponse;
            } else {
                response.getVolumes().addAll(tempResponse.getVolumes());
            }
            startIndex += 40;
        }
        return response;
    }
}
