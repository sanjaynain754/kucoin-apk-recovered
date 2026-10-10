package com.google.android.gms.internal.measurement;

import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* JADX INFO: loaded from: classes45.dex */
public final class zzji {

    @Nullable
    @GuardedBy("GservicesDelegateSupplier.class")
    private static zzjh zza;

    public static synchronized void zza(zzjh zzjhVar) {
        if (zza != null) {
            throw new IllegalStateException("init() already called");
        }
        zza = zzjhVar;
    }

    public static synchronized zzjh zzb() {
        try {
            if (zza == null) {
                zza(new zzjl());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return zza;
    }
}
