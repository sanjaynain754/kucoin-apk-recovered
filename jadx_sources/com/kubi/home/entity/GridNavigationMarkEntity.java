package com.kubi.home.entity;

import androidx.annotation.Keep;
import com.kubi.kucoin.utils.DayNightThemeManager;
import com.tencent.bugly.proguard.C33590cg;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: GridNavigationEntity.kt */
/* JADX INFO: loaded from: classes12.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b%\b\u0087\b\u0018\u0000 12\u00020\u0001:\u00011B\u007f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010 \u001a\u0004\u0018\u00010\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010$\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0016J\u0010\u0010%\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0016J\u0010\u0010&\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0016J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010)\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010\u001dJ\u0010\u0010*\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010\u001dJ\u0086\u0001\u0010+\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0002\u0010,J\u0013\u0010-\u001a\u00020\r2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010/\u001a\u00020\u0007HÖ\u0001J\t\u00100\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0018\u0010\u0016R\u0015\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0019\u0010\u0016R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0012R\u0015\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\u001c\u0010\u001dR\u0015\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\u001f\u0010\u001d¨\u00062"}, m90084d2 = {"Lcom/kubi/home/entity/GridNavigationMarkEntity;", "", "id", "", "menuId", "name", "type", "", "styleType", "color", "icons", "darkIcons", C33590cg.f69441k, "", "longShow", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getId", "()Ljava/lang/String;", "getMenuId", "getName", "getType", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getStyleType", "getColor", "getIcons", "getDarkIcons", "getExpired", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getLongShow", "getIconUrl", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/kubi/home/entity/GridNavigationMarkEntity;", "equals", "other", "hashCode", "toString", "Companion", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class GridNavigationMarkEntity {
    public static final int STYLE_IMG = 2;
    public static final int STYLE_TEXT = 1;

    @Nullable
    private final Integer color;

    @Nullable
    private final String darkIcons;

    @Nullable
    private final Boolean expired;

    @Nullable
    private final String icons;

    @Nullable
    private final String id;

    @Nullable
    private final Boolean longShow;

    @Nullable
    private final String menuId;

    @Nullable
    private final String name;

    @Nullable
    private final Integer styleType;

    @Nullable
    private final Integer type;

    public GridNavigationMarkEntity() {
        this(null, null, null, null, null, null, null, null, null, null, 1023, null);
    }

    public static /* synthetic */ GridNavigationMarkEntity copy$default(GridNavigationMarkEntity gridNavigationMarkEntity, String str, String str2, String str3, Integer num, Integer num2, Integer num3, String str4, String str5, Boolean bool, Boolean bool2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = gridNavigationMarkEntity.id;
        }
        if ((i11 & 2) != 0) {
            str2 = gridNavigationMarkEntity.menuId;
        }
        if ((i11 & 4) != 0) {
            str3 = gridNavigationMarkEntity.name;
        }
        if ((i11 & 8) != 0) {
            num = gridNavigationMarkEntity.type;
        }
        if ((i11 & 16) != 0) {
            num2 = gridNavigationMarkEntity.styleType;
        }
        if ((i11 & 32) != 0) {
            num3 = gridNavigationMarkEntity.color;
        }
        if ((i11 & 64) != 0) {
            str4 = gridNavigationMarkEntity.icons;
        }
        if ((i11 & 128) != 0) {
            str5 = gridNavigationMarkEntity.darkIcons;
        }
        if ((i11 & 256) != 0) {
            bool = gridNavigationMarkEntity.expired;
        }
        if ((i11 & 512) != 0) {
            bool2 = gridNavigationMarkEntity.longShow;
        }
        Boolean bool3 = bool;
        Boolean bool4 = bool2;
        String str6 = str4;
        String str7 = str5;
        Integer num4 = num2;
        Integer num5 = num3;
        return gridNavigationMarkEntity.copy(str, str2, str3, num, num4, num5, str6, str7, bool3, bool4);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GridNavigationMarkEntity)) {
            return false;
        }
        GridNavigationMarkEntity gridNavigationMarkEntity = (GridNavigationMarkEntity) other;
        return Intrinsics.areEqual(this.id, gridNavigationMarkEntity.id) && Intrinsics.areEqual(this.menuId, gridNavigationMarkEntity.menuId) && Intrinsics.areEqual(this.name, gridNavigationMarkEntity.name) && Intrinsics.areEqual(this.type, gridNavigationMarkEntity.type) && Intrinsics.areEqual(this.styleType, gridNavigationMarkEntity.styleType) && Intrinsics.areEqual(this.color, gridNavigationMarkEntity.color) && Intrinsics.areEqual(this.icons, gridNavigationMarkEntity.icons) && Intrinsics.areEqual(this.darkIcons, gridNavigationMarkEntity.darkIcons) && Intrinsics.areEqual(this.expired, gridNavigationMarkEntity.expired) && Intrinsics.areEqual(this.longShow, gridNavigationMarkEntity.longShow);
    }

    public GridNavigationMarkEntity(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable String str4, @Nullable String str5, @Nullable Boolean bool, @Nullable Boolean bool2) {
        this.id = str;
        this.menuId = str2;
        this.name = str3;
        this.type = num;
        this.styleType = num2;
        this.color = num3;
        this.icons = str4;
        this.darkIcons = str5;
        this.expired = bool;
        this.longShow = bool2;
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Boolean getLongShow() {
        return this.longShow;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMenuId() {
        return this.menuId;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getType() {
        return this.type;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Integer getStyleType() {
        return this.styleType;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Integer getColor() {
        return this.color;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getIcons() {
        return this.icons;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getDarkIcons() {
        return this.darkIcons;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Boolean getExpired() {
        return this.expired;
    }

    @NotNull
    public final GridNavigationMarkEntity copy(@Nullable String id2, @Nullable String menuId, @Nullable String name, @Nullable Integer type, @Nullable Integer styleType, @Nullable Integer color, @Nullable String icons, @Nullable String darkIcons, @Nullable Boolean expired, @Nullable Boolean longShow) {
        return new GridNavigationMarkEntity(id2, menuId, name, type, styleType, color, icons, darkIcons, expired, longShow);
    }

    @Nullable
    public final Integer getColor() {
        return this.color;
    }

    @Nullable
    public final String getDarkIcons() {
        return this.darkIcons;
    }

    @Nullable
    public final Boolean getExpired() {
        return this.expired;
    }

    @Nullable
    public final String getIconUrl() {
        return DayNightThemeManager.f28592a.m33187l() ? this.icons : this.darkIcons;
    }

    @Nullable
    public final String getIcons() {
        return this.icons;
    }

    @Nullable
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final Boolean getLongShow() {
        return this.longShow;
    }

    @Nullable
    public final String getMenuId() {
        return this.menuId;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final Integer getStyleType() {
        return this.styleType;
    }

    @Nullable
    public final Integer getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.menuId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.name;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.type;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.styleType;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.color;
        int iHashCode6 = (iHashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str4 = this.icons;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.darkIcons;
        int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Boolean bool = this.expired;
        int iHashCode9 = (iHashCode8 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.longShow;
        return iHashCode9 + (bool2 != null ? bool2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "GridNavigationMarkEntity(id=" + this.id + ", menuId=" + this.menuId + ", name=" + this.name + ", type=" + this.type + ", styleType=" + this.styleType + ", color=" + this.color + ", icons=" + this.icons + ", darkIcons=" + this.darkIcons + ", expired=" + this.expired + ", longShow=" + this.longShow + ')';
    }

    public /* synthetic */ GridNavigationMarkEntity(String str, String str2, String str3, Integer num, Integer num2, Integer num3, String str4, String str5, Boolean bool, Boolean bool2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : num, (i11 & 16) != 0 ? null : num2, (i11 & 32) != 0 ? null : num3, (i11 & 64) != 0 ? null : str4, (i11 & 128) != 0 ? null : str5, (i11 & 256) != 0 ? null : bool, (i11 & 512) != 0 ? null : bool2);
    }
}
