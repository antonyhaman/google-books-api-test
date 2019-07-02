package com.github.kotvertolet.googleapitest.model;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class ReadingModes {

    @SerializedName("image")
    private boolean image;

    @SerializedName("text")
    private boolean text;
}