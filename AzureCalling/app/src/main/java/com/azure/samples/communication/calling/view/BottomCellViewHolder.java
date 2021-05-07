// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.samples.communication.calling.view;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.azure.samples.communication.calling.R;

public class BottomCellViewHolder extends RecyclerView.ViewHolder {
    private ImageView avatar;
    private TextView title;
    private ImageView accessoryImage;


    public BottomCellViewHolder(@NonNull final View itemView) {
        super(itemView);
        avatar = (ImageView) itemView.findViewById(R.id.icon_for_audio_device_android);
        title = (TextView) itemView.findViewById(R.id.text_for_audio_device_android);
        accessoryImage = (ImageView) itemView.findViewById(R.id.check_mark_for_audio_android);
    }

    public void setAvatar(final Drawable avatar) {
        this.avatar.setImageDrawable(avatar);
    }

    public void setTitle(final String title) {
        this.title.setText(title);
    }

    public void setAccessoryImage(final Drawable accessoryImage) {
        this.accessoryImage.setImageDrawable(accessoryImage);
    }

    public void setEnabled(final Boolean enabled) {
        if (enabled) {
            this.accessoryImage.setVisibility(View.VISIBLE);
        } else {
            this.accessoryImage.setVisibility(View.INVISIBLE);
        }
    }
}
