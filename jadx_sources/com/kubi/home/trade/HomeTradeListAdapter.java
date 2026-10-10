package com.kubi.home.trade;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.kubi.data.entity.TradeItemBean;
import com.kubi.home.R$color;
import com.kubi.home.R$id;
import com.kubi.home.R$layout;
import com.kubi.home.common.card.HomeCardViewHolderProxy;
import com.kubi.quotefacade.constant.QuoteMainTab;
import com.kubi.resources.C22890g;
import com.kubi.sdk.function.language.MultiLanguageManager;
import com.kubi.search.searchresult.SearchCategory$Companion;
import com.kubi.spot.api.ISpotService;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27046k;
import dj.C36716a;
import f00.C37304a;
import g00.InterfaceC37754f;
import gf.C37886j;
import io.chad.library.adapter.base.BaseQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import java.math.BigDecimal;
import java.math.RoundingMode;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import p429lf.C42180b;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import rs.C44172b;

/* JADX INFO: compiled from: HomeTradeListAdapter.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0002H\u0014¨\u0006\n"}, m90084d2 = {"Lcom/kubi/home/trade/HomeTradeListAdapter;", "Lio/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/kubi/data/entity/TradeItemBean;", "Lio/chad/library/adapter/base/BaseViewHolder;", "<init>", "()V", "convert", "", "helper", "item", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class HomeTradeListAdapter extends BaseQuickAdapter<TradeItemBean, BaseViewHolder> {
    public HomeTradeListAdapter() {
        super(R$layout.kucoin_item_home_trade_single);
        setHasStableIds(true);
    }

    /* JADX INFO: renamed from: j */
    public static final Unit m30406j() {
        InterfaceC37754f.a.m85138j(C37304a.f82764a, QuoteMainTab.MARKET.getType(), SearchCategory$Companion.SPOT, null, null, null, null, null, 124, null);
        return Unit.INSTANCE;
    }

    @Override // io.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void convert(@NotNull final BaseViewHolder helper, @NotNull final TradeItemBean item) {
        String strM92642g;
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        helper.setGone(R$id.ll_normal, !TextUtils.isEmpty(item.getSymbol()));
        helper.setGone(R$id.tv_more, TextUtils.isEmpty(item.getSymbol()));
        String symbol = item.getSymbol();
        if (symbol == null || symbol.length() == 0) {
            View view = helper.getView(R$id.fl_root);
            if (view != null) {
                C27046k.m66711z(view, 0L, new Function0() { // from class: com.kubi.home.trade.a
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return HomeTradeListAdapter.m30406j();
                    }
                }, 1, null);
                return;
            }
            return;
        }
        int i11 = R$id.tv_last_deal_price;
        View view2 = helper.getView(i11);
        Intrinsics.checkNotNullExpressionValue(view2, "getView(...)");
        C44172b.m97383c((TextView) view2, null, false, 3, null);
        BaseViewHolder text = helper.setText(R$id.tv_symbols, item.getShowSymbol()).setText(i11, C37886j.m85579c(new BigDecimal(String.valueOf(item.getLastDealPrice())), item.getSymbol(), (124 & 2) != 0 ? RoundingMode.DOWN : null, (124 & 4) != 0 ? false : false, (124 & 8) != 0 ? false : false, (124 & 16) != 0 ? true : true, (124 & 32) == 0 ? 0 : 0, (124 & 64) != 0 ? MultiLanguageManager.f46811g.getLocale() : null));
        int i12 = R$id.tv_change_rate;
        Double changeRate = item.getChangeRate();
        if (changeRate == null || (strM92642g = C42180b.m92642g(new BigDecimal(String.valueOf(changeRate.doubleValue())), null, null, 0, true, false, false, 23, null)) == null) {
            strM92642g = "--";
        }
        BaseViewHolder text2 = text.setText(i12, strM92642g);
        Context mContext = this.mContext;
        Intrinsics.checkNotNullExpressionValue(mContext, "mContext");
        text2.setTextColor(i12, C22890g.m54278c(mContext, C27039d.m66646f(item.getChangeRate()), R$color.c_text40));
        View view3 = helper.getView(R$id.fl_root);
        if (view3 != null) {
            C27046k.m66711z(view3, 0L, new Function0() { // from class: com.kubi.home.trade.b
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return HomeTradeListAdapter.m30407k(helper, item);
                }
            }, 1, null);
        }
    }

    /* JADX INFO: renamed from: k */
    public static final Unit m30407k(BaseViewHolder baseViewHolder, TradeItemBean tradeItemBean) throws JSONException {
        if (baseViewHolder.getAdapterPosition() >= 0) {
            String strValueOf = String.valueOf(baseViewHolder.getAdapterPosition() + 1);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("symbol", tradeItemBean.getShowSymbol());
            Unit unit = Unit.INSTANCE;
            C36716a.m82242e(HomeCardViewHolderProxy.PAGE_ID, "recommendSymbol", strValueOf, jSONObject);
        }
        if (tradeItemBean.getSymbolInfoEntity().isPreviewEnableShow()) {
            ISpotService.m59982A(ISpotService.f49646a.get(), tradeItemBean.getSymbol(), 2, null, null, 12, null);
        } else {
            ISpotService.m59982A(ISpotService.f49646a.get(), tradeItemBean.getSymbol(), null, null, null, 14, null);
        }
        return Unit.INSTANCE;
    }
}
