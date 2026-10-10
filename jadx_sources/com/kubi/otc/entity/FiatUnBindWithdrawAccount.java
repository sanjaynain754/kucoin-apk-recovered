package com.kubi.otc.entity;

import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FiatBean.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\u0011"}, m90084d2 = {"Lcom/kubi/otc/entity/FiatUnBindWithdrawAccount;", "", "payoutAccountId", "", "<init>", "(Ljava/lang/String;)V", "getPayoutAccountId", "()Ljava/lang/String;", "setPayoutAccountId", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class FiatUnBindWithdrawAccount {

    @SerializedName("payout_account_id")
    @Nullable
    private String payoutAccountId;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof FiatUnBindWithdrawAccount) && Intrinsics.areEqual(this.payoutAccountId, ((FiatUnBindWithdrawAccount) other).payoutAccountId);
    }

    public static /* synthetic */ FiatUnBindWithdrawAccount copy$default(FiatUnBindWithdrawAccount fiatUnBindWithdrawAccount, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = fiatUnBindWithdrawAccount.payoutAccountId;
        }
        return fiatUnBindWithdrawAccount.copy(str);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPayoutAccountId() {
        return this.payoutAccountId;
    }

    @NotNull
    public final FiatUnBindWithdrawAccount copy(@Nullable String payoutAccountId) {
        return new FiatUnBindWithdrawAccount(payoutAccountId);
    }

    @Nullable
    public final String getPayoutAccountId() {
        return this.payoutAccountId;
    }

    public int hashCode() {
        String str = this.payoutAccountId;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final void setPayoutAccountId(@Nullable String str) {
        this.payoutAccountId = str;
    }

    @NotNull
    public String toString() {
        return "FiatUnBindWithdrawAccount(payoutAccountId=" + this.payoutAccountId + ')';
    }

    public FiatUnBindWithdrawAccount(@Nullable String str) {
        this.payoutAccountId = str;
    }
}
