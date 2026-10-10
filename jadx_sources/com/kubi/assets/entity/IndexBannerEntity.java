package com.kubi.assets.entity;

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

/* JADX INFO: compiled from: BannerEntity.kt */
/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\n\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u000b\u001a\u00020\fJ\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\fHÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\u0016\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\fR\u001e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0019"}, m90084d2 = {"Lcom/kubi/assets/entity/IndexBannerEntity;", "Landroid/os/Parcelable;", "mobileIndexBanner", "", "Lcom/kubi/assets/entity/BannerEntity;", "<init>", "(Ljava/util/List;)V", "getMobileIndexBanner", "()Ljava/util/List;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "AssetsCenterApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class IndexBannerEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<IndexBannerEntity> CREATOR = new Creator();

    @SerializedName("mobile-index-banner")
    @Nullable
    private final List<BannerEntity> mobileIndexBanner;

    /* JADX INFO: compiled from: BannerEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<IndexBannerEntity> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final IndexBannerEntity createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i11 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i11);
                for (int i12 = 0; i12 != i11; i12++) {
                    arrayList2.add(BannerEntity.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new IndexBannerEntity(arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final IndexBannerEntity[] newArray(int i11) {
            return new IndexBannerEntity[i11];
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
        return (other instanceof IndexBannerEntity) && Intrinsics.areEqual(this.mobileIndexBanner, ((IndexBannerEntity) other).mobileIndexBanner);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ IndexBannerEntity copy$default(IndexBannerEntity indexBannerEntity, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = indexBannerEntity.mobileIndexBanner;
        }
        return indexBannerEntity.copy(list);
    }

    @Nullable
    public final List<BannerEntity> component1() {
        return this.mobileIndexBanner;
    }

    @NotNull
    public final IndexBannerEntity copy(@Nullable List<BannerEntity> mobileIndexBanner) {
        return new IndexBannerEntity(mobileIndexBanner);
    }

    @Nullable
    public final List<BannerEntity> getMobileIndexBanner() {
        return this.mobileIndexBanner;
    }

    public int hashCode() {
        List<BannerEntity> list = this.mobileIndexBanner;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    @NotNull
    public String toString() {
        return "IndexBannerEntity(mobileIndexBanner=" + this.mobileIndexBanner + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        List<BannerEntity> list = this.mobileIndexBanner;
        if (list == null) {
            dest.writeInt(0);
            return;
        }
        dest.writeInt(1);
        dest.writeInt(list.size());
        Iterator<BannerEntity> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(dest, flags);
        }
    }

    public IndexBannerEntity(@Nullable List<BannerEntity> list) {
        this.mobileIndexBanner = list;
    }
}
