package com.github.kotvertolet.googleapitest.model;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.util.List;

@Data
public class VolumeInfo {

    @SerializedName("industryIdentifiers")
    private List<IndustryIdentifiersItem> industryIdentifiers;

    @SerializedName("pageCount")
    private int pageCount;

    @SerializedName("printType")
    private String printType;

    @SerializedName("readingModes")
    private ReadingModes readingModes;

    @SerializedName("previewLink")
    private String previewLink;

    @SerializedName("canonicalVolumeLink")
    private String canonicalVolumeLink;

    @SerializedName("language")
    private String language;

    @SerializedName("title")
    private String title;

    @SerializedName("subtitle")
    private String subtitle;

    @SerializedName("publishedDate")
    private String publishedDate;

    @SerializedName("maturityRating")
    private String maturityRating;

    @SerializedName("allowAnonLogging")
    private boolean allowAnonLogging;

    @SerializedName("contentVersion")
    private String contentVersion;

    @SerializedName("authors")
    private List<String> authors;

    @SerializedName("infoLink")
    private String infoLink;

    @SerializedName("imageLinks")
    private ImageLinks imageLinks;

    @SerializedName("categories")
    private List<String> categories;

    @SerializedName("panelizationSummary")
    private PanelizationSummary panelizationSummary;

    @SerializedName("description")
    private String description;

    @SerializedName("publisher")
    private String publisher;
}