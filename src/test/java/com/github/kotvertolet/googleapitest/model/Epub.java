package com.github.kotvertolet.googleapitest.model;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class Epub {

    @SerializedName("isAvailable")
    private boolean isAvailable;

    @SerializedName("acsTokenLink")
    private String acsTokenLink;

}