package com.sumsub.sns.internal.features.data.repository.dynamic;

import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.repository.dynamic.A */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C29958A extends SuspendLambda implements Function1 {

    /* JADX INFO: renamed from: a */
    public int f60163a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C29967J f60164b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29958A(C29967J c29967j, Continuation continuation) {
        super(1, continuation);
        this.f60164b = c29967j;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new C29958A(this.f60164b, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new C29958A(this.f60164b, (Continuation) obj).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f60163a;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        C29978g c29978g = this.f60164b.f60204l;
        this.f60163a = 1;
        Object objM70056a = c29978g.m70056a(false, (ContinuationImpl) this);
        if (objM70056a == coroutine_suspended) {
            return coroutine_suspended;
        }
        return objM70056a;
    }
}
