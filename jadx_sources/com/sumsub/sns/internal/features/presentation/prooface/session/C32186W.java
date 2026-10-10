package com.sumsub.sns.internal.features.presentation.prooface.session;

import kotlinx.coroutines.flow.C41636g;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.prooface.session.W */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32186W extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f65547a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C32198b0 f65548b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32186W(C32198b0 c32198b0, Continuation continuation) {
        super(2, continuation);
        this.f65548b = c32198b0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C32186W(this.f65548b, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C32186W(this.f65548b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f65547a;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        C32184V c32184v = new C32184V(this.f65548b.f65573b);
        this.f65547a = 1;
        Object objM90882F = C41636g.m90882F(c32184v, this);
        if (objM90882F == coroutine_suspended) {
            return coroutine_suspended;
        }
        return objM90882F;
    }
}
