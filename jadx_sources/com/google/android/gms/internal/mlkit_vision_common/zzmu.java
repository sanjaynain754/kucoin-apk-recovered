package com.google.android.gms.internal.mlkit_vision_common;

import android.os.SystemClock;
import androidx.annotation.WorkerThread;

/* JADX INFO: compiled from: com.google.mlkit:vision-common@@17.3.0 */
/* JADX INFO: loaded from: classes45.dex */
public final class zzmu {
    @WorkerThread
    public static void zza(zzmj zzmjVar, int i11, int i12, long j11, int i13, int i14, int i15, int i16) {
        zzmjVar.zzc(zzc(i11, i12, j11, i13, i14, i15, i16), zziv.INPUT_IMAGE_CONSTRUCTION);
    }

    @WorkerThread
    public static void zzb(zzmj zzmjVar, int i11, int i12, long j11, int i13, int i14, int i15, int i16) {
        zzmjVar.zzc(zzc(i11, i12, j11, i13, i14, i15, i16), zziv.ODML_IMAGE);
    }

    private static zzmt zzc(int i11, int i12, long j11, int i13, int i14, int i15, int i16) {
        return new zzmt(i11, i12, i15, i13, i14, SystemClock.elapsedRealtime() - j11, i16);
    }
}
