package com.github.kotvertolet.googleapitest.model;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class Volume {

    @SerializedName("saleInfo")
    private SaleInfo saleInfo;

    @SerializedName("kind")
    private String kind;

    @SerializedName("volumeInfo")
    private VolumeInfo volumeInfo;

    @SerializedName("etag")
    private String etag;

    @SerializedName("id")
    private String id;

    @SerializedName("accessInfo")
    private AccessInfo accessInfo;

    @SerializedName("selfLink")
    private String selfLink;

    @SerializedName("searchInfo")
    private SearchInfo searchInfo;
}