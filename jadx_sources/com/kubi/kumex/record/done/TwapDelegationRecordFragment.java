package com.kubi.kumex.record.done;

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
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.recyclerview.widget.RecyclerView;
import com.kubi.kumex.record.done.adapter.TwapDelegateRecordAdapter;
import com.kubi.kumex.record.done.viewModel.DelegateRecordViewModel;
import com.kubi.kumex.record.done.viewModel.FiltersInfo;
import com.kubi.kumex.record.done.viewModel.TwapDelegateRecordViewModel;
import com.kubi.kumex.trade.CommonDecoration;
import com.kubi.kumex.utils.ViewExKt;
import com.kubi.resources.widget.C23057g1;
import com.kubi.resources.widget.KuCoinRefreshLayout;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.util.C24252m0;
import com.kubi.utils.extensions.C27025c;
import com.tencent.qcloud.tuicore.TUIConstants;
import dm.C36761f3;
import hb0.InterfaceC38162f;
import io.chad.library.adapter.base.BaseQuickAdapter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import jb0.InterfaceC40373g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p761xh.InterfaceC46192a;
import p852kotlin.Function;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.FunctionAdapter;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: TwapDelegationRecordFragment.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u0000 #2\u00020\u0001:\u0001#B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\u001a\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\b\u0010 \u001a\u00020\u001eH\u0002J\b\u0010!\u001a\u00020\u001eH\u0002J\b\u0010\"\u001a\u00020\u001eH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006$"}, m90084d2 = {"Lcom/kubi/kumex/record/done/TwapDelegationRecordFragment;", "Lcom/kubi/sdk/BaseFragment;", "<init>", "()V", "binding", "Lcom/kubi/kumex/databinding/BkumexFragmentRefreshListBinding;", "adapter", "Lcom/kubi/kumex/record/done/adapter/TwapDelegateRecordAdapter;", "delegateRecordVM", "Lcom/kubi/kumex/record/done/viewModel/DelegateRecordViewModel;", "getDelegateRecordVM", "()Lcom/kubi/kumex/record/done/viewModel/DelegateRecordViewModel;", "delegateRecordVM$delegate", "Lkotlin/Lazy;", "twapDelegateRecordVM", "Lcom/kubi/kumex/record/done/viewModel/TwapDelegateRecordViewModel;", "getTwapDelegateRecordVM", "()Lcom/kubi/kumex/record/done/viewModel/TwapDelegateRecordViewModel;", "twapDelegateRecordVM$delegate", "curPage", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "savedInstanceState", "Landroid/os/Bundle;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "initView", "initObservers", "refresh", "Companion", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nTwapDelegationRecordFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TwapDelegationRecordFragment.kt\ncom/kubi/kumex/record/done/TwapDelegationRecordFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,129:1\n106#2,15:130\n106#2,15:145\n*S KotlinDebug\n*F\n+ 1 TwapDelegationRecordFragment.kt\ncom/kubi/kumex/record/done/TwapDelegationRecordFragment\n*L\n35#1:130,15\n36#1:145,15\n*E\n"})
public final class TwapDelegationRecordFragment extends BaseFragment {

    /* JADX INFO: renamed from: Z */
    @NotNull
    public static final Companion f30177Z = new Companion(null);

    /* JADX INFO: renamed from: U */
    public C36761f3 f30178U;

    /* JADX INFO: renamed from: V */
    @Nullable
    public TwapDelegateRecordAdapter f30179V;

    /* JADX INFO: renamed from: W */
    @NotNull
    public final Lazy f30180W;

    /* JADX INFO: renamed from: X */
    @NotNull
    public final Lazy f30181X;

    /* JADX INFO: renamed from: Y */
    public int f30182Y;

    /* JADX INFO: compiled from: TwapDelegationRecordFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/kumex/record/done/TwapDelegationRecordFragment$Companion;", "", "<init>", "()V", "newInstance", "Lcom/kubi/kumex/record/done/TwapDelegationRecordFragment;", "bundle", "Landroid/os/Bundle;", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final TwapDelegationRecordFragment newInstance(@Nullable Bundle bundle) {
            TwapDelegationRecordFragment twapDelegationRecordFragment = new TwapDelegationRecordFragment();
            twapDelegationRecordFragment.setArguments(bundle);
            return twapDelegationRecordFragment;
        }
    }

    /* JADX INFO: renamed from: com.kubi.kumex.record.done.TwapDelegationRecordFragment$a */
    /* JADX INFO: compiled from: TwapDelegationRecordFragment.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C16662a implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1 f30183b;

        public C16662a(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f30183b = function;
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
            return this.f30183b;
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f30183b.invoke(obj);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX INFO: renamed from: C3 */
    public static final Unit m35665C3(TwapDelegationRecordFragment twapDelegationRecordFragment, Boolean bool) {
        TwapDelegateRecordAdapter twapDelegateRecordAdapter = twapDelegationRecordFragment.f30179V;
        if (twapDelegateRecordAdapter != null) {
            Intrinsics.checkNotNull(bool);
            twapDelegateRecordAdapter.setEnableLoadMore(bool.booleanValue());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: D3 */
    public static final Unit m35666D3(TwapDelegationRecordFragment twapDelegationRecordFragment, List list) {
        TwapDelegateRecordAdapter twapDelegateRecordAdapter = twapDelegationRecordFragment.f30179V;
        if (twapDelegateRecordAdapter != null) {
            Intrinsics.checkNotNull(list);
            twapDelegateRecordAdapter.replaceData(CollectionsKt.toMutableList((Collection) list));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: G3 */
    public static final Unit m35669G3(TwapDelegationRecordFragment twapDelegationRecordFragment, Boolean bool) {
        C36761f3 c36761f3 = twapDelegationRecordFragment.f30178U;
        if (c36761f3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c36761f3 = null;
        }
        KuCoinRefreshLayout kuCoinRefreshLayout = c36761f3.f80056c;
        Intrinsics.checkNotNull(bool);
        kuCoinRefreshLayout.setRefreshing(bool.booleanValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: K3 */
    public static final void m35673K3(TwapDelegationRecordFragment twapDelegationRecordFragment, InterfaceC38162f it) {
        Intrinsics.checkNotNullParameter(it, "it");
        twapDelegationRecordFragment.m35663B0();
    }

    @Override // com.kubi.sdk.BaseFragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable Bundle savedInstanceState, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        C36761f3 c36761f3M82375c = C36761f3.m82375c(inflater, container, false);
        Intrinsics.checkNotNullExpressionValue(c36761f3M82375c, "inflate(...)");
        this.f30178U = c36761f3M82375c;
        if (c36761f3M82375c == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c36761f3M82375c = null;
        }
        ConstraintLayout root = c36761f3M82375c.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        initView();
        m35689z3();
    }

    /* JADX INFO: renamed from: x3 */
    public final DelegateRecordViewModel m35690x3() {
        return (DelegateRecordViewModel) this.f30180W.getValue();
    }

    /* JADX INFO: renamed from: y3 */
    public final TwapDelegateRecordViewModel m35691y3() {
        return (TwapDelegateRecordViewModel) this.f30181X.getValue();
    }

    public TwapDelegationRecordFragment() {
        final Function0 function0 = new Function0() { // from class: com.kubi.kumex.record.done.j
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TwapDelegationRecordFragment.m35688w3(this.f30197b);
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final Lazy lazy = LazyKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.kubi.kumex.record.done.TwapDelegationRecordFragment$special$$inlined$viewModels$default$1
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
        this.f30180W = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(DelegateRecordViewModel.class), new Function0<ViewModelStore>() { // from class: com.kubi.kumex.record.done.TwapDelegationRecordFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m103549viewModels$lambda1(lazy).getMViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.kubi.kumex.record.done.TwapDelegationRecordFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.kubi.kumex.record.done.TwapDelegationRecordFragment$special$$inlined$viewModels$default$4
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
        final Function0 function2 = new Function0() { // from class: com.kubi.kumex.record.done.n
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TwapDelegationRecordFragment.m35674L3(this.f30201b);
            }
        };
        final Lazy lazy2 = LazyKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.kubi.kumex.record.done.TwapDelegationRecordFragment$special$$inlined$viewModels$default$5
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
        this.f30181X = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(TwapDelegateRecordViewModel.class), new Function0<ViewModelStore>() { // from class: com.kubi.kumex.record.done.TwapDelegationRecordFragment$special$$inlined$viewModels$default$6
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m103549viewModels$lambda1(lazy2).getMViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.kubi.kumex.record.done.TwapDelegationRecordFragment$special$$inlined$viewModels$default$7
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.kubi.kumex.record.done.TwapDelegationRecordFragment$special$$inlined$viewModels$default$8
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
        this.f30182Y = 1;
    }

    /* JADX INFO: renamed from: A3 */
    public static final Unit m35662A3(TwapDelegationRecordFragment twapDelegationRecordFragment, Boolean bool) {
        TwapDelegateRecordAdapter twapDelegateRecordAdapter;
        if (!bool.booleanValue() && (twapDelegateRecordAdapter = twapDelegationRecordFragment.f30179V) != null) {
            twapDelegateRecordAdapter.loadMoreComplete();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: B0 */
    private final void m35663B0() {
        String symbol;
        Long lValueOf;
        InterfaceC46192a time;
        InterfaceC46192a time2;
        showContentView();
        C36761f3 c36761f3 = this.f30178U;
        Long lValueOf2 = null;
        if (c36761f3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c36761f3 = null;
        }
        c36761f3.f80056c.setRefreshing(true);
        this.f30182Y = 1;
        FiltersInfo value = m35690x3().m35716p().getValue();
        TwapDelegateRecordViewModel twapDelegateRecordViewModelM35691y3 = m35691y3();
        if (value != null) {
            symbol = value.getSymbol();
        } else {
            symbol = null;
        }
        Integer numValueOf = Integer.valueOf(this.f30182Y);
        if (value != null && (time2 = value.getTime()) != null) {
            lValueOf = Long.valueOf(time2.getF103727a());
        } else {
            lValueOf = null;
        }
        if (value != null && (time = value.getTime()) != null) {
            lValueOf2 = Long.valueOf(time.getF103728b());
        }
        twapDelegateRecordViewModelM35691y3.m35709v(symbol, numValueOf, lValueOf, lValueOf2);
    }

    /* JADX INFO: renamed from: B3 */
    public static final Unit m35664B3(TwapDelegationRecordFragment twapDelegationRecordFragment, Boolean bool) {
        if (bool.booleanValue()) {
            twapDelegationRecordFragment.f30182Y--;
            TwapDelegateRecordAdapter twapDelegateRecordAdapter = twapDelegationRecordFragment.f30179V;
            if (twapDelegateRecordAdapter != null) {
                twapDelegateRecordAdapter.loadMoreFail();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: E3 */
    public static final boolean m35667E3(FiltersInfo filtersInfo, FiltersInfo filtersInfo2) {
        if (Intrinsics.areEqual(filtersInfo.getSymbol(), filtersInfo2.getSymbol()) && Intrinsics.areEqual(filtersInfo.getTime(), filtersInfo2.getTime())) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: F3 */
    public static final Unit m35668F3(TwapDelegationRecordFragment twapDelegationRecordFragment, FiltersInfo filtersInfo) {
        twapDelegationRecordFragment.m35663B0();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: H3 */
    public static final Unit m35670H3(final TwapDelegationRecordFragment twapDelegationRecordFragment, Boolean bool) {
        if (bool.booleanValue()) {
            TwapDelegateRecordAdapter twapDelegateRecordAdapter = twapDelegationRecordFragment.f30179V;
            if (twapDelegateRecordAdapter != null) {
                twapDelegateRecordAdapter.replaceData(new ArrayList());
            }
            BaseFragment.showFailView$default(twapDelegationRecordFragment, 0, 0, new View.OnClickListener() { // from class: com.kubi.kumex.record.done.m
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    TwapDelegationRecordFragment.m35671I3(this.f30200b, view);
                }
            }, 3, (Object) null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: I3 */
    public static final void m35671I3(TwapDelegationRecordFragment twapDelegationRecordFragment, View view) {
        twapDelegationRecordFragment.m35663B0();
    }

    /* JADX INFO: renamed from: J3 */
    public static final void m35672J3(TwapDelegationRecordFragment twapDelegationRecordFragment) {
        String symbol;
        Long lValueOf;
        InterfaceC46192a time;
        InterfaceC46192a time2;
        FiltersInfo value = twapDelegationRecordFragment.m35690x3().m35716p().getValue();
        TwapDelegateRecordViewModel twapDelegateRecordViewModelM35691y3 = twapDelegationRecordFragment.m35691y3();
        Long lValueOf2 = null;
        if (value != null) {
            symbol = value.getSymbol();
        } else {
            symbol = null;
        }
        int i11 = twapDelegationRecordFragment.f30182Y;
        twapDelegationRecordFragment.f30182Y = i11 + 1;
        Integer numValueOf = Integer.valueOf(i11);
        if (value != null && (time2 = value.getTime()) != null) {
            lValueOf = Long.valueOf(time2.getF103727a());
        } else {
            lValueOf = null;
        }
        if (value != null && (time = value.getTime()) != null) {
            lValueOf2 = Long.valueOf(time.getF103728b());
        }
        twapDelegateRecordViewModelM35691y3.m35709v(symbol, numValueOf, lValueOf, lValueOf2);
    }

    /* JADX INFO: renamed from: L3 */
    public static final ViewModelStoreOwner m35674L3(TwapDelegationRecordFragment twapDelegationRecordFragment) {
        Fragment parentFragment = twapDelegationRecordFragment.getParentFragment();
        if (parentFragment != null) {
            return parentFragment;
        }
        return twapDelegationRecordFragment;
    }

    private final void initView() {
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        C36761f3 c36761f3 = this.f30178U;
        C36761f3 c36761f4 = null;
        if (c36761f3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c36761f3 = null;
        }
        RecyclerView list = c36761f3.f80055b;
        Intrinsics.checkNotNullExpressionValue(list, "list");
        ViewExKt.m36476b(list);
        C36761f3 c36761f5 = this.f30178U;
        if (c36761f5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c36761f5 = null;
        }
        c36761f5.f80055b.addItemDecoration(new CommonDecoration(0, 0, (int) C27025c.m66565c(activity, 16), (int) C27025c.m66565c(activity, 16), 3, null));
        TwapDelegateRecordAdapter twapDelegateRecordAdapter = new TwapDelegateRecordAdapter(new ArrayList());
        this.f30179V = twapDelegateRecordAdapter;
        C36761f3 c36761f6 = this.f30178U;
        if (c36761f6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c36761f6 = null;
        }
        twapDelegateRecordAdapter.bindToRecyclerView(c36761f6.f80055b);
        TwapDelegateRecordAdapter twapDelegateRecordAdapter2 = this.f30179V;
        if (twapDelegateRecordAdapter2 != null) {
            twapDelegateRecordAdapter2.setLoadMoreView(new C23057g1());
        }
        TwapDelegateRecordAdapter twapDelegateRecordAdapter3 = this.f30179V;
        if (twapDelegateRecordAdapter3 != null) {
            BaseQuickAdapter.RequestLoadMoreListener requestLoadMoreListener = new BaseQuickAdapter.RequestLoadMoreListener() { // from class: com.kubi.kumex.record.done.k
                @Override // io.chad.library.adapter.base.BaseQuickAdapter.RequestLoadMoreListener
                public final void onLoadMoreRequested() {
                    TwapDelegationRecordFragment.m35672J3(this.f30198a);
                }
            };
            C36761f3 c36761f7 = this.f30178U;
            if (c36761f7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c36761f7 = null;
            }
            twapDelegateRecordAdapter3.setOnLoadMoreListener(requestLoadMoreListener, c36761f7.f80055b);
        }
        C36761f3 c36761f8 = this.f30178U;
        if (c36761f8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            c36761f4 = c36761f8;
        }
        c36761f4.f80056c.setOnRefreshListener(new InterfaceC40373g() { // from class: com.kubi.kumex.record.done.l
            @Override // jb0.InterfaceC40373g
            /* JADX INFO: renamed from: a */
            public final void mo15329a(InterfaceC38162f interfaceC38162f) {
                TwapDelegationRecordFragment.m35673K3(this.f30199b, interfaceC38162f);
            }
        });
    }

    /* JADX INFO: renamed from: w3 */
    public static final ViewModelStoreOwner m35688w3(TwapDelegationRecordFragment twapDelegationRecordFragment) {
        Fragment parentFragment = twapDelegationRecordFragment.getParentFragment();
        if (parentFragment != null) {
            return parentFragment;
        }
        return twapDelegationRecordFragment;
    }

    /* JADX INFO: renamed from: z3 */
    private final void m35689z3() {
        C24252m0.m58477m(m35690x3().m35716p(), new Function2() { // from class: com.kubi.kumex.record.done.o
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Boolean.valueOf(TwapDelegationRecordFragment.m35667E3((FiltersInfo) obj, (FiltersInfo) obj2));
            }
        }).observe(getViewLifecycleOwner(), new C16662a(new Function1() { // from class: com.kubi.kumex.record.done.p
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TwapDelegationRecordFragment.m35668F3(this.f30202b, (FiltersInfo) obj);
            }
        }));
        m35691y3().m35711x().observe(getViewLifecycleOwner(), new C16662a(new Function1() { // from class: com.kubi.kumex.record.done.q
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TwapDelegationRecordFragment.m35669G3(this.f30203b, (Boolean) obj);
            }
        }));
        m35691y3().m35706B().observe(getViewLifecycleOwner(), new C16662a(new Function1() { // from class: com.kubi.kumex.record.done.r
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TwapDelegationRecordFragment.m35670H3(this.f30204b, (Boolean) obj);
            }
        }));
        m35691y3().m35705A().observe(getViewLifecycleOwner(), new C16662a(new Function1() { // from class: com.kubi.kumex.record.done.s
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TwapDelegationRecordFragment.m35662A3(this.f30205b, (Boolean) obj);
            }
        }));
        m35691y3().m35713z().observe(getViewLifecycleOwner(), new C16662a(new Function1() { // from class: com.kubi.kumex.record.done.t
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TwapDelegationRecordFragment.m35664B3(this.f30206b, (Boolean) obj);
            }
        }));
        m35691y3().m35712y().observe(getViewLifecycleOwner(), new C16662a(new Function1() { // from class: com.kubi.kumex.record.done.u
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TwapDelegationRecordFragment.m35665C3(this.f30207b, (Boolean) obj);
            }
        }));
        m35691y3().m35710w().observe(getViewLifecycleOwner(), new C16662a(new Function1() { // from class: com.kubi.kumex.record.done.v
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TwapDelegationRecordFragment.m35666D3(this.f30208b, (List) obj);
            }
        }));
    }
}
