package com.kubi.quotefacade.tradechance;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bv.C4669g0;
import com.blankj.utilcode.util.C5267e0;
import com.kubi.mvi.state.SimpleStateFragment;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.quotefacade.R$layout;
import com.kubi.quotefacade.tradechance.submodule.BaseChanceChildView;
import com.kubi.resources.C22912t;
import com.kubi.resources.widget.ScrollTabIndicatorView;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.C27100x0;
import com.tencent.bugly.proguard.InterfaceC33730j9;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p208dr.InterfaceC36952a;
import p569qq.C43841b;
import p569qq.C43852m;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KClass;
import p852kotlin.reflect.KProperty;
import w00.C45681e;

/* JADX INFO: compiled from: TradeChanceFragment.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000s\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0006*\u0001.\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0010\u001a\u00020\u0011H\u0014J\u001a\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\b\u0010 \u001a\u00020\u001bH\u0016J\b\u0010!\u001a\u00020\u001bH\u0016J\b\u0010\"\u001a\u00020\u001bH\u0016J\b\u0010#\u001a\u00020\u001bH\u0016J\u0010\u0010$\u001a\u00020\u001b2\u0006\u0010%\u001a\u00020&H\u0014J:\u0010'\u001a\u00020\u001b2\"\u0010\u0014\u001a\u001e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00110\u0015j\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0011`\u00172\f\u0010(\u001a\b\u0012\u0004\u0012\u00020*0)H\u0002J\u0010\u0010+\u001a\u00020\u001b2\u0006\u0010,\u001a\u00020\u0016H\u0002J\u0010\u00100\u001a\u00020\u001b2\u0006\u00101\u001a\u00020\u0019H\u0002J\b\u00102\u001a\u00020\u001bH\u0002R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001d\u0010\n\u001a\u0004\u0018\u00010\u000b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R.\u0010\u0014\u001a\"\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0015j\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0011\u0018\u0001`\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010-\u001a\u00020.X\u0082\u0004¢\u0006\u0004\n\u0002\u0010/¨\u00063"}, m90084d2 = {"Lcom/kubi/quotefacade/tradechance/TradeChanceFragment;", "Lcom/kubi/mvi/state/SimpleStateFragment;", "Lcom/kubi/quotefacade/tradechance/TradeChanceContract$UIState;", "<init>", "()V", "vmClass", "Lkotlin/reflect/KClass;", "Lcom/kubi/quotefacade/tradechance/TradeChanceVM;", "getVmClass", "()Lkotlin/reflect/KClass;", "binding", "Lcom/kubi/quotefacade/databinding/QuoteFragmentTradeChanceBinding;", "getBinding", "()Lcom/kubi/quotefacade/databinding/QuoteFragmentTradeChanceBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "getLayout", "", "chanceAdapter", "Lcom/kubi/quotefacade/tradechance/TradeChanceAdapter;", "tabsMap", "Ljava/util/LinkedHashMap;", "", "Lkotlin/collections/LinkedHashMap;", "scrollByHand", "", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, "onLoad", "onAgainShow", RNH5InterActionHelperKt.EVENT_NAME_ON_HIDE, "dispatchSingleEvent", "singleEvent", "Lcom/kubi/mvi/event/ISingleEvent;", "fillDataIntoView", "dataList", "", "Lcom/kubi/quotefacade/tradechance/ITradeChanceDataItem;", "scrollTabIndicator", "tab", "onScrollListener", "com/kubi/quotefacade/tradechance/TradeChanceFragment$onScrollListener$1", "Lcom/kubi/quotefacade/tradechance/TradeChanceFragment$onScrollListener$1;", "notifyChildScroll", InterfaceC33730j9.f70350a, "checkTabAfterScroll", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nTradeChanceFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TradeChanceFragment.kt\ncom/kubi/quotefacade/tradechance/TradeChanceFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 StateEx.kt\ncom/kubi/mvi/state/StateExKt\n+ 6 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,175:1\n147#2,16:176\n1#3:192\n1869#4,2:193\n1869#4,2:195\n360#4,7:205\n1869#4,2:212\n93#5,4:197\n93#5,4:201\n536#6:214\n521#6,6:215\n*S KotlinDebug\n*F\n+ 1 TradeChanceFragment.kt\ncom/kubi/quotefacade/tradechance/TradeChanceFragment\n*L\n35#1:176,16\n82#1:193,2\n88#1:195,2\n124#1:205,7\n155#1:212,2\n93#1:197,4\n101#1:201,4\n171#1:214\n171#1:215,6\n*E\n"})
public final class TradeChanceFragment extends SimpleStateFragment<TradeChanceContract$UIState> {

    /* JADX INFO: renamed from: Z */
    public static final /* synthetic */ KProperty<Object>[] f42598Z = {Reflection.property1(new PropertyReference1Impl(TradeChanceFragment.class, "binding", "getBinding()Lcom/kubi/quotefacade/databinding/QuoteFragmentTradeChanceBinding;", 0))};

    /* JADX INFO: renamed from: W */
    @Nullable
    public LinkedHashMap<String, Integer> f42601W;

    /* JADX INFO: renamed from: X */
    public boolean f42602X;

    /* JADX INFO: renamed from: U */
    @NotNull
    public final InterfaceC24293a f42599U = C45681e.m100799e(this, new Function1<TradeChanceFragment, C4669g0>() { // from class: com.kubi.quotefacade.tradechance.TradeChanceFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C4669g0 invoke(@NotNull TradeChanceFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C4669g0.m4650a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C4669g0, Unit>() { // from class: com.kubi.quotefacade.tradechance.TradeChanceFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C4669g0 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4669g0 c4669g0) {
            invoke(c4669g0);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: V */
    @NotNull
    public final TradeChanceAdapter f42600V = new TradeChanceAdapter();

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final C22536a f42603Y = new C22536a();

    /* JADX INFO: renamed from: com.kubi.quotefacade.tradechance.TradeChanceFragment$a */
    /* JADX INFO: compiled from: TradeChanceFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, m90084d2 = {"com/kubi/quotefacade/tradechance/TradeChanceFragment$onScrollListener$1", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "onScrollStateChanged", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "newState", "", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C22536a extends RecyclerView.OnScrollListener {
        public C22536a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            super.onScrollStateChanged(recyclerView, newState);
            if (newState == 0) {
                TradeChanceFragment.this.m53045t3();
                TradeChanceFragment.this.f42602X = false;
                TradeChanceFragment.this.m53051y3(true);
            } else {
                if (newState != 1) {
                    return;
                }
                TradeChanceFragment.this.f42602X = true;
                TradeChanceFragment.this.m53051y3(false);
            }
        }
    }

    /* JADX INFO: renamed from: A3 */
    private final void m53036A3(final String str) {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.quotefacade.tradechance.h
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TradeChanceFragment.m53037B3(this.f42630b, str);
            }
        });
    }

    /* JADX INFO: renamed from: B3 */
    public static final Unit m53037B3(TradeChanceFragment tradeChanceFragment, String str) {
        Integer num;
        Set<String> setKeySet;
        RecyclerView recyclerView;
        LinkedHashMap<String, Integer> linkedHashMap = tradeChanceFragment.f42601W;
        if (linkedHashMap == null || (num = linkedHashMap.get(str)) == null) {
            return Unit.INSTANCE;
        }
        int iIntValue = num.intValue();
        List<T> data = tradeChanceFragment.f42600V.getData();
        Intrinsics.checkNotNullExpressionValue(data, "getData(...)");
        Iterator it = data.iterator();
        int i11 = 0;
        while (true) {
            if (!it.hasNext()) {
                i11 = -1;
                break;
            }
            if (((ITradeChanceDataItem) it.next()).getF38450c() == iIntValue) {
                break;
            }
            i11++;
        }
        Integer numValueOf = Integer.valueOf(i11);
        List listEmptyList = null;
        if (numValueOf.intValue() == -1) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            int iIntValue2 = numValueOf.intValue();
            C4669g0 c4669g0M53050x3 = tradeChanceFragment.m53050x3();
            RecyclerView.LayoutManager layoutManager = (c4669g0M53050x3 == null || (recyclerView = c4669g0M53050x3.f4348b) == null) ? null : recyclerView.getLayoutManager();
            LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
            if (linearLayoutManager != null) {
                linearLayoutManager.scrollToPositionWithOffset(iIntValue2, 0);
            }
        }
        LinkedHashMap<String, Integer> linkedHashMap2 = tradeChanceFragment.f42601W;
        if (linkedHashMap2 != null && (setKeySet = linkedHashMap2.keySet()) != null) {
            listEmptyList = CollectionsKt.toList(setKeySet);
        }
        if (listEmptyList == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        int iIndexOf = listEmptyList.indexOf(str);
        if (iIndexOf >= 0) {
            C43852m.m96591c("B5TradeChance", "Tab", String.valueOf(iIndexOf), null, 8, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t3 */
    public final void m53045t3() {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.quotefacade.tradechance.g
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TradeChanceFragment.m53046u3(this.f42629b);
            }
        });
    }

    /* JADX INFO: renamed from: u3 */
    public static final Unit m53046u3(TradeChanceFragment tradeChanceFragment) {
        String str;
        C4669g0 c4669g0M53050x3;
        ScrollTabIndicatorView scrollTabIndicatorView;
        RecyclerView recyclerView;
        if (!tradeChanceFragment.f42602X) {
            return Unit.INSTANCE;
        }
        C4669g0 c4669g0M53050x4 = tradeChanceFragment.m53050x3();
        RecyclerView.LayoutManager layoutManager = (c4669g0M53050x4 == null || (recyclerView = c4669g0M53050x4.f4348b) == null) ? null : recyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null) {
            return Unit.INSTANCE;
        }
        ITradeChanceDataItem iTradeChanceDataItem = (ITradeChanceDataItem) tradeChanceFragment.f42600V.getItem(linearLayoutManager.findFirstVisibleItemPosition());
        LinkedHashMap<String, Integer> linkedHashMap = tradeChanceFragment.f42601W;
        if (linkedHashMap != null) {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry<String, Integer> entry : linkedHashMap.entrySet()) {
                if (iTradeChanceDataItem != null && entry.getValue().intValue() == iTradeChanceDataItem.getF38450c()) {
                    linkedHashMap2.put(entry.getKey(), entry.getValue());
                }
            }
            Set setKeySet = linkedHashMap2.keySet();
            if (setKeySet != null && (str = (String) CollectionsKt.firstOrNull(setKeySet)) != null && (c4669g0M53050x3 = tradeChanceFragment.m53050x3()) != null && (scrollTabIndicatorView = c4669g0M53050x3.f4349c) != null) {
                scrollTabIndicatorView.m54766c(str);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: w3 */
    public static final Unit m53047w3(TradeChanceFragment tradeChanceFragment, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        tradeChanceFragment.m53036A3(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: z3 */
    public static final Unit m53048z3(TradeChanceFragment tradeChanceFragment, boolean z11) {
        Collection<BaseChanceChildView<?>> collectionValues = tradeChanceFragment.f42600V.m53032l().values();
        Intrinsics.checkNotNullExpressionValue(collectionValues, "<get-values>(...)");
        for (BaseChanceChildView baseChanceChildView : CollectionsKt.toList(collectionValues)) {
            if (z11) {
                if (baseChanceChildView == null) {
                    baseChanceChildView = null;
                }
                if (baseChanceChildView != null) {
                    baseChanceChildView.mo53107P();
                }
            } else {
                if (baseChanceChildView == null) {
                    baseChanceChildView = null;
                }
                if (baseChanceChildView != null) {
                    baseChanceChildView.mo53108Q();
                }
            }
        }
        return Unit.INSTANCE;
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    public void dispatchSingleEvent(@NotNull InterfaceC36952a singleEvent) {
        Intrinsics.checkNotNullParameter(singleEvent, "singleEvent");
        super.dispatchSingleEvent(singleEvent);
        if (singleEvent instanceof C22547d) {
            C22547d c22547d = (C22547d) singleEvent;
            if (getView() == null) {
                return;
            }
            m53049v3(c22547d.m53104b(), c22547d.m53103a());
            C43841b.m96557d("B5markets_chance_trade_render", "page_load_end", null, 4, null);
        }
        if (singleEvent instanceof C22546c) {
            C22546c c22546c = (C22546c) singleEvent;
            if (getView() == null) {
                return;
            }
            this.f42600V.m53034n(c22546c.m53102a());
        }
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public int getLayout() {
        return R$layout.quote_fragment_trade_chance;
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    @NotNull
    public KClass<TradeChanceVM> getVmClass() {
        return Reflection.getOrCreateKotlinClass(TradeChanceVM.class);
    }

    @Override // com.kubi.mvi.state.BaseStateFragment, com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        RecyclerView recyclerView;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        C4669g0 c4669g0M53050x3 = m53050x3();
        if (c4669g0M53050x3 == null || (recyclerView = c4669g0M53050x3.f4348b) == null) {
            return;
        }
        recyclerView.setHasFixedSize(true);
        C22912t.m54409g(recyclerView, false);
        recyclerView.addOnScrollListener(this.f42603Y);
        TradeChanceAdapter tradeChanceAdapter = this.f42600V;
        tradeChanceAdapter.setHasStableIds(true);
        recyclerView.setAdapter(tradeChanceAdapter);
        final Context context = recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(context) { // from class: com.kubi.quotefacade.tradechance.TradeChanceFragment$onViewCreated$1$2
            @Override // androidx.recyclerview.widget.LinearLayoutManager
            public void calculateExtraLayoutSpace(RecyclerView.State state, int[] extraLayoutSpace) {
                Intrinsics.checkNotNullParameter(state, "state");
                Intrinsics.checkNotNullParameter(extraLayoutSpace, "extraLayoutSpace");
                super.calculateExtraLayoutSpace(state, extraLayoutSpace);
                int iM6182d = C5267e0.m6182d();
                extraLayoutSpace[0] = extraLayoutSpace[0] + iM6182d;
                extraLayoutSpace[1] = extraLayoutSpace[1] + iM6182d;
            }
        });
    }

    @Nullable
    /* JADX INFO: renamed from: x3 */
    public final C4669g0 m53050x3() {
        return (C4669g0) this.f42599U.getValue(this, f42598Z[0]);
    }

    /* JADX INFO: renamed from: y3 */
    public final void m53051y3(final boolean z11) {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.quotefacade.tradechance.f
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TradeChanceFragment.m53048z3(this.f42627b, z11);
            }
        });
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onAgainShow() {
        super.onAgainShow();
        Integer viewStatus = getViewStatus();
        if (viewStatus != null && viewStatus.intValue() == 1) {
            sendIntent(TradeChanceContract$UiIntent.LoadData.INSTANCE);
            Collection<BaseChanceChildView<?>> collectionValues = this.f42600V.m53032l().values();
            Intrinsics.checkNotNullExpressionValue(collectionValues, "<get-values>(...)");
            Iterator<T> it = collectionValues.iterator();
            while (it.hasNext()) {
                ((BaseChanceChildView) it.next()).mo53109b();
            }
        }
    }

    @Override // com.kubi.mvi.state.BaseStateFragment, com.kubi.sdk.BaseFragment
    public void onHide() {
        super.onHide();
        Collection<BaseChanceChildView<?>> collectionValues = this.f42600V.m53032l().values();
        Intrinsics.checkNotNullExpressionValue(collectionValues, "<get-values>(...)");
        Iterator<T> it = collectionValues.iterator();
        while (it.hasNext()) {
            ((BaseChanceChildView) it.next()).mo53110c();
        }
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onLoad() {
        super.onLoad();
        BaseFragment.showLoadingView$default(this, 0, 0, 3, null);
        sendIntent(TradeChanceContract$UiIntent.LoadData.INSTANCE);
        C43841b.m96557d("B5markets_chance_trade_render", "page_load_start", null, 4, null);
    }

    @Override // com.kubi.mvi.state.BaseStateFragment, com.kubi.sdk.BaseFragment
    public void onShow() {
        super.onShow();
        C43852m.m96595g("B5ChanceCenter", "Tab", "1", null, 8, null);
    }

    /* JADX INFO: renamed from: v3 */
    public final void m53049v3(LinkedHashMap<String, Integer> linkedHashMap, List<ITradeChanceDataItem> list) {
        RecyclerView recyclerView;
        Context context;
        RecyclerView recyclerView2;
        ScrollTabIndicatorView scrollTabIndicatorView;
        C4669g0 c4669g0M53050x3 = m53050x3();
        if (c4669g0M53050x3 != null && (recyclerView = c4669g0M53050x3.f4348b) != null && (context = recyclerView.getContext()) != null) {
            showContentView();
            this.f42601W = linkedHashMap;
            C4669g0 c4669g0M53050x4 = m53050x3();
            if (c4669g0M53050x4 != null && (scrollTabIndicatorView = c4669g0M53050x4.f4349c) != null) {
                Set<String> setKeySet = linkedHashMap.keySet();
                Intrinsics.checkNotNullExpressionValue(setKeySet, "<get-keys>(...)");
                scrollTabIndicatorView.m54769g(CollectionsKt.toList(setKeySet), new Function1() { // from class: com.kubi.quotefacade.tradechance.e
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return TradeChanceFragment.m53047w3(this.f42626b, (String) obj);
                    }
                });
            }
            C4669g0 c4669g0M53050x5 = m53050x3();
            if (c4669g0M53050x5 != null && (recyclerView2 = c4669g0M53050x5.f4348b) != null) {
                recyclerView2.setItemViewCacheSize(list.size() + 1);
            }
            this.f42600V.m53035p(context, list);
        }
    }
}
