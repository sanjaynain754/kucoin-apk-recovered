package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@22.5.0 */
/* JADX INFO: loaded from: classes45.dex */
public final class zziw extends zzme implements zznm {
    private static final zziw zzd;
    private zzmn zzb = zzme.zzcv();

    static {
        zziw zziwVar = new zziw();
        zzd = zziwVar;
        zzme.zzcp(zziw.class, zziwVar);
    }

    public static zziw zzc() {
        return zzd;
    }

    public final List zza() {
        return this.zzb;
    }

    public final int zzb() {
        return this.zzb.size();
    }

    @Override // com.google.android.gms.internal.measurement.zzme
    public final Object zzl(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zzme.zzcq(zzd, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzb", zziy.class});
        }
        if (i12 == 3) {
            return new zziw();
        }
        byte[] bArr = null;
        if (i12 == 4) {
            return new zziv(bArr);
        }
        if (i12 == 5) {
            return zzd;
        }
        throw null;
    }

    private zziw() {
    }
}
