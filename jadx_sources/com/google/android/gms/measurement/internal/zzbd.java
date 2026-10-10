package com.google.android.gms.measurement.internal;

import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* JADX INFO: loaded from: classes45.dex */
final class zzbd implements Iterator {
    final Iterator zza;
    final /* synthetic */ zzbe zzb;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final String next() {
        return (String) this.zza.next();
    }

    public zzbd(zzbe zzbeVar) {
        Objects.requireNonNull(zzbeVar);
        this.zzb = zzbeVar;
        this.zza = zzbeVar.zzg().keySet().iterator();
    }
}
