package com.google.android.gms.measurement.internal;

import androidx.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzlt {

    @Nullable
    public final String zza;

    @Nullable
    public final String zzb;
    public final long zzc;
    boolean zzd;
    public final boolean zze;
    public final long zzf;

    public zzlt(@Nullable String str, @Nullable String str2, long j11, boolean z11, long j12) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = j11;
        this.zzd = false;
        this.zze = z11;
        this.zzf = j12;
    }

    public zzlt(@Nullable String str, @Nullable String str2, long j11) {
        this(str, str2, j11, false, 0L);
    }
}
