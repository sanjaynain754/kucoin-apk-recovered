package com.kubi.transfer;

import com.kubi.data.coin.AccountType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p208dr.InterfaceC36952a;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.transfer.a1, reason: from toString */
/* JADX INFO: compiled from: TransferStateContract.kt */
/* JADX INFO: loaded from: classes51.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, m90084d2 = {"Lcom/kubi/transfer/TransferStateContract$TransferResult;", "Lcom/kubi/mvi/event/ISingleEvent;", "amount", "", "coin", "toAccountType", "Lcom/kubi/data/coin/AccountType;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/kubi/data/coin/AccountType;)V", "getAmount", "()Ljava/lang/String;", "getCoin", "getToAccountType", "()Lcom/kubi/data/coin/AccountType;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "TransferLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class TransferResult implements InterfaceC36952a {

    /* JADX INFO: renamed from: a, reason: from toString */
    @NotNull
    public final String amount;

    /* JADX INFO: renamed from: b, reason: from toString */
    @NotNull
    public final String coin;

    /* JADX INFO: renamed from: c, reason: from toString */
    @Nullable
    public final AccountType toAccountType;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransferResult)) {
            return false;
        }
        TransferResult transferResult = (TransferResult) other;
        return Intrinsics.areEqual(this.amount, transferResult.amount) && Intrinsics.areEqual(this.coin, transferResult.coin) && this.toAccountType == transferResult.toAccountType;
    }

    public TransferResult(@NotNull String amount, @NotNull String coin, @Nullable AccountType accountType) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(coin, "coin");
        this.amount = amount;
        this.coin = coin;
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

    @Nullable
    /* JADX INFO: renamed from: c, reason: from getter */
    public final AccountType getToAccountType() {
        return this.toAccountType;
    }

    public int hashCode() {
        int iHashCode = ((this.amount.hashCode() * 31) + this.coin.hashCode()) * 31;
        AccountType accountType = this.toAccountType;
        return iHashCode + (accountType == null ? 0 : accountType.hashCode());
    }

    @NotNull
    public String toString() {
        return "TransferResult(amount=" + this.amount + ", coin=" + this.coin + ", toAccountType=" + this.toAccountType + ')';
    }
}
