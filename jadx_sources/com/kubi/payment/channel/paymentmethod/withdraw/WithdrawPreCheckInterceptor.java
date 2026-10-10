package com.kubi.payment.channel.paymentmethod.withdraw;

import com.kubi.otc.security.SecuritySettingDialog;
import com.kubi.payment.channel.precheck.IPreCheckInterceptor;
import com.kubi.payment.channel.precheck.PreCheckRequest;
import com.kubi.payment.channel.precheck.PreCheckResult;
import com.kubi.payment.helper.PreCheckHelper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;

/* JADX INFO: renamed from: com.kubi.payment.channel.paymentmethod.withdraw.i, reason: from Kotlin metadata */
/* JADX INFO: compiled from: WithdrawPreCheckInterceptor.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0096@¢\u0006\u0002\u0010\b¨\u0006\t"}, m90084d2 = {"Lcom/kubi/payment/channel/paymentmethod/withdraw/WithdrawPreCheckInterceptor;", "Lcom/kubi/payment/channel/precheck/IPreCheckInterceptor;", "<init>", "()V", "intercept", "Lcom/kubi/payment/channel/precheck/PreCheckResult;", "param", "Lcom/kubi/payment/channel/precheck/PreCheckRequest;", "(Lcom/kubi/payment/channel/precheck/PreCheckRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class WithdrawPreCheckInterceptor implements IPreCheckInterceptor {
    @Override // com.kubi.payment.channel.precheck.IPreCheckInterceptor
    @Nullable
    /* JADX INFO: renamed from: a */
    public Object mo45994a(@NotNull PreCheckRequest preCheckRequest, @NotNull Continuation<? super PreCheckResult> continuation) {
        PreCheckResult.c cVar = PreCheckResult.c.f38378a;
        PreCheckHelper preCheckHelper = PreCheckHelper.f39543a;
        if (preCheckHelper.m48234e() && preCheckHelper.m48237h()) {
            return cVar;
        }
        SecuritySettingDialog.f38120x0.show(preCheckRequest.getFragmentManager(), new SecuritySettingDialog.SecuritySetting(false, true, false, false, true, null, 45, null));
        return PreCheckResult.b.f38377a;
    }
}
