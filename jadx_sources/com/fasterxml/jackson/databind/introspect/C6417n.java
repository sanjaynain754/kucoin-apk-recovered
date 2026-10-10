package com.fasterxml.jackson.databind.introspect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: com.fasterxml.jackson.databind.introspect.n */
/* JADX INFO: compiled from: MemberKey.java */
/* JADX INFO: loaded from: classes45.dex */
public final class C6417n {

    /* JADX INFO: renamed from: c */
    public static final Class<?>[] f10454c = new Class[0];

    /* JADX INFO: renamed from: a */
    public final String f10455a;

    /* JADX INFO: renamed from: b */
    public final Class<?>[] f10456b;

    public C6417n(Method method) {
        this(method.getName(), method.getParameterTypes());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != C6417n.class) {
            return false;
        }
        C6417n c6417n = (C6417n) obj;
        if (!this.f10455a.equals(c6417n.f10455a)) {
            return false;
        }
        Class<?>[] clsArr = c6417n.f10456b;
        int length = this.f10456b.length;
        if (clsArr.length != length) {
            return false;
        }
        for (int i11 = 0; i11 < length; i11++) {
            if (clsArr[i11] != this.f10456b[i11]) {
                return false;
            }
        }
        return true;
    }

    public C6417n(Constructor<?> constructor) {
        this("", constructor.getParameterTypes());
    }

    /* JADX INFO: renamed from: a */
    public int m11561a() {
        return this.f10456b.length;
    }

    /* JADX INFO: renamed from: b */
    public String m11562b() {
        return this.f10455a;
    }

    public int hashCode() {
        return this.f10455a.hashCode() + this.f10456b.length;
    }

    public String toString() {
        return this.f10455a + "(" + this.f10456b.length + "-args)";
    }

    public C6417n(String str, Class<?>[] clsArr) {
        this.f10455a = str;
        this.f10456b = clsArr == null ? f10454c : clsArr;
    }
}
