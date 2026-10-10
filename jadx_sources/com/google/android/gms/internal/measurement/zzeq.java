package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-sdk-api@@22.5.0 */
/* JADX INFO: loaded from: classes.dex */
abstract class zzeq implements Runnable {
    final long zzh;
    final long zzi;
    final boolean zzj;
    final /* synthetic */ zzfb zzk;

    public abstract void zza() throws RemoteException;

    @Override // java.lang.Runnable
    public final void run() {
        if (this.zzk.zzP()) {
            zzb();
            return;
        }
        try {
            zza();
        } catch (Exception e11) {
            this.zzk.zzN(e11, false, this.zzj);
            zzb();
        }
    }

    public zzeq(zzfb zzfbVar, boolean z11) {
        Objects.requireNonNull(zzfbVar);
        this.zzk = zzfbVar;
        this.zzh = zzfbVar.zza.currentTimeMillis();
        this.zzi = zzfbVar.zza.elapsedRealtime();
        this.zzj = z11;
    }

    public void zzb() {
    }
}
