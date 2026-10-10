package com.kubi.sdk.pkg.hybird;

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

/* JADX INFO: compiled from: OfflinePkgInfo.kt */
/* JADX INFO: loaded from: classes12.dex */
@Keep
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0015\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\b\u001a\u00020\tHÖ\u0001J\u0019\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tHÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/sdk/pkg/hybird/OfflinePkgInfoMemento;", "Landroid/os/Parcelable;", "packages", "", "Lcom/kubi/sdk/pkg/hybird/OfflinePkgInfo;", "(Ljava/util/List;)V", "getPackages", "()Ljava/util/List;", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Package_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class OfflinePkgInfoMemento implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<OfflinePkgInfoMemento> CREATOR = new C23968a();

    @Nullable
    private final List<OfflinePkgInfo> packages;

    /* JADX INFO: renamed from: com.kubi.sdk.pkg.hybird.OfflinePkgInfoMemento$a */
    /* JADX INFO: compiled from: OfflinePkgInfo.kt */
    /* JADX INFO: loaded from: classes41.dex */
    @Metadata(m90085k = 3, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class C23968a implements Parcelable.Creator<OfflinePkgInfoMemento> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final OfflinePkgInfoMemento createFromParcel(@NotNull Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i11 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i11);
                for (int i12 = 0; i12 != i11; i12++) {
                    arrayList2.add(parcel.readParcelable(OfflinePkgInfoMemento.class.getClassLoader()));
                }
                arrayList = arrayList2;
            }
            return new OfflinePkgInfoMemento(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final OfflinePkgInfoMemento[] newArray(int i11) {
            return new OfflinePkgInfoMemento[i11];
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Nullable
    public final List<OfflinePkgInfo> getPackages() {
        return this.packages;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        List<OfflinePkgInfo> list = this.packages;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list.size());
        Iterator<OfflinePkgInfo> it = list.iterator();
        while (it.hasNext()) {
            parcel.writeParcelable(it.next(), flags);
        }
    }

    public OfflinePkgInfoMemento(@Nullable List<OfflinePkgInfo> list) {
        this.packages = list;
    }
}
