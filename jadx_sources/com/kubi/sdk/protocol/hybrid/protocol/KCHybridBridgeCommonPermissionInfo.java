package com.kubi.sdk.protocol.hybrid.protocol;

import androidx.annotation.Keep;
import com.kubi.p110rn.modules.BridgeParamKeyKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: KCHybridBridgeCommonCall.kt */
/* JADX INFO: loaded from: classes41.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\t\u0010\r\u001a\u00020\u000eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/sdk/protocol/hybrid/protocol/KCHybridBridgeCommonPermissionInfo;", "", BridgeParamKeyKt.RN_CONTAINER_UI_ENABLE, "", "(Z)V", "getEnable", "()Z", "component1", "copy", "equals", "other", "hashCode", "", "toString", "", "KcProtocol_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final /* data */ class KCHybridBridgeCommonPermissionInfo {
    private final boolean enable;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof KCHybridBridgeCommonPermissionInfo) && this.enable == ((KCHybridBridgeCommonPermissionInfo) other).enable;
    }

    public static /* synthetic */ KCHybridBridgeCommonPermissionInfo copy$default(KCHybridBridgeCommonPermissionInfo kCHybridBridgeCommonPermissionInfo, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = kCHybridBridgeCommonPermissionInfo.enable;
        }
        return kCHybridBridgeCommonPermissionInfo.copy(z11);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getEnable() {
        return this.enable;
    }

    @NotNull
    public final KCHybridBridgeCommonPermissionInfo copy(boolean enable) {
        return new KCHybridBridgeCommonPermissionInfo(enable);
    }

    public final boolean getEnable() {
        return this.enable;
    }

    public int hashCode() {
        boolean z11 = this.enable;
        if (z11) {
            return 1;
        }
        return z11 ? 1 : 0;
    }

    @NotNull
    public String toString() {
        return "KCHybridBridgeCommonPermissionInfo(enable=" + this.enable + ')';
    }

    public KCHybridBridgeCommonPermissionInfo(boolean z11) {
        this.enable = z11;
    }
}
