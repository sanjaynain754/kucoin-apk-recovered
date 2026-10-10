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
@Metadata(m90083d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0010J8\u0010\u0015\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u0016J\u0006\u0010\u0017\u001a\u00020\u0018J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u0018HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0006HÖ\u0001J\u0016\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0018R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010¨\u0006$"}, m90084d2 = {"Lcom/kubi/quotefacade/entity/HoldingData;", "Landroid/os/Parcelable;", "list", "", "Lcom/kubi/quotefacade/entity/HoldingEntity;", "accountType", "", "lastUpdateTime", "", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/Long;)V", "getList", "()Ljava/util/List;", "getAccountType", "()Ljava/lang/String;", "getLastUpdateTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "component2", "component3", "copy", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/Long;)Lcom/kubi/quotefacade/entity/HoldingData;", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class HoldingData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<HoldingData> CREATOR = new C21895a();

    @Nullable
    private final String accountType;

    @Nullable
    private final Long lastUpdateTime;

    @Nullable
    private final List<HoldingEntity> list;

    /* JADX INFO: renamed from: com.kubi.quotefacade.entity.HoldingData$a */
    /* JADX INFO: compiled from: HoldingEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C21895a implements Parcelable.Creator<HoldingData> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final HoldingData createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i11 = parcel.readInt();
                arrayList = new ArrayList(i11);
                for (int i12 = 0; i12 != i11; i12++) {
                    arrayList.add(HoldingEntity.CREATOR.createFromParcel(parcel));
                }
            }
            return new HoldingData(arrayList, parcel.readString(), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final HoldingData[] newArray(int i11) {
            return new HoldingData[i11];
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
        if (!(other instanceof HoldingData)) {
            return false;
        }
        HoldingData holdingData = (HoldingData) other;
        return Intrinsics.areEqual(this.list, holdingData.list) && Intrinsics.areEqual(this.accountType, holdingData.accountType) && Intrinsics.areEqual(this.lastUpdateTime, holdingData.lastUpdateTime);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HoldingData copy$default(HoldingData holdingData, List list, String str, Long l11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = holdingData.list;
        }
        if ((i11 & 2) != 0) {
            str = holdingData.accountType;
        }
        if ((i11 & 4) != 0) {
            l11 = holdingData.lastUpdateTime;
        }
        return holdingData.copy(list, str, l11);
    }

    @Nullable
    public final List<HoldingEntity> component1() {
        return this.list;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAccountType() {
        return this.accountType;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Long getLastUpdateTime() {
        return this.lastUpdateTime;
    }

    @NotNull
    public final HoldingData copy(@Nullable List<HoldingEntity> list, @Nullable String accountType, @Nullable Long lastUpdateTime) {
        return new HoldingData(list, accountType, lastUpdateTime);
    }

    @Nullable
    public final String getAccountType() {
        return this.accountType;
    }

    @Nullable
    public final Long getLastUpdateTime() {
        return this.lastUpdateTime;
    }

    @Nullable
    public final List<HoldingEntity> getList() {
        return this.list;
    }

    public int hashCode() {
        List<HoldingEntity> list = this.list;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.accountType;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l11 = this.lastUpdateTime;
        return iHashCode2 + (l11 != null ? l11.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "HoldingData(list=" + this.list + ", accountType=" + this.accountType + ", lastUpdateTime=" + this.lastUpdateTime + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        List<HoldingEntity> list = this.list;
        if (list == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(list.size());
            Iterator<HoldingEntity> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(dest, flags);
            }
        }
        dest.writeString(this.accountType);
        Long l11 = this.lastUpdateTime;
        if (l11 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l11.longValue());
        }
    }

    public HoldingData(@Nullable List<HoldingEntity> list, @Nullable String str, @Nullable Long l11) {
        this.list = list;
        this.accountType = str;
        this.lastUpdateTime = l11;
    }
}
