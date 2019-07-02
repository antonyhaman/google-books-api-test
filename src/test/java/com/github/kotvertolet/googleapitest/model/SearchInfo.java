package com.github.kotvertolet.googleapitest.model;

import com.google.gson.annotations.SerializedName;

public class SearchInfo {

    @SerializedName("textSnippet")
    private String textSnippet;

    public SearchInfo() {
    }

    public String getTextSnippet() {
        return this.textSnippet;
    }

    public void setTextSnippet(String textSnippet) {
        this.textSnippet = textSnippet;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof SearchInfo)) return false;
        final SearchInfo other = (SearchInfo) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$textSnippet = this.getTextSnippet();
        final Object other$textSnippet = other.getTextSnippet();
        if (this$textSnippet == null ? other$textSnippet != null : !this$textSnippet.equals(other$textSnippet))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof SearchInfo;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $textSnippet = this.getTextSnippet();
        result = result * PRIME + ($textSnippet == null ? 43 : $textSnippet.hashCode());
        return result;
    }

    public String toString() {
        return "SearchInfo(textSnippet=" + this.getTextSnippet() + ")";
    }
}