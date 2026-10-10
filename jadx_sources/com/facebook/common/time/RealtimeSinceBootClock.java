package com.facebook.common.time;

import android.os.SystemClock;
import java.util.concurrent.TimeUnit;
import p050c4.InterfaceC4820b;
import p712w3.InterfaceC45704d;

/* JADX INFO: loaded from: classes34.dex */
@InterfaceC45704d
public class RealtimeSinceBootClock implements InterfaceC4820b {

    /* JADX INFO: renamed from: a */
    public static final RealtimeSinceBootClock f8164a = new RealtimeSinceBootClock();

    @InterfaceC45704d
    public static RealtimeSinceBootClock get() {
        return f8164a;
    }

    @Override // p050c4.InterfaceC4820b
    public long nowNanos() {
        return TimeUnit.MILLISECONDS.toNanos(now());
    }

    private RealtimeSinceBootClock() {
    }

    @Override // p050c4.InterfaceC4820b
    public long now() {
        return SystemClock.elapsedRealtime();
    }
}
