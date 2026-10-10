package com.kubi.kumex.record.currentDelegate;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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
import com.kubi.futures.history.filter.OrderAssetType;
import com.kubi.kumex.R$layout;
import com.kubi.kumex.R$raw;
import com.kubi.kumex.R$string;
import com.kubi.kumex.data.trade.model.OrderEntity;
import com.kubi.kumex.record.currentDelegate.adapter.TodoDelegateAdapter;
import com.kubi.kumex.record.currentDelegate.adapter.TodoDelegateItem;
import com.kubi.kumex.record.currentDelegate.viewModel.DelegateHistoryViewModel;
import com.kubi.kumex.record.currentDelegate.viewModel.FiltersInfo;
import com.kubi.kumex.record.currentDelegate.viewModel.TodoDelegateViewModel;
import com.kubi.kumex.utils.ViewExKt;
import com.kubi.resources.widget.C23057g1;
import com.kubi.resources.widget.KuCoinRefreshLayout;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.PageEntity;
import com.kubi.sdk.util.C24252m0;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.C27100x0;
import com.kubi.utils.ToastCompat;
import com.kubi.utils.extensions.C27025c;
import com.tencent.qcloud.tuicore.TUIConstants;
import dm.C36837s1;
import hb0.InterfaceC38162f;
import io.chad.library.adapter.base.BaseQuickAdapter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import jb0.InterfaceC40373g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import p203di.C36695c;
import p565qm.C43773a;
import p569qq.C43852m;
import p852kotlin.Function;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function3;
import p852kotlin.jvm.internal.FunctionAdapter;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import w00.C45681e;

/* JADX INFO: compiled from: AbsActiveDelegateHistFragment.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\u001a\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J$\u0010$\u001a\u00020\"2\u0006\u0010%\u001a\u00020&2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010&2\u0006\u0010(\u001a\u00020\u0018H&J\u001c\u0010)\u001a\u00020\"2\u0006\u0010%\u001a\u00020&2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010&H&J0\u0010*\u001a\n\u0012\u0004\u0012\u00020,\u0018\u00010+2\u0006\u0010-\u001a\u00020\u00182\u0006\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010&H¦@¢\u0006\u0002\u0010.J\u0010\u0010/\u001a\u00020\"2\u0006\u00100\u001a\u000201H&J\b\u00102\u001a\u00020\"H\u0002J\b\u00103\u001a\u00020\"H\u0002J\b\u00104\u001a\u00020\"H\u0016J\b\u00105\u001a\u00020\"H\u0016J\b\u00106\u001a\u00020\"H\u0002J\b\u00107\u001a\u00020\"H\u0002J\b\u00108\u001a\u00020\"H\u0002J\b\u00109\u001a\u00020&H\u0004J\n\u0010:\u001a\u0004\u0018\u00010&H\u0004R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0010\u001a\u00020\u00118DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0012\u0010\u0013R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006;"}, m90084d2 = {"Lcom/kubi/kumex/record/currentDelegate/AbsActiveDelegateHistFragment;", "Lcom/kubi/sdk/BaseFragment;", "<init>", "()V", "binding", "Lcom/kubi/kumex/databinding/BkumexFragmentAdvancedDelegateBinding;", "getBinding", "()Lcom/kubi/kumex/databinding/BkumexFragmentAdvancedDelegateBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "todoDelegateViewModel", "Lcom/kubi/kumex/record/currentDelegate/viewModel/TodoDelegateViewModel;", "getTodoDelegateViewModel", "()Lcom/kubi/kumex/record/currentDelegate/viewModel/TodoDelegateViewModel;", "todoDelegateViewModel$delegate", "Lkotlin/Lazy;", "delegateHistoryViewModel", "Lcom/kubi/kumex/record/currentDelegate/viewModel/DelegateHistoryViewModel;", "getDelegateHistoryViewModel", "()Lcom/kubi/kumex/record/currentDelegate/viewModel/DelegateHistoryViewModel;", "delegateHistoryViewModel$delegate", "adapter", "Lcom/kubi/kumex/record/currentDelegate/adapter/TodoDelegateAdapter;", "curPage", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "savedInstanceState", "Landroid/os/Bundle;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "fetchOrders", "assetType", "", "symbol", "currentPage", "fetchOppositeAssetTypeOrdersNum", "lastPageOrdersFetcher", "Lcom/kubi/sdk/PageEntity;", "Lcom/kubi/kumex/data/trade/model/OrderEntity;", "curLastPage", "(JLjava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onOrderEmpty", "isOrdersEmpty", "", "initRecycleList", "initListeners", "onAgainShow", "onLoad", "refresh", "initObservers", "showRevokeSuccessFeedBack", "filteredFundsType", "filteredSymbol", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAbsActiveDelegateHistFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbsActiveDelegateHistFragment.kt\ncom/kubi/kumex/record/currentDelegate/AbsActiveDelegateHistFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,259:1\n147#2,16:260\n106#3,15:276\n106#3,15:291\n*S KotlinDebug\n*F\n+ 1 AbsActiveDelegateHistFragment.kt\ncom/kubi/kumex/record/currentDelegate/AbsActiveDelegateHistFragment\n*L\n37#1:260,16\n43#1:276,15\n44#1:291,15\n*E\n"})
public abstract class AbsActiveDelegateHistFragment extends BaseFragment {

    /* JADX INFO: renamed from: Z */
    public static final /* synthetic */ KProperty<Object>[] f29961Z = {Reflection.property1(new PropertyReference1Impl(AbsActiveDelegateHistFragment.class, "binding", "getBinding()Lcom/kubi/kumex/databinding/BkumexFragmentAdvancedDelegateBinding;", 0))};

    /* JADX INFO: renamed from: U */
    @NotNull
    public final InterfaceC24293a f29962U = C45681e.m100799e(this, new Function1<AbsActiveDelegateHistFragment, C36837s1>() { // from class: com.kubi.kumex.record.currentDelegate.AbsActiveDelegateHistFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C36837s1 invoke(@NotNull AbsActiveDelegateHistFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C36837s1.m82538a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C36837s1, Unit>() { // from class: com.kubi.kumex.record.currentDelegate.AbsActiveDelegateHistFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C36837s1 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C36837s1 c36837s1) {
            invoke(c36837s1);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: V */
    @NotNull
    public final Lazy f29963V;

    /* JADX INFO: renamed from: W */
    @NotNull
    public final Lazy f29964W;

    /* JADX INFO: renamed from: X */
    @Nullable
    public TodoDelegateAdapter f29965X;

    /* JADX INFO: renamed from: Y */
    public long f29966Y;

    /* JADX INFO: renamed from: com.kubi.kumex.record.currentDelegate.AbsActiveDelegateHistFragment$a */
    /* JADX INFO: compiled from: AbsActiveDelegateHistFragment.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C16549a implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1 f29967b;

        public C16549a(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f29967b = function;
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
            return this.f29967b;
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f29967b.invoke(obj);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX INFO: renamed from: X3 */
    public static final void m35330X3(AbsActiveDelegateHistFragment absActiveDelegateHistFragment, View view) {
        BaseFragment.showLoadingView$default(absActiveDelegateHistFragment, 0, 0, 3, null);
        absActiveDelegateHistFragment.m35314B0();
    }

    /* JADX INFO: renamed from: Z3 */
    public static final Unit m35332Z3(AbsActiveDelegateHistFragment absActiveDelegateHistFragment, FiltersInfo filtersInfo) {
        RecyclerView recyclerView;
        BaseFragment.showLoadingView$default(absActiveDelegateHistFragment, 0, 0, 3, null);
        C36837s1 c36837s1M35360H3 = absActiveDelegateHistFragment.m35360H3();
        if (c36837s1M35360H3 != null && (recyclerView = c36837s1M35360H3.f81033b) != null) {
            recyclerView.scrollToPosition(0);
        }
        absActiveDelegateHistFragment.m35314B0();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: D3 */
    public abstract void mo35356D3(@NotNull String str, @Nullable String str2);

    /* JADX INFO: renamed from: E3 */
    public abstract void mo35357E3(@NotNull String str, @Nullable String str2, long j11);

    @Nullable
    /* JADX INFO: renamed from: f4 */
    public abstract Object mo35364f4(long j11, @NotNull String str, @Nullable String str2, @NotNull Continuation<? super PageEntity<OrderEntity>> continuation);

    /* JADX INFO: renamed from: h4 */
    public abstract void mo35365h4(boolean z11);

    /* JADX INFO: renamed from: B0 */
    private final void m35314B0() {
        this.f29966Y = 1L;
        mo35357E3(m35358F3(), m35359G3(), this.f29966Y);
        mo35356D3(C36695c.m82166a(m35358F3()), m35359G3());
    }

    /* JADX INFO: renamed from: L3 */
    public static final void m35318L3(AbsActiveDelegateHistFragment absActiveDelegateHistFragment, InterfaceC38162f it) {
        Intrinsics.checkNotNullParameter(it, "it");
        absActiveDelegateHistFragment.m35314B0();
    }

    /* JADX INFO: renamed from: V3 */
    public static final Unit m35328V3(AbsActiveDelegateHistFragment absActiveDelegateHistFragment, Boolean bool) {
        TodoDelegateAdapter todoDelegateAdapter = absActiveDelegateHistFragment.f29965X;
        if (todoDelegateAdapter != null) {
            Intrinsics.checkNotNull(bool);
            todoDelegateAdapter.setEnableLoadMore(bool.booleanValue());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a4 */
    public static final Unit m35333a4(AbsActiveDelegateHistFragment absActiveDelegateHistFragment, List list) {
        TodoDelegateAdapter todoDelegateAdapter = absActiveDelegateHistFragment.f29965X;
        if (todoDelegateAdapter != null) {
            Intrinsics.checkNotNull(list);
            todoDelegateAdapter.replaceData(CollectionsKt.toMutableList((Collection) list));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: c4 */
    public static final Unit m35334c4(AbsActiveDelegateHistFragment absActiveDelegateHistFragment, View view, int i11, OrderEntity orderEntity) throws JSONException {
        Intrinsics.checkNotNullParameter(view, "<unused var>");
        Intrinsics.checkNotNullParameter(orderEntity, "orderEntity");
        absActiveDelegateHistFragment.m35361I3().m35559d0(absActiveDelegateHistFragment.f29966Y, absActiveDelegateHistFragment.m35358F3(), absActiveDelegateHistFragment.m35359G3(), orderEntity, new AbsActiveDelegateHistFragment$initRecycleList$1$1(absActiveDelegateHistFragment, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: d4 */
    public static final Unit m35335d4(AbsActiveDelegateHistFragment absActiveDelegateHistFragment, TodoDelegateItem.OrderHistoryNumTipsInfo orderNumTipsInfo) {
        Intrinsics.checkNotNullParameter(orderNumTipsInfo, "orderNumTipsInfo");
        absActiveDelegateHistFragment.m35362J3().m35574C(C36695c.m82166a(absActiveDelegateHistFragment.m35358F3()));
        if (Intrinsics.areEqual(orderNumTipsInfo.getAssetType(), OrderAssetType.SelfFunds.getTypeName())) {
            C43852m.m96591c("B6FuturesTradeOrder", "ViewUserFundOrder", "1", null, 8, null);
        } else {
            C43852m.m96591c("B6FuturesTradeOrder", "ViewTrailFundOrder", "1", null, 8, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: H3 */
    public final C36837s1 m35360H3() {
        return (C36837s1) this.f29962U.getValue(this, f29961Z[0]);
    }

    @NotNull
    /* JADX INFO: renamed from: I3 */
    public final DelegateHistoryViewModel m35361I3() {
        return (DelegateHistoryViewModel) this.f29964W.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: J3 */
    public final TodoDelegateViewModel m35362J3() {
        return (TodoDelegateViewModel) this.f29963V.getValue();
    }

    /* JADX INFO: renamed from: i4 */
    public final void m35366i4() {
        BeepHelper.m23642f("beep_revoke", R$raw.revoke);
        ToastCompat.m66441G(getStringRes(R$string.cancel_order_ok, new Object[0]), new Object[0]);
    }

    @Override // com.kubi.sdk.BaseFragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable Bundle savedInstanceState, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(R$layout.bkumex_fragment_advanced_delegate, container, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        BaseFragment.showLoadingView$default(this, 0, 0, 3, null);
        m35363b4();
        m35317K3();
        m35319M3();
    }

    public AbsActiveDelegateHistFragment() {
        final Function0 function0 = new Function0() { // from class: com.kubi.kumex.record.currentDelegate.a
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AbsActiveDelegateHistFragment.m35339j4(this.f29988b);
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final Lazy lazy = LazyKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.kubi.kumex.record.currentDelegate.AbsActiveDelegateHistFragment$special$$inlined$viewModels$default$1
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
        this.f29963V = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(TodoDelegateViewModel.class), new Function0<ViewModelStore>() { // from class: com.kubi.kumex.record.currentDelegate.AbsActiveDelegateHistFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m103549viewModels$lambda1(lazy).getMViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.kubi.kumex.record.currentDelegate.AbsActiveDelegateHistFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.kubi.kumex.record.currentDelegate.AbsActiveDelegateHistFragment$special$$inlined$viewModels$default$4
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
        final Function0<Fragment> function2 = new Function0<Fragment>() { // from class: com.kubi.kumex.record.currentDelegate.AbsActiveDelegateHistFragment$special$$inlined$viewModels$default$5
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
        final Lazy lazy2 = LazyKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.kubi.kumex.record.currentDelegate.AbsActiveDelegateHistFragment$special$$inlined$viewModels$default$6
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
        this.f29964W = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(DelegateHistoryViewModel.class), new Function0<ViewModelStore>() { // from class: com.kubi.kumex.record.currentDelegate.AbsActiveDelegateHistFragment$special$$inlined$viewModels$default$7
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m103549viewModels$lambda1(lazy2).getMViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.kubi.kumex.record.currentDelegate.AbsActiveDelegateHistFragment$special$$inlined$viewModels$default$8
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.kubi.kumex.record.currentDelegate.AbsActiveDelegateHistFragment$special$$inlined$viewModels$default$9
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
        this.f29966Y = 1L;
    }

    /* JADX INFO: renamed from: K3 */
    private final void m35317K3() {
        C36837s1 c36837s1M35360H3 = m35360H3();
        if (c36837s1M35360H3 == null) {
            return;
        }
        c36837s1M35360H3.f81034c.setOnRefreshListener(new InterfaceC40373g() { // from class: com.kubi.kumex.record.currentDelegate.f
            @Override // jb0.InterfaceC40373g
            /* JADX INFO: renamed from: a */
            public final void mo15329a(InterfaceC38162f interfaceC38162f) {
                AbsActiveDelegateHistFragment.m35318L3(this.f30028b, interfaceC38162f);
            }
        });
    }

    /* JADX INFO: renamed from: M3 */
    private final void m35319M3() {
        Transformations.distinctUntilChanged(C24252m0.m58486v(m35362J3().m35577p())).observe(getViewLifecycleOwner(), new C16549a(new Function1() { // from class: com.kubi.kumex.record.currentDelegate.m
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AbsActiveDelegateHistFragment.m35332Z3(this.f30046b, (FiltersInfo) obj);
            }
        }));
        m35361I3().m35546Q().observe(getViewLifecycleOwner(), new C16549a(new Function1() { // from class: com.kubi.kumex.record.currentDelegate.p
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AbsActiveDelegateHistFragment.m35333a4(this.f30052b, (List) obj);
            }
        }));
        m35361I3().m35545P().observe(getViewLifecycleOwner(), new C16549a(new Function1() { // from class: com.kubi.kumex.record.currentDelegate.q
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AbsActiveDelegateHistFragment.m35320N3(this.f30054b, (Boolean) obj);
            }
        }));
        m35361I3().m35549T().observe(getViewLifecycleOwner(), new C16549a(new Function1() { // from class: com.kubi.kumex.record.currentDelegate.r
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AbsActiveDelegateHistFragment.m35322P3(this.f30056b, (Boolean) obj);
            }
        }));
        m35361I3().m35547R().observe(getViewLifecycleOwner(), new C16549a(new Function1() { // from class: com.kubi.kumex.record.currentDelegate.s
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AbsActiveDelegateHistFragment.m35323Q3(this.f30058b, (Boolean) obj);
            }
        }));
        m35361I3().m35555Z().observe(getViewLifecycleOwner(), new C16549a(new Function1() { // from class: com.kubi.kumex.record.currentDelegate.t
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AbsActiveDelegateHistFragment.m35324R3(this.f30060b, (Boolean) obj);
            }
        }));
        m35361I3().m35548S().observe(getViewLifecycleOwner(), new C16549a(new Function1() { // from class: com.kubi.kumex.record.currentDelegate.b
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AbsActiveDelegateHistFragment.m35325S3(this.f30016b, (Boolean) obj);
            }
        }));
        m35361I3().m35554Y().observe(getViewLifecycleOwner(), new C16549a(new Function1() { // from class: com.kubi.kumex.record.currentDelegate.c
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AbsActiveDelegateHistFragment.m35326T3(this.f30019b, (Boolean) obj);
            }
        }));
        m35361I3().m35556a0().observe(getViewLifecycleOwner(), new C16549a(new Function1() { // from class: com.kubi.kumex.record.currentDelegate.d
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AbsActiveDelegateHistFragment.m35327U3(this.f30022b, (Boolean) obj);
            }
        }));
        m35361I3().m35553X().observe(getViewLifecycleOwner(), new C16549a(new Function1() { // from class: com.kubi.kumex.record.currentDelegate.e
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AbsActiveDelegateHistFragment.m35328V3(this.f30025b, (Boolean) obj);
            }
        }));
        m35361I3().m35551V().observe(getViewLifecycleOwner(), new C16549a(new Function1() { // from class: com.kubi.kumex.record.currentDelegate.n
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AbsActiveDelegateHistFragment.m35329W3(this.f30048b, (Boolean) obj);
            }
        }));
        m35361I3().m35557b0().observe(getViewLifecycleOwner(), new C16549a(new Function1() { // from class: com.kubi.kumex.record.currentDelegate.o
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AbsActiveDelegateHistFragment.m35331Y3(this.f30050b, (Boolean) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: N3 */
    public static final Unit m35320N3(final AbsActiveDelegateHistFragment absActiveDelegateHistFragment, Boolean bool) {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        if (bool.booleanValue()) {
            absActiveDelegateHistFragment.m35366i4();
            C36837s1 c36837s1M35360H3 = absActiveDelegateHistFragment.m35360H3();
            if (c36837s1M35360H3 != null && (recyclerView2 = c36837s1M35360H3.f81033b) != null) {
                recyclerView2.scrollToPosition(0);
            }
            C36837s1 c36837s1M35360H4 = absActiveDelegateHistFragment.m35360H3();
            if (c36837s1M35360H4 != null && (recyclerView = c36837s1M35360H4.f81033b) != null) {
                recyclerView.postDelayed(new Runnable() { // from class: com.kubi.kumex.record.currentDelegate.j
                    @Override // java.lang.Runnable
                    public final void run() {
                        AbsActiveDelegateHistFragment.m35321O3(this.f30038b);
                    }
                }, 500L);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: O3 */
    public static final void m35321O3(AbsActiveDelegateHistFragment absActiveDelegateHistFragment) {
        absActiveDelegateHistFragment.m35314B0();
    }

    /* JADX INFO: renamed from: P3 */
    public static final Unit m35322P3(AbsActiveDelegateHistFragment absActiveDelegateHistFragment, Boolean bool) {
        if (bool.booleanValue()) {
            absActiveDelegateHistFragment.m35366i4();
        } else {
            absActiveDelegateHistFragment.m35314B0();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Q3 */
    public static final Unit m35323Q3(AbsActiveDelegateHistFragment absActiveDelegateHistFragment, Boolean bool) {
        if (bool.booleanValue()) {
            absActiveDelegateHistFragment.showLoadingDialog();
        } else {
            BaseFragment.hideLoadingDialog$default(absActiveDelegateHistFragment, false, 1, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: R3 */
    public static final Unit m35324R3(AbsActiveDelegateHistFragment absActiveDelegateHistFragment, Boolean bool) {
        TodoDelegateAdapter todoDelegateAdapter;
        if (!bool.booleanValue() && (todoDelegateAdapter = absActiveDelegateHistFragment.f29965X) != null) {
            todoDelegateAdapter.loadMoreComplete();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: S3 */
    public static final Unit m35325S3(AbsActiveDelegateHistFragment absActiveDelegateHistFragment, Boolean bool) {
        KuCoinRefreshLayout kuCoinRefreshLayout;
        absActiveDelegateHistFragment.showContentView();
        C36837s1 c36837s1M35360H3 = absActiveDelegateHistFragment.m35360H3();
        if (c36837s1M35360H3 != null && (kuCoinRefreshLayout = c36837s1M35360H3.f81034c) != null) {
            kuCoinRefreshLayout.setRefreshing(false);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: T3 */
    public static final Unit m35326T3(AbsActiveDelegateHistFragment absActiveDelegateHistFragment, Boolean bool) {
        if (bool.booleanValue()) {
            absActiveDelegateHistFragment.f29966Y--;
            TodoDelegateAdapter todoDelegateAdapter = absActiveDelegateHistFragment.f29965X;
            if (todoDelegateAdapter != null) {
                todoDelegateAdapter.loadMoreFail();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: U3 */
    public static final Unit m35327U3(AbsActiveDelegateHistFragment absActiveDelegateHistFragment, Boolean bool) {
        TodoDelegateAdapter todoDelegateAdapter;
        if (bool.booleanValue() && (todoDelegateAdapter = absActiveDelegateHistFragment.f29965X) != null) {
            todoDelegateAdapter.loadMoreEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: W3 */
    public static final Unit m35329W3(final AbsActiveDelegateHistFragment absActiveDelegateHistFragment, Boolean bool) {
        if (bool.booleanValue()) {
            TodoDelegateAdapter todoDelegateAdapter = absActiveDelegateHistFragment.f29965X;
            if (todoDelegateAdapter != null) {
                todoDelegateAdapter.replaceData(new ArrayList());
            }
            BaseFragment.showFailView$default(absActiveDelegateHistFragment, 0, 0, new View.OnClickListener() { // from class: com.kubi.kumex.record.currentDelegate.k
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AbsActiveDelegateHistFragment.m35330X3(this.f30041b, view);
                }
            }, 3, (Object) null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Y3 */
    public static final Unit m35331Y3(AbsActiveDelegateHistFragment absActiveDelegateHistFragment, Boolean bool) {
        Intrinsics.checkNotNull(bool);
        absActiveDelegateHistFragment.mo35365h4(bool.booleanValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: e4 */
    public static final void m35336e4(AbsActiveDelegateHistFragment absActiveDelegateHistFragment) {
        String strM35358F3 = absActiveDelegateHistFragment.m35358F3();
        String strM35359G3 = absActiveDelegateHistFragment.m35359G3();
        long j11 = absActiveDelegateHistFragment.f29966Y + 1;
        absActiveDelegateHistFragment.f29966Y = j11;
        absActiveDelegateHistFragment.mo35357E3(strM35358F3, strM35359G3, j11);
    }

    /* JADX INFO: renamed from: g4 */
    public static final Unit m35337g4(AbsActiveDelegateHistFragment absActiveDelegateHistFragment) {
        RecyclerView recyclerView;
        C36837s1 c36837s1M35360H3 = absActiveDelegateHistFragment.m35360H3();
        if (c36837s1M35360H3 != null && (recyclerView = c36837s1M35360H3.f81033b) != null) {
            recyclerView.scrollToPosition(0);
        }
        absActiveDelegateHistFragment.m35314B0();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: j4 */
    public static final ViewModelStoreOwner m35339j4(AbsActiveDelegateHistFragment absActiveDelegateHistFragment) {
        Fragment parentFragment = absActiveDelegateHistFragment.getParentFragment();
        if (parentFragment != null) {
            return parentFragment;
        }
        return absActiveDelegateHistFragment;
    }

    @NotNull
    /* JADX INFO: renamed from: F3 */
    public final String m35358F3() {
        String fundsType;
        FiltersInfo value = m35362J3().m35577p().getValue();
        if (value != null && (fundsType = value.getFundsType()) != null) {
            return fundsType;
        }
        return OrderAssetType.SelfFunds.getTypeName();
    }

    @Nullable
    /* JADX INFO: renamed from: G3 */
    public final String m35359G3() {
        FiltersInfo value = m35362J3().m35577p().getValue();
        if (value != null) {
            return value.getSymbol();
        }
        return null;
    }

    /* JADX INFO: renamed from: b4 */
    public final void m35363b4() {
        C36837s1 c36837s1M35360H3;
        FragmentActivity activity = getActivity();
        if (activity != null && (c36837s1M35360H3 = m35360H3()) != null) {
            c36837s1M35360H3.f81033b.setLayoutManager(new LinearLayoutManager(activity, 1, false));
            RecyclerView list = c36837s1M35360H3.f81033b;
            Intrinsics.checkNotNullExpressionValue(list, "list");
            ViewExKt.m36476b(list);
            c36837s1M35360H3.f81033b.addItemDecoration(new C43773a(0, 0, (int) C27025c.m66565c(activity, 16), (int) C27025c.m66565c(activity, 16), 3, null));
            TodoDelegateAdapter todoDelegateAdapter = new TodoDelegateAdapter(new ArrayList(), false, new Function3() { // from class: com.kubi.kumex.record.currentDelegate.g
                @Override // p852kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return AbsActiveDelegateHistFragment.m35334c4(this.f30031b, (View) obj, ((Integer) obj2).intValue(), (OrderEntity) obj3);
                }
            }, new Function1() { // from class: com.kubi.kumex.record.currentDelegate.h
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AbsActiveDelegateHistFragment.m35335d4(this.f30033b, (TodoDelegateItem.OrderHistoryNumTipsInfo) obj);
                }
            }, null, null, null, 112, null);
            this.f29965X = todoDelegateAdapter;
            todoDelegateAdapter.bindToRecyclerView(c36837s1M35360H3.f81033b);
            TodoDelegateAdapter todoDelegateAdapter2 = this.f29965X;
            if (todoDelegateAdapter2 != null) {
                todoDelegateAdapter2.setLoadMoreView(new C23057g1());
            }
            TodoDelegateAdapter todoDelegateAdapter3 = this.f29965X;
            if (todoDelegateAdapter3 != null) {
                todoDelegateAdapter3.setOnLoadMoreListener(new BaseQuickAdapter.RequestLoadMoreListener() { // from class: com.kubi.kumex.record.currentDelegate.i
                    @Override // io.chad.library.adapter.base.BaseQuickAdapter.RequestLoadMoreListener
                    public final void onLoadMoreRequested() {
                        AbsActiveDelegateHistFragment.m35336e4(this.f30035a);
                    }
                }, c36837s1M35360H3.f81033b);
            }
        }
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onAgainShow() {
        super.onAgainShow();
        C27100x0.m66924e(new Function0() { // from class: com.kubi.kumex.record.currentDelegate.l
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AbsActiveDelegateHistFragment.m35337g4(this.f30044b);
            }
        });
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onLoad() {
        super.onLoad();
        m35314B0();
    }
}
