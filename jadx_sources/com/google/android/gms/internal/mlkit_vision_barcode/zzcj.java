package com.google.android.gms.internal.mlkit_vision_barcode;

/* JADX INFO: compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.3.1 */
/* JADX INFO: loaded from: classes45.dex */
final class zzcj {
    public static Object zzd(int i11) {
        if (i11 >= 2 && i11 <= 1073741824 && Integer.highestOneBit(i11) == i11) {
            if (i11 <= 256) {
                return new byte[i11];
            }
            return i11 <= 65536 ? new short[i11] : new int[i11];
        }
        throw new IllegalArgumentException("must be power of 2 between 2^1 and 2^30: " + i11);
    }

    public static int zza(int i11) {
        return (i11 < 32 ? 4 : 2) * (i11 + 1);
    }

    public static int zzc(Object obj, int i11) {
        if (obj instanceof byte[]) {
            return ((byte[]) obj)[i11] & 255;
        }
        return obj instanceof short[] ? (char) ((short[]) obj)[i11] : ((int[]) obj)[i11];
    }

    public static void zze(Object obj, int i11, int i12) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i11] = (byte) i12;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i11] = (short) i12;
        } else {
            ((int[]) obj)[i11] = i12;
        }
    }

    public static int zzb(Object obj, Object obj2, int i11, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int iZza = zzck.zza(obj);
        int i12 = iZza & i11;
        int iZzc = zzc(obj3, i12);
        if (iZzc != 0) {
            int i13 = ~i11;
            int i14 = iZza & i13;
            int i15 = -1;
            while (true) {
                int i16 = iZzc - 1;
                int i17 = iArr[i16];
                int i18 = i17 & i11;
                if ((i17 & i13) == i14 && zzax.zza(obj, objArr[i16]) && (objArr2 == null || zzax.zza(obj2, objArr2[i16]))) {
                    if (i15 == -1) {
                        zze(obj3, i12, i18);
                        return i16;
                    }
                    iArr[i15] = (iArr[i15] & i13) | (i18 & i11);
                    return i16;
                }
                if (i18 == 0) {
                    break;
                }
                i15 = i16;
                iZzc = i18;
            }
        }
        return -1;
    }
}
