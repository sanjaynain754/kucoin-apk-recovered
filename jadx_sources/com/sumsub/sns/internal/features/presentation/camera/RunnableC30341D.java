package com.sumsub.sns.internal.features.presentation.camera;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.sumsub.sns.R$dimen;
import com.sumsub.sns.internal.log.C33272c;
import p852kotlin.ranges.RangesKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.D */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class RunnableC30341D implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AbstractC30348K f61015a;

    public RunnableC30341D(View view, AbstractC30348K abstractC30348K) {
        this.f61015a = abstractC30348K;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroupMo70228l = this.f61015a.mo70228l();
        int iCoerceAtMost = viewGroupMo70228l != null ? RangesKt.coerceAtMost(viewGroupMo70228l.getHeight(), this.f61015a.getResources().getDimensionPixelSize(R$dimen.sns_collapsed_intro_height)) : this.f61015a.getResources().getDimensionPixelSize(R$dimen.sns_collapsed_intro_height);
        View view = this.f61015a.getView();
        int height = view != null ? view.getHeight() : 0;
        View viewMo70234r = this.f61015a.mo70234r();
        int bottom = height - (viewMo70234r != null ? viewMo70234r.getBottom() : 0);
        Integer numValueOf = Integer.valueOf(bottom);
        if (bottom <= 0) {
            numValueOf = null;
        }
        int iIntValue = numValueOf != null ? numValueOf.intValue() : Integer.MAX_VALUE;
        int iMin = Math.min(iCoerceAtMost, iIntValue);
        BottomSheetBehavior bottomSheetBehavior = this.f61015a.f61025b;
        int peekHeight = bottomSheetBehavior != null ? bottomSheetBehavior.getPeekHeight() : 0;
        BottomSheetBehavior bottomSheetBehavior2 = this.f61015a.f61025b;
        if (bottomSheetBehavior2 != null) {
            bottomSheetBehavior2.setPeekHeight(iMin, true);
        }
        C33272c.f67816e.f67810a.mo68955d("DocCapture", "adjustPickHeight: viewHeight=" + iMin + " spaceUnderTakePictureButton=" + iIntValue, null);
        if (peekHeight != iMin) {
            this.f61015a.mo70240x();
        }
        BottomSheetBehavior bottomSheetBehavior3 = this.f61015a.f61025b;
        int dimensionPixelSize = this.f61015a.getResources().getDimensionPixelSize(R$dimen.sns_margin_medium) + (bottomSheetBehavior3 != null ? bottomSheetBehavior3.getPeekHeight() : 0);
        View viewMo70222f = this.f61015a.mo70222f();
        if (viewMo70222f != null) {
            viewMo70222f.setPadding(viewMo70222f.getPaddingLeft(), viewMo70222f.getPaddingTop(), viewMo70222f.getPaddingRight(), dimensionPixelSize);
            return;
        }
        View viewMo70234r2 = this.f61015a.mo70234r();
        ViewGroup.LayoutParams layoutParams = viewMo70234r2 != null ? viewMo70234r2.getLayoutParams() : null;
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.bottomMargin = dimensionPixelSize;
        }
    }
}
