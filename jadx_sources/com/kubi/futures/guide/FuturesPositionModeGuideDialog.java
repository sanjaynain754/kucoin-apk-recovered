package com.kubi.futures.guide;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.blankj.utilcode.util.C5267e0;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.kubi.futures.settings.vm.ModifyPositionModeViewModel;
import com.kubi.futures.trade.submit.FuturesSubmitViewModel;
import com.kubi.futures.trade.submit.p;
import com.kubi.kumex.R$layout;
import com.kubi.kumex.R$string;
import com.kubi.kumex.guide.DialogFragmentGuide;
import com.kubi.kumex.utils.C17058m0;
import com.kubi.kumex.utils.C17060n0;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.resources.widget.button.KcSecondaryButton;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.DataMapUtil;
import com.kubi.utils.ToastCompat;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tuicore.TUIConstants;
import dm.C36830r0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43852m;
import p852kotlin.Function;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.Metadata;
import p852kotlin.Pair;
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

/* JADX INFO: compiled from: FuturesPositionModeGuideDialog.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u0000 02\u00020\u0001:\u00010B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u001c\u001a\u00020\u0005H\u0016J&\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\u001a\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u001e2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\u0010\u0010(\u001a\u00020&2\u0006\u0010)\u001a\u00020*H\u0002J\b\u0010+\u001a\u00020,H\u0016J\b\u0010-\u001a\u00020&H\u0016J\b\u0010.\u001a\u00020&H\u0016J\b\u0010/\u001a\u00020&H\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0010\u001a\u0004\u0018\u00010\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0016\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019¨\u00061"}, m90084d2 = {"Lcom/kubi/futures/guide/FuturesPositionModeGuideDialog;", "Lcom/kubi/kumex/guide/DialogFragmentGuide;", "manager", "Landroidx/fragment/app/FragmentManager;", "priority", "", "runnable", "Ljava/lang/Runnable;", "<init>", "(Landroidx/fragment/app/FragmentManager;ILjava/lang/Runnable;)V", "getManager", "()Landroidx/fragment/app/FragmentManager;", "getPriority", "()I", "getRunnable", "()Ljava/lang/Runnable;", "viewBinding", "Lcom/kubi/kumex/databinding/BkumexDialogPositionModeGuideBinding;", "getViewBinding", "()Lcom/kubi/kumex/databinding/BkumexDialogPositionModeGuideBinding;", "viewBinding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "viewModel", "Lcom/kubi/futures/settings/vm/ModifyPositionModeViewModel;", "getViewModel", "()Lcom/kubi/futures/settings/vm/ModifyPositionModeViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "initType", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "track", "locationId", "", "isBottomSheet", "", "showGuide", "onDestroyView", "onResume", "Companion", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFuturesPositionModeGuideDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FuturesPositionModeGuideDialog.kt\ncom/kubi/futures/guide/FuturesPositionModeGuideDialog\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 4 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,125:1\n143#2,20:126\n106#3,15:146\n310#4:161\n326#4,4:162\n311#4:166\n*S KotlinDebug\n*F\n+ 1 FuturesPositionModeGuideDialog.kt\ncom/kubi/futures/guide/FuturesPositionModeGuideDialog\n*L\n42#1:126,20\n44#1:146,15\n119#1:161\n119#1:162,4\n119#1:166\n*E\n"})
public final class FuturesPositionModeGuideDialog extends DialogFragmentGuide {

    /* JADX INFO: renamed from: q0 */
    @NotNull
    public final FragmentManager f23066q0;

    /* JADX INFO: renamed from: r0 */
    public final int f23067r0;

    /* JADX INFO: renamed from: s0 */
    @NotNull
    public final Runnable f23068s0;

    /* JADX INFO: renamed from: t0 */
    @NotNull
    public final InterfaceC24293a f23069t0;

    /* JADX INFO: renamed from: u0 */
    @NotNull
    public final Lazy f23070u0;

    /* JADX INFO: renamed from: w0 */
    public static final /* synthetic */ KProperty<Object>[] f23064w0 = {Reflection.property1(new PropertyReference1Impl(FuturesPositionModeGuideDialog.class, "viewBinding", "getViewBinding()Lcom/kubi/kumex/databinding/BkumexDialogPositionModeGuideBinding;", 0))};

    /* JADX INFO: renamed from: v0 */
    @NotNull
    public static final Companion f23063v0 = new Companion(null);

    /* JADX INFO: renamed from: x0 */
    @NotNull
    public static final String f23065x0 = "FuturesPositionModeGuideDialog";

    /* JADX INFO: compiled from: FuturesPositionModeGuideDialog.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/futures/guide/FuturesPositionModeGuideDialog$Companion;", "", "<init>", "()V", "Key", "", "getKey", "()Ljava/lang/String;", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final String getKey() {
            return FuturesPositionModeGuideDialog.f23065x0;
        }
    }

    /* JADX INFO: renamed from: com.kubi.futures.guide.FuturesPositionModeGuideDialog$a */
    /* JADX INFO: compiled from: FuturesPositionModeGuideDialog.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C13198a implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1 f23071b;

        public C13198a(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f23071b = function;
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
            return this.f23071b;
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f23071b.invoke(obj);
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

    public FuturesPositionModeGuideDialog(@NotNull FragmentManager manager, int i11, @NotNull Runnable runnable) {
        Intrinsics.checkNotNullParameter(manager, "manager");
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        this.f23066q0 = manager;
        this.f23067r0 = i11;
        this.f23068s0 = runnable;
        this.f23069t0 = C45681e.m100799e(this, new Function1<FuturesPositionModeGuideDialog, C36830r0>() { // from class: com.kubi.futures.guide.FuturesPositionModeGuideDialog$special$$inlined$viewBindingFragment$default$2
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final C36830r0 invoke(@NotNull FuturesPositionModeGuideDialog fragment) {
                Intrinsics.checkNotNullParameter(fragment, "fragment");
                return C36830r0.m82523a(fragment.requireView());
            }
        }, new Function1<C36830r0, Unit>() { // from class: com.kubi.futures.guide.FuturesPositionModeGuideDialog$special$$inlined$viewBindingFragment$default$1
            public final void invoke(@NotNull C36830r0 it) {
                Intrinsics.checkNotNullParameter(it, "it");
            }

            @Override // p852kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C36830r0 c36830r0) {
                invoke(c36830r0);
                return Unit.INSTANCE;
            }
        });
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.kubi.futures.guide.FuturesPositionModeGuideDialog$special$$inlined$viewModels$default$1
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
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.kubi.futures.guide.FuturesPositionModeGuideDialog$special$$inlined$viewModels$default$2
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
        this.f23070u0 = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(ModifyPositionModeViewModel.class), new Function0<ViewModelStore>() { // from class: com.kubi.futures.guide.FuturesPositionModeGuideDialog$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m103549viewModels$lambda1(lazy).getMViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.kubi.futures.guide.FuturesPositionModeGuideDialog$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.kubi.futures.guide.FuturesPositionModeGuideDialog$special$$inlined$viewModels$default$5
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

    /* JADX INFO: renamed from: q4 */
    private final ModifyPositionModeViewModel m25586q4() {
        return (ModifyPositionModeViewModel) this.f23070u0.getValue();
    }

    /* JADX INFO: renamed from: r4 */
    public static final Unit m25587r4(FuturesPositionModeGuideDialog futuresPositionModeGuideDialog) {
        futuresPositionModeGuideDialog.m25592u4("1");
        futuresPositionModeGuideDialog.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: s4 */
    public static final Unit m25588s4(C36830r0 c36830r0, FuturesPositionModeGuideDialog futuresPositionModeGuideDialog) {
        if (c36830r0.f80945h.getF44406k()) {
            return Unit.INSTANCE;
        }
        futuresPositionModeGuideDialog.m25592u4("2");
        c36830r0.f80945h.m55043o();
        futuresPositionModeGuideDialog.m25586q4().m26404r("HEDGE", false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: t4 */
    public static final Unit m25589t4(C36830r0 c36830r0, FuturesPositionModeGuideDialog futuresPositionModeGuideDialog, Pair pair) {
        FuturesSubmitViewModel futuresSubmitViewModelA;
        c36830r0.f80945h.mo28851l();
        if (((Boolean) pair.getFirst()).booleanValue()) {
            Fragment parentFragment = futuresPositionModeGuideDialog.getParentFragment();
            if (parentFragment != null && (futuresSubmitViewModelA = p.a(parentFragment)) != null) {
                futuresSubmitViewModelA.j0("HEDGE");
            }
            futuresPositionModeGuideDialog.dismissAllowingStateLoss();
            ToastCompat.m66437C(R$string.common_setting_successful);
        } else {
            C17058m0.m36550e(futuresPositionModeGuideDialog, (Throwable) pair.getSecond());
        }
        return Unit.INSTANCE;
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper
    /* JADX INFO: renamed from: N3 */
    public int mo24511N3() {
        return -11;
    }

    @Override // com.kubi.kumex.guide.StepGuide
    /* JADX INFO: renamed from: getPriority, reason: from getter */
    public int getF23048c() {
        return this.f23067r0;
    }

    @Override // com.kubi.kumex.guide.StepGuide
    @NotNull
    /* JADX INFO: renamed from: getRunnable, reason: from getter */
    public Runnable getF23049d() {
        return this.f23068s0;
    }

    @NotNull
    /* JADX INFO: renamed from: o4, reason: from getter */
    public FragmentManager getF23066q0() {
        return this.f23066q0;
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        m54235d4(0.85f);
        return inflater.inflate(R$layout.bkumex_dialog_position_mode_guide, container, false);
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        final C36830r0 c36830r0M25591p4 = m25591p4();
        if (c36830r0M25591p4 == null) {
            return;
        }
        C43852m.m96595g(C17060n0.m36552b(), "DuaPositionTradingGuide", "2", null, 8, null);
        KcSecondaryButton tvLater = c36830r0M25591p4.f80948k;
        Intrinsics.checkNotNullExpressionValue(tvLater, "tvLater");
        C27046k.m66711z(tvLater, 0L, new Function0() { // from class: com.kubi.futures.guide.e
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FuturesPositionModeGuideDialog.m25587r4(this.f23080b);
            }
        }, 1, null);
        KcPrimaryButton tvConfirm = c36830r0M25591p4.f80945h;
        Intrinsics.checkNotNullExpressionValue(tvConfirm, "tvConfirm");
        C27046k.m66711z(tvConfirm, 0L, new Function0() { // from class: com.kubi.futures.guide.f
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FuturesPositionModeGuideDialog.m25588s4(c36830r0M25591p4, this);
            }
        }, 1, null);
        m25586q4().m26403q().observe(getViewLifecycleOwner(), new C13198a(new Function1() { // from class: com.kubi.futures.guide.g
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesPositionModeGuideDialog.m25589t4(c36830r0M25591p4, this, (Pair) obj);
            }
        }));
        Dialog dialog = getDialog();
        Intrinsics.checkNotNull(dialog, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
        BottomSheetBehavior<FrameLayout> behavior = ((BottomSheetDialog) dialog).getBehavior();
        behavior.setMaxHeight((int) (C5267e0.m6182d() * 0.85f));
        behavior.setPeekHeight(behavior.getMaxHeight());
    }

    /* JADX INFO: renamed from: p4 */
    public final C36830r0 m25591p4() {
        return (C36830r0) this.f23069t0.getValue(this, f23064w0[0]);
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        m33769j4(f23065x0);
        DataMapUtil.f54245a.m66378m("kumex_top_right_notice", 4);
        getF23049d().run();
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onResume() {
        LinearLayout root;
        super.onResume();
        C36830r0 c36830r0M25591p4 = m25591p4();
        if (c36830r0M25591p4 != null && (root = c36830r0M25591p4.getRoot()) != null) {
            ViewGroup.LayoutParams layoutParams = root.getLayoutParams();
            if (layoutParams != null) {
                Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.setMarginStart(0);
                marginLayoutParams.setMarginEnd(0);
                root.setLayoutParams(layoutParams);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
    }

    @Override // com.kubi.kumex.guide.StepGuide
    /* JADX INFO: renamed from: q2 */
    public void mo25565q2() {
        if (getF23066q0().isDestroyed() && getF23066q0().isStateSaved()) {
            return;
        }
        show(getF23066q0(), f23065x0);
    }

    /* JADX INFO: renamed from: u4 */
    public final void m25592u4(String str) {
        C43852m.m96591c(C17060n0.m36552b(), "DuaPositionTradingStrongGuideSuccess", str, null, 8, null);
    }
}
