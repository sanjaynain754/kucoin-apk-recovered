package com.kubi.p110rn.core.turbo;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: NativeTradeTurboModule.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0010\u0006\n\u0002\b(\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BÅ\u0002\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b \u0010!J\b\u0010?\u001a\u00020@H\u0016J\u000b\u0010A\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010I\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010+J\u0010\u0010J\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010+J\u0010\u0010K\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010+J\u0010\u0010L\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010+J\u000b\u0010M\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010R\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016HÆ\u0003J\u0010\u0010S\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0002\u00106J\u000b\u0010T\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010U\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010V\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010W\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0002\u00106J\u000b\u0010X\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010Y\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010Z\u001a\u0004\u0018\u00010\u0003HÆ\u0003JÌ\u0002\u0010[\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00162\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\\J\u0013\u0010]\u001a\u00020\f2\b\u0010^\u001a\u0004\u0018\u00010_HÖ\u0003J\t\u0010`\u001a\u00020aHÖ\u0001J\t\u0010b\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010#R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010#R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010#R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010#R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010#R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010#R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010#R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010,\u001a\u0004\b\u000b\u0010+R\u0015\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010,\u001a\u0004\b\r\u0010+R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010,\u001a\u0004\b\u000e\u0010+R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010,\u001a\u0004\b-\u0010+R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b.\u0010#R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b/\u0010#R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b0\u0010#R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b1\u0010#R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b2\u0010#R\u0019\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0015\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\n\n\u0002\u00107\u001a\u0004\b5\u00106R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b8\u0010#R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b9\u0010#R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b:\u0010#R\u0015\u0010\u001c\u001a\u0004\u0018\u00010\u0017¢\u0006\n\n\u0002\u00107\u001a\u0004\b;\u00106R\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b<\u0010#R\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b=\u0010#R\u0013\u0010\u001f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b>\u0010#¨\u0006c"}, m90084d2 = {"Lcom/kubi/rn/core/turbo/MarginCurrency;", "Lcom/kubi/rn/core/turbo/WritableMapSerializable;", "borrowMaxAmount", "", "borrowMinAmount", FirebaseAnalytics.Param.CURRENCY, "currencyLoanMinUnit", "feeRatio", "id", "indexSymbol", "interestRateUnit", "isDebitEnabled", "", "isBorrow", "isMarginEnabled", "isolatedEnable", "lendMaxAmount", "lendMinAmount", "markPriceSymbol", "maxInterestRate", "minInterestRate", "period", "", "", "precision", "riskFundsRate", "sevenBonusLendRate", "sixMonthBonusLendRate", "sort", "yearBonusLendRate", "borrowCoefficient", "marginCoefficient", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBorrowMaxAmount", "()Ljava/lang/String;", "getBorrowMinAmount", "getCurrency", "getCurrencyLoanMinUnit", "getFeeRatio", "getId", "getIndexSymbol", "getInterestRateUnit", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getIsolatedEnable", "getLendMaxAmount", "getLendMinAmount", "getMarkPriceSymbol", "getMaxInterestRate", "getMinInterestRate", "getPeriod", "()Ljava/util/List;", "getPrecision", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getRiskFundsRate", "getSevenBonusLendRate", "getSixMonthBonusLendRate", "getSort", "getYearBonusLendRate", "getBorrowCoefficient", "getMarginCoefficient", "toWritableMap", "Lcom/facebook/react/bridge/WritableMap;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/kubi/rn/core/turbo/MarginCurrency;", "equals", "other", "", "hashCode", "", "toString", "app_modules_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nNativeTradeTurboModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NativeTradeTurboModule.kt\ncom/kubi/rn/core/turbo/MarginCurrency\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,385:1\n1#2:386\n1863#3,2:387\n*S KotlinDebug\n*F\n+ 1 NativeTradeTurboModule.kt\ncom/kubi/rn/core/turbo/MarginCurrency\n*L\n163#1:387,2\n*E\n"})
public final /* data */ class MarginCurrency implements WritableMapSerializable {

    @Nullable
    private final String borrowCoefficient;

    @Nullable
    private final String borrowMaxAmount;

    @Nullable
    private final String borrowMinAmount;

    @Nullable
    private final String currency;

    @Nullable
    private final String currencyLoanMinUnit;

    @Nullable
    private final String feeRatio;

    @Nullable
    private final String id;

    @Nullable
    private final String indexSymbol;

    @Nullable
    private final String interestRateUnit;

    @Nullable
    private final Boolean isBorrow;

    @Nullable
    private final Boolean isDebitEnabled;

    @Nullable
    private final Boolean isMarginEnabled;

    @Nullable
    private final Boolean isolatedEnable;

    @Nullable
    private final String lendMaxAmount;

    @Nullable
    private final String lendMinAmount;

    @Nullable
    private final String marginCoefficient;

    @Nullable
    private final String markPriceSymbol;

    @Nullable
    private final String maxInterestRate;

    @Nullable
    private final String minInterestRate;

    @Nullable
    private final List<Double> period;

    @Nullable
    private final Double precision;

    @Nullable
    private final String riskFundsRate;

    @Nullable
    private final String sevenBonusLendRate;

    @Nullable
    private final String sixMonthBonusLendRate;

    @Nullable
    private final Double sort;

    @Nullable
    private final String yearBonusLendRate;

    public MarginCurrency() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 67108863, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MarginCurrency copy$default(MarginCurrency marginCurrency, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, String str9, String str10, String str11, String str12, String str13, List list, Double d11, String str14, String str15, String str16, Double d12, String str17, String str18, String str19, int i11, Object obj) {
        String str20;
        String str21;
        String str22 = (i11 & 1) != 0 ? marginCurrency.borrowMaxAmount : str;
        String str23 = (i11 & 2) != 0 ? marginCurrency.borrowMinAmount : str2;
        String str24 = (i11 & 4) != 0 ? marginCurrency.currency : str3;
        String str25 = (i11 & 8) != 0 ? marginCurrency.currencyLoanMinUnit : str4;
        String str26 = (i11 & 16) != 0 ? marginCurrency.feeRatio : str5;
        String str27 = (i11 & 32) != 0 ? marginCurrency.id : str6;
        String str28 = (i11 & 64) != 0 ? marginCurrency.indexSymbol : str7;
        String str29 = (i11 & 128) != 0 ? marginCurrency.interestRateUnit : str8;
        Boolean bool5 = (i11 & 256) != 0 ? marginCurrency.isDebitEnabled : bool;
        Boolean bool6 = (i11 & 512) != 0 ? marginCurrency.isBorrow : bool2;
        Boolean bool7 = (i11 & 1024) != 0 ? marginCurrency.isMarginEnabled : bool3;
        Boolean bool8 = (i11 & 2048) != 0 ? marginCurrency.isolatedEnable : bool4;
        String str30 = (i11 & 4096) != 0 ? marginCurrency.lendMaxAmount : str9;
        String str31 = (i11 & 8192) != 0 ? marginCurrency.lendMinAmount : str10;
        String str32 = str22;
        String str33 = (i11 & 16384) != 0 ? marginCurrency.markPriceSymbol : str11;
        String str34 = (i11 & 32768) != 0 ? marginCurrency.maxInterestRate : str12;
        String str35 = (i11 & 65536) != 0 ? marginCurrency.minInterestRate : str13;
        List list2 = (i11 & 131072) != 0 ? marginCurrency.period : list;
        Double d13 = (i11 & 262144) != 0 ? marginCurrency.precision : d11;
        String str36 = (i11 & 524288) != 0 ? marginCurrency.riskFundsRate : str14;
        String str37 = (i11 & 1048576) != 0 ? marginCurrency.sevenBonusLendRate : str15;
        String str38 = (i11 & 2097152) != 0 ? marginCurrency.sixMonthBonusLendRate : str16;
        Double d14 = (i11 & 4194304) != 0 ? marginCurrency.sort : d12;
        String str39 = (i11 & 8388608) != 0 ? marginCurrency.yearBonusLendRate : str17;
        String str40 = (i11 & 16777216) != 0 ? marginCurrency.borrowCoefficient : str18;
        if ((i11 & 33554432) != 0) {
            str21 = str40;
            str20 = marginCurrency.marginCoefficient;
        } else {
            str20 = str19;
            str21 = str40;
        }
        return marginCurrency.copy(str32, str23, str24, str25, str26, str27, str28, str29, bool5, bool6, bool7, bool8, str30, str31, str33, str34, str35, list2, d13, str36, str37, str38, d14, str39, str21, str20);
    }

    @NotNull
    public final MarginCurrency copy(@Nullable String borrowMaxAmount, @Nullable String borrowMinAmount, @Nullable String currency, @Nullable String currencyLoanMinUnit, @Nullable String feeRatio, @Nullable String id2, @Nullable String indexSymbol, @Nullable String interestRateUnit, @Nullable Boolean isDebitEnabled, @Nullable Boolean isBorrow, @Nullable Boolean isMarginEnabled, @Nullable Boolean isolatedEnable, @Nullable String lendMaxAmount, @Nullable String lendMinAmount, @Nullable String markPriceSymbol, @Nullable String maxInterestRate, @Nullable String minInterestRate, @Nullable List<Double> period, @Nullable Double precision, @Nullable String riskFundsRate, @Nullable String sevenBonusLendRate, @Nullable String sixMonthBonusLendRate, @Nullable Double sort, @Nullable String yearBonusLendRate, @Nullable String borrowCoefficient, @Nullable String marginCoefficient) {
        return new MarginCurrency(borrowMaxAmount, borrowMinAmount, currency, currencyLoanMinUnit, feeRatio, id2, indexSymbol, interestRateUnit, isDebitEnabled, isBorrow, isMarginEnabled, isolatedEnable, lendMaxAmount, lendMinAmount, markPriceSymbol, maxInterestRate, minInterestRate, period, precision, riskFundsRate, sevenBonusLendRate, sixMonthBonusLendRate, sort, yearBonusLendRate, borrowCoefficient, marginCoefficient);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MarginCurrency)) {
            return false;
        }
        MarginCurrency marginCurrency = (MarginCurrency) other;
        return Intrinsics.areEqual(this.borrowMaxAmount, marginCurrency.borrowMaxAmount) && Intrinsics.areEqual(this.borrowMinAmount, marginCurrency.borrowMinAmount) && Intrinsics.areEqual(this.currency, marginCurrency.currency) && Intrinsics.areEqual(this.currencyLoanMinUnit, marginCurrency.currencyLoanMinUnit) && Intrinsics.areEqual(this.feeRatio, marginCurrency.feeRatio) && Intrinsics.areEqual(this.id, marginCurrency.id) && Intrinsics.areEqual(this.indexSymbol, marginCurrency.indexSymbol) && Intrinsics.areEqual(this.interestRateUnit, marginCurrency.interestRateUnit) && Intrinsics.areEqual(this.isDebitEnabled, marginCurrency.isDebitEnabled) && Intrinsics.areEqual(this.isBorrow, marginCurrency.isBorrow) && Intrinsics.areEqual(this.isMarginEnabled, marginCurrency.isMarginEnabled) && Intrinsics.areEqual(this.isolatedEnable, marginCurrency.isolatedEnable) && Intrinsics.areEqual(this.lendMaxAmount, marginCurrency.lendMaxAmount) && Intrinsics.areEqual(this.lendMinAmount, marginCurrency.lendMinAmount) && Intrinsics.areEqual(this.markPriceSymbol, marginCurrency.markPriceSymbol) && Intrinsics.areEqual(this.maxInterestRate, marginCurrency.maxInterestRate) && Intrinsics.areEqual(this.minInterestRate, marginCurrency.minInterestRate) && Intrinsics.areEqual(this.period, marginCurrency.period) && Intrinsics.areEqual((Object) this.precision, (Object) marginCurrency.precision) && Intrinsics.areEqual(this.riskFundsRate, marginCurrency.riskFundsRate) && Intrinsics.areEqual(this.sevenBonusLendRate, marginCurrency.sevenBonusLendRate) && Intrinsics.areEqual(this.sixMonthBonusLendRate, marginCurrency.sixMonthBonusLendRate) && Intrinsics.areEqual((Object) this.sort, (Object) marginCurrency.sort) && Intrinsics.areEqual(this.yearBonusLendRate, marginCurrency.yearBonusLendRate) && Intrinsics.areEqual(this.borrowCoefficient, marginCurrency.borrowCoefficient) && Intrinsics.areEqual(this.marginCoefficient, marginCurrency.marginCoefficient);
    }

    public MarginCurrency(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable Boolean bool4, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable List<Double> list, @Nullable Double d11, @Nullable String str14, @Nullable String str15, @Nullable String str16, @Nullable Double d12, @Nullable String str17, @Nullable String str18, @Nullable String str19) {
        this.borrowMaxAmount = str;
        this.borrowMinAmount = str2;
        this.currency = str3;
        this.currencyLoanMinUnit = str4;
        this.feeRatio = str5;
        this.id = str6;
        this.indexSymbol = str7;
        this.interestRateUnit = str8;
        this.isDebitEnabled = bool;
        this.isBorrow = bool2;
        this.isMarginEnabled = bool3;
        this.isolatedEnable = bool4;
        this.lendMaxAmount = str9;
        this.lendMinAmount = str10;
        this.markPriceSymbol = str11;
        this.maxInterestRate = str12;
        this.minInterestRate = str13;
        this.period = list;
        this.precision = d11;
        this.riskFundsRate = str14;
        this.sevenBonusLendRate = str15;
        this.sixMonthBonusLendRate = str16;
        this.sort = d12;
        this.yearBonusLendRate = str17;
        this.borrowCoefficient = str18;
        this.marginCoefficient = str19;
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getBorrowMaxAmount() {
        return this.borrowMaxAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Boolean getIsBorrow() {
        return this.isBorrow;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Boolean getIsMarginEnabled() {
        return this.isMarginEnabled;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Boolean getIsolatedEnable() {
        return this.isolatedEnable;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getLendMaxAmount() {
        return this.lendMaxAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getLendMinAmount() {
        return this.lendMinAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getMarkPriceSymbol() {
        return this.markPriceSymbol;
    }

    @Nullable
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getMaxInterestRate() {
        return this.maxInterestRate;
    }

    @Nullable
    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getMinInterestRate() {
        return this.minInterestRate;
    }

    @Nullable
    public final List<Double> component18() {
        return this.period;
    }

    @Nullable
    /* JADX INFO: renamed from: component19, reason: from getter */
    public final Double getPrecision() {
        return this.precision;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getBorrowMinAmount() {
        return this.borrowMinAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component20, reason: from getter */
    public final String getRiskFundsRate() {
        return this.riskFundsRate;
    }

    @Nullable
    /* JADX INFO: renamed from: component21, reason: from getter */
    public final String getSevenBonusLendRate() {
        return this.sevenBonusLendRate;
    }

    @Nullable
    /* JADX INFO: renamed from: component22, reason: from getter */
    public final String getSixMonthBonusLendRate() {
        return this.sixMonthBonusLendRate;
    }

    @Nullable
    /* JADX INFO: renamed from: component23, reason: from getter */
    public final Double getSort() {
        return this.sort;
    }

    @Nullable
    /* JADX INFO: renamed from: component24, reason: from getter */
    public final String getYearBonusLendRate() {
        return this.yearBonusLendRate;
    }

    @Nullable
    /* JADX INFO: renamed from: component25, reason: from getter */
    public final String getBorrowCoefficient() {
        return this.borrowCoefficient;
    }

    @Nullable
    /* JADX INFO: renamed from: component26, reason: from getter */
    public final String getMarginCoefficient() {
        return this.marginCoefficient;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCurrencyLoanMinUnit() {
        return this.currencyLoanMinUnit;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getFeeRatio() {
        return this.feeRatio;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getIndexSymbol() {
        return this.indexSymbol;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getInterestRateUnit() {
        return this.interestRateUnit;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Boolean getIsDebitEnabled() {
        return this.isDebitEnabled;
    }

    @Nullable
    public final String getBorrowCoefficient() {
        return this.borrowCoefficient;
    }

    @Nullable
    public final String getBorrowMaxAmount() {
        return this.borrowMaxAmount;
    }

    @Nullable
    public final String getBorrowMinAmount() {
        return this.borrowMinAmount;
    }

    @Nullable
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    public final String getCurrencyLoanMinUnit() {
        return this.currencyLoanMinUnit;
    }

    @Nullable
    public final String getFeeRatio() {
        return this.feeRatio;
    }

    @Nullable
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final String getIndexSymbol() {
        return this.indexSymbol;
    }

    @Nullable
    public final String getInterestRateUnit() {
        return this.interestRateUnit;
    }

    @Nullable
    public final Boolean getIsolatedEnable() {
        return this.isolatedEnable;
    }

    @Nullable
    public final String getLendMaxAmount() {
        return this.lendMaxAmount;
    }

    @Nullable
    public final String getLendMinAmount() {
        return this.lendMinAmount;
    }

    @Nullable
    public final String getMarginCoefficient() {
        return this.marginCoefficient;
    }

    @Nullable
    public final String getMarkPriceSymbol() {
        return this.markPriceSymbol;
    }

    @Nullable
    public final String getMaxInterestRate() {
        return this.maxInterestRate;
    }

    @Nullable
    public final String getMinInterestRate() {
        return this.minInterestRate;
    }

    @Nullable
    public final List<Double> getPeriod() {
        return this.period;
    }

    @Nullable
    public final Double getPrecision() {
        return this.precision;
    }

    @Nullable
    public final String getRiskFundsRate() {
        return this.riskFundsRate;
    }

    @Nullable
    public final String getSevenBonusLendRate() {
        return this.sevenBonusLendRate;
    }

    @Nullable
    public final String getSixMonthBonusLendRate() {
        return this.sixMonthBonusLendRate;
    }

    @Nullable
    public final Double getSort() {
        return this.sort;
    }

    @Nullable
    public final String getYearBonusLendRate() {
        return this.yearBonusLendRate;
    }

    public int hashCode() {
        String str = this.borrowMaxAmount;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.borrowMinAmount;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.currency;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.currencyLoanMinUnit;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.feeRatio;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.id;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.indexSymbol;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.interestRateUnit;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Boolean bool = this.isDebitEnabled;
        int iHashCode9 = (iHashCode8 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isBorrow;
        int iHashCode10 = (iHashCode9 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.isMarginEnabled;
        int iHashCode11 = (iHashCode10 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.isolatedEnable;
        int iHashCode12 = (iHashCode11 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        String str9 = this.lendMaxAmount;
        int iHashCode13 = (iHashCode12 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.lendMinAmount;
        int iHashCode14 = (iHashCode13 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.markPriceSymbol;
        int iHashCode15 = (iHashCode14 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.maxInterestRate;
        int iHashCode16 = (iHashCode15 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.minInterestRate;
        int iHashCode17 = (iHashCode16 + (str13 == null ? 0 : str13.hashCode())) * 31;
        List<Double> list = this.period;
        int iHashCode18 = (iHashCode17 + (list == null ? 0 : list.hashCode())) * 31;
        Double d11 = this.precision;
        int iHashCode19 = (iHashCode18 + (d11 == null ? 0 : d11.hashCode())) * 31;
        String str14 = this.riskFundsRate;
        int iHashCode20 = (iHashCode19 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.sevenBonusLendRate;
        int iHashCode21 = (iHashCode20 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.sixMonthBonusLendRate;
        int iHashCode22 = (iHashCode21 + (str16 == null ? 0 : str16.hashCode())) * 31;
        Double d12 = this.sort;
        int iHashCode23 = (iHashCode22 + (d12 == null ? 0 : d12.hashCode())) * 31;
        String str17 = this.yearBonusLendRate;
        int iHashCode24 = (iHashCode23 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.borrowCoefficient;
        int iHashCode25 = (iHashCode24 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.marginCoefficient;
        return iHashCode25 + (str19 != null ? str19.hashCode() : 0);
    }

    @Nullable
    public final Boolean isBorrow() {
        return this.isBorrow;
    }

    @Nullable
    public final Boolean isDebitEnabled() {
        return this.isDebitEnabled;
    }

    @Nullable
    public final Boolean isMarginEnabled() {
        return this.isMarginEnabled;
    }

    @NotNull
    public String toString() {
        return "MarginCurrency(borrowMaxAmount=" + this.borrowMaxAmount + ", borrowMinAmount=" + this.borrowMinAmount + ", currency=" + this.currency + ", currencyLoanMinUnit=" + this.currencyLoanMinUnit + ", feeRatio=" + this.feeRatio + ", id=" + this.id + ", indexSymbol=" + this.indexSymbol + ", interestRateUnit=" + this.interestRateUnit + ", isDebitEnabled=" + this.isDebitEnabled + ", isBorrow=" + this.isBorrow + ", isMarginEnabled=" + this.isMarginEnabled + ", isolatedEnable=" + this.isolatedEnable + ", lendMaxAmount=" + this.lendMaxAmount + ", lendMinAmount=" + this.lendMinAmount + ", markPriceSymbol=" + this.markPriceSymbol + ", maxInterestRate=" + this.maxInterestRate + ", minInterestRate=" + this.minInterestRate + ", period=" + this.period + ", precision=" + this.precision + ", riskFundsRate=" + this.riskFundsRate + ", sevenBonusLendRate=" + this.sevenBonusLendRate + ", sixMonthBonusLendRate=" + this.sixMonthBonusLendRate + ", sort=" + this.sort + ", yearBonusLendRate=" + this.yearBonusLendRate + ", borrowCoefficient=" + this.borrowCoefficient + ", marginCoefficient=" + this.marginCoefficient + ")";
    }

    @Override // com.kubi.p110rn.core.turbo.WritableMapSerializable
    @NotNull
    public WritableMap toWritableMap() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        String str = this.borrowMaxAmount;
        if (str != null) {
            writableMapCreateMap.putString("borrowMaxAmount", str.toString());
        }
        String str2 = this.borrowMinAmount;
        if (str2 != null) {
            writableMapCreateMap.putString("borrowMinAmount", str2.toString());
        }
        String str3 = this.currency;
        if (str3 != null) {
            writableMapCreateMap.putString(FirebaseAnalytics.Param.CURRENCY, str3.toString());
        }
        String str4 = this.currencyLoanMinUnit;
        if (str4 != null) {
            writableMapCreateMap.putString("currencyLoanMinUnit", str4.toString());
        }
        String str5 = this.feeRatio;
        if (str5 != null) {
            writableMapCreateMap.putString("feeRatio", str5.toString());
        }
        String str6 = this.id;
        if (str6 != null) {
            writableMapCreateMap.putString("id", str6.toString());
        }
        String str7 = this.indexSymbol;
        if (str7 != null) {
            writableMapCreateMap.putString("indexSymbol", str7.toString());
        }
        String str8 = this.interestRateUnit;
        if (str8 != null) {
            writableMapCreateMap.putString("interestRateUnit", str8.toString());
        }
        Boolean bool = this.isDebitEnabled;
        if (bool != null) {
            writableMapCreateMap.putBoolean("isDebitEnabled", bool.booleanValue());
        }
        Boolean bool2 = this.isBorrow;
        if (bool2 != null) {
            writableMapCreateMap.putBoolean("isBorrow", bool2.booleanValue());
        }
        Boolean bool3 = this.isMarginEnabled;
        if (bool3 != null) {
            writableMapCreateMap.putBoolean("isMarginEnabled", bool3.booleanValue());
        }
        Boolean bool4 = this.isolatedEnable;
        if (bool4 != null) {
            writableMapCreateMap.putBoolean("isolatedEnable", bool4.booleanValue());
        }
        String str9 = this.lendMaxAmount;
        if (str9 != null) {
            writableMapCreateMap.putString("lendMaxAmount", str9.toString());
        }
        String str10 = this.lendMinAmount;
        if (str10 != null) {
            writableMapCreateMap.putString("lendMinAmount", str10.toString());
        }
        String str11 = this.markPriceSymbol;
        if (str11 != null) {
            writableMapCreateMap.putString("markPriceSymbol", str11.toString());
        }
        String str12 = this.maxInterestRate;
        if (str12 != null) {
            writableMapCreateMap.putString("maxInterestRate", str12.toString());
        }
        String str13 = this.minInterestRate;
        if (str13 != null) {
            writableMapCreateMap.putString("minInterestRate", str13.toString());
        }
        List<Double> list = this.period;
        if (list != null) {
            WritableArray writableArrayCreateArray = Arguments.createArray();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                writableArrayCreateArray.pushDouble(((Number) it.next()).doubleValue());
            }
            writableMapCreateMap.putArray("period", writableArrayCreateArray);
        }
        Double d11 = this.precision;
        if (d11 != null) {
            writableMapCreateMap.putDouble("precision", d11.doubleValue());
        }
        String str14 = this.riskFundsRate;
        if (str14 != null) {
            writableMapCreateMap.putString("riskFundsRate", str14.toString());
        }
        String str15 = this.sevenBonusLendRate;
        if (str15 != null) {
            writableMapCreateMap.putString("sevenBonusLendRate", str15.toString());
        }
        String str16 = this.sixMonthBonusLendRate;
        if (str16 != null) {
            writableMapCreateMap.putString("sixMonthBonusLendRate", str16.toString());
        }
        Double d12 = this.sort;
        if (d12 != null) {
            writableMapCreateMap.putDouble("sort", d12.doubleValue());
        }
        String str17 = this.yearBonusLendRate;
        if (str17 != null) {
            writableMapCreateMap.putString("yearBonusLendRate", str17.toString());
        }
        String str18 = this.borrowCoefficient;
        if (str18 != null) {
            writableMapCreateMap.putString("borrowCoefficient", str18.toString());
        }
        String str19 = this.marginCoefficient;
        if (str19 != null) {
            writableMapCreateMap.putString("marginCoefficient", str19.toString());
        }
        Intrinsics.checkNotNull(writableMapCreateMap);
        return writableMapCreateMap;
    }

    public /* synthetic */ MarginCurrency(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, String str9, String str10, String str11, String str12, String str13, List list, Double d11, String str14, String str15, String str16, Double d12, String str17, String str18, String str19, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4, (i11 & 16) != 0 ? null : str5, (i11 & 32) != 0 ? null : str6, (i11 & 64) != 0 ? null : str7, (i11 & 128) != 0 ? null : str8, (i11 & 256) != 0 ? null : bool, (i11 & 512) != 0 ? null : bool2, (i11 & 1024) != 0 ? null : bool3, (i11 & 2048) != 0 ? null : bool4, (i11 & 4096) != 0 ? null : str9, (i11 & 8192) != 0 ? null : str10, (i11 & 16384) != 0 ? null : str11, (i11 & 32768) != 0 ? null : str12, (i11 & 65536) != 0 ? null : str13, (i11 & 131072) != 0 ? null : list, (i11 & 262144) != 0 ? null : d11, (i11 & 524288) != 0 ? null : str14, (i11 & 1048576) != 0 ? null : str15, (i11 & 2097152) != 0 ? null : str16, (i11 & 4194304) != 0 ? null : d12, (i11 & 8388608) != 0 ? null : str17, (i11 & 16777216) != 0 ? null : str18, (i11 & 33554432) != 0 ? null : str19);
    }
}
