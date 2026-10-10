package com.kubi.futures.dialog;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.kubi.broker.RepositoryServiceLocator;
import com.kubi.event.api.C12572a;
import com.kubi.futures.data.platform.model.OpenFuturesAgreement;
import com.kubi.futures.trade.welfare.distribution.PopupFrequencyManager;
import com.kubi.host.HostManager;
import com.kubi.kumex.R$layout;
import com.kubi.kumex.R$string;
import com.kubi.kumex.data.platform.model.OpenEntity;
import com.kubi.kumex.guide.OpenFuturesGuide;
import com.kubi.kumex.service.KuMexDepend;
import com.kubi.kumex.utils.C17058m0;
import com.kubi.kumex.utils.C17060n0;
import com.kubi.network.retrofit.exception.ApiException;
import com.kubi.p110rn.api.IReactNativeService;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.tradebase.business.kyc.KycViewModel;
import com.kubi.utils.DataMapUtil;
import com.kubi.utils.FlowableCompat;
import com.kubi.utils.ToastCompat;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.web.api.IWebService;
import com.tencent.qcloud.tuicore.TUIConstants;
import dm.C36859w;
import gf.C37890n;
import gf.InterfaceC37888l;
import io.reactivex.Flowable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.DisposableKt;
import java.util.List;
import kotlinx.coroutines.C41686h;
import kotlinx.coroutines.C41696j;
import o00.C42911a;
import o00.C42916f;
import om.C43157a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p294gz.C38057a;
import p569qq.C43852m;
import p663uh.InterfaceC45237a;
import p729wl.C45875l0;
import p801yl.C46527h0;
import p836zl.C46894j;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import p852kotlin.text.StringsKt;
import sh0.InterfaceC44418d;
import w00.C45681e;

/* JADX INFO: compiled from: OpenFuturesTradingDialog.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 52\u00020\u0001:\u00015B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0015\u001a\u00020\u0016H\u0016J&\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\u001a\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u001d2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\b\u0010'\u001a\u00020%H\u0002J\u001e\u0010(\u001a\u00020%2\u000e\u0010)\u001a\n\u0012\u0004\u0012\u00020+\u0018\u00010*H\u0082@¢\u0006\u0002\u0010,J\u0010\u0010-\u001a\u00020\u00112\u0006\u0010.\u001a\u00020\u0011H\u0002J\b\u0010/\u001a\u00020%H\u0002J\u0010\u00100\u001a\u00020%2\u0006\u00101\u001a\u000202H\u0016J\b\u00103\u001a\u00020%H\u0002J\b\u00104\u001a\u00020%H\u0002R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0017\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u000f\u001a\u0004\b\u0019\u0010\u001a¨\u00066"}, m90084d2 = {"Lcom/kubi/futures/dialog/OpenFuturesTradingDialog;", "Lcom/kubi/resources/dialog/DialogFragmentHelper;", "<init>", "()V", "binding", "Lcom/kubi/kumex/databinding/BkumexDialogFutureOpenFuturesBinding;", "getBinding", "()Lcom/kubi/kumex/databinding/BkumexDialogFutureOpenFuturesBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "kycViewModel", "Lcom/kubi/tradebase/business/kyc/KycViewModel;", "getKycViewModel", "()Lcom/kubi/tradebase/business/kyc/KycViewModel;", "kycViewModel$delegate", "Lkotlin/Lazy;", "mSuperPageId", "", "getMSuperPageId", "()Ljava/lang/String;", "mSuperPageId$delegate", "initType", "", "fromDistribution", "", "getFromDistribution", "()Z", "fromDistribution$delegate", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "setAgreementsInfo", "initViewAccording", "unsignedAgreements", "", "Lcom/kubi/futures/data/platform/model/OpenFuturesAgreement;", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "generateAgreementUrl", "path", "openAction", "onDismiss", "dialog", "Landroid/content/DialogInterface;", "checkDismissBonusDialog", "setOpenContract", "Companion", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nOpenFuturesTradingDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OpenFuturesTradingDialog.kt\ncom/kubi/futures/dialog/OpenFuturesTradingDialog\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 View.kt\nandroidx/core/view/ViewKt\n+ 4 MviEx.kt\ncom/kubi/mvi/common/MviExKt\n*L\n1#1,312:1\n143#2,20:313\n256#3,2:333\n220#4,5:335\n*S KotlinDebug\n*F\n+ 1 OpenFuturesTradingDialog.kt\ncom/kubi/futures/dialog/OpenFuturesTradingDialog\n*L\n81#1:313,20\n127#1:333,2\n82#1:335,5\n*E\n"})
public final class OpenFuturesTradingDialog extends DialogFragmentHelper {

    /* JADX INFO: renamed from: q0 */
    @NotNull
    public final InterfaceC24293a f22788q0 = C45681e.m100799e(this, new Function1<OpenFuturesTradingDialog, C36859w>() { // from class: com.kubi.futures.dialog.OpenFuturesTradingDialog$special$$inlined$viewBindingFragment$default$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C36859w invoke(@NotNull OpenFuturesTradingDialog fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C36859w.m82583a(fragment.requireView());
        }
    }, new Function1<C36859w, Unit>() { // from class: com.kubi.futures.dialog.OpenFuturesTradingDialog$special$$inlined$viewBindingFragment$default$1
        public final void invoke(@NotNull C36859w it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C36859w c36859w) {
            invoke(c36859w);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: r0 */
    @NotNull
    public final Lazy f22789r0 = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.dialog.m0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return OpenFuturesTradingDialog.m25142I4(this.f22862b);
        }
    });

    /* JADX INFO: renamed from: s0 */
    @NotNull
    public final Lazy f22790s0 = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.dialog.n0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return OpenFuturesTradingDialog.m25143J4(this.f22866b);
        }
    });

    /* JADX INFO: renamed from: t0 */
    @NotNull
    public final Lazy f22791t0 = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.dialog.o0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Boolean.valueOf(OpenFuturesTradingDialog.m25140B4(this.f22869b));
        }
    });

    /* JADX INFO: renamed from: v0 */
    public static final /* synthetic */ KProperty<Object>[] f22787v0 = {Reflection.property1(new PropertyReference1Impl(OpenFuturesTradingDialog.class, "binding", "getBinding()Lcom/kubi/kumex/databinding/BkumexDialogFutureOpenFuturesBinding;", 0))};

    /* JADX INFO: renamed from: u0 */
    @NotNull
    public static final Companion f22786u0 = new Companion(null);

    /* JADX INFO: compiled from: OpenFuturesTradingDialog.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m90084d2 = {"Lcom/kubi/futures/dialog/OpenFuturesTradingDialog$Companion;", "", "<init>", "()V", "EXTRA_AGREEMENTS", "", "OPEN_CONTRACT_DIALOG_DISMISSED_EVENT", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: C4 */
    public final String m25170C4(String str) {
        if (!StringsKt.startsWith$default(str, "/", false, 2, (Object) null)) {
            str = '/' + str;
        }
        return HostManager.a.m() + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F4 */
    public final KycViewModel m25141F4() {
        return (KycViewModel) this.f22789r0.getValue();
    }

    /* JADX INFO: renamed from: I4 */
    public static final KycViewModel m25142I4(OpenFuturesTradingDialog openFuturesTradingDialog) {
        return (KycViewModel) new ViewModelProvider(openFuturesTradingDialog).get(KycViewModel.class);
    }

    /* JADX INFO: renamed from: Q4 */
    public static final OpenEntity m25149Q4() {
        return InterfaceC45237a.m99970y(RepositoryServiceLocator.f19236a.m20290i(), null, 1, null);
    }

    /* JADX INFO: renamed from: D4 */
    public final C36859w m25171D4() {
        return (C36859w) this.f22788q0.getValue(this, f22787v0[0]);
    }

    /* JADX INFO: renamed from: E4 */
    public final boolean m25172E4() {
        return ((Boolean) this.f22791t0.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: G4 */
    public final String m25173G4() {
        return (String) this.f22790s0.getValue();
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper
    /* JADX INFO: renamed from: N3 */
    public int mo24511N3() {
        return 8;
    }

    /* JADX INFO: renamed from: U4 */
    public final void m25177U4() {
        DataMapUtil.f54245a.m66377l(C45875l0.f103336a.m101357y0(), true);
        KuMexDepend.f30378a.m35905g().k();
        IWebService.f54644a.get().mo36738a("onOpenContract");
        IReactNativeService iReactNativeService = IReactNativeService.INSTANCE.get();
        if (iReactNativeService != null) {
            IReactNativeService.nativeNotifyRn$default(iReactNativeService, "onOpenContract", null, 2, null);
        }
        InterfaceC37888l.m85589n(C37890n.f85269a, null, 1, null);
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return inflater.inflate(R$layout.bkumex_dialog_future_open_futures, container);
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull DialogInterface dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        super.onDismiss(dialog);
        C12572a.m23695d("open_contract_dialog_dismissed_event", null, 0L, 6, null);
    }

    /* JADX INFO: renamed from: B4 */
    public static final boolean m25140B4(OpenFuturesTradingDialog openFuturesTradingDialog) {
        Boolean boolValueOf;
        Bundle arguments = openFuturesTradingDialog.getArguments();
        if (arguments != null) {
            boolValueOf = Boolean.valueOf(RouteExKt.m56250h(arguments, "fromDistribution"));
        } else {
            boolValueOf = null;
        }
        return C27025c.m66566d(boolValueOf);
    }

    /* JADX INFO: renamed from: J4 */
    public static final String m25143J4(OpenFuturesTradingDialog openFuturesTradingDialog) {
        String strM56285z;
        Bundle arguments = openFuturesTradingDialog.getArguments();
        if (arguments != null) {
            strM56285z = RouteExKt.m56285z(arguments, "superPageId", C17060n0.m36552b());
        } else {
            strM56285z = null;
        }
        return C27041f.m66669i(strM56285z, C17060n0.m36552b());
    }

    /* JADX INFO: renamed from: K4 */
    public static final Unit m25144K4(OpenFuturesTradingDialog openFuturesTradingDialog) {
        if (openFuturesTradingDialog.m25172E4()) {
            C43852m.m96591c(C17060n0.m36552b(), "RealTimeRewardOpenContract", "2", null, 8, null);
        }
        openFuturesTradingDialog.dismiss();
        OpenFuturesGuide.f29111e.sendNextStep();
        PopupFrequencyManager.f24773a.m28614a(C46894j.f104736a.m103263c0());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: M4 */
    public static final Unit m25145M4(OpenFuturesTradingDialog openFuturesTradingDialog, OpenEntity openEntity) {
        String str;
        KcPrimaryButton kcPrimaryButton;
        FragmentActivity activity;
        FragmentManager supportFragmentManager;
        String strM25173G4 = openFuturesTradingDialog.m25173G4();
        String rewardType = openEntity.getRewardType();
        if (rewardType != null && rewardType.length() != 0) {
            if (Intrinsics.areEqual(openEntity.getRewardType(), "DEDUCTION_COUPON")) {
                str = "fund";
            } else {
                str = "activity";
            }
        } else {
            str = "none";
        }
        C43852m.m96590b(strM25173G4, "ContractOpenConfirm", "1", TuplesKt.m90091to("activityType", str));
        openFuturesTradingDialog.m25177U4();
        if (!openFuturesTradingDialog.m25172E4()) {
            ToastCompat.m66437C(R$string.open_success);
            if (C38057a.f85671a.m85928a("kcApp.B6FuturesTrade.futures.userExperience", true) && (activity = openFuturesTradingDialog.getActivity()) != null && (supportFragmentManager = activity.getSupportFragmentManager()) != null) {
                CollectUserExperienceDialog collectUserExperienceDialog = new CollectUserExperienceDialog();
                collectUserExperienceDialog.setArguments(openFuturesTradingDialog.getArguments());
                collectUserExperienceDialog.show(supportFragmentManager, "CollectUserExperienceDialog");
            }
            openFuturesTradingDialog.dismiss();
            return Unit.INSTANCE;
        }
        C36859w c36859wM25171D4 = openFuturesTradingDialog.m25171D4();
        if (c36859wM25171D4 != null && (kcPrimaryButton = c36859wM25171D4.f81265b) != null) {
            kcPrimaryButton.mo28851l();
        }
        openFuturesTradingDialog.dismiss();
        OpenFuturesGuide.f29111e.sendNextStep();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: N4 */
    public static final void m25146N4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: O4 */
    public static final Unit m25147O4(OpenFuturesTradingDialog openFuturesTradingDialog, Throwable th2) {
        String str;
        KcPrimaryButton kcPrimaryButton;
        C36859w c36859wM25171D4 = openFuturesTradingDialog.m25171D4();
        if (c36859wM25171D4 != null && (kcPrimaryButton = c36859wM25171D4.f81265b) != null) {
            kcPrimaryButton.mo28851l();
        }
        if ((th2 instanceof ApiException) && Intrinsics.areEqual(((ApiException) th2).code, "400303")) {
            FragmentActivity activity = openFuturesTradingDialog.getActivity();
            if (activity != null) {
                if (openFuturesTradingDialog.m25172E4()) {
                    str = "RealTimeRewardKycGuidance";
                } else {
                    str = null;
                }
                FragmentManager supportFragmentManager = activity.getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
                LifecycleOwnerKt.getLifecycleScope(openFuturesTradingDialog).launchWhenStarted(new OpenFuturesTradingDialog$openAction$4$1$1(openFuturesTradingDialog, supportFragmentManager, str, null));
            }
        } else {
            Intrinsics.checkNotNull(th2);
            if (!C43157a.m94753a(th2, openFuturesTradingDialog.getContext())) {
                C17058m0.m36550e(openFuturesTradingDialog, th2);
            } else {
                C43852m.m96595g(openFuturesTradingDialog.m25173G4(), "EnableContryLimit", null, null, 12, null);
                openFuturesTradingDialog.m25169A4();
                openFuturesTradingDialog.dismiss();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: P4 */
    public static final void m25148P4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: R4 */
    public static final Unit m25150R4(OpenFuturesTradingDialog openFuturesTradingDialog, InterfaceC44418d interfaceC44418d) {
        KcPrimaryButton kcPrimaryButton;
        C36859w c36859wM25171D4 = openFuturesTradingDialog.m25171D4();
        if (c36859wM25171D4 != null && (kcPrimaryButton = c36859wM25171D4.f81265b) != null) {
            kcPrimaryButton.m55043o();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: S4 */
    public static final void m25151S4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: A4 */
    public final void m25169A4() {
        Fragment fragmentFindFragmentByTag;
        FragmentManager childFragmentManager;
        Fragment parentFragment = getParentFragment();
        DialogFragment dialogFragment = null;
        if (parentFragment != null && (childFragmentManager = parentFragment.getChildFragmentManager()) != null) {
            fragmentFindFragmentByTag = childFragmentManager.findFragmentByTag("DistributionBonusMainDialog");
        } else {
            fragmentFindFragmentByTag = null;
        }
        if (fragmentFindFragmentByTag instanceof DialogFragment) {
            dialogFragment = (DialogFragment) fragmentFindFragmentByTag;
        }
        if (dialogFragment != null) {
            dialogFragment.dismiss();
        }
    }

    /* JADX INFO: renamed from: H4 */
    public final Object m25174H4(List<OpenFuturesAgreement> list, Continuation<? super Unit> continuation) {
        Object objM91049g = C41686h.m91049g(C42911a.m94121c(), new OpenFuturesTradingDialog$initViewAccording$2(this, list, null), continuation);
        if (objM91049g == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return objM91049g;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: L4 */
    public final void m25175L4() {
        if (m25172E4()) {
            C43852m.m96591c(C17060n0.m36552b(), "RealTimeRewardOpenContract", "1", null, 8, null);
        }
        Flowable flowableObserveOn = FlowableCompat.f54248a.m66385b(new Function0() { // from class: com.kubi.futures.dialog.p0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OpenFuturesTradingDialog.m25149Q4();
            }
        }).subscribeOn(C42916f.m94127f()).observeOn(C42916f.m94128g());
        final Function1 function1 = new Function1() { // from class: com.kubi.futures.dialog.q0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OpenFuturesTradingDialog.m25150R4(this.f22887b, (InterfaceC44418d) obj);
            }
        };
        Flowable flowableDoOnSubscribe = flowableObserveOn.doOnSubscribe(new Consumer() { // from class: com.kubi.futures.dialog.r0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                OpenFuturesTradingDialog.m25151S4(function1, obj);
            }
        });
        final Function1 function2 = new Function1() { // from class: com.kubi.futures.dialog.s0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OpenFuturesTradingDialog.m25145M4(this.f22892b, (OpenEntity) obj);
            }
        };
        Consumer consumer = new Consumer() { // from class: com.kubi.futures.dialog.t0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                OpenFuturesTradingDialog.m25146N4(function2, obj);
            }
        };
        final Function1 function3 = new Function1() { // from class: com.kubi.futures.dialog.u0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OpenFuturesTradingDialog.m25147O4(this.f22943b, (Throwable) obj);
            }
        };
        Disposable disposableSubscribe = flowableDoOnSubscribe.subscribe(consumer, new Consumer() { // from class: com.kubi.futures.dialog.l0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                OpenFuturesTradingDialog.m25148P4(function3, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe, getF43550U());
    }

    /* JADX INFO: renamed from: T4 */
    public final void m25176T4() {
        C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new OpenFuturesTradingDialog$setAgreementsInfo$1(this, null), 3, null);
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        BaseTextView baseTextView;
        int i11;
        BaseTextView baseTextView2;
        BaseTextView baseTextView3;
        ImageView imageView;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        C43852m.m96595g(m25173G4(), "ContractOpenConfirm", "1", null, 8, null);
        m54191p3();
        C36859w c36859wM25171D4 = m25171D4();
        if (c36859wM25171D4 != null && (imageView = c36859wM25171D4.f81268e) != null) {
            C27046k.m66711z(imageView, 0L, new Function0() { // from class: com.kubi.futures.dialog.k0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return OpenFuturesTradingDialog.m25144K4(this.f22857b);
                }
            }, 1, null);
        }
        C36859w c36859wM25171D5 = m25171D4();
        if (c36859wM25171D5 != null && (baseTextView3 = c36859wM25171D5.f81270g) != null) {
            baseTextView3.setText(getString(R$string.kumex_trial_dialog_open_contract_trade));
        }
        C36859w c36859wM25171D6 = m25171D4();
        if (c36859wM25171D6 != null && (baseTextView2 = c36859wM25171D6.f81271h) != null) {
            baseTextView2.setText(getString(R$string.kumex_trial_dialog_open_contract_trade_desc, String.valueOf(C46527h0.f104291a.m102675K())));
        }
        C36859w c36859wM25171D7 = m25171D4();
        if (c36859wM25171D7 != null && (baseTextView = c36859wM25171D7.f81271h) != null) {
            if (C38057a.f85671a.m85928a("kcApp.B6FuturesTrade.futures.maxLeverage", true)) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            baseTextView.setVisibility(i11);
        }
        m25176T4();
    }
}
