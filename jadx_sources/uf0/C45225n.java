package uf0;

/* JADX INFO: renamed from: uf0.n */
/* JADX INFO: compiled from: SpanId.java */
/* JADX INFO: loaded from: classes60.dex */
public final class C45225n implements Comparable<C45225n> {

    /* JADX INFO: renamed from: c */
    public static final C45225n f101752c = new C45225n(0);

    /* JADX INFO: renamed from: b */
    public final long f101753b;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof C45225n) && this.f101753b == ((C45225n) obj).f101753b;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(C45225n c45225n) {
        long j11 = this.f101753b;
        long j12 = c45225n.f101753b;
        if (j11 < j12) {
            return -1;
        }
        return j11 == j12 ? 0 : 1;
    }

    /* JADX INFO: renamed from: b */
    public void m99919b(char[] cArr, int i11) {
        C45218g.m99902d(this.f101753b, cArr, i11);
    }

    /* JADX INFO: renamed from: c */
    public byte[] m99920c() {
        byte[] bArr = new byte[8];
        C45218g.m99903e(this.f101753b, bArr, 0);
        return bArr;
    }

    /* JADX INFO: renamed from: d */
    public String m99921d() {
        char[] cArr = new char[16];
        m99919b(cArr, 0);
        return new String(cArr);
    }

    public int hashCode() {
        long j11 = this.f101753b;
        return (int) (j11 ^ (j11 >>> 32));
    }

    public String toString() {
        return "SpanId{spanId=" + m99921d() + "}";
    }

    public C45225n(long j11) {
        this.f101753b = j11;
    }
}
