package com.google.android.gms.internal.fido;

import java.math.RoundingMode;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* JADX INFO: loaded from: classes45.dex */
public final class zzgh {
    public static int zzb(int i11, RoundingMode roundingMode) {
        if (i11 <= 0) {
            throw new IllegalArgumentException("x (0) must be > 0");
        }
        switch (zzgg.zza[roundingMode.ordinal()]) {
            case 1:
                zzgi.zza(((i11 + (-1)) & i11) == 0);
                break;
            case 2:
            case 3:
                break;
            case 4:
            case 5:
                return 32 - Integer.numberOfLeadingZeros(i11 - 1);
            case 6:
            case 7:
            case 8:
                int iNumberOfLeadingZeros = Integer.numberOfLeadingZeros(i11);
                return (31 - iNumberOfLeadingZeros) + ((((-1257966797) >>> iNumberOfLeadingZeros) - i11) >>> 31);
            default:
                throw new AssertionError();
        }
        return 31 - Integer.numberOfLeadingZeros(i11);
    }

    public static int zza(int i11, int i12, RoundingMode roundingMode) {
        roundingMode.getClass();
        if (i12 != 0) {
            int i13 = i11 / i12;
            int i14 = i11 - (i12 * i13);
            if (i14 != 0) {
                int i15 = 1;
                int i16 = ((i11 ^ i12) >> 31) | 1;
                switch (zzgg.zza[roundingMode.ordinal()]) {
                    case 1:
                        zzgi.zza(false);
                        return i13;
                    case 2:
                        return i13;
                    case 3:
                        if (i16 >= 0) {
                            return i13;
                        }
                        break;
                    case 4:
                        break;
                    case 5:
                        if (i16 <= 0) {
                            return i13;
                        }
                        break;
                    case 6:
                    case 7:
                    case 8:
                        int iAbs = Math.abs(i14);
                        int iAbs2 = iAbs - (Math.abs(i12) - iAbs);
                        if (iAbs2 == 0) {
                            if (roundingMode != RoundingMode.HALF_UP) {
                                if (roundingMode != RoundingMode.HALF_EVEN) {
                                    i15 = 0;
                                }
                                if ((i13 & 1 & i15) == 0) {
                                    return i13;
                                }
                            }
                        } else if (iAbs2 <= 0) {
                            return i13;
                        }
                    default:
                        throw new AssertionError();
                }
                return i13 + i16;
            }
            return i13;
        }
        throw new ArithmeticException("/ by zero");
    }
}
