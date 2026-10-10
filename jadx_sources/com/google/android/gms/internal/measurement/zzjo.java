package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzjo extends ContentObserver {
    final /* synthetic */ zzjq zza;

    @Override // android.database.ContentObserver
    public final void onChange(boolean z11) {
        this.zza.zzc();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzjo(zzjq zzjqVar, Handler handler) {
        super(null);
        Objects.requireNonNull(zzjqVar);
        this.zza = zzjqVar;
    }
}
