package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.AbstractMap;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.3.1 */
/* JADX INFO: loaded from: classes45.dex */
final class zzdl extends zzcs {
    final /* synthetic */ zzdm zza;

    public zzdl(zzdm zzdmVar) {
        this.zza = zzdmVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i11) {
        zzaz.zza(i11, this.zza.zzc, "index");
        int i12 = i11 + i11;
        Object obj = this.zza.zzb[i12];
        Objects.requireNonNull(obj);
        Object obj2 = this.zza.zzb[i12 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.zzc;
    }
}
