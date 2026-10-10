package com.revolut.revolutpay.api;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0019\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001d"}, m90084d2 = {"Lcom/revolut/revolutpay/api/CashbackState;", "Landroid/os/Parcelable;", "cashback", "Lcom/revolut/revolutpay/api/Money;", "steps", "", "Lcom/revolut/revolutpay/api/CashbackStep;", "(Lcom/revolut/revolutpay/api/Money;Ljava/util/List;)V", "getCashback", "()Lcom/revolut/revolutpay/api/Money;", "getSteps", "()Ljava/util/List;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "revolut_pay_sdk_2_0_release"}, m90085k = 1, m90086mv = {1, 7, 1}, m90088xi = 48)
public final /* data */ class CashbackState implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CashbackState> CREATOR = new C27520a();

    @NotNull
    private final Money cashback;

    @NotNull
    private final List<CashbackStep> steps;

    /* JADX INFO: renamed from: com.revolut.revolutpay.api.CashbackState$a */
    @Metadata(m90085k = 3, m90086mv = {1, 7, 1}, m90088xi = 48)
    public static final class C27520a implements Parcelable.Creator<CashbackState> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CashbackState[] newArray(int i11) {
            return new CashbackState[i11];
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CashbackState createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            Money moneyCreateFromParcel = Money.CREATOR.createFromParcel(parcel);
            int i11 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i11);
            for (int i12 = 0; i12 != i11; i12++) {
                arrayList.add(parcel.readParcelable(CashbackState.class.getClassLoader()));
            }
            return new CashbackState(moneyCreateFromParcel, arrayList);
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
        if (!(other instanceof CashbackState)) {
            return false;
        }
        CashbackState cashbackState = (CashbackState) other;
        return Intrinsics.areEqual(this.cashback, cashbackState.cashback) && Intrinsics.areEqual(this.steps, cashbackState.steps);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CashbackState(@NotNull Money cashback, @NotNull List<? extends CashbackStep> steps) {
        Intrinsics.checkNotNullParameter(cashback, "cashback");
        Intrinsics.checkNotNullParameter(steps, "steps");
        this.cashback = cashback;
        this.steps = steps;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CashbackState copy$default(CashbackState cashbackState, Money money, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            money = cashbackState.cashback;
        }
        if ((i11 & 2) != 0) {
            list = cashbackState.steps;
        }
        return cashbackState.copy(money, list);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Money getCashback() {
        return this.cashback;
    }

    @NotNull
    public final List<CashbackStep> component2() {
        return this.steps;
    }

    @NotNull
    public final CashbackState copy(@NotNull Money cashback, @NotNull List<? extends CashbackStep> steps) {
        Intrinsics.checkNotNullParameter(cashback, "cashback");
        Intrinsics.checkNotNullParameter(steps, "steps");
        return new CashbackState(cashback, steps);
    }

    @NotNull
    public final Money getCashback() {
        return this.cashback;
    }

    @NotNull
    public final List<CashbackStep> getSteps() {
        return this.steps;
    }

    public int hashCode() {
        return (this.cashback.hashCode() * 31) + this.steps.hashCode();
    }

    @NotNull
    public String toString() {
        return "CashbackState(cashback=" + this.cashback + ", steps=" + this.steps + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        this.cashback.writeToParcel(parcel, flags);
        List<CashbackStep> list = this.steps;
        parcel.writeInt(list.size());
        Iterator<CashbackStep> it = list.iterator();
        while (it.hasNext()) {
            parcel.writeParcelable(it.next(), flags);
        }
    }
}
