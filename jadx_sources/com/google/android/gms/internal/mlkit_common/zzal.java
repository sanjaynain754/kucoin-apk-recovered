package com.google.android.gms.internal.mlkit_common;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.mlkit:common@@18.11.0 */
/* JADX INFO: loaded from: classes45.dex */
final class zzal extends zzaf {
    static final zzaf zza = new zzal(new Object[0], 0);
    final transient Object[] zzb;
    private final transient int zzc;

    @Override // com.google.android.gms.internal.mlkit_common.zzab
    public final int zzc() {
        return 0;
    }

    @Override // java.util.List
    public final Object get(int i11) {
        zzt.zza(i11, this.zzc, "index");
        Object obj = this.zzb[i11];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzaf, com.google.android.gms.internal.mlkit_common.zzab
    public final int zza(Object[] objArr, int i11) {
        System.arraycopy(this.zzb, 0, objArr, 0, this.zzc);
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzab
    public final int zzb() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzab
    public final Object[] zze() {
        return this.zzb;
    }

    public zzal(Object[] objArr, int i11) {
        this.zzb = objArr;
        this.zzc = i11;
    }
}
