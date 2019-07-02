package com.github.kotvertolet.googleapitest.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

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

    public VolumeInfo() {
    }

    public List<IndustryIdentifiersItem> getIndustryIdentifiers() {
        return this.industryIdentifiers;
    }

    public void setIndustryIdentifiers(List<IndustryIdentifiersItem> industryIdentifiers) {
        this.industryIdentifiers = industryIdentifiers;
    }

    public int getPageCount() {
        return this.pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public String getPrintType() {
        return this.printType;
    }

    public void setPrintType(String printType) {
        this.printType = printType;
    }

    public ReadingModes getReadingModes() {
        return this.readingModes;
    }

    public void setReadingModes(ReadingModes readingModes) {
        this.readingModes = readingModes;
    }

    public String getPreviewLink() {
        return this.previewLink;
    }

    public void setPreviewLink(String previewLink) {
        this.previewLink = previewLink;
    }

    public String getCanonicalVolumeLink() {
        return this.canonicalVolumeLink;
    }

    public void setCanonicalVolumeLink(String canonicalVolumeLink) {
        this.canonicalVolumeLink = canonicalVolumeLink;
    }

    public String getLanguage() {
        return this.language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubtitle() {
        return this.subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public String getPublishedDate() {
        return this.publishedDate;
    }

    public void setPublishedDate(String publishedDate) {
        this.publishedDate = publishedDate;
    }

    public String getMaturityRating() {
        return this.maturityRating;
    }

    public void setMaturityRating(String maturityRating) {
        this.maturityRating = maturityRating;
    }

    public boolean isAllowAnonLogging() {
        return this.allowAnonLogging;
    }

    public void setAllowAnonLogging(boolean allowAnonLogging) {
        this.allowAnonLogging = allowAnonLogging;
    }

    public String getContentVersion() {
        return this.contentVersion;
    }

    public void setContentVersion(String contentVersion) {
        this.contentVersion = contentVersion;
    }

    public List<String> getAuthors() {
        return this.authors;
    }

    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }

    public String getInfoLink() {
        return this.infoLink;
    }

    public void setInfoLink(String infoLink) {
        this.infoLink = infoLink;
    }

    public ImageLinks getImageLinks() {
        return this.imageLinks;
    }

    public void setImageLinks(ImageLinks imageLinks) {
        this.imageLinks = imageLinks;
    }

    public List<String> getCategories() {
        return this.categories;
    }

    public void setCategories(List<String> categories) {
        this.categories = categories;
    }

    public PanelizationSummary getPanelizationSummary() {
        return this.panelizationSummary;
    }

    public void setPanelizationSummary(PanelizationSummary panelizationSummary) {
        this.panelizationSummary = panelizationSummary;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPublisher() {
        return this.publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof VolumeInfo)) return false;
        final VolumeInfo other = (VolumeInfo) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$industryIdentifiers = this.getIndustryIdentifiers();
        final Object other$industryIdentifiers = other.getIndustryIdentifiers();
        if (this$industryIdentifiers == null ? other$industryIdentifiers != null : !this$industryIdentifiers.equals(other$industryIdentifiers))
            return false;
        if (this.getPageCount() != other.getPageCount()) return false;
        final Object this$printType = this.getPrintType();
        final Object other$printType = other.getPrintType();
        if (this$printType == null ? other$printType != null : !this$printType.equals(other$printType)) return false;
        final Object this$readingModes = this.getReadingModes();
        final Object other$readingModes = other.getReadingModes();
        if (this$readingModes == null ? other$readingModes != null : !this$readingModes.equals(other$readingModes))
            return false;
        final Object this$previewLink = this.getPreviewLink();
        final Object other$previewLink = other.getPreviewLink();
        if (this$previewLink == null ? other$previewLink != null : !this$previewLink.equals(other$previewLink))
            return false;
        final Object this$canonicalVolumeLink = this.getCanonicalVolumeLink();
        final Object other$canonicalVolumeLink = other.getCanonicalVolumeLink();
        if (this$canonicalVolumeLink == null ? other$canonicalVolumeLink != null : !this$canonicalVolumeLink.equals(other$canonicalVolumeLink))
            return false;
        final Object this$language = this.getLanguage();
        final Object other$language = other.getLanguage();
        if (this$language == null ? other$language != null : !this$language.equals(other$language)) return false;
        final Object this$title = this.getTitle();
        final Object other$title = other.getTitle();
        if (this$title == null ? other$title != null : !this$title.equals(other$title)) return false;
        final Object this$subtitle = this.getSubtitle();
        final Object other$subtitle = other.getSubtitle();
        if (this$subtitle == null ? other$subtitle != null : !this$subtitle.equals(other$subtitle)) return false;
        final Object this$publishedDate = this.getPublishedDate();
        final Object other$publishedDate = other.getPublishedDate();
        if (this$publishedDate == null ? other$publishedDate != null : !this$publishedDate.equals(other$publishedDate))
            return false;
        final Object this$maturityRating = this.getMaturityRating();
        final Object other$maturityRating = other.getMaturityRating();
        if (this$maturityRating == null ? other$maturityRating != null : !this$maturityRating.equals(other$maturityRating))
            return false;
        if (this.isAllowAnonLogging() != other.isAllowAnonLogging()) return false;
        final Object this$contentVersion = this.getContentVersion();
        final Object other$contentVersion = other.getContentVersion();
        if (this$contentVersion == null ? other$contentVersion != null : !this$contentVersion.equals(other$contentVersion))
            return false;
        final Object this$authors = this.getAuthors();
        final Object other$authors = other.getAuthors();
        if (this$authors == null ? other$authors != null : !this$authors.equals(other$authors)) return false;
        final Object this$infoLink = this.getInfoLink();
        final Object other$infoLink = other.getInfoLink();
        if (this$infoLink == null ? other$infoLink != null : !this$infoLink.equals(other$infoLink)) return false;
        final Object this$imageLinks = this.getImageLinks();
        final Object other$imageLinks = other.getImageLinks();
        if (this$imageLinks == null ? other$imageLinks != null : !this$imageLinks.equals(other$imageLinks))
            return false;
        final Object this$categories = this.getCategories();
        final Object other$categories = other.getCategories();
        if (this$categories == null ? other$categories != null : !this$categories.equals(other$categories))
            return false;
        final Object this$panelizationSummary = this.getPanelizationSummary();
        final Object other$panelizationSummary = other.getPanelizationSummary();
        if (this$panelizationSummary == null ? other$panelizationSummary != null : !this$panelizationSummary.equals(other$panelizationSummary))
            return false;
        final Object this$description = this.getDescription();
        final Object other$description = other.getDescription();
        if (this$description == null ? other$description != null : !this$description.equals(other$description))
            return false;
        final Object this$publisher = this.getPublisher();
        final Object other$publisher = other.getPublisher();
        if (this$publisher == null ? other$publisher != null : !this$publisher.equals(other$publisher)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof VolumeInfo;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $industryIdentifiers = this.getIndustryIdentifiers();
        result = result * PRIME + ($industryIdentifiers == null ? 43 : $industryIdentifiers.hashCode());
        result = result * PRIME + this.getPageCount();
        final Object $printType = this.getPrintType();
        result = result * PRIME + ($printType == null ? 43 : $printType.hashCode());
        final Object $readingModes = this.getReadingModes();
        result = result * PRIME + ($readingModes == null ? 43 : $readingModes.hashCode());
        final Object $previewLink = this.getPreviewLink();
        result = result * PRIME + ($previewLink == null ? 43 : $previewLink.hashCode());
        final Object $canonicalVolumeLink = this.getCanonicalVolumeLink();
        result = result * PRIME + ($canonicalVolumeLink == null ? 43 : $canonicalVolumeLink.hashCode());
        final Object $language = this.getLanguage();
        result = result * PRIME + ($language == null ? 43 : $language.hashCode());
        final Object $title = this.getTitle();
        result = result * PRIME + ($title == null ? 43 : $title.hashCode());
        final Object $subtitle = this.getSubtitle();
        result = result * PRIME + ($subtitle == null ? 43 : $subtitle.hashCode());
        final Object $publishedDate = this.getPublishedDate();
        result = result * PRIME + ($publishedDate == null ? 43 : $publishedDate.hashCode());
        final Object $maturityRating = this.getMaturityRating();
        result = result * PRIME + ($maturityRating == null ? 43 : $maturityRating.hashCode());
        result = result * PRIME + (this.isAllowAnonLogging() ? 79 : 97);
        final Object $contentVersion = this.getContentVersion();
        result = result * PRIME + ($contentVersion == null ? 43 : $contentVersion.hashCode());
        final Object $authors = this.getAuthors();
        result = result * PRIME + ($authors == null ? 43 : $authors.hashCode());
        final Object $infoLink = this.getInfoLink();
        result = result * PRIME + ($infoLink == null ? 43 : $infoLink.hashCode());
        final Object $imageLinks = this.getImageLinks();
        result = result * PRIME + ($imageLinks == null ? 43 : $imageLinks.hashCode());
        final Object $categories = this.getCategories();
        result = result * PRIME + ($categories == null ? 43 : $categories.hashCode());
        final Object $panelizationSummary = this.getPanelizationSummary();
        result = result * PRIME + ($panelizationSummary == null ? 43 : $panelizationSummary.hashCode());
        final Object $description = this.getDescription();
        result = result * PRIME + ($description == null ? 43 : $description.hashCode());
        final Object $publisher = this.getPublisher();
        result = result * PRIME + ($publisher == null ? 43 : $publisher.hashCode());
        return result;
    }

    public String toString() {
        return "VolumeInfo(industryIdentifiers=" + this.getIndustryIdentifiers() + ", pageCount=" + this.getPageCount() + ", printType=" + this.getPrintType() + ", readingModes=" + this.getReadingModes() + ", previewLink=" + this.getPreviewLink() + ", canonicalVolumeLink=" + this.getCanonicalVolumeLink() + ", language=" + this.getLanguage() + ", title=" + this.getTitle() + ", subtitle=" + this.getSubtitle() + ", publishedDate=" + this.getPublishedDate() + ", maturityRating=" + this.getMaturityRating() + ", allowAnonLogging=" + this.isAllowAnonLogging() + ", contentVersion=" + this.getContentVersion() + ", authors=" + this.getAuthors() + ", infoLink=" + this.getInfoLink() + ", imageLinks=" + this.getImageLinks() + ", categories=" + this.getCategories() + ", panelizationSummary=" + this.getPanelizationSummary() + ", description=" + this.getDescription() + ", publisher=" + this.getPublisher() + ")";
    }
}