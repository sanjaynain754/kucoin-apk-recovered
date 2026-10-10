package com.kubi.futures.settings;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.core.os.BundleKt;
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
import com.kubi.futures.settings.vm.HedgeAutoDepositViewModel;
import com.kubi.kumex.R$layout;
import com.kubi.kumex.utils.C17058m0;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.resources.widget.KcSwitchButton;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.sdk.BaseActivity;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tim.push.model.TIMPushProvider;
import com.tencent.qcloud.tuicore.TUIConstants;
import dm.C36752e0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Function;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.FunctionAdapter;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Ref;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import w00.C45681e;

/* JADX INFO: compiled from: HedgeAutoDepositDialog.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u0000 /2\u00020\u0001:\u0001/B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010 \u001a\u00020\u0016H\u0016J$\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&2\b\u0010'\u001a\u0004\u0018\u00010(H\u0016J\u001a\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\"2\b\u0010'\u001a\u0004\u0018\u00010(H\u0016J \u0010,\u001a\u00020*2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010-\u001a\u00020\u00162\u0006\u0010.\u001a\u00020\u0016H\u0002R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0015\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u000f\u001a\u0004\b\u0015\u0010\u0017R\u001d\u0010\u0019\u001a\u0004\u0018\u00010\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u000f\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010\u001d\u001a\u0004\u0018\u00010\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u000f\u001a\u0004\b\u001e\u0010\u001b¨\u00060"}, m90084d2 = {"Lcom/kubi/futures/settings/HedgeAutoDepositDialog;", "Lcom/kubi/resources/dialog/DialogFragmentHelper;", "<init>", "()V", "viewBinding", "Lcom/kubi/kumex/databinding/BkumexDialogHedgeAutoDepositBinding;", "getViewBinding", "()Lcom/kubi/kumex/databinding/BkumexDialogHedgeAutoDepositBinding;", "viewBinding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "viewModel", "Lcom/kubi/futures/settings/vm/HedgeAutoDepositViewModel;", "getViewModel", "()Lcom/kubi/futures/settings/vm/HedgeAutoDepositViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "symbol", "", "getSymbol", "()Ljava/lang/String;", "symbol$delegate", "isTrial", "", "()Z", "isTrial$delegate", "longSwitchChecked", "getLongSwitchChecked", "()Ljava/lang/Boolean;", "longSwitchChecked$delegate", "shortSwitchChecked", "getShortSwitchChecked", "shortSwitchChecked$delegate", "isBottomSheet", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "sendResult", "longOpen", "shortOpen", "Companion", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nHedgeAutoDepositDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HedgeAutoDepositDialog.kt\ncom/kubi/futures/settings/HedgeAutoDepositDialog\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,142:1\n143#2,20:143\n106#3,15:163\n*S KotlinDebug\n*F\n+ 1 HedgeAutoDepositDialog.kt\ncom/kubi/futures/settings/HedgeAutoDepositDialog\n*L\n49#1:143,20\n51#1:163,15\n*E\n"})
public final class HedgeAutoDepositDialog extends DialogFragmentHelper {

    /* JADX INFO: renamed from: q0 */
    @NotNull
    public final InterfaceC24293a f23148q0 = C45681e.m100799e(this, new Function1<HedgeAutoDepositDialog, C36752e0>() { // from class: com.kubi.futures.settings.HedgeAutoDepositDialog$special$$inlined$viewBindingFragment$default$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C36752e0 invoke(@NotNull HedgeAutoDepositDialog fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C36752e0.m82355a(fragment.requireView());
        }
    }, new Function1<C36752e0, Unit>() { // from class: com.kubi.futures.settings.HedgeAutoDepositDialog$special$$inlined$viewBindingFragment$default$1
        public final void invoke(@NotNull C36752e0 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C36752e0 c36752e0) {
            invoke(c36752e0);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: r0 */
    @NotNull
    public final Lazy f23149r0;

    /* JADX INFO: renamed from: s0 */
    @NotNull
    public final Lazy f23150s0;

    /* JADX INFO: renamed from: t0 */
    @NotNull
    public final Lazy f23151t0;

    /* JADX INFO: renamed from: u0 */
    @NotNull
    public final Lazy f23152u0;

    /* JADX INFO: renamed from: v0 */
    @NotNull
    public final Lazy f23153v0;

    /* JADX INFO: renamed from: x0 */
    public static final /* synthetic */ KProperty<Object>[] f23147x0 = {Reflection.property1(new PropertyReference1Impl(HedgeAutoDepositDialog.class, "viewBinding", "getViewBinding()Lcom/kubi/kumex/databinding/BkumexDialogHedgeAutoDepositBinding;", 0))};

    /* JADX INFO: renamed from: w0 */
    @NotNull
    public static final Companion f23146w0 = new Companion(null);

    /* JADX INFO: compiled from: HedgeAutoDepositDialog.kt */
    @Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J.\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b¨\u0006\u000e"}, m90084d2 = {"Lcom/kubi/futures/settings/HedgeAutoDepositDialog$Companion;", "", "<init>", "()V", TIMPushProvider.f75062n, "", "manager", "Landroidx/fragment/app/FragmentManager;", "symbol", "", "isTrial", "", "longOpen", "shortOpen", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final void show(@NotNull FragmentManager manager, @NotNull String symbol, boolean isTrial, boolean longOpen, boolean shortOpen) {
            Intrinsics.checkNotNullParameter(manager, "manager");
            Intrinsics.checkNotNullParameter(symbol, "symbol");
            Bundle bundleBundleOf = BundleKt.bundleOf(TuplesKt.m90091to("symbol", symbol), TuplesKt.m90091to("data", Boolean.valueOf(isTrial)), TuplesKt.m90091to("data_1", Boolean.valueOf(longOpen)), TuplesKt.m90091to("data_2", Boolean.valueOf(shortOpen)));
            HedgeAutoDepositDialog hedgeAutoDepositDialog = new HedgeAutoDepositDialog();
            hedgeAutoDepositDialog.setArguments(bundleBundleOf);
            hedgeAutoDepositDialog.show(manager, "HedgeAutoDepositDialog");
        }
    }

    /* JADX INFO: renamed from: com.kubi.futures.settings.HedgeAutoDepositDialog$a */
    /* JADX INFO: compiled from: HedgeAutoDepositDialog.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C13238a implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1 f23154b;

        public C13238a(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f23154b = function;
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
            return this.f23154b;
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f23154b.invoke(obj);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, com.kubi.resources.dialog.BaseDialogFragment
    /* JADX INFO: renamed from: k3 */
    public boolean mo15372k3() {
        return true;
    }

    /* JADX INFO: renamed from: A4 */
    public static final void m25749A4(Ref.BooleanRef booleanRef, CompoundButton compoundButton, boolean z11) {
        booleanRef.element = z11;
    }

    /* JADX INFO: renamed from: B4 */
    public static final Unit m25750B4(C36752e0 c36752e0, HedgeAutoDepositDialog hedgeAutoDepositDialog, Ref.BooleanRef booleanRef, Ref.BooleanRef booleanRef2, Pair pair) {
        c36752e0.f79943b.mo28851l();
        c36752e0.f79945d.setEnabled(true);
        c36752e0.f79944c.setEnabled(true);
        if (((Boolean) pair.getFirst()).booleanValue()) {
            hedgeAutoDepositDialog.m25767C4(hedgeAutoDepositDialog.m25762t4(), booleanRef.element, booleanRef2.element);
            hedgeAutoDepositDialog.dismissAllowingStateLoss();
        } else {
            C17058m0.m36550e(hedgeAutoDepositDialog, (Throwable) pair.getSecond());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: E0 */
    private final boolean m25752E0() {
        return ((Boolean) this.f23151t0.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: t4 */
    private final String m25762t4() {
        return (String) this.f23150s0.getValue();
    }

    /* JADX INFO: renamed from: y4 */
    public static final Unit m25765y4(C36752e0 c36752e0, Ref.BooleanRef booleanRef, HedgeAutoDepositDialog hedgeAutoDepositDialog, Ref.BooleanRef booleanRef2) {
        if (c36752e0.f79943b.getF44406k()) {
            return Unit.INSTANCE;
        }
        if (Intrinsics.areEqual(Boolean.valueOf(booleanRef.element), hedgeAutoDepositDialog.m25768r4()) && Intrinsics.areEqual(Boolean.valueOf(booleanRef2.element), hedgeAutoDepositDialog.m25769s4())) {
            hedgeAutoDepositDialog.dismissAllowingStateLoss();
            return Unit.INSTANCE;
        }
        c36752e0.f79944c.setEnabled(false);
        c36752e0.f79945d.setEnabled(false);
        c36752e0.f79943b.m55043o();
        booleanRef.element = c36752e0.f79944c.isChecked();
        booleanRef2.element = c36752e0.f79945d.isChecked();
        hedgeAutoDepositDialog.m25771v4().m26377r(hedgeAutoDepositDialog.m25762t4(), hedgeAutoDepositDialog.m25752E0(), booleanRef.element, booleanRef2.element);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: z4 */
    public static final void m25766z4(Ref.BooleanRef booleanRef, CompoundButton compoundButton, boolean z11) {
        booleanRef.element = z11;
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(R$layout.bkumex_dialog_hedge_auto_deposit, container, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        if (m25762t4().length() == 0) {
            dismissAllowingStateLoss();
            return;
        }
        final C36752e0 c36752e0M25770u4 = m25770u4();
        if (c36752e0M25770u4 == null) {
            return;
        }
        KcSwitchButton kcSwitchButton = c36752e0M25770u4.f79944c;
        Boolean boolM25768r4 = m25768r4();
        kcSwitchButton.setChecked(boolM25768r4 != null ? boolM25768r4.booleanValue() : false);
        KcSwitchButton kcSwitchButton2 = c36752e0M25770u4.f79945d;
        Boolean boolM25769s4 = m25769s4();
        kcSwitchButton2.setChecked(boolM25769s4 != null ? boolM25769s4.booleanValue() : false);
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        final Ref.BooleanRef booleanRef2 = new Ref.BooleanRef();
        KcPrimaryButton confirm = c36752e0M25770u4.f79943b;
        Intrinsics.checkNotNullExpressionValue(confirm, "confirm");
        C27046k.m66711z(confirm, 0L, new Function0() { // from class: com.kubi.futures.settings.t0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HedgeAutoDepositDialog.m25765y4(c36752e0M25770u4, booleanRef, this, booleanRef2);
            }
        }, 1, null);
        c36752e0M25770u4.f79944c.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.kubi.futures.settings.u0
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
                HedgeAutoDepositDialog.m25766z4(booleanRef, compoundButton, z11);
            }
        });
        c36752e0M25770u4.f79945d.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.kubi.futures.settings.v0
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
                HedgeAutoDepositDialog.m25749A4(booleanRef2, compoundButton, z11);
            }
        });
        m25771v4().m26376q().observe(getViewLifecycleOwner(), new C13238a(new Function1() { // from class: com.kubi.futures.settings.w0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return HedgeAutoDepositDialog.m25750B4(c36752e0M25770u4, this, booleanRef, booleanRef2, (Pair) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: r4 */
    public final Boolean m25768r4() {
        return (Boolean) this.f23152u0.getValue();
    }

    /* JADX INFO: renamed from: s4 */
    public final Boolean m25769s4() {
        return (Boolean) this.f23153v0.getValue();
    }

    /* JADX INFO: renamed from: u4 */
    public final C36752e0 m25770u4() {
        return (C36752e0) this.f23148q0.getValue(this, f23147x0[0]);
    }

    /* JADX INFO: renamed from: v4 */
    public final HedgeAutoDepositViewModel m25771v4() {
        return (HedgeAutoDepositViewModel) this.f23149r0.getValue();
    }

    public HedgeAutoDepositDialog() {
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.kubi.futures.settings.HedgeAutoDepositDialog$special$$inlined$viewModels$default$1
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
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.kubi.futures.settings.HedgeAutoDepositDialog$special$$inlined$viewModels$default$2
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
        this.f23149r0 = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(HedgeAutoDepositViewModel.class), new Function0<ViewModelStore>() { // from class: com.kubi.futures.settings.HedgeAutoDepositDialog$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m103549viewModels$lambda1(lazy).getMViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.kubi.futures.settings.HedgeAutoDepositDialog$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.kubi.futures.settings.HedgeAutoDepositDialog$special$$inlined$viewModels$default$5
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
        this.f23150s0 = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.settings.p0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HedgeAutoDepositDialog.m25753E4(this.f23419b);
            }
        });
        this.f23151t0 = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.settings.q0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(HedgeAutoDepositDialog.m25763w4(this.f23426b));
            }
        });
        this.f23152u0 = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.settings.r0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HedgeAutoDepositDialog.m25764x4(this.f23433b);
            }
        });
        this.f23153v0 = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.settings.s0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HedgeAutoDepositDialog.m25751D4(this.f23441b);
            }
        });
    }

    /* JADX INFO: renamed from: D4 */
    public static final Boolean m25751D4(HedgeAutoDepositDialog hedgeAutoDepositDialog) {
        Bundle arguments = hedgeAutoDepositDialog.getArguments();
        if (arguments != null) {
            return Boolean.valueOf(arguments.getBoolean("data_2"));
        }
        return null;
    }

    /* JADX INFO: renamed from: E4 */
    public static final String m25753E4(HedgeAutoDepositDialog hedgeAutoDepositDialog) {
        String string;
        Bundle arguments = hedgeAutoDepositDialog.getArguments();
        if (arguments != null && (string = arguments.getString("symbol")) != null) {
            return string;
        }
        return "";
    }

    /* JADX INFO: renamed from: w4 */
    public static final boolean m25763w4(HedgeAutoDepositDialog hedgeAutoDepositDialog) {
        Bundle arguments = hedgeAutoDepositDialog.getArguments();
        if (arguments != null) {
            return arguments.getBoolean("data");
        }
        return false;
    }

    /* JADX INFO: renamed from: x4 */
    public static final Boolean m25764x4(HedgeAutoDepositDialog hedgeAutoDepositDialog) {
        Bundle arguments = hedgeAutoDepositDialog.getArguments();
        if (arguments != null) {
            return Boolean.valueOf(arguments.getBoolean("data_1"));
        }
        return null;
    }

    /* JADX INFO: renamed from: C4 */
    public final void m25767C4(String str, boolean z11, boolean z12) {
        BaseActivity baseActivity;
        FragmentActivity activity = getActivity();
        if (activity instanceof BaseActivity) {
            baseActivity = (BaseActivity) activity;
        } else {
            baseActivity = null;
        }
        if (baseActivity != null) {
            String name = HedgeAutoDepositDialog.class.getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            baseActivity.setFragmentResult(name, BundleKt.bundleOf(TuplesKt.m90091to("symbol", str), TuplesKt.m90091to("data_1", Boolean.valueOf(z11)), TuplesKt.m90091to("data_2", Boolean.valueOf(z12))));
        }
    }
}
