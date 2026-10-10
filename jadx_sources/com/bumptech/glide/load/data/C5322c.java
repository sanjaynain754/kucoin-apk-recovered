package com.bumptech.glide.load.data;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import java.io.IOException;
import java.io.OutputStream;
import p710w1.InterfaceC45684b;

/* JADX INFO: renamed from: com.bumptech.glide.load.data.c */
/* JADX INFO: compiled from: BufferedOutputStream.java */
/* JADX INFO: loaded from: classes34.dex */
public final class C5322c extends OutputStream {

    /* JADX INFO: renamed from: b */
    @NonNull
    public final OutputStream f6749b;

    /* JADX INFO: renamed from: c */
    public byte[] f6750c;

    /* JADX INFO: renamed from: d */
    public InterfaceC45684b f6751d;

    /* JADX INFO: renamed from: e */
    public int f6752e;

    public C5322c(@NonNull OutputStream outputStream, @NonNull InterfaceC45684b interfaceC45684b) {
        this(outputStream, interfaceC45684b, 65536);
    }

    @Override // java.io.OutputStream
    public void write(int i11) throws IOException {
        byte[] bArr = this.f6750c;
        int i12 = this.f6752e;
        this.f6752e = i12 + 1;
        bArr[i12] = (byte) i11;
        m6673b();
    }

    @VisibleForTesting
    public C5322c(@NonNull OutputStream outputStream, InterfaceC45684b interfaceC45684b, int i11) {
        this.f6749b = outputStream;
        this.f6751d = interfaceC45684b;
        this.f6750c = (byte[]) interfaceC45684b.mo100806d(i11, byte[].class);
    }

    /* JADX INFO: renamed from: a */
    public final void m6672a() throws IOException {
        int i11 = this.f6752e;
        if (i11 > 0) {
            this.f6749b.write(this.f6750c, 0, i11);
            this.f6752e = 0;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m6673b() throws IOException {
        if (this.f6752e == this.f6750c.length) {
            m6672a();
        }
    }

    public final void release() {
        byte[] bArr = this.f6750c;
        if (bArr != null) {
            this.f6751d.put(bArr);
            this.f6750c = null;
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            flush();
            this.f6749b.close();
            release();
        } catch (Throwable th2) {
            this.f6749b.close();
            throw th2;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        m6672a();
        this.f6749b.flush();
    }

    @Override // java.io.OutputStream
    public void write(@NonNull byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(@NonNull byte[] bArr, int i11, int i12) throws IOException {
        int i13 = 0;
        do {
            int i14 = i12 - i13;
            int i15 = i11 + i13;
            int i16 = this.f6752e;
            if (i16 == 0 && i14 >= this.f6750c.length) {
                this.f6749b.write(bArr, i15, i14);
                return;
            }
            int iMin = Math.min(i14, this.f6750c.length - i16);
            System.arraycopy(bArr, i15, this.f6750c, this.f6752e, iMin);
            this.f6752e += iMin;
            i13 += iMin;
            m6673b();
        } while (i13 < i12);
    }
}
