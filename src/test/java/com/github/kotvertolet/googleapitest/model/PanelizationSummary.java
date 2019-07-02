package com.github.kotvertolet.googleapitest.model;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class PanelizationSummary {

    @SerializedName("containsImageBubbles")
    private boolean containsImageBubbles;

    @SerializedName("containsEpubBubbles")
    private boolean containsEpubBubbles;
}