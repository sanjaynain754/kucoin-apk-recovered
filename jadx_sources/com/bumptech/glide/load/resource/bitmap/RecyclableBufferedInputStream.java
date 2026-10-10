package com.bumptech.glide.load.resource.bitmap;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import p710w1.InterfaceC45684b;

/* JADX INFO: loaded from: classes.dex */
public class RecyclableBufferedInputStream extends FilterInputStream {

    /* JADX INFO: renamed from: b */
    public volatile byte[] f6970b;

    /* JADX INFO: renamed from: c */
    public int f6971c;

    /* JADX INFO: renamed from: d */
    public int f6972d;

    /* JADX INFO: renamed from: e */
    public int f6973e;

    /* JADX INFO: renamed from: f */
    public int f6974f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC45684b f6975g;

    public RecyclableBufferedInputStream(@NonNull InputStream inputStream, @NonNull InterfaceC45684b interfaceC45684b) {
        this(inputStream, interfaceC45684b, 65536);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() throws IOException {
        InputStream inputStream;
        inputStream = ((FilterInputStream) this).in;
        if (this.f6970b == null || inputStream == null) {
            throw m6851g();
        }
        return (this.f6971c - this.f6974f) + inputStream.available();
    }

    /* JADX INFO: renamed from: b */
    public synchronized void m6853b() {
        this.f6972d = this.f6970b.length;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i11) {
        this.f6972d = Math.max(this.f6972d, i11);
        this.f6973e = this.f6974f;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() throws IOException {
        byte[] bArr = this.f6970b;
        InputStream inputStream = ((FilterInputStream) this).in;
        if (bArr == null || inputStream == null) {
            throw m6851g();
        }
        if (this.f6974f >= this.f6971c && m6852a(inputStream, bArr) == -1) {
            return -1;
        }
        if (bArr != this.f6970b && (bArr = this.f6970b) == null) {
            throw m6851g();
        }
        int i11 = this.f6971c;
        int i12 = this.f6974f;
        if (i11 - i12 <= 0) {
            return -1;
        }
        this.f6974f = i12 + 1;
        return bArr[i12] & 255;
    }

    public synchronized void release() {
        if (this.f6970b != null) {
            this.f6975g.put(this.f6970b);
            this.f6970b = null;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() throws IOException {
        if (this.f6970b == null) {
            throw new IOException("Stream is closed");
        }
        int i11 = this.f6973e;
        if (-1 == i11) {
            throw new InvalidMarkException("Mark has been invalidated, pos: " + this.f6974f + " markLimit: " + this.f6972d);
        }
        this.f6974f = i11;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized long skip(long j11) throws IOException {
        if (j11 < 1) {
            return 0L;
        }
        byte[] bArr = this.f6970b;
        if (bArr == null) {
            throw m6851g();
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream == null) {
            throw m6851g();
        }
        int i11 = this.f6971c;
        int i12 = this.f6974f;
        if (i11 - i12 >= j11) {
            this.f6974f = (int) (((long) i12) + j11);
            return j11;
        }
        long j12 = ((long) i11) - ((long) i12);
        this.f6974f = i11;
        if (this.f6973e == -1 || j11 > this.f6972d) {
            long jSkip = inputStream.skip(j11 - j12);
            if (jSkip > 0) {
                this.f6973e = -1;
            }
            return j12 + jSkip;
        }
        if (m6852a(inputStream, bArr) == -1) {
            return j12;
        }
        int i13 = this.f6971c;
        int i14 = this.f6974f;
        if (i13 - i14 >= j11 - j12) {
            this.f6974f = (int) ((((long) i14) + j11) - j12);
            return j11;
        }
        long j13 = (j12 + ((long) i13)) - ((long) i14);
        this.f6974f = i13;
        return j13;
    }

    /* JADX INFO: loaded from: classes34.dex */
    public static class InvalidMarkException extends IOException {
        private static final long serialVersionUID = -4338378848813561757L;

        public InvalidMarkException(String str) {
            super(str);
        }
    }

    @VisibleForTesting
    public RecyclableBufferedInputStream(@NonNull InputStream inputStream, @NonNull InterfaceC45684b interfaceC45684b, int i11) {
        super(inputStream);
        this.f6973e = -1;
        this.f6975g = interfaceC45684b;
        this.f6970b = (byte[]) interfaceC45684b.mo100806d(i11, byte[].class);
    }

    /* JADX INFO: renamed from: g */
    public static IOException m6851g() throws IOException {
        throw new IOException("BufferedInputStream is closed");
    }

    /* JADX INFO: renamed from: a */
    public final int m6852a(InputStream inputStream, byte[] bArr) throws IOException {
        int i11 = this.f6973e;
        if (i11 != -1) {
            int i12 = this.f6974f - i11;
            int i13 = this.f6972d;
            if (i12 < i13) {
                if (i11 == 0 && i13 > bArr.length && this.f6971c == bArr.length) {
                    int length = bArr.length * 2;
                    if (length <= i13) {
                        i13 = length;
                    }
                    byte[] bArr2 = (byte[]) this.f6975g.mo100806d(i13, byte[].class);
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    this.f6970b = bArr2;
                    this.f6975g.put(bArr);
                    bArr = bArr2;
                } else if (i11 > 0) {
                    System.arraycopy(bArr, i11, bArr, 0, bArr.length - i11);
                }
                int i14 = this.f6974f - this.f6973e;
                this.f6974f = i14;
                this.f6973e = 0;
                this.f6971c = 0;
                int i15 = inputStream.read(bArr, i14, bArr.length - i14);
                int i16 = this.f6974f;
                if (i15 > 0) {
                    i16 += i15;
                }
                this.f6971c = i16;
                return i15;
            }
        }
        int i17 = inputStream.read(bArr);
        if (i17 > 0) {
            this.f6973e = -1;
            this.f6974f = 0;
            this.f6971c = i17;
        }
        return i17;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f6970b != null) {
            this.f6975g.put(this.f6970b);
            this.f6970b = null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        ((FilterInputStream) this).in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(@NonNull byte[] bArr, int i11, int i12) throws IOException {
        int i13;
        int i14;
        byte[] bArr2 = this.f6970b;
        if (bArr2 == null) {
            throw m6851g();
        }
        if (i12 == 0) {
            return 0;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream != null) {
            int i15 = this.f6974f;
            int i16 = this.f6971c;
            if (i15 < i16) {
                int i17 = i16 - i15 >= i12 ? i12 : i16 - i15;
                System.arraycopy(bArr2, i15, bArr, i11, i17);
                this.f6974f += i17;
                if (i17 == i12 || inputStream.available() == 0) {
                    return i17;
                }
                i11 += i17;
                i13 = i12 - i17;
            } else {
                i13 = i12;
            }
            while (true) {
                if (this.f6973e == -1 && i13 >= bArr2.length) {
                    i14 = inputStream.read(bArr, i11, i13);
                    if (i14 == -1) {
                        return i13 != i12 ? i12 - i13 : -1;
                    }
                } else {
                    if (m6852a(inputStream, bArr2) == -1) {
                        return i13 != i12 ? i12 - i13 : -1;
                    }
                    if (bArr2 != this.f6970b && (bArr2 = this.f6970b) == null) {
                        throw m6851g();
                    }
                    int i18 = this.f6971c;
                    int i19 = this.f6974f;
                    i14 = i18 - i19 >= i13 ? i13 : i18 - i19;
                    System.arraycopy(bArr2, i19, bArr, i11, i14);
                    this.f6974f += i14;
                }
                i13 -= i14;
                if (i13 == 0) {
                    return i12;
                }
                if (inputStream.available() == 0) {
                    return i12 - i13;
                }
                i11 += i14;
            }
        } else {
            throw m6851g();
        }
    }
}
