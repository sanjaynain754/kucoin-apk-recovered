package com.kubi.futures.trade.position;

import androidx.annotation.Keep;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FuturesPositionAggregateManager.kt */
/* JADX INFO: loaded from: classes13.dex */
@Keep
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\bHÆ\u0003J-\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, m90084d2 = {"Lcom/kubi/futures/trade/position/FuturesPositionAggregateEntity;", "", "bizType", "", "positions", "", "Lcom/kubi/futures/trade/position/FuturesPositionWithTpSlEntity;", "timestamp", "", "<init>", "(Ljava/lang/String;Ljava/util/List;J)V", "getBizType", "()Ljava/lang/String;", "getPositions", "()Ljava/util/List;", "getTimestamp", "()J", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class FuturesPositionAggregateEntity {

    @NotNull
    private final String bizType;

    @NotNull
    private final List<FuturesPositionWithTpSlEntity> positions;
    private final long timestamp;

    public FuturesPositionAggregateEntity(@NotNull String bizType, @NotNull List<FuturesPositionWithTpSlEntity> positions, long j11) {
        Intrinsics.checkNotNullParameter(bizType, "bizType");
        Intrinsics.checkNotNullParameter(positions, "positions");
        this.bizType = bizType;
        this.positions = positions;
        this.timestamp = j11;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FuturesPositionAggregateEntity)) {
            return false;
        }
        FuturesPositionAggregateEntity futuresPositionAggregateEntity = (FuturesPositionAggregateEntity) other;
        return Intrinsics.areEqual(this.bizType, futuresPositionAggregateEntity.bizType) && Intrinsics.areEqual(this.positions, futuresPositionAggregateEntity.positions) && this.timestamp == futuresPositionAggregateEntity.timestamp;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FuturesPositionAggregateEntity copy$default(FuturesPositionAggregateEntity futuresPositionAggregateEntity, String str, List list, long j11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = futuresPositionAggregateEntity.bizType;
        }
        if ((i11 & 2) != 0) {
            list = futuresPositionAggregateEntity.positions;
        }
        if ((i11 & 4) != 0) {
            j11 = futuresPositionAggregateEntity.timestamp;
        }
        return futuresPositionAggregateEntity.copy(str, list, j11);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getBizType() {
        return this.bizType;
    }

    @NotNull
    public final List<FuturesPositionWithTpSlEntity> component2() {
        return this.positions;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    @NotNull
    public final FuturesPositionAggregateEntity copy(@NotNull String bizType, @NotNull List<FuturesPositionWithTpSlEntity> positions, long timestamp) {
        Intrinsics.checkNotNullParameter(bizType, "bizType");
        Intrinsics.checkNotNullParameter(positions, "positions");
        return new FuturesPositionAggregateEntity(bizType, positions, timestamp);
    }

    @NotNull
    public final String getBizType() {
        return this.bizType;
    }

    @NotNull
    public final List<FuturesPositionWithTpSlEntity> getPositions() {
        return this.positions;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        return (((this.bizType.hashCode() * 31) + this.positions.hashCode()) * 31) + Long.hashCode(this.timestamp);
    }

    @NotNull
    public String toString() {
        return "FuturesPositionAggregateEntity(bizType=" + this.bizType + ", positions=" + this.positions + ", timestamp=" + this.timestamp + ')';
    }

    public /* synthetic */ FuturesPositionAggregateEntity(String str, List list, long j11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? CollectionsKt.emptyList() : list, j11);
    }
}
