package com.kubi.mart.entity;

import androidx.annotation.Keep;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SidebarMenuEntity.kt */
/* JADX INFO: loaded from: classes28.dex */
@Keep
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u0011\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J,\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, m90084d2 = {"Lcom/kubi/mart/entity/FavoriteMenuEntity;", "", "enabled", "", "level1", "", "Lcom/kubi/mart/entity/FavoriteMenuLevel1Entity;", "<init>", "(Ljava/lang/Boolean;Ljava/util/List;)V", "getEnabled", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getLevel1", "()Ljava/util/List;", "component1", "component2", "copy", "(Ljava/lang/Boolean;Ljava/util/List;)Lcom/kubi/mart/entity/FavoriteMenuEntity;", "equals", "other", "hashCode", "", "toString", "", "MartLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class FavoriteMenuEntity {

    @Nullable
    private final Boolean enabled;

    @Nullable
    private final List<FavoriteMenuLevel1Entity> level1;

    public FavoriteMenuEntity(@Nullable Boolean bool, @Nullable List<FavoriteMenuLevel1Entity> list) {
        this.enabled = bool;
        this.level1 = list;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FavoriteMenuEntity)) {
            return false;
        }
        FavoriteMenuEntity favoriteMenuEntity = (FavoriteMenuEntity) other;
        return Intrinsics.areEqual(this.enabled, favoriteMenuEntity.enabled) && Intrinsics.areEqual(this.level1, favoriteMenuEntity.level1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FavoriteMenuEntity copy$default(FavoriteMenuEntity favoriteMenuEntity, Boolean bool, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bool = favoriteMenuEntity.enabled;
        }
        if ((i11 & 2) != 0) {
            list = favoriteMenuEntity.level1;
        }
        return favoriteMenuEntity.copy(bool, list);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Boolean getEnabled() {
        return this.enabled;
    }

    @Nullable
    public final List<FavoriteMenuLevel1Entity> component2() {
        return this.level1;
    }

    @NotNull
    public final FavoriteMenuEntity copy(@Nullable Boolean enabled, @Nullable List<FavoriteMenuLevel1Entity> level1) {
        return new FavoriteMenuEntity(enabled, level1);
    }

    @Nullable
    public final Boolean getEnabled() {
        return this.enabled;
    }

    @Nullable
    public final List<FavoriteMenuLevel1Entity> getLevel1() {
        return this.level1;
    }

    public int hashCode() {
        Boolean bool = this.enabled;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        List<FavoriteMenuLevel1Entity> list = this.level1;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "FavoriteMenuEntity(enabled=" + this.enabled + ", level1=" + this.level1 + ')';
    }

    public /* synthetic */ FavoriteMenuEntity(Boolean bool, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : bool, list);
    }
}
