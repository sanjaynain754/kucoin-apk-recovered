package com.kubi.spot.quote.market.trade;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.kubi.resources.C22890g;
import com.kubi.resources.dialog.AlertDialogFragmentHelper;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.C23040f;
import com.kubi.resources.widget.DashTextView;
import com.kubi.resources.widget.UpDownTextView;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.function.language.MultiLanguageManager;
import com.kubi.spot.R$layout;
import com.kubi.spot.R$string;
import com.kubi.spot.R$style;
import com.kubi.spot.quote.market.info.MarketCoinInfo;
import com.kubi.spot.quote.market.info.MarketTickerStatsEntity;
import com.kubi.spot.quote.market.info.WsMarketTickerStatsEntity;
import com.kubi.utils.C27017c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.DowngradeExKt;
import gf.C37886j;
import java.math.BigDecimal;
import java.math.RoundingMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p402kf.C41014a;
import p429lf.C42180b;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import t20.C44666t;

/* JADX INFO: renamed from: com.kubi.spot.quote.market.trade.h2, reason: from Kotlin metadata */
/* JADX INFO: compiled from: MarketTradePopup.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\rJ\u0010\u0010\u0018\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\rJ\u0010\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\rH\u0002J\u0010\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u001cH\u0007J\u0012\u0010\u001d\u001a\u00020\u00162\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0007J\u0012\u0010\u001d\u001a\u00020\u00162\b\u0010\u001e\u001a\u0004\u0018\u00010 H\u0007J\u0012\u0010!\u001a\u0004\u0018\u00010\"2\b\u0010#\u001a\u0004\u0018\u00010$J\u0018\u0010%\u001a\u00020\u00162\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020'H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR#\u0010\f\u001a\n \u000e*\u0004\u0018\u00010\r0\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006)"}, m90084d2 = {"Lcom/kubi/spot/quote/market/trade/MarketTradePopup;", "", "fragment", "Lcom/kubi/sdk/BaseFragment;", "<init>", "(Lcom/kubi/sdk/BaseFragment;)V", "bkucoinLayoutMarketDetailPopupBinding", "Lcom/kubi/spot/databinding/BkucoinLayoutMarketDetailPopupBinding;", "getBkucoinLayoutMarketDetailPopupBinding", "()Lcom/kubi/spot/databinding/BkucoinLayoutMarketDetailPopupBinding;", "setBkucoinLayoutMarketDetailPopupBinding", "(Lcom/kubi/spot/databinding/BkucoinLayoutMarketDetailPopupBinding;)V", "mContentView", "Landroid/view/View;", "kotlin.jvm.PlatformType", "getMContentView", "()Landroid/view/View;", "mContentView$delegate", "Lkotlin/Lazy;", "mPopupWindow", "Lcom/kubi/resources/widget/BackgroundDarkPopupWindow;", "popUp", "", "dependView", "resetLoc", "checkPopup", "setContentView", "info", "Lcom/kubi/spot/quote/market/info/MarketCoinInfo;", "setTicker", "ticker", "Lcom/kubi/spot/quote/market/info/MarketTickerStatsEntity;", "Lcom/kubi/spot/quote/market/info/WsMarketTickerStatsEntity;", "saveCoverToBigDecimal", "Ljava/math/BigDecimal;", TypedValues.Custom.S_STRING, "", "showTips", "titleId", "", "tipsId", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nMarketTradePopup.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarketTradePopup.kt\ncom/kubi/spot/quote/market/trade/MarketTradePopup\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,236:1\n1#2:237\n*E\n"})
public final class MarketTradePopup {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final BaseFragment f51158a;

    /* JADX INFO: renamed from: b */
    public C44666t f51159b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final Lazy f51160c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public C23040f f51161d;

    public MarketTradePopup(@NotNull BaseFragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        this.f51158a = fragment;
        this.f51160c = LazyKt.lazy(new Function0() { // from class: com.kubi.spot.quote.market.trade.w1
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MarketTradePopup.m62981o(this.f51195b);
            }
        });
    }

    /* JADX INFO: renamed from: o */
    public static final View m62981o(final MarketTradePopup marketTradePopup) {
        View viewInflate = LayoutInflater.from(marketTradePopup.f51158a.requireContext()).inflate(R$layout.bkucoin_layout_market_detail_popup, (ViewGroup) null);
        C44666t c44666tM98808a = C44666t.m98808a(viewInflate);
        Intrinsics.checkNotNullExpressionValue(c44666tM98808a, "bind(...)");
        marketTradePopup.m62994C(c44666tM98808a);
        DashTextView rankLabel = marketTradePopup.m63000m().f99348q;
        Intrinsics.checkNotNullExpressionValue(rankLabel, "rankLabel");
        C27046k.m66711z(rankLabel, 0L, new Function0() { // from class: com.kubi.spot.quote.market.trade.y1
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MarketTradePopup.m62982p(this.f51201b);
            }
        }, 1, null);
        DashTextView ratingLabel = marketTradePopup.m63000m().f99350s;
        Intrinsics.checkNotNullExpressionValue(ratingLabel, "ratingLabel");
        C27046k.m66711z(ratingLabel, 0L, new Function0() { // from class: com.kubi.spot.quote.market.trade.z1
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MarketTradePopup.m62983q(this.f51205b);
            }
        }, 1, null);
        DashTextView marketValueLabel = marketTradePopup.m63000m().f99344m;
        Intrinsics.checkNotNullExpressionValue(marketValueLabel, "marketValueLabel");
        C27046k.m66711z(marketValueLabel, 0L, new Function0() { // from class: com.kubi.spot.quote.market.trade.a2
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MarketTradePopup.m62984r(this.f51131b);
            }
        }, 1, null);
        DashTextView maxSupplyLabel = marketTradePopup.m63000m().f99346o;
        Intrinsics.checkNotNullExpressionValue(maxSupplyLabel, "maxSupplyLabel");
        C27046k.m66711z(maxSupplyLabel, 0L, new Function0() { // from class: com.kubi.spot.quote.market.trade.b2
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MarketTradePopup.m62985s(this.f51136b);
            }
        }, 1, null);
        DashTextView circulatingSupplyLabel = marketTradePopup.m63000m().f99342k;
        Intrinsics.checkNotNullExpressionValue(circulatingSupplyLabel, "circulatingSupplyLabel");
        C27046k.m66711z(circulatingSupplyLabel, 0L, new Function0() { // from class: com.kubi.spot.quote.market.trade.c2
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MarketTradePopup.m62986t(this.f51140b);
            }
        }, 1, null);
        DashTextView change1hLabel = marketTradePopup.m63000m().f99338g;
        Intrinsics.checkNotNullExpressionValue(change1hLabel, "change1hLabel");
        C27046k.m66711z(change1hLabel, 0L, new Function0() { // from class: com.kubi.spot.quote.market.trade.d2
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MarketTradePopup.m62987u(this.f51145b);
            }
        }, 1, null);
        DashTextView change24hLabel = marketTradePopup.m63000m().f99340i;
        Intrinsics.checkNotNullExpressionValue(change24hLabel, "change24hLabel");
        C27046k.m66711z(change24hLabel, 0L, new Function0() { // from class: com.kubi.spot.quote.market.trade.e2
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MarketTradePopup.m62988v(this.f51147b);
            }
        }, 1, null);
        DashTextView chang7dLabel = marketTradePopup.m63000m().f99336e;
        Intrinsics.checkNotNullExpressionValue(chang7dLabel, "chang7dLabel");
        C27046k.m66711z(chang7dLabel, 0L, new Function0() { // from class: com.kubi.spot.quote.market.trade.f2
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MarketTradePopup.m62989w(this.f51151b);
            }
        }, 1, null);
        DashTextView averagePriceLabel = marketTradePopup.m63000m().f99334c;
        Intrinsics.checkNotNullExpressionValue(averagePriceLabel, "averagePriceLabel");
        C27046k.m66711z(averagePriceLabel, 0L, new Function0() { // from class: com.kubi.spot.quote.market.trade.g2
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MarketTradePopup.m62990x(this.f51155b);
            }
        }, 1, null);
        DashTextView topPriceLabel = marketTradePopup.m63000m().f99352u;
        Intrinsics.checkNotNullExpressionValue(topPriceLabel, "topPriceLabel");
        C27046k.m66711z(topPriceLabel, 0L, new Function0() { // from class: com.kubi.spot.quote.market.trade.x1
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MarketTradePopup.m62991y(this.f51198b);
            }
        }, 1, null);
        return viewInflate;
    }

    /* JADX INFO: renamed from: p */
    public static final Unit m62982p(MarketTradePopup marketTradePopup) {
        marketTradePopup.m62998G(R$string.rank_label, R$string.rank_desc);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: q */
    public static final Unit m62983q(MarketTradePopup marketTradePopup) {
        marketTradePopup.m62998G(R$string.rating_label, R$string.rating_desc);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: r */
    public static final Unit m62984r(MarketTradePopup marketTradePopup) {
        marketTradePopup.m62998G(R$string.market_cap_label, R$string.market_cap_desc);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: s */
    public static final Unit m62985s(MarketTradePopup marketTradePopup) {
        marketTradePopup.m62998G(R$string.max_supply_label, R$string.max_supply_desc);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: t */
    public static final Unit m62986t(MarketTradePopup marketTradePopup) {
        marketTradePopup.m62998G(R$string.max_circulating_label, R$string.max_circulating_desc);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: u */
    public static final Unit m62987u(MarketTradePopup marketTradePopup) {
        marketTradePopup.m62998G(R$string.change_rate_1h_label, R$string.change_rate_1h_desc);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: v */
    public static final Unit m62988v(MarketTradePopup marketTradePopup) {
        marketTradePopup.m62998G(R$string.change_rate_24h_label, R$string.change_rate_24h_desc);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: w */
    public static final Unit m62989w(MarketTradePopup marketTradePopup) {
        marketTradePopup.m62998G(R$string.change_rate_7d_label, R$string.change_rate_7d_desc);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: x */
    public static final Unit m62990x(MarketTradePopup marketTradePopup) {
        marketTradePopup.m62998G(R$string.average_price_label, R$string.average_price_desc);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: y */
    public static final Unit m62991y(MarketTradePopup marketTradePopup) {
        marketTradePopup.m62998G(R$string.ath_label, R$string.ath_desc);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: A */
    public final void m62992A(@Nullable View view) {
        if (view != null) {
            m62999l(view);
            C23040f c23040f = this.f51161d;
            if (c23040f != null) {
                c23040f.m55188o(view);
            }
        }
    }

    @Nullable
    /* JADX INFO: renamed from: B */
    public final BigDecimal m62993B(@Nullable String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        return DowngradeExKt.m66536f(str);
    }

    /* JADX INFO: renamed from: C */
    public final void m62994C(@NotNull C44666t c44666t) {
        Intrinsics.checkNotNullParameter(c44666t, "<set-?>");
        this.f51159b = c44666t;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x002a  */
    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: D */
    public final void m62995D(@NotNull MarketCoinInfo info) {
        String str;
        Intrinsics.checkNotNullParameter(info, "info");
        m63001n();
        BaseTextView baseTextView = m63000m().f99347p;
        String rank = info.getRank();
        if (rank != null) {
            str = '#' + rank;
            if (str == null) {
                str = "--";
            }
        } else {
            str = "--";
        }
        baseTextView.setText(str);
        m63000m().f99349r.setText(C27041f.m66669i(info.getRating(), "--"));
        BaseTextView baseTextView2 = m63000m().f99343l;
        BigDecimal bigDecimalM62993B = m62993B(info.getMarketCap());
        baseTextView2.setText(C41014a.m89930d(bigDecimalM62993B != null ? new BigDecimal(String.valueOf(C41014a.m89940n(bigDecimalM62993B, "USD"))) : null, true));
        m63000m().f99345n.setText(C41014a.m89931e(m62993B(info.getMaxSupply()), false, 1, null));
        m63000m().f99341j.setText(C41014a.m89931e(m62993B(info.getCirculatingSupply()), false, 1, null));
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: E */
    public final void m62996E(@Nullable MarketTickerStatsEntity marketTickerStatsEntity) {
        if (marketTickerStatsEntity == null) {
            return;
        }
        View viewM63001n = m63001n();
        UpDownTextView upDownTextView = m63000m().f99337f;
        BigDecimal bigDecimalM62993B = m62993B(marketTickerStatsEntity.getPriceChangeRate1h());
        upDownTextView.setText(C42180b.m92649n(bigDecimalM62993B != null ? C42180b.m92642g(bigDecimalM62993B, null, null, 0, true, false, false, 55, null) : null));
        UpDownTextView upDownTextView2 = m63000m().f99337f;
        Context context = viewM63001n.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        upDownTextView2.setTextColor(C22890g.m54279d(context, C27039d.m66647g(m62993B(marketTickerStatsEntity.getPriceChangeRate1h())), 0, 2, null));
        UpDownTextView upDownTextView3 = m63000m().f99339h;
        BigDecimal bigDecimalM62993B2 = m62993B(marketTickerStatsEntity.getPriceChangeRate24h());
        upDownTextView3.setText(C42180b.m92649n(bigDecimalM62993B2 != null ? C42180b.m92642g(bigDecimalM62993B2, null, null, 0, true, false, false, 55, null) : null));
        UpDownTextView upDownTextView4 = m63000m().f99339h;
        Context context2 = viewM63001n.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        upDownTextView4.setTextColor(C22890g.m54279d(context2, C27039d.m66647g(m62993B(marketTickerStatsEntity.getPriceChangeRate24h())), 0, 2, null));
        UpDownTextView upDownTextView5 = m63000m().f99335d;
        BigDecimal bigDecimalM62993B3 = m62993B(marketTickerStatsEntity.getPriceChangeRate7d());
        upDownTextView5.setText(C42180b.m92649n(bigDecimalM62993B3 != null ? C42180b.m92642g(bigDecimalM62993B3, null, null, 0, true, false, false, 55, null) : null));
        UpDownTextView upDownTextView6 = m63000m().f99335d;
        Context context3 = viewM63001n.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        upDownTextView6.setTextColor(C22890g.m54279d(context3, C27039d.m66647g(m62993B(marketTickerStatsEntity.getPriceChangeRate7d())), 0, 2, null));
        BaseTextView baseTextView = m63000m().f99333b;
        BigDecimal bigDecimalM62993B4 = m62993B(marketTickerStatsEntity.getPriceAvg24h());
        baseTextView.setText(C27041f.m66669i(bigDecimalM62993B4 != null ? C37886j.m85579c(bigDecimalM62993B4, marketTickerStatsEntity.getSymbol(), (124 & 2) != 0 ? RoundingMode.DOWN : null, (124 & 4) != 0 ? false : false, (124 & 8) != 0 ? false : false, (124 & 16) != 0 ? true : true, (124 & 32) == 0 ? 0 : 0, (124 & 64) != 0 ? MultiLanguageManager.f46811g.getLocale() : null) : null, "--"));
        BaseTextView baseTextView2 = m63000m().f99351t;
        BigDecimal bigDecimalM62993B5 = m62993B(marketTickerStatsEntity.getHigh());
        baseTextView2.setText(C27041f.m66669i(bigDecimalM62993B5 != null ? C41014a.m89950x(C41014a.m89940n(bigDecimalM62993B5, "USD"), null, null, 0, false, false, true, false, 95, null) : null, "--"));
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: F */
    public final void m62997F(@Nullable WsMarketTickerStatsEntity wsMarketTickerStatsEntity) {
        if (wsMarketTickerStatsEntity == null) {
            return;
        }
        View viewM63001n = m63001n();
        UpDownTextView upDownTextView = m63000m().f99337f;
        BigDecimal bigDecimalM62993B = m62993B(wsMarketTickerStatsEntity.getPriceChangeRate1h());
        upDownTextView.setText(C42180b.m92649n(bigDecimalM62993B != null ? C42180b.m92642g(bigDecimalM62993B, null, null, 0, true, false, false, 55, null) : null));
        UpDownTextView upDownTextView2 = m63000m().f99337f;
        Context context = viewM63001n.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        upDownTextView2.setTextColor(C22890g.m54279d(context, C27039d.m66647g(m62993B(wsMarketTickerStatsEntity.getPriceChangeRate1h())), 0, 2, null));
        UpDownTextView upDownTextView3 = m63000m().f99339h;
        BigDecimal bigDecimalM62993B2 = m62993B(wsMarketTickerStatsEntity.getPriceChangeRate24h());
        upDownTextView3.setText(C42180b.m92649n(bigDecimalM62993B2 != null ? C42180b.m92642g(bigDecimalM62993B2, null, null, 0, true, false, false, 55, null) : null));
        UpDownTextView upDownTextView4 = m63000m().f99339h;
        Context context2 = viewM63001n.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        upDownTextView4.setTextColor(C22890g.m54279d(context2, C27039d.m66647g(m62993B(wsMarketTickerStatsEntity.getPriceChangeRate24h())), 0, 2, null));
        UpDownTextView upDownTextView5 = m63000m().f99335d;
        BigDecimal bigDecimalM62993B3 = m62993B(wsMarketTickerStatsEntity.getPriceChangeRate7d());
        upDownTextView5.setText(C42180b.m92649n(bigDecimalM62993B3 != null ? C42180b.m92642g(bigDecimalM62993B3, null, null, 0, true, false, false, 55, null) : null));
        UpDownTextView upDownTextView6 = m63000m().f99335d;
        Context context3 = viewM63001n.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        upDownTextView6.setTextColor(C22890g.m54279d(context3, C27039d.m66647g(m62993B(wsMarketTickerStatsEntity.getPriceChangeRate7d())), 0, 2, null));
        BaseTextView baseTextView = m63000m().f99333b;
        BigDecimal bigDecimalM62993B4 = m62993B(wsMarketTickerStatsEntity.getPriceAvg24h());
        baseTextView.setText(C27041f.m66669i(bigDecimalM62993B4 != null ? C37886j.m85579c(bigDecimalM62993B4, wsMarketTickerStatsEntity.getSymbol(), (124 & 2) != 0 ? RoundingMode.DOWN : null, (124 & 4) != 0 ? false : false, (124 & 8) != 0 ? false : false, (124 & 16) != 0 ? true : true, (124 & 32) == 0 ? 0 : 0, (124 & 64) != 0 ? MultiLanguageManager.f46811g.getLocale() : null) : null, "--"));
        BaseTextView baseTextView2 = m63000m().f99351t;
        BigDecimal bigDecimalM62993B5 = m62993B(wsMarketTickerStatsEntity.getHigh());
        baseTextView2.setText(C27041f.m66669i(bigDecimalM62993B5 != null ? C41014a.m89950x(C41014a.m89940n(bigDecimalM62993B5, "USD"), null, null, 0, false, false, true, false, 95, null) : null, "--"));
    }

    /* JADX INFO: renamed from: G */
    public final void m62998G(int i11, int i12) {
        AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54167X4(i11).m54156M4(C27017c.f54310a.m66516f(i12, new Object[0])).m54162S4(R$string.already_know, null).m54172c5(this.f51158a.getChildFragmentManager());
    }

    /* JADX INFO: renamed from: l */
    public final void m62999l(View view) {
        if (this.f51161d == null) {
            C23040f c23040f = new C23040f(m63001n(), -1, -2);
            this.f51161d = c23040f;
            c23040f.setFocusable(true);
            C23040f c23040f2 = this.f51161d;
            if (c23040f2 != null) {
                c23040f2.setBackgroundDrawable(new BitmapDrawable());
            }
            C23040f c23040f3 = this.f51161d;
            if (c23040f3 != null) {
                c23040f3.setAnimationStyle(R$style.TopInOutAnimation);
            }
            C23040f c23040f4 = this.f51161d;
            if (c23040f4 != null) {
                c23040f4.m55190q(0.2f);
            }
            C23040f c23040f5 = this.f51161d;
            if (c23040f5 != null) {
                c23040f5.m55187n();
            }
            C23040f c23040f6 = this.f51161d;
            if (c23040f6 != null) {
                c23040f6.m55181h(view);
            }
        }
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public final C44666t m63000m() {
        C44666t c44666t = this.f51159b;
        if (c44666t != null) {
            return c44666t;
        }
        Intrinsics.throwUninitializedPropertyAccessException("bkucoinLayoutMarketDetailPopupBinding");
        return null;
    }

    /* JADX INFO: renamed from: n */
    public final View m63001n() {
        return (View) this.f51160c.getValue();
    }

    /* JADX INFO: renamed from: z */
    public final void m63002z(@NotNull View dependView) {
        Intrinsics.checkNotNullParameter(dependView, "dependView");
        m62999l(dependView);
        C23040f c23040f = this.f51161d;
        if (c23040f != null) {
            c23040f.m55181h(dependView);
        }
        C23040f c23040f2 = this.f51161d;
        if (c23040f2 != null) {
            c23040f2.showAsDropDown(dependView, 0, 0);
        }
    }
}
