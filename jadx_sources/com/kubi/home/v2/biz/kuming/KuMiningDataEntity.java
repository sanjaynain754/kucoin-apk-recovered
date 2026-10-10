package com.kubi.home.v2.biz.kuming;

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

/* JADX INFO: compiled from: KuMiningDataEntity.kt */
/* JADX INFO: loaded from: classes15.dex */
@Keep
@Metadata(m90083d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\t\u001a\u00020\nJ\u0011\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\f\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\r\u001a\u00020\u000eJ\u0013\u0010\u000f\u001a\u00020\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eR\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u001a"}, m90084d2 = {"Lcom/kubi/home/v2/biz/kuming/KuMiningDataEntity;", "Landroid/os/Parcelable;", "miningProfits", "", "Lcom/kubi/home/v2/biz/kuming/KuMiningItemEntity;", "<init>", "(Ljava/util/List;)V", "getMiningProfits", "()Ljava/util/List;", "isEmpty", "", "component1", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class KuMiningDataEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<KuMiningDataEntity> CREATOR = new C14966a();

    @Nullable
    private final List<KuMiningItemEntity> miningProfits;

    /* JADX INFO: renamed from: com.kubi.home.v2.biz.kuming.KuMiningDataEntity$a */
    /* JADX INFO: compiled from: KuMiningDataEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C14966a implements Parcelable.Creator<KuMiningDataEntity> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final KuMiningDataEntity createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i11 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i11);
                for (int i12 = 0; i12 != i11; i12++) {
                    arrayList2.add(KuMiningItemEntity.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new KuMiningDataEntity(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final KuMiningDataEntity[] newArray(int i11) {
            return new KuMiningDataEntity[i11];
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
        return (other instanceof KuMiningDataEntity) && Intrinsics.areEqual(this.miningProfits, ((KuMiningDataEntity) other).miningProfits);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ KuMiningDataEntity copy$default(KuMiningDataEntity kuMiningDataEntity, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = kuMiningDataEntity.miningProfits;
        }
        return kuMiningDataEntity.copy(list);
    }

    @Nullable
    public final List<KuMiningItemEntity> component1() {
        return this.miningProfits;
    }

    @NotNull
    public final KuMiningDataEntity copy(@Nullable List<KuMiningItemEntity> miningProfits) {
        return new KuMiningDataEntity(miningProfits);
    }

    @Nullable
    public final List<KuMiningItemEntity> getMiningProfits() {
        return this.miningProfits;
    }

    public int hashCode() {
        List<KuMiningItemEntity> list = this.miningProfits;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final boolean isEmpty() {
        List<KuMiningItemEntity> list = this.miningProfits;
        return list == null || list.isEmpty();
    }

    @NotNull
    public String toString() {
        return "KuMiningDataEntity(miningProfits=" + this.miningProfits + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        List<KuMiningItemEntity> list = this.miningProfits;
        if (list == null) {
            dest.writeInt(0);
            return;
        }
        dest.writeInt(1);
        dest.writeInt(list.size());
        Iterator<KuMiningItemEntity> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(dest, flags);
        }
    }

    public KuMiningDataEntity(@Nullable List<KuMiningItemEntity> list) {
        this.miningProfits = list;
    }
}
