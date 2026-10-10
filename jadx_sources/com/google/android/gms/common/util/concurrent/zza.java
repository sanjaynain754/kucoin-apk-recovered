package com.google.android.gms.common.util.concurrent;

import android.os.Process;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
/* JADX INFO: loaded from: classes.dex */
final class zza implements Runnable {
    private final Runnable zza;

    @Override // java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(0);
        this.zza.run();
    }

    public zza(Runnable runnable, int i11) {
        this.zza = runnable;
    }
}
