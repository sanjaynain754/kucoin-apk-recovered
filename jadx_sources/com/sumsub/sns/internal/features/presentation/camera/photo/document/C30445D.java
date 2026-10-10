package com.sumsub.sns.internal.features.presentation.camera.photo.document;

import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.photo.document.D */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30445D extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f61374a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C30468J f61375b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30445D(C30468J c30468j, Continuation continuation) {
        super(2, continuation);
        this.f61375b = c30468j;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C30445D c30445d = new C30445D(this.f61375b, continuation);
        c30445d.f61374a = obj;
        return c30445d;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C30445D c30445d = new C30445D(this.f61375b, (Continuation) obj2);
        c30445d.f61374a = (C30538d1) obj;
        return c30445d.invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        C30538d1 c30538d1 = (C30538d1) this.f61374a;
        C30468J c30468j = this.f61375b;
        C30654y c30654y = C30468J.f61431o;
        c30468j.m70372a(c30538d1);
        return Unit.INSTANCE;
    }
}
