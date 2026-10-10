package net.jpountz.lz4;

import java.nio.ByteBuffer;
import net.jpountz.util.ByteBufferUtils;
import net.jpountz.util.SafeUtils;

/* JADX INFO: loaded from: classes61.dex */
final class LZ4JNISafeDecompressor extends LZ4SafeDecompressor {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final LZ4JNISafeDecompressor INSTANCE = new LZ4JNISafeDecompressor();
    private static LZ4SafeDecompressor SAFE_INSTANCE;

    @Override // net.jpountz.lz4.LZ4SafeDecompressor, net.jpountz.lz4.LZ4UnknownSizeDecompressor
    public final int decompress(byte[] bArr, int i11, int i12, byte[] bArr2, int i13, int i14) {
        SafeUtils.checkRange(bArr, i11, i12);
        SafeUtils.checkRange(bArr2, i13, i14);
        int iLZ4_decompress_safe = LZ4JNI.LZ4_decompress_safe(bArr, null, i11, i12, bArr2, null, i13, i14);
        if (iLZ4_decompress_safe >= 0) {
            return iLZ4_decompress_safe;
        }
        throw new LZ4Exception("Error decoding offset " + (i11 - iLZ4_decompress_safe) + " of input buffer");
    }

    @Override // net.jpountz.lz4.LZ4SafeDecompressor
    public int decompress(ByteBuffer byteBuffer, int i11, int i12, ByteBuffer byteBuffer2, int i13, int i14) {
        byte[] bArrArray;
        ByteBuffer byteBuffer3;
        int iArrayOffset;
        byte[] bArr;
        ByteBufferUtils.checkNotReadOnly(byteBuffer2);
        ByteBufferUtils.checkRange(byteBuffer, i11, i12);
        ByteBufferUtils.checkRange(byteBuffer2, i13, i14);
        if ((!byteBuffer.hasArray() && !byteBuffer.isDirect()) || (!byteBuffer2.hasArray() && !byteBuffer2.isDirect())) {
            LZ4SafeDecompressor lZ4SafeDecompressorSafeDecompressor = SAFE_INSTANCE;
            if (lZ4SafeDecompressorSafeDecompressor == null) {
                lZ4SafeDecompressorSafeDecompressor = LZ4Factory.safeInstance().safeDecompressor();
                SAFE_INSTANCE = lZ4SafeDecompressorSafeDecompressor;
            }
            return lZ4SafeDecompressorSafeDecompressor.decompress(byteBuffer, i11, i12, byteBuffer2, i13, i14);
        }
        ByteBuffer byteBuffer4 = byteBuffer2;
        int i15 = i13;
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
        } else {
            bArr = null;
        }
        int iLZ4_decompress_safe = LZ4JNI.LZ4_decompress_safe(bArrArray, byteBuffer3, iArrayOffset, i12, bArr, byteBuffer4, i15, i14);
        if (iLZ4_decompress_safe >= 0) {
            return iLZ4_decompress_safe;
        }
        throw new LZ4Exception("Error decoding offset " + (iArrayOffset - iLZ4_decompress_safe) + " of input buffer");
    }
}
