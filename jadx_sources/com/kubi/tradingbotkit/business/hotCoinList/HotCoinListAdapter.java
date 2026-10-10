package com.kubi.tradingbotkit.business.hotCoinList;

import android.view.ViewGroup;
import com.blankj.utilcode.util.C5275i0;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.tradingbotkit.R$layout;
import com.kubi.tradingbotkit.model.HotCoinListModel;
import io.chad.library.adapter.base.BaseQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import l50.C42093s;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: HotCoinListAdapter.kt */
/* JADX INFO: loaded from: classes51.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0002H\u0014J\u0014\u0010\n\u001a\u00020\u0007*\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002¨\u0006\u000e"}, m90084d2 = {"Lcom/kubi/tradingbotkit/business/hotCoinList/HotCoinListAdapter;", "Lio/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/kubi/tradingbotkit/model/HotCoinListModel;", "Lio/chad/library/adapter/base/BaseViewHolder;", "<init>", "()V", "convert", "", "helper", "item", ViewProps.MARGIN_START, "Lcom/kubi/tradingbotkit/databinding/BtradingBotKitHotCoinListItemBinding;", "px", "", "TradingBotKitLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class HotCoinListAdapter extends BaseQuickAdapter<HotCoinListModel, BaseViewHolder> {
    public HotCoinListAdapter() {
        super(R$layout.btrading_bot_kit_hot_coin_list_item);
    }

    @Override // io.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void convert(@NotNull BaseViewHolder helper, @NotNull HotCoinListModel item) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        C42093s c42093sM92341a = C42093s.m92341a(helper.itemView);
        Intrinsics.checkNotNullExpressionValue(c42093sM92341a, "bind(...)");
        if (helper.getAdapterPosition() == 0) {
            m64059h(c42093sM92341a, 0);
        } else {
            m64059h(c42093sM92341a, C5275i0.m6236a(8.0f));
        }
        c42093sM92341a.f93259b.setText(item.getSymbolName());
    }

    /* JADX INFO: renamed from: h */
    public final void m64059h(C42093s c42093s, int i11) {
        ViewGroup.LayoutParams layoutParams = c42093s.f93259b.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.setMarginStart(i11);
        }
        c42093s.f93259b.setLayoutParams(marginLayoutParams);
    }
}
