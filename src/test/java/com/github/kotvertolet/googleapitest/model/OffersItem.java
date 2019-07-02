package com.github.kotvertolet.googleapitest.model;

import com.google.gson.annotations.SerializedName;

public class OffersItem {

    @SerializedName("finskyOfferType")
    private int finskyOfferType;

    @SerializedName("retailPrice")
    private RetailPrice retailPrice;

    @SerializedName("listPrice")
    private ListPrice listPrice;

    public OffersItem() {
    }

    public int getFinskyOfferType() {
        return this.finskyOfferType;
    }

    public void setFinskyOfferType(int finskyOfferType) {
        this.finskyOfferType = finskyOfferType;
    }

    public RetailPrice getRetailPrice() {
        return this.retailPrice;
    }

    public void setRetailPrice(RetailPrice retailPrice) {
        this.retailPrice = retailPrice;
    }

    public ListPrice getListPrice() {
        return this.listPrice;
    }

    public void setListPrice(ListPrice listPrice) {
        this.listPrice = listPrice;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof OffersItem)) return false;
        final OffersItem other = (OffersItem) o;
        if (!other.canEqual((Object) this)) return false;
        if (this.getFinskyOfferType() != other.getFinskyOfferType()) return false;
        final Object this$retailPrice = this.getRetailPrice();
        final Object other$retailPrice = other.getRetailPrice();
        if (this$retailPrice == null ? other$retailPrice != null : !this$retailPrice.equals(other$retailPrice))
            return false;
        final Object this$listPrice = this.getListPrice();
        final Object other$listPrice = other.getListPrice();
        if (this$listPrice == null ? other$listPrice != null : !this$listPrice.equals(other$listPrice)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof OffersItem;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = result * PRIME + this.getFinskyOfferType();
        final Object $retailPrice = this.getRetailPrice();
        result = result * PRIME + ($retailPrice == null ? 43 : $retailPrice.hashCode());
        final Object $listPrice = this.getListPrice();
        result = result * PRIME + ($listPrice == null ? 43 : $listPrice.hashCode());
        return result;
    }

    public String toString() {
        return "OffersItem(finskyOfferType=" + this.getFinskyOfferType() + ", retailPrice=" + this.getRetailPrice() + ", listPrice=" + this.getListPrice() + ")";
    }
}