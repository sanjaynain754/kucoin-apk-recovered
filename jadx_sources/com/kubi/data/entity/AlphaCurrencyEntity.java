package com.kubi.data.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import java.util.ArrayList;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AlphaCurrencyEntity.kt */
/* JADX INFO: loaded from: classes.dex */
@Keep
@Metadata(m90083d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u001c\b\u0002\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001`\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u001d\u0010\u0010\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001`\u0007HÆ\u0003J8\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u001c\b\u0002\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001`\u0007HÆ\u0001¢\u0006\u0002\u0010\u0012J\u0006\u0010\u0013\u001a\u00020\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0014HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0014R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR%\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001`\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006!"}, m90084d2 = {"Lcom/kubi/data/entity/AlphaCurrencyEntity;", "Landroid/os/Parcelable;", "timeline", "", "currencies", "Ljava/util/ArrayList;", "Lcom/kubi/data/entity/AlphaCurrencyInfoEntity;", "Lkotlin/collections/ArrayList;", "<init>", "(Ljava/lang/Long;Ljava/util/ArrayList;)V", "getTimeline", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getCurrencies", "()Ljava/util/ArrayList;", "component1", "component2", "copy", "(Ljava/lang/Long;Ljava/util/ArrayList;)Lcom/kubi/data/entity/AlphaCurrencyEntity;", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "LDataProvider_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class AlphaCurrencyEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<AlphaCurrencyEntity> CREATOR = new Creator();

    @Nullable
    private final ArrayList<AlphaCurrencyInfoEntity> currencies;

    @Nullable
    private final Long timeline;

    /* JADX INFO: compiled from: AlphaCurrencyEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<AlphaCurrencyEntity> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AlphaCurrencyEntity createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            ArrayList arrayList = null;
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            if (parcel.readInt() != 0) {
                int i11 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i11);
                for (int i12 = 0; i12 != i11; i12++) {
                    arrayList2.add(AlphaCurrencyInfoEntity.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new AlphaCurrencyEntity(lValueOf, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AlphaCurrencyEntity[] newArray(int i11) {
            return new AlphaCurrencyEntity[i11];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AlphaCurrencyEntity() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AlphaCurrencyEntity)) {
            return false;
        }
        AlphaCurrencyEntity alphaCurrencyEntity = (AlphaCurrencyEntity) other;
        return Intrinsics.areEqual(this.timeline, alphaCurrencyEntity.timeline) && Intrinsics.areEqual(this.currencies, alphaCurrencyEntity.currencies);
    }

    public AlphaCurrencyEntity(@Nullable Long l11, @Nullable ArrayList<AlphaCurrencyInfoEntity> arrayList) {
        this.timeline = l11;
        this.currencies = arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AlphaCurrencyEntity copy$default(AlphaCurrencyEntity alphaCurrencyEntity, Long l11, ArrayList arrayList, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            l11 = alphaCurrencyEntity.timeline;
        }
        if ((i11 & 2) != 0) {
            arrayList = alphaCurrencyEntity.currencies;
        }
        return alphaCurrencyEntity.copy(l11, arrayList);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Long getTimeline() {
        return this.timeline;
    }

    @Nullable
    public final ArrayList<AlphaCurrencyInfoEntity> component2() {
        return this.currencies;
    }

    @NotNull
    public final AlphaCurrencyEntity copy(@Nullable Long timeline, @Nullable ArrayList<AlphaCurrencyInfoEntity> currencies) {
        return new AlphaCurrencyEntity(timeline, currencies);
    }

    @Nullable
    public final ArrayList<AlphaCurrencyInfoEntity> getCurrencies() {
        return this.currencies;
    }

    @Nullable
    public final Long getTimeline() {
        return this.timeline;
    }

    public int hashCode() {
        Long l11 = this.timeline;
        int iHashCode = (l11 == null ? 0 : l11.hashCode()) * 31;
        ArrayList<AlphaCurrencyInfoEntity> arrayList = this.currencies;
        return iHashCode + (arrayList != null ? arrayList.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "AlphaCurrencyEntity(timeline=" + this.timeline + ", currencies=" + this.currencies + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Long l11 = this.timeline;
        if (l11 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l11.longValue());
        }
        ArrayList<AlphaCurrencyInfoEntity> arrayList = this.currencies;
        if (arrayList == null) {
            dest.writeInt(0);
            return;
        }
        dest.writeInt(1);
        dest.writeInt(arrayList.size());
        Iterator<AlphaCurrencyInfoEntity> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(dest, flags);
        }
    }

    public /* synthetic */ AlphaCurrencyEntity(Long l11, ArrayList arrayList, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : l11, (i11 & 2) != 0 ? null : arrayList);
    }
}
