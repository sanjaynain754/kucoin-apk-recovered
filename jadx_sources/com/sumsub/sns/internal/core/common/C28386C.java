package com.sumsub.sns.internal.core.common;

import com.sumsub.sns.core.presentation.base.AbstractC28073M0;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.common.C */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28386C extends SuspendLambda implements Function3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ boolean f57874a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f57875b;

    public C28386C(Continuation continuation) {
        super(3, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        C28386C c28386c = new C28386C((Continuation) obj3);
        c28386c.f57874a = zBooleanValue;
        c28386c.f57875b = obj2;
        return c28386c.invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        boolean z11 = this.f57874a;
        Object obj2 = this.f57875b;
        if (z11 && obj2 == null) {
            throw new C28390E("Flow timed out after " + AbstractC28073M0.DEFAULT_TIMEOUT + " ms.");
        }
        return obj2;
    }
}
