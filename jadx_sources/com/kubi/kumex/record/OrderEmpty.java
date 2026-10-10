package com.kubi.kumex.record;

import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.kumex.record.c0, reason: from Kotlin metadata and from toString */
/* JADX INFO: compiled from: OrderObjects.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0013J>\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\t2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\b\u0010\u0013¨\u0006\u001f"}, m90084d2 = {"Lcom/kubi/kumex/record/OrderEmpty;", "", "balance", "Ljava/math/BigDecimal;", "settleCurrency", "", "precision", "", "isTrial", "", "<init>", "(Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;)V", "getBalance", "()Ljava/math/BigDecimal;", "getSettleCurrency", "()Ljava/lang/String;", "getPrecision", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "copy", "(Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;)Lcom/kubi/kumex/record/OrderEmpty;", "equals", "other", "hashCode", "toString", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class OrderEmpty {

    /* JADX INFO: renamed from: a, reason: from toString */
    @Nullable
    public final BigDecimal balance;

    /* JADX INFO: renamed from: b, reason: from toString */
    @Nullable
    public final String settleCurrency;

    /* JADX INFO: renamed from: c, reason: from toString */
    @Nullable
    public final Integer precision;

    /* JADX INFO: renamed from: d, reason: from toString */
    @Nullable
    public final Boolean isTrial;

    public OrderEmpty() {
        this(null, null, null, null, 15, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderEmpty)) {
            return false;
        }
        OrderEmpty orderEmpty = (OrderEmpty) other;
        return Intrinsics.areEqual(this.balance, orderEmpty.balance) && Intrinsics.areEqual(this.settleCurrency, orderEmpty.settleCurrency) && Intrinsics.areEqual(this.precision, orderEmpty.precision) && Intrinsics.areEqual(this.isTrial, orderEmpty.isTrial);
    }

    public OrderEmpty(@Nullable BigDecimal bigDecimal, @Nullable String str, @Nullable Integer num, @Nullable Boolean bool) {
        this.balance = bigDecimal;
        this.settleCurrency = str;
        this.precision = num;
        this.isTrial = bool;
    }

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final BigDecimal getBalance() {
        return this.balance;
    }

    @Nullable
    /* JADX INFO: renamed from: b, reason: from getter */
    public final Integer getPrecision() {
        return this.precision;
    }

    @Nullable
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getSettleCurrency() {
        return this.settleCurrency;
    }

    @Nullable
    /* JADX INFO: renamed from: d, reason: from getter */
    public final Boolean getIsTrial() {
        return this.isTrial;
    }

    public int hashCode() {
        BigDecimal bigDecimal = this.balance;
        int iHashCode = (bigDecimal == null ? 0 : bigDecimal.hashCode()) * 31;
        String str = this.settleCurrency;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.precision;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.isTrial;
        return iHashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "OrderEmpty(balance=" + this.balance + ", settleCurrency=" + this.settleCurrency + ", precision=" + this.precision + ", isTrial=" + this.isTrial + ')';
    }

    public /* synthetic */ OrderEmpty(BigDecimal bigDecimal, String str, Integer num, Boolean bool, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : bigDecimal, (i11 & 2) != 0 ? null : str, (i11 & 4) != 0 ? null : num, (i11 & 8) != 0 ? null : bool);
    }
}
