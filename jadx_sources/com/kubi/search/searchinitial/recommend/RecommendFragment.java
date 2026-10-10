package com.kubi.search.searchinitial.recommend;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.recyclerview.widget.RecyclerView;
import com.kubi.data.entity.TradeItemBean;
import com.kubi.data.entity.WsFutureSnapshotEntity;
import com.kubi.data.entity.WsMarketSnapshotEntity;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.resources.C22912t;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.search.R$layout;
import com.kubi.search.entity.ContractTradeItemBean;
import com.kubi.search.entity.ExtendEntity;
import com.kubi.search.entity.SearchRecommendWrap;
import com.kubi.search.searchinitial.adapter.InitialEarnAdapter;
import com.kubi.search.searchinitial.adapter.InitialFutureAdapter;
import com.kubi.search.searchinitial.adapter.InitialSpotAdapter;
import com.kubi.utils.C27100x0;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43841b;
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
import q10.C43584d;
import w00.C45681e;

/* JADX INFO: compiled from: RecommendFragment.kt */
/* JADX INFO: loaded from: classes44.dex */
@Metadata(m90083d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$2\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J\u001a\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020 2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\u0010\u0010*\u001a\u00020(2\u0006\u0010+\u001a\u00020,H\u0002J\u0018\u0010-\u001a\u00020(2\u000e\u0010.\u001a\n\u0012\u0004\u0012\u000200\u0018\u00010/H\u0002J\u0018\u00101\u001a\u00020(2\u000e\u0010.\u001a\n\u0012\u0004\u0012\u000202\u0018\u00010/H\u0002J\b\u00103\u001a\u00020(H\u0016J\b\u00104\u001a\u00020(H\u0016R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0015\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u000f\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001a\u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u000f\u001a\u0004\b\u001c\u0010\u001d¨\u00065"}, m90084d2 = {"Lcom/kubi/search/searchinitial/recommend/RecommendFragment;", "Lcom/kubi/sdk/BaseFragment;", "<init>", "()V", "binding", "Lcom/kubi/search/databinding/SearchFragmentRecommendBinding;", "getBinding$SearchLib_googleRelease", "()Lcom/kubi/search/databinding/SearchFragmentRecommendBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "vm", "Lcom/kubi/search/searchinitial/recommend/RecommendVM;", "getVm$SearchLib_googleRelease", "()Lcom/kubi/search/searchinitial/recommend/RecommendVM;", "vm$delegate", "Lkotlin/Lazy;", "spotAdapter", "Lcom/kubi/search/searchinitial/adapter/InitialSpotAdapter;", "getSpotAdapter", "()Lcom/kubi/search/searchinitial/adapter/InitialSpotAdapter;", "spotAdapter$delegate", "futureAdapter", "Lcom/kubi/search/searchinitial/adapter/InitialFutureAdapter;", "getFutureAdapter", "()Lcom/kubi/search/searchinitial/adapter/InitialFutureAdapter;", "futureAdapter$delegate", "earnAdapter", "Lcom/kubi/search/searchinitial/adapter/InitialEarnAdapter;", "getEarnAdapter", "()Lcom/kubi/search/searchinitial/adapter/InitialEarnAdapter;", "earnAdapter$delegate", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "savedInstanceState", "Landroid/os/Bundle;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "refreshView", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "Lcom/kubi/search/entity/SearchRecommendWrap;", "refreshSpotWsData", "list", "", "Lcom/kubi/data/entity/WsMarketSnapshotEntity;", "refreshFutureWsData", "Lcom/kubi/data/entity/WsFutureSnapshotEntity;", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, RNH5InterActionHelperKt.EVENT_NAME_ON_HIDE, "SearchLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nRecommendFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RecommendFragment.kt\ncom/kubi/search/searchinitial/recommend/RecommendFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 MviEx.kt\ncom/kubi/mvi/common/MviExKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,118:1\n147#2,16:119\n220#3,5:135\n1#4:140\n*S KotlinDebug\n*F\n+ 1 RecommendFragment.kt\ncom/kubi/search/searchinitial/recommend/RecommendFragment\n*L\n33#1:119,16\n34#1:135,5\n*E\n"})
public final class RecommendFragment extends BaseFragment {

    /* JADX INFO: renamed from: Z */
    public static final /* synthetic */ KProperty<Object>[] f48944Z = {Reflection.property1(new PropertyReference1Impl(RecommendFragment.class, "binding", "getBinding$SearchLib_googleRelease()Lcom/kubi/search/databinding/SearchFragmentRecommendBinding;", 0))};

    /* JADX INFO: renamed from: U */
    @NotNull
    public final InterfaceC24293a f48945U = C45681e.m100799e(this, new Function1<RecommendFragment, C43584d>() { // from class: com.kubi.search.searchinitial.recommend.RecommendFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C43584d invoke(@NotNull RecommendFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C43584d.m95918a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C43584d, Unit>() { // from class: com.kubi.search.searchinitial.recommend.RecommendFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C43584d it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C43584d c43584d) {
            invoke(c43584d);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: V */
    @NotNull
    public final Lazy f48946V = LazyKt.lazy(new Function0() { // from class: com.kubi.search.searchinitial.recommend.d
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return RecommendFragment.m59244K3(this.f48959b);
        }
    });

    /* JADX INFO: renamed from: W */
    @NotNull
    public final Lazy f48947W = LazyKt.lazy(new Function0() { // from class: com.kubi.search.searchinitial.recommend.e
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return RecommendFragment.m59243J3();
        }
    });

    /* JADX INFO: renamed from: X */
    @NotNull
    public final Lazy f48948X = LazyKt.lazy(new Function0() { // from class: com.kubi.search.searchinitial.recommend.f
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return RecommendFragment.m59256u3();
        }
    });

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final Lazy f48949Y = LazyKt.lazy(new Function0() { // from class: com.kubi.search.searchinitial.recommend.g
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return RecommendFragment.m59255t3();
        }
    });

    /* JADX INFO: renamed from: com.kubi.search.searchinitial.recommend.RecommendFragment$a */
    /* JADX INFO: compiled from: RecommendFragment.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C24408a implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1 f48950b;

        public C24408a(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f48950b = function;
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
            return this.f48950b;
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f48950b.invoke(obj);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX INFO: renamed from: A3 */
    public static final Unit m59237A3(RecommendFragment recommendFragment, SearchRecommendWrap searchRecommendWrap) {
        if (searchRecommendWrap != null) {
            recommendFragment.m59259H3(searchRecommendWrap);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: J3 */
    public static final InitialSpotAdapter m59243J3() {
        return new InitialSpotAdapter();
    }

    /* JADX INFO: renamed from: K3 */
    public static final RecommendVM m59244K3(RecommendFragment recommendFragment) {
        return (RecommendVM) new ViewModelProvider(recommendFragment).get(RecommendVM.class);
    }

    /* JADX INFO: renamed from: t3 */
    public static final InitialEarnAdapter m59255t3() {
        return new InitialEarnAdapter();
    }

    /* JADX INFO: renamed from: u3 */
    public static final InitialFutureAdapter m59256u3() {
        return new InitialFutureAdapter();
    }

    /* JADX INFO: renamed from: D3 */
    public final void m59257D3(final List<WsFutureSnapshotEntity> list) {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.search.searchinitial.recommend.i
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RecommendFragment.m59240E3(this.f48962b, list);
            }
        });
    }

    /* JADX INFO: renamed from: F3 */
    public final void m59258F3(final List<WsMarketSnapshotEntity> list) {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.search.searchinitial.recommend.j
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RecommendFragment.m59241G3(this.f48964b, list);
            }
        });
    }

    /* JADX INFO: renamed from: H3 */
    public final void m59259H3(final SearchRecommendWrap searchRecommendWrap) {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.search.searchinitial.recommend.h
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RecommendFragment.m59242I3(this.f48960b, searchRecommendWrap);
            }
        });
    }

    @Override // com.kubi.sdk.BaseFragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable Bundle savedInstanceState, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(R$layout.search_fragment_recommend, container, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        C43584d c43584dM59260v3 = m59260v3();
        if (c43584dM59260v3 == null) {
            return;
        }
        RecyclerView rvSpot = c43584dM59260v3.f96195d;
        Intrinsics.checkNotNullExpressionValue(rvSpot, "rvSpot");
        C22912t.m54409g(rvSpot, false);
        c43584dM59260v3.f96195d.setAdapter(m59263y3());
        RecyclerView rvFuture = c43584dM59260v3.f96194c;
        Intrinsics.checkNotNullExpressionValue(rvFuture, "rvFuture");
        C22912t.m54409g(rvFuture, false);
        c43584dM59260v3.f96194c.setAdapter(m59262x3());
        RecyclerView rvEarn = c43584dM59260v3.f96193b;
        Intrinsics.checkNotNullExpressionValue(rvEarn, "rvEarn");
        C22912t.m54409g(rvEarn, false);
        c43584dM59260v3.f96193b.setAdapter(m59261w3());
        m59264z3().m59275o().observe(getViewLifecycleOwner(), new C24408a(new Function1() { // from class: com.kubi.search.searchinitial.recommend.a
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecommendFragment.m59237A3(this.f48956b, (SearchRecommendWrap) obj);
            }
        }));
        m59264z3().m59276p().observe(getViewLifecycleOwner(), new C24408a(new Function1() { // from class: com.kubi.search.searchinitial.recommend.b
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecommendFragment.m59238B3(this.f48957b, (List) obj);
            }
        }));
        m59264z3().m59274n().observe(getViewLifecycleOwner(), new C24408a(new Function1() { // from class: com.kubi.search.searchinitial.recommend.c
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecommendFragment.m59239C3(this.f48958b, (List) obj);
            }
        }));
    }

    @Nullable
    /* JADX INFO: renamed from: v3 */
    public final C43584d m59260v3() {
        return (C43584d) this.f48945U.getValue(this, f48944Z[0]);
    }

    /* JADX INFO: renamed from: w3 */
    public final InitialEarnAdapter m59261w3() {
        return (InitialEarnAdapter) this.f48949Y.getValue();
    }

    /* JADX INFO: renamed from: x3 */
    public final InitialFutureAdapter m59262x3() {
        return (InitialFutureAdapter) this.f48948X.getValue();
    }

    /* JADX INFO: renamed from: y3 */
    public final InitialSpotAdapter m59263y3() {
        return (InitialSpotAdapter) this.f48947W.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: z3 */
    public final RecommendVM m59264z3() {
        return (RecommendVM) this.f48946V.getValue();
    }

    /* JADX INFO: renamed from: B3 */
    public static final Unit m59238B3(RecommendFragment recommendFragment, List list) {
        recommendFragment.m59258F3(list);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: C3 */
    public static final Unit m59239C3(RecommendFragment recommendFragment, List list) {
        recommendFragment.m59257D3(list);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: E3 */
    public static final Unit m59240E3(RecommendFragment recommendFragment, List list) {
        if (recommendFragment.isShowing() && list != null) {
            recommendFragment.m59262x3().m59185o(list);
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: G3 */
    public static final Unit m59241G3(RecommendFragment recommendFragment, List list) {
        if (recommendFragment.isShowing() && list != null) {
            recommendFragment.m59263y3().m59207v(list);
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: I3 */
    public static final Unit m59242I3(RecommendFragment recommendFragment, SearchRecommendWrap searchRecommendWrap) {
        C43584d c43584dM59260v3 = recommendFragment.m59260v3();
        if (c43584dM59260v3 == null) {
            return Unit.INSTANCE;
        }
        List<TradeItemBean> spotList = searchRecommendWrap.getSpotList();
        if (!spotList.isEmpty()) {
            recommendFragment.m59263y3().m59205s(CollectionsKt.chunked(spotList, 5));
            BaseTextView tvSpotTitle = c43584dM59260v3.f96198g;
            Intrinsics.checkNotNullExpressionValue(tvSpotTitle, "tvSpotTitle");
            C27046k.m66685H(tvSpotTitle);
            RecyclerView rvSpot = c43584dM59260v3.f96195d;
            Intrinsics.checkNotNullExpressionValue(rvSpot, "rvSpot");
            C27046k.m66685H(rvSpot);
        } else {
            BaseTextView tvSpotTitle2 = c43584dM59260v3.f96198g;
            Intrinsics.checkNotNullExpressionValue(tvSpotTitle2, "tvSpotTitle");
            C27046k.m66700o(tvSpotTitle2);
            RecyclerView rvSpot2 = c43584dM59260v3.f96195d;
            Intrinsics.checkNotNullExpressionValue(rvSpot2, "rvSpot");
            C27046k.m66700o(rvSpot2);
        }
        List<ContractTradeItemBean> futureList = searchRecommendWrap.getFutureList();
        if (!futureList.isEmpty()) {
            recommendFragment.m59262x3().setNewData(futureList);
            BaseTextView tvFutureTitle = c43584dM59260v3.f96197f;
            Intrinsics.checkNotNullExpressionValue(tvFutureTitle, "tvFutureTitle");
            C27046k.m66685H(tvFutureTitle);
            RecyclerView rvFuture = c43584dM59260v3.f96194c;
            Intrinsics.checkNotNullExpressionValue(rvFuture, "rvFuture");
            C27046k.m66685H(rvFuture);
        } else {
            BaseTextView tvFutureTitle2 = c43584dM59260v3.f96197f;
            Intrinsics.checkNotNullExpressionValue(tvFutureTitle2, "tvFutureTitle");
            C27046k.m66700o(tvFutureTitle2);
            RecyclerView rvFuture2 = c43584dM59260v3.f96194c;
            Intrinsics.checkNotNullExpressionValue(rvFuture2, "rvFuture");
            C27046k.m66700o(rvFuture2);
        }
        List<ExtendEntity> earnList = searchRecommendWrap.getEarnList();
        if (!earnList.isEmpty()) {
            recommendFragment.m59261w3().setNewData(earnList);
            BaseTextView tvEarnTitle = c43584dM59260v3.f96196e;
            Intrinsics.checkNotNullExpressionValue(tvEarnTitle, "tvEarnTitle");
            C27046k.m66685H(tvEarnTitle);
            RecyclerView rvEarn = c43584dM59260v3.f96193b;
            Intrinsics.checkNotNullExpressionValue(rvEarn, "rvEarn");
            C27046k.m66685H(rvEarn);
        } else {
            BaseTextView tvEarnTitle2 = c43584dM59260v3.f96196e;
            Intrinsics.checkNotNullExpressionValue(tvEarnTitle2, "tvEarnTitle");
            C27046k.m66700o(tvEarnTitle2);
            RecyclerView rvEarn2 = c43584dM59260v3.f96193b;
            Intrinsics.checkNotNullExpressionValue(rvEarn2, "rvEarn");
            C27046k.m66700o(rvEarn2);
        }
        C43841b.m96557d("event_click_home_search", "data_load_finish", null, 4, null);
        return Unit.INSTANCE;
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onHide() {
        super.onHide();
        m59264z3().onHide();
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onShow() throws Throwable {
        super.onShow();
        m59264z3().onShow();
    }
}
