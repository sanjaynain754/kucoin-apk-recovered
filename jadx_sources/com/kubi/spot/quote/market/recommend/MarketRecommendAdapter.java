package com.kubi.spot.quote.market.recommend;

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
import com.kubi.resources.C22890g;
import com.kubi.resources.dialog.AlertDialogFragmentHelper;
import com.kubi.resources.widget.DashTextView;
import com.kubi.router.core.Router;
import com.kubi.router.model.IRedirect;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.function.language.MultiLanguageManager;
import com.kubi.sdk.site.SiteType;
import com.kubi.sdk.site.info.SiteInfoManager;
import com.kubi.spot.R$color;
import com.kubi.spot.R$id;
import com.kubi.spot.R$layout;
import com.kubi.spot.R$string;
import com.kubi.spot.quote.market.info.MarketCoinInfoEarn;
import com.kubi.spot.quote.market.info.MarketCoinInfoGrid;
import com.kubi.spot.quote.market.info.MarketCoinInfoQuest;
import com.kubi.spot.service.SpotDepend;
import com.kubi.user.api.IUserService;
import com.kubi.utils.C27017c;
import com.kubi.utils.C27096v0;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.DowngradeExKt;
import f00.C37304a;
import f30.C37346q;
import f30.C37349t;
import g00.InterfaceC37754f;
import g00.InterfaceC37758j;
import gf.C37886j;
import gf.C37890n;
import io.chad.library.adapter.base.BaseMultiItemQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.C41696j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p402kf.C41016c;
import p429lf.C42179a;
import p429lf.C42180b;
import p569qq.C43852m;
import p852kotlin.Metadata;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: MarketRecommendAdapter.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B'\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u001c\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002H\u0014J\u001a\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u0015H\u0003J\u001a\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u0017H\u0002J\u001a\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u0017H\u0003J$\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0002J\u0010\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0003H\u0002R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001e"}, m90084d2 = {"Lcom/kubi/spot/quote/market/recommend/MarketRecommendAdapter;", "Lio/chad/library/adapter/base/BaseMultiItemQuickAdapter;", "Lcom/kubi/spot/quote/market/recommend/MarketRecommendEntity;", "Lio/chad/library/adapter/base/BaseViewHolder;", "fragment", "Lcom/kubi/sdk/BaseFragment;", "tradeItemBean", "Lcom/kubi/data/entity/TradeItemBean;", "data", "", "<init>", "(Lcom/kubi/sdk/BaseFragment;Lcom/kubi/data/entity/TradeItemBean;Ljava/util/List;)V", "getFragment", "()Lcom/kubi/sdk/BaseFragment;", "getTradeItemBean", "()Lcom/kubi/data/entity/TradeItemBean;", "convert", "", "helper", "item", "convertActivity", "Lcom/kubi/spot/quote/market/info/MarketCoinInfoQuest;", "convertRobotSpot", "Lcom/kubi/spot/quote/market/info/MarketCoinInfoGrid;", "convertRobotFuture", "convertEarn", "Lcom/kubi/spot/quote/market/info/MarketCoinInfoEarn;", "coinName", "", "convertOtc", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nMarketRecommendAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarketRecommendAdapter.kt\ncom/kubi/spot/quote/market/recommend/MarketRecommendAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,330:1\n1818#2,4:331\n*S KotlinDebug\n*F\n+ 1 MarketRecommendAdapter.kt\ncom/kubi/spot/quote/market/recommend/MarketRecommendAdapter\n*L\n266#1:331,4\n*E\n"})
public final class MarketRecommendAdapter extends BaseMultiItemQuickAdapter<MarketRecommendEntity, BaseViewHolder> {

    /* JADX INFO: renamed from: i */
    @NotNull
    public final BaseFragment f51030i;

    /* JADX INFO: renamed from: j */
    @NotNull
    public final TradeItemBean f51031j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketRecommendAdapter(@NotNull BaseFragment fragment, @NotNull TradeItemBean tradeItemBean, @Nullable List<MarketRecommendEntity> list) {
        super(list);
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(tradeItemBean, "tradeItemBean");
        this.f51030i = fragment;
        this.f51031j = tradeItemBean;
        addItemType(0, R$layout.bkucoin_item_recommend_activity);
        addItemType(1, R$layout.bkucoin_item_recommend_robot_spot);
        addItemType(2, R$layout.bkucoin_item_recommend_robot_future);
        addItemType(3, R$layout.bkucoin_item_recommend_earn);
        addItemType(4, R$layout.bkucoin_item_recommend_otc);
    }

    /* JADX INFO: renamed from: B */
    public static final Unit m62660B(MarketRecommendAdapter marketRecommendAdapter) {
        AlertDialogFragmentHelper alertDialogFragmentHelperM54162S4 = AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54153J4(R$string.robot_min_invest_tip).m54162S4(R$string.already_know, null);
        FragmentManager childFragmentManager = marketRecommendAdapter.f51030i.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        alertDialogFragmentHelperM54162S4.show(childFragmentManager, "min_vest_tip");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: D */
    public static final Unit m62662D(MarketCoinInfoGrid marketCoinInfoGrid) {
        Router.f46192a.m56184f(C37349t.f82867a.m83950b(marketCoinInfoGrid.getSymbol())).m4048k();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: F */
    public static final Unit m62663F(MarketRecommendAdapter marketRecommendAdapter) {
        AlertDialogFragmentHelper alertDialogFragmentHelperM54162S4 = AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54153J4(R$string.robot_min_invest_tip).m54162S4(R$string.already_know, null);
        FragmentManager childFragmentManager = marketRecommendAdapter.f51030i.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        alertDialogFragmentHelperM54162S4.show(childFragmentManager, "min_vest_tip");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: G */
    public static final Unit m62664G(MarketRecommendAdapter marketRecommendAdapter, MarketCoinInfoGrid marketCoinInfoGrid) {
        C43852m.m96590b("B5candle", "RecommendModular", "2", TuplesKt.m90091to("symbol", marketRecommendAdapter.f51031j.getSymbol()));
        InterfaceC37754f.a.m85139k(C37304a.f82764a, marketCoinInfoGrid.getSymbol(), null, null, null, 14, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: s */
    public static final Unit m62675s(MarketRecommendAdapter marketRecommendAdapter, final MarketCoinInfoQuest marketCoinInfoQuest) {
        C43852m.m96590b("B5candle", "RecommendModular", "1", TuplesKt.m90091to("symbol", marketRecommendAdapter.f51031j.getSymbol()));
        IUserService.O(SpotDepend.f51244a.m63036f(), (Map) null, IRedirect.INSTANCE.obtain(new Function0() { // from class: com.kubi.spot.quote.market.recommend.h
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MarketRecommendAdapter.m62676t(marketCoinInfoQuest);
            }
        }), 1, (Object) null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: v */
    public static final Unit m62677v(final MarketRecommendAdapter marketRecommendAdapter) {
        C43852m.m96590b("B5candle", "RecommendModular", "4", TuplesKt.m90091to("symbol", marketRecommendAdapter.f51031j.getSymbol()));
        IUserService.O(SpotDepend.f51244a.m63036f(), (Map) null, IRedirect.INSTANCE.obtain(new Function0() { // from class: com.kubi.spot.quote.market.recommend.i
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MarketRecommendAdapter.m62678w(this.f51052b);
            }
        }), 1, (Object) null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: w */
    public static final Unit m62678w(MarketRecommendAdapter marketRecommendAdapter) {
        Router.f46192a.m56184f(C37349t.f82867a.m83949a(marketRecommendAdapter.f51031j.getSymbolInfoEntity().getBaseCurrency())).m4048k();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: x */
    private final void m62679x(BaseViewHolder baseViewHolder) {
        ConstraintLayout constraintLayout = (ConstraintLayout) baseViewHolder.getView(R$id.cl_root);
        ImageView imageView = (ImageView) baseViewHolder.getView(R$id.iv_fiat);
        TextView textView = (TextView) baseViewHolder.getView(R$id.tv_fiat);
        ImageView imageView2 = (ImageView) baseViewHolder.getView(R$id.iv_currency);
        TextView textView2 = (TextView) baseViewHolder.getView(R$id.tv_currency);
        C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(this.f51030i), null, null, new MarketRecommendAdapter$convertOtc$1(this, imageView, imageView2, null), 3, null);
        textView.setText(C41016c.m89965c());
        textView2.setText(this.f51031j.getSymbolInfoEntity().getBaseCurrencyName());
        Intrinsics.checkNotNull(constraintLayout);
        C27046k.m66711z(constraintLayout, 0L, new Function0() { // from class: com.kubi.spot.quote.market.recommend.e
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MarketRecommendAdapter.m62680y(this.f51048b);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: y */
    public static final Unit m62680y(MarketRecommendAdapter marketRecommendAdapter) {
        C43852m.m96590b("B5candle", "RecommendModular", "5", TuplesKt.m90091to("symbol", marketRecommendAdapter.f51031j.getSymbol()));
        InterfaceC37758j.a.m85163l(C37304a.f82764a, null, C41016c.m89965c(), marketRecommendAdapter.f51031j.getSymbolInfoEntity().getBaseCurrency(), null, null, null, null, 121, null);
        return Unit.INSTANCE;
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: A */
    public final void m62681A(BaseViewHolder baseViewHolder, final MarketCoinInfoGrid marketCoinInfoGrid) {
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
        boolean zAreEqual = Intrinsics.areEqual(SiteInfoManager.f47913a.m58109c(), SiteType.Australia.getSiteType());
        textView.setText(C27041f.m66667g(IKuMexService.m33249T(SpotDepend.f51244a.m63032b(), C27041f.m66668h(marketCoinInfoGrid.getSymbol()), false, 2, null), "--"));
        view.setVisibility(zAreEqual ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        ConstraintLayout.LayoutParams layoutParams2 = layoutParams instanceof ConstraintLayout.LayoutParams ? (ConstraintLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            layoutParams2.topToBottom = !zAreEqual ? i11 : R$id.tv_subtitle;
            ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = (int) ((!zAreEqual ? 6 : 12) * this.mContext.getResources().getDisplayMetrics().density);
            view2.setLayoutParams(layoutParams2);
        }
        if (!zAreEqual) {
            Context mContext = this.mContext;
            Intrinsics.checkNotNullExpressionValue(mContext, "mContext");
            textView4.setTextColor(C22890g.m54291p(mContext));
            BigDecimal bigDecimalM66536f2 = DowngradeExKt.m66536f(marketCoinInfoGrid.getTodayTopProfitRateYear());
            textView4.setText(C42180b.m92649n(bigDecimalM66536f2 != null ? C42180b.m92642g(bigDecimalM66536f2, null, null, 0, false, true, false, 47, null) : null));
        }
        String minAmount = marketCoinInfoGrid.getMinAmount();
        textView5.setText(C27041f.m66669i((minAmount == null || (bigDecimalM66536f = DowngradeExKt.m66536f(minAmount)) == null) ? null : C42180b.m92640e(bigDecimalM66536f, null, 0, false, false, true, 0, null, 111, null), "--"));
        dashTextView.setNeedDash(true);
        Intrinsics.checkNotNull(dashTextView);
        C27046k.m66711z(dashTextView, 0L, new Function0() { // from class: com.kubi.spot.quote.market.recommend.f
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MarketRecommendAdapter.m62660B(this.f51049b);
            }
        }, 1, null);
        BigDecimal price = marketCoinInfoGrid.getPrice();
        textView2.setText(C27041f.m66669i(price != null ? C37886j.m85579c(price, this.f51031j.getSymbol(), (124 & 2) != 0 ? RoundingMode.DOWN : null, (124 & 4) != 0 ? false : false, (124 & 8) != 0 ? false : false, (124 & 16) != 0, (124 & 32) == 0 ? 0 : 0, (124 & 64) != 0 ? MultiLanguageManager.f46811g.getLocale() : null) : null, "--"));
        BigDecimal changeRate = marketCoinInfoGrid.getChangeRate();
        textView3.setText(C42180b.m92649n(changeRate != null ? C42180b.m92642g(changeRate, null, null, 0, true, false, false, 55, null) : null));
        Context mContext2 = this.mContext;
        Intrinsics.checkNotNullExpressionValue(mContext2, "mContext");
        textView3.setTextColor(C22890g.m54279d(mContext2, C27039d.m66647g(marketCoinInfoGrid.getChangeRate()), 0, 2, null));
        StringBuilder sb2 = new StringBuilder();
        sb2.append("1 - ");
        BigDecimal bigDecimalM66536f3 = DowngradeExKt.m66536f(marketCoinInfoGrid.getMaxLeverage());
        sb2.append(C27041f.m66669i(bigDecimalM66536f3 != null ? C42180b.m92640e(bigDecimalM66536f3, null, 4, false, false, false, 0, null, 125, null) : null, "20"));
        sb2.append('x');
        textView6.setText(sb2.toString());
        Intrinsics.checkNotNull(constraintLayout);
        C27046k.m66711z(constraintLayout, 0L, new Function0() { // from class: com.kubi.spot.quote.market.recommend.g
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MarketRecommendAdapter.m62661C(marketCoinInfoGrid);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: E */
    public final void m62682E(BaseViewHolder baseViewHolder, final MarketCoinInfoGrid marketCoinInfoGrid) {
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
        boolean zAreEqual = Intrinsics.areEqual(SiteInfoManager.f47913a.m58109c(), SiteType.Australia.getSiteType());
        SymbolInfoEntity symbolInfoEntityM85601B = C37890n.f85269a.m85601B(marketCoinInfoGrid.getSymbol());
        textView.setText(C27041f.m66669i(symbolInfoEntityM85601B != null ? symbolInfoEntityM85601B.getShowSymbol() : null, "--"));
        view.setVisibility(!zAreEqual ? 0 : 8);
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        ConstraintLayout.LayoutParams layoutParams2 = layoutParams instanceof ConstraintLayout.LayoutParams ? (ConstraintLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            if (zAreEqual) {
                i11 = R$id.tv_subtitle;
            }
            layoutParams2.topToBottom = i11;
            ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = (int) ((!zAreEqual ? 6 : 12) * this.mContext.getResources().getDisplayMetrics().density);
            view2.setLayoutParams(layoutParams2);
        }
        if (!zAreEqual) {
            Context mContext = this.mContext;
            Intrinsics.checkNotNullExpressionValue(mContext, "mContext");
            textView4.setTextColor(C22890g.m54291p(mContext));
            BigDecimal bigDecimalM66536f2 = DowngradeExKt.m66536f(marketCoinInfoGrid.getTodayTopProfitRateYear());
            textView4.setText(C42180b.m92649n(bigDecimalM66536f2 != null ? C42180b.m92642g(bigDecimalM66536f2, null, null, 0, false, true, false, 47, null) : null));
        }
        String minAmount = marketCoinInfoGrid.getMinAmount();
        textView5.setText(C27041f.m66669i((minAmount == null || (bigDecimalM66536f = DowngradeExKt.m66536f(minAmount)) == null) ? null : C42180b.m92640e(bigDecimalM66536f, null, 0, false, false, true, 0, null, 111, null), "--"));
        dashTextView.setNeedDash(true);
        Intrinsics.checkNotNull(dashTextView);
        C27046k.m66711z(dashTextView, 0L, new Function0() { // from class: com.kubi.spot.quote.market.recommend.b
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MarketRecommendAdapter.m62663F(this.f51043b);
            }
        }, 1, null);
        BigDecimal price = marketCoinInfoGrid.getPrice();
        textView2.setText(C27041f.m66669i(price != null ? C37886j.m85579c(price, this.f51031j.getSymbol(), (124 & 2) != 0 ? RoundingMode.DOWN : null, (124 & 4) != 0 ? false : false, (124 & 8) != 0 ? false : false, (124 & 16) != 0, (124 & 32) == 0 ? 0 : 0, (124 & 64) != 0 ? MultiLanguageManager.f46811g.getLocale() : null) : null, "--"));
        BigDecimal changeRate = marketCoinInfoGrid.getChangeRate();
        textView3.setText(C42180b.m92649n(changeRate != null ? C42180b.m92642g(changeRate, null, null, 0, true, false, false, 55, null) : null));
        Context mContext2 = this.mContext;
        Intrinsics.checkNotNullExpressionValue(mContext2, "mContext");
        textView3.setTextColor(C22890g.m54279d(mContext2, C27039d.m66647g(marketCoinInfoGrid.getChangeRate()), 0, 2, null));
        Intrinsics.checkNotNull(constraintLayout);
        C27046k.m66711z(constraintLayout, 0L, new Function0() { // from class: com.kubi.spot.quote.market.recommend.c
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MarketRecommendAdapter.m62664G(this.f51044b, marketCoinInfoGrid);
            }
        }, 1, null);
    }

    @NotNull
    /* JADX INFO: renamed from: H, reason: from getter */
    public final TradeItemBean getF51031j() {
        return this.f51031j;
    }

    @Override // io.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public void convert(@Nullable BaseViewHolder baseViewHolder, @Nullable MarketRecommendEntity marketRecommendEntity) {
        if (baseViewHolder == null || marketRecommendEntity == null) {
            return;
        }
        int type = marketRecommendEntity.getType();
        if (type == 0) {
            m62685r(baseViewHolder, marketRecommendEntity.getActivity());
            return;
        }
        if (type == 1) {
            m62682E(baseViewHolder, marketRecommendEntity.getGrid());
            return;
        }
        if (type == 2) {
            m62681A(baseViewHolder, marketRecommendEntity.getGrid());
        } else if (type == 3) {
            m62686u(baseViewHolder, marketRecommendEntity.getEarn(), marketRecommendEntity.getCoinName());
        } else {
            if (type != 4) {
                return;
            }
            m62679x(baseViewHolder);
        }
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: r */
    public final void m62685r(BaseViewHolder baseViewHolder, final MarketCoinInfoQuest marketCoinInfoQuest) {
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
        BigDecimal bigDecimalM66536f = DowngradeExKt.m66536f(marketCoinInfoQuest.getTotalAmount());
        String strM92640e = null;
        sb2.append(C27041f.m66669i(bigDecimalM66536f != null ? C42180b.m92640e(bigDecimalM66536f, null, 0, false, false, true, 0, null, 111, null) : null, "--"));
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
        C27046k.m66711z(constraintLayout, 0L, new Function0() { // from class: com.kubi.spot.quote.market.recommend.d
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MarketRecommendAdapter.m62675s(this.f51046b, marketCoinInfoQuest);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: u */
    public final void m62686u(BaseViewHolder baseViewHolder, MarketCoinInfoEarn marketCoinInfoEarn, String str) {
        C27096v0 c27096v0;
        if (marketCoinInfoEarn == null) {
            return;
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) baseViewHolder.getView(R$id.cl_root);
        TextView textView = (TextView) baseViewHolder.getView(R$id.tv_title);
        TextView textView2 = (TextView) baseViewHolder.getView(R$id.tv_category);
        View view = baseViewHolder.getView(R$id.ll_term);
        TextView textView3 = (TextView) baseViewHolder.getView(R$id.tv_apr);
        boolean zAreEqual = Intrinsics.areEqual(SiteInfoManager.f47913a.m58109c(), SiteType.Australia.getSiteType());
        textView.setText(new C27096v0().append(this.f51031j.getSymbolInfoEntity().getBaseCurrencyName()).m66905e('/' + C27041f.m66668h(str), C27017c.f54310a.m66512a(R$color.c_text40)));
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
        view.setVisibility(zAreEqual ? 8 : 0);
        if (!zAreEqual) {
            Context mContext = this.mContext;
            Intrinsics.checkNotNullExpressionValue(mContext, "mContext");
            textView3.setTextColor(C22890g.m54291p(mContext));
            BigDecimal bigDecimalM66536f = DowngradeExKt.m66536f(marketCoinInfoEarn.getTodayTopProfitRateYear());
            textView3.setText(C42180b.m92649n(bigDecimalM66536f != null ? C42180b.m92642g(bigDecimalM66536f, null, null, 0, false, true, false, 47, null) : null));
        }
        Intrinsics.checkNotNull(constraintLayout);
        C27046k.m66711z(constraintLayout, 0L, new Function0() { // from class: com.kubi.spot.quote.market.recommend.a
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MarketRecommendAdapter.m62677v(this.f51042b);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: C */
    public static final Unit m62661C(final MarketCoinInfoGrid marketCoinInfoGrid) {
        C43852m.m96590b("B5candle", "RecommendModular", "3", TuplesKt.m90091to("symbol", C27041f.m66668h(marketCoinInfoGrid.getSymbol())));
        IUserService.O(SpotDepend.f51244a.m63036f(), (Map) null, IRedirect.INSTANCE.obtain(new Function0() { // from class: com.kubi.spot.quote.market.recommend.j
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MarketRecommendAdapter.m62662D(marketCoinInfoGrid);
            }
        }), 1, (Object) null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: t */
    public static final Unit m62676t(MarketCoinInfoQuest marketCoinInfoQuest) {
        String id2 = marketCoinInfoQuest.getId();
        if (id2 != null) {
            Router.f46192a.m56184f(C37346q.m83939i("task/detail", false, 2, null)).m4038a("id", id2).m4048k();
        }
        return Unit.INSTANCE;
    }
}
