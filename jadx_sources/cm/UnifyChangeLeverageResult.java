package cm;

import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: cm.q, reason: from toString */
/* JADX INFO: compiled from: UnifyChangeLeverageResult.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003JE\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001d"}, m90084d2 = {"Lcom/kubi/kumex/data/trade/model/UnifyChangeLeverageResult;", "", "posPreLiqPrice", "Ljava/math/BigDecimal;", "posMargin", "currentMargin", "posPreDeltaMargin", "riskLimitMax", "<init>", "(Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;)V", "getPosPreLiqPrice", "()Ljava/math/BigDecimal;", "getPosMargin", "getCurrentMargin", "getPosPreDeltaMargin", "getRiskLimitMax", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "", "KumexApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class UnifyChangeLeverageResult {

    /* JADX INFO: renamed from: a, reason: from toString */
    @Nullable
    public final BigDecimal posPreLiqPrice;

    /* JADX INFO: renamed from: b, reason: from toString */
    @Nullable
    public final BigDecimal posMargin;

    /* JADX INFO: renamed from: c, reason: from toString */
    @Nullable
    public final BigDecimal currentMargin;

    /* JADX INFO: renamed from: d, reason: from toString */
    @Nullable
    public final BigDecimal posPreDeltaMargin;

    /* JADX INFO: renamed from: e, reason: from toString */
    @Nullable
    public final BigDecimal riskLimitMax;

    public UnifyChangeLeverageResult() {
        this(null, null, null, null, null, 31, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UnifyChangeLeverageResult)) {
            return false;
        }
        UnifyChangeLeverageResult unifyChangeLeverageResult = (UnifyChangeLeverageResult) other;
        return Intrinsics.areEqual(this.posPreLiqPrice, unifyChangeLeverageResult.posPreLiqPrice) && Intrinsics.areEqual(this.posMargin, unifyChangeLeverageResult.posMargin) && Intrinsics.areEqual(this.currentMargin, unifyChangeLeverageResult.currentMargin) && Intrinsics.areEqual(this.posPreDeltaMargin, unifyChangeLeverageResult.posPreDeltaMargin) && Intrinsics.areEqual(this.riskLimitMax, unifyChangeLeverageResult.riskLimitMax);
    }

    public UnifyChangeLeverageResult(@Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2, @Nullable BigDecimal bigDecimal3, @Nullable BigDecimal bigDecimal4, @Nullable BigDecimal bigDecimal5) {
        this.posPreLiqPrice = bigDecimal;
        this.posMargin = bigDecimal2;
        this.currentMargin = bigDecimal3;
        this.posPreDeltaMargin = bigDecimal4;
        this.riskLimitMax = bigDecimal5;
    }

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final BigDecimal getCurrentMargin() {
        return this.currentMargin;
    }

    @Nullable
    /* JADX INFO: renamed from: b, reason: from getter */
    public final BigDecimal getPosMargin() {
        return this.posMargin;
    }

    @Nullable
    /* JADX INFO: renamed from: c, reason: from getter */
    public final BigDecimal getPosPreDeltaMargin() {
        return this.posPreDeltaMargin;
    }

    @Nullable
    /* JADX INFO: renamed from: d, reason: from getter */
    public final BigDecimal getPosPreLiqPrice() {
        return this.posPreLiqPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: e, reason: from getter */
    public final BigDecimal getRiskLimitMax() {
        return this.riskLimitMax;
    }

    public int hashCode() {
        BigDecimal bigDecimal = this.posPreLiqPrice;
        int iHashCode = (bigDecimal == null ? 0 : bigDecimal.hashCode()) * 31;
        BigDecimal bigDecimal2 = this.posMargin;
        int iHashCode2 = (iHashCode + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.currentMargin;
        int iHashCode3 = (iHashCode2 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        BigDecimal bigDecimal4 = this.posPreDeltaMargin;
        int iHashCode4 = (iHashCode3 + (bigDecimal4 == null ? 0 : bigDecimal4.hashCode())) * 31;
        BigDecimal bigDecimal5 = this.riskLimitMax;
        return iHashCode4 + (bigDecimal5 != null ? bigDecimal5.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "UnifyChangeLeverageResult(posPreLiqPrice=" + this.posPreLiqPrice + ", posMargin=" + this.posMargin + ", currentMargin=" + this.currentMargin + ", posPreDeltaMargin=" + this.posPreDeltaMargin + ", riskLimitMax=" + this.riskLimitMax + ')';
    }

    public /* synthetic */ UnifyChangeLeverageResult(BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : bigDecimal, (i11 & 2) != 0 ? null : bigDecimal2, (i11 & 4) != 0 ? null : bigDecimal3, (i11 & 8) != 0 ? null : bigDecimal4, (i11 & 16) != 0 ? null : bigDecimal5);
    }
}
