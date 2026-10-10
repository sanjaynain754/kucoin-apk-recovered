package uf0;

import java.util.Arrays;

/* JADX INFO: renamed from: uf0.m */
/* JADX INFO: compiled from: SpanContext.java */
/* JADX INFO: loaded from: classes60.dex */
public final class C45224m {

    /* JADX INFO: renamed from: e */
    public static final AbstractC45230s f101746e;

    /* JADX INFO: renamed from: f */
    public static final C45224m f101747f;

    /* JADX INFO: renamed from: a */
    public final C45227p f101748a;

    /* JADX INFO: renamed from: b */
    public final C45225n f101749b;

    /* JADX INFO: renamed from: c */
    public final C45228q f101750c;

    /* JADX INFO: renamed from: d */
    public final AbstractC45230s f101751d;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C45224m)) {
            return false;
        }
        C45224m c45224m = (C45224m) obj;
        return this.f101748a.equals(c45224m.f101748a) && this.f101749b.equals(c45224m.f101749b) && this.f101750c.equals(c45224m.f101750c);
    }

    /* JADX INFO: renamed from: a */
    public C45225n m99915a() {
        return this.f101749b;
    }

    /* JADX INFO: renamed from: b */
    public C45227p m99916b() {
        return this.f101748a;
    }

    /* JADX INFO: renamed from: c */
    public C45228q m99917c() {
        return this.f101750c;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f101748a, this.f101749b, this.f101750c});
    }

    public String toString() {
        return "SpanContext{traceId=" + this.f101748a + ", spanId=" + this.f101749b + ", traceOptions=" + this.f101750c + "}";
    }

    static {
        AbstractC45230s abstractC45230sM99942b = AbstractC45230s.m99939b().m99942b();
        f101746e = abstractC45230sM99942b;
        f101747f = new C45224m(C45227p.f101755d, C45225n.f101752c, C45228q.f101758b, abstractC45230sM99942b);
    }

    public C45224m(C45227p c45227p, C45225n c45225n, C45228q c45228q, AbstractC45230s abstractC45230s) {
        this.f101748a = c45227p;
        this.f101749b = c45225n;
        this.f101750c = c45228q;
        this.f101751d = abstractC45230s;
    }
}
