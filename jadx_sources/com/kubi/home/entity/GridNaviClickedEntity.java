package com.kubi.home.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: GridNaviClickedEntity.kt */
/* JADX INFO: loaded from: classes15.dex */
@Keep
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0006\u0010\u000b\u001a\u00020\fJ\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\fHÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\u0016\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\fR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0019"}, m90084d2 = {"Lcom/kubi/home/entity/GridNaviClickedEntity;", "Landroid/os/Parcelable;", FirebaseAnalytics.Param.ITEMS, "", "Lcom/kubi/home/entity/GridNaviClickedTimeEntity;", "<init>", "(Ljava/util/List;)V", "getItems", "()Ljava/util/List;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "HomeApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class GridNaviClickedEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<GridNaviClickedEntity> CREATOR = new C14549a();

    @NotNull
    private final List<GridNaviClickedTimeEntity> items;

    /* JADX INFO: renamed from: com.kubi.home.entity.GridNaviClickedEntity$a */
    /* JADX INFO: compiled from: GridNaviClickedEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C14549a implements Parcelable.Creator<GridNaviClickedEntity> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final GridNaviClickedEntity createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i11 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i11);
            for (int i12 = 0; i12 != i11; i12++) {
                arrayList.add(GridNaviClickedTimeEntity.CREATOR.createFromParcel(parcel));
            }
            return new GridNaviClickedEntity(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final GridNaviClickedEntity[] newArray(int i11) {
            return new GridNaviClickedEntity[i11];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GridNaviClickedEntity() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof GridNaviClickedEntity) && Intrinsics.areEqual(this.items, ((GridNaviClickedEntity) other).items);
    }

    public GridNaviClickedEntity(@NotNull List<GridNaviClickedTimeEntity> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.items = items;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GridNaviClickedEntity copy$default(GridNaviClickedEntity gridNaviClickedEntity, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = gridNaviClickedEntity.items;
        }
        return gridNaviClickedEntity.copy(list);
    }

    @NotNull
    public final List<GridNaviClickedTimeEntity> component1() {
        return this.items;
    }

    @NotNull
    public final GridNaviClickedEntity copy(@NotNull List<GridNaviClickedTimeEntity> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        return new GridNaviClickedEntity(items);
    }

    @NotNull
    public final List<GridNaviClickedTimeEntity> getItems() {
        return this.items;
    }

    public int hashCode() {
        return this.items.hashCode();
    }

    @NotNull
    public String toString() {
        return "GridNaviClickedEntity(items=" + this.items + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        List<GridNaviClickedTimeEntity> list = this.items;
        dest.writeInt(list.size());
        Iterator<GridNaviClickedTimeEntity> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(dest, flags);
        }
    }

    public /* synthetic */ GridNaviClickedEntity(List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? new ArrayList() : list);
    }
}
