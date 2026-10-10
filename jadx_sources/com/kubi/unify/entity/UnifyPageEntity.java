package com.kubi.unify.entity;

import androidx.annotation.Keep;
import androidx.exifinterface.media.ExifInterface;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: UnifyEntity.kt */
/* JADX INFO: loaded from: classes52.dex */
@Keep
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B?\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u0011\u0010\u0018\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006HÆ\u0003J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u001a\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0014J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0002\u0010\u000eJV\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0002\u0010\u001dJ\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010!\u001a\u00020\u0004HÖ\u0001J\t\u0010\"\u001a\u00020#HÖ\u0001R\u0015\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0012\u0010\u000eR\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0015\u0010\n\u001a\u0004\u0018\u00010\u0004¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0016\u0010\u000e¨\u0006$"}, m90084d2 = {"Lcom/kubi/unify/entity/UnifyPageEntity;", ExifInterface.GPS_DIRECTION_TRUE, "", "currentPage", "", FirebaseAnalytics.Param.ITEMS, "", "pageSize", "totalNum", "", "totalPage", "<init>", "(Ljava/lang/Integer;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Integer;)V", "getCurrentPage", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getItems", "()Ljava/util/List;", "getPageSize", "getTotalNum", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getTotalPage", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/Integer;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Integer;)Lcom/kubi/unify/entity/UnifyPageEntity;", "equals", "", "other", "hashCode", "toString", "", "BUnifyAccountLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class UnifyPageEntity<T> {

    @Nullable
    private final Integer currentPage;

    @Nullable
    private final List<T> items;

    @Nullable
    private final Integer pageSize;

    @Nullable
    private final Long totalNum;

    @Nullable
    private final Integer totalPage;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UnifyPageEntity)) {
            return false;
        }
        UnifyPageEntity unifyPageEntity = (UnifyPageEntity) other;
        return Intrinsics.areEqual(this.currentPage, unifyPageEntity.currentPage) && Intrinsics.areEqual(this.items, unifyPageEntity.items) && Intrinsics.areEqual(this.pageSize, unifyPageEntity.pageSize) && Intrinsics.areEqual(this.totalNum, unifyPageEntity.totalNum) && Intrinsics.areEqual(this.totalPage, unifyPageEntity.totalPage);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UnifyPageEntity copy$default(UnifyPageEntity unifyPageEntity, Integer num, List list, Integer num2, Long l11, Integer num3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            num = unifyPageEntity.currentPage;
        }
        if ((i11 & 2) != 0) {
            list = unifyPageEntity.items;
        }
        if ((i11 & 4) != 0) {
            num2 = unifyPageEntity.pageSize;
        }
        if ((i11 & 8) != 0) {
            l11 = unifyPageEntity.totalNum;
        }
        if ((i11 & 16) != 0) {
            num3 = unifyPageEntity.totalPage;
        }
        Integer num4 = num3;
        Integer num5 = num2;
        return unifyPageEntity.copy(num, list, num5, l11, num4);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getCurrentPage() {
        return this.currentPage;
    }

    @Nullable
    public final List<T> component2() {
        return this.items;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getPageSize() {
        return this.pageSize;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Long getTotalNum() {
        return this.totalNum;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Integer getTotalPage() {
        return this.totalPage;
    }

    @NotNull
    public final UnifyPageEntity<T> copy(@Nullable Integer currentPage, @Nullable List<? extends T> items, @Nullable Integer pageSize, @Nullable Long totalNum, @Nullable Integer totalPage) {
        return new UnifyPageEntity<>(currentPage, items, pageSize, totalNum, totalPage);
    }

    @Nullable
    public final Integer getCurrentPage() {
        return this.currentPage;
    }

    @Nullable
    public final List<T> getItems() {
        return this.items;
    }

    @Nullable
    public final Integer getPageSize() {
        return this.pageSize;
    }

    @Nullable
    public final Long getTotalNum() {
        return this.totalNum;
    }

    @Nullable
    public final Integer getTotalPage() {
        return this.totalPage;
    }

    public int hashCode() {
        Integer num = this.currentPage;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        List<T> list = this.items;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        Integer num2 = this.pageSize;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l11 = this.totalNum;
        int iHashCode4 = (iHashCode3 + (l11 == null ? 0 : l11.hashCode())) * 31;
        Integer num3 = this.totalPage;
        return iHashCode4 + (num3 != null ? num3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "UnifyPageEntity(currentPage=" + this.currentPage + ", items=" + this.items + ", pageSize=" + this.pageSize + ", totalNum=" + this.totalNum + ", totalPage=" + this.totalPage + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UnifyPageEntity(@Nullable Integer num, @Nullable List<? extends T> list, @Nullable Integer num2, @Nullable Long l11, @Nullable Integer num3) {
        this.currentPage = num;
        this.items = list;
        this.pageSize = num2;
        this.totalNum = l11;
        this.totalPage = num3;
    }
}
