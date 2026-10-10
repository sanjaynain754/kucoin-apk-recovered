package com.kubi.sdk.protocol.p118rn.protocol;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KCBridgeCopyTradingCall.kt */
/* JADX INFO: loaded from: classes41.dex */
@Keep
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003JQ\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\r¨\u0006#"}, m90084d2 = {"Lcom/kubi/sdk/protocol/rn/protocol/KCBridgeCopyTradingCopyTraderFollowOneTraderPnlEntity;", "", "copyTraderName", "", "pnlPercent", "pnlValue", "tradePnlSide", "", "leadTraderName", "tradeSettleCurrency", "copyTraderAvatarUrl", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCopyTraderAvatarUrl", "()Ljava/lang/String;", "getCopyTraderName", "getLeadTraderName", "getPnlPercent", "getPnlValue", "getTradePnlSide", "()J", "getTradeSettleCurrency", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "KcProtocol_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final /* data */ class KCBridgeCopyTradingCopyTraderFollowOneTraderPnlEntity {

    @Nullable
    private final String copyTraderAvatarUrl;

    @NotNull
    private final String copyTraderName;

    @NotNull
    private final String leadTraderName;

    @NotNull
    private final String pnlPercent;

    @NotNull
    private final String pnlValue;
    private final long tradePnlSide;

    @NotNull
    private final String tradeSettleCurrency;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KCBridgeCopyTradingCopyTraderFollowOneTraderPnlEntity)) {
            return false;
        }
        KCBridgeCopyTradingCopyTraderFollowOneTraderPnlEntity kCBridgeCopyTradingCopyTraderFollowOneTraderPnlEntity = (KCBridgeCopyTradingCopyTraderFollowOneTraderPnlEntity) other;
        return Intrinsics.areEqual(this.copyTraderName, kCBridgeCopyTradingCopyTraderFollowOneTraderPnlEntity.copyTraderName) && Intrinsics.areEqual(this.pnlPercent, kCBridgeCopyTradingCopyTraderFollowOneTraderPnlEntity.pnlPercent) && Intrinsics.areEqual(this.pnlValue, kCBridgeCopyTradingCopyTraderFollowOneTraderPnlEntity.pnlValue) && this.tradePnlSide == kCBridgeCopyTradingCopyTraderFollowOneTraderPnlEntity.tradePnlSide && Intrinsics.areEqual(this.leadTraderName, kCBridgeCopyTradingCopyTraderFollowOneTraderPnlEntity.leadTraderName) && Intrinsics.areEqual(this.tradeSettleCurrency, kCBridgeCopyTradingCopyTraderFollowOneTraderPnlEntity.tradeSettleCurrency) && Intrinsics.areEqual(this.copyTraderAvatarUrl, kCBridgeCopyTradingCopyTraderFollowOneTraderPnlEntity.copyTraderAvatarUrl);
    }

    public KCBridgeCopyTradingCopyTraderFollowOneTraderPnlEntity(@NotNull String copyTraderName, @NotNull String pnlPercent, @NotNull String pnlValue, long j11, @NotNull String leadTraderName, @NotNull String tradeSettleCurrency, @Nullable String str) {
        Intrinsics.checkNotNullParameter(copyTraderName, "copyTraderName");
        Intrinsics.checkNotNullParameter(pnlPercent, "pnlPercent");
        Intrinsics.checkNotNullParameter(pnlValue, "pnlValue");
        Intrinsics.checkNotNullParameter(leadTraderName, "leadTraderName");
        Intrinsics.checkNotNullParameter(tradeSettleCurrency, "tradeSettleCurrency");
        this.copyTraderName = copyTraderName;
        this.pnlPercent = pnlPercent;
        this.pnlValue = pnlValue;
        this.tradePnlSide = j11;
        this.leadTraderName = leadTraderName;
        this.tradeSettleCurrency = tradeSettleCurrency;
        this.copyTraderAvatarUrl = str;
    }

    public static /* synthetic */ KCBridgeCopyTradingCopyTraderFollowOneTraderPnlEntity copy$default(KCBridgeCopyTradingCopyTraderFollowOneTraderPnlEntity kCBridgeCopyTradingCopyTraderFollowOneTraderPnlEntity, String str, String str2, String str3, long j11, String str4, String str5, String str6, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = kCBridgeCopyTradingCopyTraderFollowOneTraderPnlEntity.copyTraderName;
        }
        if ((i11 & 2) != 0) {
            str2 = kCBridgeCopyTradingCopyTraderFollowOneTraderPnlEntity.pnlPercent;
        }
        if ((i11 & 4) != 0) {
            str3 = kCBridgeCopyTradingCopyTraderFollowOneTraderPnlEntity.pnlValue;
        }
        if ((i11 & 8) != 0) {
            j11 = kCBridgeCopyTradingCopyTraderFollowOneTraderPnlEntity.tradePnlSide;
        }
        if ((i11 & 16) != 0) {
            str4 = kCBridgeCopyTradingCopyTraderFollowOneTraderPnlEntity.leadTraderName;
        }
        if ((i11 & 32) != 0) {
            str5 = kCBridgeCopyTradingCopyTraderFollowOneTraderPnlEntity.tradeSettleCurrency;
        }
        if ((i11 & 64) != 0) {
            str6 = kCBridgeCopyTradingCopyTraderFollowOneTraderPnlEntity.copyTraderAvatarUrl;
        }
        String str7 = str6;
        String str8 = str4;
        long j12 = j11;
        String str9 = str3;
        return kCBridgeCopyTradingCopyTraderFollowOneTraderPnlEntity.copy(str, str2, str9, j12, str8, str5, str7);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCopyTraderName() {
        return this.copyTraderName;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPnlPercent() {
        return this.pnlPercent;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPnlValue() {
        return this.pnlValue;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getTradePnlSide() {
        return this.tradePnlSide;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getLeadTraderName() {
        return this.leadTraderName;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getTradeSettleCurrency() {
        return this.tradeSettleCurrency;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getCopyTraderAvatarUrl() {
        return this.copyTraderAvatarUrl;
    }

    @NotNull
    public final KCBridgeCopyTradingCopyTraderFollowOneTraderPnlEntity copy(@NotNull String copyTraderName, @NotNull String pnlPercent, @NotNull String pnlValue, long tradePnlSide, @NotNull String leadTraderName, @NotNull String tradeSettleCurrency, @Nullable String copyTraderAvatarUrl) {
        Intrinsics.checkNotNullParameter(copyTraderName, "copyTraderName");
        Intrinsics.checkNotNullParameter(pnlPercent, "pnlPercent");
        Intrinsics.checkNotNullParameter(pnlValue, "pnlValue");
        Intrinsics.checkNotNullParameter(leadTraderName, "leadTraderName");
        Intrinsics.checkNotNullParameter(tradeSettleCurrency, "tradeSettleCurrency");
        return new KCBridgeCopyTradingCopyTraderFollowOneTraderPnlEntity(copyTraderName, pnlPercent, pnlValue, tradePnlSide, leadTraderName, tradeSettleCurrency, copyTraderAvatarUrl);
    }

    @Nullable
    public final String getCopyTraderAvatarUrl() {
        return this.copyTraderAvatarUrl;
    }

    @NotNull
    public final String getCopyTraderName() {
        return this.copyTraderName;
    }

    @NotNull
    public final String getLeadTraderName() {
        return this.leadTraderName;
    }

    @NotNull
    public final String getPnlPercent() {
        return this.pnlPercent;
    }

    @NotNull
    public final String getPnlValue() {
        return this.pnlValue;
    }

    public final long getTradePnlSide() {
        return this.tradePnlSide;
    }

    @NotNull
    public final String getTradeSettleCurrency() {
        return this.tradeSettleCurrency;
    }

    public int hashCode() {
        int iHashCode = ((((((((((this.copyTraderName.hashCode() * 31) + this.pnlPercent.hashCode()) * 31) + this.pnlValue.hashCode()) * 31) + Long.hashCode(this.tradePnlSide)) * 31) + this.leadTraderName.hashCode()) * 31) + this.tradeSettleCurrency.hashCode()) * 31;
        String str = this.copyTraderAvatarUrl;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        return "KCBridgeCopyTradingCopyTraderFollowOneTraderPnlEntity(copyTraderName=" + this.copyTraderName + ", pnlPercent=" + this.pnlPercent + ", pnlValue=" + this.pnlValue + ", tradePnlSide=" + this.tradePnlSide + ", leadTraderName=" + this.leadTraderName + ", tradeSettleCurrency=" + this.tradeSettleCurrency + ", copyTraderAvatarUrl=" + this.copyTraderAvatarUrl + ')';
    }
}
