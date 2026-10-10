package com.sumsub.sns.internal.features.presentation.verification;

import com.sumsub.sns.internal.log.C33272c;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function3;
import p852kotlin.reflect.KProperty;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.verification.i0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32718i0 extends SuspendLambda implements Function3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Throwable f66928a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C32720j0 f66929b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32718i0(C32720j0 c32720j0, Continuation continuation) {
        super(3, continuation);
        this.f66929b = c32720j0;
    }

    @Override // p852kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C32718i0 c32718i0 = new C32718i0(this.f66929b, (Continuation) obj3);
        c32718i0.f66928a = (Throwable) obj2;
        return c32718i0.invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        C33272c.f67816e.f67810a.mo68956e("SNSVerificationStepViewModel", "Verification step. Error building state", this.f66928a);
        C32720j0 c32720j0 = this.f66929b;
        KProperty[] kPropertyArr = C32720j0.f66932t;
        c32720j0.finishAbnormal("Verification step. Error building state");
        return Unit.INSTANCE;
    }
}
