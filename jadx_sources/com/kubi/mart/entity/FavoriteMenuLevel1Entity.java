package com.kubi.mart.entity;

import androidx.annotation.Keep;
import com.kubi.mart.R$string;
import com.kubi.utils.C27059l;
import com.kubi.utils.extensions.C27039d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SidebarMenuEntity.kt */
/* JADX INFO: loaded from: classes28.dex */
@Keep
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u0012\u001a\u00020\u0013J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\rJ\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0010J2\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u00072\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001d"}, m90084d2 = {"Lcom/kubi/mart/entity/FavoriteMenuLevel1Entity;", "", "category", "", "count", "", "enabled", "", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;)V", "getCategory", "()Ljava/lang/String;", "getCount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getEnabled", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "toMenuModel", "Lcom/kubi/mart/entity/SpotMenuModel;", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;)Lcom/kubi/mart/entity/FavoriteMenuLevel1Entity;", "equals", "other", "hashCode", "toString", "MartLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class FavoriteMenuLevel1Entity {

    @Nullable
    private final String category;

    @Nullable
    private final Integer count;

    @Nullable
    private final Boolean enabled;

    public FavoriteMenuLevel1Entity() {
        this(null, null, null, 7, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FavoriteMenuLevel1Entity)) {
            return false;
        }
        FavoriteMenuLevel1Entity favoriteMenuLevel1Entity = (FavoriteMenuLevel1Entity) other;
        return Intrinsics.areEqual(this.category, favoriteMenuLevel1Entity.category) && Intrinsics.areEqual(this.count, favoriteMenuLevel1Entity.count) && Intrinsics.areEqual(this.enabled, favoriteMenuLevel1Entity.enabled);
    }

    public FavoriteMenuLevel1Entity(@Nullable String str, @Nullable Integer num, @Nullable Boolean bool) {
        this.category = str;
        this.count = num;
        this.enabled = bool;
    }

    public static /* synthetic */ FavoriteMenuLevel1Entity copy$default(FavoriteMenuLevel1Entity favoriteMenuLevel1Entity, String str, Integer num, Boolean bool, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = favoriteMenuLevel1Entity.category;
        }
        if ((i11 & 2) != 0) {
            num = favoriteMenuLevel1Entity.count;
        }
        if ((i11 & 4) != 0) {
            bool = favoriteMenuLevel1Entity.enabled;
        }
        return favoriteMenuLevel1Entity.copy(str, num, bool);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCategory() {
        return this.category;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getCount() {
        return this.count;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Boolean getEnabled() {
        return this.enabled;
    }

    @NotNull
    public final FavoriteMenuLevel1Entity copy(@Nullable String category, @Nullable Integer count, @Nullable Boolean enabled) {
        return new FavoriteMenuLevel1Entity(category, count, enabled);
    }

    @Nullable
    public final String getCategory() {
        return this.category;
    }

    @Nullable
    public final Integer getCount() {
        return this.count;
    }

    @Nullable
    public final Boolean getEnabled() {
        return this.enabled;
    }

    public int hashCode() {
        String str = this.category;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.count;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.enabled;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    @NotNull
    public final SpotMenuModel toMenuModel() {
        String str = this.category;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        String string = C27059l.f54343a.m66757a().getString(R$string.favorites);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return new SpotMenuModel("FAVORITE", str2, string, C27039d.m66650j(this.count) + 100, CollectionsKt.emptyList());
    }

    @NotNull
    public String toString() {
        return "FavoriteMenuLevel1Entity(category=" + this.category + ", count=" + this.count + ", enabled=" + this.enabled + ')';
    }

    public /* synthetic */ FavoriteMenuLevel1Entity(String str, Integer num, Boolean bool, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : num, (i11 & 4) != 0 ? null : bool);
    }
}
