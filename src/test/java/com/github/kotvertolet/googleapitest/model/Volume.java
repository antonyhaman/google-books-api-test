package com.github.kotvertolet.googleapitest.model;

import com.google.gson.annotations.SerializedName;

public class Volume {

    @SerializedName("saleInfo")
    private SaleInfo saleInfo;

    @SerializedName("kind")
    private String kind;

    @SerializedName("volumeInfo")
    private VolumeInfo volumeInfo;

    @SerializedName("etag")
    private String etag;

    @SerializedName("id")
    private String id;

    @SerializedName("accessInfo")
    private AccessInfo accessInfo;

    @SerializedName("selfLink")
    private String selfLink;

    @SerializedName("searchInfo")
    private SearchInfo searchInfo;

    public Volume() {
    }

    public SaleInfo getSaleInfo() {
        return this.saleInfo;
    }

    public void setSaleInfo(SaleInfo saleInfo) {
        this.saleInfo = saleInfo;
    }

    public String getKind() {
        return this.kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public VolumeInfo getVolumeInfo() {
        return this.volumeInfo;
    }

    public void setVolumeInfo(VolumeInfo volumeInfo) {
        this.volumeInfo = volumeInfo;
    }

    public String getEtag() {
        return this.etag;
    }

    public void setEtag(String etag) {
        this.etag = etag;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public AccessInfo getAccessInfo() {
        return this.accessInfo;
    }

    public void setAccessInfo(AccessInfo accessInfo) {
        this.accessInfo = accessInfo;
    }

    public String getSelfLink() {
        return this.selfLink;
    }

    public void setSelfLink(String selfLink) {
        this.selfLink = selfLink;
    }

    public SearchInfo getSearchInfo() {
        return this.searchInfo;
    }

    public void setSearchInfo(SearchInfo searchInfo) {
        this.searchInfo = searchInfo;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Volume)) return false;
        final Volume other = (Volume) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$saleInfo = this.getSaleInfo();
        final Object other$saleInfo = other.getSaleInfo();
        if (this$saleInfo == null ? other$saleInfo != null : !this$saleInfo.equals(other$saleInfo)) return false;
        final Object this$kind = this.getKind();
        final Object other$kind = other.getKind();
        if (this$kind == null ? other$kind != null : !this$kind.equals(other$kind)) return false;
        final Object this$volumeInfo = this.getVolumeInfo();
        final Object other$volumeInfo = other.getVolumeInfo();
        if (this$volumeInfo == null ? other$volumeInfo != null : !this$volumeInfo.equals(other$volumeInfo))
            return false;
        final Object this$etag = this.getEtag();
        final Object other$etag = other.getEtag();
        if (this$etag == null ? other$etag != null : !this$etag.equals(other$etag)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final Object this$accessInfo = this.getAccessInfo();
        final Object other$accessInfo = other.getAccessInfo();
        if (this$accessInfo == null ? other$accessInfo != null : !this$accessInfo.equals(other$accessInfo))
            return false;
        final Object this$selfLink = this.getSelfLink();
        final Object other$selfLink = other.getSelfLink();
        if (this$selfLink == null ? other$selfLink != null : !this$selfLink.equals(other$selfLink)) return false;
        final Object this$searchInfo = this.getSearchInfo();
        final Object other$searchInfo = other.getSearchInfo();
        if (this$searchInfo == null ? other$searchInfo != null : !this$searchInfo.equals(other$searchInfo))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Volume;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $saleInfo = this.getSaleInfo();
        result = result * PRIME + ($saleInfo == null ? 43 : $saleInfo.hashCode());
        final Object $kind = this.getKind();
        result = result * PRIME + ($kind == null ? 43 : $kind.hashCode());
        final Object $volumeInfo = this.getVolumeInfo();
        result = result * PRIME + ($volumeInfo == null ? 43 : $volumeInfo.hashCode());
        final Object $etag = this.getEtag();
        result = result * PRIME + ($etag == null ? 43 : $etag.hashCode());
        final Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final Object $accessInfo = this.getAccessInfo();
        result = result * PRIME + ($accessInfo == null ? 43 : $accessInfo.hashCode());
        final Object $selfLink = this.getSelfLink();
        result = result * PRIME + ($selfLink == null ? 43 : $selfLink.hashCode());
        final Object $searchInfo = this.getSearchInfo();
        result = result * PRIME + ($searchInfo == null ? 43 : $searchInfo.hashCode());
        return result;
    }

    public String toString() {
        return "Volume(saleInfo=" + this.getSaleInfo() + ", kind=" + this.getKind() + ", volumeInfo=" + this.getVolumeInfo() + ", etag=" + this.getEtag() + ", id=" + this.getId() + ", accessInfo=" + this.getAccessInfo() + ", selfLink=" + this.getSelfLink() + ", searchInfo=" + this.getSearchInfo() + ")";
    }
}