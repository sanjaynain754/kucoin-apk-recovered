package com.fasterxml.jackson.databind.util;

import com.fasterxml.jackson.databind.JavaType;

/* JADX INFO: renamed from: com.fasterxml.jackson.databind.util.r */
/* JADX INFO: compiled from: TypeKey.java */
/* JADX INFO: loaded from: classes45.dex */
public class C6501r {

    /* JADX INFO: renamed from: a */
    public int f10793a;

    /* JADX INFO: renamed from: b */
    public Class<?> f10794b;

    /* JADX INFO: renamed from: c */
    public JavaType f10795c;

    /* JADX INFO: renamed from: d */
    public boolean f10796d;

    public C6501r() {
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj.getClass() != getClass()) {
            return false;
        }
        C6501r c6501r = (C6501r) obj;
        if (c6501r.f10796d != this.f10796d) {
            return false;
        }
        Class<?> cls = this.f10794b;
        if (cls != null) {
            return c6501r.f10794b == cls;
        }
        return this.f10795c.equals(c6501r.f10795c);
    }

    public C6501r(Class<?> cls, boolean z11) {
        this.f10794b = cls;
        this.f10795c = null;
        this.f10796d = z11;
        this.f10793a = z11 ? m12054e(cls) : m12056g(cls);
    }

    /* JADX INFO: renamed from: a */
    public Class<?> m12057a() {
        return this.f10794b;
    }

    /* JADX INFO: renamed from: b */
    public JavaType m12058b() {
        return this.f10795c;
    }

    /* JADX INFO: renamed from: c */
    public boolean m12059c() {
        return this.f10796d;
    }

    public final int hashCode() {
        return this.f10793a;
    }

    public final String toString() {
        if (this.f10794b != null) {
            return "{class: " + this.f10794b.getName() + ", typed? " + this.f10796d + "}";
        }
        return "{type: " + this.f10795c + ", typed? " + this.f10796d + "}";
    }

    /* JADX INFO: renamed from: d */
    public static final int m12053d(JavaType javaType) {
        return javaType.hashCode() - 2;
    }

    /* JADX INFO: renamed from: e */
    public static final int m12054e(Class<?> cls) {
        return cls.getName().hashCode() + 1;
    }

    /* JADX INFO: renamed from: f */
    public static final int m12055f(JavaType javaType) {
        return javaType.hashCode() - 1;
    }

    /* JADX INFO: renamed from: g */
    public static final int m12056g(Class<?> cls) {
        return cls.getName().hashCode();
    }

    public C6501r(JavaType javaType, boolean z11) {
        this.f10795c = javaType;
        this.f10794b = null;
        this.f10796d = z11;
        this.f10793a = z11 ? m12053d(javaType) : m12055f(javaType);
    }
}
