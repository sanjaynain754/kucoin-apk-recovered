package com.kubi.sdk.performance.pageopen;

import android.os.SystemClock;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: com.kubi.sdk.performance.pageopen.a, reason: from Kotlin metadata */
/* JADX INFO: compiled from: PageOpenClock.kt */
/* JADX INFO: loaded from: classes41.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/sdk/performance/pageopen/ElapsedRealtimePageOpenClock;", "Lcom/kubi/sdk/performance/pageopen/PageOpenClock;", "<init>", "()V", "nowMs", "", "LBase_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class ElapsedRealtimePageOpenClock implements PageOpenClock {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final ElapsedRealtimePageOpenClock f47223a = new ElapsedRealtimePageOpenClock();

    @Override // com.kubi.sdk.performance.pageopen.PageOpenClock
    /* JADX INFO: renamed from: a */
    public long mo57396a() {
        return SystemClock.elapsedRealtime();
    }
}
