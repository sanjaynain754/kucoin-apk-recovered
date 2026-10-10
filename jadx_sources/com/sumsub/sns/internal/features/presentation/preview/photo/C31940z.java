package com.sumsub.sns.internal.features.presentation.preview.photo;

import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.photo.z */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31940z extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C31931t f64943a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31940z(C31931t c31931t, Continuation continuation) {
        super(2, continuation);
        this.f64943a = c31931t;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C31940z(this.f64943a, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C31940z(this.f64943a, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        return C31931t.m70949a(this.f64943a, null, null, false, true, null, 23);
    }
}
