package com.kubi.futures.settings;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
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
import com.kubi.futures.settings.vm.ModifyPositionModeViewModel;
import com.kubi.kumex.R$drawable;
import com.kubi.kumex.R$layout;
import com.kubi.kumex.R$string;
import com.kubi.kumex.utils.C17058m0;
import com.kubi.kumex.utils.C17060n0;
import com.kubi.network.retrofit.exception.ApiException;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.resources.dialog.LoadingDialogFragment;
import com.kubi.sdk.BaseActivity;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.ToastCompat;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import com.tencent.qcloud.tim.push.model.TIMPushProvider;
import com.tencent.qcloud.tuicore.TUIConstants;
import dm.C36806n0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p569qq.C43852m;
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
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import w00.C45681e;

/* JADX INFO: compiled from: ModifyPositionModeDialog.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0003\n\u0002\b\t\u0018\u0000 +2\u00020\u0001:\u0001+B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\u001a\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00152\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\u001e\u0010\u001f\u001a\u00020\u001d2\u0014\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\"\u0012\u0006\u0012\u0004\u0018\u00010#0!H\u0002J\b\u0010$\u001a\u00020\u001dH\u0002J\b\u0010%\u001a\u00020\u001dH\u0002J\u0010\u0010&\u001a\u00020\u001d2\u0006\u0010'\u001a\u00020\u0013H\u0002J\u0018\u0010(\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00152\u0006\u0010)\u001a\u00020\"H\u0002J\b\u0010*\u001a\u00020\"H\u0016R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006,"}, m90084d2 = {"Lcom/kubi/futures/settings/ModifyPositionModeDialog;", "Lcom/kubi/resources/dialog/DialogFragmentHelper;", "<init>", "()V", "viewBinding", "Lcom/kubi/kumex/databinding/BkumexDialogModifyPositionModeBinding;", "getViewBinding", "()Lcom/kubi/kumex/databinding/BkumexDialogModifyPositionModeBinding;", "viewBinding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "viewModel", "Lcom/kubi/futures/settings/vm/ModifyPositionModeViewModel;", "getViewModel", "()Lcom/kubi/futures/settings/vm/ModifyPositionModeViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "clickIndex", "", "clickPositionMode", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "handleResult", DbParams.KEY_CHANNEL_RESULT, "Lkotlin/Pair;", "", "", "showLoading", "hideLoading", "sendResult", "positionMode", "setCheckBackground", "isChecked", "isBottomSheet", "Companion", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nModifyPositionModeDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModifyPositionModeDialog.kt\ncom/kubi/futures/settings/ModifyPositionModeDialog\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,174:1\n143#2,20:175\n106#3,15:195\n*S KotlinDebug\n*F\n+ 1 ModifyPositionModeDialog.kt\ncom/kubi/futures/settings/ModifyPositionModeDialog\n*L\n48#1:175,20\n50#1:195,15\n*E\n"})
public final class ModifyPositionModeDialog extends DialogFragmentHelper {

    /* JADX INFO: renamed from: q0 */
    @NotNull
    public final InterfaceC24293a f23181q0 = C45681e.m100799e(this, new Function1<ModifyPositionModeDialog, C36806n0>() { // from class: com.kubi.futures.settings.ModifyPositionModeDialog$special$$inlined$viewBindingFragment$default$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C36806n0 invoke(@NotNull ModifyPositionModeDialog fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C36806n0.m82473a(fragment.requireView());
        }
    }, new Function1<C36806n0, Unit>() { // from class: com.kubi.futures.settings.ModifyPositionModeDialog$special$$inlined$viewBindingFragment$default$1
        public final void invoke(@NotNull C36806n0 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C36806n0 c36806n0) {
            invoke(c36806n0);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: r0 */
    @NotNull
    public final Lazy f23182r0;

    /* JADX INFO: renamed from: s0 */
    public int f23183s0;

    /* JADX INFO: renamed from: t0 */
    @NotNull
    public String f23184t0;

    /* JADX INFO: renamed from: v0 */
    public static final /* synthetic */ KProperty<Object>[] f23180v0 = {Reflection.property1(new PropertyReference1Impl(ModifyPositionModeDialog.class, "viewBinding", "getViewBinding()Lcom/kubi/kumex/databinding/BkumexDialogModifyPositionModeBinding;", 0))};

    /* JADX INFO: renamed from: u0 */
    @NotNull
    public static final Companion f23179u0 = new Companion(null);

    /* JADX INFO: compiled from: ModifyPositionModeDialog.kt */
    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b¨\u0006\f"}, m90084d2 = {"Lcom/kubi/futures/settings/ModifyPositionModeDialog$Companion;", "", "<init>", "()V", TIMPushProvider.f75062n, "", "manager", "Landroidx/fragment/app/FragmentManager;", "positionMode", "", "isTrial", "", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final void show(@NotNull FragmentManager manager, @NotNull String positionMode, boolean isTrial) {
            Intrinsics.checkNotNullParameter(manager, "manager");
            Intrinsics.checkNotNullParameter(positionMode, "positionMode");
            ModifyPositionModeDialog modifyPositionModeDialog = new ModifyPositionModeDialog();
            modifyPositionModeDialog.setArguments(BundleKt.bundleOf(TuplesKt.m90091to("data_1", positionMode), TuplesKt.m90091to("data_2", Boolean.valueOf(isTrial))));
            modifyPositionModeDialog.show(manager, "ModifyPositionModeDialog");
        }
    }

    /* JADX INFO: renamed from: com.kubi.futures.settings.ModifyPositionModeDialog$a */
    /* JADX INFO: compiled from: ModifyPositionModeDialog.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C13259a implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1 f23185b;

        public C13259a(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f23185b = function;
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
            return this.f23185b;
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f23185b.invoke(obj);
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

    /* JADX INFO: renamed from: r4 */
    public static final Unit m25881r4(ModifyPositionModeDialog modifyPositionModeDialog, C36806n0 c36806n0, boolean z11) {
        if (modifyPositionModeDialog.f23183s0 == 0) {
            return Unit.INSTANCE;
        }
        modifyPositionModeDialog.f23184t0 = "HEDGE";
        c36806n0.f80641b.setEnabled(false);
        c36806n0.f80642c.setEnabled(false);
        modifyPositionModeDialog.m25886o4().m26404r(modifyPositionModeDialog.f23184t0, z11);
        C43852m.m96591c(C17060n0.m36552b(), "DuaPositionTradingSwitchSettings", "2", null, 8, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: s4 */
    public static final Unit m25882s4(ModifyPositionModeDialog modifyPositionModeDialog, C36806n0 c36806n0, boolean z11) {
        if (modifyPositionModeDialog.f23183s0 == 1) {
            return Unit.INSTANCE;
        }
        modifyPositionModeDialog.f23184t0 = "ONEWAY";
        c36806n0.f80641b.setEnabled(false);
        c36806n0.f80642c.setEnabled(false);
        modifyPositionModeDialog.m25886o4().m26404r(modifyPositionModeDialog.f23184t0, z11);
        C43852m.m96591c(C17060n0.m36552b(), "DuaPositionTradingSwitchSettings", "1", null, 8, null);
        return Unit.INSTANCE;
    }

    private final void showLoading() {
        LoadingDialogFragment loadingDialogFragment = new LoadingDialogFragment();
        loadingDialogFragment.setCancelable(false);
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        loadingDialogFragment.show(childFragmentManager, "Loading");
    }

    /* JADX INFO: renamed from: u4 */
    public static final Unit m25884u4(C36806n0 c36806n0, ModifyPositionModeDialog modifyPositionModeDialog, Boolean bool) {
        c36806n0.f80641b.setEnabled(true);
        c36806n0.f80642c.setEnabled(true);
        if (bool.booleanValue()) {
            modifyPositionModeDialog.showLoading();
        } else {
            modifyPositionModeDialog.m25880q4();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: n4 */
    public final C36806n0 m25885n4() {
        return (C36806n0) this.f23181q0.getValue(this, f23180v0[0]);
    }

    /* JADX INFO: renamed from: o4 */
    public final ModifyPositionModeViewModel m25886o4() {
        return (ModifyPositionModeViewModel) this.f23182r0.getValue();
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(R$layout.bkumex_dialog_modify_position_mode, container, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        String string;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        final C36806n0 c36806n0M25885n4 = m25885n4();
        if (c36806n0M25885n4 == null) {
            return;
        }
        Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("data_1")) == null) {
            string = "ONEWAY";
        }
        Bundle arguments2 = getArguments();
        final boolean z11 = arguments2 != null ? arguments2.getBoolean("data_2") : false;
        if (Intrinsics.areEqual(string, "HEDGE")) {
            ConstraintLayout clHedge = c36806n0M25885n4.f80641b;
            Intrinsics.checkNotNullExpressionValue(clHedge, "clHedge");
            m25889w4(clHedge, true);
            ConstraintLayout clOneWay = c36806n0M25885n4.f80642c;
            Intrinsics.checkNotNullExpressionValue(clOneWay, "clOneWay");
            m25889w4(clOneWay, false);
            this.f23183s0 = 0;
        } else {
            this.f23183s0 = 1;
            ConstraintLayout clOneWay2 = c36806n0M25885n4.f80642c;
            Intrinsics.checkNotNullExpressionValue(clOneWay2, "clOneWay");
            m25889w4(clOneWay2, true);
            ConstraintLayout clHedge2 = c36806n0M25885n4.f80641b;
            Intrinsics.checkNotNullExpressionValue(clHedge2, "clHedge");
            m25889w4(clHedge2, false);
        }
        ConstraintLayout clHedge3 = c36806n0M25885n4.f80641b;
        Intrinsics.checkNotNullExpressionValue(clHedge3, "clHedge");
        C27046k.m66711z(clHedge3, 0L, new Function0() { // from class: com.kubi.futures.settings.c2
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ModifyPositionModeDialog.m25881r4(this.f23298b, c36806n0M25885n4, z11);
            }
        }, 1, null);
        ConstraintLayout clOneWay3 = c36806n0M25885n4.f80642c;
        Intrinsics.checkNotNullExpressionValue(clOneWay3, "clOneWay");
        C27046k.m66711z(clOneWay3, 0L, new Function0() { // from class: com.kubi.futures.settings.d2
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ModifyPositionModeDialog.m25882s4(this.f23310b, c36806n0M25885n4, z11);
            }
        }, 1, null);
        m25886o4().m26403q().observe(getViewLifecycleOwner(), new C13259a(new Function1() { // from class: com.kubi.futures.settings.e2
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ModifyPositionModeDialog.m25883t4(this.f23322b, (Pair) obj);
            }
        }));
        m25886o4().m26402p().observe(getViewLifecycleOwner(), new C13259a(new Function1() { // from class: com.kubi.futures.settings.f2
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ModifyPositionModeDialog.m25884u4(c36806n0M25885n4, this, (Boolean) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: w4 */
    public final void m25889w4(View view, boolean z11) {
        view.setBackgroundResource(z11 ? R$drawable.shape_border_emphasis_8r : R$drawable.shape_border_emphasis8_8r);
    }

    public ModifyPositionModeDialog() {
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.kubi.futures.settings.ModifyPositionModeDialog$special$$inlined$viewModels$default$1
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
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.kubi.futures.settings.ModifyPositionModeDialog$special$$inlined$viewModels$default$2
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
        this.f23182r0 = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(ModifyPositionModeViewModel.class), new Function0<ViewModelStore>() { // from class: com.kubi.futures.settings.ModifyPositionModeDialog$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m103549viewModels$lambda1(lazy).getMViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.kubi.futures.settings.ModifyPositionModeDialog$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.kubi.futures.settings.ModifyPositionModeDialog$special$$inlined$viewModels$default$5
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
        this.f23183s0 = -1;
        this.f23184t0 = "";
    }

    /* JADX INFO: renamed from: q4 */
    private final void m25880q4() {
        LoadingDialogFragment loadingDialogFragment;
        Fragment fragmentFindFragmentByTag = getChildFragmentManager().findFragmentByTag("Loading");
        if (fragmentFindFragmentByTag instanceof LoadingDialogFragment) {
            loadingDialogFragment = (LoadingDialogFragment) fragmentFindFragmentByTag;
        } else {
            loadingDialogFragment = null;
        }
        if (loadingDialogFragment != null) {
            loadingDialogFragment.dismissAllowingStateLoss();
        }
    }

    /* JADX INFO: renamed from: t4 */
    public static final Unit m25883t4(ModifyPositionModeDialog modifyPositionModeDialog, Pair pair) throws JSONException {
        Intrinsics.checkNotNull(pair);
        modifyPositionModeDialog.m25887p4(pair);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: p4 */
    public final void m25887p4(Pair<Boolean, ? extends Throwable> pair) throws JSONException {
        String str;
        if (pair.getFirst().booleanValue()) {
            m25888v4(this.f23184t0);
            dismissAllowingStateLoss();
            ToastCompat.m66437C(R$string.common_setting_successful);
            C43852m.m96595g(C17060n0.m36552b(), "DuaPositionTradingSwitchError", null, new JSONObject().put("is_success", true).put("fail_reason", "none"), 4, null);
            return;
        }
        Throwable second = pair.getSecond();
        if (second == null) {
            return;
        }
        boolean z11 = second instanceof ApiException;
        if (z11) {
            str = ((ApiException) second).code;
        } else {
            str = "-00001";
        }
        C43852m.m96595g(C17060n0.m36552b(), "DuaPositionTradingSwitchError", null, new JSONObject().put("is_success", false).put("fail_reason", str + ':' + C27041f.m66668h(second.getMessage())), 4, null);
        if (z11 && Intrinsics.areEqual(((ApiException) second).code, "50010")) {
            C17058m0.m36547b(this, C27041f.m66668h(second.getMessage()));
        } else {
            C17058m0.m36549d(this, C27041f.m66668h(second.getMessage()));
        }
    }

    /* JADX INFO: renamed from: v4 */
    public final void m25888v4(String str) {
        BaseActivity baseActivity;
        FragmentActivity activity = getActivity();
        if (activity instanceof BaseActivity) {
            baseActivity = (BaseActivity) activity;
        } else {
            baseActivity = null;
        }
        if (baseActivity != null) {
            String name = ModifyPositionModeDialog.class.getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            baseActivity.setFragmentResult(name, BundleKt.bundleOf(TuplesKt.m90091to("data_1", str)));
        }
    }
}
