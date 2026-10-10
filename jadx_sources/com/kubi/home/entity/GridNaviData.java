package com.kubi.home.entity;

import androidx.annotation.Keep;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: GridNavigationMoreEntity.kt */
/* JADX INFO: loaded from: classes15.dex */
@Keep
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0011\u001a\u00020\u0012H\u0016J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J1\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00052\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0012HÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\f\"\u0004\b\u000f\u0010\u000eR\u001a\u0010\u0007\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\f\"\u0004\b\u0010\u0010\u000e¨\u0006\u001e"}, m90084d2 = {"Lcom/kubi/home/entity/GridNaviData;", "Lcom/kubi/home/entity/GridNaviMoreItem;", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "Lcom/kubi/home/entity/GridNavigationEntity;", "isEnable", "", "isEditMode", "isSelected", "<init>", "(Lcom/kubi/home/entity/GridNavigationEntity;ZZZ)V", "getEntity", "()Lcom/kubi/home/entity/GridNavigationEntity;", "()Z", "setEnable", "(Z)V", "setEditMode", "setSelected", "getItemType", "", "component1", "component2", "component3", "component4", "copy", "equals", "other", "", "hashCode", "toString", "", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class GridNaviData extends GridNaviMoreItem {

    @NotNull
    private final GridNavigationEntity entity;
    private boolean isEditMode;
    private boolean isEnable;
    private boolean isSelected;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GridNaviData)) {
            return false;
        }
        GridNaviData gridNaviData = (GridNaviData) other;
        return Intrinsics.areEqual(this.entity, gridNaviData.entity) && this.isEnable == gridNaviData.isEnable && this.isEditMode == gridNaviData.isEditMode && this.isSelected == gridNaviData.isSelected;
    }

    @Override // io.chad.library.adapter.base.entity.MultiItemEntity
    /* JADX INFO: renamed from: getItemType */
    public int getF42794b() {
        return 1;
    }

    public GridNaviData(@NotNull GridNavigationEntity entity, boolean z11, boolean z12, boolean z13) {
        Intrinsics.checkNotNullParameter(entity, "entity");
        this.entity = entity;
        this.isEnable = z11;
        this.isEditMode = z12;
        this.isSelected = z13;
    }

    public static /* synthetic */ GridNaviData copy$default(GridNaviData gridNaviData, GridNavigationEntity gridNavigationEntity, boolean z11, boolean z12, boolean z13, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            gridNavigationEntity = gridNaviData.entity;
        }
        if ((i11 & 2) != 0) {
            z11 = gridNaviData.isEnable;
        }
        if ((i11 & 4) != 0) {
            z12 = gridNaviData.isEditMode;
        }
        if ((i11 & 8) != 0) {
            z13 = gridNaviData.isSelected;
        }
        return gridNaviData.copy(gridNavigationEntity, z11, z12, z13);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final GridNavigationEntity getEntity() {
        return this.entity;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsEnable() {
        return this.isEnable;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIsEditMode() {
        return this.isEditMode;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    @NotNull
    public final GridNaviData copy(@NotNull GridNavigationEntity entity, boolean isEnable, boolean isEditMode, boolean isSelected) {
        Intrinsics.checkNotNullParameter(entity, "entity");
        return new GridNaviData(entity, isEnable, isEditMode, isSelected);
    }

    @NotNull
    public final GridNavigationEntity getEntity() {
        return this.entity;
    }

    public int hashCode() {
        return (((((this.entity.hashCode() * 31) + Boolean.hashCode(this.isEnable)) * 31) + Boolean.hashCode(this.isEditMode)) * 31) + Boolean.hashCode(this.isSelected);
    }

    public final boolean isEditMode() {
        return this.isEditMode;
    }

    public final boolean isEnable() {
        return this.isEnable;
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    public final void setEditMode(boolean z11) {
        this.isEditMode = z11;
    }

    public final void setEnable(boolean z11) {
        this.isEnable = z11;
    }

    public final void setSelected(boolean z11) {
        this.isSelected = z11;
    }

    @NotNull
    public String toString() {
        return "GridNaviData(entity=" + this.entity + ", isEnable=" + this.isEnable + ", isEditMode=" + this.isEditMode + ", isSelected=" + this.isSelected + ')';
    }
}
