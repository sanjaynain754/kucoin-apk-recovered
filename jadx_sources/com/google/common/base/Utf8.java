package com.google.common.base;

import com.google.common.annotations.GwtCompatible;
import org.tensorflow.lite.schema.BuiltinOptions;

/* JADX INFO: loaded from: classes56.dex */
@GwtCompatible(emulated = true)
@ElementTypesAreNonnullByDefault
public final class Utf8 {
    public static boolean isWellFormed(byte[] bArr) {
        return isWellFormed(bArr, 0, bArr.length);
    }

    public static boolean isWellFormed(byte[] bArr, int i11, int i12) {
        int i13 = i12 + i11;
        Preconditions.checkPositionIndexes(i11, i13, bArr.length);
        while (i11 < i13) {
            if (bArr[i11] < 0) {
                return isWellFormedSlowPath(bArr, i11, i13);
            }
            i11++;
        }
        return true;
    }

    private static boolean isWellFormedSlowPath(byte[] bArr, int i11, int i12) {
        byte b11;
        while (i11 < i12) {
            int i13 = i11 + 1;
            byte b12 = bArr[i11];
            if (b12 < 0) {
                if (b12 < -32) {
                    if (i13 != i12 && b12 >= -62) {
                        i11 += 2;
                        if (bArr[i13] > -65) {
                        }
                    }
                    return false;
                }
                if (b12 < -16) {
                    int i14 = i11 + 2;
                    if (i14 < i12 && (b11 = bArr[i13]) <= -65 && ((b12 != -32 || b11 >= -96) && (b12 != -19 || -96 > b11))) {
                        i11 += 3;
                        if (bArr[i14] > -65) {
                        }
                    }
                    return false;
                }
                if (i11 + 3 >= i12) {
                    return false;
                }
                int i15 = i11 + 2;
                byte b13 = bArr[i13];
                if (b13 <= -65 && (((b12 << 28) + (b13 + BuiltinOptions.ReadVariableOptions)) >> 30) == 0) {
                    int i16 = i11 + 3;
                    if (bArr[i15] <= -65) {
                        i11 += 4;
                        if (bArr[i16] > -65) {
                        }
                    }
                }
                return false;
            }
            i11 = i13;
        }
        return true;
    }

    private static String unpairedSurrogateMsg(int i11) {
        return "Unpaired surrogate at index " + i11;
    }

    private Utf8() {
    }

    public static int encodedLength(CharSequence charSequence) {
        int length = charSequence.length();
        int i11 = 0;
        while (i11 < length && charSequence.charAt(i11) < 128) {
            i11++;
        }
        int iEncodedLengthGeneral = length;
        while (i11 < length) {
            char cCharAt = charSequence.charAt(i11);
            if (cCharAt < 2048) {
                iEncodedLengthGeneral += (127 - cCharAt) >>> 31;
                i11++;
            } else {
                iEncodedLengthGeneral += encodedLengthGeneral(charSequence, i11);
                break;
            }
        }
        if (iEncodedLengthGeneral >= length) {
            return iEncodedLengthGeneral;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (((long) iEncodedLengthGeneral) + 4294967296L));
    }

    private static int encodedLengthGeneral(CharSequence charSequence, int i11) {
        int length = charSequence.length();
        int i12 = 0;
        while (i11 < length) {
            char cCharAt = charSequence.charAt(i11);
            if (cCharAt < 2048) {
                i12 += (127 - cCharAt) >>> 31;
            } else {
                i12 += 2;
                if (55296 <= cCharAt && cCharAt <= 57343) {
                    if (Character.codePointAt(charSequence, i11) != cCharAt) {
                        i11++;
                    } else {
                        throw new IllegalArgumentException(unpairedSurrogateMsg(i11));
                    }
                }
            }
            i11++;
        }
        return i12;
    }
}
