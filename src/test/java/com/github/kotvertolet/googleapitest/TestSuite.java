package com.github.kotvertolet.googleapitest;

import com.github.kotvertolet.googleapitest.common.BaseTest;
import com.github.kotvertolet.googleapitest.common.SearchScope;
import com.github.kotvertolet.googleapitest.model.Volume;
import com.github.kotvertolet.googleapitest.model.VolumesResponse;
import org.apache.commons.lang3.tuple.ImmutablePair;
import org.junit.Assert;
import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static io.restassured.RestAssured.given;

public class TestSuite extends BaseTest {

    private String maskForOneBook = "There is %s book by %s";
    private String maskForManyBooks = "There are %s books by %s";
    private String maskVolumeIsAbsent = "Volume with name %s by %s is absent in volumeResponseForAuthor";

    @Test
    public void volumesTest() {
        VolumesResponse volumeResponseByVolumeName = getAllVolumesByQuery("java", SearchScope.IN_TITLE);

        Assert.assertNotNull(volumeResponseByVolumeName);
        Assert.assertNotNull(volumeResponseByVolumeName.getVolumes());
        Assert.assertTrue(volumeResponseByVolumeName.getVolumes().size() > 0);

        Set<String> authors = volumeResponseByVolumeName.getVolumes()
                .stream()
                .flatMap(v ->
                        Optional.ofNullable(v.getVolumeInfo().getAuthors())
                                .map(Collection::stream)
                                .orElseGet(Stream::empty))
                .collect(Collectors.toSet());

        Assert.assertTrue("Authors set is empty", authors.size() > 0);

        Map<String, List<Volume>> volumesByAuthorsMap = authors
                .stream()
                .flatMap(author -> {
                    List<Volume> volumesByAuthor = volumeResponseByVolumeName.getVolumes()
                            .stream()
                            .filter(volume -> {
                                List<String> volumeAuthors = volume.getVolumeInfo().getAuthors();
                                return volumeAuthors != null && volumeAuthors.size() > 0 && volumeAuthors.contains(author);
                            })
                            .collect(Collectors.toList());
                    return Stream.of(new ImmutablePair<>(author, volumesByAuthor));
                })
                .collect(Collectors.toMap(ImmutablePair::getLeft, ImmutablePair::getRight));

        volumesByAuthorsMap.forEach((key, value) -> {
            int volumesNumber = value.size();
            String message;
            if (volumesNumber > 1) {
                message = String.format(maskForManyBooks, volumesNumber, key);
            } else {
                message = String.format(maskForOneBook, volumesNumber, key);
            }
            System.out.println(message);
        });

        String selectedAuthor = authors.stream().findFirst().get();
        VolumesResponse volumeResponseForAuthor = getAllVolumesByQuery(selectedAuthor, SearchScope.IN_AUTHOR);

        Assert.assertNotNull(volumeResponseForAuthor);
        Assert.assertNotNull(volumeResponseForAuthor.getVolumes());
        Assert.assertTrue(volumeResponseForAuthor.getVolumes().size() > 0);

        List<String> volumeIds = volumeResponseForAuthor.getVolumes().stream().map(Volume::getId).collect(Collectors.toList());
        volumesByAuthorsMap.get(selectedAuthor).forEach(v ->
                Assert.assertTrue(
                        String.format(maskVolumeIsAbsent, v.getVolumeInfo().getTitle(), selectedAuthor),
                        volumeIds.contains(v.getId())));
    }

    private VolumesResponse getAllVolumesByQuery(String query, SearchScope scope) {
        int startIndex = 0;
        VolumesResponse response = null;
        while (true) {
            VolumesResponse tempResponse = given()
                    .param("q", query + scope.getValue())
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
