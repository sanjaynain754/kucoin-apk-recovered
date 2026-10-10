package com.sumsub.sns.internal.features.presentation.preview.selfie;

import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.selfie.o */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31955o extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f64982a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f64983b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31955o(boolean z11, Continuation continuation) {
        super(2, continuation);
        this.f64983b = z11;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C31955o c31955o = new C31955o(this.f64983b, continuation);
        c31955o.f64982a = obj;
        return c31955o;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C31955o c31955o = new C31955o(this.f64983b, (Continuation) obj2);
        c31955o.f64982a = (C31950j) obj;
        return c31955o.invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        return C31950j.m70960a((C31950j) this.f64982a, null, null, null, null, null, this.f64983b, 31);
    }
}
