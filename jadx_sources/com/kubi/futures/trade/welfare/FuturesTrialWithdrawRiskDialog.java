package com.kubi.futures.trade.welfare;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.os.BundleCompat;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.kubi.kumex.R$layout;
import com.kubi.kumex.data.platform.model.FuturesWelfareTrialWithDrawPopupInfoEntity;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tuicore.TUIConstants;
import dm.C36746d0;
import f00.C37304a;
import g00.InterfaceC37766r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
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

/* JADX INFO: compiled from: FuturesTrialWithdrawRiskDialog.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u001a\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00112\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001d\u0010\n\u001a\u0004\u0018\u00010\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r¨\u0006\u001b"}, m90084d2 = {"Lcom/kubi/futures/trade/welfare/FuturesTrialWithdrawRiskDialog;", "Lcom/kubi/resources/dialog/DialogFragmentHelper;", "<init>", "()V", "viewBinding", "Lcom/kubi/kumex/databinding/BkumexDialogFuturesTrialWithdrawRisksBinding;", "getViewBinding", "()Lcom/kubi/kumex/databinding/BkumexDialogFuturesTrialWithdrawRisksBinding;", "viewBinding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "riskPopupInfo", "Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialWithDrawPopupInfoEntity;", "getRiskPopupInfo", "()Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialWithDrawPopupInfoEntity;", "riskPopupInfo$delegate", "Lkotlin/Lazy;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFuturesTrialWithdrawRiskDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FuturesTrialWithdrawRiskDialog.kt\ncom/kubi/futures/trade/welfare/FuturesTrialWithdrawRiskDialog\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n*L\n1#1,70:1\n143#2,20:71\n*S KotlinDebug\n*F\n+ 1 FuturesTrialWithdrawRiskDialog.kt\ncom/kubi/futures/trade/welfare/FuturesTrialWithdrawRiskDialog\n*L\n26#1:71,20\n*E\n"})
public final class FuturesTrialWithdrawRiskDialog extends DialogFragmentHelper {

    /* JADX INFO: renamed from: s0 */
    public static final /* synthetic */ KProperty<Object>[] f24491s0 = {Reflection.property1(new PropertyReference1Impl(FuturesTrialWithdrawRiskDialog.class, "viewBinding", "getViewBinding()Lcom/kubi/kumex/databinding/BkumexDialogFuturesTrialWithdrawRisksBinding;", 0))};

    /* JADX INFO: renamed from: q0 */
    @NotNull
    public final InterfaceC24293a f24492q0 = C45681e.m100799e(this, new Function1<FuturesTrialWithdrawRiskDialog, C36746d0>() { // from class: com.kubi.futures.trade.welfare.FuturesTrialWithdrawRiskDialog$special$$inlined$viewBindingFragment$default$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C36746d0 invoke(@NotNull FuturesTrialWithdrawRiskDialog fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C36746d0.m82343a(fragment.requireView());
        }
    }, new Function1<C36746d0, Unit>() { // from class: com.kubi.futures.trade.welfare.FuturesTrialWithdrawRiskDialog$special$$inlined$viewBindingFragment$default$1
        public final void invoke(@NotNull C36746d0 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C36746d0 c36746d0) {
            invoke(c36746d0);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: r0 */
    @NotNull
    public final Lazy f24493r0 = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.trade.welfare.x
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FuturesTrialWithdrawRiskDialog.m28110q4(this.f24959b);
        }
    });

    /* JADX INFO: renamed from: m4 */
    public final FuturesWelfareTrialWithDrawPopupInfoEntity m28111m4() {
        return (FuturesWelfareTrialWithDrawPopupInfoEntity) this.f24493r0.getValue();
    }

    /* JADX INFO: renamed from: n4 */
    public final C36746d0 m28112n4() {
        return (C36746d0) this.f24492q0.getValue(this, f24491s0[0]);
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return inflater.inflate(R$layout.bkumex_dialog_futures_trial_withdraw_risks, container, false);
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        C36746d0 c36746d0M28112n4 = m28112n4();
        if (c36746d0M28112n4 == null) {
            dismissAllowingStateLoss();
            return;
        }
        BaseTextView baseTextView = c36746d0M28112n4.f79864e;
        FuturesWelfareTrialWithDrawPopupInfoEntity futuresWelfareTrialWithDrawPopupInfoEntityM28111m4 = m28111m4();
        baseTextView.setText(C27041f.m66668h(futuresWelfareTrialWithDrawPopupInfoEntityM28111m4 != null ? futuresWelfareTrialWithDrawPopupInfoEntityM28111m4.getTitle() : null));
        BaseTextView baseTextView2 = c36746d0M28112n4.f79862c;
        FuturesWelfareTrialWithDrawPopupInfoEntity futuresWelfareTrialWithDrawPopupInfoEntityM28111m5 = m28111m4();
        baseTextView2.setText(C27041f.m66668h(futuresWelfareTrialWithDrawPopupInfoEntityM28111m5 != null ? futuresWelfareTrialWithDrawPopupInfoEntityM28111m5.getContent() : null));
        KcPrimaryButton kcPrimaryButton = c36746d0M28112n4.f79863d;
        FuturesWelfareTrialWithDrawPopupInfoEntity futuresWelfareTrialWithDrawPopupInfoEntityM28111m6 = m28111m4();
        kcPrimaryButton.setText(C27041f.m66668h(futuresWelfareTrialWithDrawPopupInfoEntityM28111m6 != null ? futuresWelfareTrialWithDrawPopupInfoEntityM28111m6.getButtonRefuse() : null));
        BaseTextView baseTextView3 = c36746d0M28112n4.f79861b;
        FuturesWelfareTrialWithDrawPopupInfoEntity futuresWelfareTrialWithDrawPopupInfoEntityM28111m7 = m28111m4();
        baseTextView3.setText(C27041f.m66668h(futuresWelfareTrialWithDrawPopupInfoEntityM28111m7 != null ? futuresWelfareTrialWithDrawPopupInfoEntityM28111m7.getButtonAgree() : null));
        KcPrimaryButton tvOk = c36746d0M28112n4.f79863d;
        Intrinsics.checkNotNullExpressionValue(tvOk, "tvOk");
        C27046k.m66711z(tvOk, 0L, new Function0() { // from class: com.kubi.futures.trade.welfare.v
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FuturesTrialWithdrawRiskDialog.m28108o4(this.f24907b);
            }
        }, 1, null);
        BaseTextView tvCustomerService = c36746d0M28112n4.f79861b;
        Intrinsics.checkNotNullExpressionValue(tvCustomerService, "tvCustomerService");
        C27046k.m66711z(tvCustomerService, 0L, new Function0() { // from class: com.kubi.futures.trade.welfare.w
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FuturesTrialWithdrawRiskDialog.m28109p4(this.f24956b);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: o4 */
    public static final Unit m28108o4(FuturesTrialWithdrawRiskDialog futuresTrialWithdrawRiskDialog) {
        futuresTrialWithdrawRiskDialog.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: p4 */
    public static final Unit m28109p4(FuturesTrialWithdrawRiskDialog futuresTrialWithdrawRiskDialog) {
        String buttonAgreeAppUrl;
        FuturesWelfareTrialWithDrawPopupInfoEntity futuresWelfareTrialWithDrawPopupInfoEntityM28111m4 = futuresTrialWithdrawRiskDialog.m28111m4();
        if (futuresWelfareTrialWithDrawPopupInfoEntityM28111m4 != null && (buttonAgreeAppUrl = futuresWelfareTrialWithDrawPopupInfoEntityM28111m4.getButtonAgreeAppUrl()) != null) {
            InterfaceC37766r.a.m85190a(C37304a.f82764a, buttonAgreeAppUrl, null, null, null, null, null, null, 126, null);
        }
        futuresTrialWithdrawRiskDialog.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: q4 */
    public static final FuturesWelfareTrialWithDrawPopupInfoEntity m28110q4(FuturesTrialWithdrawRiskDialog futuresTrialWithdrawRiskDialog) {
        Bundle arguments = futuresTrialWithdrawRiskDialog.getArguments();
        if (arguments != null) {
            return (FuturesWelfareTrialWithDrawPopupInfoEntity) BundleCompat.getParcelable(arguments, "data", FuturesWelfareTrialWithDrawPopupInfoEntity.class);
        }
        return null;
    }
}
