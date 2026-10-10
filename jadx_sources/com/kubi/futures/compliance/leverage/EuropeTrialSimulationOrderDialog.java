package com.kubi.futures.compliance.leverage;

import android.content.Context;
import android.os.Bundle;
import android.text.style.ForegroundColorSpan;
import android.text.style.TypefaceSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.kubi.broker.RepositoryServiceLocator;
import com.kubi.futures.FuturesDisplayNameUtils;
import com.kubi.futures.trade.welfare.FuturesReplaceTrialDialog;
import com.kubi.futures.trade.welfare.vm.FuturesTrialViewModel;
import com.kubi.kumex.R$color;
import com.kubi.kumex.R$drawable;
import com.kubi.kumex.R$font;
import com.kubi.kumex.R$layout;
import com.kubi.kumex.R$string;
import com.kubi.kumex.data.platform.model.ContractEntity;
import com.kubi.kumex.data.platform.model.FuturesWelfareTrialItemEntity;
import com.kubi.kumex.logic.constant.OrderTradeType;
import com.kubi.kumex.utils.C17054k0;
import com.kubi.kumex.utils.C17056l0;
import com.kubi.resources.C22890g;
import com.kubi.resources.HighlightTextHelper;
import com.kubi.resources.dialog.BaseDialogFragment;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.widget.loading.WrapperLoadingView;
import com.kubi.utils.C27017c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tim.push.model.TIMPushProvider;
import com.tencent.qcloud.tuicore.TUIConstants;
import dm.C36817p;
import java.math.BigDecimal;
import java.util.Iterator;
import kotlinx.coroutines.C41696j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p801yl.C46527h0;
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
import sh.EuropeUnlockLeverageBonusEntity;
import w00.C45681e;

/* JADX INFO: compiled from: EuropeTrialSimulationOrderDialog.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 H2\u00020\u0001:\u0001HB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010)\u001a\u00020 H\u0016J&\u0010*\u001a\u0004\u0018\u00010+2\u0006\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010/2\b\u00100\u001a\u0004\u0018\u000101H\u0016J\u001a\u00102\u001a\u0002032\u0006\u00104\u001a\u00020+2\b\u00100\u001a\u0004\u0018\u000101H\u0016J\b\u00105\u001a\u000203H\u0002J\b\u00106\u001a\u000203H\u0002J\u001e\u00107\u001a\u0002032\u0014\u00108\u001a\u0010\u0012\u0004\u0012\u00020:\u0012\u0006\u0012\u0004\u0018\u00010;09H\u0002J\u0010\u0010<\u001a\u0002032\u0006\u0010=\u001a\u00020;H\u0002J\b\u0010>\u001a\u00020(H\u0002J\u0012\u0010?\u001a\u0002032\b\u0010@\u001a\u0004\u0018\u00010AH\u0002J\b\u0010B\u001a\u000203H\u0002J\b\u0010C\u001a\u000203H\u0002J\b\u0010D\u001a\u000203H\u0002J\b\u0010E\u001a\u000203H\u0002J\f\u0010F\u001a\u00020G*\u00020GH\u0002R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001d\u0010\n\u001a\u0004\u0018\u00010\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0015\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u000f\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u001a\u001a\u0004\u0018\u00010\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u000f\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010\u001f\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\u000f\u001a\u0004\b!\u0010\"R\u001b\u0010$\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010\u000f\u001a\u0004\b%\u0010\"R\u000e\u0010'\u001a\u00020(X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006I"}, m90084d2 = {"Lcom/kubi/futures/compliance/leverage/EuropeTrialSimulationOrderDialog;", "Lcom/kubi/resources/dialog/DialogFragmentHelper;", "<init>", "()V", "viewBinding", "Lcom/kubi/kumex/databinding/BkumexDialogEuropeTrialSimulationOrderBinding;", "getViewBinding", "()Lcom/kubi/kumex/databinding/BkumexDialogEuropeTrialSimulationOrderBinding;", "viewBinding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "loadingView", "Lcom/kubi/sdk/widget/loading/WrapperLoadingView;", "getLoadingView", "()Lcom/kubi/sdk/widget/loading/WrapperLoadingView;", "loadingView$delegate", "Lkotlin/Lazy;", "trialViewModel", "Lcom/kubi/futures/trade/welfare/vm/FuturesTrialViewModel;", "getTrialViewModel", "()Lcom/kubi/futures/trade/welfare/vm/FuturesTrialViewModel;", "trialViewModel$delegate", "viewModel", "Lcom/kubi/futures/compliance/leverage/EuropeTrialSimulationOrderViewModel;", "getViewModel", "()Lcom/kubi/futures/compliance/leverage/EuropeTrialSimulationOrderViewModel;", "viewModel$delegate", "event", "Lcom/kubi/futures/compliance/leverage/EuropeUnlockLeverageFillOrderEvent;", "getEvent", "()Lcom/kubi/futures/compliance/leverage/EuropeUnlockLeverageFillOrderEvent;", "event$delegate", "finishCount", "", "getFinishCount", "()I", "finishCount$delegate", "totalCount", "getTotalCount", "totalCount$delegate", "symbol", "", "initType", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "setRootMinHeight", "initObserver", "handleActivateTrial", "pair", "Lkotlin/Pair;", "", "Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialItemEntity;", "showReplaceTrialDialog", "trial", "getCode", "setData", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "Lcom/kubi/futures/data/compliance/entity/EuropeUnlockLeverageBonusEntity;", "showError", "initView", "onSubmitResultChanged", "fillOrder", "findLastDialogFragment", "Landroidx/fragment/app/DialogFragment;", "Companion", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nEuropeTrialSimulationOrderDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EuropeTrialSimulationOrderDialog.kt\ncom/kubi/futures/compliance/leverage/EuropeTrialSimulationOrderDialog\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 4 MviEx.kt\ncom/kubi/mvi/common/MviExKt\n*L\n1#1,295:1\n143#2,20:296\n106#3,15:316\n220#4,5:331\n*S KotlinDebug\n*F\n+ 1 EuropeTrialSimulationOrderDialog.kt\ncom/kubi/futures/compliance/leverage/EuropeTrialSimulationOrderDialog\n*L\n69#1:296,20\n81#1:316,15\n78#1:331,5\n*E\n"})
public final class EuropeTrialSimulationOrderDialog extends DialogFragmentHelper {

    /* JADX INFO: renamed from: q0 */
    @NotNull
    public final InterfaceC24293a f22598q0 = C45681e.m100799e(this, new Function1<EuropeTrialSimulationOrderDialog, C36817p>() { // from class: com.kubi.futures.compliance.leverage.EuropeTrialSimulationOrderDialog$special$$inlined$viewBindingFragment$default$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C36817p invoke(@NotNull EuropeTrialSimulationOrderDialog fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C36817p.m82495a(fragment.requireView());
        }
    }, new Function1<C36817p, Unit>() { // from class: com.kubi.futures.compliance.leverage.EuropeTrialSimulationOrderDialog$special$$inlined$viewBindingFragment$default$1
        public final void invoke(@NotNull C36817p it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C36817p c36817p) {
            invoke(c36817p);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: r0 */
    @NotNull
    public final Lazy f22599r0 = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.compliance.leverage.f
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return EuropeTrialSimulationOrderDialog.m24570V4(this.f22639b);
        }
    });

    /* JADX INFO: renamed from: s0 */
    @NotNull
    public final Lazy f22600s0 = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.compliance.leverage.g
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return EuropeTrialSimulationOrderDialog.m24576e5(this.f22640b);
        }
    });

    /* JADX INFO: renamed from: t0 */
    @NotNull
    public final Lazy f22601t0;

    /* JADX INFO: renamed from: u0 */
    @NotNull
    public final Lazy f22602u0;

    /* JADX INFO: renamed from: v0 */
    @NotNull
    public final Lazy f22603v0;

    /* JADX INFO: renamed from: w0 */
    @NotNull
    public final Lazy f22604w0;

    /* JADX INFO: renamed from: x0 */
    @NotNull
    public String f22605x0;

    /* JADX INFO: renamed from: z0 */
    public static final /* synthetic */ KProperty<Object>[] f22597z0 = {Reflection.property1(new PropertyReference1Impl(EuropeTrialSimulationOrderDialog.class, "viewBinding", "getViewBinding()Lcom/kubi/kumex/databinding/BkumexDialogEuropeTrialSimulationOrderBinding;", 0))};

    /* JADX INFO: renamed from: y0 */
    @NotNull
    public static final Companion f22596y0 = new Companion(null);

    /* JADX INFO: compiled from: EuropeTrialSimulationOrderDialog.kt */
    @Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b¨\u0006\r"}, m90084d2 = {"Lcom/kubi/futures/compliance/leverage/EuropeTrialSimulationOrderDialog$Companion;", "", "<init>", "()V", TIMPushProvider.f75062n, "Lcom/kubi/resources/dialog/BaseDialogFragment;", "manager", "Landroidx/fragment/app/FragmentManager;", "event", "Lcom/kubi/futures/compliance/leverage/EuropeUnlockLeverageFillOrderEvent;", "finishCount", "", "totalCount", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final BaseDialogFragment show(@NotNull FragmentManager manager, @NotNull EuropeUnlockLeverageFillOrderEvent event, int finishCount, int totalCount) {
            Intrinsics.checkNotNullParameter(manager, "manager");
            Intrinsics.checkNotNullParameter(event, "event");
            EuropeTrialSimulationOrderDialog europeTrialSimulationOrderDialog = new EuropeTrialSimulationOrderDialog();
            Bundle bundle = new Bundle();
            bundle.putParcelable("data_1", event);
            bundle.putInt("data_2", finishCount);
            bundle.putInt("data_3", totalCount);
            europeTrialSimulationOrderDialog.setArguments(bundle);
            europeTrialSimulationOrderDialog.show(manager, "EuropeTrialSimulationOrderDialog");
            return europeTrialSimulationOrderDialog;
        }
    }

    /* JADX INFO: renamed from: com.kubi.futures.compliance.leverage.EuropeTrialSimulationOrderDialog$b */
    /* JADX INFO: compiled from: EuropeTrialSimulationOrderDialog.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C12872b implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1 f22606b;

        public C12872b(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f22606b = function;
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
            return this.f22606b;
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f22606b.invoke(obj);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX INFO: renamed from: com.kubi.futures.compliance.leverage.EuropeTrialSimulationOrderDialog$a */
    /* JADX INFO: compiled from: EuropeTrialSimulationOrderDialog.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* synthetic */ class C12871a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OrderTradeType.values().length];
            try {
                iArr[OrderTradeType.Limit.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OrderTradeType.Market.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: H4 */
    private final WrapperLoadingView m24560H4() {
        return (WrapperLoadingView) this.f22599r0.getValue();
    }

    /* JADX INFO: renamed from: U4 */
    public static final Unit m24569U4(C36817p c36817p, EuropeTrialSimulationOrderDialog europeTrialSimulationOrderDialog) {
        if (c36817p.f80752f.getF44406k()) {
            return Unit.INSTANCE;
        }
        if (europeTrialSimulationOrderDialog.m24601L4().m24614u().getValue() != null) {
            c36817p.f80752f.m55043o();
            EuropeTrialSimulationOrderViewModel europeTrialSimulationOrderViewModelM24601L4 = europeTrialSimulationOrderDialog.m24601L4();
            String str = europeTrialSimulationOrderDialog.f22605x0;
            EuropeUnlockLeverageFillOrderEvent europeUnlockLeverageFillOrderEventM24596F4 = europeTrialSimulationOrderDialog.m24596F4();
            europeTrialSimulationOrderViewModelM24601L4.m24616w(str, C27039d.m66656p(europeUnlockLeverageFillOrderEventM24596F4 != null ? europeUnlockLeverageFillOrderEventM24596F4.getLeverage() : null));
        } else {
            FuturesTrialViewModel.m28751g(europeTrialSimulationOrderDialog.m24599J4(), europeTrialSimulationOrderDialog.m24559E4(), false, 2, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: c5 */
    private final void m24574c5(FuturesWelfareTrialItemEntity futuresWelfareTrialItemEntity) {
        FuturesReplaceTrialDialog futuresReplaceTrialDialog = new FuturesReplaceTrialDialog();
        futuresReplaceTrialDialog.setArguments(BundleKt.bundleOf(new Pair("data", futuresWelfareTrialItemEntity), new Pair("data_1", Boolean.TRUE)));
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        futuresReplaceTrialDialog.show(childFragmentManager, "FuturesReplaceTrialDialog");
    }

    /* JADX INFO: renamed from: e5 */
    public static final FuturesTrialViewModel m24576e5(EuropeTrialSimulationOrderDialog europeTrialSimulationOrderDialog) {
        return (FuturesTrialViewModel) new ViewModelProvider(europeTrialSimulationOrderDialog).get(FuturesTrialViewModel.class);
    }

    /* JADX INFO: renamed from: F4 */
    public final EuropeUnlockLeverageFillOrderEvent m24596F4() {
        return (EuropeUnlockLeverageFillOrderEvent) this.f22602u0.getValue();
    }

    /* JADX INFO: renamed from: G4 */
    public final int m24597G4() {
        return ((Number) this.f22603v0.getValue()).intValue();
    }

    /* JADX INFO: renamed from: I4 */
    public final int m24598I4() {
        return ((Number) this.f22604w0.getValue()).intValue();
    }

    /* JADX INFO: renamed from: J4 */
    public final FuturesTrialViewModel m24599J4() {
        return (FuturesTrialViewModel) this.f22600s0.getValue();
    }

    /* JADX INFO: renamed from: K4 */
    public final C36817p m24600K4() {
        return (C36817p) this.f22598q0.getValue(this, f22597z0[0]);
    }

    /* JADX INFO: renamed from: L4 */
    public final EuropeTrialSimulationOrderViewModel m24601L4() {
        return (EuropeTrialSimulationOrderViewModel) this.f22601t0.getValue();
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper
    /* JADX INFO: renamed from: N3 */
    public int mo24511N3() {
        return 8;
    }

    /* JADX INFO: renamed from: W4 */
    public final void m24602W4() {
        if (!Intrinsics.areEqual(this.f22605x0, C46527h0.f104291a.m102677L())) {
            C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new EuropeTrialSimulationOrderDialog$onSubmitResultChanged$1(this, null), 3, null);
        } else {
            m24599J4().m28770w().setValue(Boolean.FALSE);
            m24594B4();
        }
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return inflater.inflate(R$layout.bkumex_dialog_europe_trial_simulation_order, container, false);
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        LinearLayout root;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        initView();
        m24562N4();
        C36817p c36817pM24600K4 = m24600K4();
        if (c36817pM24600K4 == null || (root = c36817pM24600K4.getRoot()) == null) {
            return;
        }
        root.post(new Runnable() { // from class: com.kubi.futures.compliance.leverage.a
            @Override // java.lang.Runnable
            public final void run() {
                EuropeTrialSimulationOrderDialog.m24571X4(this.f22626b);
            }
        });
    }

    public EuropeTrialSimulationOrderDialog() {
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.kubi.futures.compliance.leverage.EuropeTrialSimulationOrderDialog$special$$inlined$viewModels$default$1
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
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.kubi.futures.compliance.leverage.EuropeTrialSimulationOrderDialog$special$$inlined$viewModels$default$2
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
        this.f22601t0 = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(EuropeTrialSimulationOrderViewModel.class), new Function0<ViewModelStore>() { // from class: com.kubi.futures.compliance.leverage.EuropeTrialSimulationOrderDialog$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m103549viewModels$lambda1(lazy).getMViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.kubi.futures.compliance.leverage.EuropeTrialSimulationOrderDialog$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.kubi.futures.compliance.leverage.EuropeTrialSimulationOrderDialog$special$$inlined$viewModels$default$5
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
        this.f22602u0 = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.compliance.leverage.h
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EuropeTrialSimulationOrderDialog.m24557A4(this.f22641b);
            }
        });
        this.f22603v0 = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.compliance.leverage.i
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(EuropeTrialSimulationOrderDialog.m24558D4(this.f22642b));
            }
        });
        this.f22604w0 = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.compliance.leverage.j
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(EuropeTrialSimulationOrderDialog.m24575d5(this.f22646b));
            }
        });
        this.f22605x0 = C46527h0.f104291a.m102677L();
    }

    /* JADX INFO: renamed from: A4 */
    public static final EuropeUnlockLeverageFillOrderEvent m24557A4(EuropeTrialSimulationOrderDialog europeTrialSimulationOrderDialog) {
        Bundle arguments = europeTrialSimulationOrderDialog.getArguments();
        if (arguments != null) {
            return (EuropeUnlockLeverageFillOrderEvent) arguments.getParcelable("data_1");
        }
        return null;
    }

    /* JADX INFO: renamed from: D4 */
    public static final int m24558D4(EuropeTrialSimulationOrderDialog europeTrialSimulationOrderDialog) {
        Integer numValueOf;
        Bundle arguments = europeTrialSimulationOrderDialog.getArguments();
        if (arguments != null) {
            numValueOf = Integer.valueOf(arguments.getInt("data_2"));
        } else {
            numValueOf = null;
        }
        return C27039d.m66650j(numValueOf);
    }

    /* JADX INFO: renamed from: E4 */
    private final String m24559E4() {
        String code;
        EuropeUnlockLeverageBonusEntity first;
        Pair<EuropeUnlockLeverageBonusEntity, Throwable> value = m24601L4().m24615v().getValue();
        if (value != null && (first = value.getFirst()) != null) {
            code = first.getCode();
        } else {
            code = null;
        }
        return C27041f.m66668h(code);
    }

    /* JADX INFO: renamed from: M4 */
    private final void m24561M4(Pair<Boolean, FuturesWelfareTrialItemEntity> pair) {
        BigDecimal leverage;
        if (pair.getSecond() != null) {
            FuturesWelfareTrialItemEntity second = pair.getSecond();
            Intrinsics.checkNotNull(second);
            m24574c5(second);
        }
        if (pair.getFirst().booleanValue()) {
            m24599J4().m28770w().setValue(Boolean.TRUE);
            EuropeTrialSimulationOrderViewModel europeTrialSimulationOrderViewModelM24601L4 = m24601L4();
            String str = this.f22605x0;
            EuropeUnlockLeverageFillOrderEvent europeUnlockLeverageFillOrderEventM24596F4 = m24596F4();
            if (europeUnlockLeverageFillOrderEventM24596F4 != null) {
                leverage = europeUnlockLeverageFillOrderEventM24596F4.getLeverage();
            } else {
                leverage = null;
            }
            europeTrialSimulationOrderViewModelM24601L4.m24616w(str, C27039d.m66656p(leverage));
        }
    }

    /* JADX INFO: renamed from: N4 */
    private final void m24562N4() {
        m24601L4().m24615v().observe(getViewLifecycleOwner(), new C12872b(new Function1() { // from class: com.kubi.futures.compliance.leverage.k
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EuropeTrialSimulationOrderDialog.m24565Q4(this.f22649b, (Pair) obj);
            }
        }));
        m24599J4().m28772y().observe(getViewLifecycleOwner(), new C12872b(new Function1() { // from class: com.kubi.futures.compliance.leverage.l
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EuropeTrialSimulationOrderDialog.m24566R4(this.f22650b, (Boolean) obj);
            }
        }));
        m24599J4().m28770w().observe(getViewLifecycleOwner(), new C12872b(new Function1() { // from class: com.kubi.futures.compliance.leverage.m
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EuropeTrialSimulationOrderDialog.m24567S4(this.f22652b, (Boolean) obj);
            }
        }));
        m24599J4().m28766s().observe(getViewLifecycleOwner(), new C12872b(new Function1() { // from class: com.kubi.futures.compliance.leverage.n
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EuropeTrialSimulationOrderDialog.m24563O4(this.f22654b, (Pair) obj);
            }
        }));
        m24601L4().m24614u().observe(getViewLifecycleOwner(), new C12872b(new Function1() { // from class: com.kubi.futures.compliance.leverage.b
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EuropeTrialSimulationOrderDialog.m24564P4(this.f22628b, (Pair) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: O4 */
    public static final Unit m24563O4(EuropeTrialSimulationOrderDialog europeTrialSimulationOrderDialog, Pair pair) {
        Intrinsics.checkNotNull(pair);
        europeTrialSimulationOrderDialog.m24561M4(pair);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: P4 */
    public static final Unit m24564P4(EuropeTrialSimulationOrderDialog europeTrialSimulationOrderDialog, Pair pair) {
        europeTrialSimulationOrderDialog.m24602W4();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Q4 */
    public static final Unit m24565Q4(EuropeTrialSimulationOrderDialog europeTrialSimulationOrderDialog, Pair pair) {
        if (pair.getSecond() != null) {
            europeTrialSimulationOrderDialog.m24572a5();
        } else {
            europeTrialSimulationOrderDialog.m24603Y4((EuropeUnlockLeverageBonusEntity) pair.getFirst());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: R4 */
    public static final Unit m24566R4(EuropeTrialSimulationOrderDialog europeTrialSimulationOrderDialog, Boolean bool) {
        KcPrimaryButton kcPrimaryButton;
        if (bool.booleanValue()) {
            europeTrialSimulationOrderDialog.m24599J4().m28759f(europeTrialSimulationOrderDialog.m24559E4(), true);
        } else {
            C36817p c36817pM24600K4 = europeTrialSimulationOrderDialog.m24600K4();
            if (c36817pM24600K4 != null && (kcPrimaryButton = c36817pM24600K4.f80752f) != null) {
                kcPrimaryButton.mo28851l();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: S4 */
    public static final Unit m24567S4(EuropeTrialSimulationOrderDialog europeTrialSimulationOrderDialog, Boolean bool) {
        KcPrimaryButton kcPrimaryButton;
        KcPrimaryButton kcPrimaryButton2;
        if (bool.booleanValue()) {
            C36817p c36817pM24600K4 = europeTrialSimulationOrderDialog.m24600K4();
            if (c36817pM24600K4 != null && (kcPrimaryButton2 = c36817pM24600K4.f80752f) != null) {
                kcPrimaryButton2.m55043o();
            }
        } else {
            C36817p c36817pM24600K5 = europeTrialSimulationOrderDialog.m24600K4();
            if (c36817pM24600K5 != null && (kcPrimaryButton = c36817pM24600K5.f80752f) != null) {
                kcPrimaryButton.mo28851l();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: T4 */
    public static final Unit m24568T4(EuropeTrialSimulationOrderDialog europeTrialSimulationOrderDialog) {
        europeTrialSimulationOrderDialog.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: V4 */
    public static final WrapperLoadingView m24570V4(EuropeTrialSimulationOrderDialog europeTrialSimulationOrderDialog) {
        ConstraintLayout constraintLayout;
        C36817p c36817pM24600K4 = europeTrialSimulationOrderDialog.m24600K4();
        if (c36817pM24600K4 != null && (constraintLayout = c36817pM24600K4.f80748b) != null) {
            return WrapperLoadingView.injectView(constraintLayout);
        }
        return null;
    }

    /* JADX INFO: renamed from: X4 */
    public static final void m24571X4(EuropeTrialSimulationOrderDialog europeTrialSimulationOrderDialog) {
        europeTrialSimulationOrderDialog.m24604Z4();
    }

    /* JADX INFO: renamed from: a5 */
    private final void m24572a5() {
        WrapperLoadingView wrapperLoadingViewM24560H4 = m24560H4();
        if (wrapperLoadingViewM24560H4 != null) {
            wrapperLoadingViewM24560H4.showEmpty(R$string.load_failed_click_retry, R$drawable.ic2_common_system_maintain, new View.OnClickListener() { // from class: com.kubi.futures.compliance.leverage.e
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    EuropeTrialSimulationOrderDialog.m24573b5(this.f22636b, view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: b5 */
    public static final void m24573b5(EuropeTrialSimulationOrderDialog europeTrialSimulationOrderDialog, View view) {
        WrapperLoadingView wrapperLoadingViewM24560H4 = europeTrialSimulationOrderDialog.m24560H4();
        if (wrapperLoadingViewM24560H4 != null) {
            wrapperLoadingViewM24560H4.showLoading();
        }
        europeTrialSimulationOrderDialog.m24601L4().m24613t();
    }

    /* JADX INFO: renamed from: d5 */
    public static final int m24575d5(EuropeTrialSimulationOrderDialog europeTrialSimulationOrderDialog) {
        Integer numValueOf;
        Bundle arguments = europeTrialSimulationOrderDialog.getArguments();
        if (arguments != null) {
            numValueOf = Integer.valueOf(arguments.getInt("data_3"));
        } else {
            numValueOf = null;
        }
        return C27039d.m66650j(numValueOf);
    }

    private final void initView() {
        String side;
        String string;
        String side2;
        BigDecimal leverage;
        int i11;
        String string2;
        final C36817p c36817pM24600K4 = m24600K4();
        if (c36817pM24600K4 == null) {
            return;
        }
        AppCompatImageView close = c36817pM24600K4.f80749c;
        Intrinsics.checkNotNullExpressionValue(close, "close");
        C27046k.m66711z(close, 0L, new Function0() { // from class: com.kubi.futures.compliance.leverage.c
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EuropeTrialSimulationOrderDialog.m24568T4(this.f22630b);
            }
        }, 1, null);
        KcPrimaryButton done = c36817pM24600K4.f80752f;
        Intrinsics.checkNotNullExpressionValue(done, "done");
        C27046k.m66711z(done, 0L, new Function0() { // from class: com.kubi.futures.compliance.leverage.d
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EuropeTrialSimulationOrderDialog.m24569U4(c36817pM24600K4, this);
            }
        }, 1, null);
        c36817pM24600K4.f80750d.setText(getString(R$string.kumex_eurpe_leverage_edu_unlock_leverage_condition));
        HighlightTextHelper highlightTextHelper = HighlightTextHelper.f43497a;
        BaseTextView condition = c36817pM24600K4.f80750d;
        Intrinsics.checkNotNullExpressionValue(condition, "condition");
        HighlightTextHelper.TextTagEnum textTagEnum = HighlightTextHelper.TextTagEnum.SPAN;
        Pair pair = new Pair(textTagEnum, new ForegroundColorSpan(C27017c.f54310a.m66512a(R$color.c_text)));
        TypefaceSpan typefaceSpanM36545b = C17056l0.m36545b(R$font.medium);
        if (typefaceSpanM36545b == null) {
            typefaceSpanM36545b = new TypefaceSpan("sans-serif-medium");
        }
        highlightTextHelper.m54120f(condition, pair, new Pair(textTagEnum, typefaceSpanM36545b));
        BaseTextView baseTextView = c36817pM24600K4.f80762p;
        int i12 = R$string.kumex_eurpe_leverage_edu_order_dialog_title;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m24597G4());
        sb2.append('/');
        sb2.append(m24598I4());
        baseTextView.setText(getString(i12, sb2.toString()));
        BaseTextView baseTextView2 = c36817pM24600K4.f80758l;
        EuropeUnlockLeverageFillOrderEvent europeUnlockLeverageFillOrderEventM24596F4 = m24596F4();
        OrderTradeType orderType = null;
        if (europeUnlockLeverageFillOrderEventM24596F4 != null) {
            side = europeUnlockLeverageFillOrderEventM24596F4.getSide();
        } else {
            side = null;
        }
        if (Intrinsics.areEqual(side, "buy")) {
            string = getString(R$string.contract_long);
        } else {
            string = getString(R$string.contract_short);
        }
        baseTextView2.setText(string);
        BaseTextView baseTextView3 = c36817pM24600K4.f80758l;
        Context context = baseTextView3.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        EuropeUnlockLeverageFillOrderEvent europeUnlockLeverageFillOrderEventM24596F5 = m24596F4();
        if (europeUnlockLeverageFillOrderEventM24596F5 != null) {
            side2 = europeUnlockLeverageFillOrderEventM24596F5.getSide();
        } else {
            side2 = null;
        }
        baseTextView3.setTextColor(C22890g.m54281f(context, Intrinsics.areEqual(side2, "buy")));
        BaseTextView baseTextView4 = c36817pM24600K4.f80754h;
        EuropeUnlockLeverageFillOrderEvent europeUnlockLeverageFillOrderEventM24596F6 = m24596F4();
        if (europeUnlockLeverageFillOrderEventM24596F6 != null) {
            leverage = europeUnlockLeverageFillOrderEventM24596F6.getLeverage();
        } else {
            leverage = null;
        }
        baseTextView4.setText(C17054k0.m36529c(leverage, false));
        BaseTextView baseTextView5 = c36817pM24600K4.f80763q;
        EuropeUnlockLeverageFillOrderEvent europeUnlockLeverageFillOrderEventM24596F7 = m24596F4();
        if (europeUnlockLeverageFillOrderEventM24596F7 != null) {
            orderType = europeUnlockLeverageFillOrderEventM24596F7.getOrderType();
        }
        if (orderType == null) {
            i11 = -1;
        } else {
            i11 = C12871a.$EnumSwitchMapping$0[orderType.ordinal()];
        }
        if (i11 == 1 || i11 != 2) {
            string2 = getString(R$string.limit_price_order);
        } else {
            string2 = getString(R$string.market_price_order);
        }
        baseTextView5.setText(string2);
    }

    /* JADX INFO: renamed from: B4 */
    public final void m24594B4() {
        m24595C4(this).dismissAllowingStateLoss();
        EuropeUnlockLeverageFillOrderEvent europeUnlockLeverageFillOrderEventM24596F4 = m24596F4();
        if (europeUnlockLeverageFillOrderEventM24596F4 != null) {
            EuropeUnlockLeverageProcessor.f22643a.m24700g(europeUnlockLeverageFillOrderEventM24596F4);
        }
    }

    /* JADX INFO: renamed from: C4 */
    public final DialogFragment m24595C4(DialogFragment dialogFragment) {
        Fragment parentFragment = dialogFragment.getParentFragment();
        if (parentFragment != null && (parentFragment instanceof DialogFragment)) {
            return m24595C4((DialogFragment) parentFragment);
        }
        return dialogFragment;
    }

    /* JADX INFO: renamed from: Y4 */
    public final void m24603Y4(EuropeUnlockLeverageBonusEntity europeUnlockLeverageBonusEntity) {
        String str;
        Object next;
        CharSequence charSequenceM24440e;
        String symbol;
        C36817p c36817pM24600K4 = m24600K4();
        if (c36817pM24600K4 == null) {
            return;
        }
        if (europeUnlockLeverageBonusEntity == null) {
            m24572a5();
            return;
        }
        WrapperLoadingView wrapperLoadingViewM24560H4 = m24560H4();
        if (wrapperLoadingViewM24560H4 != null) {
            wrapperLoadingViewM24560H4.showContent();
        }
        Iterator<T> it = RepositoryServiceLocator.f19236a.m20288g().mo25016k().iterator();
        while (true) {
            str = "XBTUSDTM";
            if (it.hasNext()) {
                next = it.next();
                ContractEntity contractEntity = (ContractEntity) next;
                if (Intrinsics.areEqual(contractEntity.getSettleCurrency(), europeUnlockLeverageBonusEntity.getCurrency()) && (Intrinsics.areEqual(contractEntity.getSymbol(), "XBTUSDTM") || Intrinsics.areEqual(contractEntity.getSymbol(), "XBTUSDCM"))) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        ContractEntity contractEntityM102673I = (ContractEntity) next;
        if (contractEntityM102673I == null) {
            contractEntityM102673I = C46527h0.f104291a.m102673I();
        }
        BaseTextView baseTextView = c36817pM24600K4.f80760n;
        if (contractEntityM102673I == null || (charSequenceM24440e = FuturesDisplayNameUtils.f22525a.m24440e(contractEntityM102673I)) == null) {
            charSequenceM24440e = this.f22605x0;
        }
        baseTextView.setText(charSequenceM24440e);
        if (contractEntityM102673I != null && (symbol = contractEntityM102673I.getSymbol()) != null) {
            str = symbol;
        }
        this.f22605x0 = str;
    }

    /* JADX INFO: renamed from: Z4 */
    public final void m24604Z4() {
        C36817p c36817pM24600K4 = m24600K4();
        if (c36817pM24600K4 == null) {
            return;
        }
        c36817pM24600K4.getRoot().setMinimumHeight(c36817pM24600K4.getRoot().getMeasuredHeight());
        WrapperLoadingView wrapperLoadingViewM24560H4 = m24560H4();
        if (wrapperLoadingViewM24560H4 != null) {
            wrapperLoadingViewM24560H4.showLoading();
        }
        m24601L4().m24613t();
    }
}
