package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@22.5.0 */
/* JADX INFO: loaded from: classes45.dex */
public final class zzgn extends zzme implements zznm {
    private static final zzgn zzd;
    private zzmn zzb = zzme.zzcv();

    static {
        zzgn zzgnVar = new zzgn();
        zzd = zzgnVar;
        zzme.zzcp(zzgn.class, zzgnVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzme
    public final Object zzl(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zzme.zzcq(zzd, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"zzb"});
        }
        if (i12 == 3) {
            return new zzgn();
        }
        byte[] bArr = null;
        if (i12 == 4) {
            return new zzgm(bArr);
        }
        if (i12 == 5) {
            return zzd;
        }
        throw null;
    }

    private zzgn() {
    }
}
