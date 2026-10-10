package com.kubi.futures.trade.welfare.airdrop;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.kubi.broker.RepositoryServiceLocator;
import com.kubi.futures.trade.welfare.vm.FuturesTrialViewModel;
import com.kubi.kumex.R$layout;
import com.kubi.kumex.data.platform.model.CoinEntity;
import com.kubi.kumex.data.platform.model.FuturesWelfareTrialItemEntity;
import com.kubi.kumex.data.platform.model.PropertyEntity;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.resources.widget.button.KcSecondaryButton;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tuicore.TUIConstants;
import dm.C36734b0;
import nf.C42828b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p429lf.C42179a;
import p429lf.C42180b;
import p569qq.C43852m;
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
import th.InterfaceC44980d;
import w00.C45681e;

/* JADX INFO: compiled from: AirdropReplaceDialog.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u001b\u001a\u00020\u001cH\u0016J&\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\u001a\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u001e2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\u0010\u0010(\u001a\u00020&2\u0006\u0010)\u001a\u00020\u000bH\u0002J\u0010\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-H\u0002J\b\u0010.\u001a\u00020\u0011H\u0016J\b\u0010/\u001a\u00020&H\u0016R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001d\u0010\n\u001a\u0004\u0018\u00010\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0015\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u000f\u001a\u0004\b\u0017\u0010\u0018R\u000e\u0010\u001a\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00060"}, m90084d2 = {"Lcom/kubi/futures/trade/welfare/airdrop/AirdropReplaceDialog;", "Lcom/kubi/resources/dialog/DialogFragmentHelper;", "<init>", "()V", "viewBinding", "Lcom/kubi/kumex/databinding/BkumexDialogFuturesReplaceTrialBinding;", "getViewBinding", "()Lcom/kubi/kumex/databinding/BkumexDialogFuturesReplaceTrialBinding;", "viewBinding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "trialEntity", "Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialItemEntity;", "getTrialEntity", "()Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialItemEntity;", "trialEntity$delegate", "Lkotlin/Lazy;", "fromSelectWelfareDialog", "", "getFromSelectWelfareDialog", "()Z", "fromSelectWelfareDialog$delegate", "viewModel", "Lcom/kubi/futures/trade/welfare/vm/FuturesTrialViewModel;", "getViewModel", "()Lcom/kubi/futures/trade/welfare/vm/FuturesTrialViewModel;", "viewModel$delegate", "isReplace", "initType", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "bindData", "trial", "getTime", "", "time", "", "isBottomSheet", "onDestroyView", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAirdropReplaceDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AirdropReplaceDialog.kt\ncom/kubi/futures/trade/welfare/airdrop/AirdropReplaceDialog\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 CoinEntityEx.kt\ncom/kubi/kumex/extensions/CoinEntityExKt\n+ 4 MviEx.kt\ncom/kubi/mvi/common/MviExKt\n*L\n1#1,118:1\n143#2,20:119\n20#3:139\n220#4,5:140\n220#4,5:145\n*S KotlinDebug\n*F\n+ 1 AirdropReplaceDialog.kt\ncom/kubi/futures/trade/welfare/airdrop/AirdropReplaceDialog\n*L\n39#1:119,20\n96#1:139\n51#1:140,5\n53#1:145,5\n*E\n"})
public final class AirdropReplaceDialog extends DialogFragmentHelper {

    /* JADX INFO: renamed from: v0 */
    public static final /* synthetic */ KProperty<Object>[] f24573v0 = {Reflection.property1(new PropertyReference1Impl(AirdropReplaceDialog.class, "viewBinding", "getViewBinding()Lcom/kubi/kumex/databinding/BkumexDialogFuturesReplaceTrialBinding;", 0))};

    /* JADX INFO: renamed from: q0 */
    @NotNull
    public final InterfaceC24293a f24574q0 = C45681e.m100799e(this, new Function1<AirdropReplaceDialog, C36734b0>() { // from class: com.kubi.futures.trade.welfare.airdrop.AirdropReplaceDialog$special$$inlined$viewBindingFragment$default$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C36734b0 invoke(@NotNull AirdropReplaceDialog fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C36734b0.m82318a(fragment.requireView());
        }
    }, new Function1<C36734b0, Unit>() { // from class: com.kubi.futures.trade.welfare.airdrop.AirdropReplaceDialog$special$$inlined$viewBindingFragment$default$1
        public final void invoke(@NotNull C36734b0 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C36734b0 c36734b0) {
            invoke(c36734b0);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: r0 */
    @NotNull
    public final Lazy f24575r0 = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.trade.welfare.airdrop.e0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AirdropReplaceDialog.m28406x4(this.f24595b);
        }
    });

    /* JADX INFO: renamed from: s0 */
    @NotNull
    public final Lazy f24576s0 = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.trade.welfare.airdrop.f0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Boolean.valueOf(AirdropReplaceDialog.m28398p4(this.f24598b));
        }
    });

    /* JADX INFO: renamed from: t0 */
    @NotNull
    public final Lazy f24577t0 = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.trade.welfare.airdrop.g0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AirdropReplaceDialog.m28407y4(this.f24600b);
        }
    });

    /* JADX INFO: renamed from: u0 */
    public boolean f24578u0;

    /* JADX INFO: renamed from: w4 */
    public static final Unit m28405w4(AirdropReplaceDialog airdropReplaceDialog) {
        airdropReplaceDialog.f24578u0 = true;
        airdropReplaceDialog.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, com.kubi.resources.dialog.BaseDialogFragment
    /* JADX INFO: renamed from: k3 */
    public boolean mo15372k3() {
        return true;
    }

    /* JADX INFO: renamed from: q4 */
    private final boolean m28399q4() {
        return ((Boolean) this.f24576s0.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: r4 */
    private final String m28400r4(long j11) {
        return C42179a.m92633f(j11, null, false, true, null, 11, null);
    }

    /* JADX INFO: renamed from: s4 */
    private final FuturesWelfareTrialItemEntity m28401s4() {
        return (FuturesWelfareTrialItemEntity) this.f24575r0.getValue();
    }

    /* JADX INFO: renamed from: t4 */
    private final C36734b0 m28402t4() {
        return (C36734b0) this.f24574q0.getValue(this, f24573v0[0]);
    }

    /* JADX INFO: renamed from: u4 */
    private final FuturesTrialViewModel m28403u4() {
        return (FuturesTrialViewModel) this.f24577t0.getValue();
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
        return inflater.inflate(R$layout.bkumex_dialog_futures_replace_trial, container, false);
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        FuturesWelfareTrialItemEntity futuresWelfareTrialItemEntityM28401s4 = m28401s4();
        C36734b0 c36734b0M28402t4 = m28402t4();
        if (futuresWelfareTrialItemEntityM28401s4 == null || c36734b0M28402t4 == null) {
            dismissAllowingStateLoss();
            return;
        }
        C43852m.m96595g("B6futures", "AirDropPositionReplace", null, null, 12, null);
        KcSecondaryButton tvCancel = c36734b0M28402t4.f79725i;
        Intrinsics.checkNotNullExpressionValue(tvCancel, "tvCancel");
        C27046k.m66711z(tvCancel, 0L, new Function0() { // from class: com.kubi.futures.trade.welfare.airdrop.c0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AirdropReplaceDialog.m28404v4(this.f24591b);
            }
        }, 1, null);
        KcPrimaryButton tvReplace = c36734b0M28402t4.f79726j;
        Intrinsics.checkNotNullExpressionValue(tvReplace, "tvReplace");
        C27046k.m66711z(tvReplace, 0L, new Function0() { // from class: com.kubi.futures.trade.welfare.airdrop.d0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AirdropReplaceDialog.m28405w4(this.f24593b);
            }
        }, 1, null);
        m28397o4(futuresWelfareTrialItemEntityM28401s4);
    }

    /* JADX INFO: renamed from: o4 */
    private final void m28397o4(FuturesWelfareTrialItemEntity futuresWelfareTrialItemEntity) {
        PropertyEntity properties;
        C36734b0 c36734b0M28402t4 = m28402t4();
        if (c36734b0M28402t4 == null) {
            return;
        }
        Integer shortDisplayPrecision = null;
        CoinEntity coinEntityM99528E = InterfaceC44980d.m99528E(RepositoryServiceLocator.f19236a.m20288g(), C27041f.m66668h(futuresWelfareTrialItemEntity.getCurrency()), false, 2, null);
        if (coinEntityM99528E != null && (properties = coinEntityM99528E.getProperties()) != null) {
            shortDisplayPrecision = properties.getShortDisplayPrecision();
        }
        int iM66651k = C27039d.m66651k(shortDisplayPrecision, 4);
        String strM66668h = C27041f.m66668h(C27041f.m66677q(futuresWelfareTrialItemEntity.getCurrency()));
        c36734b0M28402t4.f79719c.setText(C42828b.m93906g(C42180b.m92640e(C27039d.m66656p(futuresWelfareTrialItemEntity.getFaceValue()), null, iM66651k, true, false, false, 0, null, 121, null), strM66668h, true, false, 4, null));
        c36734b0M28402t4.f79728l.setText(C42180b.m92640e(C27039d.m66656p(futuresWelfareTrialItemEntity.getAvailableCashAmount()), null, iM66651k, true, false, false, 0, null, 121, null) + '/' + C42828b.m93915p(C42828b.m93906g(C42180b.m92640e(C27039d.m66656p(futuresWelfareTrialItemEntity.getMaxValue()), null, iM66651k, true, false, false, 0, null, 121, null), strM66668h, true, false, 4, null)));
        c36734b0M28402t4.f79721e.setText(m28400r4(C27039d.m66652l(futuresWelfareTrialItemEntity.getValidPeriod())));
    }

    /* JADX INFO: renamed from: p4 */
    public static final boolean m28398p4(AirdropReplaceDialog airdropReplaceDialog) {
        Boolean boolValueOf;
        Bundle arguments = airdropReplaceDialog.getArguments();
        if (arguments != null) {
            boolValueOf = Boolean.valueOf(arguments.getBoolean("data_1"));
        } else {
            boolValueOf = null;
        }
        return C27025c.m66566d(boolValueOf);
    }

    /* JADX INFO: renamed from: v4 */
    public static final Unit m28404v4(AirdropReplaceDialog airdropReplaceDialog) {
        airdropReplaceDialog.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: x4 */
    public static final FuturesWelfareTrialItemEntity m28406x4(AirdropReplaceDialog airdropReplaceDialog) {
        Bundle arguments = airdropReplaceDialog.getArguments();
        if (arguments != null) {
            return (FuturesWelfareTrialItemEntity) arguments.getParcelable("data");
        }
        return null;
    }

    /* JADX INFO: renamed from: y4 */
    public static final FuturesTrialViewModel m28407y4(AirdropReplaceDialog airdropReplaceDialog) {
        Fragment parentFragment;
        FuturesTrialViewModel futuresTrialViewModel;
        FuturesTrialViewModel futuresTrialViewModel2;
        if (airdropReplaceDialog.m28399q4()) {
            Fragment parentFragment2 = airdropReplaceDialog.getParentFragment();
            if (parentFragment2 != null && (futuresTrialViewModel2 = (FuturesTrialViewModel) new ViewModelProvider(parentFragment2).get(FuturesTrialViewModel.class)) != null) {
                return futuresTrialViewModel2;
            }
            return (FuturesTrialViewModel) new ViewModelProvider(airdropReplaceDialog).get(FuturesTrialViewModel.class);
        }
        Fragment parentFragment3 = airdropReplaceDialog.getParentFragment();
        if (parentFragment3 != null && (parentFragment = parentFragment3.getParentFragment()) != null && (futuresTrialViewModel = (FuturesTrialViewModel) new ViewModelProvider(parentFragment).get(FuturesTrialViewModel.class)) != null) {
            return futuresTrialViewModel;
        }
        return (FuturesTrialViewModel) new ViewModelProvider(airdropReplaceDialog).get(FuturesTrialViewModel.class);
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        m28403u4().m28771x().postValue(Boolean.valueOf(this.f24578u0));
        super.onDestroyView();
    }
}
