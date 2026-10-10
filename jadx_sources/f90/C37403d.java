package f90;

/* JADX INFO: renamed from: f90.d */
/* JADX INFO: compiled from: Pair.java */
/* JADX INFO: loaded from: classes23.dex */
public final class C37403d<A, B> {

    /* JADX INFO: renamed from: a */
    public final A f82999a;

    /* JADX INFO: renamed from: b */
    public final B f83000b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C37403d.class != obj.getClass()) {
            return false;
        }
        C37403d c37403d = (C37403d) obj;
        A a11 = this.f82999a;
        if (a11 == null) {
            if (c37403d.f82999a != null) {
                return false;
            }
        } else if (!a11.equals(c37403d.f82999a)) {
            return false;
        }
        B b11 = this.f83000b;
        if (b11 == null) {
            if (c37403d.f83000b != null) {
                return false;
            }
        } else if (!b11.equals(c37403d.f83000b)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public static <A, B> C37403d<A, B> m84129b(A a11, B b11) {
        return new C37403d<>(a11, b11);
    }

    /* JADX INFO: renamed from: a */
    public A m84130a() {
        return this.f82999a;
    }

    public int hashCode() {
        A a11 = this.f82999a;
        int iHashCode = ((a11 == null ? 0 : a11.hashCode()) + 31) * 31;
        B b11 = this.f83000b;
        return iHashCode + (b11 != null ? b11.hashCode() : 0);
    }

    public C37403d(A a11, B b11) {
        this.f82999a = a11;
        this.f83000b = b11;
    }
}
