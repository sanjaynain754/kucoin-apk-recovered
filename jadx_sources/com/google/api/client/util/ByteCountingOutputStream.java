package com.google.api.client.util;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes56.dex */
final class ByteCountingOutputStream extends OutputStream {
    long count;

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i11, int i12) throws IOException {
        this.count += (long) i12;
    }

    @Override // java.io.OutputStream
    public void write(int i11) throws IOException {
        this.count++;
    }
}
