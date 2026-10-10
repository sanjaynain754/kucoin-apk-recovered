package com.kubi.sdk.protocol.router.protocol;

import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KCRouterBridgeSafeCenterCall.kt */
/* JADX INFO: loaded from: classes41.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, m90084d2 = {"Lcom/kubi/sdk/protocol/router/protocol/KCRouterBridgeSafeCenterScanTokenEntity;", "", "ip", "", FirebaseAnalytics.Param.LOCATION, "riskStrategy", "device", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDevice", "()Ljava/lang/String;", "getIp", "getLocation", "getRiskStrategy", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "KcProtocol_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final /* data */ class KCRouterBridgeSafeCenterScanTokenEntity {

    @Nullable
    private final String device;

    @Nullable
    private final String ip;

    @Nullable
    private final String location;

    @Nullable
    private final String riskStrategy;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KCRouterBridgeSafeCenterScanTokenEntity)) {
            return false;
        }
        KCRouterBridgeSafeCenterScanTokenEntity kCRouterBridgeSafeCenterScanTokenEntity = (KCRouterBridgeSafeCenterScanTokenEntity) other;
        return Intrinsics.areEqual(this.ip, kCRouterBridgeSafeCenterScanTokenEntity.ip) && Intrinsics.areEqual(this.location, kCRouterBridgeSafeCenterScanTokenEntity.location) && Intrinsics.areEqual(this.riskStrategy, kCRouterBridgeSafeCenterScanTokenEntity.riskStrategy) && Intrinsics.areEqual(this.device, kCRouterBridgeSafeCenterScanTokenEntity.device);
    }

    public static /* synthetic */ KCRouterBridgeSafeCenterScanTokenEntity copy$default(KCRouterBridgeSafeCenterScanTokenEntity kCRouterBridgeSafeCenterScanTokenEntity, String str, String str2, String str3, String str4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = kCRouterBridgeSafeCenterScanTokenEntity.ip;
        }
        if ((i11 & 2) != 0) {
            str2 = kCRouterBridgeSafeCenterScanTokenEntity.location;
        }
        if ((i11 & 4) != 0) {
            str3 = kCRouterBridgeSafeCenterScanTokenEntity.riskStrategy;
        }
        if ((i11 & 8) != 0) {
            str4 = kCRouterBridgeSafeCenterScanTokenEntity.device;
        }
        return kCRouterBridgeSafeCenterScanTokenEntity.copy(str, str2, str3, str4);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getIp() {
        return this.ip;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLocation() {
        return this.location;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getRiskStrategy() {
        return this.riskStrategy;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDevice() {
        return this.device;
    }

    @NotNull
    public final KCRouterBridgeSafeCenterScanTokenEntity copy(@Nullable String ip2, @Nullable String location, @Nullable String riskStrategy, @Nullable String device) {
        return new KCRouterBridgeSafeCenterScanTokenEntity(ip2, location, riskStrategy, device);
    }

    @Nullable
    public final String getDevice() {
        return this.device;
    }

    @Nullable
    public final String getIp() {
        return this.ip;
    }

    @Nullable
    public final String getLocation() {
        return this.location;
    }

    @Nullable
    public final String getRiskStrategy() {
        return this.riskStrategy;
    }

    public int hashCode() {
        String str = this.ip;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.location;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.riskStrategy;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.device;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "KCRouterBridgeSafeCenterScanTokenEntity(ip=" + this.ip + ", location=" + this.location + ", riskStrategy=" + this.riskStrategy + ", device=" + this.device + ')';
    }

    public KCRouterBridgeSafeCenterScanTokenEntity(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        this.ip = str;
        this.location = str2;
        this.riskStrategy = str3;
        this.device = str4;
    }
}
