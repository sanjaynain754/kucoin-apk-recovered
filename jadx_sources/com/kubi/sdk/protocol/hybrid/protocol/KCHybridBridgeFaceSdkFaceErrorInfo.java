package com.kubi.sdk.protocol.hybrid.protocol;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KCHybridBridgeFaceSdkCall.kt */
/* JADX INFO: loaded from: classes41.dex */
@Keep
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, m90084d2 = {"Lcom/kubi/sdk/protocol/hybrid/protocol/KCHybridBridgeFaceSdkFaceErrorInfo;", "", "errCode", "", "errMsg", "", "(JLjava/lang/String;)V", "getErrCode", "()J", "getErrMsg", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "KcProtocol_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final /* data */ class KCHybridBridgeFaceSdkFaceErrorInfo {
    private final long errCode;

    @NotNull
    private final String errMsg;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KCHybridBridgeFaceSdkFaceErrorInfo)) {
            return false;
        }
        KCHybridBridgeFaceSdkFaceErrorInfo kCHybridBridgeFaceSdkFaceErrorInfo = (KCHybridBridgeFaceSdkFaceErrorInfo) other;
        return this.errCode == kCHybridBridgeFaceSdkFaceErrorInfo.errCode && Intrinsics.areEqual(this.errMsg, kCHybridBridgeFaceSdkFaceErrorInfo.errMsg);
    }

    public KCHybridBridgeFaceSdkFaceErrorInfo(long j11, @NotNull String errMsg) {
        Intrinsics.checkNotNullParameter(errMsg, "errMsg");
        this.errCode = j11;
        this.errMsg = errMsg;
    }

    public static /* synthetic */ KCHybridBridgeFaceSdkFaceErrorInfo copy$default(KCHybridBridgeFaceSdkFaceErrorInfo kCHybridBridgeFaceSdkFaceErrorInfo, long j11, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = kCHybridBridgeFaceSdkFaceErrorInfo.errCode;
        }
        if ((i11 & 2) != 0) {
            str = kCHybridBridgeFaceSdkFaceErrorInfo.errMsg;
        }
        return kCHybridBridgeFaceSdkFaceErrorInfo.copy(j11, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getErrCode() {
        return this.errCode;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getErrMsg() {
        return this.errMsg;
    }

    @NotNull
    public final KCHybridBridgeFaceSdkFaceErrorInfo copy(long errCode, @NotNull String errMsg) {
        Intrinsics.checkNotNullParameter(errMsg, "errMsg");
        return new KCHybridBridgeFaceSdkFaceErrorInfo(errCode, errMsg);
    }

    public final long getErrCode() {
        return this.errCode;
    }

    @NotNull
    public final String getErrMsg() {
        return this.errMsg;
    }

    public int hashCode() {
        return (Long.hashCode(this.errCode) * 31) + this.errMsg.hashCode();
    }

    @NotNull
    public String toString() {
        return "KCHybridBridgeFaceSdkFaceErrorInfo(errCode=" + this.errCode + ", errMsg=" + this.errMsg + ')';
    }
}
