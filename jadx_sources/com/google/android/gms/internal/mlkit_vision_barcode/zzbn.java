package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.3.1 */
/* JADX INFO: loaded from: classes45.dex */
class zzbn implements Iterator {
    final Iterator zza;
    final Collection zzb;
    final /* synthetic */ zzbo zzc;

    public zzbn(zzbo zzboVar, Iterator it) {
        this.zzc = zzboVar;
        this.zzb = zzboVar.zzb;
        this.zza = it;
    }

    public zzbn(zzbo zzboVar) {
        this.zzc = zzboVar;
        Collection collection = zzboVar.zzb;
        this.zzb = collection;
        this.zza = collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.zza.remove();
        this.zzc.zze.zzb--;
        this.zzc.zzc();
    }

    public final void zza() {
        this.zzc.zzb();
        if (this.zzc.zzb != this.zzb) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        zza();
        return this.zza.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        zza();
        return this.zza.next();
    }
}
