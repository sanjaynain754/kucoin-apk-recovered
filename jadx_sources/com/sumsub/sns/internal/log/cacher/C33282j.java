package com.sumsub.sns.internal.log.cacher;

import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.sumsub.sns.internal.log.cacher.j */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C33282j extends SuspendLambda implements Function1 {

    /* JADX INFO: renamed from: a */
    public int f67841a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C33284l f67842b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f67843c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33282j(C33284l c33284l, Object obj, Continuation continuation) {
        super(1, continuation);
        this.f67842b = c33284l;
        this.f67843c = obj;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new C33282j(this.f67842b, this.f67843c, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new C33282j(this.f67842b, this.f67843c, (Continuation) obj).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f67841a;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        C33284l c33284l = this.f67842b;
        Object obj2 = this.f67843c;
        this.f67841a = 1;
        Object objM71619a = C33284l.m71619a(c33284l, obj2, this);
        if (objM71619a == coroutine_suspended) {
            return coroutine_suspended;
        }
        return objM71619a;
    }
}
