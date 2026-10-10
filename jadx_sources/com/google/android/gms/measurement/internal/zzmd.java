package com.google.android.gms.measurement.internal;

import androidx.annotation.BinderThread;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* JADX INFO: loaded from: classes45.dex */
final class zzmd extends zzgc {
    final /* synthetic */ AtomicReference zza;

    public zzmd(zznk zznkVar, AtomicReference atomicReference) {
        this.zza = atomicReference;
        Objects.requireNonNull(zznkVar);
    }

    @Override // com.google.android.gms.measurement.internal.zzgd
    @BinderThread
    public final void zze(List list) {
        AtomicReference atomicReference = this.zza;
        synchronized (atomicReference) {
            atomicReference.set(list);
            atomicReference.notifyAll();
        }
    }
}
