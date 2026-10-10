package com.google.firebase.analytics;

import androidx.annotation.Nullable;
import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-api@@22.5.0 */
/* JADX INFO: loaded from: classes56.dex */
final class zzc implements Callable {
    final /* synthetic */ FirebaseAnalytics zza;

    @Override // java.util.concurrent.Callable
    @Nullable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        return this.zza.zza().zzH();
    }

    public zzc(FirebaseAnalytics firebaseAnalytics) {
        Objects.requireNonNull(firebaseAnalytics);
        this.zza = firebaseAnalytics;
    }
}
