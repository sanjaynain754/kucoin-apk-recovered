package net.jpountz.lz4;

import java.nio.ByteBuffer;
import java.util.Arrays;
import net.jpountz.util.ByteBufferUtils;
import net.jpountz.util.UnsafeUtils;

/* JADX INFO: loaded from: classes61.dex */
final class LZ4JavaUnsafeCompressor extends LZ4Compressor {
    public static final LZ4Compressor INSTANCE = new LZ4JavaUnsafeCompressor();

    public static int compress64k(byte[] bArr, int i11, int i12, byte[] bArr2, int i13, int i14) {
        int i15;
        int i16;
        int i17;
        int i18 = i11;
        int i19 = i18 + i12;
        int i21 = i19 - 5;
        int i22 = i19 - 12;
        if (i12 >= 13) {
            short[] sArr = new short[8192];
            int i23 = i18 + 1;
            int i24 = i13;
            int i25 = i18;
            loop0: while (true) {
                int i26 = 1;
                int i27 = 1 << LZ4Constants.SKIP_STRENGTH;
                while (true) {
                    int i28 = i26 + i23;
                    int i29 = i27 + 1;
                    int i31 = i27 >>> LZ4Constants.SKIP_STRENGTH;
                    if (i28 > i22) {
                        i15 = i19;
                        i18 = i25;
                        break loop0;
                    }
                    int iHash64k = LZ4Utils.hash64k(UnsafeUtils.readInt(bArr, i23));
                    i17 = UnsafeUtils.readShort(sArr, iHash64k) + i18;
                    i15 = i19;
                    UnsafeUtils.writeShort(sArr, iHash64k, i23 - i18);
                    if (LZ4UnsafeUtils.readIntEquals(bArr, i17, i23)) {
                        break;
                    }
                    i23 = i28;
                    i19 = i15;
                    i26 = i31;
                    i27 = i29;
                }
                int iCommonBytesBackward = LZ4UnsafeUtils.commonBytesBackward(bArr, i17, i23, i18, i25);
                int i32 = i23 - iCommonBytesBackward;
                int i33 = i17 - iCommonBytesBackward;
                int i34 = i32 - i25;
                int iWriteLen = i24 + 1;
                if (iWriteLen + i34 + 8 + (i34 >>> 8) > i14) {
                    throw new LZ4Exception("maxDestLen is too small");
                }
                if (i34 >= 15) {
                    UnsafeUtils.writeByte(bArr2, i24, 240);
                    iWriteLen = LZ4UnsafeUtils.writeLen(i34 - 15, bArr2, iWriteLen);
                } else {
                    UnsafeUtils.writeByte(bArr2, i24, i34 << 4);
                }
                LZ4UnsafeUtils.wildArraycopy(bArr, i25, bArr2, iWriteLen, i34);
                int i35 = iWriteLen + i34;
                while (true) {
                    UnsafeUtils.writeShortLE(bArr2, i35, (short) (i32 - i33));
                    int iWriteLen2 = i35 + 2;
                    int i36 = i32 + 4;
                    int iCommonBytes = LZ4UnsafeUtils.commonBytes(bArr, i33 + 4, i36, i21);
                    if (i35 + 8 + (iCommonBytes >>> 8) > i14) {
                        throw new LZ4Exception("maxDestLen is too small");
                    }
                    i32 = i36 + iCommonBytes;
                    if (iCommonBytes >= 15) {
                        UnsafeUtils.writeByte(bArr2, i24, UnsafeUtils.readByte(bArr2, i24) | 15);
                        iWriteLen2 = LZ4UnsafeUtils.writeLen(iCommonBytes - 15, bArr2, iWriteLen2);
                    } else {
                        UnsafeUtils.writeByte(bArr2, i24, iCommonBytes | UnsafeUtils.readByte(bArr2, i24));
                    }
                    i24 = iWriteLen2;
                    if (i32 > i22) {
                        i18 = i32;
                        break loop0;
                    }
                    int i37 = i32 - 2;
                    UnsafeUtils.writeShort(sArr, LZ4Utils.hash64k(UnsafeUtils.readInt(bArr, i37)), i37 - i18);
                    int iHash64k2 = LZ4Utils.hash64k(UnsafeUtils.readInt(bArr, i32));
                    i33 = i18 + UnsafeUtils.readShort(sArr, iHash64k2);
                    UnsafeUtils.writeShort(sArr, iHash64k2, i32 - i18);
                    if (!LZ4UnsafeUtils.readIntEquals(bArr, i32, i33)) {
                        break;
                    }
                    i35 = i24 + 1;
                    UnsafeUtils.writeByte(bArr2, i24, 0);
                }
                i25 = i32;
                i23 = i32 + 1;
                i19 = i15;
            }
            i16 = i24;
        } else {
            i15 = i19;
            i16 = i13;
        }
        return LZ4UnsafeUtils.lastLiterals(bArr, i18, i15 - i18, bArr2, i16, i14) - i13;
    }

    @Override // net.jpountz.lz4.LZ4Compressor
    public int compress(byte[] bArr, int i11, int i12, byte[] bArr2, int i13, int i14) {
        int i15;
        int i16;
        int i17;
        int i18;
        UnsafeUtils.checkRange(bArr, i11, i12);
        UnsafeUtils.checkRange(bArr2, i13, i14);
        int i19 = i13 + i14;
        if (i12 < 65547) {
            return compress64k(bArr, i11, i12, bArr2, i13, i19);
        }
        int i21 = i11 + i12;
        int i22 = i21 - 5;
        int i23 = i21 - 12;
        int[] iArr = new int[4096];
        Arrays.fill(iArr, i11);
        int i24 = i13;
        int i25 = i11 + 1;
        int i26 = i11;
        loop0: while (true) {
            int i27 = 1;
            int i28 = 1 << LZ4Constants.SKIP_STRENGTH;
            while (true) {
                int i29 = i27 + i25;
                int i31 = i28 + 1;
                int i32 = i28 >>> LZ4Constants.SKIP_STRENGTH;
                if (i29 > i23) {
                    i15 = i21;
                    i16 = i26;
                    break loop0;
                }
                int iHash = LZ4Utils.hash(UnsafeUtils.readInt(bArr, i25));
                i17 = UnsafeUtils.readInt(iArr, iHash);
                i15 = i21;
                i18 = i25 - i17;
                UnsafeUtils.writeInt(iArr, iHash, i25);
                if (i18 >= 65536 || !LZ4UnsafeUtils.readIntEquals(bArr, i17, i25)) {
                    i21 = i15;
                    i25 = i29;
                    i27 = i32;
                    i28 = i31;
                }
            }
            int iCommonBytesBackward = LZ4UnsafeUtils.commonBytesBackward(bArr, i17, i25, i11, i26);
            int i33 = i25 - iCommonBytesBackward;
            int i34 = i17 - iCommonBytesBackward;
            int i35 = i33 - i26;
            int iWriteLen = i24 + 1;
            if (iWriteLen + i35 + 8 + (i35 >>> 8) > i19) {
                throw new LZ4Exception("maxDestLen is too small");
            }
            if (i35 >= 15) {
                UnsafeUtils.writeByte(bArr2, i24, 240);
                iWriteLen = LZ4UnsafeUtils.writeLen(i35 - 15, bArr2, iWriteLen);
            } else {
                UnsafeUtils.writeByte(bArr2, i24, i35 << 4);
            }
            LZ4UnsafeUtils.wildArraycopy(bArr, i26, bArr2, iWriteLen, i35);
            int i36 = iWriteLen + i35;
            while (true) {
                UnsafeUtils.writeShortLE(bArr2, i36, i18);
                int iWriteLen2 = i36 + 2;
                int i37 = i33 + 4;
                int iCommonBytes = LZ4UnsafeUtils.commonBytes(bArr, i34 + 4, i37, i22);
                if (i36 + 8 + (iCommonBytes >>> 8) > i19) {
                    throw new LZ4Exception("maxDestLen is too small");
                }
                i33 = i37 + iCommonBytes;
                if (iCommonBytes >= 15) {
                    UnsafeUtils.writeByte(bArr2, i24, UnsafeUtils.readByte(bArr2, i24) | 15);
                    iWriteLen2 = LZ4UnsafeUtils.writeLen(iCommonBytes - 15, bArr2, iWriteLen2);
                } else {
                    UnsafeUtils.writeByte(bArr2, i24, iCommonBytes | UnsafeUtils.readByte(bArr2, i24));
                }
                i24 = iWriteLen2;
                if (i33 > i23) {
                    i16 = i33;
                    break loop0;
                }
                int i38 = i33 - 2;
                UnsafeUtils.writeInt(iArr, LZ4Utils.hash(UnsafeUtils.readInt(bArr, i38)), i38);
                int iHash2 = LZ4Utils.hash(UnsafeUtils.readInt(bArr, i33));
                i34 = UnsafeUtils.readInt(iArr, iHash2);
                UnsafeUtils.writeInt(iArr, iHash2, i33);
                i18 = i33 - i34;
                if (i18 >= 65536 || !LZ4UnsafeUtils.readIntEquals(bArr, i34, i33)) {
                    break;
                }
                i36 = i24 + 1;
                UnsafeUtils.writeByte(bArr2, i24, 0);
            }
            i26 = i33;
            i25 = i33 + 1;
            i21 = i15;
        }
        return LZ4UnsafeUtils.lastLiterals(bArr, i16, i15 - i16, bArr2, i24, i19) - i13;
    }

    public static int compress64k(ByteBuffer byteBuffer, int i11, int i12, ByteBuffer byteBuffer2, int i13, int i14) {
        int i15;
        int i16;
        int i17;
        int i18 = i11;
        int i19 = i18 + i12;
        int i21 = i19 - 5;
        int i22 = i19 - 12;
        if (i12 >= 13) {
            short[] sArr = new short[8192];
            int i23 = i18 + 1;
            int i24 = i13;
            int i25 = i18;
            loop0: while (true) {
                int i26 = 1;
                int i27 = 1 << LZ4Constants.SKIP_STRENGTH;
                while (true) {
                    int i28 = i26 + i23;
                    int i29 = i27 + 1;
                    int i31 = i27 >>> LZ4Constants.SKIP_STRENGTH;
                    if (i28 > i22) {
                        i15 = i19;
                        i18 = i25;
                        break loop0;
                    }
                    int iHash64k = LZ4Utils.hash64k(ByteBufferUtils.readInt(byteBuffer, i23));
                    i17 = UnsafeUtils.readShort(sArr, iHash64k) + i18;
                    i15 = i19;
                    UnsafeUtils.writeShort(sArr, iHash64k, i23 - i18);
                    if (LZ4ByteBufferUtils.readIntEquals(byteBuffer, i17, i23)) {
                        break;
                    }
                    i23 = i28;
                    i19 = i15;
                    i26 = i31;
                    i27 = i29;
                }
                int iCommonBytesBackward = LZ4ByteBufferUtils.commonBytesBackward(byteBuffer, i17, i23, i18, i25);
                int i32 = i23 - iCommonBytesBackward;
                int i33 = i17 - iCommonBytesBackward;
                int i34 = i32 - i25;
                int iWriteLen = i24 + 1;
                if (iWriteLen + i34 + 8 + (i34 >>> 8) <= i14) {
                    if (i34 >= 15) {
                        ByteBufferUtils.writeByte(byteBuffer2, i24, 240);
                        iWriteLen = LZ4ByteBufferUtils.writeLen(i34 - 15, byteBuffer2, iWriteLen);
                    } else {
                        ByteBufferUtils.writeByte(byteBuffer2, i24, i34 << 4);
                    }
                    LZ4ByteBufferUtils.wildArraycopy(byteBuffer, i25, byteBuffer2, iWriteLen, i34);
                    int i35 = iWriteLen + i34;
                    while (true) {
                        ByteBufferUtils.writeShortLE(byteBuffer2, i35, (short) (i32 - i33));
                        int iWriteLen2 = i35 + 2;
                        int i36 = i32 + 4;
                        int iCommonBytes = LZ4ByteBufferUtils.commonBytes(byteBuffer, i33 + 4, i36, i21);
                        if (i35 + 8 + (iCommonBytes >>> 8) > i14) {
                            throw new LZ4Exception("maxDestLen is too small");
                        }
                        i32 = i36 + iCommonBytes;
                        if (iCommonBytes >= 15) {
                            ByteBufferUtils.writeByte(byteBuffer2, i24, ByteBufferUtils.readByte(byteBuffer2, i24) | 15);
                            iWriteLen2 = LZ4ByteBufferUtils.writeLen(iCommonBytes - 15, byteBuffer2, iWriteLen2);
                        } else {
                            ByteBufferUtils.writeByte(byteBuffer2, i24, iCommonBytes | ByteBufferUtils.readByte(byteBuffer2, i24));
                        }
                        i24 = iWriteLen2;
                        if (i32 > i22) {
                            i18 = i32;
                            break loop0;
                        }
                        int i37 = i32 - 2;
                        UnsafeUtils.writeShort(sArr, LZ4Utils.hash64k(ByteBufferUtils.readInt(byteBuffer, i37)), i37 - i18);
                        int iHash64k2 = LZ4Utils.hash64k(ByteBufferUtils.readInt(byteBuffer, i32));
                        i33 = i18 + UnsafeUtils.readShort(sArr, iHash64k2);
                        UnsafeUtils.writeShort(sArr, iHash64k2, i32 - i18);
                        if (!LZ4ByteBufferUtils.readIntEquals(byteBuffer, i32, i33)) {
                            break;
                        }
                        i35 = i24 + 1;
                        ByteBufferUtils.writeByte(byteBuffer2, i24, 0);
                    }
                    i25 = i32;
                    i23 = i32 + 1;
                    i19 = i15;
                } else {
                    throw new LZ4Exception("maxDestLen is too small");
                }
            }
            i16 = i24;
        } else {
            i15 = i19;
            i16 = i13;
        }
        return LZ4ByteBufferUtils.lastLiterals(byteBuffer, i18, i15 - i18, byteBuffer2, i16, i14) - i13;
    }

    @Override // net.jpountz.lz4.LZ4Compressor
    public int compress(ByteBuffer byteBuffer, int i11, int i12, ByteBuffer byteBuffer2, int i13, int i14) {
        int i15;
        int i16;
        int i17;
        int i18;
        if (byteBuffer.hasArray() && byteBuffer2.hasArray()) {
            return compress(byteBuffer.array(), byteBuffer.arrayOffset() + i11, i12, byteBuffer2.array(), i13 + byteBuffer2.arrayOffset(), i14);
        }
        ByteBuffer byteBufferInNativeByteOrder = ByteBufferUtils.inNativeByteOrder(byteBuffer);
        ByteBuffer byteBufferInNativeByteOrder2 = ByteBufferUtils.inNativeByteOrder(byteBuffer2);
        ByteBufferUtils.checkRange(byteBufferInNativeByteOrder, i11, i12);
        ByteBufferUtils.checkRange(byteBufferInNativeByteOrder2, i13, i14);
        int i19 = i13 + i14;
        if (i12 < 65547) {
            return compress64k(byteBufferInNativeByteOrder, i11, i12, byteBufferInNativeByteOrder2, i13, i19);
        }
        int i21 = i11 + i12;
        int i22 = i21 - 5;
        int i23 = i21 - 12;
        int[] iArr = new int[4096];
        Arrays.fill(iArr, i11);
        int i24 = i13;
        int i25 = i11 + 1;
        int i26 = i11;
        loop0: while (true) {
            int i27 = 1;
            int i28 = 1 << LZ4Constants.SKIP_STRENGTH;
            while (true) {
                int i29 = i27 + i25;
                int i31 = i28 + 1;
                int i32 = i28 >>> LZ4Constants.SKIP_STRENGTH;
                if (i29 > i23) {
                    i15 = i21;
                    i16 = i26;
                    break loop0;
                }
                int iHash = LZ4Utils.hash(ByteBufferUtils.readInt(byteBufferInNativeByteOrder, i25));
                i17 = UnsafeUtils.readInt(iArr, iHash);
                i15 = i21;
                i18 = i25 - i17;
                UnsafeUtils.writeInt(iArr, iHash, i25);
                if (i18 >= 65536 || !LZ4ByteBufferUtils.readIntEquals(byteBufferInNativeByteOrder, i17, i25)) {
                    i21 = i15;
                    i25 = i29;
                    i27 = i32;
                    i28 = i31;
                }
            }
            int iCommonBytesBackward = LZ4ByteBufferUtils.commonBytesBackward(byteBufferInNativeByteOrder, i17, i25, i11, i26);
            int i33 = i25 - iCommonBytesBackward;
            int i34 = i17 - iCommonBytesBackward;
            int i35 = i33 - i26;
            int iWriteLen = i24 + 1;
            if (iWriteLen + i35 + 8 + (i35 >>> 8) <= i19) {
                if (i35 >= 15) {
                    ByteBufferUtils.writeByte(byteBufferInNativeByteOrder2, i24, 240);
                    iWriteLen = LZ4ByteBufferUtils.writeLen(i35 - 15, byteBufferInNativeByteOrder2, iWriteLen);
                } else {
                    ByteBufferUtils.writeByte(byteBufferInNativeByteOrder2, i24, i35 << 4);
                }
                LZ4ByteBufferUtils.wildArraycopy(byteBufferInNativeByteOrder, i26, byteBufferInNativeByteOrder2, iWriteLen, i35);
                int i36 = iWriteLen + i35;
                while (true) {
                    ByteBufferUtils.writeShortLE(byteBufferInNativeByteOrder2, i36, i18);
                    int iWriteLen2 = i36 + 2;
                    int i37 = i33 + 4;
                    int iCommonBytes = LZ4ByteBufferUtils.commonBytes(byteBufferInNativeByteOrder, i34 + 4, i37, i22);
                    if (i36 + 8 + (iCommonBytes >>> 8) > i19) {
                        throw new LZ4Exception("maxDestLen is too small");
                    }
                    i33 = i37 + iCommonBytes;
                    if (iCommonBytes >= 15) {
                        ByteBufferUtils.writeByte(byteBufferInNativeByteOrder2, i24, ByteBufferUtils.readByte(byteBufferInNativeByteOrder2, i24) | 15);
                        iWriteLen2 = LZ4ByteBufferUtils.writeLen(iCommonBytes - 15, byteBufferInNativeByteOrder2, iWriteLen2);
                    } else {
                        ByteBufferUtils.writeByte(byteBufferInNativeByteOrder2, i24, iCommonBytes | ByteBufferUtils.readByte(byteBufferInNativeByteOrder2, i24));
                    }
                    i24 = iWriteLen2;
                    if (i33 > i23) {
                        i16 = i33;
                        break loop0;
                    }
                    int i38 = i33 - 2;
                    UnsafeUtils.writeInt(iArr, LZ4Utils.hash(ByteBufferUtils.readInt(byteBufferInNativeByteOrder, i38)), i38);
                    int iHash2 = LZ4Utils.hash(ByteBufferUtils.readInt(byteBufferInNativeByteOrder, i33));
                    i34 = UnsafeUtils.readInt(iArr, iHash2);
                    UnsafeUtils.writeInt(iArr, iHash2, i33);
                    i18 = i33 - i34;
                    if (i18 >= 65536 || !LZ4ByteBufferUtils.readIntEquals(byteBufferInNativeByteOrder, i34, i33)) {
                        i26 = i33;
                        i25 = i33 + 1;
                        i21 = i15;
                    } else {
                        i36 = i24 + 1;
                        ByteBufferUtils.writeByte(byteBufferInNativeByteOrder2, i24, 0);
                    }
                }
            } else {
                throw new LZ4Exception("maxDestLen is too small");
            }
        }
        return LZ4ByteBufferUtils.lastLiterals(byteBufferInNativeByteOrder, i16, i15 - i16, byteBufferInNativeByteOrder2, i24, i19) - i13;
    }
}
