package com.sumsub.sns.internal.features.presentation.preview.ekyc;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.sumsub.log.logger.Logger;
import com.sumsub.sns.R$id;
import com.sumsub.sns.internal.log.C33272c;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.ranges.RangesKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.ekyc.e */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31546e extends BottomSheetBehavior.BottomSheetCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C31715m f64054a;

    public C31546e(C31715m c31715m) {
        this.f64054a = c31715m;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
    public final void onStateChanged(View view, int i11) {
        View viewFindViewById;
        Logger.DefaultImpls.v$default(C33272c.f67812a, "EKyc", "webViewSheet hidden=" + (i11 == 4), null, 4, null);
        FragmentActivity activity = this.f64054a.getActivity();
        if (activity == null || (viewFindViewById = activity.findViewById(R$id.sns_toolbar)) == null) {
            return;
        }
        viewFindViewById.setVisibility(Intrinsics.areEqual(Boolean.valueOf(i11 == 4), Boolean.TRUE) ? 0 : 4);
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
    public final void onSlide(View view, float f11) {
        View viewFindViewById;
        float fCoerceIn = 1.0f;
        if (f11 >= 0.7f) {
            fCoerceIn = RangesKt.coerceIn((1.0f - f11) - 0.05f, 0.0f, 1.0f);
        }
        FragmentActivity activity = this.f64054a.getActivity();
        if (activity != null && (viewFindViewById = activity.findViewById(R$id.sns_toolbar)) != null) {
            viewFindViewById.setAlpha(fCoerceIn);
        }
    }
}
