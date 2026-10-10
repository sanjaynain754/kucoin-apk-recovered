package com.kubi.sdk.protocol.hybrid.protocol;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KCHybridBridgeSafeCall.kt */
/* JADX INFO: loaded from: classes41.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u0010\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0006J\u0010\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0006J&\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u000bJ\u0013\u0010\f\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0002\u0010\u0006R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0004\u0010\u0006¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/sdk/protocol/hybrid/protocol/KCHybridBridgeSafeSafeGuardStatus;", "", "isDeviceSupport", "", "isSiteSupport", "(Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "copy", "(Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/kubi/sdk/protocol/hybrid/protocol/KCHybridBridgeSafeSafeGuardStatus;", "equals", "other", "hashCode", "", "toString", "", "KcProtocol_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final /* data */ class KCHybridBridgeSafeSafeGuardStatus {

    @Nullable
    private final Boolean isDeviceSupport;

    @Nullable
    private final Boolean isSiteSupport;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KCHybridBridgeSafeSafeGuardStatus)) {
            return false;
        }
        KCHybridBridgeSafeSafeGuardStatus kCHybridBridgeSafeSafeGuardStatus = (KCHybridBridgeSafeSafeGuardStatus) other;
        return Intrinsics.areEqual(this.isDeviceSupport, kCHybridBridgeSafeSafeGuardStatus.isDeviceSupport) && Intrinsics.areEqual(this.isSiteSupport, kCHybridBridgeSafeSafeGuardStatus.isSiteSupport);
    }

    public static /* synthetic */ KCHybridBridgeSafeSafeGuardStatus copy$default(KCHybridBridgeSafeSafeGuardStatus kCHybridBridgeSafeSafeGuardStatus, Boolean bool, Boolean bool2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bool = kCHybridBridgeSafeSafeGuardStatus.isDeviceSupport;
        }
        if ((i11 & 2) != 0) {
            bool2 = kCHybridBridgeSafeSafeGuardStatus.isSiteSupport;
        }
        return kCHybridBridgeSafeSafeGuardStatus.copy(bool, bool2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Boolean getIsDeviceSupport() {
        return this.isDeviceSupport;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Boolean getIsSiteSupport() {
        return this.isSiteSupport;
    }

    @NotNull
    public final KCHybridBridgeSafeSafeGuardStatus copy(@Nullable Boolean isDeviceSupport, @Nullable Boolean isSiteSupport) {
        return new KCHybridBridgeSafeSafeGuardStatus(isDeviceSupport, isSiteSupport);
    }

    public int hashCode() {
        Boolean bool = this.isDeviceSupport;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.isSiteSupport;
        return iHashCode + (bool2 != null ? bool2.hashCode() : 0);
    }

    @Nullable
    public final Boolean isDeviceSupport() {
        return this.isDeviceSupport;
    }

    @Nullable
    public final Boolean isSiteSupport() {
        return this.isSiteSupport;
    }

    @NotNull
    public String toString() {
        return "KCHybridBridgeSafeSafeGuardStatus(isDeviceSupport=" + this.isDeviceSupport + ", isSiteSupport=" + this.isSiteSupport + ')';
    }

    public KCHybridBridgeSafeSafeGuardStatus(@Nullable Boolean bool, @Nullable Boolean bool2) {
        this.isDeviceSupport = bool;
        this.isSiteSupport = bool2;
    }
}
