package com.github.kotvertolet.googleapitest.model;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class ImageLinks {

    @SerializedName("thumbnail")
    private String thumbnail;

    @SerializedName("smallThumbnail")
    private String smallThumbnail;
}