package com.kubi.margin.market.trade;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.blankj.utilcode.util.C5275i0;
import com.kubi.data.entity.OrderBookEntity;
import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.data.entity.TradeItemBean;
import com.kubi.margin.R$array;
import com.kubi.margin.R$layout;
import com.kubi.margin.R$string;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.chart.depth.KuCoinDepthView;
import com.kubi.sdk.BaseApplication;
import com.kubi.sdk.base.p113ui.OldBaseFragment;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.widget.dialog.BottomSheetDialogHelper;
import com.kubi.sdk.widget.dialog.SelectEntity;
import com.kubi.tradebase.orderbook.DisplayOrderBookData;
import com.kubi.tradebase.orderbook.OrderBookAdapter;
import com.kubi.tradebase.orderbook.OrderBookViewModel;
import com.kubi.utils.C27051h;
import com.kubi.utils.extensions.C27024b;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tuicore.TUIConstants;
import g10.C37787r;
import gf.C37878b0;
import io.chad.library.adapter.base.BaseViewHolder;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.BiConsumer;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.DisposableKt;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p206dp.C36902a0;
import p568qp.C43834n;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
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
import w00.C45681e;

/* JADX INFO: compiled from: MarginOrderBookFragment.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 82\u00020\u0001:\u00018B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010&\u001a\u00020\u000bH\u0014J\u001a\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,H\u0017J!\u0010-\u001a\u00020(2\u0012\u0010.\u001a\n\u0012\u0006\b\u0001\u0012\u0002000/\"\u000200H\u0002¢\u0006\u0002\u00101J\b\u00102\u001a\u00020(H\u0016J\b\u00103\u001a\u00020(H\u0016J\u0010\u00104\u001a\u00020(2\u0006\u00105\u001a\u000206H\u0002J\b\u00107\u001a\u00020(H\u0002R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0017\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0011\u001a\u0004\b\u0018\u0010\u0015R\u001b\u0010\u001a\u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0011\u001a\u0004\b\u001c\u0010\u001dR\u000e\u0010\u001f\u001a\u00020 X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010!\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010\u0011\u001a\u0004\b#\u0010$¨\u00069"}, m90084d2 = {"Lcom/kubi/margin/market/trade/MarginOrderBookFragment;", "Lcom/kubi/sdk/base/ui/OldBaseFragment;", "<init>", "()V", "viewBind", "Lcom/kubi/margin/databinding/BmarginFragmentMarketOrderbookBinding;", "getViewBind", "()Lcom/kubi/margin/databinding/BmarginFragmentMarketOrderbookBinding;", "viewBind$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "maxSize", "", "orderbookVm", "Lcom/kubi/tradebase/orderbook/OrderBookViewModel;", "getOrderbookVm", "()Lcom/kubi/tradebase/orderbook/OrderBookViewModel;", "orderbookVm$delegate", "Lkotlin/Lazy;", "mSellAdapter", "Lcom/kubi/tradebase/orderbook/OrderBookAdapter;", "getMSellAdapter", "()Lcom/kubi/tradebase/orderbook/OrderBookAdapter;", "mSellAdapter$delegate", "mBuyAdapter", "getMBuyAdapter", "mBuyAdapter$delegate", "tradeItem", "Lcom/kubi/data/entity/TradeItemBean;", "getTradeItem", "()Lcom/kubi/data/entity/TradeItemBean;", "tradeItem$delegate", "wsDataHelper", "Lcom/kubi/sdk/websocket/WsDataHelper;", "mOrderBookHelper", "Lcom/kubi/margin/trade/helper/MarginOrderBookHelper;", "getMOrderBookHelper", "()Lcom/kubi/margin/trade/helper/MarginOrderBookHelper;", "mOrderBookHelper$delegate", "getLayout", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "initRecyclerView", "recyclerViews", "", "Landroidx/recyclerview/widget/RecyclerView;", "([Landroidx/recyclerview/widget/RecyclerView;)V", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, RNH5InterActionHelperKt.EVENT_NAME_ON_HIDE, "onOrderBookDataReceived", "srcOrderEntity", "Lcom/kubi/data/entity/OrderBookEntity;", "showOrderBookAmountDialog", "Companion", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SuppressLint({"KCFragmentCheck"})
@SourceDebugExtension({"SMAP\nMarginOrderBookFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarginOrderBookFragment.kt\ncom/kubi/margin/market/trade/MarginOrderBookFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,262:1\n147#2,16:263\n106#3,15:279\n13537#4,3:294\n1573#5:297\n1604#5,4:298\n*S KotlinDebug\n*F\n+ 1 MarginOrderBookFragment.kt\ncom/kubi/margin/market/trade/MarginOrderBookFragment\n*L\n40#1:263,16\n50#1:279,15\n215#1:294,3\n120#1:297\n120#1:298,4\n*E\n"})
public final class MarginOrderBookFragment extends OldBaseFragment {

    /* JADX INFO: renamed from: U */
    @NotNull
    public final InterfaceC24293a f33479U = C45681e.m100799e(this, new Function1<MarginOrderBookFragment, C36902a0>() { // from class: com.kubi.margin.market.trade.MarginOrderBookFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C36902a0 invoke(@NotNull MarginOrderBookFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C36902a0.m82673a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C36902a0, Unit>() { // from class: com.kubi.margin.market.trade.MarginOrderBookFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C36902a0 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C36902a0 c36902a0) {
            invoke(c36902a0);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: V */
    public int f33480V = 8;

    /* JADX INFO: renamed from: W */
    @NotNull
    public final Lazy f33481W;

    /* JADX INFO: renamed from: X */
    @NotNull
    public final Lazy f33482X;

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final Lazy f33483Y;

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final Lazy f33484Z;

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public final C37787r f33485a0;

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public final Lazy f33486b0;

    /* JADX INFO: renamed from: d0 */
    public static final /* synthetic */ KProperty<Object>[] f33478d0 = {Reflection.property1(new PropertyReference1Impl(MarginOrderBookFragment.class, "viewBind", "getViewBind()Lcom/kubi/margin/databinding/BmarginFragmentMarketOrderbookBinding;", 0))};

    /* JADX INFO: renamed from: c0 */
    @NotNull
    public static final Companion f33477c0 = new Companion(null);

    /* JADX INFO: compiled from: MarginOrderBookFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/margin/market/trade/MarginOrderBookFragment$Companion;", "", "<init>", "()V", "newInstance", "Lcom/kubi/margin/market/trade/MarginOrderBookFragment;", "tradeItemBean", "Lcom/kubi/data/entity/TradeItemBean;", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final MarginOrderBookFragment newInstance(@NotNull TradeItemBean tradeItemBean) {
            Intrinsics.checkNotNullParameter(tradeItemBean, "tradeItemBean");
            MarginOrderBookFragment marginOrderBookFragment = new MarginOrderBookFragment();
            marginOrderBookFragment.setArguments(new C27051h().m66721e("data", tradeItemBean).m66717a());
            return marginOrderBookFragment;
        }
    }

    /* JADX INFO: renamed from: E3 */
    public final void m39349E3(RecyclerView... recyclerViewArr) {
        for (RecyclerView recyclerView : recyclerViewArr) {
            recyclerView.setHasFixedSize(true);
            recyclerView.setLayoutManager(new LinearLayoutManager(this.mContext));
        }
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    @SuppressLint({"KCCyclomaticComplexityCheck"})
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        SymbolInfoEntity symbolInfoEntity;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        final C36902a0 c36902a0M39348D3 = m39348D3();
        if (c36902a0M39348D3 != null) {
            TradeItemBean tradeItemBeanM39347C3 = m39347C3();
            final SymbolInfoEntity symbolInfoEntity2 = tradeItemBeanM39347C3 != null ? tradeItemBeanM39347C3.getSymbolInfoEntity() : null;
            if (symbolInfoEntity2 != null) {
                int priceIncrementPrecision = symbolInfoEntity2.getPriceIncrementPrecision();
                m39346B3().m63268r().setValue(Integer.valueOf(symbolInfoEntity2.getBaseIncrementPrecision()));
                MutableLiveData<Pair<Integer, String>> mutableLiveDataM63272v = m39346B3().m63272v();
                Integer numValueOf = Integer.valueOf(priceIncrementPrecision);
                ArrayList<String> arrayListM39398a = C18031f1.m39398a(symbolInfoEntity2.getPriceIncrementPrecision());
                int iM66650j = C27039d.m66650j(Integer.valueOf(symbolInfoEntity2.getPriceIncrementPrecision())) - priceIncrementPrecision;
                String str = (arrayListM39398a.size() <= iM66650j || iM66650j < 0) ? arrayListM39398a.get(0) : arrayListM39398a.get(iM66650j);
                Intrinsics.checkNotNull(str);
                mutableLiveDataM63272v.setValue(new Pair<>(numValueOf, str));
            }
            Fragment parentFragment = getParentFragment();
            Intrinsics.checkNotNull(parentFragment, "null cannot be cast to non-null type com.kubi.margin.market.trade.MarginMarketTradeFragment");
            this.f33480V = Math.max((((MarginMarketTradeFragment) parentFragment).getF33473d0() - C5275i0.m6236a(260.0f)) / C5275i0.m6236a(26.0f), 5);
            RecyclerView recyclerviewOrderbookBuy = c36902a0M39348D3.f81577h;
            Intrinsics.checkNotNullExpressionValue(recyclerviewOrderbookBuy, "recyclerviewOrderbookBuy");
            RecyclerView recyclerViewOrderBookSell = c36902a0M39348D3.f81576g;
            Intrinsics.checkNotNullExpressionValue(recyclerViewOrderBookSell, "recyclerViewOrderBookSell");
            m39349E3(recyclerviewOrderbookBuy, recyclerViewOrderBookSell);
            c36902a0M39348D3.f81577h.setAdapter(m39351y3());
            c36902a0M39348D3.f81576g.setAdapter(m39345A3());
            BaseTextView tvPrecisionTitle = c36902a0M39348D3.f81580k;
            Intrinsics.checkNotNullExpressionValue(tvPrecisionTitle, "tvPrecisionTitle");
            C27046k.m66711z(tvPrecisionTitle, 0L, new Function0() { // from class: com.kubi.margin.market.trade.r0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MarginOrderBookFragment.m39321L3(symbolInfoEntity2, this, c36902a0M39348D3);
                }
            }, 1, null);
            BaseTextView tvAmountUnit = c36902a0M39348D3.f81578i;
            Intrinsics.checkNotNullExpressionValue(tvAmountUnit, "tvAmountUnit");
            BaseTextView tvAmountUnit1 = c36902a0M39348D3.f81579j;
            Intrinsics.checkNotNullExpressionValue(tvAmountUnit1, "tvAmountUnit1");
            C27046k.m66681D(new View[]{tvAmountUnit, tvAmountUnit1}, new Function0() { // from class: com.kubi.margin.market.trade.w0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MarginOrderBookFragment.m39320K3(this.f33563b);
                }
            });
            BaseTextView baseTextView = c36902a0M39348D3.f81581l;
            int i11 = R$string.price_order;
            TradeItemBean tradeItemBeanM39347C4 = m39347C3();
            baseTextView.setText(getString(i11, C27041f.m66668h((tradeItemBeanM39347C4 == null || (symbolInfoEntity = tradeItemBeanM39347C4.getSymbolInfoEntity()) == null) ? null : symbolInfoEntity.getQuoteCurrencyName())));
            c36902a0M39348D3.f81571b.setPricePrecision(C27039d.m66650j(symbolInfoEntity2 != null ? Integer.valueOf(symbolInfoEntity2.getPriceIncrementPrecision()) : null));
            c36902a0M39348D3.f81571b.setAmountPrecision(C27039d.m66650j(symbolInfoEntity2 != null ? Integer.valueOf(symbolInfoEntity2.getBaseIncrementPrecision()) : null));
            showLoading();
            m39352z3().m96531q();
        }
        m39346B3().m63268r().observe(getViewLifecycleOwner(), new C18031f1.a(new Function1() { // from class: com.kubi.margin.market.trade.x0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MarginOrderBookFragment.m39323N3(this.f33565b, (Integer) obj);
            }
        }));
        m39346B3().m63272v().observe(getViewLifecycleOwner(), new C18031f1.a(new Function1() { // from class: com.kubi.margin.market.trade.y0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MarginOrderBookFragment.m39324O3(this.f33567b, (Pair) obj);
            }
        }));
        m39346B3().m63273w().observe(getViewLifecycleOwner(), new C18031f1.a(new Function1() { // from class: com.kubi.margin.market.trade.z0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MarginOrderBookFragment.m39325P3(this.f33569b, (Integer) obj);
            }
        }));
        m39346B3().m63271u().observe(getViewLifecycleOwner(), new C18031f1.a(new Function1() { // from class: com.kubi.margin.market.trade.a1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MarginOrderBookFragment.m39326Q3(this.f33497b, (OrderBookEntity) obj);
            }
        }));
        m39346B3().m63269s().observe(this, new C18031f1.a(new Function1() { // from class: com.kubi.margin.market.trade.b1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MarginOrderBookFragment.m39327R3(this.f33500b, (DisplayOrderBookData) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: F3 */
    public static final OrderBookAdapter m39316F3() {
        return new OrderBookAdapter(1, 1, false, null, 12, null);
    }

    /* JADX INFO: renamed from: G3 */
    public static final C43834n m39317G3(final MarginOrderBookFragment marginOrderBookFragment) {
        C37787r c37787r = marginOrderBookFragment.f33485a0;
        String symbol = marginOrderBookFragment.m39347C3().getSymbol();
        SymbolInfoEntity symbolInfoEntity = marginOrderBookFragment.m39347C3().getSymbolInfoEntity();
        return new C43834n(c37787r, symbol, C27039d.m66651k(symbolInfoEntity != null ? Integer.valueOf(symbolInfoEntity.getPriceIncrementPrecision()) : null, 8), new Consumer() { // from class: com.kubi.margin.market.trade.u0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                MarginOrderBookFragment.m39318H3(this.f33556b, (OrderBookEntity) obj);
            }
        });
    }

    /* JADX INFO: renamed from: I3 */
    public static final OrderBookAdapter m39319I3() {
        return new OrderBookAdapter(0, 1, false, null, 12, null);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0074  */
    /* JADX INFO: renamed from: L3 */
    public static final Unit m39321L3(final SymbolInfoEntity symbolInfoEntity, final MarginOrderBookFragment marginOrderBookFragment, final C36902a0 c36902a0) {
        boolean z11;
        BottomSheetDialogHelper bottomSheetDialogHelper = BottomSheetDialogHelper.f48599a;
        ArrayList<String> arrayListM39398a = C18031f1.m39398a(C27039d.m66651k(symbolInfoEntity != null ? Integer.valueOf(symbolInfoEntity.getPriceIncrementPrecision()) : null, 8));
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayListM39398a, 10));
        int i11 = 0;
        for (Object obj : arrayListM39398a) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            String str = (String) obj;
            Pair<Integer, String> value = marginOrderBookFragment.m39346B3().m63272v().getValue();
            if (value == null) {
                z11 = false;
            } else if (value.getFirst().intValue() == C27039d.m66650j(symbolInfoEntity != null ? Integer.valueOf(symbolInfoEntity.getPriceIncrementPrecision()) : null) - i11) {
                z11 = true;
            } else {
                z11 = false;
            }
            arrayList.add(new SelectEntity(null, str, null, null, null, null, null, null, null, false, z11, null, 3069, null));
            i11 = i12;
        }
        DialogFragmentHelper dialogFragmentHelperM58944B = BottomSheetDialogHelper.m58944B(bottomSheetDialogHelper, arrayList, new BiConsumer() { // from class: com.kubi.margin.market.trade.t0
            @Override // io.reactivex.functions.BiConsumer
            public final void accept(Object obj2, Object obj3) throws Exception {
                MarginOrderBookFragment.m39322M3(c36902a0, symbolInfoEntity, marginOrderBookFragment, (BaseViewHolder) obj2, (BottomSheetDialogHelper.InterfaceC24339a) obj3);
            }
        }, false, null, null, false, 60, null);
        FragmentManager childFragmentManager = marginOrderBookFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        dialogFragmentHelperM58944B.show(childFragmentManager, "showPrecisionDialog");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: M3 */
    public static final void m39322M3(C36902a0 c36902a0, SymbolInfoEntity symbolInfoEntity, MarginOrderBookFragment marginOrderBookFragment, BaseViewHolder baseViewHolder, BottomSheetDialogHelper.InterfaceC24339a interfaceC24339a) throws Exception {
        c36902a0.f81580k.setText(interfaceC24339a.getLabel());
        int iM66650j = C27039d.m66650j(symbolInfoEntity != null ? Integer.valueOf(symbolInfoEntity.getPriceIncrementPrecision()) : null) - baseViewHolder.getAdapterPosition();
        marginOrderBookFragment.m39346B3().m63272v().setValue(new Pair<>(Integer.valueOf(iM66650j), interfaceC24339a.getLabel().toString()));
        marginOrderBookFragment.m39352z3().m96528n(iM66650j);
    }

    /* JADX INFO: renamed from: S3 */
    public static final void m39328S3(MarginOrderBookFragment marginOrderBookFragment, BaseViewHolder baseViewHolder, BottomSheetDialogHelper.InterfaceC24339a interfaceC24339a) {
        C37878b0.f85252a.m85544y(baseViewHolder.getAdapterPosition());
        marginOrderBookFragment.m39346B3().m63273w().setValue(Integer.valueOf(baseViewHolder.getAdapterPosition()));
    }

    /* JADX INFO: renamed from: l0 */
    private final void m39331l0() {
        ArrayList arrayList = new ArrayList();
        String[] stringArray = BaseApplication.INSTANCE.get().getResources().getStringArray(R$array.margin_all_or_single);
        Intrinsics.checkNotNullExpressionValue(stringArray, "getStringArray(...)");
        int length = stringArray.length;
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            String str = stringArray[i11];
            int i13 = i12 + 1;
            Intrinsics.checkNotNull(str);
            arrayList.add(new SelectEntity(null, str, null, null, null, null, null, null, null, false, i12 == C37878b0.f85252a.m85531l(), null, 3069, null));
            i11++;
            i12 = i13;
        }
        DialogFragmentHelper dialogFragmentHelperM58944B = BottomSheetDialogHelper.m58944B(BottomSheetDialogHelper.f48599a, arrayList, new BiConsumer() { // from class: com.kubi.margin.market.trade.v0
            @Override // io.reactivex.functions.BiConsumer
            public final void accept(Object obj, Object obj2) {
                MarginOrderBookFragment.m39328S3(this.f33560b, (BaseViewHolder) obj, (BottomSheetDialogHelper.InterfaceC24339a) obj2);
            }
        }, false, null, null, false, 60, null);
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        dialogFragmentHelperM58944B.show(childFragmentManager, "showOrderBookAmountDialog");
    }

    /* JADX INFO: renamed from: A3 */
    public final OrderBookAdapter m39345A3() {
        return (OrderBookAdapter) this.f33482X.getValue();
    }

    /* JADX INFO: renamed from: B3 */
    public final OrderBookViewModel m39346B3() {
        return (OrderBookViewModel) this.f33481W.getValue();
    }

    /* JADX INFO: renamed from: C3 */
    public final TradeItemBean m39347C3() {
        return (TradeItemBean) this.f33484Z.getValue();
    }

    /* JADX INFO: renamed from: D3 */
    public final C36902a0 m39348D3() {
        return (C36902a0) this.f33479U.getValue(this, f33478d0[0]);
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public int getLayout() {
        return R$layout.bmargin_fragment_market_orderbook;
    }

    /* JADX INFO: renamed from: y3 */
    public final OrderBookAdapter m39351y3() {
        return (OrderBookAdapter) this.f33483Y.getValue();
    }

    /* JADX INFO: renamed from: z3 */
    public final C43834n m39352z3() {
        return (C43834n) this.f33486b0.getValue();
    }

    public MarginOrderBookFragment() {
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.kubi.margin.market.trade.MarginOrderBookFragment$special$$inlined$viewModels$default$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final Fragment invoke() {
                return this;
            }

            {
                super(0);
            }
        };
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.kubi.margin.market.trade.MarginOrderBookFragment$special$$inlined$viewModels$default$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function0.invoke();
            }

            {
                super(0);
            }
        });
        final Function0 function1 = null;
        this.f33481W = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(OrderBookViewModel.class), new Function0<ViewModelStore>() { // from class: com.kubi.margin.market.trade.MarginOrderBookFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m103549viewModels$lambda1(lazy).getMViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.kubi.margin.market.trade.MarginOrderBookFragment$special$$inlined$viewModels$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function2 = function1;
                if (function2 != null && (creationExtras = (CreationExtras) function2.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM103549viewModels$lambda1 = FragmentViewModelLazyKt.m103549viewModels$lambda1(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM103549viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM103549viewModels$lambda1 : null;
                return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.kubi.margin.market.trade.MarginOrderBookFragment$special$$inlined$viewModels$default$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                ViewModelStoreOwner viewModelStoreOwnerM103549viewModels$lambda1 = FragmentViewModelLazyKt.m103549viewModels$lambda1(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM103549viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM103549viewModels$lambda1 : null;
                if (hasDefaultViewModelProviderFactory != null && (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) != null) {
                    return defaultViewModelProviderFactory;
                }
                ViewModelProvider.Factory defaultViewModelProviderFactory2 = this.getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory2, "defaultViewModelProviderFactory");
                return defaultViewModelProviderFactory2;
            }
        });
        this.f33482X = LazyKt.lazy(new Function0() { // from class: com.kubi.margin.market.trade.c1
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MarginOrderBookFragment.m39319I3();
            }
        });
        this.f33483Y = LazyKt.lazy(new Function0() { // from class: com.kubi.margin.market.trade.d1
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MarginOrderBookFragment.m39316F3();
            }
        });
        this.f33484Z = LazyKt.lazy(new Function0() { // from class: com.kubi.margin.market.trade.e1
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MarginOrderBookFragment.m39329T3(this.f33509b);
            }
        });
        this.f33485a0 = new C37787r(this);
        this.f33486b0 = LazyKt.lazy(new Function0() { // from class: com.kubi.margin.market.trade.s0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MarginOrderBookFragment.m39317G3(this.f33548b);
            }
        });
    }

    /* JADX INFO: renamed from: H3 */
    public static final void m39318H3(MarginOrderBookFragment marginOrderBookFragment, OrderBookEntity orderBookEntity) {
        Intrinsics.checkNotNull(orderBookEntity);
        marginOrderBookFragment.m39350J3(orderBookEntity);
    }

    /* JADX INFO: renamed from: K3 */
    public static final Unit m39320K3(MarginOrderBookFragment marginOrderBookFragment) {
        marginOrderBookFragment.m39331l0();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: N3 */
    public static final Unit m39323N3(MarginOrderBookFragment marginOrderBookFragment, Integer num) {
        OrderBookViewModel.m63259h(marginOrderBookFragment.m39346B3(), null, marginOrderBookFragment.f33480V, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: O3 */
    public static final Unit m39324O3(MarginOrderBookFragment marginOrderBookFragment, Pair pair) throws Exception {
        BaseTextView baseTextView;
        C36902a0 c36902a0M39348D3 = marginOrderBookFragment.m39348D3();
        if (c36902a0M39348D3 != null && (baseTextView = c36902a0M39348D3.f81580k) != null) {
            baseTextView.setText((CharSequence) pair.getSecond());
        }
        marginOrderBookFragment.m39352z3().m96528n(((Number) pair.getFirst()).intValue());
        OrderBookViewModel.m63259h(marginOrderBookFragment.m39346B3(), null, marginOrderBookFragment.f33480V, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: P3 */
    public static final Unit m39325P3(MarginOrderBookFragment marginOrderBookFragment, Integer num) {
        boolean z11;
        BaseTextView baseTextView;
        int i11;
        BaseTextView baseTextView2;
        int i12;
        String baseCurrencyName;
        C36902a0 c36902a0M39348D3 = marginOrderBookFragment.m39348D3();
        String baseCurrencyName2 = null;
        if (c36902a0M39348D3 != null && (baseTextView2 = c36902a0M39348D3.f81578i) != null) {
            if (num != null && num.intValue() == 0) {
                i12 = R$string.total_stub;
            } else {
                i12 = R$string.amount_stub;
            }
            SymbolInfoEntity symbolInfoEntity = marginOrderBookFragment.m39347C3().getSymbolInfoEntity();
            if (symbolInfoEntity != null) {
                baseCurrencyName = symbolInfoEntity.getBaseCurrencyName();
            } else {
                baseCurrencyName = null;
            }
            baseTextView2.setText(marginOrderBookFragment.getString(i12, C27041f.m66668h(baseCurrencyName)));
        }
        C36902a0 c36902a0M39348D4 = marginOrderBookFragment.m39348D3();
        if (c36902a0M39348D4 != null && (baseTextView = c36902a0M39348D4.f81579j) != null) {
            if (num != null && num.intValue() == 0) {
                i11 = R$string.total_stub;
            } else {
                i11 = R$string.amount_stub;
            }
            SymbolInfoEntity symbolInfoEntity2 = marginOrderBookFragment.m39347C3().getSymbolInfoEntity();
            if (symbolInfoEntity2 != null) {
                baseCurrencyName2 = symbolInfoEntity2.getBaseCurrencyName();
            }
            baseTextView.setText(marginOrderBookFragment.getString(i11, C27041f.m66668h(baseCurrencyName2)));
        }
        OrderBookAdapter orderBookAdapterM39351y3 = marginOrderBookFragment.m39351y3();
        boolean z12 = false;
        if (num != null && num.intValue() == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        orderBookAdapterM39351y3.m63252g(z11);
        OrderBookAdapter orderBookAdapterM39345A3 = marginOrderBookFragment.m39345A3();
        if (num != null && num.intValue() == 0) {
            z12 = true;
        }
        orderBookAdapterM39345A3.m63252g(z12);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Q3 */
    public static final Unit m39326Q3(MarginOrderBookFragment marginOrderBookFragment, OrderBookEntity orderBookEntity) {
        OrderBookViewModel.m63259h(marginOrderBookFragment.m39346B3(), null, marginOrderBookFragment.f33480V, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: R3 */
    public static final Unit m39327R3(MarginOrderBookFragment marginOrderBookFragment, DisplayOrderBookData displayOrderBookData) {
        OrderBookAdapter orderBookAdapterM39351y3 = marginOrderBookFragment.m39351y3();
        Intrinsics.checkNotNull(displayOrderBookData);
        orderBookAdapterM39351y3.m63254i(displayOrderBookData, true, marginOrderBookFragment.f33480V);
        marginOrderBookFragment.m39345A3().m63254i(displayOrderBookData, true, marginOrderBookFragment.f33480V);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: T3 */
    public static final TradeItemBean m39329T3(MarginOrderBookFragment marginOrderBookFragment) {
        TradeItemBean tradeItemBean;
        Bundle arguments = marginOrderBookFragment.getArguments();
        if (arguments != null && (tradeItemBean = (TradeItemBean) arguments.getParcelable("data")) != null) {
            return tradeItemBean;
        }
        return new TradeItemBean("BTC-USDT");
    }

    /* JADX INFO: renamed from: J3 */
    public final void m39350J3(OrderBookEntity orderBookEntity) {
        C36902a0 c36902a0M39348D3 = m39348D3();
        if (c36902a0M39348D3 != null && c36902a0M39348D3.f81571b != null) {
            showContent();
            m39346B3().m63271u().setValue(orderBookEntity);
            KuCoinDepthView kuCoinDepthView = c36902a0M39348D3.f81571b;
            if (kuCoinDepthView != null) {
                kuCoinDepthView.m55108d(C27024b.m66559b(orderBookEntity.getBids()), C27024b.m66559b(orderBookEntity.getAsks()));
            }
        }
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onHide() {
        super.onHide();
        this.f33485a0.m85236i(false);
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onShow() {
        super.onShow();
        Disposable disposableM96533z = m39352z3().m96533z();
        if (disposableM96533z != null) {
            DisposableKt.addTo(disposableM96533z, getVisibleDisposable());
        }
    }
}
