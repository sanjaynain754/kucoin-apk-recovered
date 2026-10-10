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
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: HoldingEntity.kt */
/* JADX INFO: loaded from: classes37.dex */
@Keep
@Metadata(m90083d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u0011\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J,\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0011J\u0006\u0010\u0012\u001a\u00020\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0013R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006 "}, m90084d2 = {"Lcom/kubi/quotefacade/entity/HoldingCombinedData;", "Landroid/os/Parcelable;", "lastUpdateTime", "", "combinedList", "", "Lcom/kubi/quotefacade/entity/HoldingCombinedItem;", "<init>", "(Ljava/lang/Long;Ljava/util/List;)V", "getLastUpdateTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getCombinedList", "()Ljava/util/List;", "component1", "component2", "copy", "(Ljava/lang/Long;Ljava/util/List;)Lcom/kubi/quotefacade/entity/HoldingCombinedData;", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class HoldingCombinedData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<HoldingCombinedData> CREATOR = new C21892a();

    @Nullable
    private final List<HoldingCombinedItem> combinedList;

    @Nullable
    private final Long lastUpdateTime;

    /* JADX INFO: renamed from: com.kubi.quotefacade.entity.HoldingCombinedData$a */
    /* JADX INFO: compiled from: HoldingEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C21892a implements Parcelable.Creator<HoldingCombinedData> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final HoldingCombinedData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            ArrayList arrayList = null;
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            if (parcel.readInt() != 0) {
                int i11 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i11);
                for (int i12 = 0; i12 != i11; i12++) {
                    arrayList2.add(HoldingCombinedItem.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new HoldingCombinedData(lValueOf, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final HoldingCombinedData[] newArray(int i11) {
            return new HoldingCombinedData[i11];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HoldingCombinedData)) {
            return false;
        }
        HoldingCombinedData holdingCombinedData = (HoldingCombinedData) other;
        return Intrinsics.areEqual(this.lastUpdateTime, holdingCombinedData.lastUpdateTime) && Intrinsics.areEqual(this.combinedList, holdingCombinedData.combinedList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HoldingCombinedData copy$default(HoldingCombinedData holdingCombinedData, Long l11, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            l11 = holdingCombinedData.lastUpdateTime;
        }
        if ((i11 & 2) != 0) {
            list = holdingCombinedData.combinedList;
        }
        return holdingCombinedData.copy(l11, list);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Long getLastUpdateTime() {
        return this.lastUpdateTime;
    }

    @Nullable
    public final List<HoldingCombinedItem> component2() {
        return this.combinedList;
    }

    @NotNull
    public final HoldingCombinedData copy(@Nullable Long lastUpdateTime, @Nullable List<HoldingCombinedItem> combinedList) {
        return new HoldingCombinedData(lastUpdateTime, combinedList);
    }

    @Nullable
    public final List<HoldingCombinedItem> getCombinedList() {
        return this.combinedList;
    }

    @Nullable
    public final Long getLastUpdateTime() {
        return this.lastUpdateTime;
    }

    public int hashCode() {
        Long l11 = this.lastUpdateTime;
        int iHashCode = (l11 == null ? 0 : l11.hashCode()) * 31;
        List<HoldingCombinedItem> list = this.combinedList;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "HoldingCombinedData(lastUpdateTime=" + this.lastUpdateTime + ", combinedList=" + this.combinedList + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Long l11 = this.lastUpdateTime;
        if (l11 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l11.longValue());
        }
        List<HoldingCombinedItem> list = this.combinedList;
        if (list == null) {
            dest.writeInt(0);
            return;
        }
        dest.writeInt(1);
        dest.writeInt(list.size());
        Iterator<HoldingCombinedItem> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(dest, flags);
        }
    }

    public HoldingCombinedData(@Nullable Long l11, @Nullable List<HoldingCombinedItem> list) {
        this.lastUpdateTime = l11;
        this.combinedList = list;
    }
}
