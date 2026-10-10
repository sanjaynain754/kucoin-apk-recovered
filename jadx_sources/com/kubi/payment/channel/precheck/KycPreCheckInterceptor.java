package com.kubi.payment.channel.precheck;

import com.kubi.network.retrofit.utils.C19331c;
import com.kubi.otc.entity.FastQuoteModel;
import com.kubi.payment.PaymentServiceLocator;
import com.kubi.payment.data.entities.UserInfo;
import com.kubi.payment.data.source.PaymentRepository;
import com.kubi.payment.flutter.FlutterUtils;
import com.kubi.router.core.Router;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27041f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p477nt.AbstractC42878k;
import p569qq.C43852m;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.ResultKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KycPreCheckInterceptor.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0096@¢\u0006\u0002\u0010\bJ\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0007H\u0002¨\u0006\u000b"}, m90084d2 = {"Lcom/kubi/payment/channel/precheck/KycPreCheckInterceptor;", "Lcom/kubi/payment/channel/precheck/IPreCheckInterceptor;", "<init>", "()V", "intercept", "Lcom/kubi/payment/channel/precheck/PreCheckResult;", "param", "Lcom/kubi/payment/channel/precheck/PreCheckRequest;", "(Lcom/kubi/payment/channel/precheck/PreCheckRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "launchFlutterKycPage", "", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class KycPreCheckInterceptor implements IPreCheckInterceptor {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.kubi.payment.channel.precheck.IPreCheckInterceptor
    @Nullable
    /* JADX INFO: renamed from: a */
    public Object mo45994a(@NotNull PreCheckRequest preCheckRequest, @NotNull Continuation<? super PreCheckResult> continuation) {
        KycPreCheckInterceptor$intercept$1 kycPreCheckInterceptor$intercept$1;
        PreCheckResult preCheckResult;
        Object objMo46264E;
        if (continuation instanceof KycPreCheckInterceptor$intercept$1) {
            kycPreCheckInterceptor$intercept$1 = (KycPreCheckInterceptor$intercept$1) continuation;
            int i11 = kycPreCheckInterceptor$intercept$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                kycPreCheckInterceptor$intercept$1.label = i11 - Integer.MIN_VALUE;
            } else {
                kycPreCheckInterceptor$intercept$1 = new KycPreCheckInterceptor$intercept$1(this, continuation);
            }
        } else {
            kycPreCheckInterceptor$intercept$1 = new KycPreCheckInterceptor$intercept$1(this, continuation);
        }
        Object obj = kycPreCheckInterceptor$intercept$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = kycPreCheckInterceptor$intercept$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            preCheckResult = PreCheckResult.c.f38378a;
            UserInfo.Request request = new UserInfo.Request(preCheckRequest.getTradeType(), preCheckRequest.getFiatCurrency(), preCheckRequest.getPaymentMethodCode(), preCheckRequest.getChannelId());
            PaymentRepository paymentRepositoryM45618f = PaymentServiceLocator.f38204a.m45618f();
            kycPreCheckInterceptor$intercept$1.L$0 = preCheckRequest;
            kycPreCheckInterceptor$intercept$1.L$1 = preCheckResult;
            kycPreCheckInterceptor$intercept$1.L$2 = SpillingKt.nullOutSpilledVariable(request);
            kycPreCheckInterceptor$intercept$1.L$3 = SpillingKt.nullOutSpilledVariable(paymentRepositoryM45618f);
            kycPreCheckInterceptor$intercept$1.label = 1;
            objMo46264E = paymentRepositoryM45618f.mo46264E(request, kycPreCheckInterceptor$intercept$1);
            if (objMo46264E == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            PreCheckResult preCheckResult2 = (PreCheckResult) kycPreCheckInterceptor$intercept$1.L$1;
            PreCheckRequest preCheckRequest2 = (PreCheckRequest) kycPreCheckInterceptor$intercept$1.L$0;
            ResultKt.throwOnFailure(obj);
            preCheckResult = preCheckResult2;
            preCheckRequest = preCheckRequest2;
            objMo46264E = obj;
        }
        AbstractC42878k abstractC42878k = (AbstractC42878k) objMo46264E;
        if (!(abstractC42878k instanceof AbstractC42878k.Success)) {
            if (!(abstractC42878k instanceof AbstractC42878k.Error)) {
                throw new NoWhenBranchMatchedException();
            }
            PreCheckResult.a aVar = PreCheckResult.a.f38376a;
            C19331c.m42836c(((AbstractC42878k.Error) abstractC42878k).getException(), null, 2, null);
            return aVar;
        }
        if (Intrinsics.areEqual(preCheckRequest.getTradeType(), FastQuoteModel.PAY_RECHARGE)) {
            UserInfo.UserPermissionResponse permission = ((UserInfo.Response) ((AbstractC42878k.Success) abstractC42878k).m94040a()).getPermission();
            if (C27025c.m66566d(permission != null ? permission.getCanRecharge() : null)) {
                return PreCheckResult.c.f38378a;
            }
            m45995b(preCheckRequest);
            return PreCheckResult.a.f38376a;
        }
        if (!Intrinsics.areEqual(preCheckRequest.getTradeType(), "WITHDRAW")) {
            return preCheckResult;
        }
        UserInfo.UserPermissionResponse permission2 = ((UserInfo.Response) ((AbstractC42878k.Success) abstractC42878k).m94040a()).getPermission();
        if (C27025c.m66566d(permission2 != null ? permission2.getCanWithdraw() : null)) {
            return PreCheckResult.c.f38378a;
        }
        m45995b(preCheckRequest);
        return PreCheckResult.a.f38376a;
    }

    /* JADX INFO: renamed from: b */
    public final void m45995b(PreCheckRequest preCheckRequest) {
        Router.f46192a.m56184f(FlutterUtils.m48217b(FlutterUtils.f39512a, "payment/channel/kyc", false, 2, null)).m4038a("paymentMethodCode", C27041f.m66668h(preCheckRequest.getPaymentMethodCode())).m4038a("channelId", C27041f.m66668h(preCheckRequest.getChannelId())).m4038a("tradeType", C27041f.m66668h(preCheckRequest.getTradeType())).m4038a("fiatCurrency", C27041f.m66668h(preCheckRequest.getFiatCurrency())).m4038a("spm", C43852m.m96602n(Intrinsics.areEqual(C27041f.m66668h(preCheckRequest.getTradeType()), FastQuoteModel.PAY_RECHARGE) ? "B7FiatDepositMethod" : "B7FiatWithdraw", "PaymentMethod", null, 4, null)).m4048k();
    }
}
