package com.revolut.revolutpay.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.analytics.FirebaseAnalytics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\u0019\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u001c"}, m90084d2 = {"Lcom/revolut/revolutpay/api/Money;", "Landroid/os/Parcelable;", "amount", "", FirebaseAnalytics.Param.CURRENCY, "Lcom/revolut/revolutpay/api/Currency;", "(JLcom/revolut/revolutpay/api/Currency;)V", "getAmount", "()J", "getCurrency", "()Lcom/revolut/revolutpay/api/Currency;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "revolut_pay_sdk_2_0_release"}, m90085k = 1, m90086mv = {1, 7, 1}, m90088xi = 48)
public final /* data */ class Money implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<Money> CREATOR = new C27521a();
    private final long amount;

    @NotNull
    private final Currency currency;

    /* JADX INFO: renamed from: com.revolut.revolutpay.api.Money$a */
    @Metadata(m90085k = 3, m90086mv = {1, 7, 1}, m90088xi = 48)
    public static final class C27521a implements Parcelable.Creator<Money> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Money[] newArray(int i11) {
            return new Money[i11];
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Money createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Money(parcel.readLong(), Currency.valueOf(parcel.readString()));
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Money)) {
            return false;
        }
        Money money = (Money) other;
        return this.amount == money.amount && this.currency == money.currency;
    }

    public Money(long j11, @NotNull Currency currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.amount = j11;
        this.currency = currency;
    }

    public static /* synthetic */ Money copy$default(Money money, long j11, Currency currency, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = money.amount;
        }
        if ((i11 & 2) != 0) {
            currency = money.currency;
        }
        return money.copy(j11, currency);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getAmount() {
        return this.amount;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Currency getCurrency() {
        return this.currency;
    }

    @NotNull
    public final Money copy(long amount, @NotNull Currency currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        return new Money(amount, currency);
    }

    public final long getAmount() {
        return this.amount;
    }

    @NotNull
    public final Currency getCurrency() {
        return this.currency;
    }

    public int hashCode() {
        return (Long.hashCode(this.amount) * 31) + this.currency.hashCode();
    }

    @NotNull
    public String toString() {
        return "Money(amount=" + this.amount + ", currency=" + this.currency + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeLong(this.amount);
        parcel.writeString(this.currency.name());
    }
}
