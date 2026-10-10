package com.kubi.sdk.protocol.hybrid.protocol;

import androidx.annotation.Keep;
import cn.jiguang.privates.push.constants.JPushConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KCHybridBridgeOperationCall.kt */
/* JADX INFO: loaded from: classes41.dex */
@Keep
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\tJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\rJ\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\rJ:\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001e"}, m90084d2 = {"Lcom/kubi/sdk/protocol/hybrid/protocol/KCHybridBridgeOperationLocationInfo;", "", "code", "", "msg", "", JPushConstants.Geofence.KEY_LONGITUDE, "", JPushConstants.Geofence.KEY_LATITUDE, "(JLjava/lang/String;Ljava/lang/Double;Ljava/lang/Double;)V", "getCode", "()J", "getLatitude", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getLongitude", "getMsg", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "(JLjava/lang/String;Ljava/lang/Double;Ljava/lang/Double;)Lcom/kubi/sdk/protocol/hybrid/protocol/KCHybridBridgeOperationLocationInfo;", "equals", "", "other", "hashCode", "", "toString", "KcProtocol_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final /* data */ class KCHybridBridgeOperationLocationInfo {
    private final long code;

    @Nullable
    private final Double latitude;

    @Nullable
    private final Double longitude;

    @NotNull
    private final String msg;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KCHybridBridgeOperationLocationInfo)) {
            return false;
        }
        KCHybridBridgeOperationLocationInfo kCHybridBridgeOperationLocationInfo = (KCHybridBridgeOperationLocationInfo) other;
        return this.code == kCHybridBridgeOperationLocationInfo.code && Intrinsics.areEqual(this.msg, kCHybridBridgeOperationLocationInfo.msg) && Intrinsics.areEqual((Object) this.longitude, (Object) kCHybridBridgeOperationLocationInfo.longitude) && Intrinsics.areEqual((Object) this.latitude, (Object) kCHybridBridgeOperationLocationInfo.latitude);
    }

    public KCHybridBridgeOperationLocationInfo(long j11, @NotNull String msg, @Nullable Double d11, @Nullable Double d12) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        this.code = j11;
        this.msg = msg;
        this.longitude = d11;
        this.latitude = d12;
    }

    public static /* synthetic */ KCHybridBridgeOperationLocationInfo copy$default(KCHybridBridgeOperationLocationInfo kCHybridBridgeOperationLocationInfo, long j11, String str, Double d11, Double d12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = kCHybridBridgeOperationLocationInfo.code;
        }
        long j12 = j11;
        if ((i11 & 2) != 0) {
            str = kCHybridBridgeOperationLocationInfo.msg;
        }
        String str2 = str;
        if ((i11 & 4) != 0) {
            d11 = kCHybridBridgeOperationLocationInfo.longitude;
        }
        Double d13 = d11;
        if ((i11 & 8) != 0) {
            d12 = kCHybridBridgeOperationLocationInfo.latitude;
        }
        return kCHybridBridgeOperationLocationInfo.copy(j12, str2, d13, d12);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getCode() {
        return this.code;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMsg() {
        return this.msg;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Double getLongitude() {
        return this.longitude;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Double getLatitude() {
        return this.latitude;
    }

    @NotNull
    public final KCHybridBridgeOperationLocationInfo copy(long code, @NotNull String msg, @Nullable Double longitude, @Nullable Double latitude) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        return new KCHybridBridgeOperationLocationInfo(code, msg, longitude, latitude);
    }

    public final long getCode() {
        return this.code;
    }

    @Nullable
    public final Double getLatitude() {
        return this.latitude;
    }

    @Nullable
    public final Double getLongitude() {
        return this.longitude;
    }

    @NotNull
    public final String getMsg() {
        return this.msg;
    }

    public int hashCode() {
        int iHashCode = ((Long.hashCode(this.code) * 31) + this.msg.hashCode()) * 31;
        Double d11 = this.longitude;
        int iHashCode2 = (iHashCode + (d11 == null ? 0 : d11.hashCode())) * 31;
        Double d12 = this.latitude;
        return iHashCode2 + (d12 != null ? d12.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "KCHybridBridgeOperationLocationInfo(code=" + this.code + ", msg=" + this.msg + ", longitude=" + this.longitude + ", latitude=" + this.latitude + ')';
    }
}
