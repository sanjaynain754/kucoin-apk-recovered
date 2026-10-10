package com.kubi.payment.precheck;

import androidx.fragment.app.FragmentManager;
import com.kubi.payment.data.entities.VersionCheck;
import com.kubi.payment.helper.PreCheckHelper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SpillingKt;

/* JADX INFO: compiled from: VersionPreCheckInterceptor.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0096@¢\u0006\u0002\u0010\b¨\u0006\t"}, m90084d2 = {"Lcom/kubi/payment/precheck/VersionPreCheckInterceptor;", "Lcom/kubi/payment/precheck/IPreCheckInterceptor;", "<init>", "()V", "intercept", "Lcom/kubi/payment/precheck/PreCheckResult;", "param", "Lcom/kubi/payment/precheck/PreCheckRequest;", "(Lcom/kubi/payment/precheck/PreCheckRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class VersionPreCheckInterceptor implements IPreCheckInterceptor {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.kubi.payment.precheck.IPreCheckInterceptor
    @Nullable
    /* JADX INFO: renamed from: a */
    public Object mo47135a(@NotNull PreCheckRequest preCheckRequest, @NotNull Continuation<? super PreCheckResult> continuation) {
        VersionPreCheckInterceptor$intercept$1 versionPreCheckInterceptor$intercept$1;
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
        Object objM48240k = versionPreCheckInterceptor$intercept$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = versionPreCheckInterceptor$intercept$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM48240k);
            PreCheckResult.Success success = PreCheckResult.Success.INSTANCE;
            PreCheckHelper preCheckHelper = PreCheckHelper.f39543a;
            FragmentManager fragmentManager = preCheckRequest.getFragmentManager();
            VersionCheck.Request versionCheckRequest = preCheckRequest.getVersionCheckRequest();
            versionPreCheckInterceptor$intercept$1.L$0 = SpillingKt.nullOutSpilledVariable(preCheckRequest);
            versionPreCheckInterceptor$intercept$1.L$1 = SpillingKt.nullOutSpilledVariable(success);
            versionPreCheckInterceptor$intercept$1.label = 1;
            objM48240k = preCheckHelper.m48240k(fragmentManager, versionCheckRequest, versionPreCheckInterceptor$intercept$1);
            if (objM48240k == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM48240k);
        }
        return ((Boolean) objM48240k).booleanValue() ? PreCheckResult.Success.INSTANCE : PreCheckResult.Fail.INSTANCE;
    }
}
