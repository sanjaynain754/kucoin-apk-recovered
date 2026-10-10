package com.kubi.operation.lib.realtimev2;

import androidx.annotation.Keep;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: DynamicCardEntity.kt */
/* JADX INFO: loaded from: classes32.dex */
@Keep
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J3\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0018"}, m90084d2 = {"Lcom/kubi/operation/lib/realtimev2/DynamicCardDeleteItem;", "", "bizType", "", "bizIdList", "", "deleteType", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "getBizType", "()Ljava/lang/String;", "getBizIdList", "()Ljava/util/List;", "getDeleteType", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "OperationLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class DynamicCardDeleteItem {

    @Nullable
    private final List<String> bizIdList;

    @Nullable
    private final String bizType;

    @Nullable
    private final String deleteType;

    public DynamicCardDeleteItem() {
        this(null, null, null, 7, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DynamicCardDeleteItem)) {
            return false;
        }
        DynamicCardDeleteItem dynamicCardDeleteItem = (DynamicCardDeleteItem) other;
        return Intrinsics.areEqual(this.bizType, dynamicCardDeleteItem.bizType) && Intrinsics.areEqual(this.bizIdList, dynamicCardDeleteItem.bizIdList) && Intrinsics.areEqual(this.deleteType, dynamicCardDeleteItem.deleteType);
    }

    public DynamicCardDeleteItem(@Nullable String str, @Nullable List<String> list, @Nullable String str2) {
        this.bizType = str;
        this.bizIdList = list;
        this.deleteType = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DynamicCardDeleteItem copy$default(DynamicCardDeleteItem dynamicCardDeleteItem, String str, List list, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = dynamicCardDeleteItem.bizType;
        }
        if ((i11 & 2) != 0) {
            list = dynamicCardDeleteItem.bizIdList;
        }
        if ((i11 & 4) != 0) {
            str2 = dynamicCardDeleteItem.deleteType;
        }
        return dynamicCardDeleteItem.copy(str, list, str2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getBizType() {
        return this.bizType;
    }

    @Nullable
    public final List<String> component2() {
        return this.bizIdList;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDeleteType() {
        return this.deleteType;
    }

    @NotNull
    public final DynamicCardDeleteItem copy(@Nullable String bizType, @Nullable List<String> bizIdList, @Nullable String deleteType) {
        return new DynamicCardDeleteItem(bizType, bizIdList, deleteType);
    }

    @Nullable
    public final List<String> getBizIdList() {
        return this.bizIdList;
    }

    @Nullable
    public final String getBizType() {
        return this.bizType;
    }

    @Nullable
    public final String getDeleteType() {
        return this.deleteType;
    }

    public int hashCode() {
        String str = this.bizType;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<String> list = this.bizIdList;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.deleteType;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "DynamicCardDeleteItem(bizType=" + this.bizType + ", bizIdList=" + this.bizIdList + ", deleteType=" + this.deleteType + ')';
    }

    public /* synthetic */ DynamicCardDeleteItem(String str, List list, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : list, (i11 & 4) != 0 ? null : str2);
    }
}
