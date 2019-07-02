package com.github.kotvertolet.googleapitest.model;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.util.List;

@Data
public class VolumesResponse {

    @SerializedName("totalItems")
    private int totalItems;

    @SerializedName("kind")
    private String kind;

    @SerializedName("items")
    private List<Volume> volumes;
}