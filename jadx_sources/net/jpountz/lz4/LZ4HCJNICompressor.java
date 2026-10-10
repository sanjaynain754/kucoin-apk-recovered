package net.jpountz.lz4;

import java.nio.ByteBuffer;
import net.jpountz.util.ByteBufferUtils;
import net.jpountz.util.SafeUtils;

/* JADX INFO: loaded from: classes61.dex */
final class LZ4HCJNICompressor extends LZ4Compressor {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final LZ4HCJNICompressor INSTANCE = new LZ4HCJNICompressor();
    private static LZ4Compressor SAFE_INSTANCE;
    private final int compressionLevel;

    public LZ4HCJNICompressor() {
        this(9);
    }

    @Override // net.jpountz.lz4.LZ4Compressor
    public int compress(byte[] bArr, int i11, int i12, byte[] bArr2, int i13, int i14) {
        SafeUtils.checkRange(bArr, i11, i12);
        SafeUtils.checkRange(bArr2, i13, i14);
        int iLZ4_compressHC = LZ4JNI.LZ4_compressHC(bArr, null, i11, i12, bArr2, null, i13, i14, this.compressionLevel);
        if (iLZ4_compressHC > 0) {
            return iLZ4_compressHC;
        }
        throw new LZ4Exception();
    }

    public LZ4HCJNICompressor(int i11) {
        this.compressionLevel = i11;
    }

    @Override // net.jpountz.lz4.LZ4Compressor
    public int compress(ByteBuffer byteBuffer, int i11, int i12, ByteBuffer byteBuffer2, int i13, int i14) {
        byte[] bArrArray;
        ByteBuffer byteBuffer3;
        int iArrayOffset;
        ByteBufferUtils.checkNotReadOnly(byteBuffer2);
        ByteBufferUtils.checkRange(byteBuffer, i11, i12);
        ByteBufferUtils.checkRange(byteBuffer2, i13, i14);
        if ((!byteBuffer.hasArray() && !byteBuffer.isDirect()) || (!byteBuffer2.hasArray() && !byteBuffer2.isDirect())) {
            LZ4Compressor lZ4CompressorHighCompressor = SAFE_INSTANCE;
            if (lZ4CompressorHighCompressor == null) {
                lZ4CompressorHighCompressor = LZ4Factory.safeInstance().highCompressor(this.compressionLevel);
                SAFE_INSTANCE = lZ4CompressorHighCompressor;
            }
            return lZ4CompressorHighCompressor.compress(byteBuffer, i11, i12, byteBuffer2, i13, i14);
        }
        ByteBuffer byteBuffer4 = byteBuffer2;
        int i15 = i13;
        byte[] bArr = null;
        if (byteBuffer.hasArray()) {
            bArrArray = byteBuffer.array();
            byteBuffer3 = null;
            iArrayOffset = byteBuffer.arrayOffset() + i11;
        } else {
            bArrArray = null;
            byteBuffer3 = byteBuffer;
            iArrayOffset = i11;
        }
        if (byteBuffer4.hasArray()) {
            byte[] bArrArray2 = byteBuffer4.array();
            int iArrayOffset2 = i15 + byteBuffer4.arrayOffset();
            byteBuffer4 = null;
            i15 = iArrayOffset2;
            bArr = bArrArray2;
        }
        int iLZ4_compressHC = LZ4JNI.LZ4_compressHC(bArrArray, byteBuffer3, iArrayOffset, i12, bArr, byteBuffer4, i15, i14, this.compressionLevel);
        if (iLZ4_compressHC > 0) {
            return iLZ4_compressHC;
        }
        throw new LZ4Exception();
    }
}
