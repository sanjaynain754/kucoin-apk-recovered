package com.kubi.transfer.entity;

import androidx.annotation.Keep;
import com.kubi.data.coin.AccountType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AccountInfos.kt */
/* JADX INFO: loaded from: classes51.dex */
@Keep
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\fJ2\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u0005\u0010\fR\u0011\u0010\u000e\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, m90084d2 = {"Lcom/kubi/transfer/entity/AccountInfos;", "", "fromType", "Lcom/kubi/data/coin/AccountType;", "toType", "isChange", "", "<init>", "(Lcom/kubi/data/coin/AccountType;Lcom/kubi/data/coin/AccountType;Ljava/lang/Boolean;)V", "getFromType", "()Lcom/kubi/data/coin/AccountType;", "getToType", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "isShowAvailableBalance", "()Z", "component1", "component2", "component3", "copy", "(Lcom/kubi/data/coin/AccountType;Lcom/kubi/data/coin/AccountType;Ljava/lang/Boolean;)Lcom/kubi/transfer/entity/AccountInfos;", "equals", "other", "hashCode", "", "toString", "", "TransferLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class AccountInfos {

    @Nullable
    private final AccountType fromType;

    @Nullable
    private final Boolean isChange;

    @Nullable
    private final AccountType toType;

    public AccountInfos(@Nullable AccountType accountType, @Nullable AccountType accountType2, @Nullable Boolean bool) {
        this.fromType = accountType;
        this.toType = accountType2;
        this.isChange = bool;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AccountInfos)) {
            return false;
        }
        AccountInfos accountInfos = (AccountInfos) other;
        return this.fromType == accountInfos.fromType && this.toType == accountInfos.toType && Intrinsics.areEqual(this.isChange, accountInfos.isChange);
    }

    public static /* synthetic */ AccountInfos copy$default(AccountInfos accountInfos, AccountType accountType, AccountType accountType2, Boolean bool, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            accountType = accountInfos.fromType;
        }
        if ((i11 & 2) != 0) {
            accountType2 = accountInfos.toType;
        }
        if ((i11 & 4) != 0) {
            bool = accountInfos.isChange;
        }
        return accountInfos.copy(accountType, accountType2, bool);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final AccountType getFromType() {
        return this.fromType;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final AccountType getToType() {
        return this.toType;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Boolean getIsChange() {
        return this.isChange;
    }

    @NotNull
    public final AccountInfos copy(@Nullable AccountType fromType, @Nullable AccountType toType, @Nullable Boolean isChange) {
        return new AccountInfos(fromType, toType, isChange);
    }

    @Nullable
    public final AccountType getFromType() {
        return this.fromType;
    }

    @Nullable
    public final AccountType getToType() {
        return this.toType;
    }

    public int hashCode() {
        AccountType accountType = this.fromType;
        int iHashCode = (accountType == null ? 0 : accountType.hashCode()) * 31;
        AccountType accountType2 = this.toType;
        int iHashCode2 = (iHashCode + (accountType2 == null ? 0 : accountType2.hashCode())) * 31;
        Boolean bool = this.isChange;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    @Nullable
    public final Boolean isChange() {
        return this.isChange;
    }

    public final boolean isShowAvailableBalance() {
        AccountType accountType = this.fromType;
        AccountType accountType2 = AccountType.ISOLATED;
        return (accountType == accountType2 || this.toType == accountType2) ? false : true;
    }

    @NotNull
    public String toString() {
        return "AccountInfos(fromType=" + this.fromType + ", toType=" + this.toType + ", isChange=" + this.isChange + ')';
    }

    public /* synthetic */ AccountInfos(AccountType accountType, AccountType accountType2, Boolean bool, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(accountType, accountType2, (i11 & 4) != 0 ? Boolean.TRUE : bool);
    }
}
