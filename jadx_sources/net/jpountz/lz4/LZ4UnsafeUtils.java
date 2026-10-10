package net.jpountz.lz4;

import java.nio.ByteOrder;
import net.jpountz.util.UnsafeUtils;
import net.jpountz.util.Utils;
import p852kotlin.UShort;

/* JADX INFO: loaded from: classes61.dex */
enum LZ4UnsafeUtils {
    ;

    static final /* synthetic */ boolean $assertionsDisabled = false;

    public static int commonBytes(byte[] bArr, int i11, int i12, int i13) {
        int iNumberOfTrailingZeros;
        int i14 = 0;
        while (i12 <= i13 - 8) {
            if (UnsafeUtils.readLong(bArr, i12) != UnsafeUtils.readLong(bArr, i11)) {
                if (Utils.NATIVE_BYTE_ORDER == ByteOrder.BIG_ENDIAN) {
                    iNumberOfTrailingZeros = Long.numberOfLeadingZeros(UnsafeUtils.readLong(bArr, i11) ^ UnsafeUtils.readLong(bArr, i12));
                } else {
                    iNumberOfTrailingZeros = Long.numberOfTrailingZeros(UnsafeUtils.readLong(bArr, i11) ^ UnsafeUtils.readLong(bArr, i12));
                }
                return i14 + (iNumberOfTrailingZeros >>> 3);
            }
            i14 += 8;
            i11 += 8;
            i12 += 8;
        }
        while (i12 < i13) {
            int i15 = i11 + 1;
            int i16 = i12 + 1;
            if (UnsafeUtils.readByte(bArr, i11) != UnsafeUtils.readByte(bArr, i12)) {
                break;
            }
            i14++;
            i11 = i15;
            i12 = i16;
        }
        return i14;
    }

    public static int commonBytesBackward(byte[] bArr, int i11, int i12, int i13, int i14) {
        int i15 = 0;
        while (i11 > i13 && i12 > i14) {
            i11--;
            i12--;
            if (UnsafeUtils.readByte(bArr, i11) != UnsafeUtils.readByte(bArr, i12)) {
                break;
            }
            i15++;
        }
        return i15;
    }

    public static void safeIncrementalCopy(byte[] bArr, int i11, int i12, int i13) {
        for (int i14 = 0; i14 < i13; i14++) {
            int i15 = i12 + i14;
            int i16 = i11 + i14;
            bArr[i15] = bArr[i16];
            UnsafeUtils.writeByte(bArr, i15, UnsafeUtils.readByte(bArr, i16));
        }
    }

    public static void wildArraycopy(byte[] bArr, int i11, byte[] bArr2, int i12, int i13) {
        for (int i14 = 0; i14 < i13; i14 += 8) {
            UnsafeUtils.writeLong(bArr2, i12 + i14, UnsafeUtils.readLong(bArr, i11 + i14));
        }
    }

    public static void writeShortLittleEndian(byte[] bArr, int i11, int i12) {
        short sReverseBytes = (short) i12;
        if (Utils.NATIVE_BYTE_ORDER == ByteOrder.BIG_ENDIAN) {
            sReverseBytes = Short.reverseBytes(sReverseBytes);
        }
        UnsafeUtils.writeShort(bArr, i11, sReverseBytes);
    }

    public static int encodeSequence(byte[] bArr, int i11, int i12, int i13, int i14, byte[] bArr2, int i15, int i16) {
        int i17;
        int i18;
        int i19 = i12 - i11;
        int iWriteLen = i15 + 1;
        if (i19 >= 15) {
            iWriteLen = writeLen(i19 - 15, bArr2, iWriteLen);
            i17 = -16;
        } else {
            i17 = i19 << 4;
        }
        wildArraycopy(bArr, i11, bArr2, iWriteLen, i19);
        int i21 = iWriteLen + i19;
        int i22 = i12 - i13;
        bArr2[i21] = (byte) i22;
        int iWriteLen2 = i21 + 2;
        bArr2[i21 + 1] = (byte) (i22 >>> 8);
        int i23 = i14 - 4;
        if (i21 + 8 + (i23 >>> 8) > i16) {
            throw new LZ4Exception("maxDestLen is too small");
        }
        if (i23 >= 15) {
            i18 = i17 | 15;
            iWriteLen2 = writeLen(i14 - 19, bArr2, iWriteLen2);
        } else {
            i18 = i23 | i17;
        }
        bArr2[i15] = (byte) i18;
        return iWriteLen2;
    }

    public static void safeArraycopy(byte[] bArr, int i11, byte[] bArr2, int i12, int i13) {
        int i14 = i13 & (-8);
        wildArraycopy(bArr, i11, bArr2, i12, i14);
        int i15 = i13 & 7;
        for (int i16 = 0; i16 < i15; i16++) {
            UnsafeUtils.writeByte(bArr2, i12 + i14 + i16, UnsafeUtils.readByte(bArr, i11 + i14 + i16));
        }
    }

    public static void wildIncrementalCopy(byte[] bArr, int i11, int i12, int i13) {
        int i14 = i12 - i11;
        if (i14 < 4) {
            int i15 = 0;
            for (int i16 = 0; i16 < 4; i16++) {
                UnsafeUtils.writeByte(bArr, i12 + i16, UnsafeUtils.readByte(bArr, i11 + i16));
            }
            int i17 = i12 + 4;
            int i18 = i11 + 4;
            int i19 = i17 - i18;
            if (i19 == 1) {
                i18 = i11 + 1;
            } else if (i19 == 2) {
                i18 = i11 + 2;
            } else if (i19 == 3) {
                i18 = i11 + 1;
                i15 = -1;
            } else if (i19 == 5) {
                i15 = 1;
            } else if (i19 == 6) {
                i15 = 2;
            } else if (i19 == 7) {
                i15 = 3;
            }
            UnsafeUtils.writeInt(bArr, i17, UnsafeUtils.readInt(bArr, i18));
            i12 += 8;
            i11 = i18 - i15;
        } else if (i14 < 8) {
            UnsafeUtils.writeLong(bArr, i12, UnsafeUtils.readLong(bArr, i11));
            i12 += i14;
        }
        while (i12 < i13) {
            UnsafeUtils.writeLong(bArr, i12, UnsafeUtils.readLong(bArr, i11));
            i12 += 8;
            i11 += 8;
        }
    }

    public static int writeLen(int i11, byte[] bArr, int i12) {
        while (i11 >= 255) {
            UnsafeUtils.writeByte(bArr, i12, 255);
            i11 -= 255;
            i12++;
        }
        int i13 = i12 + 1;
        UnsafeUtils.writeByte(bArr, i12, i11);
        return i13;
    }

    public static int lastLiterals(byte[] bArr, int i11, int i12, byte[] bArr2, int i13, int i14) {
        return LZ4SafeUtils.lastLiterals(bArr, i11, i12, bArr2, i13, i14);
    }

    public static boolean readIntEquals(byte[] bArr, int i11, int i12) {
        if (UnsafeUtils.readInt(bArr, i11) == UnsafeUtils.readInt(bArr, i12)) {
            return true;
        }
        return false;
    }

    public static int readShortLittleEndian(byte[] bArr, int i11) {
        short sReverseBytes = UnsafeUtils.readShort(bArr, i11);
        if (Utils.NATIVE_BYTE_ORDER == ByteOrder.BIG_ENDIAN) {
            sReverseBytes = Short.reverseBytes(sReverseBytes);
        }
        return sReverseBytes & UShort.MAX_VALUE;
    }
}
