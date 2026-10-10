package com.google.android.gms.internal.mlkit_vision_common;

import androidx.annotation.Nullable;

/* JADX INFO: compiled from: com.google.mlkit:vision-common@@17.3.0 */
/* JADX INFO: loaded from: classes45.dex */
public final class zzmw {

    @Nullable
    private static zzmw zza;

    public static synchronized zzmw zza() {
        try {
            if (zza == null) {
                zza = new zzmw();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return zza;
    }

    public static final boolean zzb() {
        return zzmv.zza("mlkit-dev-profiling");
    }

    private zzmw() {
    }
}
