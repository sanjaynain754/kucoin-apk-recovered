package com.fasterxml.jackson.core.p062io;

import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;
import okio.Utf8;

/* JADX INFO: renamed from: com.fasterxml.jackson.core.io.k */
/* JADX INFO: compiled from: UTF8Writer.java */
/* JADX INFO: loaded from: classes45.dex */
public final class C6317k extends Writer {

    /* JADX INFO: renamed from: b */
    public final C6310d f10124b;

    /* JADX INFO: renamed from: c */
    public OutputStream f10125c;

    /* JADX INFO: renamed from: d */
    public byte[] f10126d;

    /* JADX INFO: renamed from: e */
    public final int f10127e;

    /* JADX INFO: renamed from: f */
    public int f10128f;

    /* JADX INFO: renamed from: g */
    public int f10129g;

    @Override // java.io.Writer
    public void write(char[] cArr) throws IOException {
        write(cArr, 0, cArr.length);
    }

    /* JADX INFO: renamed from: b */
    public static void m11053b(int i11) throws IOException {
        throw new IOException(m11054g(i11));
    }

    /* JADX INFO: renamed from: a */
    public int m11055a(int i11) throws IOException {
        int i12 = this.f10129g;
        this.f10129g = 0;
        if (i11 >= 56320 && i11 <= 57343) {
            return ((i12 - 55296) << 10) + 65536 + (i11 - Utf8.LOG_SURROGATE_HEADER);
        }
        throw new IOException("Broken surrogate pair: first char 0x" + Integer.toHexString(i12) + ", second 0x" + Integer.toHexString(i11) + "; illegal combination");
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(char c11) throws IOException {
        write(c11);
        return this;
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        OutputStream outputStream = this.f10125c;
        if (outputStream != null) {
            int i11 = this.f10128f;
            if (i11 > 0) {
                outputStream.write(this.f10126d, 0, i11);
                this.f10128f = 0;
            }
            OutputStream outputStream2 = this.f10125c;
            this.f10125c = null;
            byte[] bArr = this.f10126d;
            if (bArr != null) {
                this.f10126d = null;
                this.f10124b.m10993t(bArr);
            }
            outputStream2.close();
            int i12 = this.f10129g;
            this.f10129g = 0;
            if (i12 > 0) {
                m11053b(i12);
            }
        }
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() throws IOException {
        OutputStream outputStream = this.f10125c;
        if (outputStream != null) {
            int i11 = this.f10128f;
            if (i11 > 0) {
                outputStream.write(this.f10126d, 0, i11);
                this.f10128f = 0;
            }
            this.f10125c.flush();
        }
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i11, int i12) throws IOException {
        if (i12 < 2) {
            if (i12 == 1) {
                write(cArr[i11]);
                return;
            }
            return;
        }
        if (this.f10129g > 0) {
            i12--;
            write(m11055a(cArr[i11]));
            i11++;
        }
        int i13 = this.f10128f;
        byte[] bArr = this.f10126d;
        int i14 = this.f10127e;
        int i15 = i12 + i11;
        while (i11 < i15) {
            if (i13 >= i14) {
                this.f10125c.write(bArr, 0, i13);
                i13 = 0;
            }
            int i16 = i11 + 1;
            char c11 = cArr[i11];
            if (c11 < 128) {
                int i17 = i13 + 1;
                bArr[i13] = (byte) c11;
                int i18 = i15 - i16;
                int i19 = i14 - i17;
                if (i18 > i19) {
                    i18 = i19;
                }
                int i21 = i18 + i16;
                while (true) {
                    i11 = i16;
                    i13 = i17;
                    if (i11 >= i21) {
                        continue;
                    } else {
                        i16 = i11 + 1;
                        c11 = cArr[i11];
                        if (c11 < 128) {
                            i17 = i13 + 1;
                            bArr[i13] = (byte) c11;
                        }
                    }
                }
            }
            if (c11 < 2048) {
                int i22 = i13 + 1;
                bArr[i13] = (byte) ((c11 >> 6) | 192);
                i13 += 2;
                bArr[i22] = (byte) ((c11 & '?') | 128);
            } else if (c11 < 55296 || c11 > 57343) {
                bArr[i13] = (byte) ((c11 >> '\f') | 224);
                int i23 = i13 + 2;
                bArr[i13 + 1] = (byte) (((c11 >> 6) & 63) | 128);
                i13 += 3;
                bArr[i23] = (byte) ((c11 & '?') | 128);
            } else {
                if (c11 > 56319) {
                    this.f10128f = i13;
                    m11053b(c11);
                }
                this.f10129g = c11;
                if (i16 >= i15) {
                    break;
                }
                i11 = i16 + 1;
                int iM11055a = m11055a(cArr[i16]);
                if (iM11055a > 1114111) {
                    this.f10128f = i13;
                    m11053b(iM11055a);
                }
                bArr[i13] = (byte) ((iM11055a >> 18) | 240);
                bArr[i13 + 1] = (byte) (((iM11055a >> 12) & 63) | 128);
                int i24 = i13 + 3;
                bArr[i13 + 2] = (byte) (((iM11055a >> 6) & 63) | 128);
                i13 += 4;
                bArr[i24] = (byte) ((iM11055a & 63) | 128);
            }
            i11 = i16;
        }
        this.f10128f = i13;
    }

    public C6317k(C6310d c6310d, OutputStream outputStream) {
        this.f10124b = c6310d;
        this.f10125c = outputStream;
        byte[] bArrM10983j = c6310d.m10983j();
        this.f10126d = bArrM10983j;
        this.f10127e = bArrM10983j.length - 4;
        this.f10128f = 0;
    }

    /* JADX INFO: renamed from: g */
    public static String m11054g(int i11) {
        if (i11 > 1114111) {
            return "Illegal character point (0x" + Integer.toHexString(i11) + ") to output; max is 0x10FFFF as per RFC 4627";
        }
        if (i11 >= 55296) {
            if (i11 <= 56319) {
                return "Unmatched first part of surrogate pair (0x" + Integer.toHexString(i11) + ")";
            }
            return "Unmatched second part of surrogate pair (0x" + Integer.toHexString(i11) + ")";
        }
        return "Illegal character point (0x" + Integer.toHexString(i11) + ") to output";
    }

    @Override // java.io.Writer
    public void write(int i11) throws IOException {
        int i12;
        if (this.f10129g > 0) {
            i11 = m11055a(i11);
        } else if (i11 >= 55296 && i11 <= 57343) {
            if (i11 > 56319) {
                m11053b(i11);
            }
            this.f10129g = i11;
            return;
        }
        int i13 = this.f10128f;
        if (i13 >= this.f10127e) {
            this.f10125c.write(this.f10126d, 0, i13);
            this.f10128f = 0;
        }
        if (i11 < 128) {
            byte[] bArr = this.f10126d;
            int i14 = this.f10128f;
            this.f10128f = i14 + 1;
            bArr[i14] = (byte) i11;
            return;
        }
        int i15 = this.f10128f;
        if (i11 < 2048) {
            byte[] bArr2 = this.f10126d;
            int i16 = i15 + 1;
            bArr2[i15] = (byte) ((i11 >> 6) | 192);
            i12 = i15 + 2;
            bArr2[i16] = (byte) ((i11 & 63) | 128);
        } else if (i11 <= 65535) {
            byte[] bArr3 = this.f10126d;
            bArr3[i15] = (byte) ((i11 >> 12) | 224);
            int i17 = i15 + 2;
            bArr3[i15 + 1] = (byte) (((i11 >> 6) & 63) | 128);
            i12 = i15 + 3;
            bArr3[i17] = (byte) ((i11 & 63) | 128);
        } else {
            if (i11 > 1114111) {
                m11053b(i11);
            }
            byte[] bArr4 = this.f10126d;
            bArr4[i15] = (byte) ((i11 >> 18) | 240);
            bArr4[i15 + 1] = (byte) (((i11 >> 12) & 63) | 128);
            int i18 = i15 + 3;
            bArr4[i15 + 2] = (byte) (((i11 >> 6) & 63) | 128);
            i12 = i15 + 4;
            bArr4[i18] = (byte) ((i11 & 63) | 128);
        }
        this.f10128f = i12;
    }

    @Override // java.io.Writer
    public void write(String str) throws IOException {
        write(str, 0, str.length());
    }

    @Override // java.io.Writer
    public void write(String str, int i11, int i12) throws IOException {
        if (i12 < 2) {
            if (i12 == 1) {
                write(str.charAt(i11));
                return;
            }
            return;
        }
        if (this.f10129g > 0) {
            i12--;
            write(m11055a(str.charAt(i11)));
            i11++;
        }
        int i13 = this.f10128f;
        byte[] bArr = this.f10126d;
        int i14 = this.f10127e;
        int i15 = i12 + i11;
        while (i11 < i15) {
            if (i13 >= i14) {
                this.f10125c.write(bArr, 0, i13);
                i13 = 0;
            }
            int i16 = i11 + 1;
            char cCharAt = str.charAt(i11);
            if (cCharAt < 128) {
                int i17 = i13 + 1;
                bArr[i13] = (byte) cCharAt;
                int i18 = i15 - i16;
                int i19 = i14 - i17;
                if (i18 > i19) {
                    i18 = i19;
                }
                int i21 = i18 + i16;
                while (true) {
                    i11 = i16;
                    i13 = i17;
                    if (i11 >= i21) {
                        continue;
                    } else {
                        i16 = i11 + 1;
                        cCharAt = str.charAt(i11);
                        if (cCharAt < 128) {
                            i17 = i13 + 1;
                            bArr[i13] = (byte) cCharAt;
                        }
                    }
                }
            }
            if (cCharAt < 2048) {
                int i22 = i13 + 1;
                bArr[i13] = (byte) ((cCharAt >> 6) | 192);
                i13 += 2;
                bArr[i22] = (byte) ((cCharAt & '?') | 128);
            } else if (cCharAt >= 55296 && cCharAt <= 57343) {
                if (cCharAt > 56319) {
                    this.f10128f = i13;
                    m11053b(cCharAt);
                }
                this.f10129g = cCharAt;
                if (i16 >= i15) {
                    break;
                }
                i11 = i16 + 1;
                int iM11055a = m11055a(str.charAt(i16));
                if (iM11055a > 1114111) {
                    this.f10128f = i13;
                    m11053b(iM11055a);
                }
                bArr[i13] = (byte) ((iM11055a >> 18) | 240);
                bArr[i13 + 1] = (byte) (((iM11055a >> 12) & 63) | 128);
                int i23 = i13 + 3;
                bArr[i13 + 2] = (byte) (((iM11055a >> 6) & 63) | 128);
                i13 += 4;
                bArr[i23] = (byte) ((iM11055a & 63) | 128);
            } else {
                bArr[i13] = (byte) ((cCharAt >> '\f') | 224);
                int i24 = i13 + 2;
                bArr[i13 + 1] = (byte) (((cCharAt >> 6) & 63) | 128);
                i13 += 3;
                bArr[i24] = (byte) ((cCharAt & '?') | 128);
            }
            i11 = i16;
        }
        this.f10128f = i13;
    }
}
