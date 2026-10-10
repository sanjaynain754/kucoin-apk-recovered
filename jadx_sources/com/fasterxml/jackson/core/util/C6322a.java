package com.fasterxml.jackson.core.util;

import com.tencent.thumbplayer.tcmedia.api.TPErrorCode;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: renamed from: com.fasterxml.jackson.core.util.a */
/* JADX INFO: compiled from: BufferRecycler.java */
/* JADX INFO: loaded from: classes45.dex */
public class C6322a {

    /* JADX INFO: renamed from: c */
    public static final int[] f10148c = {8000, 8000, 2000, 2000};

    /* JADX INFO: renamed from: d */
    public static final int[] f10149d = {TPErrorCode.TP_ERROR_TYPE_DOWNLOAD_PROXY, TPErrorCode.TP_ERROR_TYPE_DOWNLOAD_PROXY, 200, 200};

    /* JADX INFO: renamed from: a */
    public final AtomicReferenceArray<byte[]> f10150a;

    /* JADX INFO: renamed from: b */
    public final AtomicReferenceArray<char[]> f10151b;

    public C6322a() {
        this(4, 4);
    }

    /* JADX INFO: renamed from: a */
    public final byte[] m11056a(int i11) {
        return m11057b(i11, 0);
    }

    /* JADX INFO: renamed from: c */
    public final char[] m11058c(int i11) {
        return m11059d(i11, 0);
    }

    public C6322a(int i11, int i12) {
        this.f10150a = new AtomicReferenceArray<>(i11);
        this.f10151b = new AtomicReferenceArray<>(i12);
    }

    /* JADX INFO: renamed from: e */
    public byte[] m11060e(int i11) {
        return new byte[i11];
    }

    /* JADX INFO: renamed from: f */
    public int m11061f(int i11) {
        return f10148c[i11];
    }

    /* JADX INFO: renamed from: g */
    public char[] m11062g(int i11) {
        return new char[i11];
    }

    /* JADX INFO: renamed from: h */
    public int m11063h(int i11) {
        return f10149d[i11];
    }

    /* JADX INFO: renamed from: i */
    public void m11064i(int i11, byte[] bArr) {
        this.f10150a.set(i11, bArr);
    }

    /* JADX INFO: renamed from: j */
    public void m11065j(int i11, char[] cArr) {
        this.f10151b.set(i11, cArr);
    }

    /* JADX INFO: renamed from: b */
    public byte[] m11057b(int i11, int i12) {
        int iM11061f = m11061f(i11);
        if (i12 < iM11061f) {
            i12 = iM11061f;
        }
        byte[] andSet = this.f10150a.getAndSet(i11, null);
        if (andSet != null && andSet.length >= i12) {
            return andSet;
        }
        return m11060e(i12);
    }

    /* JADX INFO: renamed from: d */
    public char[] m11059d(int i11, int i12) {
        int iM11063h = m11063h(i11);
        if (i12 < iM11063h) {
            i12 = iM11063h;
        }
        char[] andSet = this.f10151b.getAndSet(i11, null);
        if (andSet != null && andSet.length >= i12) {
            return andSet;
        }
        return m11062g(i12);
    }
}
