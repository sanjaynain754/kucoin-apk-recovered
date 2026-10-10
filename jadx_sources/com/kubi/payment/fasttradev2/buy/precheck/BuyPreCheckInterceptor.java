package com.kubi.payment.fasttradev2.buy.precheck;

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

/* JADX INFO: compiled from: BuyPreCheckInterceptor.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0096@¢\u0006\u0002\u0010\b¨\u0006\t"}, m90084d2 = {"Lcom/kubi/payment/fasttradev2/buy/precheck/BuyPreCheckInterceptor;", "Lcom/kubi/payment/precheck/IPreCheckInterceptor;", "<init>", "()V", "intercept", "Lcom/kubi/payment/precheck/PreCheckResult;", "param", "Lcom/kubi/payment/precheck/PreCheckRequest;", "(Lcom/kubi/payment/precheck/PreCheckRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class BuyPreCheckInterceptor implements IPreCheckInterceptor {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [int] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v8 */
    @Override // com.kubi.payment.precheck.IPreCheckInterceptor
    @Nullable
    /* JADX INFO: renamed from: a */
    public Object mo47135a(@NotNull PreCheckRequest preCheckRequest, @NotNull Continuation<? super PreCheckResult> continuation) {
        BuyPreCheckInterceptor$intercept$1 buyPreCheckInterceptor$intercept$1;
        boolean needCheckTradingPassword;
        boolean z11;
        boolean z12;
        ?? r11;
        ?? r12;
        ?? r13;
        if (continuation instanceof BuyPreCheckInterceptor$intercept$1) {
            buyPreCheckInterceptor$intercept$1 = (BuyPreCheckInterceptor$intercept$1) continuation;
            int i11 = buyPreCheckInterceptor$intercept$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                buyPreCheckInterceptor$intercept$1.label = i11 - Integer.MIN_VALUE;
            } else {
                buyPreCheckInterceptor$intercept$1 = new BuyPreCheckInterceptor$intercept$1(this, continuation);
            }
        } else {
            buyPreCheckInterceptor$intercept$1 = new BuyPreCheckInterceptor$intercept$1(this, continuation);
        }
        Object objM48239j = buyPreCheckInterceptor$intercept$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = buyPreCheckInterceptor$intercept$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM48239j);
            PreCheckResult.Success success = PreCheckResult.Success.INSTANCE;
            if (!(preCheckRequest instanceof PreCheckRequest.BuyPreCheckRequest)) {
                return success;
            }
            PreCheckRequest.BuyPreCheckRequest buyPreCheckRequest = (PreCheckRequest.BuyPreCheckRequest) preCheckRequest;
            needCheckTradingPassword = buyPreCheckRequest.getNeedCheckTradingPassword();
            ?? M48237h = needCheckTradingPassword ? PreCheckHelper.f39543a.m48237h() : 1;
            boolean needCheckEmail = buyPreCheckRequest.getNeedCheckEmail();
            boolean zM48235f = needCheckEmail ? PreCheckHelper.f39543a.m48235f() : true;
            boolean needCheckPhone = buyPreCheckRequest.getNeedCheckPhone();
            boolean zM48236g = needCheckPhone ? PreCheckHelper.f39543a.m48236g() : true;
            PreCheckHelper preCheckHelper = PreCheckHelper.f39543a;
            buyPreCheckInterceptor$intercept$1.L$0 = preCheckRequest;
            buyPreCheckInterceptor$intercept$1.L$1 = SpillingKt.nullOutSpilledVariable(success);
            buyPreCheckInterceptor$intercept$1.I$0 = M48237h;
            buyPreCheckInterceptor$intercept$1.Z$0 = needCheckTradingPassword;
            buyPreCheckInterceptor$intercept$1.I$1 = zM48235f ? 1 : 0;
            buyPreCheckInterceptor$intercept$1.Z$1 = needCheckEmail;
            buyPreCheckInterceptor$intercept$1.I$2 = zM48236g ? 1 : 0;
            buyPreCheckInterceptor$intercept$1.Z$2 = needCheckPhone;
            buyPreCheckInterceptor$intercept$1.label = 1;
            objM48239j = preCheckHelper.m48239j(buyPreCheckInterceptor$intercept$1);
            if (objM48239j == coroutine_suspended) {
                return coroutine_suspended;
            }
            z11 = needCheckPhone;
            z12 = needCheckEmail;
            r13 = M48237h;
            r12 = zM48235f;
            r11 = zM48236g;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            boolean z13 = buyPreCheckInterceptor$intercept$1.Z$2;
            int i13 = buyPreCheckInterceptor$intercept$1.I$2;
            boolean z14 = buyPreCheckInterceptor$intercept$1.Z$1;
            int i14 = buyPreCheckInterceptor$intercept$1.I$1;
            needCheckTradingPassword = buyPreCheckInterceptor$intercept$1.Z$0;
            int i15 = buyPreCheckInterceptor$intercept$1.I$0;
            PreCheckRequest preCheckRequest2 = (PreCheckRequest) buyPreCheckInterceptor$intercept$1.L$0;
            ResultKt.throwOnFailure(objM48239j);
            r11 = i13;
            r12 = i14;
            z11 = z13;
            preCheckRequest = preCheckRequest2;
            z12 = z14;
            r13 = i15;
        }
        boolean z15 = needCheckTradingPassword;
        boolean zBooleanValue = ((Boolean) objM48239j).booleanValue();
        if (r13 != 0 && r12 != 0 && r11 != 0 && zBooleanValue) {
            return PreCheckResult.Success.INSTANCE;
        }
        SecuritySettingDialog.f38120x0.show(preCheckRequest.getFragmentManager(), new SecuritySettingDialog.SecuritySetting(z11, z15, z12, true, false, Boxing.boxBoolean(zBooleanValue), 16, null));
        return PreCheckResult.Fail.INSTANCE;
    }
}
