package com.sumsub.sns.core.presentation.base.adapter.decorator;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import androidx.core.view.ViewGroupKt;
import androidx.recyclerview.widget.RecyclerView;
import p852kotlin.collections.CollectionsKt;

/* JADX INFO: renamed from: com.sumsub.sns.core.presentation.base.adapter.decorator.a */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28093a extends RecyclerView.ItemDecoration {

    /* JADX INFO: renamed from: a */
    public final float f57293a;

    /* JADX INFO: renamed from: b */
    public final float f57294b;

    /* JADX INFO: renamed from: c */
    public final Paint f57295c;

    public C28093a(float f11, float f12, float f13, int i11) {
        this.f57293a = f11;
        this.f57294b = f12;
        Paint paint = new Paint();
        paint.setColor(i11);
        paint.setStrokeWidth(f13);
        this.f57295c = paint;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        Canvas canvas2;
        int childCount = recyclerView.getChildCount();
        int i11 = 0;
        for (View view : ViewGroupKt.getChildren(recyclerView)) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            View view2 = view;
            if (i11 != childCount - 1) {
                float bottom = view2.getBottom();
                canvas2 = canvas;
                canvas2.drawLine(this.f57293a, bottom, view2.getRight() - this.f57294b, bottom, this.f57295c);
            } else {
                canvas2 = canvas;
            }
            i11 = i12;
            canvas = canvas2;
        }
    }
}
