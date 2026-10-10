package com.kubi.home.entity;

import androidx.annotation.Keep;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: HomeGridNavigationEntity.kt */
/* JADX INFO: loaded from: classes12.dex */
@Keep
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0010J8\u0010\u0015\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001e"}, m90084d2 = {"Lcom/kubi/home/entity/HomeGridNavigationEntity;", "", "navigationList", "", "Lcom/kubi/home/entity/GridNavigationEntity;", "iconResponse", "Lcom/kubi/home/entity/MoreIconEntity;", "userCustomVersion", "", "<init>", "(Ljava/util/List;Lcom/kubi/home/entity/MoreIconEntity;Ljava/lang/Long;)V", "getNavigationList", "()Ljava/util/List;", "getIconResponse", "()Lcom/kubi/home/entity/MoreIconEntity;", "getUserCustomVersion", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "component2", "component3", "copy", "(Ljava/util/List;Lcom/kubi/home/entity/MoreIconEntity;Ljava/lang/Long;)Lcom/kubi/home/entity/HomeGridNavigationEntity;", "equals", "", "other", "hashCode", "", "toString", "", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class HomeGridNavigationEntity {

    @Nullable
    private final MoreIconEntity iconResponse;

    @Nullable
    private final List<GridNavigationEntity> navigationList;

    @Nullable
    private final Long userCustomVersion;

    public HomeGridNavigationEntity() {
        this(null, null, null, 7, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HomeGridNavigationEntity)) {
            return false;
        }
        HomeGridNavigationEntity homeGridNavigationEntity = (HomeGridNavigationEntity) other;
        return Intrinsics.areEqual(this.navigationList, homeGridNavigationEntity.navigationList) && Intrinsics.areEqual(this.iconResponse, homeGridNavigationEntity.iconResponse) && Intrinsics.areEqual(this.userCustomVersion, homeGridNavigationEntity.userCustomVersion);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HomeGridNavigationEntity(@Nullable List<? extends GridNavigationEntity> list, @Nullable MoreIconEntity moreIconEntity, @Nullable Long l11) {
        this.navigationList = list;
        this.iconResponse = moreIconEntity;
        this.userCustomVersion = l11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HomeGridNavigationEntity copy$default(HomeGridNavigationEntity homeGridNavigationEntity, List list, MoreIconEntity moreIconEntity, Long l11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = homeGridNavigationEntity.navigationList;
        }
        if ((i11 & 2) != 0) {
            moreIconEntity = homeGridNavigationEntity.iconResponse;
        }
        if ((i11 & 4) != 0) {
            l11 = homeGridNavigationEntity.userCustomVersion;
        }
        return homeGridNavigationEntity.copy(list, moreIconEntity, l11);
    }

    @Nullable
    public final List<GridNavigationEntity> component1() {
        return this.navigationList;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final MoreIconEntity getIconResponse() {
        return this.iconResponse;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Long getUserCustomVersion() {
        return this.userCustomVersion;
    }

    @NotNull
    public final HomeGridNavigationEntity copy(@Nullable List<? extends GridNavigationEntity> navigationList, @Nullable MoreIconEntity iconResponse, @Nullable Long userCustomVersion) {
        return new HomeGridNavigationEntity(navigationList, iconResponse, userCustomVersion);
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
    public final Long getUserCustomVersion() {
        return this.userCustomVersion;
    }

    public int hashCode() {
        List<GridNavigationEntity> list = this.navigationList;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        MoreIconEntity moreIconEntity = this.iconResponse;
        int iHashCode2 = (iHashCode + (moreIconEntity == null ? 0 : moreIconEntity.hashCode())) * 31;
        Long l11 = this.userCustomVersion;
        return iHashCode2 + (l11 != null ? l11.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "HomeGridNavigationEntity(navigationList=" + this.navigationList + ", iconResponse=" + this.iconResponse + ", userCustomVersion=" + this.userCustomVersion + ')';
    }

    public /* synthetic */ HomeGridNavigationEntity(List list, MoreIconEntity moreIconEntity, Long l11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : list, (i11 & 2) != 0 ? null : moreIconEntity, (i11 & 4) != 0 ? null : l11);
    }
}
