package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@22.5.0 */
/* JADX INFO: loaded from: classes45.dex */
public final class zzgk extends zzma implements zznm {
    private zzgk() {
        throw null;
    }

    public /* synthetic */ zzgk(byte[] bArr) {
        super(zzgl.zzu);
    }

    public final int zza() {
        return ((zzgl) this.zza).zzf();
    }

    public final zzgj zzb(int i11) {
        return ((zzgl) this.zza).zzg(i11);
    }

    public final List zzd() {
        return Collections.unmodifiableList(((zzgl) this.zza).zzh());
    }

    public final List zzg() {
        return Collections.unmodifiableList(((zzgl) this.zza).zzk());
    }

    public final String zzh() {
        return ((zzgl) this.zza).zzm();
    }

    public final zzgk zzc(int i11, zzgi zzgiVar) {
        zzaX();
        ((zzgl) this.zza).zzt(i11, (zzgj) zzgiVar.zzbc());
        return this;
    }

    public final zzgk zze() {
        zzaX();
        ((zzgl) this.zza).zzu();
        return this;
    }

    public final zzgk zzf() {
        zzaX();
        ((zzgl) this.zza).zzv();
        return this;
    }
}
