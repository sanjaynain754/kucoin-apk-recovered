package com.fasterxml.jackson.core.p062io;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: com.fasterxml.jackson.core.io.f */
/* JADX INFO: compiled from: MergedStream.java */
/* JADX INFO: loaded from: classes45.dex */
public final class C6312f extends InputStream {

    /* JADX INFO: renamed from: b */
    public final C6310d f10095b;

    /* JADX INFO: renamed from: c */
    public final InputStream f10096c;

    /* JADX INFO: renamed from: d */
    public byte[] f10097d;

    /* JADX INFO: renamed from: e */
    public int f10098e;

    /* JADX INFO: renamed from: f */
    public final int f10099f;

    @Override // java.io.InputStream
    public synchronized void mark(int i11) {
        if (this.f10097d == null) {
            this.f10096c.mark(i11);
        }
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        byte[] bArr = this.f10097d;
        if (bArr == null) {
            return this.f10096c.read();
        }
        int i11 = this.f10098e;
        int i12 = i11 + 1;
        this.f10098e = i12;
        int i13 = bArr[i11] & 255;
        if (i12 >= this.f10099f) {
            m11008a();
        }
        return i13;
    }

    @Override // java.io.InputStream
    public synchronized void reset() throws IOException {
        if (this.f10097d == null) {
            this.f10096c.reset();
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m11008a() {
        byte[] bArr = this.f10097d;
        if (bArr != null) {
            this.f10097d = null;
            C6310d c6310d = this.f10095b;
            if (c6310d != null) {
                c6310d.m10991r(bArr);
            }
        }
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        return this.f10097d != null ? this.f10099f - this.f10098e : this.f10096c.available();
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.f10097d == null && this.f10096c.markSupported();
    }

    @Override // java.io.InputStream
    public long skip(long j11) throws IOException {
        long j12;
        if (this.f10097d != null) {
            int i11 = this.f10099f;
            int i12 = this.f10098e;
            j12 = i11 - i12;
            if (j12 > j11) {
                this.f10098e = i12 + ((int) j11);
                return j11;
            }
            m11008a();
            j11 -= j12;
        } else {
            j12 = 0;
        }
        return j11 > 0 ? j12 + this.f10096c.skip(j11) : j12;
    }

    public C6312f(C6310d c6310d, InputStream inputStream, byte[] bArr, int i11, int i12) {
        this.f10095b = c6310d;
        this.f10096c = inputStream;
        this.f10097d = bArr;
        this.f10098e = i11;
        this.f10099f = i12;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        m11008a();
        this.f10096c.close();
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i11, int i12) throws IOException {
        byte[] bArr2 = this.f10097d;
        if (bArr2 != null) {
            int i13 = this.f10099f;
            int i14 = this.f10098e;
            int i15 = i13 - i14;
            if (i12 > i15) {
                i12 = i15;
            }
            System.arraycopy(bArr2, i14, bArr, i11, i12);
            int i16 = this.f10098e + i12;
            this.f10098e = i16;
            if (i16 >= this.f10099f) {
                m11008a();
            }
            return i12;
        }
        return this.f10096c.read(bArr, i11, i12);
    }
}
