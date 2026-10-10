package com.fasterxml.jackson.databind.util;

import java.lang.reflect.Array;
import java.util.HashSet;

/* JADX INFO: renamed from: com.fasterxml.jackson.databind.util.b */
/* JADX INFO: compiled from: ArrayBuilders.java */
/* JADX INFO: loaded from: classes45.dex */
public final class C6485b {

    /* JADX INFO: renamed from: a */
    public b f10710a = null;

    /* JADX INFO: renamed from: b */
    public c f10711b = null;

    /* JADX INFO: renamed from: c */
    public h f10712c = null;

    /* JADX INFO: renamed from: d */
    public f f10713d = null;

    /* JADX INFO: renamed from: e */
    public g f10714e = null;

    /* JADX INFO: renamed from: f */
    public e f10715f = null;

    /* JADX INFO: renamed from: g */
    public d f10716g = null;

    /* JADX INFO: renamed from: com.fasterxml.jackson.databind.util.b$a */
    /* JADX INFO: compiled from: ArrayBuilders.java */
    public static class a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Class f10717a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f10718b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Object f10719c;

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!C6490g.m11905H(obj, this.f10717a) || Array.getLength(obj) != this.f10718b) {
                return false;
            }
            for (int i11 = 0; i11 < this.f10718b; i11++) {
                Object obj2 = Array.get(this.f10719c, i11);
                Object obj3 = Array.get(obj, i11);
                if (obj2 != obj3 && obj2 != null && !obj2.equals(obj3)) {
                    return false;
                }
            }
            return true;
        }

        public a(Class cls, int i11, Object obj) {
            this.f10717a = cls;
            this.f10718b = i11;
            this.f10719c = obj;
        }
    }

    /* JADX INFO: renamed from: com.fasterxml.jackson.databind.util.b$b */
    /* JADX INFO: compiled from: ArrayBuilders.java */
    public static final class b extends AbstractC6496m<boolean[]> {
        @Override // com.fasterxml.jackson.databind.util.AbstractC6496m
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final boolean[] mo11886a(int i11) {
            return new boolean[i11];
        }
    }

    /* JADX INFO: renamed from: com.fasterxml.jackson.databind.util.b$c */
    /* JADX INFO: compiled from: ArrayBuilders.java */
    public static final class c extends AbstractC6496m<byte[]> {
        @Override // com.fasterxml.jackson.databind.util.AbstractC6496m
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final byte[] mo11886a(int i11) {
            return new byte[i11];
        }
    }

    /* JADX INFO: renamed from: com.fasterxml.jackson.databind.util.b$d */
    /* JADX INFO: compiled from: ArrayBuilders.java */
    public static final class d extends AbstractC6496m<double[]> {
        @Override // com.fasterxml.jackson.databind.util.AbstractC6496m
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final double[] mo11886a(int i11) {
            return new double[i11];
        }
    }

    /* JADX INFO: renamed from: com.fasterxml.jackson.databind.util.b$e */
    /* JADX INFO: compiled from: ArrayBuilders.java */
    public static final class e extends AbstractC6496m<float[]> {
        @Override // com.fasterxml.jackson.databind.util.AbstractC6496m
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final float[] mo11886a(int i11) {
            return new float[i11];
        }
    }

    /* JADX INFO: renamed from: com.fasterxml.jackson.databind.util.b$f */
    /* JADX INFO: compiled from: ArrayBuilders.java */
    public static final class f extends AbstractC6496m<int[]> {
        @Override // com.fasterxml.jackson.databind.util.AbstractC6496m
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final int[] mo11886a(int i11) {
            return new int[i11];
        }
    }

    /* JADX INFO: renamed from: com.fasterxml.jackson.databind.util.b$g */
    /* JADX INFO: compiled from: ArrayBuilders.java */
    public static final class g extends AbstractC6496m<long[]> {
        @Override // com.fasterxml.jackson.databind.util.AbstractC6496m
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final long[] mo11886a(int i11) {
            return new long[i11];
        }
    }

    /* JADX INFO: renamed from: com.fasterxml.jackson.databind.util.b$h */
    /* JADX INFO: compiled from: ArrayBuilders.java */
    public static final class h extends AbstractC6496m<short[]> {
        @Override // com.fasterxml.jackson.databind.util.AbstractC6496m
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final short[] mo11886a(int i11) {
            return new short[i11];
        }
    }

    /* JADX INFO: renamed from: j */
    public static <T> T[] m11878j(T[] tArr, T t11) {
        int length = tArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (tArr[i11] == t11) {
                if (i11 == 0) {
                    return tArr;
                }
                T[] tArr2 = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), length));
                System.arraycopy(tArr, 0, tArr2, 1, i11);
                tArr2[0] = t11;
                int i12 = i11 + 1;
                int i13 = length - i12;
                if (i13 > 0) {
                    System.arraycopy(tArr, i12, tArr2, i12, i13);
                }
                return tArr2;
            }
        }
        T[] tArr3 = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), length + 1));
        if (length > 0) {
            System.arraycopy(tArr, 0, tArr3, 1, length);
        }
        tArr3[0] = t11;
        return tArr3;
    }

    /* JADX INFO: renamed from: a */
    public static <T> HashSet<T> m11876a(T[] tArr) {
        if (tArr == null) {
            return new HashSet<>();
        }
        HashSet<T> hashSet = new HashSet<>(tArr.length);
        for (T t11 : tArr) {
            hashSet.add(t11);
        }
        return hashSet;
    }

    /* JADX INFO: renamed from: c */
    public b m11879c() {
        if (this.f10710a == null) {
            this.f10710a = new b();
        }
        return this.f10710a;
    }

    /* JADX INFO: renamed from: d */
    public c m11880d() {
        if (this.f10711b == null) {
            this.f10711b = new c();
        }
        return this.f10711b;
    }

    /* JADX INFO: renamed from: e */
    public d m11881e() {
        if (this.f10716g == null) {
            this.f10716g = new d();
        }
        return this.f10716g;
    }

    /* JADX INFO: renamed from: f */
    public e m11882f() {
        if (this.f10715f == null) {
            this.f10715f = new e();
        }
        return this.f10715f;
    }

    /* JADX INFO: renamed from: g */
    public f m11883g() {
        if (this.f10713d == null) {
            this.f10713d = new f();
        }
        return this.f10713d;
    }

    /* JADX INFO: renamed from: h */
    public g m11884h() {
        if (this.f10714e == null) {
            this.f10714e = new g();
        }
        return this.f10714e;
    }

    /* JADX INFO: renamed from: i */
    public h m11885i() {
        if (this.f10712c == null) {
            this.f10712c = new h();
        }
        return this.f10712c;
    }

    /* JADX INFO: renamed from: b */
    public static Object m11877b(Object obj) {
        return new a(obj.getClass(), Array.getLength(obj), obj);
    }
}
