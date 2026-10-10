package com.kubi.mart.entity;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SidebarMenuEntity.kt */
/* JADX INFO: loaded from: classes28.dex */
@Keep
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m90084d2 = {"Lcom/kubi/mart/entity/SidebarMenuEntity;", "", "favoriteMenu", "Lcom/kubi/mart/entity/FavoriteMenuEntity;", "spotMenu", "Lcom/kubi/mart/entity/FlatSpotMenuEntity;", "<init>", "(Lcom/kubi/mart/entity/FavoriteMenuEntity;Lcom/kubi/mart/entity/FlatSpotMenuEntity;)V", "getFavoriteMenu", "()Lcom/kubi/mart/entity/FavoriteMenuEntity;", "getSpotMenu", "()Lcom/kubi/mart/entity/FlatSpotMenuEntity;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "MartLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class SidebarMenuEntity {

    @Nullable
    private final FavoriteMenuEntity favoriteMenu;

    @Nullable
    private final FlatSpotMenuEntity spotMenu;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SidebarMenuEntity)) {
            return false;
        }
        SidebarMenuEntity sidebarMenuEntity = (SidebarMenuEntity) other;
        return Intrinsics.areEqual(this.favoriteMenu, sidebarMenuEntity.favoriteMenu) && Intrinsics.areEqual(this.spotMenu, sidebarMenuEntity.spotMenu);
    }

    public static /* synthetic */ SidebarMenuEntity copy$default(SidebarMenuEntity sidebarMenuEntity, FavoriteMenuEntity favoriteMenuEntity, FlatSpotMenuEntity flatSpotMenuEntity, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            favoriteMenuEntity = sidebarMenuEntity.favoriteMenu;
        }
        if ((i11 & 2) != 0) {
            flatSpotMenuEntity = sidebarMenuEntity.spotMenu;
        }
        return sidebarMenuEntity.copy(favoriteMenuEntity, flatSpotMenuEntity);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final FavoriteMenuEntity getFavoriteMenu() {
        return this.favoriteMenu;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final FlatSpotMenuEntity getSpotMenu() {
        return this.spotMenu;
    }

    @NotNull
    public final SidebarMenuEntity copy(@Nullable FavoriteMenuEntity favoriteMenu, @Nullable FlatSpotMenuEntity spotMenu) {
        return new SidebarMenuEntity(favoriteMenu, spotMenu);
    }

    @Nullable
    public final FavoriteMenuEntity getFavoriteMenu() {
        return this.favoriteMenu;
    }

    @Nullable
    public final FlatSpotMenuEntity getSpotMenu() {
        return this.spotMenu;
    }

    public int hashCode() {
        FavoriteMenuEntity favoriteMenuEntity = this.favoriteMenu;
        int iHashCode = (favoriteMenuEntity == null ? 0 : favoriteMenuEntity.hashCode()) * 31;
        FlatSpotMenuEntity flatSpotMenuEntity = this.spotMenu;
        return iHashCode + (flatSpotMenuEntity != null ? flatSpotMenuEntity.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "SidebarMenuEntity(favoriteMenu=" + this.favoriteMenu + ", spotMenu=" + this.spotMenu + ')';
    }

    public SidebarMenuEntity(@Nullable FavoriteMenuEntity favoriteMenuEntity, @Nullable FlatSpotMenuEntity flatSpotMenuEntity) {
        this.favoriteMenu = favoriteMenuEntity;
        this.spotMenu = flatSpotMenuEntity;
    }
}
