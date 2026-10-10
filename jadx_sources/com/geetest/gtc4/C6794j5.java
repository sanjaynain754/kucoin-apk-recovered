package com.geetest.gtc4;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: com.geetest.gtc4.j5 */
/* JADX INFO: loaded from: classes45.dex */
public final class C6794j5 extends AbstractC6839o5 {

    /* JADX INFO: renamed from: c */
    public int f11409c;

    /* JADX INFO: renamed from: d */
    public int f11410d;

    /* JADX INFO: renamed from: e */
    public boolean f11411e;

    /* JADX INFO: renamed from: f */
    public boolean f11412f;

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i11, int i12) throws IOException {
        if (this.f11412f || i12 < 3) {
            return super.read(bArr, i11, i12);
        }
        if (this.f11411e) {
            return -1;
        }
        int i13 = this.f11450a.read(bArr, i11 + 2, i12 - 2);
        if (i13 < 0) {
            throw new EOFException();
        }
        bArr[i11] = (byte) this.f11409c;
        bArr[i11 + 1] = (byte) this.f11410d;
        this.f11409c = this.f11450a.read();
        int i14 = this.f11450a.read();
        this.f11410d = i14;
        if (i14 >= 0) {
            return i13 + 2;
        }
        throw new EOFException();
    }

    /* JADX INFO: renamed from: b */
    public final boolean m12663b() {
        if (!this.f11411e && this.f11412f && this.f11409c == 0 && this.f11410d == 0) {
            this.f11411e = true;
            m12689a();
        }
        return this.f11411e;
    }

    public C6794j5(InputStream inputStream, int i11) throws IOException {
        super(inputStream, i11);
        this.f11411e = false;
        this.f11412f = true;
        this.f11409c = inputStream.read();
        int i12 = inputStream.read();
        this.f11410d = i12;
        if (i12 >= 0) {
            m12663b();
            return;
        }
        throw new EOFException();
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        if (m12663b()) {
            return -1;
        }
        int i11 = this.f11450a.read();
        if (i11 >= 0) {
            int i12 = this.f11409c;
            this.f11409c = this.f11410d;
            this.f11410d = i11;
            return i12;
        }
        throw new EOFException();
    }
}
