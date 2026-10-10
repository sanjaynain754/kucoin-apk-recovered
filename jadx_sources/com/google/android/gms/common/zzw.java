package com.google.android.gms.common;

import android.util.Log;
import androidx.annotation.NonNull;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
/* JADX INFO: loaded from: classes45.dex */
class zzw {
    private static final zzw zze = new zzw(true, 3, 1, null, null);
    final boolean zza;
    final String zzb;
    final Throwable zzc;
    final int zzd;

    private zzw(boolean z11, int i11, int i12, String str, Throwable th2) {
        this.zza = z11;
        this.zzd = i11;
        this.zzb = str;
        this.zzc = th2;
    }

    @Deprecated
    public static zzw zzb() {
        return zze;
    }

    public static zzw zzc(@NonNull String str) {
        return new zzw(false, 1, 5, str, null);
    }

    public static zzw zzd(@NonNull String str, @NonNull Throwable th2) {
        return new zzw(false, 1, 5, str, th2);
    }

    public static zzw zzf(int i11) {
        return new zzw(true, i11, 1, null, null);
    }

    public static zzw zzg(int i11, int i12, @NonNull String str, Throwable th2) {
        return new zzw(false, i11, i12, str, th2);
    }

    public String zza() {
        return this.zzb;
    }

    public final void zze() {
        if (this.zza || !Log.isLoggable("GoogleCertificatesRslt", 3)) {
            return;
        }
        if (this.zzc != null) {
            Log.d("GoogleCertificatesRslt", zza(), this.zzc);
        } else {
            Log.d("GoogleCertificatesRslt", zza());
        }
    }
}
