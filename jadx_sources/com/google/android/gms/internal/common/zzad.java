package com.google.android.gms.internal.common;

import java.util.NoSuchElementException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
/* JADX INFO: loaded from: classes45.dex */
abstract class zzad extends zzao {
    private final int zza;
    private int zzb;

    public abstract Object zza(int i11);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.zzb < this.zza;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.zzb > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.zzb;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.zzb - 1;
    }

    public zzad(int i11, int i12) {
        zzv.zzb(i12, i11, "index");
        this.zza = i11;
        this.zzb = i12;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (hasNext()) {
            int i11 = this.zzb;
            this.zzb = i11 + 1;
            return zza(i11);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            int i11 = this.zzb - 1;
            this.zzb = i11;
            return zza(i11);
        }
        throw new NoSuchElementException();
    }
}
