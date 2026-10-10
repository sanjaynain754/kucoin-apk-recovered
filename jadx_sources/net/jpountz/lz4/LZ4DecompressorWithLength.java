package net.jpountz.lz4;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes61.dex */
public class LZ4DecompressorWithLength {
    private final LZ4FastDecompressor fastDecompressor;
    private final LZ4SafeDecompressor safeDecompressor;

    public LZ4DecompressorWithLength(LZ4FastDecompressor lZ4FastDecompressor) {
        this.fastDecompressor = lZ4FastDecompressor;
        this.safeDecompressor = null;
    }

    public static int getDecompressedLength(byte[] bArr) {
        return getDecompressedLength(bArr, 0);
    }

    public int decompress(byte[] bArr, byte[] bArr2) {
        return decompress(bArr, 0, bArr2, 0);
    }

    public static int getDecompressedLength(byte[] bArr, int i11) {
        return (bArr[i11 + 3] << 24) | (bArr[i11] & 255) | ((bArr[i11 + 1] & 255) << 8) | ((bArr[i11 + 2] & 255) << 16);
    }

    public int decompress(byte[] bArr, int i11, byte[] bArr2, int i12) {
        if (this.safeDecompressor != null) {
            return decompress(bArr, i11, bArr.length - i11, bArr2, i12);
        }
        return this.fastDecompressor.decompress(bArr, i11 + 4, bArr2, i12, getDecompressedLength(bArr, i11)) + 4;
    }

    public static int getDecompressedLength(ByteBuffer byteBuffer) {
        return getDecompressedLength(byteBuffer, byteBuffer.position());
    }

    public LZ4DecompressorWithLength(LZ4SafeDecompressor lZ4SafeDecompressor) {
        this.fastDecompressor = null;
        this.safeDecompressor = lZ4SafeDecompressor;
    }

    public static int getDecompressedLength(ByteBuffer byteBuffer, int i11) {
        return (byteBuffer.get(i11 + 3) << 24) | (byteBuffer.get(i11) & 255) | ((byteBuffer.get(i11 + 1) & 255) << 8) | ((byteBuffer.get(i11 + 2) & 255) << 16);
    }

    public int decompress(byte[] bArr, int i11, int i12, byte[] bArr2, int i13) {
        if (this.safeDecompressor == null) {
            return decompress(bArr, i11, bArr2, i13);
        }
        return this.safeDecompressor.decompress(bArr, i11 + 4, i12 - 4, bArr2, i13, getDecompressedLength(bArr, i11));
    }

    public byte[] decompress(byte[] bArr) {
        return decompress(bArr, 0);
    }

    public byte[] decompress(byte[] bArr, int i11) {
        if (this.safeDecompressor != null) {
            return decompress(bArr, i11, bArr.length - i11);
        }
        return this.fastDecompressor.decompress(bArr, i11 + 4, getDecompressedLength(bArr, i11));
    }

    public byte[] decompress(byte[] bArr, int i11, int i12) {
        if (this.safeDecompressor == null) {
            return decompress(bArr, i11);
        }
        return this.safeDecompressor.decompress(bArr, i11 + 4, i12 - 4, getDecompressedLength(bArr, i11));
    }

    public void decompress(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        int decompressedLength = getDecompressedLength(byteBuffer, byteBuffer.position());
        LZ4SafeDecompressor lZ4SafeDecompressor = this.safeDecompressor;
        if (lZ4SafeDecompressor == null) {
            byteBuffer.position(byteBuffer.position() + 4 + this.fastDecompressor.decompress(byteBuffer, byteBuffer.position() + 4, byteBuffer2, byteBuffer2.position(), decompressedLength));
            byteBuffer2.position(byteBuffer2.position() + decompressedLength);
        } else {
            int iDecompress = lZ4SafeDecompressor.decompress(byteBuffer, byteBuffer.position() + 4, byteBuffer.remaining() - 4, byteBuffer2, byteBuffer2.position(), decompressedLength);
            byteBuffer.position(byteBuffer.limit());
            byteBuffer2.position(byteBuffer2.position() + iDecompress);
        }
    }

    public int decompress(ByteBuffer byteBuffer, int i11, ByteBuffer byteBuffer2, int i12) {
        if (this.safeDecompressor != null) {
            return decompress(byteBuffer, i11, byteBuffer.remaining() - i11, byteBuffer2, i12);
        }
        return this.fastDecompressor.decompress(byteBuffer, i11 + 4, byteBuffer2, i12, getDecompressedLength(byteBuffer, i11)) + 4;
    }

    public int decompress(ByteBuffer byteBuffer, int i11, int i12, ByteBuffer byteBuffer2, int i13) {
        if (this.safeDecompressor == null) {
            return decompress(byteBuffer, i11, byteBuffer2, i13);
        }
        return this.safeDecompressor.decompress(byteBuffer, i11 + 4, i12 - 4, byteBuffer2, i13, getDecompressedLength(byteBuffer, i11));
    }
}
