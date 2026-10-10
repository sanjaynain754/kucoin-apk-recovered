package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* JADX INFO: loaded from: classes45.dex */
public final class zzib extends zzme implements zznm {
    private static final zzib zzh;
    private int zzb;
    private zzmn zzd = zzme.zzcv();
    private String zze = "";
    private String zzf = "";
    private int zzg;

    static {
        zzib zzibVar = new zzib();
        zzh = zzibVar;
        zzme.zzcp(zzib.class, zzibVar);
    }

    public static zzhz zzh() {
        return (zzhz) zzh.zzck();
    }

    public static zzhz zzi(zzib zzibVar) {
        zzma zzmaVarZzck = zzh.zzck();
        zzmaVarZzck.zzbd(zzibVar);
        return (zzhz) zzmaVarZzck;
    }

    private final void zzr() {
        zzmn zzmnVar = this.zzd;
        if (zzmnVar.zza()) {
            return;
        }
        this.zzd = zzme.zzcw(zzmnVar);
    }

    public final List zza() {
        return this.zzd;
    }

    public final int zzb() {
        return this.zzd.size();
    }

    public final zzid zzc(int i11) {
        return (zzid) this.zzd.get(i11);
    }

    public final boolean zzd() {
        return (this.zzb & 1) != 0;
    }

    public final String zze() {
        return this.zze;
    }

    public final boolean zzf() {
        return (this.zzb & 2) != 0;
    }

    public final String zzg() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.measurement.zzme
    public final Object zzl(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zzme.zzcq(zzh, "\u0004\u0004\u0000\u0001\u0001\t\u0004\u0000\u0001\u0000\u0001\u001b\u0007ဈ\u0000\bဈ\u0001\t᠌\u0002", new Object[]{"zzb", "zzd", zzid.class, "zze", "zzf", "zzg", zzia.zza});
        }
        if (i12 == 3) {
            return new zzib();
        }
        byte[] bArr = null;
        if (i12 == 4) {
            return new zzhz(bArr);
        }
        if (i12 == 5) {
            return zzh;
        }
        throw null;
    }

    private zzib() {
    }

    public final /* synthetic */ void zzj(int i11, zzid zzidVar) {
        zzidVar.getClass();
        zzr();
        this.zzd.set(i11, zzidVar);
    }

    public final /* synthetic */ void zzk(zzid zzidVar) {
        zzidVar.getClass();
        zzr();
        this.zzd.add(zzidVar);
    }

    public final /* synthetic */ void zzm(Iterable iterable) {
        zzr();
        zzkr.zzce(iterable, this.zzd);
    }

    public final /* synthetic */ void zzn() {
        this.zzd = zzme.zzcv();
    }

    public final /* synthetic */ void zzo(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zze = str;
    }

    public final /* synthetic */ void zzp(String str) {
        str.getClass();
        this.zzb |= 2;
        this.zzf = str;
    }
}
