package com.github.kotvertolet.googleapitest.model;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class OffersItem {

    @SerializedName("finskyOfferType")
    private int finskyOfferType;

    @SerializedName("retailPrice")
    private RetailPrice retailPrice;

    @SerializedName("listPrice")
    private ListPrice listPrice;
}