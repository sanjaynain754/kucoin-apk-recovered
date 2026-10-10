package com.kubi.payment.channel.precheck;

import android.content.DialogInterface;
import androidx.fragment.app.FragmentManager;
import com.kubi.network.retrofit.utils.C19331c;
import com.kubi.otc.R$string;
import com.kubi.otc.entity.FastQuoteModel;
import com.kubi.otc.service.OtcDepend;
import com.kubi.payment.PaymentServiceLocator;
import com.kubi.payment.data.entities.VersionCheck;
import com.kubi.payment.data.source.PaymentRepository;
import com.kubi.resources.dialog.AlertDialogFragmentHelper;
import com.kubi.utils.ToastCompat;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p477nt.AbstractC42878k;
import p658ub.C45148b;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.ResultKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: VersionPreCheckInterceptor.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0096@¢\u0006\u0002\u0010\bJ \u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¨\u0006\u0010"}, m90084d2 = {"Lcom/kubi/payment/channel/precheck/VersionPreCheckInterceptor;", "Lcom/kubi/payment/channel/precheck/IPreCheckInterceptor;", "<init>", "()V", "intercept", "Lcom/kubi/payment/channel/precheck/PreCheckResult;", "param", "Lcom/kubi/payment/channel/precheck/PreCheckRequest;", "(Lcom/kubi/payment/channel/precheck/PreCheckRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "showGuide", "", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "type", "", "content", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class VersionPreCheckInterceptor implements IPreCheckInterceptor {
    /* JADX INFO: renamed from: d */
    public static final void m45998d(DialogInterface dialogInterface, int i11) {
        OtcDepend.f38138a.m45465n();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.kubi.payment.channel.precheck.IPreCheckInterceptor
    @Nullable
    /* JADX INFO: renamed from: a */
    public Object mo45994a(@NotNull PreCheckRequest preCheckRequest, @NotNull Continuation<? super PreCheckResult> continuation) {
        VersionPreCheckInterceptor$intercept$1 versionPreCheckInterceptor$intercept$1;
        String str;
        if (continuation instanceof VersionPreCheckInterceptor$intercept$1) {
            versionPreCheckInterceptor$intercept$1 = (VersionPreCheckInterceptor$intercept$1) continuation;
            int i11 = versionPreCheckInterceptor$intercept$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                versionPreCheckInterceptor$intercept$1.label = i11 - Integer.MIN_VALUE;
            } else {
                versionPreCheckInterceptor$intercept$1 = new VersionPreCheckInterceptor$intercept$1(this, continuation);
            }
        } else {
            versionPreCheckInterceptor$intercept$1 = new VersionPreCheckInterceptor$intercept$1(this, continuation);
        }
        Object objMo46268n = versionPreCheckInterceptor$intercept$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = versionPreCheckInterceptor$intercept$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objMo46268n);
            PreCheckResult.c cVar = PreCheckResult.c.f38378a;
            String tradeType = preCheckRequest.getTradeType();
            if (Intrinsics.areEqual(tradeType, FastQuoteModel.PAY_RECHARGE)) {
                str = "FIAT_RECHARGE";
            } else {
                str = Intrinsics.areEqual(tradeType, "WITHDRAW") ? "FIAT_WITHDRAW" : "";
            }
            VersionCheck.Request request = new VersionCheck.Request(str, preCheckRequest.getFiatCurrency(), null, preCheckRequest.getPaymentMethodCode(), preCheckRequest.getChannelId(), null, 36, null);
            PaymentRepository paymentRepositoryM45618f = PaymentServiceLocator.f38204a.m45618f();
            versionPreCheckInterceptor$intercept$1.L$0 = preCheckRequest;
            versionPreCheckInterceptor$intercept$1.L$1 = SpillingKt.nullOutSpilledVariable(cVar);
            versionPreCheckInterceptor$intercept$1.L$2 = SpillingKt.nullOutSpilledVariable(request);
            versionPreCheckInterceptor$intercept$1.L$3 = SpillingKt.nullOutSpilledVariable(paymentRepositoryM45618f);
            versionPreCheckInterceptor$intercept$1.label = 1;
            objMo46268n = paymentRepositoryM45618f.mo46268n(request, versionPreCheckInterceptor$intercept$1);
            if (objMo46268n == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            preCheckRequest = (PreCheckRequest) versionPreCheckInterceptor$intercept$1.L$0;
            ResultKt.throwOnFailure(objMo46268n);
        }
        AbstractC42878k abstractC42878k = (AbstractC42878k) objMo46268n;
        if (abstractC42878k instanceof AbstractC42878k.Success) {
            AbstractC42878k.Success success = (AbstractC42878k.Success) abstractC42878k;
            if (C45148b.m99792b(((VersionCheck.Response) success.m94040a()).getStatus())) {
                return PreCheckResult.c.f38378a;
            }
            m45999c(preCheckRequest.getFragmentManager(), C45148b.m99794d(((VersionCheck.Response) success.m94040a()).getType()), C45148b.m99794d(((VersionCheck.Response) success.m94040a()).getContent()));
            return PreCheckResult.d.f38379a;
        }
        if (!(abstractC42878k instanceof AbstractC42878k.Error)) {
            throw new NoWhenBranchMatchedException();
        }
        PreCheckResult.d dVar = PreCheckResult.d.f38379a;
        C19331c.m42836c(((AbstractC42878k.Error) abstractC42878k).getException(), null, 2, null);
        return dVar;
    }

    /* JADX INFO: renamed from: c */
    public final void m45999c(FragmentManager fragmentManager, String str, String str2) {
        if (Intrinsics.areEqual(str, "1")) {
            AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54167X4(R$string.dialog_title_text_tip).m54156M4(C45148b.m99794d(str2)).m54162S4(R$string.i_already_know, null).show(fragmentManager, "payment_version_check_guide_web");
        } else if (Intrinsics.areEqual(str, "2")) {
            AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54167X4(R$string.dialog_title_text_tip).m54156M4(C45148b.m99794d(str2)).m54162S4(R$string.dialog_but_appupgrade_upgrade, new DialogInterface.OnClickListener() { // from class: com.kubi.payment.channel.precheck.c
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i11) {
                    VersionPreCheckInterceptor.m45998d(dialogInterface, i11);
                }
            }).m54159P4(R$string.cancel, null).show(fragmentManager, "payment_version_check_guide_app");
        } else {
            ToastCompat.m66441G(str2, new Object[0]);
        }
    }
}
