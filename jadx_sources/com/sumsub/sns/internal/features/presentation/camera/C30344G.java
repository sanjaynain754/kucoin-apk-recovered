package com.sumsub.sns.internal.features.presentation.camera;

import android.view.View;
import android.widget.TextView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.sumsub.sns.core.data.listener.SNSEvent;
import com.sumsub.sns.core.data.listener.SNSEventHandler;
import com.sumsub.sns.internal.core.analytics.C28367f;
import com.sumsub.sns.internal.core.analytics.Screen;
import com.sumsub.sns.internal.core.common.C28468k0;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.G */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30344G extends BottomSheetBehavior.BottomSheetCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AbstractC30348K f61018a;

    public C30344G(AbstractC30348K abstractC30348K) {
        this.f61018a = abstractC30348K;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
    public final void onStateChanged(View view, int i11) {
        TextView textViewMo70226j = this.f61018a.mo70226j();
        CharSequence text = textViewMo70226j != null ? textViewMo70226j.getText() : null;
        if (text == null || text.length() == 0) {
            return;
        }
        if (i11 != 3) {
            if (i11 != 4) {
                return;
            }
            C28367f.m69258a(this.f61018a.getAnalyticsDelegate(), Screen.CameraScreen, this.f61018a.getF65006c(), (LinkedHashMap) null, 12);
            TextView textViewMo70225i = this.f61018a.mo70225i();
            if (textViewMo70225i != null) {
                textViewMo70225i.setVisibility(0);
            }
            TextView textViewMo70226j2 = this.f61018a.mo70226j();
            if (textViewMo70226j2 != null) {
                textViewMo70226j2.setVisibility(4);
                return;
            }
            return;
        }
        C28367f.m69259a(this.f61018a.getAnalyticsDelegate(), Screen.CameraScreen, this.f61018a.getF65006c(), (Map) null, 12);
        TextView textViewMo70225i2 = this.f61018a.mo70225i();
        if (textViewMo70225i2 != null) {
            textViewMo70225i2.setVisibility(4);
        }
        TextView textViewMo70226j3 = this.f61018a.mo70226j();
        if (textViewMo70226j3 != null) {
            textViewMo70226j3.setVisibility(0);
        }
        SNSEventHandler eventHandler = C28468k0.f57983a.getEventHandler();
        if (eventHandler != null) {
            eventHandler.onEvent(SNSEvent.ShowMoreGuidance.INSTANCE);
        }
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
    public final void onSlide(View view, float f11) {
    }
}
