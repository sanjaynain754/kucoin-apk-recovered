package com.google.android.gms.internal.fido;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* JADX INFO: loaded from: classes45.dex */
final class zzah {
    private static final Object zza = new Object();
    private static volatile boolean zzb;
    private static volatile zzag zzc;
    private static volatile boolean zzd;
    private static volatile zzag zze;

    public static void zza() {
        zzd = true;
    }

    public static void zzb() {
        if (zze == null) {
            zze = new zzag(null);
        }
    }

    public static void zzc() {
        if (zzc == null) {
            zzc = new zzag(null);
        }
    }

    public static boolean zzd() {
        synchronized (zza) {
        }
        return false;
    }
}
