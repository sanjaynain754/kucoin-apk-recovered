package com.kubi.spot.quote.market.trade;

import androidx.recyclerview.widget.RecyclerView;
import com.kubi.spot.R$id;
import com.kubi.spot.R$layout;
import com.kubi.spot.entity.MarketRecentTypeEntity;
import io.chad.library.adapter.base.BaseMultiItemQuickAdapter;
import io.chad.library.adapter.base.BaseQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: MarketRecentAdapter.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0002H\u0014J\u0018\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0002H\u0002J\u0018\u0010\u0011\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0002H\u0002R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/spot/quote/market/trade/MarketRecentAdapter;", "Lio/chad/library/adapter/base/BaseMultiItemQuickAdapter;", "Lcom/kubi/spot/entity/MarketRecentTypeEntity;", "Lio/chad/library/adapter/base/BaseViewHolder;", "data", "", "mAdapter", "Lcom/kubi/spot/quote/market/trade/MarketRecentItemAdapter;", "<init>", "(Ljava/util/List;Lcom/kubi/spot/quote/market/trade/MarketRecentItemAdapter;)V", "getMAdapter", "()Lcom/kubi/spot/quote/market/trade/MarketRecentItemAdapter;", "convert", "", "helper", "item", "renderMarketChange", "renderMarketRecent", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class MarketRecentAdapter extends BaseMultiItemQuickAdapter<MarketRecentTypeEntity, BaseViewHolder> {

    /* JADX INFO: renamed from: i */
    @NotNull
    public final MarketRecentItemAdapter f51094i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketRecentAdapter(@NotNull List<MarketRecentTypeEntity> data, @NotNull MarketRecentItemAdapter mAdapter) {
        super(data);
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(mAdapter, "mAdapter");
        this.f51094i = mAdapter;
        addItemType(0, R$layout.kucoin_item_market_change_deal);
        addItemType(1, R$layout.kucoin_layout_market_recent_deal_recycler);
    }

    @Override // io.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void convert(@NotNull BaseViewHolder helper, @NotNull MarketRecentTypeEntity item) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        Integer type = item.getType();
        if (type != null && type.intValue() == 0) {
            m62805h(helper, item);
        } else if (type != null && type.intValue() == 1) {
            m62806i(helper, item);
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m62806i(BaseViewHolder baseViewHolder, MarketRecentTypeEntity marketRecentTypeEntity) {
        RecyclerView recyclerView = (RecyclerView) baseViewHolder.getView(R$id.recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setNestedScrollingEnabled(false);
        if (recyclerView.getAdapter() == null) {
            this.f51094i.setNewData(marketRecentTypeEntity.getInfo());
            recyclerView.setAdapter(this.f51094i);
        } else {
            RecyclerView.Adapter adapter = recyclerView.getAdapter();
            Intrinsics.checkNotNull(adapter, "null cannot be cast to non-null type io.chad.library.adapter.base.BaseQuickAdapter<com.kubi.spot.entity.MarketRecentEntity, io.chad.library.adapter.base.BaseViewHolder>");
            ((BaseQuickAdapter) adapter).setNewData(marketRecentTypeEntity.getInfo());
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m62805h(BaseViewHolder baseViewHolder, MarketRecentTypeEntity marketRecentTypeEntity) {
    }
}
