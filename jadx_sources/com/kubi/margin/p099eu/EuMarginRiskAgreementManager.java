package com.kubi.margin.p099eu;

import android.app.Dialog;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwnerKt;
import com.kubi.margin.R$id;
import com.kubi.margin.R$layout;
import com.kubi.network.retrofit.utils.C19331c;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.router.core.Router;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.base.entity.BaseEntity;
import com.kubi.sdk.site.info.SiteInfoManager;
import com.kubi.utils.ToastCompat;
import com.kubi.utils.extensions.core.ViewExtKt;
import gp.InterfaceC37977a;
import io.chad.library.adapter.base.BaseViewHolder;
import kotlinx.coroutines.AbstractC41697j0;
import kotlinx.coroutines.C41686h;
import kotlinx.coroutines.C41696j;
import mr.C42597a;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import p698vp.C45618h;
import p768xo.InterfaceC46305f;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;
import y70.C46392a;

/* JADX INFO: compiled from: EuMarginRiskAgreementManager.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0012J$\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0012H\u0082@¢\u0006\u0002\u0010\u0014J\u001e\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0012H\u0002J$\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0012H\u0082@¢\u0006\u0002\u0010\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R#\u0010\u0006\u001a\n \b*\u0004\u0018\u00010\u00070\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n¨\u0006\u0017"}, m90084d2 = {"Lcom/kubi/margin/eu/EuMarginRiskAgreementManager;", "", "<init>", "()V", "TAG", "", "api", "Lcom/kubi/margin/api/MarginApi;", "kotlin.jvm.PlatformType", "getApi", "()Lcom/kubi/margin/api/MarginApi;", "api$delegate", "Lkotlin/Lazy;", "checkIfNeeded", "", "fragment", "Lcom/kubi/sdk/BaseFragment;", "onPassed", "Lkotlin/Function0;", "fetchAgreementStatus", "(Lcom/kubi/sdk/BaseFragment;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "showAgreementDialog", "signAgreement", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nEuMarginRiskAgreementManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EuMarginRiskAgreementManager.kt\ncom/kubi/margin/eu/EuMarginRiskAgreementManager\n+ 2 FlavorEx.kt\ncom/kubi/kucoin/helper/FlavorExKt\n+ 3 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,113:1\n17#2,2:114\n135#3,2:116\n126#3,2:118\n126#3,2:120\n1#4:122\n*S KotlinDebug\n*F\n+ 1 EuMarginRiskAgreementManager.kt\ncom/kubi/margin/eu/EuMarginRiskAgreementManager\n*L\n43#1:114,2\n47#1:116,2\n62#1:118,2\n100#1:120,2\n*E\n"})
public final class EuMarginRiskAgreementManager {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final EuMarginRiskAgreementManager f33022a = new EuMarginRiskAgreementManager();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Lazy f33023b = LazyKt.lazy(new Function0() { // from class: com.kubi.margin.eu.a
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return EuMarginRiskAgreementManager.m38342i();
        }
    });

    /* JADX INFO: renamed from: n */
    public static final Unit m38343n(final BaseFragment baseFragment, final Function0 function0, final BaseViewHolder viewHolder, final DialogFragmentHelper helper) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(helper, "helper");
        View view = viewHolder.getView(R$id.iv_close);
        Intrinsics.checkNotNullExpressionValue(view, "getView(...)");
        ViewExtKt.m66575f(view, new Function1() { // from class: com.kubi.margin.eu.c
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EuMarginRiskAgreementManager.m38344o(helper, (View) obj);
            }
        });
        ((CheckBox) viewHolder.getView(R$id.checkbox)).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.kubi.margin.eu.d
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
                EuMarginRiskAgreementManager.m38345p(viewHolder, compoundButton, z11);
            }
        });
        View view2 = viewHolder.getView(R$id.btnConfirm);
        Intrinsics.checkNotNullExpressionValue(view2, "getView(...)");
        ViewExtKt.m66575f(view2, new Function1() { // from class: com.kubi.margin.eu.e
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EuMarginRiskAgreementManager.m38346q(baseFragment, function0, helper, (View) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o */
    public static final Unit m38344o(DialogFragmentHelper dialogFragmentHelper, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Dialog dialog = dialogFragmentHelper.getDialog();
        if (dialog != null) {
            dialog.dismiss();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: p */
    public static final void m38345p(BaseViewHolder baseViewHolder, CompoundButton compoundButton, boolean z11) {
        baseViewHolder.getView(R$id.btnConfirm).setEnabled(z11);
    }

    /* JADX INFO: renamed from: q */
    public static final Unit m38346q(BaseFragment baseFragment, Function0 function0, DialogFragmentHelper dialogFragmentHelper, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(baseFragment), null, null, new EuMarginRiskAgreementManager$showAgreementDialog$1$3$1(baseFragment, function0, dialogFragmentHelper, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: j */
    public final void m38347j(@NotNull BaseFragment fragment, @NotNull Function0<Unit> onPassed) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(onPassed, "onPassed");
        Object objM56186h = Router.f46192a.m56186h(InterfaceC37977a.class, SiteInfoManager.f47913a.m58109c());
        if (!(objM56186h != null ? ((InterfaceC37977a) objM56186h).mo85830a() : false)) {
            onPassed.invoke();
        } else if (C46392a.m102322d(C45618h.f102740a.m100717e(), false)) {
            onPassed.invoke();
        } else {
            C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(fragment), null, null, new EuMarginRiskAgreementManager$checkIfNeeded$3(fragment, onPassed, null), 3, null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: k */
    public final Object m38348k(BaseFragment baseFragment, Function0<Unit> function0, Continuation<? super Unit> continuation) {
        EuMarginRiskAgreementManager$fetchAgreementStatus$1 euMarginRiskAgreementManager$fetchAgreementStatus$1;
        if (continuation instanceof EuMarginRiskAgreementManager$fetchAgreementStatus$1) {
            euMarginRiskAgreementManager$fetchAgreementStatus$1 = (EuMarginRiskAgreementManager$fetchAgreementStatus$1) continuation;
            int i11 = euMarginRiskAgreementManager$fetchAgreementStatus$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                euMarginRiskAgreementManager$fetchAgreementStatus$1.label = i11 - Integer.MIN_VALUE;
            } else {
                euMarginRiskAgreementManager$fetchAgreementStatus$1 = new EuMarginRiskAgreementManager$fetchAgreementStatus$1(this, continuation);
            }
        } else {
            euMarginRiskAgreementManager$fetchAgreementStatus$1 = new EuMarginRiskAgreementManager$fetchAgreementStatus$1(this, continuation);
        }
        Object objM91049g = euMarginRiskAgreementManager$fetchAgreementStatus$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = euMarginRiskAgreementManager$fetchAgreementStatus$1.label;
        try {
            if (i12 == 0) {
                ResultKt.throwOnFailure(objM91049g);
                AbstractC41697j0 abstractC41697j0M94120b = C42911a.m94120b();
                EuMarginRiskAgreementManager$fetchAgreementStatus$signed$1 euMarginRiskAgreementManager$fetchAgreementStatus$signed$1 = new EuMarginRiskAgreementManager$fetchAgreementStatus$signed$1(null);
                euMarginRiskAgreementManager$fetchAgreementStatus$1.L$0 = baseFragment;
                euMarginRiskAgreementManager$fetchAgreementStatus$1.L$1 = function0;
                euMarginRiskAgreementManager$fetchAgreementStatus$1.label = 1;
                objM91049g = C41686h.m91049g(abstractC41697j0M94120b, euMarginRiskAgreementManager$fetchAgreementStatus$signed$1, euMarginRiskAgreementManager$fetchAgreementStatus$1);
                if (objM91049g == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                function0 = (Function0) euMarginRiskAgreementManager$fetchAgreementStatus$1.L$1;
                baseFragment = (BaseFragment) euMarginRiskAgreementManager$fetchAgreementStatus$1.L$0;
                ResultKt.throwOnFailure(objM91049g);
            }
            if (((Boolean) objM91049g).booleanValue()) {
                C46392a.m102328k(C45618h.f102740a.m100717e(), true);
                function0.invoke();
            } else {
                m38350m(baseFragment, function0);
            }
        } catch (Exception e11) {
            C44128b.m97261e("EuMarginRiskAgreementManager", "fetchAgreementStatus failed: " + e11);
            C19331c.m42836c(e11, null, 2, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: l */
    public final InterfaceC46305f m38349l() {
        return (InterfaceC46305f) f33023b.getValue();
    }

    /* JADX INFO: renamed from: m */
    public final void m38350m(final BaseFragment baseFragment, final Function0<Unit> function0) {
        DialogFragmentHelper dialogFragmentHelperM54237f4 = DialogFragmentHelper.f43568p0.newInstance(R$layout.bmargin_dialog_eu_risk_agreement, true).m54237f4(new Function2() { // from class: com.kubi.margin.eu.b
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return EuMarginRiskAgreementManager.m38343n(baseFragment, function0, (BaseViewHolder) obj, (DialogFragmentHelper) obj2);
            }
        });
        FragmentManager childFragmentManager = baseFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        dialogFragmentHelperM54237f4.show(childFragmentManager, "eu_margin_risk_agreement");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: r */
    public final Object m38351r(BaseFragment baseFragment, Function0<Unit> function0, Continuation<? super Unit> continuation) {
        EuMarginRiskAgreementManager$signAgreement$1 euMarginRiskAgreementManager$signAgreement$1;
        if (continuation instanceof EuMarginRiskAgreementManager$signAgreement$1) {
            euMarginRiskAgreementManager$signAgreement$1 = (EuMarginRiskAgreementManager$signAgreement$1) continuation;
            int i11 = euMarginRiskAgreementManager$signAgreement$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                euMarginRiskAgreementManager$signAgreement$1.label = i11 - Integer.MIN_VALUE;
            } else {
                euMarginRiskAgreementManager$signAgreement$1 = new EuMarginRiskAgreementManager$signAgreement$1(this, continuation);
            }
        } else {
            euMarginRiskAgreementManager$signAgreement$1 = new EuMarginRiskAgreementManager$signAgreement$1(this, continuation);
        }
        Object objM91049g = euMarginRiskAgreementManager$signAgreement$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = euMarginRiskAgreementManager$signAgreement$1.label;
        try {
            if (i12 == 0) {
                ResultKt.throwOnFailure(objM91049g);
                AbstractC41697j0 abstractC41697j0M94120b = C42911a.m94120b();
                EuMarginRiskAgreementManager$signAgreement$result$1 euMarginRiskAgreementManager$signAgreement$result$1 = new EuMarginRiskAgreementManager$signAgreement$result$1(null);
                euMarginRiskAgreementManager$signAgreement$1.L$0 = SpillingKt.nullOutSpilledVariable(baseFragment);
                euMarginRiskAgreementManager$signAgreement$1.L$1 = function0;
                euMarginRiskAgreementManager$signAgreement$1.label = 1;
                objM91049g = C41686h.m91049g(abstractC41697j0M94120b, euMarginRiskAgreementManager$signAgreement$result$1, euMarginRiskAgreementManager$signAgreement$1);
                if (objM91049g == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                function0 = (Function0) euMarginRiskAgreementManager$signAgreement$1.L$1;
                ResultKt.throwOnFailure(objM91049g);
            }
            BaseEntity baseEntity = (BaseEntity) objM91049g;
            if (baseEntity.getSuccess()) {
                C46392a.m102328k(C45618h.f102740a.m100717e(), true);
                function0.invoke();
            } else {
                String msg = baseEntity.getMsg();
                Intrinsics.checkNotNull(msg);
                if (msg.length() <= 0) {
                    msg = null;
                }
                if (msg != null) {
                    ToastCompat.m66441G(msg, new Object[0]);
                }
            }
        } catch (Exception e11) {
            C44128b.m97261e("EuMarginRiskAgreementManager", "signAgreement failed: " + e11);
            C19331c.m42836c(e11, null, 2, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: i */
    public static final InterfaceC46305f m38342i() {
        return (InterfaceC46305f) C42597a.m93386b().create(InterfaceC46305f.class);
    }
}
