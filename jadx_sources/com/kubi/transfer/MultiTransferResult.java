package com.kubi.transfer;

import com.kubi.data.coin.AccountType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p208dr.InterfaceC36952a;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.transfer.y0, reason: from toString */
/* JADX INFO: compiled from: TransferStateContract.kt */
/* JADX INFO: loaded from: classes51.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\nHÆ\u0003JG\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u00062\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\""}, m90084d2 = {"Lcom/kubi/transfer/TransferStateContract$MultiTransferResult;", "Lcom/kubi/mvi/event/ISingleEvent;", "amount", "", "succAccounts", "isAllSucc", "", "coin", "firstErrorMsg", "toAccountType", "Lcom/kubi/data/coin/AccountType;", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lcom/kubi/data/coin/AccountType;)V", "getAmount", "()Ljava/lang/String;", "getSuccAccounts", "()Z", "getCoin", "getFirstErrorMsg", "getToAccountType", "()Lcom/kubi/data/coin/AccountType;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "", "hashCode", "", "toString", "TransferLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class MultiTransferResult implements InterfaceC36952a {

    /* JADX INFO: renamed from: a, reason: from toString */
    @NotNull
    public final String amount;

    /* JADX INFO: renamed from: b, reason: from toString */
    @NotNull
    public final String succAccounts;

    /* JADX INFO: renamed from: c, reason: from toString */
    public final boolean isAllSucc;

    /* JADX INFO: renamed from: d, reason: from toString */
    @NotNull
    public final String coin;

    /* JADX INFO: renamed from: e, reason: from toString */
    @NotNull
    public final String firstErrorMsg;

    /* JADX INFO: renamed from: f, reason: from toString */
    @Nullable
    public final AccountType toAccountType;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MultiTransferResult)) {
            return false;
        }
        MultiTransferResult multiTransferResult = (MultiTransferResult) other;
        return Intrinsics.areEqual(this.amount, multiTransferResult.amount) && Intrinsics.areEqual(this.succAccounts, multiTransferResult.succAccounts) && this.isAllSucc == multiTransferResult.isAllSucc && Intrinsics.areEqual(this.coin, multiTransferResult.coin) && Intrinsics.areEqual(this.firstErrorMsg, multiTransferResult.firstErrorMsg) && this.toAccountType == multiTransferResult.toAccountType;
    }

    public MultiTransferResult(@NotNull String amount, @NotNull String succAccounts, boolean z11, @NotNull String coin, @NotNull String firstErrorMsg, @Nullable AccountType accountType) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(succAccounts, "succAccounts");
        Intrinsics.checkNotNullParameter(coin, "coin");
        Intrinsics.checkNotNullParameter(firstErrorMsg, "firstErrorMsg");
        this.amount = amount;
        this.succAccounts = succAccounts;
        this.isAllSucc = z11;
        this.coin = coin;
        this.firstErrorMsg = firstErrorMsg;
        this.toAccountType = accountType;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAmount() {
        return this.amount;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getCoin() {
        return this.coin;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getFirstErrorMsg() {
        return this.firstErrorMsg;
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getSuccAccounts() {
        return this.succAccounts;
    }

    @Nullable
    /* JADX INFO: renamed from: e, reason: from getter */
    public final AccountType getToAccountType() {
        return this.toAccountType;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getIsAllSucc() {
        return this.isAllSucc;
    }

    public int hashCode() {
        int iHashCode = ((((((((this.amount.hashCode() * 31) + this.succAccounts.hashCode()) * 31) + Boolean.hashCode(this.isAllSucc)) * 31) + this.coin.hashCode()) * 31) + this.firstErrorMsg.hashCode()) * 31;
        AccountType accountType = this.toAccountType;
        return iHashCode + (accountType == null ? 0 : accountType.hashCode());
    }

    @NotNull
    public String toString() {
        return "MultiTransferResult(amount=" + this.amount + ", succAccounts=" + this.succAccounts + ", isAllSucc=" + this.isAllSucc + ", coin=" + this.coin + ", firstErrorMsg=" + this.firstErrorMsg + ", toAccountType=" + this.toAccountType + ')';
    }
}
