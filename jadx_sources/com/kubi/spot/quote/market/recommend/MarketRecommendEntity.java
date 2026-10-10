package com.kubi.spot.quote.market.recommend;

import androidx.annotation.Keep;
import com.kubi.search.searchresult.SearchCategory$Companion;
import com.kubi.spot.quote.market.info.MarketCoinInfoEarn;
import com.kubi.spot.quote.market.info.MarketCoinInfoGrid;
import com.kubi.spot.quote.market.info.MarketCoinInfoQuest;
import com.kubi.utils.extensions.C27039d;
import io.chad.library.adapter.base.entity.MultiItemEntity;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: MarketRecommendEntity.kt */
/* JADX INFO: loaded from: classes47.dex */
@Keep
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0002\u0019\u001aB?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0018\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, m90084d2 = {"Lcom/kubi/spot/quote/market/recommend/MarketRecommendEntity;", "Lio/chad/library/adapter/base/entity/MultiItemEntity;", "type", "", "activity", "Lcom/kubi/spot/quote/market/info/MarketCoinInfoQuest;", "grid", "Lcom/kubi/spot/quote/market/info/MarketCoinInfoGrid;", SearchCategory$Companion.EARN, "Lcom/kubi/spot/quote/market/info/MarketCoinInfoEarn;", "coinName", "", "<init>", "(ILcom/kubi/spot/quote/market/info/MarketCoinInfoQuest;Lcom/kubi/spot/quote/market/info/MarketCoinInfoGrid;Lcom/kubi/spot/quote/market/info/MarketCoinInfoEarn;Ljava/lang/String;)V", "getType", "()I", "getActivity", "()Lcom/kubi/spot/quote/market/info/MarketCoinInfoQuest;", "getGrid", "()Lcom/kubi/spot/quote/market/info/MarketCoinInfoGrid;", "getEarn", "()Lcom/kubi/spot/quote/market/info/MarketCoinInfoEarn;", "getCoinName", "()Ljava/lang/String;", "getItemType", "Companion", "RecommendType", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class MarketRecommendEntity implements MultiItemEntity {
    public static final int TYPE_ACTIVITY = 0;
    public static final int TYPE_EARN = 3;
    public static final int TYPE_OTC = 4;
    public static final int TYPE_ROBOT_FUTURE = 2;
    public static final int TYPE_ROBOT_SPOT = 1;

    @Nullable
    private final MarketCoinInfoQuest activity;

    @Nullable
    private final String coinName;

    @Nullable
    private final MarketCoinInfoEarn earn;

    @Nullable
    private final MarketCoinInfoGrid grid;
    private final int type;

    public MarketRecommendEntity(int i11, @Nullable MarketCoinInfoQuest marketCoinInfoQuest, @Nullable MarketCoinInfoGrid marketCoinInfoGrid, @Nullable MarketCoinInfoEarn marketCoinInfoEarn, @Nullable String str) {
        this.type = i11;
        this.activity = marketCoinInfoQuest;
        this.grid = marketCoinInfoGrid;
        this.earn = marketCoinInfoEarn;
        this.coinName = str;
    }

    @Nullable
    public final MarketCoinInfoQuest getActivity() {
        return this.activity;
    }

    @Nullable
    public final String getCoinName() {
        return this.coinName;
    }

    @Nullable
    public final MarketCoinInfoEarn getEarn() {
        return this.earn;
    }

    @Nullable
    public final MarketCoinInfoGrid getGrid() {
        return this.grid;
    }

    @Override // io.chad.library.adapter.base.entity.MultiItemEntity
    /* JADX INFO: renamed from: getItemType */
    public int getF42794b() {
        return C27039d.m66650j(Integer.valueOf(this.type));
    }

    public final int getType() {
        return this.type;
    }

    public /* synthetic */ MarketRecommendEntity(int i11, MarketCoinInfoQuest marketCoinInfoQuest, MarketCoinInfoGrid marketCoinInfoGrid, MarketCoinInfoEarn marketCoinInfoEarn, String str, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, (i12 & 2) != 0 ? null : marketCoinInfoQuest, (i12 & 4) != 0 ? null : marketCoinInfoGrid, (i12 & 8) != 0 ? null : marketCoinInfoEarn, (i12 & 16) != 0 ? null : str);
    }
}
