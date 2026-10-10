package com.kubi.transfer;

import cn.jiguang.privates.analysis.constants.JAnalysisConstants;
import com.kubi.data.coin.AccountType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p208dr.InterfaceC36952a;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: com.kubi.transfer.z0, reason: from toString */
/* JADX INFO: compiled from: TransferStateContract.kt */
/* JADX INFO: loaded from: classes51.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/transfer/TransferStateContract$ShowUnifiedTransferAccountTip;", "Lcom/kubi/mvi/event/ISingleEvent;", JAnalysisConstants.Account.KEY_ACCOUNT, "Lcom/kubi/data/coin/AccountType;", "<init>", "(Lcom/kubi/data/coin/AccountType;)V", "getAccount", "()Lcom/kubi/data/coin/AccountType;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "TransferLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class ShowUnifiedTransferAccountTip implements InterfaceC36952a {

    /* JADX INFO: renamed from: a, reason: from toString */
    @Nullable
    public final AccountType account;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ShowUnifiedTransferAccountTip) && this.account == ((ShowUnifiedTransferAccountTip) other).account;
    }

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final AccountType getAccount() {
        return this.account;
    }

    public int hashCode() {
        AccountType accountType = this.account;
        if (accountType == null) {
            return 0;
        }
        return accountType.hashCode();
    }

    @NotNull
    public String toString() {
        return "ShowUnifiedTransferAccountTip(account=" + this.account + ')';
    }

    public ShowUnifiedTransferAccountTip(@Nullable AccountType accountType) {
        this.account = accountType;
    }
}
