package com.kubi.jsbridge.impl.biz.trade;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.data.entity.CoinInfoEntity;
import com.kubi.loan.api.entity.LeverCoinConfig;
import com.kubi.margin.api.entity.IsolatedMarginBridgeConfig;
import com.kubi.margin.api.entity.MarginBridgeConfig;
import com.kubi.sdk.protocol.jsapi.protocol.KCJSApiTradeIsolatedMarginConfig;
import com.kubi.sdk.protocol.jsapi.protocol.KCJSApiTradeMarginConfig;
import com.kubi.sdk.protocol.jsapi.protocol.KCJSApiTradeMarginCurrency;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.kubi.jsbridge.impl.biz.trade.j, reason: from Kotlin metadata */
/* JADX INFO: compiled from: TradeMarginBridgeMapper.kt */
/* JADX INFO: loaded from: classes17.dex */
@Metadata(m90083d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007J\"\u0010\b\u001a\u00020\t2\b\u0010\u0006\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000eJ\u001a\u0010\u000f\u001a\u00020\u00102\b\u0010\u0006\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u000eJ\u0010\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u000eH\u0002J\u000e\u0010\u0015\u001a\u00020\u000e*\u0004\u0018\u00010\u0016H\u0002J\u0016\u0010\u0017\u001a\u00020\u000e*\u0004\u0018\u00010\u00162\u0006\u0010\u0018\u001a\u00020\u000eH\u0002J\u000e\u0010\u0019\u001a\u00020\u001a*\u0004\u0018\u00010\u0016H\u0002¨\u0006\u001b"}, m90084d2 = {"Lcom/kubi/jsbridge/impl/biz/trade/TradeMarginBridgeMapper;", "", "<init>", "()V", "toJsMarginConfig", "Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiTradeMarginConfig;", "config", "Lcom/kubi/margin/api/entity/MarginBridgeConfig;", "toJsMarginCurrency", "Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiTradeMarginCurrency;", "Lcom/kubi/loan/api/entity/LeverCoinConfig;", "coin", "Lcom/kubi/data/entity/CoinInfoEntity;", "fallbackCurrency", "", "toJsIsolatedMarginConfig", "Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiTradeIsolatedMarginConfig;", "Lcom/kubi/margin/api/entity/IsolatedMarginBridgeConfig;", "fallbackSymbol", "emptyMarginCurrency", FirebaseAnalytics.Param.CURRENCY, "toPlainStringOrZero", "Ljava/math/BigDecimal;", "toPlainStringOrDefault", "default", "toLongOrZero", "", "JsBridgeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nTradeMarginBridgeMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TradeMarginBridgeMapper.kt\ncom/kubi/jsbridge/impl/biz/trade/TradeMarginBridgeMapper\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,151:1\n1#2:152\n1563#3:153\n1634#3,3:154\n*S KotlinDebug\n*F\n+ 1 TradeMarginBridgeMapper.kt\ncom/kubi/jsbridge/impl/biz/trade/TradeMarginBridgeMapper\n*L\n60#1:153\n60#1:154,3\n*E\n"})
public final class TradeMarginBridgeMapper {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final TradeMarginBridgeMapper f27387a = new TradeMarginBridgeMapper();

    /* JADX INFO: renamed from: a */
    public final KCJSApiTradeMarginCurrency m31607a(String str) {
        return new KCJSApiTradeMarginCurrency("0", "0", str, "0", "0", "", "", "0", false, false, false, false, "0", "0", "", "0", "0", CollectionsKt.emptyList(), 8L, "0", "0", "0", 1L, "0", "1", null);
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final KCJSApiTradeIsolatedMarginConfig m31608b(@Nullable IsolatedMarginBridgeConfig isolatedMarginBridgeConfig, @NotNull String fallbackSymbol) {
        String str;
        Integer pnlPrecision;
        Boolean quoteTransferInEnable;
        Boolean baseTransferInEnable;
        Boolean tradeEnable;
        Boolean enable;
        Boolean quoteBorrowEnable;
        Boolean baseBorrowEnable;
        String symbol;
        Intrinsics.checkNotNullParameter(fallbackSymbol, "fallbackSymbol");
        if (isolatedMarginBridgeConfig == null || (symbol = isolatedMarginBridgeConfig.getSymbol()) == null) {
            str = fallbackSymbol;
        } else {
            if (symbol.length() == 0) {
                symbol = fallbackSymbol;
            }
            str = symbol;
        }
        Long lValueOf = null;
        String strM31613g = m31613g(isolatedMarginBridgeConfig != null ? isolatedMarginBridgeConfig.getFlDebtRatio() : null);
        long jM31611e = m31611e(isolatedMarginBridgeConfig != null ? isolatedMarginBridgeConfig.getDefaultLeverage() : null);
        long jM31611e2 = m31611e(isolatedMarginBridgeConfig != null ? isolatedMarginBridgeConfig.getMaxLeverage() : null);
        long jM31611e3 = m31611e(isolatedMarginBridgeConfig != null ? isolatedMarginBridgeConfig.getRiskLeverage() : null);
        boolean zBooleanValue = false;
        boolean zBooleanValue2 = (isolatedMarginBridgeConfig == null || (baseBorrowEnable = isolatedMarginBridgeConfig.getBaseBorrowEnable()) == null) ? false : baseBorrowEnable.booleanValue();
        boolean zBooleanValue3 = (isolatedMarginBridgeConfig == null || (quoteBorrowEnable = isolatedMarginBridgeConfig.getQuoteBorrowEnable()) == null) ? false : quoteBorrowEnable.booleanValue();
        String strM31613g2 = m31613g(isolatedMarginBridgeConfig != null ? isolatedMarginBridgeConfig.getBaseMaxBorrowAmount() : null);
        String strM31613g3 = m31613g(isolatedMarginBridgeConfig != null ? isolatedMarginBridgeConfig.getQuoteMaxBorrowAmount() : null);
        String strM31613g4 = m31613g(isolatedMarginBridgeConfig != null ? isolatedMarginBridgeConfig.getAutoRenewMaxDebtRatio() : null);
        String strM31613g5 = m31613g(isolatedMarginBridgeConfig != null ? isolatedMarginBridgeConfig.getBaseMaxBuyAmount() : null);
        String strM31613g6 = m31613g(isolatedMarginBridgeConfig != null ? isolatedMarginBridgeConfig.getQuoteMaxBuyAmount() : null);
        String strM31613g7 = m31613g(isolatedMarginBridgeConfig != null ? isolatedMarginBridgeConfig.getBorrowBufferRatio() : null);
        String strM31613g8 = m31613g(isolatedMarginBridgeConfig != null ? isolatedMarginBridgeConfig.getWarnDebtRatio() : null);
        String strM31613g9 = m31613g(isolatedMarginBridgeConfig != null ? isolatedMarginBridgeConfig.getTransferOutMaxDebtRatio() : null);
        String strM31613g10 = m31613g(isolatedMarginBridgeConfig != null ? isolatedMarginBridgeConfig.getTransferOutBufferRatio() : null);
        String strM31613g11 = m31613g(isolatedMarginBridgeConfig != null ? isolatedMarginBridgeConfig.getBaseBorrowCoefficient() : null);
        String strM31613g12 = m31613g(isolatedMarginBridgeConfig != null ? isolatedMarginBridgeConfig.getQuoteBorrowCoefficient() : null);
        String strM31613g13 = m31613g(isolatedMarginBridgeConfig != null ? isolatedMarginBridgeConfig.getBaseMarginCoefficient() : null);
        String strM31613g14 = m31613g(isolatedMarginBridgeConfig != null ? isolatedMarginBridgeConfig.getQuoteMarginCoefficient() : null);
        boolean zBooleanValue4 = (isolatedMarginBridgeConfig == null || (enable = isolatedMarginBridgeConfig.getEnable()) == null) ? false : enable.booleanValue();
        boolean zBooleanValue5 = (isolatedMarginBridgeConfig == null || (tradeEnable = isolatedMarginBridgeConfig.getTradeEnable()) == null) ? false : tradeEnable.booleanValue();
        boolean zBooleanValue6 = (isolatedMarginBridgeConfig == null || (baseTransferInEnable = isolatedMarginBridgeConfig.getBaseTransferInEnable()) == null) ? false : baseTransferInEnable.booleanValue();
        if (isolatedMarginBridgeConfig != null && (quoteTransferInEnable = isolatedMarginBridgeConfig.getQuoteTransferInEnable()) != null) {
            zBooleanValue = quoteTransferInEnable.booleanValue();
        }
        boolean z11 = zBooleanValue;
        if (isolatedMarginBridgeConfig != null && (pnlPrecision = isolatedMarginBridgeConfig.getPnlPrecision()) != null) {
            lValueOf = Long.valueOf(pnlPrecision.intValue());
        }
        return new KCJSApiTradeIsolatedMarginConfig(str, strM31613g, jM31611e, jM31611e2, jM31611e3, "", zBooleanValue2, zBooleanValue3, strM31613g2, strM31613g3, strM31613g4, strM31613g5, strM31613g6, strM31613g7, "0", strM31613g8, "0", strM31613g9, strM31613g10, strM31613g11, strM31613g12, strM31613g13, strM31613g14, zBooleanValue4, zBooleanValue5, zBooleanValue6, z11, lValueOf);
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final KCJSApiTradeMarginConfig m31609c(@Nullable MarginBridgeConfig marginBridgeConfig) {
        BigDecimal remindPriceDeviateRatio;
        String plainString = null;
        String strM31613g = m31613g(marginBridgeConfig != null ? marginBridgeConfig.getBorrowableDebtBufferRatio() : null);
        String strM31613g2 = m31613g(marginBridgeConfig != null ? marginBridgeConfig.getEarlyWarningDebtRatio() : null);
        String strM31613g3 = m31613g(marginBridgeConfig != null ? marginBridgeConfig.getLiquidationDebtRatio() : null);
        String strM31613g4 = m31613g(marginBridgeConfig != null ? marginBridgeConfig.getMaxAutoLoanDebtRatio() : null);
        String strM31613g5 = m31613g(marginBridgeConfig != null ? marginBridgeConfig.getMaxLeverage() : null);
        String strM31613g6 = m31613g(marginBridgeConfig != null ? marginBridgeConfig.getDefaultLeverage() : null);
        String strM31613g7 = m31613g(marginBridgeConfig != null ? marginBridgeConfig.getTransferableAmountDebtBufferRatio() : null);
        String strM31613g8 = m31613g(marginBridgeConfig != null ? marginBridgeConfig.getTransferableAmountDebtRatio() : null);
        String strM31613g9 = m31613g(marginBridgeConfig != null ? marginBridgeConfig.getRiskLeverage() : null);
        String riskGrade = marginBridgeConfig != null ? marginBridgeConfig.getRiskGrade() : null;
        if (marginBridgeConfig != null && (remindPriceDeviateRatio = marginBridgeConfig.getRemindPriceDeviateRatio()) != null) {
            plainString = remindPriceDeviateRatio.toPlainString();
        }
        return new KCJSApiTradeMarginConfig(strM31613g, strM31613g2, strM31613g3, strM31613g4, strM31613g5, strM31613g6, strM31613g7, strM31613g8, strM31613g9, riskGrade, plainString);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0063 A[PHI: r1
      0x0063: PHI (r1v30 java.lang.Boolean) = (r1v8 java.lang.Boolean), (r1v10 java.lang.Boolean) binds: [B:22:0x0061, B:27:0x0075] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:40:0x0098 A[PHI: r1
      0x0098: PHI (r1v28 java.lang.Boolean) = (r1v14 java.lang.Boolean), (r1v16 java.lang.Boolean) binds: [B:39:0x0096, B:45:0x00ab] A[DONT_GENERATE, DONT_INLINE]] */
    @NotNull
    /* JADX INFO: renamed from: d */
    public final KCJSApiTradeMarginCurrency m31610d(@Nullable LeverCoinConfig leverCoinConfig, @Nullable CoinInfoEntity coinInfoEntity, @NotNull String fallbackCurrency) {
        boolean zBooleanValue;
        boolean zBooleanValue2;
        List listEmptyList;
        Intrinsics.checkNotNullParameter(fallbackCurrency, "fallbackCurrency");
        if (leverCoinConfig == null) {
            return m31607a(fallbackCurrency);
        }
        String currency = leverCoinConfig.getCurrency();
        if (currency == null) {
            currency = "";
        }
        String str = currency.length() == 0 ? fallbackCurrency : currency;
        String strM31613g = m31613g(leverCoinConfig.getBorrowMaxAmount());
        String strM31613g2 = m31613g(leverCoinConfig.getBorrowMinAmount());
        String strM31613g3 = m31613g(leverCoinConfig.getCurrencyLoanMinUnit());
        String strM31613g4 = m31613g(leverCoinConfig.getFeeRatio());
        String id2 = leverCoinConfig.getId();
        String str2 = id2 == null ? "" : id2;
        String indexSymbol = leverCoinConfig.getIndexSymbol();
        String str3 = indexSymbol == null ? "" : indexSymbol;
        String strM31613g5 = m31613g(leverCoinConfig.getInterestRateUnit());
        Boolean boolIsDebitEnabled = leverCoinConfig.isDebitEnabled();
        if (boolIsDebitEnabled == null) {
            boolIsDebitEnabled = coinInfoEntity != null ? Boolean.valueOf(coinInfoEntity.isDebitEnabled()) : null;
            if (boolIsDebitEnabled != null) {
                zBooleanValue = boolIsDebitEnabled.booleanValue();
            } else {
                zBooleanValue = false;
            }
        } else {
            zBooleanValue = boolIsDebitEnabled.booleanValue();
        }
        boolean zIsBorrow = leverCoinConfig.isBorrow();
        boolean z11 = leverCoinConfig.isMarginEnabled() || (coinInfoEntity != null && coinInfoEntity.isMarginEnabled());
        Boolean isolatedEnable = leverCoinConfig.getIsolatedEnable();
        if (isolatedEnable == null) {
            isolatedEnable = coinInfoEntity != null ? Boolean.valueOf(coinInfoEntity.isIsolatedEnabled()) : null;
            zBooleanValue2 = isolatedEnable != null ? isolatedEnable.booleanValue() : false;
        }
        boolean z12 = zBooleanValue2;
        String strM31613g6 = m31613g(leverCoinConfig.getLendMaxAmount());
        String strM31613g7 = m31613g(leverCoinConfig.getLendMinAmount());
        String markPriceSymbol = leverCoinConfig.getMarkPriceSymbol();
        String str4 = markPriceSymbol == null ? "" : markPriceSymbol;
        String strM31613g8 = m31613g(leverCoinConfig.getMaxInterestRate());
        String strM31613g9 = m31613g(leverCoinConfig.getMinInterestRate());
        List<Integer> period = leverCoinConfig.getPeriod();
        if (period != null) {
            listEmptyList = new ArrayList(CollectionsKt.collectionSizeOrDefault(period, 10));
            Iterator<T> it = period.iterator();
            while (it.hasNext()) {
                listEmptyList.add(Long.valueOf(((Number) it.next()).intValue()));
            }
        } else {
            listEmptyList = null;
        }
        if (listEmptyList == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        List list = listEmptyList;
        long precision = leverCoinConfig.getPrecision();
        String strM31613g10 = m31613g(leverCoinConfig.getRiskFundsRate());
        String strM31613g11 = m31613g(leverCoinConfig.getSevenBonusLendRate());
        String strM31613g12 = m31613g(leverCoinConfig.getSixMonthBonusLendRate());
        Integer sort = leverCoinConfig.getSort();
        long jIntValue = sort != null ? sort.intValue() : 1L;
        String strM31613g13 = m31613g(leverCoinConfig.getYearBonusLendRate());
        String strM31612f = m31612f(leverCoinConfig.getMarginCoefficient(), "1");
        BigDecimal borrowCoefficient = leverCoinConfig.getBorrowCoefficient();
        return new KCJSApiTradeMarginCurrency(strM31613g, strM31613g2, str, strM31613g3, strM31613g4, str2, str3, strM31613g5, zBooleanValue, zIsBorrow, z11, z12, strM31613g6, strM31613g7, str4, strM31613g8, strM31613g9, list, precision, strM31613g10, strM31613g11, strM31613g12, jIntValue, strM31613g13, strM31612f, borrowCoefficient != null ? borrowCoefficient.toPlainString() : null);
    }

    /* JADX INFO: renamed from: e */
    public final long m31611e(BigDecimal bigDecimal) {
        if (bigDecimal != null) {
            return bigDecimal.longValue();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: f */
    public final String m31612f(BigDecimal bigDecimal, String str) {
        String plainString;
        return (bigDecimal == null || (plainString = bigDecimal.toPlainString()) == null) ? str : plainString;
    }

    /* JADX INFO: renamed from: g */
    public final String m31613g(BigDecimal bigDecimal) {
        return m31612f(bigDecimal, "0");
    }
}
