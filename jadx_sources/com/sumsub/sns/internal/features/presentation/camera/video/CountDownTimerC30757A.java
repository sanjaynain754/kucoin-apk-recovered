package com.sumsub.sns.internal.features.presentation.camera.video;

import android.os.CountDownTimer;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.video.A */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class CountDownTimerC30757A extends CountDownTimer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C30763G f62142a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CountDownTimerC30757A(C30763G c30763g) {
        super(1000L, 1000L);
        this.f62142a = c30763g;
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        this.f62142a.m70449e();
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j11) {
    }
}
