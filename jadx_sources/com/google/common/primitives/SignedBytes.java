package com.google.common.primitives;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: loaded from: classes56.dex */
@ElementTypesAreNonnullByDefault
@GwtCompatible
public final class SignedBytes {
    public static final byte MAX_POWER_OF_TWO = 64;

    public enum LexicographicalComparator implements Comparator<byte[]> {
        INSTANCE;

        @Override // java.util.Comparator
        public int compare(byte[] bArr, byte[] bArr2) {
            int iMin = Math.min(bArr.length, bArr2.length);
            for (int i11 = 0; i11 < iMin; i11++) {
                int iCompare = Byte.compare(bArr[i11], bArr2[i11]);
                if (iCompare != 0) {
                    return iCompare;
                }
            }
            return bArr.length - bArr2.length;
        }

        @Override // java.lang.Enum
        public String toString() {
            return "SignedBytes.lexicographicalComparator()";
        }
    }

    public static byte checkedCast(long j11) {
        byte b11 = (byte) j11;
        Preconditions.checkArgument(((long) b11) == j11, "Out of range: %s", j11);
        return b11;
    }

    public static byte max(byte... bArr) {
        Preconditions.checkArgument(bArr.length > 0);
        byte b11 = bArr[0];
        for (int i11 = 1; i11 < bArr.length; i11++) {
            byte b12 = bArr[i11];
            if (b12 > b11) {
                b11 = b12;
            }
        }
        return b11;
    }

    public static byte min(byte... bArr) {
        Preconditions.checkArgument(bArr.length > 0);
        byte b11 = bArr[0];
        for (int i11 = 1; i11 < bArr.length; i11++) {
            byte b12 = bArr[i11];
            if (b12 < b11) {
                b11 = b12;
            }
        }
        return b11;
    }

    public static void sortDescending(byte[] bArr) {
        Preconditions.checkNotNull(bArr);
        sortDescending(bArr, 0, bArr.length);
    }

    public static Comparator<byte[]> lexicographicalComparator() {
        return LexicographicalComparator.INSTANCE;
    }

    public static byte saturatedCast(long j11) {
        if (j11 > 127) {
            return (byte) 127;
        }
        if (j11 < -128) {
            return (byte) -128;
        }
        return (byte) j11;
    }

    private SignedBytes() {
    }

    public static int compare(byte b11, byte b12) {
        return Byte.compare(b11, b12);
    }

    public static String join(String str, byte... bArr) {
        Preconditions.checkNotNull(str);
        if (bArr.length == 0) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder(bArr.length * 5);
        sb2.append((int) bArr[0]);
        for (int i11 = 1; i11 < bArr.length; i11++) {
            sb2.append(str);
            sb2.append((int) bArr[i11]);
        }
        return sb2.toString();
    }

    public static void sortDescending(byte[] bArr, int i11, int i12) {
        Preconditions.checkNotNull(bArr);
        Preconditions.checkPositionIndexes(i11, i12, bArr.length);
        Arrays.sort(bArr, i11, i12);
        Bytes.reverse(bArr, i11, i12);
    }
}
