package com.sumsub.sns.internal.features.presentation.status;

import com.sumsub.sns.internal.features.presentation.status.model.C32437a;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.status.f */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32422f extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f66089a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C32435m f66090b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32422f(C32435m c32435m, Continuation continuation) {
        super(2, continuation);
        this.f66090b = c32435m;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C32422f c32422f = new C32422f(this.f66090b, continuation);
        c32422f.f66089a = obj;
        return c32422f;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C32422f c32422f = new C32422f(this.f66090b, (Continuation) obj2);
        c32422f.f66089a = (C32437a) obj;
        return c32422f.invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        C32437a c32437a = (C32437a) this.f66089a;
        C32435m c32435m = this.f66090b;
        C32416c c32416c = C32435m.f66108o;
        c32435m.m71148a(c32437a);
        return Unit.INSTANCE;
    }
}
