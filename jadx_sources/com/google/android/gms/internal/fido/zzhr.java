package com.google.android.gms.internal.fido;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* JADX INFO: loaded from: classes45.dex */
public final class zzhr {
    private final byte zza;
    private final byte zzb;

    public final byte zza() {
        return this.zzb;
    }

    public final byte zzb() {
        return this.zza;
    }

    public final int zzc() {
        return (this.zza >> 5) & 7;
    }

    public zzhr(int i11) {
        this.zza = (byte) (i11 & 224);
        this.zzb = (byte) (i11 & 31);
    }
}
