package com.sumsub.sns.internal.features.presentation.verification2.email;

import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.verification2.email.j */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32788j extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f67092a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C32774D f67093b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32788j(C32774D c32774d, Continuation continuation) {
        super(2, continuation);
        this.f67093b = c32774d;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C32788j c32788j = new C32788j(this.f67093b, continuation);
        c32788j.f67092a = obj;
        return c32788j;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C32788j c32788j = new C32788j(this.f67093b, (Continuation) obj2);
        c32788j.f67092a = (CharSequence) obj;
        return c32788j.invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        this.f67093b.f67079d.setValue(new C32791m((CharSequence) this.f67092a));
        return Unit.INSTANCE;
    }
}
