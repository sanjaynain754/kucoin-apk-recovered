package com.kubi.home.api.entity;

import androidx.annotation.Keep;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: HomeQuickAccessEntity.kt */
/* JADX INFO: loaded from: classes15.dex */
@Keep
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\u0011\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0013J\u0011\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u0017JV\u0010\u001e\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0002\u0010\u001fJ\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020\u0007HÖ\u0001J\t\u0010$\u001a\u00020\tHÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017¨\u0006%"}, m90084d2 = {"Lcom/kubi/home/api/entity/HomeQuickAccessEntity;", "", "homeList", "", "Lcom/kubi/home/api/entity/QuickAccessEntity;", "moreItem", "canShowMaximum", "", "clickedIdList", "", "userCustomVersion", "", "<init>", "(Ljava/util/List;Lcom/kubi/home/api/entity/QuickAccessEntity;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/Long;)V", "getHomeList", "()Ljava/util/List;", "getMoreItem", "()Lcom/kubi/home/api/entity/QuickAccessEntity;", "getCanShowMaximum", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getClickedIdList", "getUserCustomVersion", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/util/List;Lcom/kubi/home/api/entity/QuickAccessEntity;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/Long;)Lcom/kubi/home/api/entity/HomeQuickAccessEntity;", "equals", "", "other", "hashCode", "toString", "HomeApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class HomeQuickAccessEntity {

    @Nullable
    private final Integer canShowMaximum;

    @Nullable
    private final List<String> clickedIdList;

    @Nullable
    private final List<QuickAccessEntity> homeList;

    @Nullable
    private final QuickAccessEntity moreItem;

    @Nullable
    private final Long userCustomVersion;

    public HomeQuickAccessEntity() {
        this(null, null, null, null, null, 31, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HomeQuickAccessEntity)) {
            return false;
        }
        HomeQuickAccessEntity homeQuickAccessEntity = (HomeQuickAccessEntity) other;
        return Intrinsics.areEqual(this.homeList, homeQuickAccessEntity.homeList) && Intrinsics.areEqual(this.moreItem, homeQuickAccessEntity.moreItem) && Intrinsics.areEqual(this.canShowMaximum, homeQuickAccessEntity.canShowMaximum) && Intrinsics.areEqual(this.clickedIdList, homeQuickAccessEntity.clickedIdList) && Intrinsics.areEqual(this.userCustomVersion, homeQuickAccessEntity.userCustomVersion);
    }

    public HomeQuickAccessEntity(@Nullable List<QuickAccessEntity> list, @Nullable QuickAccessEntity quickAccessEntity, @Nullable Integer num, @Nullable List<String> list2, @Nullable Long l11) {
        this.homeList = list;
        this.moreItem = quickAccessEntity;
        this.canShowMaximum = num;
        this.clickedIdList = list2;
        this.userCustomVersion = l11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HomeQuickAccessEntity copy$default(HomeQuickAccessEntity homeQuickAccessEntity, List list, QuickAccessEntity quickAccessEntity, Integer num, List list2, Long l11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = homeQuickAccessEntity.homeList;
        }
        if ((i11 & 2) != 0) {
            quickAccessEntity = homeQuickAccessEntity.moreItem;
        }
        if ((i11 & 4) != 0) {
            num = homeQuickAccessEntity.canShowMaximum;
        }
        if ((i11 & 8) != 0) {
            list2 = homeQuickAccessEntity.clickedIdList;
        }
        if ((i11 & 16) != 0) {
            l11 = homeQuickAccessEntity.userCustomVersion;
        }
        Long l12 = l11;
        Integer num2 = num;
        return homeQuickAccessEntity.copy(list, quickAccessEntity, num2, list2, l12);
    }

    @Nullable
    public final List<QuickAccessEntity> component1() {
        return this.homeList;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final QuickAccessEntity getMoreItem() {
        return this.moreItem;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getCanShowMaximum() {
        return this.canShowMaximum;
    }

    @Nullable
    public final List<String> component4() {
        return this.clickedIdList;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Long getUserCustomVersion() {
        return this.userCustomVersion;
    }

    @NotNull
    public final HomeQuickAccessEntity copy(@Nullable List<QuickAccessEntity> homeList, @Nullable QuickAccessEntity moreItem, @Nullable Integer canShowMaximum, @Nullable List<String> clickedIdList, @Nullable Long userCustomVersion) {
        return new HomeQuickAccessEntity(homeList, moreItem, canShowMaximum, clickedIdList, userCustomVersion);
    }

    @Nullable
    public final Integer getCanShowMaximum() {
        return this.canShowMaximum;
    }

    @Nullable
    public final List<String> getClickedIdList() {
        return this.clickedIdList;
    }

    @Nullable
    public final List<QuickAccessEntity> getHomeList() {
        return this.homeList;
    }

    @Nullable
    public final QuickAccessEntity getMoreItem() {
        return this.moreItem;
    }

    @Nullable
    public final Long getUserCustomVersion() {
        return this.userCustomVersion;
    }

    public int hashCode() {
        List<QuickAccessEntity> list = this.homeList;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        QuickAccessEntity quickAccessEntity = this.moreItem;
        int iHashCode2 = (iHashCode + (quickAccessEntity == null ? 0 : quickAccessEntity.hashCode())) * 31;
        Integer num = this.canShowMaximum;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        List<String> list2 = this.clickedIdList;
        int iHashCode4 = (iHashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Long l11 = this.userCustomVersion;
        return iHashCode4 + (l11 != null ? l11.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "HomeQuickAccessEntity(homeList=" + this.homeList + ", moreItem=" + this.moreItem + ", canShowMaximum=" + this.canShowMaximum + ", clickedIdList=" + this.clickedIdList + ", userCustomVersion=" + this.userCustomVersion + ')';
    }

    public /* synthetic */ HomeQuickAccessEntity(List list, QuickAccessEntity quickAccessEntity, Integer num, List list2, Long l11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : list, (i11 & 2) != 0 ? null : quickAccessEntity, (i11 & 4) != 0 ? null : num, (i11 & 8) != 0 ? null : list2, (i11 & 16) != 0 ? null : l11);
    }
}
