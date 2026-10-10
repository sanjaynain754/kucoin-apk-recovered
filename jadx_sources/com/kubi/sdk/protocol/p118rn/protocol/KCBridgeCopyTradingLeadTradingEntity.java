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
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u0013J^\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0002\u0010 J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010¨\u0006'"}, m90084d2 = {"Lcom/kubi/sdk/protocol/rn/protocol/KCBridgeCopyTradingLeadTradingEntity;", "", TUIConstantDefine.USER_NAME, "", "lead30DayData", "", "lead30DayPnl", "lead30DayValue", "tradeSettleCurrency", "userAvatarUrl", "tradePnlSide", "", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V", "getLead30DayData", "()Ljava/util/List;", "getLead30DayPnl", "()Ljava/lang/String;", "getLead30DayValue", "getTradePnlSide", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getTradeSettleCurrency", "getUserAvatarUrl", "getUserName", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)Lcom/kubi/sdk/protocol/rn/protocol/KCBridgeCopyTradingLeadTradingEntity;", "equals", "", "other", "hashCode", "", "toString", "KcProtocol_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final /* data */ class KCBridgeCopyTradingLeadTradingEntity {

    @NotNull
    private final List<String> lead30DayData;

    @NotNull
    private final String lead30DayPnl;

    @NotNull
    private final String lead30DayValue;

    @Nullable
    private final Long tradePnlSide;

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
        if (!(other instanceof KCBridgeCopyTradingLeadTradingEntity)) {
            return false;
        }
        KCBridgeCopyTradingLeadTradingEntity kCBridgeCopyTradingLeadTradingEntity = (KCBridgeCopyTradingLeadTradingEntity) other;
        return Intrinsics.areEqual(this.userName, kCBridgeCopyTradingLeadTradingEntity.userName) && Intrinsics.areEqual(this.lead30DayData, kCBridgeCopyTradingLeadTradingEntity.lead30DayData) && Intrinsics.areEqual(this.lead30DayPnl, kCBridgeCopyTradingLeadTradingEntity.lead30DayPnl) && Intrinsics.areEqual(this.lead30DayValue, kCBridgeCopyTradingLeadTradingEntity.lead30DayValue) && Intrinsics.areEqual(this.tradeSettleCurrency, kCBridgeCopyTradingLeadTradingEntity.tradeSettleCurrency) && Intrinsics.areEqual(this.userAvatarUrl, kCBridgeCopyTradingLeadTradingEntity.userAvatarUrl) && Intrinsics.areEqual(this.tradePnlSide, kCBridgeCopyTradingLeadTradingEntity.tradePnlSide);
    }

    public KCBridgeCopyTradingLeadTradingEntity(@NotNull String userName, @NotNull List<String> lead30DayData, @NotNull String lead30DayPnl, @NotNull String lead30DayValue, @NotNull String tradeSettleCurrency, @Nullable String str, @Nullable Long l11) {
        Intrinsics.checkNotNullParameter(userName, "userName");
        Intrinsics.checkNotNullParameter(lead30DayData, "lead30DayData");
        Intrinsics.checkNotNullParameter(lead30DayPnl, "lead30DayPnl");
        Intrinsics.checkNotNullParameter(lead30DayValue, "lead30DayValue");
        Intrinsics.checkNotNullParameter(tradeSettleCurrency, "tradeSettleCurrency");
        this.userName = userName;
        this.lead30DayData = lead30DayData;
        this.lead30DayPnl = lead30DayPnl;
        this.lead30DayValue = lead30DayValue;
        this.tradeSettleCurrency = tradeSettleCurrency;
        this.userAvatarUrl = str;
        this.tradePnlSide = l11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ KCBridgeCopyTradingLeadTradingEntity copy$default(KCBridgeCopyTradingLeadTradingEntity kCBridgeCopyTradingLeadTradingEntity, String str, List list, String str2, String str3, String str4, String str5, Long l11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = kCBridgeCopyTradingLeadTradingEntity.userName;
        }
        if ((i11 & 2) != 0) {
            list = kCBridgeCopyTradingLeadTradingEntity.lead30DayData;
        }
        if ((i11 & 4) != 0) {
            str2 = kCBridgeCopyTradingLeadTradingEntity.lead30DayPnl;
        }
        if ((i11 & 8) != 0) {
            str3 = kCBridgeCopyTradingLeadTradingEntity.lead30DayValue;
        }
        if ((i11 & 16) != 0) {
            str4 = kCBridgeCopyTradingLeadTradingEntity.tradeSettleCurrency;
        }
        if ((i11 & 32) != 0) {
            str5 = kCBridgeCopyTradingLeadTradingEntity.userAvatarUrl;
        }
        if ((i11 & 64) != 0) {
            l11 = kCBridgeCopyTradingLeadTradingEntity.tradePnlSide;
        }
        String str6 = str5;
        Long l12 = l11;
        String str7 = str4;
        String str8 = str2;
        return kCBridgeCopyTradingLeadTradingEntity.copy(str, list, str8, str3, str7, str6, l12);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUserName() {
        return this.userName;
    }

    @NotNull
    public final List<String> component2() {
        return this.lead30DayData;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getLead30DayPnl() {
        return this.lead30DayPnl;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getLead30DayValue() {
        return this.lead30DayValue;
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

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Long getTradePnlSide() {
        return this.tradePnlSide;
    }

    @NotNull
    public final KCBridgeCopyTradingLeadTradingEntity copy(@NotNull String userName, @NotNull List<String> lead30DayData, @NotNull String lead30DayPnl, @NotNull String lead30DayValue, @NotNull String tradeSettleCurrency, @Nullable String userAvatarUrl, @Nullable Long tradePnlSide) {
        Intrinsics.checkNotNullParameter(userName, "userName");
        Intrinsics.checkNotNullParameter(lead30DayData, "lead30DayData");
        Intrinsics.checkNotNullParameter(lead30DayPnl, "lead30DayPnl");
        Intrinsics.checkNotNullParameter(lead30DayValue, "lead30DayValue");
        Intrinsics.checkNotNullParameter(tradeSettleCurrency, "tradeSettleCurrency");
        return new KCBridgeCopyTradingLeadTradingEntity(userName, lead30DayData, lead30DayPnl, lead30DayValue, tradeSettleCurrency, userAvatarUrl, tradePnlSide);
    }

    @NotNull
    public final List<String> getLead30DayData() {
        return this.lead30DayData;
    }

    @NotNull
    public final String getLead30DayPnl() {
        return this.lead30DayPnl;
    }

    @NotNull
    public final String getLead30DayValue() {
        return this.lead30DayValue;
    }

    @Nullable
    public final Long getTradePnlSide() {
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
        int iHashCode = ((((((((this.userName.hashCode() * 31) + this.lead30DayData.hashCode()) * 31) + this.lead30DayPnl.hashCode()) * 31) + this.lead30DayValue.hashCode()) * 31) + this.tradeSettleCurrency.hashCode()) * 31;
        String str = this.userAvatarUrl;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l11 = this.tradePnlSide;
        return iHashCode2 + (l11 != null ? l11.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "KCBridgeCopyTradingLeadTradingEntity(userName=" + this.userName + ", lead30DayData=" + this.lead30DayData + ", lead30DayPnl=" + this.lead30DayPnl + ", lead30DayValue=" + this.lead30DayValue + ", tradeSettleCurrency=" + this.tradeSettleCurrency + ", userAvatarUrl=" + this.userAvatarUrl + ", tradePnlSide=" + this.tradePnlSide + ')';
    }
}
