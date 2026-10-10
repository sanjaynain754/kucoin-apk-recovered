package com.kubi.transfer.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.kubi.data.coin.AccountType;
import com.kubi.data.entity.SingleCurrencyBalance;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AccountItem.kt */
/* JADX INFO: loaded from: classes51.dex */
@Keep
@Metadata(m90083d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0006\u0010\u0016\u001a\u00020\u0017J\u0013\u0010\u0018\u001a\u00020\u00052\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0017HÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\u0016\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0017R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006#"}, m90084d2 = {"Lcom/kubi/transfer/entity/AccountItem;", "Landroid/os/Parcelable;", "accountType", "Lcom/kubi/data/coin/AccountType;", "checked", "", "singleCurrencyBalance", "Lcom/kubi/data/entity/SingleCurrencyBalance;", "<init>", "(Lcom/kubi/data/coin/AccountType;ZLcom/kubi/data/entity/SingleCurrencyBalance;)V", "getAccountType", "()Lcom/kubi/data/coin/AccountType;", "getChecked", "()Z", "setChecked", "(Z)V", "getSingleCurrencyBalance", "()Lcom/kubi/data/entity/SingleCurrencyBalance;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "TransferLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class AccountItem implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<AccountItem> CREATOR = new C26307a();

    @NotNull
    private final AccountType accountType;
    private boolean checked;

    @Nullable
    private final SingleCurrencyBalance singleCurrencyBalance;

    /* JADX INFO: renamed from: com.kubi.transfer.entity.AccountItem$a */
    /* JADX INFO: compiled from: AccountItem.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C26307a implements Parcelable.Creator<AccountItem> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AccountItem createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AccountItem(AccountType.valueOf(parcel.readString()), parcel.readInt() != 0, (SingleCurrencyBalance) parcel.readParcelable(AccountItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final AccountItem[] newArray(int i11) {
            return new AccountItem[i11];
        }
    }

    public AccountItem(@NotNull AccountType accountType, boolean z11, @Nullable SingleCurrencyBalance singleCurrencyBalance) {
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        this.accountType = accountType;
        this.checked = z11;
        this.singleCurrencyBalance = singleCurrencyBalance;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AccountItem)) {
            return false;
        }
        AccountItem accountItem = (AccountItem) other;
        return this.accountType == accountItem.accountType && this.checked == accountItem.checked && Intrinsics.areEqual(this.singleCurrencyBalance, accountItem.singleCurrencyBalance);
    }

    public static /* synthetic */ AccountItem copy$default(AccountItem accountItem, AccountType accountType, boolean z11, SingleCurrencyBalance singleCurrencyBalance, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            accountType = accountItem.accountType;
        }
        if ((i11 & 2) != 0) {
            z11 = accountItem.checked;
        }
        if ((i11 & 4) != 0) {
            singleCurrencyBalance = accountItem.singleCurrencyBalance;
        }
        return accountItem.copy(accountType, z11, singleCurrencyBalance);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final AccountType getAccountType() {
        return this.accountType;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getChecked() {
        return this.checked;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final SingleCurrencyBalance getSingleCurrencyBalance() {
        return this.singleCurrencyBalance;
    }

    @NotNull
    public final AccountItem copy(@NotNull AccountType accountType, boolean checked, @Nullable SingleCurrencyBalance singleCurrencyBalance) {
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        return new AccountItem(accountType, checked, singleCurrencyBalance);
    }

    @NotNull
    public final AccountType getAccountType() {
        return this.accountType;
    }

    public final boolean getChecked() {
        return this.checked;
    }

    @Nullable
    public final SingleCurrencyBalance getSingleCurrencyBalance() {
        return this.singleCurrencyBalance;
    }

    public int hashCode() {
        int iHashCode = ((this.accountType.hashCode() * 31) + Boolean.hashCode(this.checked)) * 31;
        SingleCurrencyBalance singleCurrencyBalance = this.singleCurrencyBalance;
        return iHashCode + (singleCurrencyBalance == null ? 0 : singleCurrencyBalance.hashCode());
    }

    public final void setChecked(boolean z11) {
        this.checked = z11;
    }

    @NotNull
    public String toString() {
        return "AccountItem(accountType=" + this.accountType + ", checked=" + this.checked + ", singleCurrencyBalance=" + this.singleCurrencyBalance + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.accountType.name());
        dest.writeInt(this.checked ? 1 : 0);
        dest.writeParcelable(this.singleCurrencyBalance, flags);
    }

    public /* synthetic */ AccountItem(AccountType accountType, boolean z11, SingleCurrencyBalance singleCurrencyBalance, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(accountType, (i11 & 2) != 0 ? false : z11, (i11 & 4) != 0 ? null : singleCurrencyBalance);
    }
}
