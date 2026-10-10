package jumio.core;

/* JADX INFO: renamed from: jumio.core.y1 */
/* JADX INFO: loaded from: classes61.dex */
public final class C40754y1 {

    /* JADX INFO: renamed from: a */
    public final int f90482a;

    /* JADX INFO: renamed from: b */
    public final int f90483b;

    /* JADX INFO: renamed from: c */
    public final int f90484c;

    public C40754y1() {
        this.f90482a = 0;
        this.f90483b = 0;
        this.f90484c = 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40754y1)) {
            return false;
        }
        C40754y1 c40754y1 = (C40754y1) obj;
        return this.f90482a == c40754y1.f90482a && this.f90483b == c40754y1.f90483b && this.f90484c == c40754y1.f90484c;
    }

    public C40754y1(int i11, int i12, int i13) {
        this.f90482a = i11;
        this.f90483b = i12;
        this.f90484c = i13;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f90484c) + AbstractC40653e0.m89252a(this.f90483b, Integer.hashCode(this.f90482a) * 31, 31);
    }

    public final String toString() {
        return "FramePerformance(mean=" + this.f90482a + ", min=" + this.f90483b + ", max=" + this.f90484c + ')';
    }
}
