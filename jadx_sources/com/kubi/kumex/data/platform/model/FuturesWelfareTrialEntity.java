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
@Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003JW\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0001J\u0006\u0010\u001f\u001a\u00020\u0003J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010$\u001a\u00020\u0003HÖ\u0001J\t\u0010%\u001a\u00020&HÖ\u0001J\u0016\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006,"}, m90084d2 = {"Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialEntity;", "Landroid/os/Parcelable;", "activateNum", "", "availableNum", "currentPage", "pageSize", "totalNum", "totalPage", FirebaseAnalytics.Param.ITEMS, "", "Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialItemEntity;", "<init>", "(IIIIIILjava/util/List;)V", "getActivateNum", "()I", "getAvailableNum", "getCurrentPage", "getPageSize", "getTotalNum", "getTotalPage", "getItems", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class FuturesWelfareTrialEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<FuturesWelfareTrialEntity> CREATOR = new C15806a();
    private final int activateNum;
    private final int availableNum;
    private final int currentPage;

    @Nullable
    private final List<FuturesWelfareTrialItemEntity> items;
    private final int pageSize;
    private final int totalNum;
    private final int totalPage;

    /* JADX INFO: renamed from: com.kubi.kumex.data.platform.model.FuturesWelfareTrialEntity$a */
    /* JADX INFO: compiled from: FuturesWelfareEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C15806a implements Parcelable.Creator<FuturesWelfareTrialEntity> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final FuturesWelfareTrialEntity createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i11 = parcel.readInt();
            int i12 = parcel.readInt();
            int i13 = parcel.readInt();
            int i14 = parcel.readInt();
            int i15 = parcel.readInt();
            int i16 = parcel.readInt();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i17 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i17);
                for (int i18 = 0; i18 != i17; i18++) {
                    arrayList2.add(FuturesWelfareTrialItemEntity.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new FuturesWelfareTrialEntity(i11, i12, i13, i14, i15, i16, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final FuturesWelfareTrialEntity[] newArray(int i11) {
            return new FuturesWelfareTrialEntity[i11];
        }
    }

    public FuturesWelfareTrialEntity() {
        this(0, 0, 0, 0, 0, 0, null, 127, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FuturesWelfareTrialEntity)) {
            return false;
        }
        FuturesWelfareTrialEntity futuresWelfareTrialEntity = (FuturesWelfareTrialEntity) other;
        return this.activateNum == futuresWelfareTrialEntity.activateNum && this.availableNum == futuresWelfareTrialEntity.availableNum && this.currentPage == futuresWelfareTrialEntity.currentPage && this.pageSize == futuresWelfareTrialEntity.pageSize && this.totalNum == futuresWelfareTrialEntity.totalNum && this.totalPage == futuresWelfareTrialEntity.totalPage && Intrinsics.areEqual(this.items, futuresWelfareTrialEntity.items);
    }

    public FuturesWelfareTrialEntity(int i11, int i12, int i13, int i14, int i15, int i16, @Nullable List<FuturesWelfareTrialItemEntity> list) {
        this.activateNum = i11;
        this.availableNum = i12;
        this.currentPage = i13;
        this.pageSize = i14;
        this.totalNum = i15;
        this.totalPage = i16;
        this.items = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FuturesWelfareTrialEntity copy$default(FuturesWelfareTrialEntity futuresWelfareTrialEntity, int i11, int i12, int i13, int i14, int i15, int i16, List list, int i17, Object obj) {
        if ((i17 & 1) != 0) {
            i11 = futuresWelfareTrialEntity.activateNum;
        }
        if ((i17 & 2) != 0) {
            i12 = futuresWelfareTrialEntity.availableNum;
        }
        if ((i17 & 4) != 0) {
            i13 = futuresWelfareTrialEntity.currentPage;
        }
        if ((i17 & 8) != 0) {
            i14 = futuresWelfareTrialEntity.pageSize;
        }
        if ((i17 & 16) != 0) {
            i15 = futuresWelfareTrialEntity.totalNum;
        }
        if ((i17 & 32) != 0) {
            i16 = futuresWelfareTrialEntity.totalPage;
        }
        if ((i17 & 64) != 0) {
            list = futuresWelfareTrialEntity.items;
        }
        int i18 = i16;
        List list2 = list;
        int i19 = i15;
        int i21 = i13;
        return futuresWelfareTrialEntity.copy(i11, i12, i21, i14, i19, i18, list2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getActivateNum() {
        return this.activateNum;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getAvailableNum() {
        return this.availableNum;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getCurrentPage() {
        return this.currentPage;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getPageSize() {
        return this.pageSize;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getTotalNum() {
        return this.totalNum;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getTotalPage() {
        return this.totalPage;
    }

    @Nullable
    public final List<FuturesWelfareTrialItemEntity> component7() {
        return this.items;
    }

    @NotNull
    public final FuturesWelfareTrialEntity copy(int activateNum, int availableNum, int currentPage, int pageSize, int totalNum, int totalPage, @Nullable List<FuturesWelfareTrialItemEntity> items) {
        return new FuturesWelfareTrialEntity(activateNum, availableNum, currentPage, pageSize, totalNum, totalPage, items);
    }

    public final int getActivateNum() {
        return this.activateNum;
    }

    public final int getAvailableNum() {
        return this.availableNum;
    }

    public final int getCurrentPage() {
        return this.currentPage;
    }

    @Nullable
    public final List<FuturesWelfareTrialItemEntity> getItems() {
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
        int iHashCode = ((((((((((Integer.hashCode(this.activateNum) * 31) + Integer.hashCode(this.availableNum)) * 31) + Integer.hashCode(this.currentPage)) * 31) + Integer.hashCode(this.pageSize)) * 31) + Integer.hashCode(this.totalNum)) * 31) + Integer.hashCode(this.totalPage)) * 31;
        List<FuturesWelfareTrialItemEntity> list = this.items;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    @NotNull
    public String toString() {
        return "FuturesWelfareTrialEntity(activateNum=" + this.activateNum + ", availableNum=" + this.availableNum + ", currentPage=" + this.currentPage + ", pageSize=" + this.pageSize + ", totalNum=" + this.totalNum + ", totalPage=" + this.totalPage + ", items=" + this.items + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.activateNum);
        dest.writeInt(this.availableNum);
        dest.writeInt(this.currentPage);
        dest.writeInt(this.pageSize);
        dest.writeInt(this.totalNum);
        dest.writeInt(this.totalPage);
        List<FuturesWelfareTrialItemEntity> list = this.items;
        if (list == null) {
            dest.writeInt(0);
            return;
        }
        dest.writeInt(1);
        dest.writeInt(list.size());
        Iterator<FuturesWelfareTrialItemEntity> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(dest, flags);
        }
    }

    public /* synthetic */ FuturesWelfareTrialEntity(int i11, int i12, int i13, int i14, int i15, int i16, List list, int i17, DefaultConstructorMarker defaultConstructorMarker) {
        this((i17 & 1) != 0 ? 0 : i11, (i17 & 2) != 0 ? 0 : i12, (i17 & 4) != 0 ? 0 : i13, (i17 & 8) != 0 ? 0 : i14, (i17 & 16) != 0 ? 0 : i15, (i17 & 32) != 0 ? 0 : i16, (i17 & 64) != 0 ? null : list);
    }
}
