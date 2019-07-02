package com.github.kotvertolet.googleapitest.model;

import com.google.gson.annotations.SerializedName;

public class ReadingModes {

    @SerializedName("image")
    private boolean image;

    @SerializedName("text")
    private boolean text;

    public ReadingModes() {
    }

    public boolean isImage() {
        return this.image;
    }

    public void setImage(boolean image) {
        this.image = image;
    }

    public boolean isText() {
        return this.text;
    }

    public void setText(boolean text) {
        this.text = text;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof ReadingModes)) return false;
        final ReadingModes other = (ReadingModes) o;
        if (!other.canEqual((Object) this)) return false;
        if (this.isImage() != other.isImage()) return false;
        if (this.isText() != other.isText()) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof ReadingModes;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = result * PRIME + (this.isImage() ? 79 : 97);
        result = result * PRIME + (this.isText() ? 79 : 97);
        return result;
    }

    public String toString() {
        return "ReadingModes(image=" + this.isImage() + ", text=" + this.isText() + ")";
    }
}