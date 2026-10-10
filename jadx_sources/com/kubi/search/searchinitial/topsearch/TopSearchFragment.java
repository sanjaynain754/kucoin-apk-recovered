package com.kubi.search.searchinitial.topsearch;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentContainerView;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.kubi.data.entity.WsMarketSnapshotEntity;
import com.kubi.operation.api.IOperationService;
import com.kubi.operation.api.entity.SearchTopicEntity;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.search.R$id;
import com.kubi.search.R$layout;
import com.kubi.search.entity.TopSearchEntityWrap;
import com.kubi.search.searchinitial.SearchRealtimeView;
import com.kubi.utils.C27100x0;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.C27032f;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Function;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.FunctionAdapter;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import q10.C43587g;
import w00.C45681e;

/* JADX INFO: compiled from: TopSearchFragment.kt */
/* JADX INFO: loaded from: classes44.dex */
@Metadata(m90083d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u001a\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\u000e\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001dJ\b\u0010\u001e\u001a\u00020\u0019H\u0016J\b\u0010\u001f\u001a\u00020\u0019H\u0016R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r¨\u0006 "}, m90084d2 = {"Lcom/kubi/search/searchinitial/topsearch/TopSearchFragment;", "Lcom/kubi/sdk/BaseFragment;", "<init>", "()V", "binding", "Lcom/kubi/search/databinding/SearchFragmentTopsearchBinding;", "getBinding$SearchLib_googleRelease", "()Lcom/kubi/search/databinding/SearchFragmentTopsearchBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "vm", "Lcom/kubi/search/searchinitial/topsearch/TopSearchVM;", "getVm$SearchLib_googleRelease", "()Lcom/kubi/search/searchinitial/topsearch/TopSearchVM;", "vm$delegate", "Lkotlin/Lazy;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "savedInstanceState", "Landroid/os/Bundle;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "refreshView", "entityWrap", "Lcom/kubi/search/entity/TopSearchEntityWrap;", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, RNH5InterActionHelperKt.EVENT_NAME_ON_HIDE, "SearchLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nTopSearchFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TopSearchFragment.kt\ncom/kubi/search/searchinitial/topsearch/TopSearchFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 MviEx.kt\ncom/kubi/mvi/common/MviExKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,74:1\n147#2,16:75\n220#3,5:91\n1#4:96\n*S KotlinDebug\n*F\n+ 1 TopSearchFragment.kt\ncom/kubi/search/searchinitial/topsearch/TopSearchFragment\n*L\n29#1:75,16\n30#1:91,5\n*E\n"})
public final class TopSearchFragment extends BaseFragment {

    /* JADX INFO: renamed from: W */
    public static final /* synthetic */ KProperty<Object>[] f48969W = {Reflection.property1(new PropertyReference1Impl(TopSearchFragment.class, "binding", "getBinding$SearchLib_googleRelease()Lcom/kubi/search/databinding/SearchFragmentTopsearchBinding;", 0))};

    /* JADX INFO: renamed from: U */
    @NotNull
    public final InterfaceC24293a f48970U = C45681e.m100799e(this, new Function1<TopSearchFragment, C43587g>() { // from class: com.kubi.search.searchinitial.topsearch.TopSearchFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C43587g invoke(@NotNull TopSearchFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C43587g.m95924a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C43587g, Unit>() { // from class: com.kubi.search.searchinitial.topsearch.TopSearchFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C43587g it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C43587g c43587g) {
            invoke(c43587g);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: V */
    @NotNull
    public final Lazy f48971V = LazyKt.lazy(new Function0() { // from class: com.kubi.search.searchinitial.topsearch.c
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return TopSearchFragment.m59288v3(this.f48979b);
        }
    });

    /* JADX INFO: renamed from: com.kubi.search.searchinitial.topsearch.TopSearchFragment$a */
    /* JADX INFO: compiled from: TopSearchFragment.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C24423a implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1 f48972b;

        public C24423a(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f48972b = function;
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
            return this.f48972b;
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f48972b.invoke(obj);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX INFO: renamed from: q3 */
    public static final Unit m59284q3(TopSearchFragment topSearchFragment, TopSearchEntityWrap topSearchEntityWrap) {
        if (topSearchEntityWrap != null) {
            topSearchFragment.m59291t3(topSearchEntityWrap);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: r3 */
    public static final Unit m59285r3(final C43587g c43587g, final WsMarketSnapshotEntity wsMarketSnapshotEntity) {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.search.searchinitial.topsearch.e
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TopSearchFragment.m59286s3(wsMarketSnapshotEntity, c43587g);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: s3 */
    public static final Unit m59286s3(WsMarketSnapshotEntity wsMarketSnapshotEntity, C43587g c43587g) {
        if (wsMarketSnapshotEntity != null) {
            c43587g.f96209c.m59164G(wsMarketSnapshotEntity);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: v3 */
    public static final TopSearchVM m59288v3(TopSearchFragment topSearchFragment) {
        return (TopSearchVM) new ViewModelProvider(topSearchFragment).get(TopSearchVM.class);
    }

    @Nullable
    /* JADX INFO: renamed from: o3 */
    public final C43587g m59289o3() {
        return (C43587g) this.f48970U.getValue(this, f48969W[0]);
    }

    @Override // com.kubi.sdk.BaseFragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable Bundle savedInstanceState, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(R$layout.search_fragment_topsearch, container, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        final C43587g c43587gM59289o3 = m59289o3();
        if (c43587gM59289o3 == null) {
            return;
        }
        c43587gM59289o3.f96209c.m59165n(LifecycleOwnerKt.getLifecycleScope(this));
        m59290p3().m59302t().observe(getViewLifecycleOwner(), new C24423a(new Function1() { // from class: com.kubi.search.searchinitial.topsearch.a
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TopSearchFragment.m59284q3(this.f48977b, (TopSearchEntityWrap) obj);
            }
        }));
        m59290p3().m59303u().observe(getViewLifecycleOwner(), new C24423a(new Function1() { // from class: com.kubi.search.searchinitial.topsearch.b
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TopSearchFragment.m59285r3(c43587gM59289o3, (WsMarketSnapshotEntity) obj);
            }
        }));
    }

    @NotNull
    /* JADX INFO: renamed from: p3 */
    public final TopSearchVM m59290p3() {
        return (TopSearchVM) this.f48971V.getValue();
    }

    /* JADX INFO: renamed from: t3 */
    public final void m59291t3(@NotNull final TopSearchEntityWrap entityWrap) {
        Intrinsics.checkNotNullParameter(entityWrap, "entityWrap");
        C27100x0.m66923d(new Function0() { // from class: com.kubi.search.searchinitial.topsearch.d
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TopSearchFragment.m59287u3(this.f48980b, entityWrap);
            }
        });
    }

    /* JADX INFO: renamed from: u3 */
    public static final Unit m59287u3(TopSearchFragment topSearchFragment, TopSearchEntityWrap topSearchEntityWrap) {
        FragmentContainerView fragmentContainerView;
        FragmentContainerView fragmentContainerView2;
        SearchRealtimeView searchRealtimeView;
        C43587g c43587gM59289o3 = topSearchFragment.m59289o3();
        if (c43587gM59289o3 != null && (searchRealtimeView = c43587gM59289o3.f96209c) != null) {
            searchRealtimeView.m59167r(topSearchEntityWrap);
        }
        SearchTopicEntity entity = topSearchEntityWrap.getEntity();
        if (entity != null && !topSearchEntityWrap.getSameCoin() && C27041f.m66668h(entity.getTopicUrl()).length() > 0) {
            C43587g c43587gM59289o4 = topSearchFragment.m59289o3();
            if (c43587gM59289o4 != null && (fragmentContainerView2 = c43587gM59289o4.f96208b) != null) {
                C27046k.m66685H(fragmentContainerView2);
            }
            C27032f.m66625p(topSearchFragment, R$id.fTopic, IOperationService.f36504a.get().mo4602d(entity), null, 4, null);
        } else {
            C43587g c43587gM59289o5 = topSearchFragment.m59289o3();
            if (c43587gM59289o5 != null && (fragmentContainerView = c43587gM59289o5.f96208b) != null) {
                ViewExtKt.m66577h(fragmentContainerView);
            }
        }
        return Unit.INSTANCE;
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onHide() {
        super.onHide();
        m59290p3().onHide();
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onShow() throws Throwable {
        super.onShow();
        m59290p3().onShow();
    }
}
