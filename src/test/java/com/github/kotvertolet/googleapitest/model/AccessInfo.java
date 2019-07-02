package com.github.kotvertolet.googleapitest.model;

import com.google.gson.annotations.SerializedName;

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

    public AccessInfo() {
    }

    public String getAccessViewStatus() {
        return this.accessViewStatus;
    }

    public void setAccessViewStatus(String accessViewStatus) {
        this.accessViewStatus = accessViewStatus;
    }

    public String getCountry() {
        return this.country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getViewability() {
        return this.viewability;
    }

    public void setViewability(String viewability) {
        this.viewability = viewability;
    }

    public Pdf getPdf() {
        return this.pdf;
    }

    public void setPdf(Pdf pdf) {
        this.pdf = pdf;
    }

    public String getWebReaderLink() {
        return this.webReaderLink;
    }

    public void setWebReaderLink(String webReaderLink) {
        this.webReaderLink = webReaderLink;
    }

    public Epub getEpub() {
        return this.epub;
    }

    public void setEpub(Epub epub) {
        this.epub = epub;
    }

    public boolean isPublicDomain() {
        return this.publicDomain;
    }

    public void setPublicDomain(boolean publicDomain) {
        this.publicDomain = publicDomain;
    }

    public boolean isQuoteSharingAllowed() {
        return this.quoteSharingAllowed;
    }

    public void setQuoteSharingAllowed(boolean quoteSharingAllowed) {
        this.quoteSharingAllowed = quoteSharingAllowed;
    }

    public boolean isEmbeddable() {
        return this.embeddable;
    }

    public void setEmbeddable(boolean embeddable) {
        this.embeddable = embeddable;
    }

    public String getTextToSpeechPermission() {
        return this.textToSpeechPermission;
    }

    public void setTextToSpeechPermission(String textToSpeechPermission) {
        this.textToSpeechPermission = textToSpeechPermission;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof AccessInfo)) return false;
        final AccessInfo other = (AccessInfo) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$accessViewStatus = this.getAccessViewStatus();
        final Object other$accessViewStatus = other.getAccessViewStatus();
        if (this$accessViewStatus == null ? other$accessViewStatus != null : !this$accessViewStatus.equals(other$accessViewStatus))
            return false;
        final Object this$country = this.getCountry();
        final Object other$country = other.getCountry();
        if (this$country == null ? other$country != null : !this$country.equals(other$country)) return false;
        final Object this$viewability = this.getViewability();
        final Object other$viewability = other.getViewability();
        if (this$viewability == null ? other$viewability != null : !this$viewability.equals(other$viewability))
            return false;
        final Object this$pdf = this.getPdf();
        final Object other$pdf = other.getPdf();
        if (this$pdf == null ? other$pdf != null : !this$pdf.equals(other$pdf)) return false;
        final Object this$webReaderLink = this.getWebReaderLink();
        final Object other$webReaderLink = other.getWebReaderLink();
        if (this$webReaderLink == null ? other$webReaderLink != null : !this$webReaderLink.equals(other$webReaderLink))
            return false;
        final Object this$epub = this.getEpub();
        final Object other$epub = other.getEpub();
        if (this$epub == null ? other$epub != null : !this$epub.equals(other$epub)) return false;
        if (this.isPublicDomain() != other.isPublicDomain()) return false;
        if (this.isQuoteSharingAllowed() != other.isQuoteSharingAllowed()) return false;
        if (this.isEmbeddable() != other.isEmbeddable()) return false;
        final Object this$textToSpeechPermission = this.getTextToSpeechPermission();
        final Object other$textToSpeechPermission = other.getTextToSpeechPermission();
        if (this$textToSpeechPermission == null ? other$textToSpeechPermission != null : !this$textToSpeechPermission.equals(other$textToSpeechPermission))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof AccessInfo;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $accessViewStatus = this.getAccessViewStatus();
        result = result * PRIME + ($accessViewStatus == null ? 43 : $accessViewStatus.hashCode());
        final Object $country = this.getCountry();
        result = result * PRIME + ($country == null ? 43 : $country.hashCode());
        final Object $viewability = this.getViewability();
        result = result * PRIME + ($viewability == null ? 43 : $viewability.hashCode());
        final Object $pdf = this.getPdf();
        result = result * PRIME + ($pdf == null ? 43 : $pdf.hashCode());
        final Object $webReaderLink = this.getWebReaderLink();
        result = result * PRIME + ($webReaderLink == null ? 43 : $webReaderLink.hashCode());
        final Object $epub = this.getEpub();
        result = result * PRIME + ($epub == null ? 43 : $epub.hashCode());
        result = result * PRIME + (this.isPublicDomain() ? 79 : 97);
        result = result * PRIME + (this.isQuoteSharingAllowed() ? 79 : 97);
        result = result * PRIME + (this.isEmbeddable() ? 79 : 97);
        final Object $textToSpeechPermission = this.getTextToSpeechPermission();
        result = result * PRIME + ($textToSpeechPermission == null ? 43 : $textToSpeechPermission.hashCode());
        return result;
    }

    public String toString() {
        return "AccessInfo(accessViewStatus=" + this.getAccessViewStatus() + ", country=" + this.getCountry() + ", viewability=" + this.getViewability() + ", pdf=" + this.getPdf() + ", webReaderLink=" + this.getWebReaderLink() + ", epub=" + this.getEpub() + ", publicDomain=" + this.isPublicDomain() + ", quoteSharingAllowed=" + this.isQuoteSharingAllowed() + ", embeddable=" + this.isEmbeddable() + ", textToSpeechPermission=" + this.getTextToSpeechPermission() + ")";
    }
}