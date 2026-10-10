package com.kubi.margin.entity;

import androidx.annotation.Keep;
import java.math.BigDecimal;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: MarginEntity.kt */
/* JADX INFO: loaded from: classes27.dex */
@Keep
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0005HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010\u0018Jb\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0002\u0010!J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020\u0006HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001f\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018¨\u0006("}, m90084d2 = {"Lcom/kubi/margin/entity/WsIsolatedPosition;", "", "accumulatedPrincipal", "Ljava/math/BigDecimal;", "changeAssets", "", "", "Lcom/kubi/margin/entity/WsBalance;", "status", "statusBizType", "tag", "timestamp", "", "<init>", "(Ljava/math/BigDecimal;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V", "getAccumulatedPrincipal", "()Ljava/math/BigDecimal;", "getChangeAssets", "()Ljava/util/Map;", "getStatus", "()Ljava/lang/String;", "getStatusBizType", "getTag", "getTimestamp", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/math/BigDecimal;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)Lcom/kubi/margin/entity/WsIsolatedPosition;", "equals", "", "other", "hashCode", "", "toString", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class WsIsolatedPosition {

    @Nullable
    private final BigDecimal accumulatedPrincipal;

    @NotNull
    private final Map<String, WsBalance> changeAssets;

    @Nullable
    private final String status;

    @Nullable
    private final String statusBizType;

    @Nullable
    private final String tag;

    @Nullable
    private final Long timestamp;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WsIsolatedPosition)) {
            return false;
        }
        WsIsolatedPosition wsIsolatedPosition = (WsIsolatedPosition) other;
        return Intrinsics.areEqual(this.accumulatedPrincipal, wsIsolatedPosition.accumulatedPrincipal) && Intrinsics.areEqual(this.changeAssets, wsIsolatedPosition.changeAssets) && Intrinsics.areEqual(this.status, wsIsolatedPosition.status) && Intrinsics.areEqual(this.statusBizType, wsIsolatedPosition.statusBizType) && Intrinsics.areEqual(this.tag, wsIsolatedPosition.tag) && Intrinsics.areEqual(this.timestamp, wsIsolatedPosition.timestamp);
    }

    public WsIsolatedPosition(@Nullable BigDecimal bigDecimal, @NotNull Map<String, WsBalance> changeAssets, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Long l11) {
        Intrinsics.checkNotNullParameter(changeAssets, "changeAssets");
        this.accumulatedPrincipal = bigDecimal;
        this.changeAssets = changeAssets;
        this.status = str;
        this.statusBizType = str2;
        this.tag = str3;
        this.timestamp = l11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WsIsolatedPosition copy$default(WsIsolatedPosition wsIsolatedPosition, BigDecimal bigDecimal, Map map, String str, String str2, String str3, Long l11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bigDecimal = wsIsolatedPosition.accumulatedPrincipal;
        }
        if ((i11 & 2) != 0) {
            map = wsIsolatedPosition.changeAssets;
        }
        if ((i11 & 4) != 0) {
            str = wsIsolatedPosition.status;
        }
        if ((i11 & 8) != 0) {
            str2 = wsIsolatedPosition.statusBizType;
        }
        if ((i11 & 16) != 0) {
            str3 = wsIsolatedPosition.tag;
        }
        if ((i11 & 32) != 0) {
            l11 = wsIsolatedPosition.timestamp;
        }
        String str4 = str3;
        Long l12 = l11;
        return wsIsolatedPosition.copy(bigDecimal, map, str, str2, str4, l12);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final BigDecimal getAccumulatedPrincipal() {
        return this.accumulatedPrincipal;
    }

    @NotNull
    public final Map<String, WsBalance> component2() {
        return this.changeAssets;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getStatusBizType() {
        return this.statusBizType;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getTag() {
        return this.tag;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Long getTimestamp() {
        return this.timestamp;
    }

    @NotNull
    public final WsIsolatedPosition copy(@Nullable BigDecimal accumulatedPrincipal, @NotNull Map<String, WsBalance> changeAssets, @Nullable String status, @Nullable String statusBizType, @Nullable String tag, @Nullable Long timestamp) {
        Intrinsics.checkNotNullParameter(changeAssets, "changeAssets");
        return new WsIsolatedPosition(accumulatedPrincipal, changeAssets, status, statusBizType, tag, timestamp);
    }

    @Nullable
    public final BigDecimal getAccumulatedPrincipal() {
        return this.accumulatedPrincipal;
    }

    @NotNull
    public final Map<String, WsBalance> getChangeAssets() {
        return this.changeAssets;
    }

    @Nullable
    public final String getStatus() {
        return this.status;
    }

    @Nullable
    public final String getStatusBizType() {
        return this.statusBizType;
    }

    @Nullable
    public final String getTag() {
        return this.tag;
    }

    @Nullable
    public final Long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        BigDecimal bigDecimal = this.accumulatedPrincipal;
        int iHashCode = (((bigDecimal == null ? 0 : bigDecimal.hashCode()) * 31) + this.changeAssets.hashCode()) * 31;
        String str = this.status;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.statusBizType;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.tag;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l11 = this.timestamp;
        return iHashCode4 + (l11 != null ? l11.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "WsIsolatedPosition(accumulatedPrincipal=" + this.accumulatedPrincipal + ", changeAssets=" + this.changeAssets + ", status=" + this.status + ", statusBizType=" + this.statusBizType + ", tag=" + this.tag + ", timestamp=" + this.timestamp + ')';
    }
}
