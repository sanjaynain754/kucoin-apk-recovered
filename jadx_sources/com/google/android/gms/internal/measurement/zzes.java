package com.google.android.gms.internal.measurement;

import android.os.Bundle;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-sdk-api@@22.5.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzes extends zzcz {
    private final com.google.android.gms.measurement.internal.zzjp zza;

    @Override // com.google.android.gms.internal.measurement.zzda
    public final void zze(String str, String str2, Bundle bundle, long j11) {
        this.zza.onEvent(str, str2, bundle, j11);
    }

    @Override // com.google.android.gms.internal.measurement.zzda
    public final int zzf() {
        return System.identityHashCode(this.zza);
    }

    public zzes(com.google.android.gms.measurement.internal.zzjp zzjpVar) {
        this.zza = zzjpVar;
    }
}
