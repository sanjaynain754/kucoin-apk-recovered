package com.kubi.margin.market;

import android.content.Context;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.TextView;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.data.entity.EtfCoinEntity;
import com.kubi.data.entity.MarginSymbolInfo;
import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.data.entity.TradeItemBean;
import com.kubi.margin.R$color;
import com.kubi.margin.R$id;
import com.kubi.margin.R$layout;
import com.kubi.margin.R$string;
import com.kubi.margin.trade.MarginConfigManager;
import com.kubi.monitor.EventParametersBuilder;
import com.kubi.resources.C22890g;
import com.kubi.sdk.base.p113ui.OldBaseFragment;
import com.kubi.sdk.function.language.MultiLanguageManager;
import com.kubi.spot.api.ISpotService;
import com.kubi.utils.C27014a1;
import com.kubi.utils.C27017c;
import com.kubi.utils.C27096v0;
import com.kubi.utils.ToastCompat;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import com.tencent.bugly.proguard.C33820nf;
import f00.C37304a;
import g00.InterfaceC37754f;
import gf.C37886j;
import gf.C37890n;
import io.chad.library.adapter.base.BaseQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import java.math.BigDecimal;
import java.math.RoundingMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p429lf.C42180b;
import p623sp.C44534a;
import p671uq.C45290a;
import p698vp.C45612b;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;
import rs.C44172b;

/* JADX INFO: compiled from: MarginSymbolsListAdapter.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B7\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u0002H\u0014J\u0018\u0010\n\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u0007H\u0002J\u0014\u0010!\u001a\u00020\"*\u00020\u00022\b\b\u0002\u0010#\u001a\u00020\u0007R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\f\u001a\u0004\u0018\u00010\u0002X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0012\"\u0004\b\u001b\u0010\u0014¨\u0006$"}, m90084d2 = {"Lcom/kubi/margin/market/MarginSymbolsListAdapter;", "Lio/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/kubi/data/entity/TradeItemBean;", "Lio/chad/library/adapter/base/BaseViewHolder;", "fragment", "Lcom/kubi/sdk/base/ui/OldBaseFragment;", "tradeType", "", "symbols", "", "toMarket", "", "tradeItemBean", "<init>", "(Lcom/kubi/sdk/base/ui/OldBaseFragment;ILjava/lang/String;ZLcom/kubi/data/entity/TradeItemBean;)V", "getFragment", "()Lcom/kubi/sdk/base/ui/OldBaseFragment;", "getTradeType", "()I", "setTradeType", "(I)V", "getTradeItemBean", "()Lcom/kubi/data/entity/TradeItemBean;", "setTradeItemBean", "(Lcom/kubi/data/entity/TradeItemBean;)V", "indexLongClick", "getIndexLongClick", "setIndexLongClick", "convert", "", "helper", "item", ViewProps.POSITION, "getPairShowSymbol", "Lcom/kubi/utils/StyledText;", "fontSize", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nMarginSymbolsListAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarginSymbolsListAdapter.kt\ncom/kubi/margin/market/MarginSymbolsListAdapter\n+ 2 DurationTracker.kt\ncom/kubi/monitor/DurationTrackerKt\n*L\n1#1,160:1\n46#2,14:161\n*S KotlinDebug\n*F\n+ 1 MarginSymbolsListAdapter.kt\ncom/kubi/margin/market/MarginSymbolsListAdapter\n*L\n139#1:161,14\n*E\n"})
public final class MarginSymbolsListAdapter extends BaseQuickAdapter<TradeItemBean, BaseViewHolder> {

    /* JADX INFO: renamed from: i */
    @NotNull
    public final OldBaseFragment f33212i;

    /* JADX INFO: renamed from: j */
    public int f33213j;

    /* JADX INFO: renamed from: k */
    @Nullable
    public final String f33214k;

    /* JADX INFO: renamed from: l */
    public final boolean f33215l;

    /* JADX INFO: renamed from: m */
    @Nullable
    public TradeItemBean f33216m;

    /* JADX INFO: renamed from: n */
    public int f33217n;

    public /* synthetic */ MarginSymbolsListAdapter(OldBaseFragment oldBaseFragment, int i11, String str, boolean z11, TradeItemBean tradeItemBean, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(oldBaseFragment, i11, str, (i12 & 8) != 0 ? false : z11, (i12 & 16) != 0 ? null : tradeItemBean);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarginSymbolsListAdapter(@NotNull OldBaseFragment fragment, int i11, @Nullable String str, boolean z11, @Nullable TradeItemBean tradeItemBean) {
        super(R$layout.bmargin_item_view_toggle_symbols);
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        this.f33212i = fragment;
        this.f33213j = i11;
        this.f33214k = str;
        this.f33215l = z11;
        this.f33216m = tradeItemBean;
        setHasStableIds(true);
        this.f33217n = -1;
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ C27096v0 m38837l(MarginSymbolsListAdapter marginSymbolsListAdapter, TradeItemBean tradeItemBean, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = 14;
        }
        return marginSymbolsListAdapter.m38840k(tradeItemBean, i11);
    }

    @Override // io.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void convert(@NotNull final BaseViewHolder helper, @NotNull final TradeItemBean item) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        int i11 = R$id.tv_price;
        View view = helper.getView(i11);
        Intrinsics.checkNotNullExpressionValue(view, "getView(...)");
        boolean z11 = false;
        C44172b.m97383c((TextView) view, null, false, 3, null);
        BaseViewHolder text = helper.setText(R$id.tv_trade_pair, m38837l(this, item, 0, 1, null));
        int i12 = R$id.tv_lever;
        BaseViewHolder gone = text.setGone(i12, item.getSymbolInfoEntity().isShowMarginLeverLabel());
        StringBuilder sb2 = new StringBuilder();
        MarginConfigManager marginConfigManager = MarginConfigManager.f33681a;
        sb2.append(C42180b.m92640e(marginConfigManager.m39883b1(item, this.f33213j), null, 4, false, false, false, 0, null, 125, null));
        sb2.append('x');
        BaseViewHolder text2 = gone.setText(i12, sb2.toString()).setText(i11, item.getSymbolInfoEntity().isPreviewEnableShow() ? C33820nf.f71144W : C37886j.m85579c(new BigDecimal(String.valueOf(item.getLastDealPrice())), item.getSymbol(), (124 & 2) != 0 ? RoundingMode.DOWN : null, (124 & 4) != 0 ? false : false, (124 & 8) != 0 ? false : false, (124 & 16) != 0, (124 & 32) == 0 ? 0 : 0, (124 & 64) != 0 ? MultiLanguageManager.f46811g.getLocale() : null));
        int i13 = R$id.tv_percent;
        BaseViewHolder text3 = text2.setText(i13, item.getFormatChangeRateV2());
        Context context = helper.itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        BaseViewHolder gone2 = text3.setTextColor(i13, C22890g.m54278c(context, C27039d.m66646f(item.getChangeRate()), R$color.c_text40)).setGone(R$id.tv_label, item.getMark() == 1);
        int i14 = R$id.tv_etf_label;
        BaseViewHolder gone3 = gone2.setGone(i14, item.getSymbolInfoEntity().isEtfSymbol()).setGone(R$id.tv_ready, item.getSymbolInfoEntity().isPreviewEnableShow());
        int i15 = R$id.iv_fav;
        if (C27025c.m66566d(Boolean.valueOf(C45612b.m100697c(item))) && !Intrinsics.areEqual(this.f33214k, "favor")) {
            z11 = true;
        }
        gone3.setVisible(i15, z11).setOnClickListener(R$id.fl_root, new View.OnClickListener() { // from class: com.kubi.margin.market.c1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                MarginSymbolsListAdapter.m38836i(item, this, helper, view2);
            }
        });
        if (item.getSymbolInfoEntity().isEtfSymbol()) {
            C37890n c37890n = C37890n.f85269a;
            String baseCurrency = item.getSymbolInfoEntity().getBaseCurrency();
            Intrinsics.checkNotNullExpressionValue(baseCurrency, "getBaseCurrency(...)");
            EtfCoinEntity etfCoinEntityM85615w = c37890n.m85615w(baseCurrency);
            if (etfCoinEntityM85615w != null) {
                helper.setText(i14, this.mContext.getString(Intrinsics.areEqual(etfCoinEntityM85615w.getBuyType(), "L") ? R$string.etf_label_times_long : R$string.etf_label_times_short, etfCoinEntityM85615w.getMultiple()));
                TextView textView = (TextView) helper.getView(i14);
                boolean zAreEqual = Intrinsics.areEqual(etfCoinEntityM85615w.getBuyType(), "L");
                Context mContext = this.mContext;
                Intrinsics.checkNotNullExpressionValue(mContext, "mContext");
                textView.setTextColor(C22890g.m54281f(mContext, zAreEqual));
                Context mContext2 = this.mContext;
                Intrinsics.checkNotNullExpressionValue(mContext2, "mContext");
                textView.setBackgroundDrawable(C22890g.m54285j(zAreEqual, mContext2));
            }
        }
        View view2 = helper.getView(R$id.margin_offline_alert);
        Intrinsics.checkNotNullExpressionValue(view2, "getView(...)");
        TextView textView2 = (TextView) view2;
        MarginSymbolInfo marginSymbolInfoM39881Z0 = marginConfigManager.m39881Z0(item.getSymbol());
        C44534a.m98546a(textView2, marginSymbolInfoM39881Z0 != null ? marginSymbolInfoM39881Z0.getOfflineInfo() : null);
        View view3 = helper.itemView;
        String symbol = item.getSymbol();
        TradeItemBean tradeItemBean = this.f33216m;
        view3.setBackgroundResource((TextUtils.equals(symbol, tradeItemBean != null ? tradeItemBean.getSymbol() : null) || this.f33217n == helper.getAdapterPosition()) ? R$color.emphasis2 : R$color.c_bulletLayer);
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final int getF33217n() {
        return this.f33217n;
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public final C27096v0 m38840k(@NotNull TradeItemBean tradeItemBean, int i11) {
        Intrinsics.checkNotNullParameter(tradeItemBean, "<this>");
        C27096v0 c27096v0M66903c = new C27096v0().m66904d(tradeItemBean.getSymbolInfoEntity().getBaseCurrencyName(), i11).m66903c('/' + tradeItemBean.getSymbolInfoEntity().getQuoteCurrencyName(), new ForegroundColorSpan(C27017c.f54310a.m66512a(R$color.emphasis40)), new AbsoluteSizeSpan(10, true));
        Intrinsics.checkNotNullExpressionValue(c27096v0M66903c, "append(...)");
        return c27096v0M66903c;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final int getF33213j() {
        return this.f33213j;
    }

    /* JADX INFO: renamed from: n */
    public final void m38842n(int i11) {
        this.f33217n = i11;
    }

    /* JADX INFO: renamed from: o */
    public final void m38843o(@Nullable TradeItemBean tradeItemBean) {
        this.f33216m = tradeItemBean;
    }

    /* JADX INFO: renamed from: p */
    public final void m38844p(TradeItemBean tradeItemBean, int i11) {
        if (this.f33215l) {
            MarginMarketActivity.Companion.toMarketActivity$default(MarginMarketActivity.f33182O, tradeItemBean, this.f33213j, null, 4, null);
        } else {
            if (!tradeItemBean.getSymbolInfoEntity().isEnableTrading() && !ISpotService.f49646a.get().mo59992c(tradeItemBean.getSymbol())) {
                SymbolInfoEntity symbolInfoEntity = tradeItemBean.getSymbolInfoEntity();
                ToastCompat.m66441G(TextUtils.isEmpty(symbolInfoEntity.getDisabledTip()) ? this.mContext.getString(R$string.current_trade_pause) : symbolInfoEntity.getDisabledTip(), new Object[0]);
                return;
            }
            if ("click_margin_symbol_list".length() == 0 || "click_start_btn".length() == 0) {
                C44128b.m97270n("Monitor", "eventName(click_margin_symbol_list) or pointName(click_start_btn) is null");
            } else {
                EventParametersBuilder eventParametersBuilderAcquire = EventParametersBuilder.INSTANCE.acquire();
                eventParametersBuilderAcquire.m42382c("marginType", getF33213j() == 1 ? "cross" : "isolated");
                C45290a.f101823a.m100101b("click_margin_symbol_list", "click_start_btn", "", eventParametersBuilderAcquire.m42380a());
            }
            InterfaceC37754f.a.m85141m(C37304a.f82764a, Long.valueOf(this.f33213j), tradeItemBean.getSymbol(), Boolean.TRUE, null, null, null, null, null, 248, null);
        }
        tradeItemBean.setSymbolInfoEntity(null);
    }

    /* JADX INFO: renamed from: i */
    public static final void m38836i(TradeItemBean tradeItemBean, MarginSymbolsListAdapter marginSymbolsListAdapter, BaseViewHolder baseViewHolder, View view) {
        if (C27014a1.m66501a(view)) {
            return;
        }
        if (tradeItemBean.needPullPreviewInfo()) {
            ISpotService.m59983d(ISpotService.f49646a.get(), marginSymbolsListAdapter.mContext, tradeItemBean, null, 4, null);
        } else {
            marginSymbolsListAdapter.m38844p(tradeItemBean, baseViewHolder.getAdapterPosition());
        }
    }
}
