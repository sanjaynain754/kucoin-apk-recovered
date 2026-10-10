package com.kubi.sdk.protocol.p118rn.protocol;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KCBridgeCopyTradingCall.kt */
/* JADX INFO: loaded from: classes41.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/sdk/protocol/rn/protocol/KCBridgeCopyTradingShareFooterInfo;", "", "footerTitle", "", "footerDesc", "qrCodeUrl", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getFooterDesc", "()Ljava/lang/String;", "getFooterTitle", "getQrCodeUrl", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "KcProtocol_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final /* data */ class KCBridgeCopyTradingShareFooterInfo {

    @NotNull
    private final String footerDesc;

    @NotNull
    private final String footerTitle;

    @NotNull
    private final String qrCodeUrl;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KCBridgeCopyTradingShareFooterInfo)) {
            return false;
        }
        KCBridgeCopyTradingShareFooterInfo kCBridgeCopyTradingShareFooterInfo = (KCBridgeCopyTradingShareFooterInfo) other;
        return Intrinsics.areEqual(this.footerTitle, kCBridgeCopyTradingShareFooterInfo.footerTitle) && Intrinsics.areEqual(this.footerDesc, kCBridgeCopyTradingShareFooterInfo.footerDesc) && Intrinsics.areEqual(this.qrCodeUrl, kCBridgeCopyTradingShareFooterInfo.qrCodeUrl);
    }

    public KCBridgeCopyTradingShareFooterInfo(@NotNull String footerTitle, @NotNull String footerDesc, @NotNull String qrCodeUrl) {
        Intrinsics.checkNotNullParameter(footerTitle, "footerTitle");
        Intrinsics.checkNotNullParameter(footerDesc, "footerDesc");
        Intrinsics.checkNotNullParameter(qrCodeUrl, "qrCodeUrl");
        this.footerTitle = footerTitle;
        this.footerDesc = footerDesc;
        this.qrCodeUrl = qrCodeUrl;
    }

    public static /* synthetic */ KCBridgeCopyTradingShareFooterInfo copy$default(KCBridgeCopyTradingShareFooterInfo kCBridgeCopyTradingShareFooterInfo, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = kCBridgeCopyTradingShareFooterInfo.footerTitle;
        }
        if ((i11 & 2) != 0) {
            str2 = kCBridgeCopyTradingShareFooterInfo.footerDesc;
        }
        if ((i11 & 4) != 0) {
            str3 = kCBridgeCopyTradingShareFooterInfo.qrCodeUrl;
        }
        return kCBridgeCopyTradingShareFooterInfo.copy(str, str2, str3);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getFooterTitle() {
        return this.footerTitle;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getFooterDesc() {
        return this.footerDesc;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getQrCodeUrl() {
        return this.qrCodeUrl;
    }

    @NotNull
    public final KCBridgeCopyTradingShareFooterInfo copy(@NotNull String footerTitle, @NotNull String footerDesc, @NotNull String qrCodeUrl) {
        Intrinsics.checkNotNullParameter(footerTitle, "footerTitle");
        Intrinsics.checkNotNullParameter(footerDesc, "footerDesc");
        Intrinsics.checkNotNullParameter(qrCodeUrl, "qrCodeUrl");
        return new KCBridgeCopyTradingShareFooterInfo(footerTitle, footerDesc, qrCodeUrl);
    }

    @NotNull
    public final String getFooterDesc() {
        return this.footerDesc;
    }

    @NotNull
    public final String getFooterTitle() {
        return this.footerTitle;
    }

    @NotNull
    public final String getQrCodeUrl() {
        return this.qrCodeUrl;
    }

    public int hashCode() {
        return (((this.footerTitle.hashCode() * 31) + this.footerDesc.hashCode()) * 31) + this.qrCodeUrl.hashCode();
    }

    @NotNull
    public String toString() {
        return "KCBridgeCopyTradingShareFooterInfo(footerTitle=" + this.footerTitle + ", footerDesc=" + this.footerDesc + ", qrCodeUrl=" + this.qrCodeUrl + ')';
    }
}
