package com.google.android.gms.internal.measurement;

import android.os.Bundle;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-sdk-api@@22.5.0 */
/* JADX INFO: loaded from: classes45.dex */
final class zzer extends zzcz {
    private final com.google.android.gms.measurement.internal.zzjo zza;

    @Override // com.google.android.gms.internal.measurement.zzda
    public final void zze(String str, String str2, Bundle bundle, long j11) {
        this.zza.interceptEvent(str, str2, bundle, j11);
    }

    @Override // com.google.android.gms.internal.measurement.zzda
    public final int zzf() {
        return System.identityHashCode(this.zza);
    }

    public zzer(com.google.android.gms.measurement.internal.zzjo zzjoVar) {
        this.zza = zzjoVar;
    }
}
