package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.Iterator;

/* JADX INFO: compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.3.1 */
/* JADX INFO: loaded from: classes.dex */
final class zzdn extends zzcv {
    private final transient zzcu zza;
    private final transient zzcs zzb;

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzcn, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.zza.get(obj) != null;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzcv, com.google.android.gms.internal.mlkit_vision_barcode.zzcn, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return this.zzb.listIterator(0);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzcn
    public final int zza(Object[] objArr, int i11) {
        return this.zzb.zza(objArr, i11);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzcv, com.google.android.gms.internal.mlkit_vision_barcode.zzcn
    /* JADX INFO: renamed from: zzd */
    public final zzdu iterator() {
        return this.zzb.listIterator(0);
    }

    public zzdn(zzcu zzcuVar, zzcs zzcsVar) {
        this.zza = zzcuVar;
        this.zzb = zzcsVar;
    }
}
