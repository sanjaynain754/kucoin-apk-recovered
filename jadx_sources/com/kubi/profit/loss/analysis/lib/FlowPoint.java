package com.kubi.profit.loss.analysis.lib;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AssetsProfitLossAnalysisFragmentContract.kt */
/* JADX INFO: loaded from: classes35.dex */
@Keep
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J0\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001¢\u0006\u0002\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\n\"\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, m90084d2 = {"Lcom/kubi/profit/loss/analysis/lib/FlowPoint;", "", "direction", "", "timestamp", "", "amount", "<init>", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)V", "getDirection", "()Ljava/lang/String;", "getTimestamp", "()Ljava/lang/Long;", "setTimestamp", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getAmount", "setAmount", "(Ljava/lang/String;)V", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)Lcom/kubi/profit/loss/analysis/lib/FlowPoint;", "equals", "", "other", "hashCode", "", "toString", "ProfitLossAnalysisLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class FlowPoint {

    @NotNull
    private String amount;

    @Nullable
    private final String direction;

    @Nullable
    private Long timestamp;

    public FlowPoint() {
        this(null, null, null, 7, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FlowPoint)) {
            return false;
        }
        FlowPoint flowPoint = (FlowPoint) other;
        return Intrinsics.areEqual(this.direction, flowPoint.direction) && Intrinsics.areEqual(this.timestamp, flowPoint.timestamp) && Intrinsics.areEqual(this.amount, flowPoint.amount);
    }

    public FlowPoint(@Nullable String str, @Nullable Long l11, @NotNull String amount) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.direction = str;
        this.timestamp = l11;
        this.amount = amount;
    }

    public static /* synthetic */ FlowPoint copy$default(FlowPoint flowPoint, String str, Long l11, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = flowPoint.direction;
        }
        if ((i11 & 2) != 0) {
            l11 = flowPoint.timestamp;
        }
        if ((i11 & 4) != 0) {
            str2 = flowPoint.amount;
        }
        return flowPoint.copy(str, l11, str2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDirection() {
        return this.direction;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Long getTimestamp() {
        return this.timestamp;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAmount() {
        return this.amount;
    }

    @NotNull
    public final FlowPoint copy(@Nullable String direction, @Nullable Long timestamp, @NotNull String amount) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        return new FlowPoint(direction, timestamp, amount);
    }

    @NotNull
    public final String getAmount() {
        return this.amount;
    }

    @Nullable
    public final String getDirection() {
        return this.direction;
    }

    @Nullable
    public final Long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        String str = this.direction;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l11 = this.timestamp;
        return ((iHashCode + (l11 != null ? l11.hashCode() : 0)) * 31) + this.amount.hashCode();
    }

    public final void setAmount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.amount = str;
    }

    public final void setTimestamp(@Nullable Long l11) {
        this.timestamp = l11;
    }

    @NotNull
    public String toString() {
        return "FlowPoint(direction=" + this.direction + ", timestamp=" + this.timestamp + ", amount=" + this.amount + ')';
    }

    public /* synthetic */ FlowPoint(String str, Long l11, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : l11, (i11 & 4) != 0 ? "" : str2);
    }
}
