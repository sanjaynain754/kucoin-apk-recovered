package com.sumsub.sns.internal.features.presentation.geo;

import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.geo.X */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31067X extends SuspendLambda implements Function3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ C31124x0 f62819a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ C31124x0 f62820b;

    public C31067X(Continuation continuation) {
        super(3, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C31067X c31067x = new C31067X((Continuation) obj3);
        c31067x.f62819a = (C31124x0) obj;
        c31067x.f62820b = (C31124x0) obj2;
        return c31067x.invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        return new C31126y0(this.f62819a, this.f62820b);
    }
}
