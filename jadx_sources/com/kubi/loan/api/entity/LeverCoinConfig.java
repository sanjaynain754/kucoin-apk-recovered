package com.kubi.loan.api.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.media3.common.C2711C;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.sdk.BaseConstants;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: LeverCoinConfig.kt */
/* JADX INFO: loaded from: classes12.dex */
@Keep
@Metadata(m90083d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\bw\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BÙ\u0002\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000b\u0012\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b$\u0010%J\t\u0010j\u001a\u00020\u0003HÆ\u0003J\t\u0010k\u001a\u00020\u0003HÆ\u0003J\t\u0010l\u001a\u00020\u0006HÆ\u0003J\t\u0010m\u001a\u00020\u0006HÆ\u0003J\t\u0010n\u001a\u00020\tHÆ\u0003J\t\u0010o\u001a\u00020\u000bHÆ\u0003J\t\u0010p\u001a\u00020\u000bHÆ\u0003J\t\u0010q\u001a\u00020\u000bHÆ\u0003J\u000b\u0010r\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010s\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010t\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010u\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010v\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0011\u0010w\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0014HÆ\u0003J\u000b\u0010x\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010y\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010z\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010{\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010|\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010SJ\u0010\u0010}\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010WJ\u0010\u0010~\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010WJ\u000b\u0010\u007f\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\f\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\f\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0011\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010WJ\u0011\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010WJ\u0011\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010WJ\f\u0010\u0085\u0001\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\f\u0010\u0086\u0001\u001a\u0004\u0018\u00010\u000bHÆ\u0003Jâ\u0002\u0010\u0087\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000b2\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0003\u0010\u0088\u0001J\u0007\u0010\u0089\u0001\u001a\u00020\tJ\u0016\u0010\u008a\u0001\u001a\u00020\u00062\n\u0010\u008b\u0001\u001a\u0005\u0018\u00010\u008c\u0001HÖ\u0003J\n\u0010\u008d\u0001\u001a\u00020\tHÖ\u0001J\n\u0010\u008e\u0001\u001a\u00020\u0003HÖ\u0001J\u001b\u0010\u008f\u0001\u001a\u00030\u0090\u00012\b\u0010\u0091\u0001\u001a\u00030\u0092\u00012\u0007\u0010\u0093\u0001\u001a\u00020\tR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010'\"\u0004\b+\u0010)R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010,\"\u0004\b-\u0010.R\u001a\u0010\u0007\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010,\"\u0004\b/\u0010.R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u001a\u0010\f\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u00105\"\u0004\b9\u00107R\u001a\u0010\r\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u00105\"\u0004\b;\u00107R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u00105\"\u0004\b=\u00107R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u00105\"\u0004\b?\u00107R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u00105\"\u0004\bA\u00107R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bB\u00105\"\u0004\bC\u00107R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u00105\"\u0004\bE\u00107R\"\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bJ\u00105\"\u0004\bK\u00107R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bL\u00105\"\u0004\bM\u00107R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bN\u0010'\"\u0004\bO\u0010)R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bP\u0010'\"\u0004\bQ\u0010)R\u001e\u0010\u0019\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u0010\n\u0002\u0010V\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR\u001e\u0010\u001a\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u0010\n\u0002\u0010Z\u001a\u0004\b\u001a\u0010W\"\u0004\bX\u0010YR\u001e\u0010\u001b\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u0010\n\u0002\u0010Z\u001a\u0004\b\u001b\u0010W\"\u0004\b[\u0010YR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\\\u00105\"\u0004\b]\u00107R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b^\u00105\"\u0004\b_\u00107R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b`\u00105\"\u0004\ba\u00107R\u001e\u0010\u001f\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u0010\n\u0002\u0010Z\u001a\u0004\bb\u0010W\"\u0004\bc\u0010YR\u001e\u0010 \u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u0010\n\u0002\u0010Z\u001a\u0004\bd\u0010W\"\u0004\be\u0010YR\u001e\u0010!\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u0010\n\u0002\u0010Z\u001a\u0004\bf\u0010W\"\u0004\bg\u0010YR\u0013\u0010\"\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\bh\u00105R\u0013\u0010#\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\bi\u00105¨\u0006\u0094\u0001"}, m90084d2 = {"Lcom/kubi/loan/api/entity/LeverCoinConfig;", "Landroid/os/Parcelable;", "id", "", FirebaseAnalytics.Param.CURRENCY, "isBorrow", "", "isMarginEnabled", "precision", "", "borrowMinAmount", "Ljava/math/BigDecimal;", "borrowMaxAmount", "currencyLoanMinUnit", "lendMaxAmount", "lendMinAmount", "maxInterestRate", "minInterestRate", "interestRateUnit", "period", "", "riskFundsRate", "feeRatio", "indexSymbol", "markPriceSymbol", "sort", "isDebitEnabled", "isTransferIn", "sevenBonusLendRate", "yearBonusLendRate", "sixMonthBonusLendRate", "isolatedEnable", "isolatedBorrow", "isolatedTransferIn", "borrowCoefficient", "marginCoefficient", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZZILjava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/util/List;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/math/BigDecimal;Ljava/math/BigDecimal;)V", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "getCurrency", "setCurrency", "()Z", "setBorrow", "(Z)V", "setMarginEnabled", "getPrecision", "()I", "setPrecision", "(I)V", "getBorrowMinAmount", "()Ljava/math/BigDecimal;", "setBorrowMinAmount", "(Ljava/math/BigDecimal;)V", "getBorrowMaxAmount", "setBorrowMaxAmount", "getCurrencyLoanMinUnit", "setCurrencyLoanMinUnit", "getLendMaxAmount", "setLendMaxAmount", "getLendMinAmount", "setLendMinAmount", "getMaxInterestRate", "setMaxInterestRate", "getMinInterestRate", "setMinInterestRate", "getInterestRateUnit", "setInterestRateUnit", "getPeriod", "()Ljava/util/List;", "setPeriod", "(Ljava/util/List;)V", "getRiskFundsRate", "setRiskFundsRate", "getFeeRatio", "setFeeRatio", "getIndexSymbol", "setIndexSymbol", "getMarkPriceSymbol", "setMarkPriceSymbol", "getSort", "()Ljava/lang/Integer;", "setSort", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "()Ljava/lang/Boolean;", "setDebitEnabled", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "setTransferIn", "getSevenBonusLendRate", "setSevenBonusLendRate", "getYearBonusLendRate", "setYearBonusLendRate", "getSixMonthBonusLendRate", "setSixMonthBonusLendRate", "getIsolatedEnable", "setIsolatedEnable", "getIsolatedBorrow", "setIsolatedBorrow", "getIsolatedTransferIn", "setIsolatedTransferIn", "getBorrowCoefficient", "getMarginCoefficient", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "copy", "(Ljava/lang/String;Ljava/lang/String;ZZILjava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/util/List;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/math/BigDecimal;Ljava/math/BigDecimal;)Lcom/kubi/loan/api/entity/LeverCoinConfig;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "LoanApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class LeverCoinConfig implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<LeverCoinConfig> CREATOR = new C17432a();

    @Nullable
    private final BigDecimal borrowCoefficient;

    @NotNull
    private BigDecimal borrowMaxAmount;

    @NotNull
    private BigDecimal borrowMinAmount;

    @NotNull
    private String currency;

    @NotNull
    private BigDecimal currencyLoanMinUnit;

    @Nullable
    private BigDecimal feeRatio;

    @NotNull
    private String id;

    @Nullable
    private String indexSymbol;

    @Nullable
    private BigDecimal interestRateUnit;
    private boolean isBorrow;

    @Nullable
    private Boolean isDebitEnabled;
    private boolean isMarginEnabled;

    @Nullable
    private Boolean isTransferIn;

    @Nullable
    private Boolean isolatedBorrow;

    @Nullable
    private Boolean isolatedEnable;

    @Nullable
    private Boolean isolatedTransferIn;

    @Nullable
    private BigDecimal lendMaxAmount;

    @Nullable
    private BigDecimal lendMinAmount;

    @Nullable
    private final BigDecimal marginCoefficient;

    @Nullable
    private String markPriceSymbol;

    @Nullable
    private BigDecimal maxInterestRate;

    @Nullable
    private BigDecimal minInterestRate;

    @Nullable
    private List<Integer> period;
    private int precision;

    @Nullable
    private BigDecimal riskFundsRate;

    @Nullable
    private BigDecimal sevenBonusLendRate;

    @Nullable
    private BigDecimal sixMonthBonusLendRate;

    @Nullable
    private Integer sort;

    @Nullable
    private BigDecimal yearBonusLendRate;

    /* JADX INFO: renamed from: com.kubi.loan.api.entity.LeverCoinConfig$a */
    /* JADX INFO: compiled from: LeverCoinConfig.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C17432a implements Parcelable.Creator<LeverCoinConfig> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final LeverCoinConfig createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Boolean boolValueOf;
            Boolean boolValueOf2;
            Boolean boolValueOf3;
            Boolean boolValueOf4;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            boolean z11 = false;
            boolean z12 = true;
            if (parcel.readInt() != 0) {
                z11 = true;
            }
            if (parcel.readInt() == 0) {
                z12 = false;
            }
            int i11 = parcel.readInt();
            BigDecimal bigDecimal = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal2 = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal3 = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal4 = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal5 = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal6 = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal7 = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal8 = (BigDecimal) parcel.readSerializable();
            Boolean boolValueOf5 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int i13 = 0;
                while (i13 != i12) {
                    arrayList.add(Integer.valueOf(parcel.readInt()));
                    i13++;
                    i12 = i12;
                }
            }
            BigDecimal bigDecimal9 = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal10 = (BigDecimal) parcel.readSerializable();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            BigDecimal bigDecimal11 = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal12 = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal13 = (BigDecimal) parcel.readSerializable();
            if (parcel.readInt() == 0) {
                boolValueOf3 = null;
            } else {
                boolValueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf4 = null;
            } else {
                boolValueOf4 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() != 0) {
                boolValueOf5 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new LeverCoinConfig(string, string2, z11, z12, i11, bigDecimal, bigDecimal2, bigDecimal3, bigDecimal4, bigDecimal5, bigDecimal6, bigDecimal7, bigDecimal8, arrayList, bigDecimal9, bigDecimal10, string3, string4, numValueOf, boolValueOf, boolValueOf2, bigDecimal11, bigDecimal12, bigDecimal13, boolValueOf3, boolValueOf4, boolValueOf5, (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final LeverCoinConfig[] newArray(int i11) {
            return new LeverCoinConfig[i11];
        }
    }

    public LeverCoinConfig() {
        this(null, null, false, false, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 536870911, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LeverCoinConfig copy$default(LeverCoinConfig leverCoinConfig, String str, String str2, boolean z11, boolean z12, int i11, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, BigDecimal bigDecimal6, BigDecimal bigDecimal7, BigDecimal bigDecimal8, List list, BigDecimal bigDecimal9, BigDecimal bigDecimal10, String str3, String str4, Integer num, Boolean bool, Boolean bool2, BigDecimal bigDecimal11, BigDecimal bigDecimal12, BigDecimal bigDecimal13, Boolean bool3, Boolean bool4, Boolean bool5, BigDecimal bigDecimal14, BigDecimal bigDecimal15, int i12, Object obj) {
        BigDecimal bigDecimal16;
        BigDecimal bigDecimal17;
        String str5 = (i12 & 1) != 0 ? leverCoinConfig.id : str;
        String str6 = (i12 & 2) != 0 ? leverCoinConfig.currency : str2;
        boolean z13 = (i12 & 4) != 0 ? leverCoinConfig.isBorrow : z11;
        boolean z14 = (i12 & 8) != 0 ? leverCoinConfig.isMarginEnabled : z12;
        int i13 = (i12 & 16) != 0 ? leverCoinConfig.precision : i11;
        BigDecimal bigDecimal18 = (i12 & 32) != 0 ? leverCoinConfig.borrowMinAmount : bigDecimal;
        BigDecimal bigDecimal19 = (i12 & 64) != 0 ? leverCoinConfig.borrowMaxAmount : bigDecimal2;
        BigDecimal bigDecimal20 = (i12 & 128) != 0 ? leverCoinConfig.currencyLoanMinUnit : bigDecimal3;
        BigDecimal bigDecimal21 = (i12 & 256) != 0 ? leverCoinConfig.lendMaxAmount : bigDecimal4;
        BigDecimal bigDecimal22 = (i12 & 512) != 0 ? leverCoinConfig.lendMinAmount : bigDecimal5;
        BigDecimal bigDecimal23 = (i12 & 1024) != 0 ? leverCoinConfig.maxInterestRate : bigDecimal6;
        BigDecimal bigDecimal24 = (i12 & 2048) != 0 ? leverCoinConfig.minInterestRate : bigDecimal7;
        BigDecimal bigDecimal25 = (i12 & 4096) != 0 ? leverCoinConfig.interestRateUnit : bigDecimal8;
        List list2 = (i12 & 8192) != 0 ? leverCoinConfig.period : list;
        String str7 = str5;
        BigDecimal bigDecimal26 = (i12 & 16384) != 0 ? leverCoinConfig.riskFundsRate : bigDecimal9;
        BigDecimal bigDecimal27 = (i12 & 32768) != 0 ? leverCoinConfig.feeRatio : bigDecimal10;
        String str8 = (i12 & 65536) != 0 ? leverCoinConfig.indexSymbol : str3;
        String str9 = (i12 & 131072) != 0 ? leverCoinConfig.markPriceSymbol : str4;
        Integer num2 = (i12 & 262144) != 0 ? leverCoinConfig.sort : num;
        Boolean bool6 = (i12 & 524288) != 0 ? leverCoinConfig.isDebitEnabled : bool;
        Boolean bool7 = (i12 & 1048576) != 0 ? leverCoinConfig.isTransferIn : bool2;
        BigDecimal bigDecimal28 = (i12 & 2097152) != 0 ? leverCoinConfig.sevenBonusLendRate : bigDecimal11;
        BigDecimal bigDecimal29 = (i12 & 4194304) != 0 ? leverCoinConfig.yearBonusLendRate : bigDecimal12;
        BigDecimal bigDecimal30 = (i12 & 8388608) != 0 ? leverCoinConfig.sixMonthBonusLendRate : bigDecimal13;
        Boolean bool8 = (i12 & 16777216) != 0 ? leverCoinConfig.isolatedEnable : bool3;
        Boolean bool9 = (i12 & 33554432) != 0 ? leverCoinConfig.isolatedBorrow : bool4;
        Boolean bool10 = (i12 & 67108864) != 0 ? leverCoinConfig.isolatedTransferIn : bool5;
        BigDecimal bigDecimal31 = (i12 & C2711C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? leverCoinConfig.borrowCoefficient : bigDecimal14;
        if ((i12 & 268435456) != 0) {
            bigDecimal17 = bigDecimal31;
            bigDecimal16 = leverCoinConfig.marginCoefficient;
        } else {
            bigDecimal16 = bigDecimal15;
            bigDecimal17 = bigDecimal31;
        }
        return leverCoinConfig.copy(str7, str6, z13, z14, i13, bigDecimal18, bigDecimal19, bigDecimal20, bigDecimal21, bigDecimal22, bigDecimal23, bigDecimal24, bigDecimal25, list2, bigDecimal26, bigDecimal27, str8, str9, num2, bool6, bool7, bigDecimal28, bigDecimal29, bigDecimal30, bool8, bool9, bool10, bigDecimal17, bigDecimal16);
    }

    @NotNull
    public final LeverCoinConfig copy(@NotNull String id2, @NotNull String currency, boolean isBorrow, boolean isMarginEnabled, int precision, @NotNull BigDecimal borrowMinAmount, @NotNull BigDecimal borrowMaxAmount, @NotNull BigDecimal currencyLoanMinUnit, @Nullable BigDecimal lendMaxAmount, @Nullable BigDecimal lendMinAmount, @Nullable BigDecimal maxInterestRate, @Nullable BigDecimal minInterestRate, @Nullable BigDecimal interestRateUnit, @Nullable List<Integer> period, @Nullable BigDecimal riskFundsRate, @Nullable BigDecimal feeRatio, @Nullable String indexSymbol, @Nullable String markPriceSymbol, @Nullable Integer sort, @Nullable Boolean isDebitEnabled, @Nullable Boolean isTransferIn, @Nullable BigDecimal sevenBonusLendRate, @Nullable BigDecimal yearBonusLendRate, @Nullable BigDecimal sixMonthBonusLendRate, @Nullable Boolean isolatedEnable, @Nullable Boolean isolatedBorrow, @Nullable Boolean isolatedTransferIn, @Nullable BigDecimal borrowCoefficient, @Nullable BigDecimal marginCoefficient) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(borrowMinAmount, "borrowMinAmount");
        Intrinsics.checkNotNullParameter(borrowMaxAmount, "borrowMaxAmount");
        Intrinsics.checkNotNullParameter(currencyLoanMinUnit, "currencyLoanMinUnit");
        return new LeverCoinConfig(id2, currency, isBorrow, isMarginEnabled, precision, borrowMinAmount, borrowMaxAmount, currencyLoanMinUnit, lendMaxAmount, lendMinAmount, maxInterestRate, minInterestRate, interestRateUnit, period, riskFundsRate, feeRatio, indexSymbol, markPriceSymbol, sort, isDebitEnabled, isTransferIn, sevenBonusLendRate, yearBonusLendRate, sixMonthBonusLendRate, isolatedEnable, isolatedBorrow, isolatedTransferIn, borrowCoefficient, marginCoefficient);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LeverCoinConfig)) {
            return false;
        }
        LeverCoinConfig leverCoinConfig = (LeverCoinConfig) other;
        return Intrinsics.areEqual(this.id, leverCoinConfig.id) && Intrinsics.areEqual(this.currency, leverCoinConfig.currency) && this.isBorrow == leverCoinConfig.isBorrow && this.isMarginEnabled == leverCoinConfig.isMarginEnabled && this.precision == leverCoinConfig.precision && Intrinsics.areEqual(this.borrowMinAmount, leverCoinConfig.borrowMinAmount) && Intrinsics.areEqual(this.borrowMaxAmount, leverCoinConfig.borrowMaxAmount) && Intrinsics.areEqual(this.currencyLoanMinUnit, leverCoinConfig.currencyLoanMinUnit) && Intrinsics.areEqual(this.lendMaxAmount, leverCoinConfig.lendMaxAmount) && Intrinsics.areEqual(this.lendMinAmount, leverCoinConfig.lendMinAmount) && Intrinsics.areEqual(this.maxInterestRate, leverCoinConfig.maxInterestRate) && Intrinsics.areEqual(this.minInterestRate, leverCoinConfig.minInterestRate) && Intrinsics.areEqual(this.interestRateUnit, leverCoinConfig.interestRateUnit) && Intrinsics.areEqual(this.period, leverCoinConfig.period) && Intrinsics.areEqual(this.riskFundsRate, leverCoinConfig.riskFundsRate) && Intrinsics.areEqual(this.feeRatio, leverCoinConfig.feeRatio) && Intrinsics.areEqual(this.indexSymbol, leverCoinConfig.indexSymbol) && Intrinsics.areEqual(this.markPriceSymbol, leverCoinConfig.markPriceSymbol) && Intrinsics.areEqual(this.sort, leverCoinConfig.sort) && Intrinsics.areEqual(this.isDebitEnabled, leverCoinConfig.isDebitEnabled) && Intrinsics.areEqual(this.isTransferIn, leverCoinConfig.isTransferIn) && Intrinsics.areEqual(this.sevenBonusLendRate, leverCoinConfig.sevenBonusLendRate) && Intrinsics.areEqual(this.yearBonusLendRate, leverCoinConfig.yearBonusLendRate) && Intrinsics.areEqual(this.sixMonthBonusLendRate, leverCoinConfig.sixMonthBonusLendRate) && Intrinsics.areEqual(this.isolatedEnable, leverCoinConfig.isolatedEnable) && Intrinsics.areEqual(this.isolatedBorrow, leverCoinConfig.isolatedBorrow) && Intrinsics.areEqual(this.isolatedTransferIn, leverCoinConfig.isolatedTransferIn) && Intrinsics.areEqual(this.borrowCoefficient, leverCoinConfig.borrowCoefficient) && Intrinsics.areEqual(this.marginCoefficient, leverCoinConfig.marginCoefficient);
    }

    public LeverCoinConfig(@NotNull String id2, @NotNull String currency, boolean z11, boolean z12, int i11, @NotNull BigDecimal borrowMinAmount, @NotNull BigDecimal borrowMaxAmount, @NotNull BigDecimal currencyLoanMinUnit, @Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2, @Nullable BigDecimal bigDecimal3, @Nullable BigDecimal bigDecimal4, @Nullable BigDecimal bigDecimal5, @Nullable List<Integer> list, @Nullable BigDecimal bigDecimal6, @Nullable BigDecimal bigDecimal7, @Nullable String str, @Nullable String str2, @Nullable Integer num, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable BigDecimal bigDecimal8, @Nullable BigDecimal bigDecimal9, @Nullable BigDecimal bigDecimal10, @Nullable Boolean bool3, @Nullable Boolean bool4, @Nullable Boolean bool5, @Nullable BigDecimal bigDecimal11, @Nullable BigDecimal bigDecimal12) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(borrowMinAmount, "borrowMinAmount");
        Intrinsics.checkNotNullParameter(borrowMaxAmount, "borrowMaxAmount");
        Intrinsics.checkNotNullParameter(currencyLoanMinUnit, "currencyLoanMinUnit");
        this.id = id2;
        this.currency = currency;
        this.isBorrow = z11;
        this.isMarginEnabled = z12;
        this.precision = i11;
        this.borrowMinAmount = borrowMinAmount;
        this.borrowMaxAmount = borrowMaxAmount;
        this.currencyLoanMinUnit = currencyLoanMinUnit;
        this.lendMaxAmount = bigDecimal;
        this.lendMinAmount = bigDecimal2;
        this.maxInterestRate = bigDecimal3;
        this.minInterestRate = bigDecimal4;
        this.interestRateUnit = bigDecimal5;
        this.period = list;
        this.riskFundsRate = bigDecimal6;
        this.feeRatio = bigDecimal7;
        this.indexSymbol = str;
        this.markPriceSymbol = str2;
        this.sort = num;
        this.isDebitEnabled = bool;
        this.isTransferIn = bool2;
        this.sevenBonusLendRate = bigDecimal8;
        this.yearBonusLendRate = bigDecimal9;
        this.sixMonthBonusLendRate = bigDecimal10;
        this.isolatedEnable = bool3;
        this.isolatedBorrow = bool4;
        this.isolatedTransferIn = bool5;
        this.borrowCoefficient = bigDecimal11;
        this.marginCoefficient = bigDecimal12;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final BigDecimal getLendMinAmount() {
        return this.lendMinAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final BigDecimal getMaxInterestRate() {
        return this.maxInterestRate;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final BigDecimal getMinInterestRate() {
        return this.minInterestRate;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final BigDecimal getInterestRateUnit() {
        return this.interestRateUnit;
    }

    @Nullable
    public final List<Integer> component14() {
        return this.period;
    }

    @Nullable
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final BigDecimal getRiskFundsRate() {
        return this.riskFundsRate;
    }

    @Nullable
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final BigDecimal getFeeRatio() {
        return this.feeRatio;
    }

    @Nullable
    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getIndexSymbol() {
        return this.indexSymbol;
    }

    @Nullable
    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getMarkPriceSymbol() {
        return this.markPriceSymbol;
    }

    @Nullable
    /* JADX INFO: renamed from: component19, reason: from getter */
    public final Integer getSort() {
        return this.sort;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    /* JADX INFO: renamed from: component20, reason: from getter */
    public final Boolean getIsDebitEnabled() {
        return this.isDebitEnabled;
    }

    @Nullable
    /* JADX INFO: renamed from: component21, reason: from getter */
    public final Boolean getIsTransferIn() {
        return this.isTransferIn;
    }

    @Nullable
    /* JADX INFO: renamed from: component22, reason: from getter */
    public final BigDecimal getSevenBonusLendRate() {
        return this.sevenBonusLendRate;
    }

    @Nullable
    /* JADX INFO: renamed from: component23, reason: from getter */
    public final BigDecimal getYearBonusLendRate() {
        return this.yearBonusLendRate;
    }

    @Nullable
    /* JADX INFO: renamed from: component24, reason: from getter */
    public final BigDecimal getSixMonthBonusLendRate() {
        return this.sixMonthBonusLendRate;
    }

    @Nullable
    /* JADX INFO: renamed from: component25, reason: from getter */
    public final Boolean getIsolatedEnable() {
        return this.isolatedEnable;
    }

    @Nullable
    /* JADX INFO: renamed from: component26, reason: from getter */
    public final Boolean getIsolatedBorrow() {
        return this.isolatedBorrow;
    }

    @Nullable
    /* JADX INFO: renamed from: component27, reason: from getter */
    public final Boolean getIsolatedTransferIn() {
        return this.isolatedTransferIn;
    }

    @Nullable
    /* JADX INFO: renamed from: component28, reason: from getter */
    public final BigDecimal getBorrowCoefficient() {
        return this.borrowCoefficient;
    }

    @Nullable
    /* JADX INFO: renamed from: component29, reason: from getter */
    public final BigDecimal getMarginCoefficient() {
        return this.marginCoefficient;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIsBorrow() {
        return this.isBorrow;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getIsMarginEnabled() {
        return this.isMarginEnabled;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getPrecision() {
        return this.precision;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final BigDecimal getBorrowMinAmount() {
        return this.borrowMinAmount;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final BigDecimal getBorrowMaxAmount() {
        return this.borrowMaxAmount;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final BigDecimal getCurrencyLoanMinUnit() {
        return this.currencyLoanMinUnit;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final BigDecimal getLendMaxAmount() {
        return this.lendMaxAmount;
    }

    @Nullable
    public final BigDecimal getBorrowCoefficient() {
        return this.borrowCoefficient;
    }

    @NotNull
    public final BigDecimal getBorrowMaxAmount() {
        return this.borrowMaxAmount;
    }

    @NotNull
    public final BigDecimal getBorrowMinAmount() {
        return this.borrowMinAmount;
    }

    @NotNull
    public final String getCurrency() {
        return this.currency;
    }

    @NotNull
    public final BigDecimal getCurrencyLoanMinUnit() {
        return this.currencyLoanMinUnit;
    }

    @Nullable
    public final BigDecimal getFeeRatio() {
        return this.feeRatio;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final String getIndexSymbol() {
        return this.indexSymbol;
    }

    @Nullable
    public final BigDecimal getInterestRateUnit() {
        return this.interestRateUnit;
    }

    @Nullable
    public final Boolean getIsolatedBorrow() {
        return this.isolatedBorrow;
    }

    @Nullable
    public final Boolean getIsolatedEnable() {
        return this.isolatedEnable;
    }

    @Nullable
    public final Boolean getIsolatedTransferIn() {
        return this.isolatedTransferIn;
    }

    @Nullable
    public final BigDecimal getLendMaxAmount() {
        return this.lendMaxAmount;
    }

    @Nullable
    public final BigDecimal getLendMinAmount() {
        return this.lendMinAmount;
    }

    @Nullable
    public final BigDecimal getMarginCoefficient() {
        return this.marginCoefficient;
    }

    @Nullable
    public final String getMarkPriceSymbol() {
        return this.markPriceSymbol;
    }

    @Nullable
    public final BigDecimal getMaxInterestRate() {
        return this.maxInterestRate;
    }

    @Nullable
    public final BigDecimal getMinInterestRate() {
        return this.minInterestRate;
    }

    @Nullable
    public final List<Integer> getPeriod() {
        return this.period;
    }

    public final int getPrecision() {
        return this.precision;
    }

    @Nullable
    public final BigDecimal getRiskFundsRate() {
        return this.riskFundsRate;
    }

    @Nullable
    public final BigDecimal getSevenBonusLendRate() {
        return this.sevenBonusLendRate;
    }

    @Nullable
    public final BigDecimal getSixMonthBonusLendRate() {
        return this.sixMonthBonusLendRate;
    }

    @Nullable
    public final Integer getSort() {
        return this.sort;
    }

    @Nullable
    public final BigDecimal getYearBonusLendRate() {
        return this.yearBonusLendRate;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((this.id.hashCode() * 31) + this.currency.hashCode()) * 31) + Boolean.hashCode(this.isBorrow)) * 31) + Boolean.hashCode(this.isMarginEnabled)) * 31) + Integer.hashCode(this.precision)) * 31) + this.borrowMinAmount.hashCode()) * 31) + this.borrowMaxAmount.hashCode()) * 31) + this.currencyLoanMinUnit.hashCode()) * 31;
        BigDecimal bigDecimal = this.lendMaxAmount;
        int iHashCode2 = (iHashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.lendMinAmount;
        int iHashCode3 = (iHashCode2 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.maxInterestRate;
        int iHashCode4 = (iHashCode3 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        BigDecimal bigDecimal4 = this.minInterestRate;
        int iHashCode5 = (iHashCode4 + (bigDecimal4 == null ? 0 : bigDecimal4.hashCode())) * 31;
        BigDecimal bigDecimal5 = this.interestRateUnit;
        int iHashCode6 = (iHashCode5 + (bigDecimal5 == null ? 0 : bigDecimal5.hashCode())) * 31;
        List<Integer> list = this.period;
        int iHashCode7 = (iHashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        BigDecimal bigDecimal6 = this.riskFundsRate;
        int iHashCode8 = (iHashCode7 + (bigDecimal6 == null ? 0 : bigDecimal6.hashCode())) * 31;
        BigDecimal bigDecimal7 = this.feeRatio;
        int iHashCode9 = (iHashCode8 + (bigDecimal7 == null ? 0 : bigDecimal7.hashCode())) * 31;
        String str = this.indexSymbol;
        int iHashCode10 = (iHashCode9 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.markPriceSymbol;
        int iHashCode11 = (iHashCode10 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.sort;
        int iHashCode12 = (iHashCode11 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.isDebitEnabled;
        int iHashCode13 = (iHashCode12 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isTransferIn;
        int iHashCode14 = (iHashCode13 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        BigDecimal bigDecimal8 = this.sevenBonusLendRate;
        int iHashCode15 = (iHashCode14 + (bigDecimal8 == null ? 0 : bigDecimal8.hashCode())) * 31;
        BigDecimal bigDecimal9 = this.yearBonusLendRate;
        int iHashCode16 = (iHashCode15 + (bigDecimal9 == null ? 0 : bigDecimal9.hashCode())) * 31;
        BigDecimal bigDecimal10 = this.sixMonthBonusLendRate;
        int iHashCode17 = (iHashCode16 + (bigDecimal10 == null ? 0 : bigDecimal10.hashCode())) * 31;
        Boolean bool3 = this.isolatedEnable;
        int iHashCode18 = (iHashCode17 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.isolatedBorrow;
        int iHashCode19 = (iHashCode18 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.isolatedTransferIn;
        int iHashCode20 = (iHashCode19 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        BigDecimal bigDecimal11 = this.borrowCoefficient;
        int iHashCode21 = (iHashCode20 + (bigDecimal11 == null ? 0 : bigDecimal11.hashCode())) * 31;
        BigDecimal bigDecimal12 = this.marginCoefficient;
        return iHashCode21 + (bigDecimal12 != null ? bigDecimal12.hashCode() : 0);
    }

    public final boolean isBorrow() {
        return this.isBorrow;
    }

    @Nullable
    public final Boolean isDebitEnabled() {
        return this.isDebitEnabled;
    }

    public final boolean isMarginEnabled() {
        return this.isMarginEnabled;
    }

    @Nullable
    public final Boolean isTransferIn() {
        return this.isTransferIn;
    }

    public final void setBorrow(boolean z11) {
        this.isBorrow = z11;
    }

    public final void setBorrowMaxAmount(@NotNull BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(bigDecimal, "<set-?>");
        this.borrowMaxAmount = bigDecimal;
    }

    public final void setBorrowMinAmount(@NotNull BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(bigDecimal, "<set-?>");
        this.borrowMinAmount = bigDecimal;
    }

    public final void setCurrency(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.currency = str;
    }

    public final void setCurrencyLoanMinUnit(@NotNull BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(bigDecimal, "<set-?>");
        this.currencyLoanMinUnit = bigDecimal;
    }

    public final void setDebitEnabled(@Nullable Boolean bool) {
        this.isDebitEnabled = bool;
    }

    public final void setFeeRatio(@Nullable BigDecimal bigDecimal) {
        this.feeRatio = bigDecimal;
    }

    public final void setId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.id = str;
    }

    public final void setIndexSymbol(@Nullable String str) {
        this.indexSymbol = str;
    }

    public final void setInterestRateUnit(@Nullable BigDecimal bigDecimal) {
        this.interestRateUnit = bigDecimal;
    }

    public final void setIsolatedBorrow(@Nullable Boolean bool) {
        this.isolatedBorrow = bool;
    }

    public final void setIsolatedEnable(@Nullable Boolean bool) {
        this.isolatedEnable = bool;
    }

    public final void setIsolatedTransferIn(@Nullable Boolean bool) {
        this.isolatedTransferIn = bool;
    }

    public final void setLendMaxAmount(@Nullable BigDecimal bigDecimal) {
        this.lendMaxAmount = bigDecimal;
    }

    public final void setLendMinAmount(@Nullable BigDecimal bigDecimal) {
        this.lendMinAmount = bigDecimal;
    }

    public final void setMarginEnabled(boolean z11) {
        this.isMarginEnabled = z11;
    }

    public final void setMarkPriceSymbol(@Nullable String str) {
        this.markPriceSymbol = str;
    }

    public final void setMaxInterestRate(@Nullable BigDecimal bigDecimal) {
        this.maxInterestRate = bigDecimal;
    }

    public final void setMinInterestRate(@Nullable BigDecimal bigDecimal) {
        this.minInterestRate = bigDecimal;
    }

    public final void setPeriod(@Nullable List<Integer> list) {
        this.period = list;
    }

    public final void setPrecision(int i11) {
        this.precision = i11;
    }

    public final void setRiskFundsRate(@Nullable BigDecimal bigDecimal) {
        this.riskFundsRate = bigDecimal;
    }

    public final void setSevenBonusLendRate(@Nullable BigDecimal bigDecimal) {
        this.sevenBonusLendRate = bigDecimal;
    }

    public final void setSixMonthBonusLendRate(@Nullable BigDecimal bigDecimal) {
        this.sixMonthBonusLendRate = bigDecimal;
    }

    public final void setSort(@Nullable Integer num) {
        this.sort = num;
    }

    public final void setTransferIn(@Nullable Boolean bool) {
        this.isTransferIn = bool;
    }

    public final void setYearBonusLendRate(@Nullable BigDecimal bigDecimal) {
        this.yearBonusLendRate = bigDecimal;
    }

    @NotNull
    public String toString() {
        return "LeverCoinConfig(id=" + this.id + ", currency=" + this.currency + ", isBorrow=" + this.isBorrow + ", isMarginEnabled=" + this.isMarginEnabled + ", precision=" + this.precision + ", borrowMinAmount=" + this.borrowMinAmount + ", borrowMaxAmount=" + this.borrowMaxAmount + ", currencyLoanMinUnit=" + this.currencyLoanMinUnit + ", lendMaxAmount=" + this.lendMaxAmount + ", lendMinAmount=" + this.lendMinAmount + ", maxInterestRate=" + this.maxInterestRate + ", minInterestRate=" + this.minInterestRate + ", interestRateUnit=" + this.interestRateUnit + ", period=" + this.period + ", riskFundsRate=" + this.riskFundsRate + ", feeRatio=" + this.feeRatio + ", indexSymbol=" + this.indexSymbol + ", markPriceSymbol=" + this.markPriceSymbol + ", sort=" + this.sort + ", isDebitEnabled=" + this.isDebitEnabled + ", isTransferIn=" + this.isTransferIn + ", sevenBonusLendRate=" + this.sevenBonusLendRate + ", yearBonusLendRate=" + this.yearBonusLendRate + ", sixMonthBonusLendRate=" + this.sixMonthBonusLendRate + ", isolatedEnable=" + this.isolatedEnable + ", isolatedBorrow=" + this.isolatedBorrow + ", isolatedTransferIn=" + this.isolatedTransferIn + ", borrowCoefficient=" + this.borrowCoefficient + ", marginCoefficient=" + this.marginCoefficient + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.id);
        dest.writeString(this.currency);
        dest.writeInt(this.isBorrow ? 1 : 0);
        dest.writeInt(this.isMarginEnabled ? 1 : 0);
        dest.writeInt(this.precision);
        dest.writeSerializable(this.borrowMinAmount);
        dest.writeSerializable(this.borrowMaxAmount);
        dest.writeSerializable(this.currencyLoanMinUnit);
        dest.writeSerializable(this.lendMaxAmount);
        dest.writeSerializable(this.lendMinAmount);
        dest.writeSerializable(this.maxInterestRate);
        dest.writeSerializable(this.minInterestRate);
        dest.writeSerializable(this.interestRateUnit);
        List<Integer> list = this.period;
        if (list == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(list.size());
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                dest.writeInt(it.next().intValue());
            }
        }
        dest.writeSerializable(this.riskFundsRate);
        dest.writeSerializable(this.feeRatio);
        dest.writeString(this.indexSymbol);
        dest.writeString(this.markPriceSymbol);
        Integer num = this.sort;
        if (num == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num.intValue());
        }
        Boolean bool = this.isDebitEnabled;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Boolean bool2 = this.isTransferIn;
        if (bool2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        dest.writeSerializable(this.sevenBonusLendRate);
        dest.writeSerializable(this.yearBonusLendRate);
        dest.writeSerializable(this.sixMonthBonusLendRate);
        Boolean bool3 = this.isolatedEnable;
        if (bool3 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool3.booleanValue() ? 1 : 0);
        }
        Boolean bool4 = this.isolatedBorrow;
        if (bool4 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool4.booleanValue() ? 1 : 0);
        }
        Boolean bool5 = this.isolatedTransferIn;
        if (bool5 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool5.booleanValue() ? 1 : 0);
        }
        dest.writeSerializable(this.borrowCoefficient);
        dest.writeSerializable(this.marginCoefficient);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ LeverCoinConfig(String str, String str2, boolean z11, boolean z12, int i11, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, BigDecimal bigDecimal6, BigDecimal bigDecimal7, BigDecimal bigDecimal8, List list, BigDecimal bigDecimal9, BigDecimal bigDecimal10, String str3, String str4, Integer num, Boolean bool, Boolean bool2, BigDecimal bigDecimal11, BigDecimal bigDecimal12, BigDecimal bigDecimal13, Boolean bool3, Boolean bool4, Boolean bool5, BigDecimal bigDecimal14, BigDecimal bigDecimal15, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        BigDecimal ONE;
        String str5 = (i12 & 1) != 0 ? "" : str;
        String str6 = (i12 & 2) == 0 ? str2 : "";
        boolean z13 = (i12 & 4) != 0 ? false : z11;
        boolean z14 = (i12 & 8) == 0 ? z12 : false;
        int i13 = (i12 & 16) != 0 ? 4 : i11;
        BigDecimal bigDecimalM56608a = (i12 & 32) != 0 ? BaseConstants.f46539a.m56608a() : bigDecimal;
        BigDecimal bigDecimalM56608a2 = (i12 & 64) != 0 ? BaseConstants.f46539a.m56608a() : bigDecimal2;
        if ((i12 & 128) != 0) {
            ONE = BigDecimal.ONE;
            Intrinsics.checkNotNullExpressionValue(ONE, "ONE");
        } else {
            ONE = bigDecimal3;
        }
        this(str5, str6, z13, z14, i13, bigDecimalM56608a, bigDecimalM56608a2, ONE, (i12 & 256) != 0 ? null : bigDecimal4, (i12 & 512) != 0 ? null : bigDecimal5, (i12 & 1024) != 0 ? null : bigDecimal6, (i12 & 2048) != 0 ? null : bigDecimal7, (i12 & 4096) != 0 ? null : bigDecimal8, (i12 & 8192) != 0 ? null : list, (i12 & 16384) != 0 ? null : bigDecimal9, (i12 & 32768) != 0 ? null : bigDecimal10, (i12 & 65536) != 0 ? null : str3, (i12 & 131072) != 0 ? null : str4, (i12 & 262144) != 0 ? null : num, (i12 & 524288) != 0 ? null : bool, (i12 & 1048576) != 0 ? null : bool2, (i12 & 2097152) != 0 ? null : bigDecimal11, (i12 & 4194304) != 0 ? null : bigDecimal12, (i12 & 8388608) != 0 ? null : bigDecimal13, (i12 & 16777216) != 0 ? null : bool3, (i12 & 33554432) != 0 ? null : bool4, (i12 & 67108864) != 0 ? null : bool5, (i12 & C2711C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? null : bigDecimal14, (i12 & 268435456) != 0 ? null : bigDecimal15);
    }
}
