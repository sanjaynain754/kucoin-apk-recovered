package com.sumsub.sns.internal.features.presentation.verification2.phone;

import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.verification2.phone.n */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32869n extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f67248a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C32847F f67249b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32869n(C32847F c32847f, Continuation continuation) {
        super(2, continuation);
        this.f67249b = c32847f;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C32869n c32869n = new C32869n(this.f67249b, continuation);
        c32869n.f67248a = obj;
        return c32869n;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C32869n c32869n = new C32869n(this.f67249b, (Continuation) obj2);
        c32869n.f67248a = (CharSequence) obj;
        return c32869n.invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        this.f67249b.f67210f.setValue(new C32871p((CharSequence) this.f67248a));
        return Unit.INSTANCE;
    }
}
