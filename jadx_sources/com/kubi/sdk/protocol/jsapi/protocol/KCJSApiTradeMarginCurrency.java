package com.kubi.sdk.protocol.jsapi.protocol;

import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KCJSApiTradeModule.kt */
/* JADX INFO: loaded from: classes41.dex */
@Keep
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0010\t\n\u0002\bB\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BÝ\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\f\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u0019\u001a\u00020\u0003\u0012\u0006\u0010\u001a\u001a\u00020\u0003\u0012\u0006\u0010\u001b\u001a\u00020\u0003\u0012\u0006\u0010\u001c\u001a\u00020\u0017\u0012\u0006\u0010\u001d\u001a\u00020\u0003\u0012\u0006\u0010\u001e\u001a\u00020\u0003\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010 J\t\u0010<\u001a\u00020\u0003HÆ\u0003J\t\u0010=\u001a\u00020\fHÆ\u0003J\t\u0010>\u001a\u00020\fHÆ\u0003J\t\u0010?\u001a\u00020\fHÆ\u0003J\t\u0010@\u001a\u00020\u0003HÆ\u0003J\t\u0010A\u001a\u00020\u0003HÆ\u0003J\t\u0010B\u001a\u00020\u0003HÆ\u0003J\t\u0010C\u001a\u00020\u0003HÆ\u0003J\t\u0010D\u001a\u00020\u0003HÆ\u0003J\u000f\u0010E\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016HÆ\u0003J\t\u0010F\u001a\u00020\u0017HÆ\u0003J\t\u0010G\u001a\u00020\u0003HÆ\u0003J\t\u0010H\u001a\u00020\u0003HÆ\u0003J\t\u0010I\u001a\u00020\u0003HÆ\u0003J\t\u0010J\u001a\u00020\u0003HÆ\u0003J\t\u0010K\u001a\u00020\u0017HÆ\u0003J\t\u0010L\u001a\u00020\u0003HÆ\u0003J\t\u0010M\u001a\u00020\u0003HÆ\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010O\u001a\u00020\u0003HÆ\u0003J\t\u0010P\u001a\u00020\u0003HÆ\u0003J\t\u0010Q\u001a\u00020\u0003HÆ\u0003J\t\u0010R\u001a\u00020\u0003HÆ\u0003J\t\u0010S\u001a\u00020\u0003HÆ\u0003J\t\u0010T\u001a\u00020\u0003HÆ\u0003J\t\u0010U\u001a\u00020\fHÆ\u0003J\u0095\u0002\u0010V\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00032\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0019\u001a\u00020\u00032\b\b\u0002\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u001b\u001a\u00020\u00032\b\b\u0002\u0010\u001c\u001a\u00020\u00172\b\b\u0002\u0010\u001d\u001a\u00020\u00032\b\b\u0002\u0010\u001e\u001a\u00020\u00032\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010W\u001a\u00020\f2\b\u0010X\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010Y\u001a\u00020ZHÖ\u0001J\t\u0010[\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u001f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\"R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\"R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\"R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\"R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\"R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\"R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\"R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\"R\u0011\u0010\r\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010+R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010+R\u0011\u0010\u000e\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010+R\u0011\u0010\u000f\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b,\u0010+R\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\"R\u0011\u0010\u0011\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\"R\u0011\u0010\u001e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\"R\u0011\u0010\u0012\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\"R\u0011\u0010\u0013\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\"R\u0011\u0010\u0014\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b2\u0010\"R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0011\u0010\u0018\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0011\u0010\u0019\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b7\u0010\"R\u0011\u0010\u001a\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b8\u0010\"R\u0011\u0010\u001b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b9\u0010\"R\u0011\u0010\u001c\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\b:\u00106R\u0011\u0010\u001d\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b;\u0010\"¨\u0006\\"}, m90084d2 = {"Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiTradeMarginCurrency;", "", "borrowMaxAmount", "", "borrowMinAmount", FirebaseAnalytics.Param.CURRENCY, "currencyLoanMinUnit", "feeRatio", "id", "indexSymbol", "interestRateUnit", "isDebitEnabled", "", "isBorrow", "isMarginEnabled", "isolatedEnable", "lendMaxAmount", "lendMinAmount", "markPriceSymbol", "maxInterestRate", "minInterestRate", "period", "", "", "precision", "riskFundsRate", "sevenBonusLendRate", "sixMonthBonusLendRate", "sort", "yearBonusLendRate", "marginCoefficient", "borrowCoefficient", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBorrowCoefficient", "()Ljava/lang/String;", "getBorrowMaxAmount", "getBorrowMinAmount", "getCurrency", "getCurrencyLoanMinUnit", "getFeeRatio", "getId", "getIndexSymbol", "getInterestRateUnit", "()Z", "getIsolatedEnable", "getLendMaxAmount", "getLendMinAmount", "getMarginCoefficient", "getMarkPriceSymbol", "getMaxInterestRate", "getMinInterestRate", "getPeriod", "()Ljava/util/List;", "getPrecision", "()J", "getRiskFundsRate", "getSevenBonusLendRate", "getSixMonthBonusLendRate", "getSort", "getYearBonusLendRate", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "KcProtocol_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final /* data */ class KCJSApiTradeMarginCurrency {

    @Nullable
    private final String borrowCoefficient;

    @NotNull
    private final String borrowMaxAmount;

    @NotNull
    private final String borrowMinAmount;

    @NotNull
    private final String currency;

    @NotNull
    private final String currencyLoanMinUnit;

    @NotNull
    private final String feeRatio;

    @NotNull
    private final String id;

    @NotNull
    private final String indexSymbol;

    @NotNull
    private final String interestRateUnit;
    private final boolean isBorrow;
    private final boolean isDebitEnabled;
    private final boolean isMarginEnabled;
    private final boolean isolatedEnable;

    @NotNull
    private final String lendMaxAmount;

    @NotNull
    private final String lendMinAmount;

    @NotNull
    private final String marginCoefficient;

    @NotNull
    private final String markPriceSymbol;

    @NotNull
    private final String maxInterestRate;

    @NotNull
    private final String minInterestRate;

    @NotNull
    private final List<Long> period;
    private final long precision;

    @NotNull
    private final String riskFundsRate;

    @NotNull
    private final String sevenBonusLendRate;

    @NotNull
    private final String sixMonthBonusLendRate;
    private final long sort;

    @NotNull
    private final String yearBonusLendRate;

    public KCJSApiTradeMarginCurrency(@NotNull String borrowMaxAmount, @NotNull String borrowMinAmount, @NotNull String currency, @NotNull String currencyLoanMinUnit, @NotNull String feeRatio, @NotNull String id2, @NotNull String indexSymbol, @NotNull String interestRateUnit, boolean z11, boolean z12, boolean z13, boolean z14, @NotNull String lendMaxAmount, @NotNull String lendMinAmount, @NotNull String markPriceSymbol, @NotNull String maxInterestRate, @NotNull String minInterestRate, @NotNull List<Long> period, long j11, @NotNull String riskFundsRate, @NotNull String sevenBonusLendRate, @NotNull String sixMonthBonusLendRate, long j12, @NotNull String yearBonusLendRate, @NotNull String marginCoefficient, @Nullable String str) {
        Intrinsics.checkNotNullParameter(borrowMaxAmount, "borrowMaxAmount");
        Intrinsics.checkNotNullParameter(borrowMinAmount, "borrowMinAmount");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(currencyLoanMinUnit, "currencyLoanMinUnit");
        Intrinsics.checkNotNullParameter(feeRatio, "feeRatio");
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(indexSymbol, "indexSymbol");
        Intrinsics.checkNotNullParameter(interestRateUnit, "interestRateUnit");
        Intrinsics.checkNotNullParameter(lendMaxAmount, "lendMaxAmount");
        Intrinsics.checkNotNullParameter(lendMinAmount, "lendMinAmount");
        Intrinsics.checkNotNullParameter(markPriceSymbol, "markPriceSymbol");
        Intrinsics.checkNotNullParameter(maxInterestRate, "maxInterestRate");
        Intrinsics.checkNotNullParameter(minInterestRate, "minInterestRate");
        Intrinsics.checkNotNullParameter(period, "period");
        Intrinsics.checkNotNullParameter(riskFundsRate, "riskFundsRate");
        Intrinsics.checkNotNullParameter(sevenBonusLendRate, "sevenBonusLendRate");
        Intrinsics.checkNotNullParameter(sixMonthBonusLendRate, "sixMonthBonusLendRate");
        Intrinsics.checkNotNullParameter(yearBonusLendRate, "yearBonusLendRate");
        Intrinsics.checkNotNullParameter(marginCoefficient, "marginCoefficient");
        this.borrowMaxAmount = borrowMaxAmount;
        this.borrowMinAmount = borrowMinAmount;
        this.currency = currency;
        this.currencyLoanMinUnit = currencyLoanMinUnit;
        this.feeRatio = feeRatio;
        this.id = id2;
        this.indexSymbol = indexSymbol;
        this.interestRateUnit = interestRateUnit;
        this.isDebitEnabled = z11;
        this.isBorrow = z12;
        this.isMarginEnabled = z13;
        this.isolatedEnable = z14;
        this.lendMaxAmount = lendMaxAmount;
        this.lendMinAmount = lendMinAmount;
        this.markPriceSymbol = markPriceSymbol;
        this.maxInterestRate = maxInterestRate;
        this.minInterestRate = minInterestRate;
        this.period = period;
        this.precision = j11;
        this.riskFundsRate = riskFundsRate;
        this.sevenBonusLendRate = sevenBonusLendRate;
        this.sixMonthBonusLendRate = sixMonthBonusLendRate;
        this.sort = j12;
        this.yearBonusLendRate = yearBonusLendRate;
        this.marginCoefficient = marginCoefficient;
        this.borrowCoefficient = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ KCJSApiTradeMarginCurrency copy$default(KCJSApiTradeMarginCurrency kCJSApiTradeMarginCurrency, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z11, boolean z12, boolean z13, boolean z14, String str9, String str10, String str11, String str12, String str13, List list, long j11, String str14, String str15, String str16, long j12, String str17, String str18, String str19, int i11, Object obj) {
        String str20;
        String str21;
        String str22 = (i11 & 1) != 0 ? kCJSApiTradeMarginCurrency.borrowMaxAmount : str;
        String str23 = (i11 & 2) != 0 ? kCJSApiTradeMarginCurrency.borrowMinAmount : str2;
        String str24 = (i11 & 4) != 0 ? kCJSApiTradeMarginCurrency.currency : str3;
        String str25 = (i11 & 8) != 0 ? kCJSApiTradeMarginCurrency.currencyLoanMinUnit : str4;
        String str26 = (i11 & 16) != 0 ? kCJSApiTradeMarginCurrency.feeRatio : str5;
        String str27 = (i11 & 32) != 0 ? kCJSApiTradeMarginCurrency.id : str6;
        String str28 = (i11 & 64) != 0 ? kCJSApiTradeMarginCurrency.indexSymbol : str7;
        String str29 = (i11 & 128) != 0 ? kCJSApiTradeMarginCurrency.interestRateUnit : str8;
        boolean z15 = (i11 & 256) != 0 ? kCJSApiTradeMarginCurrency.isDebitEnabled : z11;
        boolean z16 = (i11 & 512) != 0 ? kCJSApiTradeMarginCurrency.isBorrow : z12;
        boolean z17 = (i11 & 1024) != 0 ? kCJSApiTradeMarginCurrency.isMarginEnabled : z13;
        boolean z18 = (i11 & 2048) != 0 ? kCJSApiTradeMarginCurrency.isolatedEnable : z14;
        String str30 = (i11 & 4096) != 0 ? kCJSApiTradeMarginCurrency.lendMaxAmount : str9;
        String str31 = (i11 & 8192) != 0 ? kCJSApiTradeMarginCurrency.lendMinAmount : str10;
        String str32 = str22;
        String str33 = (i11 & 16384) != 0 ? kCJSApiTradeMarginCurrency.markPriceSymbol : str11;
        String str34 = (i11 & 32768) != 0 ? kCJSApiTradeMarginCurrency.maxInterestRate : str12;
        String str35 = (i11 & 65536) != 0 ? kCJSApiTradeMarginCurrency.minInterestRate : str13;
        List list2 = (i11 & 131072) != 0 ? kCJSApiTradeMarginCurrency.period : list;
        String str36 = str33;
        long j13 = (i11 & 262144) != 0 ? kCJSApiTradeMarginCurrency.precision : j11;
        String str37 = (i11 & 524288) != 0 ? kCJSApiTradeMarginCurrency.riskFundsRate : str14;
        String str38 = (i11 & 1048576) != 0 ? kCJSApiTradeMarginCurrency.sevenBonusLendRate : str15;
        String str39 = str37;
        String str40 = (i11 & 2097152) != 0 ? kCJSApiTradeMarginCurrency.sixMonthBonusLendRate : str16;
        String str41 = str38;
        long j14 = (i11 & 4194304) != 0 ? kCJSApiTradeMarginCurrency.sort : j12;
        String str42 = (i11 & 8388608) != 0 ? kCJSApiTradeMarginCurrency.yearBonusLendRate : str17;
        String str43 = (i11 & 16777216) != 0 ? kCJSApiTradeMarginCurrency.marginCoefficient : str18;
        if ((i11 & 33554432) != 0) {
            str21 = str42;
            str20 = kCJSApiTradeMarginCurrency.borrowCoefficient;
        } else {
            str20 = str19;
            str21 = str42;
        }
        return kCJSApiTradeMarginCurrency.copy(str32, str23, str24, str25, str26, str27, str28, str29, z15, z16, z17, z18, str30, str31, str36, str34, str35, list2, j13, str39, str41, str40, j14, str21, str43, str20);
    }

    @NotNull
    public final KCJSApiTradeMarginCurrency copy(@NotNull String borrowMaxAmount, @NotNull String borrowMinAmount, @NotNull String currency, @NotNull String currencyLoanMinUnit, @NotNull String feeRatio, @NotNull String id2, @NotNull String indexSymbol, @NotNull String interestRateUnit, boolean isDebitEnabled, boolean isBorrow, boolean isMarginEnabled, boolean isolatedEnable, @NotNull String lendMaxAmount, @NotNull String lendMinAmount, @NotNull String markPriceSymbol, @NotNull String maxInterestRate, @NotNull String minInterestRate, @NotNull List<Long> period, long precision, @NotNull String riskFundsRate, @NotNull String sevenBonusLendRate, @NotNull String sixMonthBonusLendRate, long sort, @NotNull String yearBonusLendRate, @NotNull String marginCoefficient, @Nullable String borrowCoefficient) {
        Intrinsics.checkNotNullParameter(borrowMaxAmount, "borrowMaxAmount");
        Intrinsics.checkNotNullParameter(borrowMinAmount, "borrowMinAmount");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(currencyLoanMinUnit, "currencyLoanMinUnit");
        Intrinsics.checkNotNullParameter(feeRatio, "feeRatio");
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(indexSymbol, "indexSymbol");
        Intrinsics.checkNotNullParameter(interestRateUnit, "interestRateUnit");
        Intrinsics.checkNotNullParameter(lendMaxAmount, "lendMaxAmount");
        Intrinsics.checkNotNullParameter(lendMinAmount, "lendMinAmount");
        Intrinsics.checkNotNullParameter(markPriceSymbol, "markPriceSymbol");
        Intrinsics.checkNotNullParameter(maxInterestRate, "maxInterestRate");
        Intrinsics.checkNotNullParameter(minInterestRate, "minInterestRate");
        Intrinsics.checkNotNullParameter(period, "period");
        Intrinsics.checkNotNullParameter(riskFundsRate, "riskFundsRate");
        Intrinsics.checkNotNullParameter(sevenBonusLendRate, "sevenBonusLendRate");
        Intrinsics.checkNotNullParameter(sixMonthBonusLendRate, "sixMonthBonusLendRate");
        Intrinsics.checkNotNullParameter(yearBonusLendRate, "yearBonusLendRate");
        Intrinsics.checkNotNullParameter(marginCoefficient, "marginCoefficient");
        return new KCJSApiTradeMarginCurrency(borrowMaxAmount, borrowMinAmount, currency, currencyLoanMinUnit, feeRatio, id2, indexSymbol, interestRateUnit, isDebitEnabled, isBorrow, isMarginEnabled, isolatedEnable, lendMaxAmount, lendMinAmount, markPriceSymbol, maxInterestRate, minInterestRate, period, precision, riskFundsRate, sevenBonusLendRate, sixMonthBonusLendRate, sort, yearBonusLendRate, marginCoefficient, borrowCoefficient);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KCJSApiTradeMarginCurrency)) {
            return false;
        }
        KCJSApiTradeMarginCurrency kCJSApiTradeMarginCurrency = (KCJSApiTradeMarginCurrency) other;
        return Intrinsics.areEqual(this.borrowMaxAmount, kCJSApiTradeMarginCurrency.borrowMaxAmount) && Intrinsics.areEqual(this.borrowMinAmount, kCJSApiTradeMarginCurrency.borrowMinAmount) && Intrinsics.areEqual(this.currency, kCJSApiTradeMarginCurrency.currency) && Intrinsics.areEqual(this.currencyLoanMinUnit, kCJSApiTradeMarginCurrency.currencyLoanMinUnit) && Intrinsics.areEqual(this.feeRatio, kCJSApiTradeMarginCurrency.feeRatio) && Intrinsics.areEqual(this.id, kCJSApiTradeMarginCurrency.id) && Intrinsics.areEqual(this.indexSymbol, kCJSApiTradeMarginCurrency.indexSymbol) && Intrinsics.areEqual(this.interestRateUnit, kCJSApiTradeMarginCurrency.interestRateUnit) && this.isDebitEnabled == kCJSApiTradeMarginCurrency.isDebitEnabled && this.isBorrow == kCJSApiTradeMarginCurrency.isBorrow && this.isMarginEnabled == kCJSApiTradeMarginCurrency.isMarginEnabled && this.isolatedEnable == kCJSApiTradeMarginCurrency.isolatedEnable && Intrinsics.areEqual(this.lendMaxAmount, kCJSApiTradeMarginCurrency.lendMaxAmount) && Intrinsics.areEqual(this.lendMinAmount, kCJSApiTradeMarginCurrency.lendMinAmount) && Intrinsics.areEqual(this.markPriceSymbol, kCJSApiTradeMarginCurrency.markPriceSymbol) && Intrinsics.areEqual(this.maxInterestRate, kCJSApiTradeMarginCurrency.maxInterestRate) && Intrinsics.areEqual(this.minInterestRate, kCJSApiTradeMarginCurrency.minInterestRate) && Intrinsics.areEqual(this.period, kCJSApiTradeMarginCurrency.period) && this.precision == kCJSApiTradeMarginCurrency.precision && Intrinsics.areEqual(this.riskFundsRate, kCJSApiTradeMarginCurrency.riskFundsRate) && Intrinsics.areEqual(this.sevenBonusLendRate, kCJSApiTradeMarginCurrency.sevenBonusLendRate) && Intrinsics.areEqual(this.sixMonthBonusLendRate, kCJSApiTradeMarginCurrency.sixMonthBonusLendRate) && this.sort == kCJSApiTradeMarginCurrency.sort && Intrinsics.areEqual(this.yearBonusLendRate, kCJSApiTradeMarginCurrency.yearBonusLendRate) && Intrinsics.areEqual(this.marginCoefficient, kCJSApiTradeMarginCurrency.marginCoefficient) && Intrinsics.areEqual(this.borrowCoefficient, kCJSApiTradeMarginCurrency.borrowCoefficient);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getBorrowMaxAmount() {
        return this.borrowMaxAmount;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final boolean getIsBorrow() {
        return this.isBorrow;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final boolean getIsMarginEnabled() {
        return this.isMarginEnabled;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final boolean getIsolatedEnable() {
        return this.isolatedEnable;
    }

    @NotNull
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getLendMaxAmount() {
        return this.lendMaxAmount;
    }

    @NotNull
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getLendMinAmount() {
        return this.lendMinAmount;
    }

    @NotNull
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getMarkPriceSymbol() {
        return this.markPriceSymbol;
    }

    @NotNull
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getMaxInterestRate() {
        return this.maxInterestRate;
    }

    @NotNull
    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getMinInterestRate() {
        return this.minInterestRate;
    }

    @NotNull
    public final List<Long> component18() {
        return this.period;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final long getPrecision() {
        return this.precision;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getBorrowMinAmount() {
        return this.borrowMinAmount;
    }

    @NotNull
    /* JADX INFO: renamed from: component20, reason: from getter */
    public final String getRiskFundsRate() {
        return this.riskFundsRate;
    }

    @NotNull
    /* JADX INFO: renamed from: component21, reason: from getter */
    public final String getSevenBonusLendRate() {
        return this.sevenBonusLendRate;
    }

    @NotNull
    /* JADX INFO: renamed from: component22, reason: from getter */
    public final String getSixMonthBonusLendRate() {
        return this.sixMonthBonusLendRate;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final long getSort() {
        return this.sort;
    }

    @NotNull
    /* JADX INFO: renamed from: component24, reason: from getter */
    public final String getYearBonusLendRate() {
        return this.yearBonusLendRate;
    }

    @NotNull
    /* JADX INFO: renamed from: component25, reason: from getter */
    public final String getMarginCoefficient() {
        return this.marginCoefficient;
    }

    @Nullable
    /* JADX INFO: renamed from: component26, reason: from getter */
    public final String getBorrowCoefficient() {
        return this.borrowCoefficient;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCurrencyLoanMinUnit() {
        return this.currencyLoanMinUnit;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getFeeRatio() {
        return this.feeRatio;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getIndexSymbol() {
        return this.indexSymbol;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getInterestRateUnit() {
        return this.interestRateUnit;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final boolean getIsDebitEnabled() {
        return this.isDebitEnabled;
    }

    @Nullable
    public final String getBorrowCoefficient() {
        return this.borrowCoefficient;
    }

    @NotNull
    public final String getBorrowMaxAmount() {
        return this.borrowMaxAmount;
    }

    @NotNull
    public final String getBorrowMinAmount() {
        return this.borrowMinAmount;
    }

    @NotNull
    public final String getCurrency() {
        return this.currency;
    }

    @NotNull
    public final String getCurrencyLoanMinUnit() {
        return this.currencyLoanMinUnit;
    }

    @NotNull
    public final String getFeeRatio() {
        return this.feeRatio;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final String getIndexSymbol() {
        return this.indexSymbol;
    }

    @NotNull
    public final String getInterestRateUnit() {
        return this.interestRateUnit;
    }

    public final boolean getIsolatedEnable() {
        return this.isolatedEnable;
    }

    @NotNull
    public final String getLendMaxAmount() {
        return this.lendMaxAmount;
    }

    @NotNull
    public final String getLendMinAmount() {
        return this.lendMinAmount;
    }

    @NotNull
    public final String getMarginCoefficient() {
        return this.marginCoefficient;
    }

    @NotNull
    public final String getMarkPriceSymbol() {
        return this.markPriceSymbol;
    }

    @NotNull
    public final String getMaxInterestRate() {
        return this.maxInterestRate;
    }

    @NotNull
    public final String getMinInterestRate() {
        return this.minInterestRate;
    }

    @NotNull
    public final List<Long> getPeriod() {
        return this.period;
    }

    public final long getPrecision() {
        return this.precision;
    }

    @NotNull
    public final String getRiskFundsRate() {
        return this.riskFundsRate;
    }

    @NotNull
    public final String getSevenBonusLendRate() {
        return this.sevenBonusLendRate;
    }

    @NotNull
    public final String getSixMonthBonusLendRate() {
        return this.sixMonthBonusLendRate;
    }

    public final long getSort() {
        return this.sort;
    }

    @NotNull
    public final String getYearBonusLendRate() {
        return this.yearBonusLendRate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [int] */
    /* JADX WARN: Type inference failed for: r0v19, types: [int] */
    /* JADX WARN: Type inference failed for: r0v21, types: [int] */
    /* JADX WARN: Type inference failed for: r0v23, types: [int] */
    /* JADX WARN: Type inference failed for: r1v15, types: [int] */
    /* JADX WARN: Type inference failed for: r1v17, types: [int] */
    /* JADX WARN: Type inference failed for: r1v19, types: [int] */
    /* JADX WARN: Type inference failed for: r1v51 */
    /* JADX WARN: Type inference failed for: r1v52 */
    /* JADX WARN: Type inference failed for: r1v53 */
    /* JADX WARN: Type inference failed for: r1v54 */
    /* JADX WARN: Type inference failed for: r1v55 */
    /* JADX WARN: Type inference failed for: r1v56 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public int hashCode() {
        int iHashCode = ((((((((((((((this.borrowMaxAmount.hashCode() * 31) + this.borrowMinAmount.hashCode()) * 31) + this.currency.hashCode()) * 31) + this.currencyLoanMinUnit.hashCode()) * 31) + this.feeRatio.hashCode()) * 31) + this.id.hashCode()) * 31) + this.indexSymbol.hashCode()) * 31) + this.interestRateUnit.hashCode()) * 31;
        boolean z11 = this.isDebitEnabled;
        ?? r11 = z11;
        if (z11) {
            r11 = 1;
        }
        int i11 = (iHashCode + r11) * 31;
        boolean z12 = this.isBorrow;
        ?? r12 = z12;
        if (z12) {
            r12 = 1;
        }
        int i12 = (i11 + r12) * 31;
        boolean z13 = this.isMarginEnabled;
        ?? r13 = z13;
        if (z13) {
            r13 = 1;
        }
        int i13 = (i12 + r13) * 31;
        boolean z14 = this.isolatedEnable;
        int iHashCode2 = (((((((((((((((((((((((((((i13 + (z14 ? 1 : z14)) * 31) + this.lendMaxAmount.hashCode()) * 31) + this.lendMinAmount.hashCode()) * 31) + this.markPriceSymbol.hashCode()) * 31) + this.maxInterestRate.hashCode()) * 31) + this.minInterestRate.hashCode()) * 31) + this.period.hashCode()) * 31) + Long.hashCode(this.precision)) * 31) + this.riskFundsRate.hashCode()) * 31) + this.sevenBonusLendRate.hashCode()) * 31) + this.sixMonthBonusLendRate.hashCode()) * 31) + Long.hashCode(this.sort)) * 31) + this.yearBonusLendRate.hashCode()) * 31) + this.marginCoefficient.hashCode()) * 31;
        String str = this.borrowCoefficient;
        return iHashCode2 + (str == null ? 0 : str.hashCode());
    }

    public final boolean isBorrow() {
        return this.isBorrow;
    }

    public final boolean isDebitEnabled() {
        return this.isDebitEnabled;
    }

    public final boolean isMarginEnabled() {
        return this.isMarginEnabled;
    }

    @NotNull
    public String toString() {
        return "KCJSApiTradeMarginCurrency(borrowMaxAmount=" + this.borrowMaxAmount + ", borrowMinAmount=" + this.borrowMinAmount + ", currency=" + this.currency + ", currencyLoanMinUnit=" + this.currencyLoanMinUnit + ", feeRatio=" + this.feeRatio + ", id=" + this.id + ", indexSymbol=" + this.indexSymbol + ", interestRateUnit=" + this.interestRateUnit + ", isDebitEnabled=" + this.isDebitEnabled + ", isBorrow=" + this.isBorrow + ", isMarginEnabled=" + this.isMarginEnabled + ", isolatedEnable=" + this.isolatedEnable + ", lendMaxAmount=" + this.lendMaxAmount + ", lendMinAmount=" + this.lendMinAmount + ", markPriceSymbol=" + this.markPriceSymbol + ", maxInterestRate=" + this.maxInterestRate + ", minInterestRate=" + this.minInterestRate + ", period=" + this.period + ", precision=" + this.precision + ", riskFundsRate=" + this.riskFundsRate + ", sevenBonusLendRate=" + this.sevenBonusLendRate + ", sixMonthBonusLendRate=" + this.sixMonthBonusLendRate + ", sort=" + this.sort + ", yearBonusLendRate=" + this.yearBonusLendRate + ", marginCoefficient=" + this.marginCoefficient + ", borrowCoefficient=" + this.borrowCoefficient + ')';
    }
}
