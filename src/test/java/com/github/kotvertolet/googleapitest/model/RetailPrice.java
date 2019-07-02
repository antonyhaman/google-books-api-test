package com.github.kotvertolet.googleapitest.model;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class RetailPrice {

    @SerializedName("amount")
    private double amount;

    @SerializedName("currencyCode")
    private String currencyCode;

    @SerializedName("amountInMicros")
    private int amountInMicros;
}