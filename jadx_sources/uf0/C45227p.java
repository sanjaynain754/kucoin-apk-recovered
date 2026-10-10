package uf0;

/* JADX INFO: renamed from: uf0.p */
/* JADX INFO: compiled from: TraceId.java */
/* JADX INFO: loaded from: classes60.dex */
public final class C45227p implements Comparable<C45227p> {

    /* JADX INFO: renamed from: d */
    public static final C45227p f101755d = new C45227p(0, 0);

    /* JADX INFO: renamed from: b */
    public final long f101756b;

    /* JADX INFO: renamed from: c */
    public final long f101757c;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C45227p)) {
            return false;
        }
        C45227p c45227p = (C45227p) obj;
        return this.f101756b == c45227p.f101756b && this.f101757c == c45227p.f101757c;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(C45227p c45227p) {
        long j11 = this.f101756b;
        long j12 = c45227p.f101756b;
        if (j11 != j12) {
            return j11 < j12 ? -1 : 1;
        }
        long j13 = this.f101757c;
        long j14 = c45227p.f101757c;
        if (j13 == j14) {
            return 0;
        }
        return j13 < j14 ? -1 : 1;
    }

    /* JADX INFO: renamed from: b */
    public void m99926b(char[] cArr, int i11) {
        C45218g.m99902d(this.f101756b, cArr, i11);
        C45218g.m99902d(this.f101757c, cArr, i11 + 16);
    }

    /* JADX INFO: renamed from: c */
    public String m99927c() {
        char[] cArr = new char[32];
        m99926b(cArr, 0);
        return new String(cArr);
    }

    public int hashCode() {
        long j11 = this.f101756b;
        int i11 = (((int) (j11 ^ (j11 >>> 32))) + 31) * 31;
        long j12 = this.f101757c;
        return i11 + ((int) ((j12 >>> 32) ^ j12));
    }

    public String toString() {
        return "TraceId{traceId=" + m99927c() + "}";
    }

    public C45227p(long j11, long j12) {
        this.f101756b = j11;
        this.f101757c = j12;
    }
}
