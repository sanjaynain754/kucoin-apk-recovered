package com.kubi.transfer.entity;

import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ReqMultiAccountBalanceParam.kt */
/* JADX INFO: loaded from: classes51.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0012J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003JV\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\r¨\u0006\""}, m90084d2 = {"Lcom/kubi/transfer/entity/AccountTransferResult;", "", FirebaseAnalytics.Param.CURRENCY, "", "amount", "accountType", "accountTag", DbParams.KEY_CHANNEL_RESULT, "", "failMsg", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)V", "getCurrency", "()Ljava/lang/String;", "getAmount", "getAccountType", "getAccountTag", "getResult", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getFailMsg", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)Lcom/kubi/transfer/entity/AccountTransferResult;", "equals", "other", "hashCode", "", "toString", "TransferLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class AccountTransferResult {

    @Nullable
    private final String accountTag;

    @Nullable
    private final String accountType;

    @Nullable
    private final String amount;

    @Nullable
    private final String currency;

    @Nullable
    private final String failMsg;

    @Nullable
    private final Boolean result;

    public AccountTransferResult() {
        this(null, null, null, null, null, null, 63, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AccountTransferResult)) {
            return false;
        }
        AccountTransferResult accountTransferResult = (AccountTransferResult) other;
        return Intrinsics.areEqual(this.currency, accountTransferResult.currency) && Intrinsics.areEqual(this.amount, accountTransferResult.amount) && Intrinsics.areEqual(this.accountType, accountTransferResult.accountType) && Intrinsics.areEqual(this.accountTag, accountTransferResult.accountTag) && Intrinsics.areEqual(this.result, accountTransferResult.result) && Intrinsics.areEqual(this.failMsg, accountTransferResult.failMsg);
    }

    public AccountTransferResult(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Boolean bool, @Nullable String str5) {
        this.currency = str;
        this.amount = str2;
        this.accountType = str3;
        this.accountTag = str4;
        this.result = bool;
        this.failMsg = str5;
    }

    public static /* synthetic */ AccountTransferResult copy$default(AccountTransferResult accountTransferResult, String str, String str2, String str3, String str4, Boolean bool, String str5, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = accountTransferResult.currency;
        }
        if ((i11 & 2) != 0) {
            str2 = accountTransferResult.amount;
        }
        if ((i11 & 4) != 0) {
            str3 = accountTransferResult.accountType;
        }
        if ((i11 & 8) != 0) {
            str4 = accountTransferResult.accountTag;
        }
        if ((i11 & 16) != 0) {
            bool = accountTransferResult.result;
        }
        if ((i11 & 32) != 0) {
            str5 = accountTransferResult.failMsg;
        }
        Boolean bool2 = bool;
        String str6 = str5;
        return accountTransferResult.copy(str, str2, str3, str4, bool2, str6);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAmount() {
        return this.amount;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAccountType() {
        return this.accountType;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getAccountTag() {
        return this.accountTag;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Boolean getResult() {
        return this.result;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getFailMsg() {
        return this.failMsg;
    }

    @NotNull
    public final AccountTransferResult copy(@Nullable String currency, @Nullable String amount, @Nullable String accountType, @Nullable String accountTag, @Nullable Boolean result, @Nullable String failMsg) {
        return new AccountTransferResult(currency, amount, accountType, accountTag, result, failMsg);
    }

    @Nullable
    public final String getAccountTag() {
        return this.accountTag;
    }

    @Nullable
    public final String getAccountType() {
        return this.accountType;
    }

    @Nullable
    public final String getAmount() {
        return this.amount;
    }

    @Nullable
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    public final String getFailMsg() {
        return this.failMsg;
    }

    @Nullable
    public final Boolean getResult() {
        return this.result;
    }

    public int hashCode() {
        String str = this.currency;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.amount;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.accountType;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.accountTag;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool = this.result;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str5 = this.failMsg;
        return iHashCode5 + (str5 != null ? str5.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "AccountTransferResult(currency=" + this.currency + ", amount=" + this.amount + ", accountType=" + this.accountType + ", accountTag=" + this.accountTag + ", result=" + this.result + ", failMsg=" + this.failMsg + ')';
    }

    public /* synthetic */ AccountTransferResult(String str, String str2, String str3, String str4, Boolean bool, String str5, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4, (i11 & 16) != 0 ? null : bool, (i11 & 32) != 0 ? null : str5);
    }
}
