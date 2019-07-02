package com.github.kotvertolet.googleapitest.model;

import com.google.gson.annotations.SerializedName;

public class Pdf {

    @SerializedName("isAvailable")
    private boolean isAvailable;

    @SerializedName("acsTokenLink")
    private String acsTokenLink;

    public Pdf() {
    }

    public boolean isAvailable() {
        return this.isAvailable;
    }

    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public String getAcsTokenLink() {
        return this.acsTokenLink;
    }

    public void setAcsTokenLink(String acsTokenLink) {
        this.acsTokenLink = acsTokenLink;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Pdf)) return false;
        final Pdf other = (Pdf) o;
        if (!other.canEqual((Object) this)) return false;
        if (this.isAvailable() != other.isAvailable()) return false;
        final Object this$acsTokenLink = this.getAcsTokenLink();
        final Object other$acsTokenLink = other.getAcsTokenLink();
        if (this$acsTokenLink == null ? other$acsTokenLink != null : !this$acsTokenLink.equals(other$acsTokenLink))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Pdf;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = result * PRIME + (this.isAvailable() ? 79 : 97);
        final Object $acsTokenLink = this.getAcsTokenLink();
        result = result * PRIME + ($acsTokenLink == null ? 43 : $acsTokenLink.hashCode());
        return result;
    }

    public String toString() {
        return "Pdf(isAvailable=" + this.isAvailable() + ", acsTokenLink=" + this.getAcsTokenLink() + ")";
    }
}