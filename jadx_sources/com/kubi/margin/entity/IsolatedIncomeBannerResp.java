package com.kubi.margin.entity;

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

/* JADX INFO: compiled from: LeverBean.kt */
/* JADX INFO: loaded from: classes27.dex */
@Keep
@Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J3\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0001J\u0006\u0010\u0013\u001a\u00020\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0014HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0014R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006 "}, m90084d2 = {"Lcom/kubi/margin/entity/IsolatedIncomeBannerResp;", "Landroid/os/Parcelable;", "bannerId", "", "closeKeepDay", "itemList", "", "Lcom/kubi/margin/entity/IsolatedIncomeBanner;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getBannerId", "()Ljava/lang/String;", "getCloseKeepDay", "getItemList", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class IsolatedIncomeBannerResp implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<IsolatedIncomeBannerResp> CREATOR = new C17617a();

    @Nullable
    private final String bannerId;

    @Nullable
    private final String closeKeepDay;

    @Nullable
    private final List<IsolatedIncomeBanner> itemList;

    /* JADX INFO: renamed from: com.kubi.margin.entity.IsolatedIncomeBannerResp$a */
    /* JADX INFO: compiled from: LeverBean.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C17617a implements Parcelable.Creator<IsolatedIncomeBannerResp> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IsolatedIncomeBannerResp createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i11 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i11);
                for (int i12 = 0; i12 != i11; i12++) {
                    arrayList2.add(IsolatedIncomeBanner.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new IsolatedIncomeBannerResp(string, string2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final IsolatedIncomeBannerResp[] newArray(int i11) {
            return new IsolatedIncomeBannerResp[i11];
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
        if (!(other instanceof IsolatedIncomeBannerResp)) {
            return false;
        }
        IsolatedIncomeBannerResp isolatedIncomeBannerResp = (IsolatedIncomeBannerResp) other;
        return Intrinsics.areEqual(this.bannerId, isolatedIncomeBannerResp.bannerId) && Intrinsics.areEqual(this.closeKeepDay, isolatedIncomeBannerResp.closeKeepDay) && Intrinsics.areEqual(this.itemList, isolatedIncomeBannerResp.itemList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ IsolatedIncomeBannerResp copy$default(IsolatedIncomeBannerResp isolatedIncomeBannerResp, String str, String str2, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = isolatedIncomeBannerResp.bannerId;
        }
        if ((i11 & 2) != 0) {
            str2 = isolatedIncomeBannerResp.closeKeepDay;
        }
        if ((i11 & 4) != 0) {
            list = isolatedIncomeBannerResp.itemList;
        }
        return isolatedIncomeBannerResp.copy(str, str2, list);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getBannerId() {
        return this.bannerId;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCloseKeepDay() {
        return this.closeKeepDay;
    }

    @Nullable
    public final List<IsolatedIncomeBanner> component3() {
        return this.itemList;
    }

    @NotNull
    public final IsolatedIncomeBannerResp copy(@Nullable String bannerId, @Nullable String closeKeepDay, @Nullable List<IsolatedIncomeBanner> itemList) {
        return new IsolatedIncomeBannerResp(bannerId, closeKeepDay, itemList);
    }

    @Nullable
    public final String getBannerId() {
        return this.bannerId;
    }

    @Nullable
    public final String getCloseKeepDay() {
        return this.closeKeepDay;
    }

    @Nullable
    public final List<IsolatedIncomeBanner> getItemList() {
        return this.itemList;
    }

    public int hashCode() {
        String str = this.bannerId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.closeKeepDay;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<IsolatedIncomeBanner> list = this.itemList;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "IsolatedIncomeBannerResp(bannerId=" + this.bannerId + ", closeKeepDay=" + this.closeKeepDay + ", itemList=" + this.itemList + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.bannerId);
        dest.writeString(this.closeKeepDay);
        List<IsolatedIncomeBanner> list = this.itemList;
        if (list == null) {
            dest.writeInt(0);
            return;
        }
        dest.writeInt(1);
        dest.writeInt(list.size());
        Iterator<IsolatedIncomeBanner> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(dest, flags);
        }
    }

    public IsolatedIncomeBannerResp(@Nullable String str, @Nullable String str2, @Nullable List<IsolatedIncomeBanner> list) {
        this.bannerId = str;
        this.closeKeepDay = str2;
        this.itemList = list;
    }
}
