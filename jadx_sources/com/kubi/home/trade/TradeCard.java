package com.kubi.home.trade;

import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.RecyclerView;
import com.kubi.data.entity.TradeItemBean;
import com.kubi.event.api.C12572a;
import com.kubi.home.R$layout;
import com.kubi.home.pagergridlayoutmanager.PagerGridLayoutManager;
import com.kubi.home.shortcut.IndicatorView2;
import com.kubi.kucoin.home.cards.BaseCard;
import com.kubi.kucoin.home.cards.BaseCardData;
import com.kubi.monitor.helper.TracePageHelper;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.router.core.Router;
import com.kubi.sdk.site.info.SiteInfoManager;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.tencent.qcloud.tuicore.TUIConstants;
import fj.C37534n0;
import java.util.Collection;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p830zf.InterfaceC46811m0;
import p852kotlin.Function;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.FunctionAdapter;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import w00.C45681e;

/* JADX INFO: compiled from: TradeCard.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0012\u001a\u00020\u0013H\u0014J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0015H\u0016J\b\u0010\u0017\u001a\u00020\u0015H\u0016J\b\u0010\u0018\u001a\u00020\u0015H\u0016J\u001a\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u0015H\u0002J\u0010\u0010\u001f\u001a\u00020\u00152\u0006\u0010 \u001a\u00020!H\u0016J\b\u0010\"\u001a\u00020\u0015H\u0002R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006#"}, m90084d2 = {"Lcom/kubi/home/trade/TradeCard;", "Lcom/kubi/kucoin/home/cards/BaseCard;", "<init>", "()V", "kucoinItemHomeTradeBinding", "Lcom/kubi/home/databinding/KucoinItemHomeTradeBinding;", "getKucoinItemHomeTradeBinding", "()Lcom/kubi/home/databinding/KucoinItemHomeTradeBinding;", "kucoinItemHomeTradeBinding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "viewModel", "Lcom/kubi/home/trade/TradeViewModel;", "getViewModel", "()Lcom/kubi/home/trade/TradeViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "adapter", "Lcom/kubi/home/trade/HomeTradeListAdapter;", "getLayout", "", "onMoveStart", "", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, RNH5InterActionHelperKt.EVENT_NAME_ON_HIDE, "onMoveStop", "onViewCreated", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "addObservers", "bindToUI", "data", "Lcom/kubi/kucoin/home/cards/BaseCardData;", "bindListLayoutManager", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nTradeCard.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TradeCard.kt\ncom/kubi/home/trade/TradeCard\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 FlavorEx.kt\ncom/kubi/kucoin/helper/FlavorExKt\n+ 4 MviEx.kt\ncom/kubi/mvi/common/MviExKt\n*L\n1#1,139:1\n147#2,16:140\n25#3,3:156\n220#4,5:159\n*S KotlinDebug\n*F\n+ 1 TradeCard.kt\ncom/kubi/home/trade/TradeCard\n*L\n27#1:140,16\n94#1:156,3\n33#1:159,5\n*E\n"})
public final class TradeCard extends BaseCard {

    /* JADX INFO: renamed from: Y */
    public static final /* synthetic */ KProperty<Object>[] f26314Y = {Reflection.property1(new PropertyReference1Impl(TradeCard.class, "kucoinItemHomeTradeBinding", "getKucoinItemHomeTradeBinding()Lcom/kubi/home/databinding/KucoinItemHomeTradeBinding;", 0))};

    /* JADX INFO: renamed from: V */
    @NotNull
    public final InterfaceC24293a f26315V = C45681e.m100799e(this, new Function1<TradeCard, C37534n0>() { // from class: com.kubi.home.trade.TradeCard$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C37534n0 invoke(@NotNull TradeCard fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C37534n0.m84532a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C37534n0, Unit>() { // from class: com.kubi.home.trade.TradeCard$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C37534n0 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C37534n0 c37534n0) {
            invoke(c37534n0);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: W */
    @NotNull
    public final Lazy f26316W = LazyKt.lazy(new Function0() { // from class: com.kubi.home.trade.e
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return TradeCard.m30416p3(this.f26330b);
        }
    });

    /* JADX INFO: renamed from: X */
    @NotNull
    public final HomeTradeListAdapter f26317X = new HomeTradeListAdapter();

    /* JADX INFO: renamed from: com.kubi.home.trade.TradeCard$a */
    /* JADX INFO: compiled from: TradeCard.kt */
    @Metadata(m90083d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005H\u0016¨\u0006\t"}, m90084d2 = {"com/kubi/home/trade/TradeCard$bindListLayoutManager$1", "Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager$PagerChangedListener;", "onPagerCountChanged", "", "pagerCount", "", "onPagerIndexSelected", "prePagerIndex", "currentPagerIndex", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C14900a implements PagerGridLayoutManager.InterfaceC14748e {
        public C14900a() {
        }

        @Override // com.kubi.home.pagergridlayoutmanager.PagerGridLayoutManager.InterfaceC14748e
        /* JADX INFO: renamed from: a */
        public void mo29805a(int i11, int i12) {
            IndicatorView2 indicatorView2;
            C37534n0 c37534n0M30418n3 = TradeCard.this.m30418n3();
            if (c37534n0M30418n3 == null || (indicatorView2 = c37534n0M30418n3.f83378c) == null) {
                return;
            }
            indicatorView2.m30257b(i12);
        }

        @Override // com.kubi.home.pagergridlayoutmanager.PagerGridLayoutManager.InterfaceC14748e
        /* JADX INFO: renamed from: b */
        public void mo29806b(int i11) {
            IndicatorView2 indicatorView2;
            C37534n0 c37534n0M30418n3 = TradeCard.this.m30418n3();
            if (c37534n0M30418n3 == null || (indicatorView2 = c37534n0M30418n3.f83378c) == null) {
                return;
            }
            indicatorView2.m30256a(i11, 0);
        }
    }

    /* JADX INFO: renamed from: com.kubi.home.trade.TradeCard$b */
    /* JADX INFO: compiled from: TradeCard.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C14901b implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1 f26319b;

        public C14901b(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f26319b = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p852kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f26319b;
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f26319b.invoke(obj);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX INFO: renamed from: k3 */
    public static final Unit m30413k3(TradeCard tradeCard, Boolean bool) {
        tradeCard.f26317X.notifyDataSetChanged();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: l3 */
    public static final Unit m30414l3(TradeCard tradeCard, List list) {
        IndicatorView2 indicatorView2;
        tradeCard.f26317X.replaceData(list);
        C37534n0 c37534n0M30418n3 = tradeCard.m30418n3();
        if (c37534n0M30418n3 != null && (indicatorView2 = c37534n0M30418n3.f83378c) != null) {
            indicatorView2.m30256a(((list.size() - 1) / 3) + 1, 0);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: m3 */
    private final void m30415m3() {
        RecyclerView recyclerView;
        PagerGridLayoutManager pagerGridLayoutManager = new PagerGridLayoutManager(1, 3, 0);
        pagerGridLayoutManager.m29765N(true);
        C37534n0 c37534n0M30418n3 = m30418n3();
        if (c37534n0M30418n3 != null && (recyclerView = c37534n0M30418n3.f83379d) != null) {
            recyclerView.setLayoutManager(pagerGridLayoutManager);
        }
        pagerGridLayoutManager.m29766O(new C14900a());
    }

    /* JADX INFO: renamed from: p3 */
    public static final TradeViewModel m30416p3(TradeCard tradeCard) {
        return (TradeViewModel) new ViewModelProvider(tradeCard).get(TradeViewModel.class);
    }

    @Override // com.kubi.kucoin.home.cards.ICard
    /* JADX INFO: renamed from: K1 */
    public void mo28980K1(@NotNull BaseCardData data) {
        IndicatorView2 indicatorView2;
        Intrinsics.checkNotNullParameter(data, "data");
        TradeData tradeData = data instanceof TradeData ? (TradeData) data : null;
        List<TradeItemBean> data2 = tradeData != null ? tradeData.getData() : null;
        if (data2 == null) {
            data2 = CollectionsKt.emptyList();
        }
        if (data2.isEmpty()) {
            C12572a.m23695d("com.kubi.home.event.HomeEvent:removeHomeCard", data.getCode(), 0L, 4, null);
            return;
        }
        HomeTradeListAdapter homeTradeListAdapter = this.f26317X;
        List mutableList = CollectionsKt.toMutableList((Collection) data2);
        Object objM56186h = Router.f46192a.m56186h(InterfaceC46811m0.class, SiteInfoManager.f47913a.m58109c());
        if (objM56186h != null) {
            ((InterfaceC46811m0) objM56186h).m103142a();
        } else {
            mutableList.add(new TradeItemBean());
        }
        C37534n0 c37534n0M30418n3 = m30418n3();
        if (c37534n0M30418n3 != null && (indicatorView2 = c37534n0M30418n3.f83378c) != null) {
            indicatorView2.m30256a(((mutableList.size() - 1) / 3) + 1, 0);
        }
        homeTradeListAdapter.replaceData(mutableList);
    }

    @Override // com.kubi.kucoin.home.cards.BaseCardFragment
    public int getLayout() {
        return R$layout.kucoin_item_home_trade;
    }

    /* JADX INFO: renamed from: n3 */
    public final C37534n0 m30418n3() {
        return (C37534n0) this.f26315V.getValue(this, f26314Y[0]);
    }

    /* JADX INFO: renamed from: o3 */
    public final TradeViewModel m30419o3() {
        return (TradeViewModel) this.f26316W.getValue();
    }

    @Override // com.kubi.kucoin.home.cards.BaseCard, com.kubi.kucoin.home.cards.BaseCardFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        m30417j3();
        m30415m3();
        C37534n0 c37534n0M30418n3 = m30418n3();
        if (c37534n0M30418n3 != null && (recyclerView2 = c37534n0M30418n3.f83379d) != null) {
            recyclerView2.setAdapter(this.f26317X);
        }
        C37534n0 c37534n0M30418n4 = m30418n3();
        if (c37534n0M30418n4 != null && (recyclerView = c37534n0M30418n4.f83379d) != null) {
            recyclerView.setAdapter(this.f26317X);
            RecyclerView.ItemAnimator itemAnimator = recyclerView.getItemAnimator();
            if (itemAnimator != null) {
                itemAnimator.setChangeDuration(0L);
            }
        }
        TracePageHelper.m42467b("load_home");
    }

    @Override // com.kubi.kucoin.home.cards.ICard
    /* JADX INFO: renamed from: P */
    public void mo28981P() {
        super.mo28981P();
        if (getView() != null) {
            m30417j3();
        }
    }

    @Override // com.kubi.kucoin.home.cards.ICard
    /* JADX INFO: renamed from: Q */
    public void mo28982Q() {
        super.mo28982Q();
        if (getView() != null) {
            m30419o3().m30432n().removeObservers(getViewLifecycleOwner());
            m30419o3().m30433o().removeObservers(getViewLifecycleOwner());
        }
    }

    /* JADX INFO: renamed from: j3 */
    public final void m30417j3() {
        m30419o3().m30432n().observe(getViewLifecycleOwner(), new C14901b(new Function1() { // from class: com.kubi.home.trade.c
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TradeCard.m30413k3(this.f26328b, (Boolean) obj);
            }
        }));
        m30419o3().m30433o().observe(getViewLifecycleOwner(), new C14901b(new Function1() { // from class: com.kubi.home.trade.d
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TradeCard.m30414l3(this.f26329b, (List) obj);
            }
        }));
    }

    @Override // com.kubi.kucoin.home.cards.BaseCardFragment
    public void onHide() {
        super.onHide();
        m30419o3().onHide();
    }

    @Override // com.kubi.kucoin.home.cards.BaseCardFragment
    public void onShow() throws Throwable {
        super.onShow();
        m30419o3().onShow();
    }
}
