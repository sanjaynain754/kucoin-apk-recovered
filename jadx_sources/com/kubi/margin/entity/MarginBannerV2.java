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
@Metadata(m90083d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0006\u0010\u0010\u001a\u00020\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0011R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001e"}, m90084d2 = {"Lcom/kubi/margin/entity/MarginBannerV2;", "Landroid/os/Parcelable;", "bannerList", "", "Lcom/kubi/margin/entity/MarginBanner;", "isolatedIncomeBannerResp", "Lcom/kubi/margin/entity/IsolatedIncomeBannerResp;", "<init>", "(Ljava/util/List;Lcom/kubi/margin/entity/IsolatedIncomeBannerResp;)V", "getBannerList", "()Ljava/util/List;", "getIsolatedIncomeBannerResp", "()Lcom/kubi/margin/entity/IsolatedIncomeBannerResp;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class MarginBannerV2 implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<MarginBannerV2> CREATOR = new C17625a();

    @Nullable
    private final List<MarginBanner> bannerList;

    @Nullable
    private final IsolatedIncomeBannerResp isolatedIncomeBannerResp;

    /* JADX INFO: renamed from: com.kubi.margin.entity.MarginBannerV2$a */
    /* JADX INFO: compiled from: LeverBean.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C17625a implements Parcelable.Creator<MarginBannerV2> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MarginBannerV2 createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i11 = parcel.readInt();
                arrayList = new ArrayList(i11);
                for (int i12 = 0; i12 != i11; i12++) {
                    arrayList.add(MarginBanner.CREATOR.createFromParcel(parcel));
                }
            }
            return new MarginBannerV2(arrayList, parcel.readInt() != 0 ? IsolatedIncomeBannerResp.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final MarginBannerV2[] newArray(int i11) {
            return new MarginBannerV2[i11];
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
        if (!(other instanceof MarginBannerV2)) {
            return false;
        }
        MarginBannerV2 marginBannerV2 = (MarginBannerV2) other;
        return Intrinsics.areEqual(this.bannerList, marginBannerV2.bannerList) && Intrinsics.areEqual(this.isolatedIncomeBannerResp, marginBannerV2.isolatedIncomeBannerResp);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MarginBannerV2 copy$default(MarginBannerV2 marginBannerV2, List list, IsolatedIncomeBannerResp isolatedIncomeBannerResp, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = marginBannerV2.bannerList;
        }
        if ((i11 & 2) != 0) {
            isolatedIncomeBannerResp = marginBannerV2.isolatedIncomeBannerResp;
        }
        return marginBannerV2.copy(list, isolatedIncomeBannerResp);
    }

    @Nullable
    public final List<MarginBanner> component1() {
        return this.bannerList;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final IsolatedIncomeBannerResp getIsolatedIncomeBannerResp() {
        return this.isolatedIncomeBannerResp;
    }

    @NotNull
    public final MarginBannerV2 copy(@Nullable List<MarginBanner> bannerList, @Nullable IsolatedIncomeBannerResp isolatedIncomeBannerResp) {
        return new MarginBannerV2(bannerList, isolatedIncomeBannerResp);
    }

    @Nullable
    public final List<MarginBanner> getBannerList() {
        return this.bannerList;
    }

    @Nullable
    public final IsolatedIncomeBannerResp getIsolatedIncomeBannerResp() {
        return this.isolatedIncomeBannerResp;
    }

    public int hashCode() {
        List<MarginBanner> list = this.bannerList;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        IsolatedIncomeBannerResp isolatedIncomeBannerResp = this.isolatedIncomeBannerResp;
        return iHashCode + (isolatedIncomeBannerResp != null ? isolatedIncomeBannerResp.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "MarginBannerV2(bannerList=" + this.bannerList + ", isolatedIncomeBannerResp=" + this.isolatedIncomeBannerResp + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        List<MarginBanner> list = this.bannerList;
        if (list == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(list.size());
            Iterator<MarginBanner> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(dest, flags);
            }
        }
        IsolatedIncomeBannerResp isolatedIncomeBannerResp = this.isolatedIncomeBannerResp;
        if (isolatedIncomeBannerResp == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            isolatedIncomeBannerResp.writeToParcel(dest, flags);
        }
    }

    public MarginBannerV2(@Nullable List<MarginBanner> list, @Nullable IsolatedIncomeBannerResp isolatedIncomeBannerResp) {
        this.bannerList = list;
        this.isolatedIncomeBannerResp = isolatedIncomeBannerResp;
    }
}
