package net.jpountz.lz4;

import net.jpountz.util.SafeUtils;

/* JADX INFO: loaded from: classes61.dex */
enum LZ4SafeUtils {
    ;

    public static class Match {
        int len;
        int ref;
        int start;

        public int end() {
            return this.start + this.len;
        }

        public void fix(int i11) {
            this.start += i11;
            this.ref += i11;
            this.len -= i11;
        }
    }

    public static int commonBytes(byte[] bArr, int i11, int i12, int i13) {
        int i14 = 0;
        while (i12 < i13) {
            int i15 = i11 + 1;
            int i16 = i12 + 1;
            if (bArr[i11] != bArr[i12]) {
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
            if (bArr[i11] != bArr[i12]) {
                break;
            }
            i15++;
        }
        return i15;
    }

    public static void copy8Bytes(byte[] bArr, int i11, byte[] bArr2, int i12) {
        for (int i13 = 0; i13 < 8; i13++) {
            bArr2[i12 + i13] = bArr[i11 + i13];
        }
    }

    public static void safeIncrementalCopy(byte[] bArr, int i11, int i12, int i13) {
        for (int i14 = 0; i14 < i13; i14++) {
            bArr[i12 + i14] = bArr[i11 + i14];
        }
    }

    public static void wildArraycopy(byte[] bArr, int i11, byte[] bArr2, int i12, int i13) {
        for (int i14 = 0; i14 < i13; i14 += 8) {
            try {
                copy8Bytes(bArr, i11 + i14, bArr2, i12 + i14);
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw new LZ4Exception("Malformed input at offset " + i11);
            }
        }
    }

    public static void copyTo(Match match, Match match2) {
        match2.len = match.len;
        match2.start = match.start;
        match2.ref = match.ref;
    }

    public static int encodeSequence(byte[] bArr, int i11, int i12, int i13, int i14, byte[] bArr2, int i15, int i16) {
        int i17;
        int i18;
        int i19 = i12 - i11;
        int iWriteLen = i15 + 1;
        if (iWriteLen + i19 + 8 + (i19 >>> 8) > i16) {
            throw new LZ4Exception("maxDestLen is too small");
        }
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

    public static int lastLiterals(byte[] bArr, int i11, int i12, byte[] bArr2, int i13, int i14) {
        int iWriteLen;
        if (i13 + i12 + 1 + ((i12 + 240) / 255) > i14) {
            throw new LZ4Exception();
        }
        if (i12 >= 15) {
            bArr2[i13] = -16;
            iWriteLen = writeLen(i12 - 15, bArr2, i13 + 1);
        } else {
            bArr2[i13] = (byte) (i12 << 4);
            iWriteLen = i13 + 1;
        }
        System.arraycopy(bArr, i11, bArr2, iWriteLen, i12);
        return iWriteLen + i12;
    }

    public static boolean readIntEquals(byte[] bArr, int i11, int i12) {
        return bArr[i11] == bArr[i12] && bArr[i11 + 1] == bArr[i12 + 1] && bArr[i11 + 2] == bArr[i12 + 2] && bArr[i11 + 3] == bArr[i12 + 3];
    }

    public static int writeLen(int i11, byte[] bArr, int i12) {
        while (i11 >= 255) {
            bArr[i12] = -1;
            i11 -= 255;
            i12++;
        }
        int i13 = i12 + 1;
        bArr[i12] = (byte) i11;
        return i13;
    }

    public static int hash(byte[] bArr, int i11) {
        return LZ4Utils.hash(SafeUtils.readInt(bArr, i11));
    }

    public static int hash64k(byte[] bArr, int i11) {
        return LZ4Utils.hash64k(SafeUtils.readInt(bArr, i11));
    }

    public static void safeArraycopy(byte[] bArr, int i11, byte[] bArr2, int i12, int i13) {
        System.arraycopy(bArr, i11, bArr2, i12, i13);
    }

    public static void wildIncrementalCopy(byte[] bArr, int i11, int i12, int i13) {
        do {
            copy8Bytes(bArr, i11, bArr, i12);
            i11 += 8;
            i12 += 8;
        } while (i12 < i13);
    }
}
