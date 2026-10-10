package com.kubi.spot.quote.market.trade;

import android.content.Context;
import android.os.Bundle;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.blankj.utilcode.util.C5303w0;
import com.google.gson.Gson;
import com.kubi.data.entity.TradeItemBean;
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
import com.kubi.spot.R$array;
import com.kubi.spot.R$color;
import com.kubi.spot.R$id;
import com.kubi.spot.R$layout;
import com.kubi.spot.R$string;
import com.kubi.spot.quote.market.info.MarketTradeStat;
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
import e20.InterfaceC37053d;
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
import p402kf.C41014a;
import p429lf.C42180b;
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
import t20.C44654n;
import w00.C45681e;

/* JADX INFO: compiled from: MarketAnalysisFragment.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 42\u00020\u0001:\u00014B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\u001a\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u001f2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\b\u0010)\u001a\u00020'H\u0016J\u0010\u0010*\u001a\u00020'2\u0006\u0010+\u001a\u00020\u001dH\u0002J\u001a\u0010,\u001a\u00020'2\u0006\u0010+\u001a\u00020\u001d2\b\u0010-\u001a\u0004\u0018\u00010.H\u0002J\u001a\u0010/\u001a\u00020'2\u0006\u0010+\u001a\u00020\u001d2\b\u0010-\u001a\u0004\u0018\u00010.H\u0002J\u0010\u00100\u001a\u00020'2\u0006\u0010+\u001a\u00020\u001dH\u0002J\u0010\u00101\u001a\u00020\u00182\u0006\u0010+\u001a\u00020\u001dH\u0002J\u001a\u00102\u001a\u0002032\b\u0010-\u001a\u0004\u0018\u00010.2\u0006\u0010+\u001a\u00020\u001dH\u0002R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R#\u0010\n\u001a\n \f*\u0004\u0018\u00010\u000b0\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001d\u0010\u0011\u001a\u0004\u0018\u00010\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0013\u0010\u0014R?\u0010\u0016\u001a&\u0012\f\u0012\n \f*\u0004\u0018\u00010\u00180\u0018 \f*\u0012\u0012\u000e\b\u0001\u0012\n \f*\u0004\u0018\u00010\u00180\u00180\u00170\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0010\u001a\u0004\b\u0019\u0010\u001aR\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u000e¢\u0006\u0002\n\u0000¨\u00065"}, m90084d2 = {"Lcom/kubi/spot/quote/market/trade/MarketAnalysisFragment;", "Lcom/kubi/sdk/BaseFragment;", "<init>", "()V", "binding", "Lcom/kubi/spot/databinding/BkucoinFragmentMarketTradeGuideBinding;", "getBinding", "()Lcom/kubi/spot/databinding/BkucoinFragmentMarketTradeGuideBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "api", "Lcom/kubi/spot/api/MarketApi;", "kotlin.jvm.PlatformType", "getApi", "()Lcom/kubi/spot/api/MarketApi;", "api$delegate", "Lkotlin/Lazy;", "tradeItemBean", "Lcom/kubi/data/entity/TradeItemBean;", "getTradeItemBean", "()Lcom/kubi/data/entity/TradeItemBean;", "tradeItemBean$delegate", "timeList", "", "", "getTimeList", "()[Ljava/lang/String;", "timeList$delegate", "timeType", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "savedInstanceState", "Landroid/os/Bundle;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, "fetchStat", "type", "setData", "data", "Lcom/kubi/spot/quote/market/info/MarketTradeStat;", "setPieData", "onTypeChange", "getTimeParam", "getFormatPercent", "Lcom/kubi/utils/StyledText;", "Companion", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nMarketAnalysisFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarketAnalysisFragment.kt\ncom/kubi/spot/quote/market/trade/MarketAnalysisFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,255:1\n147#2,16:256\n11318#3:272\n11429#3,4:273\n*S KotlinDebug\n*F\n+ 1 MarketAnalysisFragment.kt\ncom/kubi/spot/quote/market/trade/MarketAnalysisFragment\n*L\n49#1:256,16\n94#1:272\n94#1:273,4\n*E\n"})
public final class MarketAnalysisFragment extends BaseFragment {

    /* JADX INFO: renamed from: U */
    @NotNull
    public final InterfaceC24293a f51079U = C45681e.m100799e(this, new Function1<MarketAnalysisFragment, C44654n>() { // from class: com.kubi.spot.quote.market.trade.MarketAnalysisFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C44654n invoke(@NotNull MarketAnalysisFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C44654n.m98784a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C44654n, Unit>() { // from class: com.kubi.spot.quote.market.trade.MarketAnalysisFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C44654n it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C44654n c44654n) {
            invoke(c44654n);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: V */
    @NotNull
    public final Lazy f51080V = LazyKt.lazy(new Function0() { // from class: com.kubi.spot.quote.market.trade.a
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MarketAnalysisFragment.m62760u3();
        }
    });

    /* JADX INFO: renamed from: W */
    @NotNull
    public final Lazy f51081W = LazyKt.lazy(new Function0() { // from class: com.kubi.spot.quote.market.trade.b
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MarketAnalysisFragment.m62748J3(this.f51132b);
        }
    });

    /* JADX INFO: renamed from: X */
    @NotNull
    public final Lazy f51082X = LazyKt.lazy(new Function0() { // from class: com.kubi.spot.quote.market.trade.c
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MarketAnalysisFragment.m62747I3(this.f51137b);
        }
    });

    /* JADX INFO: renamed from: Y */
    public int f51083Y;

    /* JADX INFO: renamed from: a0 */
    public static final /* synthetic */ KProperty<Object>[] f51078a0 = {Reflection.property1(new PropertyReference1Impl(MarketAnalysisFragment.class, "binding", "getBinding()Lcom/kubi/spot/databinding/BkucoinFragmentMarketTradeGuideBinding;", 0))};

    /* JADX INFO: renamed from: Z */
    @NotNull
    public static final Companion f51077Z = new Companion(null);

    /* JADX INFO: compiled from: MarketAnalysisFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, m90084d2 = {"Lcom/kubi/spot/quote/market/trade/MarketAnalysisFragment$Companion;", "", "<init>", "()V", "KEY_GUIDE_TIME_TYPE", "", "newInstance", "Lcom/kubi/spot/quote/market/trade/MarketAnalysisFragment;", "tradeItemBean", "Lcom/kubi/data/entity/TradeItemBean;", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final MarketAnalysisFragment newInstance(@NotNull TradeItemBean tradeItemBean) {
            Intrinsics.checkNotNullParameter(tradeItemBean, "tradeItemBean");
            MarketAnalysisFragment marketAnalysisFragment = new MarketAnalysisFragment();
            marketAnalysisFragment.setArguments(new C27051h().m66721e("data", tradeItemBean).m66717a());
            return marketAnalysisFragment;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A3 */
    public final String m62741A3(int i11) {
        if (i11 != 0) {
            return i11 != 1 ? "24h" : "12h";
        }
        return "1h";
    }

    /* JADX INFO: renamed from: B3 */
    private final void m62742B3(int i11) {
        String string;
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        BaseTextView baseTextView3;
        BaseTextView baseTextView4;
        BaseTextView baseTextView5;
        BaseTextView baseTextView6;
        DashTextView dashTextView;
        BaseTextView baseTextView7;
        if (i11 != 0) {
            string = i11 != 1 ? getString(R$string.market_24h) : getString(R$string.market_12h);
        } else {
            string = getString(R$string.market_1h);
        }
        Intrinsics.checkNotNull(string);
        C44654n c44654nM62766x3 = m62766x3();
        if (c44654nM62766x3 != null && (baseTextView7 = c44654nM62766x3.f99247q) != null) {
            baseTextView7.setText(string);
        }
        C44654n c44654nM62766x4 = m62766x3();
        if (c44654nM62766x4 != null && (dashTextView = c44654nM62766x4.f99246p) != null) {
            dashTextView.setText(getString(R$string.price_section, string));
        }
        C44654n c44654nM62766x5 = m62766x3();
        if (c44654nM62766x5 != null && (baseTextView6 = c44654nM62766x5.f99245o) != null) {
            baseTextView6.setText(getString(R$string.price_section_low, string));
        }
        C44654n c44654nM62766x6 = m62766x3();
        if (c44654nM62766x6 != null && (baseTextView5 = c44654nM62766x6.f99243m) != null) {
            baseTextView5.setText(getString(R$string.price_section_high, string));
        }
        C44654n c44654nM62766x7 = m62766x3();
        if (c44654nM62766x7 != null && (baseTextView4 = c44654nM62766x7.f99251u) != null) {
            baseTextView4.setText(getString(R$string.trading_user_ratio, string));
        }
        C44654n c44654nM62766x8 = m62766x3();
        if (c44654nM62766x8 != null && (baseTextView3 = c44654nM62766x8.f99249s) != null) {
            baseTextView3.setText(getString(R$string.trading_choice_ratio, string));
        }
        C44654n c44654nM62766x9 = m62766x3();
        if (c44654nM62766x9 != null && (baseTextView2 = c44654nM62766x9.f99253w) != null) {
            baseTextView2.setText(getString(R$string.buy_sell_user_ratio, string));
        }
        C44654n c44654nM62766x10 = m62766x3();
        if (c44654nM62766x10 == null || (baseTextView = c44654nM62766x10.f99240j) == null) {
            return;
        }
        baseTextView.setText(getString(R$string.buy_sell_amount_ratio, string));
    }

    /* JADX INFO: renamed from: C3 */
    public static final Unit m62743C3(MarketAnalysisFragment marketAnalysisFragment) {
        AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54156M4(marketAnalysisFragment.getString(R$string.price_section_tips, marketAnalysisFragment.m62763z3()[marketAnalysisFragment.f51083Y])).m54162S4(R$string.already_know, null).m54172c5(marketAnalysisFragment.getChildFragmentManager());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: D3 */
    public static final Unit m62744D3(final MarketAnalysisFragment marketAnalysisFragment) {
        BottomSheetDialogHelper bottomSheetDialogHelper = BottomSheetDialogHelper.f48599a;
        String[] strArrM62763z3 = marketAnalysisFragment.m62763z3();
        ArrayList arrayList = new ArrayList(strArrM62763z3.length);
        int length = strArrM62763z3.length;
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            String str = strArrM62763z3[i11];
            int i13 = i12 + 1;
            Intrinsics.checkNotNull(str);
            arrayList.add(new SelectEntity(null, str, String.valueOf(i12), null, null, null, null, null, null, false, marketAnalysisFragment.f51083Y == i12, null, 3065, null));
            i11++;
            i12 = i13;
        }
        DialogFragmentHelper dialogFragmentHelperM58944B = BottomSheetDialogHelper.m58944B(bottomSheetDialogHelper, arrayList, new BiConsumer() { // from class: com.kubi.spot.quote.market.trade.g
            @Override // io.reactivex.functions.BiConsumer
            public final void accept(Object obj, Object obj2) {
                MarketAnalysisFragment.m62745E3(this.f51152b, (BaseViewHolder) obj, (BottomSheetDialogHelper.InterfaceC24339a) obj2);
            }
        }, false, null, null, false, 60, null);
        FragmentManager childFragmentManager = marketAnalysisFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        dialogFragmentHelperM58944B.show(childFragmentManager, "dialog_lever_borrow_coin");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TradeItemBean getTradeItemBean() {
        return (TradeItemBean) this.f51081W.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u3 */
    public static final InterfaceC37053d m62760u3() {
        return (InterfaceC37053d) new Retrofit.Builder().baseUrl("https://appapi-v2.xcoinsystem.com/app/").client(C42597a.m93389e()).addConverterFactory(GsonConverterFactory.create(new Gson())).addCallAdapterFactory(RxJava2CallAdapterFactory.create()).build().create(InterfaceC37053d.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w3 */
    public final InterfaceC37053d m62762w3() {
        return (InterfaceC37053d) this.f51080V.getValue();
    }

    /* JADX INFO: renamed from: z3 */
    private final String[] m62763z3() {
        return (String[]) this.f51082X.getValue();
    }

    /* JADX INFO: renamed from: F3 */
    public final void m62764F3(int i11, final MarketTradeStat marketTradeStat) {
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        int iM66512a;
        BaseTextView baseTextView3;
        BaseTextView baseTextView4;
        BaseTextView baseTextView5;
        BaseTextView baseTextView6;
        BaseTextView baseTextView7;
        String strM85579c;
        BaseTextView baseTextView8;
        String strM85579c2;
        C27063n.m66770h(i11, "key_guide_time_type");
        this.f51083Y = i11;
        m62742B3(i11);
        C44654n c44654nM62766x3 = m62766x3();
        if (c44654nM62766x3 != null && (baseTextView8 = c44654nM62766x3.f99244n) != null) {
            BigDecimal bigDecimalM66536f = DowngradeExKt.m66536f(marketTradeStat != null ? marketTradeStat.getLowPrice() : null);
            if (bigDecimalM66536f != null) {
                TradeItemBean tradeItemBean = getTradeItemBean();
                strM85579c2 = C37886j.m85579c(bigDecimalM66536f, tradeItemBean != null ? tradeItemBean.getSymbol() : null, (124 & 2) != 0 ? RoundingMode.DOWN : null, (124 & 4) != 0 ? false : false, (124 & 8) != 0 ? false : false, (124 & 16) != 0 ? true : true, (124 & 32) == 0 ? 0 : 0, (124 & 64) != 0 ? MultiLanguageManager.f46811g.getLocale() : null);
            } else {
                strM85579c2 = null;
            }
            baseTextView8.setText(C27041f.m66669i(strM85579c2, "--"));
        }
        C44654n c44654nM62766x4 = m62766x3();
        if (c44654nM62766x4 != null && (baseTextView7 = c44654nM62766x4.f99242l) != null) {
            BigDecimal bigDecimalM66536f2 = DowngradeExKt.m66536f(marketTradeStat != null ? marketTradeStat.getHighPrice() : null);
            if (bigDecimalM66536f2 != null) {
                TradeItemBean tradeItemBean2 = getTradeItemBean();
                strM85579c = C37886j.m85579c(bigDecimalM66536f2, tradeItemBean2 != null ? tradeItemBean2.getSymbol() : null, (124 & 2) != 0 ? RoundingMode.DOWN : null, (124 & 4) != 0 ? false : false, (124 & 8) != 0 ? false : false, (124 & 16) != 0 ? true : true, (124 & 32) == 0 ? 0 : 0, (124 & 64) != 0 ? MultiLanguageManager.f46811g.getLocale() : null);
            } else {
                strM85579c = null;
            }
            baseTextView7.setText(C27041f.m66669i(strM85579c, "--"));
        }
        C44654n c44654nM62766x5 = m62766x3();
        if (c44654nM62766x5 != null && (baseTextView6 = c44654nM62766x5.f99250t) != null) {
            baseTextView6.setText(m62767y3(marketTradeStat, 0));
        }
        C44654n c44654nM62766x6 = m62766x3();
        if (c44654nM62766x6 != null && (baseTextView5 = c44654nM62766x6.f99252v) != null) {
            baseTextView5.setText(m62767y3(marketTradeStat, 1));
        }
        C44654n c44654nM62766x7 = m62766x3();
        if (c44654nM62766x7 != null && (baseTextView4 = c44654nM62766x7.f99239i) != null) {
            baseTextView4.setText(m62767y3(marketTradeStat, 2));
        }
        C44654n c44654nM62766x8 = m62766x3();
        if (c44654nM62766x8 != null && (baseTextView3 = c44654nM62766x8.f99248r) != null) {
            baseTextView3.setText(C27041f.m66669i(marketTradeStat != null ? marketTradeStat.sellOrBuy() : null, "--"));
        }
        C44654n c44654nM62766x9 = m62766x3();
        if (c44654nM62766x9 != null && (baseTextView2 = c44654nM62766x9.f99248r) != null) {
            if (marketTradeStat != null) {
                Context contextRequireContext = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                iM66512a = marketTradeStat.sellOrBuyColor(contextRequireContext);
            } else {
                iM66512a = C27017c.f54310a.m66512a(R$color.c_text);
            }
            baseTextView2.setTextColor(iM66512a);
        }
        C44654n c44654nM62766x10 = m62766x3();
        if (c44654nM62766x10 != null && (baseTextView = c44654nM62766x10.f99242l) != null) {
            baseTextView.post(new Runnable() { // from class: com.kubi.spot.quote.market.trade.d
                @Override // java.lang.Runnable
                public final void run() {
                    MarketAnalysisFragment.m62746G3(this.f51141b, marketTradeStat);
                }
            });
        }
        m62765H3(0, marketTradeStat);
        m62765H3(1, marketTradeStat);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001d  */
    /* JADX WARN: Code duplicated, block: B:19:0x0032  */
    /* JADX WARN: Code duplicated, block: B:6:0x000e  */
    /* JADX INFO: renamed from: H3 */
    public final void m62765H3(int i11, MarketTradeStat marketTradeStat) {
        KuCoinPieChartView kuCoinPieChartView;
        String buyVolPer;
        BigDecimal bigDecimalSellVolPer;
        C44654n c44654nM62766x3 = m62766x3();
        if (i11 == 0) {
            if (c44654nM62766x3 != null) {
                kuCoinPieChartView = c44654nM62766x3.f99237g;
            } else {
                kuCoinPieChartView = null;
            }
        } else if (c44654nM62766x3 != null) {
            kuCoinPieChartView = c44654nM62766x3.f99236f;
        } else {
            kuCoinPieChartView = null;
        }
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
        BigDecimal bigDecimalM66536f = DowngradeExKt.m66536f(buyVolPer);
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
        if (bigDecimalM66536f == null) {
            if (kuCoinPieChartView != null) {
                kuCoinPieChartView.setPieData(CollectionsKt.arrayListOf(new Pair(Integer.valueOf(colorRes2), Double.valueOf(1.0d))));
                return;
            }
            return;
        }
        BigDecimal bigDecimal = BigDecimal.ONE;
        if (bigDecimalM66536f.compareTo(bigDecimal) >= 0) {
            if (kuCoinPieChartView != null) {
                kuCoinPieChartView.setPieData(CollectionsKt.arrayListOf(new Pair(Integer.valueOf(iM54291p), Double.valueOf(1.0d))));
                return;
            }
            return;
        }
        if (C41014a.m89922G(bigDecimalSellVolPer, null, 1, null).compareTo(bigDecimal) >= 0) {
            if (kuCoinPieChartView != null) {
                kuCoinPieChartView.setPieData(CollectionsKt.arrayListOf(new Pair(Integer.valueOf(iM54289n), Double.valueOf(1.0d))));
                return;
            }
            return;
        }
        double dM66647g = C27039d.m66647g(bigDecimalM66536f.subtract(new BigDecimal("0.01")));
        double dM66647g2 = C27039d.m66647g(bigDecimalSellVolPer != null ? bigDecimalSellVolPer.subtract(new BigDecimal("0.01")) : null);
        if (dM66647g < 0.01d) {
            dM66647g = 0.01d;
            dM66647g2 = 0.97d;
        } else if (dM66647g2 < 0.01d && bigDecimalM66536f.compareTo(bigDecimal) != 0) {
            dM66647g2 = 0.01d;
            dM66647g = 0.97d;
        }
        if (kuCoinPieChartView != null) {
            kuCoinPieChartView.setPieData(CollectionsKt.arrayListOf(new Pair(Integer.valueOf(colorRes), Double.valueOf(0.005d)), new Pair(Integer.valueOf(iM54289n), Double.valueOf(dM66647g2)), new Pair(Integer.valueOf(colorRes), Double.valueOf(0.005d)), new Pair(Integer.valueOf(colorRes), Double.valueOf(0.005d)), new Pair(Integer.valueOf(iM54291p), Double.valueOf(dM66647g)), new Pair(Integer.valueOf(colorRes), Double.valueOf(0.005d))));
        }
    }

    @Override // com.kubi.sdk.BaseFragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable Bundle savedInstanceState, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(R$layout.bkucoin_fragment_market_trade_guide, (ViewGroup) null);
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
        this.f51083Y = C27063n.m66764b("key_guide_time_type", 0);
        C44654n c44654nM62766x3 = m62766x3();
        if (c44654nM62766x3 != null && (dashTextView2 = c44654nM62766x3.f99246p) != null) {
            dashTextView2.setNeedDash(true);
        }
        C44654n c44654nM62766x4 = m62766x3();
        if (c44654nM62766x4 != null && (dashTextView = c44654nM62766x4.f99246p) != null) {
            C27046k.m66711z(dashTextView, 0L, new Function0() { // from class: com.kubi.spot.quote.market.trade.e
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MarketAnalysisFragment.m62743C3(this.f51146b);
                }
            }, 1, null);
        }
        C44654n c44654nM62766x5 = m62766x3();
        if (c44654nM62766x5 != null && (baseTextView = c44654nM62766x5.f99247q) != null) {
            C27046k.m66711z(baseTextView, 0L, new Function0() { // from class: com.kubi.spot.quote.market.trade.f
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MarketAnalysisFragment.m62744D3(this.f51148b);
                }
            }, 1, null);
        }
        m62742B3(this.f51083Y);
    }

    /* JADX INFO: renamed from: x3 */
    public final C44654n m62766x3() {
        return (C44654n) this.f51079U.getValue(this, f51078a0[0]);
    }

    /* JADX INFO: renamed from: y3 */
    public final C27096v0 m62767y3(MarketTradeStat marketTradeStat, int i11) {
        String tradeUserPer;
        String strM92642g;
        C27096v0 c27096v0 = new C27096v0();
        if (C5303w0.m6511a()) {
            ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(getColorRes(R$color.emphasis60));
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            c27096v0.m66903c("%", foregroundColorSpan, new AbsoluteSizeSpan((int) C27025c.m66568f(contextRequireContext, 12)));
        }
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
                BigDecimal bigDecimalM66536f = DowngradeExKt.m66536f(tradeUserPer);
                c27096v0.append((bigDecimalM66536f == null || (strM92642g = C42180b.m92642g(bigDecimalM66536f, null, null, 0, false, true, false, 47, null)) == null) ? null : StringsKt.replace$default(strM92642g, "%", "", false, 4, (Object) null));
            }
        }
        if (!C5303w0.m6511a()) {
            ForegroundColorSpan foregroundColorSpan2 = new ForegroundColorSpan(getColorRes(R$color.emphasis60));
            Context contextRequireContext2 = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
            c27096v0.m66903c("%", foregroundColorSpan2, new AbsoluteSizeSpan((int) C27025c.m66568f(contextRequireContext2, 12)));
        }
        return c27096v0;
    }

    /* JADX INFO: renamed from: E3 */
    public static final void m62745E3(MarketAnalysisFragment marketAnalysisFragment, BaseViewHolder baseViewHolder, BottomSheetDialogHelper.InterfaceC24339a interfaceC24339a) {
        marketAnalysisFragment.m62761v3(DowngradeExKt.m66543m(interfaceC24339a.getValue(), 0, 1, null));
    }

    /* JADX INFO: renamed from: G3 */
    public static final void m62746G3(MarketAnalysisFragment marketAnalysisFragment, MarketTradeStat marketTradeStat) {
        Integer numValueOf;
        Integer numValueOf2;
        int i11;
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        Integer numValueOf3;
        Integer numValueOf4;
        int i12;
        ConstraintLayout constraintLayout;
        ConstraintLayout constraintLayout2;
        float currentBias;
        BaseTextView baseTextView3;
        BaseTextView baseTextView4;
        BaseTextView baseTextView5;
        BaseTextView baseTextView6;
        if (marketAnalysisFragment.getView() != null) {
            C44654n c44654nM62766x3 = marketAnalysisFragment.m62766x3();
            ConstraintLayout constraintLayout3 = null;
            if (c44654nM62766x3 != null && (baseTextView6 = c44654nM62766x3.f99244n) != null) {
                numValueOf = Integer.valueOf(baseTextView6.getMeasuredWidth());
            } else {
                numValueOf = null;
            }
            int iM66650j = C27039d.m66650j(numValueOf);
            C44654n c44654nM62766x4 = marketAnalysisFragment.m62766x3();
            if (c44654nM62766x4 != null && (baseTextView5 = c44654nM62766x4.f99245o) != null) {
                numValueOf2 = Integer.valueOf(baseTextView5.getMeasuredWidth());
            } else {
                numValueOf2 = null;
            }
            if (iM66650j > C27039d.m66650j(numValueOf2)) {
                i11 = R$id.tv_low;
            } else {
                i11 = R$id.tv_low_label;
            }
            C44654n c44654nM62766x5 = marketAnalysisFragment.m62766x3();
            if (c44654nM62766x5 != null) {
                baseTextView = c44654nM62766x5.f99242l;
            } else {
                baseTextView = null;
            }
            if (baseTextView != null) {
                C44654n c44654nM62766x6 = marketAnalysisFragment.m62766x3();
                if (c44654nM62766x6 != null) {
                    baseTextView2 = c44654nM62766x6.f99243m;
                } else {
                    baseTextView2 = null;
                }
                if (baseTextView2 != null) {
                    C44654n c44654nM62766x7 = marketAnalysisFragment.m62766x3();
                    if (c44654nM62766x7 != null && (baseTextView4 = c44654nM62766x7.f99242l) != null) {
                        numValueOf3 = Integer.valueOf(baseTextView4.getMeasuredWidth());
                    } else {
                        numValueOf3 = null;
                    }
                    int iM66650j2 = C27039d.m66650j(numValueOf3);
                    C44654n c44654nM62766x8 = marketAnalysisFragment.m62766x3();
                    if (c44654nM62766x8 != null && (baseTextView3 = c44654nM62766x8.f99243m) != null) {
                        numValueOf4 = Integer.valueOf(baseTextView3.getMeasuredWidth());
                    } else {
                        numValueOf4 = null;
                    }
                    if (iM66650j2 > C27039d.m66650j(numValueOf4)) {
                        i12 = R$id.tv_high;
                    } else {
                        i12 = R$id.tv_high_label;
                    }
                    C44654n c44654nM62766x9 = marketAnalysisFragment.m62766x3();
                    if (c44654nM62766x9 != null) {
                        constraintLayout = c44654nM62766x9.f99233c;
                    } else {
                        constraintLayout = null;
                    }
                    if (constraintLayout != null) {
                        ConstraintSet constraintSet = new ConstraintSet();
                        C44654n c44654nM62766x10 = marketAnalysisFragment.m62766x3();
                        if (c44654nM62766x10 != null) {
                            constraintLayout2 = c44654nM62766x10.f99233c;
                        } else {
                            constraintLayout2 = null;
                        }
                        constraintSet.clone(constraintLayout2);
                        int i13 = R$id.thumb;
                        if (marketTradeStat != null) {
                            currentBias = marketTradeStat.getCurrentBias();
                        } else {
                            currentBias = 0.5f;
                        }
                        constraintSet.setHorizontalBias(i13, currentBias);
                        int i14 = R$id.background;
                        constraintSet.connect(i14, 6, i11, 7);
                        constraintSet.connect(i14, 7, i12, 6);
                        C44654n c44654nM62766x11 = marketAnalysisFragment.m62766x3();
                        if (c44654nM62766x11 != null) {
                            constraintLayout3 = c44654nM62766x11.f99233c;
                        }
                        constraintSet.applyTo(constraintLayout3);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: I3 */
    public static final String[] m62747I3(MarketAnalysisFragment marketAnalysisFragment) {
        return marketAnalysisFragment.getResources().getStringArray(R$array.kucoin_market_guide_time);
    }

    /* JADX INFO: renamed from: J3 */
    public static final TradeItemBean m62748J3(MarketAnalysisFragment marketAnalysisFragment) {
        Bundle arguments = marketAnalysisFragment.getArguments();
        if (arguments != null) {
            return (TradeItemBean) arguments.getParcelable("data");
        }
        return null;
    }

    /* JADX INFO: renamed from: v3 */
    private final void m62761v3(int i11) {
        C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new MarketAnalysisFragment$fetchStat$1(this, i11, null), 3, null);
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onShow() {
        super.onShow();
        m62761v3(this.f51083Y);
    }
}
