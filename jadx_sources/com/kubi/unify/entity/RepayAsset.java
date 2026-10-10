package com.kubi.unify.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: UnifyEntity.kt */
/* JADX INFO: loaded from: classes52.dex */
@Keep
@Metadata(m90083d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003HÆ\u0003J-\u0010\u000e\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0010R\u001e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\n¨\u0006\u001d"}, m90084d2 = {"Lcom/kubi/unify/entity/RepayAsset;", "Landroid/os/Parcelable;", "unifyAssetItemList", "", "Lcom/kubi/unify/entity/UnifyAssetItem;", "unifyLiabilityItemList", "Lcom/kubi/unify/entity/UnifyLiabilityItem;", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "getUnifyAssetItemList", "()Ljava/util/List;", "getUnifyLiabilityItemList", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "BUnifyAccountLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class RepayAsset implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<RepayAsset> CREATOR = new C26512a();

    @SerializedName("assetList")
    @Nullable
    private final List<UnifyAssetItem> unifyAssetItemList;

    @SerializedName("liabilityList")
    @Nullable
    private final List<UnifyLiabilityItem> unifyLiabilityItemList;

    /* JADX INFO: renamed from: com.kubi.unify.entity.RepayAsset$a */
    /* JADX INFO: compiled from: UnifyEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C26512a implements Parcelable.Creator<RepayAsset> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final RepayAsset createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            ArrayList arrayList2 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i11 = parcel.readInt();
                arrayList = new ArrayList(i11);
                for (int i12 = 0; i12 != i11; i12++) {
                    arrayList.add(UnifyAssetItem.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() != 0) {
                int i13 = parcel.readInt();
                arrayList2 = new ArrayList(i13);
                for (int i14 = 0; i14 != i13; i14++) {
                    arrayList2.add(UnifyLiabilityItem.CREATOR.createFromParcel(parcel));
                }
            }
            return new RepayAsset(arrayList, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final RepayAsset[] newArray(int i11) {
            return new RepayAsset[i11];
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
        if (!(other instanceof RepayAsset)) {
            return false;
        }
        RepayAsset repayAsset = (RepayAsset) other;
        return Intrinsics.areEqual(this.unifyAssetItemList, repayAsset.unifyAssetItemList) && Intrinsics.areEqual(this.unifyLiabilityItemList, repayAsset.unifyLiabilityItemList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RepayAsset copy$default(RepayAsset repayAsset, List list, List list2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = repayAsset.unifyAssetItemList;
        }
        if ((i11 & 2) != 0) {
            list2 = repayAsset.unifyLiabilityItemList;
        }
        return repayAsset.copy(list, list2);
    }

    @Nullable
    public final List<UnifyAssetItem> component1() {
        return this.unifyAssetItemList;
    }

    @Nullable
    public final List<UnifyLiabilityItem> component2() {
        return this.unifyLiabilityItemList;
    }

    @NotNull
    public final RepayAsset copy(@Nullable List<UnifyAssetItem> unifyAssetItemList, @Nullable List<UnifyLiabilityItem> unifyLiabilityItemList) {
        return new RepayAsset(unifyAssetItemList, unifyLiabilityItemList);
    }

    @Nullable
    public final List<UnifyAssetItem> getUnifyAssetItemList() {
        return this.unifyAssetItemList;
    }

    @Nullable
    public final List<UnifyLiabilityItem> getUnifyLiabilityItemList() {
        return this.unifyLiabilityItemList;
    }

    public int hashCode() {
        List<UnifyAssetItem> list = this.unifyAssetItemList;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<UnifyLiabilityItem> list2 = this.unifyLiabilityItemList;
        return iHashCode + (list2 != null ? list2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "RepayAsset(unifyAssetItemList=" + this.unifyAssetItemList + ", unifyLiabilityItemList=" + this.unifyLiabilityItemList + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        List<UnifyAssetItem> list = this.unifyAssetItemList;
        if (list == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(list.size());
            Iterator<UnifyAssetItem> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(dest, flags);
            }
        }
        List<UnifyLiabilityItem> list2 = this.unifyLiabilityItemList;
        if (list2 == null) {
            dest.writeInt(0);
            return;
        }
        dest.writeInt(1);
        dest.writeInt(list2.size());
        Iterator<UnifyLiabilityItem> it2 = list2.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(dest, flags);
        }
    }

    public RepayAsset(@Nullable List<UnifyAssetItem> list, @Nullable List<UnifyLiabilityItem> list2) {
        this.unifyAssetItemList = list;
        this.unifyLiabilityItemList = list2;
    }
}
