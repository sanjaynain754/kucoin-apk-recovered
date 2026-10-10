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
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\bHÆ\u0003J\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J]\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\b\b\u0002\u0010\n\u001a\u00020\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011¨\u0006%"}, m90084d2 = {"Lcom/kubi/sdk/protocol/rn/protocol/KCBridgeCopyTradingCopyTraderTotalPnlEntity;", "", TUIConstantDefine.USER_NAME, "", "totalPnlData", "", "totalPnlValue", "tradePnlSide", "", "leadTradersNameData", "tradeSettleCurrency", "userAvatarUrl", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;JLjava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "getLeadTradersNameData", "()Ljava/util/List;", "getTotalPnlData", "getTotalPnlValue", "()Ljava/lang/String;", "getTradePnlSide", "()J", "getTradeSettleCurrency", "getUserAvatarUrl", "getUserName", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "KcProtocol_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final /* data */ class KCBridgeCopyTradingCopyTraderTotalPnlEntity {

    @NotNull
    private final List<String> leadTradersNameData;

    @NotNull
    private final List<String> totalPnlData;

    @NotNull
    private final String totalPnlValue;
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
        if (!(other instanceof KCBridgeCopyTradingCopyTraderTotalPnlEntity)) {
            return false;
        }
        KCBridgeCopyTradingCopyTraderTotalPnlEntity kCBridgeCopyTradingCopyTraderTotalPnlEntity = (KCBridgeCopyTradingCopyTraderTotalPnlEntity) other;
        return Intrinsics.areEqual(this.userName, kCBridgeCopyTradingCopyTraderTotalPnlEntity.userName) && Intrinsics.areEqual(this.totalPnlData, kCBridgeCopyTradingCopyTraderTotalPnlEntity.totalPnlData) && Intrinsics.areEqual(this.totalPnlValue, kCBridgeCopyTradingCopyTraderTotalPnlEntity.totalPnlValue) && this.tradePnlSide == kCBridgeCopyTradingCopyTraderTotalPnlEntity.tradePnlSide && Intrinsics.areEqual(this.leadTradersNameData, kCBridgeCopyTradingCopyTraderTotalPnlEntity.leadTradersNameData) && Intrinsics.areEqual(this.tradeSettleCurrency, kCBridgeCopyTradingCopyTraderTotalPnlEntity.tradeSettleCurrency) && Intrinsics.areEqual(this.userAvatarUrl, kCBridgeCopyTradingCopyTraderTotalPnlEntity.userAvatarUrl);
    }

    public KCBridgeCopyTradingCopyTraderTotalPnlEntity(@NotNull String userName, @NotNull List<String> totalPnlData, @NotNull String totalPnlValue, long j11, @NotNull List<String> leadTradersNameData, @NotNull String tradeSettleCurrency, @Nullable String str) {
        Intrinsics.checkNotNullParameter(userName, "userName");
        Intrinsics.checkNotNullParameter(totalPnlData, "totalPnlData");
        Intrinsics.checkNotNullParameter(totalPnlValue, "totalPnlValue");
        Intrinsics.checkNotNullParameter(leadTradersNameData, "leadTradersNameData");
        Intrinsics.checkNotNullParameter(tradeSettleCurrency, "tradeSettleCurrency");
        this.userName = userName;
        this.totalPnlData = totalPnlData;
        this.totalPnlValue = totalPnlValue;
        this.tradePnlSide = j11;
        this.leadTradersNameData = leadTradersNameData;
        this.tradeSettleCurrency = tradeSettleCurrency;
        this.userAvatarUrl = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ KCBridgeCopyTradingCopyTraderTotalPnlEntity copy$default(KCBridgeCopyTradingCopyTraderTotalPnlEntity kCBridgeCopyTradingCopyTraderTotalPnlEntity, String str, List list, String str2, long j11, List list2, String str3, String str4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = kCBridgeCopyTradingCopyTraderTotalPnlEntity.userName;
        }
        if ((i11 & 2) != 0) {
            list = kCBridgeCopyTradingCopyTraderTotalPnlEntity.totalPnlData;
        }
        if ((i11 & 4) != 0) {
            str2 = kCBridgeCopyTradingCopyTraderTotalPnlEntity.totalPnlValue;
        }
        if ((i11 & 8) != 0) {
            j11 = kCBridgeCopyTradingCopyTraderTotalPnlEntity.tradePnlSide;
        }
        if ((i11 & 16) != 0) {
            list2 = kCBridgeCopyTradingCopyTraderTotalPnlEntity.leadTradersNameData;
        }
        if ((i11 & 32) != 0) {
            str3 = kCBridgeCopyTradingCopyTraderTotalPnlEntity.tradeSettleCurrency;
        }
        if ((i11 & 64) != 0) {
            str4 = kCBridgeCopyTradingCopyTraderTotalPnlEntity.userAvatarUrl;
        }
        String str5 = str4;
        List list3 = list2;
        long j12 = j11;
        String str6 = str2;
        return kCBridgeCopyTradingCopyTraderTotalPnlEntity.copy(str, list, str6, j12, list3, str3, str5);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUserName() {
        return this.userName;
    }

    @NotNull
    public final List<String> component2() {
        return this.totalPnlData;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTotalPnlValue() {
        return this.totalPnlValue;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getTradePnlSide() {
        return this.tradePnlSide;
    }

    @NotNull
    public final List<String> component5() {
        return this.leadTradersNameData;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getTradeSettleCurrency() {
        return this.tradeSettleCurrency;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getUserAvatarUrl() {
        return this.userAvatarUrl;
    }

    @NotNull
    public final KCBridgeCopyTradingCopyTraderTotalPnlEntity copy(@NotNull String userName, @NotNull List<String> totalPnlData, @NotNull String totalPnlValue, long tradePnlSide, @NotNull List<String> leadTradersNameData, @NotNull String tradeSettleCurrency, @Nullable String userAvatarUrl) {
        Intrinsics.checkNotNullParameter(userName, "userName");
        Intrinsics.checkNotNullParameter(totalPnlData, "totalPnlData");
        Intrinsics.checkNotNullParameter(totalPnlValue, "totalPnlValue");
        Intrinsics.checkNotNullParameter(leadTradersNameData, "leadTradersNameData");
        Intrinsics.checkNotNullParameter(tradeSettleCurrency, "tradeSettleCurrency");
        return new KCBridgeCopyTradingCopyTraderTotalPnlEntity(userName, totalPnlData, totalPnlValue, tradePnlSide, leadTradersNameData, tradeSettleCurrency, userAvatarUrl);
    }

    @NotNull
    public final List<String> getLeadTradersNameData() {
        return this.leadTradersNameData;
    }

    @NotNull
    public final List<String> getTotalPnlData() {
        return this.totalPnlData;
    }

    @NotNull
    public final String getTotalPnlValue() {
        return this.totalPnlValue;
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
        int iHashCode = ((((((((((this.userName.hashCode() * 31) + this.totalPnlData.hashCode()) * 31) + this.totalPnlValue.hashCode()) * 31) + Long.hashCode(this.tradePnlSide)) * 31) + this.leadTradersNameData.hashCode()) * 31) + this.tradeSettleCurrency.hashCode()) * 31;
        String str = this.userAvatarUrl;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        return "KCBridgeCopyTradingCopyTraderTotalPnlEntity(userName=" + this.userName + ", totalPnlData=" + this.totalPnlData + ", totalPnlValue=" + this.totalPnlValue + ", tradePnlSide=" + this.tradePnlSide + ", leadTradersNameData=" + this.leadTradersNameData + ", tradeSettleCurrency=" + this.tradeSettleCurrency + ", userAvatarUrl=" + this.userAvatarUrl + ')';
    }
}
