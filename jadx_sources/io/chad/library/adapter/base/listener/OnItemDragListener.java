package io.chad.library.adapter.base.listener;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes60.dex */
public interface OnItemDragListener {
    void onItemDragEnd(RecyclerView.ViewHolder viewHolder, int i11);

    void onItemDragMoving(RecyclerView.ViewHolder viewHolder, int i11, RecyclerView.ViewHolder viewHolder2, int i12);

    void onItemDragStart(RecyclerView.ViewHolder viewHolder, int i11);
}
