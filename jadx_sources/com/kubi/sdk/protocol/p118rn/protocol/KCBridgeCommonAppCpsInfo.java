package com.kubi.sdk.protocol.p118rn.protocol;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KCBridgeCommonCall.kt */
/* JADX INFO: loaded from: classes41.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J;\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001b"}, m90084d2 = {"Lcom/kubi/sdk/protocol/rn/protocol/KCBridgeCommonAppCpsInfo;", "", "clientId", "", "clickId", "utmSource", "utmMedium", "utmCampaign", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getClickId", "()Ljava/lang/String;", "getClientId", "getUtmCampaign", "getUtmMedium", "getUtmSource", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "KcProtocol_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final /* data */ class KCBridgeCommonAppCpsInfo {

    @NotNull
    private final String clickId;

    @NotNull
    private final String clientId;

    @NotNull
    private final String utmCampaign;

    @NotNull
    private final String utmMedium;

    @NotNull
    private final String utmSource;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KCBridgeCommonAppCpsInfo)) {
            return false;
        }
        KCBridgeCommonAppCpsInfo kCBridgeCommonAppCpsInfo = (KCBridgeCommonAppCpsInfo) other;
        return Intrinsics.areEqual(this.clientId, kCBridgeCommonAppCpsInfo.clientId) && Intrinsics.areEqual(this.clickId, kCBridgeCommonAppCpsInfo.clickId) && Intrinsics.areEqual(this.utmSource, kCBridgeCommonAppCpsInfo.utmSource) && Intrinsics.areEqual(this.utmMedium, kCBridgeCommonAppCpsInfo.utmMedium) && Intrinsics.areEqual(this.utmCampaign, kCBridgeCommonAppCpsInfo.utmCampaign);
    }

    public KCBridgeCommonAppCpsInfo(@NotNull String clientId, @NotNull String clickId, @NotNull String utmSource, @NotNull String utmMedium, @NotNull String utmCampaign) {
        Intrinsics.checkNotNullParameter(clientId, "clientId");
        Intrinsics.checkNotNullParameter(clickId, "clickId");
        Intrinsics.checkNotNullParameter(utmSource, "utmSource");
        Intrinsics.checkNotNullParameter(utmMedium, "utmMedium");
        Intrinsics.checkNotNullParameter(utmCampaign, "utmCampaign");
        this.clientId = clientId;
        this.clickId = clickId;
        this.utmSource = utmSource;
        this.utmMedium = utmMedium;
        this.utmCampaign = utmCampaign;
    }

    public static /* synthetic */ KCBridgeCommonAppCpsInfo copy$default(KCBridgeCommonAppCpsInfo kCBridgeCommonAppCpsInfo, String str, String str2, String str3, String str4, String str5, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = kCBridgeCommonAppCpsInfo.clientId;
        }
        if ((i11 & 2) != 0) {
            str2 = kCBridgeCommonAppCpsInfo.clickId;
        }
        if ((i11 & 4) != 0) {
            str3 = kCBridgeCommonAppCpsInfo.utmSource;
        }
        if ((i11 & 8) != 0) {
            str4 = kCBridgeCommonAppCpsInfo.utmMedium;
        }
        if ((i11 & 16) != 0) {
            str5 = kCBridgeCommonAppCpsInfo.utmCampaign;
        }
        String str6 = str5;
        String str7 = str3;
        return kCBridgeCommonAppCpsInfo.copy(str, str2, str7, str4, str6);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getClientId() {
        return this.clientId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getClickId() {
        return this.clickId;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getUtmSource() {
        return this.utmSource;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getUtmMedium() {
        return this.utmMedium;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getUtmCampaign() {
        return this.utmCampaign;
    }

    @NotNull
    public final KCBridgeCommonAppCpsInfo copy(@NotNull String clientId, @NotNull String clickId, @NotNull String utmSource, @NotNull String utmMedium, @NotNull String utmCampaign) {
        Intrinsics.checkNotNullParameter(clientId, "clientId");
        Intrinsics.checkNotNullParameter(clickId, "clickId");
        Intrinsics.checkNotNullParameter(utmSource, "utmSource");
        Intrinsics.checkNotNullParameter(utmMedium, "utmMedium");
        Intrinsics.checkNotNullParameter(utmCampaign, "utmCampaign");
        return new KCBridgeCommonAppCpsInfo(clientId, clickId, utmSource, utmMedium, utmCampaign);
    }

    @NotNull
    public final String getClickId() {
        return this.clickId;
    }

    @NotNull
    public final String getClientId() {
        return this.clientId;
    }

    @NotNull
    public final String getUtmCampaign() {
        return this.utmCampaign;
    }

    @NotNull
    public final String getUtmMedium() {
        return this.utmMedium;
    }

    @NotNull
    public final String getUtmSource() {
        return this.utmSource;
    }

    public int hashCode() {
        return (((((((this.clientId.hashCode() * 31) + this.clickId.hashCode()) * 31) + this.utmSource.hashCode()) * 31) + this.utmMedium.hashCode()) * 31) + this.utmCampaign.hashCode();
    }

    @NotNull
    public String toString() {
        return "KCBridgeCommonAppCpsInfo(clientId=" + this.clientId + ", clickId=" + this.clickId + ", utmSource=" + this.utmSource + ", utmMedium=" + this.utmMedium + ", utmCampaign=" + this.utmCampaign + ')';
    }
}
