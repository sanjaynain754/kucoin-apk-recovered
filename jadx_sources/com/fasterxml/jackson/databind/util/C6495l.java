package com.fasterxml.jackson.databind.util;

import java.lang.reflect.Array;
import java.util.List;

/* JADX INFO: renamed from: com.fasterxml.jackson.databind.util.l */
/* JADX INFO: compiled from: ObjectBuffer.java */
/* JADX INFO: loaded from: classes45.dex */
public final class C6495l {

    /* JADX INFO: renamed from: a */
    public C6492i<Object[]> f10739a;

    /* JADX INFO: renamed from: b */
    public C6492i<Object[]> f10740b;

    /* JADX INFO: renamed from: c */
    public int f10741c;

    /* JADX INFO: renamed from: d */
    public Object[] f10742d;

    /* JADX INFO: renamed from: a */
    public final void m11978a(Object obj, int i11, Object[] objArr, int i12) {
        int i13 = 0;
        for (C6492i<Object[]> c6492iM11976c = this.f10739a; c6492iM11976c != null; c6492iM11976c = c6492iM11976c.m11976c()) {
            Object[] objArrM11977d = c6492iM11976c.m11977d();
            int length = objArrM11977d.length;
            System.arraycopy(objArrM11977d, 0, obj, i13, length);
            i13 += length;
        }
        System.arraycopy(objArr, 0, obj, i13, i12);
        int i14 = i13 + i12;
        if (i14 == i11) {
            return;
        }
        throw new IllegalStateException("Should have gotten " + i11 + " entries, got " + i14);
    }

    /* JADX INFO: renamed from: b */
    public void m11979b() {
        C6492i<Object[]> c6492i = this.f10740b;
        if (c6492i != null) {
            this.f10742d = c6492i.m11977d();
        }
        this.f10740b = null;
        this.f10739a = null;
        this.f10741c = 0;
    }

    /* JADX INFO: renamed from: c */
    public Object[] m11980c(Object[] objArr) {
        C6492i<Object[]> c6492i = new C6492i<>(objArr, null);
        if (this.f10739a == null) {
            this.f10740b = c6492i;
            this.f10739a = c6492i;
        } else {
            this.f10740b.m11975b(c6492i);
            this.f10740b = c6492i;
        }
        int length = objArr.length;
        this.f10741c += length;
        if (length < 16384) {
            length += length;
        } else if (length < 262144) {
            length += length >> 2;
        }
        return new Object[length];
    }

    /* JADX INFO: renamed from: d */
    public int m11981d() {
        return this.f10741c;
    }

    /* JADX INFO: renamed from: e */
    public void m11982e(Object[] objArr, int i11, List<Object> list) {
        int i12;
        C6492i<Object[]> c6492iM11976c = this.f10739a;
        while (true) {
            i12 = 0;
            if (c6492iM11976c == null) {
                break;
            }
            Object[] objArrM11977d = c6492iM11976c.m11977d();
            int length = objArrM11977d.length;
            while (i12 < length) {
                list.add(objArrM11977d[i12]);
                i12++;
            }
            c6492iM11976c = c6492iM11976c.m11976c();
        }
        while (i12 < i11) {
            list.add(objArr[i12]);
            i12++;
        }
        m11979b();
    }

    /* JADX INFO: renamed from: f */
    public Object[] m11983f(Object[] objArr, int i11) {
        int i12 = this.f10741c + i11;
        Object[] objArr2 = new Object[i12];
        m11978a(objArr2, i12, objArr, i11);
        m11979b();
        return objArr2;
    }

    /* JADX INFO: renamed from: g */
    public <T> T[] m11984g(Object[] objArr, int i11, Class<T> cls) {
        int i12 = this.f10741c + i11;
        T[] tArr = (T[]) ((Object[]) Array.newInstance((Class<?>) cls, i12));
        m11978a(tArr, i12, objArr, i11);
        m11979b();
        return tArr;
    }

    /* JADX INFO: renamed from: h */
    public int m11985h() {
        Object[] objArr = this.f10742d;
        if (objArr == null) {
            return 0;
        }
        return objArr.length;
    }

    /* JADX INFO: renamed from: i */
    public Object[] m11986i() {
        m11979b();
        Object[] objArr = this.f10742d;
        if (objArr == null) {
            Object[] objArr2 = new Object[12];
            this.f10742d = objArr2;
            return objArr2;
        }
        return objArr;
    }

    /* JADX INFO: renamed from: j */
    public Object[] m11987j(Object[] objArr, int i11) {
        m11979b();
        Object[] objArr2 = this.f10742d;
        if (objArr2 == null || objArr2.length < i11) {
            this.f10742d = new Object[Math.max(12, i11)];
        }
        System.arraycopy(objArr, 0, this.f10742d, 0, i11);
        return this.f10742d;
    }
}
