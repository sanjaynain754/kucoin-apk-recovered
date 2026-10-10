package com.kubi.kumex.data.platform.model;

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

/* JADX INFO: compiled from: FuturesWelfareEntity.kt */
/* JADX INFO: loaded from: classes20.dex */
@Keep
@Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003JC\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0001J\u0006\u0010\u0019\u001a\u00020\u0003J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\u0016\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006&"}, m90084d2 = {"Lcom/kubi/kumex/data/platform/model/FuturesWelfareCouponEntity;", "Landroid/os/Parcelable;", "currentPage", "", "pageSize", "totalNum", "totalPage", FirebaseAnalytics.Param.ITEMS, "", "Lcom/kubi/kumex/data/platform/model/FuturesWelfareCouponItemEntity;", "<init>", "(IIIILjava/util/List;)V", "getCurrentPage", "()I", "getPageSize", "getTotalNum", "getTotalPage", "getItems", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class FuturesWelfareCouponEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<FuturesWelfareCouponEntity> CREATOR = new C15804a();
    private final int currentPage;

    @Nullable
    private final List<FuturesWelfareCouponItemEntity> items;
    private final int pageSize;
    private final int totalNum;
    private final int totalPage;

    /* JADX INFO: renamed from: com.kubi.kumex.data.platform.model.FuturesWelfareCouponEntity$a */
    /* JADX INFO: compiled from: FuturesWelfareEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C15804a implements Parcelable.Creator<FuturesWelfareCouponEntity> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final FuturesWelfareCouponEntity createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i11 = parcel.readInt();
            int i12 = parcel.readInt();
            int i13 = parcel.readInt();
            int i14 = parcel.readInt();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i15 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i15);
                for (int i16 = 0; i16 != i15; i16++) {
                    arrayList2.add(FuturesWelfareCouponItemEntity.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new FuturesWelfareCouponEntity(i11, i12, i13, i14, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final FuturesWelfareCouponEntity[] newArray(int i11) {
            return new FuturesWelfareCouponEntity[i11];
        }
    }

    public FuturesWelfareCouponEntity() {
        this(0, 0, 0, 0, null, 31, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FuturesWelfareCouponEntity)) {
            return false;
        }
        FuturesWelfareCouponEntity futuresWelfareCouponEntity = (FuturesWelfareCouponEntity) other;
        return this.currentPage == futuresWelfareCouponEntity.currentPage && this.pageSize == futuresWelfareCouponEntity.pageSize && this.totalNum == futuresWelfareCouponEntity.totalNum && this.totalPage == futuresWelfareCouponEntity.totalPage && Intrinsics.areEqual(this.items, futuresWelfareCouponEntity.items);
    }

    public FuturesWelfareCouponEntity(int i11, int i12, int i13, int i14, @Nullable List<FuturesWelfareCouponItemEntity> list) {
        this.currentPage = i11;
        this.pageSize = i12;
        this.totalNum = i13;
        this.totalPage = i14;
        this.items = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FuturesWelfareCouponEntity copy$default(FuturesWelfareCouponEntity futuresWelfareCouponEntity, int i11, int i12, int i13, int i14, List list, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            i11 = futuresWelfareCouponEntity.currentPage;
        }
        if ((i15 & 2) != 0) {
            i12 = futuresWelfareCouponEntity.pageSize;
        }
        if ((i15 & 4) != 0) {
            i13 = futuresWelfareCouponEntity.totalNum;
        }
        if ((i15 & 8) != 0) {
            i14 = futuresWelfareCouponEntity.totalPage;
        }
        if ((i15 & 16) != 0) {
            list = futuresWelfareCouponEntity.items;
        }
        List list2 = list;
        int i16 = i13;
        return futuresWelfareCouponEntity.copy(i11, i12, i16, i14, list2);
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

    @Nullable
    public final List<FuturesWelfareCouponItemEntity> component5() {
        return this.items;
    }

    @NotNull
    public final FuturesWelfareCouponEntity copy(int currentPage, int pageSize, int totalNum, int totalPage, @Nullable List<FuturesWelfareCouponItemEntity> items) {
        return new FuturesWelfareCouponEntity(currentPage, pageSize, totalNum, totalPage, items);
    }

    public final int getCurrentPage() {
        return this.currentPage;
    }

    @Nullable
    public final List<FuturesWelfareCouponItemEntity> getItems() {
        return this.items;
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
        int iHashCode = ((((((Integer.hashCode(this.currentPage) * 31) + Integer.hashCode(this.pageSize)) * 31) + Integer.hashCode(this.totalNum)) * 31) + Integer.hashCode(this.totalPage)) * 31;
        List<FuturesWelfareCouponItemEntity> list = this.items;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    @NotNull
    public String toString() {
        return "FuturesWelfareCouponEntity(currentPage=" + this.currentPage + ", pageSize=" + this.pageSize + ", totalNum=" + this.totalNum + ", totalPage=" + this.totalPage + ", items=" + this.items + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.currentPage);
        dest.writeInt(this.pageSize);
        dest.writeInt(this.totalNum);
        dest.writeInt(this.totalPage);
        List<FuturesWelfareCouponItemEntity> list = this.items;
        if (list == null) {
            dest.writeInt(0);
            return;
        }
        dest.writeInt(1);
        dest.writeInt(list.size());
        Iterator<FuturesWelfareCouponItemEntity> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(dest, flags);
        }
    }

    public /* synthetic */ FuturesWelfareCouponEntity(int i11, int i12, int i13, int i14, List list, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        this((i15 & 1) != 0 ? 0 : i11, (i15 & 2) != 0 ? 0 : i12, (i15 & 4) != 0 ? 0 : i13, (i15 & 8) != 0 ? 0 : i14, (i15 & 16) != 0 ? null : list);
    }
}
