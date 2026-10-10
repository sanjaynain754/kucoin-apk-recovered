package com.facebook.react.modules.network;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes45.dex */
class CountingOutputStream extends FilterOutputStream {
    private long mCount;

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i11, int i12) throws IOException {
        ((FilterOutputStream) this).out.write(bArr, i11, i12);
        this.mCount += (long) i12;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        ((FilterOutputStream) this).out.close();
    }

    public long getCount() {
        return this.mCount;
    }

    public CountingOutputStream(OutputStream outputStream) {
        super(outputStream);
        this.mCount = 0L;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i11) throws IOException {
        ((FilterOutputStream) this).out.write(i11);
        this.mCount++;
    }
}
