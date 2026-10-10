package com.kubi.kumex.record.currentDelegate;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Observer;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.kubi.data.BeepHelper;
import com.kubi.event.api.C12572a;
import com.kubi.event.api.C12573b;
import com.kubi.kumex.R$id;
import com.kubi.kumex.R$raw;
import com.kubi.kumex.R$string;
import com.kubi.kumex.data.trade.model.OrderEntity;
import com.kubi.kumex.record.currentDelegate.adapter.TodoDelegateAdapter;
import com.kubi.kumex.record.currentDelegate.adapter.TodoDelegateItem;
import com.kubi.kumex.record.currentDelegate.viewModel.FiltersInfo;
import com.kubi.kumex.record.currentDelegate.viewModel.TodoDelegateViewModel;
import com.kubi.kumex.record.currentDelegate.viewModel.TwapDelegateHistViewModel;
import com.kubi.kumex.utils.C17060n0;
import com.kubi.kumex.utils.ViewExKt;
import com.kubi.network.retrofit.utils.C19331c;
import com.kubi.resources.dialog.AlertDialogFragmentHelper;
import com.kubi.resources.widget.C23057g1;
import com.kubi.resources.widget.KuCoinRefreshLayout;
import com.kubi.router.core.Router;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.util.C24252m0;
import com.kubi.utils.C27100x0;
import com.kubi.utils.ToastCompat;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27041f;
import com.tencent.qcloud.tuicore.TUIConstants;
import dm.C36878z1;
import hb0.InterfaceC38162f;
import io.chad.library.adapter.base.BaseQuickAdapter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import jb0.InterfaceC40373g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p026ay.C4400a;
import p565qm.C43773a;
import p569qq.C43852m;
import p852kotlin.Function;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function3;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.FunctionAdapter;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: TwapDelegateHistFragment.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 &2\u00020\u0001:\u0001&B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\u001a\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\b\u0010\u001e\u001a\u00020\u001cH\u0002J\b\u0010\u001f\u001a\u00020\u001cH\u0002J\b\u0010 \u001a\u00020\u001cH\u0002J\b\u0010!\u001a\u00020\u001cH\u0016J\b\u0010\"\u001a\u00020\u001cH\u0016J\b\u0010#\u001a\u00020\u001cH\u0002J\n\u0010$\u001a\u0004\u0018\u00010%H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.¢\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u000e\u0010\u000fR\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006'"}, m90084d2 = {"Lcom/kubi/kumex/record/currentDelegate/TwapDelegateHistFragment;", "Lcom/kubi/sdk/BaseFragment;", "<init>", "()V", "binding", "Lcom/kubi/kumex/databinding/BkumexFragmentDelegateHistTwapBinding;", "todoDelegateVM", "Lcom/kubi/kumex/record/currentDelegate/viewModel/TodoDelegateViewModel;", "getTodoDelegateVM", "()Lcom/kubi/kumex/record/currentDelegate/viewModel/TodoDelegateViewModel;", "todoDelegateVM$delegate", "Lkotlin/Lazy;", "twapDelegateHistVM", "Lcom/kubi/kumex/record/currentDelegate/viewModel/TwapDelegateHistViewModel;", "getTwapDelegateHistVM", "()Lcom/kubi/kumex/record/currentDelegate/viewModel/TwapDelegateHistViewModel;", "twapDelegateHistVM$delegate", "adapter", "Lcom/kubi/kumex/record/currentDelegate/adapter/TodoDelegateAdapter;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "savedInstanceState", "Landroid/os/Bundle;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "initView", "initObservers", "showRevokeSuccessFeedBack", "onAgainShow", "onLoad", "refresh", "filteredSymbol", "", "Companion", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nTwapDelegateHistFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TwapDelegateHistFragment.kt\ncom/kubi/kumex/record/currentDelegate/TwapDelegateHistFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt\n*L\n1#1,251:1\n106#2,15:252\n106#2,15:267\n76#3,7:282\n76#3,7:289\n*S KotlinDebug\n*F\n+ 1 TwapDelegateHistFragment.kt\ncom/kubi/kumex/record/currentDelegate/TwapDelegateHistFragment\n*L\n63#1:252,15\n64#1:267,15\n138#1:282,7\n142#1:289,7\n*E\n"})
public final class TwapDelegateHistFragment extends BaseFragment {

    /* JADX INFO: renamed from: Y */
    @NotNull
    public static final Companion f29982Y = new Companion(null);

    /* JADX INFO: renamed from: U */
    public C36878z1 f29983U;

    /* JADX INFO: renamed from: V */
    @NotNull
    public final Lazy f29984V;

    /* JADX INFO: renamed from: W */
    @NotNull
    public final Lazy f29985W;

    /* JADX INFO: renamed from: X */
    @Nullable
    public TodoDelegateAdapter f29986X;

    /* JADX INFO: compiled from: TwapDelegateHistFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, m90084d2 = {"Lcom/kubi/kumex/record/currentDelegate/TwapDelegateHistFragment$Companion;", "", "<init>", "()V", "EVENT_FLUTTER_TWAP_ORDER_PAUSE_RESTART", "", "EVENT_FLUTTER_TWAP_ORDER_CANCELED", "newInstance", "Lcom/kubi/kumex/record/currentDelegate/TwapDelegateHistFragment;", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final TwapDelegateHistFragment newInstance() {
            TwapDelegateHistFragment twapDelegateHistFragment = new TwapDelegateHistFragment();
            twapDelegateHistFragment.setArguments(new Bundle());
            return twapDelegateHistFragment;
        }
    }

    /* JADX INFO: renamed from: com.kubi.kumex.record.currentDelegate.TwapDelegateHistFragment$a */
    /* JADX INFO: compiled from: TwapDelegateHistFragment.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C16565a implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1 f29987b;

        public C16565a(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f29987b = function;
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
            return this.f29987b;
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f29987b.invoke(obj);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX INFO: renamed from: I3 */
    private final void m35420I3() {
        C12573b c12573b = C12573b.f21598a;
        if (c12573b.m23696a()) {
            "event_flutter_twap_order_pause_restart".length();
        }
        C12572a.m23692a(this, false, new C16566xab9774ce("event_flutter_twap_order_pause_restart", null, this));
        if (c12573b.m23696a()) {
            "event_flutter_twap_order_canceled".length();
        }
        C12572a.m23692a(this, false, new C16567xab9774cf("event_flutter_twap_order_canceled", null, this));
        Transformations.distinctUntilChanged(C24252m0.m58486v(m35460G3().m35577p())).observe(getViewLifecycleOwner(), new C16565a(new Function1() { // from class: com.kubi.kumex.record.currentDelegate.b1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TwapDelegateHistFragment.m35435X3(this.f30018b, (FiltersInfo) obj);
            }
        }));
        m35460G3().m35581t().observe(getViewLifecycleOwner(), new C16565a(new Function1() { // from class: com.kubi.kumex.record.currentDelegate.e1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TwapDelegateHistFragment.m35421J3(this.f30027b, (Boolean) obj);
            }
        }));
        m35461H3().m35602D().observe(getViewLifecycleOwner(), new C16565a(new Function1() { // from class: com.kubi.kumex.record.currentDelegate.f1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TwapDelegateHistFragment.m35423L3(this.f30030b, (List) obj);
            }
        }));
        m35461H3().m35601C().observe(getViewLifecycleOwner(), new C16565a(new Function1() { // from class: com.kubi.kumex.record.currentDelegate.m0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TwapDelegateHistFragment.m35424M3(this.f30047b, (Boolean) obj);
            }
        }));
        m35461H3().m35605G().observe(getViewLifecycleOwner(), new C16565a(new Function1() { // from class: com.kubi.kumex.record.currentDelegate.n0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TwapDelegateHistFragment.m35426O3(this.f30049b, (com.kubi.kumex.trade.order.viewModel.a) obj);
            }
        }));
        m35461H3().m35603E().observe(getViewLifecycleOwner(), new C16565a(new Function1() { // from class: com.kubi.kumex.record.currentDelegate.o0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TwapDelegateHistFragment.m35427P3(this.f30051b, (Boolean) obj);
            }
        }));
        m35461H3().m35608J().observe(getViewLifecycleOwner(), new C16565a(new Function1() { // from class: com.kubi.kumex.record.currentDelegate.p0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TwapDelegateHistFragment.m35428Q3(this.f30053b, (Boolean) obj);
            }
        }));
        m35461H3().m35604F().observe(getViewLifecycleOwner(), new C16565a(new Function1() { // from class: com.kubi.kumex.record.currentDelegate.q0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TwapDelegateHistFragment.m35429R3(this.f30055b, (Boolean) obj);
            }
        }));
        m35461H3().m35607I().observe(getViewLifecycleOwner(), new C16565a(new Function1() { // from class: com.kubi.kumex.record.currentDelegate.r0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TwapDelegateHistFragment.m35430S3(this.f30057b, (Boolean) obj);
            }
        }));
        m35461H3().m35606H().observe(getViewLifecycleOwner(), new C16565a(new Function1() { // from class: com.kubi.kumex.record.currentDelegate.s0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TwapDelegateHistFragment.m35431T3(this.f30059b, (Boolean) obj);
            }
        }));
        m35461H3().m35610L().observe(getViewLifecycleOwner(), new C16565a(new Function1() { // from class: com.kubi.kumex.record.currentDelegate.c1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TwapDelegateHistFragment.m35432U3(this.f30021b, (Boolean) obj);
            }
        }));
        m35461H3().m35609K().observe(getViewLifecycleOwner(), new C16565a(new Function1() { // from class: com.kubi.kumex.record.currentDelegate.d1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TwapDelegateHistFragment.m35434W3(this.f30024b, (Boolean) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: J3 */
    public static final Unit m35421J3(final TwapDelegateHistFragment twapDelegateHistFragment, Boolean bool) {
        AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54167X4(R$string.onekey_cancel_all).m54153J4(R$string.cancel_all_active_delegate).m54159P4(R$string.cancel, null).m54162S4(R$string.confirm, new DialogInterface.OnClickListener() { // from class: com.kubi.kumex.record.currentDelegate.u0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                TwapDelegateHistFragment.m35422K3(this.f30063b, dialogInterface, i11);
            }
        }).m54172c5(twapDelegateHistFragment.getChildFragmentManager());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: L3 */
    public static final Unit m35423L3(TwapDelegateHistFragment twapDelegateHistFragment, List list) {
        TodoDelegateAdapter todoDelegateAdapter = twapDelegateHistFragment.f29986X;
        if (todoDelegateAdapter != null) {
            Intrinsics.checkNotNull(list);
            todoDelegateAdapter.replaceData(CollectionsKt.toMutableList((Collection) list));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: R3 */
    public static final Unit m35429R3(TwapDelegateHistFragment twapDelegateHistFragment, Boolean bool) {
        C36878z1 c36878z1 = twapDelegateHistFragment.f29983U;
        if (c36878z1 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c36878z1 = null;
        }
        KuCoinRefreshLayout kuCoinRefreshLayout = c36878z1.f81405c;
        Intrinsics.checkNotNull(bool);
        kuCoinRefreshLayout.setRefreshing(bool.booleanValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: T3 */
    public static final Unit m35431T3(TwapDelegateHistFragment twapDelegateHistFragment, Boolean bool) {
        TodoDelegateAdapter todoDelegateAdapter = twapDelegateHistFragment.f29986X;
        if (todoDelegateAdapter != null) {
            Intrinsics.checkNotNull(bool);
            todoDelegateAdapter.setEnableLoadMore(bool.booleanValue());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: X3 */
    public static final Unit m35435X3(TwapDelegateHistFragment twapDelegateHistFragment, FiltersInfo filtersInfo) {
        C36878z1 c36878z1 = twapDelegateHistFragment.f29983U;
        if (c36878z1 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c36878z1 = null;
        }
        c36878z1.f81404b.scrollToPosition(0);
        twapDelegateHistFragment.m35414B0();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Y3 */
    public static final Unit m35436Y3(TwapDelegateHistFragment twapDelegateHistFragment, View view, int i11, OrderEntity order) throws JSONException {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(order, "order");
        int id2 = view.getId();
        if (id2 == R$id.twapStartOrPauseTv) {
            twapDelegateHistFragment.m35461H3().m35611M(order.getId(), order.getStatus());
            String strM36552b = C17060n0.m36552b();
            String str = Intrinsics.areEqual(order.getStatus(), "PAUSED") ? "2" : "1";
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("orderType", "twap");
            Unit unit = Unit.INSTANCE;
            C43852m.m96589a(strM36552b, "stopStart", str, jSONObject);
        } else if (id2 == R$id.twapTerminateTv) {
            twapDelegateHistFragment.m35461H3().m35616T(order.getId());
            String strM36552b2 = C17060n0.m36552b();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("orderType", "twap");
            Unit unit2 = Unit.INSTANCE;
            C43852m.m96589a(strM36552b2, "OrderCancel", "1", jSONObject2);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: b4 */
    public static final void m35439b4(TwapDelegateHistFragment twapDelegateHistFragment, InterfaceC38162f it) {
        Intrinsics.checkNotNullParameter(it, "it");
        twapDelegateHistFragment.m35414B0();
    }

    /* JADX INFO: renamed from: c4 */
    public static final Unit m35440c4(TwapDelegateHistFragment twapDelegateHistFragment) {
        C36878z1 c36878z1 = twapDelegateHistFragment.f29983U;
        if (c36878z1 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c36878z1 = null;
        }
        c36878z1.f81404b.scrollToPosition(0);
        twapDelegateHistFragment.m35414B0();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: d4 */
    private final void m35441d4() {
        BeepHelper.m23642f("beep_revoke", R$raw.revoke);
        ToastCompat.m66441G(getStringRes(R$string.cancel_order_ok, new Object[0]), new Object[0]);
    }

    /* JADX INFO: renamed from: G3 */
    public final TodoDelegateViewModel m35460G3() {
        return (TodoDelegateViewModel) this.f29984V.getValue();
    }

    /* JADX INFO: renamed from: H3 */
    public final TwapDelegateHistViewModel m35461H3() {
        return (TwapDelegateHistViewModel) this.f29985W.getValue();
    }

    @Override // com.kubi.sdk.BaseFragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable Bundle savedInstanceState, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        C36878z1 c36878z1M82625c = C36878z1.m82625c(inflater, container, false);
        Intrinsics.checkNotNullExpressionValue(c36878z1M82625c, "inflate(...)");
        this.f29983U = c36878z1M82625c;
        if (c36878z1M82625c == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c36878z1M82625c = null;
        }
        ConstraintLayout root = c36878z1M82625c.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        initView();
        m35420I3();
    }

    public TwapDelegateHistFragment() {
        final Function0 function0 = new Function0() { // from class: com.kubi.kumex.record.currentDelegate.t0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TwapDelegateHistFragment.m35442e4(this.f30061b);
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final Lazy lazy = LazyKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.kubi.kumex.record.currentDelegate.TwapDelegateHistFragment$special$$inlined$viewModels$default$1
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
        this.f29984V = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(TodoDelegateViewModel.class), new Function0<ViewModelStore>() { // from class: com.kubi.kumex.record.currentDelegate.TwapDelegateHistFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m103549viewModels$lambda1(lazy).getMViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.kubi.kumex.record.currentDelegate.TwapDelegateHistFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.kubi.kumex.record.currentDelegate.TwapDelegateHistFragment$special$$inlined$viewModels$default$4
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
        final Function0<Fragment> function2 = new Function0<Fragment>() { // from class: com.kubi.kumex.record.currentDelegate.TwapDelegateHistFragment$special$$inlined$viewModels$default$5
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
        final Lazy lazy2 = LazyKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.kubi.kumex.record.currentDelegate.TwapDelegateHistFragment$special$$inlined$viewModels$default$6
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function2.invoke();
            }

            {
                super(0);
            }
        });
        this.f29985W = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(TwapDelegateHistViewModel.class), new Function0<ViewModelStore>() { // from class: com.kubi.kumex.record.currentDelegate.TwapDelegateHistFragment$special$$inlined$viewModels$default$7
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m103549viewModels$lambda1(lazy2).getMViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.kubi.kumex.record.currentDelegate.TwapDelegateHistFragment$special$$inlined$viewModels$default$8
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function3 = function1;
                if (function3 != null && (creationExtras = (CreationExtras) function3.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM103549viewModels$lambda1 = FragmentViewModelLazyKt.m103549viewModels$lambda1(lazy2);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM103549viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM103549viewModels$lambda1 : null;
                return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.kubi.kumex.record.currentDelegate.TwapDelegateHistFragment$special$$inlined$viewModels$default$9
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                ViewModelStoreOwner viewModelStoreOwnerM103549viewModels$lambda1 = FragmentViewModelLazyKt.m103549viewModels$lambda1(lazy2);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM103549viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM103549viewModels$lambda1 : null;
                if (hasDefaultViewModelProviderFactory != null && (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) != null) {
                    return defaultViewModelProviderFactory;
                }
                ViewModelProvider.Factory defaultViewModelProviderFactory2 = this.getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory2, "defaultViewModelProviderFactory");
                return defaultViewModelProviderFactory2;
            }
        });
    }

    /* JADX INFO: renamed from: B0 */
    private final void m35414B0() {
        showContentView();
        m35461H3().m35600B(m35419F3(), null);
    }

    /* JADX INFO: renamed from: F3 */
    private final String m35419F3() {
        FiltersInfo value = m35460G3().m35577p().getValue();
        if (value != null) {
            return value.getSymbol();
        }
        return null;
    }

    /* JADX INFO: renamed from: K3 */
    public static final void m35422K3(TwapDelegateHistFragment twapDelegateHistFragment, DialogInterface dialogInterface, int i11) {
        twapDelegateHistFragment.m35461H3().m35614R(twapDelegateHistFragment.m35419F3());
    }

    /* JADX INFO: renamed from: M3 */
    public static final Unit m35424M3(final TwapDelegateHistFragment twapDelegateHistFragment, Boolean bool) {
        if (bool.booleanValue()) {
            twapDelegateHistFragment.m35441d4();
            C36878z1 c36878z1 = twapDelegateHistFragment.f29983U;
            C36878z1 c36878z2 = null;
            if (c36878z1 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c36878z1 = null;
            }
            c36878z1.f81404b.scrollToPosition(0);
            C36878z1 c36878z3 = twapDelegateHistFragment.f29983U;
            if (c36878z3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                c36878z2 = c36878z3;
            }
            c36878z2.f81404b.postDelayed(new Runnable() { // from class: com.kubi.kumex.record.currentDelegate.v0
                @Override // java.lang.Runnable
                public final void run() {
                    TwapDelegateHistFragment.m35425N3(this.f30065b);
                }
            }, 500L);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: N3 */
    public static final void m35425N3(TwapDelegateHistFragment twapDelegateHistFragment) {
        twapDelegateHistFragment.m35414B0();
    }

    /* JADX INFO: renamed from: O3 */
    public static final Unit m35426O3(TwapDelegateHistFragment twapDelegateHistFragment, com.kubi.kumex.trade.order.viewModel.a aVar) {
        if (aVar.a()) {
            BeepHelper.m23642f("beep_revoke", R$raw.revoke);
            ToastCompat.m66441G(twapDelegateHistFragment.getStringRes(R$string.cancel_order_ok, new Object[0]), new Object[0]);
        } else {
            Throwable thC = aVar.c();
            if (thC != null) {
                C19331c.m42836c(thC, null, 2, null);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: P3 */
    public static final Unit m35427P3(TwapDelegateHistFragment twapDelegateHistFragment, Boolean bool) {
        if (bool.booleanValue()) {
            twapDelegateHistFragment.showLoadingDialog();
        } else {
            BaseFragment.hideLoadingDialog$default(twapDelegateHistFragment, false, 1, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Q3 */
    public static final Unit m35428Q3(TwapDelegateHistFragment twapDelegateHistFragment, Boolean bool) {
        TodoDelegateAdapter todoDelegateAdapter;
        if (!bool.booleanValue() && (todoDelegateAdapter = twapDelegateHistFragment.f29986X) != null) {
            todoDelegateAdapter.loadMoreComplete();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: S3 */
    public static final Unit m35430S3(TwapDelegateHistFragment twapDelegateHistFragment, Boolean bool) {
        TodoDelegateAdapter todoDelegateAdapter;
        if (bool.booleanValue() && (todoDelegateAdapter = twapDelegateHistFragment.f29986X) != null) {
            todoDelegateAdapter.loadMoreFail();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: U3 */
    public static final Unit m35432U3(final TwapDelegateHistFragment twapDelegateHistFragment, Boolean bool) {
        if (bool.booleanValue()) {
            TodoDelegateAdapter todoDelegateAdapter = twapDelegateHistFragment.f29986X;
            if (todoDelegateAdapter != null) {
                todoDelegateAdapter.replaceData(new ArrayList());
            }
            BaseFragment.showFailView$default(twapDelegateHistFragment, 0, 0, new View.OnClickListener() { // from class: com.kubi.kumex.record.currentDelegate.x0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    TwapDelegateHistFragment.m35433V3(this.f30158b, view);
                }
            }, 3, (Object) null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: V3 */
    public static final void m35433V3(TwapDelegateHistFragment twapDelegateHistFragment, View view) {
        twapDelegateHistFragment.m35414B0();
    }

    /* JADX INFO: renamed from: W3 */
    public static final Unit m35434W3(TwapDelegateHistFragment twapDelegateHistFragment, Boolean bool) {
        TodoDelegateViewModel todoDelegateViewModelM35460G3 = twapDelegateHistFragment.m35460G3();
        Intrinsics.checkNotNull(bool);
        todoDelegateViewModelM35460G3.m35575D(bool.booleanValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Z3 */
    public static final void m35437Z3(BaseQuickAdapter baseQuickAdapter, View view, int i11) {
        TodoDelegateItem.TwapOrderInfo twapOrderInfo;
        OrderEntity orderEntity;
        Object item = baseQuickAdapter.getItem(i11);
        String id2 = null;
        if (item instanceof TodoDelegateItem.TwapOrderInfo) {
            twapOrderInfo = (TodoDelegateItem.TwapOrderInfo) item;
        } else {
            twapOrderInfo = null;
        }
        C4400a c4400aM56184f = Router.f46192a.m56184f("futures/history/delegation/twapDetails");
        if (twapOrderInfo != null && (orderEntity = twapOrderInfo.getOrderEntity()) != null) {
            id2 = orderEntity.getId();
        }
        c4400aM56184f.m4038a("orderId", C27041f.m66668h(id2)).m4048k();
    }

    /* JADX INFO: renamed from: a4 */
    public static final void m35438a4(TwapDelegateHistFragment twapDelegateHistFragment) {
        twapDelegateHistFragment.m35461H3().m35599A(twapDelegateHistFragment.m35419F3());
    }

    /* JADX INFO: renamed from: e4 */
    public static final ViewModelStoreOwner m35442e4(TwapDelegateHistFragment twapDelegateHistFragment) {
        Fragment parentFragment = twapDelegateHistFragment.getParentFragment();
        if (parentFragment != null) {
            return parentFragment;
        }
        return twapDelegateHistFragment;
    }

    private final void initView() {
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        C36878z1 c36878z1 = this.f29983U;
        C36878z1 c36878z2 = null;
        if (c36878z1 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c36878z1 = null;
        }
        c36878z1.f81404b.setLayoutManager(new LinearLayoutManager(activity, 1, false));
        C36878z1 c36878z3 = this.f29983U;
        if (c36878z3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c36878z3 = null;
        }
        RecyclerView list = c36878z3.f81404b;
        Intrinsics.checkNotNullExpressionValue(list, "list");
        ViewExKt.m36476b(list);
        C36878z1 c36878z4 = this.f29983U;
        if (c36878z4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c36878z4 = null;
        }
        c36878z4.f81404b.addItemDecoration(new C43773a(0, 0, (int) C27025c.m66565c(activity, 16), (int) C27025c.m66565c(activity, 16), 3, null));
        TodoDelegateAdapter todoDelegateAdapter = new TodoDelegateAdapter(new ArrayList(), false, null, null, null, new Function3() { // from class: com.kubi.kumex.record.currentDelegate.l0
            @Override // p852kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return TwapDelegateHistFragment.m35436Y3(this.f30045b, (View) obj, ((Integer) obj2).intValue(), (OrderEntity) obj3);
            }
        }, null, 92, null);
        this.f29986X = todoDelegateAdapter;
        todoDelegateAdapter.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() { // from class: com.kubi.kumex.record.currentDelegate.w0
            @Override // io.chad.library.adapter.base.BaseQuickAdapter.OnItemClickListener
            public final void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i11) {
                TwapDelegateHistFragment.m35437Z3(baseQuickAdapter, view, i11);
            }
        });
        TodoDelegateAdapter todoDelegateAdapter2 = this.f29986X;
        if (todoDelegateAdapter2 != null) {
            C36878z1 c36878z5 = this.f29983U;
            if (c36878z5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c36878z5 = null;
            }
            todoDelegateAdapter2.bindToRecyclerView(c36878z5.f81404b);
        }
        TodoDelegateAdapter todoDelegateAdapter3 = this.f29986X;
        if (todoDelegateAdapter3 != null) {
            todoDelegateAdapter3.setLoadMoreView(new C23057g1());
        }
        TodoDelegateAdapter todoDelegateAdapter4 = this.f29986X;
        if (todoDelegateAdapter4 != null) {
            BaseQuickAdapter.RequestLoadMoreListener requestLoadMoreListener = new BaseQuickAdapter.RequestLoadMoreListener() { // from class: com.kubi.kumex.record.currentDelegate.y0
                @Override // io.chad.library.adapter.base.BaseQuickAdapter.RequestLoadMoreListener
                public final void onLoadMoreRequested() {
                    TwapDelegateHistFragment.m35438a4(this.f30160a);
                }
            };
            C36878z1 c36878z6 = this.f29983U;
            if (c36878z6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c36878z6 = null;
            }
            todoDelegateAdapter4.setOnLoadMoreListener(requestLoadMoreListener, c36878z6.f81404b);
        }
        C36878z1 c36878z7 = this.f29983U;
        if (c36878z7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            c36878z2 = c36878z7;
        }
        c36878z2.f81405c.setOnRefreshListener(new InterfaceC40373g() { // from class: com.kubi.kumex.record.currentDelegate.z0
            @Override // jb0.InterfaceC40373g
            /* JADX INFO: renamed from: a */
            public final void mo15329a(InterfaceC38162f interfaceC38162f) {
                TwapDelegateHistFragment.m35439b4(this.f30162b, interfaceC38162f);
            }
        });
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onAgainShow() {
        super.onAgainShow();
        C27100x0.m66924e(new Function0() { // from class: com.kubi.kumex.record.currentDelegate.a1
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TwapDelegateHistFragment.m35440c4(this.f29990b);
            }
        });
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onLoad() {
        super.onLoad();
        m35414B0();
    }
}
