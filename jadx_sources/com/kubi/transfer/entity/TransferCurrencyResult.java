package com.kubi.transfer.entity;

import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: TransferCurrencyResult.kt */
/* JADX INFO: loaded from: classes51.dex */
@Keep
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\fJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J2\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u0019"}, m90084d2 = {"Lcom/kubi/transfer/entity/TransferCurrencyResult;", "", FirebaseAnalytics.Param.CURRENCY, "", DbParams.KEY_CHANNEL_RESULT, "", "failMsg", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)V", "getCurrency", "()Ljava/lang/String;", "getResult", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getFailMsg", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)Lcom/kubi/transfer/entity/TransferCurrencyResult;", "equals", "other", "hashCode", "", "toString", "TransferLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class TransferCurrencyResult {

    @Nullable
    private final String currency;

    @Nullable
    private final String failMsg;

    @Nullable
    private final Boolean result;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransferCurrencyResult)) {
            return false;
        }
        TransferCurrencyResult transferCurrencyResult = (TransferCurrencyResult) other;
        return Intrinsics.areEqual(this.currency, transferCurrencyResult.currency) && Intrinsics.areEqual(this.result, transferCurrencyResult.result) && Intrinsics.areEqual(this.failMsg, transferCurrencyResult.failMsg);
    }

    public static /* synthetic */ TransferCurrencyResult copy$default(TransferCurrencyResult transferCurrencyResult, String str, Boolean bool, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = transferCurrencyResult.currency;
        }
        if ((i11 & 2) != 0) {
            bool = transferCurrencyResult.result;
        }
        if ((i11 & 4) != 0) {
            str2 = transferCurrencyResult.failMsg;
        }
        return transferCurrencyResult.copy(str, bool, str2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Boolean getResult() {
        return this.result;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getFailMsg() {
        return this.failMsg;
    }

    @NotNull
    public final TransferCurrencyResult copy(@Nullable String currency, @Nullable Boolean result, @Nullable String failMsg) {
        return new TransferCurrencyResult(currency, result, failMsg);
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
        Boolean bool = this.result;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.failMsg;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "TransferCurrencyResult(currency=" + this.currency + ", result=" + this.result + ", failMsg=" + this.failMsg + ')';
    }

    public TransferCurrencyResult(@Nullable String str, @Nullable Boolean bool, @Nullable String str2) {
        this.currency = str;
        this.result = bool;
        this.failMsg = str2;
    }
}
