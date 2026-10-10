package com.kubi.network.socket.utils;

import androidx.media3.exoplayer.upstream.CmcdData;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: com.kubi.network.socket.utils.j, reason: from toString */
/* JADX INFO: compiled from: SuccessRateEvaluator.kt */
/* JADX INFO: loaded from: classes64.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\u0014¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/network/socket/utils/j;", "", "", "windowSuccessRate", "totalSuccessRate", "<init>", "(DD)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "D", "b", "()D", "network-core-socket_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final /* data */ class SuccessRateStats {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    public final double windowSuccessRate;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    public final double totalSuccessRate;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SuccessRateStats)) {
            return false;
        }
        SuccessRateStats successRateStats = (SuccessRateStats) other;
        return Double.compare(this.windowSuccessRate, successRateStats.windowSuccessRate) == 0 && Double.compare(this.totalSuccessRate, successRateStats.totalSuccessRate) == 0;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final double getTotalSuccessRate() {
        return this.totalSuccessRate;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final double getWindowSuccessRate() {
        return this.windowSuccessRate;
    }

    public int hashCode() {
        return (Double.hashCode(this.windowSuccessRate) * 31) + Double.hashCode(this.totalSuccessRate);
    }

    @NotNull
    public String toString() {
        return "SuccessRateStats(windowSuccessRate=" + this.windowSuccessRate + ", totalSuccessRate=" + this.totalSuccessRate + ')';
    }

    public SuccessRateStats(double d11, double d12) {
        this.windowSuccessRate = d11;
        this.totalSuccessRate = d12;
    }
}
