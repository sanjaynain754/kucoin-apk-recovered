package com.chad.library.adapter.base.dragswipe.listener;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes34.dex */
public interface OnItemDragListener {
    void onItemDragEnd(@NonNull RecyclerView.ViewHolder viewHolder, int i11);

    void onItemDragMoving(@NonNull RecyclerView.ViewHolder viewHolder, int i11, @NonNull RecyclerView.ViewHolder viewHolder2, int i12);

    void onItemDragStart(@Nullable RecyclerView.ViewHolder viewHolder, int i11);
}
