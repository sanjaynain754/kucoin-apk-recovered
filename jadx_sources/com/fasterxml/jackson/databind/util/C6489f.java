package com.fasterxml.jackson.databind.util;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: com.fasterxml.jackson.databind.util.f */
/* JADX INFO: compiled from: ByteBufferBackedOutputStream.java */
/* JADX INFO: loaded from: classes45.dex */
public class C6489f extends OutputStream {

    /* JADX INFO: renamed from: b */
    public final ByteBuffer f10723b;

    @Override // java.io.OutputStream
    public void write(int i11) throws IOException {
        this.f10723b.put((byte) i11);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i11, int i12) throws IOException {
        this.f10723b.put(bArr, i11, i12);
    }

    public C6489f(ByteBuffer byteBuffer) {
        this.f10723b = byteBuffer;
    }
}
