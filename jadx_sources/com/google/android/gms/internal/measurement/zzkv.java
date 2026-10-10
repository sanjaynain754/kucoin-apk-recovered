package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@22.5.0 */
/* JADX INFO: loaded from: classes45.dex */
final class zzkv {
    public int zza;
    public long zzb;
    public Object zzc;
    public final zzlq zzd;
    public int zze;

    public zzkv() {
        int i11 = zzlq.zzb;
        int i12 = zznt.zza;
        this.zzd = zzlq.zza;
    }

    public zzkv(zzlq zzlqVar) {
        zzlqVar.getClass();
        this.zzd = zzlqVar;
    }

    public static /* synthetic */ String zza(int i11, int i12, byte b11, String str, String str2) {
        StringBuilder sb2 = new StringBuilder(String.valueOf(i12).length() + b11 + String.valueOf(i11).length());
        sb2.append(str);
        sb2.append(i12);
        sb2.append(str2);
        sb2.append(i11);
        return sb2.toString();
    }
}
