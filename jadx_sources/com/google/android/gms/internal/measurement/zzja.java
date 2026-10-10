package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@22.5.0 */
/* JADX INFO: loaded from: classes45.dex */
public final class zzja extends zzme implements zznm {
    private static final zzja zzf;
    private int zzb;
    private zzmn zzd = zzme.zzcv();
    private zziw zze;

    static {
        zzja zzjaVar = new zzja();
        zzf = zzjaVar;
        zzme.zzcp(zzja.class, zzjaVar);
    }

    public final List zza() {
        return this.zzd;
    }

    public final zziw zzb() {
        zziw zziwVar = this.zze;
        return zziwVar == null ? zziw.zzc() : zziwVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzme
    public final Object zzl(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zzme.zzcq(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"zzb", "zzd", zzje.class, "zze"});
        }
        if (i12 == 3) {
            return new zzja();
        }
        byte[] bArr = null;
        if (i12 == 4) {
            return new zziz(bArr);
        }
        if (i12 == 5) {
            return zzf;
        }
        throw null;
    }

    private zzja() {
    }
}
