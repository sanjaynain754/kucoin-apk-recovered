package com.kubi.p110rn.core.biz;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.data.entity.CoinInfoEntity;
import com.kubi.loan.api.entity.LeverCoinConfig;
import com.kubi.margin.api.entity.IsolatedMarginBridgeConfig;
import com.kubi.margin.api.entity.MarginBridgeConfig;
import com.kubi.p110rn.core.turbo.IsolatedMarginConfig;
import com.kubi.p110rn.core.turbo.MarginConfig;
import com.kubi.p110rn.core.turbo.MarginCurrency;
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

/* JADX INFO: compiled from: TradeTurboBridgeMapper.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\u0010\u0004\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007J$\u0010\b\u001a\u00020\t2\b\u0010\u0006\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000eJ\u001a\u0010\u000f\u001a\u00020\u00102\b\u0010\u0006\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u000eJ\u0010\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u000eH\u0002J\u0016\u0010\u0015\u001a\u00020\u000e*\u0004\u0018\u00010\u000e2\u0006\u0010\u0016\u001a\u00020\u000eH\u0002J\u000e\u0010\u0017\u001a\u00020\u000e*\u0004\u0018\u00010\u000eH\u0002J\u0013\u0010\u0018\u001a\u00020\u0019*\u0004\u0018\u00010\u0019H\u0002¢\u0006\u0002\u0010\u001aJ\u0018\u0010\u001b\u001a\u00020\u001c*\u0004\u0018\u00010\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u001cH\u0002J\u000e\u0010\u001f\u001a\u00020\u000e*\u0004\u0018\u00010 H\u0002J\u0016\u0010!\u001a\u00020\u000e*\u0004\u0018\u00010 2\u0006\u0010\u001e\u001a\u00020\u000eH\u0002¨\u0006\""}, m90084d2 = {"Lcom/kubi/rn/core/biz/TradeTurboBridgeMapper;", "", "<init>", "()V", "toTurboMarginConfig", "Lcom/kubi/rn/core/turbo/MarginConfig;", "config", "Lcom/kubi/margin/api/entity/MarginBridgeConfig;", "toTurboMarginCurrency", "Lcom/kubi/rn/core/turbo/MarginCurrency;", "Lcom/kubi/loan/api/entity/LeverCoinConfig;", "coin", "Lcom/kubi/data/entity/CoinInfoEntity;", "fallbackCurrency", "", "toTurboIsolatedMarginConfig", "Lcom/kubi/rn/core/turbo/IsolatedMarginConfig;", "Lcom/kubi/margin/api/entity/IsolatedMarginBridgeConfig;", "fallbackSymbol", "emptyMarginCurrency", FirebaseAnalytics.Param.CURRENCY, "orFallback", "fallback", "orZeroString", "orFalse", "", "(Ljava/lang/Boolean;)Z", "toDoubleOrDefault", "", "", "default", "toPlainStringOrZero", "Ljava/math/BigDecimal;", "toPlainStringOrDefault", "BReactNativeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nTradeTurboBridgeMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TradeTurboBridgeMapper.kt\ncom/kubi/rn/core/biz/TradeTurboBridgeMapper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,162:1\n1563#2:163\n1634#2,3:164\n1#3:167\n*S KotlinDebug\n*F\n+ 1 TradeTurboBridgeMapper.kt\ncom/kubi/rn/core/biz/TradeTurboBridgeMapper\n*L\n59#1:163\n59#1:164,3\n*E\n"})
public final class TradeTurboBridgeMapper {

    @NotNull
    public static final TradeTurboBridgeMapper INSTANCE = new TradeTurboBridgeMapper();

    @NotNull
    public final IsolatedMarginConfig toTurboIsolatedMarginConfig(@Nullable IsolatedMarginBridgeConfig config, @NotNull String fallbackSymbol) {
        Integer pnlPrecision;
        Intrinsics.checkNotNullParameter(fallbackSymbol, "fallbackSymbol");
        return new IsolatedMarginConfig(orFallback(config != null ? config.getSymbol() : null, fallbackSymbol), toPlainStringOrZero(config != null ? config.getFlDebtRatio() : null), Double.valueOf(toDoubleOrDefault$default(this, config != null ? config.getDefaultLeverage() : null, 0.0d, 1, null)), Double.valueOf(toDoubleOrDefault$default(this, config != null ? config.getMaxLeverage() : null, 0.0d, 1, null)), Double.valueOf(toDoubleOrDefault$default(this, config != null ? config.getRiskLeverage() : null, 0.0d, 1, null)), (config == null || (pnlPrecision = config.getPnlPrecision()) == null) ? null : Double.valueOf(pnlPrecision.intValue()), "", Boolean.valueOf(orFalse(config != null ? config.getBaseBorrowEnable() : null)), Boolean.valueOf(orFalse(config != null ? config.getQuoteBorrowEnable() : null)), toPlainStringOrZero(config != null ? config.getBaseMaxBorrowAmount() : null), toPlainStringOrZero(config != null ? config.getQuoteMaxBorrowAmount() : null), toPlainStringOrZero(config != null ? config.getAutoRenewMaxDebtRatio() : null), toPlainStringOrZero(config != null ? config.getBaseMaxBuyAmount() : null), toPlainStringOrZero(config != null ? config.getQuoteMaxBuyAmount() : null), toPlainStringOrZero(config != null ? config.getBorrowBufferRatio() : null), "0", toPlainStringOrZero(config != null ? config.getWarnDebtRatio() : null), "0", toPlainStringOrZero(config != null ? config.getTransferOutMaxDebtRatio() : null), toPlainStringOrZero(config != null ? config.getTransferOutBufferRatio() : null), toPlainStringOrZero(config != null ? config.getBaseBorrowCoefficient() : null), toPlainStringOrZero(config != null ? config.getQuoteBorrowCoefficient() : null), toPlainStringOrZero(config != null ? config.getBaseMarginCoefficient() : null), toPlainStringOrZero(config != null ? config.getQuoteMarginCoefficient() : null), Boolean.valueOf(orFalse(config != null ? config.getEnable() : null)), Boolean.valueOf(orFalse(config != null ? config.getTradeEnable() : null)), Boolean.valueOf(orFalse(config != null ? config.getBaseTransferInEnable() : null)), Boolean.valueOf(orFalse(config != null ? config.getQuoteTransferInEnable() : null)));
    }

    private final MarginCurrency emptyMarginCurrency(String currency) {
        Boolean bool = Boolean.FALSE;
        return new MarginCurrency("0", "0", currency, "0", "0", "", "", "0", bool, bool, bool, bool, "0", "0", "", "0", "0", null, Double.valueOf(8.0d), "0", "0", "0", Double.valueOf(1.0d), "0", null, "1");
    }

    private final String orFallback(String str, String str2) {
        if (str != null) {
            if (str.length() <= 0) {
                str = null;
            }
            if (str != null) {
                return str;
            }
        }
        return str2;
    }

    private final boolean orFalse(Boolean bool) {
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    private final String orZeroString(String str) {
        return str == null ? "0" : str;
    }

    private final double toDoubleOrDefault(Number number, double d11) {
        return number != null ? number.doubleValue() : d11;
    }

    public static /* synthetic */ double toDoubleOrDefault$default(TradeTurboBridgeMapper tradeTurboBridgeMapper, Number number, double d11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            d11 = 0.0d;
        }
        return tradeTurboBridgeMapper.toDoubleOrDefault(number, d11);
    }

    private final String toPlainStringOrDefault(BigDecimal bigDecimal, String str) {
        String plainString;
        return (bigDecimal == null || (plainString = bigDecimal.toPlainString()) == null) ? str : plainString;
    }

    private final String toPlainStringOrZero(BigDecimal bigDecimal) {
        return toPlainStringOrDefault(bigDecimal, "0");
    }

    public static /* synthetic */ IsolatedMarginConfig toTurboIsolatedMarginConfig$default(TradeTurboBridgeMapper tradeTurboBridgeMapper, IsolatedMarginBridgeConfig isolatedMarginBridgeConfig, String str, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str = "";
        }
        return tradeTurboBridgeMapper.toTurboIsolatedMarginConfig(isolatedMarginBridgeConfig, str);
    }

    public static /* synthetic */ MarginCurrency toTurboMarginCurrency$default(TradeTurboBridgeMapper tradeTurboBridgeMapper, LeverCoinConfig leverCoinConfig, CoinInfoEntity coinInfoEntity, String str, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            str = "";
        }
        return tradeTurboBridgeMapper.toTurboMarginCurrency(leverCoinConfig, coinInfoEntity, str);
    }

    @NotNull
    public final MarginConfig toTurboMarginConfig(@Nullable MarginBridgeConfig config) {
        BigDecimal remindPriceDeviateRatio;
        String plainString = null;
        String plainStringOrZero = toPlainStringOrZero(config != null ? config.getBorrowableDebtBufferRatio() : null);
        String plainStringOrZero2 = toPlainStringOrZero(config != null ? config.getEarlyWarningDebtRatio() : null);
        String plainStringOrZero3 = toPlainStringOrZero(config != null ? config.getLiquidationDebtRatio() : null);
        String plainStringOrZero4 = toPlainStringOrZero(config != null ? config.getMaxAutoLoanDebtRatio() : null);
        String plainStringOrZero5 = toPlainStringOrZero(config != null ? config.getMaxLeverage() : null);
        String plainStringOrZero6 = toPlainStringOrZero(config != null ? config.getDefaultLeverage() : null);
        String plainStringOrZero7 = toPlainStringOrZero(config != null ? config.getTransferableAmountDebtBufferRatio() : null);
        String plainStringOrZero8 = toPlainStringOrZero(config != null ? config.getTransferableAmountDebtRatio() : null);
        String riskGrade = config != null ? config.getRiskGrade() : null;
        String plainStringOrZero9 = toPlainStringOrZero(config != null ? config.getRiskLeverage() : null);
        if (config != null && (remindPriceDeviateRatio = config.getRemindPriceDeviateRatio()) != null) {
            plainString = remindPriceDeviateRatio.toPlainString();
        }
        return new MarginConfig(plainStringOrZero, plainStringOrZero2, plainStringOrZero3, plainStringOrZero4, plainStringOrZero5, plainStringOrZero6, plainStringOrZero7, plainStringOrZero8, riskGrade, plainStringOrZero9, plainString);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x005b A[PHI: r1
      0x005b: PHI (r1v34 java.lang.Boolean) = (r1v8 java.lang.Boolean), (r1v10 java.lang.Boolean) binds: [B:15:0x0059, B:20:0x006c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:32:0x0097 A[PHI: r15
      0x0097: PHI (r15v8 java.lang.Boolean) = (r15v2 java.lang.Boolean), (r15v4 java.lang.Boolean) binds: [B:31:0x0095, B:36:0x00a8] A[DONT_GENERATE, DONT_INLINE]] */
    @NotNull
    public final MarginCurrency toTurboMarginCurrency(@Nullable LeverCoinConfig config, @Nullable CoinInfoEntity coin, @NotNull String fallbackCurrency) {
        boolean zBooleanValue;
        boolean zBooleanValue2;
        List listEmptyList;
        Intrinsics.checkNotNullParameter(fallbackCurrency, "fallbackCurrency");
        if (config == null) {
            return emptyMarginCurrency(fallbackCurrency);
        }
        String strOrFallback = orFallback(config.getCurrency(), fallbackCurrency);
        String plainStringOrZero = toPlainStringOrZero(config.getBorrowMaxAmount());
        String plainStringOrZero2 = toPlainStringOrZero(config.getBorrowMinAmount());
        String plainStringOrZero3 = toPlainStringOrZero(config.getCurrencyLoanMinUnit());
        String plainStringOrZero4 = toPlainStringOrZero(config.getFeeRatio());
        String id2 = config.getId();
        String str = id2 == null ? "" : id2;
        String indexSymbol = config.getIndexSymbol();
        String str2 = indexSymbol == null ? "" : indexSymbol;
        String plainStringOrZero5 = toPlainStringOrZero(config.getInterestRateUnit());
        Boolean boolIsDebitEnabled = config.isDebitEnabled();
        if (boolIsDebitEnabled == null) {
            boolIsDebitEnabled = coin != null ? Boolean.valueOf(coin.isDebitEnabled()) : null;
            if (boolIsDebitEnabled != null) {
                zBooleanValue = boolIsDebitEnabled.booleanValue();
            } else {
                zBooleanValue = false;
            }
        } else {
            zBooleanValue = boolIsDebitEnabled.booleanValue();
        }
        Boolean boolValueOf = Boolean.valueOf(zBooleanValue);
        Boolean boolValueOf2 = Boolean.valueOf(config.isBorrow());
        boolean z11 = true;
        if (!config.isMarginEnabled() && (coin == null || !coin.isMarginEnabled())) {
            z11 = false;
        }
        Boolean boolValueOf3 = Boolean.valueOf(z11);
        Boolean isolatedEnable = config.getIsolatedEnable();
        if (isolatedEnable == null) {
            isolatedEnable = coin != null ? Boolean.valueOf(coin.isIsolatedEnabled()) : null;
            zBooleanValue2 = isolatedEnable != null ? isolatedEnable.booleanValue() : false;
        }
        Boolean boolValueOf4 = Boolean.valueOf(zBooleanValue2);
        String plainStringOrZero6 = toPlainStringOrZero(config.getLendMaxAmount());
        String plainStringOrZero7 = toPlainStringOrZero(config.getLendMinAmount());
        String markPriceSymbol = config.getMarkPriceSymbol();
        String str3 = markPriceSymbol == null ? "" : markPriceSymbol;
        String plainStringOrZero8 = toPlainStringOrZero(config.getMaxInterestRate());
        String plainStringOrZero9 = toPlainStringOrZero(config.getMinInterestRate());
        List<Integer> period = config.getPeriod();
        if (period != null) {
            listEmptyList = new ArrayList(CollectionsKt.collectionSizeOrDefault(period, 10));
            Iterator it = period.iterator();
            while (it.hasNext()) {
                listEmptyList.add(Double.valueOf(((Number) it.next()).intValue()));
                it = it;
                boolValueOf = boolValueOf;
            }
        } else {
            listEmptyList = null;
        }
        Boolean bool = boolValueOf;
        if (listEmptyList == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        Double dValueOf = Double.valueOf(config.getPrecision());
        String plainStringOrZero10 = toPlainStringOrZero(config.getRiskFundsRate());
        String plainStringOrZero11 = toPlainStringOrZero(config.getSevenBonusLendRate());
        String plainStringOrZero12 = toPlainStringOrZero(config.getSixMonthBonusLendRate());
        Integer sort = config.getSort();
        Double dValueOf2 = Double.valueOf(sort != null ? sort.intValue() : 1.0d);
        String plainStringOrZero13 = toPlainStringOrZero(config.getYearBonusLendRate());
        BigDecimal borrowCoefficient = config.getBorrowCoefficient();
        return new MarginCurrency(plainStringOrZero, plainStringOrZero2, strOrFallback, plainStringOrZero3, plainStringOrZero4, str, str2, plainStringOrZero5, bool, boolValueOf2, boolValueOf3, boolValueOf4, plainStringOrZero6, plainStringOrZero7, str3, plainStringOrZero8, plainStringOrZero9, listEmptyList, dValueOf, plainStringOrZero10, plainStringOrZero11, plainStringOrZero12, dValueOf2, plainStringOrZero13, borrowCoefficient != null ? borrowCoefficient.toPlainString() : null, toPlainStringOrDefault(config.getMarginCoefficient(), "1"));
    }

    private TradeTurboBridgeMapper() {
    }
}
