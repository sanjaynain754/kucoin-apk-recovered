package com.google.android.gms.measurement.internal;

import androidx.annotation.WorkerThread;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* JADX INFO: loaded from: classes45.dex */
final class zzjt extends zzay {
    final /* synthetic */ zzli zza;

    @Override // com.google.android.gms.measurement.internal.zzay
    @WorkerThread
    public final void zza() {
        final zzli zzliVarZzj = this.zza.zzu.zzj();
        Objects.requireNonNull(zzliVarZzj);
        new Thread(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzjs
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzliVarZzj.zzw();
            }
        }).start();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzjt(zzli zzliVar, zzjf zzjfVar) {
        super(zzjfVar);
        Objects.requireNonNull(zzliVar);
        this.zza = zzliVar;
    }
}
