package com.kubi.unify.entity;

import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import java.math.BigDecimal;
import java.util.List;
import m60.C42434a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: UnifyEntity.kt */
/* JADX INFO: loaded from: classes52.dex */
@Keep
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b!\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u009d\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\"\u001a\u0004\u0018\u00010\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010-\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eHÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u009f\u0001\u0010/\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÆ\u0001J\u0013\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00103\u001a\u000204HÖ\u0001J\t\u00105\u001a\u00020\u000fHÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0014R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0014R\u001e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b \u0010!¨\u00066"}, m90084d2 = {"Lcom/kubi/unify/entity/UnifyAccountOverviewEntity;", "", "accountRiskRatio", "Ljava/math/BigDecimal;", "equity", "accountMarginEquity", "unrealisedPnl", "adjustedMargin", "totalLiability", "im", "mm", "availableMargin", "availableIsolatedMargin", "collateralCurrencyList", "", "", FirebaseAnalytics.Param.CURRENCY, "<init>", "(Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/util/List;Ljava/lang/String;)V", "getAccountRiskRatio", "()Ljava/math/BigDecimal;", "getEquity", "getAccountMarginEquity", "getUnrealisedPnl", "getAdjustedMargin", "getTotalLiability", "getIm", "getMm", "getAvailableMargin", "getAvailableIsolatedMargin", "getCollateralCurrencyList", "()Ljava/util/List;", "getCurrency", "()Ljava/lang/String;", "getDisplayRiskRatio", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "equals", "", "other", "hashCode", "", "toString", "BUnifyAccountLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class UnifyAccountOverviewEntity {

    @SerializedName("marginEquity")
    @Nullable
    private final BigDecimal accountMarginEquity;

    @SerializedName("riskRatio")
    @Nullable
    private final BigDecimal accountRiskRatio;

    @SerializedName("adjustedEquity")
    @Nullable
    private final BigDecimal adjustedMargin;

    @SerializedName("availableIsolatedMargin")
    @Nullable
    private final BigDecimal availableIsolatedMargin;

    @SerializedName("availableMargin")
    @Nullable
    private final BigDecimal availableMargin;

    @SerializedName("collateralCurrencyList")
    @Nullable
    private final List<String> collateralCurrencyList;

    @Nullable
    private final String currency;

    @SerializedName("equity")
    @Nullable
    private final BigDecimal equity;

    @SerializedName("im")
    @Nullable
    private final BigDecimal im;

    @SerializedName("mm")
    @Nullable
    private final BigDecimal mm;

    @SerializedName("totalLiability")
    @Nullable
    private final BigDecimal totalLiability;

    @SerializedName("unrealisedPnl")
    @Nullable
    private final BigDecimal unrealisedPnl;

    public UnifyAccountOverviewEntity() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UnifyAccountOverviewEntity copy$default(UnifyAccountOverviewEntity unifyAccountOverviewEntity, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, BigDecimal bigDecimal6, BigDecimal bigDecimal7, BigDecimal bigDecimal8, BigDecimal bigDecimal9, BigDecimal bigDecimal10, List list, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bigDecimal = unifyAccountOverviewEntity.accountRiskRatio;
        }
        if ((i11 & 2) != 0) {
            bigDecimal2 = unifyAccountOverviewEntity.equity;
        }
        if ((i11 & 4) != 0) {
            bigDecimal3 = unifyAccountOverviewEntity.accountMarginEquity;
        }
        if ((i11 & 8) != 0) {
            bigDecimal4 = unifyAccountOverviewEntity.unrealisedPnl;
        }
        if ((i11 & 16) != 0) {
            bigDecimal5 = unifyAccountOverviewEntity.adjustedMargin;
        }
        if ((i11 & 32) != 0) {
            bigDecimal6 = unifyAccountOverviewEntity.totalLiability;
        }
        if ((i11 & 64) != 0) {
            bigDecimal7 = unifyAccountOverviewEntity.im;
        }
        if ((i11 & 128) != 0) {
            bigDecimal8 = unifyAccountOverviewEntity.mm;
        }
        if ((i11 & 256) != 0) {
            bigDecimal9 = unifyAccountOverviewEntity.availableMargin;
        }
        if ((i11 & 512) != 0) {
            bigDecimal10 = unifyAccountOverviewEntity.availableIsolatedMargin;
        }
        if ((i11 & 1024) != 0) {
            list = unifyAccountOverviewEntity.collateralCurrencyList;
        }
        if ((i11 & 2048) != 0) {
            str = unifyAccountOverviewEntity.currency;
        }
        List list2 = list;
        String str2 = str;
        BigDecimal bigDecimal11 = bigDecimal9;
        BigDecimal bigDecimal12 = bigDecimal10;
        BigDecimal bigDecimal13 = bigDecimal7;
        BigDecimal bigDecimal14 = bigDecimal8;
        BigDecimal bigDecimal15 = bigDecimal5;
        BigDecimal bigDecimal16 = bigDecimal6;
        return unifyAccountOverviewEntity.copy(bigDecimal, bigDecimal2, bigDecimal3, bigDecimal4, bigDecimal15, bigDecimal16, bigDecimal13, bigDecimal14, bigDecimal11, bigDecimal12, list2, str2);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UnifyAccountOverviewEntity)) {
            return false;
        }
        UnifyAccountOverviewEntity unifyAccountOverviewEntity = (UnifyAccountOverviewEntity) other;
        return Intrinsics.areEqual(this.accountRiskRatio, unifyAccountOverviewEntity.accountRiskRatio) && Intrinsics.areEqual(this.equity, unifyAccountOverviewEntity.equity) && Intrinsics.areEqual(this.accountMarginEquity, unifyAccountOverviewEntity.accountMarginEquity) && Intrinsics.areEqual(this.unrealisedPnl, unifyAccountOverviewEntity.unrealisedPnl) && Intrinsics.areEqual(this.adjustedMargin, unifyAccountOverviewEntity.adjustedMargin) && Intrinsics.areEqual(this.totalLiability, unifyAccountOverviewEntity.totalLiability) && Intrinsics.areEqual(this.im, unifyAccountOverviewEntity.im) && Intrinsics.areEqual(this.mm, unifyAccountOverviewEntity.mm) && Intrinsics.areEqual(this.availableMargin, unifyAccountOverviewEntity.availableMargin) && Intrinsics.areEqual(this.availableIsolatedMargin, unifyAccountOverviewEntity.availableIsolatedMargin) && Intrinsics.areEqual(this.collateralCurrencyList, unifyAccountOverviewEntity.collateralCurrencyList) && Intrinsics.areEqual(this.currency, unifyAccountOverviewEntity.currency);
    }

    public int hashCode() {
        BigDecimal bigDecimal = this.accountRiskRatio;
        int iHashCode = (bigDecimal == null ? 0 : bigDecimal.hashCode()) * 31;
        BigDecimal bigDecimal2 = this.equity;
        int iHashCode2 = (iHashCode + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.accountMarginEquity;
        int iHashCode3 = (iHashCode2 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        BigDecimal bigDecimal4 = this.unrealisedPnl;
        int iHashCode4 = (iHashCode3 + (bigDecimal4 == null ? 0 : bigDecimal4.hashCode())) * 31;
        BigDecimal bigDecimal5 = this.adjustedMargin;
        int iHashCode5 = (iHashCode4 + (bigDecimal5 == null ? 0 : bigDecimal5.hashCode())) * 31;
        BigDecimal bigDecimal6 = this.totalLiability;
        int iHashCode6 = (iHashCode5 + (bigDecimal6 == null ? 0 : bigDecimal6.hashCode())) * 31;
        BigDecimal bigDecimal7 = this.im;
        int iHashCode7 = (iHashCode6 + (bigDecimal7 == null ? 0 : bigDecimal7.hashCode())) * 31;
        BigDecimal bigDecimal8 = this.mm;
        int iHashCode8 = (iHashCode7 + (bigDecimal8 == null ? 0 : bigDecimal8.hashCode())) * 31;
        BigDecimal bigDecimal9 = this.availableMargin;
        int iHashCode9 = (iHashCode8 + (bigDecimal9 == null ? 0 : bigDecimal9.hashCode())) * 31;
        BigDecimal bigDecimal10 = this.availableIsolatedMargin;
        int iHashCode10 = (iHashCode9 + (bigDecimal10 == null ? 0 : bigDecimal10.hashCode())) * 31;
        List<String> list = this.collateralCurrencyList;
        int iHashCode11 = (iHashCode10 + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.currency;
        return iHashCode11 + (str != null ? str.hashCode() : 0);
    }

    public UnifyAccountOverviewEntity(@Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2, @Nullable BigDecimal bigDecimal3, @Nullable BigDecimal bigDecimal4, @Nullable BigDecimal bigDecimal5, @Nullable BigDecimal bigDecimal6, @Nullable BigDecimal bigDecimal7, @Nullable BigDecimal bigDecimal8, @Nullable BigDecimal bigDecimal9, @Nullable BigDecimal bigDecimal10, @Nullable List<String> list, @Nullable String str) {
        this.accountRiskRatio = bigDecimal;
        this.equity = bigDecimal2;
        this.accountMarginEquity = bigDecimal3;
        this.unrealisedPnl = bigDecimal4;
        this.adjustedMargin = bigDecimal5;
        this.totalLiability = bigDecimal6;
        this.im = bigDecimal7;
        this.mm = bigDecimal8;
        this.availableMargin = bigDecimal9;
        this.availableIsolatedMargin = bigDecimal10;
        this.collateralCurrencyList = list;
        this.currency = str;
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final BigDecimal getAccountRiskRatio() {
        return this.accountRiskRatio;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final BigDecimal getAvailableIsolatedMargin() {
        return this.availableIsolatedMargin;
    }

    @Nullable
    public final List<String> component11() {
        return this.collateralCurrencyList;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final BigDecimal getEquity() {
        return this.equity;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final BigDecimal getAccountMarginEquity() {
        return this.accountMarginEquity;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final BigDecimal getUnrealisedPnl() {
        return this.unrealisedPnl;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final BigDecimal getAdjustedMargin() {
        return this.adjustedMargin;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final BigDecimal getTotalLiability() {
        return this.totalLiability;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final BigDecimal getIm() {
        return this.im;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final BigDecimal getMm() {
        return this.mm;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final BigDecimal getAvailableMargin() {
        return this.availableMargin;
    }

    @NotNull
    public final UnifyAccountOverviewEntity copy(@Nullable BigDecimal accountRiskRatio, @Nullable BigDecimal equity, @Nullable BigDecimal accountMarginEquity, @Nullable BigDecimal unrealisedPnl, @Nullable BigDecimal adjustedMargin, @Nullable BigDecimal totalLiability, @Nullable BigDecimal im2, @Nullable BigDecimal mm2, @Nullable BigDecimal availableMargin, @Nullable BigDecimal availableIsolatedMargin, @Nullable List<String> collateralCurrencyList, @Nullable String currency) {
        return new UnifyAccountOverviewEntity(accountRiskRatio, equity, accountMarginEquity, unrealisedPnl, adjustedMargin, totalLiability, im2, mm2, availableMargin, availableIsolatedMargin, collateralCurrencyList, currency);
    }

    @Nullable
    public final BigDecimal getAccountMarginEquity() {
        return this.accountMarginEquity;
    }

    @Nullable
    public final BigDecimal getAccountRiskRatio() {
        return this.accountRiskRatio;
    }

    @Nullable
    public final BigDecimal getAdjustedMargin() {
        return this.adjustedMargin;
    }

    @Nullable
    public final BigDecimal getAvailableIsolatedMargin() {
        return this.availableIsolatedMargin;
    }

    @Nullable
    public final BigDecimal getAvailableMargin() {
        return this.availableMargin;
    }

    @Nullable
    public final List<String> getCollateralCurrencyList() {
        return this.collateralCurrencyList;
    }

    @Nullable
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    public final BigDecimal getDisplayRiskRatio() {
        return C42434a.m93160a(this.accountRiskRatio);
    }

    @Nullable
    public final BigDecimal getEquity() {
        return this.equity;
    }

    @Nullable
    public final BigDecimal getIm() {
        return this.im;
    }

    @Nullable
    public final BigDecimal getMm() {
        return this.mm;
    }

    @Nullable
    public final BigDecimal getTotalLiability() {
        return this.totalLiability;
    }

    @Nullable
    public final BigDecimal getUnrealisedPnl() {
        return this.unrealisedPnl;
    }

    @NotNull
    public String toString() {
        return "UnifyAccountOverviewEntity(accountRiskRatio=" + this.accountRiskRatio + ", equity=" + this.equity + ", accountMarginEquity=" + this.accountMarginEquity + ", unrealisedPnl=" + this.unrealisedPnl + ", adjustedMargin=" + this.adjustedMargin + ", totalLiability=" + this.totalLiability + ", im=" + this.im + ", mm=" + this.mm + ", availableMargin=" + this.availableMargin + ", availableIsolatedMargin=" + this.availableIsolatedMargin + ", collateralCurrencyList=" + this.collateralCurrencyList + ", currency=" + this.currency + ')';
    }

    public /* synthetic */ UnifyAccountOverviewEntity(BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, BigDecimal bigDecimal6, BigDecimal bigDecimal7, BigDecimal bigDecimal8, BigDecimal bigDecimal9, BigDecimal bigDecimal10, List list, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? BigDecimal.ZERO : bigDecimal, (i11 & 2) != 0 ? BigDecimal.ZERO : bigDecimal2, (i11 & 4) != 0 ? BigDecimal.ZERO : bigDecimal3, (i11 & 8) != 0 ? BigDecimal.ZERO : bigDecimal4, (i11 & 16) != 0 ? BigDecimal.ZERO : bigDecimal5, (i11 & 32) != 0 ? BigDecimal.ZERO : bigDecimal6, (i11 & 64) != 0 ? BigDecimal.ZERO : bigDecimal7, (i11 & 128) != 0 ? BigDecimal.ZERO : bigDecimal8, (i11 & 256) != 0 ? BigDecimal.ZERO : bigDecimal9, (i11 & 512) != 0 ? BigDecimal.ZERO : bigDecimal10, (i11 & 1024) != 0 ? null : list, (i11 & 2048) != 0 ? null : str);
    }
}
