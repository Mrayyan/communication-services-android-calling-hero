// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.samples.communication.calling.helpers;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.azure.samples.communication.calling.R;
import com.azure.samples.communication.calling.view.BottomCellViewHolder;

import java.util.List;

public class BottomCellAdapter extends RecyclerView.Adapter<BottomCellViewHolder> {
    private LayoutInflater mInflater;
    private List<BottomCellItem> bottomCellViewHolders;


    public BottomCellAdapter(final Context context, final List<BottomCellItem> bottomCellViewHolders) {
        this.mInflater = LayoutInflater.from(context);
        this.bottomCellViewHolders = bottomCellViewHolders;
    }

    @NonNull
    @Override
    public BottomCellViewHolder onCreateViewHolder(@NonNull final ViewGroup parent, final int viewType) {
        final View view = mInflater.inflate(R.layout.bottom_drawer_cell, parent, false);
        return new BottomCellViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final BottomCellViewHolder holder, final int position) {
        final BottomCellItem item = bottomCellViewHolders.get(position);
        holder.setAvatar(item.getAvatar());
        holder.setTitle(item.getTitle());
        holder.setAccessoryImage(item.getAccessoryImage());
        holder.setEnabled(item.getEnabled());
    }

    @Override
    public int getItemCount() {
        return bottomCellViewHolders.size();
    }
}
