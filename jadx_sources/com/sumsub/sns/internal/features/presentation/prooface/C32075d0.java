package com.sumsub.sns.internal.features.presentation.prooface;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.prooface.d0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32075d0 extends TimerTask {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C32109k0 f65284a;

    public C32075d0(C32109k0 c32109k0) {
        this.f65284a = c32109k0;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        C32109k0 c32109k0 = this.f65284a;
        if (c32109k0.f65366k == null) {
            Timer timer = new Timer();
            timer.schedule(new C32085f0(c32109k0), TimeUnit.SECONDS.toMillis(2L));
            c32109k0.f65366k = timer;
        }
    }
}
