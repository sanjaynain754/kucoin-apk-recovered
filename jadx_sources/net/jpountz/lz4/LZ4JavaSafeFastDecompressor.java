package net.jpountz.lz4;

import java.nio.ByteBuffer;
import net.jpountz.util.ByteBufferUtils;
import net.jpountz.util.SafeUtils;

/* JADX INFO: loaded from: classes61.dex */
final class LZ4JavaSafeFastDecompressor extends LZ4FastDecompressor {
    public static final LZ4FastDecompressor INSTANCE = new LZ4JavaSafeFastDecompressor();

    @Override // net.jpountz.lz4.LZ4FastDecompressor, net.jpountz.lz4.LZ4Decompressor
    public int decompress(byte[] bArr, int i11, byte[] bArr2, int i12, int i13) {
        int i14;
        byte b11;
        int i15;
        byte b12;
        SafeUtils.checkRange(bArr, i11);
        SafeUtils.checkRange(bArr2, i12, i13);
        if (i13 == 0) {
            if (SafeUtils.readByte(bArr, i11) == 0) {
                return 1;
            }
            throw new LZ4Exception("Malformed input at " + i11);
        }
        int i16 = i13 + i12;
        int i17 = i11;
        int i18 = i12;
        while (true) {
            byte b13 = SafeUtils.readByte(bArr, i17);
            int i19 = i17 + 1;
            int i21 = (b13 & 255) >>> 4;
            if (i21 == 15) {
                while (true) {
                    i15 = i19 + 1;
                    b12 = SafeUtils.readByte(bArr, i19);
                    if (b12 != -1) {
                        break;
                    }
                    i21 += 255;
                    i19 = i15;
                }
                i21 += b12 & 255;
                i19 = i15;
            }
            int i22 = i18 + i21;
            int i23 = i16 - 8;
            if (i22 > i23) {
                if (i22 == i16) {
                    LZ4SafeUtils.safeArraycopy(bArr, i19, bArr2, i18, i21);
                    return (i19 + i21) - i11;
                }
                throw new LZ4Exception("Malformed input at " + i19);
            }
            LZ4SafeUtils.wildArraycopy(bArr, i19, bArr2, i18, i21);
            int i24 = i19 + i21;
            int shortLE = SafeUtils.readShortLE(bArr, i24);
            i17 = i24 + 2;
            int i25 = i22 - shortLE;
            if (i25 < i12) {
                throw new LZ4Exception("Malformed input at " + i17);
            }
            int i26 = b13 & 15;
            if (i26 == 15) {
                while (true) {
                    i14 = i17 + 1;
                    b11 = SafeUtils.readByte(bArr, i17);
                    if (b11 != -1) {
                        break;
                    }
                    i26 += 255;
                    i17 = i14;
                }
                i26 += b11 & 255;
                i17 = i14;
            }
            int i27 = i26 + 4;
            int i28 = i22 + i27;
            if (i28 <= i23) {
                LZ4SafeUtils.wildIncrementalCopy(bArr2, i25, i22, i28);
            } else {
                if (i28 > i16) {
                    throw new LZ4Exception("Malformed input at " + i17);
                }
                LZ4SafeUtils.safeIncrementalCopy(bArr2, i25, i22, i27);
            }
            i18 = i28;
        }
    }

    @Override // net.jpountz.lz4.LZ4FastDecompressor
    public int decompress(ByteBuffer byteBuffer, int i11, ByteBuffer byteBuffer2, int i12, int i13) {
        int i14;
        byte b11;
        int i15;
        byte b12;
        if (byteBuffer.hasArray() && byteBuffer2.hasArray()) {
            return decompress(byteBuffer.array(), i11 + byteBuffer.arrayOffset(), byteBuffer2.array(), i12 + byteBuffer2.arrayOffset(), i13);
        }
        ByteBuffer byteBufferInNativeByteOrder = ByteBufferUtils.inNativeByteOrder(byteBuffer);
        ByteBuffer byteBufferInNativeByteOrder2 = ByteBufferUtils.inNativeByteOrder(byteBuffer2);
        ByteBufferUtils.checkRange(byteBufferInNativeByteOrder, i11);
        ByteBufferUtils.checkRange(byteBufferInNativeByteOrder2, i12, i13);
        if (i13 == 0) {
            if (ByteBufferUtils.readByte(byteBufferInNativeByteOrder, i11) == 0) {
                return 1;
            }
            throw new LZ4Exception("Malformed input at " + i11);
        }
        int i16 = i12 + i13;
        int i17 = i11;
        int i18 = i12;
        while (true) {
            byte b13 = ByteBufferUtils.readByte(byteBufferInNativeByteOrder, i17);
            int i19 = i17 + 1;
            int i21 = (b13 & 255) >>> 4;
            if (i21 == 15) {
                while (true) {
                    i15 = i19 + 1;
                    b12 = ByteBufferUtils.readByte(byteBufferInNativeByteOrder, i19);
                    if (b12 != -1) {
                        break;
                    }
                    i21 += 255;
                    i19 = i15;
                }
                i21 += b12 & 255;
                i19 = i15;
            }
            int i22 = i18 + i21;
            int i23 = i16 - 8;
            if (i22 > i23) {
                if (i22 != i16) {
                    throw new LZ4Exception("Malformed input at " + i19);
                }
                LZ4ByteBufferUtils.safeArraycopy(byteBufferInNativeByteOrder, i19, byteBufferInNativeByteOrder2, i18, i21);
                return (i19 + i21) - i11;
            }
            LZ4ByteBufferUtils.wildArraycopy(byteBufferInNativeByteOrder, i19, byteBufferInNativeByteOrder2, i18, i21);
            int i24 = i19 + i21;
            int shortLE = ByteBufferUtils.readShortLE(byteBufferInNativeByteOrder, i24);
            i17 = i24 + 2;
            int i25 = i22 - shortLE;
            if (i25 < i12) {
                throw new LZ4Exception("Malformed input at " + i17);
            }
            int i26 = b13 & 15;
            if (i26 == 15) {
                while (true) {
                    i14 = i17 + 1;
                    b11 = ByteBufferUtils.readByte(byteBufferInNativeByteOrder, i17);
                    if (b11 != -1) {
                        break;
                    }
                    i26 += 255;
                    i17 = i14;
                }
                i26 += b11 & 255;
                i17 = i14;
            }
            int i27 = i26 + 4;
            int i28 = i22 + i27;
            if (i28 <= i23) {
                LZ4ByteBufferUtils.wildIncrementalCopy(byteBufferInNativeByteOrder2, i25, i22, i28);
            } else {
                if (i28 > i16) {
                    throw new LZ4Exception("Malformed input at " + i17);
                }
                LZ4ByteBufferUtils.safeIncrementalCopy(byteBufferInNativeByteOrder2, i25, i22, i27);
            }
            i18 = i28;
        }
    }
}
