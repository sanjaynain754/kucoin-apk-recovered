package p611s;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: s.i */
/* JADX INFO: loaded from: classes23.dex */
public class C44224i {

    /* JADX INFO: renamed from: a */
    public String f97686a;

    /* JADX INFO: renamed from: b */
    public long f97687b;

    /* JADX INFO: renamed from: c */
    public float f97688c;

    /* JADX INFO: renamed from: d */
    public float f97689d;

    /* JADX INFO: renamed from: e */
    public float f97690e;

    /* JADX INFO: renamed from: f */
    public final AtomicLong f97691f = new AtomicLong(0);

    /* JADX INFO: renamed from: g */
    public long f97692g;

    /* JADX INFO: renamed from: h */
    public float f97693h;

    /* JADX INFO: renamed from: a */
    public void m97522a() {
        if (this.f97692g > 9223372036854765807L) {
            this.f97691f.incrementAndGet();
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j11 = this.f97687b;
        if (j11 == 0) {
            this.f97687b = jCurrentTimeMillis;
            return;
        }
        int i11 = (int) (jCurrentTimeMillis - j11);
        if (i11 <= 0) {
            return;
        }
        this.f97687b = jCurrentTimeMillis;
        float f11 = i11;
        float f12 = 1000.0f / f11;
        float f13 = this.f97693h;
        if (f13 == 0.0f || Math.abs(f12 - f13) < this.f97693h * 10.0f) {
            this.f97692g += (long) i11;
            float fIncrementAndGet = this.f97692g / this.f97691f.incrementAndGet();
            this.f97693h = 1000.0f / fIncrementAndGet;
            if (f11 > this.f97688c) {
                this.f97688c = f11;
            }
            float f14 = this.f97689d;
            if (f11 < f14 || f14 == 0.0f) {
                this.f97689d = f11;
            }
            this.f97690e = fIncrementAndGet;
        }
    }

    public C44224i(String str) {
        this.f97686a = str;
    }
}
