package com.sumsub.sns.internal.features.presentation.geo;

import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.geo.M */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31057M extends SuspendLambda implements Function3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ C31124x0 f62785a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ C31124x0 f62786b;

    public C31057M(Continuation continuation) {
        super(3, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C31057M c31057m = new C31057M((Continuation) obj3);
        c31057m.f62785a = (C31124x0) obj;
        c31057m.f62786b = (C31124x0) obj2;
        return c31057m.invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        return new C31126y0(this.f62785a, this.f62786b);
    }
}
