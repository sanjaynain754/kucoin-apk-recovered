package com.kubi.market.monitor.lib.p100ui.floating.setting;

import com.kubi.data.entity.TradeItemBean;
import com.kubi.kucoin.market.monitor.lib.R$layout;
import io.chad.library.adapter.base.BaseItemDraggableAdapter;
import java.util.ArrayList;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: CurrencyAdapter.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00032\b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0014¨\u0006\n"}, m90084d2 = {"Lcom/kubi/market/monitor/lib/ui/floating/setting/CurrencyAdapter;", "Lio/chad/library/adapter/base/BaseItemDraggableAdapter;", "Lcom/kubi/data/entity/TradeItemBean;", "Lcom/kubi/market/monitor/lib/ui/floating/setting/CurrencyAdapterHolder;", "<init>", "()V", "convert", "", "helper", "item", "MarketMonitorLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class CurrencyAdapter extends BaseItemDraggableAdapter<TradeItemBean, CurrencyAdapterHolder> {
    public CurrencyAdapter() {
        super(R$layout.view_item_floating_window_setting_currency, new ArrayList());
    }

    @Override // io.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void convert(@Nullable CurrencyAdapterHolder currencyAdapterHolder, @Nullable TradeItemBean tradeItemBean) {
        if (currencyAdapterHolder != null) {
            currencyAdapterHolder.m40752c(tradeItemBean);
        }
    }
}
