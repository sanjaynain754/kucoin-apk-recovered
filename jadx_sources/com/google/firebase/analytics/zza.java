package com.google.firebase.analytics;

import java.util.Objects;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-api@@22.5.0 */
/* JADX INFO: loaded from: classes56.dex */
final class zza extends ThreadPoolExecutor {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zza(FirebaseAnalytics firebaseAnalytics, int i11, int i12, long j11, TimeUnit timeUnit, BlockingQueue blockingQueue) {
        super(0, 1, 30L, timeUnit, blockingQueue);
        Objects.requireNonNull(firebaseAnalytics);
    }
}
