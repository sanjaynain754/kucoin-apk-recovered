package com.kubi.assets.bill;

import androidx.exifinterface.media.ExifInterface;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.assets.bill.y0, reason: from Kotlin metadata and from toString */
/* JADX INFO: compiled from: AccountBillCommonViewModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B5\u0012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J=\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000f¨\u0006\u001d"}, m90084d2 = {"Lcom/kubi/assets/bill/AccountBillListState;", ExifInterface.GPS_DIRECTION_TRUE, "", "dataList", "", "total", "", "hasMore", "", "currentPage", "<init>", "(Ljava/util/List;IZI)V", "getDataList", "()Ljava/util/List;", "getTotal", "()I", "getHasMore", "()Z", "getCurrentPage", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class AccountBillListState<T> {

    /* JADX INFO: renamed from: a, reason: from toString */
    @NotNull
    public final List<T> dataList;

    /* JADX INFO: renamed from: b, reason: from toString */
    public final int total;

    /* JADX INFO: renamed from: c, reason: from toString */
    public final boolean hasMore;

    /* JADX INFO: renamed from: d, reason: from toString */
    public final int currentPage;

    public AccountBillListState() {
        this(null, 0, false, 0, 15, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AccountBillListState)) {
            return false;
        }
        AccountBillListState accountBillListState = (AccountBillListState) other;
        return Intrinsics.areEqual(this.dataList, accountBillListState.dataList) && this.total == accountBillListState.total && this.hasMore == accountBillListState.hasMore && this.currentPage == accountBillListState.currentPage;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AccountBillListState(@NotNull List<? extends T> dataList, int i11, boolean z11, int i12) {
        Intrinsics.checkNotNullParameter(dataList, "dataList");
        this.dataList = dataList;
        this.total = i11;
        this.hasMore = z11;
        this.currentPage = i12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ AccountBillListState m15814b(AccountBillListState accountBillListState, List list, int i11, boolean z11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            list = accountBillListState.dataList;
        }
        if ((i13 & 2) != 0) {
            i11 = accountBillListState.total;
        }
        if ((i13 & 4) != 0) {
            z11 = accountBillListState.hasMore;
        }
        if ((i13 & 8) != 0) {
            i12 = accountBillListState.currentPage;
        }
        return accountBillListState.m15815a(list, i11, z11, i12);
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final AccountBillListState<T> m15815a(@NotNull List<? extends T> dataList, int i11, boolean z11, int i12) {
        Intrinsics.checkNotNullParameter(dataList, "dataList");
        return new AccountBillListState<>(dataList, i11, z11, i12);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getCurrentPage() {
        return this.currentPage;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final List<T> m15817d() {
        return this.dataList;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getHasMore() {
        return this.hasMore;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getTotal() {
        return this.total;
    }

    public int hashCode() {
        return (((((this.dataList.hashCode() * 31) + Integer.hashCode(this.total)) * 31) + Boolean.hashCode(this.hasMore)) * 31) + Integer.hashCode(this.currentPage);
    }

    @NotNull
    public String toString() {
        return "AccountBillListState(dataList=" + this.dataList + ", total=" + this.total + ", hasMore=" + this.hasMore + ", currentPage=" + this.currentPage + ')';
    }

    public /* synthetic */ AccountBillListState(List list, int i11, boolean z11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? CollectionsKt.emptyList() : list, (i13 & 2) != 0 ? 0 : i11, (i13 & 4) != 0 ? false : z11, (i13 & 8) != 0 ? 1 : i12);
    }
}
