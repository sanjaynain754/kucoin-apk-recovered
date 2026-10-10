package com.kubi.assets.exchange.model;

import androidx.annotation.Keep;
import com.kubi.data.coin.AccountType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AccountItem.kt */
/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0017"}, m90084d2 = {"Lcom/kubi/assets/exchange/model/AccountItem;", "", "accountType", "Lcom/kubi/data/coin/AccountType;", "checked", "", "<init>", "(Lcom/kubi/data/coin/AccountType;Z)V", "getAccountType", "()Lcom/kubi/data/coin/AccountType;", "getChecked", "()Z", "setChecked", "(Z)V", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class AccountItem {

    @NotNull
    private final AccountType accountType;
    private boolean checked;

    public AccountItem(@NotNull AccountType accountType, boolean z11) {
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        this.accountType = accountType;
        this.checked = z11;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AccountItem)) {
            return false;
        }
        AccountItem accountItem = (AccountItem) other;
        return this.accountType == accountItem.accountType && this.checked == accountItem.checked;
    }

    public static /* synthetic */ AccountItem copy$default(AccountItem accountItem, AccountType accountType, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            accountType = accountItem.accountType;
        }
        if ((i11 & 2) != 0) {
            z11 = accountItem.checked;
        }
        return accountItem.copy(accountType, z11);
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

    @NotNull
    public final AccountItem copy(@NotNull AccountType accountType, boolean checked) {
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        return new AccountItem(accountType, checked);
    }

    @NotNull
    public final AccountType getAccountType() {
        return this.accountType;
    }

    public final boolean getChecked() {
        return this.checked;
    }

    public int hashCode() {
        return (this.accountType.hashCode() * 31) + Boolean.hashCode(this.checked);
    }

    public final void setChecked(boolean z11) {
        this.checked = z11;
    }

    @NotNull
    public String toString() {
        return "AccountItem(accountType=" + this.accountType + ", checked=" + this.checked + ')';
    }

    public /* synthetic */ AccountItem(AccountType accountType, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(accountType, (i11 & 2) != 0 ? false : z11);
    }
}
