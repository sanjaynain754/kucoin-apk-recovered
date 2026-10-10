package com.kubi.copytrading.assets;

import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.math.BigDecimal;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CopyTdEntity.kt */
/* JADX INFO: loaded from: classes8.dex */
@Keep
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\bHÆ\u0003J?\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, m90084d2 = {"Lcom/kubi/copytrading/assets/ThirtyDayProfitDetail;", "", FirebaseAnalytics.Param.CURRENCY, "", "thirtyDayPnl", "Ljava/math/BigDecimal;", "thirtyDayPnlRatio", "totalPnlDate", "", "<init>", "(Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/util/List;)V", "getCurrency", "()Ljava/lang/String;", "getThirtyDayPnl", "()Ljava/math/BigDecimal;", "getThirtyDayPnlRatio", "getTotalPnlDate", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "CopyTradingLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class ThirtyDayProfitDetail {

    @Nullable
    private final String currency;

    @Nullable
    private final BigDecimal thirtyDayPnl;

    @Nullable
    private final BigDecimal thirtyDayPnlRatio;

    @Nullable
    private final List<BigDecimal> totalPnlDate;

    public ThirtyDayProfitDetail() {
        this(null, null, null, null, 15, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ThirtyDayProfitDetail)) {
            return false;
        }
        ThirtyDayProfitDetail thirtyDayProfitDetail = (ThirtyDayProfitDetail) other;
        return Intrinsics.areEqual(this.currency, thirtyDayProfitDetail.currency) && Intrinsics.areEqual(this.thirtyDayPnl, thirtyDayProfitDetail.thirtyDayPnl) && Intrinsics.areEqual(this.thirtyDayPnlRatio, thirtyDayProfitDetail.thirtyDayPnlRatio) && Intrinsics.areEqual(this.totalPnlDate, thirtyDayProfitDetail.totalPnlDate);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ThirtyDayProfitDetail(@Nullable String str, @Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2, @Nullable List<? extends BigDecimal> list) {
        this.currency = str;
        this.thirtyDayPnl = bigDecimal;
        this.thirtyDayPnlRatio = bigDecimal2;
        this.totalPnlDate = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ThirtyDayProfitDetail copy$default(ThirtyDayProfitDetail thirtyDayProfitDetail, String str, BigDecimal bigDecimal, BigDecimal bigDecimal2, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = thirtyDayProfitDetail.currency;
        }
        if ((i11 & 2) != 0) {
            bigDecimal = thirtyDayProfitDetail.thirtyDayPnl;
        }
        if ((i11 & 4) != 0) {
            bigDecimal2 = thirtyDayProfitDetail.thirtyDayPnlRatio;
        }
        if ((i11 & 8) != 0) {
            list = thirtyDayProfitDetail.totalPnlDate;
        }
        return thirtyDayProfitDetail.copy(str, bigDecimal, bigDecimal2, list);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final BigDecimal getThirtyDayPnl() {
        return this.thirtyDayPnl;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final BigDecimal getThirtyDayPnlRatio() {
        return this.thirtyDayPnlRatio;
    }

    @Nullable
    public final List<BigDecimal> component4() {
        return this.totalPnlDate;
    }

    @NotNull
    public final ThirtyDayProfitDetail copy(@Nullable String currency, @Nullable BigDecimal thirtyDayPnl, @Nullable BigDecimal thirtyDayPnlRatio, @Nullable List<? extends BigDecimal> totalPnlDate) {
        return new ThirtyDayProfitDetail(currency, thirtyDayPnl, thirtyDayPnlRatio, totalPnlDate);
    }

    @Nullable
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    public final BigDecimal getThirtyDayPnl() {
        return this.thirtyDayPnl;
    }

    @Nullable
    public final BigDecimal getThirtyDayPnlRatio() {
        return this.thirtyDayPnlRatio;
    }

    @Nullable
    public final List<BigDecimal> getTotalPnlDate() {
        return this.totalPnlDate;
    }

    public int hashCode() {
        String str = this.currency;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        BigDecimal bigDecimal = this.thirtyDayPnl;
        int iHashCode2 = (iHashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.thirtyDayPnlRatio;
        int iHashCode3 = (iHashCode2 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        List<BigDecimal> list = this.totalPnlDate;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ThirtyDayProfitDetail(currency=" + this.currency + ", thirtyDayPnl=" + this.thirtyDayPnl + ", thirtyDayPnlRatio=" + this.thirtyDayPnlRatio + ", totalPnlDate=" + this.totalPnlDate + ')';
    }

    public /* synthetic */ ThirtyDayProfitDetail(String str, BigDecimal bigDecimal, BigDecimal bigDecimal2, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : bigDecimal, (i11 & 4) != 0 ? null : bigDecimal2, (i11 & 8) != 0 ? null : list);
    }
}
