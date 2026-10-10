package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzml extends zzay {
    final /* synthetic */ zznk zza;

    @Override // com.google.android.gms.measurement.internal.zzay
    public final void zza() {
        zznk zznkVar = this.zza;
        zznkVar.zzg();
        if (zznkVar.zzh()) {
            zznkVar.zzu.zzaV().zzk().zza("Inactivity, disconnecting from the service");
            zznkVar.zzM();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzml(zznk zznkVar, zzjf zzjfVar) {
        super(zzjfVar);
        Objects.requireNonNull(zznkVar);
        this.zza = zznkVar;
    }
}
