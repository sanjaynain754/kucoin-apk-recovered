package net.jpountz.lz4;

import java.nio.ByteBuffer;
import net.jpountz.util.ByteBufferUtils;
import net.jpountz.util.SafeUtils;

/* JADX INFO: loaded from: classes61.dex */
final class LZ4JNIFastDecompressor extends LZ4FastDecompressor {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final LZ4JNIFastDecompressor INSTANCE = new LZ4JNIFastDecompressor();
    private static LZ4FastDecompressor SAFE_INSTANCE;

    @Override // net.jpountz.lz4.LZ4FastDecompressor, net.jpountz.lz4.LZ4Decompressor
    public final int decompress(byte[] bArr, int i11, byte[] bArr2, int i12, int i13) {
        SafeUtils.checkRange(bArr, i11);
        SafeUtils.checkRange(bArr2, i12, i13);
        int iLZ4_decompress_fast = LZ4JNI.LZ4_decompress_fast(bArr, null, i11, bArr2, null, i12, i13);
        if (iLZ4_decompress_fast >= 0) {
            return iLZ4_decompress_fast;
        }
        throw new LZ4Exception("Error decoding offset " + (i11 - iLZ4_decompress_fast) + " of input buffer");
    }

    @Override // net.jpountz.lz4.LZ4FastDecompressor
    public int decompress(ByteBuffer byteBuffer, int i11, ByteBuffer byteBuffer2, int i12, int i13) {
        byte[] bArrArray;
        ByteBuffer byteBuffer3;
        int iArrayOffset;
        byte[] bArr;
        ByteBufferUtils.checkNotReadOnly(byteBuffer2);
        ByteBufferUtils.checkRange(byteBuffer, i11);
        ByteBufferUtils.checkRange(byteBuffer2, i12, i13);
        if ((!byteBuffer.hasArray() && !byteBuffer.isDirect()) || (!byteBuffer2.hasArray() && !byteBuffer2.isDirect())) {
            LZ4FastDecompressor lZ4FastDecompressorFastDecompressor = SAFE_INSTANCE;
            if (lZ4FastDecompressorFastDecompressor == null) {
                lZ4FastDecompressorFastDecompressor = LZ4Factory.safeInstance().fastDecompressor();
                SAFE_INSTANCE = lZ4FastDecompressorFastDecompressor;
            }
            return lZ4FastDecompressorFastDecompressor.decompress(byteBuffer, i11, byteBuffer2, i12, i13);
        }
        ByteBuffer byteBuffer4 = byteBuffer2;
        int i14 = i12;
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
            int iArrayOffset2 = i14 + byteBuffer4.arrayOffset();
            bArr = bArrArray2;
            byteBuffer4 = null;
            i14 = iArrayOffset2;
        } else {
            bArr = null;
        }
        int iLZ4_decompress_fast = LZ4JNI.LZ4_decompress_fast(bArrArray, byteBuffer3, iArrayOffset, bArr, byteBuffer4, i14, i13);
        if (iLZ4_decompress_fast >= 0) {
            return iLZ4_decompress_fast;
        }
        throw new LZ4Exception("Error decoding offset " + (iArrayOffset - iLZ4_decompress_fast) + " of input buffer");
    }
}
