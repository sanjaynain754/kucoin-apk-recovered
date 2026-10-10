package com.kubi.user.account;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AccountChange.kt */
/* JADX INFO: loaded from: classes53.dex */
@Keep
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/user/account/AccountChange;", "", "changeId", "", "type", "Lcom/kubi/user/account/AccountChangeType;", "<init>", "(Ljava/lang/String;Lcom/kubi/user/account/AccountChangeType;)V", "getChangeId", "()Ljava/lang/String;", "getType", "()Lcom/kubi/user/account/AccountChangeType;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "LUser_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class AccountChange {

    @NotNull
    private final String changeId;

    @NotNull
    private final AccountChangeType type;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AccountChange)) {
            return false;
        }
        AccountChange accountChange = (AccountChange) other;
        return Intrinsics.areEqual(this.changeId, accountChange.changeId) && this.type == accountChange.type;
    }

    public AccountChange(@NotNull String changeId, @NotNull AccountChangeType type) {
        Intrinsics.checkNotNullParameter(changeId, "changeId");
        Intrinsics.checkNotNullParameter(type, "type");
        this.changeId = changeId;
        this.type = type;
    }

    public static /* synthetic */ AccountChange copy$default(AccountChange accountChange, String str, AccountChangeType accountChangeType, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = accountChange.changeId;
        }
        if ((i11 & 2) != 0) {
            accountChangeType = accountChange.type;
        }
        return accountChange.copy(str, accountChangeType);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getChangeId() {
        return this.changeId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final AccountChangeType getType() {
        return this.type;
    }

    @NotNull
    public final AccountChange copy(@NotNull String changeId, @NotNull AccountChangeType type) {
        Intrinsics.checkNotNullParameter(changeId, "changeId");
        Intrinsics.checkNotNullParameter(type, "type");
        return new AccountChange(changeId, type);
    }

    @NotNull
    public final String getChangeId() {
        return this.changeId;
    }

    @NotNull
    public final AccountChangeType getType() {
        return this.type;
    }

    public int hashCode() {
        return (this.changeId.hashCode() * 31) + this.type.hashCode();
    }

    @NotNull
    public String toString() {
        return "AccountChange(changeId=" + this.changeId + ", type=" + this.type + ')';
    }
}
