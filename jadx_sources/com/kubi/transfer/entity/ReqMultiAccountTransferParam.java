package com.kubi.transfer.entity;

import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ReqMultiAccountBalanceParam.kt */
/* JADX INFO: loaded from: classes51.dex */
@Keep
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003JA\u0010\u0018\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0006HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000f¨\u0006\u001f"}, m90084d2 = {"Lcom/kubi/transfer/entity/ReqMultiAccountTransferParam;", "", "payAccountInfos", "", "Lcom/kubi/transfer/entity/PayAccountInfo;", "recAccountType", "", "recAccountTag", FirebaseAnalytics.Param.CURRENCY, "amount", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getPayAccountInfos", "()Ljava/util/List;", "getRecAccountType", "()Ljava/lang/String;", "getRecAccountTag", "getCurrency", "getAmount", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "TransferLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class ReqMultiAccountTransferParam {

    @NotNull
    private final String amount;

    @NotNull
    private final String currency;

    @NotNull
    private final List<PayAccountInfo> payAccountInfos;

    @NotNull
    private final String recAccountTag;

    @NotNull
    private final String recAccountType;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReqMultiAccountTransferParam)) {
            return false;
        }
        ReqMultiAccountTransferParam reqMultiAccountTransferParam = (ReqMultiAccountTransferParam) other;
        return Intrinsics.areEqual(this.payAccountInfos, reqMultiAccountTransferParam.payAccountInfos) && Intrinsics.areEqual(this.recAccountType, reqMultiAccountTransferParam.recAccountType) && Intrinsics.areEqual(this.recAccountTag, reqMultiAccountTransferParam.recAccountTag) && Intrinsics.areEqual(this.currency, reqMultiAccountTransferParam.currency) && Intrinsics.areEqual(this.amount, reqMultiAccountTransferParam.amount);
    }

    public ReqMultiAccountTransferParam(@NotNull List<PayAccountInfo> payAccountInfos, @NotNull String recAccountType, @NotNull String recAccountTag, @NotNull String currency, @NotNull String amount) {
        Intrinsics.checkNotNullParameter(payAccountInfos, "payAccountInfos");
        Intrinsics.checkNotNullParameter(recAccountType, "recAccountType");
        Intrinsics.checkNotNullParameter(recAccountTag, "recAccountTag");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.payAccountInfos = payAccountInfos;
        this.recAccountType = recAccountType;
        this.recAccountTag = recAccountTag;
        this.currency = currency;
        this.amount = amount;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ReqMultiAccountTransferParam copy$default(ReqMultiAccountTransferParam reqMultiAccountTransferParam, List list, String str, String str2, String str3, String str4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = reqMultiAccountTransferParam.payAccountInfos;
        }
        if ((i11 & 2) != 0) {
            str = reqMultiAccountTransferParam.recAccountType;
        }
        if ((i11 & 4) != 0) {
            str2 = reqMultiAccountTransferParam.recAccountTag;
        }
        if ((i11 & 8) != 0) {
            str3 = reqMultiAccountTransferParam.currency;
        }
        if ((i11 & 16) != 0) {
            str4 = reqMultiAccountTransferParam.amount;
        }
        String str5 = str4;
        String str6 = str2;
        return reqMultiAccountTransferParam.copy(list, str, str6, str3, str5);
    }

    @NotNull
    public final List<PayAccountInfo> component1() {
        return this.payAccountInfos;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getRecAccountType() {
        return this.recAccountType;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getRecAccountTag() {
        return this.recAccountTag;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getAmount() {
        return this.amount;
    }

    @NotNull
    public final ReqMultiAccountTransferParam copy(@NotNull List<PayAccountInfo> payAccountInfos, @NotNull String recAccountType, @NotNull String recAccountTag, @NotNull String currency, @NotNull String amount) {
        Intrinsics.checkNotNullParameter(payAccountInfos, "payAccountInfos");
        Intrinsics.checkNotNullParameter(recAccountType, "recAccountType");
        Intrinsics.checkNotNullParameter(recAccountTag, "recAccountTag");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(amount, "amount");
        return new ReqMultiAccountTransferParam(payAccountInfos, recAccountType, recAccountTag, currency, amount);
    }

    @NotNull
    public final String getAmount() {
        return this.amount;
    }

    @NotNull
    public final String getCurrency() {
        return this.currency;
    }

    @NotNull
    public final List<PayAccountInfo> getPayAccountInfos() {
        return this.payAccountInfos;
    }

    @NotNull
    public final String getRecAccountTag() {
        return this.recAccountTag;
    }

    @NotNull
    public final String getRecAccountType() {
        return this.recAccountType;
    }

    public int hashCode() {
        return (((((((this.payAccountInfos.hashCode() * 31) + this.recAccountType.hashCode()) * 31) + this.recAccountTag.hashCode()) * 31) + this.currency.hashCode()) * 31) + this.amount.hashCode();
    }

    @NotNull
    public String toString() {
        return "ReqMultiAccountTransferParam(payAccountInfos=" + this.payAccountInfos + ", recAccountType=" + this.recAccountType + ", recAccountTag=" + this.recAccountTag + ", currency=" + this.currency + ", amount=" + this.amount + ')';
    }
}
