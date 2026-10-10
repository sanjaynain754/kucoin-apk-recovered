package com.kubi.assets.entity;

import androidx.annotation.Keep;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AccountOrderEntity.kt */
/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J/\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0018"}, m90084d2 = {"Lcom/kubi/assets/entity/AccountOrderEntity;", "", "userId", "", "accountTypeList", "", "sortType", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "getUserId", "()Ljava/lang/String;", "getAccountTypeList", "()Ljava/util/List;", "getSortType", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class AccountOrderEntity {

    @NotNull
    private final List<String> accountTypeList;

    @NotNull
    private final String sortType;

    @Nullable
    private final String userId;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AccountOrderEntity)) {
            return false;
        }
        AccountOrderEntity accountOrderEntity = (AccountOrderEntity) other;
        return Intrinsics.areEqual(this.userId, accountOrderEntity.userId) && Intrinsics.areEqual(this.accountTypeList, accountOrderEntity.accountTypeList) && Intrinsics.areEqual(this.sortType, accountOrderEntity.sortType);
    }

    public AccountOrderEntity(@Nullable String str, @NotNull List<String> accountTypeList, @NotNull String sortType) {
        Intrinsics.checkNotNullParameter(accountTypeList, "accountTypeList");
        Intrinsics.checkNotNullParameter(sortType, "sortType");
        this.userId = str;
        this.accountTypeList = accountTypeList;
        this.sortType = sortType;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AccountOrderEntity copy$default(AccountOrderEntity accountOrderEntity, String str, List list, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = accountOrderEntity.userId;
        }
        if ((i11 & 2) != 0) {
            list = accountOrderEntity.accountTypeList;
        }
        if ((i11 & 4) != 0) {
            str2 = accountOrderEntity.sortType;
        }
        return accountOrderEntity.copy(str, list, str2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    @NotNull
    public final List<String> component2() {
        return this.accountTypeList;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSortType() {
        return this.sortType;
    }

    @NotNull
    public final AccountOrderEntity copy(@Nullable String userId, @NotNull List<String> accountTypeList, @NotNull String sortType) {
        Intrinsics.checkNotNullParameter(accountTypeList, "accountTypeList");
        Intrinsics.checkNotNullParameter(sortType, "sortType");
        return new AccountOrderEntity(userId, accountTypeList, sortType);
    }

    @NotNull
    public final List<String> getAccountTypeList() {
        return this.accountTypeList;
    }

    @NotNull
    public final String getSortType() {
        return this.sortType;
    }

    @Nullable
    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        String str = this.userId;
        return ((((str == null ? 0 : str.hashCode()) * 31) + this.accountTypeList.hashCode()) * 31) + this.sortType.hashCode();
    }

    @NotNull
    public String toString() {
        return "AccountOrderEntity(userId=" + this.userId + ", accountTypeList=" + this.accountTypeList + ", sortType=" + this.sortType + ')';
    }
}
