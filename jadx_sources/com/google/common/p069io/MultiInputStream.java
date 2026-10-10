package com.google.common.p069io;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Preconditions;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;

/* JADX INFO: loaded from: classes56.dex */
@ElementTypesAreNonnullByDefault
@J2ktIncompatible
@GwtIncompatible
final class MultiInputStream extends InputStream {

    /* JADX INFO: renamed from: in */
    private InputStream f12401in;

    /* JADX INFO: renamed from: it */
    private Iterator<? extends ByteSource> f12402it;

    @Override // java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        while (true) {
            InputStream inputStream = this.f12401in;
            if (inputStream == null) {
                return -1;
            }
            int i11 = inputStream.read();
            if (i11 != -1) {
                return i11;
            }
            advance();
        }
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        InputStream inputStream = this.f12401in;
        if (inputStream == null) {
            return 0;
        }
        return inputStream.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        InputStream inputStream = this.f12401in;
        if (inputStream != null) {
            try {
                inputStream.close();
            } finally {
                this.f12401in = null;
            }
        }
    }

    @Override // java.io.InputStream
    public long skip(long j11) throws IOException {
        InputStream inputStream = this.f12401in;
        if (inputStream == null || j11 <= 0) {
            return 0L;
        }
        long jSkip = inputStream.skip(j11);
        if (jSkip != 0) {
            return jSkip;
        }
        if (read() == -1) {
            return 0L;
        }
        return this.f12401in.skip(j11 - 1) + 1;
    }

    public MultiInputStream(Iterator<? extends ByteSource> it) throws IOException {
        this.f12402it = (Iterator) Preconditions.checkNotNull(it);
        advance();
    }

    private void advance() throws IOException {
        close();
        if (this.f12402it.hasNext()) {
            this.f12401in = this.f12402it.next().openStream();
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i11, int i12) throws IOException {
        Preconditions.checkNotNull(bArr);
        while (true) {
            InputStream inputStream = this.f12401in;
            if (inputStream == null) {
                return -1;
            }
            int i13 = inputStream.read(bArr, i11, i12);
            if (i13 != -1) {
                return i13;
            }
            advance();
        }
    }
}
