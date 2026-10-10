package com.kubi.sdk.protocol.jsapi.protocol;

import androidx.annotation.Keep;
import com.tencent.bugly.proguard.C33556b3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KCJSApiCommonModule.kt */
/* JADX INFO: loaded from: classes41.dex */
@Keep
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\r\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\t¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiCommonDeviceInfo;", "", C33556b3.f69066l2, "", "isSimulator", "", "(Ljava/lang/String;Z)V", "getBundleId", "()Ljava/lang/String;", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "KcProtocol_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final /* data */ class KCJSApiCommonDeviceInfo {

    @NotNull
    private final String bundleId;
    private final boolean isSimulator;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KCJSApiCommonDeviceInfo)) {
            return false;
        }
        KCJSApiCommonDeviceInfo kCJSApiCommonDeviceInfo = (KCJSApiCommonDeviceInfo) other;
        return Intrinsics.areEqual(this.bundleId, kCJSApiCommonDeviceInfo.bundleId) && this.isSimulator == kCJSApiCommonDeviceInfo.isSimulator;
    }

    public KCJSApiCommonDeviceInfo(@NotNull String bundleId, boolean z11) {
        Intrinsics.checkNotNullParameter(bundleId, "bundleId");
        this.bundleId = bundleId;
        this.isSimulator = z11;
    }

    public static /* synthetic */ KCJSApiCommonDeviceInfo copy$default(KCJSApiCommonDeviceInfo kCJSApiCommonDeviceInfo, String str, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = kCJSApiCommonDeviceInfo.bundleId;
        }
        if ((i11 & 2) != 0) {
            z11 = kCJSApiCommonDeviceInfo.isSimulator;
        }
        return kCJSApiCommonDeviceInfo.copy(str, z11);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getBundleId() {
        return this.bundleId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsSimulator() {
        return this.isSimulator;
    }

    @NotNull
    public final KCJSApiCommonDeviceInfo copy(@NotNull String bundleId, boolean isSimulator) {
        Intrinsics.checkNotNullParameter(bundleId, "bundleId");
        return new KCJSApiCommonDeviceInfo(bundleId, isSimulator);
    }

    @NotNull
    public final String getBundleId() {
        return this.bundleId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    public int hashCode() {
        int iHashCode = this.bundleId.hashCode() * 31;
        boolean z11 = this.isSimulator;
        ?? r11 = z11;
        if (z11) {
            r11 = 1;
        }
        return iHashCode + r11;
    }

    public final boolean isSimulator() {
        return this.isSimulator;
    }

    @NotNull
    public String toString() {
        return "KCJSApiCommonDeviceInfo(bundleId=" + this.bundleId + ", isSimulator=" + this.isSimulator + ')';
    }
}
