package net.jpountz.lz4;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes61.dex */
public class LZ4CompressorWithLength {
    private final LZ4Compressor compressor;

    private void putOriginalLength(byte[] bArr, int i11, int i12) {
        bArr[i11] = (byte) i12;
        bArr[i11 + 1] = (byte) (i12 >> 8);
        bArr[i11 + 2] = (byte) (i12 >> 16);
        bArr[i11 + 3] = (byte) (i12 >> 24);
    }

    public byte[] compress(byte[] bArr) {
        return compress(bArr, 0, bArr.length);
    }

    public byte[] compress(byte[] bArr, int i11, int i12) {
        byte[] bArr2 = new byte[maxCompressedLength(i12)];
        return Arrays.copyOf(bArr2, compress(bArr, i11, i12, bArr2, 0));
    }

    public int maxCompressedLength(int i11) {
        return this.compressor.maxCompressedLength(i11) + 4;
    }

    public LZ4CompressorWithLength(LZ4Compressor lZ4Compressor) {
        this.compressor = lZ4Compressor;
    }

    private void putOriginalLength(ByteBuffer byteBuffer, int i11, int i12) {
        byteBuffer.put(i11, (byte) i12);
        byteBuffer.put(i11 + 1, (byte) (i12 >> 8));
        byteBuffer.put(i11 + 2, (byte) (i12 >> 16));
        byteBuffer.put(i11 + 3, (byte) (i12 >> 24));
    }

    public int compress(byte[] bArr, byte[] bArr2) {
        return compress(bArr, 0, bArr.length, bArr2, 0);
    }

    public int compress(byte[] bArr, int i11, int i12, byte[] bArr2, int i13) {
        return compress(bArr, i11, i12, bArr2, i13, bArr2.length - i13);
    }

    public int compress(byte[] bArr, int i11, int i12, byte[] bArr2, int i13, int i14) {
        int iCompress = this.compressor.compress(bArr, i11, i12, bArr2, i13 + 4, i14 - 4);
        putOriginalLength(bArr2, i13, i12);
        return iCompress + 4;
    }

    public void compress(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        int iCompress = compress(byteBuffer, byteBuffer.position(), byteBuffer.remaining(), byteBuffer2, byteBuffer2.position(), byteBuffer2.remaining());
        byteBuffer.position(byteBuffer.limit());
        byteBuffer2.position(byteBuffer2.position() + iCompress);
    }

    public int compress(ByteBuffer byteBuffer, int i11, int i12, ByteBuffer byteBuffer2, int i13, int i14) {
        int iCompress = this.compressor.compress(byteBuffer, i11, i12, byteBuffer2, i13 + 4, i14 - 4);
        putOriginalLength(byteBuffer2, i13, i12);
        return iCompress + 4;
    }
}
