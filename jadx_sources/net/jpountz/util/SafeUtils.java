package net.jpountz.util;

import java.nio.ByteOrder;
import p852kotlin.UShort;

/* JADX INFO: loaded from: classes61.dex */
public enum SafeUtils {
    ;

    public static void checkRange(byte[] bArr, int i11) {
        if (i11 < 0 || i11 >= bArr.length) {
            throw new ArrayIndexOutOfBoundsException(i11);
        }
    }

    public static int readInt(byte[] bArr, int i11) {
        return Utils.NATIVE_BYTE_ORDER == ByteOrder.BIG_ENDIAN ? readIntBE(bArr, i11) : readIntLE(bArr, i11);
    }

    public static void writeByte(byte[] bArr, int i11, int i12) {
        bArr[i11] = (byte) i12;
    }

    public static void writeShort(short[] sArr, int i11, int i12) {
        sArr[i11] = (short) i12;
    }

    public static void checkLength(int i11) {
        if (i11 < 0) {
            throw new IllegalArgumentException("lengths must be >= 0");
        }
    }

    public static byte readByte(byte[] bArr, int i11) {
        return bArr[i11];
    }

    public static int readIntBE(byte[] bArr, int i11) {
        return (bArr[i11 + 3] & 255) | ((bArr[i11] & 255) << 24) | ((bArr[i11 + 1] & 255) << 16) | ((bArr[i11 + 2] & 255) << 8);
    }

    public static int readIntLE(byte[] bArr, int i11) {
        return ((bArr[i11 + 3] & 255) << 24) | (bArr[i11] & 255) | ((bArr[i11 + 1] & 255) << 8) | ((bArr[i11 + 2] & 255) << 16);
    }

    public static long readLongLE(byte[] bArr, int i11) {
        return ((((long) bArr[i11 + 7]) & 255) << 56) | (((long) bArr[i11]) & 255) | ((((long) bArr[i11 + 1]) & 255) << 8) | ((((long) bArr[i11 + 2]) & 255) << 16) | ((((long) bArr[i11 + 3]) & 255) << 24) | ((((long) bArr[i11 + 4]) & 255) << 32) | ((((long) bArr[i11 + 5]) & 255) << 40) | ((((long) bArr[i11 + 6]) & 255) << 48);
    }

    public static int readShort(short[] sArr, int i11) {
        return sArr[i11] & UShort.MAX_VALUE;
    }

    public static int readShortLE(byte[] bArr, int i11) {
        return ((bArr[i11 + 1] & 255) << 8) | (bArr[i11] & 255);
    }

    public static void writeInt(int[] iArr, int i11, int i12) {
        iArr[i11] = i12;
    }

    public static void writeShortLE(byte[] bArr, int i11, int i12) {
        bArr[i11] = (byte) i12;
        bArr[i11 + 1] = (byte) (i12 >>> 8);
    }

    public static void checkRange(byte[] bArr, int i11, int i12) {
        checkLength(i12);
        if (i12 > 0) {
            checkRange(bArr, i11);
            checkRange(bArr, (i11 + i12) - 1);
        }
    }

    public static int readInt(int[] iArr, int i11) {
        return iArr[i11];
    }
}
