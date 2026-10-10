package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* JADX INFO: loaded from: classes45.dex */
final class zzjv extends ContentObserver {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzjv(zzjx zzjxVar, Handler handler) {
        super(null);
        Objects.requireNonNull(zzjxVar);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z11) {
        zzkl.zzc();
    }
}
