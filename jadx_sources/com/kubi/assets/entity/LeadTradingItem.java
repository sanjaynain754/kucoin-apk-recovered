package com.kubi.assets.entity;

import androidx.annotation.Keep;
import androidx.core.app.FrameMetricsAggregator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: OnGoingEntity.kt */
/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bs\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003Ju\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000f¨\u0006("}, m90084d2 = {"Lcom/kubi/assets/entity/LeadTradingItem;", "", "symbol", "", "positionSide", "marginMode", "leverage", "pnlCurrency", "pnl", "pnlRatio", "markPrice", "liquidationPrice", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getSymbol", "()Ljava/lang/String;", "getPositionSide", "getMarginMode", "getLeverage", "getPnlCurrency", "getPnl", "getPnlRatio", "getMarkPrice", "getLiquidationPrice", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class LeadTradingItem {

    @Nullable
    private final String leverage;

    @Nullable
    private final String liquidationPrice;

    @Nullable
    private final String marginMode;

    @Nullable
    private final String markPrice;

    @Nullable
    private final String pnl;

    @Nullable
    private final String pnlCurrency;

    @Nullable
    private final String pnlRatio;

    @Nullable
    private final String positionSide;

    @Nullable
    private final String symbol;

    public LeadTradingItem() {
        this(null, null, null, null, null, null, null, null, null, FrameMetricsAggregator.EVERY_DURATION, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LeadTradingItem)) {
            return false;
        }
        LeadTradingItem leadTradingItem = (LeadTradingItem) other;
        return Intrinsics.areEqual(this.symbol, leadTradingItem.symbol) && Intrinsics.areEqual(this.positionSide, leadTradingItem.positionSide) && Intrinsics.areEqual(this.marginMode, leadTradingItem.marginMode) && Intrinsics.areEqual(this.leverage, leadTradingItem.leverage) && Intrinsics.areEqual(this.pnlCurrency, leadTradingItem.pnlCurrency) && Intrinsics.areEqual(this.pnl, leadTradingItem.pnl) && Intrinsics.areEqual(this.pnlRatio, leadTradingItem.pnlRatio) && Intrinsics.areEqual(this.markPrice, leadTradingItem.markPrice) && Intrinsics.areEqual(this.liquidationPrice, leadTradingItem.liquidationPrice);
    }

    public LeadTradingItem(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9) {
        this.symbol = str;
        this.positionSide = str2;
        this.marginMode = str3;
        this.leverage = str4;
        this.pnlCurrency = str5;
        this.pnl = str6;
        this.pnlRatio = str7;
        this.markPrice = str8;
        this.liquidationPrice = str9;
    }

    public static /* synthetic */ LeadTradingItem copy$default(LeadTradingItem leadTradingItem, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = leadTradingItem.symbol;
        }
        if ((i11 & 2) != 0) {
            str2 = leadTradingItem.positionSide;
        }
        if ((i11 & 4) != 0) {
            str3 = leadTradingItem.marginMode;
        }
        if ((i11 & 8) != 0) {
            str4 = leadTradingItem.leverage;
        }
        if ((i11 & 16) != 0) {
            str5 = leadTradingItem.pnlCurrency;
        }
        if ((i11 & 32) != 0) {
            str6 = leadTradingItem.pnl;
        }
        if ((i11 & 64) != 0) {
            str7 = leadTradingItem.pnlRatio;
        }
        if ((i11 & 128) != 0) {
            str8 = leadTradingItem.markPrice;
        }
        if ((i11 & 256) != 0) {
            str9 = leadTradingItem.liquidationPrice;
        }
        String str10 = str8;
        String str11 = str9;
        String str12 = str6;
        String str13 = str7;
        String str14 = str5;
        String str15 = str3;
        return leadTradingItem.copy(str, str2, str15, str4, str14, str12, str13, str10, str11);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPositionSide() {
        return this.positionSide;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getMarginMode() {
        return this.marginMode;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getLeverage() {
        return this.leverage;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getPnlCurrency() {
        return this.pnlCurrency;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getPnl() {
        return this.pnl;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getPnlRatio() {
        return this.pnlRatio;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getMarkPrice() {
        return this.markPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getLiquidationPrice() {
        return this.liquidationPrice;
    }

    @NotNull
    public final LeadTradingItem copy(@Nullable String symbol, @Nullable String positionSide, @Nullable String marginMode, @Nullable String leverage, @Nullable String pnlCurrency, @Nullable String pnl, @Nullable String pnlRatio, @Nullable String markPrice, @Nullable String liquidationPrice) {
        return new LeadTradingItem(symbol, positionSide, marginMode, leverage, pnlCurrency, pnl, pnlRatio, markPrice, liquidationPrice);
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

    @Nullable
    public final String getMarkPrice() {
        return this.markPrice;
    }

    @Nullable
    public final String getPnl() {
        return this.pnl;
    }

    @Nullable
    public final String getPnlCurrency() {
        return this.pnlCurrency;
    }

    @Nullable
    public final String getPnlRatio() {
        return this.pnlRatio;
    }

    @Nullable
    public final String getPositionSide() {
        return this.positionSide;
    }

    @Nullable
    public final String getSymbol() {
        return this.symbol;
    }

    public int hashCode() {
        String str = this.symbol;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.positionSide;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.marginMode;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.leverage;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.pnlCurrency;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.pnl;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.pnlRatio;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.markPrice;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.liquidationPrice;
        return iHashCode8 + (str9 != null ? str9.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "LeadTradingItem(symbol=" + this.symbol + ", positionSide=" + this.positionSide + ", marginMode=" + this.marginMode + ", leverage=" + this.leverage + ", pnlCurrency=" + this.pnlCurrency + ", pnl=" + this.pnl + ", pnlRatio=" + this.pnlRatio + ", markPrice=" + this.markPrice + ", liquidationPrice=" + this.liquidationPrice + ')';
    }

    public /* synthetic */ LeadTradingItem(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4, (i11 & 16) != 0 ? null : str5, (i11 & 32) != 0 ? null : str6, (i11 & 64) != 0 ? null : str7, (i11 & 128) != 0 ? null : str8, (i11 & 256) != 0 ? null : str9);
    }
}
