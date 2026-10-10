package com.kubi.assets.entity;

import androidx.annotation.Keep;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: OnGoingEntity.kt */
/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bm\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010 \u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003Jo\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006("}, m90084d2 = {"Lcom/kubi/assets/entity/MarginPositionDetail;", "", "status", "", "totalBalance", "balanceCurrency", "totalLiability", "liabilityRate", "todayPnlAmount", "todayPnlRatio", "fundsInfoList", "", "Lcom/kubi/assets/entity/FundsInfo;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getStatus", "()Ljava/lang/String;", "getTotalBalance", "getBalanceCurrency", "getTotalLiability", "getLiabilityRate", "getTodayPnlAmount", "getTodayPnlRatio", "getFundsInfoList", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class MarginPositionDetail {

    @Nullable
    private final String balanceCurrency;

    @Nullable
    private final List<FundsInfo> fundsInfoList;

    @Nullable
    private final String liabilityRate;

    @Nullable
    private final String status;

    @Nullable
    private final String todayPnlAmount;

    @Nullable
    private final String todayPnlRatio;

    @Nullable
    private final String totalBalance;

    @Nullable
    private final String totalLiability;

    public MarginPositionDetail() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MarginPositionDetail)) {
            return false;
        }
        MarginPositionDetail marginPositionDetail = (MarginPositionDetail) other;
        return Intrinsics.areEqual(this.status, marginPositionDetail.status) && Intrinsics.areEqual(this.totalBalance, marginPositionDetail.totalBalance) && Intrinsics.areEqual(this.balanceCurrency, marginPositionDetail.balanceCurrency) && Intrinsics.areEqual(this.totalLiability, marginPositionDetail.totalLiability) && Intrinsics.areEqual(this.liabilityRate, marginPositionDetail.liabilityRate) && Intrinsics.areEqual(this.todayPnlAmount, marginPositionDetail.todayPnlAmount) && Intrinsics.areEqual(this.todayPnlRatio, marginPositionDetail.todayPnlRatio) && Intrinsics.areEqual(this.fundsInfoList, marginPositionDetail.fundsInfoList);
    }

    public MarginPositionDetail(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable List<FundsInfo> list) {
        this.status = str;
        this.totalBalance = str2;
        this.balanceCurrency = str3;
        this.totalLiability = str4;
        this.liabilityRate = str5;
        this.todayPnlAmount = str6;
        this.todayPnlRatio = str7;
        this.fundsInfoList = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MarginPositionDetail copy$default(MarginPositionDetail marginPositionDetail, String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = marginPositionDetail.status;
        }
        if ((i11 & 2) != 0) {
            str2 = marginPositionDetail.totalBalance;
        }
        if ((i11 & 4) != 0) {
            str3 = marginPositionDetail.balanceCurrency;
        }
        if ((i11 & 8) != 0) {
            str4 = marginPositionDetail.totalLiability;
        }
        if ((i11 & 16) != 0) {
            str5 = marginPositionDetail.liabilityRate;
        }
        if ((i11 & 32) != 0) {
            str6 = marginPositionDetail.todayPnlAmount;
        }
        if ((i11 & 64) != 0) {
            str7 = marginPositionDetail.todayPnlRatio;
        }
        if ((i11 & 128) != 0) {
            list = marginPositionDetail.fundsInfoList;
        }
        String str8 = str7;
        List list2 = list;
        String str9 = str5;
        String str10 = str6;
        return marginPositionDetail.copy(str, str2, str3, str4, str9, str10, str8, list2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTotalBalance() {
        return this.totalBalance;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getBalanceCurrency() {
        return this.balanceCurrency;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTotalLiability() {
        return this.totalLiability;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getLiabilityRate() {
        return this.liabilityRate;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getTodayPnlAmount() {
        return this.todayPnlAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getTodayPnlRatio() {
        return this.todayPnlRatio;
    }

    @Nullable
    public final List<FundsInfo> component8() {
        return this.fundsInfoList;
    }

    @NotNull
    public final MarginPositionDetail copy(@Nullable String status, @Nullable String totalBalance, @Nullable String balanceCurrency, @Nullable String totalLiability, @Nullable String liabilityRate, @Nullable String todayPnlAmount, @Nullable String todayPnlRatio, @Nullable List<FundsInfo> fundsInfoList) {
        return new MarginPositionDetail(status, totalBalance, balanceCurrency, totalLiability, liabilityRate, todayPnlAmount, todayPnlRatio, fundsInfoList);
    }

    @Nullable
    public final String getBalanceCurrency() {
        return this.balanceCurrency;
    }

    @Nullable
    public final List<FundsInfo> getFundsInfoList() {
        return this.fundsInfoList;
    }

    @Nullable
    public final String getLiabilityRate() {
        return this.liabilityRate;
    }

    @Nullable
    public final String getStatus() {
        return this.status;
    }

    @Nullable
    public final String getTodayPnlAmount() {
        return this.todayPnlAmount;
    }

    @Nullable
    public final String getTodayPnlRatio() {
        return this.todayPnlRatio;
    }

    @Nullable
    public final String getTotalBalance() {
        return this.totalBalance;
    }

    @Nullable
    public final String getTotalLiability() {
        return this.totalLiability;
    }

    public int hashCode() {
        String str = this.status;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.totalBalance;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.balanceCurrency;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.totalLiability;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.liabilityRate;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.todayPnlAmount;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.todayPnlRatio;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        List<FundsInfo> list = this.fundsInfoList;
        return iHashCode7 + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "MarginPositionDetail(status=" + this.status + ", totalBalance=" + this.totalBalance + ", balanceCurrency=" + this.balanceCurrency + ", totalLiability=" + this.totalLiability + ", liabilityRate=" + this.liabilityRate + ", todayPnlAmount=" + this.todayPnlAmount + ", todayPnlRatio=" + this.todayPnlRatio + ", fundsInfoList=" + this.fundsInfoList + ')';
    }

    public /* synthetic */ MarginPositionDetail(String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4, (i11 & 16) != 0 ? null : str5, (i11 & 32) != 0 ? null : str6, (i11 & 64) != 0 ? null : str7, (i11 & 128) != 0 ? null : list);
    }
}
