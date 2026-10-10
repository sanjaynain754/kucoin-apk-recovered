package com.kubi.home.entity;

import androidx.annotation.Keep;
import androidx.core.app.FrameMetricsAggregator;
import com.kubi.home.api.entity.QuickAccessEntity;
import com.kubi.kucoin.utils.DayNightThemeManager;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: GridNavigationEntity.kt */
/* JADX INFO: loaded from: classes12.dex */
@Keep
@Metadata(m90083d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B\u008b\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\u001c\b\u0002\u0010\r\u001a\u0016\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u000ej\n\u0012\u0004\u0012\u00020\u0000\u0018\u0001`\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010.\u001a\u0004\u0018\u00010\u0003J\b\u0010/\u001a\u0004\u0018\u00010\fJ\u0006\u00100\u001a\u000201J\u0013\u00102\u001a\u00020\t2\b\u00103\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u00104\u001a\u00020)H\u0016R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0015\"\u0004\b\u0018\u0010\u0019R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015R\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R.\u0010\r\u001a\u0016\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u000ej\n\u0012\u0004\u0012\u00020\u0000\u0018\u0001`\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\n\n\u0002\u0010'\u001a\u0004\b%\u0010&R\u001a\u0010(\u001a\u00020)X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-¨\u00065"}, m90084d2 = {"Lcom/kubi/home/entity/GridNavigationEntity;", "", "id", "", "name", "icons", "darkIcons", "uri", "showMark", "", "marks", "", "Lcom/kubi/home/entity/GridNavigationMarkEntity;", "children", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "createdAt", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/ArrayList;Ljava/lang/Long;)V", "getId", "()Ljava/lang/String;", "getName", "getIcons", "setIcons", "(Ljava/lang/String;)V", "getDarkIcons", "getUri", "getShowMark", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getMarks", "()Ljava/util/List;", "getChildren", "()Ljava/util/ArrayList;", "setChildren", "(Ljava/util/ArrayList;)V", "getCreatedAt", "()Ljava/lang/Long;", "Ljava/lang/Long;", "itemViewHeight", "", "getItemViewHeight", "()I", "setItemViewHeight", "(I)V", "getIconUrl", "getDisplayMark", "toQuickAccessEntity", "Lcom/kubi/home/api/entity/QuickAccessEntity;", "equals", "other", "hashCode", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nGridNavigationEntity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GridNavigationEntity.kt\ncom/kubi/home/entity/GridNavigationEntity\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,122:1\n1999#2,14:123\n*S KotlinDebug\n*F\n+ 1 GridNavigationEntity.kt\ncom/kubi/home/entity/GridNavigationEntity\n*L\n52#1:123,14\n*E\n"})
public class GridNavigationEntity {

    @Nullable
    private ArrayList<GridNavigationEntity> children;

    @Nullable
    private final Long createdAt;

    @Nullable
    private final String darkIcons;

    @Nullable
    private String icons;

    @Nullable
    private final String id;
    private int itemViewHeight;

    @Nullable
    private final List<GridNavigationMarkEntity> marks;

    @Nullable
    private final String name;

    @Nullable
    private final Boolean showMark;

    @Nullable
    private final String uri;

    public GridNavigationEntity() {
        this(null, null, null, null, null, null, null, null, null, FrameMetricsAggregator.EVERY_DURATION, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GridNavigationEntity)) {
            return false;
        }
        GridNavigationEntity gridNavigationEntity = (GridNavigationEntity) other;
        return Intrinsics.areEqual(this.showMark, gridNavigationEntity.showMark) && Intrinsics.areEqual(this.id, gridNavigationEntity.id) && Intrinsics.areEqual(this.name, gridNavigationEntity.name) && Intrinsics.areEqual(this.icons, gridNavigationEntity.icons) && Intrinsics.areEqual(this.darkIcons, gridNavigationEntity.darkIcons) && Intrinsics.areEqual(this.uri, gridNavigationEntity.uri) && Intrinsics.areEqual(this.marks, gridNavigationEntity.marks);
    }

    public GridNavigationEntity(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable Boolean bool, @Nullable List<GridNavigationMarkEntity> list, @Nullable ArrayList<GridNavigationEntity> arrayList, @Nullable Long l11) {
        this.id = str;
        this.name = str2;
        this.icons = str3;
        this.darkIcons = str4;
        this.uri = str5;
        this.showMark = bool;
        this.marks = list;
        this.children = arrayList;
        this.createdAt = l11;
        this.itemViewHeight = -2;
    }

    @Nullable
    public final ArrayList<GridNavigationEntity> getChildren() {
        return this.children;
    }

    @Nullable
    public final Long getCreatedAt() {
        return this.createdAt;
    }

    @Nullable
    public final String getDarkIcons() {
        return this.darkIcons;
    }

    @Nullable
    public final GridNavigationMarkEntity getDisplayMark() {
        Object next;
        if (!C27025c.m66566d(this.showMark)) {
            return null;
        }
        List<GridNavigationMarkEntity> listEmptyList = this.marks;
        if (listEmptyList == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        Iterator<T> it = listEmptyList.iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                int iM66650j = C27039d.m66650j(((GridNavigationMarkEntity) next).getType());
                do {
                    Object next2 = it.next();
                    int iM66650j2 = C27039d.m66650j(((GridNavigationMarkEntity) next2).getType());
                    if (iM66650j < iM66650j2) {
                        next = next2;
                        iM66650j = iM66650j2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        GridNavigationMarkEntity gridNavigationMarkEntity = (GridNavigationMarkEntity) next;
        if ((gridNavigationMarkEntity != null ? gridNavigationMarkEntity.getStyleType() : null) == null) {
            return null;
        }
        return gridNavigationMarkEntity;
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

    public final int getItemViewHeight() {
        return this.itemViewHeight;
    }

    @Nullable
    public final List<GridNavigationMarkEntity> getMarks() {
        return this.marks;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final Boolean getShowMark() {
        return this.showMark;
    }

    @Nullable
    public final String getUri() {
        return this.uri;
    }

    public int hashCode() {
        Boolean bool = this.showMark;
        int iHashCode = (bool != null ? bool.hashCode() : 0) * 31;
        String str = this.id;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.name;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.icons;
        int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.darkIcons;
        int iHashCode5 = (iHashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.uri;
        int iHashCode6 = (iHashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31;
        List<GridNavigationMarkEntity> list = this.marks;
        return iHashCode6 + (list != null ? list.hashCode() : 0);
    }

    public final void setChildren(@Nullable ArrayList<GridNavigationEntity> arrayList) {
        this.children = arrayList;
    }

    public final void setIcons(@Nullable String str) {
        this.icons = str;
    }

    public final void setItemViewHeight(int i11) {
        this.itemViewHeight = i11;
    }

    @NotNull
    public final QuickAccessEntity toQuickAccessEntity() {
        return new QuickAccessEntity(this.id, this.name, getIconUrl(), this.uri, this.createdAt);
    }

    public /* synthetic */ GridNavigationEntity(String str, String str2, String str3, String str4, String str5, Boolean bool, List list, ArrayList arrayList, Long l11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4, (i11 & 16) != 0 ? null : str5, (i11 & 32) != 0 ? null : bool, (i11 & 64) != 0 ? null : list, (i11 & 128) != 0 ? null : arrayList, (i11 & 256) != 0 ? null : l11);
    }
}
