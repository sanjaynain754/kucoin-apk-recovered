package com.kubi.sdk.protocol.p118rn.protocol;

import androidx.annotation.Keep;
import com.tencent.cloud.tuikit.engine.common.internal.TUIConstantDefine;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KCBridgeCopyTradingCall.kt */
/* JADX INFO: loaded from: classes41.dex */
@Keep
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003JM\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000f¨\u0006\""}, m90084d2 = {"Lcom/kubi/sdk/protocol/rn/protocol/KCBridgeCopyTradingLeadTraderTotalPnlEntity;", "", TUIConstantDefine.USER_NAME, "", "leadTotalPnlData", "", "leadTotalPnlValue", "tradePnlSide", "", "tradeSettleCurrency", "userAvatarUrl", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;)V", "getLeadTotalPnlData", "()Ljava/util/List;", "getLeadTotalPnlValue", "()Ljava/lang/String;", "getTradePnlSide", "()J", "getTradeSettleCurrency", "getUserAvatarUrl", "getUserName", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "KcProtocol_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final /* data */ class KCBridgeCopyTradingLeadTraderTotalPnlEntity {

    @NotNull
    private final List<String> leadTotalPnlData;

    @NotNull
    private final String leadTotalPnlValue;
    private final long tradePnlSide;

    @NotNull
    private final String tradeSettleCurrency;

    @Nullable
    private final String userAvatarUrl;

    @NotNull
    private final String userName;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KCBridgeCopyTradingLeadTraderTotalPnlEntity)) {
            return false;
        }
        KCBridgeCopyTradingLeadTraderTotalPnlEntity kCBridgeCopyTradingLeadTraderTotalPnlEntity = (KCBridgeCopyTradingLeadTraderTotalPnlEntity) other;
        return Intrinsics.areEqual(this.userName, kCBridgeCopyTradingLeadTraderTotalPnlEntity.userName) && Intrinsics.areEqual(this.leadTotalPnlData, kCBridgeCopyTradingLeadTraderTotalPnlEntity.leadTotalPnlData) && Intrinsics.areEqual(this.leadTotalPnlValue, kCBridgeCopyTradingLeadTraderTotalPnlEntity.leadTotalPnlValue) && this.tradePnlSide == kCBridgeCopyTradingLeadTraderTotalPnlEntity.tradePnlSide && Intrinsics.areEqual(this.tradeSettleCurrency, kCBridgeCopyTradingLeadTraderTotalPnlEntity.tradeSettleCurrency) && Intrinsics.areEqual(this.userAvatarUrl, kCBridgeCopyTradingLeadTraderTotalPnlEntity.userAvatarUrl);
    }

    public KCBridgeCopyTradingLeadTraderTotalPnlEntity(@NotNull String userName, @NotNull List<String> leadTotalPnlData, @NotNull String leadTotalPnlValue, long j11, @NotNull String tradeSettleCurrency, @Nullable String str) {
        Intrinsics.checkNotNullParameter(userName, "userName");
        Intrinsics.checkNotNullParameter(leadTotalPnlData, "leadTotalPnlData");
        Intrinsics.checkNotNullParameter(leadTotalPnlValue, "leadTotalPnlValue");
        Intrinsics.checkNotNullParameter(tradeSettleCurrency, "tradeSettleCurrency");
        this.userName = userName;
        this.leadTotalPnlData = leadTotalPnlData;
        this.leadTotalPnlValue = leadTotalPnlValue;
        this.tradePnlSide = j11;
        this.tradeSettleCurrency = tradeSettleCurrency;
        this.userAvatarUrl = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ KCBridgeCopyTradingLeadTraderTotalPnlEntity copy$default(KCBridgeCopyTradingLeadTraderTotalPnlEntity kCBridgeCopyTradingLeadTraderTotalPnlEntity, String str, List list, String str2, long j11, String str3, String str4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = kCBridgeCopyTradingLeadTraderTotalPnlEntity.userName;
        }
        if ((i11 & 2) != 0) {
            list = kCBridgeCopyTradingLeadTraderTotalPnlEntity.leadTotalPnlData;
        }
        if ((i11 & 4) != 0) {
            str2 = kCBridgeCopyTradingLeadTraderTotalPnlEntity.leadTotalPnlValue;
        }
        if ((i11 & 8) != 0) {
            j11 = kCBridgeCopyTradingLeadTraderTotalPnlEntity.tradePnlSide;
        }
        if ((i11 & 16) != 0) {
            str3 = kCBridgeCopyTradingLeadTraderTotalPnlEntity.tradeSettleCurrency;
        }
        if ((i11 & 32) != 0) {
            str4 = kCBridgeCopyTradingLeadTraderTotalPnlEntity.userAvatarUrl;
        }
        long j12 = j11;
        String str5 = str2;
        return kCBridgeCopyTradingLeadTraderTotalPnlEntity.copy(str, list, str5, j12, str3, str4);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUserName() {
        return this.userName;
    }

    @NotNull
    public final List<String> component2() {
        return this.leadTotalPnlData;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getLeadTotalPnlValue() {
        return this.leadTotalPnlValue;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getTradePnlSide() {
        return this.tradePnlSide;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getTradeSettleCurrency() {
        return this.tradeSettleCurrency;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getUserAvatarUrl() {
        return this.userAvatarUrl;
    }

    @NotNull
    public final KCBridgeCopyTradingLeadTraderTotalPnlEntity copy(@NotNull String userName, @NotNull List<String> leadTotalPnlData, @NotNull String leadTotalPnlValue, long tradePnlSide, @NotNull String tradeSettleCurrency, @Nullable String userAvatarUrl) {
        Intrinsics.checkNotNullParameter(userName, "userName");
        Intrinsics.checkNotNullParameter(leadTotalPnlData, "leadTotalPnlData");
        Intrinsics.checkNotNullParameter(leadTotalPnlValue, "leadTotalPnlValue");
        Intrinsics.checkNotNullParameter(tradeSettleCurrency, "tradeSettleCurrency");
        return new KCBridgeCopyTradingLeadTraderTotalPnlEntity(userName, leadTotalPnlData, leadTotalPnlValue, tradePnlSide, tradeSettleCurrency, userAvatarUrl);
    }

    @NotNull
    public final List<String> getLeadTotalPnlData() {
        return this.leadTotalPnlData;
    }

    @NotNull
    public final String getLeadTotalPnlValue() {
        return this.leadTotalPnlValue;
    }

    public final long getTradePnlSide() {
        return this.tradePnlSide;
    }

    @NotNull
    public final String getTradeSettleCurrency() {
        return this.tradeSettleCurrency;
    }

    @Nullable
    public final String getUserAvatarUrl() {
        return this.userAvatarUrl;
    }

    @NotNull
    public final String getUserName() {
        return this.userName;
    }

    public int hashCode() {
        int iHashCode = ((((((((this.userName.hashCode() * 31) + this.leadTotalPnlData.hashCode()) * 31) + this.leadTotalPnlValue.hashCode()) * 31) + Long.hashCode(this.tradePnlSide)) * 31) + this.tradeSettleCurrency.hashCode()) * 31;
        String str = this.userAvatarUrl;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        return "KCBridgeCopyTradingLeadTraderTotalPnlEntity(userName=" + this.userName + ", leadTotalPnlData=" + this.leadTotalPnlData + ", leadTotalPnlValue=" + this.leadTotalPnlValue + ", tradePnlSide=" + this.tradePnlSide + ", tradeSettleCurrency=" + this.tradeSettleCurrency + ", userAvatarUrl=" + this.userAvatarUrl + ')';
    }
}
