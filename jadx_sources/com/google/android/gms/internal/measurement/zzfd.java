package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@22.5.0 */
/* JADX INFO: loaded from: classes45.dex */
public final class zzfd extends zzme implements zznm {
    private static final zzfd zzi;
    private int zzb;
    private int zzd;
    private zzmn zze = zzme.zzcv();
    private zzmn zzf = zzme.zzcv();
    private boolean zzg;
    private boolean zzh;

    static {
        zzfd zzfdVar = new zzfd();
        zzi = zzfdVar;
        zzme.zzcp(zzfd.class, zzfdVar);
    }

    public final boolean zza() {
        return (this.zzb & 1) != 0;
    }

    public final int zzb() {
        return this.zzd;
    }

    public final List zzc() {
        return this.zze;
    }

    public final int zzd() {
        return this.zze.size();
    }

    public final zzfn zze(int i11) {
        return (zzfn) this.zze.get(i11);
    }

    public final List zzf() {
        return this.zzf;
    }

    public final int zzg() {
        return this.zzf.size();
    }

    public final zzff zzh(int i11) {
        return (zzff) this.zzf.get(i11);
    }

    @Override // com.google.android.gms.internal.measurement.zzme
    public final Object zzl(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zzme.zzcq(zzi, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001\u0005ဇ\u0002", new Object[]{"zzb", "zzd", "zze", zzfn.class, "zzf", zzff.class, "zzg", "zzh"});
        }
        if (i12 == 3) {
            return new zzfd();
        }
        byte[] bArr = null;
        if (i12 == 4) {
            return new zzfc(bArr);
        }
        if (i12 == 5) {
            return zzi;
        }
        throw null;
    }

    private zzfd() {
    }

    public final /* synthetic */ void zzi(int i11, zzfn zzfnVar) {
        zzfnVar.getClass();
        zzmn zzmnVar = this.zze;
        if (!zzmnVar.zza()) {
            this.zze = zzme.zzcw(zzmnVar);
        }
        this.zze.set(i11, zzfnVar);
    }

    public final /* synthetic */ void zzj(int i11, zzff zzffVar) {
        zzffVar.getClass();
        zzmn zzmnVar = this.zzf;
        if (!zzmnVar.zza()) {
            this.zzf = zzme.zzcw(zzmnVar);
        }
        this.zzf.set(i11, zzffVar);
    }
}
