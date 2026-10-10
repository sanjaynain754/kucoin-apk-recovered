package com.sumsub.sns.internal.features.presentation.preview.photo;

import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.photo.B */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31741B extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f64483a;

    public C31741B(Continuation continuation) {
        super(2, continuation);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C31741B c31741b = new C31741B(continuation);
        c31741b.f64483a = obj;
        return c31741b;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C31741B c31741b = new C31741B((Continuation) obj2);
        c31741b.f64483a = (C31931t) obj;
        return c31741b.invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        return C31931t.m70949a((C31931t) this.f64483a, null, null, false, true, null, 23);
    }
}
