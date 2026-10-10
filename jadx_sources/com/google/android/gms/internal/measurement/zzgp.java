package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@22.5.0 */
/* JADX INFO: loaded from: classes45.dex */
public final class zzgp extends zzme implements zznm {
    private static final zzgp zzg;
    private int zzb;
    private int zzd = 14;
    private int zze = 11;
    private int zzf = 60;

    static {
        zzgp zzgpVar = new zzgp();
        zzg = zzgpVar;
        zzme.zzcp(zzgp.class, zzgpVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzme
    public final Object zzl(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zzme.zzcq(zzg, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"zzb", "zzd", "zze", "zzf"});
        }
        if (i12 == 3) {
            return new zzgp();
        }
        byte[] bArr = null;
        if (i12 == 4) {
            return new zzgo(bArr);
        }
        if (i12 == 5) {
            return zzg;
        }
        throw null;
    }

    private zzgp() {
    }
}
