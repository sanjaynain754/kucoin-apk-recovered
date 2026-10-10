package com.google.android.gms.internal.common;

import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
/* JADX INFO: loaded from: classes45.dex */
final class zzaj extends zzak {
    final transient int zza;
    final transient int zzb;
    final /* synthetic */ zzak zzc;

    @Override // com.google.android.gms.internal.common.zzag
    public final boolean zzf() {
        return true;
    }

    public zzaj(zzak zzakVar, int i11, int i12) {
        this.zzc = zzakVar;
        this.zza = i11;
        this.zzb = i12;
    }

    @Override // java.util.List
    public final Object get(int i11) {
        zzv.zza(i11, this.zzb, "index");
        return this.zzc.get(i11 + this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.common.zzag
    public final int zzb() {
        return this.zzc.zzc() + this.zza + this.zzb;
    }

    @Override // com.google.android.gms.internal.common.zzag
    public final int zzc() {
        return this.zzc.zzc() + this.zza;
    }

    @Override // com.google.android.gms.internal.common.zzag
    public final Object[] zzg() {
        return this.zzc.zzg();
    }

    @Override // com.google.android.gms.internal.common.zzak
    /* JADX INFO: renamed from: zzh */
    public final zzak subList(int i11, int i12) {
        zzv.zzc(i11, i12, this.zzb);
        int i13 = this.zza;
        return this.zzc.subList(i11 + i13, i12 + i13);
    }

    @Override // com.google.android.gms.internal.common.zzak, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i11, int i12) {
        return subList(i11, i12);
    }
}
