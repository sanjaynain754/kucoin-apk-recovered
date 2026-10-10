package com.fasterxml.jackson.core.p062io;

import java.io.CharConversionException;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import okio.Utf8;

/* JADX INFO: renamed from: com.fasterxml.jackson.core.io.j */
/* JADX INFO: compiled from: UTF32Reader.java */
/* JADX INFO: loaded from: classes45.dex */
public class C6316j extends Reader {

    /* JADX INFO: renamed from: b */
    public final C6310d f10113b;

    /* JADX INFO: renamed from: c */
    public InputStream f10114c;

    /* JADX INFO: renamed from: d */
    public byte[] f10115d;

    /* JADX INFO: renamed from: e */
    public int f10116e;

    /* JADX INFO: renamed from: f */
    public int f10117f;

    /* JADX INFO: renamed from: g */
    public final boolean f10118g;

    /* JADX INFO: renamed from: h */
    public char f10119h = 0;

    /* JADX INFO: renamed from: i */
    public int f10120i;

    /* JADX INFO: renamed from: j */
    public int f10121j;

    /* JADX INFO: renamed from: k */
    public final boolean f10122k;

    /* JADX INFO: renamed from: l */
    public char[] f10123l;

    @Override // java.io.Reader
    public int read() throws IOException {
        if (this.f10123l == null) {
            this.f10123l = new char[1];
        }
        if (read(this.f10123l, 0, 1) < 1) {
            return -1;
        }
        return this.f10123l[0];
    }

    /* JADX INFO: renamed from: a */
    public final void m11047a() {
        byte[] bArr = this.f10115d;
        if (bArr != null) {
            this.f10115d = null;
            C6310d c6310d = this.f10113b;
            if (c6310d != null) {
                c6310d.m10991r(bArr);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m11048b(int i11) throws IOException {
        byte[] bArr;
        InputStream inputStream = this.f10114c;
        if (inputStream == null || (bArr = this.f10115d) == null) {
            return false;
        }
        this.f10121j += this.f10117f - i11;
        if (i11 > 0) {
            int i12 = this.f10116e;
            if (i12 > 0) {
                System.arraycopy(bArr, i12, bArr, 0, i11);
                this.f10116e = 0;
            }
            this.f10117f = i11;
        } else {
            this.f10116e = 0;
            int i13 = inputStream.read(bArr);
            if (i13 < 1) {
                this.f10117f = 0;
                if (i13 < 0) {
                    if (this.f10122k) {
                        m11047a();
                    }
                    return false;
                }
                m11051i();
            }
            this.f10117f = i13;
        }
        while (true) {
            int i14 = this.f10117f;
            if (i14 >= 4) {
                return true;
            }
            InputStream inputStream2 = this.f10114c;
            byte[] bArr2 = this.f10115d;
            int i15 = inputStream2.read(bArr2, i14, bArr2.length - i14);
            if (i15 < 1) {
                if (i15 < 0) {
                    if (this.f10122k) {
                        m11047a();
                    }
                    m11052j(this.f10117f, 4);
                }
                m11051i();
            }
            this.f10117f += i15;
        }
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        InputStream inputStream = this.f10114c;
        if (inputStream != null) {
            this.f10114c = null;
            m11047a();
            inputStream.close();
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m11049g(char[] cArr, int i11, int i12) throws IOException {
        throw new ArrayIndexOutOfBoundsException(String.format("read(buf,%d,%d), cbuf[%d]", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(cArr.length)));
    }

    /* JADX INFO: renamed from: h */
    public final void m11050h(int i11, int i12, String str) throws IOException {
        int i13 = (this.f10121j + this.f10116e) - 1;
        throw new CharConversionException("Invalid UTF-32 character 0x" + Integer.toHexString(i11) + str + " at char #" + (this.f10120i + i12) + ", byte #" + i13 + ")");
    }

    /* JADX INFO: renamed from: i */
    public final void m11051i() throws IOException {
        throw new IOException("Strange I/O stream, returned 0 bytes on read");
    }

    /* JADX INFO: renamed from: j */
    public final void m11052j(int i11, int i12) throws IOException {
        int i13 = this.f10121j + i11;
        throw new CharConversionException("Unexpected EOF in the middle of a 4-byte UTF-32 char: got " + i11 + ", needed " + i12 + ", at char #" + this.f10120i + ", byte #" + i13 + ")");
    }

    public C6316j(C6310d c6310d, InputStream inputStream, byte[] bArr, int i11, int i12, boolean z11) {
        this.f10113b = c6310d;
        this.f10114c = inputStream;
        this.f10115d = bArr;
        this.f10116e = i11;
        this.f10117f = i12;
        this.f10118g = z11;
        this.f10122k = inputStream != null;
    }

    @Override // java.io.Reader
    public int read(char[] cArr, int i11, int i12) throws IOException {
        int i13;
        int i14;
        int i15;
        if (this.f10115d == null) {
            return -1;
        }
        if (i12 < 1) {
            return i12;
        }
        if (i11 < 0 || i11 + i12 > cArr.length) {
            m11049g(cArr, i11, i12);
        }
        int i16 = i12 + i11;
        char c11 = this.f10119h;
        if (c11 != 0) {
            i13 = i11 + 1;
            cArr[i11] = c11;
            this.f10119h = (char) 0;
        } else {
            int i17 = this.f10117f - this.f10116e;
            if (i17 < 4 && !m11048b(i17)) {
                if (i17 == 0) {
                    return -1;
                }
                m11052j(this.f10117f - this.f10116e, 4);
            }
            i13 = i11;
        }
        int i18 = this.f10117f - 4;
        while (i13 < i16) {
            int i19 = this.f10116e;
            if (i19 > i18) {
                break;
            }
            if (this.f10118g) {
                byte[] bArr = this.f10115d;
                i14 = (bArr[i19] << 8) | (bArr[i19 + 1] & 255);
                i15 = (bArr[i19 + 3] & 255) | ((bArr[i19 + 2] & 255) << 8);
            } else {
                byte[] bArr2 = this.f10115d;
                int i21 = (bArr2[i19] & 255) | ((bArr2[i19 + 1] & 255) << 8);
                i14 = (bArr2[i19 + 3] << 8) | (bArr2[i19 + 2] & 255);
                i15 = i21;
            }
            this.f10116e = i19 + 4;
            if (i14 != 0) {
                int i22 = 65535 & i14;
                int i23 = i15 | ((i22 - 1) << 16);
                if (i22 > 16) {
                    m11050h(i23, i13 - i11, String.format(" (above 0x%08x)", 1114111));
                }
                int i24 = i13 + 1;
                cArr[i13] = (char) ((i23 >> 10) + 55296);
                int i25 = (i23 & 1023) | Utf8.LOG_SURROGATE_HEADER;
                if (i24 >= i16) {
                    this.f10119h = (char) i23;
                    i13 = i24;
                    break;
                }
                i15 = i25;
                i13 = i24;
            }
            cArr[i13] = (char) i15;
            i13++;
        }
        int i26 = i13 - i11;
        this.f10120i += i26;
        return i26;
    }
}
