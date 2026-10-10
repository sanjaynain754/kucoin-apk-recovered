package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* JADX INFO: loaded from: classes45.dex */
final class zzjx implements Runnable {
    final /* synthetic */ boolean zza;
    final /* synthetic */ zzli zzb;

    public zzjx(zzli zzliVar, boolean z11) {
        this.zza = z11;
        Objects.requireNonNull(zzliVar);
        this.zzb = zzliVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzli zzliVar = this.zzb;
        zzib zzibVar = zzliVar.zzu;
        boolean zZzB = zzibVar.zzB();
        boolean zZzA = zzibVar.zzA();
        boolean z11 = this.zza;
        zzibVar.zzz(z11);
        if (zZzA == z11) {
            zzibVar.zzaV().zzk().zzb("Default data collection state already set to", Boolean.valueOf(z11));
        }
        if (zzibVar.zzB() == zZzB || zzibVar.zzB() != zzibVar.zzA()) {
            zzibVar.zzaV().zzh().zzc("Default data collection is different than actual status", Boolean.valueOf(z11), Boolean.valueOf(zZzB));
        }
        zzliVar.zzak();
    }
}
