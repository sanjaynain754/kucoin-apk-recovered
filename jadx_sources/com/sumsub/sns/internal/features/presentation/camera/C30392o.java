package com.sumsub.sns.internal.features.presentation.camera;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.sumsub.sns.core.data.listener.SNSEvent;
import com.sumsub.sns.core.data.listener.SNSEventHandler;
import com.sumsub.sns.internal.core.analytics.C28367f;
import com.sumsub.sns.internal.core.analytics.Popup;
import com.sumsub.sns.internal.core.common.C28468k0;
import com.sumsub.sns.internal.core.presentation.common.C28778k;
import p852kotlin.reflect.KProperty;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.o */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30392o extends BottomSheetBehavior.BottomSheetCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C30394p f61146a;

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
    public final void onStateChanged(View view, int i11) {
        if (i11 != 3) {
            if (i11 != 4) {
                return;
            }
            C28367f analyticsDelegate = this.f61146a.f58549a.getAnalyticsDelegate();
            C28367f.m69254a(analyticsDelegate.f57840a, analyticsDelegate.f57841b, analyticsDelegate.f57842c, Popup.BottomSheet);
            return;
        }
        C28367f analyticsDelegate2 = this.f61146a.f58549a.getAnalyticsDelegate();
        C28367f.m69261b(analyticsDelegate2.f57840a, analyticsDelegate2.f57841b, analyticsDelegate2.f57842c, Popup.BottomSheet);
        SNSEventHandler eventHandler = C28468k0.f57983a.getEventHandler();
        if (eventHandler != null) {
            eventHandler.onEvent(SNSEvent.ShowMoreGuidance.INSTANCE);
        }
    }

    public C30392o(C30394p c30394p) {
        this.f61146a = c30394p;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
    public final void onSlide(View view, float f11) {
        C30394p c30394p = this.f61146a;
        C28778k c28778k = c30394p.f61153i;
        KProperty[] kPropertyArr = C30394p.f61148k;
        View view2 = (View) c28778k.getValue(c30394p, kPropertyArr[1]);
        if (view2 != null) {
            view2.setVisibility(f11 > 0.0f ? 0 : 8);
        }
        C30394p c30394p2 = this.f61146a;
        View view3 = (View) c30394p2.f61153i.getValue(c30394p2, kPropertyArr[1]);
        if (view3 != null) {
            view3.setAlpha(f11 * 0.7f);
        }
    }
}
