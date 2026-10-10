package com.kubi.home.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
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
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0006\u0010\u0012\u001a\u00020\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u001f"}, m90084d2 = {"Lcom/kubi/home/entity/GridNaviClickedTimeEntity;", "Landroid/os/Parcelable;", "id", "", "clickedTimes", "", "", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getId", "()Ljava/lang/String;", "getClickedTimes", "()Ljava/util/List;", "setClickedTimes", "(Ljava/util/List;)V", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "HomeApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class GridNaviClickedTimeEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<GridNaviClickedTimeEntity> CREATOR = new C14550a();

    @NotNull
    private List<Long> clickedTimes;

    @NotNull
    private final String id;

    /* JADX INFO: renamed from: com.kubi.home.entity.GridNaviClickedTimeEntity$a */
    /* JADX INFO: compiled from: GridNaviClickedEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C14550a implements Parcelable.Creator<GridNaviClickedTimeEntity> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final GridNaviClickedTimeEntity createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            int i11 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i11);
            for (int i12 = 0; i12 != i11; i12++) {
                arrayList.add(Long.valueOf(parcel.readLong()));
            }
            return new GridNaviClickedTimeEntity(string, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final GridNaviClickedTimeEntity[] newArray(int i11) {
            return new GridNaviClickedTimeEntity[i11];
        }
    }

    public GridNaviClickedTimeEntity(@NotNull String id2, @NotNull List<Long> clickedTimes) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(clickedTimes, "clickedTimes");
        this.id = id2;
        this.clickedTimes = clickedTimes;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GridNaviClickedTimeEntity)) {
            return false;
        }
        GridNaviClickedTimeEntity gridNaviClickedTimeEntity = (GridNaviClickedTimeEntity) other;
        return Intrinsics.areEqual(this.id, gridNaviClickedTimeEntity.id) && Intrinsics.areEqual(this.clickedTimes, gridNaviClickedTimeEntity.clickedTimes);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GridNaviClickedTimeEntity copy$default(GridNaviClickedTimeEntity gridNaviClickedTimeEntity, String str, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = gridNaviClickedTimeEntity.id;
        }
        if ((i11 & 2) != 0) {
            list = gridNaviClickedTimeEntity.clickedTimes;
        }
        return gridNaviClickedTimeEntity.copy(str, list);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final List<Long> component2() {
        return this.clickedTimes;
    }

    @NotNull
    public final GridNaviClickedTimeEntity copy(@NotNull String id2, @NotNull List<Long> clickedTimes) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(clickedTimes, "clickedTimes");
        return new GridNaviClickedTimeEntity(id2, clickedTimes);
    }

    @NotNull
    public final List<Long> getClickedTimes() {
        return this.clickedTimes;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    public int hashCode() {
        return (this.id.hashCode() * 31) + this.clickedTimes.hashCode();
    }

    public final void setClickedTimes(@NotNull List<Long> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.clickedTimes = list;
    }

    @NotNull
    public String toString() {
        return "GridNaviClickedTimeEntity(id=" + this.id + ", clickedTimes=" + this.clickedTimes + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.id);
        List<Long> list = this.clickedTimes;
        dest.writeInt(list.size());
        Iterator<Long> it = list.iterator();
        while (it.hasNext()) {
            dest.writeLong(it.next().longValue());
        }
    }

    public /* synthetic */ GridNaviClickedTimeEntity(String str, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? new ArrayList() : list);
    }
}
