package com.sumsub.sns.internal.features.presentation.status;

import com.sumsub.sns.internal.features.presentation.status.model.C32437a;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.status.K */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32402K extends SuspendLambda implements Function3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ AbstractC32410T f66039a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ boolean f66040b;

    public C32402K(Continuation continuation) {
        super(3, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        C32402K c32402k = new C32402K((Continuation) obj3);
        c32402k.f66039a = (AbstractC32410T) obj;
        c32402k.f66040b = zBooleanValue;
        return c32402k.invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        AbstractC32410T abstractC32410T = this.f66039a;
        return new C32437a(abstractC32410T.f66071g, this.f66040b);
    }
}
