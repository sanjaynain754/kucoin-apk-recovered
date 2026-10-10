package com.google.android.gms.internal.common;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
/* JADX INFO: loaded from: classes45.dex */
abstract class zzz extends zzm {
    final CharSequence zzb;
    final zzr zzc;
    final boolean zzd;
    int zze = 0;
    int zzf = Integer.MAX_VALUE;

    public abstract int zzc(int i11);

    public abstract int zzd(int i11);

    @Override // com.google.android.gms.internal.common.zzm
    public final /* bridge */ /* synthetic */ Object zza() {
        int iZzc;
        int i11 = this.zze;
        while (true) {
            int i12 = this.zze;
            if (i12 == -1) {
                zzb();
                return null;
            }
            int iZzd = zzd(i12);
            if (iZzd == -1) {
                iZzd = this.zzb.length();
                this.zze = -1;
                iZzc = -1;
            } else {
                iZzc = zzc(iZzd);
                this.zze = iZzc;
            }
            if (iZzc == i11) {
                int i13 = iZzc + 1;
                this.zze = i13;
                if (i13 > this.zzb.length()) {
                    this.zze = -1;
                }
            } else {
                if (i11 < iZzd) {
                    this.zzb.charAt(i11);
                }
                if (i11 < iZzd) {
                    this.zzb.charAt(iZzd - 1);
                }
                if (!this.zzd || i11 != iZzd) {
                    int i14 = this.zzf;
                    if (i14 == 1) {
                        iZzd = this.zzb.length();
                        this.zze = -1;
                        if (iZzd > i11) {
                            this.zzb.charAt(iZzd - 1);
                        }
                    } else {
                        this.zzf = i14 - 1;
                    }
                    return this.zzb.subSequence(i11, iZzd).toString();
                }
                i11 = this.zze;
            }
        }
    }

    public zzz(zzaa zzaaVar, CharSequence charSequence) {
        this.zzc = zzaaVar.zza;
        this.zzd = zzaaVar.zzb;
        this.zzb = charSequence;
    }
}
