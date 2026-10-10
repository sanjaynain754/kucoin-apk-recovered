package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@22.5.0 */
/* JADX INFO: loaded from: classes45.dex */
final class zzlp {
    private final Object zza;
    private final int zzb;

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzlp)) {
            return false;
        }
        zzlp zzlpVar = (zzlp) obj;
        return this.zza == zzlpVar.zza && this.zzb == zzlpVar.zzb;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.zza) * 65535) + this.zzb;
    }

    public zzlp(Object obj, int i11) {
        this.zza = obj;
        this.zzb = i11;
    }
}
