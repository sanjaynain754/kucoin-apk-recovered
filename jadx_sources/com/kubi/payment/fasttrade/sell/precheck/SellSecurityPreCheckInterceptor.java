package com.kubi.payment.fasttrade.sell.precheck;

import com.kubi.otc.security.SecuritySettingDialog;
import com.kubi.payment.helper.PreCheckHelper;
import com.kubi.payment.precheck.IPreCheckInterceptor;
import com.kubi.payment.precheck.PreCheckRequest;
import com.kubi.payment.precheck.PreCheckResult;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.SpillingKt;

/* JADX INFO: compiled from: SellSecurityPreCheckInterceptor.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0096@¢\u0006\u0002\u0010\b¨\u0006\t"}, m90084d2 = {"Lcom/kubi/payment/fasttrade/sell/precheck/SellSecurityPreCheckInterceptor;", "Lcom/kubi/payment/precheck/IPreCheckInterceptor;", "<init>", "()V", "intercept", "Lcom/kubi/payment/precheck/PreCheckResult;", "param", "Lcom/kubi/payment/precheck/PreCheckRequest;", "(Lcom/kubi/payment/precheck/PreCheckRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class SellSecurityPreCheckInterceptor implements IPreCheckInterceptor {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [int] */
    /* JADX WARN: Type inference failed for: r4v5 */
    @Override // com.kubi.payment.precheck.IPreCheckInterceptor
    @Nullable
    /* JADX INFO: renamed from: a */
    public Object mo47135a(@NotNull PreCheckRequest preCheckRequest, @NotNull Continuation<? super PreCheckResult> continuation) {
        SellSecurityPreCheckInterceptor$intercept$1 sellSecurityPreCheckInterceptor$intercept$1;
        boolean needCheckTradingPassword;
        ?? r11;
        if (continuation instanceof SellSecurityPreCheckInterceptor$intercept$1) {
            sellSecurityPreCheckInterceptor$intercept$1 = (SellSecurityPreCheckInterceptor$intercept$1) continuation;
            int i11 = sellSecurityPreCheckInterceptor$intercept$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                sellSecurityPreCheckInterceptor$intercept$1.label = i11 - Integer.MIN_VALUE;
            } else {
                sellSecurityPreCheckInterceptor$intercept$1 = new SellSecurityPreCheckInterceptor$intercept$1(this, continuation);
            }
        } else {
            sellSecurityPreCheckInterceptor$intercept$1 = new SellSecurityPreCheckInterceptor$intercept$1(this, continuation);
        }
        Object objM48239j = sellSecurityPreCheckInterceptor$intercept$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = sellSecurityPreCheckInterceptor$intercept$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM48239j);
            PreCheckResult.Success success = PreCheckResult.Success.INSTANCE;
            if (!(preCheckRequest instanceof PreCheckRequest.SellPreCheckRequest)) {
                return success;
            }
            needCheckTradingPassword = ((PreCheckRequest.SellPreCheckRequest) preCheckRequest).getNeedCheckTradingPassword();
            ?? M48237h = needCheckTradingPassword ? PreCheckHelper.f39543a.m48237h() : 1;
            PreCheckHelper preCheckHelper = PreCheckHelper.f39543a;
            sellSecurityPreCheckInterceptor$intercept$1.L$0 = preCheckRequest;
            sellSecurityPreCheckInterceptor$intercept$1.L$1 = SpillingKt.nullOutSpilledVariable(success);
            sellSecurityPreCheckInterceptor$intercept$1.I$0 = M48237h;
            sellSecurityPreCheckInterceptor$intercept$1.Z$0 = needCheckTradingPassword;
            sellSecurityPreCheckInterceptor$intercept$1.label = 1;
            objM48239j = preCheckHelper.m48239j(sellSecurityPreCheckInterceptor$intercept$1);
            if (objM48239j == coroutine_suspended) {
                return coroutine_suspended;
            }
            r11 = M48237h;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            boolean z11 = sellSecurityPreCheckInterceptor$intercept$1.Z$0;
            int i13 = sellSecurityPreCheckInterceptor$intercept$1.I$0;
            PreCheckRequest preCheckRequest2 = (PreCheckRequest) sellSecurityPreCheckInterceptor$intercept$1.L$0;
            ResultKt.throwOnFailure(objM48239j);
            needCheckTradingPassword = z11;
            preCheckRequest = preCheckRequest2;
            r11 = i13;
        }
        boolean zBooleanValue = ((Boolean) objM48239j).booleanValue();
        if (r11 != 0 && zBooleanValue) {
            return PreCheckResult.Success.INSTANCE;
        }
        SecuritySettingDialog.f38120x0.show(preCheckRequest.getFragmentManager(), new SecuritySettingDialog.SecuritySetting(false, needCheckTradingPassword, false, true, false, Boxing.boxBoolean(zBooleanValue), 21, null));
        return PreCheckResult.Fail.INSTANCE;
    }
}
