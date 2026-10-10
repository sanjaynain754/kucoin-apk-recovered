package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@22.5.0 */
/* JADX INFO: loaded from: classes45.dex */
final class zzhm implements com.google.android.gms.internal.measurement.zzr {
    final /* synthetic */ zzhs zza;

    @Override // com.google.android.gms.internal.measurement.zzr
    public final void zza(int i11, String str, List list, boolean z11, boolean z12) {
        zzgr zzgrVarZzj;
        int i12 = i11 - 1;
        if (i12 == 0) {
            zzgrVarZzj = this.zza.zzu.zzaV().zzj();
        } else if (i12 != 1) {
            if (i12 == 3) {
                zzgrVarZzj = this.zza.zzu.zzaV().zzk();
            } else if (i12 != 4) {
                zzgrVarZzj = this.zza.zzu.zzaV().zzi();
            } else if (z11) {
                zzgrVarZzj = this.zza.zzu.zzaV().zzf();
            } else {
                zzgrVarZzj = !z12 ? this.zza.zzu.zzaV().zzh() : this.zza.zzu.zzaV().zze();
            }
        } else if (z11) {
            zzgrVarZzj = this.zza.zzu.zzaV().zzc();
        } else {
            zzgrVarZzj = !z12 ? this.zza.zzu.zzaV().zzd() : this.zza.zzu.zzaV().zzb();
        }
        int size = list.size();
        if (size == 1) {
            zzgrVarZzj.zzb(str, list.get(0));
            return;
        }
        if (size == 2) {
            zzgrVarZzj.zzc(str, list.get(0), list.get(1));
        } else if (size != 3) {
            zzgrVarZzj.zza(str);
        } else {
            zzgrVarZzj.zzd(str, list.get(0), list.get(1), list.get(2));
        }
    }

    public zzhm(zzhs zzhsVar) {
        Objects.requireNonNull(zzhsVar);
        this.zza = zzhsVar;
    }
}
