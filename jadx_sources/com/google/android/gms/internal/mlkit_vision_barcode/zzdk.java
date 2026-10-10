package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.3.1 */
/* JADX INFO: loaded from: classes45.dex */
final class zzdk extends zzcs {
    static final zzcs zza = new zzdk(new Object[0], 0);
    final transient Object[] zzb;
    private final transient int zzc;

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzcn
    public final int zzc() {
        return 0;
    }

    @Override // java.util.List
    public final Object get(int i11) {
        zzaz.zza(i11, this.zzc, "index");
        Object obj = this.zzb[i11];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzcs, com.google.android.gms.internal.mlkit_vision_barcode.zzcn
    public final int zza(Object[] objArr, int i11) {
        System.arraycopy(this.zzb, 0, objArr, i11, this.zzc);
        return i11 + this.zzc;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzcn
    public final int zzb() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzcn
    public final Object[] zze() {
        return this.zzb;
    }

    public zzdk(Object[] objArr, int i11) {
        this.zzb = objArr;
        this.zzc = i11;
    }
}
