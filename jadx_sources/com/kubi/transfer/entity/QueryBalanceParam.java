package com.kubi.transfer.entity;

import androidx.annotation.Keep;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: QueryBalanceParam.kt */
/* JADX INFO: loaded from: classes51.dex */
@Keep
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, m90084d2 = {"Lcom/kubi/transfer/entity/QueryBalanceParam;", "", "baseLegalCurrency", "", "accountInfos", "", "Lcom/kubi/transfer/entity/AccountInfo;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getBaseLegalCurrency", "()Ljava/lang/String;", "getAccountInfos", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "TransferLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class QueryBalanceParam {

    @NotNull
    private final List<AccountInfo> accountInfos;

    @NotNull
    private final String baseLegalCurrency;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QueryBalanceParam)) {
            return false;
        }
        QueryBalanceParam queryBalanceParam = (QueryBalanceParam) other;
        return Intrinsics.areEqual(this.baseLegalCurrency, queryBalanceParam.baseLegalCurrency) && Intrinsics.areEqual(this.accountInfos, queryBalanceParam.accountInfos);
    }

    public QueryBalanceParam(@NotNull String baseLegalCurrency, @NotNull List<AccountInfo> accountInfos) {
        Intrinsics.checkNotNullParameter(baseLegalCurrency, "baseLegalCurrency");
        Intrinsics.checkNotNullParameter(accountInfos, "accountInfos");
        this.baseLegalCurrency = baseLegalCurrency;
        this.accountInfos = accountInfos;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ QueryBalanceParam copy$default(QueryBalanceParam queryBalanceParam, String str, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = queryBalanceParam.baseLegalCurrency;
        }
        if ((i11 & 2) != 0) {
            list = queryBalanceParam.accountInfos;
        }
        return queryBalanceParam.copy(str, list);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getBaseLegalCurrency() {
        return this.baseLegalCurrency;
    }

    @NotNull
    public final List<AccountInfo> component2() {
        return this.accountInfos;
    }

    @NotNull
    public final QueryBalanceParam copy(@NotNull String baseLegalCurrency, @NotNull List<AccountInfo> accountInfos) {
        Intrinsics.checkNotNullParameter(baseLegalCurrency, "baseLegalCurrency");
        Intrinsics.checkNotNullParameter(accountInfos, "accountInfos");
        return new QueryBalanceParam(baseLegalCurrency, accountInfos);
    }

    @NotNull
    public final List<AccountInfo> getAccountInfos() {
        return this.accountInfos;
    }

    @NotNull
    public final String getBaseLegalCurrency() {
        return this.baseLegalCurrency;
    }

    public int hashCode() {
        return (this.baseLegalCurrency.hashCode() * 31) + this.accountInfos.hashCode();
    }

    @NotNull
    public String toString() {
        return "QueryBalanceParam(baseLegalCurrency=" + this.baseLegalCurrency + ", accountInfos=" + this.accountInfos + ')';
    }
}
