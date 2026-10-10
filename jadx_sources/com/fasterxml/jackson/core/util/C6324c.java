package com.fasterxml.jackson.core.util;

import java.io.OutputStream;
import java.util.LinkedList;

/* JADX INFO: renamed from: com.fasterxml.jackson.core.util.c */
/* JADX INFO: compiled from: ByteArrayBuilder.java */
/* JADX INFO: loaded from: classes45.dex */
public final class C6324c extends OutputStream {

    /* JADX INFO: renamed from: g */
    public static final byte[] f10154g = new byte[0];

    /* JADX INFO: renamed from: b */
    public final C6322a f10155b;

    /* JADX INFO: renamed from: c */
    public final LinkedList<byte[]> f10156c;

    /* JADX INFO: renamed from: d */
    public int f10157d;

    /* JADX INFO: renamed from: e */
    public byte[] f10158e;

    /* JADX INFO: renamed from: f */
    public int f10159f;

    public C6324c() {
        this((C6322a) null);
    }

    /* JADX INFO: renamed from: n */
    public void m11076n() {
        this.f10157d = 0;
        this.f10159f = 0;
        if (this.f10156c.isEmpty()) {
            return;
        }
        this.f10156c.clear();
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    public C6324c(C6322a c6322a) {
        this(c6322a, 500);
    }

    /* JADX INFO: renamed from: k */
    public static C6324c m11067k(byte[] bArr, int i11) {
        return new C6324c(null, bArr, i11);
    }

    /* JADX INFO: renamed from: a */
    public final void m11068a() {
        int length = this.f10157d + this.f10158e.length;
        if (length < 0) {
            throw new IllegalStateException("Maximum Java array size (2GB) exceeded by `ByteArrayBuilder`");
        }
        this.f10157d = length;
        int iMax = Math.max(length >> 1, 1000);
        if (iMax > 131072) {
            iMax = 131072;
        }
        this.f10156c.add(this.f10158e);
        this.f10158e = new byte[iMax];
        this.f10159f = 0;
    }

    /* JADX INFO: renamed from: b */
    public void m11069b(int i11) {
        if (this.f10159f >= this.f10158e.length) {
            m11068a();
        }
        byte[] bArr = this.f10158e;
        int i12 = this.f10159f;
        this.f10159f = i12 + 1;
        bArr[i12] = (byte) i11;
    }

    /* JADX INFO: renamed from: g */
    public void m11070g(int i11) {
        int i12 = this.f10159f;
        int i13 = i12 + 2;
        byte[] bArr = this.f10158e;
        if (i13 >= bArr.length) {
            m11069b(i11 >> 16);
            m11069b(i11 >> 8);
            m11069b(i11);
            return;
        }
        int i14 = i12 + 1;
        this.f10159f = i14;
        bArr[i12] = (byte) (i11 >> 16);
        int i15 = i12 + 2;
        this.f10159f = i15;
        bArr[i14] = (byte) (i11 >> 8);
        this.f10159f = i12 + 3;
        bArr[i15] = (byte) i11;
    }

    /* JADX INFO: renamed from: h */
    public void m11071h(int i11) {
        int i12 = this.f10159f;
        int i13 = i12 + 1;
        byte[] bArr = this.f10158e;
        if (i13 >= bArr.length) {
            m11069b(i11 >> 8);
            m11069b(i11);
            return;
        }
        int i14 = i12 + 1;
        this.f10159f = i14;
        bArr[i12] = (byte) (i11 >> 8);
        this.f10159f = i12 + 2;
        bArr[i14] = (byte) i11;
    }

    /* JADX INFO: renamed from: i */
    public byte[] m11072i(int i11) {
        this.f10159f = i11;
        return m11079q();
    }

    /* JADX INFO: renamed from: l */
    public byte[] m11074l() {
        return this.f10158e;
    }

    /* JADX INFO: renamed from: m */
    public int m11075m() {
        return this.f10159f;
    }

    /* JADX INFO: renamed from: p */
    public void m11078p(int i11) {
        this.f10159f = i11;
    }

    /* JADX INFO: renamed from: q */
    public byte[] m11079q() {
        int i11 = this.f10157d + this.f10159f;
        if (i11 == 0) {
            return f10154g;
        }
        byte[] bArr = new byte[i11];
        int i12 = 0;
        for (byte[] bArr2 : this.f10156c) {
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i12, length);
            i12 += length;
        }
        System.arraycopy(this.f10158e, 0, bArr, i12, this.f10159f);
        int i13 = i12 + this.f10159f;
        if (i13 == i11) {
            if (!this.f10156c.isEmpty()) {
                m11076n();
            }
            return bArr;
        }
        throw new RuntimeException("Internal error: total len assumed to be " + i11 + ", copied " + i13 + " bytes");
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i11, int i12) {
        while (true) {
            int iMin = Math.min(this.f10158e.length - this.f10159f, i12);
            if (iMin > 0) {
                System.arraycopy(bArr, i11, this.f10158e, this.f10159f, iMin);
                i11 += iMin;
                this.f10159f += iMin;
                i12 -= iMin;
            }
            if (i12 <= 0) {
                return;
            } else {
                m11068a();
            }
        }
    }

    public C6324c(int i11) {
        this(null, i11);
    }

    /* JADX INFO: renamed from: j */
    public byte[] m11073j() {
        m11068a();
        return this.f10158e;
    }

    /* JADX INFO: renamed from: o */
    public byte[] m11077o() {
        m11076n();
        return this.f10158e;
    }

    public void release() {
        byte[] bArr;
        m11076n();
        C6322a c6322a = this.f10155b;
        if (c6322a != null && (bArr = this.f10158e) != null) {
            c6322a.m11064i(2, bArr);
            this.f10158e = null;
        }
    }

    public C6324c(C6322a c6322a, int i11) {
        this.f10156c = new LinkedList<>();
        this.f10155b = c6322a;
        this.f10158e = c6322a == null ? new byte[i11 > 131072 ? 131072 : i11] : c6322a.m11056a(2);
    }

    @Override // java.io.OutputStream
    public void write(int i11) {
        m11069b(i11);
    }

    public C6324c(C6322a c6322a, byte[] bArr, int i11) {
        this.f10156c = new LinkedList<>();
        this.f10155b = null;
        this.f10158e = bArr;
        this.f10159f = i11;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() {
    }
}
