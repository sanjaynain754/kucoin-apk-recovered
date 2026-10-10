package com.kubi.mart.sidebar.spot.tablist;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.data.entity.EtfCoinEntity;
import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.data.entity.TradeItemBean;
import com.kubi.margin.api.IMarginService;
import com.kubi.mart.R$color;
import com.kubi.mart.R$id;
import com.kubi.mart.R$layout;
import com.kubi.mart.R$string;
import com.kubi.quotefacade.api.IQuoteFacadeService;
import com.kubi.resources.C22890g;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.function.language.MultiLanguageManager;
import com.kubi.sdk.site.C24129b;
import com.kubi.sdk.site.SiteVisibleConfigKey;
import com.kubi.spot.api.ISpotService;
import com.kubi.utils.C27100x0;
import com.kubi.utils.ToastCompat;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
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
import p268fq.C37578a;
import p268fq.C37579b;
import p311hf.C38183a;
import p569qq.C43852m;
import p852kotlin.Metadata;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import rs.C44172b;

/* JADX INFO: compiled from: SpotSidebarTabListAdapter.kt */
/* JADX INFO: loaded from: classes28.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u000b\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J*\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\tJ\u0010\u0010\u0014\u001a\u00020\u00132\b\u0010\u000b\u001a\u0004\u0018\u00010\tJ\u001c\u0010\u0015\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u00032\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002H\u0014J\u0018\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0002H\u0002J\u0018\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0002H\u0002J\u0018\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0002H\u0002J\u0018\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\rH\u0002J\u0010\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0002H\u0002R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u001e"}, m90084d2 = {"Lcom/kubi/mart/sidebar/spot/tablist/SpotSidebarTabListAdapter;", "Lio/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/kubi/data/entity/TradeItemBean;", "Lio/chad/library/adapter/base/BaseViewHolder;", "<init>", "()V", "fragment", "Lcom/kubi/sdk/BaseFragment;", "sidebarType", "", "tabType", "symbolCode", "indexOfLongPress", "", "getIndexOfLongPress", "()I", "setIndexOfLongPress", "(I)V", "attachHost", "", "changeSymbolCode", "convert", "helper", "item", "renderInfo", "differentiatedShowHiden", "renderItemBackground", "onItemClick", ViewProps.POSITION, "jumpInner", "MartLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class SpotSidebarTabListAdapter extends BaseQuickAdapter<TradeItemBean, BaseViewHolder> {

    /* JADX INFO: renamed from: i */
    @Nullable
    public BaseFragment f34814i;

    /* JADX INFO: renamed from: j */
    @Nullable
    public String f34815j;

    /* JADX INFO: renamed from: k */
    @Nullable
    public String f34816k;

    /* JADX INFO: renamed from: l */
    @NotNull
    public String f34817l;

    /* JADX INFO: renamed from: m */
    public int f34818m;

    public SpotSidebarTabListAdapter() {
        super(R$layout.mart_item_spot_sidebar);
        setHasStableIds(true);
        this.f34817l = "";
        this.f34818m = -1;
    }

    /* JADX INFO: renamed from: m */
    public static final Unit m41580m(TradeItemBean tradeItemBean, BaseViewHolder baseViewHolder) {
        ISpotService.Companion companion = ISpotService.f49646a;
        if (companion.get().mo59996i(tradeItemBean)) {
            baseViewHolder.setGone(R$id.tv_new_coin_reserve, false);
            baseViewHolder.setGone(R$id.ll_price_and_percent, false);
            baseViewHolder.setGone(R$id.tv_opening_call_auction, true);
        } else if (companion.get().mo60000m(tradeItemBean)) {
            baseViewHolder.setGone(R$id.tv_new_coin_reserve, true);
            baseViewHolder.setGone(R$id.ll_price_and_percent, false);
            baseViewHolder.setGone(R$id.tv_opening_call_auction, false);
        } else {
            baseViewHolder.setGone(R$id.tv_opening_call_auction, false);
            baseViewHolder.setGone(R$id.tv_new_coin_reserve, false);
            baseViewHolder.setGone(R$id.ll_price_and_percent, true);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: i */
    public final void m41582i(@NotNull BaseFragment fragment, @NotNull String sidebarType, @Nullable String str, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(sidebarType, "sidebarType");
        this.f34815j = sidebarType;
        this.f34816k = str2;
        this.f34814i = fragment;
        m41583j(str);
    }

    /* JADX INFO: renamed from: j */
    public final void m41583j(@Nullable String str) {
        if (str == null) {
            str = "";
        }
        this.f34817l = str;
    }

    @Override // io.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public void convert(@Nullable BaseViewHolder baseViewHolder, @Nullable TradeItemBean tradeItemBean) {
        if (baseViewHolder == null || tradeItemBean == null) {
            return;
        }
        m41589q(baseViewHolder, tradeItemBean);
    }

    /* JADX INFO: renamed from: l */
    public final void m41585l(final BaseViewHolder baseViewHolder, final TradeItemBean tradeItemBean) {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.mart.sidebar.spot.tablist.a0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SpotSidebarTabListAdapter.m41580m(tradeItemBean, baseViewHolder);
            }
        });
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final int getF34818m() {
        return this.f34818m;
    }

    /* JADX INFO: renamed from: o */
    public final void m41587o(TradeItemBean tradeItemBean) {
        if (Intrinsics.areEqual(this.f34815j, "spot_grid")) {
            InterfaceC37754f.a.m85139k(C37304a.f82764a, tradeItemBean.getSymbol(), null, null, null, 14, null);
        } else {
            InterfaceC37754f.a.m85140l(C37304a.f82764a, tradeItemBean.getSymbol(), Boolean.TRUE, null, null, null, null, 60, null);
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m41588p(TradeItemBean tradeItemBean, int i11) {
        ISpotService.Companion companion = ISpotService.f49646a;
        ISpotService iSpotService = companion.get();
        if (!Intrinsics.areEqual(this.f34815j, "spot_trade") && !Intrinsics.areEqual(this.f34815j, "spot_grid")) {
            if (Intrinsics.areEqual(this.f34815j, "spot_kline")) {
                ISpotService.m59982A(iSpotService, tradeItemBean.getSymbol(), null, null, null, 14, null);
            }
        } else {
            if (iSpotService.mo60008u(tradeItemBean.getSymbol())) {
                SymbolInfoEntity symbolInfoEntity = tradeItemBean.getSymbolInfoEntity();
                ToastCompat.m66441G(TextUtils.isEmpty(symbolInfoEntity.getDisabledTip()) ? this.mContext.getString(R$string.current_trade_pause) : symbolInfoEntity.getDisabledTip(), new Object[0]);
                return;
            }
            if (!companion.get().mo59996i(tradeItemBean) && companion.get().mo60000m(tradeItemBean)) {
                ISpotService.m59982A(iSpotService, tradeItemBean.getSymbol(), null, null, null, 14, null);
            } else {
                m41587o(tradeItemBean);
            }
            C43852m.m96590b(C37578a.f83542a.m84710a(), "symbolSelectTabList", String.valueOf(i11 + 1), TuplesKt.m90091to("symbol", tradeItemBean.getSymbol()));
        }
    }

    /* JADX INFO: renamed from: q */
    public final BaseViewHolder m41589q(final BaseViewHolder baseViewHolder, final TradeItemBean tradeItemBean) {
        Context context = baseViewHolder.itemView.getContext();
        baseViewHolder.setText(R$id.tv_trade_pair, C37579b.m84714c(tradeItemBean, 0, 0, 3, null));
        TextView textView = (TextView) baseViewHolder.getView(R$id.tv_price);
        Intrinsics.checkNotNull(textView);
        C44172b.m97383c(textView, null, false, 3, null);
        String strM85579c = "--";
        if (!tradeItemBean.getSymbolInfoEntity().isPreviewEnableShow() && tradeItemBean.getLastDealPrice() > 0.0d) {
            strM85579c = C37886j.m85579c(new BigDecimal(String.valueOf(tradeItemBean.getLastDealPrice())), tradeItemBean.getSymbol(), (124 & 2) != 0 ? RoundingMode.DOWN : null, (124 & 4) != 0 ? false : false, (124 & 8) != 0 ? false : false, (124 & 16) != 0, (124 & 32) == 0 ? 0 : 0, (124 & 64) != 0 ? MultiLanguageManager.f46811g.getLocale() : null);
        }
        textView.setText(strM85579c);
        TextView textView2 = (TextView) baseViewHolder.getView(R$id.tv_percent);
        textView2.setText(tradeItemBean.getFormatChangeRateV2());
        Intrinsics.checkNotNull(context);
        textView2.setTextColor(C22890g.m54278c(context, C27039d.m66646f(tradeItemBean.getChangeRate()), R$color.c_text40));
        baseViewHolder.setGone(R$id.tv_label, tradeItemBean.getMark() == 1);
        boolean z11 = tradeItemBean.getSymbolInfoEntity().isShowMarginLeverLabel() && C38183a.m86145a();
        int i11 = R$id.tv_lever;
        baseViewHolder.setGone(i11, z11);
        baseViewHolder.setText(i11, IMarginService.f32724a.get().mo37960t(tradeItemBean));
        int i12 = R$id.tv_etf_label;
        baseViewHolder.setGone(i12, tradeItemBean.getSymbolInfoEntity().isEtfSymbol() && C24129b.m58030b(SiteVisibleConfigKey.ETF));
        baseViewHolder.setGone(R$id.tv_ready, tradeItemBean.getSymbolInfoEntity().isPreviewEnableShow());
        int i13 = R$id.tvLabel;
        baseViewHolder.setGone(i13, !TextUtils.isEmpty(tradeItemBean.getCoinLabel()));
        baseViewHolder.setText(i13, C27041f.m66668h(tradeItemBean.getCoinLabel()));
        baseViewHolder.setVisible(R$id.iv_fav, IQuoteFacadeService.f41383a.get().mo50681F(tradeItemBean) && !Intrinsics.areEqual(this.f34816k, "FAVORITE"));
        if (tradeItemBean.getSymbolInfoEntity().isEtfSymbol()) {
            C37890n c37890n = C37890n.f85269a;
            String baseCurrency = tradeItemBean.getSymbolInfoEntity().getBaseCurrency();
            Intrinsics.checkNotNullExpressionValue(baseCurrency, "getBaseCurrency(...)");
            EtfCoinEntity etfCoinEntityM85615w = c37890n.m85615w(baseCurrency);
            if (etfCoinEntityM85615w != null) {
                boolean zAreEqual = Intrinsics.areEqual(etfCoinEntityM85615w.getBuyType(), "L");
                String string = context.getString(zAreEqual ? R$string.etf_label_times_long : R$string.etf_label_times_short, etfCoinEntityM85615w.getMultiple());
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                TextView textView3 = (TextView) baseViewHolder.getView(i12);
                if (textView3 != null) {
                    textView3.setText(string);
                    textView3.setTextColor(C22890g.m54281f(context, zAreEqual));
                    textView3.setBackgroundDrawable(C22890g.m54285j(zAreEqual, context));
                }
            } else {
                baseViewHolder.setGone(i12, false);
            }
        }
        int i14 = R$id.tvSymbolOfflineAlert;
        ISpotService iSpotService = ISpotService.f49646a.get();
        String symbol = tradeItemBean.getSymbol();
        Intrinsics.checkNotNullExpressionValue(symbol, "getSymbol(...)");
        baseViewHolder.setGone(i14, iSpotService.mo59994f(symbol));
        m41585l(baseViewHolder, tradeItemBean);
        m41590s(baseViewHolder, tradeItemBean);
        View itemView = baseViewHolder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        C27046k.m66710y(itemView, 1000L, new Function0() { // from class: com.kubi.mart.sidebar.spot.tablist.z
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SpotSidebarTabListAdapter.m41581r(this.f34866b, tradeItemBean, baseViewHolder);
            }
        });
        return baseViewHolder;
    }

    /* JADX INFO: renamed from: s */
    public final BaseViewHolder m41590s(BaseViewHolder baseViewHolder, TradeItemBean tradeItemBean) {
        baseViewHolder.itemView.setBackgroundResource((tradeItemBean.getSymbol().equals(this.f34817l) || this.f34818m == baseViewHolder.getAdapterPosition()) ? R$color.emphasis2 : R$color.c_bulletLayer);
        return baseViewHolder;
    }

    /* JADX INFO: renamed from: t */
    public final void m41591t(int i11) {
        this.f34818m = i11;
    }

    /* JADX INFO: renamed from: r */
    public static final Unit m41581r(SpotSidebarTabListAdapter spotSidebarTabListAdapter, TradeItemBean tradeItemBean, BaseViewHolder baseViewHolder) {
        spotSidebarTabListAdapter.m41588p(tradeItemBean, baseViewHolder.getAdapterPosition());
        return Unit.INSTANCE;
    }
}
