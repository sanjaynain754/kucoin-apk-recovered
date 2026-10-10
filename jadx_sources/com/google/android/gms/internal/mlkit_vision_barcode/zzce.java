package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.3.1 */
/* JADX INFO: loaded from: classes45.dex */
abstract class zzce implements Iterator {
    int zzb;
    int zzc;
    int zzd = -1;
    final /* synthetic */ zzci zze;

    public abstract Object zza(int i11);

    public /* synthetic */ zzce(zzci zzciVar, zzcd zzcdVar) {
        this.zze = zzciVar;
        this.zzb = zzciVar.zzf;
        this.zzc = zzciVar.zze();
    }

    private final void zzb() {
        if (this.zze.zzf != this.zzb) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzc >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        zzb();
        if (hasNext()) {
            int i11 = this.zzc;
            this.zzd = i11;
            Object objZza = zza(i11);
            this.zzc = this.zze.zzf(this.zzc);
            return objZza;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        boolean z11;
        zzb();
        if (this.zzd >= 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        zzaz.zzf(z11, "no calls to next() since the last call to remove()");
        this.zzb += 32;
        int i11 = this.zzd;
        zzci zzciVar = this.zze;
        zzciVar.remove(zzci.zzg(zzciVar, i11));
        this.zzc--;
        this.zzd = -1;
    }
}
