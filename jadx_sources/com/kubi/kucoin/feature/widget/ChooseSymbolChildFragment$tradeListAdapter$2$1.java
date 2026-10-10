package com.kubi.kucoin.feature.widget;

import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.data.entity.TradeItemBean;
import com.kubi.kucoin.market.monitor.lib.R$id;
import com.kubi.kucoin.market.monitor.lib.R$string;
import com.kubi.market.monitor.lib.p100ui.floating.FloatingWindowConfigManager;
import com.kubi.sdk.function.language.MultiLanguageManager;
import gf.C37886j;
import io.chad.library.adapter.base.BaseQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import java.math.BigDecimal;
import java.math.RoundingMode;
import p265fl.C37565d;
import p402kf.C41014a;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import rs.C44172b;

/* JADX INFO: compiled from: ChooseSymbolFragment.kt */
/* JADX INFO: loaded from: classes18.dex */
@Metadata(m90083d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0014¨\u0006\b"}, m90084d2 = {"com/kubi/kucoin/feature/widget/ChooseSymbolChildFragment$tradeListAdapter$2$1", "Lio/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/kubi/data/entity/TradeItemBean;", "Lio/chad/library/adapter/base/BaseViewHolder;", "convert", "", "helper", "item", "MarketMonitorLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class ChooseSymbolChildFragment$tradeListAdapter$2$1 extends BaseQuickAdapter<TradeItemBean, BaseViewHolder> {

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ ChooseSymbolChildFragment f27782i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChooseSymbolChildFragment$tradeListAdapter$2$1(ChooseSymbolChildFragment chooseSymbolChildFragment, int i11) {
        super(i11);
        this.f27782i = chooseSymbolChildFragment;
    }

    /* JADX INFO: renamed from: k */
    public static final void m32081k(TradeItemBean tradeItemBean, ChooseSymbolChildFragment chooseSymbolChildFragment, ChooseSymbolChildFragment$tradeListAdapter$2$1 chooseSymbolChildFragment$tradeListAdapter$2$1, BaseViewHolder baseViewHolder, View view) throws Throwable {
        C37565d c37565d = C37565d.f83517a;
        String symbol = tradeItemBean.getSymbol();
        Intrinsics.checkNotNullExpressionValue(symbol, "getSymbol(...)");
        if (!c37565d.m84599e(symbol) && c37565d.m84606n() >= 30) {
            chooseSymbolChildFragment.showToast(chooseSymbolChildFragment.getString(R$string.widget_limit_count, "30"));
            return;
        }
        FloatingWindowConfigManager floatingWindowConfigManager = FloatingWindowConfigManager.f34272a;
        String symbol2 = tradeItemBean.getSymbol();
        Intrinsics.checkNotNullExpressionValue(symbol2, "getSymbol(...)");
        floatingWindowConfigManager.m40726c(symbol2);
        chooseSymbolChildFragment$tradeListAdapter$2$1.notifyItemChanged(baseViewHolder.getAdapterPosition());
        Fragment parentFragment = chooseSymbolChildFragment.getParentFragment();
        ChooseSymbolFragment chooseSymbolFragment = parentFragment instanceof ChooseSymbolFragment ? (ChooseSymbolFragment) parentFragment : null;
        if (chooseSymbolFragment != null) {
            chooseSymbolFragment.m32101E3();
        }
    }

    @Override // io.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void convert(final BaseViewHolder helper, final TradeItemBean item) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        int i11 = R$id.tv_price;
        View view = helper.getView(i11);
        Intrinsics.checkNotNullExpressionValue(view, "getView(...)");
        C44172b.m97383c((TextView) view, null, false, 3, null);
        BaseViewHolder text = helper.setText(R$id.tv_trade_pair, item.getShowSymbol());
        int i12 = R$id.iv_check;
        C37565d c37565d = C37565d.f83517a;
        String symbol = item.getSymbol();
        Intrinsics.checkNotNullExpressionValue(symbol, "getSymbol(...)");
        BaseViewHolder text2 = text.setChecked(i12, c37565d.m84599e(symbol)).setText(i11, C37886j.m85579c(new BigDecimal(String.valueOf(item.getLastDealPrice())), item.getSymbol(), (124 & 2) != 0 ? RoundingMode.DOWN : null, (124 & 4) != 0 ? false : false, (124 & 8) != 0 ? false : false, (124 & 16) != 0, (124 & 32) == 0 ? 0 : 0, (124 & 64) != 0 ? MultiLanguageManager.f46811g.getLocale() : null));
        int i13 = R$id.tv_money_price;
        double lastDealPrice = item.getLastDealPrice();
        SymbolInfoEntity symbolInfoEntity = item.getSymbolInfoEntity();
        BaseViewHolder onTouchListener = text2.setText(i13, C41014a.m89933g(new BigDecimal(String.valueOf(C41014a.m89939m(lastDealPrice, symbolInfoEntity != null ? symbolInfoEntity.getQuoteCurrency() : null))), null, null, 0, false, false, true, 31, null)).setOnTouchListener(i12, new View.OnTouchListener() { // from class: com.kubi.kucoin.feature.widget.e
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                return ChooseSymbolChildFragment$tradeListAdapter$2$1.m32080j(helper, view2, motionEvent);
            }
        });
        int i14 = R$id.llRoot;
        final ChooseSymbolChildFragment chooseSymbolChildFragment = this.f27782i;
        onTouchListener.setOnClickListener(i14, new View.OnClickListener() { // from class: com.kubi.kucoin.feature.widget.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) throws Throwable {
                ChooseSymbolChildFragment$tradeListAdapter$2$1.m32081k(item, chooseSymbolChildFragment, this, helper, view2);
            }
        });
    }

    /* JADX INFO: renamed from: j */
    public static final boolean m32080j(BaseViewHolder baseViewHolder, View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            baseViewHolder.getView(R$id.llRoot).performClick();
        }
        return true;
    }
}
