package p197db;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: db.a, reason: from toString */
/* JADX INFO: compiled from: TransferBalanceWsManager.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0010\u001a\u00020\u0003H\u0016J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J=\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00072\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u000f¨\u0006\u001b"}, m90084d2 = {"Lcom/kubi/assets/multiaccountuse/AccountBalance;", "", "accountType", "", "accountTypeName", "transferBalance", "isDefault", "", "isChosen", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)V", "getAccountType", "()Ljava/lang/String;", "getAccountTypeName", "getTransferBalance", "()Z", "toString", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "AssetsCenterApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class AccountBalance {

    /* JADX INFO: renamed from: a, reason: from toString */
    @NotNull
    public final String accountType;

    /* JADX INFO: renamed from: b, reason: from toString */
    @Nullable
    public final String accountTypeName;

    /* JADX INFO: renamed from: c, reason: from toString */
    @NotNull
    public final String transferBalance;

    /* JADX INFO: renamed from: d, reason: from toString */
    public final boolean isDefault;

    /* JADX INFO: renamed from: e, reason: from toString */
    public final boolean isChosen;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AccountBalance)) {
            return false;
        }
        AccountBalance accountBalance = (AccountBalance) other;
        return Intrinsics.areEqual(this.accountType, accountBalance.accountType) && Intrinsics.areEqual(this.accountTypeName, accountBalance.accountTypeName) && Intrinsics.areEqual(this.transferBalance, accountBalance.transferBalance) && this.isDefault == accountBalance.isDefault && this.isChosen == accountBalance.isChosen;
    }

    public AccountBalance(@NotNull String accountType, @Nullable String str, @NotNull String transferBalance, boolean z11, boolean z12) {
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        Intrinsics.checkNotNullParameter(transferBalance, "transferBalance");
        this.accountType = accountType;
        this.accountTypeName = str;
        this.transferBalance = transferBalance;
        this.isDefault = z11;
        this.isChosen = z12;
    }

    public int hashCode() {
        int iHashCode = this.accountType.hashCode() * 31;
        String str = this.accountTypeName;
        return ((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.transferBalance.hashCode()) * 31) + Boolean.hashCode(this.isDefault)) * 31) + Boolean.hashCode(this.isChosen);
    }

    @NotNull
    public String toString() {
        return "AccountBalance(accountType=" + this.accountType + ", accountTypeName=" + this.accountTypeName + ", transferBalance=" + this.transferBalance + ", isDefault=" + this.isDefault + ", isChosen=" + this.isChosen + ')';
    }
}
