package com.github.kotvertolet.googleapitest.model;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class IndustryIdentifiersItem {

    @SerializedName("identifier")
    private String identifier;

    @SerializedName("type")
    private String type;
}