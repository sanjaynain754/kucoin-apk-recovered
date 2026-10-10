package com.geetest.gtc4;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: com.geetest.gtc4.h3 */
/* JADX INFO: loaded from: classes45.dex */
public final class C6774h3 extends AbstractC6839o5 {

    /* JADX INFO: renamed from: e */
    public static final byte[] f11380e = new byte[0];

    /* JADX INFO: renamed from: c */
    public final int f11381c;

    /* JADX INFO: renamed from: d */
    public int f11382d;

    @Override // java.io.InputStream
    public final int read() throws IOException {
        if (this.f11382d == 0) {
            return -1;
        }
        int i11 = this.f11450a.read();
        if (i11 >= 0) {
            int i12 = this.f11382d - 1;
            this.f11382d = i12;
            if (i12 == 0) {
                m12689a();
            }
            return i11;
        }
        throw new EOFException("DEF length " + this.f11381c + " object truncated by " + this.f11382d);
    }

    /* JADX INFO: renamed from: b */
    public final byte[] m12654b() throws IOException {
        int i11 = this.f11382d;
        if (i11 == 0) {
            return f11380e;
        }
        int i12 = this.f11451b;
        if (i11 >= i12) {
            throw new IOException("corrupted stream - out of bounds length found: " + this.f11382d + " >= " + i12);
        }
        byte[] bArr = new byte[i11];
        int iM12675a = i11 - AbstractC6814l7.m12675a(this.f11450a, bArr, i11);
        this.f11382d = iM12675a;
        if (iM12675a == 0) {
            m12689a();
            return bArr;
        }
        throw new EOFException("DEF length " + this.f11381c + " object truncated by " + this.f11382d);
    }

    public C6774h3(InputStream inputStream, int i11, int i12) {
        super(inputStream, i12);
        if (i11 <= 0) {
            if (i11 >= 0) {
                m12689a();
            } else {
                throw new IllegalArgumentException("negative lengths not allowed");
            }
        }
        this.f11381c = i11;
        this.f11382d = i11;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i11, int i12) throws IOException {
        int i13 = this.f11382d;
        if (i13 == 0) {
            return -1;
        }
        int i14 = this.f11450a.read(bArr, i11, Math.min(i12, i13));
        if (i14 >= 0) {
            int i15 = this.f11382d - i14;
            this.f11382d = i15;
            if (i15 == 0) {
                m12689a();
            }
            return i14;
        }
        throw new EOFException("DEF length " + this.f11381c + " object truncated by " + this.f11382d);
    }
}
