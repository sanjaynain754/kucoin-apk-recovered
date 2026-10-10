package com.google.android.gms.internal.mlkit_vision_common;

import java.util.List;

/* JADX INFO: compiled from: com.google.mlkit:vision-common@@17.3.0 */
/* JADX INFO: loaded from: classes45.dex */
final class zzo extends zzp {
    final transient int zza;
    final transient int zzb;
    final /* synthetic */ zzp zzc;

    public zzo(zzp zzpVar, int i11, int i12) {
        this.zzc = zzpVar;
        this.zza = i11;
        this.zzb = i12;
    }

    @Override // java.util.List
    public final Object get(int i11) {
        zzf.zza(i11, this.zzb, "index");
        return this.zzc.get(i11 + this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzl
    public final int zzb() {
        return this.zzc.zzc() + this.zza + this.zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzl
    public final int zzc() {
        return this.zzc.zzc() + this.zza;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzl
    public final Object[] zze() {
        return this.zzc.zze();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzp
    /* JADX INFO: renamed from: zzf */
    public final zzp subList(int i11, int i12) {
        zzf.zzc(i11, i12, this.zzb);
        zzp zzpVar = this.zzc;
        int i13 = this.zza;
        return zzpVar.subList(i11 + i13, i12 + i13);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzp, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i11, int i12) {
        return subList(i11, i12);
    }
}
