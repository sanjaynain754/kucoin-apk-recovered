package com.google.android.gms.internal.measurement;

import android.os.Binder;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* JADX INFO: loaded from: classes.dex */
interface zzju {
    @Nullable
    Object zze(String str);

    static Object zzg(zzjt zzjtVar) {
        try {
            return zzjtVar.zza();
        } catch (SecurityException unused) {
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            try {
                return zzjtVar.zza();
            } finally {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
            }
        }
    }
}
