package com.chad.library.adapter.base.dragswipe.listener;

import android.graphics.Canvas;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes34.dex */
public interface OnItemSwipeListener {
    void onItemSwipeEnd(@NonNull RecyclerView.ViewHolder viewHolder, int i11);

    void onItemSwipeMoving(@NonNull Canvas canvas, @NonNull RecyclerView.ViewHolder viewHolder, float f11, float f12, boolean z11);

    void onItemSwipeStart(@Nullable RecyclerView.ViewHolder viewHolder, int i11);

    void onItemSwiped(@NonNull RecyclerView.ViewHolder viewHolder, int i11, int i12);
}
