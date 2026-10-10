package com.kubi.margin.api.entity;

import androidx.annotation.Keep;
import com.kubi.p110rn.modules.BridgeParamKeyKt;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: IsolatedMarginBridgeConfig.kt */
/* JADX INFO: loaded from: classes27.dex */
@Keep
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\bA\b\u0087\b\u0018\u00002\u00020\u0001B\u0081\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b\u001f\u0010 J\u000b\u0010@\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010E\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010)J\u0010\u0010F\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010)J\u000b\u0010G\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010R\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010S\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010T\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010)J\u0010\u0010U\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010)J\u0010\u0010V\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010)J\u0010\u0010W\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010)J\u0010\u0010X\u001a\u0004\u0018\u00010\u001eHÆ\u0003¢\u0006\u0002\u0010>Jº\u0002\u0010Y\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÆ\u0001¢\u0006\u0002\u0010ZJ\u0013\u0010[\u001a\u00020\n2\b\u0010\\\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010]\u001a\u00020\u001eHÖ\u0001J\t\u0010^\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b%\u0010$R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b&\u0010$R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b'\u0010$R\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010*\u001a\u0004\b(\u0010)R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010*\u001a\u0004\b+\u0010)R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b,\u0010$R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b-\u0010$R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b.\u0010$R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b/\u0010$R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b0\u0010$R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b1\u0010$R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b2\u0010$R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b3\u0010$R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b4\u0010$R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b5\u0010$R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b6\u0010$R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b7\u0010$R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b8\u0010$R\u0015\u0010\u0019\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010*\u001a\u0004\b9\u0010)R\u0015\u0010\u001a\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010*\u001a\u0004\b:\u0010)R\u0015\u0010\u001b\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010*\u001a\u0004\b;\u0010)R\u0015\u0010\u001c\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010*\u001a\u0004\b<\u0010)R\u0015\u0010\u001d\u001a\u0004\u0018\u00010\u001e¢\u0006\n\n\u0002\u0010?\u001a\u0004\b=\u0010>¨\u0006_"}, m90084d2 = {"Lcom/kubi/margin/api/entity/IsolatedMarginBridgeConfig;", "", "symbol", "", "flDebtRatio", "Ljava/math/BigDecimal;", "defaultLeverage", "maxLeverage", "riskLeverage", "baseBorrowEnable", "", "quoteBorrowEnable", "baseMaxBorrowAmount", "quoteMaxBorrowAmount", "autoRenewMaxDebtRatio", "baseMaxBuyAmount", "quoteMaxBuyAmount", "borrowBufferRatio", "warnDebtRatio", "transferOutMaxDebtRatio", "transferOutBufferRatio", "baseBorrowCoefficient", "quoteBorrowCoefficient", "baseMarginCoefficient", "quoteMarginCoefficient", BridgeParamKeyKt.RN_CONTAINER_UI_ENABLE, "tradeEnable", "baseTransferInEnable", "quoteTransferInEnable", "pnlPrecision", "", "<init>", "(Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;)V", "getSymbol", "()Ljava/lang/String;", "getFlDebtRatio", "()Ljava/math/BigDecimal;", "getDefaultLeverage", "getMaxLeverage", "getRiskLeverage", "getBaseBorrowEnable", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getQuoteBorrowEnable", "getBaseMaxBorrowAmount", "getQuoteMaxBorrowAmount", "getAutoRenewMaxDebtRatio", "getBaseMaxBuyAmount", "getQuoteMaxBuyAmount", "getBorrowBufferRatio", "getWarnDebtRatio", "getTransferOutMaxDebtRatio", "getTransferOutBufferRatio", "getBaseBorrowCoefficient", "getQuoteBorrowCoefficient", "getBaseMarginCoefficient", "getQuoteMarginCoefficient", "getEnable", "getTradeEnable", "getBaseTransferInEnable", "getQuoteTransferInEnable", "getPnlPrecision", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "copy", "(Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;)Lcom/kubi/margin/api/entity/IsolatedMarginBridgeConfig;", "equals", "other", "hashCode", "toString", "MarginApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class IsolatedMarginBridgeConfig {

    @Nullable
    private final BigDecimal autoRenewMaxDebtRatio;

    @Nullable
    private final BigDecimal baseBorrowCoefficient;

    @Nullable
    private final Boolean baseBorrowEnable;

    @Nullable
    private final BigDecimal baseMarginCoefficient;

    @Nullable
    private final BigDecimal baseMaxBorrowAmount;

    @Nullable
    private final BigDecimal baseMaxBuyAmount;

    @Nullable
    private final Boolean baseTransferInEnable;

    @Nullable
    private final BigDecimal borrowBufferRatio;

    @Nullable
    private final BigDecimal defaultLeverage;

    @Nullable
    private final Boolean enable;

    @Nullable
    private final BigDecimal flDebtRatio;

    @Nullable
    private final BigDecimal maxLeverage;

    @Nullable
    private final Integer pnlPrecision;

    @Nullable
    private final BigDecimal quoteBorrowCoefficient;

    @Nullable
    private final Boolean quoteBorrowEnable;

    @Nullable
    private final BigDecimal quoteMarginCoefficient;

    @Nullable
    private final BigDecimal quoteMaxBorrowAmount;

    @Nullable
    private final BigDecimal quoteMaxBuyAmount;

    @Nullable
    private final Boolean quoteTransferInEnable;

    @Nullable
    private final BigDecimal riskLeverage;

    @Nullable
    private final String symbol;

    @Nullable
    private final Boolean tradeEnable;

    @Nullable
    private final BigDecimal transferOutBufferRatio;

    @Nullable
    private final BigDecimal transferOutMaxDebtRatio;

    @Nullable
    private final BigDecimal warnDebtRatio;

    public static /* synthetic */ IsolatedMarginBridgeConfig copy$default(IsolatedMarginBridgeConfig isolatedMarginBridgeConfig, String str, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, Boolean bool, Boolean bool2, BigDecimal bigDecimal5, BigDecimal bigDecimal6, BigDecimal bigDecimal7, BigDecimal bigDecimal8, BigDecimal bigDecimal9, BigDecimal bigDecimal10, BigDecimal bigDecimal11, BigDecimal bigDecimal12, BigDecimal bigDecimal13, BigDecimal bigDecimal14, BigDecimal bigDecimal15, BigDecimal bigDecimal16, BigDecimal bigDecimal17, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Integer num, int i11, Object obj) {
        Integer num2;
        Boolean bool7;
        String str2 = (i11 & 1) != 0 ? isolatedMarginBridgeConfig.symbol : str;
        BigDecimal bigDecimal18 = (i11 & 2) != 0 ? isolatedMarginBridgeConfig.flDebtRatio : bigDecimal;
        BigDecimal bigDecimal19 = (i11 & 4) != 0 ? isolatedMarginBridgeConfig.defaultLeverage : bigDecimal2;
        BigDecimal bigDecimal20 = (i11 & 8) != 0 ? isolatedMarginBridgeConfig.maxLeverage : bigDecimal3;
        BigDecimal bigDecimal21 = (i11 & 16) != 0 ? isolatedMarginBridgeConfig.riskLeverage : bigDecimal4;
        Boolean bool8 = (i11 & 32) != 0 ? isolatedMarginBridgeConfig.baseBorrowEnable : bool;
        Boolean bool9 = (i11 & 64) != 0 ? isolatedMarginBridgeConfig.quoteBorrowEnable : bool2;
        BigDecimal bigDecimal22 = (i11 & 128) != 0 ? isolatedMarginBridgeConfig.baseMaxBorrowAmount : bigDecimal5;
        BigDecimal bigDecimal23 = (i11 & 256) != 0 ? isolatedMarginBridgeConfig.quoteMaxBorrowAmount : bigDecimal6;
        BigDecimal bigDecimal24 = (i11 & 512) != 0 ? isolatedMarginBridgeConfig.autoRenewMaxDebtRatio : bigDecimal7;
        BigDecimal bigDecimal25 = (i11 & 1024) != 0 ? isolatedMarginBridgeConfig.baseMaxBuyAmount : bigDecimal8;
        BigDecimal bigDecimal26 = (i11 & 2048) != 0 ? isolatedMarginBridgeConfig.quoteMaxBuyAmount : bigDecimal9;
        BigDecimal bigDecimal27 = (i11 & 4096) != 0 ? isolatedMarginBridgeConfig.borrowBufferRatio : bigDecimal10;
        BigDecimal bigDecimal28 = (i11 & 8192) != 0 ? isolatedMarginBridgeConfig.warnDebtRatio : bigDecimal11;
        String str3 = str2;
        BigDecimal bigDecimal29 = (i11 & 16384) != 0 ? isolatedMarginBridgeConfig.transferOutMaxDebtRatio : bigDecimal12;
        BigDecimal bigDecimal30 = (i11 & 32768) != 0 ? isolatedMarginBridgeConfig.transferOutBufferRatio : bigDecimal13;
        BigDecimal bigDecimal31 = (i11 & 65536) != 0 ? isolatedMarginBridgeConfig.baseBorrowCoefficient : bigDecimal14;
        BigDecimal bigDecimal32 = (i11 & 131072) != 0 ? isolatedMarginBridgeConfig.quoteBorrowCoefficient : bigDecimal15;
        BigDecimal bigDecimal33 = (i11 & 262144) != 0 ? isolatedMarginBridgeConfig.baseMarginCoefficient : bigDecimal16;
        BigDecimal bigDecimal34 = (i11 & 524288) != 0 ? isolatedMarginBridgeConfig.quoteMarginCoefficient : bigDecimal17;
        Boolean bool10 = (i11 & 1048576) != 0 ? isolatedMarginBridgeConfig.enable : bool3;
        Boolean bool11 = (i11 & 2097152) != 0 ? isolatedMarginBridgeConfig.tradeEnable : bool4;
        Boolean bool12 = (i11 & 4194304) != 0 ? isolatedMarginBridgeConfig.baseTransferInEnable : bool5;
        Boolean bool13 = (i11 & 8388608) != 0 ? isolatedMarginBridgeConfig.quoteTransferInEnable : bool6;
        if ((i11 & 16777216) != 0) {
            bool7 = bool13;
            num2 = isolatedMarginBridgeConfig.pnlPrecision;
        } else {
            num2 = num;
            bool7 = bool13;
        }
        return isolatedMarginBridgeConfig.copy(str3, bigDecimal18, bigDecimal19, bigDecimal20, bigDecimal21, bool8, bool9, bigDecimal22, bigDecimal23, bigDecimal24, bigDecimal25, bigDecimal26, bigDecimal27, bigDecimal28, bigDecimal29, bigDecimal30, bigDecimal31, bigDecimal32, bigDecimal33, bigDecimal34, bool10, bool11, bool12, bool7, num2);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IsolatedMarginBridgeConfig)) {
            return false;
        }
        IsolatedMarginBridgeConfig isolatedMarginBridgeConfig = (IsolatedMarginBridgeConfig) other;
        return Intrinsics.areEqual(this.symbol, isolatedMarginBridgeConfig.symbol) && Intrinsics.areEqual(this.flDebtRatio, isolatedMarginBridgeConfig.flDebtRatio) && Intrinsics.areEqual(this.defaultLeverage, isolatedMarginBridgeConfig.defaultLeverage) && Intrinsics.areEqual(this.maxLeverage, isolatedMarginBridgeConfig.maxLeverage) && Intrinsics.areEqual(this.riskLeverage, isolatedMarginBridgeConfig.riskLeverage) && Intrinsics.areEqual(this.baseBorrowEnable, isolatedMarginBridgeConfig.baseBorrowEnable) && Intrinsics.areEqual(this.quoteBorrowEnable, isolatedMarginBridgeConfig.quoteBorrowEnable) && Intrinsics.areEqual(this.baseMaxBorrowAmount, isolatedMarginBridgeConfig.baseMaxBorrowAmount) && Intrinsics.areEqual(this.quoteMaxBorrowAmount, isolatedMarginBridgeConfig.quoteMaxBorrowAmount) && Intrinsics.areEqual(this.autoRenewMaxDebtRatio, isolatedMarginBridgeConfig.autoRenewMaxDebtRatio) && Intrinsics.areEqual(this.baseMaxBuyAmount, isolatedMarginBridgeConfig.baseMaxBuyAmount) && Intrinsics.areEqual(this.quoteMaxBuyAmount, isolatedMarginBridgeConfig.quoteMaxBuyAmount) && Intrinsics.areEqual(this.borrowBufferRatio, isolatedMarginBridgeConfig.borrowBufferRatio) && Intrinsics.areEqual(this.warnDebtRatio, isolatedMarginBridgeConfig.warnDebtRatio) && Intrinsics.areEqual(this.transferOutMaxDebtRatio, isolatedMarginBridgeConfig.transferOutMaxDebtRatio) && Intrinsics.areEqual(this.transferOutBufferRatio, isolatedMarginBridgeConfig.transferOutBufferRatio) && Intrinsics.areEqual(this.baseBorrowCoefficient, isolatedMarginBridgeConfig.baseBorrowCoefficient) && Intrinsics.areEqual(this.quoteBorrowCoefficient, isolatedMarginBridgeConfig.quoteBorrowCoefficient) && Intrinsics.areEqual(this.baseMarginCoefficient, isolatedMarginBridgeConfig.baseMarginCoefficient) && Intrinsics.areEqual(this.quoteMarginCoefficient, isolatedMarginBridgeConfig.quoteMarginCoefficient) && Intrinsics.areEqual(this.enable, isolatedMarginBridgeConfig.enable) && Intrinsics.areEqual(this.tradeEnable, isolatedMarginBridgeConfig.tradeEnable) && Intrinsics.areEqual(this.baseTransferInEnable, isolatedMarginBridgeConfig.baseTransferInEnable) && Intrinsics.areEqual(this.quoteTransferInEnable, isolatedMarginBridgeConfig.quoteTransferInEnable) && Intrinsics.areEqual(this.pnlPrecision, isolatedMarginBridgeConfig.pnlPrecision);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final BigDecimal getAutoRenewMaxDebtRatio() {
        return this.autoRenewMaxDebtRatio;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final BigDecimal getBaseMaxBuyAmount() {
        return this.baseMaxBuyAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final BigDecimal getQuoteMaxBuyAmount() {
        return this.quoteMaxBuyAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final BigDecimal getBorrowBufferRatio() {
        return this.borrowBufferRatio;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final BigDecimal getWarnDebtRatio() {
        return this.warnDebtRatio;
    }

    @Nullable
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final BigDecimal getTransferOutMaxDebtRatio() {
        return this.transferOutMaxDebtRatio;
    }

    @Nullable
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final BigDecimal getTransferOutBufferRatio() {
        return this.transferOutBufferRatio;
    }

    @Nullable
    /* JADX INFO: renamed from: component17, reason: from getter */
    public final BigDecimal getBaseBorrowCoefficient() {
        return this.baseBorrowCoefficient;
    }

    @Nullable
    /* JADX INFO: renamed from: component18, reason: from getter */
    public final BigDecimal getQuoteBorrowCoefficient() {
        return this.quoteBorrowCoefficient;
    }

    @Nullable
    /* JADX INFO: renamed from: component19, reason: from getter */
    public final BigDecimal getBaseMarginCoefficient() {
        return this.baseMarginCoefficient;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final BigDecimal getFlDebtRatio() {
        return this.flDebtRatio;
    }

    @Nullable
    /* JADX INFO: renamed from: component20, reason: from getter */
    public final BigDecimal getQuoteMarginCoefficient() {
        return this.quoteMarginCoefficient;
    }

    @Nullable
    /* JADX INFO: renamed from: component21, reason: from getter */
    public final Boolean getEnable() {
        return this.enable;
    }

    @Nullable
    /* JADX INFO: renamed from: component22, reason: from getter */
    public final Boolean getTradeEnable() {
        return this.tradeEnable;
    }

    @Nullable
    /* JADX INFO: renamed from: component23, reason: from getter */
    public final Boolean getBaseTransferInEnable() {
        return this.baseTransferInEnable;
    }

    @Nullable
    /* JADX INFO: renamed from: component24, reason: from getter */
    public final Boolean getQuoteTransferInEnable() {
        return this.quoteTransferInEnable;
    }

    @Nullable
    /* JADX INFO: renamed from: component25, reason: from getter */
    public final Integer getPnlPrecision() {
        return this.pnlPrecision;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final BigDecimal getDefaultLeverage() {
        return this.defaultLeverage;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final BigDecimal getMaxLeverage() {
        return this.maxLeverage;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final BigDecimal getRiskLeverage() {
        return this.riskLeverage;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Boolean getBaseBorrowEnable() {
        return this.baseBorrowEnable;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Boolean getQuoteBorrowEnable() {
        return this.quoteBorrowEnable;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final BigDecimal getBaseMaxBorrowAmount() {
        return this.baseMaxBorrowAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final BigDecimal getQuoteMaxBorrowAmount() {
        return this.quoteMaxBorrowAmount;
    }

    @NotNull
    public final IsolatedMarginBridgeConfig copy(@Nullable String symbol, @Nullable BigDecimal flDebtRatio, @Nullable BigDecimal defaultLeverage, @Nullable BigDecimal maxLeverage, @Nullable BigDecimal riskLeverage, @Nullable Boolean baseBorrowEnable, @Nullable Boolean quoteBorrowEnable, @Nullable BigDecimal baseMaxBorrowAmount, @Nullable BigDecimal quoteMaxBorrowAmount, @Nullable BigDecimal autoRenewMaxDebtRatio, @Nullable BigDecimal baseMaxBuyAmount, @Nullable BigDecimal quoteMaxBuyAmount, @Nullable BigDecimal borrowBufferRatio, @Nullable BigDecimal warnDebtRatio, @Nullable BigDecimal transferOutMaxDebtRatio, @Nullable BigDecimal transferOutBufferRatio, @Nullable BigDecimal baseBorrowCoefficient, @Nullable BigDecimal quoteBorrowCoefficient, @Nullable BigDecimal baseMarginCoefficient, @Nullable BigDecimal quoteMarginCoefficient, @Nullable Boolean enable, @Nullable Boolean tradeEnable, @Nullable Boolean baseTransferInEnable, @Nullable Boolean quoteTransferInEnable, @Nullable Integer pnlPrecision) {
        return new IsolatedMarginBridgeConfig(symbol, flDebtRatio, defaultLeverage, maxLeverage, riskLeverage, baseBorrowEnable, quoteBorrowEnable, baseMaxBorrowAmount, quoteMaxBorrowAmount, autoRenewMaxDebtRatio, baseMaxBuyAmount, quoteMaxBuyAmount, borrowBufferRatio, warnDebtRatio, transferOutMaxDebtRatio, transferOutBufferRatio, baseBorrowCoefficient, quoteBorrowCoefficient, baseMarginCoefficient, quoteMarginCoefficient, enable, tradeEnable, baseTransferInEnable, quoteTransferInEnable, pnlPrecision);
    }

    @Nullable
    public final BigDecimal getAutoRenewMaxDebtRatio() {
        return this.autoRenewMaxDebtRatio;
    }

    @Nullable
    public final BigDecimal getBaseBorrowCoefficient() {
        return this.baseBorrowCoefficient;
    }

    @Nullable
    public final Boolean getBaseBorrowEnable() {
        return this.baseBorrowEnable;
    }

    @Nullable
    public final BigDecimal getBaseMarginCoefficient() {
        return this.baseMarginCoefficient;
    }

    @Nullable
    public final BigDecimal getBaseMaxBorrowAmount() {
        return this.baseMaxBorrowAmount;
    }

    @Nullable
    public final BigDecimal getBaseMaxBuyAmount() {
        return this.baseMaxBuyAmount;
    }

    @Nullable
    public final Boolean getBaseTransferInEnable() {
        return this.baseTransferInEnable;
    }

    @Nullable
    public final BigDecimal getBorrowBufferRatio() {
        return this.borrowBufferRatio;
    }

    @Nullable
    public final BigDecimal getDefaultLeverage() {
        return this.defaultLeverage;
    }

    @Nullable
    public final Boolean getEnable() {
        return this.enable;
    }

    @Nullable
    public final BigDecimal getFlDebtRatio() {
        return this.flDebtRatio;
    }

    @Nullable
    public final BigDecimal getMaxLeverage() {
        return this.maxLeverage;
    }

    @Nullable
    public final Integer getPnlPrecision() {
        return this.pnlPrecision;
    }

    @Nullable
    public final BigDecimal getQuoteBorrowCoefficient() {
        return this.quoteBorrowCoefficient;
    }

    @Nullable
    public final Boolean getQuoteBorrowEnable() {
        return this.quoteBorrowEnable;
    }

    @Nullable
    public final BigDecimal getQuoteMarginCoefficient() {
        return this.quoteMarginCoefficient;
    }

    @Nullable
    public final BigDecimal getQuoteMaxBorrowAmount() {
        return this.quoteMaxBorrowAmount;
    }

    @Nullable
    public final BigDecimal getQuoteMaxBuyAmount() {
        return this.quoteMaxBuyAmount;
    }

    @Nullable
    public final Boolean getQuoteTransferInEnable() {
        return this.quoteTransferInEnable;
    }

    @Nullable
    public final BigDecimal getRiskLeverage() {
        return this.riskLeverage;
    }

    @Nullable
    public final String getSymbol() {
        return this.symbol;
    }

    @Nullable
    public final Boolean getTradeEnable() {
        return this.tradeEnable;
    }

    @Nullable
    public final BigDecimal getTransferOutBufferRatio() {
        return this.transferOutBufferRatio;
    }

    @Nullable
    public final BigDecimal getTransferOutMaxDebtRatio() {
        return this.transferOutMaxDebtRatio;
    }

    @Nullable
    public final BigDecimal getWarnDebtRatio() {
        return this.warnDebtRatio;
    }

    public int hashCode() {
        String str = this.symbol;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        BigDecimal bigDecimal = this.flDebtRatio;
        int iHashCode2 = (iHashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.defaultLeverage;
        int iHashCode3 = (iHashCode2 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.maxLeverage;
        int iHashCode4 = (iHashCode3 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        BigDecimal bigDecimal4 = this.riskLeverage;
        int iHashCode5 = (iHashCode4 + (bigDecimal4 == null ? 0 : bigDecimal4.hashCode())) * 31;
        Boolean bool = this.baseBorrowEnable;
        int iHashCode6 = (iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.quoteBorrowEnable;
        int iHashCode7 = (iHashCode6 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        BigDecimal bigDecimal5 = this.baseMaxBorrowAmount;
        int iHashCode8 = (iHashCode7 + (bigDecimal5 == null ? 0 : bigDecimal5.hashCode())) * 31;
        BigDecimal bigDecimal6 = this.quoteMaxBorrowAmount;
        int iHashCode9 = (iHashCode8 + (bigDecimal6 == null ? 0 : bigDecimal6.hashCode())) * 31;
        BigDecimal bigDecimal7 = this.autoRenewMaxDebtRatio;
        int iHashCode10 = (iHashCode9 + (bigDecimal7 == null ? 0 : bigDecimal7.hashCode())) * 31;
        BigDecimal bigDecimal8 = this.baseMaxBuyAmount;
        int iHashCode11 = (iHashCode10 + (bigDecimal8 == null ? 0 : bigDecimal8.hashCode())) * 31;
        BigDecimal bigDecimal9 = this.quoteMaxBuyAmount;
        int iHashCode12 = (iHashCode11 + (bigDecimal9 == null ? 0 : bigDecimal9.hashCode())) * 31;
        BigDecimal bigDecimal10 = this.borrowBufferRatio;
        int iHashCode13 = (iHashCode12 + (bigDecimal10 == null ? 0 : bigDecimal10.hashCode())) * 31;
        BigDecimal bigDecimal11 = this.warnDebtRatio;
        int iHashCode14 = (iHashCode13 + (bigDecimal11 == null ? 0 : bigDecimal11.hashCode())) * 31;
        BigDecimal bigDecimal12 = this.transferOutMaxDebtRatio;
        int iHashCode15 = (iHashCode14 + (bigDecimal12 == null ? 0 : bigDecimal12.hashCode())) * 31;
        BigDecimal bigDecimal13 = this.transferOutBufferRatio;
        int iHashCode16 = (iHashCode15 + (bigDecimal13 == null ? 0 : bigDecimal13.hashCode())) * 31;
        BigDecimal bigDecimal14 = this.baseBorrowCoefficient;
        int iHashCode17 = (iHashCode16 + (bigDecimal14 == null ? 0 : bigDecimal14.hashCode())) * 31;
        BigDecimal bigDecimal15 = this.quoteBorrowCoefficient;
        int iHashCode18 = (iHashCode17 + (bigDecimal15 == null ? 0 : bigDecimal15.hashCode())) * 31;
        BigDecimal bigDecimal16 = this.baseMarginCoefficient;
        int iHashCode19 = (iHashCode18 + (bigDecimal16 == null ? 0 : bigDecimal16.hashCode())) * 31;
        BigDecimal bigDecimal17 = this.quoteMarginCoefficient;
        int iHashCode20 = (iHashCode19 + (bigDecimal17 == null ? 0 : bigDecimal17.hashCode())) * 31;
        Boolean bool3 = this.enable;
        int iHashCode21 = (iHashCode20 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.tradeEnable;
        int iHashCode22 = (iHashCode21 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.baseTransferInEnable;
        int iHashCode23 = (iHashCode22 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.quoteTransferInEnable;
        int iHashCode24 = (iHashCode23 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        Integer num = this.pnlPrecision;
        return iHashCode24 + (num != null ? num.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "IsolatedMarginBridgeConfig(symbol=" + this.symbol + ", flDebtRatio=" + this.flDebtRatio + ", defaultLeverage=" + this.defaultLeverage + ", maxLeverage=" + this.maxLeverage + ", riskLeverage=" + this.riskLeverage + ", baseBorrowEnable=" + this.baseBorrowEnable + ", quoteBorrowEnable=" + this.quoteBorrowEnable + ", baseMaxBorrowAmount=" + this.baseMaxBorrowAmount + ", quoteMaxBorrowAmount=" + this.quoteMaxBorrowAmount + ", autoRenewMaxDebtRatio=" + this.autoRenewMaxDebtRatio + ", baseMaxBuyAmount=" + this.baseMaxBuyAmount + ", quoteMaxBuyAmount=" + this.quoteMaxBuyAmount + ", borrowBufferRatio=" + this.borrowBufferRatio + ", warnDebtRatio=" + this.warnDebtRatio + ", transferOutMaxDebtRatio=" + this.transferOutMaxDebtRatio + ", transferOutBufferRatio=" + this.transferOutBufferRatio + ", baseBorrowCoefficient=" + this.baseBorrowCoefficient + ", quoteBorrowCoefficient=" + this.quoteBorrowCoefficient + ", baseMarginCoefficient=" + this.baseMarginCoefficient + ", quoteMarginCoefficient=" + this.quoteMarginCoefficient + ", enable=" + this.enable + ", tradeEnable=" + this.tradeEnable + ", baseTransferInEnable=" + this.baseTransferInEnable + ", quoteTransferInEnable=" + this.quoteTransferInEnable + ", pnlPrecision=" + this.pnlPrecision + ')';
    }

    public IsolatedMarginBridgeConfig(@Nullable String str, @Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2, @Nullable BigDecimal bigDecimal3, @Nullable BigDecimal bigDecimal4, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable BigDecimal bigDecimal5, @Nullable BigDecimal bigDecimal6, @Nullable BigDecimal bigDecimal7, @Nullable BigDecimal bigDecimal8, @Nullable BigDecimal bigDecimal9, @Nullable BigDecimal bigDecimal10, @Nullable BigDecimal bigDecimal11, @Nullable BigDecimal bigDecimal12, @Nullable BigDecimal bigDecimal13, @Nullable BigDecimal bigDecimal14, @Nullable BigDecimal bigDecimal15, @Nullable BigDecimal bigDecimal16, @Nullable BigDecimal bigDecimal17, @Nullable Boolean bool3, @Nullable Boolean bool4, @Nullable Boolean bool5, @Nullable Boolean bool6, @Nullable Integer num) {
        this.symbol = str;
        this.flDebtRatio = bigDecimal;
        this.defaultLeverage = bigDecimal2;
        this.maxLeverage = bigDecimal3;
        this.riskLeverage = bigDecimal4;
        this.baseBorrowEnable = bool;
        this.quoteBorrowEnable = bool2;
        this.baseMaxBorrowAmount = bigDecimal5;
        this.quoteMaxBorrowAmount = bigDecimal6;
        this.autoRenewMaxDebtRatio = bigDecimal7;
        this.baseMaxBuyAmount = bigDecimal8;
        this.quoteMaxBuyAmount = bigDecimal9;
        this.borrowBufferRatio = bigDecimal10;
        this.warnDebtRatio = bigDecimal11;
        this.transferOutMaxDebtRatio = bigDecimal12;
        this.transferOutBufferRatio = bigDecimal13;
        this.baseBorrowCoefficient = bigDecimal14;
        this.quoteBorrowCoefficient = bigDecimal15;
        this.baseMarginCoefficient = bigDecimal16;
        this.quoteMarginCoefficient = bigDecimal17;
        this.enable = bool3;
        this.tradeEnable = bool4;
        this.baseTransferInEnable = bool5;
        this.quoteTransferInEnable = bool6;
        this.pnlPrecision = num;
    }
}
