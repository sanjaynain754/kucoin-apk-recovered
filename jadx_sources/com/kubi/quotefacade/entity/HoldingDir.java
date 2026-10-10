package com.kubi.quotefacade.entity;

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

/* JADX INFO: compiled from: HoldingEntity.kt */
/* JADX INFO: loaded from: classes37.dex */
@Keep
@Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u0011\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J,\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0011J\u0006\u0010\u0012\u001a\u00020\u0013J\u0013\u0010\u0014\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0013R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u001f"}, m90084d2 = {"Lcom/kubi/quotefacade/entity/HoldingDir;", "Landroid/os/Parcelable;", "allHoldingEmpty", "", "list", "", "Lcom/kubi/quotefacade/entity/HoldingDirEntity;", "<init>", "(Ljava/lang/Boolean;Ljava/util/List;)V", "getAllHoldingEmpty", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getList", "()Ljava/util/List;", "component1", "component2", "copy", "(Ljava/lang/Boolean;Ljava/util/List;)Lcom/kubi/quotefacade/entity/HoldingDir;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class HoldingDir implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<HoldingDir> CREATOR = new C21896a();

    @Nullable
    private final Boolean allHoldingEmpty;

    @Nullable
    private final List<HoldingDirEntity> list;

    /* JADX INFO: renamed from: com.kubi.quotefacade.entity.HoldingDir$a */
    /* JADX INFO: compiled from: HoldingEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C21896a implements Parcelable.Creator<HoldingDir> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final HoldingDir createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            ArrayList arrayList = null;
            Boolean boolValueOf = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            if (parcel.readInt() != 0) {
                int i11 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i11);
                for (int i12 = 0; i12 != i11; i12++) {
                    arrayList2.add(HoldingDirEntity.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new HoldingDir(boolValueOf, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final HoldingDir[] newArray(int i11) {
            return new HoldingDir[i11];
        }
    }

    public HoldingDir(@Nullable Boolean bool, @Nullable List<HoldingDirEntity> list) {
        this.allHoldingEmpty = bool;
        this.list = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HoldingDir)) {
            return false;
        }
        HoldingDir holdingDir = (HoldingDir) other;
        return Intrinsics.areEqual(this.allHoldingEmpty, holdingDir.allHoldingEmpty) && Intrinsics.areEqual(this.list, holdingDir.list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HoldingDir copy$default(HoldingDir holdingDir, Boolean bool, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bool = holdingDir.allHoldingEmpty;
        }
        if ((i11 & 2) != 0) {
            list = holdingDir.list;
        }
        return holdingDir.copy(bool, list);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Boolean getAllHoldingEmpty() {
        return this.allHoldingEmpty;
    }

    @Nullable
    public final List<HoldingDirEntity> component2() {
        return this.list;
    }

    @NotNull
    public final HoldingDir copy(@Nullable Boolean allHoldingEmpty, @Nullable List<HoldingDirEntity> list) {
        return new HoldingDir(allHoldingEmpty, list);
    }

    @Nullable
    public final Boolean getAllHoldingEmpty() {
        return this.allHoldingEmpty;
    }

    @Nullable
    public final List<HoldingDirEntity> getList() {
        return this.list;
    }

    public int hashCode() {
        Boolean bool = this.allHoldingEmpty;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        List<HoldingDirEntity> list = this.list;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "HoldingDir(allHoldingEmpty=" + this.allHoldingEmpty + ", list=" + this.list + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Boolean bool = this.allHoldingEmpty;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool.booleanValue() ? 1 : 0);
        }
        List<HoldingDirEntity> list = this.list;
        if (list == null) {
            dest.writeInt(0);
            return;
        }
        dest.writeInt(1);
        dest.writeInt(list.size());
        Iterator<HoldingDirEntity> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(dest, flags);
        }
    }

    public /* synthetic */ HoldingDir(Boolean bool, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? Boolean.FALSE : bool, list);
    }
}
