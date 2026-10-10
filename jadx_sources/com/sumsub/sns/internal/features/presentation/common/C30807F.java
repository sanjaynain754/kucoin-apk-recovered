package com.sumsub.sns.internal.features.presentation.common;

import com.sumsub.sns.internal.features.presentation.utils.C32635M;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.common.F */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30807F extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f62233a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractC30808G f62234b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30807F(AbstractC30808G abstractC30808G, Continuation continuation) {
        super(2, continuation);
        this.f62234b = abstractC30808G;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C30807F(this.f62234b, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C30807F(this.f62234b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f62233a;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            C32635M c32635m = this.f62234b.f62236a;
            C30804C c30804c = new C30804C(this.f62234b);
            C30805D c30805d = new C30805D(this.f62234b);
            C30806E c30806e = new C30806E(this.f62234b);
            this.f62233a = 1;
            if (c32635m.m71235a(c30804c, c30805d, c30806e, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
