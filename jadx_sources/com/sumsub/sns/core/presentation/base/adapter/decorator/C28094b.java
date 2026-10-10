package com.sumsub.sns.core.presentation.base.adapter.decorator;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: com.sumsub.sns.core.presentation.base.adapter.decorator.b */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28094b extends RecyclerView.ItemDecoration {

    /* JADX INFO: renamed from: a */
    public final int f57296a;

    public C28094b(int i11) {
        this.f57296a = i11;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        int itemCount;
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (adapter != null) {
            itemCount = adapter.getItemCount();
        } else {
            itemCount = 0;
        }
        if (recyclerView.getChildAdapterPosition(view) != itemCount - 1) {
            rect.bottom = this.f57296a;
        }
    }
}
