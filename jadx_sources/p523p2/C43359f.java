package p523p2;

import android.annotation.TargetApi;
import android.os.SystemClock;

/* JADX INFO: renamed from: p2.f */
/* JADX INFO: compiled from: LogTime.java */
/* JADX INFO: loaded from: classes.dex */
public final class C43359f {

    /* JADX INFO: renamed from: a */
    public static final double f95751a = 1.0d / Math.pow(10.0d, 6.0d);

    /* JADX INFO: renamed from: a */
    public static double m95489a(long j11) {
        return (m95490b() - j11) * f95751a;
    }

    @TargetApi(17)
    /* JADX INFO: renamed from: b */
    public static long m95490b() {
        return SystemClock.elapsedRealtimeNanos();
    }
}
