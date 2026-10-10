package com.kubi.kumex.data.platform.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FuturesWelfareEntity.kt */
/* JADX INFO: loaded from: classes12.dex */
@Keep
@Metadata(m90083d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0016\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\u0010\u0010&\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u001bJ\u0010\u0010'\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u001dJ\u0019\u0010(\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000fHÆ\u0003Jr\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0018\b\u0002\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000fHÆ\u0001¢\u0006\u0002\u0010*J\u0006\u0010+\u001a\u00020\u0003J\u0013\u0010,\u001a\u00020\u000b2\b\u0010-\u001a\u0004\u0018\u00010.HÖ\u0003J\t\u0010/\u001a\u00020\u0003HÖ\u0001J\t\u00100\u001a\u000201HÖ\u0001J\u0016\u00102\u001a\u0002032\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0019R\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001a\u0010\u001bR\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\n\u0010\u001dR!\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 ¨\u00067"}, m90084d2 = {"Lcom/kubi/kumex/data/platform/model/FuturesWelfareComposeEntity;", "Landroid/os/Parcelable;", "currentPage", "", "pageSize", "totalNum", "totalPage", "activateNum", "latestRewardTime", "", "isSupportDiscount", "", FirebaseAnalytics.Param.ITEMS, "Ljava/util/ArrayList;", "Lcom/kubi/kumex/data/platform/model/FuturesWelfareComposeItemEntity;", "Lkotlin/collections/ArrayList;", "<init>", "(IIIIILjava/lang/Long;Ljava/lang/Boolean;Ljava/util/ArrayList;)V", "getCurrentPage", "()I", "getPageSize", "getTotalNum", "getTotalPage", "getActivateNum", "setActivateNum", "(I)V", "getLatestRewardTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getItems", "()Ljava/util/ArrayList;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(IIIIILjava/lang/Long;Ljava/lang/Boolean;Ljava/util/ArrayList;)Lcom/kubi/kumex/data/platform/model/FuturesWelfareComposeEntity;", "describeContents", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class FuturesWelfareComposeEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<FuturesWelfareComposeEntity> CREATOR = new C15801a();
    private int activateNum;
    private final int currentPage;

    @Nullable
    private final Boolean isSupportDiscount;

    @NotNull
    private final ArrayList<FuturesWelfareComposeItemEntity> items;

    @Nullable
    private final Long latestRewardTime;
    private final int pageSize;
    private final int totalNum;
    private final int totalPage;

    /* JADX INFO: renamed from: com.kubi.kumex.data.platform.model.FuturesWelfareComposeEntity$a */
    /* JADX INFO: compiled from: FuturesWelfareEntity.kt */
    /* JADX INFO: loaded from: classes20.dex */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C15801a implements Parcelable.Creator<FuturesWelfareComposeEntity> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final FuturesWelfareComposeEntity createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i11 = parcel.readInt();
            int i12 = parcel.readInt();
            int i13 = parcel.readInt();
            int i14 = parcel.readInt();
            int i15 = parcel.readInt();
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Boolean boolValueOf = parcel.readInt() != 0 ? Boolean.valueOf(parcel.readInt() != 0) : null;
            int i16 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i16);
            for (int i17 = 0; i17 != i16; i17++) {
                arrayList.add(FuturesWelfareComposeItemEntity.CREATOR.createFromParcel(parcel));
            }
            return new FuturesWelfareComposeEntity(i11, i12, i13, i14, i15, lValueOf, boolValueOf, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final FuturesWelfareComposeEntity[] newArray(int i11) {
            return new FuturesWelfareComposeEntity[i11];
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
        if (!(other instanceof FuturesWelfareComposeEntity)) {
            return false;
        }
        FuturesWelfareComposeEntity futuresWelfareComposeEntity = (FuturesWelfareComposeEntity) other;
        return this.currentPage == futuresWelfareComposeEntity.currentPage && this.pageSize == futuresWelfareComposeEntity.pageSize && this.totalNum == futuresWelfareComposeEntity.totalNum && this.totalPage == futuresWelfareComposeEntity.totalPage && this.activateNum == futuresWelfareComposeEntity.activateNum && Intrinsics.areEqual(this.latestRewardTime, futuresWelfareComposeEntity.latestRewardTime) && Intrinsics.areEqual(this.isSupportDiscount, futuresWelfareComposeEntity.isSupportDiscount) && Intrinsics.areEqual(this.items, futuresWelfareComposeEntity.items);
    }

    public FuturesWelfareComposeEntity(int i11, int i12, int i13, int i14, int i15, @Nullable Long l11, @Nullable Boolean bool, @NotNull ArrayList<FuturesWelfareComposeItemEntity> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.currentPage = i11;
        this.pageSize = i12;
        this.totalNum = i13;
        this.totalPage = i14;
        this.activateNum = i15;
        this.latestRewardTime = l11;
        this.isSupportDiscount = bool;
        this.items = items;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FuturesWelfareComposeEntity copy$default(FuturesWelfareComposeEntity futuresWelfareComposeEntity, int i11, int i12, int i13, int i14, int i15, Long l11, Boolean bool, ArrayList arrayList, int i16, Object obj) {
        if ((i16 & 1) != 0) {
            i11 = futuresWelfareComposeEntity.currentPage;
        }
        if ((i16 & 2) != 0) {
            i12 = futuresWelfareComposeEntity.pageSize;
        }
        if ((i16 & 4) != 0) {
            i13 = futuresWelfareComposeEntity.totalNum;
        }
        if ((i16 & 8) != 0) {
            i14 = futuresWelfareComposeEntity.totalPage;
        }
        if ((i16 & 16) != 0) {
            i15 = futuresWelfareComposeEntity.activateNum;
        }
        if ((i16 & 32) != 0) {
            l11 = futuresWelfareComposeEntity.latestRewardTime;
        }
        if ((i16 & 64) != 0) {
            bool = futuresWelfareComposeEntity.isSupportDiscount;
        }
        if ((i16 & 128) != 0) {
            arrayList = futuresWelfareComposeEntity.items;
        }
        Boolean bool2 = bool;
        ArrayList arrayList2 = arrayList;
        int i17 = i15;
        Long l12 = l11;
        return futuresWelfareComposeEntity.copy(i11, i12, i13, i14, i17, l12, bool2, arrayList2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getCurrentPage() {
        return this.currentPage;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getPageSize() {
        return this.pageSize;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getTotalNum() {
        return this.totalNum;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getTotalPage() {
        return this.totalPage;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getActivateNum() {
        return this.activateNum;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Long getLatestRewardTime() {
        return this.latestRewardTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Boolean getIsSupportDiscount() {
        return this.isSupportDiscount;
    }

    @NotNull
    public final ArrayList<FuturesWelfareComposeItemEntity> component8() {
        return this.items;
    }

    @NotNull
    public final FuturesWelfareComposeEntity copy(int currentPage, int pageSize, int totalNum, int totalPage, int activateNum, @Nullable Long latestRewardTime, @Nullable Boolean isSupportDiscount, @NotNull ArrayList<FuturesWelfareComposeItemEntity> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        return new FuturesWelfareComposeEntity(currentPage, pageSize, totalNum, totalPage, activateNum, latestRewardTime, isSupportDiscount, items);
    }

    public final int getActivateNum() {
        return this.activateNum;
    }

    public final int getCurrentPage() {
        return this.currentPage;
    }

    @NotNull
    public final ArrayList<FuturesWelfareComposeItemEntity> getItems() {
        return this.items;
    }

    @Nullable
    public final Long getLatestRewardTime() {
        return this.latestRewardTime;
    }

    public final int getPageSize() {
        return this.pageSize;
    }

    public final int getTotalNum() {
        return this.totalNum;
    }

    public final int getTotalPage() {
        return this.totalPage;
    }

    public int hashCode() {
        int iHashCode = ((((((((Integer.hashCode(this.currentPage) * 31) + Integer.hashCode(this.pageSize)) * 31) + Integer.hashCode(this.totalNum)) * 31) + Integer.hashCode(this.totalPage)) * 31) + Integer.hashCode(this.activateNum)) * 31;
        Long l11 = this.latestRewardTime;
        int iHashCode2 = (iHashCode + (l11 == null ? 0 : l11.hashCode())) * 31;
        Boolean bool = this.isSupportDiscount;
        return ((iHashCode2 + (bool != null ? bool.hashCode() : 0)) * 31) + this.items.hashCode();
    }

    @Nullable
    public final Boolean isSupportDiscount() {
        return this.isSupportDiscount;
    }

    public final void setActivateNum(int i11) {
        this.activateNum = i11;
    }

    @NotNull
    public String toString() {
        return "FuturesWelfareComposeEntity(currentPage=" + this.currentPage + ", pageSize=" + this.pageSize + ", totalNum=" + this.totalNum + ", totalPage=" + this.totalPage + ", activateNum=" + this.activateNum + ", latestRewardTime=" + this.latestRewardTime + ", isSupportDiscount=" + this.isSupportDiscount + ", items=" + this.items + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.currentPage);
        dest.writeInt(this.pageSize);
        dest.writeInt(this.totalNum);
        dest.writeInt(this.totalPage);
        dest.writeInt(this.activateNum);
        Long l11 = this.latestRewardTime;
        if (l11 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l11.longValue());
        }
        Boolean bool = this.isSupportDiscount;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool.booleanValue() ? 1 : 0);
        }
        ArrayList<FuturesWelfareComposeItemEntity> arrayList = this.items;
        dest.writeInt(arrayList.size());
        Iterator<FuturesWelfareComposeItemEntity> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(dest, flags);
        }
    }
}
