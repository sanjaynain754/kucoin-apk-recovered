package com.kubi.futures.settings;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.media3.extractor.text.ttml.TtmlNode;
import bm.C4634g;
import com.fasterxml.jackson.databind.node.C6447a;
import com.kubi.broker.RepositoryServiceLocator;
import com.kubi.futures.settings.vm.IsolatedRiskLimitViewModel;
import com.kubi.kumex.R$layout;
import com.kubi.kumex.data.platform.model.ContractEntity;
import com.kubi.kumex.data.platform.model.ContractRiskLimitEntity;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.tencent.qcloud.tuicore.TUIConstants;
import dm.C36767g3;
import fm.C37567b;
import java.util.List;
import nf.C42828b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p429lf.C42180b;
import p852kotlin.Function;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.Metadata;
import p852kotlin.Triple;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.FunctionAdapter;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import th.InterfaceC44980d;
import w00.C45681e;

/* JADX INFO: compiled from: RetailRiskLimitFragment.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\u001a\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\b\u0010\"\u001a\u00020 H\u0002J,\u0010#\u001a\u00020 2\"\u0010$\u001a\u001e\u0012\u0004\u0012\u00020\u0015\u0012\f\u0012\n\u0012\u0004\u0012\u00020'\u0018\u00010&\u0012\u0006\u0012\u0004\u0018\u00010'0%H\u0002J\u0010\u0010(\u001a\u00020 2\u0006\u0010)\u001a\u00020'H\u0002J\u000e\u0010*\u001a\u00020 2\u0006\u0010\u0010\u001a\u00020\u0011R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00158BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0016¨\u0006+"}, m90084d2 = {"Lcom/kubi/futures/settings/RetailRiskLimitFragment;", "Lcom/kubi/sdk/BaseFragment;", "<init>", "()V", "viewBinding", "Lcom/kubi/kumex/databinding/BkumexFragmentRetailRiskLimitBinding;", "getViewBinding", "()Lcom/kubi/kumex/databinding/BkumexFragmentRetailRiskLimitBinding;", "viewBinding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "viewModel", "Lcom/kubi/futures/settings/vm/IsolatedRiskLimitViewModel;", "getViewModel", "()Lcom/kubi/futures/settings/vm/IsolatedRiskLimitViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "symbol", "", "getSymbol", "()Ljava/lang/String;", "isTrial", "", "()Z", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "savedInstanceState", "Landroid/os/Bundle;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "initObserver", "handleRiskLimit", "triple", "Lkotlin/Triple;", "", "Lcom/kubi/kumex/data/platform/model/ContractRiskLimitEntity;", "setCurrentRiskLimit", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "notifySymbol", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nRetailRiskLimitFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RetailRiskLimitFragment.kt\ncom/kubi/futures/settings/RetailRiskLimitFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,102:1\n147#2,16:103\n106#3,15:119\n*S KotlinDebug\n*F\n+ 1 RetailRiskLimitFragment.kt\ncom/kubi/futures/settings/RetailRiskLimitFragment\n*L\n32#1:103,16\n36#1:119,15\n*E\n"})
public final class RetailRiskLimitFragment extends BaseFragment {

    /* JADX INFO: renamed from: W */
    public static final /* synthetic */ KProperty<Object>[] f23186W = {Reflection.property1(new PropertyReference1Impl(RetailRiskLimitFragment.class, "viewBinding", "getViewBinding()Lcom/kubi/kumex/databinding/BkumexFragmentRetailRiskLimitBinding;", 0))};

    /* JADX INFO: renamed from: U */
    @NotNull
    public final InterfaceC24293a f23187U = C45681e.m100799e(this, new Function1<RetailRiskLimitFragment, C36767g3>() { // from class: com.kubi.futures.settings.RetailRiskLimitFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C36767g3 invoke(@NotNull RetailRiskLimitFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C36767g3.m82389a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C36767g3, Unit>() { // from class: com.kubi.futures.settings.RetailRiskLimitFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C36767g3 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C36767g3 c36767g3) {
            invoke(c36767g3);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: V */
    @NotNull
    public final Lazy f23188V;

    /* JADX INFO: renamed from: com.kubi.futures.settings.RetailRiskLimitFragment$a */
    /* JADX INFO: compiled from: RetailRiskLimitFragment.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C13262a implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1 f23189b;

        public C13262a(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f23189b = function;
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
            return this.f23189b;
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f23189b.invoke(obj);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX INFO: renamed from: p3 */
    public static final void m25895p3(RetailRiskLimitFragment retailRiskLimitFragment, View view) {
        BaseFragment.showLoadingView$default(retailRiskLimitFragment, 0, 0, 3, null);
        retailRiskLimitFragment.m25894n3().m26394p(retailRiskLimitFragment.m25893l3(), retailRiskLimitFragment.m25890E0());
    }

    /* JADX INFO: renamed from: n3 */
    private final IsolatedRiskLimitViewModel m25894n3() {
        return (IsolatedRiskLimitViewModel) this.f23188V.getValue();
    }

    /* JADX INFO: renamed from: t3 */
    private final void m25898t3(ContractRiskLimitEntity contractRiskLimitEntity) {
        C36767g3 c36767g3M25899m3;
        ContractEntity contractEntityM99529O = InterfaceC44980d.m99529O(RepositoryServiceLocator.f19236a.m20288g(), C27041f.m66668h(contractRiskLimitEntity.getSymbol()), false, 2, null);
        if (contractEntityM99529O == null || (c36767g3M25899m3 = m25899m3()) == null) {
            return;
        }
        c36767g3M25899m3.f80143j.setText(C42828b.m93906g(C42180b.m92640e(C27039d.m66656p(contractRiskLimitEntity.getMaxRiskLimit()), null, C27039d.m66650j(Integer.valueOf(C37567b.m84623m(contractEntityM99529O))), true, true, true, 0, null, 97, null), C27041f.m66668h(C37567b.m84620j(contractEntityM99529O)), true, false, 4, null));
        c36767g3M25899m3.f80137d.setText(C6447a.m11724a(C27039d.m66656p(contractRiskLimitEntity.getMaxLeverage())).toEngineeringString() + 'x');
        c36767g3M25899m3.f80138e.setText(C42180b.m92642g(C27039d.m66656p(contractRiskLimitEntity.getMaintainMargin()), null, null, 0, false, false, true, 31, null));
    }

    /* JADX INFO: renamed from: m3 */
    public final C36767g3 m25899m3() {
        return (C36767g3) this.f23187U.getValue(this, f23186W[0]);
    }

    @Override // com.kubi.sdk.BaseFragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable Bundle savedInstanceState, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(R$layout.bkumex_fragment_retail_risk_limit, container, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        m25896q3();
        BaseFragment.showLoadingView$default(this, 0, 0, 3, null);
        m25894n3().m26394p(m25893l3(), m25890E0());
    }

    /* JADX INFO: renamed from: s3 */
    public final void m25901s3(@NotNull String symbol) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        if (!isAdded() || isRemoving() || isDetached()) {
            return;
        }
        BaseFragment.showLoadingView$default(this, 0, 0, 3, null);
        m25894n3().m26394p(symbol, m25890E0());
    }

    public RetailRiskLimitFragment() {
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.kubi.futures.settings.RetailRiskLimitFragment$special$$inlined$viewModels$default$1
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
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.kubi.futures.settings.RetailRiskLimitFragment$special$$inlined$viewModels$default$2
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
        this.f23188V = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(IsolatedRiskLimitViewModel.class), new Function0<ViewModelStore>() { // from class: com.kubi.futures.settings.RetailRiskLimitFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m103549viewModels$lambda1(lazy).getMViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.kubi.futures.settings.RetailRiskLimitFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.kubi.futures.settings.RetailRiskLimitFragment$special$$inlined$viewModels$default$5
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
    }

    /* JADX INFO: renamed from: E0 */
    private final boolean m25890E0() {
        Boolean boolValueOf;
        Bundle arguments = getArguments();
        if (arguments != null) {
            boolValueOf = Boolean.valueOf(arguments.getBoolean("data_1"));
        } else {
            boolValueOf = null;
        }
        return C27025c.m66566d(boolValueOf);
    }

    /* JADX INFO: renamed from: l3 */
    private final String m25893l3() {
        String string;
        Bundle arguments = getArguments();
        if (arguments != null) {
            string = arguments.getString("symbol");
        } else {
            string = null;
        }
        return C27041f.m66669i(string, C4634g.m4564a());
    }

    /* JADX INFO: renamed from: q3 */
    private final void m25896q3() {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        m25894n3().m26395q().observe(viewLifecycleOwner, new C13262a(new Function1() { // from class: com.kubi.futures.settings.g2
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RetailRiskLimitFragment.m25897r3(this.f23340b, (Triple) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: r3 */
    public static final Unit m25897r3(RetailRiskLimitFragment retailRiskLimitFragment, Triple triple) {
        Intrinsics.checkNotNull(triple);
        retailRiskLimitFragment.m25900o3(triple);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o3 */
    public final void m25900o3(Triple<Boolean, ? extends List<ContractRiskLimitEntity>, ContractRiskLimitEntity> triple) {
        if (triple.getFirst().booleanValue()) {
            ContractRiskLimitEntity third2 = triple.getThird();
            if (third2 == null) {
                return;
            }
            showContentView();
            m25898t3(third2);
            return;
        }
        BaseFragment.showFailView$default(this, 0, 0, new View.OnClickListener() { // from class: com.kubi.futures.settings.h2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RetailRiskLimitFragment.m25895p3(this.f23349b, view);
            }
        }, 3, (Object) null);
    }
}
