package net.jpountz.lz4;

import java.nio.ByteBuffer;
import net.jpountz.util.ByteBufferUtils;
import net.jpountz.util.UnsafeUtils;

/* JADX INFO: loaded from: classes61.dex */
final class LZ4JavaUnsafeSafeDecompressor extends LZ4SafeDecompressor {
    public static final LZ4SafeDecompressor INSTANCE = new LZ4JavaUnsafeSafeDecompressor();

    @Override // net.jpountz.lz4.LZ4SafeDecompressor, net.jpountz.lz4.LZ4UnknownSizeDecompressor
    public int decompress(byte[] bArr, int i11, int i12, byte[] bArr2, int i13, int i14) {
        int i15;
        int i16;
        int i17;
        int i18;
        UnsafeUtils.checkRange(bArr, i11, i12);
        UnsafeUtils.checkRange(bArr2, i13, i14);
        int i19 = 1;
        if (i14 == 0) {
            if (i12 == 1 && UnsafeUtils.readByte(bArr, i11) == 0) {
                return 0;
            }
            throw new LZ4Exception("Output buffer too small");
        }
        int i21 = i11 + i12;
        int i22 = i13 + i14;
        int i23 = i11;
        int i24 = i13;
        while (true) {
            byte b11 = UnsafeUtils.readByte(bArr, i23);
            i15 = i23 + i19;
            i16 = (b11 & 255) >>> 4;
            if (i16 == 15) {
                byte b12 = -1;
                while (i15 < i21) {
                    int i25 = i15 + 1;
                    byte b13 = UnsafeUtils.readByte(bArr, i15);
                    if (b13 != -1) {
                        b12 = b13;
                        i15 = i25;
                        break;
                    }
                    i16 += 255;
                    b12 = b13;
                    i15 = i25;
                }
                i16 += b12 & 255;
            }
            i17 = i24 + i16;
            int i26 = i22 - 8;
            if (i17 > i26 || (i18 = i15 + i16) > i21 - 8) {
                break;
            }
            LZ4UnsafeUtils.wildArraycopy(bArr, i15, bArr2, i24, i16);
            int shortLE = UnsafeUtils.readShortLE(bArr, i18);
            int i27 = i18 + 2;
            int i28 = i17 - shortLE;
            if (i28 < i13) {
                throw new LZ4Exception("Malformed input at " + i27);
            }
            int i29 = b11 & 15;
            if (i29 == 15) {
                byte b14 = -1;
                while (i27 < i21) {
                    int i31 = i27 + 1;
                    byte b15 = UnsafeUtils.readByte(bArr, i27);
                    if (b15 != -1) {
                        i27 = i31;
                        b14 = b15;
                        break;
                    }
                    i29 += 255;
                    i27 = i31;
                    b14 = b15;
                }
                i29 += b14 & 255;
            }
            int i32 = i29 + 4;
            i24 = i17 + i32;
            if (i24 <= i26) {
                LZ4UnsafeUtils.wildIncrementalCopy(bArr2, i28, i17, i24);
            } else {
                if (i24 > i22) {
                    throw new LZ4Exception("Malformed input at " + i27);
                }
                LZ4UnsafeUtils.safeIncrementalCopy(bArr2, i28, i17, i32);
            }
            i23 = i27;
            i19 = 1;
        }
        if (i17 > i22) {
            throw new LZ4Exception();
        }
        if (i15 + i16 == i21) {
            LZ4UnsafeUtils.safeArraycopy(bArr, i15, bArr2, i24, i16);
            return i17 - i13;
        }
        throw new LZ4Exception("Malformed input at " + i15);
    }

    @Override // net.jpountz.lz4.LZ4SafeDecompressor
    public int decompress(ByteBuffer byteBuffer, int i11, int i12, ByteBuffer byteBuffer2, int i13, int i14) {
        int i15;
        int i16;
        int i17;
        int i18;
        int i19 = i11;
        if (byteBuffer.hasArray() && byteBuffer2.hasArray()) {
            return decompress(byteBuffer.array(), i19 + byteBuffer.arrayOffset(), i12, byteBuffer2.array(), i13 + byteBuffer2.arrayOffset(), i14);
        }
        ByteBuffer byteBufferInNativeByteOrder = ByteBufferUtils.inNativeByteOrder(byteBuffer);
        ByteBuffer byteBufferInNativeByteOrder2 = ByteBufferUtils.inNativeByteOrder(byteBuffer2);
        ByteBufferUtils.checkRange(byteBufferInNativeByteOrder, i19, i12);
        ByteBufferUtils.checkRange(byteBufferInNativeByteOrder2, i13, i14);
        int i21 = 1;
        if (i14 == 0) {
            if (i12 == 1 && ByteBufferUtils.readByte(byteBufferInNativeByteOrder, i19) == 0) {
                return 0;
            }
            throw new LZ4Exception("Output buffer too small");
        }
        int i22 = i12 + i19;
        int i23 = i14 + i13;
        int i24 = i13;
        while (true) {
            byte b11 = ByteBufferUtils.readByte(byteBufferInNativeByteOrder, i19);
            i15 = i19 + i21;
            i16 = (b11 & 255) >>> 4;
            if (i16 == 15) {
                byte b12 = -1;
                while (i15 < i22) {
                    int i25 = i15 + 1;
                    byte b13 = ByteBufferUtils.readByte(byteBufferInNativeByteOrder, i15);
                    if (b13 != -1) {
                        b12 = b13;
                        i15 = i25;
                        break;
                    }
                    i16 += 255;
                    b12 = b13;
                    i15 = i25;
                }
                i16 += b12 & 255;
            }
            i17 = i24 + i16;
            int i26 = i23 - 8;
            if (i17 > i26 || (i18 = i15 + i16) > i22 - 8) {
                break;
            }
            LZ4ByteBufferUtils.wildArraycopy(byteBufferInNativeByteOrder, i15, byteBufferInNativeByteOrder2, i24, i16);
            int shortLE = ByteBufferUtils.readShortLE(byteBufferInNativeByteOrder, i18);
            int i27 = i18 + 2;
            int i28 = i17 - shortLE;
            if (i28 < i13) {
                throw new LZ4Exception("Malformed input at " + i27);
            }
            int i29 = b11 & 15;
            if (i29 == 15) {
                byte b14 = -1;
                while (i27 < i22) {
                    int i31 = i27 + 1;
                    byte b15 = ByteBufferUtils.readByte(byteBufferInNativeByteOrder, i27);
                    if (b15 != -1) {
                        i27 = i31;
                        b14 = b15;
                        break;
                    }
                    i29 += 255;
                    i27 = i31;
                    b14 = b15;
                }
                i29 += b14 & 255;
            }
            int i32 = i29 + 4;
            i24 = i17 + i32;
            if (i24 <= i26) {
                LZ4ByteBufferUtils.wildIncrementalCopy(byteBufferInNativeByteOrder2, i28, i17, i24);
            } else {
                if (i24 > i23) {
                    throw new LZ4Exception("Malformed input at " + i27);
                }
                LZ4ByteBufferUtils.safeIncrementalCopy(byteBufferInNativeByteOrder2, i28, i17, i32);
            }
            i19 = i27;
            i21 = 1;
        }
        if (i17 > i23) {
            throw new LZ4Exception();
        }
        if (i15 + i16 != i22) {
            throw new LZ4Exception("Malformed input at " + i15);
        }
        LZ4ByteBufferUtils.safeArraycopy(byteBufferInNativeByteOrder, i15, byteBufferInNativeByteOrder2, i24, i16);
        return i17 - i13;
    }
}
