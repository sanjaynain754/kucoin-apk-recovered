package com.kubi.margin.market.recommend;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwnerKt;
import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.data.entity.TradeItemBean;
import com.kubi.kumex.api.IKuMexService;
import com.kubi.margin.R$color;
import com.kubi.margin.R$id;
import com.kubi.margin.R$layout;
import com.kubi.margin.R$string;
import com.kubi.margin.market.info.MarketCoinInfoEarn;
import com.kubi.margin.market.info.MarketCoinInfoGrid;
import com.kubi.margin.market.info.MarketCoinInfoQuest;
import com.kubi.resources.C22890g;
import com.kubi.resources.dialog.AlertDialogFragmentHelper;
import com.kubi.resources.widget.DashTextView;
import com.kubi.router.core.Router;
import com.kubi.router.model.IRedirect;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.function.language.MultiLanguageManager;
import com.kubi.sdk.site.info.SiteInfoManager;
import com.kubi.user.api.IUserService;
import com.kubi.utils.C27017c;
import com.kubi.utils.C27096v0;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.DowngradeExKt;
import f00.C37304a;
import g00.InterfaceC37754f;
import g00.InterfaceC37758j;
import gf.C37886j;
import gf.C37890n;
import gp.InterfaceC37978b;
import io.chad.library.adapter.base.BaseMultiItemQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.C41696j;
import mp.C42579a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p402kf.C41016c;
import p429lf.C42179a;
import p429lf.C42180b;
import p569qq.C43852m;
import p698vp.C45615e;
import p698vp.C45619i;
import p852kotlin.Metadata;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: MarginMarketRecommendAdapter.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B'\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u001c\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00032\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002H\u0014J\u001a\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00032\b\u0010\u0017\u001a\u0004\u0018\u00010\u0019H\u0003J\u001a\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00032\b\u0010\u0017\u001a\u0004\u0018\u00010\u001bH\u0002J\u001a\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00032\b\u0010\u0017\u001a\u0004\u0018\u00010\u001bH\u0003J$\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00032\b\u0010\u0017\u001a\u0004\u0018\u00010\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0002J\u0010\u0010!\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0003H\u0002R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\""}, m90084d2 = {"Lcom/kubi/margin/market/recommend/MarginMarketRecommendAdapter;", "Lio/chad/library/adapter/base/BaseMultiItemQuickAdapter;", "Lcom/kubi/margin/market/recommend/MarginMarketRecommendEntity;", "Lio/chad/library/adapter/base/BaseViewHolder;", "fragment", "Lcom/kubi/sdk/BaseFragment;", "tradeItemBean", "Lcom/kubi/data/entity/TradeItemBean;", "data", "", "<init>", "(Lcom/kubi/sdk/BaseFragment;Lcom/kubi/data/entity/TradeItemBean;Ljava/util/List;)V", "getFragment", "()Lcom/kubi/sdk/BaseFragment;", "getTradeItemBean", "()Lcom/kubi/data/entity/TradeItemBean;", "showApr", "", "getShowApr", "()Z", "convert", "", "helper", "item", "convertActivity", "Lcom/kubi/margin/market/info/MarketCoinInfoQuest;", "convertRobotSpot", "Lcom/kubi/margin/market/info/MarketCoinInfoGrid;", "convertRobotFuture", "convertEarn", "Lcom/kubi/margin/market/info/MarketCoinInfoEarn;", "coinName", "", "convertOtc", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nMarginMarketRecommendAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarginMarketRecommendAdapter.kt\ncom/kubi/margin/market/recommend/MarginMarketRecommendAdapter\n+ 2 FlavorEx.kt\ncom/kubi/kucoin/helper/FlavorExKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,325:1\n17#2,2:326\n1818#3,4:328\n*S KotlinDebug\n*F\n+ 1 MarginMarketRecommendAdapter.kt\ncom/kubi/margin/market/recommend/MarginMarketRecommendAdapter\n*L\n64#1:326,2\n261#1:328,4\n*E\n"})
public final class MarginMarketRecommendAdapter extends BaseMultiItemQuickAdapter<MarginMarketRecommendEntity, BaseViewHolder> {

    /* JADX INFO: renamed from: i */
    @NotNull
    public final BaseFragment f33409i;

    /* JADX INFO: renamed from: j */
    @NotNull
    public final TradeItemBean f33410j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarginMarketRecommendAdapter(@NotNull BaseFragment fragment, @NotNull TradeItemBean tradeItemBean, @Nullable List<MarginMarketRecommendEntity> list) {
        super(list);
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(tradeItemBean, "tradeItemBean");
        this.f33409i = fragment;
        this.f33410j = tradeItemBean;
        addItemType(0, R$layout.bmargin_item_recommend_activity);
        addItemType(1, R$layout.bmargin_item_recommend_robot_spot);
        addItemType(2, R$layout.bmargin_item_recommend_robot_future);
        addItemType(3, R$layout.bmargin_item_recommend_earn);
        addItemType(4, R$layout.bmargin_item_recommend_otc);
    }

    /* JADX INFO: renamed from: C */
    public static final Unit m39151C(MarketCoinInfoGrid marketCoinInfoGrid) {
        Router.f46192a.m56184f(C45619i.f102747a.m100729b(marketCoinInfoGrid.getSymbol())).m4048k();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: D */
    public static final Unit m39152D(MarginMarketRecommendAdapter marginMarketRecommendAdapter) {
        AlertDialogFragmentHelper alertDialogFragmentHelperM54162S4 = AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54153J4(R$string.robot_min_invest_tip).m54162S4(R$string.already_know, null);
        FragmentManager childFragmentManager = marginMarketRecommendAdapter.f33409i.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        alertDialogFragmentHelperM54162S4.show(childFragmentManager, "min_vest_tip");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: F */
    public static final Unit m39153F(MarginMarketRecommendAdapter marginMarketRecommendAdapter) {
        AlertDialogFragmentHelper alertDialogFragmentHelperM54162S4 = AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54153J4(R$string.robot_min_invest_tip).m54162S4(R$string.already_know, null);
        FragmentManager childFragmentManager = marginMarketRecommendAdapter.f33409i.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        alertDialogFragmentHelperM54162S4.show(childFragmentManager, "min_vest_tip");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: G */
    public static final Unit m39154G(MarginMarketRecommendAdapter marginMarketRecommendAdapter, MarketCoinInfoGrid marketCoinInfoGrid) {
        C43852m.m96590b("B4candle", "RecommendModular", "2", TuplesKt.m90091to("symbol", marginMarketRecommendAdapter.f33410j.getSymbol()));
        InterfaceC37754f.a.m85139k(C37304a.f82764a, marketCoinInfoGrid.getSymbol(), null, null, null, 14, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: s */
    public static final Unit m39165s(MarginMarketRecommendAdapter marginMarketRecommendAdapter, final MarketCoinInfoQuest marketCoinInfoQuest) {
        C43852m.m96590b("B4candle", "RecommendModular", "1", TuplesKt.m90091to("symbol", marginMarketRecommendAdapter.f33410j.getSymbol()));
        IUserService.O(C42579a.f94275a.m93347g(), (Map) null, IRedirect.INSTANCE.obtain(new Function0() { // from class: com.kubi.margin.market.recommend.h
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MarginMarketRecommendAdapter.m39166t(marketCoinInfoQuest);
            }
        }), 1, (Object) null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: v */
    public static final Unit m39167v(final MarginMarketRecommendAdapter marginMarketRecommendAdapter) {
        C43852m.m96590b("B4candle", "RecommendModular", "4", TuplesKt.m90091to("symbol", marginMarketRecommendAdapter.f33410j.getSymbol()));
        IUserService.O(C42579a.f94275a.m93347g(), (Map) null, IRedirect.INSTANCE.obtain(new Function0() { // from class: com.kubi.margin.market.recommend.i
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MarginMarketRecommendAdapter.m39168w(this.f33431b);
            }
        }), 1, (Object) null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: w */
    public static final Unit m39168w(MarginMarketRecommendAdapter marginMarketRecommendAdapter) {
        Router.f46192a.m56184f(C45619i.f102747a.m100728a(marginMarketRecommendAdapter.f33410j.getSymbolInfoEntity().getBaseCurrency())).m4048k();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: y */
    public static final Unit m39169y(MarginMarketRecommendAdapter marginMarketRecommendAdapter) {
        C43852m.m96590b("B4candle", "RecommendModular", "5", TuplesKt.m90091to("symbol", marginMarketRecommendAdapter.f33410j.getSymbol()));
        InterfaceC37758j.a.m85163l(C37304a.f82764a, null, C41016c.m89965c(), marginMarketRecommendAdapter.f33410j.getSymbolInfoEntity().getBaseCurrency(), null, null, null, null, 121, null);
        return Unit.INSTANCE;
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: A */
    public final void m39170A(BaseViewHolder baseViewHolder, final MarketCoinInfoGrid marketCoinInfoGrid) {
        BigDecimal bigDecimalM66536f;
        if (marketCoinInfoGrid == null) {
            return;
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) baseViewHolder.getView(R$id.cl_root);
        int i11 = R$id.ll_apr;
        View view = baseViewHolder.getView(i11);
        View view2 = baseViewHolder.getView(R$id.ll_invest);
        TextView textView = (TextView) baseViewHolder.getView(R$id.tv_symbol);
        TextView textView2 = (TextView) baseViewHolder.getView(R$id.tv_price);
        TextView textView3 = (TextView) baseViewHolder.getView(R$id.tv_change_rate);
        TextView textView4 = (TextView) baseViewHolder.getView(R$id.tv_apr);
        TextView textView5 = (TextView) baseViewHolder.getView(R$id.tv_invest);
        DashTextView dashTextView = (DashTextView) baseViewHolder.getView(R$id.tv_invest_label);
        TextView textView6 = (TextView) baseViewHolder.getView(R$id.tv_lever);
        textView.setText(IKuMexService.m33249T(C42579a.f94275a.m93342b(), C27041f.m66668h(marketCoinInfoGrid.getSymbol()), false, 2, null));
        view.setVisibility(m39172H() ? 0 : 8);
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        ConstraintLayout.LayoutParams layoutParams2 = layoutParams instanceof ConstraintLayout.LayoutParams ? (ConstraintLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            layoutParams2.topToBottom = m39172H() ? i11 : R$id.tv_subtitle;
            ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = (int) ((m39172H() ? 6 : 12) * this.mContext.getResources().getDisplayMetrics().density);
            view2.setLayoutParams(layoutParams2);
        }
        if (m39172H()) {
            Context mContext = this.mContext;
            Intrinsics.checkNotNullExpressionValue(mContext, "mContext");
            textView4.setTextColor(C22890g.m54291p(mContext));
            BigDecimal bigDecimalM66671k = C27041f.m66671k(marketCoinInfoGrid.getTodayTopProfitRateYear());
            textView4.setText(C42180b.m92649n(bigDecimalM66671k != null ? C42180b.m92642g(bigDecimalM66671k, null, null, 0, false, true, false, 47, null) : null));
        }
        String minAmount = marketCoinInfoGrid.getMinAmount();
        textView5.setText(C27041f.m66669i((minAmount == null || (bigDecimalM66536f = DowngradeExKt.m66536f(minAmount)) == null) ? null : C42180b.m92640e(bigDecimalM66536f, null, 0, false, false, true, 0, null, 111, null), "--"));
        dashTextView.setNeedDash(true);
        Intrinsics.checkNotNull(dashTextView);
        C27046k.m66711z(dashTextView, 0L, new Function0() { // from class: com.kubi.margin.market.recommend.f
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MarginMarketRecommendAdapter.m39152D(this.f33428b);
            }
        }, 1, null);
        BigDecimal price = marketCoinInfoGrid.getPrice();
        textView2.setText(C27041f.m66669i(price != null ? C37886j.m85579c(price, this.f33410j.getSymbol(), (124 & 2) != 0 ? RoundingMode.DOWN : null, (124 & 4) != 0 ? false : false, (124 & 8) != 0 ? false : false, (124 & 16) != 0, (124 & 32) == 0 ? 0 : 0, (124 & 64) != 0 ? MultiLanguageManager.f46811g.getLocale() : null) : null, "--"));
        BigDecimal changeRate = marketCoinInfoGrid.getChangeRate();
        textView3.setText(C42180b.m92649n(changeRate != null ? C42180b.m92642g(changeRate, null, null, 0, true, false, false, 55, null) : null));
        Context mContext2 = this.mContext;
        Intrinsics.checkNotNullExpressionValue(mContext2, "mContext");
        textView3.setTextColor(C22890g.m54279d(mContext2, C27039d.m66647g(marketCoinInfoGrid.getChangeRate()), 0, 2, null));
        StringBuilder sb2 = new StringBuilder();
        sb2.append("1 - ");
        BigDecimal bigDecimalM66671k2 = C27041f.m66671k(marketCoinInfoGrid.getMaxLeverage());
        sb2.append(C27041f.m66669i(bigDecimalM66671k2 != null ? C42180b.m92640e(bigDecimalM66671k2, null, 4, false, false, false, 0, null, 125, null) : null, "20"));
        sb2.append('x');
        textView6.setText(sb2.toString());
        Intrinsics.checkNotNull(constraintLayout);
        C27046k.m66711z(constraintLayout, 0L, new Function0() { // from class: com.kubi.margin.market.recommend.g
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MarginMarketRecommendAdapter.m39150B(marketCoinInfoGrid);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: E */
    public final void m39171E(BaseViewHolder baseViewHolder, final MarketCoinInfoGrid marketCoinInfoGrid) {
        BigDecimal bigDecimalM66536f;
        if (marketCoinInfoGrid == null) {
            return;
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) baseViewHolder.getView(R$id.cl_root);
        int i11 = R$id.ll_apr;
        View view = baseViewHolder.getView(i11);
        View view2 = baseViewHolder.getView(R$id.ll_invest);
        TextView textView = (TextView) baseViewHolder.getView(R$id.tv_symbol);
        TextView textView2 = (TextView) baseViewHolder.getView(R$id.tv_price);
        TextView textView3 = (TextView) baseViewHolder.getView(R$id.tv_change_rate);
        TextView textView4 = (TextView) baseViewHolder.getView(R$id.tv_apr);
        TextView textView5 = (TextView) baseViewHolder.getView(R$id.tv_invest);
        DashTextView dashTextView = (DashTextView) baseViewHolder.getView(R$id.tv_invest_label);
        SymbolInfoEntity symbolInfoEntityM85601B = C37890n.f85269a.m85601B(marketCoinInfoGrid.getSymbol());
        textView.setText(C27041f.m66669i(symbolInfoEntityM85601B != null ? symbolInfoEntityM85601B.getShowSymbol() : null, "--"));
        view.setVisibility(m39172H() ? 0 : 8);
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        ConstraintLayout.LayoutParams layoutParams2 = layoutParams instanceof ConstraintLayout.LayoutParams ? (ConstraintLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            if (!m39172H()) {
                i11 = R$id.tv_subtitle;
            }
            layoutParams2.topToBottom = i11;
            ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = (int) ((m39172H() ? 6 : 12) * this.mContext.getResources().getDisplayMetrics().density);
            view2.setLayoutParams(layoutParams2);
        }
        if (m39172H()) {
            Context mContext = this.mContext;
            Intrinsics.checkNotNullExpressionValue(mContext, "mContext");
            textView4.setTextColor(C22890g.m54291p(mContext));
            BigDecimal bigDecimalM66671k = C27041f.m66671k(marketCoinInfoGrid.getTodayTopProfitRateYear());
            textView4.setText(C42180b.m92649n(bigDecimalM66671k != null ? C42180b.m92642g(bigDecimalM66671k, null, null, 0, false, true, false, 47, null) : null));
        }
        String minAmount = marketCoinInfoGrid.getMinAmount();
        textView5.setText(C27041f.m66669i((minAmount == null || (bigDecimalM66536f = DowngradeExKt.m66536f(minAmount)) == null) ? null : C42180b.m92640e(bigDecimalM66536f, null, 0, false, false, true, 0, null, 111, null), "--"));
        dashTextView.setNeedDash(true);
        Intrinsics.checkNotNull(dashTextView);
        C27046k.m66711z(dashTextView, 0L, new Function0() { // from class: com.kubi.margin.market.recommend.c
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MarginMarketRecommendAdapter.m39153F(this.f33423b);
            }
        }, 1, null);
        BigDecimal price = marketCoinInfoGrid.getPrice();
        textView2.setText(C27041f.m66669i(price != null ? C37886j.m85579c(price, this.f33410j.getSymbol(), (124 & 2) != 0 ? RoundingMode.DOWN : null, (124 & 4) != 0 ? false : false, (124 & 8) != 0 ? false : false, (124 & 16) != 0, (124 & 32) == 0 ? 0 : 0, (124 & 64) != 0 ? MultiLanguageManager.f46811g.getLocale() : null) : null, "--"));
        BigDecimal changeRate = marketCoinInfoGrid.getChangeRate();
        textView3.setText(C42180b.m92649n(changeRate != null ? C42180b.m92642g(changeRate, null, null, 0, true, false, false, 55, null) : null));
        Context mContext2 = this.mContext;
        Intrinsics.checkNotNullExpressionValue(mContext2, "mContext");
        textView3.setTextColor(C22890g.m54279d(mContext2, C27039d.m66647g(marketCoinInfoGrid.getChangeRate()), 0, 2, null));
        Intrinsics.checkNotNull(constraintLayout);
        C27046k.m66711z(constraintLayout, 0L, new Function0() { // from class: com.kubi.margin.market.recommend.d
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MarginMarketRecommendAdapter.m39154G(this.f33424b, marketCoinInfoGrid);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: H */
    public final boolean m39172H() {
        Object objM56186h = Router.f46192a.m56186h(InterfaceC37978b.class, SiteInfoManager.f47913a.m58109c());
        if (objM56186h != null) {
            return ((InterfaceC37978b) objM56186h).mo85833a();
        }
        return true;
    }

    @NotNull
    /* JADX INFO: renamed from: I, reason: from getter */
    public final TradeItemBean getF33410j() {
        return this.f33410j;
    }

    @Override // io.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public void convert(@Nullable BaseViewHolder baseViewHolder, @Nullable MarginMarketRecommendEntity marginMarketRecommendEntity) {
        if (baseViewHolder == null || marginMarketRecommendEntity == null) {
            return;
        }
        int type = marginMarketRecommendEntity.getType();
        if (type == 0) {
            m39175r(baseViewHolder, marginMarketRecommendEntity.getActivity());
            return;
        }
        if (type == 1) {
            m39171E(baseViewHolder, marginMarketRecommendEntity.getGrid());
            return;
        }
        if (type == 2) {
            m39170A(baseViewHolder, marginMarketRecommendEntity.getGrid());
        } else if (type == 3) {
            m39176u(baseViewHolder, marginMarketRecommendEntity.getEarn(), marginMarketRecommendEntity.getCoinName());
        } else {
            if (type != 4) {
                return;
            }
            m39177x(baseViewHolder);
        }
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: r */
    public final void m39175r(BaseViewHolder baseViewHolder, final MarketCoinInfoQuest marketCoinInfoQuest) {
        if (marketCoinInfoQuest == null) {
            return;
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) baseViewHolder.getView(R$id.cl_root);
        TextView textView = (TextView) baseViewHolder.getView(R$id.tv_title);
        TextView textView2 = (TextView) baseViewHolder.getView(R$id.tv_subtitle);
        TextView textView3 = (TextView) baseViewHolder.getView(R$id.tv_reward);
        TextView textView4 = (TextView) baseViewHolder.getView(R$id.tv_applicants);
        TextView textView5 = (TextView) baseViewHolder.getView(R$id.tv_term);
        textView.setText(C27041f.m66668h(marketCoinInfoQuest.getTitle()));
        textView2.setText(C27041f.m66668h(marketCoinInfoQuest.getSubtitle()));
        Context mContext = this.mContext;
        Intrinsics.checkNotNullExpressionValue(mContext, "mContext");
        textView3.setTextColor(C22890g.m54291p(mContext));
        StringBuilder sb2 = new StringBuilder();
        sb2.append("+ ");
        BigDecimal bigDecimalM66671k = C27041f.m66671k(marketCoinInfoQuest.getTotalAmount());
        String strM92640e = null;
        sb2.append(C27041f.m66669i(bigDecimalM66671k != null ? C42180b.m92640e(bigDecimalM66671k, null, 0, false, false, true, 0, null, 111, null) : null, "--"));
        sb2.append(" USDT");
        textView3.setText(sb2.toString());
        Long signUpNum = marketCoinInfoQuest.getSignUpNum();
        if (signUpNum != null) {
            BigDecimal bigDecimalValueOf = BigDecimal.valueOf(signUpNum.longValue());
            Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
            if (bigDecimalValueOf != null) {
                strM92640e = C42180b.m92640e(bigDecimalValueOf, null, 0, false, false, true, 0, null, 111, null);
            }
        }
        textView4.setText(C27041f.m66669i(strM92640e, "--"));
        textView5.setText(C42179a.m92629b(C27039d.m66652l(marketCoinInfoQuest.getStartTime()), null, false, null, false, 15, null) + " - " + C42179a.m92629b(C27039d.m66652l(marketCoinInfoQuest.getEndTime()), null, false, null, false, 15, null));
        Intrinsics.checkNotNull(constraintLayout);
        C27046k.m66711z(constraintLayout, 0L, new Function0() { // from class: com.kubi.margin.market.recommend.e
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MarginMarketRecommendAdapter.m39165s(this.f33426b, marketCoinInfoQuest);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: u */
    public final void m39176u(BaseViewHolder baseViewHolder, MarketCoinInfoEarn marketCoinInfoEarn, String str) {
        C27096v0 c27096v0;
        if (marketCoinInfoEarn == null) {
            return;
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) baseViewHolder.getView(R$id.cl_root);
        TextView textView = (TextView) baseViewHolder.getView(R$id.tv_title);
        TextView textView2 = (TextView) baseViewHolder.getView(R$id.tv_category);
        View view = baseViewHolder.getView(R$id.ll_term);
        TextView textView3 = (TextView) baseViewHolder.getView(R$id.tv_apr);
        textView.setText(new C27096v0().append(this.f33410j.getSymbolInfoEntity().getBaseCurrencyName()).m66905e('/' + C27041f.m66668h(str), C27017c.f54310a.m66512a(R$color.c_text40)));
        List<String> products = marketCoinInfoEarn.getProducts();
        if (products != null) {
            c27096v0 = new C27096v0();
            int i11 = 0;
            for (Object obj : products) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                String str2 = (String) obj;
                c27096v0 = i11 == 0 ? c27096v0.append(str2) : c27096v0.m66905e(" | ", C27017c.f54310a.m66512a(R$color.emphasis8)).append(str2);
                Intrinsics.checkNotNull(c27096v0);
                i11 = i12;
            }
        } else {
            c27096v0 = null;
        }
        textView2.setText(C27041f.m66667g(c27096v0, "--"));
        view.setVisibility(m39172H() ? 0 : 8);
        if (m39172H()) {
            Context mContext = this.mContext;
            Intrinsics.checkNotNullExpressionValue(mContext, "mContext");
            textView3.setTextColor(C22890g.m54291p(mContext));
            BigDecimal bigDecimalM66671k = C27041f.m66671k(marketCoinInfoEarn.getTodayTopProfitRateYear());
            textView3.setText(C42180b.m92649n(bigDecimalM66671k != null ? C42180b.m92642g(bigDecimalM66671k, null, null, 0, false, true, false, 47, null) : null));
        }
        Intrinsics.checkNotNull(constraintLayout);
        C27046k.m66711z(constraintLayout, 0L, new Function0() { // from class: com.kubi.margin.market.recommend.a
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MarginMarketRecommendAdapter.m39167v(this.f33421b);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: x */
    public final void m39177x(BaseViewHolder baseViewHolder) {
        ConstraintLayout constraintLayout = (ConstraintLayout) baseViewHolder.getView(R$id.cl_root);
        ImageView imageView = (ImageView) baseViewHolder.getView(R$id.iv_fiat);
        TextView textView = (TextView) baseViewHolder.getView(R$id.tv_fiat);
        ImageView imageView2 = (ImageView) baseViewHolder.getView(R$id.iv_currency);
        TextView textView2 = (TextView) baseViewHolder.getView(R$id.tv_currency);
        C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(this.f33409i), null, null, new MarginMarketRecommendAdapter$convertOtc$1(this, imageView, imageView2, null), 3, null);
        textView.setText(C41016c.m89965c());
        textView2.setText(this.f33410j.getSymbolInfoEntity().getBaseCurrencyName());
        Intrinsics.checkNotNull(constraintLayout);
        C27046k.m66711z(constraintLayout, 0L, new Function0() { // from class: com.kubi.margin.market.recommend.b
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MarginMarketRecommendAdapter.m39169y(this.f33422b);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: B */
    public static final Unit m39150B(final MarketCoinInfoGrid marketCoinInfoGrid) {
        C43852m.m96590b("B4candle", "RecommendModular", "3", TuplesKt.m90091to("symbol", C27041f.m66668h(marketCoinInfoGrid.getSymbol())));
        IUserService.O(C42579a.f94275a.m93347g(), (Map) null, IRedirect.INSTANCE.obtain(new Function0() { // from class: com.kubi.margin.market.recommend.j
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MarginMarketRecommendAdapter.m39151C(marketCoinInfoGrid);
            }
        }), 1, (Object) null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: t */
    public static final Unit m39166t(MarketCoinInfoQuest marketCoinInfoQuest) {
        String id2 = marketCoinInfoQuest.getId();
        if (id2 != null) {
            Router.f46192a.m56184f(C45615e.m100707h("task/detail", false, 2, null)).m4038a("id", id2).m4048k();
        }
        return Unit.INSTANCE;
    }
}
