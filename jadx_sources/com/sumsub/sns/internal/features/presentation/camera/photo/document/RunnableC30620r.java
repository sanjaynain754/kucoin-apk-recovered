package com.sumsub.sns.internal.features.presentation.camera.photo.document;

import android.util.SizeF;
import com.sumsub.sns.core.widget.camera.SNSFrameViewWithBackground;
import p852kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.photo.document.r */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class RunnableC30620r implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C30471K f61864a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ SizeF f61865b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f61866c;

    public RunnableC30620r(SNSFrameViewWithBackground sNSFrameViewWithBackground, C30471K c30471k, SizeF sizeF, boolean z11) {
        this.f61864a = c30471k;
        this.f61865b = sizeF;
        this.f61866c = z11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C30471K c30471k = this.f61864a;
        C30590m c30590m = C30471K.f61458R;
        SNSFrameViewWithBackground sNSFrameViewWithBackgroundM70392E = c30471k.m70392E();
        if (sNSFrameViewWithBackgroundM70392E != null) {
            sNSFrameViewWithBackgroundM70392E.setFrameSize(this.f61865b);
        }
        SNSFrameViewWithBackground sNSFrameViewWithBackgroundM70392E2 = this.f61864a.m70392E();
        if (sNSFrameViewWithBackgroundM70392E2 != null) {
            sNSFrameViewWithBackgroundM70392E2.updateFrameRect();
        }
        C30471K.m70381a(this.f61864a);
        this.f61864a.m70389B();
        if (this.f61866c) {
            C30471K c30471k2 = this.f61864a;
            c30471k2.m70218a(true, c30471k2.m70393F(), (Function0) null);
        }
    }
}
