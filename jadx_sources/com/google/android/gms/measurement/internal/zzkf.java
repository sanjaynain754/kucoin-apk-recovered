package com.google.android.gms.measurement.internal;

import androidx.annotation.WorkerThread;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* JADX INFO: loaded from: classes45.dex */
final class zzkf extends zzay {
    final /* synthetic */ zzli zza;

    @Override // com.google.android.gms.measurement.internal.zzay
    @WorkerThread
    public final void zza() {
        zzli zzliVar = this.zza;
        if (zzliVar.zzu.zzI()) {
            zzliVar.zzao().zzb(2000L);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzkf(zzli zzliVar, zzjf zzjfVar) {
        super(zzjfVar);
        Objects.requireNonNull(zzliVar);
        this.zza = zzliVar;
    }
}
