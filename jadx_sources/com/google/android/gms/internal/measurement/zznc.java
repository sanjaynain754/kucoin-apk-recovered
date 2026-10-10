package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@22.5.0 */
/* JADX INFO: loaded from: classes45.dex */
final class zznc implements zznx {
    private static final zznj zzb = new zzna();
    private final zznj zza;

    public zznc() {
        zzlz zzlzVarZza = zzlz.zza();
        int i11 = zznt.zza;
        zznb zznbVar = new zznb(zzlzVarZza, zzb);
        byte[] bArr = zzmo.zzb;
        this.zza = zznbVar;
    }

    @Override // com.google.android.gms.internal.measurement.zznx
    public final zznw zza(Class cls) {
        int i11 = zzny.zza;
        if (!zzme.class.isAssignableFrom(cls)) {
            int i12 = zznt.zza;
        }
        zzni zzniVarZzc = this.zza.zzc(cls);
        if (zzniVarZzc.zza()) {
            int i13 = zznt.zza;
            return zznp.zzg(zzny.zzA(), zzlt.zza(), zzniVarZzc.zzb());
        }
        int i14 = zznt.zza;
        return zzno.zzl(cls, zzniVarZzc, zznr.zza(), zzmy.zza(), zzny.zzA(), zzniVarZzc.zzc() + (-1) != 1 ? zzlt.zza() : null, zznh.zza());
    }
}
