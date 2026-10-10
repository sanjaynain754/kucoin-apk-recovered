package com.kubi.home.entity;

import androidx.annotation.Keep;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: GridNavigationMoreEntity.kt */
/* JADX INFO: loaded from: classes15.dex */
@Keep
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\u0011\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u0015J\\\u0010\u001c\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0002\u0010\u001dJ\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0006HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015¨\u0006$"}, m90084d2 = {"Lcom/kubi/home/entity/GridNavigationMoreEntity;", "", "navigationList", "", "Lcom/kubi/home/entity/GridNavigationEntity;", "defaultList", "", "userCustomList", "iconResponse", "Lcom/kubi/home/entity/MoreIconEntity;", "userCustomVersion", "", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/kubi/home/entity/MoreIconEntity;Ljava/lang/Long;)V", "getNavigationList", "()Ljava/util/List;", "getDefaultList", "getUserCustomList", "getIconResponse", "()Lcom/kubi/home/entity/MoreIconEntity;", "getUserCustomVersion", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/kubi/home/entity/MoreIconEntity;Ljava/lang/Long;)Lcom/kubi/home/entity/GridNavigationMoreEntity;", "equals", "", "other", "hashCode", "", "toString", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class GridNavigationMoreEntity {

    @Nullable
    private final List<String> defaultList;

    @Nullable
    private final MoreIconEntity iconResponse;

    @Nullable
    private final List<GridNavigationEntity> navigationList;

    @Nullable
    private final List<String> userCustomList;

    @Nullable
    private final Long userCustomVersion;

    public GridNavigationMoreEntity() {
        this(null, null, null, null, null, 31, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GridNavigationMoreEntity)) {
            return false;
        }
        GridNavigationMoreEntity gridNavigationMoreEntity = (GridNavigationMoreEntity) other;
        return Intrinsics.areEqual(this.navigationList, gridNavigationMoreEntity.navigationList) && Intrinsics.areEqual(this.defaultList, gridNavigationMoreEntity.defaultList) && Intrinsics.areEqual(this.userCustomList, gridNavigationMoreEntity.userCustomList) && Intrinsics.areEqual(this.iconResponse, gridNavigationMoreEntity.iconResponse) && Intrinsics.areEqual(this.userCustomVersion, gridNavigationMoreEntity.userCustomVersion);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GridNavigationMoreEntity(@Nullable List<? extends GridNavigationEntity> list, @Nullable List<String> list2, @Nullable List<String> list3, @Nullable MoreIconEntity moreIconEntity, @Nullable Long l11) {
        this.navigationList = list;
        this.defaultList = list2;
        this.userCustomList = list3;
        this.iconResponse = moreIconEntity;
        this.userCustomVersion = l11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GridNavigationMoreEntity copy$default(GridNavigationMoreEntity gridNavigationMoreEntity, List list, List list2, List list3, MoreIconEntity moreIconEntity, Long l11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = gridNavigationMoreEntity.navigationList;
        }
        if ((i11 & 2) != 0) {
            list2 = gridNavigationMoreEntity.defaultList;
        }
        if ((i11 & 4) != 0) {
            list3 = gridNavigationMoreEntity.userCustomList;
        }
        if ((i11 & 8) != 0) {
            moreIconEntity = gridNavigationMoreEntity.iconResponse;
        }
        if ((i11 & 16) != 0) {
            l11 = gridNavigationMoreEntity.userCustomVersion;
        }
        Long l12 = l11;
        List list4 = list3;
        return gridNavigationMoreEntity.copy(list, list2, list4, moreIconEntity, l12);
    }

    @Nullable
    public final List<GridNavigationEntity> component1() {
        return this.navigationList;
    }

    @Nullable
    public final List<String> component2() {
        return this.defaultList;
    }

    @Nullable
    public final List<String> component3() {
        return this.userCustomList;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final MoreIconEntity getIconResponse() {
        return this.iconResponse;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Long getUserCustomVersion() {
        return this.userCustomVersion;
    }

    @NotNull
    public final GridNavigationMoreEntity copy(@Nullable List<? extends GridNavigationEntity> navigationList, @Nullable List<String> defaultList, @Nullable List<String> userCustomList, @Nullable MoreIconEntity iconResponse, @Nullable Long userCustomVersion) {
        return new GridNavigationMoreEntity(navigationList, defaultList, userCustomList, iconResponse, userCustomVersion);
    }

    @Nullable
    public final List<String> getDefaultList() {
        return this.defaultList;
    }

    @Nullable
    public final MoreIconEntity getIconResponse() {
        return this.iconResponse;
    }

    @Nullable
    public final List<GridNavigationEntity> getNavigationList() {
        return this.navigationList;
    }

    @Nullable
    public final List<String> getUserCustomList() {
        return this.userCustomList;
    }

    @Nullable
    public final Long getUserCustomVersion() {
        return this.userCustomVersion;
    }

    public int hashCode() {
        List<GridNavigationEntity> list = this.navigationList;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<String> list2 = this.defaultList;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<String> list3 = this.userCustomList;
        int iHashCode3 = (iHashCode2 + (list3 == null ? 0 : list3.hashCode())) * 31;
        MoreIconEntity moreIconEntity = this.iconResponse;
        int iHashCode4 = (iHashCode3 + (moreIconEntity == null ? 0 : moreIconEntity.hashCode())) * 31;
        Long l11 = this.userCustomVersion;
        return iHashCode4 + (l11 != null ? l11.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "GridNavigationMoreEntity(navigationList=" + this.navigationList + ", defaultList=" + this.defaultList + ", userCustomList=" + this.userCustomList + ", iconResponse=" + this.iconResponse + ", userCustomVersion=" + this.userCustomVersion + ')';
    }

    public /* synthetic */ GridNavigationMoreEntity(List list, List list2, List list3, MoreIconEntity moreIconEntity, Long l11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : list, (i11 & 2) != 0 ? null : list2, (i11 & 4) != 0 ? null : list3, (i11 & 8) != 0 ? null : moreIconEntity, (i11 & 16) != 0 ? null : l11);
    }
}
