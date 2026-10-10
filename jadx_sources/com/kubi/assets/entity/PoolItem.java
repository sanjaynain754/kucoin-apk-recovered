package com.kubi.assets.entity;

import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: OnGoingEntity.kt */
/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b)\b\u0087\b\u0018\u00002\u00020\u0001B\u0083\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010.\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003J\t\u0010/\u001a\u00020\fHÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00102\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0002\u0010%J\u008a\u0001\u00103\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÆ\u0001¢\u0006\u0002\u00104J\u0013\u00105\u001a\u00020\f2\b\u00106\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00107\u001a\u00020\u0010HÖ\u0001J\t\u00108\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001c\u0010\r\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0014\"\u0004\b \u0010!R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0014\"\u0004\b#\u0010!R\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u0010\n\u0002\u0010(\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'¨\u00069"}, m90084d2 = {"Lcom/kubi/assets/entity/PoolItem;", "", FirebaseAnalytics.Param.CURRENCY, "", "holdingAmount", "incomeAmount", "minApr", "maxApr", "list", "", "Lcom/kubi/assets/entity/PoolDetail;", "incomeSumForFiat", "", "incomeSum", "incomeSumCurrency", "incomeCurrencyCount", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getCurrency", "()Ljava/lang/String;", "getHoldingAmount", "getIncomeAmount", "getMinApr", "getMaxApr", "getList", "()Ljava/util/List;", "getIncomeSumForFiat", "()Z", "setIncomeSumForFiat", "(Z)V", "getIncomeSum", "setIncomeSum", "(Ljava/lang/String;)V", "getIncomeSumCurrency", "setIncomeSumCurrency", "getIncomeCurrencyCount", "()Ljava/lang/Integer;", "setIncomeCurrencyCount", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/kubi/assets/entity/PoolItem;", "equals", "other", "hashCode", "toString", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class PoolItem {

    @Nullable
    private final String currency;

    @Nullable
    private final String holdingAmount;

    @Nullable
    private final String incomeAmount;

    @Nullable
    private Integer incomeCurrencyCount;

    @Nullable
    private String incomeSum;

    @Nullable
    private String incomeSumCurrency;
    private boolean incomeSumForFiat;

    @Nullable
    private final List<PoolDetail> list;

    @Nullable
    private final String maxApr;

    @Nullable
    private final String minApr;

    public PoolItem() {
        this(null, null, null, null, null, null, false, null, null, null, 1023, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PoolItem)) {
            return false;
        }
        PoolItem poolItem = (PoolItem) other;
        return Intrinsics.areEqual(this.currency, poolItem.currency) && Intrinsics.areEqual(this.holdingAmount, poolItem.holdingAmount) && Intrinsics.areEqual(this.incomeAmount, poolItem.incomeAmount) && Intrinsics.areEqual(this.minApr, poolItem.minApr) && Intrinsics.areEqual(this.maxApr, poolItem.maxApr) && Intrinsics.areEqual(this.list, poolItem.list) && this.incomeSumForFiat == poolItem.incomeSumForFiat && Intrinsics.areEqual(this.incomeSum, poolItem.incomeSum) && Intrinsics.areEqual(this.incomeSumCurrency, poolItem.incomeSumCurrency) && Intrinsics.areEqual(this.incomeCurrencyCount, poolItem.incomeCurrencyCount);
    }

    public PoolItem(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable List<PoolDetail> list, boolean z11, @Nullable String str6, @Nullable String str7, @Nullable Integer num) {
        this.currency = str;
        this.holdingAmount = str2;
        this.incomeAmount = str3;
        this.minApr = str4;
        this.maxApr = str5;
        this.list = list;
        this.incomeSumForFiat = z11;
        this.incomeSum = str6;
        this.incomeSumCurrency = str7;
        this.incomeCurrencyCount = num;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PoolItem copy$default(PoolItem poolItem, String str, String str2, String str3, String str4, String str5, List list, boolean z11, String str6, String str7, Integer num, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = poolItem.currency;
        }
        if ((i11 & 2) != 0) {
            str2 = poolItem.holdingAmount;
        }
        if ((i11 & 4) != 0) {
            str3 = poolItem.incomeAmount;
        }
        if ((i11 & 8) != 0) {
            str4 = poolItem.minApr;
        }
        if ((i11 & 16) != 0) {
            str5 = poolItem.maxApr;
        }
        if ((i11 & 32) != 0) {
            list = poolItem.list;
        }
        if ((i11 & 64) != 0) {
            z11 = poolItem.incomeSumForFiat;
        }
        if ((i11 & 128) != 0) {
            str6 = poolItem.incomeSum;
        }
        if ((i11 & 256) != 0) {
            str7 = poolItem.incomeSumCurrency;
        }
        if ((i11 & 512) != 0) {
            num = poolItem.incomeCurrencyCount;
        }
        String str8 = str7;
        Integer num2 = num;
        boolean z12 = z11;
        String str9 = str6;
        String str10 = str5;
        List list2 = list;
        return poolItem.copy(str, str2, str3, str4, str10, list2, z12, str9, str8, num2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Integer getIncomeCurrencyCount() {
        return this.incomeCurrencyCount;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getHoldingAmount() {
        return this.holdingAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getIncomeAmount() {
        return this.incomeAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getMinApr() {
        return this.minApr;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getMaxApr() {
        return this.maxApr;
    }

    @Nullable
    public final List<PoolDetail> component6() {
        return this.list;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getIncomeSumForFiat() {
        return this.incomeSumForFiat;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getIncomeSum() {
        return this.incomeSum;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getIncomeSumCurrency() {
        return this.incomeSumCurrency;
    }

    @NotNull
    public final PoolItem copy(@Nullable String currency, @Nullable String holdingAmount, @Nullable String incomeAmount, @Nullable String minApr, @Nullable String maxApr, @Nullable List<PoolDetail> list, boolean incomeSumForFiat, @Nullable String incomeSum, @Nullable String incomeSumCurrency, @Nullable Integer incomeCurrencyCount) {
        return new PoolItem(currency, holdingAmount, incomeAmount, minApr, maxApr, list, incomeSumForFiat, incomeSum, incomeSumCurrency, incomeCurrencyCount);
    }

    @Nullable
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    public final String getHoldingAmount() {
        return this.holdingAmount;
    }

    @Nullable
    public final String getIncomeAmount() {
        return this.incomeAmount;
    }

    @Nullable
    public final Integer getIncomeCurrencyCount() {
        return this.incomeCurrencyCount;
    }

    @Nullable
    public final String getIncomeSum() {
        return this.incomeSum;
    }

    @Nullable
    public final String getIncomeSumCurrency() {
        return this.incomeSumCurrency;
    }

    public final boolean getIncomeSumForFiat() {
        return this.incomeSumForFiat;
    }

    @Nullable
    public final List<PoolDetail> getList() {
        return this.list;
    }

    @Nullable
    public final String getMaxApr() {
        return this.maxApr;
    }

    @Nullable
    public final String getMinApr() {
        return this.minApr;
    }

    public int hashCode() {
        String str = this.currency;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.holdingAmount;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.incomeAmount;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.minApr;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.maxApr;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        List<PoolDetail> list = this.list;
        int iHashCode6 = (((iHashCode5 + (list == null ? 0 : list.hashCode())) * 31) + Boolean.hashCode(this.incomeSumForFiat)) * 31;
        String str6 = this.incomeSum;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.incomeSumCurrency;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Integer num = this.incomeCurrencyCount;
        return iHashCode8 + (num != null ? num.hashCode() : 0);
    }

    public final void setIncomeCurrencyCount(@Nullable Integer num) {
        this.incomeCurrencyCount = num;
    }

    public final void setIncomeSum(@Nullable String str) {
        this.incomeSum = str;
    }

    public final void setIncomeSumCurrency(@Nullable String str) {
        this.incomeSumCurrency = str;
    }

    public final void setIncomeSumForFiat(boolean z11) {
        this.incomeSumForFiat = z11;
    }

    @NotNull
    public String toString() {
        return "PoolItem(currency=" + this.currency + ", holdingAmount=" + this.holdingAmount + ", incomeAmount=" + this.incomeAmount + ", minApr=" + this.minApr + ", maxApr=" + this.maxApr + ", list=" + this.list + ", incomeSumForFiat=" + this.incomeSumForFiat + ", incomeSum=" + this.incomeSum + ", incomeSumCurrency=" + this.incomeSumCurrency + ", incomeCurrencyCount=" + this.incomeCurrencyCount + ')';
    }

    public /* synthetic */ PoolItem(String str, String str2, String str3, String str4, String str5, List list, boolean z11, String str6, String str7, Integer num, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4, (i11 & 16) != 0 ? null : str5, (i11 & 32) != 0 ? null : list, (i11 & 64) != 0 ? false : z11, (i11 & 128) != 0 ? null : str6, (i11 & 256) != 0 ? null : str7, (i11 & 512) != 0 ? null : num);
    }
}
