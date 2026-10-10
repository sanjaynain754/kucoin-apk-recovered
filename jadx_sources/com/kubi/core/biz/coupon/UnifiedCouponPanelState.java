package com.kubi.core.biz.coupon;

import com.google.firebase.analytics.FirebaseAnalytics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.core.biz.coupon.c, reason: from Kotlin metadata */
/* JADX INFO: compiled from: UnifiedTradeCoupon.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, m90084d2 = {"Lcom/kubi/core/biz/coupon/UnifiedCouponPanelState;", "", "<init>", "()V", "Hidden", "FeeDeduction", "InterestUsing", "InterestCount", "Lcom/kubi/core/biz/coupon/UnifiedCouponPanelState$FeeDeduction;", "Lcom/kubi/core/biz/coupon/UnifiedCouponPanelState$Hidden;", "Lcom/kubi/core/biz/coupon/UnifiedCouponPanelState$InterestCount;", "Lcom/kubi/core/biz/coupon/UnifiedCouponPanelState$InterestUsing;", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public abstract class UnifiedCouponPanelState {

    /* JADX INFO: renamed from: com.kubi.core.biz.coupon.c$a, reason: from toString */
    /* JADX INFO: compiled from: UnifiedTradeCoupon.kt */
    @Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, m90084d2 = {"Lcom/kubi/core/biz/coupon/UnifiedCouponPanelState$FeeDeduction;", "Lcom/kubi/core/biz/coupon/UnifiedCouponPanelState;", "amount", "", FirebaseAnalytics.Param.CURRENCY, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getAmount", "()Ljava/lang/String;", "getCurrency", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class FeeDeduction extends UnifiedCouponPanelState {

        /* JADX INFO: renamed from: a, reason: from toString */
        @NotNull
        public final String amount;

        /* JADX INFO: renamed from: b, reason: from toString */
        @NotNull
        public final String currency;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FeeDeduction)) {
                return false;
            }
            FeeDeduction feeDeduction = (FeeDeduction) other;
            return Intrinsics.areEqual(this.amount, feeDeduction.amount) && Intrinsics.areEqual(this.currency, feeDeduction.currency);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FeeDeduction(@NotNull String amount, @NotNull String currency) {
            super(null);
            Intrinsics.checkNotNullParameter(amount, "amount");
            Intrinsics.checkNotNullParameter(currency, "currency");
            this.amount = amount;
            this.currency = currency;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getAmount() {
            return this.amount;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getCurrency() {
            return this.currency;
        }

        public int hashCode() {
            return (this.amount.hashCode() * 31) + this.currency.hashCode();
        }

        @NotNull
        public String toString() {
            return "FeeDeduction(amount=" + this.amount + ", currency=" + this.currency + ')';
        }
    }

    /* JADX INFO: renamed from: com.kubi.core.biz.coupon.c$b */
    /* JADX INFO: compiled from: UnifiedTradeCoupon.kt */
    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m90084d2 = {"Lcom/kubi/core/biz/coupon/UnifiedCouponPanelState$Hidden;", "Lcom/kubi/core/biz/coupon/UnifiedCouponPanelState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class b extends UnifiedCouponPanelState {

        /* JADX INFO: renamed from: a */
        @NotNull
        public static final b f20382a = new b();

        public b() {
            super(null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof b);
        }

        @NotNull
        public String toString() {
            return "Hidden";
        }

        public int hashCode() {
            return -392714335;
        }
    }

    /* JADX INFO: renamed from: com.kubi.core.biz.coupon.c$c, reason: from toString */
    /* JADX INFO: compiled from: UnifiedTradeCoupon.kt */
    @Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m90084d2 = {"Lcom/kubi/core/biz/coupon/UnifiedCouponPanelState$InterestCount;", "Lcom/kubi/core/biz/coupon/UnifiedCouponPanelState;", "count", "", "<init>", "(I)V", "getCount", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class InterestCount extends UnifiedCouponPanelState {

        /* JADX INFO: renamed from: a, reason: from toString */
        public final int count;

        public InterestCount(int i11) {
            super(null);
            this.count = i11;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof InterestCount) && this.count == ((InterestCount) other).count;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getCount() {
            return this.count;
        }

        public int hashCode() {
            return Integer.hashCode(this.count);
        }

        @NotNull
        public String toString() {
            return "InterestCount(count=" + this.count + ')';
        }
    }

    /* JADX INFO: renamed from: com.kubi.core.biz.coupon.c$d, reason: from toString */
    /* JADX INFO: compiled from: UnifiedTradeCoupon.kt */
    @Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m90084d2 = {"Lcom/kubi/core/biz/coupon/UnifiedCouponPanelState$InterestUsing;", "Lcom/kubi/core/biz/coupon/UnifiedCouponPanelState;", "discountRate", "", "<init>", "(Ljava/lang/String;)V", "getDiscountRate", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class InterestUsing extends UnifiedCouponPanelState {

        /* JADX INFO: renamed from: a, reason: from toString */
        @NotNull
        public final String discountRate;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof InterestUsing) && Intrinsics.areEqual(this.discountRate, ((InterestUsing) other).discountRate);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InterestUsing(@NotNull String discountRate) {
            super(null);
            Intrinsics.checkNotNullParameter(discountRate, "discountRate");
            this.discountRate = discountRate;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getDiscountRate() {
            return this.discountRate;
        }

        public int hashCode() {
            return this.discountRate.hashCode();
        }

        @NotNull
        public String toString() {
            return "InterestUsing(discountRate=" + this.discountRate + ')';
        }
    }

    public /* synthetic */ UnifiedCouponPanelState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public UnifiedCouponPanelState() {
    }
}
