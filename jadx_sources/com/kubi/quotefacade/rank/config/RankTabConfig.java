package com.kubi.quotefacade.rank.config;

import android.os.Parcel;
import android.os.Parcelable;
import com.kubi.quotefacade.alpha.homerank.AlphaRankFragment;
import com.kubi.quotefacade.favorites.QuoteFavoriteFragment;
import com.kubi.quotefacade.rank.container.RankContainerFragment;
import com.kubi.sdk.BaseFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p025av.C4392c;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: RankConfig.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0006\u0010\u0011\u001a\u00020\bJ\u0006\u0010\u0012\u001a\u00020\u0013J\u0006\u0010\u0014\u001a\u00020\u0013J\u0006\u0010\u0007\u001a\u00020\bJ\u0012\u0010\u0015\u001a\u00020\u00162\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u0013J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\bHÆ\u0003J-\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0006\u0010\u001c\u001a\u00020\u001dJ\u0013\u0010\u001e\u001a\u00020\b2\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010!\u001a\u00020\u001dHÖ\u0001J\t\u0010\"\u001a\u00020\u0013HÖ\u0001J\u0016\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u001dR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006("}, m90084d2 = {"Lcom/kubi/quotefacade/rank/config/RankTabConfig;", "Landroid/os/Parcelable;", "tab", "Lcom/kubi/quotefacade/rank/config/RankTabItemConfig;", "subTabs", "", "Lcom/kubi/quotefacade/rank/config/RankSubTabItemConfig;", "showInDetail", "", "<init>", "(Lcom/kubi/quotefacade/rank/config/RankTabItemConfig;Ljava/util/List;Z)V", "getTab", "()Lcom/kubi/quotefacade/rank/config/RankTabItemConfig;", "getSubTabs", "()Ljava/util/List;", "getShowInDetail", "()Z", "isNewRankTab", "getRankType", "", "getRankName", "getFragment", "Lcom/kubi/sdk/BaseFragment;", "positionType", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class RankTabConfig implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<RankTabConfig> CREATOR = new C22438a();
    private final boolean showInDetail;

    @NotNull
    private final List<RankSubTabItemConfig> subTabs;

    @NotNull
    private final RankTabItemConfig tab;

    /* JADX INFO: renamed from: com.kubi.quotefacade.rank.config.RankTabConfig$a */
    /* JADX INFO: compiled from: RankConfig.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C22438a implements Parcelable.Creator<RankTabConfig> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final RankTabConfig createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            RankTabItemConfig rankTabItemConfigCreateFromParcel = RankTabItemConfig.CREATOR.createFromParcel(parcel);
            int i11 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i11);
            for (int i12 = 0; i12 != i11; i12++) {
                arrayList.add(RankSubTabItemConfig.CREATOR.createFromParcel(parcel));
            }
            return new RankTabConfig(rankTabItemConfigCreateFromParcel, arrayList, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final RankTabConfig[] newArray(int i11) {
            return new RankTabConfig[i11];
        }
    }

    public RankTabConfig(@NotNull RankTabItemConfig tab, @NotNull List<RankSubTabItemConfig> subTabs, boolean z11) {
        Intrinsics.checkNotNullParameter(tab, "tab");
        Intrinsics.checkNotNullParameter(subTabs, "subTabs");
        this.tab = tab;
        this.subTabs = subTabs;
        this.showInDetail = z11;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RankTabConfig)) {
            return false;
        }
        RankTabConfig rankTabConfig = (RankTabConfig) other;
        return Intrinsics.areEqual(this.tab, rankTabConfig.tab) && Intrinsics.areEqual(this.subTabs, rankTabConfig.subTabs) && this.showInDetail == rankTabConfig.showInDetail;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RankTabConfig copy$default(RankTabConfig rankTabConfig, RankTabItemConfig rankTabItemConfig, List list, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            rankTabItemConfig = rankTabConfig.tab;
        }
        if ((i11 & 2) != 0) {
            list = rankTabConfig.subTabs;
        }
        if ((i11 & 4) != 0) {
            z11 = rankTabConfig.showInDetail;
        }
        return rankTabConfig.copy(rankTabItemConfig, list, z11);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final RankTabItemConfig getTab() {
        return this.tab;
    }

    @NotNull
    public final List<RankSubTabItemConfig> component2() {
        return this.subTabs;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getShowInDetail() {
        return this.showInDetail;
    }

    @NotNull
    public final RankTabConfig copy(@NotNull RankTabItemConfig tab, @NotNull List<RankSubTabItemConfig> subTabs, boolean showInDetail) {
        Intrinsics.checkNotNullParameter(tab, "tab");
        Intrinsics.checkNotNullParameter(subTabs, "subTabs");
        return new RankTabConfig(tab, subTabs, showInDetail);
    }

    @NotNull
    public final BaseFragment getFragment(@Nullable String positionType) {
        if (Intrinsics.areEqual(this.tab.getType(), "rank_type_fav")) {
            return QuoteFavoriteFragment.f41688f0.newInstance("HOME_RANK");
        }
        return Intrinsics.areEqual(this.tab.getType(), "rank_type_alpha") ? new AlphaRankFragment() : RankContainerFragment.f42431e0.instance(this, positionType);
    }

    @NotNull
    public final String getRankName() {
        return this.tab.getTabName();
    }

    @NotNull
    public final String getRankType() {
        return this.tab.getType();
    }

    public final boolean getShowInDetail() {
        return this.showInDetail;
    }

    @NotNull
    public final List<RankSubTabItemConfig> getSubTabs() {
        return this.subTabs;
    }

    @NotNull
    public final RankTabItemConfig getTab() {
        return this.tab;
    }

    public int hashCode() {
        return (((this.tab.hashCode() * 31) + this.subTabs.hashCode()) * 31) + Boolean.hashCode(this.showInDetail);
    }

    public final boolean isNewRankTab() {
        return C4392c.m4015c(this.tab.getType());
    }

    public final boolean showInDetail() {
        return this.showInDetail;
    }

    @NotNull
    public String toString() {
        return "RankTabConfig(tab=" + this.tab + ", subTabs=" + this.subTabs + ", showInDetail=" + this.showInDetail + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.tab.writeToParcel(dest, flags);
        List<RankSubTabItemConfig> list = this.subTabs;
        dest.writeInt(list.size());
        Iterator<RankSubTabItemConfig> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(dest, flags);
        }
        dest.writeInt(this.showInDetail ? 1 : 0);
    }

    public /* synthetic */ RankTabConfig(RankTabItemConfig rankTabItemConfig, List list, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(rankTabItemConfig, (i11 & 2) != 0 ? CollectionsKt.emptyList() : list, (i11 & 4) != 0 ? true : z11);
    }
}
