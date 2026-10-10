package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzmp extends zzay {
    final /* synthetic */ zznk zza;

    @Override // com.google.android.gms.measurement.internal.zzay
    public final void zza() {
        this.zza.zzu.zzaV().zze().zza("Tasks have been queued for a long time");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzmp(zznk zznkVar, zzjf zzjfVar) {
        super(zzjfVar);
        Objects.requireNonNull(zznkVar);
        this.zza = zznkVar;
    }
}
