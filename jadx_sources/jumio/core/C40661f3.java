package jumio.core;

/* JADX INFO: renamed from: jumio.core.f3 */
/* JADX INFO: loaded from: classes61.dex */
public final class C40661f3 {

    /* JADX INFO: renamed from: a */
    public final int f90267a;

    /* JADX INFO: renamed from: b */
    public final int f90268b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40661f3)) {
            return false;
        }
        C40661f3 c40661f3 = (C40661f3) obj;
        return this.f90267a == c40661f3.f90267a && this.f90268b == c40661f3.f90268b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f90268b) + (Integer.hashCode(this.f90267a) * 31);
    }

    public final String toString() {
        return "Bounds(min=" + this.f90267a + ", max=" + this.f90268b + ')';
    }

    public C40661f3(int i11, int i12) {
        this.f90267a = i11;
        this.f90268b = i12;
    }
}
