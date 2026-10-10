package com.kubi.futures.trade.welfare.history;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentManager;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bm.InterfaceC4633f;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.futures.trade.welfare.FuturesWelfareAdapter;
import com.kubi.kucoin.view.KuCoinRefreshFooter;
import com.kubi.kumex.R$drawable;
import com.kubi.kumex.R$layout;
import com.kubi.kumex.R$string;
import com.kubi.kumex.data.market.model.QuotesSectionEntity;
import com.kubi.kumex.market.tradingArea.ChildSection;
import com.kubi.resources.widget.KuCoinRefreshLayout;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.widget.loading.WrapperLoadingView;
import com.kubi.utils.extensions.C27025c;
import com.tencent.qcloud.tuicore.TUIConstants;
import dm.C36821p3;
import hb0.InterfaceC38162f;
import jb0.InterfaceC40371e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.functions.Function3;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import w00.C45681e;

/* JADX INFO: compiled from: WelfareHistoryListFragment.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\u001a\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\u0018\u0010\"\u001a\u00020 2\u0006\u0010!\u001a\u00020\u00182\u0006\u0010#\u001a\u00020$H\u0014J\u0010\u0010%\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0018H$J\u0010\u0010&\u001a\u00020 2\u0006\u0010'\u001a\u00020(H\u0002J\b\u0010)\u001a\u00020 H$J\b\u0010*\u001a\u00020 H$J\u0010\u0010+\u001a\u00020 2\u0006\u0010,\u001a\u00020-H&J\b\u0010.\u001a\u00020 H\u0004J\b\u0010/\u001a\u00020 H\u0004J\b\u00100\u001a\u00020 H\u0004J\b\u00101\u001a\u00020 H\u0004J\n\u00102\u001a\u0004\u0018\u000103H\u0004J\n\u00104\u001a\u0004\u0018\u000105H\u0004R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R#\u0010\n\u001a\n \f*\u0004\u0018\u00010\u000b0\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0011\u001a\u00020\u0012X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u00066"}, m90084d2 = {"Lcom/kubi/futures/trade/welfare/history/WelfareHistoryListFragment;", "Lcom/kubi/sdk/BaseFragment;", "<init>", "()V", "viewBinding", "Lcom/kubi/kumex/databinding/BkumexFragmentWelfareHistoryListBinding;", "getViewBinding", "()Lcom/kubi/kumex/databinding/BkumexFragmentWelfareHistoryListBinding;", "viewBinding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "loadingView", "Lcom/kubi/sdk/widget/loading/WrapperLoadingView;", "kotlin.jvm.PlatformType", "getLoadingView", "()Lcom/kubi/sdk/widget/loading/WrapperLoadingView;", "loadingView$delegate", "Lkotlin/Lazy;", "needLoadingView", "", "getNeedLoadingView", "()Z", "setNeedLoadingView", "(Z)V", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "savedInstanceState", "Landroid/os/Bundle;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "onActionClick", "futuresWelfareType", "Lcom/kubi/kumex/data/platform/model/FuturesWelfareType;", "initView", "initSection", "context", "Landroid/content/Context;", "refresh", "loadMore", "handleSectionItemClick", ViewProps.POSITION, "", "showLoading", "showContent", "showEmpty", "showError", "refreshView", "Lcom/kubi/resources/widget/KuCoinRefreshLayout;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nWelfareHistoryListFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WelfareHistoryListFragment.kt\ncom/kubi/futures/trade/welfare/history/WelfareHistoryListFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n*L\n1#1,150:1\n147#2,16:151\n*S KotlinDebug\n*F\n+ 1 WelfareHistoryListFragment.kt\ncom/kubi/futures/trade/welfare/history/WelfareHistoryListFragment\n*L\n30#1:151,16\n*E\n"})
public abstract class WelfareHistoryListFragment extends BaseFragment {

    /* JADX INFO: renamed from: X */
    public static final /* synthetic */ KProperty<Object>[] f24848X = {Reflection.property1(new PropertyReference1Impl(WelfareHistoryListFragment.class, "viewBinding", "getViewBinding()Lcom/kubi/kumex/databinding/BkumexFragmentWelfareHistoryListBinding;", 0))};

    /* JADX INFO: renamed from: U */
    @NotNull
    public final InterfaceC24293a f24849U = C45681e.m100799e(this, new Function1<WelfareHistoryListFragment, C36821p3>() { // from class: com.kubi.futures.trade.welfare.history.WelfareHistoryListFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C36821p3 invoke(@NotNull WelfareHistoryListFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C36821p3.m82504a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C36821p3, Unit>() { // from class: com.kubi.futures.trade.welfare.history.WelfareHistoryListFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C36821p3 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C36821p3 c36821p3) {
            invoke(c36821p3);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: V */
    @NotNull
    public final Lazy f24850V = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.trade.welfare.history.j
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return WelfareHistoryListFragment.m28726w3(this.f24861b);
        }
    });

    /* JADX INFO: renamed from: W */
    public boolean f24851W;

    /* JADX INFO: renamed from: B0 */
    public abstract void mo28695B0();

    /* JADX INFO: renamed from: r3 */
    public abstract void mo28698r3(int i11);

    /* JADX INFO: renamed from: u3 */
    public abstract void mo28699u3(@NotNull View view);

    /* JADX INFO: renamed from: v3 */
    public abstract void mo28700v3();

    /* JADX INFO: renamed from: A3 */
    public static final Unit m28716A3(WelfareHistoryListFragment welfareHistoryListFragment, View view, int i11, InterfaceC4633f futuresWelfareType) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(futuresWelfareType, "futuresWelfareType");
        welfareHistoryListFragment.mo28701x3(view, futuresWelfareType);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: p3 */
    private final WrapperLoadingView m28724p3() {
        return (WrapperLoadingView) this.f24850V.getValue();
    }

    /* JADX INFO: renamed from: t3 */
    public static final Unit m28725t3(WelfareHistoryListFragment welfareHistoryListFragment, String s11, int i11) {
        Intrinsics.checkNotNullParameter(s11, "s");
        welfareHistoryListFragment.mo28698r3(i11);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: z3 */
    public static final void m28728z3(WelfareHistoryListFragment welfareHistoryListFragment, InterfaceC38162f it) {
        Intrinsics.checkNotNullParameter(it, "it");
        welfareHistoryListFragment.mo28700v3();
    }

    @Override // com.kubi.sdk.BaseFragment
    /* JADX INFO: renamed from: getNeedLoadingView, reason: from getter */
    public boolean getF24851W() {
        return this.f24851W;
    }

    @Override // com.kubi.sdk.BaseFragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable Bundle savedInstanceState, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(R$layout.bkumex_fragment_welfare_history_list, container, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        C36821p3 c36821p3M28732q3 = m28732q3();
        if (c36821p3M28732q3 == null) {
            return;
        }
        KuCoinRefreshLayout kuCoinRefreshLayout = c36821p3M28732q3.f80808c;
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        kuCoinRefreshLayout.setRefreshFooter(new KuCoinRefreshFooter(context));
        c36821p3M28732q3.f80808c.m54650b(new Function0() { // from class: com.kubi.futures.trade.welfare.history.g
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return WelfareHistoryListFragment.m28727y3(this.f24858b);
            }
        });
        c36821p3M28732q3.f80808c.setOnLoadMoreListener(new InterfaceC40371e() { // from class: com.kubi.futures.trade.welfare.history.h
            @Override // jb0.InterfaceC40371e
            /* JADX INFO: renamed from: b */
            public final void mo28734b(InterfaceC38162f interfaceC38162f) {
                WelfareHistoryListFragment.m28728z3(this.f24859b, interfaceC38162f);
            }
        });
        c36821p3M28732q3.f80808c.setEnableLoadMore(false);
        c36821p3M28732q3.f80807b.setLayoutManager(new LinearLayoutManager(view.getContext()));
        RecyclerView recyclerView = c36821p3M28732q3.f80807b;
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        recyclerView.setAdapter(new FuturesWelfareAdapter(childFragmentManager, false, new Function3() { // from class: com.kubi.futures.trade.welfare.history.i
            @Override // p852kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return WelfareHistoryListFragment.m28716A3(this.f24860b, (View) obj, ((Integer) obj2).intValue(), (InterfaceC4633f) obj3);
            }
        }, null, 10, null));
        Context context2 = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        m28733s3(context2);
        mo28699u3(view);
    }

    /* JADX INFO: renamed from: q3 */
    public final C36821p3 m28732q3() {
        return (C36821p3) this.f24849U.getValue(this, f24848X[0]);
    }

    @Override // com.kubi.sdk.BaseFragment
    public void setNeedLoadingView(boolean z11) {
        this.f24851W = z11;
    }

    /* JADX INFO: renamed from: x3 */
    public void mo28701x3(@NotNull View view, @NotNull InterfaceC4633f futuresWelfareType) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(futuresWelfareType, "futuresWelfareType");
    }

    /* JADX INFO: renamed from: E3 */
    public static final void m28717E3(WelfareHistoryListFragment welfareHistoryListFragment, View view) {
        welfareHistoryListFragment.mo28695B0();
    }

    /* JADX INFO: renamed from: w3 */
    public static final WrapperLoadingView m28726w3(WelfareHistoryListFragment welfareHistoryListFragment) {
        C36821p3 c36821p3M28732q3 = welfareHistoryListFragment.m28732q3();
        Intrinsics.checkNotNull(c36821p3M28732q3);
        return WrapperLoadingView.injectView(c36821p3M28732q3.f80807b);
    }

    /* JADX INFO: renamed from: y3 */
    public static final Unit m28727y3(WelfareHistoryListFragment welfareHistoryListFragment) {
        welfareHistoryListFragment.mo28695B0();
        return Unit.INSTANCE;
    }

    @Nullable
    /* JADX INFO: renamed from: B3 */
    public final RecyclerView m28729B3() {
        C36821p3 c36821p3M28732q3 = m28732q3();
        if (c36821p3M28732q3 != null) {
            return c36821p3M28732q3.f80807b;
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: C3 */
    public final KuCoinRefreshLayout m28730C3() {
        C36821p3 c36821p3M28732q3 = m28732q3();
        if (c36821p3M28732q3 != null) {
            return c36821p3M28732q3.f80808c;
        }
        return null;
    }

    /* JADX INFO: renamed from: D3 */
    public final void m28731D3() {
        m28724p3().showEmpty(R$string.load_failed_click_retry, R$drawable.ic2_common_system_maintain, new View.OnClickListener() { // from class: com.kubi.futures.trade.welfare.history.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WelfareHistoryListFragment.m28717E3(this.f24863b, view);
            }
        });
    }

    /* JADX INFO: renamed from: s3 */
    public final void m28733s3(Context context) {
        C36821p3 c36821p3M28732q3 = m28732q3();
        if (c36821p3M28732q3 == null) {
            return;
        }
        int iM66565c = (int) C27025c.m66565c(context, 10);
        ChildSection childSection = new ChildSection();
        RecyclerView section = c36821p3M28732q3.f80809d;
        Intrinsics.checkNotNullExpressionValue(section, "section");
        ChildSection childSectionM34619d = childSection.m34621f(section).m34620e(iM66565c, iM66565c).m34619d(new Function2() { // from class: com.kubi.futures.trade.welfare.history.k
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return WelfareHistoryListFragment.m28725t3(this.f24862b, (String) obj, ((Integer) obj2).intValue());
            }
        });
        String string = getString(R$string.margin_coupons_state_used);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        QuotesSectionEntity quotesSectionEntity = new QuotesSectionEntity(true, string, "0");
        String string2 = getString(R$string.bkumex_expired);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        childSectionM34619d.m34616a(CollectionsKt.listOf((Object[]) new QuotesSectionEntity[]{quotesSectionEntity, new QuotesSectionEntity(false, string2, "0")}));
    }

    public final void showContent() {
        m28724p3().showContent();
    }

    public final void showEmpty() {
        m28724p3().showEmpty(R$string.no_more_data, R$drawable.ic2_common_empty, (View.OnClickListener) null);
    }

    public final void showLoading() {
        m28724p3().showLoading();
    }
}
