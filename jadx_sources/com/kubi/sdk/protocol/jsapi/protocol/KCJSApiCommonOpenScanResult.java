package com.kubi.sdk.protocol.jsapi.protocol;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KCJSApiCommonModule.kt */
/* JADX INFO: loaded from: classes41.dex */
@Keep
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, m90084d2 = {"Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiCommonOpenScanResult;", "", "success", "", "qrCode", "", "msg", "(ZLjava/lang/String;Ljava/lang/String;)V", "getMsg", "()Ljava/lang/String;", "getQrCode", "getSuccess", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "KcProtocol_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final /* data */ class KCJSApiCommonOpenScanResult {

    @NotNull
    private final String msg;

    @NotNull
    private final String qrCode;
    private final boolean success;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KCJSApiCommonOpenScanResult)) {
            return false;
        }
        KCJSApiCommonOpenScanResult kCJSApiCommonOpenScanResult = (KCJSApiCommonOpenScanResult) other;
        return this.success == kCJSApiCommonOpenScanResult.success && Intrinsics.areEqual(this.qrCode, kCJSApiCommonOpenScanResult.qrCode) && Intrinsics.areEqual(this.msg, kCJSApiCommonOpenScanResult.msg);
    }

    public KCJSApiCommonOpenScanResult(boolean z11, @NotNull String qrCode, @NotNull String msg) {
        Intrinsics.checkNotNullParameter(qrCode, "qrCode");
        Intrinsics.checkNotNullParameter(msg, "msg");
        this.success = z11;
        this.qrCode = qrCode;
        this.msg = msg;
    }

    public static /* synthetic */ KCJSApiCommonOpenScanResult copy$default(KCJSApiCommonOpenScanResult kCJSApiCommonOpenScanResult, boolean z11, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = kCJSApiCommonOpenScanResult.success;
        }
        if ((i11 & 2) != 0) {
            str = kCJSApiCommonOpenScanResult.qrCode;
        }
        if ((i11 & 4) != 0) {
            str2 = kCJSApiCommonOpenScanResult.msg;
        }
        return kCJSApiCommonOpenScanResult.copy(z11, str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getSuccess() {
        return this.success;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getQrCode() {
        return this.qrCode;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getMsg() {
        return this.msg;
    }

    @NotNull
    public final KCJSApiCommonOpenScanResult copy(boolean success, @NotNull String qrCode, @NotNull String msg) {
        Intrinsics.checkNotNullParameter(qrCode, "qrCode");
        Intrinsics.checkNotNullParameter(msg, "msg");
        return new KCJSApiCommonOpenScanResult(success, qrCode, msg);
    }

    @NotNull
    public final String getMsg() {
        return this.msg;
    }

    @NotNull
    public final String getQrCode() {
        return this.qrCode;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public int hashCode() {
        boolean z11 = this.success;
        ?? r11 = z11;
        if (z11) {
            r11 = 1;
        }
        return (((r11 * 31) + this.qrCode.hashCode()) * 31) + this.msg.hashCode();
    }

    @NotNull
    public String toString() {
        return "KCJSApiCommonOpenScanResult(success=" + this.success + ", qrCode=" + this.qrCode + ", msg=" + this.msg + ')';
    }
}
