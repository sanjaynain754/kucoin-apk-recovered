package com.kubi.home.entity;

import androidx.annotation.Keep;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: GridNavigationMoreEntity.kt */
/* JADX INFO: loaded from: classes12.dex */
@Keep
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0011\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u000fJ8\u0010\u0014\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0004HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, m90084d2 = {"Lcom/kubi/home/entity/GridNavigationSaveReqEntity;", "", "configList", "", "", "operate", "userCustomVersion", "", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/Long;)V", "getConfigList", "()Ljava/util/List;", "getOperate", "()Ljava/lang/String;", "getUserCustomVersion", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "component2", "component3", "copy", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/Long;)Lcom/kubi/home/entity/GridNavigationSaveReqEntity;", "equals", "", "other", "hashCode", "", "toString", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class GridNavigationSaveReqEntity {

    @Nullable
    private final List<String> configList;

    @Nullable
    private final String operate;

    @Nullable
    private final Long userCustomVersion;

    public GridNavigationSaveReqEntity() {
        this(null, null, null, 7, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GridNavigationSaveReqEntity)) {
            return false;
        }
        GridNavigationSaveReqEntity gridNavigationSaveReqEntity = (GridNavigationSaveReqEntity) other;
        return Intrinsics.areEqual(this.configList, gridNavigationSaveReqEntity.configList) && Intrinsics.areEqual(this.operate, gridNavigationSaveReqEntity.operate) && Intrinsics.areEqual(this.userCustomVersion, gridNavigationSaveReqEntity.userCustomVersion);
    }

    public GridNavigationSaveReqEntity(@Nullable List<String> list, @Nullable String str, @Nullable Long l11) {
        this.configList = list;
        this.operate = str;
        this.userCustomVersion = l11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GridNavigationSaveReqEntity copy$default(GridNavigationSaveReqEntity gridNavigationSaveReqEntity, List list, String str, Long l11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = gridNavigationSaveReqEntity.configList;
        }
        if ((i11 & 2) != 0) {
            str = gridNavigationSaveReqEntity.operate;
        }
        if ((i11 & 4) != 0) {
            l11 = gridNavigationSaveReqEntity.userCustomVersion;
        }
        return gridNavigationSaveReqEntity.copy(list, str, l11);
    }

    @Nullable
    public final List<String> component1() {
        return this.configList;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getOperate() {
        return this.operate;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Long getUserCustomVersion() {
        return this.userCustomVersion;
    }

    @NotNull
    public final GridNavigationSaveReqEntity copy(@Nullable List<String> configList, @Nullable String operate, @Nullable Long userCustomVersion) {
        return new GridNavigationSaveReqEntity(configList, operate, userCustomVersion);
    }

    @Nullable
    public final List<String> getConfigList() {
        return this.configList;
    }

    @Nullable
    public final String getOperate() {
        return this.operate;
    }

    @Nullable
    public final Long getUserCustomVersion() {
        return this.userCustomVersion;
    }

    public int hashCode() {
        List<String> list = this.configList;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.operate;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l11 = this.userCustomVersion;
        return iHashCode2 + (l11 != null ? l11.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "GridNavigationSaveReqEntity(configList=" + this.configList + ", operate=" + this.operate + ", userCustomVersion=" + this.userCustomVersion + ')';
    }

    public /* synthetic */ GridNavigationSaveReqEntity(List list, String str, Long l11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : list, (i11 & 2) != 0 ? null : str, (i11 & 4) != 0 ? null : l11);
    }
}
