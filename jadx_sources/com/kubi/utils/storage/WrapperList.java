package com.kubi.utils.storage;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.exifinterface.media.ExifInterface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: WrapperList.kt */
/* JADX INFO: loaded from: classes23.dex */
@Keep
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0002B\u0015\u0012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004HÆ\u0003J\u001f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004HÆ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0019\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bHÖ\u0001R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, m90084d2 = {"Lcom/kubi/utils/storage/WrapperList;", ExifInterface.GPS_DIRECTION_TRUE, "Landroid/os/Parcelable;", "jsonList", "", "(Ljava/util/List;)V", "getJsonList", "()Ljava/util/List;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Utils_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final /* data */ class WrapperList<T extends Parcelable> implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<WrapperList<?>> CREATOR = new C27090a();

    @NotNull
    private final List<T> jsonList;

    /* JADX INFO: renamed from: com.kubi.utils.storage.WrapperList$a */
    /* JADX INFO: compiled from: WrapperList.kt */
    @Metadata(m90085k = 3, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class C27090a implements Parcelable.Creator<WrapperList<?>> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final WrapperList<?>[] newArray(int i11) {
            return new WrapperList[i11];
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final WrapperList<?> createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i11 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i11);
            for (int i12 = 0; i12 != i11; i12++) {
                arrayList.add(parcel.readParcelable(WrapperList.class.getClassLoader()));
            }
            return new WrapperList<>(arrayList);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WrapperList() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof WrapperList) && Intrinsics.areEqual(this.jsonList, ((WrapperList) other).jsonList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WrapperList(@NotNull List<? extends T> jsonList) {
        Intrinsics.checkNotNullParameter(jsonList, "jsonList");
        this.jsonList = jsonList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WrapperList copy$default(WrapperList wrapperList, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = wrapperList.jsonList;
        }
        return wrapperList.copy(list);
    }

    @NotNull
    public final List<T> component1() {
        return this.jsonList;
    }

    @NotNull
    public final WrapperList<T> copy(@NotNull List<? extends T> jsonList) {
        Intrinsics.checkNotNullParameter(jsonList, "jsonList");
        return new WrapperList<>(jsonList);
    }

    @NotNull
    public final List<T> getJsonList() {
        return this.jsonList;
    }

    public int hashCode() {
        return this.jsonList.hashCode();
    }

    @NotNull
    public String toString() {
        return "WrapperList(jsonList=" + this.jsonList + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        List<T> list = this.jsonList;
        parcel.writeInt(list.size());
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            parcel.writeParcelable(it.next(), flags);
        }
    }

    public /* synthetic */ WrapperList(List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? new ArrayList() : list);
    }
}
