package com.google.android.gms.internal.auth;

import sun.misc.Unsafe;

/* JADX INFO: compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* JADX INFO: loaded from: classes45.dex */
abstract class zzhi {
    final Unsafe zza;

    public abstract double zza(Object obj, long j11);

    public abstract float zzb(Object obj, long j11);

    public abstract void zzc(Object obj, long j11, boolean z11);

    public abstract void zzd(Object obj, long j11, double d11);

    public abstract void zze(Object obj, long j11, float f11);

    public abstract boolean zzf(Object obj, long j11);

    public zzhi(Unsafe unsafe) {
        this.zza = unsafe;
    }
}
