package com.kubi.spot.quote.market.trade;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.blankj.utilcode.util.C5275i0;
import com.kubi.core.biz.callauction.CallAuctionSwitch;
import com.kubi.data.entity.OrderBookEntity;
import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.data.entity.TradeItemBean;
import com.kubi.event.api.C12572a;
import com.kubi.event.api.C12573b;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.chart.depth.KuCoinDepthView;
import com.kubi.sdk.BaseApplication;
import com.kubi.sdk.base.p113ui.OldBaseFragment;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.widget.dialog.BottomSheetDialogHelper;
import com.kubi.sdk.widget.dialog.SelectEntity;
import com.kubi.spot.R$array;
import com.kubi.spot.R$layout;
import com.kubi.spot.R$string;
import com.kubi.spot.helper.NewOrderBookHelper;
import com.kubi.spot.quote.orderBook.OrderBookAdapter;
import com.kubi.utils.C27051h;
import com.kubi.utils.extensions.C27024b;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import g10.C37787r;
import gf.C37878b0;
import io.chad.library.adapter.base.BaseViewHolder;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.BiConsumer;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.DisposableKt;
import io.reactivex.subjects.PublishSubject;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p429lf.C42180b;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
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
import t20.C44653m0;
import w00.C45681e;
import w20.C45700a;

/* JADX INFO: compiled from: MarketOrderBookFragment.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 52\u00020\u0001:\u00015B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\"\u001a\u00020\u0019H\u0014J\u001a\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010(H\u0016J!\u0010)\u001a\u00020$2\u0012\u0010*\u001a\n\u0012\u0006\b\u0001\u0012\u00020,0+\"\u00020,H\u0002¢\u0006\u0002\u0010-J\b\u0010.\u001a\u00020$H\u0016J\b\u0010/\u001a\u00020$H\u0016J\u0010\u00100\u001a\u00020$2\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0010\u00101\u001a\u00020$2\u0006\u00102\u001a\u000203H\u0002J\b\u00104\u001a\u00020$H\u0002R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0010\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0011\u0010\rR\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u000f\u001a\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u001d\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u000f\u001a\u0004\b\u001f\u0010 ¨\u00066"}, m90084d2 = {"Lcom/kubi/spot/quote/market/trade/MarketOrderBookFragment;", "Lcom/kubi/sdk/base/ui/OldBaseFragment;", "<init>", "()V", "binding", "Lcom/kubi/spot/databinding/KucoinFragmentMarketOrderbookBinding;", "getBinding", "()Lcom/kubi/spot/databinding/KucoinFragmentMarketOrderbookBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "mBuyAdapter", "Lcom/kubi/spot/quote/orderBook/OrderBookAdapter;", "getMBuyAdapter", "()Lcom/kubi/spot/quote/orderBook/OrderBookAdapter;", "mBuyAdapter$delegate", "Lkotlin/Lazy;", "mSellAdapter", "getMSellAdapter", "mSellAdapter$delegate", "tradeItem", "Lcom/kubi/data/entity/TradeItemBean;", "getTradeItem", "()Lcom/kubi/data/entity/TradeItemBean;", "tradeItem$delegate", "precision", "", "precisionIndex", "wsDataHelper", "Lcom/kubi/sdk/websocket/WsDataHelper;", "mOrderBookHelper", "Lcom/kubi/spot/helper/NewOrderBookHelper;", "getMOrderBookHelper", "()Lcom/kubi/spot/helper/NewOrderBookHelper;", "mOrderBookHelper$delegate", "getLayout", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "initRecyclerView", "recyclerViews", "", "Landroidx/recyclerview/widget/RecyclerView;", "([Landroidx/recyclerview/widget/RecyclerView;)V", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, RNH5InterActionHelperKt.EVENT_NAME_ON_HIDE, "onPrecisionChanged", "onOrderBookDataReceived", "srcOrderEntity", "Lcom/kubi/data/entity/OrderBookEntity;", "showOrderBookAmountDialog", "Companion", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nMarketOrderBookFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarketOrderBookFragment.kt\ncom/kubi/spot/quote/market/trade/MarketOrderBookFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt\n+ 5 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 6 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 7 SpotIssue.kt\ncom/kubi/spot/exeption/SpotIssueKt\n*L\n1#1,263:1\n147#2,16:264\n1#3:280\n81#4,2:281\n13537#5,3:283\n1573#6:286\n1604#6,4:287\n43#7,7:291\n*S KotlinDebug\n*F\n+ 1 MarketOrderBookFragment.kt\ncom/kubi/spot/quote/market/trade/MarketOrderBookFragment\n*L\n44#1:264,16\n138#1:281,2\n205#1:283,3\n99#1:286\n99#1:287,4\n154#1:291,7\n*E\n"})
public final class MarketOrderBookFragment extends OldBaseFragment {

    /* JADX INFO: renamed from: Z */
    public int f51091Z;

    /* JADX INFO: renamed from: d0 */
    public static final /* synthetic */ KProperty<Object>[] f51085d0 = {Reflection.property1(new PropertyReference1Impl(MarketOrderBookFragment.class, "binding", "getBinding()Lcom/kubi/spot/databinding/KucoinFragmentMarketOrderbookBinding;", 0))};

    /* JADX INFO: renamed from: c0 */
    @NotNull
    public static final Companion f51084c0 = new Companion(null);

    /* JADX INFO: renamed from: U */
    @NotNull
    public final InterfaceC24293a f51086U = C45681e.m100799e(this, new Function1<MarketOrderBookFragment, C44653m0>() { // from class: com.kubi.spot.quote.market.trade.MarketOrderBookFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C44653m0 invoke(@NotNull MarketOrderBookFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C44653m0.m98782a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C44653m0, Unit>() { // from class: com.kubi.spot.quote.market.trade.MarketOrderBookFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C44653m0 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C44653m0 c44653m0) {
            invoke(c44653m0);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: V */
    @NotNull
    public final Lazy f51087V = LazyKt.lazy(new Function0() { // from class: com.kubi.spot.quote.market.trade.h
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MarketOrderBookFragment.m62770E3();
        }
    });

    /* JADX INFO: renamed from: W */
    @NotNull
    public final Lazy f51088W = LazyKt.lazy(new Function0() { // from class: com.kubi.spot.quote.market.trade.l
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MarketOrderBookFragment.m62773H3();
        }
    });

    /* JADX INFO: renamed from: X */
    @NotNull
    public final Lazy f51089X = LazyKt.lazy(new Function0() { // from class: com.kubi.spot.quote.market.trade.m
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MarketOrderBookFragment.m62783S3(this.f51172b);
        }
    });

    /* JADX INFO: renamed from: Y */
    public int f51090Y = 8;

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public final C37787r f51092a0 = new C37787r(this);

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public final Lazy f51093b0 = LazyKt.lazy(new Function0() { // from class: com.kubi.spot.quote.market.trade.n
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MarketOrderBookFragment.m62771F3(this.f51174b);
        }
    });

    /* JADX INFO: compiled from: MarketOrderBookFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/spot/quote/market/trade/MarketOrderBookFragment$Companion;", "", "<init>", "()V", "newInstance", "Lcom/kubi/spot/quote/market/trade/MarketOrderBookFragment;", "tradeItemBean", "Lcom/kubi/data/entity/TradeItemBean;", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final MarketOrderBookFragment newInstance(@NotNull TradeItemBean tradeItemBean) {
            Intrinsics.checkNotNullParameter(tradeItemBean, "tradeItemBean");
            MarketOrderBookFragment marketOrderBookFragment = new MarketOrderBookFragment();
            marketOrderBookFragment.setArguments(new C27051h().m66721e("data", tradeItemBean).m66717a());
            return marketOrderBookFragment;
        }
    }

    /* JADX INFO: renamed from: D3 */
    private final void m62769D3(RecyclerView... recyclerViewArr) {
        for (RecyclerView recyclerView : recyclerViewArr) {
            recyclerView.setHasFixedSize(true);
            recyclerView.setLayoutManager(new LinearLayoutManager(this.mContext));
        }
    }

    /* JADX INFO: renamed from: C3 */
    private final TradeItemBean m62768C3() {
        return (TradeItemBean) this.f51089X.getValue();
    }

    /* JADX INFO: renamed from: E3 */
    public static final OrderBookAdapter m62770E3() {
        return new OrderBookAdapter(1, 1, null, 4, null);
    }

    /* JADX INFO: renamed from: F3 */
    public static final NewOrderBookHelper m62771F3(final MarketOrderBookFragment marketOrderBookFragment) {
        C37787r c37787r = marketOrderBookFragment.f51092a0;
        String symbol = marketOrderBookFragment.m62768C3().getSymbol();
        Intrinsics.checkNotNullExpressionValue(symbol, "getSymbol(...)");
        SymbolInfoEntity symbolInfoEntity = marketOrderBookFragment.m62768C3().getSymbolInfoEntity();
        return new NewOrderBookHelper(c37787r, marketOrderBookFragment, symbol, C27039d.m66651k(symbolInfoEntity != null ? Integer.valueOf(symbolInfoEntity.getPriceIncrementPrecision()) : null, 8), new Consumer() { // from class: com.kubi.spot.quote.market.trade.i
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                MarketOrderBookFragment.m62772G3(this.f51162b, (OrderBookEntity) obj);
            }
        });
    }

    /* JADX INFO: renamed from: H3 */
    public static final OrderBookAdapter m62773H3() {
        return new OrderBookAdapter(0, 1, null, 4, null);
    }

    /* JADX INFO: renamed from: P3 */
    public static final Unit m62780P3(final MarketOrderBookFragment marketOrderBookFragment) {
        BottomSheetDialogHelper bottomSheetDialogHelper = BottomSheetDialogHelper.f48599a;
        ArrayList<String> arrayListM63003a = C25799u.m63003a(marketOrderBookFragment.f51090Y);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayListM63003a, 10));
        int i11 = 0;
        for (Object obj : arrayListM63003a) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            arrayList.add(new SelectEntity(null, (String) obj, null, null, null, null, null, null, null, false, i11 == marketOrderBookFragment.f51091Z, null, 3069, null));
            i11 = i12;
        }
        DialogFragmentHelper dialogFragmentHelperM58944B = BottomSheetDialogHelper.m58944B(bottomSheetDialogHelper, arrayList, new BiConsumer() { // from class: com.kubi.spot.quote.market.trade.k
            @Override // io.reactivex.functions.BiConsumer
            public final void accept(Object obj2, Object obj3) {
                MarketOrderBookFragment.m62781Q3(this.f51167b, (BaseViewHolder) obj2, (BottomSheetDialogHelper.InterfaceC24339a) obj3);
            }
        }, false, null, null, false, 60, null);
        FragmentManager childFragmentManager = marketOrderBookFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        dialogFragmentHelperM58944B.show(childFragmentManager, "showPrecisionDialog");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: R3 */
    public static final void m62782R3(MarketOrderBookFragment marketOrderBookFragment, BaseViewHolder baseViewHolder, BottomSheetDialogHelper.InterfaceC24339a interfaceC24339a) {
        BaseTextView baseTextView;
        SymbolInfoEntity symbolInfoEntity;
        BaseTextView baseTextView2;
        SymbolInfoEntity symbolInfoEntity2;
        C37878b0.f85252a.m85544y(baseViewHolder.getAdapterPosition());
        marketOrderBookFragment.m62803z3().m63018u(baseViewHolder.getAdapterPosition());
        marketOrderBookFragment.m62800B3().m63018u(baseViewHolder.getAdapterPosition());
        marketOrderBookFragment.m62803z3().notifyDataSetChanged();
        marketOrderBookFragment.m62800B3().notifyDataSetChanged();
        C44653m0 c44653m0M62802y3 = marketOrderBookFragment.m62802y3();
        String baseCurrencyName = null;
        if (c44653m0M62802y3 != null && (baseTextView2 = c44653m0M62802y3.f99227l) != null) {
            int i11 = marketOrderBookFragment.m62803z3().getF51231m() == 0 ? R$string.total_stub : R$string.amount_stub;
            TradeItemBean tradeItemBeanM62768C3 = marketOrderBookFragment.m62768C3();
            baseTextView2.setText(marketOrderBookFragment.getString(i11, C27041f.m66668h((tradeItemBeanM62768C3 == null || (symbolInfoEntity2 = tradeItemBeanM62768C3.getSymbolInfoEntity()) == null) ? null : symbolInfoEntity2.getBaseCurrencyName())));
        }
        C44653m0 c44653m0M62802y4 = marketOrderBookFragment.m62802y3();
        if (c44653m0M62802y4 == null || (baseTextView = c44653m0M62802y4.f99228m) == null) {
            return;
        }
        int i12 = marketOrderBookFragment.m62803z3().getF51231m() == 0 ? R$string.total_stub : R$string.amount_stub;
        TradeItemBean tradeItemBeanM62768C4 = marketOrderBookFragment.m62768C3();
        if (tradeItemBeanM62768C4 != null && (symbolInfoEntity = tradeItemBeanM62768C4.getSymbolInfoEntity()) != null) {
            baseCurrencyName = symbolInfoEntity.getBaseCurrencyName();
        }
        baseTextView.setText(marketOrderBookFragment.getString(i12, C27041f.m66668h(baseCurrencyName)));
    }

    /* JADX INFO: renamed from: l0 */
    private final void m62785l0() {
        ArrayList arrayList = new ArrayList();
        String[] stringArray = BaseApplication.INSTANCE.get().getResources().getStringArray(R$array.kucoin_all_or_single);
        Intrinsics.checkNotNullExpressionValue(stringArray, "getStringArray(...)");
        int length = stringArray.length;
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            String str = stringArray[i11];
            int i13 = i12 + 1;
            Intrinsics.checkNotNull(str);
            arrayList.add(new SelectEntity(null, str, null, null, null, null, null, null, null, false, i12 == m62803z3().getF51231m(), null, 3069, null));
            i11++;
            i12 = i13;
        }
        DialogFragmentHelper dialogFragmentHelperM58944B = BottomSheetDialogHelper.m58944B(BottomSheetDialogHelper.f48599a, arrayList, new BiConsumer() { // from class: com.kubi.spot.quote.market.trade.j
            @Override // io.reactivex.functions.BiConsumer
            public final void accept(Object obj, Object obj2) {
                MarketOrderBookFragment.m62782R3(this.f51165b, (BaseViewHolder) obj, (BottomSheetDialogHelper.InterfaceC24339a) obj2);
            }
        }, false, null, null, false, 60, null);
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        dialogFragmentHelperM58944B.show(childFragmentManager, "showOrderBookAmountDialog");
    }

    /* JADX INFO: renamed from: A3 */
    public final NewOrderBookHelper m62799A3() {
        return (NewOrderBookHelper) this.f51093b0.getValue();
    }

    /* JADX INFO: renamed from: B3 */
    public final OrderBookAdapter m62800B3() {
        return (OrderBookAdapter) this.f51088W.getValue();
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public int getLayout() {
        return R$layout.kucoin_fragment_market_orderbook;
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        KuCoinDepthView kuCoinDepthView;
        KuCoinDepthView kuCoinDepthView2;
        BaseTextView baseTextView;
        SymbolInfoEntity symbolInfoEntity;
        BaseTextView baseTextView2;
        SymbolInfoEntity symbolInfoEntity2;
        BaseTextView baseTextView3;
        SymbolInfoEntity symbolInfoEntity3;
        BaseTextView baseTextView4;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        BaseTextView baseTextView5;
        String strM92640e;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        TradeItemBean tradeItemBeanM62768C3 = m62768C3();
        SymbolInfoEntity symbolInfoEntity4 = tradeItemBeanM62768C3 != null ? tradeItemBeanM62768C3.getSymbolInfoEntity() : null;
        if (symbolInfoEntity4 != null) {
            this.f51090Y = symbolInfoEntity4.getPriceIncrementPrecision();
            m62803z3().m63012n(symbolInfoEntity4.getBaseIncrementPrecision());
            m62800B3().m63012n(symbolInfoEntity4.getBaseIncrementPrecision());
        }
        C44653m0 c44653m0M62802y3 = m62802y3();
        if (c44653m0M62802y3 != null && (baseTextView5 = c44653m0M62802y3.f99229n) != null) {
            if (this.f51090Y == 0) {
                strM92640e = "1";
            } else {
                BigDecimal bigDecimalPow = new BigDecimal("0.1").pow(this.f51090Y);
                Intrinsics.checkNotNullExpressionValue(bigDecimalPow, "pow(...)");
                strM92640e = C42180b.m92640e(bigDecimalPow, null, 20, false, false, false, 0, null, 125, null);
            }
            baseTextView5.setText(strM92640e);
        }
        m62803z3().m63015q(this.f51090Y);
        m62800B3().m63015q(this.f51090Y);
        Fragment parentFragment = getParentFragment();
        Intrinsics.checkNotNull(parentFragment, "null cannot be cast to non-null type com.kubi.spot.quote.market.trade.MarketTradeFragment");
        int f51126d0 = (((MarketTradeFragment) parentFragment).getF51126d0() - C5275i0.m6236a(260.0f)) / C5275i0.m6236a(26.0f);
        OrderBookAdapter orderBookAdapterM62803z3 = m62803z3();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        orderBookAdapterM62803z3.m63019v(C27025c.m66568f(contextRequireContext, 12));
        OrderBookAdapter orderBookAdapterM62800B3 = m62800B3();
        Context contextRequireContext2 = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
        orderBookAdapterM62800B3.m63019v(C27025c.m66568f(contextRequireContext2, 12));
        m62803z3().m63017t(f51126d0);
        m62800B3().m63017t(f51126d0);
        C44653m0 c44653m0M62802y4 = m62802y3();
        if (c44653m0M62802y4 != null) {
            RecyclerView recyclerviewOrderbookBuy = c44653m0M62802y4.f99226k;
            Intrinsics.checkNotNullExpressionValue(recyclerviewOrderbookBuy, "recyclerviewOrderbookBuy");
            RecyclerView recyclerViewOrderBookSell = c44653m0M62802y4.f99225j;
            Intrinsics.checkNotNullExpressionValue(recyclerViewOrderBookSell, "recyclerViewOrderBookSell");
            m62769D3(recyclerviewOrderbookBuy, recyclerViewOrderBookSell);
        }
        C44653m0 c44653m0M62802y5 = m62802y3();
        if (c44653m0M62802y5 != null && (recyclerView2 = c44653m0M62802y5.f99226k) != null) {
            recyclerView2.setAdapter(m62803z3());
        }
        C44653m0 c44653m0M62802y6 = m62802y3();
        if (c44653m0M62802y6 != null && (recyclerView = c44653m0M62802y6.f99225j) != null) {
            recyclerView.setAdapter(m62800B3());
        }
        C44653m0 c44653m0M62802y7 = m62802y3();
        if (c44653m0M62802y7 != null && (baseTextView4 = c44653m0M62802y7.f99229n) != null) {
            C27046k.m66711z(baseTextView4, 0L, new Function0() { // from class: com.kubi.spot.quote.market.trade.o
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MarketOrderBookFragment.m62780P3(this.f51177b);
                }
            }, 1, null);
        }
        C44653m0 c44653m0M62802y8 = m62802y3();
        if (c44653m0M62802y8 != null) {
            BaseTextView tvAmountUnit = c44653m0M62802y8.f99227l;
            Intrinsics.checkNotNullExpressionValue(tvAmountUnit, "tvAmountUnit");
            BaseTextView tvAmountUnit1 = c44653m0M62802y8.f99228m;
            Intrinsics.checkNotNullExpressionValue(tvAmountUnit1, "tvAmountUnit1");
            C27046k.m66681D(new View[]{tvAmountUnit, tvAmountUnit1}, new Function0() { // from class: com.kubi.spot.quote.market.trade.p
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MarketOrderBookFragment.m62775K3(this.f51179b);
                }
            });
        }
        C44653m0 c44653m0M62802y9 = m62802y3();
        if (c44653m0M62802y9 != null && (baseTextView3 = c44653m0M62802y9.f99227l) != null) {
            int i11 = m62803z3().getF51231m() == 0 ? R$string.total_stub : R$string.amount_stub;
            TradeItemBean tradeItemBeanM62768C4 = m62768C3();
            baseTextView3.setText(getString(i11, C27041f.m66668h((tradeItemBeanM62768C4 == null || (symbolInfoEntity3 = tradeItemBeanM62768C4.getSymbolInfoEntity()) == null) ? null : symbolInfoEntity3.getBaseCurrencyName())));
        }
        C44653m0 c44653m0M62802y10 = m62802y3();
        if (c44653m0M62802y10 != null && (baseTextView2 = c44653m0M62802y10.f99228m) != null) {
            int i12 = m62803z3().getF51231m() == 0 ? R$string.total_stub : R$string.amount_stub;
            TradeItemBean tradeItemBeanM62768C5 = m62768C3();
            baseTextView2.setText(getString(i12, C27041f.m66668h((tradeItemBeanM62768C5 == null || (symbolInfoEntity2 = tradeItemBeanM62768C5.getSymbolInfoEntity()) == null) ? null : symbolInfoEntity2.getBaseCurrencyName())));
        }
        C44653m0 c44653m0M62802y11 = m62802y3();
        if (c44653m0M62802y11 != null && (baseTextView = c44653m0M62802y11.f99230o) != null) {
            int i13 = R$string.price_order;
            TradeItemBean tradeItemBeanM62768C6 = m62768C3();
            baseTextView.setText(getString(i13, C27041f.m66668h((tradeItemBeanM62768C6 == null || (symbolInfoEntity = tradeItemBeanM62768C6.getSymbolInfoEntity()) == null) ? null : symbolInfoEntity.getQuoteCurrencyName())));
        }
        C44653m0 c44653m0M62802y12 = m62802y3();
        if (c44653m0M62802y12 != null && (kuCoinDepthView2 = c44653m0M62802y12.f99218c) != null) {
            kuCoinDepthView2.setPricePrecision(C27039d.m66650j(symbolInfoEntity4 != null ? Integer.valueOf(symbolInfoEntity4.getPriceIncrementPrecision()) : null));
        }
        C44653m0 c44653m0M62802y13 = m62802y3();
        if (c44653m0M62802y13 != null && (kuCoinDepthView = c44653m0M62802y13.f99218c) != null) {
            kuCoinDepthView.setAmountPrecision(C27039d.m66650j(symbolInfoEntity4 != null ? Integer.valueOf(symbolInfoEntity4.getBaseIncrementPrecision()) : null));
        }
        showLoading();
        m62799A3().m61750g();
        if (C12573b.f21598a.m23696a()) {
            "call_auction_process".length();
        }
        C12572a.m23692a(this, true, new MarketOrderBookFragment$onViewCreated$$inlined$bindFlowEvent$1("call_auction_process", null, this));
        CompositeDisposable destroyDisposable = getDestroyDisposable();
        PublishSubject<Boolean> publishSubjectM21641g = CallAuctionSwitch.f20317a.m21641g();
        final Function1 function1 = new Function1() { // from class: com.kubi.spot.quote.market.trade.q
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MarketOrderBookFragment.m62776L3(this.f51180b, (Boolean) obj);
            }
        };
        Consumer<? super Boolean> consumer = new Consumer() { // from class: com.kubi.spot.quote.market.trade.r
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                MarketOrderBookFragment.m62777M3(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: com.kubi.spot.quote.market.trade.s
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MarketOrderBookFragment.m62778N3((Throwable) obj);
            }
        };
        destroyDisposable.add(publishSubjectM21641g.subscribe(consumer, new Consumer() { // from class: com.kubi.spot.quote.market.trade.t
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                MarketOrderBookFragment.m62779O3(function2, obj);
            }
        }));
    }

    /* JADX INFO: renamed from: y3 */
    public final C44653m0 m62802y3() {
        return (C44653m0) this.f51086U.getValue(this, f51085d0[0]);
    }

    /* JADX INFO: renamed from: z3 */
    public final OrderBookAdapter m62803z3() {
        return (OrderBookAdapter) this.f51087V.getValue();
    }

    /* JADX INFO: renamed from: G3 */
    public static final void m62772G3(MarketOrderBookFragment marketOrderBookFragment, OrderBookEntity orderBookEntity) {
        Intrinsics.checkNotNull(orderBookEntity);
        marketOrderBookFragment.m62774I3(orderBookEntity);
    }

    /* JADX INFO: renamed from: I3 */
    private final void m62774I3(OrderBookEntity orderBookEntity) {
        KuCoinDepthView kuCoinDepthView;
        List<double[]> bids;
        LinearLayout linearLayout;
        KuCoinDepthView kuCoinDepthView2;
        LinearLayout linearLayout2;
        C44653m0 c44653m0M62802y3 = m62802y3();
        if (c44653m0M62802y3 != null) {
            kuCoinDepthView = c44653m0M62802y3.f99218c;
        } else {
            kuCoinDepthView = null;
        }
        if (kuCoinDepthView != null) {
            List<double[]> asks = orderBookEntity.getAsks();
            if ((asks != null && !asks.isEmpty()) || ((bids = orderBookEntity.getBids()) != null && !bids.isEmpty())) {
                C44653m0 c44653m0M62802y4 = m62802y3();
                if (c44653m0M62802y4 != null && (linearLayout2 = c44653m0M62802y4.f99217b) != null) {
                    ViewExtKt.m66577h(linearLayout2);
                }
            } else {
                C44653m0 c44653m0M62802y5 = m62802y3();
                if (c44653m0M62802y5 != null && (linearLayout = c44653m0M62802y5.f99217b) != null) {
                    ViewExtKt.m66594y(linearLayout);
                }
            }
            showContent();
            m62800B3().m63014p(C27024b.m66559b(orderBookEntity.getAsks()));
            m62803z3().m63014p(C27024b.m66559b(orderBookEntity.getBids()));
            m62803z3().m63013o(Math.max(m62803z3().getF51235q(), m62800B3().getF51235q()));
            m62800B3().m63013o(Math.max(m62803z3().getF51235q(), m62800B3().getF51235q()));
            C44653m0 c44653m0M62802y6 = m62802y3();
            if (c44653m0M62802y6 != null && (kuCoinDepthView2 = c44653m0M62802y6.f99218c) != null) {
                kuCoinDepthView2.m55108d(C27024b.m66559b(orderBookEntity.getBids()), C27024b.m66559b(orderBookEntity.getAsks()));
            }
        }
    }

    /* JADX INFO: renamed from: K3 */
    public static final Unit m62775K3(MarketOrderBookFragment marketOrderBookFragment) {
        marketOrderBookFragment.m62785l0();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: L3 */
    public static final Unit m62776L3(MarketOrderBookFragment marketOrderBookFragment, Boolean bool) {
        Integer numValueOf;
        NewOrderBookHelper newOrderBookHelperM62799A3 = marketOrderBookFragment.m62799A3();
        String symbol = marketOrderBookFragment.m62768C3().getSymbol();
        Intrinsics.checkNotNullExpressionValue(symbol, "getSymbol(...)");
        SymbolInfoEntity symbolInfoEntity = marketOrderBookFragment.m62768C3().getSymbolInfoEntity();
        if (symbolInfoEntity != null) {
            numValueOf = Integer.valueOf(symbolInfoEntity.getPriceIncrementPrecision());
        } else {
            numValueOf = null;
        }
        newOrderBookHelperM62799A3.m61756o(symbol, C27039d.m66651k(numValueOf, 8));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: M3 */
    public static final void m62777M3(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: N3 */
    public static final Unit m62778N3(Throwable th2) {
        Intrinsics.checkNotNull(th2);
        C45700a.m100877c(th2, "TradeSubmitFragment");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: O3 */
    public static final void m62779O3(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: Q3 */
    public static final void m62781Q3(MarketOrderBookFragment marketOrderBookFragment, BaseViewHolder baseViewHolder, BottomSheetDialogHelper.InterfaceC24339a interfaceC24339a) {
        BaseTextView baseTextView;
        marketOrderBookFragment.f51091Z = baseViewHolder.getLayoutPosition();
        C44653m0 c44653m0M62802y3 = marketOrderBookFragment.m62802y3();
        if (c44653m0M62802y3 != null && (baseTextView = c44653m0M62802y3.f99229n) != null) {
            baseTextView.setText(interfaceC24339a.getLabel());
        }
        marketOrderBookFragment.m62803z3().m63015q(marketOrderBookFragment.f51090Y - baseViewHolder.getLayoutPosition());
        marketOrderBookFragment.m62800B3().m63015q(marketOrderBookFragment.f51090Y - baseViewHolder.getLayoutPosition());
        marketOrderBookFragment.m62801J3(marketOrderBookFragment.f51090Y - baseViewHolder.getLayoutPosition());
        marketOrderBookFragment.m62803z3().m63013o(Math.max(marketOrderBookFragment.m62803z3().getF51235q(), marketOrderBookFragment.m62800B3().getF51235q()));
        marketOrderBookFragment.m62800B3().m63013o(Math.max(marketOrderBookFragment.m62803z3().getF51235q(), marketOrderBookFragment.m62800B3().getF51235q()));
    }

    /* JADX INFO: renamed from: S3 */
    public static final TradeItemBean m62783S3(MarketOrderBookFragment marketOrderBookFragment) {
        TradeItemBean tradeItemBean;
        Bundle arguments = marketOrderBookFragment.getArguments();
        if (arguments != null && (tradeItemBean = (TradeItemBean) arguments.getParcelable("data")) != null) {
            return tradeItemBean;
        }
        return new TradeItemBean("BTC-USDT");
    }

    /* JADX INFO: renamed from: J3 */
    public final void m62801J3(int i11) {
        m62799A3().m61748e(i11);
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onHide() {
        super.onHide();
        this.f51092a0.m85236i(false);
        m62799A3().m61752k();
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onShow() throws Throwable {
        super.onShow();
        Disposable disposableM61754m = m62799A3().m61754m();
        if (disposableM61754m != null) {
            DisposableKt.addTo(disposableM61754m, getVisibleDisposable());
        }
        m62799A3().m61753l();
    }
}
