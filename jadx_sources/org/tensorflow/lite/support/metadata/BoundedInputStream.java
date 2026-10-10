package org.tensorflow.lite.support.metadata;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes61.dex */
final class BoundedInputStream extends InputStream {
    private final SeekableByteChannelCompat channel;
    private final long end;
    private long position;
    private final ByteBuffer singleByteBuffer = ByteBuffer.allocate(1);

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (this.position >= this.end) {
            return -1;
        }
        this.singleByteBuffer.rewind();
        int i11 = read(this.position, this.singleByteBuffer);
        if (i11 < 0) {
            return i11;
        }
        this.position++;
        return this.singleByteBuffer.get() & 255;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        return (int) (Math.min(this.end, this.channel.size()) - this.position);
    }

    public BoundedInputStream(SeekableByteChannelCompat seekableByteChannelCompat, long j11, long j12) {
        Preconditions.checkArgument(j12 >= 0 && j11 >= 0, String.format("Invalid length of stream at offset=%d, length=%d", Long.valueOf(j11), Long.valueOf(j12)));
        this.end = j12 + j11;
        this.channel = seekableByteChannelCompat;
        this.position = j11;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i11, int i12) throws IOException {
        Preconditions.checkNotNull(bArr);
        Preconditions.checkElementIndex(i11, bArr.length, "The start offset");
        Preconditions.checkElementIndex(i12, (bArr.length - i11) + 1, "The maximumn number of bytes to read");
        if (i12 == 0) {
            return 0;
        }
        long j11 = i12;
        long j12 = this.end;
        long j13 = this.position;
        if (j11 > j12 - j13) {
            if (j13 >= j12) {
                return -1;
            }
            i12 = (int) (j12 - j13);
        }
        int i13 = read(this.position, ByteBuffer.wrap(bArr, i11, i12));
        if (i13 > 0) {
            this.position += (long) i13;
        }
        return i13;
    }

    private int read(long j11, ByteBuffer byteBuffer) throws IOException {
        int i11;
        synchronized (this.channel) {
            this.channel.position(j11);
            i11 = this.channel.read(byteBuffer);
        }
        byteBuffer.flip();
        return i11;
    }
}
