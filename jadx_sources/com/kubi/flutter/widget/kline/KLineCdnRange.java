package com.kubi.flutter.widget.kline;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: com.kubi.flutter.widget.kline.d, reason: from Kotlin metadata and from toString */
/* JADX INFO: compiled from: KLineCdnRange.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, m90084d2 = {"Lcom/kubi/flutter/widget/kline/KLineCdnRange;", "", "begin", "", "end", "<init>", "(JJ)V", "getBegin", "()J", "getEnd", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "LKLineWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class KLineCdnRange {

    /* JADX INFO: renamed from: a, reason: from toString */
    public final long begin;

    /* JADX INFO: renamed from: b, reason: from toString */
    public final long end;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KLineCdnRange)) {
            return false;
        }
        KLineCdnRange kLineCdnRange = (KLineCdnRange) other;
        return this.begin == kLineCdnRange.begin && this.end == kLineCdnRange.end;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getBegin() {
        return this.begin;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getEnd() {
        return this.end;
    }

    public int hashCode() {
        return (Long.hashCode(this.begin) * 31) + Long.hashCode(this.end);
    }

    @NotNull
    public String toString() {
        return "KLineCdnRange(begin=" + this.begin + ", end=" + this.end + ')';
    }

    public KLineCdnRange(long j11, long j12) {
        this.begin = j11;
        this.end = j12;
    }
}
