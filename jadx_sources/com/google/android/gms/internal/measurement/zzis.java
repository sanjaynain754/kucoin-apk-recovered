package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* JADX INFO: loaded from: classes45.dex */
public final class zzis extends zzme implements zznm {
    private static final zzis zzg;
    private int zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        zzis zzisVar = new zzis();
        zzg = zzisVar;
        zzme.zzcp(zzis.class, zzisVar);
    }

    public static zzil zzb() {
        return (zzil) zzg.zzck();
    }

    public static zzis zzc() {
        return zzg;
    }

    public final zzin zza() {
        zzin zzinVarZzb = zzin.zzb(this.zze);
        return zzinVarZzb == null ? zzin.CLIENT_UPLOAD_ELIGIBILITY_UNKNOWN : zzinVarZzb;
    }

    public final int zzf() {
        int iZza = zzir.zza(this.zzd);
        if (iZza == 0) {
            return 1;
        }
        return iZza;
    }

    public final int zzg() {
        int iZza = zzip.zza(this.zzf);
        if (iZza == 0) {
            return 1;
        }
        return iZza;
    }

    public final /* synthetic */ void zzh(int i11) {
        this.zzd = i11 - 1;
        this.zzb |= 1;
    }

    public final /* synthetic */ void zzi(int i11) {
        this.zzf = i11 - 1;
        this.zzb |= 4;
    }

    @Override // com.google.android.gms.internal.measurement.zzme
    public final Object zzl(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zzme.zzcq(zzg, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002", new Object[]{"zzb", "zzd", zziq.zza, "zze", zzim.zza, "zzf", zzio.zza});
        }
        if (i12 == 3) {
            return new zzis();
        }
        byte[] bArr = null;
        if (i12 == 4) {
            return new zzil(bArr);
        }
        if (i12 == 5) {
            return zzg;
        }
        throw null;
    }

    private zzis() {
    }

    public final /* synthetic */ void zzd(zzin zzinVar) {
        this.zze = zzinVar.zza();
        this.zzb |= 2;
    }
}
