// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.samples.communication.calling.view;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.PopupWindow;

import com.azure.samples.communication.calling.R;

public class AudioDeviceSelectionPopupWindow extends PopupWindow {

    public AudioDeviceSelectionPopupWindow(final Context context) {
        super(context);
    }

    @Override
    public void setContentView(final View contentView) {
        super.setContentView(contentView);

        contentView.findViewById(R.id.overlay).setOnClickListener(v ->
        {
            dismiss();
        });


    }
}
