package com.kubi.sdk.performance.pageopen;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.sdk.performance.pageopen.c, reason: from Kotlin metadata and from toString */
/* JADX INFO: compiled from: PageOpenModels.kt */
/* JADX INFO: loaded from: classes41.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ\u0010\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ&\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\n\u0010\b¨\u0006\u0016"}, m90084d2 = {"Lcom/kubi/sdk/performance/pageopen/PageOpenPhaseTimings;", "", "dataPhaseMs", "", "renderPhaseMs", "<init>", "(Ljava/lang/Long;Ljava/lang/Long;)V", "getDataPhaseMs", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getRenderPhaseMs", "component1", "component2", "copy", "(Ljava/lang/Long;Ljava/lang/Long;)Lcom/kubi/sdk/performance/pageopen/PageOpenPhaseTimings;", "equals", "", "other", "hashCode", "", "toString", "", "LBase_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class PageOpenPhaseTimings {

    /* JADX INFO: renamed from: a, reason: from toString */
    @Nullable
    public final Long dataPhaseMs;

    /* JADX INFO: renamed from: b, reason: from toString */
    @Nullable
    public final Long renderPhaseMs;

    /* JADX WARN: Multi-variable type inference failed */
    public PageOpenPhaseTimings() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PageOpenPhaseTimings)) {
            return false;
        }
        PageOpenPhaseTimings pageOpenPhaseTimings = (PageOpenPhaseTimings) other;
        return Intrinsics.areEqual(this.dataPhaseMs, pageOpenPhaseTimings.dataPhaseMs) && Intrinsics.areEqual(this.renderPhaseMs, pageOpenPhaseTimings.renderPhaseMs);
    }

    public PageOpenPhaseTimings(@Nullable Long l11, @Nullable Long l12) {
        this.dataPhaseMs = l11;
        this.renderPhaseMs = l12;
    }

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final Long getDataPhaseMs() {
        return this.dataPhaseMs;
    }

    @Nullable
    /* JADX INFO: renamed from: b, reason: from getter */
    public final Long getRenderPhaseMs() {
        return this.renderPhaseMs;
    }

    public int hashCode() {
        Long l11 = this.dataPhaseMs;
        int iHashCode = (l11 == null ? 0 : l11.hashCode()) * 31;
        Long l12 = this.renderPhaseMs;
        return iHashCode + (l12 != null ? l12.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "PageOpenPhaseTimings(dataPhaseMs=" + this.dataPhaseMs + ", renderPhaseMs=" + this.renderPhaseMs + ')';
    }

    public /* synthetic */ PageOpenPhaseTimings(Long l11, Long l12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : l11, (i11 & 2) != 0 ? null : l12);
    }
}
