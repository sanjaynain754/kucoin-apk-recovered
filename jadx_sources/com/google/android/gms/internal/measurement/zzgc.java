package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@22.5.0 */
/* JADX INFO: loaded from: classes45.dex */
public final class zzgc extends zzme implements zznm {
    private static final zzgc zzf;
    private int zzb;
    private String zzd = "";
    private String zze = "";

    static {
        zzgc zzgcVar = new zzgc();
        zzf = zzgcVar;
        zzme.zzcp(zzgc.class, zzgcVar);
    }

    public final String zza() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.measurement.zzme
    public final Object zzl(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zzme.zzcq(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzb", "zzd", "zze"});
        }
        if (i12 == 3) {
            return new zzgc();
        }
        byte[] bArr = null;
        if (i12 == 4) {
            return new zzgb(bArr);
        }
        if (i12 == 5) {
            return zzf;
        }
        throw null;
    }

    private zzgc() {
    }
}
