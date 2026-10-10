package io.trtc.tuikit.atomicxcore.impl.view.call;

import android.os.SystemClock;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.view.call.z */
/* JADX INFO: loaded from: classes61.dex */
public final class RunnableC40042z implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C39982A f89085a;

    public RunnableC40042z(C39982A c39982a) {
        this.f89085a = c39982a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f89085a.f88919e) {
            long jUptimeMillis = SystemClock.uptimeMillis();
            int iDuration = this.f89085a.f88915a.duration();
            if (iDuration > 0) {
                C39982A c39982a = this.f89085a;
                c39982a.f88915a.setTime((int) ((jUptimeMillis - c39982a.f88917c) % ((long) iDuration)));
            } else {
                this.f89085a.f88915a.setTime(0);
            }
            this.f89085a.f88916b.invalidate();
            this.f89085a.f88918d.postDelayed(this, 16L);
        }
    }
}
