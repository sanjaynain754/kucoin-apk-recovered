package com.fasterxml.jackson.databind.util;

/* JADX INFO: renamed from: com.fasterxml.jackson.databind.util.i */
/* JADX INFO: compiled from: LinkedNode.java */
/* JADX INFO: loaded from: classes45.dex */
public final class C6492i<T> {

    /* JADX INFO: renamed from: a */
    public final T f10737a;

    /* JADX INFO: renamed from: b */
    public C6492i<T> f10738b;

    /* JADX INFO: renamed from: a */
    public static <ST> boolean m11974a(C6492i<ST> c6492i, ST st2) {
        while (c6492i != null) {
            if (c6492i.m11977d() == st2) {
                return true;
            }
            c6492i = c6492i.m11976c();
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public void m11975b(C6492i<T> c6492i) {
        if (this.f10738b != null) {
            throw new IllegalStateException();
        }
        this.f10738b = c6492i;
    }

    /* JADX INFO: renamed from: c */
    public C6492i<T> m11976c() {
        return this.f10738b;
    }

    /* JADX INFO: renamed from: d */
    public T m11977d() {
        return this.f10737a;
    }

    public C6492i(T t11, C6492i<T> c6492i) {
        this.f10737a = t11;
        this.f10738b = c6492i;
    }
}
