package com.google.android.gms.internal.location;

import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* JADX INFO: loaded from: classes45.dex */
final class zzbr extends zzbs {
    final transient int zza;
    final transient int zzb;
    final /* synthetic */ zzbs zzc;

    @Override // com.google.android.gms.internal.location.zzbp
    public final boolean zzf() {
        return true;
    }

    public zzbr(zzbs zzbsVar, int i11, int i12) {
        this.zzc = zzbsVar;
        this.zza = i11;
        this.zzb = i12;
    }

    @Override // java.util.List
    public final Object get(int i11) {
        zzbm.zza(i11, this.zzb, "index");
        return this.zzc.get(i11 + this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.location.zzbp
    public final Object[] zzb() {
        return this.zzc.zzb();
    }

    @Override // com.google.android.gms.internal.location.zzbp
    public final int zzc() {
        return this.zzc.zzc() + this.zza;
    }

    @Override // com.google.android.gms.internal.location.zzbp
    public final int zzd() {
        return this.zzc.zzc() + this.zza + this.zzb;
    }

    @Override // com.google.android.gms.internal.location.zzbs
    /* JADX INFO: renamed from: zzh */
    public final zzbs subList(int i11, int i12) {
        zzbm.zzc(i11, i12, this.zzb);
        zzbs zzbsVar = this.zzc;
        int i13 = this.zza;
        return zzbsVar.subList(i11 + i13, i12 + i13);
    }

    @Override // com.google.android.gms.internal.location.zzbs, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i11, int i12) {
        return subList(i11, i12);
    }
}
