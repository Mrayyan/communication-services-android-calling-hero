// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.samples.communication.calling.helpers;

import android.graphics.drawable.Drawable;

public class BottomCellItem {
    private Drawable avatar;
    private String title;
    private Drawable accessoryImage;
    private Boolean enabled;

    public BottomCellItem(final Drawable avatar, final String title, final Drawable accessoryImage,
                          final Boolean enabled) {
        this.avatar = avatar;
        this.title = title;
        this.accessoryImage = accessoryImage;
        this.enabled = enabled;
    }

    public Drawable getAvatar() {
        return avatar;
    }

    public String getTitle() {
        return title;
    }

    public Drawable getAccessoryImage() {
        return accessoryImage;
    }

    public Boolean getEnabled() {
        return enabled;
    }
}
