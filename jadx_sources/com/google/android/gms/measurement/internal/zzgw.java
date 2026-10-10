package com.google.android.gms.measurement.internal;

import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@22.5.0 */
/* JADX INFO: loaded from: classes45.dex */
@WorkerThread
final class zzgw implements Runnable {
    private final zzgv zza;
    private final int zzb;
    private final Throwable zzc;
    private final byte[] zzd;
    private final String zze;
    private final Map zzf;

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zza(this.zze, this.zzb, this.zzc, this.zzd, this.zzf);
    }

    public /* synthetic */ zzgw(String str, zzgv zzgvVar, int i11, Throwable th2, byte[] bArr, Map map, byte[] bArr2) {
        Preconditions.checkNotNull(zzgvVar);
        this.zza = zzgvVar;
        this.zzb = i11;
        this.zzc = th2;
        this.zzd = bArr;
        this.zze = str;
        this.zzf = map;
    }
}
