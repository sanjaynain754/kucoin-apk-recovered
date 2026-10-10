package com.kubi.sdk;

import androidx.annotation.Keep;
import androidx.exifinterface.media.ExifInterface;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: BasePageAdapter.kt */
/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B9\u0012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u0018J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÆ\u0003J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0012J\t\u0010\u001c\u001a\u00020\tHÆ\u0003J\t\u0010\u001d\u001a\u00020\tHÆ\u0003JN\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0002\u0010\u001fJ\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010#\u001a\u00020\u0006HÖ\u0001J\t\u0010$\u001a\u00020%HÖ\u0001R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015¨\u0006&"}, m90084d2 = {"Lcom/kubi/sdk/PageEntity1;", ExifInterface.GPS_DIRECTION_TRUE, "", FirebaseAnalytics.Param.ITEMS, "", "currentPage", "", "pageSize", "totalNum", "", "totalPage", "<init>", "(Ljava/util/List;ILjava/lang/Integer;JJ)V", "getItems", "()Ljava/util/List;", "getCurrentPage", "()I", "getPageSize", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTotalNum", "()J", "getTotalPage", "toPageEntity", "Lcom/kubi/sdk/PageEntity;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/util/List;ILjava/lang/Integer;JJ)Lcom/kubi/sdk/PageEntity1;", "equals", "", "other", "hashCode", "toString", "", "LBase_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nBasePageAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasePageAdapter.kt\ncom/kubi/sdk/PageEntity1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,99:1\n1563#2:100\n1634#2,3:101\n*S KotlinDebug\n*F\n+ 1 BasePageAdapter.kt\ncom/kubi/sdk/PageEntity1\n*L\n91#1:100\n91#1:101,3\n*E\n"})
public final /* data */ class PageEntity1<T> {
    private final int currentPage;

    @NotNull
    private final List<T> items;

    @Nullable
    private final Integer pageSize;
    private final long totalNum;
    private final long totalPage;

    public PageEntity1(@NotNull List<T> items, int i11, @Nullable Integer num, long j11, long j12) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.items = items;
        this.currentPage = i11;
        this.pageSize = num;
        this.totalNum = j11;
        this.totalPage = j12;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PageEntity1)) {
            return false;
        }
        PageEntity1 pageEntity1 = (PageEntity1) other;
        return Intrinsics.areEqual(this.items, pageEntity1.items) && this.currentPage == pageEntity1.currentPage && Intrinsics.areEqual(this.pageSize, pageEntity1.pageSize) && this.totalNum == pageEntity1.totalNum && this.totalPage == pageEntity1.totalPage;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PageEntity1 copy$default(PageEntity1 pageEntity1, List list, int i11, Integer num, long j11, long j12, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            list = pageEntity1.items;
        }
        if ((i12 & 2) != 0) {
            i11 = pageEntity1.currentPage;
        }
        if ((i12 & 4) != 0) {
            num = pageEntity1.pageSize;
        }
        if ((i12 & 8) != 0) {
            j11 = pageEntity1.totalNum;
        }
        if ((i12 & 16) != 0) {
            j12 = pageEntity1.totalPage;
        }
        long j13 = j12;
        Integer num2 = num;
        return pageEntity1.copy(list, i11, num2, j11, j13);
    }

    @NotNull
    public final List<T> component1() {
        return this.items;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getCurrentPage() {
        return this.currentPage;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getPageSize() {
        return this.pageSize;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getTotalNum() {
        return this.totalNum;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getTotalPage() {
        return this.totalPage;
    }

    @NotNull
    public final PageEntity1<T> copy(@NotNull List<T> items, int currentPage, @Nullable Integer pageSize, long totalNum, long totalPage) {
        Intrinsics.checkNotNullParameter(items, "items");
        return new PageEntity1<>(items, currentPage, pageSize, totalNum, totalPage);
    }

    public final int getCurrentPage() {
        return this.currentPage;
    }

    @NotNull
    public final List<T> getItems() {
        return this.items;
    }

    @Nullable
    public final Integer getPageSize() {
        return this.pageSize;
    }

    public final long getTotalNum() {
        return this.totalNum;
    }

    public final long getTotalPage() {
        return this.totalPage;
    }

    public int hashCode() {
        int iHashCode = ((this.items.hashCode() * 31) + Integer.hashCode(this.currentPage)) * 31;
        Integer num = this.pageSize;
        return ((((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + Long.hashCode(this.totalNum)) * 31) + Long.hashCode(this.totalPage);
    }

    @NotNull
    public final PageEntity<Object> toPageEntity() {
        List<T> list = this.items;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (T t11 : list) {
            Intrinsics.checkNotNull(t11, "null cannot be cast to non-null type kotlin.Any");
            arrayList.add(t11);
        }
        return new PageEntity<>(CollectionsKt.toMutableList((Collection) arrayList), ((long) this.currentPage) < this.totalPage, null, 0, 0, Long.valueOf(this.totalNum));
    }

    @NotNull
    public String toString() {
        return "PageEntity1(items=" + this.items + ", currentPage=" + this.currentPage + ", pageSize=" + this.pageSize + ", totalNum=" + this.totalNum + ", totalPage=" + this.totalPage + ')';
    }

    public /* synthetic */ PageEntity1(List list, int i11, Integer num, long j11, long j12, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? new ArrayList() : list, i11, num, j11, j12);
    }
}
