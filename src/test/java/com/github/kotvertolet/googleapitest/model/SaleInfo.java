package com.github.kotvertolet.googleapitest.model;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.util.List;

@Data
public class SaleInfo {

    @SerializedName("country")
    private String country;

    @SerializedName("isEbook")
    private boolean isEbook;

    @SerializedName("saleability")
    private String saleability;

    @SerializedName("offers")
    private List<OffersItem> offers;

    @SerializedName("buyLink")
    private String buyLink;

    @SerializedName("retailPrice")
    private RetailPrice retailPrice;

    @SerializedName("listPrice")
    private ListPrice listPrice;
}