package com.sumsub.sns.internal.features.presentation.preview.photo;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.sumsub.sns.internal.core.analytics.C28367f;
import java.util.Map;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.photo.h */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31793h extends BottomSheetBehavior.BottomSheetCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AbstractC31826m f64602a;

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
    public final void onStateChanged(View view, int i11) {
        if (i11 != 3) {
            if (i11 != 4) {
                return;
            }
            C28367f.m69258a(this.f64602a.getAnalyticsDelegate(), this.f64602a.getF63626a(), this.f64602a.getF66519e(), ((AbstractC31770c0) this.f64602a.getViewModel$idensic_mobile_sdk_aar_defaultRelease()).m70868e(), 8);
        } else {
            C28367f.m69259a(this.f64602a.getAnalyticsDelegate(), this.f64602a.getF63626a(), this.f64602a.getF66519e(), (Map) ((AbstractC31770c0) this.f64602a.getViewModel$idensic_mobile_sdk_aar_defaultRelease()).m70868e(), 8);
            BottomSheetBehavior bottomSheetBehavior = this.f64602a.f64682p;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.setHideable(false);
            }
        }
    }

    public C31793h(AbstractC31826m abstractC31826m) {
        this.f64602a = abstractC31826m;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
    public final void onSlide(View view, float f11) {
    }
}
