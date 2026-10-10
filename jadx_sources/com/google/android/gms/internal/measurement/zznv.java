package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@22.5.0 */
/* JADX INFO: loaded from: classes45.dex */
final class zznv implements zzni {
    private final zznl zza;
    private final String zzb;
    private final Object[] zzc;
    private final int zzd;

    @Override // com.google.android.gms.internal.measurement.zzni
    public final boolean zza() {
        return (this.zzd & 2) == 2;
    }

    @Override // com.google.android.gms.internal.measurement.zzni
    public final zznl zzb() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzni
    public final int zzc() {
        int i11 = this.zzd;
        if ((i11 & 1) != 0) {
            return 1;
        }
        return (i11 & 4) == 4 ? 3 : 2;
    }

    public final String zzd() {
        return this.zzb;
    }

    public final Object[] zze() {
        return this.zzc;
    }

    public zznv(zznl zznlVar, String str, Object[] objArr) {
        this.zza = zznlVar;
        this.zzb = str;
        this.zzc = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.zzd = cCharAt;
            return;
        }
        int i11 = cCharAt & 8191;
        int i12 = 1;
        int i13 = 13;
        while (true) {
            int i14 = i12 + 1;
            char cCharAt2 = str.charAt(i12);
            if (cCharAt2 >= 55296) {
                i11 |= (cCharAt2 & 8191) << i13;
                i13 += 13;
                i12 = i14;
            } else {
                this.zzd = i11 | (cCharAt2 << i13);
                return;
            }
        }
    }
}
