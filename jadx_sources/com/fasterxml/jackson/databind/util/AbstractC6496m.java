package com.fasterxml.jackson.databind.util;

/* JADX INFO: renamed from: com.fasterxml.jackson.databind.util.m */
/* JADX INFO: compiled from: PrimitiveArrayBuilder.java */
/* JADX INFO: loaded from: classes45.dex */
public abstract class AbstractC6496m<T> {

    /* JADX INFO: renamed from: a */
    public T f10743a;

    /* JADX INFO: renamed from: b */
    public a<T> f10744b;

    /* JADX INFO: renamed from: c */
    public a<T> f10745c;

    /* JADX INFO: renamed from: d */
    public int f10746d;

    /* JADX INFO: renamed from: com.fasterxml.jackson.databind.util.m$a */
    /* JADX INFO: compiled from: PrimitiveArrayBuilder.java */
    public static final class a<T> {

        /* JADX INFO: renamed from: a */
        public final T f10747a;

        /* JADX INFO: renamed from: b */
        public final int f10748b;

        /* JADX INFO: renamed from: c */
        public a<T> f10749c;

        /* JADX INFO: renamed from: a */
        public int m11993a(T t11, int i11) {
            System.arraycopy(this.f10747a, 0, t11, i11, this.f10748b);
            return i11 + this.f10748b;
        }

        /* JADX INFO: renamed from: b */
        public T m11994b() {
            return this.f10747a;
        }

        /* JADX INFO: renamed from: c */
        public void m11995c(a<T> aVar) {
            if (this.f10749c != null) {
                throw new IllegalStateException();
            }
            this.f10749c = aVar;
        }

        /* JADX INFO: renamed from: d */
        public a<T> m11996d() {
            return this.f10749c;
        }

        public a(T t11, int i11) {
            this.f10747a = t11;
            this.f10748b = i11;
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract T mo11886a(int i11);

    /* JADX INFO: renamed from: b */
    public void m11988b() {
        a<T> aVar = this.f10745c;
        if (aVar != null) {
            this.f10743a = aVar.m11994b();
        }
        this.f10745c = null;
        this.f10744b = null;
        this.f10746d = 0;
    }

    /* JADX INFO: renamed from: c */
    public final T m11989c(T t11, int i11) {
        a<T> aVar = new a<>(t11, i11);
        if (this.f10744b == null) {
            this.f10745c = aVar;
            this.f10744b = aVar;
        } else {
            this.f10745c.m11995c(aVar);
            this.f10745c = aVar;
        }
        this.f10746d += i11;
        return mo11886a(i11 < 16384 ? i11 + i11 : i11 + (i11 >> 2));
    }

    /* JADX INFO: renamed from: d */
    public int m11990d() {
        return this.f10746d;
    }

    /* JADX INFO: renamed from: e */
    public T m11991e(T t11, int i11) {
        int i12 = this.f10746d + i11;
        T tMo11886a = mo11886a(i12);
        int iM11993a = 0;
        for (a<T> aVarM11996d = this.f10744b; aVarM11996d != null; aVarM11996d = aVarM11996d.m11996d()) {
            iM11993a = aVarM11996d.m11993a(tMo11886a, iM11993a);
        }
        System.arraycopy(t11, 0, tMo11886a, iM11993a, i11);
        int i13 = iM11993a + i11;
        if (i13 == i12) {
            return tMo11886a;
        }
        throw new IllegalStateException("Should have gotten " + i12 + " entries, got " + i13);
    }

    /* JADX INFO: renamed from: f */
    public T m11992f() {
        m11988b();
        T t11 = this.f10743a;
        if (t11 == null) {
            return mo11886a(12);
        }
        return t11;
    }
}
