package com.github.kotvertolet.googleapitest.model;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class Pdf {

    @SerializedName("isAvailable")
    private boolean isAvailable;

    @SerializedName("acsTokenLink")
    private String acsTokenLink;

}