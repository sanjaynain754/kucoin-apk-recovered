package com.kubi.sdk.protocol.flutter.protocol;

import androidx.annotation.Keep;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KCFlutterBridgeKLineCall.kt */
/* JADX INFO: loaded from: classes41.dex */
@Keep
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b(\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001By\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0011J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0007HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0097\u0001\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00102\u001a\u000203HÖ\u0001J\u0014\u00104\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u000105J\t\u00106\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0013R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0013¨\u00067"}, m90084d2 = {"Lcom/kubi/sdk/protocol/flutter/protocol/KCFlutterBridgeKLineKlinePosition;", "", "positionId", "", "symbol", "side", "qty", "", "avgEntryPrice", "markPrice", "unrealisedPnl", "positionSide", "liquidationPrice", "leverage", "marginMode", "pnl", "pnlRate", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAvgEntryPrice", "()Ljava/lang/String;", "getLeverage", "getLiquidationPrice", "getMarginMode", "getMarkPrice", "getPnl", "getPnlRate", "getPositionId", "getPositionSide", "getQty", "()D", "getSide", "getSymbol", "getUnrealisedPnl", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toMap", "", "toString", "KcProtocol_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final /* data */ class KCFlutterBridgeKLineKlinePosition {

    @NotNull
    private final String avgEntryPrice;

    @Nullable
    private final String leverage;

    @Nullable
    private final String liquidationPrice;

    @Nullable
    private final String marginMode;

    @NotNull
    private final String markPrice;

    @Nullable
    private final String pnl;

    @Nullable
    private final String pnlRate;

    @NotNull
    private final String positionId;

    @Nullable
    private final String positionSide;
    private final double qty;

    @NotNull
    private final String side;

    @NotNull
    private final String symbol;

    @NotNull
    private final String unrealisedPnl;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KCFlutterBridgeKLineKlinePosition)) {
            return false;
        }
        KCFlutterBridgeKLineKlinePosition kCFlutterBridgeKLineKlinePosition = (KCFlutterBridgeKLineKlinePosition) other;
        return Intrinsics.areEqual(this.positionId, kCFlutterBridgeKLineKlinePosition.positionId) && Intrinsics.areEqual(this.symbol, kCFlutterBridgeKLineKlinePosition.symbol) && Intrinsics.areEqual(this.side, kCFlutterBridgeKLineKlinePosition.side) && Double.compare(this.qty, kCFlutterBridgeKLineKlinePosition.qty) == 0 && Intrinsics.areEqual(this.avgEntryPrice, kCFlutterBridgeKLineKlinePosition.avgEntryPrice) && Intrinsics.areEqual(this.markPrice, kCFlutterBridgeKLineKlinePosition.markPrice) && Intrinsics.areEqual(this.unrealisedPnl, kCFlutterBridgeKLineKlinePosition.unrealisedPnl) && Intrinsics.areEqual(this.positionSide, kCFlutterBridgeKLineKlinePosition.positionSide) && Intrinsics.areEqual(this.liquidationPrice, kCFlutterBridgeKLineKlinePosition.liquidationPrice) && Intrinsics.areEqual(this.leverage, kCFlutterBridgeKLineKlinePosition.leverage) && Intrinsics.areEqual(this.marginMode, kCFlutterBridgeKLineKlinePosition.marginMode) && Intrinsics.areEqual(this.pnl, kCFlutterBridgeKLineKlinePosition.pnl) && Intrinsics.areEqual(this.pnlRate, kCFlutterBridgeKLineKlinePosition.pnlRate);
    }

    public KCFlutterBridgeKLineKlinePosition(@NotNull String positionId, @NotNull String symbol, @NotNull String side, double d11, @NotNull String avgEntryPrice, @NotNull String markPrice, @NotNull String unrealisedPnl, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6) {
        Intrinsics.checkNotNullParameter(positionId, "positionId");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(avgEntryPrice, "avgEntryPrice");
        Intrinsics.checkNotNullParameter(markPrice, "markPrice");
        Intrinsics.checkNotNullParameter(unrealisedPnl, "unrealisedPnl");
        this.positionId = positionId;
        this.symbol = symbol;
        this.side = side;
        this.qty = d11;
        this.avgEntryPrice = avgEntryPrice;
        this.markPrice = markPrice;
        this.unrealisedPnl = unrealisedPnl;
        this.positionSide = str;
        this.liquidationPrice = str2;
        this.leverage = str3;
        this.marginMode = str4;
        this.pnl = str5;
        this.pnlRate = str6;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPositionId() {
        return this.positionId;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getLeverage() {
        return this.leverage;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getMarginMode() {
        return this.marginMode;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getPnl() {
        return this.pnl;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getPnlRate() {
        return this.pnlRate;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSide() {
        return this.side;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final double getQty() {
        return this.qty;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getAvgEntryPrice() {
        return this.avgEntryPrice;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getMarkPrice() {
        return this.markPrice;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getUnrealisedPnl() {
        return this.unrealisedPnl;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getPositionSide() {
        return this.positionSide;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getLiquidationPrice() {
        return this.liquidationPrice;
    }

    @NotNull
    public final KCFlutterBridgeKLineKlinePosition copy(@NotNull String positionId, @NotNull String symbol, @NotNull String side, double qty, @NotNull String avgEntryPrice, @NotNull String markPrice, @NotNull String unrealisedPnl, @Nullable String positionSide, @Nullable String liquidationPrice, @Nullable String leverage, @Nullable String marginMode, @Nullable String pnl, @Nullable String pnlRate) {
        Intrinsics.checkNotNullParameter(positionId, "positionId");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(avgEntryPrice, "avgEntryPrice");
        Intrinsics.checkNotNullParameter(markPrice, "markPrice");
        Intrinsics.checkNotNullParameter(unrealisedPnl, "unrealisedPnl");
        return new KCFlutterBridgeKLineKlinePosition(positionId, symbol, side, qty, avgEntryPrice, markPrice, unrealisedPnl, positionSide, liquidationPrice, leverage, marginMode, pnl, pnlRate);
    }

    @NotNull
    public final String getAvgEntryPrice() {
        return this.avgEntryPrice;
    }

    @Nullable
    public final String getLeverage() {
        return this.leverage;
    }

    @Nullable
    public final String getLiquidationPrice() {
        return this.liquidationPrice;
    }

    @Nullable
    public final String getMarginMode() {
        return this.marginMode;
    }

    @NotNull
    public final String getMarkPrice() {
        return this.markPrice;
    }

    @Nullable
    public final String getPnl() {
        return this.pnl;
    }

    @Nullable
    public final String getPnlRate() {
        return this.pnlRate;
    }

    @NotNull
    public final String getPositionId() {
        return this.positionId;
    }

    @Nullable
    public final String getPositionSide() {
        return this.positionSide;
    }

    public final double getQty() {
        return this.qty;
    }

    @NotNull
    public final String getSide() {
        return this.side;
    }

    @NotNull
    public final String getSymbol() {
        return this.symbol;
    }

    @NotNull
    public final String getUnrealisedPnl() {
        return this.unrealisedPnl;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((this.positionId.hashCode() * 31) + this.symbol.hashCode()) * 31) + this.side.hashCode()) * 31) + Double.hashCode(this.qty)) * 31) + this.avgEntryPrice.hashCode()) * 31) + this.markPrice.hashCode()) * 31) + this.unrealisedPnl.hashCode()) * 31;
        String str = this.positionSide;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.liquidationPrice;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.leverage;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.marginMode;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.pnl;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.pnlRate;
        return iHashCode6 + (str6 != null ? str6.hashCode() : 0);
    }

    @NotNull
    public final Map<String, Object> toMap() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("positionId", this.positionId);
        linkedHashMap.put("symbol", this.symbol);
        linkedHashMap.put("side", this.side);
        linkedHashMap.put("qty", Double.valueOf(this.qty));
        linkedHashMap.put("avgEntryPrice", this.avgEntryPrice);
        linkedHashMap.put("markPrice", this.markPrice);
        linkedHashMap.put("unrealisedPnl", this.unrealisedPnl);
        linkedHashMap.put("positionSide", this.positionSide);
        linkedHashMap.put("liquidationPrice", this.liquidationPrice);
        linkedHashMap.put("leverage", this.leverage);
        linkedHashMap.put("marginMode", this.marginMode);
        linkedHashMap.put("pnl", this.pnl);
        linkedHashMap.put("pnlRate", this.pnlRate);
        return linkedHashMap;
    }

    @NotNull
    public String toString() {
        return "KCFlutterBridgeKLineKlinePosition(positionId=" + this.positionId + ", symbol=" + this.symbol + ", side=" + this.side + ", qty=" + this.qty + ", avgEntryPrice=" + this.avgEntryPrice + ", markPrice=" + this.markPrice + ", unrealisedPnl=" + this.unrealisedPnl + ", positionSide=" + this.positionSide + ", liquidationPrice=" + this.liquidationPrice + ", leverage=" + this.leverage + ", marginMode=" + this.marginMode + ", pnl=" + this.pnl + ", pnlRate=" + this.pnlRate + ')';
    }
}
