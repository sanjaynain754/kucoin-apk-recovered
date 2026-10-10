package com.kubi.payment.helper;

import android.content.DialogInterface;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleCoroutineScope;
import com.kubi.network.retrofit.utils.C19331c;
import com.kubi.otc.OtcUserManager;
import com.kubi.otc.R$drawable;
import com.kubi.otc.R$string;
import com.kubi.otc.security.SecuritySettingDialog;
import com.kubi.otc.service.OtcDepend;
import com.kubi.payment.PaymentServiceLocator;
import com.kubi.payment.data.entities.UserInfo;
import com.kubi.payment.data.entities.VersionCheck;
import com.kubi.payment.data.source.PaymentRepository;
import com.kubi.payment.util.PaymentStorageId;
import com.kubi.resources.dialog.AlertDialogFragmentHelper;
import com.kubi.utils.ToastCompat;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27041f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p477nt.AbstractC42878k;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.ResultKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.jvm.internal.Intrinsics;
import y70.C46392a;

/* JADX INFO: compiled from: PreCheckHelper.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u0005H\u0086@¢\u0006\u0002\u0010\u0006J \u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0086@¢\u0006\u0002\u0010\fJ \u0010\r\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J\u000e\u0010\u0012\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tJ\u0006\u0010\u0013\u001a\u00020\u0005J\u0006\u0010\u0014\u001a\u00020\u0005J\u0006\u0010\u0015\u001a\u00020\u0005J\u0006\u0010\u0016\u001a\u00020\u0005J\u0006\u0010\u0017\u001a\u00020\u0005J\u0016\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u001aJ\u0018\u0010\u001b\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\u001c\u001a\u00020\u0005J\b\u0010\u001d\u001a\u00020\u0005H\u0002¨\u0006\u001e"}, m90084d2 = {"Lcom/kubi/payment/helper/PreCheckHelper;", "", "<init>", "()V", "loadKycInfo", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadVersionCheck", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "request", "Lcom/kubi/payment/data/entities/VersionCheck$Request;", "(Landroidx/fragment/app/FragmentManager;Lcom/kubi/payment/data/entities/VersionCheck$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "showGuide", "", "type", "", "content", "preCheckEmail", "isBindEmail", "isBindPhone", "isBindTradingPassword", "isHighKyc", "hasOpenDoubleCheck", "preCheckKycExpired", "coroutineScope", "Landroidx/lifecycle/LifecycleCoroutineScope;", "showKycExpiredAlertDialog", "forceShow", "cacheAlertValue", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class PreCheckHelper {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final PreCheckHelper f39543a = new PreCheckHelper();

    /* JADX INFO: renamed from: o */
    public static final void m48230o(DialogInterface dialogInterface, int i11) {
        OtcDepend.f38138a.m45465n();
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ boolean m48231q(PreCheckHelper preCheckHelper, FragmentManager fragmentManager, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        return preCheckHelper.m48244p(fragmentManager, z11);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m48233d() {
        return C46392a.m102322d(PaymentStorageId.f40364a.m49836n(), true);
    }

    /* JADX INFO: renamed from: e */
    public final boolean m48234e() {
        return OtcDepend.f38138a.m45461j().hasOpenDoubleCheck();
    }

    /* JADX INFO: renamed from: f */
    public final boolean m48235f() {
        return OtcDepend.f38138a.m45464m().M();
    }

    /* JADX INFO: renamed from: g */
    public final boolean m48236g() {
        return OtcDepend.f38138a.m45464m().R();
    }

    /* JADX INFO: renamed from: h */
    public final boolean m48237h() {
        return OtcDepend.f38138a.m45461j().isWithDrawPassword();
    }

    /* JADX INFO: renamed from: i */
    public final boolean m48238i() {
        return OtcUserManager.f38144a.m45493u();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: j */
    public final Object m48239j(@NotNull Continuation<? super Boolean> continuation) {
        PreCheckHelper$loadKycInfo$1 preCheckHelper$loadKycInfo$1;
        boolean zM66566d;
        if (continuation instanceof PreCheckHelper$loadKycInfo$1) {
            preCheckHelper$loadKycInfo$1 = (PreCheckHelper$loadKycInfo$1) continuation;
            int i11 = preCheckHelper$loadKycInfo$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                preCheckHelper$loadKycInfo$1.label = i11 - Integer.MIN_VALUE;
            } else {
                preCheckHelper$loadKycInfo$1 = new PreCheckHelper$loadKycInfo$1(this, continuation);
            }
        } else {
            preCheckHelper$loadKycInfo$1 = new PreCheckHelper$loadKycInfo$1(this, continuation);
        }
        Object objMo46264E = preCheckHelper$loadKycInfo$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = preCheckHelper$loadKycInfo$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objMo46264E);
            PaymentRepository paymentRepositoryM45618f = PaymentServiceLocator.f38204a.m45618f();
            UserInfo.Request request = new UserInfo.Request(null, null, null, null, 15, null);
            preCheckHelper$loadKycInfo$1.L$0 = SpillingKt.nullOutSpilledVariable(paymentRepositoryM45618f);
            preCheckHelper$loadKycInfo$1.L$1 = SpillingKt.nullOutSpilledVariable(request);
            preCheckHelper$loadKycInfo$1.I$0 = 1;
            preCheckHelper$loadKycInfo$1.label = 1;
            objMo46264E = paymentRepositoryM45618f.mo46264E(request, preCheckHelper$loadKycInfo$1);
            if (objMo46264E == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objMo46264E);
        }
        AbstractC42878k abstractC42878k = (AbstractC42878k) objMo46264E;
        if (abstractC42878k instanceof AbstractC42878k.Success) {
            UserInfo.KycInfoResponse kycInfo = ((UserInfo.Response) ((AbstractC42878k.Success) abstractC42878k).m94040a()).getKycInfo();
            zM66566d = C27025c.m66566d(kycInfo != null ? kycInfo.isVerified() : null);
        } else {
            if (!(abstractC42878k instanceof AbstractC42878k.Error)) {
                throw new NoWhenBranchMatchedException();
            }
            C19331c.m42836c(((AbstractC42878k.Error) abstractC42878k).getException(), null, 2, null);
            zM66566d = false;
        }
        return Boxing.boxBoolean(zM66566d);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: k */
    public final Object m48240k(@NotNull FragmentManager fragmentManager, @Nullable VersionCheck.Request request, @NotNull Continuation<? super Boolean> continuation) {
        PreCheckHelper$loadVersionCheck$1 preCheckHelper$loadVersionCheck$1;
        if (continuation instanceof PreCheckHelper$loadVersionCheck$1) {
            preCheckHelper$loadVersionCheck$1 = (PreCheckHelper$loadVersionCheck$1) continuation;
            int i11 = preCheckHelper$loadVersionCheck$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                preCheckHelper$loadVersionCheck$1.label = i11 - Integer.MIN_VALUE;
            } else {
                preCheckHelper$loadVersionCheck$1 = new PreCheckHelper$loadVersionCheck$1(this, continuation);
            }
        } else {
            preCheckHelper$loadVersionCheck$1 = new PreCheckHelper$loadVersionCheck$1(this, continuation);
        }
        Object objMo46268n = preCheckHelper$loadVersionCheck$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = preCheckHelper$loadVersionCheck$1.label;
        boolean z11 = true;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objMo46268n);
            if (request == null) {
                return Boxing.boxBoolean(true);
            }
            PaymentRepository paymentRepositoryM45618f = PaymentServiceLocator.f38204a.m45618f();
            preCheckHelper$loadVersionCheck$1.L$0 = fragmentManager;
            preCheckHelper$loadVersionCheck$1.L$1 = SpillingKt.nullOutSpilledVariable(request);
            preCheckHelper$loadVersionCheck$1.L$2 = SpillingKt.nullOutSpilledVariable(paymentRepositoryM45618f);
            preCheckHelper$loadVersionCheck$1.I$0 = 1;
            preCheckHelper$loadVersionCheck$1.label = 1;
            objMo46268n = paymentRepositoryM45618f.mo46268n(request, preCheckHelper$loadVersionCheck$1);
            if (objMo46268n == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fragmentManager = (FragmentManager) preCheckHelper$loadVersionCheck$1.L$0;
            ResultKt.throwOnFailure(objMo46268n);
        }
        AbstractC42878k abstractC42878k = (AbstractC42878k) objMo46268n;
        if (abstractC42878k instanceof AbstractC42878k.Success) {
            AbstractC42878k.Success success = (AbstractC42878k.Success) abstractC42878k;
            if (!C27025c.m66566d(((VersionCheck.Response) success.m94040a()).getStatus())) {
                m48243n(fragmentManager, C27041f.m66668h(((VersionCheck.Response) success.m94040a()).getType()), C27041f.m66668h(((VersionCheck.Response) success.m94040a()).getContent()));
            }
            return Boxing.boxBoolean(z11);
        }
        if (!(abstractC42878k instanceof AbstractC42878k.Error)) {
            throw new NoWhenBranchMatchedException();
        }
        C19331c.m42836c(((AbstractC42878k.Error) abstractC42878k).getException(), null, 2, null);
        z11 = false;
        return Boxing.boxBoolean(z11);
    }

    /* JADX INFO: renamed from: l */
    public final boolean m48241l(@NotNull FragmentManager fragmentManager) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        if (m48235f()) {
            return true;
        }
        SecuritySettingDialog.f38120x0.show(fragmentManager, new SecuritySettingDialog.SecuritySetting(false, false, true, false, false, null, 59, null));
        return false;
    }

    /* JADX INFO: renamed from: m */
    public final void m48242m(@NotNull FragmentManager fragmentManager, @NotNull LifecycleCoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        coroutineScope.launchWhenStarted(new PreCheckHelper$preCheckKycExpired$1(fragmentManager, null));
    }

    /* JADX INFO: renamed from: n */
    public final void m48243n(FragmentManager fragmentManager, String str, String str2) {
        if (Intrinsics.areEqual(str, "1")) {
            AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54167X4(R$string.dialog_title_text_tip).m54156M4(C27041f.m66668h(str2)).m54162S4(R$string.i_already_know, null).show(fragmentManager, "payment_version_check_guide_web");
        } else if (Intrinsics.areEqual(str, "2")) {
            AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54167X4(R$string.dialog_title_text_tip).m54156M4(C27041f.m66668h(str2)).m54162S4(R$string.dialog_but_appupgrade_upgrade, new DialogInterface.OnClickListener() { // from class: com.kubi.payment.helper.c
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i11) {
                    PreCheckHelper.m48230o(dialogInterface, i11);
                }
            }).m54159P4(R$string.cancel, null).show(fragmentManager, "payment_version_check_guide_app");
        } else {
            ToastCompat.m66441G(str2, new Object[0]);
        }
    }

    /* JADX INFO: renamed from: p */
    public final boolean m48244p(@NotNull FragmentManager fragmentManager, boolean z11) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        if (!z11 && !m48233d()) {
            return false;
        }
        AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54165V4(R$drawable.ic2_common_warning).m54169Z4(true).m54157N4(true).m54167X4(R$string.payment_kycexpired_tip_title).m54153J4(R$string.payment_kycexpired_tip_content).m54162S4(R$string.payment_i_know, new DialogInterface.OnClickListener() { // from class: com.kubi.payment.helper.b
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                PreCheckHelper.m48232r(dialogInterface, i11);
            }
        }).show(fragmentManager, "payment_dialog_kyc_expired");
        C46392a.m102328k(PaymentStorageId.f40364a.m49836n(), false);
        return true;
    }

    /* JADX INFO: renamed from: r */
    public static final void m48232r(DialogInterface dialogInterface, int i11) {
    }
}
