package com.kubi.sdk.protocol.jsapi.protocol;

import androidx.annotation.Keep;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.firebase.analytics.FirebaseAnalytics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KCJSApiFuturesModule.kt */
/* JADX INFO: loaded from: classes41.dex */
@Keep
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b)\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u008b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0014J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010,\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u0016J\u0010\u0010-\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0002\u0010\u001cJ\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J\u0010\u00101\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010!J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00104\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u0016J\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003J°\u0001\u00107\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u00108J\u0013\u00109\u001a\u00020\u00122\b\u0010:\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010;\u001a\u00020<HÖ\u0001J\t\u0010=\u001a\u00020\u0003HÖ\u0001R\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019R\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u0011\u0010\u001cR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0019R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0019R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\"\u001a\u0004\b \u0010!R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b#\u0010\u0016R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0019R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0019R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0019R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0019R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0019¨\u0006>"}, m90084d2 = {"Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiFuturesFuturesPositionPnlShareData;", "", "id", "", "symbol", FirebaseAnalytics.Param.CURRENCY, TypedValues.CycleType.S_WAVE_OFFSET, "", "type", "side", "closeDate", "", "realisedPnl", "marginMode", "leverage", "closeType", "openTime", "isTrialFunds", "", "prizeType", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/String;)V", "getCloseDate", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getCloseType", "()Ljava/lang/String;", "getCurrency", "getId", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getLeverage", "getMarginMode", "getOffset", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getOpenTime", "getPrizeType", "getRealisedPnl", "getSide", "getSymbol", "getType", "component1", "component10", "component11", "component12", "component13", "component14", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/String;)Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiFuturesFuturesPositionPnlShareData;", "equals", "other", "hashCode", "", "toString", "KcProtocol_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final /* data */ class KCJSApiFuturesFuturesPositionPnlShareData {

    @Nullable
    private final Double closeDate;

    @Nullable
    private final String closeType;

    @NotNull
    private final String currency;

    @NotNull
    private final String id;

    @Nullable
    private final Boolean isTrialFunds;

    @Nullable
    private final String leverage;

    @Nullable
    private final String marginMode;

    @Nullable
    private final Long offset;

    @Nullable
    private final Double openTime;

    @Nullable
    private final String prizeType;

    @Nullable
    private final String realisedPnl;

    @Nullable
    private final String side;

    @NotNull
    private final String symbol;

    @Nullable
    private final String type;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KCJSApiFuturesFuturesPositionPnlShareData)) {
            return false;
        }
        KCJSApiFuturesFuturesPositionPnlShareData kCJSApiFuturesFuturesPositionPnlShareData = (KCJSApiFuturesFuturesPositionPnlShareData) other;
        return Intrinsics.areEqual(this.id, kCJSApiFuturesFuturesPositionPnlShareData.id) && Intrinsics.areEqual(this.symbol, kCJSApiFuturesFuturesPositionPnlShareData.symbol) && Intrinsics.areEqual(this.currency, kCJSApiFuturesFuturesPositionPnlShareData.currency) && Intrinsics.areEqual(this.offset, kCJSApiFuturesFuturesPositionPnlShareData.offset) && Intrinsics.areEqual(this.type, kCJSApiFuturesFuturesPositionPnlShareData.type) && Intrinsics.areEqual(this.side, kCJSApiFuturesFuturesPositionPnlShareData.side) && Intrinsics.areEqual((Object) this.closeDate, (Object) kCJSApiFuturesFuturesPositionPnlShareData.closeDate) && Intrinsics.areEqual(this.realisedPnl, kCJSApiFuturesFuturesPositionPnlShareData.realisedPnl) && Intrinsics.areEqual(this.marginMode, kCJSApiFuturesFuturesPositionPnlShareData.marginMode) && Intrinsics.areEqual(this.leverage, kCJSApiFuturesFuturesPositionPnlShareData.leverage) && Intrinsics.areEqual(this.closeType, kCJSApiFuturesFuturesPositionPnlShareData.closeType) && Intrinsics.areEqual((Object) this.openTime, (Object) kCJSApiFuturesFuturesPositionPnlShareData.openTime) && Intrinsics.areEqual(this.isTrialFunds, kCJSApiFuturesFuturesPositionPnlShareData.isTrialFunds) && Intrinsics.areEqual(this.prizeType, kCJSApiFuturesFuturesPositionPnlShareData.prizeType);
    }

    public KCJSApiFuturesFuturesPositionPnlShareData(@NotNull String id2, @NotNull String symbol, @NotNull String currency, @Nullable Long l11, @Nullable String str, @Nullable String str2, @Nullable Double d11, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable Double d12, @Nullable Boolean bool, @Nullable String str7) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.id = id2;
        this.symbol = symbol;
        this.currency = currency;
        this.offset = l11;
        this.type = str;
        this.side = str2;
        this.closeDate = d11;
        this.realisedPnl = str3;
        this.marginMode = str4;
        this.leverage = str5;
        this.closeType = str6;
        this.openTime = d12;
        this.isTrialFunds = bool;
        this.prizeType = str7;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getLeverage() {
        return this.leverage;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getCloseType() {
        return this.closeType;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Double getOpenTime() {
        return this.openTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final Boolean getIsTrialFunds() {
        return this.isTrialFunds;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getPrizeType() {
        return this.prizeType;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Long getOffset() {
        return this.offset;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getSide() {
        return this.side;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Double getCloseDate() {
        return this.closeDate;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getRealisedPnl() {
        return this.realisedPnl;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getMarginMode() {
        return this.marginMode;
    }

    @NotNull
    public final KCJSApiFuturesFuturesPositionPnlShareData copy(@NotNull String id2, @NotNull String symbol, @NotNull String currency, @Nullable Long offset, @Nullable String type, @Nullable String side, @Nullable Double closeDate, @Nullable String realisedPnl, @Nullable String marginMode, @Nullable String leverage, @Nullable String closeType, @Nullable Double openTime, @Nullable Boolean isTrialFunds, @Nullable String prizeType) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(currency, "currency");
        return new KCJSApiFuturesFuturesPositionPnlShareData(id2, symbol, currency, offset, type, side, closeDate, realisedPnl, marginMode, leverage, closeType, openTime, isTrialFunds, prizeType);
    }

    @Nullable
    public final Double getCloseDate() {
        return this.closeDate;
    }

    @Nullable
    public final String getCloseType() {
        return this.closeType;
    }

    @NotNull
    public final String getCurrency() {
        return this.currency;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final String getLeverage() {
        return this.leverage;
    }

    @Nullable
    public final String getMarginMode() {
        return this.marginMode;
    }

    @Nullable
    public final Long getOffset() {
        return this.offset;
    }

    @Nullable
    public final Double getOpenTime() {
        return this.openTime;
    }

    @Nullable
    public final String getPrizeType() {
        return this.prizeType;
    }

    @Nullable
    public final String getRealisedPnl() {
        return this.realisedPnl;
    }

    @Nullable
    public final String getSide() {
        return this.side;
    }

    @NotNull
    public final String getSymbol() {
        return this.symbol;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = ((((this.id.hashCode() * 31) + this.symbol.hashCode()) * 31) + this.currency.hashCode()) * 31;
        Long l11 = this.offset;
        int iHashCode2 = (iHashCode + (l11 == null ? 0 : l11.hashCode())) * 31;
        String str = this.type;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.side;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Double d11 = this.closeDate;
        int iHashCode5 = (iHashCode4 + (d11 == null ? 0 : d11.hashCode())) * 31;
        String str3 = this.realisedPnl;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.marginMode;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.leverage;
        int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.closeType;
        int iHashCode9 = (iHashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Double d12 = this.openTime;
        int iHashCode10 = (iHashCode9 + (d12 == null ? 0 : d12.hashCode())) * 31;
        Boolean bool = this.isTrialFunds;
        int iHashCode11 = (iHashCode10 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str7 = this.prizeType;
        return iHashCode11 + (str7 != null ? str7.hashCode() : 0);
    }

    @Nullable
    public final Boolean isTrialFunds() {
        return this.isTrialFunds;
    }

    @NotNull
    public String toString() {
        return "KCJSApiFuturesFuturesPositionPnlShareData(id=" + this.id + ", symbol=" + this.symbol + ", currency=" + this.currency + ", offset=" + this.offset + ", type=" + this.type + ", side=" + this.side + ", closeDate=" + this.closeDate + ", realisedPnl=" + this.realisedPnl + ", marginMode=" + this.marginMode + ", leverage=" + this.leverage + ", closeType=" + this.closeType + ", openTime=" + this.openTime + ", isTrialFunds=" + this.isTrialFunds + ", prizeType=" + this.prizeType + ')';
    }
}
