package io.chad.library.adapter.base.listener;

import android.graphics.Canvas;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes60.dex */
public interface OnItemSwipeListener {
    void clearView(RecyclerView.ViewHolder viewHolder, int i11);

    void onItemSwipeMoving(Canvas canvas, RecyclerView.ViewHolder viewHolder, float f11, float f12, boolean z11);

    void onItemSwipeStart(RecyclerView.ViewHolder viewHolder, int i11);

    void onItemSwiped(RecyclerView.ViewHolder viewHolder, int i11);
}
