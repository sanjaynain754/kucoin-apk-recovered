package com.kubi.spot.quote.market.info;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: MarketInfoEntity.kt */
/* JADX INFO: loaded from: classes47.dex */
@Keep
@Metadata(m90083d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0010\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0006\u0010\u0013\u001a\u00020\u0014J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0013\u0010\u0017\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003JA\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0012\b\u0002\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u001a\u001a\u00020\u001bJ\u0013\u0010\u001c\u001a\u00020\u00142\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\u001bHÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001J\u0016\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u001bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\r¨\u0006'"}, m90084d2 = {"Lcom/kubi/spot/quote/market/info/MarketCoinInfoRecommend;", "Landroid/os/Parcelable;", "contractGrid", "Lcom/kubi/spot/quote/market/info/MarketCoinInfoGrid;", "poolStakingProducts", "Lcom/kubi/spot/quote/market/info/MarketCoinInfoEarn;", "questInfos", "", "Lcom/kubi/spot/quote/market/info/MarketCoinInfoQuest;", "spotGrid", "<init>", "(Lcom/kubi/spot/quote/market/info/MarketCoinInfoGrid;Lcom/kubi/spot/quote/market/info/MarketCoinInfoEarn;Ljava/util/List;Lcom/kubi/spot/quote/market/info/MarketCoinInfoGrid;)V", "getContractGrid", "()Lcom/kubi/spot/quote/market/info/MarketCoinInfoGrid;", "getPoolStakingProducts", "()Lcom/kubi/spot/quote/market/info/MarketCoinInfoEarn;", "getQuestInfos", "()Ljava/util/List;", "getSpotGrid", "isEmpty", "", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class MarketCoinInfoRecommend implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<MarketCoinInfoRecommend> CREATOR = new C25607a();

    @Nullable
    private final MarketCoinInfoGrid contractGrid;

    @Nullable
    private final MarketCoinInfoEarn poolStakingProducts;

    @Nullable
    private final List<MarketCoinInfoQuest> questInfos;

    @Nullable
    private final MarketCoinInfoGrid spotGrid;

    /* JADX INFO: renamed from: com.kubi.spot.quote.market.info.MarketCoinInfoRecommend$a */
    /* JADX INFO: compiled from: MarketInfoEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C25607a implements Parcelable.Creator<MarketCoinInfoRecommend> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MarketCoinInfoRecommend createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            MarketCoinInfoGrid marketCoinInfoGridCreateFromParcel = parcel.readInt() == 0 ? null : MarketCoinInfoGrid.CREATOR.createFromParcel(parcel);
            MarketCoinInfoEarn marketCoinInfoEarnCreateFromParcel = parcel.readInt() == 0 ? null : MarketCoinInfoEarn.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i11 = parcel.readInt();
                arrayList = new ArrayList(i11);
                for (int i12 = 0; i12 != i11; i12++) {
                    arrayList.add(parcel.readInt() == 0 ? null : MarketCoinInfoQuest.CREATOR.createFromParcel(parcel));
                }
            }
            return new MarketCoinInfoRecommend(marketCoinInfoGridCreateFromParcel, marketCoinInfoEarnCreateFromParcel, arrayList, parcel.readInt() != 0 ? MarketCoinInfoGrid.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final MarketCoinInfoRecommend[] newArray(int i11) {
            return new MarketCoinInfoRecommend[i11];
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
        if (!(other instanceof MarketCoinInfoRecommend)) {
            return false;
        }
        MarketCoinInfoRecommend marketCoinInfoRecommend = (MarketCoinInfoRecommend) other;
        return Intrinsics.areEqual(this.contractGrid, marketCoinInfoRecommend.contractGrid) && Intrinsics.areEqual(this.poolStakingProducts, marketCoinInfoRecommend.poolStakingProducts) && Intrinsics.areEqual(this.questInfos, marketCoinInfoRecommend.questInfos) && Intrinsics.areEqual(this.spotGrid, marketCoinInfoRecommend.spotGrid);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MarketCoinInfoRecommend copy$default(MarketCoinInfoRecommend marketCoinInfoRecommend, MarketCoinInfoGrid marketCoinInfoGrid, MarketCoinInfoEarn marketCoinInfoEarn, List list, MarketCoinInfoGrid marketCoinInfoGrid2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            marketCoinInfoGrid = marketCoinInfoRecommend.contractGrid;
        }
        if ((i11 & 2) != 0) {
            marketCoinInfoEarn = marketCoinInfoRecommend.poolStakingProducts;
        }
        if ((i11 & 4) != 0) {
            list = marketCoinInfoRecommend.questInfos;
        }
        if ((i11 & 8) != 0) {
            marketCoinInfoGrid2 = marketCoinInfoRecommend.spotGrid;
        }
        return marketCoinInfoRecommend.copy(marketCoinInfoGrid, marketCoinInfoEarn, list, marketCoinInfoGrid2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final MarketCoinInfoGrid getContractGrid() {
        return this.contractGrid;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final MarketCoinInfoEarn getPoolStakingProducts() {
        return this.poolStakingProducts;
    }

    @Nullable
    public final List<MarketCoinInfoQuest> component3() {
        return this.questInfos;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final MarketCoinInfoGrid getSpotGrid() {
        return this.spotGrid;
    }

    @NotNull
    public final MarketCoinInfoRecommend copy(@Nullable MarketCoinInfoGrid contractGrid, @Nullable MarketCoinInfoEarn poolStakingProducts, @Nullable List<MarketCoinInfoQuest> questInfos, @Nullable MarketCoinInfoGrid spotGrid) {
        return new MarketCoinInfoRecommend(contractGrid, poolStakingProducts, questInfos, spotGrid);
    }

    @Nullable
    public final MarketCoinInfoGrid getContractGrid() {
        return this.contractGrid;
    }

    @Nullable
    public final MarketCoinInfoEarn getPoolStakingProducts() {
        return this.poolStakingProducts;
    }

    @Nullable
    public final List<MarketCoinInfoQuest> getQuestInfos() {
        return this.questInfos;
    }

    @Nullable
    public final MarketCoinInfoGrid getSpotGrid() {
        return this.spotGrid;
    }

    public int hashCode() {
        MarketCoinInfoGrid marketCoinInfoGrid = this.contractGrid;
        int iHashCode = (marketCoinInfoGrid == null ? 0 : marketCoinInfoGrid.hashCode()) * 31;
        MarketCoinInfoEarn marketCoinInfoEarn = this.poolStakingProducts;
        int iHashCode2 = (iHashCode + (marketCoinInfoEarn == null ? 0 : marketCoinInfoEarn.hashCode())) * 31;
        List<MarketCoinInfoQuest> list = this.questInfos;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        MarketCoinInfoGrid marketCoinInfoGrid2 = this.spotGrid;
        return iHashCode3 + (marketCoinInfoGrid2 != null ? marketCoinInfoGrid2.hashCode() : 0);
    }

    public final boolean isEmpty() {
        if (this.contractGrid != null || this.spotGrid != null || this.poolStakingProducts != null) {
            return false;
        }
        List<MarketCoinInfoQuest> list = this.questInfos;
        return list == null || list.isEmpty();
    }

    @NotNull
    public String toString() {
        return "MarketCoinInfoRecommend(contractGrid=" + this.contractGrid + ", poolStakingProducts=" + this.poolStakingProducts + ", questInfos=" + this.questInfos + ", spotGrid=" + this.spotGrid + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        MarketCoinInfoGrid marketCoinInfoGrid = this.contractGrid;
        if (marketCoinInfoGrid == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            marketCoinInfoGrid.writeToParcel(dest, flags);
        }
        MarketCoinInfoEarn marketCoinInfoEarn = this.poolStakingProducts;
        if (marketCoinInfoEarn == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            marketCoinInfoEarn.writeToParcel(dest, flags);
        }
        List<MarketCoinInfoQuest> list = this.questInfos;
        if (list == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(list.size());
            for (MarketCoinInfoQuest marketCoinInfoQuest : list) {
                if (marketCoinInfoQuest == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    marketCoinInfoQuest.writeToParcel(dest, flags);
                }
            }
        }
        MarketCoinInfoGrid marketCoinInfoGrid2 = this.spotGrid;
        if (marketCoinInfoGrid2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            marketCoinInfoGrid2.writeToParcel(dest, flags);
        }
    }

    public MarketCoinInfoRecommend(@Nullable MarketCoinInfoGrid marketCoinInfoGrid, @Nullable MarketCoinInfoEarn marketCoinInfoEarn, @Nullable List<MarketCoinInfoQuest> list, @Nullable MarketCoinInfoGrid marketCoinInfoGrid2) {
        this.contractGrid = marketCoinInfoGrid;
        this.poolStakingProducts = marketCoinInfoEarn;
        this.questInfos = list;
        this.spotGrid = marketCoinInfoGrid2;
    }
}
