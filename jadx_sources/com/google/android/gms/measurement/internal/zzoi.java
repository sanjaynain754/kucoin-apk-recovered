package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@22.5.0 */
/* JADX INFO: loaded from: classes45.dex */
final class zzoi extends zzay {
    final /* synthetic */ zzoj zza;

    @Override // com.google.android.gms.measurement.internal.zzay
    public final void zza() {
        zzoj zzojVar = this.zza;
        zzojVar.zzd();
        zzojVar.zzu.zzaV().zzk().zza("Starting upload from DelayedRunnable");
        zzojVar.zzg.zzM();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzoi(zzoj zzojVar, zzjf zzjfVar) {
        super(zzjfVar);
        Objects.requireNonNull(zzojVar);
        this.zza = zzojVar;
    }
}
