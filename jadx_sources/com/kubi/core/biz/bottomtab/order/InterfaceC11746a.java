package com.kubi.core.biz.bottomtab.order;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.core.biz.bottomtab.order.a */
/* JADX INFO: compiled from: BottomOrderTabsContract.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/core/biz/bottomtab/order/BottomOrderTabsContract$BizEvent;", "", "UpdateDepositEntrance", "OrderChange", "Lcom/kubi/core/biz/bottomtab/order/BottomOrderTabsContract$BizEvent$OrderChange;", "Lcom/kubi/core/biz/bottomtab/order/BottomOrderTabsContract$BizEvent$UpdateDepositEntrance;", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface InterfaceC11746a {

    /* JADX INFO: renamed from: com.kubi.core.biz.bottomtab.order.a$a */
    /* JADX INFO: compiled from: BottomOrderTabsContract.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m90084d2 = {"Lcom/kubi/core/biz/bottomtab/order/BottomOrderTabsContract$BizEvent$OrderChange;", "Lcom/kubi/core/biz/bottomtab/order/BottomOrderTabsContract$BizEvent;", "<init>", "()V", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class a implements InterfaceC11746a {
    }

    /* JADX INFO: renamed from: com.kubi.core.biz.bottomtab.order.a$b, reason: from toString */
    /* JADX INFO: compiled from: BottomOrderTabsContract.kt */
    @Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003J7\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u00032\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, m90084d2 = {"Lcom/kubi/core/biz/bottomtab/order/BottomOrderTabsContract$BizEvent$UpdateDepositEntrance;", "Lcom/kubi/core/biz/bottomtab/order/BottomOrderTabsContract$BizEvent;", "needGuideDeposit", "", "quoteBalanceDisplayStr", "", FirebaseAnalytics.Param.CURRENCY, "", "quoteBalance", "Ljava/math/BigDecimal;", "<init>", "(ZLjava/lang/CharSequence;Ljava/lang/String;Ljava/math/BigDecimal;)V", "getNeedGuideDeposit", "()Z", "getQuoteBalanceDisplayStr", "()Ljava/lang/CharSequence;", "getCurrency", "()Ljava/lang/String;", "getQuoteBalance", "()Ljava/math/BigDecimal;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "", "hashCode", "", "toString", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class UpdateDepositEntrance implements InterfaceC11746a {

        /* JADX INFO: renamed from: a, reason: from toString */
        public final boolean needGuideDeposit;

        /* JADX INFO: renamed from: b, reason: from toString */
        @Nullable
        public final CharSequence quoteBalanceDisplayStr;

        /* JADX INFO: renamed from: c, reason: from toString */
        @Nullable
        public final String currency;

        /* JADX INFO: renamed from: d, reason: from toString */
        @Nullable
        public final BigDecimal quoteBalance;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UpdateDepositEntrance)) {
                return false;
            }
            UpdateDepositEntrance updateDepositEntrance = (UpdateDepositEntrance) other;
            return this.needGuideDeposit == updateDepositEntrance.needGuideDeposit && Intrinsics.areEqual(this.quoteBalanceDisplayStr, updateDepositEntrance.quoteBalanceDisplayStr) && Intrinsics.areEqual(this.currency, updateDepositEntrance.currency) && Intrinsics.areEqual(this.quoteBalance, updateDepositEntrance.quoteBalance);
        }

        @Nullable
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getCurrency() {
            return this.currency;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getNeedGuideDeposit() {
            return this.needGuideDeposit;
        }

        @Nullable
        /* JADX INFO: renamed from: c, reason: from getter */
        public final BigDecimal getQuoteBalance() {
            return this.quoteBalance;
        }

        @Nullable
        /* JADX INFO: renamed from: d, reason: from getter */
        public final CharSequence getQuoteBalanceDisplayStr() {
            return this.quoteBalanceDisplayStr;
        }

        public int hashCode() {
            int iHashCode = Boolean.hashCode(this.needGuideDeposit) * 31;
            CharSequence charSequence = this.quoteBalanceDisplayStr;
            int iHashCode2 = (iHashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
            String str = this.currency;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            BigDecimal bigDecimal = this.quoteBalance;
            return iHashCode3 + (bigDecimal != null ? bigDecimal.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "UpdateDepositEntrance(needGuideDeposit=" + this.needGuideDeposit + ", quoteBalanceDisplayStr=" + ((Object) this.quoteBalanceDisplayStr) + ", currency=" + this.currency + ", quoteBalance=" + this.quoteBalance + ')';
        }

        public UpdateDepositEntrance(boolean z11, @Nullable CharSequence charSequence, @Nullable String str, @Nullable BigDecimal bigDecimal) {
            this.needGuideDeposit = z11;
            this.quoteBalanceDisplayStr = charSequence;
            this.currency = str;
            this.quoteBalance = bigDecimal;
        }
    }
}
