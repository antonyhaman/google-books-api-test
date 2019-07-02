package com.github.kotvertolet.googleapitest.model;

import com.google.gson.annotations.SerializedName;

public class PanelizationSummary {

    @SerializedName("containsImageBubbles")
    private boolean containsImageBubbles;

    @SerializedName("containsEpubBubbles")
    private boolean containsEpubBubbles;

    public PanelizationSummary() {
    }

    public boolean isContainsImageBubbles() {
        return this.containsImageBubbles;
    }

    public void setContainsImageBubbles(boolean containsImageBubbles) {
        this.containsImageBubbles = containsImageBubbles;
    }

    public boolean isContainsEpubBubbles() {
        return this.containsEpubBubbles;
    }

    public void setContainsEpubBubbles(boolean containsEpubBubbles) {
        this.containsEpubBubbles = containsEpubBubbles;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof PanelizationSummary)) return false;
        final PanelizationSummary other = (PanelizationSummary) o;
        if (!other.canEqual((Object) this)) return false;
        if (this.isContainsImageBubbles() != other.isContainsImageBubbles()) return false;
        if (this.isContainsEpubBubbles() != other.isContainsEpubBubbles()) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof PanelizationSummary;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = result * PRIME + (this.isContainsImageBubbles() ? 79 : 97);
        result = result * PRIME + (this.isContainsEpubBubbles() ? 79 : 97);
        return result;
    }

    public String toString() {
        return "PanelizationSummary(containsImageBubbles=" + this.isContainsImageBubbles() + ", containsEpubBubbles=" + this.isContainsEpubBubbles() + ")";
    }
}