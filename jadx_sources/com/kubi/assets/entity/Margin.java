package com.kubi.assets.entity;

import androidx.annotation.Keep;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: OnGoingEntity.kt */
/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u0011\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u0018\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0013JD\u0010\u0019\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\u00062\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\tHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0011\u0010\u000fR\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, m90084d2 = {"Lcom/kubi/assets/entity/Margin;", "", "marginPositionDetailList", "", "Lcom/kubi/assets/entity/MarginPositionDetail;", "execute", "", "hasMore", "totalCount", "", "<init>", "(Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;)V", "getMarginPositionDetailList", "()Ljava/util/List;", "getExecute", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getHasMore", "getTotalCount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "copy", "(Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;)Lcom/kubi/assets/entity/Margin;", "equals", "other", "hashCode", "toString", "", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class Margin {

    @Nullable
    private final Boolean execute;

    @Nullable
    private final Boolean hasMore;

    @Nullable
    private final List<MarginPositionDetail> marginPositionDetailList;

    @Nullable
    private final Integer totalCount;

    public Margin() {
        this(null, null, null, null, 15, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Margin)) {
            return false;
        }
        Margin margin = (Margin) other;
        return Intrinsics.areEqual(this.marginPositionDetailList, margin.marginPositionDetailList) && Intrinsics.areEqual(this.execute, margin.execute) && Intrinsics.areEqual(this.hasMore, margin.hasMore) && Intrinsics.areEqual(this.totalCount, margin.totalCount);
    }

    public Margin(@Nullable List<MarginPositionDetail> list, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Integer num) {
        this.marginPositionDetailList = list;
        this.execute = bool;
        this.hasMore = bool2;
        this.totalCount = num;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Margin copy$default(Margin margin, List list, Boolean bool, Boolean bool2, Integer num, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = margin.marginPositionDetailList;
        }
        if ((i11 & 2) != 0) {
            bool = margin.execute;
        }
        if ((i11 & 4) != 0) {
            bool2 = margin.hasMore;
        }
        if ((i11 & 8) != 0) {
            num = margin.totalCount;
        }
        return margin.copy(list, bool, bool2, num);
    }

    @Nullable
    public final List<MarginPositionDetail> component1() {
        return this.marginPositionDetailList;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Boolean getExecute() {
        return this.execute;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Boolean getHasMore() {
        return this.hasMore;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getTotalCount() {
        return this.totalCount;
    }

    @NotNull
    public final Margin copy(@Nullable List<MarginPositionDetail> marginPositionDetailList, @Nullable Boolean execute, @Nullable Boolean hasMore, @Nullable Integer totalCount) {
        return new Margin(marginPositionDetailList, execute, hasMore, totalCount);
    }

    @Nullable
    public final Boolean getExecute() {
        return this.execute;
    }

    @Nullable
    public final Boolean getHasMore() {
        return this.hasMore;
    }

    @Nullable
    public final List<MarginPositionDetail> getMarginPositionDetailList() {
        return this.marginPositionDetailList;
    }

    @Nullable
    public final Integer getTotalCount() {
        return this.totalCount;
    }

    public int hashCode() {
        List<MarginPositionDetail> list = this.marginPositionDetailList;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Boolean bool = this.execute;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.hasMore;
        int iHashCode3 = (iHashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num = this.totalCount;
        return iHashCode3 + (num != null ? num.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "Margin(marginPositionDetailList=" + this.marginPositionDetailList + ", execute=" + this.execute + ", hasMore=" + this.hasMore + ", totalCount=" + this.totalCount + ')';
    }

    public /* synthetic */ Margin(List list, Boolean bool, Boolean bool2, Integer num, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : list, (i11 & 2) != 0 ? null : bool, (i11 & 4) != 0 ? null : bool2, (i11 & 8) != 0 ? null : num);
    }
}
