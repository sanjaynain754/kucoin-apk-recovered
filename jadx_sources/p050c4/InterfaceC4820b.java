package p050c4;

import java.util.concurrent.TimeUnit;
import p712w3.InterfaceC45704d;

/* JADX INFO: renamed from: c4.b */
/* JADX INFO: compiled from: MonotonicClock.java */
/* JADX INFO: loaded from: classes34.dex */
public interface InterfaceC4820b {
    @InterfaceC45704d
    long nowNanos();

    @InterfaceC45704d
    default long now() {
        return TimeUnit.NANOSECONDS.toMillis(nowNanos());
    }
}
