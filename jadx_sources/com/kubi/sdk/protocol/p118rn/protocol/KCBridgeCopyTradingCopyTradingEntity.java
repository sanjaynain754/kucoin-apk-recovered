package com.kubi.sdk.protocol.p118rn.protocol;

import androidx.annotation.Keep;
import com.tencent.cloud.tuikit.engine.common.internal.TUIConstantDefine;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KCBridgeCopyTradingCall.kt */
/* JADX INFO: loaded from: classes41.dex */
@Keep
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\"\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bm\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0002\u0010\u0011J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010%\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0002\u0010\u001bJ\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0006HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u008e\u0001\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÆ\u0001¢\u0006\u0002\u0010/J\u0013\u00100\u001a\u00020\u00062\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00102\u001a\u000203HÖ\u0001J\t\u00104\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0013R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0013R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0013R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0013¨\u00065"}, m90084d2 = {"Lcom/kubi/sdk/protocol/rn/protocol/KCBridgeCopyTradingCopyTradingEntity;", "", TUIConstantDefine.USER_NAME, "", "tradeDisplaySymbol", "tradeIsLong", "", "tradeLeverage", "tradePnlValue", "tradeAveragePrice", "tradeExitPrice", "tradeSettleCurrency", "userAvatarUrl", "userDesc", "tradePnlAmountValue", "tradePnlSide", "", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V", "getTradeAveragePrice", "()Ljava/lang/String;", "getTradeDisplaySymbol", "getTradeExitPrice", "getTradeIsLong", "()Z", "getTradeLeverage", "getTradePnlAmountValue", "getTradePnlSide", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getTradePnlValue", "getTradeSettleCurrency", "getUserAvatarUrl", "getUserDesc", "getUserName", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)Lcom/kubi/sdk/protocol/rn/protocol/KCBridgeCopyTradingCopyTradingEntity;", "equals", "other", "hashCode", "", "toString", "KcProtocol_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final /* data */ class KCBridgeCopyTradingCopyTradingEntity {

    @NotNull
    private final String tradeAveragePrice;

    @NotNull
    private final String tradeDisplaySymbol;

    @NotNull
    private final String tradeExitPrice;
    private final boolean tradeIsLong;

    @NotNull
    private final String tradeLeverage;

    @Nullable
    private final String tradePnlAmountValue;

    @Nullable
    private final Long tradePnlSide;

    @NotNull
    private final String tradePnlValue;

    @NotNull
    private final String tradeSettleCurrency;

    @Nullable
    private final String userAvatarUrl;

    @Nullable
    private final String userDesc;

    @NotNull
    private final String userName;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KCBridgeCopyTradingCopyTradingEntity)) {
            return false;
        }
        KCBridgeCopyTradingCopyTradingEntity kCBridgeCopyTradingCopyTradingEntity = (KCBridgeCopyTradingCopyTradingEntity) other;
        return Intrinsics.areEqual(this.userName, kCBridgeCopyTradingCopyTradingEntity.userName) && Intrinsics.areEqual(this.tradeDisplaySymbol, kCBridgeCopyTradingCopyTradingEntity.tradeDisplaySymbol) && this.tradeIsLong == kCBridgeCopyTradingCopyTradingEntity.tradeIsLong && Intrinsics.areEqual(this.tradeLeverage, kCBridgeCopyTradingCopyTradingEntity.tradeLeverage) && Intrinsics.areEqual(this.tradePnlValue, kCBridgeCopyTradingCopyTradingEntity.tradePnlValue) && Intrinsics.areEqual(this.tradeAveragePrice, kCBridgeCopyTradingCopyTradingEntity.tradeAveragePrice) && Intrinsics.areEqual(this.tradeExitPrice, kCBridgeCopyTradingCopyTradingEntity.tradeExitPrice) && Intrinsics.areEqual(this.tradeSettleCurrency, kCBridgeCopyTradingCopyTradingEntity.tradeSettleCurrency) && Intrinsics.areEqual(this.userAvatarUrl, kCBridgeCopyTradingCopyTradingEntity.userAvatarUrl) && Intrinsics.areEqual(this.userDesc, kCBridgeCopyTradingCopyTradingEntity.userDesc) && Intrinsics.areEqual(this.tradePnlAmountValue, kCBridgeCopyTradingCopyTradingEntity.tradePnlAmountValue) && Intrinsics.areEqual(this.tradePnlSide, kCBridgeCopyTradingCopyTradingEntity.tradePnlSide);
    }

    public KCBridgeCopyTradingCopyTradingEntity(@NotNull String userName, @NotNull String tradeDisplaySymbol, boolean z11, @NotNull String tradeLeverage, @NotNull String tradePnlValue, @NotNull String tradeAveragePrice, @NotNull String tradeExitPrice, @NotNull String tradeSettleCurrency, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Long l11) {
        Intrinsics.checkNotNullParameter(userName, "userName");
        Intrinsics.checkNotNullParameter(tradeDisplaySymbol, "tradeDisplaySymbol");
        Intrinsics.checkNotNullParameter(tradeLeverage, "tradeLeverage");
        Intrinsics.checkNotNullParameter(tradePnlValue, "tradePnlValue");
        Intrinsics.checkNotNullParameter(tradeAveragePrice, "tradeAveragePrice");
        Intrinsics.checkNotNullParameter(tradeExitPrice, "tradeExitPrice");
        Intrinsics.checkNotNullParameter(tradeSettleCurrency, "tradeSettleCurrency");
        this.userName = userName;
        this.tradeDisplaySymbol = tradeDisplaySymbol;
        this.tradeIsLong = z11;
        this.tradeLeverage = tradeLeverage;
        this.tradePnlValue = tradePnlValue;
        this.tradeAveragePrice = tradeAveragePrice;
        this.tradeExitPrice = tradeExitPrice;
        this.tradeSettleCurrency = tradeSettleCurrency;
        this.userAvatarUrl = str;
        this.userDesc = str2;
        this.tradePnlAmountValue = str3;
        this.tradePnlSide = l11;
    }

    public static /* synthetic */ KCBridgeCopyTradingCopyTradingEntity copy$default(KCBridgeCopyTradingCopyTradingEntity kCBridgeCopyTradingCopyTradingEntity, String str, String str2, boolean z11, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Long l11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = kCBridgeCopyTradingCopyTradingEntity.userName;
        }
        if ((i11 & 2) != 0) {
            str2 = kCBridgeCopyTradingCopyTradingEntity.tradeDisplaySymbol;
        }
        if ((i11 & 4) != 0) {
            z11 = kCBridgeCopyTradingCopyTradingEntity.tradeIsLong;
        }
        if ((i11 & 8) != 0) {
            str3 = kCBridgeCopyTradingCopyTradingEntity.tradeLeverage;
        }
        if ((i11 & 16) != 0) {
            str4 = kCBridgeCopyTradingCopyTradingEntity.tradePnlValue;
        }
        if ((i11 & 32) != 0) {
            str5 = kCBridgeCopyTradingCopyTradingEntity.tradeAveragePrice;
        }
        if ((i11 & 64) != 0) {
            str6 = kCBridgeCopyTradingCopyTradingEntity.tradeExitPrice;
        }
        if ((i11 & 128) != 0) {
            str7 = kCBridgeCopyTradingCopyTradingEntity.tradeSettleCurrency;
        }
        if ((i11 & 256) != 0) {
            str8 = kCBridgeCopyTradingCopyTradingEntity.userAvatarUrl;
        }
        if ((i11 & 512) != 0) {
            str9 = kCBridgeCopyTradingCopyTradingEntity.userDesc;
        }
        if ((i11 & 1024) != 0) {
            str10 = kCBridgeCopyTradingCopyTradingEntity.tradePnlAmountValue;
        }
        if ((i11 & 2048) != 0) {
            l11 = kCBridgeCopyTradingCopyTradingEntity.tradePnlSide;
        }
        String str11 = str10;
        Long l12 = l11;
        String str12 = str8;
        String str13 = str9;
        String str14 = str6;
        String str15 = str7;
        String str16 = str4;
        String str17 = str5;
        return kCBridgeCopyTradingCopyTradingEntity.copy(str, str2, z11, str3, str16, str17, str14, str15, str12, str13, str11, l12);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUserName() {
        return this.userName;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getUserDesc() {
        return this.userDesc;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getTradePnlAmountValue() {
        return this.tradePnlAmountValue;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Long getTradePnlSide() {
        return this.tradePnlSide;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTradeDisplaySymbol() {
        return this.tradeDisplaySymbol;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getTradeIsLong() {
        return this.tradeIsLong;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTradeLeverage() {
        return this.tradeLeverage;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getTradePnlValue() {
        return this.tradePnlValue;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getTradeAveragePrice() {
        return this.tradeAveragePrice;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getTradeExitPrice() {
        return this.tradeExitPrice;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getTradeSettleCurrency() {
        return this.tradeSettleCurrency;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getUserAvatarUrl() {
        return this.userAvatarUrl;
    }

    @NotNull
    public final KCBridgeCopyTradingCopyTradingEntity copy(@NotNull String userName, @NotNull String tradeDisplaySymbol, boolean tradeIsLong, @NotNull String tradeLeverage, @NotNull String tradePnlValue, @NotNull String tradeAveragePrice, @NotNull String tradeExitPrice, @NotNull String tradeSettleCurrency, @Nullable String userAvatarUrl, @Nullable String userDesc, @Nullable String tradePnlAmountValue, @Nullable Long tradePnlSide) {
        Intrinsics.checkNotNullParameter(userName, "userName");
        Intrinsics.checkNotNullParameter(tradeDisplaySymbol, "tradeDisplaySymbol");
        Intrinsics.checkNotNullParameter(tradeLeverage, "tradeLeverage");
        Intrinsics.checkNotNullParameter(tradePnlValue, "tradePnlValue");
        Intrinsics.checkNotNullParameter(tradeAveragePrice, "tradeAveragePrice");
        Intrinsics.checkNotNullParameter(tradeExitPrice, "tradeExitPrice");
        Intrinsics.checkNotNullParameter(tradeSettleCurrency, "tradeSettleCurrency");
        return new KCBridgeCopyTradingCopyTradingEntity(userName, tradeDisplaySymbol, tradeIsLong, tradeLeverage, tradePnlValue, tradeAveragePrice, tradeExitPrice, tradeSettleCurrency, userAvatarUrl, userDesc, tradePnlAmountValue, tradePnlSide);
    }

    @NotNull
    public final String getTradeAveragePrice() {
        return this.tradeAveragePrice;
    }

    @NotNull
    public final String getTradeDisplaySymbol() {
        return this.tradeDisplaySymbol;
    }

    @NotNull
    public final String getTradeExitPrice() {
        return this.tradeExitPrice;
    }

    public final boolean getTradeIsLong() {
        return this.tradeIsLong;
    }

    @NotNull
    public final String getTradeLeverage() {
        return this.tradeLeverage;
    }

    @Nullable
    public final String getTradePnlAmountValue() {
        return this.tradePnlAmountValue;
    }

    @Nullable
    public final Long getTradePnlSide() {
        return this.tradePnlSide;
    }

    @NotNull
    public final String getTradePnlValue() {
        return this.tradePnlValue;
    }

    @NotNull
    public final String getTradeSettleCurrency() {
        return this.tradeSettleCurrency;
    }

    @Nullable
    public final String getUserAvatarUrl() {
        return this.userAvatarUrl;
    }

    @Nullable
    public final String getUserDesc() {
        return this.userDesc;
    }

    @NotNull
    public final String getUserName() {
        return this.userName;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    public int hashCode() {
        int iHashCode = ((this.userName.hashCode() * 31) + this.tradeDisplaySymbol.hashCode()) * 31;
        boolean z11 = this.tradeIsLong;
        ?? r11 = z11;
        if (z11) {
            r11 = 1;
        }
        int iHashCode2 = (((((((((((iHashCode + r11) * 31) + this.tradeLeverage.hashCode()) * 31) + this.tradePnlValue.hashCode()) * 31) + this.tradeAveragePrice.hashCode()) * 31) + this.tradeExitPrice.hashCode()) * 31) + this.tradeSettleCurrency.hashCode()) * 31;
        String str = this.userAvatarUrl;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.userDesc;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.tradePnlAmountValue;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l11 = this.tradePnlSide;
        return iHashCode5 + (l11 != null ? l11.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "KCBridgeCopyTradingCopyTradingEntity(userName=" + this.userName + ", tradeDisplaySymbol=" + this.tradeDisplaySymbol + ", tradeIsLong=" + this.tradeIsLong + ", tradeLeverage=" + this.tradeLeverage + ", tradePnlValue=" + this.tradePnlValue + ", tradeAveragePrice=" + this.tradeAveragePrice + ", tradeExitPrice=" + this.tradeExitPrice + ", tradeSettleCurrency=" + this.tradeSettleCurrency + ", userAvatarUrl=" + this.userAvatarUrl + ", userDesc=" + this.userDesc + ", tradePnlAmountValue=" + this.tradePnlAmountValue + ", tradePnlSide=" + this.tradePnlSide + ')';
    }
}
