package com.sumsub.sns.internal.features.presentation.camera.video;

import android.os.CountDownTimer;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.video.w */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class CountDownTimerC30790w extends CountDownTimer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C30763G f62209a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CountDownTimerC30790w(C30763G c30763g) {
        super(7600L, 50L);
        this.f62209a = c30763g;
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        this.f62209a.fireEvent(new C30780m(SNSVideoSelfieViewModel$State.Recording));
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j11) {
        this.f62209a.fireEvent(new C30781n(SNSVideoSelfieViewModel$State.Recording, j11));
    }
}
