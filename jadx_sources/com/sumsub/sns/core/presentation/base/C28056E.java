package com.sumsub.sns.core.presentation.base;

import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.core.presentation.base.E */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28056E extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f57221a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractC28058F f57222b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28056E(AbstractC28058F abstractC28058F, Continuation continuation) {
        super(2, continuation);
        this.f57222b = abstractC28058F;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C28056E c28056e = new C28056E(this.f57222b, continuation);
        c28056e.f57221a = obj;
        return c28056e;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C28056E c28056e = new C28056E(this.f57222b, (Continuation) obj2);
        c28056e.f57221a = (C28143q) obj;
        return c28056e.invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        this.f57222b.updateCommonUiState((C28143q) this.f57221a);
        return Unit.INSTANCE;
    }
}
