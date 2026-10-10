package com.google.common.p069io;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Preconditions;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes56.dex */
@ElementTypesAreNonnullByDefault
@J2ktIncompatible
@GwtIncompatible
public final class CountingInputStream extends FilterInputStream {
    private long count;
    private long mark;

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i11) {
        ((FilterInputStream) this).in.mark(i11);
        this.mark = this.count;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        int i11 = ((FilterInputStream) this).in.read();
        if (i11 != -1) {
            this.count++;
        }
        return i11;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() throws IOException {
        if (!((FilterInputStream) this).in.markSupported()) {
            throw new IOException("Mark not supported");
        }
        if (this.mark == -1) {
            throw new IOException("Mark not set");
        }
        ((FilterInputStream) this).in.reset();
        this.count = this.mark;
    }

    public long getCount() {
        return this.count;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j11) throws IOException {
        long jSkip = ((FilterInputStream) this).in.skip(j11);
        this.count += jSkip;
        return jSkip;
    }

    public CountingInputStream(InputStream inputStream) {
        super((InputStream) Preconditions.checkNotNull(inputStream));
        this.mark = -1L;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i11, int i12) throws IOException {
        int i13 = ((FilterInputStream) this).in.read(bArr, i11, i12);
        if (i13 != -1) {
            this.count += (long) i13;
        }
        return i13;
    }
}
