package com.kubi.quotefacade.entity;

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

/* JADX INFO: compiled from: MarkekListEntity.kt */
/* JADX INFO: loaded from: classes37.dex */
@Keep
@Metadata(m90083d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0011\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003J\u0010\u0010 \u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u0018J\u0010\u0010!\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u0018Jh\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0002\u0010#J\u0006\u0010$\u001a\u00020\u0003J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010(HÖ\u0003J\t\u0010)\u001a\u00020\u0003HÖ\u0001J\t\u0010*\u001a\u00020+HÖ\u0001J\u0016\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020\u0003R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0012\u0010\u0010R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0013\u0010\u0010R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0014\u0010\u0010R\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\u0015\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u001a\u0010\u0018¨\u00061"}, m90084d2 = {"Lcom/kubi/quotefacade/entity/MarketListEntity;", "Landroid/os/Parcelable;", "currentPage", "", "pageSize", "totalNum", "totalPage", FirebaseAnalytics.Param.ITEMS, "", "Lcom/kubi/quotefacade/entity/MarketListEntityItem;", "batch", "", "expiredAt", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/Long;Ljava/lang/Long;)V", "getCurrentPage", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getPageSize", "getTotalNum", "getTotalPage", "getItems", "()Ljava/util/List;", "getBatch", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getExpiredAt", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/Long;Ljava/lang/Long;)Lcom/kubi/quotefacade/entity/MarketListEntity;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "QuoteFacadeApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class MarketListEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<MarketListEntity> CREATOR = new C21901a();

    @Nullable
    private final Long batch;

    @Nullable
    private final Integer currentPage;

    @Nullable
    private final Long expiredAt;

    @Nullable
    private final List<MarketListEntityItem> items;

    @Nullable
    private final Integer pageSize;

    @Nullable
    private final Integer totalNum;

    @Nullable
    private final Integer totalPage;

    /* JADX INFO: renamed from: com.kubi.quotefacade.entity.MarketListEntity$a */
    /* JADX INFO: compiled from: MarkekListEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C21901a implements Parcelable.Creator<MarketListEntity> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MarketListEntity createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf4 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i11 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i11);
                for (int i12 = 0; i12 != i11; i12++) {
                    arrayList2.add(MarketListEntityItem.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new MarketListEntity(numValueOf, numValueOf2, numValueOf3, numValueOf4, arrayList, parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final MarketListEntity[] newArray(int i11) {
            return new MarketListEntity[i11];
        }
    }

    public MarketListEntity() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MarketListEntity)) {
            return false;
        }
        MarketListEntity marketListEntity = (MarketListEntity) other;
        return Intrinsics.areEqual(this.currentPage, marketListEntity.currentPage) && Intrinsics.areEqual(this.pageSize, marketListEntity.pageSize) && Intrinsics.areEqual(this.totalNum, marketListEntity.totalNum) && Intrinsics.areEqual(this.totalPage, marketListEntity.totalPage) && Intrinsics.areEqual(this.items, marketListEntity.items) && Intrinsics.areEqual(this.batch, marketListEntity.batch) && Intrinsics.areEqual(this.expiredAt, marketListEntity.expiredAt);
    }

    public MarketListEntity(@Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4, @Nullable List<MarketListEntityItem> list, @Nullable Long l11, @Nullable Long l12) {
        this.currentPage = num;
        this.pageSize = num2;
        this.totalNum = num3;
        this.totalPage = num4;
        this.items = list;
        this.batch = l11;
        this.expiredAt = l12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MarketListEntity copy$default(MarketListEntity marketListEntity, Integer num, Integer num2, Integer num3, Integer num4, List list, Long l11, Long l12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            num = marketListEntity.currentPage;
        }
        if ((i11 & 2) != 0) {
            num2 = marketListEntity.pageSize;
        }
        if ((i11 & 4) != 0) {
            num3 = marketListEntity.totalNum;
        }
        if ((i11 & 8) != 0) {
            num4 = marketListEntity.totalPage;
        }
        if ((i11 & 16) != 0) {
            list = marketListEntity.items;
        }
        if ((i11 & 32) != 0) {
            l11 = marketListEntity.batch;
        }
        if ((i11 & 64) != 0) {
            l12 = marketListEntity.expiredAt;
        }
        Long l13 = l11;
        Long l14 = l12;
        List list2 = list;
        Integer num5 = num3;
        return marketListEntity.copy(num, num2, num5, num4, list2, l13, l14);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getCurrentPage() {
        return this.currentPage;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getPageSize() {
        return this.pageSize;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getTotalNum() {
        return this.totalNum;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getTotalPage() {
        return this.totalPage;
    }

    @Nullable
    public final List<MarketListEntityItem> component5() {
        return this.items;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Long getBatch() {
        return this.batch;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Long getExpiredAt() {
        return this.expiredAt;
    }

    @NotNull
    public final MarketListEntity copy(@Nullable Integer currentPage, @Nullable Integer pageSize, @Nullable Integer totalNum, @Nullable Integer totalPage, @Nullable List<MarketListEntityItem> items, @Nullable Long batch, @Nullable Long expiredAt) {
        return new MarketListEntity(currentPage, pageSize, totalNum, totalPage, items, batch, expiredAt);
    }

    @Nullable
    public final Long getBatch() {
        return this.batch;
    }

    @Nullable
    public final Integer getCurrentPage() {
        return this.currentPage;
    }

    @Nullable
    public final Long getExpiredAt() {
        return this.expiredAt;
    }

    @Nullable
    public final List<MarketListEntityItem> getItems() {
        return this.items;
    }

    @Nullable
    public final Integer getPageSize() {
        return this.pageSize;
    }

    @Nullable
    public final Integer getTotalNum() {
        return this.totalNum;
    }

    @Nullable
    public final Integer getTotalPage() {
        return this.totalPage;
    }

    public int hashCode() {
        Integer num = this.currentPage;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.pageSize;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.totalNum;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.totalPage;
        int iHashCode4 = (iHashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
        List<MarketListEntityItem> list = this.items;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        Long l11 = this.batch;
        int iHashCode6 = (iHashCode5 + (l11 == null ? 0 : l11.hashCode())) * 31;
        Long l12 = this.expiredAt;
        return iHashCode6 + (l12 != null ? l12.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "MarketListEntity(currentPage=" + this.currentPage + ", pageSize=" + this.pageSize + ", totalNum=" + this.totalNum + ", totalPage=" + this.totalPage + ", items=" + this.items + ", batch=" + this.batch + ", expiredAt=" + this.expiredAt + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Integer num = this.currentPage;
        if (num == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num.intValue());
        }
        Integer num2 = this.pageSize;
        if (num2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num2.intValue());
        }
        Integer num3 = this.totalNum;
        if (num3 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num3.intValue());
        }
        Integer num4 = this.totalPage;
        if (num4 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num4.intValue());
        }
        List<MarketListEntityItem> list = this.items;
        if (list == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(list.size());
            Iterator<MarketListEntityItem> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(dest, flags);
            }
        }
        Long l11 = this.batch;
        if (l11 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l11.longValue());
        }
        Long l12 = this.expiredAt;
        if (l12 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l12.longValue());
        }
    }

    public /* synthetic */ MarketListEntity(Integer num, Integer num2, Integer num3, Integer num4, List list, Long l11, Long l12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : num, (i11 & 2) != 0 ? null : num2, (i11 & 4) != 0 ? null : num3, (i11 & 8) != 0 ? null : num4, (i11 & 16) != 0 ? null : list, (i11 & 32) != 0 ? null : l11, (i11 & 64) != 0 ? null : l12);
    }
}
