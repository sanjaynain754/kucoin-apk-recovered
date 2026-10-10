package com.google.android.gms.internal.location;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* JADX INFO: loaded from: classes45.dex */
public final class zzbm {
    public static int zza(int i11, int i12, @NullableDecl String str) {
        String strZza;
        if (i11 >= 0 && i11 < i12) {
            return i11;
        }
        if (i11 < 0) {
            strZza = zzbn.zza("%s (%s) must not be negative", "index", Integer.valueOf(i11));
        } else {
            if (i12 < 0) {
                StringBuilder sb2 = new StringBuilder(26);
                sb2.append("negative size: ");
                sb2.append(i12);
                throw new IllegalArgumentException(sb2.toString());
            }
            strZza = zzbn.zza("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i11), Integer.valueOf(i12));
        }
        throw new IndexOutOfBoundsException(strZza);
    }

    public static int zzb(int i11, int i12, @NullableDecl String str) {
        if (i11 < 0 || i11 > i12) {
            throw new IndexOutOfBoundsException(zzd(i11, i12, "index"));
        }
        return i11;
    }

    public static void zzc(int i11, int i12, int i13) {
        String strZzd;
        if (i11 < 0 || i12 < i11 || i12 > i13) {
            if (i11 < 0 || i11 > i13) {
                strZzd = zzd(i11, i13, "start index");
            } else {
                strZzd = (i12 < 0 || i12 > i13) ? zzd(i12, i13, "end index") : zzbn.zza("end index (%s) must not be less than start index (%s)", Integer.valueOf(i12), Integer.valueOf(i11));
            }
            throw new IndexOutOfBoundsException(strZzd);
        }
    }

    private static String zzd(int i11, int i12, @NullableDecl String str) {
        if (i11 < 0) {
            return zzbn.zza("%s (%s) must not be negative", str, Integer.valueOf(i11));
        }
        if (i12 >= 0) {
            return zzbn.zza("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i11), Integer.valueOf(i12));
        }
        StringBuilder sb2 = new StringBuilder(26);
        sb2.append("negative size: ");
        sb2.append(i12);
        throw new IllegalArgumentException(sb2.toString());
    }
}
