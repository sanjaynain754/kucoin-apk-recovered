package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import androidx.annotation.Nullable;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@22.5.0 */
/* JADX INFO: loaded from: classes45.dex */
public final class zzpi {
    private final long zza;
    private final com.google.android.gms.internal.measurement.zzib zzb;
    private final String zzc;
    private final Map zzd;
    private final zzlr zze;
    private final long zzf;
    private final long zzg;
    private final long zzh;
    private final int zzi;

    public final zzos zza() {
        return new zzos(this.zzc, this.zzd, this.zze, null);
    }

    public final zzol zzb() {
        Bundle bundle = new Bundle();
        for (Map.Entry entry : this.zzd.entrySet()) {
            bundle.putString((String) entry.getKey(), (String) entry.getValue());
        }
        long j11 = this.zza;
        com.google.android.gms.internal.measurement.zzib zzibVar = this.zzb;
        String str = this.zzc;
        zzlr zzlrVar = this.zze;
        return new zzol(j11, zzibVar.zzcc(), str, bundle, zzlrVar.zza(), this.zzg, "");
    }

    public final long zzc() {
        return this.zza;
    }

    @Nullable
    public final com.google.android.gms.internal.measurement.zzib zzd() {
        return this.zzb;
    }

    public final String zze() {
        return this.zzc;
    }

    public final zzlr zzf() {
        return this.zze;
    }

    public final long zzg() {
        return this.zzf;
    }

    public final long zzh() {
        return this.zzh;
    }

    public final int zzi() {
        return this.zzi;
    }

    public /* synthetic */ zzpi(long j11, com.google.android.gms.internal.measurement.zzib zzibVar, String str, Map map, zzlr zzlrVar, long j12, long j13, long j14, int i11, byte[] bArr) {
        this.zza = j11;
        this.zzb = zzibVar;
        this.zzc = str;
        this.zzd = map;
        this.zze = zzlrVar;
        this.zzf = j12;
        this.zzg = j13;
        this.zzh = j14;
        this.zzi = i11;
    }
}
