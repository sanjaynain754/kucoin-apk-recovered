package com.kubi.transfer.entity;

import androidx.annotation.Keep;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ReqMultiAccountBalanceParam.kt */
/* JADX INFO: loaded from: classes51.dex */
@Keep
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J7\u0010\u0015\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0006HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000e¨\u0006\u001c"}, m90084d2 = {"Lcom/kubi/transfer/entity/ReqMultiAccountCoinsParam;", "", "payAccountInfos", "", "Lcom/kubi/transfer/entity/PayAccountInfo;", "recAccountType", "", "recAccountTag", "baseLegalCurrency", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getPayAccountInfos", "()Ljava/util/List;", "getRecAccountType", "()Ljava/lang/String;", "getRecAccountTag", "getBaseLegalCurrency", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "TransferLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class ReqMultiAccountCoinsParam {

    @NotNull
    private final String baseLegalCurrency;

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
        if (!(other instanceof ReqMultiAccountCoinsParam)) {
            return false;
        }
        ReqMultiAccountCoinsParam reqMultiAccountCoinsParam = (ReqMultiAccountCoinsParam) other;
        return Intrinsics.areEqual(this.payAccountInfos, reqMultiAccountCoinsParam.payAccountInfos) && Intrinsics.areEqual(this.recAccountType, reqMultiAccountCoinsParam.recAccountType) && Intrinsics.areEqual(this.recAccountTag, reqMultiAccountCoinsParam.recAccountTag) && Intrinsics.areEqual(this.baseLegalCurrency, reqMultiAccountCoinsParam.baseLegalCurrency);
    }

    public ReqMultiAccountCoinsParam(@NotNull List<PayAccountInfo> payAccountInfos, @NotNull String recAccountType, @NotNull String recAccountTag, @NotNull String baseLegalCurrency) {
        Intrinsics.checkNotNullParameter(payAccountInfos, "payAccountInfos");
        Intrinsics.checkNotNullParameter(recAccountType, "recAccountType");
        Intrinsics.checkNotNullParameter(recAccountTag, "recAccountTag");
        Intrinsics.checkNotNullParameter(baseLegalCurrency, "baseLegalCurrency");
        this.payAccountInfos = payAccountInfos;
        this.recAccountType = recAccountType;
        this.recAccountTag = recAccountTag;
        this.baseLegalCurrency = baseLegalCurrency;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ReqMultiAccountCoinsParam copy$default(ReqMultiAccountCoinsParam reqMultiAccountCoinsParam, List list, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = reqMultiAccountCoinsParam.payAccountInfos;
        }
        if ((i11 & 2) != 0) {
            str = reqMultiAccountCoinsParam.recAccountType;
        }
        if ((i11 & 4) != 0) {
            str2 = reqMultiAccountCoinsParam.recAccountTag;
        }
        if ((i11 & 8) != 0) {
            str3 = reqMultiAccountCoinsParam.baseLegalCurrency;
        }
        return reqMultiAccountCoinsParam.copy(list, str, str2, str3);
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
    public final String getBaseLegalCurrency() {
        return this.baseLegalCurrency;
    }

    @NotNull
    public final ReqMultiAccountCoinsParam copy(@NotNull List<PayAccountInfo> payAccountInfos, @NotNull String recAccountType, @NotNull String recAccountTag, @NotNull String baseLegalCurrency) {
        Intrinsics.checkNotNullParameter(payAccountInfos, "payAccountInfos");
        Intrinsics.checkNotNullParameter(recAccountType, "recAccountType");
        Intrinsics.checkNotNullParameter(recAccountTag, "recAccountTag");
        Intrinsics.checkNotNullParameter(baseLegalCurrency, "baseLegalCurrency");
        return new ReqMultiAccountCoinsParam(payAccountInfos, recAccountType, recAccountTag, baseLegalCurrency);
    }

    @NotNull
    public final String getBaseLegalCurrency() {
        return this.baseLegalCurrency;
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
        return (((((this.payAccountInfos.hashCode() * 31) + this.recAccountType.hashCode()) * 31) + this.recAccountTag.hashCode()) * 31) + this.baseLegalCurrency.hashCode();
    }

    @NotNull
    public String toString() {
        return "ReqMultiAccountCoinsParam(payAccountInfos=" + this.payAccountInfos + ", recAccountType=" + this.recAccountType + ", recAccountTag=" + this.recAccountTag + ", baseLegalCurrency=" + this.baseLegalCurrency + ')';
    }
}
