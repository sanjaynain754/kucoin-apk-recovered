package net.jpountz.lz4;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes61.dex */
public abstract class LZ4FastDecompressor implements LZ4Decompressor {
    public abstract int decompress(ByteBuffer byteBuffer, int i11, ByteBuffer byteBuffer2, int i12, int i13);

    @Override // net.jpountz.lz4.LZ4Decompressor
    public abstract int decompress(byte[] bArr, int i11, byte[] bArr2, int i12, int i13);

    public final int decompress(byte[] bArr, byte[] bArr2, int i11) {
        return decompress(bArr, 0, bArr2, 0, i11);
    }

    public final int decompress(byte[] bArr, byte[] bArr2) {
        return decompress(bArr, bArr2, bArr2.length);
    }

    public final byte[] decompress(byte[] bArr, int i11, int i12) {
        byte[] bArr2 = new byte[i12];
        decompress(bArr, i11, bArr2, 0, i12);
        return bArr2;
    }

    public String toString() {
        return getClass().getSimpleName();
    }

    public final byte[] decompress(byte[] bArr, int i11) {
        return decompress(bArr, 0, i11);
    }

    public final void decompress(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        int iDecompress = decompress(byteBuffer, byteBuffer.position(), byteBuffer2, byteBuffer2.position(), byteBuffer2.remaining());
        byteBuffer2.position(byteBuffer2.limit());
        byteBuffer.position(byteBuffer.position() + iDecompress);
    }
}
