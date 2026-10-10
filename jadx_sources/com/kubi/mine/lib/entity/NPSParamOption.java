package com.kubi.mine.lib.entity;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: NPSQuestionEntity.kt */
/* JADX INFO: loaded from: classes29.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\fJ&\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, m90084d2 = {"Lcom/kubi/mine/lib/entity/NPSParamOption;", "", "selected", "", "sort", "", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Integer;)V", "getSelected", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getSort", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "copy", "(Ljava/lang/Boolean;Ljava/lang/Integer;)Lcom/kubi/mine/lib/entity/NPSParamOption;", "equals", "other", "hashCode", "toString", "", "MineLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class NPSParamOption {

    @Nullable
    private final Boolean selected;

    @Nullable
    private final Integer sort;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NPSParamOption)) {
            return false;
        }
        NPSParamOption nPSParamOption = (NPSParamOption) other;
        return Intrinsics.areEqual(this.selected, nPSParamOption.selected) && Intrinsics.areEqual(this.sort, nPSParamOption.sort);
    }

    public static /* synthetic */ NPSParamOption copy$default(NPSParamOption nPSParamOption, Boolean bool, Integer num, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bool = nPSParamOption.selected;
        }
        if ((i11 & 2) != 0) {
            num = nPSParamOption.sort;
        }
        return nPSParamOption.copy(bool, num);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Boolean getSelected() {
        return this.selected;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getSort() {
        return this.sort;
    }

    @NotNull
    public final NPSParamOption copy(@Nullable Boolean selected, @Nullable Integer sort) {
        return new NPSParamOption(selected, sort);
    }

    @Nullable
    public final Boolean getSelected() {
        return this.selected;
    }

    @Nullable
    public final Integer getSort() {
        return this.sort;
    }

    public int hashCode() {
        Boolean bool = this.selected;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Integer num = this.sort;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "NPSParamOption(selected=" + this.selected + ", sort=" + this.sort + ')';
    }

    public NPSParamOption(@Nullable Boolean bool, @Nullable Integer num) {
        this.selected = bool;
        this.sort = num;
    }
}
