package com.sumsub.sns.internal.features.presentation.esign;

import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.esign.m0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30995m0 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f62634a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C30997n0 f62635b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30995m0(C30997n0 c30997n0, Continuation continuation) {
        super(2, continuation);
        this.f62635b = c30997n0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C30995m0 c30995m0 = new C30995m0(this.f62635b, continuation);
        c30995m0.f62634a = obj;
        return c30995m0;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C30995m0 c30995m0 = new C30995m0(this.f62635b, (Continuation) obj2);
        c30995m0.f62634a = (C31014x) obj;
        return c30995m0.invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        return C31014x.m70560a((C31014x) this.f62634a, null, C30997n0.m70540a(this.f62635b), null, false, 11);
    }
}
