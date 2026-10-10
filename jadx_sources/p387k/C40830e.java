package p387k;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: k.e */
/* JADX INFO: loaded from: classes23.dex */
public class C40830e {

    /* JADX INFO: renamed from: a */
    public long f90702a;

    /* JADX INFO: renamed from: b */
    public final AtomicLong f90703b = new AtomicLong(0);

    /* JADX INFO: renamed from: c */
    public long f90704c;

    /* JADX INFO: renamed from: d */
    public float f90705d;

    /* JADX INFO: renamed from: a */
    public float m89339a() {
        return this.f90705d;
    }

    /* JADX INFO: renamed from: b */
    public float m89340b() {
        float f11 = this.f90705d;
        if (f11 == 0.0f) {
            return 0.0f;
        }
        return 1000.0f / f11;
    }

    /* JADX INFO: renamed from: c */
    public long m89341c() {
        return this.f90703b.get();
    }

    /* JADX INFO: renamed from: d */
    public void m89342d() {
        if (this.f90704c > 9223372036854765807L) {
            this.f90703b.incrementAndGet();
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j11 = this.f90702a;
        if (j11 == 0) {
            this.f90702a = jCurrentTimeMillis;
            return;
        }
        int i11 = (int) (jCurrentTimeMillis - j11);
        if (i11 <= 0) {
            return;
        }
        this.f90702a = jCurrentTimeMillis;
        float f11 = 1000.0f / i11;
        float f12 = this.f90705d;
        if (f12 == 0.0f || Math.abs(f11 - f12) < this.f90705d * 10.0f) {
            this.f90704c += (long) i11;
            this.f90705d = 1000.0f / (this.f90704c / this.f90703b.incrementAndGet());
        }
    }

    /* JADX INFO: renamed from: e */
    public void m89343e(int i11) {
        if (this.f90704c > 9223372036854765807L) {
            this.f90703b.incrementAndGet();
            return;
        }
        if (i11 < 0) {
            return;
        }
        float f11 = 1000.0f / i11;
        float f12 = this.f90705d;
        if (f12 == 0.0f || Math.abs(f11 - f12) < this.f90705d * 10.0f) {
            this.f90704c += (long) i11;
            this.f90705d = 1000.0f / (this.f90704c / this.f90703b.incrementAndGet());
        }
    }
}
