// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.samples.communication.calling.view;

import android.content.Context;
import android.view.View;
import android.widget.PopupWindow;

import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.azure.samples.communication.calling.R;
import com.azure.samples.communication.calling.helpers.BottomCellAdapter;
import com.azure.samples.communication.calling.helpers.BottomCellItem;

import java.util.ArrayList;
import java.util.List;

public class AudioDeviceSelectionPopupWindow extends PopupWindow {
    private Context context;



    public AudioDeviceSelectionPopupWindow(final Context context) {
        super(context);
        this.context = context;
    }

    @Override
    public void setContentView(final View contentView) {
        super.setContentView(contentView);

        // Call AudioSessionManager to get audio devices


        final List<BottomCellItem> bottomCellViewHolders = new ArrayList<>();
        final BottomCellItem android = new BottomCellItem(ContextCompat.getDrawable(context,
                R.drawable.ic_fluent_speaker_2_24_regular), "Android", ContextCompat.getDrawable(context,
                R.drawable.ic_fluent_checkmark_24_regular), false);
        final BottomCellItem speaker = new BottomCellItem(ContextCompat.getDrawable(context,
                R.drawable.ic_fluent_speaker_2_24_filled), "Speaker", ContextCompat.getDrawable(context,
                R.drawable.ic_fluent_checkmark_24_regular), true);
        bottomCellViewHolders.add(android);
        bottomCellViewHolders.add(speaker);

        // Pass audio device data to RecyclerView Adapter
        // Pass
        final BottomCellAdapter bottomCellAdapter = new BottomCellAdapter(context, bottomCellViewHolders);
        final RecyclerView audioTable = (RecyclerView) contentView.findViewById(R.id.audio_device_table);
        audioTable.setAdapter(bottomCellAdapter);
        audioTable.setLayoutManager(new LinearLayoutManager(context));

        contentView.findViewById(R.id.overlay).setOnClickListener(v -> {
            dismiss();
        });
    }
}
