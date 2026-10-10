package com.kubi.transfer.entity;

import androidx.annotation.Keep;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ReqMultiAccountBalanceParam.kt */
/* JADX INFO: loaded from: classes51.dex */
@Keep
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J3\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, m90084d2 = {"Lcom/kubi/transfer/entity/RespMultiAccountBalance;", "", "totalBalance", "", "availableBalance", "balanceList", "", "Lcom/kubi/transfer/entity/TransferAccountBalance;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getTotalBalance", "()Ljava/lang/String;", "getAvailableBalance", "getBalanceList", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "TransferLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class RespMultiAccountBalance {

    @Nullable
    private final String availableBalance;

    @Nullable
    private final List<TransferAccountBalance> balanceList;

    @Nullable
    private final String totalBalance;

    public RespMultiAccountBalance() {
        this(null, null, null, 7, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RespMultiAccountBalance)) {
            return false;
        }
        RespMultiAccountBalance respMultiAccountBalance = (RespMultiAccountBalance) other;
        return Intrinsics.areEqual(this.totalBalance, respMultiAccountBalance.totalBalance) && Intrinsics.areEqual(this.availableBalance, respMultiAccountBalance.availableBalance) && Intrinsics.areEqual(this.balanceList, respMultiAccountBalance.balanceList);
    }

    public RespMultiAccountBalance(@Nullable String str, @Nullable String str2, @Nullable List<TransferAccountBalance> list) {
        this.totalBalance = str;
        this.availableBalance = str2;
        this.balanceList = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RespMultiAccountBalance copy$default(RespMultiAccountBalance respMultiAccountBalance, String str, String str2, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = respMultiAccountBalance.totalBalance;
        }
        if ((i11 & 2) != 0) {
            str2 = respMultiAccountBalance.availableBalance;
        }
        if ((i11 & 4) != 0) {
            list = respMultiAccountBalance.balanceList;
        }
        return respMultiAccountBalance.copy(str, str2, list);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTotalBalance() {
        return this.totalBalance;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAvailableBalance() {
        return this.availableBalance;
    }

    @Nullable
    public final List<TransferAccountBalance> component3() {
        return this.balanceList;
    }

    @NotNull
    public final RespMultiAccountBalance copy(@Nullable String totalBalance, @Nullable String availableBalance, @Nullable List<TransferAccountBalance> balanceList) {
        return new RespMultiAccountBalance(totalBalance, availableBalance, balanceList);
    }

    @Nullable
    public final String getAvailableBalance() {
        return this.availableBalance;
    }

    @Nullable
    public final List<TransferAccountBalance> getBalanceList() {
        return this.balanceList;
    }

    @Nullable
    public final String getTotalBalance() {
        return this.totalBalance;
    }

    public int hashCode() {
        String str = this.totalBalance;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.availableBalance;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<TransferAccountBalance> list = this.balanceList;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "RespMultiAccountBalance(totalBalance=" + this.totalBalance + ", availableBalance=" + this.availableBalance + ", balanceList=" + this.balanceList + ')';
    }

    public /* synthetic */ RespMultiAccountBalance(String str, String str2, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? CollectionsKt.emptyList() : list);
    }
}
