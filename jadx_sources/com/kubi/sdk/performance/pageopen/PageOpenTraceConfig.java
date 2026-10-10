package com.kubi.sdk.performance.pageopen;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.sdk.performance.pageopen.k, reason: from Kotlin metadata and from toString */
/* JADX INFO: compiled from: PageOpenModels.kt */
/* JADX INFO: loaded from: classes41.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\tHÆ\u0003J\t\u0010\u001f\u001a\u00020\tHÆ\u0003J\t\u0010 \u001a\u00020\fHÆ\u0003JQ\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0013\u0010\"\u001a\u00020\f2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006'"}, m90084d2 = {"Lcom/kubi/sdk/performance/pageopen/PageOpenTraceConfig;", "", "pageTraceId", "", "initialPageId", "openMode", "Lcom/kubi/sdk/performance/pageopen/PageOpenMode;", "source", "startedAtMs", "", "timeoutMs", "sampled", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/kubi/sdk/performance/pageopen/PageOpenMode;Ljava/lang/String;JJZ)V", "getPageTraceId", "()Ljava/lang/String;", "getInitialPageId", "getOpenMode", "()Lcom/kubi/sdk/performance/pageopen/PageOpenMode;", "getSource", "getStartedAtMs", "()J", "getTimeoutMs", "getSampled", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "LBase_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class PageOpenTraceConfig {

    /* JADX INFO: renamed from: a, reason: from toString */
    @NotNull
    public final String pageTraceId;

    /* JADX INFO: renamed from: b, reason: from toString */
    @Nullable
    public final String initialPageId;

    /* JADX INFO: renamed from: c, reason: from toString */
    @NotNull
    public final PageOpenMode openMode;

    /* JADX INFO: renamed from: d, reason: from toString */
    @NotNull
    public final String source;

    /* JADX INFO: renamed from: e, reason: from toString */
    public final long startedAtMs;

    /* JADX INFO: renamed from: f, reason: from toString */
    public final long timeoutMs;

    /* JADX INFO: renamed from: g, reason: from toString */
    public final boolean sampled;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PageOpenTraceConfig)) {
            return false;
        }
        PageOpenTraceConfig pageOpenTraceConfig = (PageOpenTraceConfig) other;
        return Intrinsics.areEqual(this.pageTraceId, pageOpenTraceConfig.pageTraceId) && Intrinsics.areEqual(this.initialPageId, pageOpenTraceConfig.initialPageId) && this.openMode == pageOpenTraceConfig.openMode && Intrinsics.areEqual(this.source, pageOpenTraceConfig.source) && this.startedAtMs == pageOpenTraceConfig.startedAtMs && this.timeoutMs == pageOpenTraceConfig.timeoutMs && this.sampled == pageOpenTraceConfig.sampled;
    }

    public PageOpenTraceConfig(@NotNull String pageTraceId, @Nullable String str, @NotNull PageOpenMode openMode, @NotNull String source, long j11, long j12, boolean z11) {
        Intrinsics.checkNotNullParameter(pageTraceId, "pageTraceId");
        Intrinsics.checkNotNullParameter(openMode, "openMode");
        Intrinsics.checkNotNullParameter(source, "source");
        this.pageTraceId = pageTraceId;
        this.initialPageId = str;
        this.openMode = openMode;
        this.source = source;
        this.startedAtMs = j11;
        this.timeoutMs = j12;
        this.sampled = z11;
    }

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getInitialPageId() {
        return this.initialPageId;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final PageOpenMode getOpenMode() {
        return this.openMode;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getPageTraceId() {
        return this.pageTraceId;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getSampled() {
        return this.sampled;
    }

    @NotNull
    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final long getStartedAtMs() {
        return this.startedAtMs;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final long getTimeoutMs() {
        return this.timeoutMs;
    }

    public int hashCode() {
        int iHashCode = this.pageTraceId.hashCode() * 31;
        String str = this.initialPageId;
        return ((((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.openMode.hashCode()) * 31) + this.source.hashCode()) * 31) + Long.hashCode(this.startedAtMs)) * 31) + Long.hashCode(this.timeoutMs)) * 31) + Boolean.hashCode(this.sampled);
    }

    @NotNull
    public String toString() {
        return "PageOpenTraceConfig(pageTraceId=" + this.pageTraceId + ", initialPageId=" + this.initialPageId + ", openMode=" + this.openMode + ", source=" + this.source + ", startedAtMs=" + this.startedAtMs + ", timeoutMs=" + this.timeoutMs + ", sampled=" + this.sampled + ')';
    }
}
