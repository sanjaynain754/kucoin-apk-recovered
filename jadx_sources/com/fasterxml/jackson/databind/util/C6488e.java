package com.fasterxml.jackson.databind.util;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: com.fasterxml.jackson.databind.util.e */
/* JADX INFO: compiled from: ByteBufferBackedInputStream.java */
/* JADX INFO: loaded from: classes45.dex */
public class C6488e extends InputStream {

    /* JADX INFO: renamed from: b */
    public final ByteBuffer f10722b;

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (this.f10722b.hasRemaining()) {
            return this.f10722b.get() & 255;
        }
        return -1;
    }

    @Override // java.io.InputStream
    public int available() {
        return this.f10722b.remaining();
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i11, int i12) throws IOException {
        if (!this.f10722b.hasRemaining()) {
            return -1;
        }
        int iMin = Math.min(i12, this.f10722b.remaining());
        this.f10722b.get(bArr, i11, iMin);
        return iMin;
    }

    public C6488e(ByteBuffer byteBuffer) {
        this.f10722b = byteBuffer;
    }
}
