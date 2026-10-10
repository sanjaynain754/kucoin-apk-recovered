package com.kubi.sdk.protocol.jsapi.protocol;

import androidx.annotation.Keep;
import androidx.media3.common.C2711C;
import com.kubi.p110rn.modules.BridgeParamKeyKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KCJSApiTradeModule.kt */
/* JADX INFO: loaded from: classes41.dex */
@Keep
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\bX\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bç\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u0003\u0012\u0006\u0010\u0016\u001a\u00020\u0003\u0012\u0006\u0010\u0017\u001a\u00020\u0003\u0012\u0006\u0010\u0018\u001a\u00020\u0003\u0012\u0006\u0010\u0019\u001a\u00020\u0003\u0012\u0006\u0010\u001a\u001a\u00020\u0003\u0012\u0006\u0010\u001b\u001a\u00020\u0003\u0012\u0006\u0010\u001c\u001a\u00020\u000b\u0012\u0006\u0010\u001d\u001a\u00020\u000b\u0012\u0006\u0010\u001e\u001a\u00020\u000b\u0012\u0006\u0010\u001f\u001a\u00020\u000b\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010!J\t\u0010C\u001a\u00020\u0003HÆ\u0003J\t\u0010D\u001a\u00020\u0003HÆ\u0003J\t\u0010E\u001a\u00020\u0003HÆ\u0003J\t\u0010F\u001a\u00020\u0003HÆ\u0003J\t\u0010G\u001a\u00020\u0003HÆ\u0003J\t\u0010H\u001a\u00020\u0003HÆ\u0003J\t\u0010I\u001a\u00020\u0003HÆ\u0003J\t\u0010J\u001a\u00020\u0003HÆ\u0003J\t\u0010K\u001a\u00020\u0003HÆ\u0003J\t\u0010L\u001a\u00020\u0003HÆ\u0003J\t\u0010M\u001a\u00020\u0003HÆ\u0003J\t\u0010N\u001a\u00020\u0003HÆ\u0003J\t\u0010O\u001a\u00020\u0003HÆ\u0003J\t\u0010P\u001a\u00020\u0003HÆ\u0003J\t\u0010Q\u001a\u00020\u0003HÆ\u0003J\t\u0010R\u001a\u00020\u0003HÆ\u0003J\t\u0010S\u001a\u00020\u000bHÆ\u0003J\t\u0010T\u001a\u00020\u000bHÆ\u0003J\t\u0010U\u001a\u00020\u000bHÆ\u0003J\t\u0010V\u001a\u00020\u000bHÆ\u0003J\u0010\u0010W\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u00103J\t\u0010X\u001a\u00020\u0006HÆ\u0003J\t\u0010Y\u001a\u00020\u0006HÆ\u0003J\t\u0010Z\u001a\u00020\u0006HÆ\u0003J\t\u0010[\u001a\u00020\u0003HÆ\u0003J\t\u0010\\\u001a\u00020\u000bHÆ\u0003J\t\u0010]\u001a\u00020\u000bHÆ\u0003J\t\u0010^\u001a\u00020\u0003HÆ\u0003J¨\u0002\u0010_\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u00032\b\b\u0002\u0010\u0019\u001a\u00020\u00032\b\b\u0002\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u001b\u001a\u00020\u00032\b\b\u0002\u0010\u001c\u001a\u00020\u000b2\b\b\u0002\u0010\u001d\u001a\u00020\u000b2\b\b\u0002\u0010\u001e\u001a\u00020\u000b2\b\b\u0002\u0010\u001f\u001a\u00020\u000b2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010`J\u0013\u0010a\u001a\u00020\u000b2\b\u0010b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010c\u001a\u00020dHÖ\u0001J\t\u0010e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\u0018\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010#R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\u001a\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010#R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010#R\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010#R\u0011\u0010\u001e\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b*\u0010&R\u0011\u0010\u0012\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010#R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0011\u0010\u001c\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b.\u0010&R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b/\u0010#R\u0011\u0010\u0015\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b0\u0010#R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b1\u0010-R\u0015\u0010 \u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u00104\u001a\u0004\b2\u00103R\u0011\u0010\u0019\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b5\u0010#R\u0011\u0010\f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b6\u0010&R\u0011\u0010\u001b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b7\u0010#R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b8\u0010#R\u0011\u0010\u0011\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b9\u0010#R\u0011\u0010\u001f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b:\u0010&R\u0011\u0010\u0013\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b;\u0010#R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b<\u0010#R\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b=\u0010-R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b>\u0010#R\u0011\u0010\u001d\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b?\u0010&R\u0011\u0010\u0017\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b@\u0010#R\u0011\u0010\u0016\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bA\u0010#R\u0011\u0010\u0014\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bB\u0010#¨\u0006f"}, m90084d2 = {"Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiTradeIsolatedMarginConfig;", "", "symbol", "", "flDebtRatio", "defaultLeverage", "", "maxLeverage", "riskLeverage", "riskGrade", "baseBorrowEnable", "", "quoteBorrowEnable", "baseMaxBorrowAmount", "quoteMaxBorrowAmount", "autoRenewMaxDebtRatio", "baseMaxBuyAmount", "quoteMaxBuyAmount", "borrowBufferRatio", "remindDebtRatio", "warnDebtRatio", "flWarnDebtRatio", "transferOutMaxDebtRatio", "transferOutBufferRatio", "baseBorrowCoefficient", "quoteBorrowCoefficient", "baseMarginCoefficient", "quoteMarginCoefficient", BridgeParamKeyKt.RN_CONTAINER_UI_ENABLE, "tradeEnable", "baseTransferInEnable", "quoteTransferInEnable", "pnlPrecision", "(Ljava/lang/String;Ljava/lang/String;JJJLjava/lang/String;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZLjava/lang/Long;)V", "getAutoRenewMaxDebtRatio", "()Ljava/lang/String;", "getBaseBorrowCoefficient", "getBaseBorrowEnable", "()Z", "getBaseMarginCoefficient", "getBaseMaxBorrowAmount", "getBaseMaxBuyAmount", "getBaseTransferInEnable", "getBorrowBufferRatio", "getDefaultLeverage", "()J", "getEnable", "getFlDebtRatio", "getFlWarnDebtRatio", "getMaxLeverage", "getPnlPrecision", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getQuoteBorrowCoefficient", "getQuoteBorrowEnable", "getQuoteMarginCoefficient", "getQuoteMaxBorrowAmount", "getQuoteMaxBuyAmount", "getQuoteTransferInEnable", "getRemindDebtRatio", "getRiskGrade", "getRiskLeverage", "getSymbol", "getTradeEnable", "getTransferOutBufferRatio", "getTransferOutMaxDebtRatio", "getWarnDebtRatio", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;JJJLjava/lang/String;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZLjava/lang/Long;)Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiTradeIsolatedMarginConfig;", "equals", "other", "hashCode", "", "toString", "KcProtocol_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final /* data */ class KCJSApiTradeIsolatedMarginConfig {

    @NotNull
    private final String autoRenewMaxDebtRatio;

    @NotNull
    private final String baseBorrowCoefficient;
    private final boolean baseBorrowEnable;

    @NotNull
    private final String baseMarginCoefficient;

    @NotNull
    private final String baseMaxBorrowAmount;

    @NotNull
    private final String baseMaxBuyAmount;
    private final boolean baseTransferInEnable;

    @NotNull
    private final String borrowBufferRatio;
    private final long defaultLeverage;
    private final boolean enable;

    @NotNull
    private final String flDebtRatio;

    @NotNull
    private final String flWarnDebtRatio;
    private final long maxLeverage;

    @Nullable
    private final Long pnlPrecision;

    @NotNull
    private final String quoteBorrowCoefficient;
    private final boolean quoteBorrowEnable;

    @NotNull
    private final String quoteMarginCoefficient;

    @NotNull
    private final String quoteMaxBorrowAmount;

    @NotNull
    private final String quoteMaxBuyAmount;
    private final boolean quoteTransferInEnable;

    @NotNull
    private final String remindDebtRatio;

    @NotNull
    private final String riskGrade;
    private final long riskLeverage;

    @NotNull
    private final String symbol;
    private final boolean tradeEnable;

    @NotNull
    private final String transferOutBufferRatio;

    @NotNull
    private final String transferOutMaxDebtRatio;

    @NotNull
    private final String warnDebtRatio;

    public KCJSApiTradeIsolatedMarginConfig(@NotNull String symbol, @NotNull String flDebtRatio, long j11, long j12, long j13, @NotNull String riskGrade, boolean z11, boolean z12, @NotNull String baseMaxBorrowAmount, @NotNull String quoteMaxBorrowAmount, @NotNull String autoRenewMaxDebtRatio, @NotNull String baseMaxBuyAmount, @NotNull String quoteMaxBuyAmount, @NotNull String borrowBufferRatio, @NotNull String remindDebtRatio, @NotNull String warnDebtRatio, @NotNull String flWarnDebtRatio, @NotNull String transferOutMaxDebtRatio, @NotNull String transferOutBufferRatio, @NotNull String baseBorrowCoefficient, @NotNull String quoteBorrowCoefficient, @NotNull String baseMarginCoefficient, @NotNull String quoteMarginCoefficient, boolean z13, boolean z14, boolean z15, boolean z16, @Nullable Long l11) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(flDebtRatio, "flDebtRatio");
        Intrinsics.checkNotNullParameter(riskGrade, "riskGrade");
        Intrinsics.checkNotNullParameter(baseMaxBorrowAmount, "baseMaxBorrowAmount");
        Intrinsics.checkNotNullParameter(quoteMaxBorrowAmount, "quoteMaxBorrowAmount");
        Intrinsics.checkNotNullParameter(autoRenewMaxDebtRatio, "autoRenewMaxDebtRatio");
        Intrinsics.checkNotNullParameter(baseMaxBuyAmount, "baseMaxBuyAmount");
        Intrinsics.checkNotNullParameter(quoteMaxBuyAmount, "quoteMaxBuyAmount");
        Intrinsics.checkNotNullParameter(borrowBufferRatio, "borrowBufferRatio");
        Intrinsics.checkNotNullParameter(remindDebtRatio, "remindDebtRatio");
        Intrinsics.checkNotNullParameter(warnDebtRatio, "warnDebtRatio");
        Intrinsics.checkNotNullParameter(flWarnDebtRatio, "flWarnDebtRatio");
        Intrinsics.checkNotNullParameter(transferOutMaxDebtRatio, "transferOutMaxDebtRatio");
        Intrinsics.checkNotNullParameter(transferOutBufferRatio, "transferOutBufferRatio");
        Intrinsics.checkNotNullParameter(baseBorrowCoefficient, "baseBorrowCoefficient");
        Intrinsics.checkNotNullParameter(quoteBorrowCoefficient, "quoteBorrowCoefficient");
        Intrinsics.checkNotNullParameter(baseMarginCoefficient, "baseMarginCoefficient");
        Intrinsics.checkNotNullParameter(quoteMarginCoefficient, "quoteMarginCoefficient");
        this.symbol = symbol;
        this.flDebtRatio = flDebtRatio;
        this.defaultLeverage = j11;
        this.maxLeverage = j12;
        this.riskLeverage = j13;
        this.riskGrade = riskGrade;
        this.baseBorrowEnable = z11;
        this.quoteBorrowEnable = z12;
        this.baseMaxBorrowAmount = baseMaxBorrowAmount;
        this.quoteMaxBorrowAmount = quoteMaxBorrowAmount;
        this.autoRenewMaxDebtRatio = autoRenewMaxDebtRatio;
        this.baseMaxBuyAmount = baseMaxBuyAmount;
        this.quoteMaxBuyAmount = quoteMaxBuyAmount;
        this.borrowBufferRatio = borrowBufferRatio;
        this.remindDebtRatio = remindDebtRatio;
        this.warnDebtRatio = warnDebtRatio;
        this.flWarnDebtRatio = flWarnDebtRatio;
        this.transferOutMaxDebtRatio = transferOutMaxDebtRatio;
        this.transferOutBufferRatio = transferOutBufferRatio;
        this.baseBorrowCoefficient = baseBorrowCoefficient;
        this.quoteBorrowCoefficient = quoteBorrowCoefficient;
        this.baseMarginCoefficient = baseMarginCoefficient;
        this.quoteMarginCoefficient = quoteMarginCoefficient;
        this.enable = z13;
        this.tradeEnable = z14;
        this.baseTransferInEnable = z15;
        this.quoteTransferInEnable = z16;
        this.pnlPrecision = l11;
    }

    public static /* synthetic */ KCJSApiTradeIsolatedMarginConfig copy$default(KCJSApiTradeIsolatedMarginConfig kCJSApiTradeIsolatedMarginConfig, String str, String str2, long j11, long j12, long j13, String str3, boolean z11, boolean z12, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, boolean z13, boolean z14, boolean z15, boolean z16, Long l11, int i11, Object obj) {
        Long l12;
        boolean z17;
        String str19 = (i11 & 1) != 0 ? kCJSApiTradeIsolatedMarginConfig.symbol : str;
        String str20 = (i11 & 2) != 0 ? kCJSApiTradeIsolatedMarginConfig.flDebtRatio : str2;
        long j14 = (i11 & 4) != 0 ? kCJSApiTradeIsolatedMarginConfig.defaultLeverage : j11;
        long j15 = (i11 & 8) != 0 ? kCJSApiTradeIsolatedMarginConfig.maxLeverage : j12;
        long j16 = (i11 & 16) != 0 ? kCJSApiTradeIsolatedMarginConfig.riskLeverage : j13;
        String str21 = (i11 & 32) != 0 ? kCJSApiTradeIsolatedMarginConfig.riskGrade : str3;
        boolean z18 = (i11 & 64) != 0 ? kCJSApiTradeIsolatedMarginConfig.baseBorrowEnable : z11;
        boolean z19 = (i11 & 128) != 0 ? kCJSApiTradeIsolatedMarginConfig.quoteBorrowEnable : z12;
        String str22 = (i11 & 256) != 0 ? kCJSApiTradeIsolatedMarginConfig.baseMaxBorrowAmount : str4;
        String str23 = (i11 & 512) != 0 ? kCJSApiTradeIsolatedMarginConfig.quoteMaxBorrowAmount : str5;
        String str24 = (i11 & 1024) != 0 ? kCJSApiTradeIsolatedMarginConfig.autoRenewMaxDebtRatio : str6;
        String str25 = str19;
        String str26 = (i11 & 2048) != 0 ? kCJSApiTradeIsolatedMarginConfig.baseMaxBuyAmount : str7;
        String str27 = (i11 & 4096) != 0 ? kCJSApiTradeIsolatedMarginConfig.quoteMaxBuyAmount : str8;
        String str28 = (i11 & 8192) != 0 ? kCJSApiTradeIsolatedMarginConfig.borrowBufferRatio : str9;
        String str29 = (i11 & 16384) != 0 ? kCJSApiTradeIsolatedMarginConfig.remindDebtRatio : str10;
        String str30 = (i11 & 32768) != 0 ? kCJSApiTradeIsolatedMarginConfig.warnDebtRatio : str11;
        String str31 = (i11 & 65536) != 0 ? kCJSApiTradeIsolatedMarginConfig.flWarnDebtRatio : str12;
        String str32 = (i11 & 131072) != 0 ? kCJSApiTradeIsolatedMarginConfig.transferOutMaxDebtRatio : str13;
        String str33 = (i11 & 262144) != 0 ? kCJSApiTradeIsolatedMarginConfig.transferOutBufferRatio : str14;
        String str34 = (i11 & 524288) != 0 ? kCJSApiTradeIsolatedMarginConfig.baseBorrowCoefficient : str15;
        String str35 = (i11 & 1048576) != 0 ? kCJSApiTradeIsolatedMarginConfig.quoteBorrowCoefficient : str16;
        String str36 = (i11 & 2097152) != 0 ? kCJSApiTradeIsolatedMarginConfig.baseMarginCoefficient : str17;
        String str37 = (i11 & 4194304) != 0 ? kCJSApiTradeIsolatedMarginConfig.quoteMarginCoefficient : str18;
        boolean z21 = (i11 & 8388608) != 0 ? kCJSApiTradeIsolatedMarginConfig.enable : z13;
        boolean z22 = (i11 & 16777216) != 0 ? kCJSApiTradeIsolatedMarginConfig.tradeEnable : z14;
        boolean z23 = (i11 & 33554432) != 0 ? kCJSApiTradeIsolatedMarginConfig.baseTransferInEnable : z15;
        boolean z24 = (i11 & 67108864) != 0 ? kCJSApiTradeIsolatedMarginConfig.quoteTransferInEnable : z16;
        if ((i11 & C2711C.BUFFER_FLAG_FIRST_SAMPLE) != 0) {
            z17 = z24;
            l12 = kCJSApiTradeIsolatedMarginConfig.pnlPrecision;
        } else {
            l12 = l11;
            z17 = z24;
        }
        return kCJSApiTradeIsolatedMarginConfig.copy(str25, str20, j14, j15, j16, str21, z18, z19, str22, str23, str24, str26, str27, str28, str29, str30, str31, str32, str33, str34, str35, str36, str37, z21, z22, z23, z17, l12);
    }

    @NotNull
    public final KCJSApiTradeIsolatedMarginConfig copy(@NotNull String symbol, @NotNull String flDebtRatio, long defaultLeverage, long maxLeverage, long riskLeverage, @NotNull String riskGrade, boolean baseBorrowEnable, boolean quoteBorrowEnable, @NotNull String baseMaxBorrowAmount, @NotNull String quoteMaxBorrowAmount, @NotNull String autoRenewMaxDebtRatio, @NotNull String baseMaxBuyAmount, @NotNull String quoteMaxBuyAmount, @NotNull String borrowBufferRatio, @NotNull String remindDebtRatio, @NotNull String warnDebtRatio, @NotNull String flWarnDebtRatio, @NotNull String transferOutMaxDebtRatio, @NotNull String transferOutBufferRatio, @NotNull String baseBorrowCoefficient, @NotNull String quoteBorrowCoefficient, @NotNull String baseMarginCoefficient, @NotNull String quoteMarginCoefficient, boolean enable, boolean tradeEnable, boolean baseTransferInEnable, boolean quoteTransferInEnable, @Nullable Long pnlPrecision) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(flDebtRatio, "flDebtRatio");
        Intrinsics.checkNotNullParameter(riskGrade, "riskGrade");
        Intrinsics.checkNotNullParameter(baseMaxBorrowAmount, "baseMaxBorrowAmount");
        Intrinsics.checkNotNullParameter(quoteMaxBorrowAmount, "quoteMaxBorrowAmount");
        Intrinsics.checkNotNullParameter(autoRenewMaxDebtRatio, "autoRenewMaxDebtRatio");
        Intrinsics.checkNotNullParameter(baseMaxBuyAmount, "baseMaxBuyAmount");
        Intrinsics.checkNotNullParameter(quoteMaxBuyAmount, "quoteMaxBuyAmount");
        Intrinsics.checkNotNullParameter(borrowBufferRatio, "borrowBufferRatio");
        Intrinsics.checkNotNullParameter(remindDebtRatio, "remindDebtRatio");
        Intrinsics.checkNotNullParameter(warnDebtRatio, "warnDebtRatio");
        Intrinsics.checkNotNullParameter(flWarnDebtRatio, "flWarnDebtRatio");
        Intrinsics.checkNotNullParameter(transferOutMaxDebtRatio, "transferOutMaxDebtRatio");
        Intrinsics.checkNotNullParameter(transferOutBufferRatio, "transferOutBufferRatio");
        Intrinsics.checkNotNullParameter(baseBorrowCoefficient, "baseBorrowCoefficient");
        Intrinsics.checkNotNullParameter(quoteBorrowCoefficient, "quoteBorrowCoefficient");
        Intrinsics.checkNotNullParameter(baseMarginCoefficient, "baseMarginCoefficient");
        Intrinsics.checkNotNullParameter(quoteMarginCoefficient, "quoteMarginCoefficient");
        return new KCJSApiTradeIsolatedMarginConfig(symbol, flDebtRatio, defaultLeverage, maxLeverage, riskLeverage, riskGrade, baseBorrowEnable, quoteBorrowEnable, baseMaxBorrowAmount, quoteMaxBorrowAmount, autoRenewMaxDebtRatio, baseMaxBuyAmount, quoteMaxBuyAmount, borrowBufferRatio, remindDebtRatio, warnDebtRatio, flWarnDebtRatio, transferOutMaxDebtRatio, transferOutBufferRatio, baseBorrowCoefficient, quoteBorrowCoefficient, baseMarginCoefficient, quoteMarginCoefficient, enable, tradeEnable, baseTransferInEnable, quoteTransferInEnable, pnlPrecision);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KCJSApiTradeIsolatedMarginConfig)) {
            return false;
        }
        KCJSApiTradeIsolatedMarginConfig kCJSApiTradeIsolatedMarginConfig = (KCJSApiTradeIsolatedMarginConfig) other;
        return Intrinsics.areEqual(this.symbol, kCJSApiTradeIsolatedMarginConfig.symbol) && Intrinsics.areEqual(this.flDebtRatio, kCJSApiTradeIsolatedMarginConfig.flDebtRatio) && this.defaultLeverage == kCJSApiTradeIsolatedMarginConfig.defaultLeverage && this.maxLeverage == kCJSApiTradeIsolatedMarginConfig.maxLeverage && this.riskLeverage == kCJSApiTradeIsolatedMarginConfig.riskLeverage && Intrinsics.areEqual(this.riskGrade, kCJSApiTradeIsolatedMarginConfig.riskGrade) && this.baseBorrowEnable == kCJSApiTradeIsolatedMarginConfig.baseBorrowEnable && this.quoteBorrowEnable == kCJSApiTradeIsolatedMarginConfig.quoteBorrowEnable && Intrinsics.areEqual(this.baseMaxBorrowAmount, kCJSApiTradeIsolatedMarginConfig.baseMaxBorrowAmount) && Intrinsics.areEqual(this.quoteMaxBorrowAmount, kCJSApiTradeIsolatedMarginConfig.quoteMaxBorrowAmount) && Intrinsics.areEqual(this.autoRenewMaxDebtRatio, kCJSApiTradeIsolatedMarginConfig.autoRenewMaxDebtRatio) && Intrinsics.areEqual(this.baseMaxBuyAmount, kCJSApiTradeIsolatedMarginConfig.baseMaxBuyAmount) && Intrinsics.areEqual(this.quoteMaxBuyAmount, kCJSApiTradeIsolatedMarginConfig.quoteMaxBuyAmount) && Intrinsics.areEqual(this.borrowBufferRatio, kCJSApiTradeIsolatedMarginConfig.borrowBufferRatio) && Intrinsics.areEqual(this.remindDebtRatio, kCJSApiTradeIsolatedMarginConfig.remindDebtRatio) && Intrinsics.areEqual(this.warnDebtRatio, kCJSApiTradeIsolatedMarginConfig.warnDebtRatio) && Intrinsics.areEqual(this.flWarnDebtRatio, kCJSApiTradeIsolatedMarginConfig.flWarnDebtRatio) && Intrinsics.areEqual(this.transferOutMaxDebtRatio, kCJSApiTradeIsolatedMarginConfig.transferOutMaxDebtRatio) && Intrinsics.areEqual(this.transferOutBufferRatio, kCJSApiTradeIsolatedMarginConfig.transferOutBufferRatio) && Intrinsics.areEqual(this.baseBorrowCoefficient, kCJSApiTradeIsolatedMarginConfig.baseBorrowCoefficient) && Intrinsics.areEqual(this.quoteBorrowCoefficient, kCJSApiTradeIsolatedMarginConfig.quoteBorrowCoefficient) && Intrinsics.areEqual(this.baseMarginCoefficient, kCJSApiTradeIsolatedMarginConfig.baseMarginCoefficient) && Intrinsics.areEqual(this.quoteMarginCoefficient, kCJSApiTradeIsolatedMarginConfig.quoteMarginCoefficient) && this.enable == kCJSApiTradeIsolatedMarginConfig.enable && this.tradeEnable == kCJSApiTradeIsolatedMarginConfig.tradeEnable && this.baseTransferInEnable == kCJSApiTradeIsolatedMarginConfig.baseTransferInEnable && this.quoteTransferInEnable == kCJSApiTradeIsolatedMarginConfig.quoteTransferInEnable && Intrinsics.areEqual(this.pnlPrecision, kCJSApiTradeIsolatedMarginConfig.pnlPrecision);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    @NotNull
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getQuoteMaxBorrowAmount() {
        return this.quoteMaxBorrowAmount;
    }

    @NotNull
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getAutoRenewMaxDebtRatio() {
        return this.autoRenewMaxDebtRatio;
    }

    @NotNull
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getBaseMaxBuyAmount() {
        return this.baseMaxBuyAmount;
    }

    @NotNull
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getQuoteMaxBuyAmount() {
        return this.quoteMaxBuyAmount;
    }

    @NotNull
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getBorrowBufferRatio() {
        return this.borrowBufferRatio;
    }

    @NotNull
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getRemindDebtRatio() {
        return this.remindDebtRatio;
    }

    @NotNull
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getWarnDebtRatio() {
        return this.warnDebtRatio;
    }

    @NotNull
    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getFlWarnDebtRatio() {
        return this.flWarnDebtRatio;
    }

    @NotNull
    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getTransferOutMaxDebtRatio() {
        return this.transferOutMaxDebtRatio;
    }

    @NotNull
    /* JADX INFO: renamed from: component19, reason: from getter */
    public final String getTransferOutBufferRatio() {
        return this.transferOutBufferRatio;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getFlDebtRatio() {
        return this.flDebtRatio;
    }

    @NotNull
    /* JADX INFO: renamed from: component20, reason: from getter */
    public final String getBaseBorrowCoefficient() {
        return this.baseBorrowCoefficient;
    }

    @NotNull
    /* JADX INFO: renamed from: component21, reason: from getter */
    public final String getQuoteBorrowCoefficient() {
        return this.quoteBorrowCoefficient;
    }

    @NotNull
    /* JADX INFO: renamed from: component22, reason: from getter */
    public final String getBaseMarginCoefficient() {
        return this.baseMarginCoefficient;
    }

    @NotNull
    /* JADX INFO: renamed from: component23, reason: from getter */
    public final String getQuoteMarginCoefficient() {
        return this.quoteMarginCoefficient;
    }

    /* JADX INFO: renamed from: component24, reason: from getter */
    public final boolean getEnable() {
        return this.enable;
    }

    /* JADX INFO: renamed from: component25, reason: from getter */
    public final boolean getTradeEnable() {
        return this.tradeEnable;
    }

    /* JADX INFO: renamed from: component26, reason: from getter */
    public final boolean getBaseTransferInEnable() {
        return this.baseTransferInEnable;
    }

    /* JADX INFO: renamed from: component27, reason: from getter */
    public final boolean getQuoteTransferInEnable() {
        return this.quoteTransferInEnable;
    }

    @Nullable
    /* JADX INFO: renamed from: component28, reason: from getter */
    public final Long getPnlPrecision() {
        return this.pnlPrecision;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getDefaultLeverage() {
        return this.defaultLeverage;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getMaxLeverage() {
        return this.maxLeverage;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getRiskLeverage() {
        return this.riskLeverage;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getRiskGrade() {
        return this.riskGrade;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getBaseBorrowEnable() {
        return this.baseBorrowEnable;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getQuoteBorrowEnable() {
        return this.quoteBorrowEnable;
    }

    @NotNull
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getBaseMaxBorrowAmount() {
        return this.baseMaxBorrowAmount;
    }

    @NotNull
    public final String getAutoRenewMaxDebtRatio() {
        return this.autoRenewMaxDebtRatio;
    }

    @NotNull
    public final String getBaseBorrowCoefficient() {
        return this.baseBorrowCoefficient;
    }

    public final boolean getBaseBorrowEnable() {
        return this.baseBorrowEnable;
    }

    @NotNull
    public final String getBaseMarginCoefficient() {
        return this.baseMarginCoefficient;
    }

    @NotNull
    public final String getBaseMaxBorrowAmount() {
        return this.baseMaxBorrowAmount;
    }

    @NotNull
    public final String getBaseMaxBuyAmount() {
        return this.baseMaxBuyAmount;
    }

    public final boolean getBaseTransferInEnable() {
        return this.baseTransferInEnable;
    }

    @NotNull
    public final String getBorrowBufferRatio() {
        return this.borrowBufferRatio;
    }

    public final long getDefaultLeverage() {
        return this.defaultLeverage;
    }

    public final boolean getEnable() {
        return this.enable;
    }

    @NotNull
    public final String getFlDebtRatio() {
        return this.flDebtRatio;
    }

    @NotNull
    public final String getFlWarnDebtRatio() {
        return this.flWarnDebtRatio;
    }

    public final long getMaxLeverage() {
        return this.maxLeverage;
    }

    @Nullable
    public final Long getPnlPrecision() {
        return this.pnlPrecision;
    }

    @NotNull
    public final String getQuoteBorrowCoefficient() {
        return this.quoteBorrowCoefficient;
    }

    public final boolean getQuoteBorrowEnable() {
        return this.quoteBorrowEnable;
    }

    @NotNull
    public final String getQuoteMarginCoefficient() {
        return this.quoteMarginCoefficient;
    }

    @NotNull
    public final String getQuoteMaxBorrowAmount() {
        return this.quoteMaxBorrowAmount;
    }

    @NotNull
    public final String getQuoteMaxBuyAmount() {
        return this.quoteMaxBuyAmount;
    }

    public final boolean getQuoteTransferInEnable() {
        return this.quoteTransferInEnable;
    }

    @NotNull
    public final String getRemindDebtRatio() {
        return this.remindDebtRatio;
    }

    @NotNull
    public final String getRiskGrade() {
        return this.riskGrade;
    }

    public final long getRiskLeverage() {
        return this.riskLeverage;
    }

    @NotNull
    public final String getSymbol() {
        return this.symbol;
    }

    public final boolean getTradeEnable() {
        return this.tradeEnable;
    }

    @NotNull
    public final String getTransferOutBufferRatio() {
        return this.transferOutBufferRatio;
    }

    @NotNull
    public final String getTransferOutMaxDebtRatio() {
        return this.transferOutMaxDebtRatio;
    }

    @NotNull
    public final String getWarnDebtRatio() {
        return this.warnDebtRatio;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [int] */
    /* JADX WARN: Type inference failed for: r0v15, types: [int] */
    /* JADX WARN: Type inference failed for: r0v47, types: [int] */
    /* JADX WARN: Type inference failed for: r0v49, types: [int] */
    /* JADX WARN: Type inference failed for: r0v51, types: [int] */
    /* JADX WARN: Type inference failed for: r0v53, types: [int] */
    /* JADX WARN: Type inference failed for: r1v11, types: [int] */
    /* JADX WARN: Type inference failed for: r1v13, types: [int] */
    /* JADX WARN: Type inference failed for: r1v45, types: [int] */
    /* JADX WARN: Type inference failed for: r1v47, types: [int] */
    /* JADX WARN: Type inference failed for: r1v49, types: [int] */
    /* JADX WARN: Type inference failed for: r1v55 */
    /* JADX WARN: Type inference failed for: r1v56 */
    /* JADX WARN: Type inference failed for: r1v57 */
    /* JADX WARN: Type inference failed for: r1v58 */
    /* JADX WARN: Type inference failed for: r1v59 */
    /* JADX WARN: Type inference failed for: r1v60 */
    /* JADX WARN: Type inference failed for: r1v61 */
    /* JADX WARN: Type inference failed for: r1v62 */
    /* JADX WARN: Type inference failed for: r1v63 */
    /* JADX WARN: Type inference failed for: r1v64 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public int hashCode() {
        int iHashCode = ((((((((((this.symbol.hashCode() * 31) + this.flDebtRatio.hashCode()) * 31) + Long.hashCode(this.defaultLeverage)) * 31) + Long.hashCode(this.maxLeverage)) * 31) + Long.hashCode(this.riskLeverage)) * 31) + this.riskGrade.hashCode()) * 31;
        boolean z11 = this.baseBorrowEnable;
        ?? r11 = z11;
        if (z11) {
            r11 = 1;
        }
        int i11 = (iHashCode + r11) * 31;
        boolean z12 = this.quoteBorrowEnable;
        ?? r12 = z12;
        if (z12) {
            r12 = 1;
        }
        int iHashCode2 = (((((((((((((((((((((((((((((((i11 + r12) * 31) + this.baseMaxBorrowAmount.hashCode()) * 31) + this.quoteMaxBorrowAmount.hashCode()) * 31) + this.autoRenewMaxDebtRatio.hashCode()) * 31) + this.baseMaxBuyAmount.hashCode()) * 31) + this.quoteMaxBuyAmount.hashCode()) * 31) + this.borrowBufferRatio.hashCode()) * 31) + this.remindDebtRatio.hashCode()) * 31) + this.warnDebtRatio.hashCode()) * 31) + this.flWarnDebtRatio.hashCode()) * 31) + this.transferOutMaxDebtRatio.hashCode()) * 31) + this.transferOutBufferRatio.hashCode()) * 31) + this.baseBorrowCoefficient.hashCode()) * 31) + this.quoteBorrowCoefficient.hashCode()) * 31) + this.baseMarginCoefficient.hashCode()) * 31) + this.quoteMarginCoefficient.hashCode()) * 31;
        boolean z13 = this.enable;
        ?? r13 = z13;
        if (z13) {
            r13 = 1;
        }
        int i12 = (iHashCode2 + r13) * 31;
        boolean z14 = this.tradeEnable;
        ?? r14 = z14;
        if (z14) {
            r14 = 1;
        }
        int i13 = (i12 + r14) * 31;
        boolean z15 = this.baseTransferInEnable;
        ?? r15 = z15;
        if (z15) {
            r15 = 1;
        }
        int i14 = (i13 + r15) * 31;
        boolean z16 = this.quoteTransferInEnable;
        int i15 = (i14 + (z16 ? 1 : z16)) * 31;
        Long l11 = this.pnlPrecision;
        return i15 + (l11 == null ? 0 : l11.hashCode());
    }

    @NotNull
    public String toString() {
        return "KCJSApiTradeIsolatedMarginConfig(symbol=" + this.symbol + ", flDebtRatio=" + this.flDebtRatio + ", defaultLeverage=" + this.defaultLeverage + ", maxLeverage=" + this.maxLeverage + ", riskLeverage=" + this.riskLeverage + ", riskGrade=" + this.riskGrade + ", baseBorrowEnable=" + this.baseBorrowEnable + ", quoteBorrowEnable=" + this.quoteBorrowEnable + ", baseMaxBorrowAmount=" + this.baseMaxBorrowAmount + ", quoteMaxBorrowAmount=" + this.quoteMaxBorrowAmount + ", autoRenewMaxDebtRatio=" + this.autoRenewMaxDebtRatio + ", baseMaxBuyAmount=" + this.baseMaxBuyAmount + ", quoteMaxBuyAmount=" + this.quoteMaxBuyAmount + ", borrowBufferRatio=" + this.borrowBufferRatio + ", remindDebtRatio=" + this.remindDebtRatio + ", warnDebtRatio=" + this.warnDebtRatio + ", flWarnDebtRatio=" + this.flWarnDebtRatio + ", transferOutMaxDebtRatio=" + this.transferOutMaxDebtRatio + ", transferOutBufferRatio=" + this.transferOutBufferRatio + ", baseBorrowCoefficient=" + this.baseBorrowCoefficient + ", quoteBorrowCoefficient=" + this.quoteBorrowCoefficient + ", baseMarginCoefficient=" + this.baseMarginCoefficient + ", quoteMarginCoefficient=" + this.quoteMarginCoefficient + ", enable=" + this.enable + ", tradeEnable=" + this.tradeEnable + ", baseTransferInEnable=" + this.baseTransferInEnable + ", quoteTransferInEnable=" + this.quoteTransferInEnable + ", pnlPrecision=" + this.pnlPrecision + ')';
    }
}
