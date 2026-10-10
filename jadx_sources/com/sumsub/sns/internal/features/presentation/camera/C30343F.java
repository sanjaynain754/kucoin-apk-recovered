package com.sumsub.sns.internal.features.presentation.camera;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.F */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30343F extends BottomSheetBehavior.BottomSheetCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AbstractC30348K f61017a;

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
    public final void onStateChanged(View view, int i11) {
        if (i11 == 4) {
            View viewMo70224h = this.f61017a.mo70224h();
            if (viewMo70224h != null) {
                viewMo70224h.setVisibility(8);
                return;
            }
            return;
        }
        View viewMo70224h2 = this.f61017a.mo70224h();
        if (viewMo70224h2 != null) {
            viewMo70224h2.setVisibility(0);
        }
    }

    public C30343F(AbstractC30348K abstractC30348K) {
        this.f61017a = abstractC30348K;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
    public final void onSlide(View view, float f11) {
        View viewMo70224h = this.f61017a.mo70224h();
        if (viewMo70224h != null) {
            viewMo70224h.setAlpha(f11 * 0.7f);
        }
    }
}
