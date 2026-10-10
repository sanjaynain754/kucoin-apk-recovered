package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* JADX INFO: loaded from: classes45.dex */
public final class zzhu extends zzme implements zznm {
    private static final zzhu zzf;
    private int zzb;
    private String zzd = "";
    private long zze;

    static {
        zzhu zzhuVar = new zzhu();
        zzf = zzhuVar;
        zzme.zzcp(zzhu.class, zzhuVar);
    }

    public static zzht zza() {
        return (zzht) zzf.zzck();
    }

    public final /* synthetic */ void zzc(long j11) {
        this.zzb |= 2;
        this.zze = j11;
    }

    @Override // com.google.android.gms.internal.measurement.zzme
    public final Object zzl(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zzme.zzcq(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"zzb", "zzd", "zze"});
        }
        if (i12 == 3) {
            return new zzhu();
        }
        byte[] bArr = null;
        if (i12 == 4) {
            return new zzht(bArr);
        }
        if (i12 == 5) {
            return zzf;
        }
        throw null;
    }

    private zzhu() {
    }

    public final /* synthetic */ void zzb(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zzd = str;
    }
}
