package com.google.android.gms.measurement.internal;

import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@22.5.0 */
/* JADX INFO: loaded from: classes45.dex */
@VisibleForTesting
final class zzpd {
    private final zzpf zza;
    private int zzb = 1;
    private long zzc = zzd();

    private final long zzd() {
        zzpf zzpfVar = this.zza;
        Preconditions.checkNotNull(zzpfVar);
        long jLongValue = ((Long) zzfx.zzu.zzb(null)).longValue();
        long jLongValue2 = ((Long) zzfx.zzv.zzb(null)).longValue();
        for (int i11 = 1; i11 < this.zzb; i11++) {
            jLongValue += jLongValue;
            if (jLongValue >= jLongValue2) {
                break;
            }
        }
        return zzpfVar.zzaZ().currentTimeMillis() + Math.min(jLongValue, jLongValue2);
    }

    public final void zza() {
        this.zzb++;
        this.zzc = zzd();
    }

    public final boolean zzb() {
        return this.zza.zzaZ().currentTimeMillis() >= this.zzc;
    }

    public final /* synthetic */ long zzc() {
        return this.zzc;
    }

    public zzpd(zzpf zzpfVar) {
        this.zza = zzpfVar;
    }
}
