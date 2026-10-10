package com.sumsub.sns.core.presentation.base;

import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.sumsub.sns.core.presentation.base.J */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28066J extends SuspendLambda implements Function1 {

    /* JADX INFO: renamed from: a */
    public int f57242a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractC28142p0 f57243b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28066J(AbstractC28142p0 abstractC28142p0, Continuation continuation) {
        super(1, continuation);
        this.f57243b = abstractC28142p0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new C28066J(this.f57243b, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new C28066J(this.f57243b, (Continuation) obj).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f57242a;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        AbstractC28142p0 abstractC28142p0 = this.f57243b;
        this.f57242a = 1;
        Object strings = abstractC28142p0.getStrings(this);
        if (strings == coroutine_suspended) {
            return coroutine_suspended;
        }
        return strings;
    }
}
