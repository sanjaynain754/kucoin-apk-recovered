package com.kubi.quotefacade.entity;

import androidx.annotation.Keep;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: TradeChanceEntity.kt */
/* JADX INFO: loaded from: classes12.dex */
@Keep
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\u000b\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\"\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\u0006¨\u0006\u0013"}, m90084d2 = {"Lcom/kubi/quotefacade/entity/ChancePlateEntity;", "", "plateList", "", "Lcom/kubi/quotefacade/entity/ChancePlateItem;", "<init>", "(Ljava/util/List;)V", "getPlateList", "()Ljava/util/List;", "setPlateList", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class ChancePlateEntity {

    @Nullable
    private List<ChancePlateItem> plateList;

    /* JADX WARN: Multi-variable type inference failed */
    public ChancePlateEntity() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ChancePlateEntity) && Intrinsics.areEqual(this.plateList, ((ChancePlateEntity) other).plateList);
    }

    public ChancePlateEntity(@Nullable List<ChancePlateItem> list) {
        this.plateList = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ChancePlateEntity copy$default(ChancePlateEntity chancePlateEntity, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = chancePlateEntity.plateList;
        }
        return chancePlateEntity.copy(list);
    }

    @Nullable
    public final List<ChancePlateItem> component1() {
        return this.plateList;
    }

    @NotNull
    public final ChancePlateEntity copy(@Nullable List<ChancePlateItem> plateList) {
        return new ChancePlateEntity(plateList);
    }

    @Nullable
    public final List<ChancePlateItem> getPlateList() {
        return this.plateList;
    }

    public int hashCode() {
        List<ChancePlateItem> list = this.plateList;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final void setPlateList(@Nullable List<ChancePlateItem> list) {
        this.plateList = list;
    }

    @NotNull
    public String toString() {
        return "ChancePlateEntity(plateList=" + this.plateList + ')';
    }

    public /* synthetic */ ChancePlateEntity(List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : list);
    }
}
