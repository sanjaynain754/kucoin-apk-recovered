package com.kubi.futures.trade.welfare;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProvider;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.kubi.futures.trade.welfare.vm.FuturesTrialViewModel;
import com.kubi.kumex.R$layout;
import com.kubi.kumex.data.platform.model.FuturesWelfareTrialItemEntity;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.resources.widget.button.KcSecondaryButton;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tuicore.TUIConstants;
import dm.C36753e1;
import f00.C37304a;
import fm.C37569d;
import g00.InterfaceC37766r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p729wl.C45875l0;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import w00.C45681e;

/* JADX INFO: compiled from: FuturesTradeProUnavailableDialog.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u001a\u001a\u00020\u001bH\u0016J&\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\u001a\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u001d2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\b\u0010'\u001a\u00020\u0011H\u0016J\b\u0010(\u001a\u00020%H\u0016R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001d\u0010\n\u001a\u0004\u0018\u00010\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0015\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u000f\u001a\u0004\b\u0017\u0010\u0018¨\u0006)"}, m90084d2 = {"Lcom/kubi/futures/trade/welfare/FuturesTradeProUnavailableDialog;", "Lcom/kubi/resources/dialog/DialogFragmentHelper;", "<init>", "()V", "viewBinding", "Lcom/kubi/kumex/databinding/BkumexDialogTradeProUnavailableBinding;", "getViewBinding", "()Lcom/kubi/kumex/databinding/BkumexDialogTradeProUnavailableBinding;", "viewBinding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "trialEntity", "Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialItemEntity;", "getTrialEntity", "()Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialItemEntity;", "trialEntity$delegate", "Lkotlin/Lazy;", "fromSelectWelfareDialog", "", "getFromSelectWelfareDialog", "()Z", "fromSelectWelfareDialog$delegate", "viewModel", "Lcom/kubi/futures/trade/welfare/vm/FuturesTrialViewModel;", "getViewModel", "()Lcom/kubi/futures/trade/welfare/vm/FuturesTrialViewModel;", "viewModel$delegate", "initType", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "isBottomSheet", "onDestroyView", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFuturesTradeProUnavailableDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FuturesTradeProUnavailableDialog.kt\ncom/kubi/futures/trade/welfare/FuturesTradeProUnavailableDialog\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 MviEx.kt\ncom/kubi/mvi/common/MviExKt\n*L\n1#1,72:1\n143#2,20:73\n220#3,5:93\n220#3,5:98\n*S KotlinDebug\n*F\n+ 1 FuturesTradeProUnavailableDialog.kt\ncom/kubi/futures/trade/welfare/FuturesTradeProUnavailableDialog\n*L\n23#1:73,20\n35#1:93,5\n37#1:98,5\n*E\n"})
public final class FuturesTradeProUnavailableDialog extends DialogFragmentHelper {

    /* JADX INFO: renamed from: u0 */
    public static final /* synthetic */ KProperty<Object>[] f24478u0 = {Reflection.property1(new PropertyReference1Impl(FuturesTradeProUnavailableDialog.class, "viewBinding", "getViewBinding()Lcom/kubi/kumex/databinding/BkumexDialogTradeProUnavailableBinding;", 0))};

    /* JADX INFO: renamed from: q0 */
    @NotNull
    public final InterfaceC24293a f24479q0 = C45681e.m100799e(this, new Function1<FuturesTradeProUnavailableDialog, C36753e1>() { // from class: com.kubi.futures.trade.welfare.FuturesTradeProUnavailableDialog$special$$inlined$viewBindingFragment$default$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C36753e1 invoke(@NotNull FuturesTradeProUnavailableDialog fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C36753e1.m82357a(fragment.requireView());
        }
    }, new Function1<C36753e1, Unit>() { // from class: com.kubi.futures.trade.welfare.FuturesTradeProUnavailableDialog$special$$inlined$viewBindingFragment$default$1
        public final void invoke(@NotNull C36753e1 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C36753e1 c36753e1) {
            invoke(c36753e1);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: r0 */
    @NotNull
    public final Lazy f24480r0 = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.trade.welfare.h
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FuturesTradeProUnavailableDialog.m28077v4(this.f24826b);
        }
    });

    /* JADX INFO: renamed from: s0 */
    @NotNull
    public final Lazy f24481s0 = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.trade.welfare.i
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Boolean.valueOf(FuturesTradeProUnavailableDialog.m28071o4(this.f24864b));
        }
    });

    /* JADX INFO: renamed from: t0 */
    @NotNull
    public final Lazy f24482t0 = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.trade.welfare.j
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FuturesTradeProUnavailableDialog.m28078w4(this.f24867b);
        }
    });

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, com.kubi.resources.dialog.BaseDialogFragment
    /* JADX INFO: renamed from: k3 */
    public boolean mo15372k3() {
        return true;
    }

    /* JADX INFO: renamed from: p4 */
    private final boolean m28072p4() {
        return ((Boolean) this.f24481s0.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: q4 */
    private final FuturesWelfareTrialItemEntity m28073q4() {
        return (FuturesWelfareTrialItemEntity) this.f24480r0.getValue();
    }

    /* JADX INFO: renamed from: s4 */
    private final FuturesTrialViewModel m28074s4() {
        return (FuturesTrialViewModel) this.f24482t0.getValue();
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper
    /* JADX INFO: renamed from: N3 */
    public int mo24511N3() {
        return 10;
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return inflater.inflate(R$layout.bkumex_dialog_trade_pro_unavailable, container, false);
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        C36753e1 c36753e1M28079r4 = m28079r4();
        if (c36753e1M28079r4 == null) {
            return;
        }
        KcPrimaryButton tvKnown = c36753e1M28079r4.f79950c;
        Intrinsics.checkNotNullExpressionValue(tvKnown, "tvKnown");
        C27046k.m66711z(tvKnown, 0L, new Function0() { // from class: com.kubi.futures.trade.welfare.k
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FuturesTradeProUnavailableDialog.m28075t4(this.f24871b);
            }
        }, 1, null);
        KcSecondaryButton tvExit = c36753e1M28079r4.f79949b;
        Intrinsics.checkNotNullExpressionValue(tvExit, "tvExit");
        C27046k.m66711z(tvExit, 0L, new Function0() { // from class: com.kubi.futures.trade.welfare.l
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FuturesTradeProUnavailableDialog.m28076u4(this.f24875b);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: r4 */
    public final C36753e1 m28079r4() {
        return (C36753e1) this.f24479q0.getValue(this, f24478u0[0]);
    }

    /* JADX INFO: renamed from: o4 */
    public static final boolean m28071o4(FuturesTradeProUnavailableDialog futuresTradeProUnavailableDialog) {
        Boolean boolValueOf;
        Bundle arguments = futuresTradeProUnavailableDialog.getArguments();
        if (arguments != null) {
            boolValueOf = Boolean.valueOf(arguments.getBoolean("data_1"));
        } else {
            boolValueOf = null;
        }
        return C27025c.m66566d(boolValueOf);
    }

    /* JADX INFO: renamed from: t4 */
    public static final Unit m28075t4(FuturesTradeProUnavailableDialog futuresTradeProUnavailableDialog) {
        futuresTradeProUnavailableDialog.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: u4 */
    public static final Unit m28076u4(FuturesTradeProUnavailableDialog futuresTradeProUnavailableDialog) {
        String strM101358z0;
        FuturesWelfareTrialItemEntity futuresWelfareTrialItemEntityM28073q4 = futuresTradeProUnavailableDialog.m28073q4();
        if (futuresWelfareTrialItemEntityM28073q4 == null || (strM101358z0 = C37569d.m84651C(futuresWelfareTrialItemEntityM28073q4)) == null) {
            strM101358z0 = C45875l0.f103336a.m101358z0();
        }
        InterfaceC37766r.a.m85190a(C37304a.f82764a, strM101358z0, null, null, null, null, null, null, 126, null);
        futuresTradeProUnavailableDialog.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: v4 */
    public static final FuturesWelfareTrialItemEntity m28077v4(FuturesTradeProUnavailableDialog futuresTradeProUnavailableDialog) {
        Bundle arguments = futuresTradeProUnavailableDialog.getArguments();
        if (arguments != null) {
            return (FuturesWelfareTrialItemEntity) arguments.getParcelable("data");
        }
        return null;
    }

    /* JADX INFO: renamed from: w4 */
    public static final FuturesTrialViewModel m28078w4(FuturesTradeProUnavailableDialog futuresTradeProUnavailableDialog) {
        Fragment parentFragment;
        FuturesTrialViewModel futuresTrialViewModel;
        FuturesTrialViewModel futuresTrialViewModel2;
        if (futuresTradeProUnavailableDialog.m28072p4()) {
            Fragment parentFragment2 = futuresTradeProUnavailableDialog.getParentFragment();
            if (parentFragment2 != null && (futuresTrialViewModel2 = (FuturesTrialViewModel) new ViewModelProvider(parentFragment2).get(FuturesTrialViewModel.class)) != null) {
                return futuresTrialViewModel2;
            }
            return (FuturesTrialViewModel) new ViewModelProvider(futuresTradeProUnavailableDialog).get(FuturesTrialViewModel.class);
        }
        Fragment parentFragment3 = futuresTradeProUnavailableDialog.getParentFragment();
        if (parentFragment3 != null && (parentFragment = parentFragment3.getParentFragment()) != null && (futuresTrialViewModel = (FuturesTrialViewModel) new ViewModelProvider(parentFragment).get(FuturesTrialViewModel.class)) != null) {
            return futuresTrialViewModel;
        }
        return (FuturesTrialViewModel) new ViewModelProvider(futuresTradeProUnavailableDialog).get(FuturesTrialViewModel.class);
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        MutableLiveData<Boolean> mutableLiveDataM28772y = m28074s4().m28772y();
        Boolean bool = Boolean.FALSE;
        mutableLiveDataM28772y.postValue(bool);
        m28074s4().m28771x().postValue(bool);
        super.onDestroyView();
    }
}
