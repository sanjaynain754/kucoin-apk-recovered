package com.google.android.gms.measurement.internal;

import androidx.annotation.WorkerThread;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* JADX INFO: loaded from: classes45.dex */
final class zzjw extends zzay {
    final /* synthetic */ zzli zza;

    @Override // com.google.android.gms.measurement.internal.zzay
    @WorkerThread
    public final void zza() {
        this.zza.zzz();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzjw(zzli zzliVar, zzjf zzjfVar) {
        super(zzjfVar);
        Objects.requireNonNull(zzliVar);
        this.zza = zzliVar;
    }
}
