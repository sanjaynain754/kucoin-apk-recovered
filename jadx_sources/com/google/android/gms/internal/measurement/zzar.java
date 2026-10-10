package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@22.5.0 */
/* JADX INFO: loaded from: classes45.dex */
final class zzar implements Iterator {
    final /* synthetic */ zzas zza;
    private int zzb;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb < this.zza.zzb().length();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        zzas zzasVar = this.zza;
        String strZzb = zzasVar.zzb();
        int i11 = this.zzb;
        if (i11 >= strZzb.length()) {
            throw new NoSuchElementException();
        }
        this.zzb = i11 + 1;
        return new zzas(String.valueOf(zzasVar.zzb().charAt(i11)));
    }

    public zzar(zzas zzasVar) {
        Objects.requireNonNull(zzasVar);
        this.zza = zzasVar;
        this.zzb = 0;
    }
}
