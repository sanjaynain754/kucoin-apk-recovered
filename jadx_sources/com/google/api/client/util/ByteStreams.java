package com.google.api.client.util;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes56.dex */
@Deprecated
public final class ByteStreams {
    private static final int BUF_SIZE = 4096;

    public static final class LimitedInputStream extends FilterInputStream {
        private long left;
        private long mark;

        @Override // java.io.FilterInputStream, java.io.InputStream
        public synchronized void mark(int i11) {
            ((FilterInputStream) this).in.mark(i11);
            this.mark = this.left;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read() throws IOException {
            if (this.left == 0) {
                return -1;
            }
            int i11 = ((FilterInputStream) this).in.read();
            if (i11 != -1) {
                this.left--;
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
            this.left = this.mark;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int available() throws IOException {
            return (int) Math.min(((FilterInputStream) this).in.available(), this.left);
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public long skip(long j11) throws IOException {
            long jSkip = ((FilterInputStream) this).in.skip(Math.min(j11, this.left));
            this.left -= jSkip;
            return jSkip;
        }

        public LimitedInputStream(InputStream inputStream, long j11) {
            boolean z11;
            super(inputStream);
            this.mark = -1L;
            Preconditions.checkNotNull(inputStream);
            if (j11 >= 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            Preconditions.checkArgument(z11, "limit must be non-negative");
            this.left = j11;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] bArr, int i11, int i12) throws IOException {
            long j11 = this.left;
            if (j11 == 0) {
                return -1;
            }
            int i13 = ((FilterInputStream) this).in.read(bArr, i11, (int) Math.min(i12, j11));
            if (i13 != -1) {
                this.left -= (long) i13;
            }
            return i13;
        }
    }

    public static InputStream limit(InputStream inputStream, long j11) {
        return new LimitedInputStream(inputStream, j11);
    }

    private ByteStreams() {
    }

    public static long copy(InputStream inputStream, OutputStream outputStream) throws IOException {
        Preconditions.checkNotNull(inputStream);
        Preconditions.checkNotNull(outputStream);
        byte[] bArr = new byte[4096];
        long j11 = 0;
        while (true) {
            int i11 = inputStream.read(bArr);
            if (i11 == -1) {
                return j11;
            }
            outputStream.write(bArr, 0, i11);
            j11 += (long) i11;
        }
    }

    public static int read(InputStream inputStream, byte[] bArr, int i11, int i12) throws IOException {
        Preconditions.checkNotNull(inputStream);
        Preconditions.checkNotNull(bArr);
        if (i12 >= 0) {
            int i13 = 0;
            while (i13 < i12) {
                int i14 = inputStream.read(bArr, i11 + i13, i12 - i13);
                if (i14 == -1) {
                    break;
                }
                i13 += i14;
            }
            return i13;
        }
        throw new IndexOutOfBoundsException("len is negative");
    }
}
