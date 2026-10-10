package net.jpountz.lz4;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes61.dex */
public abstract class LZ4SafeDecompressor implements LZ4UnknownSizeDecompressor {
    public abstract int decompress(ByteBuffer byteBuffer, int i11, int i12, ByteBuffer byteBuffer2, int i13, int i14);

    @Override // net.jpountz.lz4.LZ4UnknownSizeDecompressor
    public final int decompress(byte[] bArr, int i11, int i12, byte[] bArr2, int i13) {
        return decompress(bArr, i11, i12, bArr2, i13, bArr2.length - i13);
    }

    @Override // net.jpountz.lz4.LZ4UnknownSizeDecompressor
    public abstract int decompress(byte[] bArr, int i11, int i12, byte[] bArr2, int i13, int i14);

    public final int decompress(byte[] bArr, byte[] bArr2) {
        return decompress(bArr, 0, bArr.length, bArr2, 0);
    }

    public final byte[] decompress(byte[] bArr, int i11, int i12, int i13) {
        byte[] bArr2 = new byte[i13];
        int iDecompress = decompress(bArr, i11, i12, bArr2, 0, i13);
        return iDecompress != i13 ? Arrays.copyOf(bArr2, iDecompress) : bArr2;
    }

    public String toString() {
        return getClass().getSimpleName();
    }

    public final byte[] decompress(byte[] bArr, int i11) {
        return decompress(bArr, 0, bArr.length, i11);
    }

    public final void decompress(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        int iDecompress = decompress(byteBuffer, byteBuffer.position(), byteBuffer.remaining(), byteBuffer2, byteBuffer2.position(), byteBuffer2.remaining());
        byteBuffer.position(byteBuffer.limit());
        byteBuffer2.position(byteBuffer2.position() + iDecompress);
    }
}
