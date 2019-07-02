package com.github.kotvertolet.googleapitest.model;

import com.google.gson.annotations.SerializedName;

public class ImageLinks {

    @SerializedName("thumbnail")
    private String thumbnail;

    @SerializedName("smallThumbnail")
    private String smallThumbnail;

    public ImageLinks() {
    }

    public String getThumbnail() {
        return this.thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getSmallThumbnail() {
        return this.smallThumbnail;
    }

    public void setSmallThumbnail(String smallThumbnail) {
        this.smallThumbnail = smallThumbnail;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof ImageLinks)) return false;
        final ImageLinks other = (ImageLinks) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$thumbnail = this.getThumbnail();
        final Object other$thumbnail = other.getThumbnail();
        if (this$thumbnail == null ? other$thumbnail != null : !this$thumbnail.equals(other$thumbnail)) return false;
        final Object this$smallThumbnail = this.getSmallThumbnail();
        final Object other$smallThumbnail = other.getSmallThumbnail();
        if (this$smallThumbnail == null ? other$smallThumbnail != null : !this$smallThumbnail.equals(other$smallThumbnail))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof ImageLinks;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $thumbnail = this.getThumbnail();
        result = result * PRIME + ($thumbnail == null ? 43 : $thumbnail.hashCode());
        final Object $smallThumbnail = this.getSmallThumbnail();
        result = result * PRIME + ($smallThumbnail == null ? 43 : $smallThumbnail.hashCode());
        return result;
    }

    public String toString() {
        return "ImageLinks(thumbnail=" + this.getThumbnail() + ", smallThumbnail=" + this.getSmallThumbnail() + ")";
    }
}