package com.kubi.p110rn.core.turbo;

import androidx.media3.common.C2711C;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.kubi.p110rn.modules.BridgeParamKeyKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: NativeTradeTurboModule.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b8\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B×\u0002\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\f¢\u0006\u0004\b!\u0010\"J\b\u0010D\u001a\u00020EH\u0016J\u000b\u0010F\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010H\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010'J\u0010\u0010I\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010'J\u0010\u0010J\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010'J\u0010\u0010K\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010'J\u000b\u0010L\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010M\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010.J\u0010\u0010N\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010.J\u000b\u0010O\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010R\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010S\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010T\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010U\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010V\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010W\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010X\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010Y\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010Z\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010[\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\\\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010]\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010^\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010.J\u0010\u0010_\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010.J\u0010\u0010`\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010.J\u0010\u0010a\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010.JÞ\u0002\u0010b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0002\u0010cJ\u0013\u0010d\u001a\u00020\f2\b\u0010e\u001a\u0004\u0018\u00010fHÖ\u0003J\t\u0010g\u001a\u00020hHÖ\u0001J\t\u0010i\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010$R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010(\u001a\u0004\b&\u0010'R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010(\u001a\u0004\b)\u0010'R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010(\u001a\u0004\b*\u0010'R\u0015\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010(\u001a\u0004\b+\u0010'R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010$R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010/\u001a\u0004\b-\u0010.R\u0015\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010/\u001a\u0004\b0\u0010.R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b1\u0010$R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b2\u0010$R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b3\u0010$R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b4\u0010$R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b5\u0010$R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b6\u0010$R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b7\u0010$R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b8\u0010$R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b9\u0010$R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b:\u0010$R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b;\u0010$R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b<\u0010$R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b=\u0010$R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b>\u0010$R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b?\u0010$R\u0015\u0010\u001d\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010/\u001a\u0004\b@\u0010.R\u0015\u0010\u001e\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010/\u001a\u0004\bA\u0010.R\u0015\u0010\u001f\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010/\u001a\u0004\bB\u0010.R\u0015\u0010 \u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010/\u001a\u0004\bC\u0010.¨\u0006j"}, m90084d2 = {"Lcom/kubi/rn/core/turbo/IsolatedMarginConfig;", "Lcom/kubi/rn/core/turbo/WritableMapSerializable;", "symbol", "", "flDebtRatio", "defaultLeverage", "", "maxLeverage", "riskLeverage", "pnlPrecision", "riskGrade", "baseBorrowEnable", "", "quoteBorrowEnable", "baseMaxBorrowAmount", "quoteMaxBorrowAmount", "autoRenewMaxDebtRatio", "baseMaxBuyAmount", "quoteMaxBuyAmount", "borrowBufferRatio", "remindDebtRatio", "warnDebtRatio", "flWarnDebtRatio", "transferOutMaxDebtRatio", "transferOutBufferRatio", "baseBorrowCoefficient", "quoteBorrowCoefficient", "baseMarginCoefficient", "quoteMarginCoefficient", BridgeParamKeyKt.RN_CONTAINER_UI_ENABLE, "tradeEnable", "baseTransferInEnable", "quoteTransferInEnable", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getSymbol", "()Ljava/lang/String;", "getFlDebtRatio", "getDefaultLeverage", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getMaxLeverage", "getRiskLeverage", "getPnlPrecision", "getRiskGrade", "getBaseBorrowEnable", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getQuoteBorrowEnable", "getBaseMaxBorrowAmount", "getQuoteMaxBorrowAmount", "getAutoRenewMaxDebtRatio", "getBaseMaxBuyAmount", "getQuoteMaxBuyAmount", "getBorrowBufferRatio", "getRemindDebtRatio", "getWarnDebtRatio", "getFlWarnDebtRatio", "getTransferOutMaxDebtRatio", "getTransferOutBufferRatio", "getBaseBorrowCoefficient", "getQuoteBorrowCoefficient", "getBaseMarginCoefficient", "getQuoteMarginCoefficient", "getEnable", "getTradeEnable", "getBaseTransferInEnable", "getQuoteTransferInEnable", "toWritableMap", "Lcom/facebook/react/bridge/WritableMap;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/kubi/rn/core/turbo/IsolatedMarginConfig;", "equals", "other", "", "hashCode", "", "toString", "app_modules_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nNativeTradeTurboModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NativeTradeTurboModule.kt\ncom/kubi/rn/core/turbo/IsolatedMarginConfig\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,385:1\n1#2:386\n*E\n"})
public final /* data */ class IsolatedMarginConfig implements WritableMapSerializable {

    @Nullable
    private final String autoRenewMaxDebtRatio;

    @Nullable
    private final String baseBorrowCoefficient;

    @Nullable
    private final Boolean baseBorrowEnable;

    @Nullable
    private final String baseMarginCoefficient;

    @Nullable
    private final String baseMaxBorrowAmount;

    @Nullable
    private final String baseMaxBuyAmount;

    @Nullable
    private final Boolean baseTransferInEnable;

    @Nullable
    private final String borrowBufferRatio;

    @Nullable
    private final Double defaultLeverage;

    @Nullable
    private final Boolean enable;

    @Nullable
    private final String flDebtRatio;

    @Nullable
    private final String flWarnDebtRatio;

    @Nullable
    private final Double maxLeverage;

    @Nullable
    private final Double pnlPrecision;

    @Nullable
    private final String quoteBorrowCoefficient;

    @Nullable
    private final Boolean quoteBorrowEnable;

    @Nullable
    private final String quoteMarginCoefficient;

    @Nullable
    private final String quoteMaxBorrowAmount;

    @Nullable
    private final String quoteMaxBuyAmount;

    @Nullable
    private final Boolean quoteTransferInEnable;

    @Nullable
    private final String remindDebtRatio;

    @Nullable
    private final String riskGrade;

    @Nullable
    private final Double riskLeverage;

    @Nullable
    private final String symbol;

    @Nullable
    private final Boolean tradeEnable;

    @Nullable
    private final String transferOutBufferRatio;

    @Nullable
    private final String transferOutMaxDebtRatio;

    @Nullable
    private final String warnDebtRatio;

    public IsolatedMarginConfig() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 268435455, null);
    }

    public static /* synthetic */ IsolatedMarginConfig copy$default(IsolatedMarginConfig isolatedMarginConfig, String str, String str2, Double d11, Double d12, Double d13, Double d14, String str3, Boolean bool, Boolean bool2, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, int i11, Object obj) {
        Boolean bool7;
        Boolean bool8;
        String str19 = (i11 & 1) != 0 ? isolatedMarginConfig.symbol : str;
        String str20 = (i11 & 2) != 0 ? isolatedMarginConfig.flDebtRatio : str2;
        Double d15 = (i11 & 4) != 0 ? isolatedMarginConfig.defaultLeverage : d11;
        Double d16 = (i11 & 8) != 0 ? isolatedMarginConfig.maxLeverage : d12;
        Double d17 = (i11 & 16) != 0 ? isolatedMarginConfig.riskLeverage : d13;
        Double d18 = (i11 & 32) != 0 ? isolatedMarginConfig.pnlPrecision : d14;
        String str21 = (i11 & 64) != 0 ? isolatedMarginConfig.riskGrade : str3;
        Boolean bool9 = (i11 & 128) != 0 ? isolatedMarginConfig.baseBorrowEnable : bool;
        Boolean bool10 = (i11 & 256) != 0 ? isolatedMarginConfig.quoteBorrowEnable : bool2;
        String str22 = (i11 & 512) != 0 ? isolatedMarginConfig.baseMaxBorrowAmount : str4;
        String str23 = (i11 & 1024) != 0 ? isolatedMarginConfig.quoteMaxBorrowAmount : str5;
        String str24 = (i11 & 2048) != 0 ? isolatedMarginConfig.autoRenewMaxDebtRatio : str6;
        String str25 = (i11 & 4096) != 0 ? isolatedMarginConfig.baseMaxBuyAmount : str7;
        String str26 = (i11 & 8192) != 0 ? isolatedMarginConfig.quoteMaxBuyAmount : str8;
        String str27 = str19;
        String str28 = (i11 & 16384) != 0 ? isolatedMarginConfig.borrowBufferRatio : str9;
        String str29 = (i11 & 32768) != 0 ? isolatedMarginConfig.remindDebtRatio : str10;
        String str30 = (i11 & 65536) != 0 ? isolatedMarginConfig.warnDebtRatio : str11;
        String str31 = (i11 & 131072) != 0 ? isolatedMarginConfig.flWarnDebtRatio : str12;
        String str32 = (i11 & 262144) != 0 ? isolatedMarginConfig.transferOutMaxDebtRatio : str13;
        String str33 = (i11 & 524288) != 0 ? isolatedMarginConfig.transferOutBufferRatio : str14;
        String str34 = (i11 & 1048576) != 0 ? isolatedMarginConfig.baseBorrowCoefficient : str15;
        String str35 = (i11 & 2097152) != 0 ? isolatedMarginConfig.quoteBorrowCoefficient : str16;
        String str36 = (i11 & 4194304) != 0 ? isolatedMarginConfig.baseMarginCoefficient : str17;
        String str37 = (i11 & 8388608) != 0 ? isolatedMarginConfig.quoteMarginCoefficient : str18;
        Boolean bool11 = (i11 & 16777216) != 0 ? isolatedMarginConfig.enable : bool3;
        Boolean bool12 = (i11 & 33554432) != 0 ? isolatedMarginConfig.tradeEnable : bool4;
        Boolean bool13 = (i11 & 67108864) != 0 ? isolatedMarginConfig.baseTransferInEnable : bool5;
        if ((i11 & C2711C.BUFFER_FLAG_FIRST_SAMPLE) != 0) {
            bool8 = bool13;
            bool7 = isolatedMarginConfig.quoteTransferInEnable;
        } else {
            bool7 = bool6;
            bool8 = bool13;
        }
        return isolatedMarginConfig.copy(str27, str20, d15, d16, d17, d18, str21, bool9, bool10, str22, str23, str24, str25, str26, str28, str29, str30, str31, str32, str33, str34, str35, str36, str37, bool11, bool12, bool8, bool7);
    }

    @NotNull
    public final IsolatedMarginConfig copy(@Nullable String symbol, @Nullable String flDebtRatio, @Nullable Double defaultLeverage, @Nullable Double maxLeverage, @Nullable Double riskLeverage, @Nullable Double pnlPrecision, @Nullable String riskGrade, @Nullable Boolean baseBorrowEnable, @Nullable Boolean quoteBorrowEnable, @Nullable String baseMaxBorrowAmount, @Nullable String quoteMaxBorrowAmount, @Nullable String autoRenewMaxDebtRatio, @Nullable String baseMaxBuyAmount, @Nullable String quoteMaxBuyAmount, @Nullable String borrowBufferRatio, @Nullable String remindDebtRatio, @Nullable String warnDebtRatio, @Nullable String flWarnDebtRatio, @Nullable String transferOutMaxDebtRatio, @Nullable String transferOutBufferRatio, @Nullable String baseBorrowCoefficient, @Nullable String quoteBorrowCoefficient, @Nullable String baseMarginCoefficient, @Nullable String quoteMarginCoefficient, @Nullable Boolean enable, @Nullable Boolean tradeEnable, @Nullable Boolean baseTransferInEnable, @Nullable Boolean quoteTransferInEnable) {
        return new IsolatedMarginConfig(symbol, flDebtRatio, defaultLeverage, maxLeverage, riskLeverage, pnlPrecision, riskGrade, baseBorrowEnable, quoteBorrowEnable, baseMaxBorrowAmount, quoteMaxBorrowAmount, autoRenewMaxDebtRatio, baseMaxBuyAmount, quoteMaxBuyAmount, borrowBufferRatio, remindDebtRatio, warnDebtRatio, flWarnDebtRatio, transferOutMaxDebtRatio, transferOutBufferRatio, baseBorrowCoefficient, quoteBorrowCoefficient, baseMarginCoefficient, quoteMarginCoefficient, enable, tradeEnable, baseTransferInEnable, quoteTransferInEnable);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IsolatedMarginConfig)) {
            return false;
        }
        IsolatedMarginConfig isolatedMarginConfig = (IsolatedMarginConfig) other;
        return Intrinsics.areEqual(this.symbol, isolatedMarginConfig.symbol) && Intrinsics.areEqual(this.flDebtRatio, isolatedMarginConfig.flDebtRatio) && Intrinsics.areEqual((Object) this.defaultLeverage, (Object) isolatedMarginConfig.defaultLeverage) && Intrinsics.areEqual((Object) this.maxLeverage, (Object) isolatedMarginConfig.maxLeverage) && Intrinsics.areEqual((Object) this.riskLeverage, (Object) isolatedMarginConfig.riskLeverage) && Intrinsics.areEqual((Object) this.pnlPrecision, (Object) isolatedMarginConfig.pnlPrecision) && Intrinsics.areEqual(this.riskGrade, isolatedMarginConfig.riskGrade) && Intrinsics.areEqual(this.baseBorrowEnable, isolatedMarginConfig.baseBorrowEnable) && Intrinsics.areEqual(this.quoteBorrowEnable, isolatedMarginConfig.quoteBorrowEnable) && Intrinsics.areEqual(this.baseMaxBorrowAmount, isolatedMarginConfig.baseMaxBorrowAmount) && Intrinsics.areEqual(this.quoteMaxBorrowAmount, isolatedMarginConfig.quoteMaxBorrowAmount) && Intrinsics.areEqual(this.autoRenewMaxDebtRatio, isolatedMarginConfig.autoRenewMaxDebtRatio) && Intrinsics.areEqual(this.baseMaxBuyAmount, isolatedMarginConfig.baseMaxBuyAmount) && Intrinsics.areEqual(this.quoteMaxBuyAmount, isolatedMarginConfig.quoteMaxBuyAmount) && Intrinsics.areEqual(this.borrowBufferRatio, isolatedMarginConfig.borrowBufferRatio) && Intrinsics.areEqual(this.remindDebtRatio, isolatedMarginConfig.remindDebtRatio) && Intrinsics.areEqual(this.warnDebtRatio, isolatedMarginConfig.warnDebtRatio) && Intrinsics.areEqual(this.flWarnDebtRatio, isolatedMarginConfig.flWarnDebtRatio) && Intrinsics.areEqual(this.transferOutMaxDebtRatio, isolatedMarginConfig.transferOutMaxDebtRatio) && Intrinsics.areEqual(this.transferOutBufferRatio, isolatedMarginConfig.transferOutBufferRatio) && Intrinsics.areEqual(this.baseBorrowCoefficient, isolatedMarginConfig.baseBorrowCoefficient) && Intrinsics.areEqual(this.quoteBorrowCoefficient, isolatedMarginConfig.quoteBorrowCoefficient) && Intrinsics.areEqual(this.baseMarginCoefficient, isolatedMarginConfig.baseMarginCoefficient) && Intrinsics.areEqual(this.quoteMarginCoefficient, isolatedMarginConfig.quoteMarginCoefficient) && Intrinsics.areEqual(this.enable, isolatedMarginConfig.enable) && Intrinsics.areEqual(this.tradeEnable, isolatedMarginConfig.tradeEnable) && Intrinsics.areEqual(this.baseTransferInEnable, isolatedMarginConfig.baseTransferInEnable) && Intrinsics.areEqual(this.quoteTransferInEnable, isolatedMarginConfig.quoteTransferInEnable);
    }

    public IsolatedMarginConfig(@Nullable String str, @Nullable String str2, @Nullable Double d11, @Nullable Double d12, @Nullable Double d13, @Nullable Double d14, @Nullable String str3, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable String str14, @Nullable String str15, @Nullable String str16, @Nullable String str17, @Nullable String str18, @Nullable Boolean bool3, @Nullable Boolean bool4, @Nullable Boolean bool5, @Nullable Boolean bool6) {
        this.symbol = str;
        this.flDebtRatio = str2;
        this.defaultLeverage = d11;
        this.maxLeverage = d12;
        this.riskLeverage = d13;
        this.pnlPrecision = d14;
        this.riskGrade = str3;
        this.baseBorrowEnable = bool;
        this.quoteBorrowEnable = bool2;
        this.baseMaxBorrowAmount = str4;
        this.quoteMaxBorrowAmount = str5;
        this.autoRenewMaxDebtRatio = str6;
        this.baseMaxBuyAmount = str7;
        this.quoteMaxBuyAmount = str8;
        this.borrowBufferRatio = str9;
        this.remindDebtRatio = str10;
        this.warnDebtRatio = str11;
        this.flWarnDebtRatio = str12;
        this.transferOutMaxDebtRatio = str13;
        this.transferOutBufferRatio = str14;
        this.baseBorrowCoefficient = str15;
        this.quoteBorrowCoefficient = str16;
        this.baseMarginCoefficient = str17;
        this.quoteMarginCoefficient = str18;
        this.enable = bool3;
        this.tradeEnable = bool4;
        this.baseTransferInEnable = bool5;
        this.quoteTransferInEnable = bool6;
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getBaseMaxBorrowAmount() {
        return this.baseMaxBorrowAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getQuoteMaxBorrowAmount() {
        return this.quoteMaxBorrowAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getAutoRenewMaxDebtRatio() {
        return this.autoRenewMaxDebtRatio;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getBaseMaxBuyAmount() {
        return this.baseMaxBuyAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getQuoteMaxBuyAmount() {
        return this.quoteMaxBuyAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getBorrowBufferRatio() {
        return this.borrowBufferRatio;
    }

    @Nullable
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getRemindDebtRatio() {
        return this.remindDebtRatio;
    }

    @Nullable
    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getWarnDebtRatio() {
        return this.warnDebtRatio;
    }

    @Nullable
    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getFlWarnDebtRatio() {
        return this.flWarnDebtRatio;
    }

    @Nullable
    /* JADX INFO: renamed from: component19, reason: from getter */
    public final String getTransferOutMaxDebtRatio() {
        return this.transferOutMaxDebtRatio;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getFlDebtRatio() {
        return this.flDebtRatio;
    }

    @Nullable
    /* JADX INFO: renamed from: component20, reason: from getter */
    public final String getTransferOutBufferRatio() {
        return this.transferOutBufferRatio;
    }

    @Nullable
    /* JADX INFO: renamed from: component21, reason: from getter */
    public final String getBaseBorrowCoefficient() {
        return this.baseBorrowCoefficient;
    }

    @Nullable
    /* JADX INFO: renamed from: component22, reason: from getter */
    public final String getQuoteBorrowCoefficient() {
        return this.quoteBorrowCoefficient;
    }

    @Nullable
    /* JADX INFO: renamed from: component23, reason: from getter */
    public final String getBaseMarginCoefficient() {
        return this.baseMarginCoefficient;
    }

    @Nullable
    /* JADX INFO: renamed from: component24, reason: from getter */
    public final String getQuoteMarginCoefficient() {
        return this.quoteMarginCoefficient;
    }

    @Nullable
    /* JADX INFO: renamed from: component25, reason: from getter */
    public final Boolean getEnable() {
        return this.enable;
    }

    @Nullable
    /* JADX INFO: renamed from: component26, reason: from getter */
    public final Boolean getTradeEnable() {
        return this.tradeEnable;
    }

    @Nullable
    /* JADX INFO: renamed from: component27, reason: from getter */
    public final Boolean getBaseTransferInEnable() {
        return this.baseTransferInEnable;
    }

    @Nullable
    /* JADX INFO: renamed from: component28, reason: from getter */
    public final Boolean getQuoteTransferInEnable() {
        return this.quoteTransferInEnable;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Double getDefaultLeverage() {
        return this.defaultLeverage;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Double getMaxLeverage() {
        return this.maxLeverage;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Double getRiskLeverage() {
        return this.riskLeverage;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Double getPnlPrecision() {
        return this.pnlPrecision;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getRiskGrade() {
        return this.riskGrade;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Boolean getBaseBorrowEnable() {
        return this.baseBorrowEnable;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Boolean getQuoteBorrowEnable() {
        return this.quoteBorrowEnable;
    }

    @Nullable
    public final String getAutoRenewMaxDebtRatio() {
        return this.autoRenewMaxDebtRatio;
    }

    @Nullable
    public final String getBaseBorrowCoefficient() {
        return this.baseBorrowCoefficient;
    }

    @Nullable
    public final Boolean getBaseBorrowEnable() {
        return this.baseBorrowEnable;
    }

    @Nullable
    public final String getBaseMarginCoefficient() {
        return this.baseMarginCoefficient;
    }

    @Nullable
    public final String getBaseMaxBorrowAmount() {
        return this.baseMaxBorrowAmount;
    }

    @Nullable
    public final String getBaseMaxBuyAmount() {
        return this.baseMaxBuyAmount;
    }

    @Nullable
    public final Boolean getBaseTransferInEnable() {
        return this.baseTransferInEnable;
    }

    @Nullable
    public final String getBorrowBufferRatio() {
        return this.borrowBufferRatio;
    }

    @Nullable
    public final Double getDefaultLeverage() {
        return this.defaultLeverage;
    }

    @Nullable
    public final Boolean getEnable() {
        return this.enable;
    }

    @Nullable
    public final String getFlDebtRatio() {
        return this.flDebtRatio;
    }

    @Nullable
    public final String getFlWarnDebtRatio() {
        return this.flWarnDebtRatio;
    }

    @Nullable
    public final Double getMaxLeverage() {
        return this.maxLeverage;
    }

    @Nullable
    public final Double getPnlPrecision() {
        return this.pnlPrecision;
    }

    @Nullable
    public final String getQuoteBorrowCoefficient() {
        return this.quoteBorrowCoefficient;
    }

    @Nullable
    public final Boolean getQuoteBorrowEnable() {
        return this.quoteBorrowEnable;
    }

    @Nullable
    public final String getQuoteMarginCoefficient() {
        return this.quoteMarginCoefficient;
    }

    @Nullable
    public final String getQuoteMaxBorrowAmount() {
        return this.quoteMaxBorrowAmount;
    }

    @Nullable
    public final String getQuoteMaxBuyAmount() {
        return this.quoteMaxBuyAmount;
    }

    @Nullable
    public final Boolean getQuoteTransferInEnable() {
        return this.quoteTransferInEnable;
    }

    @Nullable
    public final String getRemindDebtRatio() {
        return this.remindDebtRatio;
    }

    @Nullable
    public final String getRiskGrade() {
        return this.riskGrade;
    }

    @Nullable
    public final Double getRiskLeverage() {
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
    public final String getTransferOutBufferRatio() {
        return this.transferOutBufferRatio;
    }

    @Nullable
    public final String getTransferOutMaxDebtRatio() {
        return this.transferOutMaxDebtRatio;
    }

    @Nullable
    public final String getWarnDebtRatio() {
        return this.warnDebtRatio;
    }

    public int hashCode() {
        String str = this.symbol;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.flDebtRatio;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Double d11 = this.defaultLeverage;
        int iHashCode3 = (iHashCode2 + (d11 == null ? 0 : d11.hashCode())) * 31;
        Double d12 = this.maxLeverage;
        int iHashCode4 = (iHashCode3 + (d12 == null ? 0 : d12.hashCode())) * 31;
        Double d13 = this.riskLeverage;
        int iHashCode5 = (iHashCode4 + (d13 == null ? 0 : d13.hashCode())) * 31;
        Double d14 = this.pnlPrecision;
        int iHashCode6 = (iHashCode5 + (d14 == null ? 0 : d14.hashCode())) * 31;
        String str3 = this.riskGrade;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.baseBorrowEnable;
        int iHashCode8 = (iHashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.quoteBorrowEnable;
        int iHashCode9 = (iHashCode8 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str4 = this.baseMaxBorrowAmount;
        int iHashCode10 = (iHashCode9 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.quoteMaxBorrowAmount;
        int iHashCode11 = (iHashCode10 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.autoRenewMaxDebtRatio;
        int iHashCode12 = (iHashCode11 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.baseMaxBuyAmount;
        int iHashCode13 = (iHashCode12 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.quoteMaxBuyAmount;
        int iHashCode14 = (iHashCode13 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.borrowBufferRatio;
        int iHashCode15 = (iHashCode14 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.remindDebtRatio;
        int iHashCode16 = (iHashCode15 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.warnDebtRatio;
        int iHashCode17 = (iHashCode16 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.flWarnDebtRatio;
        int iHashCode18 = (iHashCode17 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.transferOutMaxDebtRatio;
        int iHashCode19 = (iHashCode18 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.transferOutBufferRatio;
        int iHashCode20 = (iHashCode19 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.baseBorrowCoefficient;
        int iHashCode21 = (iHashCode20 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.quoteBorrowCoefficient;
        int iHashCode22 = (iHashCode21 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.baseMarginCoefficient;
        int iHashCode23 = (iHashCode22 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.quoteMarginCoefficient;
        int iHashCode24 = (iHashCode23 + (str18 == null ? 0 : str18.hashCode())) * 31;
        Boolean bool3 = this.enable;
        int iHashCode25 = (iHashCode24 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.tradeEnable;
        int iHashCode26 = (iHashCode25 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.baseTransferInEnable;
        int iHashCode27 = (iHashCode26 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.quoteTransferInEnable;
        return iHashCode27 + (bool6 != null ? bool6.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "IsolatedMarginConfig(symbol=" + this.symbol + ", flDebtRatio=" + this.flDebtRatio + ", defaultLeverage=" + this.defaultLeverage + ", maxLeverage=" + this.maxLeverage + ", riskLeverage=" + this.riskLeverage + ", pnlPrecision=" + this.pnlPrecision + ", riskGrade=" + this.riskGrade + ", baseBorrowEnable=" + this.baseBorrowEnable + ", quoteBorrowEnable=" + this.quoteBorrowEnable + ", baseMaxBorrowAmount=" + this.baseMaxBorrowAmount + ", quoteMaxBorrowAmount=" + this.quoteMaxBorrowAmount + ", autoRenewMaxDebtRatio=" + this.autoRenewMaxDebtRatio + ", baseMaxBuyAmount=" + this.baseMaxBuyAmount + ", quoteMaxBuyAmount=" + this.quoteMaxBuyAmount + ", borrowBufferRatio=" + this.borrowBufferRatio + ", remindDebtRatio=" + this.remindDebtRatio + ", warnDebtRatio=" + this.warnDebtRatio + ", flWarnDebtRatio=" + this.flWarnDebtRatio + ", transferOutMaxDebtRatio=" + this.transferOutMaxDebtRatio + ", transferOutBufferRatio=" + this.transferOutBufferRatio + ", baseBorrowCoefficient=" + this.baseBorrowCoefficient + ", quoteBorrowCoefficient=" + this.quoteBorrowCoefficient + ", baseMarginCoefficient=" + this.baseMarginCoefficient + ", quoteMarginCoefficient=" + this.quoteMarginCoefficient + ", enable=" + this.enable + ", tradeEnable=" + this.tradeEnable + ", baseTransferInEnable=" + this.baseTransferInEnable + ", quoteTransferInEnable=" + this.quoteTransferInEnable + ")";
    }

    @Override // com.kubi.p110rn.core.turbo.WritableMapSerializable
    @NotNull
    public WritableMap toWritableMap() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        String str = this.symbol;
        if (str != null) {
            writableMapCreateMap.putString("symbol", str.toString());
        }
        String str2 = this.flDebtRatio;
        if (str2 != null) {
            writableMapCreateMap.putString("flDebtRatio", str2.toString());
        }
        Double d11 = this.defaultLeverage;
        if (d11 != null) {
            writableMapCreateMap.putDouble("defaultLeverage", d11.doubleValue());
        }
        Double d12 = this.maxLeverage;
        if (d12 != null) {
            writableMapCreateMap.putDouble("maxLeverage", d12.doubleValue());
        }
        Double d13 = this.riskLeverage;
        if (d13 != null) {
            writableMapCreateMap.putDouble("riskLeverage", d13.doubleValue());
        }
        Double d14 = this.pnlPrecision;
        if (d14 != null) {
            writableMapCreateMap.putDouble("pnlPrecision", d14.doubleValue());
        }
        String str3 = this.riskGrade;
        if (str3 != null) {
            writableMapCreateMap.putString("riskGrade", str3.toString());
        }
        Boolean bool = this.baseBorrowEnable;
        if (bool != null) {
            writableMapCreateMap.putBoolean("baseBorrowEnable", bool.booleanValue());
        }
        Boolean bool2 = this.quoteBorrowEnable;
        if (bool2 != null) {
            writableMapCreateMap.putBoolean("quoteBorrowEnable", bool2.booleanValue());
        }
        String str4 = this.baseMaxBorrowAmount;
        if (str4 != null) {
            writableMapCreateMap.putString("baseMaxBorrowAmount", str4.toString());
        }
        String str5 = this.quoteMaxBorrowAmount;
        if (str5 != null) {
            writableMapCreateMap.putString("quoteMaxBorrowAmount", str5.toString());
        }
        String str6 = this.autoRenewMaxDebtRatio;
        if (str6 != null) {
            writableMapCreateMap.putString("autoRenewMaxDebtRatio", str6.toString());
        }
        String str7 = this.baseMaxBuyAmount;
        if (str7 != null) {
            writableMapCreateMap.putString("baseMaxBuyAmount", str7.toString());
        }
        String str8 = this.quoteMaxBuyAmount;
        if (str8 != null) {
            writableMapCreateMap.putString("quoteMaxBuyAmount", str8.toString());
        }
        String str9 = this.borrowBufferRatio;
        if (str9 != null) {
            writableMapCreateMap.putString("borrowBufferRatio", str9.toString());
        }
        String str10 = this.remindDebtRatio;
        if (str10 != null) {
            writableMapCreateMap.putString("remindDebtRatio", str10.toString());
        }
        String str11 = this.warnDebtRatio;
        if (str11 != null) {
            writableMapCreateMap.putString("warnDebtRatio", str11.toString());
        }
        String str12 = this.flWarnDebtRatio;
        if (str12 != null) {
            writableMapCreateMap.putString("flWarnDebtRatio", str12.toString());
        }
        String str13 = this.transferOutMaxDebtRatio;
        if (str13 != null) {
            writableMapCreateMap.putString("transferOutMaxDebtRatio", str13.toString());
        }
        String str14 = this.transferOutBufferRatio;
        if (str14 != null) {
            writableMapCreateMap.putString("transferOutBufferRatio", str14.toString());
        }
        String str15 = this.baseBorrowCoefficient;
        if (str15 != null) {
            writableMapCreateMap.putString("baseBorrowCoefficient", str15.toString());
        }
        String str16 = this.quoteBorrowCoefficient;
        if (str16 != null) {
            writableMapCreateMap.putString("quoteBorrowCoefficient", str16.toString());
        }
        String str17 = this.baseMarginCoefficient;
        if (str17 != null) {
            writableMapCreateMap.putString("baseMarginCoefficient", str17.toString());
        }
        String str18 = this.quoteMarginCoefficient;
        if (str18 != null) {
            writableMapCreateMap.putString("quoteMarginCoefficient", str18.toString());
        }
        Boolean bool3 = this.enable;
        if (bool3 != null) {
            writableMapCreateMap.putBoolean(BridgeParamKeyKt.RN_CONTAINER_UI_ENABLE, bool3.booleanValue());
        }
        Boolean bool4 = this.tradeEnable;
        if (bool4 != null) {
            writableMapCreateMap.putBoolean("tradeEnable", bool4.booleanValue());
        }
        Boolean bool5 = this.baseTransferInEnable;
        if (bool5 != null) {
            writableMapCreateMap.putBoolean("baseTransferInEnable", bool5.booleanValue());
        }
        Boolean bool6 = this.quoteTransferInEnable;
        if (bool6 != null) {
            writableMapCreateMap.putBoolean("quoteTransferInEnable", bool6.booleanValue());
        }
        Intrinsics.checkNotNull(writableMapCreateMap);
        return writableMapCreateMap;
    }

    public /* synthetic */ IsolatedMarginConfig(String str, String str2, Double d11, Double d12, Double d13, Double d14, String str3, Boolean bool, Boolean bool2, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : d11, (i11 & 8) != 0 ? null : d12, (i11 & 16) != 0 ? null : d13, (i11 & 32) != 0 ? null : d14, (i11 & 64) != 0 ? null : str3, (i11 & 128) != 0 ? null : bool, (i11 & 256) != 0 ? null : bool2, (i11 & 512) != 0 ? null : str4, (i11 & 1024) != 0 ? null : str5, (i11 & 2048) != 0 ? null : str6, (i11 & 4096) != 0 ? null : str7, (i11 & 8192) != 0 ? null : str8, (i11 & 16384) != 0 ? null : str9, (i11 & 32768) != 0 ? null : str10, (i11 & 65536) != 0 ? null : str11, (i11 & 131072) != 0 ? null : str12, (i11 & 262144) != 0 ? null : str13, (i11 & 524288) != 0 ? null : str14, (i11 & 1048576) != 0 ? null : str15, (i11 & 2097152) != 0 ? null : str16, (i11 & 4194304) != 0 ? null : str17, (i11 & 8388608) != 0 ? null : str18, (i11 & 16777216) != 0 ? null : bool3, (i11 & 33554432) != 0 ? null : bool4, (i11 & 67108864) != 0 ? null : bool5, (i11 & C2711C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? null : bool6);
    }
}
