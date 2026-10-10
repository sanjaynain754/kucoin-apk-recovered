package com.kubi.kumex.market.p091v2;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.blankj.utilcode.util.C5267e0;
import com.blankj.utilcode.util.C5275i0;
import com.kubi.broker.RepositoryServiceLocator;
import com.kubi.futures.FuturesDisplayNameUtils;
import com.kubi.futures.trade.submit.panel.premarket.g;
import com.kubi.kucoin.api.IKuFacadeService;
import com.kubi.kumex.R$layout;
import com.kubi.kumex.R$string;
import com.kubi.kumex.data.market.model.RecentDealEntity;
import com.kubi.kumex.market.CommonDealObjectProxy;
import com.kubi.kumex.market.RecentHeadObjectProxy;
import com.kubi.kumex.utils.ViewExKt;
import com.kubi.network.retrofit.utils.C19331c;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.BaseAdapter;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.C24346y;
import com.kubi.sdk.util.LoadingViewUtils;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.core.C27029c;
import dm.C36826q2;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.DisposableKt;
import java.util.ArrayList;
import java.util.List;
import o00.C42916f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p801yl.C46527h0;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import th.InterfaceC44980d;
import w00.C45681e;

/* JADX INFO: compiled from: KuMexRecentFragmentV2.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 '2\u00020\u0001:\u0001'B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u0010\u001f\u001a\u00020\u001eH\u0016J\b\u0010 \u001a\u00020\u001eH\u0002J\b\u0010!\u001a\u00020\u001eH\u0002J\u0018\u0010\"\u001a\b\u0012\u0004\u0012\u00020$0#*\b\u0012\u0004\u0012\u00020&0%H\u0002R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0012\u0010\u0013¨\u0006("}, m90084d2 = {"Lcom/kubi/kumex/market/v2/KuMexRecentFragmentV2;", "Lcom/kubi/sdk/BaseFragment;", "<init>", "()V", "bkumexFragmentListBinding", "Lcom/kubi/kumex/databinding/BkumexFragmentListBinding;", "getBkumexFragmentListBinding", "()Lcom/kubi/kumex/databinding/BkumexFragmentListBinding;", "bkumexFragmentListBinding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "contentHeight", "", "getContentHeight", "()I", "contentHeight$delegate", "Lkotlin/Lazy;", "symbol", "", "getSymbol", "()Ljava/lang/String;", "symbol$delegate", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "savedInstanceState", "Landroid/os/Bundle;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onLoad", "", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, "initListener", "subscribe", "toDisplayList", "", "", "", "Lcom/kubi/kumex/data/market/model/RecentDealEntity;", "Companion", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nKuMexRecentFragmentV2.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KuMexRecentFragmentV2.kt\ncom/kubi/kumex/market/v2/KuMexRecentFragmentV2\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,152:1\n147#2,16:153\n1#3:169\n*S KotlinDebug\n*F\n+ 1 KuMexRecentFragmentV2.kt\ncom/kubi/kumex/market/v2/KuMexRecentFragmentV2\n*L\n53#1:153,16\n*E\n"})
public final class KuMexRecentFragmentV2 extends BaseFragment {

    /* JADX INFO: renamed from: U */
    @NotNull
    public final InterfaceC24293a f29669U = C45681e.m100799e(this, new Function1<KuMexRecentFragmentV2, C36826q2>() { // from class: com.kubi.kumex.market.v2.KuMexRecentFragmentV2$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C36826q2 invoke(@NotNull KuMexRecentFragmentV2 fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C36826q2.m82514a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C36826q2, Unit>() { // from class: com.kubi.kumex.market.v2.KuMexRecentFragmentV2$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C36826q2 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C36826q2 c36826q2) {
            invoke(c36826q2);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: V */
    @NotNull
    public final Lazy f29670V = LazyKt.lazy(new Function0() { // from class: com.kubi.kumex.market.v2.t1
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Integer.valueOf(KuMexRecentFragmentV2.m34899s3(this.f29846b));
        }
    });

    /* JADX INFO: renamed from: W */
    @NotNull
    public final Lazy f29671W = LazyKt.lazy(new Function0() { // from class: com.kubi.kumex.market.v2.u1
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return KuMexRecentFragmentV2.m34888F3(this.f29849b);
        }
    });

    /* JADX INFO: renamed from: Y */
    public static final /* synthetic */ KProperty<Object>[] f29668Y = {Reflection.property1(new PropertyReference1Impl(KuMexRecentFragmentV2.class, "bkumexFragmentListBinding", "getBkumexFragmentListBinding()Lcom/kubi/kumex/databinding/BkumexFragmentListBinding;", 0))};

    /* JADX INFO: renamed from: X */
    @NotNull
    public static final Companion f29667X = new Companion(null);

    /* JADX INFO: compiled from: KuMexRecentFragmentV2.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/kumex/market/v2/KuMexRecentFragmentV2$Companion;", "", "<init>", "()V", "instance", "Lcom/kubi/kumex/market/v2/KuMexRecentFragmentV2;", "symbol", "", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final KuMexRecentFragmentV2 instance(@NotNull String symbol) {
            Intrinsics.checkNotNullParameter(symbol, "symbol");
            KuMexRecentFragmentV2 kuMexRecentFragmentV2 = new KuMexRecentFragmentV2();
            Bundle bundle = new Bundle();
            bundle.putString("symbol", symbol);
            kuMexRecentFragmentV2.setArguments(bundle);
            return kuMexRecentFragmentV2;
        }
    }

    /* JADX INFO: renamed from: G3 */
    private final List<Object> m34889G3(List<RecentDealEntity> list) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(FuturesDisplayNameUtils.f22525a.m24439d(InterfaceC44980d.m99529O(RepositoryServiceLocator.f19236a.m20288g(), m34901v3(), false, 2, null)));
        for (RecentDealEntity recentDealEntity : list) {
            recentDealEntity.setCurrentSymbol(m34901v3());
            arrayList.add(recentDealEntity);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: u3 */
    private final int m34900u3() {
        return ((Number) this.f29670V.getValue()).intValue();
    }

    /* JADX INFO: renamed from: v3 */
    private final String m34901v3() {
        return (String) this.f29671W.getValue();
    }

    /* JADX INFO: renamed from: x3 */
    private final void m34903x3() {
        g gVar = g.a;
        RepositoryServiceLocator repositoryServiceLocator = RepositoryServiceLocator.f19236a;
        if (gVar.o(InterfaceC44980d.m99529O(repositoryServiceLocator.m20288g(), m34901v3(), false, 2, null))) {
            BaseFragment.showEmptyView$default(this, R$string.asserts_no_record, 0, (View.OnClickListener) null, 6, (Object) null);
            return;
        }
        Context context = getContext();
        if (context == null) {
            return;
        }
        Observable<List<RecentDealEntity>> observableObserveOn = repositoryServiceLocator.m20286e().mo24808h(m34901v3(), (int) (((m34900u3() - C27025c.m66565c(context, 35)) - C27025c.m66565c(context, 67)) / C27025c.m66564b(context, 25.0f))).subscribeOn(C42916f.m94127f()).observeOn(C42916f.m94128g());
        final Function1 function1 = new Function1() { // from class: com.kubi.kumex.market.v2.v1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return KuMexRecentFragmentV2.m34884B3(this.f29853b, (Disposable) obj);
            }
        };
        Observable<List<RecentDealEntity>> observableDoOnSubscribe = observableObserveOn.doOnSubscribe(new Consumer() { // from class: com.kubi.kumex.market.v2.w1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                KuMexRecentFragmentV2.m34885C3(function1, obj);
            }
        });
        final Function1 function2 = new Function1() { // from class: com.kubi.kumex.market.v2.x1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return KuMexRecentFragmentV2.m34886D3(this.f29870b, (List) obj);
            }
        };
        Consumer<? super List<RecentDealEntity>> consumer = new Consumer() { // from class: com.kubi.kumex.market.v2.y1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                KuMexRecentFragmentV2.m34887E3(function2, obj);
            }
        };
        final Function1 function3 = new Function1() { // from class: com.kubi.kumex.market.v2.z1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return KuMexRecentFragmentV2.m34904y3(this.f29876b, (Throwable) obj);
            }
        };
        Disposable disposableSubscribe = observableDoOnSubscribe.subscribe(consumer, new Consumer() { // from class: com.kubi.kumex.market.v2.a2
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                KuMexRecentFragmentV2.m34883A3(function3, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe, getVisibleDisposable());
    }

    /* JADX INFO: renamed from: y3 */
    public static final Unit m34904y3(final KuMexRecentFragmentV2 kuMexRecentFragmentV2, Throwable th2) {
        BaseFragment.showFailView$default(kuMexRecentFragmentV2, 0, 0, new View.OnClickListener() { // from class: com.kubi.kumex.market.v2.b2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                KuMexRecentFragmentV2.m34905z3(this.f29699b, view);
            }
        }, 3, (Object) null);
        Intrinsics.checkNotNull(th2);
        C19331c.m42836c(th2, null, 2, null);
        return Unit.INSTANCE;
    }

    @Override // com.kubi.sdk.BaseFragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable Bundle savedInstanceState, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(R$layout.bkumex_fragment_list, (ViewGroup) null);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    /* JADX INFO: renamed from: t3 */
    public final C36826q2 m34906t3() {
        return (C36826q2) this.f29669U.getValue(this, f29668Y[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A3 */
    public static final void m34883A3(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: B3 */
    public static final Unit m34884B3(KuMexRecentFragmentV2 kuMexRecentFragmentV2, Disposable disposable) {
        RecyclerView recyclerView;
        C36826q2 c36826q2M34906t3 = kuMexRecentFragmentV2.m34906t3();
        if (c36826q2M34906t3 != null && (recyclerView = c36826q2M34906t3.f80903c) != null && C24346y.m59051a(recyclerView)) {
            BaseFragment.showLoadingView$default(kuMexRecentFragmentV2, 0, 0, 3, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: C3 */
    public static final void m34885C3(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: D3 */
    public static final Unit m34886D3(KuMexRecentFragmentV2 kuMexRecentFragmentV2, List list) {
        RecyclerView recyclerView;
        kuMexRecentFragmentV2.showContentView();
        C36826q2 c36826q2M34906t3 = kuMexRecentFragmentV2.m34906t3();
        if (c36826q2M34906t3 != null && (recyclerView = c36826q2M34906t3.f80903c) != null) {
            Intrinsics.checkNotNull(list);
            C24346y.m59052b(recyclerView, kuMexRecentFragmentV2.m34889G3(list));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: E3 */
    public static final void m34887E3(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: F3 */
    public static final String m34888F3(KuMexRecentFragmentV2 kuMexRecentFragmentV2) {
        String strM56284y;
        Bundle arguments = kuMexRecentFragmentV2.getArguments();
        if (arguments != null && (strM56284y = RouteExKt.m56284y(arguments, "symbol")) != null) {
            return strM56284y;
        }
        return C46527h0.f104291a.m102677L();
    }

    /* JADX INFO: renamed from: s3 */
    public static final int m34899s3(KuMexRecentFragmentV2 kuMexRecentFragmentV2) {
        int iM66602e;
        Context context = kuMexRecentFragmentV2.getContext();
        if (context != null) {
            iM66602e = (int) C27025c.m66564b(context, 172.0f);
        } else {
            iM66602e = C27029c.m66602e(kuMexRecentFragmentV2, 172.0f);
        }
        return (C5267e0.m6182d() - IKuFacadeService.f27711a.get().mo31927f()) - iM66602e;
    }

    /* JADX INFO: renamed from: w3 */
    private final void m34902w3() {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        RecyclerView recyclerView3;
        RecyclerView recyclerView4;
        C36826q2 c36826q2M34906t3 = m34906t3();
        if (c36826q2M34906t3 != null && (recyclerView4 = c36826q2M34906t3.f80903c) != null) {
            recyclerView4.setAdapter(BaseAdapter.a.m57323c(BaseAdapter.a.m57323c(new BaseAdapter.a(), String.class, RecentHeadObjectProxy.class, null, null, 12, null), RecentDealEntity.class, CommonDealObjectProxy.class, null, null, 12, null).m57324a());
        }
        C36826q2 c36826q2M34906t4 = m34906t3();
        if (c36826q2M34906t4 != null && (recyclerView3 = c36826q2M34906t4.f80903c) != null) {
            ViewExKt.m36476b(recyclerView3);
        }
        C36826q2 c36826q2M34906t5 = m34906t3();
        if (c36826q2M34906t5 != null && (recyclerView2 = c36826q2M34906t5.f80903c) != null) {
            recyclerView2.setPadding(C5275i0.m6241f(12.0f), 0, C5275i0.m6241f(12.0f), 0);
        }
        C36826q2 c36826q2M34906t6 = m34906t3();
        if (c36826q2M34906t6 != null && (recyclerView = c36826q2M34906t6.f80903c) != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(getActivity(), 1, false));
        }
    }

    /* JADX INFO: renamed from: z3 */
    public static final void m34905z3(KuMexRecentFragmentV2 kuMexRecentFragmentV2, View view) {
        kuMexRecentFragmentV2.getVisibleDisposable().clear();
        kuMexRecentFragmentV2.m34903x3();
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onLoad() {
        super.onLoad();
        LoadingViewUtils.f48255a.m58509b(this);
        m34902w3();
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onShow() {
        super.onShow();
        m34903x3();
    }
}
