package com.github.kotvertolet.googleapitest.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class VolumesResponse {

    @SerializedName("totalItems")
    private int totalItems;

    @SerializedName("kind")
    private String kind;

    @SerializedName("items")
    private List<Volume> volumes;

    public VolumesResponse() {
    }

    public int getTotalItems() {
        return this.totalItems;
    }

    public void setTotalItems(int totalItems) {
        this.totalItems = totalItems;
    }

    public String getKind() {
        return this.kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public List<Volume> getVolumes() {
        return this.volumes;
    }

    public void setVolumes(List<Volume> volumes) {
        this.volumes = volumes;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof VolumesResponse)) return false;
        final VolumesResponse other = (VolumesResponse) o;
        if (!other.canEqual((Object) this)) return false;
        if (this.getTotalItems() != other.getTotalItems()) return false;
        final Object this$kind = this.getKind();
        final Object other$kind = other.getKind();
        if (this$kind == null ? other$kind != null : !this$kind.equals(other$kind)) return false;
        final Object this$volumes = this.getVolumes();
        final Object other$volumes = other.getVolumes();
        if (this$volumes == null ? other$volumes != null : !this$volumes.equals(other$volumes)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof VolumesResponse;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = result * PRIME + this.getTotalItems();
        final Object $kind = this.getKind();
        result = result * PRIME + ($kind == null ? 43 : $kind.hashCode());
        final Object $volumes = this.getVolumes();
        result = result * PRIME + ($volumes == null ? 43 : $volumes.hashCode());
        return result;
    }

    public String toString() {
        return "VolumesResponse(totalItems=" + this.getTotalItems() + ", kind=" + this.getKind() + ", volumes=" + this.getVolumes() + ")";
    }
}