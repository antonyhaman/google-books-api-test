package com.github.kotvertolet.googleapitest.model;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class SearchInfo {

    @SerializedName("textSnippet")
    private String textSnippet;
}