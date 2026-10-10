package com.kubi.tradingbotkit.business.strategyList;

import android.view.View;
import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.kumex.api.IKuMexService;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.search.searchresult.SearchCategory$Companion;
import com.kubi.spot.api.ISpotService;
import com.kubi.tradingbotkit.R$id;
import com.kubi.tradingbotkit.R$layout;
import com.kubi.tradingbotkit.R$string;
import com.kubi.tradingbotkit.business.strategyList.entity.CurrencyInfo;
import com.kubi.tradingbotkit.business.strategyList.entity.StrategyItemEntity;
import com.kubi.tradingbotkit.business.strategyList.viewModel.StrategyListViewModel;
import com.kubi.tradingbotkit.service.TradingBotKitDepend;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import gf.C37890n;
import io.chad.library.adapter.base.BaseQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import io.chad.library.adapter.base.util.MultiTypeDelegate;
import j50.C40281a0;
import j50.C40285b1;
import j50.C40286c;
import j50.C40287c0;
import j50.C40292f;
import j50.C40297h0;
import j50.C40302k;
import j50.C40303k0;
import j50.C40308n;
import j50.C40314q;
import j50.C40318s;
import j50.C40320t;
import j50.C40322u;
import java.util.List;
import java.util.Map;
import k50.C40911a;
import org.jetbrains.annotations.NotNull;
import p569qq.C43852m;
import p852kotlin.Metadata;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: StrategyAdapter.kt */
/* JADX INFO: loaded from: classes51.dex */
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B9\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\t\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00050\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0002H\u0014J\u0016\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u0002J\u0016\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u0002R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001d\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00050\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u001c"}, m90084d2 = {"Lcom/kubi/tradingbotkit/business/strategyList/StrategyAdapter;", "Lio/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/kubi/tradingbotkit/business/strategyList/entity/StrategyItemEntity;", "Lio/chad/library/adapter/base/BaseViewHolder;", "entryType", "", "viewModel", "Lcom/kubi/tradingbotkit/business/strategyList/viewModel/StrategyListViewModel;", "strategies", "", "strategiesNames", "", "", "<init>", "(Ljava/lang/String;Lcom/kubi/tradingbotkit/business/strategyList/viewModel/StrategyListViewModel;Ljava/util/List;Ljava/util/Map;)V", "getEntryType", "()Ljava/lang/String;", "getViewModel", "()Lcom/kubi/tradingbotkit/business/strategyList/viewModel/StrategyListViewModel;", "getStrategiesNames", "()Ljava/util/Map;", "convert", "", "helper", "item", "bindStartFailed", "strategy", "bindEmpty", "TradingBotKitLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class StrategyAdapter extends BaseQuickAdapter<StrategyItemEntity, BaseViewHolder> {

    /* JADX INFO: renamed from: i */
    @NotNull
    public final String f52406i;

    /* JADX INFO: renamed from: j */
    @NotNull
    public final StrategyListViewModel f52407j;

    /* JADX INFO: renamed from: k */
    @NotNull
    public final Map<Integer, String> f52408k;

    /* JADX INFO: renamed from: com.kubi.tradingbotkit.business.strategyList.StrategyAdapter$a */
    /* JADX INFO: compiled from: StrategyAdapter.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0002H\u0014¨\u0006\u0006"}, m90084d2 = {"com/kubi/tradingbotkit/business/strategyList/StrategyAdapter$1", "Lio/chad/library/adapter/base/util/MultiTypeDelegate;", "Lcom/kubi/tradingbotkit/business/strategyList/entity/StrategyItemEntity;", "getItemType", "", "item", "TradingBotKitLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C26182a extends MultiTypeDelegate<StrategyItemEntity> {
        @Override // io.chad.library.adapter.base.util.MultiTypeDelegate
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int getItemType(StrategyItemEntity item) {
            Intrinsics.checkNotNullParameter(item, "item");
            if (Intrinsics.areEqual(item.getStatus(), "START_FAILED") || Intrinsics.areEqual(item.getStatus(), "TRANSFER_FAIL")) {
                return -1;
            }
            Integer type = item.getType();
            if (type != null) {
                return type.intValue();
            }
            return 1;
        }
    }

    /* JADX INFO: renamed from: i */
    public static final Unit m64079i(StrategyAdapter strategyAdapter) {
        C40911a.m89599c("", null, false, 6, null);
        if (Intrinsics.areEqual(strategyAdapter.f52406i, SearchCategory$Companion.FUTURES)) {
            C43852m.m96590b(IKuMexService.f28731a.get().mo33260I(), "botTab", "createbtn", TuplesKt.m90091to("grid_type", String.valueOf(strategyAdapter.f52407j.getF52438Z())));
        } else {
            C43852m.m96590b(ISpotService.f49646a.get().mo59997j(), "botTab", "createbtn", TuplesKt.m90091to("grid_type", String.valueOf(strategyAdapter.f52407j.getF52438Z())));
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StrategyAdapter(@NotNull String entryType, @NotNull StrategyListViewModel viewModel, @NotNull List<StrategyItemEntity> strategies, @NotNull Map<Integer, String> strategiesNames) {
        super(strategies);
        Intrinsics.checkNotNullParameter(entryType, "entryType");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(strategies, "strategies");
        Intrinsics.checkNotNullParameter(strategiesNames, "strategiesNames");
        this.f52406i = entryType;
        this.f52407j = viewModel;
        this.f52408k = strategiesNames;
        C26182a c26182a = new C26182a();
        c26182a.registerItemType(3, R$layout.btrading_bot_kit_strategy_item_grid);
        c26182a.registerItemType(12, R$layout.btrading_bot_kit_strategy_item_grid_martin_gale);
        c26182a.registerItemType(13, R$layout.btrading_bot_kit_strategy_item_grid_cta);
        c26182a.registerItemType(9, R$layout.btrading_bot_kit_strategy_item_grid_win_two_way);
        c26182a.registerItemType(1, R$layout.btrading_bot_kit_strategy_item_spot);
        c26182a.registerItemType(8, R$layout.btrading_bot_kit_strategy_item_spot_ai);
        c26182a.registerItemType(5, R$layout.btrading_bot_kit_strategy_item_spot_infinity_grid);
        c26182a.registerItemType(7, R$layout.btrading_bot_kit_strategy_item_spot_martin_gale);
        c26182a.registerItemType(11, R$layout.btrading_bot_kit_strategy_item_spot_cta);
        c26182a.registerItemType(2, R$layout.btrading_bot_kit_strategy_item_spot_aip);
        c26182a.registerItemType(10, R$layout.btrading_bot_kit_strategy_item_margin_grid);
        c26182a.registerItemType(4, R$layout.btrading_bot_kit_strategy_item_spot_position);
        c26182a.registerItemType(-1, R$layout.btrading_bot_kit_strategy_item_start_failed);
        c26182a.registerItemType(-99, R$layout.btrading_bot_kit_strategy_item_empty);
        setMultiTypeDelegate(c26182a);
    }

    /* JADX INFO: renamed from: h */
    public final void m64080h(@NotNull BaseViewHolder helper, @NotNull StrategyItemEntity strategy) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        int i11 = R$id.createBtn;
        helper.setText(i11, helper.itemView.getContext().getString(R$string.HoldingPage_Bot_CreateButton));
        View view = helper.getView(i11);
        Intrinsics.checkNotNullExpressionValue(view, "getView(...)");
        C27046k.m66711z(view, 0L, new Function0() { // from class: com.kubi.tradingbotkit.business.strategyList.a
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return StrategyAdapter.m64079i(this.f52420b);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: j */
    public final void m64081j(@NotNull BaseViewHolder helper, @NotNull StrategyItemEntity strategy) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        CharSequence charSequence = strategy.getType() == null ? "" : (String) this.f52408k.get(strategy.getType());
        Integer type = strategy.getType();
        if (type != null && type.intValue() == 4) {
            helper.setGone(R$id.tagFlow, false);
            helper.setGone(R$id.tokensLl, true);
            helper.setText(R$id.symbolTv, helper.itemView.getContext().getString(R$string.kc_tb_spot_positions));
            helper.setText(R$id.strategyNameTv, charSequence);
            int i11 = R$id.failedSymbolsTv;
            List<CurrencyInfo> currencyInfo = strategy.getCurrencyInfo();
            helper.setText(i11, currencyInfo != null ? CollectionsKt.joinToString$default(currencyInfo, ",", null, null, 0, null, null, 62, null) : null);
        } else if (C26187b.m64127a(strategy)) {
            helper.setText(R$id.symbolTv, IKuMexService.m33249T(TradingBotKitDepend.f52488a.m64276c(), C27041f.m66668h(strategy.getSymbolCode()), false, 2, null).toString());
            helper.setGone(R$id.tagFlow, true);
            helper.setGone(R$id.tokensLl, false);
            View view = helper.getView(R$id.sideTv);
            Intrinsics.checkNotNullExpressionValue(view, "getView(...)");
            C40292f.m88770e(strategy, (BaseTextView) view);
            Unit unit = Unit.INSTANCE;
        } else {
            int i12 = R$id.symbolTv;
            SymbolInfoEntity symbolInfoEntityM85601B = C37890n.f85269a.m85601B(C27041f.m66668h(C40281a0.m88711n(strategy)));
            helper.setText(i12, C27041f.m66668h(symbolInfoEntityM85601B != null ? symbolInfoEntityM85601B.getShowSymbol() : null));
            helper.setGone(R$id.tagFlow, true);
            helper.setGone(R$id.tokensLl, false);
        }
        helper.setText(R$id.strategyNameTv, charSequence);
        View view2 = helper.getView(R$id.detailTv);
        Intrinsics.checkNotNullExpressionValue(view2, "getView(...)");
        C40285b1.m88725H(view2);
    }

    @Override // io.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public void convert(@NotNull BaseViewHolder helper, @NotNull StrategyItemEntity item) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        int itemViewType = helper.getItemViewType();
        if (itemViewType == -99) {
            m64080h(helper, item);
            return;
        }
        if (itemViewType == -1) {
            m64081j(helper, item);
            return;
        }
        if (itemViewType == 1) {
            C40281a0.m88709l(item, helper);
            return;
        }
        if (itemViewType == 2) {
            C40320t.m88828a(item, helper);
            return;
        }
        if (itemViewType == 3) {
            C40292f.m88769d(item, helper);
            return;
        }
        if (itemViewType == 4) {
            C40303k0.m88808f(item, helper);
            return;
        }
        if (itemViewType == 5) {
            C40287c0.m88764b(item, helper);
            return;
        }
        switch (itemViewType) {
            case 7:
                C40297h0.m88788e(item, helper);
                break;
            case 8:
                C40318s.m88826b(item, helper);
                break;
            case 9:
                C40308n.m88814c(item, helper);
                break;
            case 10:
                C40314q.m88819c(item, helper);
                break;
            case 11:
                C40322u.m88832a(item, helper);
                break;
            case 12:
                C40302k.m88798e(item, helper);
                break;
            case 13:
                C40286c.m88760c(item, helper);
                break;
        }
    }
}
