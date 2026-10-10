package org.tensorflow.lite.support.metadata;

import java.nio.ByteBuffer;
import java.nio.channels.NonWritableChannelException;

/* JADX INFO: loaded from: classes61.dex */
final class ByteBufferChannel implements SeekableByteChannelCompat {
    private final ByteBuffer buffer;

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return true;
    }

    @Override // org.tensorflow.lite.support.metadata.SeekableByteChannelCompat
    public synchronized int read(ByteBuffer byteBuffer) {
        if (this.buffer.remaining() == 0) {
            return -1;
        }
        int iMin = Math.min(byteBuffer.remaining(), this.buffer.remaining());
        if (iMin > 0) {
            ByteBuffer byteBufferSlice = this.buffer.slice();
            byteBufferSlice.order(this.buffer.order()).limit(iMin);
            byteBuffer.put(byteBufferSlice);
            ByteBuffer byteBuffer2 = this.buffer;
            byteBuffer2.position(byteBuffer2.position() + iMin);
        }
        return iMin;
    }

    @Override // org.tensorflow.lite.support.metadata.SeekableByteChannelCompat
    public synchronized int write(ByteBuffer byteBuffer) {
        int iMin;
        if (this.buffer.isReadOnly()) {
            throw new NonWritableChannelException();
        }
        iMin = Math.min(byteBuffer.remaining(), this.buffer.remaining());
        if (iMin > 0) {
            ByteBuffer byteBufferSlice = byteBuffer.slice();
            byteBufferSlice.order(this.buffer.order()).limit(iMin);
            this.buffer.put(byteBufferSlice);
        }
        return iMin;
    }

    @Override // org.tensorflow.lite.support.metadata.SeekableByteChannelCompat
    public long position() {
        return this.buffer.position();
    }

    @Override // org.tensorflow.lite.support.metadata.SeekableByteChannelCompat
    public long size() {
        return this.buffer.limit();
    }

    @Override // org.tensorflow.lite.support.metadata.SeekableByteChannelCompat
    public synchronized ByteBufferChannel truncate(long j11) {
        Preconditions.checkArgument(j11 >= 0 && j11 <= 2147483647L, "The new size should be non-negative and be less than Integer.MAX_VALUE.");
        if (j11 < this.buffer.limit()) {
            int i11 = (int) j11;
            this.buffer.limit(i11);
            if (this.buffer.position() > j11) {
                this.buffer.position(i11);
            }
        }
        return this;
    }

    public ByteBufferChannel(ByteBuffer byteBuffer) {
        Preconditions.checkNotNull(byteBuffer, "The ByteBuffer cannot be null.");
        this.buffer = byteBuffer;
    }

    @Override // org.tensorflow.lite.support.metadata.SeekableByteChannelCompat
    public synchronized ByteBufferChannel position(long j11) {
        Preconditions.checkArgument(j11 >= 0 && j11 <= 2147483647L, "The new position should be non-negative and be less than Integer.MAX_VALUE.");
        this.buffer.position((int) j11);
        return this;
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }
}
