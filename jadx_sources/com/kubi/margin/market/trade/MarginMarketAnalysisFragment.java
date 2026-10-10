package com.kubi.margin.market.trade;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.gson.Gson;
import com.kubi.data.entity.TradeItemBean;
import com.kubi.margin.R$array;
import com.kubi.margin.R$color;
import com.kubi.margin.R$id;
import com.kubi.margin.R$layout;
import com.kubi.margin.R$string;
import com.kubi.margin.market.info.MarketTradeStat;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.resources.C22890g;
import com.kubi.resources.dialog.AlertDialogFragmentHelper;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.DashTextView;
import com.kubi.resources.widget.chart.KuCoinPieChartView;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.function.language.MultiLanguageManager;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.widget.dialog.BottomSheetDialogHelper;
import com.kubi.sdk.widget.dialog.SelectEntity;
import com.kubi.utils.C27017c;
import com.kubi.utils.C27051h;
import com.kubi.utils.C27063n;
import com.kubi.utils.C27096v0;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.DowngradeExKt;
import com.tencent.bugly.proguard.C33820nf;
import com.tencent.qcloud.tuicore.TUIConstants;
import gf.C37886j;
import io.chad.library.adapter.base.BaseViewHolder;
import io.reactivex.functions.BiConsumer;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import kotlinx.coroutines.C41696j;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p206dp.C36908d0;
import p402kf.C41014a;
import p429lf.C42180b;
import p768xo.InterfaceC46307h;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import p852kotlin.text.StringsKt;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import w00.C45681e;

/* JADX INFO: compiled from: MarginMarketAnalysisFragment.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 42\u00020\u0001:\u00014B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\u001a\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u001f2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\b\u0010)\u001a\u00020'H\u0016J\u0010\u0010*\u001a\u00020'2\u0006\u0010+\u001a\u00020\u001dH\u0002J\u001a\u0010,\u001a\u00020'2\u0006\u0010+\u001a\u00020\u001d2\b\u0010-\u001a\u0004\u0018\u00010.H\u0002J\u001a\u0010/\u001a\u00020'2\u0006\u0010+\u001a\u00020\u001d2\b\u0010-\u001a\u0004\u0018\u00010.H\u0002J\u0010\u00100\u001a\u00020'2\u0006\u0010+\u001a\u00020\u001dH\u0002J\u0010\u00101\u001a\u00020\u00182\u0006\u0010+\u001a\u00020\u001dH\u0002J\u001a\u00102\u001a\u0002032\b\u0010-\u001a\u0004\u0018\u00010.2\u0006\u0010+\u001a\u00020\u001dH\u0002R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R#\u0010\n\u001a\n \f*\u0004\u0018\u00010\u000b0\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001d\u0010\u0011\u001a\u0004\u0018\u00010\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0013\u0010\u0014R?\u0010\u0016\u001a&\u0012\f\u0012\n \f*\u0004\u0018\u00010\u00180\u0018 \f*\u0012\u0012\u000e\b\u0001\u0012\n \f*\u0004\u0018\u00010\u00180\u00180\u00170\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0010\u001a\u0004\b\u0019\u0010\u001aR\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u000e¢\u0006\u0002\n\u0000¨\u00065"}, m90084d2 = {"Lcom/kubi/margin/market/trade/MarginMarketAnalysisFragment;", "Lcom/kubi/sdk/BaseFragment;", "<init>", "()V", "bmarginFragmentMarketTradeGuideBinding", "Lcom/kubi/margin/databinding/BmarginFragmentMarketTradeGuideBinding;", "getBmarginFragmentMarketTradeGuideBinding", "()Lcom/kubi/margin/databinding/BmarginFragmentMarketTradeGuideBinding;", "bmarginFragmentMarketTradeGuideBinding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "api", "Lcom/kubi/margin/api/MarketApi;", "kotlin.jvm.PlatformType", "getApi", "()Lcom/kubi/margin/api/MarketApi;", "api$delegate", "Lkotlin/Lazy;", "tradeItemBean", "Lcom/kubi/data/entity/TradeItemBean;", "getTradeItemBean", "()Lcom/kubi/data/entity/TradeItemBean;", "tradeItemBean$delegate", "timeList", "", "", "getTimeList", "()[Ljava/lang/String;", "timeList$delegate", "timeType", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "savedInstanceState", "Landroid/os/Bundle;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, "fetchStat", "type", "setData", "data", "Lcom/kubi/margin/market/info/MarketTradeStat;", "setPieData", "onTypeChange", "getTimeParam", "getFormatPercent", "Lcom/kubi/utils/StyledText;", "Companion", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SuppressLint({"KCGsonCheck"})
@SourceDebugExtension({"SMAP\nMarginMarketAnalysisFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarginMarketAnalysisFragment.kt\ncom/kubi/margin/market/trade/MarginMarketAnalysisFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,279:1\n147#2,16:280\n11318#3:296\n11429#3,4:297\n*S KotlinDebug\n*F\n+ 1 MarginMarketAnalysisFragment.kt\ncom/kubi/margin/market/trade/MarginMarketAnalysisFragment\n*L\n52#1:280,16\n101#1:296\n101#1:297,4\n*E\n"})
public final class MarginMarketAnalysisFragment extends BaseFragment {

    /* JADX INFO: renamed from: U */
    @NotNull
    public final InterfaceC24293a f33457U = C45681e.m100799e(this, new Function1<MarginMarketAnalysisFragment, C36908d0>() { // from class: com.kubi.margin.market.trade.MarginMarketAnalysisFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C36908d0 invoke(@NotNull MarginMarketAnalysisFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C36908d0.m82685a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C36908d0, Unit>() { // from class: com.kubi.margin.market.trade.MarginMarketAnalysisFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C36908d0 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C36908d0 c36908d0) {
            invoke(c36908d0);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: V */
    @NotNull
    public final Lazy f33458V = LazyKt.lazy(new Function0() { // from class: com.kubi.margin.market.trade.a
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MarginMarketAnalysisFragment.m39239u3();
        }
    });

    /* JADX INFO: renamed from: W */
    @NotNull
    public final Lazy f33459W = LazyKt.lazy(new Function0() { // from class: com.kubi.margin.market.trade.b
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MarginMarketAnalysisFragment.m39227J3(this.f33498b);
        }
    });

    /* JADX INFO: renamed from: X */
    @NotNull
    public final Lazy f33460X = LazyKt.lazy(new Function0() { // from class: com.kubi.margin.market.trade.c
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MarginMarketAnalysisFragment.m39226I3(this.f33501b);
        }
    });

    /* JADX INFO: renamed from: Y */
    public int f33461Y;

    /* JADX INFO: renamed from: a0 */
    public static final /* synthetic */ KProperty<Object>[] f33456a0 = {Reflection.property1(new PropertyReference1Impl(MarginMarketAnalysisFragment.class, "bmarginFragmentMarketTradeGuideBinding", "getBmarginFragmentMarketTradeGuideBinding()Lcom/kubi/margin/databinding/BmarginFragmentMarketTradeGuideBinding;", 0))};

    /* JADX INFO: renamed from: Z */
    @NotNull
    public static final Companion f33455Z = new Companion(null);

    /* JADX INFO: compiled from: MarginMarketAnalysisFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, m90084d2 = {"Lcom/kubi/margin/market/trade/MarginMarketAnalysisFragment$Companion;", "", "<init>", "()V", "KEY_GUIDE_TIME_TYPE", "", "newInstance", "Lcom/kubi/margin/market/trade/MarginMarketAnalysisFragment;", "tradeItemBean", "Lcom/kubi/data/entity/TradeItemBean;", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final MarginMarketAnalysisFragment newInstance(@NotNull TradeItemBean tradeItemBean) {
            Intrinsics.checkNotNullParameter(tradeItemBean, "tradeItemBean");
            MarginMarketAnalysisFragment marginMarketAnalysisFragment = new MarginMarketAnalysisFragment();
            marginMarketAnalysisFragment.setArguments(new C27051h().m66721e("data", tradeItemBean).m66717a());
            return marginMarketAnalysisFragment;
        }
    }

    /* JADX INFO: renamed from: C3 */
    public static final Unit m39222C3(MarginMarketAnalysisFragment marginMarketAnalysisFragment) {
        AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54156M4(marginMarketAnalysisFragment.getString(R$string.price_section_tips, marginMarketAnalysisFragment.m39248z3()[marginMarketAnalysisFragment.f33461Y])).m54162S4(R$string.already_know, null).m54172c5(marginMarketAnalysisFragment.getChildFragmentManager());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: D3 */
    public static final Unit m39223D3(final MarginMarketAnalysisFragment marginMarketAnalysisFragment) {
        BottomSheetDialogHelper bottomSheetDialogHelper = BottomSheetDialogHelper.f48599a;
        String[] strArrM39248z3 = marginMarketAnalysisFragment.m39248z3();
        ArrayList arrayList = new ArrayList(strArrM39248z3.length);
        int length = strArrM39248z3.length;
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            String str = strArrM39248z3[i11];
            int i13 = i12 + 1;
            Intrinsics.checkNotNull(str);
            arrayList.add(new SelectEntity(null, str, String.valueOf(i12), null, null, null, null, null, null, false, marginMarketAnalysisFragment.f33461Y == i12, null, 3065, null));
            i11++;
            i12 = i13;
        }
        DialogFragmentHelper dialogFragmentHelperM58944B = BottomSheetDialogHelper.m58944B(bottomSheetDialogHelper, arrayList, new BiConsumer() { // from class: com.kubi.margin.market.trade.g
            @Override // io.reactivex.functions.BiConsumer
            public final void accept(Object obj, Object obj2) {
                MarginMarketAnalysisFragment.m39224E3(this.f33513b, (BaseViewHolder) obj, (BottomSheetDialogHelper.InterfaceC24339a) obj2);
            }
        }, false, null, null, false, 60, null);
        FragmentManager childFragmentManager = marginMarketAnalysisFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        dialogFragmentHelperM58944B.show(childFragmentManager, "dialog_lever_borrow_coin");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: G3 */
    public static final void m39225G3(C36908d0 c36908d0, MarketTradeStat marketTradeStat) {
        BaseTextView baseTextView = c36908d0.f81652n;
        if (baseTextView == null || c36908d0.f81653o == null) {
            return;
        }
        int i11 = baseTextView.getMeasuredWidth() > c36908d0.f81653o.getMeasuredWidth() ? R$id.tv_low : R$id.tv_low_label;
        BaseTextView baseTextView2 = c36908d0.f81650l;
        if (baseTextView2 == null || c36908d0.f81651m == null) {
            return;
        }
        int i12 = baseTextView2.getMeasuredWidth() > c36908d0.f81651m.getMeasuredWidth() ? R$id.tv_high : R$id.tv_high_label;
        if (c36908d0.f81641c == null) {
            return;
        }
        ConstraintSet constraintSet = new ConstraintSet();
        constraintSet.clone(c36908d0.f81641c);
        constraintSet.setHorizontalBias(R$id.thumb, marketTradeStat != null ? marketTradeStat.getCurrentBias() : 0.5f);
        int i13 = R$id.background;
        constraintSet.connect(i13, 6, i11, 7);
        constraintSet.connect(i13, 7, i12, 6);
        constraintSet.applyTo(c36908d0.f81641c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TradeItemBean getTradeItemBean() {
        return (TradeItemBean) this.f33459W.getValue();
    }

    /* JADX INFO: renamed from: u3 */
    public static final InterfaceC46307h m39239u3() {
        return (InterfaceC46307h) new Retrofit.Builder().baseUrl("https://appapi-v2.xcoinsystem.com/app/").client(C42597a.m93389e()).addConverterFactory(GsonConverterFactory.create(new Gson())).addCallAdapterFactory(RxJava2CallAdapterFactory.create()).build().create(InterfaceC46307h.class);
    }

    /* JADX INFO: renamed from: A3 */
    public final String m39240A3(int i11) {
        if (i11 != 0) {
            return i11 != 1 ? "24h" : "12h";
        }
        return "1h";
    }

    /* JADX INFO: renamed from: B3 */
    public final void m39241B3(int i11) {
        String string;
        if (i11 != 0) {
            string = i11 != 1 ? getString(R$string.market_24h) : getString(R$string.market_12h);
        } else {
            string = getString(R$string.market_1h);
        }
        Intrinsics.checkNotNull(string);
        C36908d0 c36908d0M39246x3 = m39246x3();
        if (c36908d0M39246x3 != null) {
            c36908d0M39246x3.f81655q.setText(string);
            c36908d0M39246x3.f81654p.setText(getString(R$string.price_section, string));
            c36908d0M39246x3.f81653o.setText(getString(R$string.price_section_low, string));
            c36908d0M39246x3.f81651m.setText(getString(R$string.price_section_high, string));
            c36908d0M39246x3.f81659u.setText(getString(R$string.trading_user_ratio, string));
            c36908d0M39246x3.f81657s.setText(getString(R$string.trading_choice_ratio, string));
            c36908d0M39246x3.f81661w.setText(getString(R$string.buy_sell_user_ratio, string));
            c36908d0M39246x3.f81648j.setText(getString(R$string.buy_sell_amount_ratio, string));
        }
    }

    /* JADX INFO: renamed from: F3 */
    public final void m39242F3(int i11, final MarketTradeStat marketTradeStat) {
        String strM85579c;
        String strM85579c2;
        int iM66512a;
        final C36908d0 c36908d0M39246x3 = m39246x3();
        if (c36908d0M39246x3 != null) {
            C27063n.m66770h(i11, "key_guide_time_type");
            this.f33461Y = i11;
            m39241B3(i11);
            BaseTextView baseTextView = c36908d0M39246x3.f81652n;
            BigDecimal bigDecimalM66671k = C27041f.m66671k(marketTradeStat != null ? marketTradeStat.getLowPrice() : null);
            if (bigDecimalM66671k != null) {
                TradeItemBean tradeItemBean = getTradeItemBean();
                strM85579c = C37886j.m85579c(bigDecimalM66671k, tradeItemBean != null ? tradeItemBean.getSymbol() : null, (124 & 2) != 0 ? RoundingMode.DOWN : null, (124 & 4) != 0 ? false : false, (124 & 8) != 0 ? false : false, (124 & 16) != 0 ? true : true, (124 & 32) == 0 ? 0 : 0, (124 & 64) != 0 ? MultiLanguageManager.f46811g.getLocale() : null);
            } else {
                strM85579c = null;
            }
            baseTextView.setText(C27041f.m66669i(strM85579c, "--"));
            BaseTextView baseTextView2 = c36908d0M39246x3.f81650l;
            BigDecimal bigDecimalM66671k2 = C27041f.m66671k(marketTradeStat != null ? marketTradeStat.getHighPrice() : null);
            if (bigDecimalM66671k2 != null) {
                TradeItemBean tradeItemBean2 = getTradeItemBean();
                strM85579c2 = C37886j.m85579c(bigDecimalM66671k2, tradeItemBean2 != null ? tradeItemBean2.getSymbol() : null, (124 & 2) != 0 ? RoundingMode.DOWN : null, (124 & 4) != 0 ? false : false, (124 & 8) != 0 ? false : false, (124 & 16) != 0 ? true : true, (124 & 32) == 0 ? 0 : 0, (124 & 64) != 0 ? MultiLanguageManager.f46811g.getLocale() : null);
            } else {
                strM85579c2 = null;
            }
            baseTextView2.setText(C27041f.m66669i(strM85579c2, "--"));
            c36908d0M39246x3.f81658t.setText(m39247y3(marketTradeStat, 0));
            c36908d0M39246x3.f81660v.setText(m39247y3(marketTradeStat, 1));
            c36908d0M39246x3.f81647i.setText(m39247y3(marketTradeStat, 2));
            c36908d0M39246x3.f81656r.setText(C27041f.m66669i(marketTradeStat != null ? marketTradeStat.sellOrBuy() : null, "--"));
            BaseTextView baseTextView3 = c36908d0M39246x3.f81656r;
            if (marketTradeStat != null) {
                Context contextRequireContext = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                iM66512a = marketTradeStat.sellOrBuyColor(contextRequireContext);
            } else {
                iM66512a = C27017c.f54310a.m66512a(R$color.c_text);
            }
            baseTextView3.setTextColor(iM66512a);
            c36908d0M39246x3.f81650l.post(new Runnable() { // from class: com.kubi.margin.market.trade.d
                @Override // java.lang.Runnable
                public final void run() {
                    MarginMarketAnalysisFragment.m39225G3(c36908d0M39246x3, marketTradeStat);
                }
            });
            m39243H3(0, marketTradeStat);
            m39243H3(1, marketTradeStat);
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001c  */
    /* JADX WARN: Code duplicated, block: B:18:0x0031  */
    /* JADX INFO: renamed from: H3 */
    public final void m39243H3(int i11, MarketTradeStat marketTradeStat) {
        String buyVolPer;
        BigDecimal bigDecimalSellVolPer;
        C36908d0 c36908d0M39246x3 = m39246x3();
        if (c36908d0M39246x3 != null) {
            KuCoinPieChartView kuCoinPieChartView = i11 == 0 ? c36908d0M39246x3.f81645g : c36908d0M39246x3.f81644f;
            Intrinsics.checkNotNull(kuCoinPieChartView);
            if (i11 == 0) {
                if (marketTradeStat != null) {
                    buyVolPer = marketTradeStat.getBuyUserPer();
                } else {
                    buyVolPer = null;
                }
            } else if (marketTradeStat != null) {
                buyVolPer = marketTradeStat.getBuyVolPer();
            } else {
                buyVolPer = null;
            }
            BigDecimal bigDecimalM66671k = C27041f.m66671k(buyVolPer);
            if (i11 == 0) {
                if (marketTradeStat != null) {
                    bigDecimalSellVolPer = marketTradeStat.sellUserPer();
                } else {
                    bigDecimalSellVolPer = null;
                }
            } else if (marketTradeStat != null) {
                bigDecimalSellVolPer = marketTradeStat.sellVolPer();
            } else {
                bigDecimalSellVolPer = null;
            }
            int colorRes = getColorRes(R$color.c_transparent);
            int colorRes2 = getColorRes(R$color.emphasis8);
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            int iM54291p = C22890g.m54291p(contextRequireContext);
            Context contextRequireContext2 = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
            int iM54289n = C22890g.m54289n(contextRequireContext2);
            if (bigDecimalM66671k == null) {
                kuCoinPieChartView.setPieData(CollectionsKt.arrayListOf(new Pair(Integer.valueOf(colorRes2), Double.valueOf(1.0d))));
                return;
            }
            BigDecimal bigDecimal = BigDecimal.ONE;
            if (bigDecimalM66671k.compareTo(bigDecimal) >= 0) {
                kuCoinPieChartView.setPieData(CollectionsKt.arrayListOf(new Pair(Integer.valueOf(iM54291p), Double.valueOf(1.0d))));
                return;
            }
            if (C41014a.m89922G(bigDecimalSellVolPer, null, 1, null).compareTo(bigDecimal) >= 0) {
                kuCoinPieChartView.setPieData(CollectionsKt.arrayListOf(new Pair(Integer.valueOf(iM54289n), Double.valueOf(1.0d))));
                return;
            }
            double dM66647g = C27039d.m66647g(bigDecimalM66671k.subtract(new BigDecimal("0.01")));
            double dM66647g2 = C27039d.m66647g(bigDecimalSellVolPer != null ? bigDecimalSellVolPer.subtract(new BigDecimal("0.01")) : null);
            if (dM66647g < 0.01d) {
                dM66647g = 0.01d;
                dM66647g2 = 0.97d;
            } else if (dM66647g2 < 0.01d && bigDecimalM66671k.compareTo(bigDecimal) != 0) {
                dM66647g2 = 0.01d;
                dM66647g = 0.97d;
            }
            kuCoinPieChartView.setPieData(CollectionsKt.arrayListOf(new Pair(Integer.valueOf(colorRes), Double.valueOf(0.005d)), new Pair(Integer.valueOf(iM54289n), Double.valueOf(dM66647g2)), new Pair(Integer.valueOf(colorRes), Double.valueOf(0.005d)), new Pair(Integer.valueOf(colorRes), Double.valueOf(0.005d)), new Pair(Integer.valueOf(iM54291p), Double.valueOf(dM66647g)), new Pair(Integer.valueOf(colorRes), Double.valueOf(0.005d))));
        }
    }

    @Override // com.kubi.sdk.BaseFragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable Bundle savedInstanceState, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(R$layout.bmargin_fragment_market_trade_guide, (ViewGroup) null);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        BaseTextView baseTextView;
        DashTextView dashTextView;
        DashTextView dashTextView2;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        this.f33461Y = C27063n.m66764b("key_guide_time_type", 0);
        C36908d0 c36908d0M39246x3 = m39246x3();
        if (c36908d0M39246x3 != null && (dashTextView2 = c36908d0M39246x3.f81654p) != null) {
            dashTextView2.setNeedDash(true);
        }
        C36908d0 c36908d0M39246x4 = m39246x3();
        if (c36908d0M39246x4 != null && (dashTextView = c36908d0M39246x4.f81654p) != null) {
            C27046k.m66711z(dashTextView, 0L, new Function0() { // from class: com.kubi.margin.market.trade.e
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MarginMarketAnalysisFragment.m39222C3(this.f33507b);
                }
            }, 1, null);
        }
        C36908d0 c36908d0M39246x5 = m39246x3();
        if (c36908d0M39246x5 != null && (baseTextView = c36908d0M39246x5.f81655q) != null) {
            C27046k.m66711z(baseTextView, 0L, new Function0() { // from class: com.kubi.margin.market.trade.f
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MarginMarketAnalysisFragment.m39223D3(this.f33510b);
                }
            }, 1, null);
        }
        m39241B3(this.f33461Y);
    }

    /* JADX INFO: renamed from: w3 */
    public final InterfaceC46307h m39245w3() {
        return (InterfaceC46307h) this.f33458V.getValue();
    }

    /* JADX INFO: renamed from: x3 */
    public final C36908d0 m39246x3() {
        return (C36908d0) this.f33457U.getValue(this, f33456a0[0]);
    }

    /* JADX INFO: renamed from: y3 */
    public final C27096v0 m39247y3(MarketTradeStat marketTradeStat, int i11) {
        String tradeUserPer;
        C27096v0 c27096v0 = new C27096v0();
        if (marketTradeStat == null) {
            c27096v0.append(C33820nf.f71144W);
        } else {
            if (i11 != 0) {
                tradeUserPer = i11 != 1 ? marketTradeStat.getBuyVolPer() : marketTradeStat.getBuyUserPer();
            } else {
                tradeUserPer = marketTradeStat.getTradeUserPer();
            }
            if (tradeUserPer == null) {
                c27096v0.append("0");
            } else {
                BigDecimal bigDecimalM66671k = C27041f.m66671k(tradeUserPer);
                c27096v0.append(StringsKt.replace$default(C42180b.m92649n(bigDecimalM66671k != null ? C42180b.m92642g(bigDecimalM66671k, null, null, 0, false, true, false, 47, null) : null), "%", "", false, 4, (Object) null));
            }
        }
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(getColorRes(R$color.emphasis60));
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        c27096v0.m66903c("%", foregroundColorSpan, new AbsoluteSizeSpan((int) C27025c.m66568f(contextRequireContext, 12)));
        return c27096v0;
    }

    /* JADX INFO: renamed from: z3 */
    public final String[] m39248z3() {
        return (String[]) this.f33460X.getValue();
    }

    /* JADX INFO: renamed from: E3 */
    public static final void m39224E3(MarginMarketAnalysisFragment marginMarketAnalysisFragment, BaseViewHolder baseViewHolder, BottomSheetDialogHelper.InterfaceC24339a interfaceC24339a) {
        marginMarketAnalysisFragment.m39244v3(DowngradeExKt.m66543m(interfaceC24339a.getValue(), 0, 1, null));
    }

    /* JADX INFO: renamed from: I3 */
    public static final String[] m39226I3(MarginMarketAnalysisFragment marginMarketAnalysisFragment) {
        return marginMarketAnalysisFragment.getResources().getStringArray(R$array.margin_market_guide_time);
    }

    /* JADX INFO: renamed from: J3 */
    public static final TradeItemBean m39227J3(MarginMarketAnalysisFragment marginMarketAnalysisFragment) {
        Bundle arguments = marginMarketAnalysisFragment.getArguments();
        if (arguments != null) {
            return (TradeItemBean) arguments.getParcelable("data");
        }
        return null;
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onShow() {
        super.onShow();
        m39244v3(this.f33461Y);
    }

    /* JADX INFO: renamed from: v3 */
    public final void m39244v3(int i11) {
        C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new MarginMarketAnalysisFragment$fetchStat$1(this, i11, null), 3, null);
    }
}
