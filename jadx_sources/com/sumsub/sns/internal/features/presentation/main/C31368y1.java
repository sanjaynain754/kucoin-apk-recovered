package com.sumsub.sns.internal.features.presentation.main;

import com.sumsub.sns.internal.log.C33272c;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.main.y1 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31368y1 extends SuspendLambda implements Function3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Throwable f63565a;

    public C31368y1(Continuation continuation) {
        super(3, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C31368y1 c31368y1 = new C31368y1((Continuation) obj3);
        c31368y1.f63565a = (Throwable) obj2;
        return c31368y1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        C33272c.f67816e.f67810a.mo68956e("SNSAppViewModel2", String.valueOf(this.f63565a.getMessage()), null);
        return Unit.INSTANCE;
    }
}
