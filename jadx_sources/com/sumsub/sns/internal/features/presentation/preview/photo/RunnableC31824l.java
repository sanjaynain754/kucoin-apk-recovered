package com.sumsub.sns.internal.features.presentation.preview.photo;

import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.photo.l */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class RunnableC31824l implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ TextView f64663a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractC31826m f64664b;

    public RunnableC31824l(ViewGroup viewGroup, TextView textView, AbstractC31826m abstractC31826m) {
        this.f64663a = textView;
        this.f64664b = abstractC31826m;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TextView textView = this.f64663a;
        int height = textView != null ? textView.getHeight() : 0;
        AbstractC31826m abstractC31826m = this.f64664b;
        BottomSheetBehavior bottomSheetBehavior = abstractC31826m.f64682p;
        if (bottomSheetBehavior != null) {
            ViewGroup viewGroupM70908j = abstractC31826m.m70908j();
            bottomSheetBehavior.setPeekHeight((viewGroupM70908j != null ? viewGroupM70908j.getHeight() : 0) - height);
        }
    }
}
