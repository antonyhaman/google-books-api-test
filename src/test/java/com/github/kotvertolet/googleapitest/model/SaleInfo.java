package com.github.kotvertolet.googleapitest.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

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

    public SaleInfo() {
    }

    public String getCountry() {
        return this.country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public boolean isEbook() {
        return this.isEbook;
    }

    public void setEbook(boolean isEbook) {
        this.isEbook = isEbook;
    }

    public String getSaleability() {
        return this.saleability;
    }

    public void setSaleability(String saleability) {
        this.saleability = saleability;
    }

    public List<OffersItem> getOffers() {
        return this.offers;
    }

    public void setOffers(List<OffersItem> offers) {
        this.offers = offers;
    }

    public String getBuyLink() {
        return this.buyLink;
    }

    public void setBuyLink(String buyLink) {
        this.buyLink = buyLink;
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
        if (!(o instanceof SaleInfo)) return false;
        final SaleInfo other = (SaleInfo) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$country = this.getCountry();
        final Object other$country = other.getCountry();
        if (this$country == null ? other$country != null : !this$country.equals(other$country)) return false;
        if (this.isEbook() != other.isEbook()) return false;
        final Object this$saleability = this.getSaleability();
        final Object other$saleability = other.getSaleability();
        if (this$saleability == null ? other$saleability != null : !this$saleability.equals(other$saleability))
            return false;
        final Object this$offers = this.getOffers();
        final Object other$offers = other.getOffers();
        if (this$offers == null ? other$offers != null : !this$offers.equals(other$offers)) return false;
        final Object this$buyLink = this.getBuyLink();
        final Object other$buyLink = other.getBuyLink();
        if (this$buyLink == null ? other$buyLink != null : !this$buyLink.equals(other$buyLink)) return false;
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
        return other instanceof SaleInfo;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $country = this.getCountry();
        result = result * PRIME + ($country == null ? 43 : $country.hashCode());
        result = result * PRIME + (this.isEbook() ? 79 : 97);
        final Object $saleability = this.getSaleability();
        result = result * PRIME + ($saleability == null ? 43 : $saleability.hashCode());
        final Object $offers = this.getOffers();
        result = result * PRIME + ($offers == null ? 43 : $offers.hashCode());
        final Object $buyLink = this.getBuyLink();
        result = result * PRIME + ($buyLink == null ? 43 : $buyLink.hashCode());
        final Object $retailPrice = this.getRetailPrice();
        result = result * PRIME + ($retailPrice == null ? 43 : $retailPrice.hashCode());
        final Object $listPrice = this.getListPrice();
        result = result * PRIME + ($listPrice == null ? 43 : $listPrice.hashCode());
        return result;
    }

    public String toString() {
        return "SaleInfo(country=" + this.getCountry() + ", isEbook=" + this.isEbook() + ", saleability=" + this.getSaleability() + ", offers=" + this.getOffers() + ", buyLink=" + this.getBuyLink() + ", retailPrice=" + this.getRetailPrice() + ", listPrice=" + this.getListPrice() + ")";
    }
}