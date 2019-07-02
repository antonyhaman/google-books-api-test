package com.github.kotvertolet.googleapitest.model;

import com.google.gson.annotations.SerializedName;

public class IndustryIdentifiersItem {

    @SerializedName("identifier")
    private String identifier;

    @SerializedName("type")
    private String type;

    public IndustryIdentifiersItem() {
    }

    public String getIdentifier() {
        return this.identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof IndustryIdentifiersItem)) return false;
        final IndustryIdentifiersItem other = (IndustryIdentifiersItem) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$identifier = this.getIdentifier();
        final Object other$identifier = other.getIdentifier();
        if (this$identifier == null ? other$identifier != null : !this$identifier.equals(other$identifier))
            return false;
        final Object this$type = this.getType();
        final Object other$type = other.getType();
        if (this$type == null ? other$type != null : !this$type.equals(other$type)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof IndustryIdentifiersItem;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $identifier = this.getIdentifier();
        result = result * PRIME + ($identifier == null ? 43 : $identifier.hashCode());
        final Object $type = this.getType();
        result = result * PRIME + ($type == null ? 43 : $type.hashCode());
        return result;
    }

    public String toString() {
        return "IndustryIdentifiersItem(identifier=" + this.getIdentifier() + ", type=" + this.getType() + ")";
    }
}