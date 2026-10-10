package com.kubi.spot.quote.market.trade;

import android.content.Context;
import com.kubi.resources.C22890g;
import com.kubi.spot.R$id;
import com.kubi.spot.R$layout;
import com.kubi.spot.entity.MarketRecentEntity;
import f30.C37347r;
import io.chad.library.adapter.base.BaseQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import java.math.BigDecimal;
import l30.C42050c;
import l30.C42051d;
import l30.InterfaceC42048a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p429lf.C42180b;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: MarketRecentItemAdapter.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0002H\u0014J\u001a\u0010\u0012\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0013\u001a\u00020\u0002H\u0002J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0002R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m90084d2 = {"Lcom/kubi/spot/quote/market/trade/MarketRecentItemAdapter;", "Lio/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/kubi/spot/entity/MarketRecentEntity;", "Lio/chad/library/adapter/base/BaseViewHolder;", "pricePrecision", "", "amountPrecision", "<init>", "(II)V", "getPricePrecision", "()I", "getAmountPrecision", "mAmountDisplayRule", "Lcom/kubi/tradebase/business/orderbook/IOrderBookAmountDisplayRule;", "convert", "", "helper", "discoverLeadBlock", "renderMarketRecentItems", "item", "formatterAmount", "", "size", "", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class MarketRecentItemAdapter extends BaseQuickAdapter<MarketRecentEntity, BaseViewHolder> {

    /* JADX INFO: renamed from: i */
    public final int f51106i;

    /* JADX INFO: renamed from: j */
    public final int f51107j;

    /* JADX INFO: renamed from: k */
    @Nullable
    public InterfaceC42048a f51108k;

    public MarketRecentItemAdapter(int i11, int i12) {
        super(R$layout.kucoin_item_market_recent_deal);
        this.f51106i = i11;
        this.f51107j = i12;
    }

    @Override // io.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void convert(@NotNull BaseViewHolder helper, @NotNull MarketRecentEntity discoverLeadBlock) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(discoverLeadBlock, "discoverLeadBlock");
        m62859i(helper, discoverLeadBlock);
    }

    /* JADX INFO: renamed from: h */
    public final String m62858h(double d11) {
        InterfaceC42048a c42050c = this.f51108k;
        if (c42050c == null) {
            c42050c = this.f51106i >= 8 ? new C42050c() : new C42051d();
            this.f51108k = c42050c;
        }
        return c42050c.mo92251a(d11, this.f51107j);
    }

    /* JADX INFO: renamed from: i */
    public final void m62859i(BaseViewHolder baseViewHolder, MarketRecentEntity marketRecentEntity) {
        if (baseViewHolder != null) {
            baseViewHolder.setText(R$id.recent_time_tv, C37347r.m83946f(marketRecentEntity.getTime()));
            int i11 = R$id.recent_price_tv;
            Context mContext = this.mContext;
            Intrinsics.checkNotNullExpressionValue(mContext, "mContext");
            baseViewHolder.setTextColor(i11, C22890g.m54281f(mContext, Intrinsics.areEqual("buy", marketRecentEntity.getSide())));
            baseViewHolder.setText(i11, C42180b.m92640e(new BigDecimal(String.valueOf(marketRecentEntity.getPrice())), null, this.f51106i, false, false, false, 0, null, 125, null));
            baseViewHolder.setText(R$id.recent_vol_tv, m62858h(marketRecentEntity.getSize()));
        }
    }
}
