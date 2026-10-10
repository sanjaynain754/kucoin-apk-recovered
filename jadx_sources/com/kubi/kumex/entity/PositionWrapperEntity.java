package com.kubi.kumex.entity;

import com.tencent.cloud.tuikit.engine.common.internal.TUIConstantDefine;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: PositionWrapperEntity.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b6\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B¹\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0010\u001a\u00020\u0005\u0012\u0006\u0010\u0011\u001a\u00020\u0005\u0012\u0006\u0010\u0012\u001a\u00020\u0005\u0012\u0006\u0010\u0013\u001a\u00020\u0005\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u001b\u0010\u001cJ\t\u00107\u001a\u00020\u0003HÆ\u0003J\t\u00108\u001a\u00020\u0005HÆ\u0003J\t\u00109\u001a\u00020\u0005HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010;\u001a\u00020\u0005HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010=\u001a\u00020\u0005HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010?\u001a\u00020\u0005HÆ\u0003J\t\u0010@\u001a\u00020\u0003HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010B\u001a\u00020\u0005HÆ\u0003J\t\u0010C\u001a\u00020\u0005HÆ\u0003J\t\u0010D\u001a\u00020\u0005HÆ\u0003J\t\u0010E\u001a\u00020\u0005HÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010H\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0002\u00102J\u0010\u0010I\u001a\u0004\u0018\u00010\u0019HÆ\u0003¢\u0006\u0002\u00104J\u000b\u0010J\u001a\u0004\u0018\u00010\u0005HÆ\u0003Jè\u0001\u0010K\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u00052\b\b\u0002\u0010\u0012\u001a\u00020\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u00052\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010LJ\u0013\u0010M\u001a\u00020\u00192\b\u0010N\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010O\u001a\u00020PHÖ\u0001J\t\u0010Q\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b!\u0010 R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b$\u0010 R\u0013\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b%\u0010#R\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b&\u0010 R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b'\u0010 R\u0011\u0010\r\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b(\u0010 R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001eR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b*\u0010 R\u0011\u0010\u0010\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b+\u0010 R\u0011\u0010\u0011\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b,\u0010 R\u0011\u0010\u0012\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b-\u0010 R\u0011\u0010\u0013\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b.\u0010 R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b/\u0010 R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b0\u0010 R\u0015\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\n\n\u0002\u00103\u001a\u0004\b1\u00102R\u0015\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\n\n\u0002\u00105\u001a\u0004\b\u0018\u00104R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b6\u0010 ¨\u0006R"}, m90084d2 = {"Lcom/kubi/kumex/entity/PositionWrapperEntity;", "", "formatSide", "", "settleCurrency", "", "formatUnPnl", "unPnl", "Ljava/math/BigDecimal;", "formatRoi", "roi", "formatMarginMode", "marginMode", "formatLeverage", "formatSymbol", "symbol", "formatRiskRatio", "formatLiquidationPrice", "formatMarkPrice", "formatOpenPrice", "spotCurrency", "quoteCurrency", TUIConstantDefine.CREATE_TIME, "", "isTrial", "", "prizeType", "<init>", "(Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/String;)V", "getFormatSide", "()Ljava/lang/CharSequence;", "getSettleCurrency", "()Ljava/lang/String;", "getFormatUnPnl", "getUnPnl", "()Ljava/math/BigDecimal;", "getFormatRoi", "getRoi", "getFormatMarginMode", "getMarginMode", "getFormatLeverage", "getFormatSymbol", "getSymbol", "getFormatRiskRatio", "getFormatLiquidationPrice", "getFormatMarkPrice", "getFormatOpenPrice", "getSpotCurrency", "getQuoteCurrency", "getCreateTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getPrizeType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "copy", "(Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/String;)Lcom/kubi/kumex/entity/PositionWrapperEntity;", "equals", "other", "hashCode", "", "toString", "KumexApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class PositionWrapperEntity {

    @Nullable
    private final Long createTime;

    @NotNull
    private final String formatLeverage;

    @NotNull
    private final String formatLiquidationPrice;

    @NotNull
    private final String formatMarginMode;

    @NotNull
    private final String formatMarkPrice;

    @NotNull
    private final String formatOpenPrice;

    @NotNull
    private final String formatRiskRatio;

    @NotNull
    private final String formatRoi;

    @NotNull
    private final CharSequence formatSide;

    @NotNull
    private final CharSequence formatSymbol;

    @NotNull
    private final String formatUnPnl;

    @Nullable
    private final Boolean isTrial;

    @Nullable
    private final String marginMode;

    @Nullable
    private final String prizeType;

    @Nullable
    private final String quoteCurrency;

    @Nullable
    private final BigDecimal roi;

    @NotNull
    private final String settleCurrency;

    @Nullable
    private final String spotCurrency;

    @Nullable
    private final String symbol;

    @Nullable
    private final BigDecimal unPnl;

    public PositionWrapperEntity(@NotNull CharSequence formatSide, @NotNull String settleCurrency, @NotNull String formatUnPnl, @Nullable BigDecimal bigDecimal, @NotNull String formatRoi, @Nullable BigDecimal bigDecimal2, @NotNull String formatMarginMode, @Nullable String str, @NotNull String formatLeverage, @NotNull CharSequence formatSymbol, @Nullable String str2, @NotNull String formatRiskRatio, @NotNull String formatLiquidationPrice, @NotNull String formatMarkPrice, @NotNull String formatOpenPrice, @Nullable String str3, @Nullable String str4, @Nullable Long l11, @Nullable Boolean bool, @Nullable String str5) {
        Intrinsics.checkNotNullParameter(formatSide, "formatSide");
        Intrinsics.checkNotNullParameter(settleCurrency, "settleCurrency");
        Intrinsics.checkNotNullParameter(formatUnPnl, "formatUnPnl");
        Intrinsics.checkNotNullParameter(formatRoi, "formatRoi");
        Intrinsics.checkNotNullParameter(formatMarginMode, "formatMarginMode");
        Intrinsics.checkNotNullParameter(formatLeverage, "formatLeverage");
        Intrinsics.checkNotNullParameter(formatSymbol, "formatSymbol");
        Intrinsics.checkNotNullParameter(formatRiskRatio, "formatRiskRatio");
        Intrinsics.checkNotNullParameter(formatLiquidationPrice, "formatLiquidationPrice");
        Intrinsics.checkNotNullParameter(formatMarkPrice, "formatMarkPrice");
        Intrinsics.checkNotNullParameter(formatOpenPrice, "formatOpenPrice");
        this.formatSide = formatSide;
        this.settleCurrency = settleCurrency;
        this.formatUnPnl = formatUnPnl;
        this.unPnl = bigDecimal;
        this.formatRoi = formatRoi;
        this.roi = bigDecimal2;
        this.formatMarginMode = formatMarginMode;
        this.marginMode = str;
        this.formatLeverage = formatLeverage;
        this.formatSymbol = formatSymbol;
        this.symbol = str2;
        this.formatRiskRatio = formatRiskRatio;
        this.formatLiquidationPrice = formatLiquidationPrice;
        this.formatMarkPrice = formatMarkPrice;
        this.formatOpenPrice = formatOpenPrice;
        this.spotCurrency = str3;
        this.quoteCurrency = str4;
        this.createTime = l11;
        this.isTrial = bool;
        this.prizeType = str5;
    }

    public static /* synthetic */ PositionWrapperEntity copy$default(PositionWrapperEntity positionWrapperEntity, CharSequence charSequence, String str, String str2, BigDecimal bigDecimal, String str3, BigDecimal bigDecimal2, String str4, String str5, String str6, CharSequence charSequence2, String str7, String str8, String str9, String str10, String str11, String str12, String str13, Long l11, Boolean bool, String str14, int i11, Object obj) {
        String str15;
        Boolean bool2;
        CharSequence charSequence3 = (i11 & 1) != 0 ? positionWrapperEntity.formatSide : charSequence;
        String str16 = (i11 & 2) != 0 ? positionWrapperEntity.settleCurrency : str;
        String str17 = (i11 & 4) != 0 ? positionWrapperEntity.formatUnPnl : str2;
        BigDecimal bigDecimal3 = (i11 & 8) != 0 ? positionWrapperEntity.unPnl : bigDecimal;
        String str18 = (i11 & 16) != 0 ? positionWrapperEntity.formatRoi : str3;
        BigDecimal bigDecimal4 = (i11 & 32) != 0 ? positionWrapperEntity.roi : bigDecimal2;
        String str19 = (i11 & 64) != 0 ? positionWrapperEntity.formatMarginMode : str4;
        String str20 = (i11 & 128) != 0 ? positionWrapperEntity.marginMode : str5;
        String str21 = (i11 & 256) != 0 ? positionWrapperEntity.formatLeverage : str6;
        CharSequence charSequence4 = (i11 & 512) != 0 ? positionWrapperEntity.formatSymbol : charSequence2;
        String str22 = (i11 & 1024) != 0 ? positionWrapperEntity.symbol : str7;
        String str23 = (i11 & 2048) != 0 ? positionWrapperEntity.formatRiskRatio : str8;
        String str24 = (i11 & 4096) != 0 ? positionWrapperEntity.formatLiquidationPrice : str9;
        String str25 = (i11 & 8192) != 0 ? positionWrapperEntity.formatMarkPrice : str10;
        CharSequence charSequence5 = charSequence3;
        String str26 = (i11 & 16384) != 0 ? positionWrapperEntity.formatOpenPrice : str11;
        String str27 = (i11 & 32768) != 0 ? positionWrapperEntity.spotCurrency : str12;
        String str28 = (i11 & 65536) != 0 ? positionWrapperEntity.quoteCurrency : str13;
        Long l12 = (i11 & 131072) != 0 ? positionWrapperEntity.createTime : l11;
        Boolean bool3 = (i11 & 262144) != 0 ? positionWrapperEntity.isTrial : bool;
        if ((i11 & 524288) != 0) {
            bool2 = bool3;
            str15 = positionWrapperEntity.prizeType;
        } else {
            str15 = str14;
            bool2 = bool3;
        }
        return positionWrapperEntity.copy(charSequence5, str16, str17, bigDecimal3, str18, bigDecimal4, str19, str20, str21, charSequence4, str22, str23, str24, str25, str26, str27, str28, l12, bool2, str15);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PositionWrapperEntity)) {
            return false;
        }
        PositionWrapperEntity positionWrapperEntity = (PositionWrapperEntity) other;
        return Intrinsics.areEqual(this.formatSide, positionWrapperEntity.formatSide) && Intrinsics.areEqual(this.settleCurrency, positionWrapperEntity.settleCurrency) && Intrinsics.areEqual(this.formatUnPnl, positionWrapperEntity.formatUnPnl) && Intrinsics.areEqual(this.unPnl, positionWrapperEntity.unPnl) && Intrinsics.areEqual(this.formatRoi, positionWrapperEntity.formatRoi) && Intrinsics.areEqual(this.roi, positionWrapperEntity.roi) && Intrinsics.areEqual(this.formatMarginMode, positionWrapperEntity.formatMarginMode) && Intrinsics.areEqual(this.marginMode, positionWrapperEntity.marginMode) && Intrinsics.areEqual(this.formatLeverage, positionWrapperEntity.formatLeverage) && Intrinsics.areEqual(this.formatSymbol, positionWrapperEntity.formatSymbol) && Intrinsics.areEqual(this.symbol, positionWrapperEntity.symbol) && Intrinsics.areEqual(this.formatRiskRatio, positionWrapperEntity.formatRiskRatio) && Intrinsics.areEqual(this.formatLiquidationPrice, positionWrapperEntity.formatLiquidationPrice) && Intrinsics.areEqual(this.formatMarkPrice, positionWrapperEntity.formatMarkPrice) && Intrinsics.areEqual(this.formatOpenPrice, positionWrapperEntity.formatOpenPrice) && Intrinsics.areEqual(this.spotCurrency, positionWrapperEntity.spotCurrency) && Intrinsics.areEqual(this.quoteCurrency, positionWrapperEntity.quoteCurrency) && Intrinsics.areEqual(this.createTime, positionWrapperEntity.createTime) && Intrinsics.areEqual(this.isTrial, positionWrapperEntity.isTrial) && Intrinsics.areEqual(this.prizeType, positionWrapperEntity.prizeType);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final CharSequence getFormatSide() {
        return this.formatSide;
    }

    @NotNull
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final CharSequence getFormatSymbol() {
        return this.formatSymbol;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    @NotNull
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getFormatRiskRatio() {
        return this.formatRiskRatio;
    }

    @NotNull
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getFormatLiquidationPrice() {
        return this.formatLiquidationPrice;
    }

    @NotNull
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getFormatMarkPrice() {
        return this.formatMarkPrice;
    }

    @NotNull
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getFormatOpenPrice() {
        return this.formatOpenPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getSpotCurrency() {
        return this.spotCurrency;
    }

    @Nullable
    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getQuoteCurrency() {
        return this.quoteCurrency;
    }

    @Nullable
    /* JADX INFO: renamed from: component18, reason: from getter */
    public final Long getCreateTime() {
        return this.createTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component19, reason: from getter */
    public final Boolean getIsTrial() {
        return this.isTrial;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSettleCurrency() {
        return this.settleCurrency;
    }

    @Nullable
    /* JADX INFO: renamed from: component20, reason: from getter */
    public final String getPrizeType() {
        return this.prizeType;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getFormatUnPnl() {
        return this.formatUnPnl;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final BigDecimal getUnPnl() {
        return this.unPnl;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getFormatRoi() {
        return this.formatRoi;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final BigDecimal getRoi() {
        return this.roi;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getFormatMarginMode() {
        return this.formatMarginMode;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getMarginMode() {
        return this.marginMode;
    }

    @NotNull
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getFormatLeverage() {
        return this.formatLeverage;
    }

    @NotNull
    public final PositionWrapperEntity copy(@NotNull CharSequence formatSide, @NotNull String settleCurrency, @NotNull String formatUnPnl, @Nullable BigDecimal unPnl, @NotNull String formatRoi, @Nullable BigDecimal roi, @NotNull String formatMarginMode, @Nullable String marginMode, @NotNull String formatLeverage, @NotNull CharSequence formatSymbol, @Nullable String symbol, @NotNull String formatRiskRatio, @NotNull String formatLiquidationPrice, @NotNull String formatMarkPrice, @NotNull String formatOpenPrice, @Nullable String spotCurrency, @Nullable String quoteCurrency, @Nullable Long createTime, @Nullable Boolean isTrial, @Nullable String prizeType) {
        Intrinsics.checkNotNullParameter(formatSide, "formatSide");
        Intrinsics.checkNotNullParameter(settleCurrency, "settleCurrency");
        Intrinsics.checkNotNullParameter(formatUnPnl, "formatUnPnl");
        Intrinsics.checkNotNullParameter(formatRoi, "formatRoi");
        Intrinsics.checkNotNullParameter(formatMarginMode, "formatMarginMode");
        Intrinsics.checkNotNullParameter(formatLeverage, "formatLeverage");
        Intrinsics.checkNotNullParameter(formatSymbol, "formatSymbol");
        Intrinsics.checkNotNullParameter(formatRiskRatio, "formatRiskRatio");
        Intrinsics.checkNotNullParameter(formatLiquidationPrice, "formatLiquidationPrice");
        Intrinsics.checkNotNullParameter(formatMarkPrice, "formatMarkPrice");
        Intrinsics.checkNotNullParameter(formatOpenPrice, "formatOpenPrice");
        return new PositionWrapperEntity(formatSide, settleCurrency, formatUnPnl, unPnl, formatRoi, roi, formatMarginMode, marginMode, formatLeverage, formatSymbol, symbol, formatRiskRatio, formatLiquidationPrice, formatMarkPrice, formatOpenPrice, spotCurrency, quoteCurrency, createTime, isTrial, prizeType);
    }

    @Nullable
    public final Long getCreateTime() {
        return this.createTime;
    }

    @NotNull
    public final String getFormatLeverage() {
        return this.formatLeverage;
    }

    @NotNull
    public final String getFormatLiquidationPrice() {
        return this.formatLiquidationPrice;
    }

    @NotNull
    public final String getFormatMarginMode() {
        return this.formatMarginMode;
    }

    @NotNull
    public final String getFormatMarkPrice() {
        return this.formatMarkPrice;
    }

    @NotNull
    public final String getFormatOpenPrice() {
        return this.formatOpenPrice;
    }

    @NotNull
    public final String getFormatRiskRatio() {
        return this.formatRiskRatio;
    }

    @NotNull
    public final String getFormatRoi() {
        return this.formatRoi;
    }

    @NotNull
    public final CharSequence getFormatSide() {
        return this.formatSide;
    }

    @NotNull
    public final CharSequence getFormatSymbol() {
        return this.formatSymbol;
    }

    @NotNull
    public final String getFormatUnPnl() {
        return this.formatUnPnl;
    }

    @Nullable
    public final String getMarginMode() {
        return this.marginMode;
    }

    @Nullable
    public final String getPrizeType() {
        return this.prizeType;
    }

    @Nullable
    public final String getQuoteCurrency() {
        return this.quoteCurrency;
    }

    @Nullable
    public final BigDecimal getRoi() {
        return this.roi;
    }

    @NotNull
    public final String getSettleCurrency() {
        return this.settleCurrency;
    }

    @Nullable
    public final String getSpotCurrency() {
        return this.spotCurrency;
    }

    @Nullable
    public final String getSymbol() {
        return this.symbol;
    }

    @Nullable
    public final BigDecimal getUnPnl() {
        return this.unPnl;
    }

    public int hashCode() {
        int iHashCode = ((((this.formatSide.hashCode() * 31) + this.settleCurrency.hashCode()) * 31) + this.formatUnPnl.hashCode()) * 31;
        BigDecimal bigDecimal = this.unPnl;
        int iHashCode2 = (((iHashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31) + this.formatRoi.hashCode()) * 31;
        BigDecimal bigDecimal2 = this.roi;
        int iHashCode3 = (((iHashCode2 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31) + this.formatMarginMode.hashCode()) * 31;
        String str = this.marginMode;
        int iHashCode4 = (((((iHashCode3 + (str == null ? 0 : str.hashCode())) * 31) + this.formatLeverage.hashCode()) * 31) + this.formatSymbol.hashCode()) * 31;
        String str2 = this.symbol;
        int iHashCode5 = (((((((((iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.formatRiskRatio.hashCode()) * 31) + this.formatLiquidationPrice.hashCode()) * 31) + this.formatMarkPrice.hashCode()) * 31) + this.formatOpenPrice.hashCode()) * 31;
        String str3 = this.spotCurrency;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.quoteCurrency;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l11 = this.createTime;
        int iHashCode8 = (iHashCode7 + (l11 == null ? 0 : l11.hashCode())) * 31;
        Boolean bool = this.isTrial;
        int iHashCode9 = (iHashCode8 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str5 = this.prizeType;
        return iHashCode9 + (str5 != null ? str5.hashCode() : 0);
    }

    @Nullable
    public final Boolean isTrial() {
        return this.isTrial;
    }

    @NotNull
    public String toString() {
        return "PositionWrapperEntity(formatSide=" + ((Object) this.formatSide) + ", settleCurrency=" + this.settleCurrency + ", formatUnPnl=" + this.formatUnPnl + ", unPnl=" + this.unPnl + ", formatRoi=" + this.formatRoi + ", roi=" + this.roi + ", formatMarginMode=" + this.formatMarginMode + ", marginMode=" + this.marginMode + ", formatLeverage=" + this.formatLeverage + ", formatSymbol=" + ((Object) this.formatSymbol) + ", symbol=" + this.symbol + ", formatRiskRatio=" + this.formatRiskRatio + ", formatLiquidationPrice=" + this.formatLiquidationPrice + ", formatMarkPrice=" + this.formatMarkPrice + ", formatOpenPrice=" + this.formatOpenPrice + ", spotCurrency=" + this.spotCurrency + ", quoteCurrency=" + this.quoteCurrency + ", createTime=" + this.createTime + ", isTrial=" + this.isTrial + ", prizeType=" + this.prizeType + ')';
    }
}
