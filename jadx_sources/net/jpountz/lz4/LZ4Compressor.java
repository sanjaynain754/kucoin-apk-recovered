package net.jpountz.lz4;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes61.dex */
public abstract class LZ4Compressor {
    public abstract int compress(ByteBuffer byteBuffer, int i11, int i12, ByteBuffer byteBuffer2, int i13, int i14);

    public final int compress(byte[] bArr, int i11, int i12, byte[] bArr2, int i13) {
        return compress(bArr, i11, i12, bArr2, i13, bArr2.length - i13);
    }

    public abstract int compress(byte[] bArr, int i11, int i12, byte[] bArr2, int i13, int i14);

    public final int compress(byte[] bArr, byte[] bArr2) {
        return compress(bArr, 0, bArr.length, bArr2, 0);
    }

    public final byte[] compress(byte[] bArr, int i11, int i12) {
        byte[] bArr2 = new byte[maxCompressedLength(i12)];
        return Arrays.copyOf(bArr2, compress(bArr, i11, i12, bArr2, 0));
    }

    public final int maxCompressedLength(int i11) {
        return LZ4Utils.maxCompressedLength(i11);
    }

    public String toString() {
        return getClass().getSimpleName();
    }

    public final byte[] compress(byte[] bArr) {
        return compress(bArr, 0, bArr.length);
    }

    public final void compress(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        int iCompress = compress(byteBuffer, byteBuffer.position(), byteBuffer.remaining(), byteBuffer2, byteBuffer2.position(), byteBuffer2.remaining());
        byteBuffer.position(byteBuffer.limit());
        byteBuffer2.position(byteBuffer2.position() + iCompress);
    }
}
