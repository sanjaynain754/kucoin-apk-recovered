package com.sumsub.sns.internal.features.presentation.preview.photo;

import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.photo.Z */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31764Z extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f64543a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f64544b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31764Z(boolean z11, Continuation continuation) {
        super(2, continuation);
        this.f64544b = z11;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C31764Z c31764z = new C31764Z(this.f64544b, continuation);
        c31764z.f64543a = obj;
        return c31764z;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C31764Z c31764z = new C31764Z(this.f64544b, (Continuation) obj2);
        c31764z.f64543a = (C31931t) obj;
        return c31764z.invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        return C31931t.m70949a((C31931t) this.f64543a, null, null, false, this.f64544b, null, 23);
    }
}
