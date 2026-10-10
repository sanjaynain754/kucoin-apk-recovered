package com.kubi.assets.entity;

import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: OnGoingEntity.kt */
/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0018\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0011\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0014J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0014JP\u0010\u001c\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u001dJ\u0013\u0010\u001e\u001a\u00020\u00062\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\tHÖ\u0001J\t\u0010!\u001a\u00020\"HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0012\u0010\u0010R\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0015\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0016\u0010\u0014¨\u0006#"}, m90084d2 = {"Lcom/kubi/assets/entity/CopyTradingOnGoingEntity;", "", FirebaseAnalytics.Param.ITEMS, "", "Lcom/kubi/assets/entity/CopyTradingItem;", "execute", "", "hasMore", "totalCount", "", "pageSize", "<init>", "(Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getItems", "()Ljava/util/List;", "getExecute", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getHasMore", "getTotalCount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getPageSize", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/kubi/assets/entity/CopyTradingOnGoingEntity;", "equals", "other", "hashCode", "toString", "", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class CopyTradingOnGoingEntity {

    @Nullable
    private final Boolean execute;

    @Nullable
    private final Boolean hasMore;

    @Nullable
    private final List<CopyTradingItem> items;

    @Nullable
    private final Integer pageSize;

    @Nullable
    private final Integer totalCount;

    public CopyTradingOnGoingEntity() {
        this(null, null, null, null, null, 31, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CopyTradingOnGoingEntity)) {
            return false;
        }
        CopyTradingOnGoingEntity copyTradingOnGoingEntity = (CopyTradingOnGoingEntity) other;
        return Intrinsics.areEqual(this.items, copyTradingOnGoingEntity.items) && Intrinsics.areEqual(this.execute, copyTradingOnGoingEntity.execute) && Intrinsics.areEqual(this.hasMore, copyTradingOnGoingEntity.hasMore) && Intrinsics.areEqual(this.totalCount, copyTradingOnGoingEntity.totalCount) && Intrinsics.areEqual(this.pageSize, copyTradingOnGoingEntity.pageSize);
    }

    public CopyTradingOnGoingEntity(@Nullable List<CopyTradingItem> list, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Integer num, @Nullable Integer num2) {
        this.items = list;
        this.execute = bool;
        this.hasMore = bool2;
        this.totalCount = num;
        this.pageSize = num2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CopyTradingOnGoingEntity copy$default(CopyTradingOnGoingEntity copyTradingOnGoingEntity, List list, Boolean bool, Boolean bool2, Integer num, Integer num2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = copyTradingOnGoingEntity.items;
        }
        if ((i11 & 2) != 0) {
            bool = copyTradingOnGoingEntity.execute;
        }
        if ((i11 & 4) != 0) {
            bool2 = copyTradingOnGoingEntity.hasMore;
        }
        if ((i11 & 8) != 0) {
            num = copyTradingOnGoingEntity.totalCount;
        }
        if ((i11 & 16) != 0) {
            num2 = copyTradingOnGoingEntity.pageSize;
        }
        Integer num3 = num2;
        Boolean bool3 = bool2;
        return copyTradingOnGoingEntity.copy(list, bool, bool3, num, num3);
    }

    @Nullable
    public final List<CopyTradingItem> component1() {
        return this.items;
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

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Integer getPageSize() {
        return this.pageSize;
    }

    @NotNull
    public final CopyTradingOnGoingEntity copy(@Nullable List<CopyTradingItem> items, @Nullable Boolean execute, @Nullable Boolean hasMore, @Nullable Integer totalCount, @Nullable Integer pageSize) {
        return new CopyTradingOnGoingEntity(items, execute, hasMore, totalCount, pageSize);
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
    public final List<CopyTradingItem> getItems() {
        return this.items;
    }

    @Nullable
    public final Integer getPageSize() {
        return this.pageSize;
    }

    @Nullable
    public final Integer getTotalCount() {
        return this.totalCount;
    }

    public int hashCode() {
        List<CopyTradingItem> list = this.items;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Boolean bool = this.execute;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.hasMore;
        int iHashCode3 = (iHashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num = this.totalCount;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.pageSize;
        return iHashCode4 + (num2 != null ? num2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "CopyTradingOnGoingEntity(items=" + this.items + ", execute=" + this.execute + ", hasMore=" + this.hasMore + ", totalCount=" + this.totalCount + ", pageSize=" + this.pageSize + ')';
    }

    public /* synthetic */ CopyTradingOnGoingEntity(List list, Boolean bool, Boolean bool2, Integer num, Integer num2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : list, (i11 & 2) != 0 ? null : bool, (i11 & 4) != 0 ? null : bool2, (i11 & 8) != 0 ? null : num, (i11 & 16) != 0 ? null : num2);
    }
}
