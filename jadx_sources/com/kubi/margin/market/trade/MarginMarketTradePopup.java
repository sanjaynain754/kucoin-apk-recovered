package com.kubi.margin.market.trade;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.kubi.margin.R$layout;
import com.kubi.margin.R$string;
import com.kubi.margin.R$style;
import com.kubi.margin.market.info.MarketCoinInfo;
import com.kubi.margin.market.info.MarketTickerStatsEntity;
import com.kubi.margin.market.info.WsMarketTickerStatsEntity;
import com.kubi.resources.C22890g;
import com.kubi.resources.dialog.AlertDialogFragmentHelper;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.C23040f;
import com.kubi.resources.widget.DashTextView;
import com.kubi.resources.widget.UpDownTextView;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.function.language.MultiLanguageManager;
import com.kubi.utils.C27017c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import gf.C37886j;
import java.math.BigDecimal;
import java.math.RoundingMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p206dp.C36934q0;
import p402kf.C41014a;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.kubi.margin.market.trade.q0, reason: from Kotlin metadata */
/* JADX INFO: compiled from: MarginMarketTradePopup.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\tJ\u0010\u0010\u0014\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\tJ\u0010\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\tH\u0002J\u0010\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0018H\u0007J\u0012\u0010\u0019\u001a\u00020\u00122\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0007J\u0012\u0010\u0019\u001a\u00020\u00122\b\u0010\u001a\u001a\u0004\u0018\u00010\u001cH\u0007J\u0018\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001fH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.¢\u0006\u0002\n\u0000R#\u0010\b\u001a\n \n*\u0004\u0018\u00010\t0\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006!"}, m90084d2 = {"Lcom/kubi/margin/market/trade/MarginMarketTradePopup;", "", "fragment", "Lcom/kubi/sdk/BaseFragment;", "<init>", "(Lcom/kubi/sdk/BaseFragment;)V", "bmarginLayoutMarketDetailPopupBinding", "Lcom/kubi/margin/databinding/BmarginLayoutMarketDetailPopupBinding;", "mContentView", "Landroid/view/View;", "kotlin.jvm.PlatformType", "getMContentView", "()Landroid/view/View;", "mContentView$delegate", "Lkotlin/Lazy;", "mPopupWindow", "Lcom/kubi/resources/widget/BackgroundDarkPopupWindow;", "popUp", "", "dependView", "resetLoc", "checkPopup", "setContentView", "info", "Lcom/kubi/margin/market/info/MarketCoinInfo;", "setTicker", "ticker", "Lcom/kubi/margin/market/info/MarketTickerStatsEntity;", "Lcom/kubi/margin/market/info/WsMarketTickerStatsEntity;", "showTips", "titleId", "", "tipsId", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nMarginMarketTradePopup.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarginMarketTradePopup.kt\ncom/kubi/margin/market/trade/MarginMarketTradePopup\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,207:1\n1#2:208\n*E\n"})
public final class MarginMarketTradePopup {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final BaseFragment f33538a;

    /* JADX INFO: renamed from: b */
    public C36934q0 f33539b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final Lazy f33540c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public C23040f f33541d;

    public MarginMarketTradePopup(@NotNull BaseFragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        this.f33538a = fragment;
        this.f33540c = LazyKt.lazy(new Function0() { // from class: com.kubi.margin.market.trade.f0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MarginMarketTradePopup.m39410n(this.f33511b);
            }
        });
    }

    /* JADX INFO: renamed from: n */
    public static final View m39410n(final MarginMarketTradePopup marginMarketTradePopup) {
        C36934q0 c36934q0 = null;
        View viewInflate = LayoutInflater.from(marginMarketTradePopup.f33538a.requireContext()).inflate(R$layout.bmargin_layout_market_detail_popup, (ViewGroup) null);
        C36934q0 c36934q0M82737a = C36934q0.m82737a(viewInflate);
        Intrinsics.checkNotNullExpressionValue(c36934q0M82737a, "bind(...)");
        marginMarketTradePopup.f33539b = c36934q0M82737a;
        if (c36934q0M82737a == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bmarginLayoutMarketDetailPopupBinding");
            c36934q0M82737a = null;
        }
        DashTextView rankLabel = c36934q0M82737a.f81922q;
        Intrinsics.checkNotNullExpressionValue(rankLabel, "rankLabel");
        C27046k.m66711z(rankLabel, 0L, new Function0() { // from class: com.kubi.margin.market.trade.h0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MarginMarketTradePopup.m39411o(this.f33515b);
            }
        }, 1, null);
        C36934q0 c36934q1 = marginMarketTradePopup.f33539b;
        if (c36934q1 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bmarginLayoutMarketDetailPopupBinding");
            c36934q1 = null;
        }
        DashTextView ratingLabel = c36934q1.f81924s;
        Intrinsics.checkNotNullExpressionValue(ratingLabel, "ratingLabel");
        C27046k.m66711z(ratingLabel, 0L, new Function0() { // from class: com.kubi.margin.market.trade.i0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MarginMarketTradePopup.m39412p(this.f33517b);
            }
        }, 1, null);
        C36934q0 c36934q2 = marginMarketTradePopup.f33539b;
        if (c36934q2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bmarginLayoutMarketDetailPopupBinding");
            c36934q2 = null;
        }
        DashTextView marketValueLabel = c36934q2.f81918m;
        Intrinsics.checkNotNullExpressionValue(marketValueLabel, "marketValueLabel");
        C27046k.m66711z(marketValueLabel, 0L, new Function0() { // from class: com.kubi.margin.market.trade.j0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MarginMarketTradePopup.m39413q(this.f33519b);
            }
        }, 1, null);
        C36934q0 c36934q3 = marginMarketTradePopup.f33539b;
        if (c36934q3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bmarginLayoutMarketDetailPopupBinding");
            c36934q3 = null;
        }
        DashTextView maxSupplyLabel = c36934q3.f81920o;
        Intrinsics.checkNotNullExpressionValue(maxSupplyLabel, "maxSupplyLabel");
        C27046k.m66711z(maxSupplyLabel, 0L, new Function0() { // from class: com.kubi.margin.market.trade.k0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MarginMarketTradePopup.m39414r(this.f33521b);
            }
        }, 1, null);
        C36934q0 c36934q4 = marginMarketTradePopup.f33539b;
        if (c36934q4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bmarginLayoutMarketDetailPopupBinding");
            c36934q4 = null;
        }
        DashTextView circulatingSupplyLabel = c36934q4.f81916k;
        Intrinsics.checkNotNullExpressionValue(circulatingSupplyLabel, "circulatingSupplyLabel");
        C27046k.m66711z(circulatingSupplyLabel, 0L, new Function0() { // from class: com.kubi.margin.market.trade.l0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MarginMarketTradePopup.m39415s(this.f33524b);
            }
        }, 1, null);
        C36934q0 c36934q5 = marginMarketTradePopup.f33539b;
        if (c36934q5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bmarginLayoutMarketDetailPopupBinding");
            c36934q5 = null;
        }
        DashTextView change1hLabel = c36934q5.f81912g;
        Intrinsics.checkNotNullExpressionValue(change1hLabel, "change1hLabel");
        C27046k.m66711z(change1hLabel, 0L, new Function0() { // from class: com.kubi.margin.market.trade.m0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MarginMarketTradePopup.m39416t(this.f33527b);
            }
        }, 1, null);
        C36934q0 c36934q6 = marginMarketTradePopup.f33539b;
        if (c36934q6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bmarginLayoutMarketDetailPopupBinding");
            c36934q6 = null;
        }
        DashTextView change24hLabel = c36934q6.f81914i;
        Intrinsics.checkNotNullExpressionValue(change24hLabel, "change24hLabel");
        C27046k.m66711z(change24hLabel, 0L, new Function0() { // from class: com.kubi.margin.market.trade.n0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MarginMarketTradePopup.m39417u(this.f33529b);
            }
        }, 1, null);
        C36934q0 c36934q7 = marginMarketTradePopup.f33539b;
        if (c36934q7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bmarginLayoutMarketDetailPopupBinding");
            c36934q7 = null;
        }
        DashTextView chang7dLabel = c36934q7.f81910e;
        Intrinsics.checkNotNullExpressionValue(chang7dLabel, "chang7dLabel");
        C27046k.m66711z(chang7dLabel, 0L, new Function0() { // from class: com.kubi.margin.market.trade.o0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MarginMarketTradePopup.m39418v(this.f33530b);
            }
        }, 1, null);
        C36934q0 c36934q8 = marginMarketTradePopup.f33539b;
        if (c36934q8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bmarginLayoutMarketDetailPopupBinding");
            c36934q8 = null;
        }
        DashTextView averagePriceLabel = c36934q8.f81908c;
        Intrinsics.checkNotNullExpressionValue(averagePriceLabel, "averagePriceLabel");
        C27046k.m66711z(averagePriceLabel, 0L, new Function0() { // from class: com.kubi.margin.market.trade.p0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MarginMarketTradePopup.m39419w(this.f33533b);
            }
        }, 1, null);
        C36934q0 c36934q9 = marginMarketTradePopup.f33539b;
        if (c36934q9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bmarginLayoutMarketDetailPopupBinding");
        } else {
            c36934q0 = c36934q9;
        }
        DashTextView topPriceLabel = c36934q0.f81926u;
        Intrinsics.checkNotNullExpressionValue(topPriceLabel, "topPriceLabel");
        C27046k.m66711z(topPriceLabel, 0L, new Function0() { // from class: com.kubi.margin.market.trade.g0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MarginMarketTradePopup.m39420x(this.f33514b);
            }
        }, 1, null);
        return viewInflate;
    }

    /* JADX INFO: renamed from: o */
    public static final Unit m39411o(MarginMarketTradePopup marginMarketTradePopup) {
        marginMarketTradePopup.m39424D(R$string.rank_label, R$string.rank_desc);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: p */
    public static final Unit m39412p(MarginMarketTradePopup marginMarketTradePopup) {
        marginMarketTradePopup.m39424D(R$string.rating_label, R$string.rating_desc);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: q */
    public static final Unit m39413q(MarginMarketTradePopup marginMarketTradePopup) {
        marginMarketTradePopup.m39424D(R$string.market_cap_label, R$string.market_cap_desc);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: r */
    public static final Unit m39414r(MarginMarketTradePopup marginMarketTradePopup) {
        marginMarketTradePopup.m39424D(R$string.max_supply_label, R$string.max_supply_desc);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: s */
    public static final Unit m39415s(MarginMarketTradePopup marginMarketTradePopup) {
        marginMarketTradePopup.m39424D(R$string.max_circulating_label, R$string.max_circulating_desc);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: t */
    public static final Unit m39416t(MarginMarketTradePopup marginMarketTradePopup) {
        marginMarketTradePopup.m39424D(R$string.change_rate_1h_label, R$string.change_rate_1h_desc);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: u */
    public static final Unit m39417u(MarginMarketTradePopup marginMarketTradePopup) {
        marginMarketTradePopup.m39424D(R$string.change_rate_24h_label, R$string.change_rate_24h_desc);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: v */
    public static final Unit m39418v(MarginMarketTradePopup marginMarketTradePopup) {
        marginMarketTradePopup.m39424D(R$string.change_rate_7d_label, R$string.change_rate_7d_desc);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: w */
    public static final Unit m39419w(MarginMarketTradePopup marginMarketTradePopup) {
        marginMarketTradePopup.m39424D(R$string.average_price_label, R$string.average_price_desc);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: x */
    public static final Unit m39420x(MarginMarketTradePopup marginMarketTradePopup) {
        marginMarketTradePopup.m39424D(R$string.ath_label, R$string.ath_desc);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0031  */
    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: A */
    public final void m39421A(@NotNull MarketCoinInfo info) {
        String str;
        Intrinsics.checkNotNullParameter(info, "info");
        m39426m();
        C36934q0 c36934q0 = this.f33539b;
        if (c36934q0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bmarginLayoutMarketDetailPopupBinding");
            c36934q0 = null;
        }
        BaseTextView baseTextView = c36934q0.f81921p;
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
        C36934q0 c36934q1 = this.f33539b;
        if (c36934q1 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bmarginLayoutMarketDetailPopupBinding");
            c36934q1 = null;
        }
        c36934q1.f81923r.setText(C27041f.m66669i(info.getRating(), "--"));
        C36934q0 c36934q2 = this.f33539b;
        if (c36934q2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bmarginLayoutMarketDetailPopupBinding");
            c36934q2 = null;
        }
        BaseTextView baseTextView2 = c36934q2.f81917l;
        BigDecimal bigDecimalM66671k = C27041f.m66671k(info.getMarketCap());
        baseTextView2.setText(C41014a.m89930d(bigDecimalM66671k != null ? new BigDecimal(String.valueOf(C41014a.m89940n(bigDecimalM66671k, "USD"))) : null, true));
        C36934q0 c36934q3 = this.f33539b;
        if (c36934q3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bmarginLayoutMarketDetailPopupBinding");
            c36934q3 = null;
        }
        c36934q3.f81919n.setText(C41014a.m89931e(C27041f.m66671k(info.getMaxSupply()), false, 1, null));
        C36934q0 c36934q4 = this.f33539b;
        if (c36934q4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bmarginLayoutMarketDetailPopupBinding");
            c36934q4 = null;
        }
        c36934q4.f81915j.setText(C41014a.m89931e(C27041f.m66671k(info.getCirculatingSupply()), false, 1, null));
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: B */
    public final void m39422B(@Nullable MarketTickerStatsEntity marketTickerStatsEntity) {
        if (marketTickerStatsEntity == null) {
            return;
        }
        View viewM39426m = m39426m();
        C36934q0 c36934q0 = this.f33539b;
        if (c36934q0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bmarginLayoutMarketDetailPopupBinding");
            c36934q0 = null;
        }
        UpDownTextView upDownTextView = c36934q0.f81911f;
        BigDecimal bigDecimalM66671k = C27041f.m66671k(marketTickerStatsEntity.getPriceChangeRate1h());
        Double dValueOf = bigDecimalM66671k != null ? Double.valueOf(bigDecimalM66671k.doubleValue()) : null;
        Context context = viewM39426m.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        upDownTextView.m54919g(dValueOf, C22890g.m54279d(context, C27039d.m66647g(C27041f.m66671k(marketTickerStatsEntity.getPriceChangeRate1h())), 0, 2, null));
        C36934q0 c36934q1 = this.f33539b;
        if (c36934q1 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bmarginLayoutMarketDetailPopupBinding");
            c36934q1 = null;
        }
        UpDownTextView upDownTextView2 = c36934q1.f81913h;
        BigDecimal bigDecimalM66671k2 = C27041f.m66671k(marketTickerStatsEntity.getPriceChangeRate24h());
        Double dValueOf2 = bigDecimalM66671k2 != null ? Double.valueOf(bigDecimalM66671k2.doubleValue()) : null;
        Context context2 = viewM39426m.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        upDownTextView2.m54919g(dValueOf2, C22890g.m54279d(context2, C27039d.m66647g(C27041f.m66671k(marketTickerStatsEntity.getPriceChangeRate24h())), 0, 2, null));
        C36934q0 c36934q2 = this.f33539b;
        if (c36934q2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bmarginLayoutMarketDetailPopupBinding");
            c36934q2 = null;
        }
        UpDownTextView upDownTextView3 = c36934q2.f81909d;
        BigDecimal bigDecimalM66671k3 = C27041f.m66671k(marketTickerStatsEntity.getPriceChangeRate7d());
        Double dValueOf3 = bigDecimalM66671k3 != null ? Double.valueOf(bigDecimalM66671k3.doubleValue()) : null;
        Context context3 = viewM39426m.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        upDownTextView3.m54919g(dValueOf3, C22890g.m54279d(context3, C27039d.m66647g(C27041f.m66671k(marketTickerStatsEntity.getPriceChangeRate7d())), 0, 2, null));
        C36934q0 c36934q3 = this.f33539b;
        if (c36934q3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bmarginLayoutMarketDetailPopupBinding");
            c36934q3 = null;
        }
        BaseTextView baseTextView = c36934q3.f81907b;
        BigDecimal bigDecimalM66671k4 = C27041f.m66671k(marketTickerStatsEntity.getPriceAvg24h());
        baseTextView.setText(C27041f.m66669i(bigDecimalM66671k4 != null ? C37886j.m85579c(bigDecimalM66671k4, marketTickerStatsEntity.getSymbol(), (124 & 2) != 0 ? RoundingMode.DOWN : null, (124 & 4) != 0 ? false : false, (124 & 8) != 0 ? false : false, (124 & 16) != 0 ? true : true, (124 & 32) == 0 ? 0 : 0, (124 & 64) != 0 ? MultiLanguageManager.f46811g.getLocale() : null) : null, "--"));
        C36934q0 c36934q4 = this.f33539b;
        if (c36934q4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bmarginLayoutMarketDetailPopupBinding");
            c36934q4 = null;
        }
        BaseTextView baseTextView2 = c36934q4.f81925t;
        BigDecimal bigDecimalM66671k5 = C27041f.m66671k(marketTickerStatsEntity.getHigh());
        baseTextView2.setText(C27041f.m66669i(bigDecimalM66671k5 != null ? C41014a.m89950x(C41014a.m89940n(bigDecimalM66671k5, "USD"), null, null, 0, false, false, true, false, 95, null) : null, "--"));
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: C */
    public final void m39423C(@Nullable WsMarketTickerStatsEntity wsMarketTickerStatsEntity) {
        if (wsMarketTickerStatsEntity == null) {
            return;
        }
        View viewM39426m = m39426m();
        C36934q0 c36934q0 = this.f33539b;
        if (c36934q0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bmarginLayoutMarketDetailPopupBinding");
            c36934q0 = null;
        }
        UpDownTextView upDownTextView = c36934q0.f81911f;
        BigDecimal bigDecimalM66671k = C27041f.m66671k(wsMarketTickerStatsEntity.getPriceChangeRate1h());
        Double dValueOf = bigDecimalM66671k != null ? Double.valueOf(bigDecimalM66671k.doubleValue()) : null;
        Context context = viewM39426m.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        upDownTextView.m54919g(dValueOf, C22890g.m54279d(context, C27039d.m66647g(C27041f.m66671k(wsMarketTickerStatsEntity.getPriceChangeRate1h())), 0, 2, null));
        C36934q0 c36934q1 = this.f33539b;
        if (c36934q1 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bmarginLayoutMarketDetailPopupBinding");
            c36934q1 = null;
        }
        UpDownTextView upDownTextView2 = c36934q1.f81913h;
        BigDecimal bigDecimalM66671k2 = C27041f.m66671k(wsMarketTickerStatsEntity.getPriceChangeRate24h());
        Double dValueOf2 = bigDecimalM66671k2 != null ? Double.valueOf(bigDecimalM66671k2.doubleValue()) : null;
        Context context2 = viewM39426m.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        upDownTextView2.m54919g(dValueOf2, C22890g.m54279d(context2, C27039d.m66647g(C27041f.m66671k(wsMarketTickerStatsEntity.getPriceChangeRate24h())), 0, 2, null));
        C36934q0 c36934q2 = this.f33539b;
        if (c36934q2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bmarginLayoutMarketDetailPopupBinding");
            c36934q2 = null;
        }
        UpDownTextView upDownTextView3 = c36934q2.f81909d;
        BigDecimal bigDecimalM66671k3 = C27041f.m66671k(wsMarketTickerStatsEntity.getPriceChangeRate7d());
        Double dValueOf3 = bigDecimalM66671k3 != null ? Double.valueOf(bigDecimalM66671k3.doubleValue()) : null;
        Context context3 = viewM39426m.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        upDownTextView3.m54919g(dValueOf3, C22890g.m54279d(context3, C27039d.m66647g(C27041f.m66671k(wsMarketTickerStatsEntity.getPriceChangeRate7d())), 0, 2, null));
        C36934q0 c36934q3 = this.f33539b;
        if (c36934q3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bmarginLayoutMarketDetailPopupBinding");
            c36934q3 = null;
        }
        BaseTextView baseTextView = c36934q3.f81907b;
        BigDecimal bigDecimalM66671k4 = C27041f.m66671k(wsMarketTickerStatsEntity.getPriceAvg24h());
        baseTextView.setText(C27041f.m66669i(bigDecimalM66671k4 != null ? C37886j.m85579c(bigDecimalM66671k4, wsMarketTickerStatsEntity.getSymbol(), (124 & 2) != 0 ? RoundingMode.DOWN : null, (124 & 4) != 0 ? false : false, (124 & 8) != 0 ? false : false, (124 & 16) != 0 ? true : true, (124 & 32) == 0 ? 0 : 0, (124 & 64) != 0 ? MultiLanguageManager.f46811g.getLocale() : null) : null, "--"));
        C36934q0 c36934q4 = this.f33539b;
        if (c36934q4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bmarginLayoutMarketDetailPopupBinding");
            c36934q4 = null;
        }
        BaseTextView baseTextView2 = c36934q4.f81925t;
        BigDecimal bigDecimalM66671k5 = C27041f.m66671k(wsMarketTickerStatsEntity.getHigh());
        baseTextView2.setText(C27041f.m66669i(bigDecimalM66671k5 != null ? C41014a.m89950x(C41014a.m89940n(bigDecimalM66671k5, "USD"), null, null, 0, false, false, true, false, 95, null) : null, "--"));
    }

    /* JADX INFO: renamed from: D */
    public final void m39424D(int i11, int i12) {
        AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54167X4(i11).m54156M4(C27017c.f54310a.m66516f(i12, new Object[0])).m54162S4(R$string.already_know, null).m54172c5(this.f33538a.getChildFragmentManager());
    }

    /* JADX INFO: renamed from: l */
    public final void m39425l(View view) {
        if (this.f33541d == null) {
            C23040f c23040f = new C23040f(m39426m(), -1, -2);
            this.f33541d = c23040f;
            c23040f.setFocusable(true);
            C23040f c23040f2 = this.f33541d;
            if (c23040f2 != null) {
                c23040f2.setBackgroundDrawable(new BitmapDrawable());
            }
            C23040f c23040f3 = this.f33541d;
            if (c23040f3 != null) {
                c23040f3.setAnimationStyle(R$style.TopInOutAnimation);
            }
            C23040f c23040f4 = this.f33541d;
            if (c23040f4 != null) {
                c23040f4.m55190q(0.2f);
            }
            C23040f c23040f5 = this.f33541d;
            if (c23040f5 != null) {
                c23040f5.m55187n();
            }
            C23040f c23040f6 = this.f33541d;
            if (c23040f6 != null) {
                c23040f6.m55181h(view);
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public final View m39426m() {
        return (View) this.f33540c.getValue();
    }

    /* JADX INFO: renamed from: y */
    public final void m39427y(@NotNull View dependView) {
        Intrinsics.checkNotNullParameter(dependView, "dependView");
        m39425l(dependView);
        C23040f c23040f = this.f33541d;
        if (c23040f != null) {
            c23040f.m55181h(dependView);
        }
        C23040f c23040f2 = this.f33541d;
        if (c23040f2 != null) {
            c23040f2.showAsDropDown(dependView, 0, 0);
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m39428z(@Nullable View view) {
        if (view != null) {
            m39425l(view);
            C23040f c23040f = this.f33541d;
            if (c23040f != null) {
                c23040f.m55188o(view);
            }
        }
    }
}
