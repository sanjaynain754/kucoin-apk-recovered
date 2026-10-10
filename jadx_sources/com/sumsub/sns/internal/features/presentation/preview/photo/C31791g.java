package com.sumsub.sns.internal.features.presentation.preview.photo;

import androidx.viewpager2.widget.ViewPager2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.photo.g */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31791g extends ViewPager2.OnPageChangeCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AbstractC31826m f64600a;

    public C31791g(AbstractC31826m abstractC31826m) {
        this.f64600a = abstractC31826m;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public final void onPageSelected(int i11) {
        AbstractC31826m abstractC31826m = this.f64600a;
        abstractC31826m.f64684r = i11;
        ((AbstractC31770c0) abstractC31826m.getViewModel$idensic_mobile_sdk_aar_defaultRelease()).getClass();
        AbstractC31770c0.m70857a(i11);
    }
}
