package com.kubi.assets.entity;

import android.os.Parcel;
import android.os.Parcelable;
import com.kubi.data.coin.AccountType;
import com.kubi.data.entity.SingleCurrencyBalance;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: WithdrawEntity.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003J5\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0006\u0010\u0019\u001a\u00020\u001aJ\u0013\u0010\u001b\u001a\u00020\u00052\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001f\u001a\u00020\tHÖ\u0001J\u0016\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u001aR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006%"}, m90084d2 = {"Lcom/kubi/assets/entity/AccountItem;", "Landroid/os/Parcelable;", "accountType", "Lcom/kubi/data/coin/AccountType;", "checked", "", "singleCurrencyBalance", "Lcom/kubi/data/entity/SingleCurrencyBalance;", "accountTip", "", "<init>", "(Lcom/kubi/data/coin/AccountType;ZLcom/kubi/data/entity/SingleCurrencyBalance;Ljava/lang/String;)V", "getAccountType", "()Lcom/kubi/data/coin/AccountType;", "getChecked", "()Z", "getSingleCurrencyBalance", "()Lcom/kubi/data/entity/SingleCurrencyBalance;", "getAccountTip", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class AccountItem implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<AccountItem> CREATOR = new Creator();

    @Nullable
    private final String accountTip;

    @NotNull
    private final AccountType accountType;
    private final boolean checked;

    @Nullable
    private final SingleCurrencyBalance singleCurrencyBalance;

    /* JADX INFO: compiled from: WithdrawEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<AccountItem> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AccountItem createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AccountItem(AccountType.valueOf(parcel.readString()), parcel.readInt() != 0, (SingleCurrencyBalance) parcel.readParcelable(AccountItem.class.getClassLoader()), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AccountItem[] newArray(int i11) {
            return new AccountItem[i11];
        }
    }

    public AccountItem(@NotNull AccountType accountType, boolean z11, @Nullable SingleCurrencyBalance singleCurrencyBalance, @Nullable String str) {
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        this.accountType = accountType;
        this.checked = z11;
        this.singleCurrencyBalance = singleCurrencyBalance;
        this.accountTip = str;
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
        return this.accountType == accountItem.accountType && this.checked == accountItem.checked && Intrinsics.areEqual(this.singleCurrencyBalance, accountItem.singleCurrencyBalance) && Intrinsics.areEqual(this.accountTip, accountItem.accountTip);
    }

    public static /* synthetic */ AccountItem copy$default(AccountItem accountItem, AccountType accountType, boolean z11, SingleCurrencyBalance singleCurrencyBalance, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            accountType = accountItem.accountType;
        }
        if ((i11 & 2) != 0) {
            z11 = accountItem.checked;
        }
        if ((i11 & 4) != 0) {
            singleCurrencyBalance = accountItem.singleCurrencyBalance;
        }
        if ((i11 & 8) != 0) {
            str = accountItem.accountTip;
        }
        return accountItem.copy(accountType, z11, singleCurrencyBalance, str);
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

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getAccountTip() {
        return this.accountTip;
    }

    @NotNull
    public final AccountItem copy(@NotNull AccountType accountType, boolean checked, @Nullable SingleCurrencyBalance singleCurrencyBalance, @Nullable String accountTip) {
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        return new AccountItem(accountType, checked, singleCurrencyBalance, accountTip);
    }

    @Nullable
    public final String getAccountTip() {
        return this.accountTip;
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
        int iHashCode2 = (iHashCode + (singleCurrencyBalance == null ? 0 : singleCurrencyBalance.hashCode())) * 31;
        String str = this.accountTip;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "AccountItem(accountType=" + this.accountType + ", checked=" + this.checked + ", singleCurrencyBalance=" + this.singleCurrencyBalance + ", accountTip=" + this.accountTip + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.accountType.name());
        dest.writeInt(this.checked ? 1 : 0);
        dest.writeParcelable(this.singleCurrencyBalance, flags);
        dest.writeString(this.accountTip);
    }

    public /* synthetic */ AccountItem(AccountType accountType, boolean z11, SingleCurrencyBalance singleCurrencyBalance, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(accountType, (i11 & 2) != 0 ? false : z11, (i11 & 4) != 0 ? null : singleCurrencyBalance, (i11 & 8) != 0 ? null : str);
    }
}
