package com.kubi.assets.entity;

import androidx.annotation.Keep;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AccountOrderEntity.kt */
/* JADX INFO: loaded from: classes.dex */
@Keep
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/assets/entity/SaveAccountOrderConfigBody;", "", "sortType", "", "accountTypeList", "", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getSortType", "()Ljava/lang/String;", "getAccountTypeList", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class SaveAccountOrderConfigBody {

    @NotNull
    private final List<String> accountTypeList;

    @NotNull
    private final String sortType;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SaveAccountOrderConfigBody)) {
            return false;
        }
        SaveAccountOrderConfigBody saveAccountOrderConfigBody = (SaveAccountOrderConfigBody) other;
        return Intrinsics.areEqual(this.sortType, saveAccountOrderConfigBody.sortType) && Intrinsics.areEqual(this.accountTypeList, saveAccountOrderConfigBody.accountTypeList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SaveAccountOrderConfigBody copy$default(SaveAccountOrderConfigBody saveAccountOrderConfigBody, String str, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = saveAccountOrderConfigBody.sortType;
        }
        if ((i11 & 2) != 0) {
            list = saveAccountOrderConfigBody.accountTypeList;
        }
        return saveAccountOrderConfigBody.copy(str, list);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSortType() {
        return this.sortType;
    }

    @NotNull
    public final List<String> component2() {
        return this.accountTypeList;
    }

    @NotNull
    public final List<String> getAccountTypeList() {
        return this.accountTypeList;
    }

    @NotNull
    public final String getSortType() {
        return this.sortType;
    }

    public int hashCode() {
        return (this.sortType.hashCode() * 31) + this.accountTypeList.hashCode();
    }

    @NotNull
    public String toString() {
        return "SaveAccountOrderConfigBody(sortType=" + this.sortType + ", accountTypeList=" + this.accountTypeList + ')';
    }

    public SaveAccountOrderConfigBody(@NotNull String sortType, @NotNull List<String> accountTypeList) {
        Intrinsics.checkNotNullParameter(sortType, "sortType");
        Intrinsics.checkNotNullParameter(accountTypeList, "accountTypeList");
        this.sortType = sortType;
        this.accountTypeList = accountTypeList;
    }

    @NotNull
    public final SaveAccountOrderConfigBody copy(@NotNull String sortType, @NotNull List<String> accountTypeList) {
        Intrinsics.checkNotNullParameter(sortType, "sortType");
        Intrinsics.checkNotNullParameter(accountTypeList, "accountTypeList");
        return new SaveAccountOrderConfigBody(sortType, accountTypeList);
    }
}
