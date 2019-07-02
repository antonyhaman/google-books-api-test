package com.github.kotvertolet.googleapitest.model;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class AccessInfo {

    @SerializedName("accessViewStatus")
    private String accessViewStatus;

    @SerializedName("country")
    private String country;

    @SerializedName("viewability")
    private String viewability;

    @SerializedName("pdf")
    private Pdf pdf;

    @SerializedName("webReaderLink")
    private String webReaderLink;

    @SerializedName("epub")
    private Epub epub;

    @SerializedName("publicDomain")
    private boolean publicDomain;

    @SerializedName("quoteSharingAllowed")
    private boolean quoteSharingAllowed;

    @SerializedName("embeddable")
    private boolean embeddable;

    @SerializedName("textToSpeechPermission")
    private String textToSpeechPermission;
}