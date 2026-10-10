package androidx.camera.core.internal;

import java.io.EOFException;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes23.dex */
public final class ByteBufferOutputStream extends OutputStream {
    private final ByteBuffer mByteBuffer;

    @Override // java.io.OutputStream
    public void write(int i11) throws IOException {
        if (!this.mByteBuffer.hasRemaining()) {
            throw new EOFException("Output ByteBuffer has no bytes remaining.");
        }
        this.mByteBuffer.put((byte) i11);
    }

    public ByteBufferOutputStream(ByteBuffer byteBuffer) {
        this.mByteBuffer = byteBuffer;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i11, int i12) throws IOException {
        int i13;
        bArr.getClass();
        if (i11 < 0 || i11 > bArr.length || i12 < 0 || (i13 = i11 + i12) > bArr.length || i13 < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (i12 == 0) {
            return;
        }
        if (this.mByteBuffer.remaining() >= i12) {
            this.mByteBuffer.put(bArr, i11, i12);
            return;
        }
        throw new EOFException("Output ByteBuffer has insufficient bytes remaining.");
    }
}
