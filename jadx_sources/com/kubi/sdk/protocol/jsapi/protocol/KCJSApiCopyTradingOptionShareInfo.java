package com.kubi.sdk.protocol.jsapi.protocol;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KCJSApiCopyTradingModule.kt */
/* JADX INFO: loaded from: classes41.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J;\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001b"}, m90084d2 = {"Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiCopyTradingOptionShareInfo;", "", "tradeDisplaySymbol", "", "tradePnlValue", "tradeAveragePrice", "tradeExitPrice", "tradeSettleCurrency", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTradeAveragePrice", "()Ljava/lang/String;", "getTradeDisplaySymbol", "getTradeExitPrice", "getTradePnlValue", "getTradeSettleCurrency", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "KcProtocol_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final /* data */ class KCJSApiCopyTradingOptionShareInfo {

    @NotNull
    private final String tradeAveragePrice;

    @NotNull
    private final String tradeDisplaySymbol;

    @NotNull
    private final String tradeExitPrice;

    @NotNull
    private final String tradePnlValue;

    @NotNull
    private final String tradeSettleCurrency;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KCJSApiCopyTradingOptionShareInfo)) {
            return false;
        }
        KCJSApiCopyTradingOptionShareInfo kCJSApiCopyTradingOptionShareInfo = (KCJSApiCopyTradingOptionShareInfo) other;
        return Intrinsics.areEqual(this.tradeDisplaySymbol, kCJSApiCopyTradingOptionShareInfo.tradeDisplaySymbol) && Intrinsics.areEqual(this.tradePnlValue, kCJSApiCopyTradingOptionShareInfo.tradePnlValue) && Intrinsics.areEqual(this.tradeAveragePrice, kCJSApiCopyTradingOptionShareInfo.tradeAveragePrice) && Intrinsics.areEqual(this.tradeExitPrice, kCJSApiCopyTradingOptionShareInfo.tradeExitPrice) && Intrinsics.areEqual(this.tradeSettleCurrency, kCJSApiCopyTradingOptionShareInfo.tradeSettleCurrency);
    }

    public KCJSApiCopyTradingOptionShareInfo(@NotNull String tradeDisplaySymbol, @NotNull String tradePnlValue, @NotNull String tradeAveragePrice, @NotNull String tradeExitPrice, @NotNull String tradeSettleCurrency) {
        Intrinsics.checkNotNullParameter(tradeDisplaySymbol, "tradeDisplaySymbol");
        Intrinsics.checkNotNullParameter(tradePnlValue, "tradePnlValue");
        Intrinsics.checkNotNullParameter(tradeAveragePrice, "tradeAveragePrice");
        Intrinsics.checkNotNullParameter(tradeExitPrice, "tradeExitPrice");
        Intrinsics.checkNotNullParameter(tradeSettleCurrency, "tradeSettleCurrency");
        this.tradeDisplaySymbol = tradeDisplaySymbol;
        this.tradePnlValue = tradePnlValue;
        this.tradeAveragePrice = tradeAveragePrice;
        this.tradeExitPrice = tradeExitPrice;
        this.tradeSettleCurrency = tradeSettleCurrency;
    }

    public static /* synthetic */ KCJSApiCopyTradingOptionShareInfo copy$default(KCJSApiCopyTradingOptionShareInfo kCJSApiCopyTradingOptionShareInfo, String str, String str2, String str3, String str4, String str5, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = kCJSApiCopyTradingOptionShareInfo.tradeDisplaySymbol;
        }
        if ((i11 & 2) != 0) {
            str2 = kCJSApiCopyTradingOptionShareInfo.tradePnlValue;
        }
        if ((i11 & 4) != 0) {
            str3 = kCJSApiCopyTradingOptionShareInfo.tradeAveragePrice;
        }
        if ((i11 & 8) != 0) {
            str4 = kCJSApiCopyTradingOptionShareInfo.tradeExitPrice;
        }
        if ((i11 & 16) != 0) {
            str5 = kCJSApiCopyTradingOptionShareInfo.tradeSettleCurrency;
        }
        String str6 = str5;
        String str7 = str3;
        return kCJSApiCopyTradingOptionShareInfo.copy(str, str2, str7, str4, str6);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTradeDisplaySymbol() {
        return this.tradeDisplaySymbol;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTradePnlValue() {
        return this.tradePnlValue;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTradeAveragePrice() {
        return this.tradeAveragePrice;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTradeExitPrice() {
        return this.tradeExitPrice;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getTradeSettleCurrency() {
        return this.tradeSettleCurrency;
    }

    @NotNull
    public final KCJSApiCopyTradingOptionShareInfo copy(@NotNull String tradeDisplaySymbol, @NotNull String tradePnlValue, @NotNull String tradeAveragePrice, @NotNull String tradeExitPrice, @NotNull String tradeSettleCurrency) {
        Intrinsics.checkNotNullParameter(tradeDisplaySymbol, "tradeDisplaySymbol");
        Intrinsics.checkNotNullParameter(tradePnlValue, "tradePnlValue");
        Intrinsics.checkNotNullParameter(tradeAveragePrice, "tradeAveragePrice");
        Intrinsics.checkNotNullParameter(tradeExitPrice, "tradeExitPrice");
        Intrinsics.checkNotNullParameter(tradeSettleCurrency, "tradeSettleCurrency");
        return new KCJSApiCopyTradingOptionShareInfo(tradeDisplaySymbol, tradePnlValue, tradeAveragePrice, tradeExitPrice, tradeSettleCurrency);
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

    @NotNull
    public final String getTradePnlValue() {
        return this.tradePnlValue;
    }

    @NotNull
    public final String getTradeSettleCurrency() {
        return this.tradeSettleCurrency;
    }

    public int hashCode() {
        return (((((((this.tradeDisplaySymbol.hashCode() * 31) + this.tradePnlValue.hashCode()) * 31) + this.tradeAveragePrice.hashCode()) * 31) + this.tradeExitPrice.hashCode()) * 31) + this.tradeSettleCurrency.hashCode();
    }

    @NotNull
    public String toString() {
        return "KCJSApiCopyTradingOptionShareInfo(tradeDisplaySymbol=" + this.tradeDisplaySymbol + ", tradePnlValue=" + this.tradePnlValue + ", tradeAveragePrice=" + this.tradeAveragePrice + ", tradeExitPrice=" + this.tradeExitPrice + ", tradeSettleCurrency=" + this.tradeSettleCurrency + ')';
    }
}
