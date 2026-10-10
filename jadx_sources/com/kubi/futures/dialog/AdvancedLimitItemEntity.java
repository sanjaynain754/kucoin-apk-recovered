package com.kubi.futures.dialog;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AdvancedLimitDialogHelper.kt */
/* JADX INFO: loaded from: classes13.dex */
@Keep
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\f¨\u0006\u0016"}, m90084d2 = {"Lcom/kubi/futures/dialog/AdvancedLimitItemEntity;", "", "tifType", "Lcom/kubi/futures/dialog/TIF;", "isSelect", "", "<init>", "(Lcom/kubi/futures/dialog/TIF;Z)V", "getTifType", "()Lcom/kubi/futures/dialog/TIF;", "setTifType", "(Lcom/kubi/futures/dialog/TIF;)V", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class AdvancedLimitItemEntity {
    private final boolean isSelect;

    @NotNull
    private TIF tifType;

    public AdvancedLimitItemEntity(@NotNull TIF tifType, boolean z11) {
        Intrinsics.checkNotNullParameter(tifType, "tifType");
        this.tifType = tifType;
        this.isSelect = z11;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdvancedLimitItemEntity)) {
            return false;
        }
        AdvancedLimitItemEntity advancedLimitItemEntity = (AdvancedLimitItemEntity) other;
        return this.tifType == advancedLimitItemEntity.tifType && this.isSelect == advancedLimitItemEntity.isSelect;
    }

    public static /* synthetic */ AdvancedLimitItemEntity copy$default(AdvancedLimitItemEntity advancedLimitItemEntity, TIF tif, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            tif = advancedLimitItemEntity.tifType;
        }
        if ((i11 & 2) != 0) {
            z11 = advancedLimitItemEntity.isSelect;
        }
        return advancedLimitItemEntity.copy(tif, z11);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final TIF getTifType() {
        return this.tifType;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsSelect() {
        return this.isSelect;
    }

    @NotNull
    public final AdvancedLimitItemEntity copy(@NotNull TIF tifType, boolean isSelect) {
        Intrinsics.checkNotNullParameter(tifType, "tifType");
        return new AdvancedLimitItemEntity(tifType, isSelect);
    }

    @NotNull
    public final TIF getTifType() {
        return this.tifType;
    }

    public int hashCode() {
        return (this.tifType.hashCode() * 31) + Boolean.hashCode(this.isSelect);
    }

    public final boolean isSelect() {
        return this.isSelect;
    }

    public final void setTifType(@NotNull TIF tif) {
        Intrinsics.checkNotNullParameter(tif, "<set-?>");
        this.tifType = tif;
    }

    @NotNull
    public String toString() {
        return "AdvancedLimitItemEntity(tifType=" + this.tifType + ", isSelect=" + this.isSelect + ')';
    }

    public /* synthetic */ AdvancedLimitItemEntity(TIF tif, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(tif, (i11 & 2) != 0 ? false : z11);
    }
}
