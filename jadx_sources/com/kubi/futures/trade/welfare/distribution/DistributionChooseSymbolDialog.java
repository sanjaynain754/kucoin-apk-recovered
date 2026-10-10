package com.kubi.futures.trade.welfare.distribution;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.recyclerview.widget.RecyclerView;
import com.blankj.utilcode.util.C5267e0;
import com.kubi.kumex.R$layout;
import com.kubi.kumex.R$string;
import com.kubi.kumex.data.market.model.DistributionQuoteEntity;
import com.kubi.kumex.data.platform.model.FuturesWelfareTrialItemEntity;
import com.kubi.kumex.utils.C17060n0;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.BaseActivity;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.R$drawable;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.widget.loading.WrapperLoadingView;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import dm.C36841t;
import io.reactivex.functions.Action;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43852m;
import p852kotlin.Function;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.FunctionAdapter;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import w00.C45681e;

/* JADX INFO: compiled from: DistributionChooseSymbolDialog.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 -2\u00020\u0001:\u0001-B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$2\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J\b\u0010'\u001a\u00020(H\u0016J\u001a\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020 2\b\u0010%\u001a\u0004\u0018\u00010&H\u0017J\b\u0010,\u001a\u00020*H\u0002R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0015\u001a\u0004\u0018\u00010\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u000f\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u001a\u001a\u0004\u0018\u00010\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u000f\u001a\u0004\b\u001c\u0010\u001d¨\u0006."}, m90084d2 = {"Lcom/kubi/futures/trade/welfare/distribution/DistributionChooseSymbolDialog;", "Lcom/kubi/resources/dialog/DialogFragmentHelper;", "<init>", "()V", "binding", "Lcom/kubi/kumex/databinding/BkumexDialogFutureBonusDistributionChooseSymbolBinding;", "getBinding", "()Lcom/kubi/kumex/databinding/BkumexDialogFutureBonusDistributionChooseSymbolBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "adapter", "Lcom/kubi/futures/trade/welfare/distribution/DistributionChooseSymbolAdapter;", "getAdapter", "()Lcom/kubi/futures/trade/welfare/distribution/DistributionChooseSymbolAdapter;", "adapter$delegate", "Lkotlin/Lazy;", "vm", "Lcom/kubi/futures/trade/welfare/distribution/DistributionChooseSymbolViewModel;", "getVm", "()Lcom/kubi/futures/trade/welfare/distribution/DistributionChooseSymbolViewModel;", "vm$delegate", "trial", "Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialItemEntity;", "getTrial", "()Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialItemEntity;", "trial$delegate", "loadingView", "Lcom/kubi/sdk/widget/loading/WrapperLoadingView;", "getLoadingView", "()Lcom/kubi/sdk/widget/loading/WrapperLoadingView;", "loadingView$delegate", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "initType", "", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "showFinishDialog", "Companion", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nDistributionChooseSymbolDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DistributionChooseSymbolDialog.kt\ncom/kubi/futures/trade/welfare/distribution/DistributionChooseSymbolDialog\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,282:1\n143#2,20:283\n106#3,15:303\n*S KotlinDebug\n*F\n+ 1 DistributionChooseSymbolDialog.kt\ncom/kubi/futures/trade/welfare/distribution/DistributionChooseSymbolDialog\n*L\n64#1:283,20\n85#1:303,15\n*E\n"})
public final class DistributionChooseSymbolDialog extends DialogFragmentHelper {

    /* JADX INFO: renamed from: q0 */
    @NotNull
    public final InterfaceC24293a f24686q0 = C45681e.m100799e(this, new Function1<DistributionChooseSymbolDialog, C36841t>() { // from class: com.kubi.futures.trade.welfare.distribution.DistributionChooseSymbolDialog$special$$inlined$viewBindingFragment$default$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C36841t invoke(@NotNull DistributionChooseSymbolDialog fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C36841t.m82547a(fragment.requireView());
        }
    }, new Function1<C36841t, Unit>() { // from class: com.kubi.futures.trade.welfare.distribution.DistributionChooseSymbolDialog$special$$inlined$viewBindingFragment$default$1
        public final void invoke(@NotNull C36841t it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C36841t c36841t) {
            invoke(c36841t);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: r0 */
    @NotNull
    public final Lazy f24687r0 = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.trade.welfare.distribution.o
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return DistributionChooseSymbolDialog.m28503w4(this.f24766b);
        }
    });

    /* JADX INFO: renamed from: s0 */
    @NotNull
    public final Lazy f24688s0;

    /* JADX INFO: renamed from: t0 */
    @NotNull
    public final Lazy f24689t0;

    /* JADX INFO: renamed from: u0 */
    @NotNull
    public final Lazy f24690u0;

    /* JADX INFO: renamed from: w0 */
    public static final /* synthetic */ KProperty<Object>[] f24685w0 = {Reflection.property1(new PropertyReference1Impl(DistributionChooseSymbolDialog.class, "binding", "getBinding()Lcom/kubi/kumex/databinding/BkumexDialogFutureBonusDistributionChooseSymbolBinding;", 0))};

    /* JADX INFO: renamed from: v0 */
    @NotNull
    public static final Companion f24684v0 = new Companion(null);

    /* JADX INFO: compiled from: DistributionChooseSymbolDialog.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/futures/trade/welfare/distribution/DistributionChooseSymbolDialog$Companion;", "", "<init>", "()V", "DISTRIBUTION_CHOOSE_SYMBOL_DIALOG_KEY", "", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.kubi.futures.trade.welfare.distribution.DistributionChooseSymbolDialog$a */
    /* JADX INFO: compiled from: DistributionChooseSymbolDialog.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C14273a implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1 f24691b;

        public C14273a(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f24691b = function;
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
            return this.f24691b;
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f24691b.invoke(obj);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX INFO: renamed from: E4 */
    private final WrapperLoadingView m28481E4() {
        return (WrapperLoadingView) this.f24690u0.getValue();
    }

    /* JADX INFO: renamed from: F4 */
    private final FuturesWelfareTrialItemEntity m28482F4() {
        return (FuturesWelfareTrialItemEntity) this.f24689t0.getValue();
    }

    /* JADX INFO: renamed from: w4 */
    public static final DistributionChooseSymbolAdapter m28503w4(final DistributionChooseSymbolDialog distributionChooseSymbolDialog) {
        return new DistributionChooseSymbolAdapter(new Function1() { // from class: com.kubi.futures.trade.welfare.distribution.y
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DistributionChooseSymbolDialog.m28504x4(this.f24782b, (DistributionQuoteEntity) obj);
            }
        }, new Function1() { // from class: com.kubi.futures.trade.welfare.distribution.z
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DistributionChooseSymbolDialog.m28506z4(this.f24783b, (DistributionQuoteEntity) obj);
            }
        }, new Function0() { // from class: com.kubi.futures.trade.welfare.distribution.a0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DistributionChooseSymbolDialog.m28480B4(this.f24712b);
            }
        });
    }

    /* JADX INFO: renamed from: x4 */
    public static final Unit m28504x4(final DistributionChooseSymbolDialog distributionChooseSymbolDialog, DistributionQuoteEntity it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Fragment parentFragment = distributionChooseSymbolDialog.getParentFragment();
        BaseFragment baseFragment = parentFragment instanceof BaseFragment ? (BaseFragment) parentFragment : null;
        if (baseFragment != null) {
            DistributionChooseSymbolViewModel distributionChooseSymbolViewModelM28509G4 = distributionChooseSymbolDialog.m28509G4();
            FuturesWelfareTrialItemEntity futuresWelfareTrialItemEntityM28482F4 = distributionChooseSymbolDialog.m28482F4();
            String code = futuresWelfareTrialItemEntityM28482F4 != null ? futuresWelfareTrialItemEntityM28482F4.getCode() : null;
            if (code == null) {
                code = "";
            }
            distributionChooseSymbolViewModelM28509G4.m28534H(baseFragment, code, true, C27041f.m66668h(it.getSymbol()), new Action() { // from class: com.kubi.futures.trade.welfare.distribution.q
                @Override // io.reactivex.functions.Action
                public final void run() {
                    DistributionChooseSymbolDialog.m28505y4(this.f24770b);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: z4 */
    public static final Unit m28506z4(final DistributionChooseSymbolDialog distributionChooseSymbolDialog, DistributionQuoteEntity it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Fragment parentFragment = distributionChooseSymbolDialog.getParentFragment();
        BaseFragment baseFragment = parentFragment instanceof BaseFragment ? (BaseFragment) parentFragment : null;
        if (baseFragment != null) {
            DistributionChooseSymbolViewModel distributionChooseSymbolViewModelM28509G4 = distributionChooseSymbolDialog.m28509G4();
            FuturesWelfareTrialItemEntity futuresWelfareTrialItemEntityM28482F4 = distributionChooseSymbolDialog.m28482F4();
            String code = futuresWelfareTrialItemEntityM28482F4 != null ? futuresWelfareTrialItemEntityM28482F4.getCode() : null;
            if (code == null) {
                code = "";
            }
            distributionChooseSymbolViewModelM28509G4.m28534H(baseFragment, code, false, C27041f.m66668h(it.getSymbol()), new Action() { // from class: com.kubi.futures.trade.welfare.distribution.r
                @Override // io.reactivex.functions.Action
                public final void run() {
                    DistributionChooseSymbolDialog.m28479A4(this.f24772b);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: C4 */
    public final DistributionChooseSymbolAdapter m28507C4() {
        return (DistributionChooseSymbolAdapter) this.f24687r0.getValue();
    }

    /* JADX INFO: renamed from: D4 */
    public final C36841t m28508D4() {
        return (C36841t) this.f24686q0.getValue(this, f24685w0[0]);
    }

    /* JADX INFO: renamed from: G4 */
    public final DistributionChooseSymbolViewModel m28509G4() {
        return (DistributionChooseSymbolViewModel) this.f24688s0.getValue();
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper
    /* JADX INFO: renamed from: N3 */
    public int mo24511N3() {
        return 8;
    }

    /* JADX INFO: renamed from: N4 */
    public final void m28510N4() {
        FragmentManager childFragmentManager;
        DistributionFinishDialog distributionFinishDialog = new DistributionFinishDialog();
        Fragment parentFragment = getParentFragment();
        if (parentFragment == null || (childFragmentManager = parentFragment.getChildFragmentManager()) == null) {
            return;
        }
        distributionFinishDialog.show(childFragmentManager, "DistributionFinishDialog");
        dismiss();
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return inflater.inflate(R$layout.bkumex_dialog_future_bonus_distribution_choose_symbol, container);
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.Fragment
    @SuppressLint({"NotifyDataSetChanged"})
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Window window;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        m54191p3();
        if (m28482F4() == null) {
            dismiss();
            return;
        }
        ViewExtKt.m66578i(view, (int) (((double) C5267e0.m6182d()) * 0.9d));
        C36841t c36841tM28508D4 = m28508D4();
        if (c36841tM28508D4 == null) {
            return;
        }
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setSoftInputMode(48);
        }
        Dialog dialog2 = getDialog();
        if (dialog2 != null) {
            dialog2.setCancelable(false);
        }
        AppCompatImageView close = c36841tM28508D4.f81053b;
        Intrinsics.checkNotNullExpressionValue(close, "close");
        C27046k.m66711z(close, 0L, new Function0() { // from class: com.kubi.futures.trade.welfare.distribution.u
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DistributionChooseSymbolDialog.m28484I4(this.f24778b);
            }
        }, 1, null);
        c36841tM28508D4.f81054c.addItemDecoration(new SpaceItemDecoration());
        c36841tM28508D4.f81054c.setAdapter(m28507C4());
        m28509G4().m28531D().observe(getViewLifecycleOwner(), new C14273a(new Function1() { // from class: com.kubi.futures.trade.welfare.distribution.v
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DistributionChooseSymbolDialog.m28485J4(this.f24779b, (Boolean) obj);
            }
        }));
        m28509G4().m28532E().observe(getViewLifecycleOwner(), new C14273a(new Function1() { // from class: com.kubi.futures.trade.welfare.distribution.w
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DistributionChooseSymbolDialog.m28486K4(this.f24780b, (List) obj);
            }
        }));
        m28509G4().m28530C().observe(getViewLifecycleOwner(), new C14273a(new Function1() { // from class: com.kubi.futures.trade.welfare.distribution.x
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DistributionChooseSymbolDialog.m28487L4(this.f24781b, (Throwable) obj);
            }
        }));
        WrapperLoadingView wrapperLoadingViewM28481E4 = m28481E4();
        if (wrapperLoadingViewM28481E4 != null) {
            wrapperLoadingViewM28481E4.showLoading();
        }
        DistributionChooseSymbolViewModel distributionChooseSymbolViewModelM28509G4 = m28509G4();
        FuturesWelfareTrialItemEntity futuresWelfareTrialItemEntityM28482F4 = m28482F4();
        distributionChooseSymbolViewModelM28509G4.m28528A(C27041f.m66668h(futuresWelfareTrialItemEntityM28482F4 != null ? futuresWelfareTrialItemEntityM28482F4.getCode() : null));
    }

    public DistributionChooseSymbolDialog() {
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.kubi.futures.trade.welfare.distribution.DistributionChooseSymbolDialog$special$$inlined$viewModels$default$1
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
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.kubi.futures.trade.welfare.distribution.DistributionChooseSymbolDialog$special$$inlined$viewModels$default$2
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
        this.f24688s0 = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(DistributionChooseSymbolViewModel.class), new Function0<ViewModelStore>() { // from class: com.kubi.futures.trade.welfare.distribution.DistributionChooseSymbolDialog$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m103549viewModels$lambda1(lazy).getMViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.kubi.futures.trade.welfare.distribution.DistributionChooseSymbolDialog$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.kubi.futures.trade.welfare.distribution.DistributionChooseSymbolDialog$special$$inlined$viewModels$default$5
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
        this.f24689t0 = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.trade.welfare.distribution.s
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DistributionChooseSymbolDialog.m28489O4(this.f24774b);
            }
        });
        this.f24690u0 = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.trade.welfare.distribution.t
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DistributionChooseSymbolDialog.m28483H4(this.f24777b);
            }
        });
    }

    /* JADX INFO: renamed from: A4 */
    public static final void m28479A4(DistributionChooseSymbolDialog distributionChooseSymbolDialog) {
        distributionChooseSymbolDialog.m28510N4();
    }

    /* JADX INFO: renamed from: B4 */
    public static final Unit m28480B4(DistributionChooseSymbolDialog distributionChooseSymbolDialog) {
        String code;
        DistributionChooseSymbolViewModel distributionChooseSymbolViewModelM28509G4 = distributionChooseSymbolDialog.m28509G4();
        FuturesWelfareTrialItemEntity futuresWelfareTrialItemEntityM28482F4 = distributionChooseSymbolDialog.m28482F4();
        if (futuresWelfareTrialItemEntityM28482F4 != null) {
            code = futuresWelfareTrialItemEntityM28482F4.getCode();
        } else {
            code = null;
        }
        distributionChooseSymbolViewModelM28509G4.m28528A(C27041f.m66668h(code));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: H4 */
    public static final WrapperLoadingView m28483H4(DistributionChooseSymbolDialog distributionChooseSymbolDialog) {
        RecyclerView recyclerView;
        C36841t c36841tM28508D4 = distributionChooseSymbolDialog.m28508D4();
        if (c36841tM28508D4 != null && (recyclerView = c36841tM28508D4.f81054c) != null) {
            return WrapperLoadingView.injectView(recyclerView);
        }
        return null;
    }

    /* JADX INFO: renamed from: I4 */
    public static final Unit m28484I4(DistributionChooseSymbolDialog distributionChooseSymbolDialog) {
        C43852m.m96591c(C17060n0.m36552b(), "RealTimeRewardTrialOrder", "3", null, 8, null);
        distributionChooseSymbolDialog.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: J4 */
    public static final Unit m28485J4(DistributionChooseSymbolDialog distributionChooseSymbolDialog, Boolean bool) {
        BaseActivity baseActivity;
        BaseActivity baseActivity2 = null;
        if (bool.booleanValue()) {
            FragmentActivity activity = distributionChooseSymbolDialog.getActivity();
            if (activity instanceof BaseActivity) {
                baseActivity2 = (BaseActivity) activity;
            }
            if (baseActivity2 != null) {
                baseActivity2.showLoadingDialog();
            }
        } else {
            FragmentActivity activity2 = distributionChooseSymbolDialog.getActivity();
            if (activity2 instanceof BaseActivity) {
                baseActivity = (BaseActivity) activity2;
            } else {
                baseActivity = null;
            }
            if (baseActivity != null) {
                BaseActivity.hideLoadingDialog$default(baseActivity, false, 1, null);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: K4 */
    public static final Unit m28486K4(DistributionChooseSymbolDialog distributionChooseSymbolDialog, List list) {
        WrapperLoadingView wrapperLoadingViewM28481E4 = distributionChooseSymbolDialog.m28481E4();
        if (wrapperLoadingViewM28481E4 != null) {
            wrapperLoadingViewM28481E4.showContent();
        }
        DistributionChooseSymbolAdapter distributionChooseSymbolAdapterM28507C4 = distributionChooseSymbolDialog.m28507C4();
        Intrinsics.checkNotNull(list);
        distributionChooseSymbolAdapterM28507C4.m28583s(list);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: L4 */
    public static final Unit m28487L4(final DistributionChooseSymbolDialog distributionChooseSymbolDialog, Throwable th2) {
        WrapperLoadingView wrapperLoadingViewM28481E4 = distributionChooseSymbolDialog.m28481E4();
        if (wrapperLoadingViewM28481E4 != null) {
            wrapperLoadingViewM28481E4.showEmpty(R$string.load_failed_click_retry, R$drawable.ic2_common_network_error, new View.OnClickListener() { // from class: com.kubi.futures.trade.welfare.distribution.p
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    DistributionChooseSymbolDialog.m28488M4(this.f24768b, view);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: M4 */
    public static final void m28488M4(DistributionChooseSymbolDialog distributionChooseSymbolDialog, View view) {
        String code;
        WrapperLoadingView wrapperLoadingViewM28481E4 = distributionChooseSymbolDialog.m28481E4();
        if (wrapperLoadingViewM28481E4 != null) {
            wrapperLoadingViewM28481E4.showLoading();
        }
        DistributionChooseSymbolViewModel distributionChooseSymbolViewModelM28509G4 = distributionChooseSymbolDialog.m28509G4();
        FuturesWelfareTrialItemEntity futuresWelfareTrialItemEntityM28482F4 = distributionChooseSymbolDialog.m28482F4();
        if (futuresWelfareTrialItemEntityM28482F4 != null) {
            code = futuresWelfareTrialItemEntityM28482F4.getCode();
        } else {
            code = null;
        }
        distributionChooseSymbolViewModelM28509G4.m28528A(C27041f.m66668h(code));
    }

    /* JADX INFO: renamed from: O4 */
    public static final FuturesWelfareTrialItemEntity m28489O4(DistributionChooseSymbolDialog distributionChooseSymbolDialog) {
        Bundle arguments = distributionChooseSymbolDialog.getArguments();
        if (arguments != null) {
            return (FuturesWelfareTrialItemEntity) RouteExKt.m56274t(arguments, "data");
        }
        return null;
    }

    /* JADX INFO: renamed from: y4 */
    public static final void m28505y4(DistributionChooseSymbolDialog distributionChooseSymbolDialog) {
        distributionChooseSymbolDialog.m28510N4();
    }
}
