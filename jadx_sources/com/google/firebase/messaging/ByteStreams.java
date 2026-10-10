package com.google.firebase.messaging;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

/* JADX INFO: loaded from: classes56.dex */
final class ByteStreams {
    private static final int BUFFER_SIZE = 8192;
    private static final int MAX_ARRAY_LEN = 2147483639;
    private static final int TO_BYTE_ARRAY_DEQUE_SIZE = 20;

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
            super(inputStream);
            this.mark = -1L;
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

    public static byte[] createBuffer() {
        return new byte[8192];
    }

    public static InputStream limit(InputStream inputStream, long j11) {
        return new LimitedInputStream(inputStream, j11);
    }

    public static byte[] toByteArray(InputStream inputStream) throws IOException {
        return toByteArrayInternal(inputStream, new ArrayDeque(20), 0);
    }

    private ByteStreams() {
    }

    private static byte[] combineBuffers(Queue<byte[]> queue, int i11) {
        if (queue.isEmpty()) {
            return new byte[0];
        }
        byte[] bArrRemove = queue.remove();
        if (bArrRemove.length == i11) {
            return bArrRemove;
        }
        int length = i11 - bArrRemove.length;
        byte[] bArrCopyOf = Arrays.copyOf(bArrRemove, i11);
        while (length > 0) {
            byte[] bArrRemove2 = queue.remove();
            int iMin = Math.min(length, bArrRemove2.length);
            System.arraycopy(bArrRemove2, 0, bArrCopyOf, i11 - length, iMin);
            length -= iMin;
        }
        return bArrCopyOf;
    }

    private static int saturatedCast(long j11) {
        if (j11 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j11 < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j11;
    }

    private static byte[] toByteArrayInternal(InputStream inputStream, Queue<byte[]> queue, int i11) throws IOException {
        int i12;
        int iMin = Math.min(8192, Math.max(128, Integer.highestOneBit(i11) * 2));
        while (i11 < MAX_ARRAY_LEN) {
            int iMin2 = Math.min(iMin, MAX_ARRAY_LEN - i11);
            byte[] bArr = new byte[iMin2];
            queue.add(bArr);
            int i13 = 0;
            while (i13 < iMin2) {
                int i14 = inputStream.read(bArr, i13, iMin2 - i13);
                if (i14 == -1) {
                    return combineBuffers(queue, i11);
                }
                i13 += i14;
                i11 += i14;
            }
            long j11 = iMin;
            if (iMin < 4096) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            iMin = saturatedCast(j11 * ((long) i12));
        }
        if (inputStream.read() == -1) {
            return combineBuffers(queue, MAX_ARRAY_LEN);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }
}
