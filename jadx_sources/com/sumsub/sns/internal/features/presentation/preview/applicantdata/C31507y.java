package com.sumsub.sns.internal.features.presentation.preview.applicantdata;

import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.applicantdata.y */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31507y extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f63929a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f63930b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31507y(boolean z11, Continuation continuation) {
        super(2, continuation);
        this.f63930b = z11;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C31507y c31507y = new C31507y(this.f63930b, continuation);
        c31507y.f63929a = obj;
        return c31507y;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C31507y c31507y = new C31507y(this.f63930b, (Continuation) obj2);
        c31507y.f63929a = (C31494l) obj;
        return c31507y.invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        return C31494l.m70756a((C31494l) this.f63929a, null, null, null, null, null, this.f63930b, 31);
    }
}
