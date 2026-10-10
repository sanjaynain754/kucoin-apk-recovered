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
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001b\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ\u0011\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0015J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0015J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0015J\\\u0010\u001f\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010 J\u0013\u0010!\u001a\u00020\u00062\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020\tHÖ\u0001J\t\u0010$\u001a\u00020%HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0013\u0010\u0011R\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u0015\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0017\u0010\u0015R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0018\u0010\u0015¨\u0006&"}, m90084d2 = {"Lcom/kubi/assets/entity/LeadTradingOnGoingEntity;", "", FirebaseAnalytics.Param.ITEMS, "", "Lcom/kubi/assets/entity/LeadTradingItem;", "execute", "", "hasMore", "totalCount", "", "pageSize", "alreadyCopyTraders", "<init>", "(Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getItems", "()Ljava/util/List;", "getExecute", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getHasMore", "getTotalCount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getPageSize", "getAlreadyCopyTraders", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/kubi/assets/entity/LeadTradingOnGoingEntity;", "equals", "other", "hashCode", "toString", "", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class LeadTradingOnGoingEntity {

    @Nullable
    private final Integer alreadyCopyTraders;

    @Nullable
    private final Boolean execute;

    @Nullable
    private final Boolean hasMore;

    @Nullable
    private final List<LeadTradingItem> items;

    @Nullable
    private final Integer pageSize;

    @Nullable
    private final Integer totalCount;

    public LeadTradingOnGoingEntity() {
        this(null, null, null, null, null, null, 63, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LeadTradingOnGoingEntity)) {
            return false;
        }
        LeadTradingOnGoingEntity leadTradingOnGoingEntity = (LeadTradingOnGoingEntity) other;
        return Intrinsics.areEqual(this.items, leadTradingOnGoingEntity.items) && Intrinsics.areEqual(this.execute, leadTradingOnGoingEntity.execute) && Intrinsics.areEqual(this.hasMore, leadTradingOnGoingEntity.hasMore) && Intrinsics.areEqual(this.totalCount, leadTradingOnGoingEntity.totalCount) && Intrinsics.areEqual(this.pageSize, leadTradingOnGoingEntity.pageSize) && Intrinsics.areEqual(this.alreadyCopyTraders, leadTradingOnGoingEntity.alreadyCopyTraders);
    }

    public LeadTradingOnGoingEntity(@Nullable List<LeadTradingItem> list, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3) {
        this.items = list;
        this.execute = bool;
        this.hasMore = bool2;
        this.totalCount = num;
        this.pageSize = num2;
        this.alreadyCopyTraders = num3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LeadTradingOnGoingEntity copy$default(LeadTradingOnGoingEntity leadTradingOnGoingEntity, List list, Boolean bool, Boolean bool2, Integer num, Integer num2, Integer num3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = leadTradingOnGoingEntity.items;
        }
        if ((i11 & 2) != 0) {
            bool = leadTradingOnGoingEntity.execute;
        }
        if ((i11 & 4) != 0) {
            bool2 = leadTradingOnGoingEntity.hasMore;
        }
        if ((i11 & 8) != 0) {
            num = leadTradingOnGoingEntity.totalCount;
        }
        if ((i11 & 16) != 0) {
            num2 = leadTradingOnGoingEntity.pageSize;
        }
        if ((i11 & 32) != 0) {
            num3 = leadTradingOnGoingEntity.alreadyCopyTraders;
        }
        Integer num4 = num2;
        Integer num5 = num3;
        return leadTradingOnGoingEntity.copy(list, bool, bool2, num, num4, num5);
    }

    @Nullable
    public final List<LeadTradingItem> component1() {
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

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Integer getAlreadyCopyTraders() {
        return this.alreadyCopyTraders;
    }

    @NotNull
    public final LeadTradingOnGoingEntity copy(@Nullable List<LeadTradingItem> items, @Nullable Boolean execute, @Nullable Boolean hasMore, @Nullable Integer totalCount, @Nullable Integer pageSize, @Nullable Integer alreadyCopyTraders) {
        return new LeadTradingOnGoingEntity(items, execute, hasMore, totalCount, pageSize, alreadyCopyTraders);
    }

    @Nullable
    public final Integer getAlreadyCopyTraders() {
        return this.alreadyCopyTraders;
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
    public final List<LeadTradingItem> getItems() {
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
        List<LeadTradingItem> list = this.items;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Boolean bool = this.execute;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.hasMore;
        int iHashCode3 = (iHashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num = this.totalCount;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.pageSize;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.alreadyCopyTraders;
        return iHashCode5 + (num3 != null ? num3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "LeadTradingOnGoingEntity(items=" + this.items + ", execute=" + this.execute + ", hasMore=" + this.hasMore + ", totalCount=" + this.totalCount + ", pageSize=" + this.pageSize + ", alreadyCopyTraders=" + this.alreadyCopyTraders + ')';
    }

    public /* synthetic */ LeadTradingOnGoingEntity(List list, Boolean bool, Boolean bool2, Integer num, Integer num2, Integer num3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : list, (i11 & 2) != 0 ? null : bool, (i11 & 4) != 0 ? null : bool2, (i11 & 8) != 0 ? null : num, (i11 & 16) != 0 ? null : num2, (i11 & 32) != 0 ? null : num3);
    }
}
