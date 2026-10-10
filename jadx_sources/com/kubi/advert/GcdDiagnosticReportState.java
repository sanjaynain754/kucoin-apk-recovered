package com.kubi.advert;

import java.util.LinkedHashSet;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.advert.w, reason: from Kotlin metadata */
/* JADX INFO: compiled from: AppsFlyerTrackingState.kt */
/* JADX INFO: loaded from: classes62.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0006J\u0016\u0010\n\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m90084d2 = {"Lcom/kubi/advert/GcdDiagnosticReportState;", "", "<init>", "()V", "reportedKeys", "", "", "markCallback", "", "candidateKey", "markOutcome", "outcomeKey", "AdvertLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class GcdDiagnosticReportState {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final Set<String> f15174a = new LinkedHashSet();

    /* JADX INFO: renamed from: a */
    public final synchronized boolean m14826a(@NotNull String candidateKey) {
        Intrinsics.checkNotNullParameter(candidateKey, "candidateKey");
        return this.f15174a.add("callback|" + candidateKey);
    }

    /* JADX INFO: renamed from: b */
    public final synchronized boolean m14827b(@NotNull String candidateKey, @NotNull String outcomeKey) {
        Intrinsics.checkNotNullParameter(candidateKey, "candidateKey");
        Intrinsics.checkNotNullParameter(outcomeKey, "outcomeKey");
        return this.f15174a.add("outcome|" + candidateKey + '|' + outcomeKey);
    }
}
