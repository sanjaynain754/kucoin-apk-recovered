package com.kubi.kumex.data.platform.model;

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

/* JADX INFO: compiled from: ModifyMarginModeResultEntity.kt */
/* JADX INFO: loaded from: classes20.dex */
@Keep
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J%\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0006\u0010\u0010\u001a\u00020\u0003J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001d"}, m90084d2 = {"Lcom/kubi/kumex/data/platform/model/SwitchFailedAggregationInfo;", "Landroid/os/Parcelable;", "totalCountsNum", "", "aggregationErrors", "", "Lcom/kubi/kumex/data/platform/model/ModifyMarginModeErrorAggregationModel;", "<init>", "(ILjava/util/List;)V", "getTotalCountsNum", "()I", "getAggregationErrors", "()Ljava/util/List;", "component1", "component2", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "KumexApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class SwitchFailedAggregationInfo implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<SwitchFailedAggregationInfo> CREATOR = new C15824a();

    @Nullable
    private final List<ModifyMarginModeErrorAggregationModel> aggregationErrors;
    private final int totalCountsNum;

    /* JADX INFO: renamed from: com.kubi.kumex.data.platform.model.SwitchFailedAggregationInfo$a */
    /* JADX INFO: compiled from: ModifyMarginModeResultEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C15824a implements Parcelable.Creator<SwitchFailedAggregationInfo> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SwitchFailedAggregationInfo createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i11 = parcel.readInt();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i12);
                for (int i13 = 0; i13 != i12; i13++) {
                    arrayList2.add(ModifyMarginModeErrorAggregationModel.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new SwitchFailedAggregationInfo(i11, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final SwitchFailedAggregationInfo[] newArray(int i11) {
            return new SwitchFailedAggregationInfo[i11];
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
        if (!(other instanceof SwitchFailedAggregationInfo)) {
            return false;
        }
        SwitchFailedAggregationInfo switchFailedAggregationInfo = (SwitchFailedAggregationInfo) other;
        return this.totalCountsNum == switchFailedAggregationInfo.totalCountsNum && Intrinsics.areEqual(this.aggregationErrors, switchFailedAggregationInfo.aggregationErrors);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SwitchFailedAggregationInfo copy$default(SwitchFailedAggregationInfo switchFailedAggregationInfo, int i11, List list, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = switchFailedAggregationInfo.totalCountsNum;
        }
        if ((i12 & 2) != 0) {
            list = switchFailedAggregationInfo.aggregationErrors;
        }
        return switchFailedAggregationInfo.copy(i11, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getTotalCountsNum() {
        return this.totalCountsNum;
    }

    @Nullable
    public final List<ModifyMarginModeErrorAggregationModel> component2() {
        return this.aggregationErrors;
    }

    @NotNull
    public final SwitchFailedAggregationInfo copy(int totalCountsNum, @Nullable List<ModifyMarginModeErrorAggregationModel> aggregationErrors) {
        return new SwitchFailedAggregationInfo(totalCountsNum, aggregationErrors);
    }

    @Nullable
    public final List<ModifyMarginModeErrorAggregationModel> getAggregationErrors() {
        return this.aggregationErrors;
    }

    public final int getTotalCountsNum() {
        return this.totalCountsNum;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.totalCountsNum) * 31;
        List<ModifyMarginModeErrorAggregationModel> list = this.aggregationErrors;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    @NotNull
    public String toString() {
        return "SwitchFailedAggregationInfo(totalCountsNum=" + this.totalCountsNum + ", aggregationErrors=" + this.aggregationErrors + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.totalCountsNum);
        List<ModifyMarginModeErrorAggregationModel> list = this.aggregationErrors;
        if (list == null) {
            dest.writeInt(0);
            return;
        }
        dest.writeInt(1);
        dest.writeInt(list.size());
        Iterator<ModifyMarginModeErrorAggregationModel> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(dest, flags);
        }
    }

    public SwitchFailedAggregationInfo(int i11, @Nullable List<ModifyMarginModeErrorAggregationModel> list) {
        this.totalCountsNum = i11;
        this.aggregationErrors = list;
    }
}
