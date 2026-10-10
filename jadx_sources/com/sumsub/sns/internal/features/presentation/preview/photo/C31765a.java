package com.sumsub.sns.internal.features.presentation.preview.photo;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.photo.a */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31765a extends RecyclerView.ItemDecoration {

    /* JADX INFO: renamed from: a */
    public final int f64545a;

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        int i11 = this.f64545a;
        rect.right = i11;
        rect.left = i11;
    }

    public C31765a(int i11) {
        this.f64545a = i11;
    }
}
