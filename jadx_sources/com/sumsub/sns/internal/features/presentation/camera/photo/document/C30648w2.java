package com.sumsub.sns.internal.features.presentation.camera.photo.document;

import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.photo.document.w2 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30648w2 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f61932a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f61933b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30648w2(String str, Continuation continuation) {
        super(2, continuation);
        this.f61933b = str;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C30648w2 c30648w2 = new C30648w2(this.f61933b, continuation);
        c30648w2.f61932a = obj;
        return c30648w2;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C30648w2 c30648w2 = new C30648w2(this.f61933b, (Continuation) obj2);
        c30648w2.f61932a = (C30627s1) obj;
        return c30648w2.invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        return C30627s1.m70414a((C30627s1) this.f61932a, false, new C30622r1(0, this.f61933b), 3);
    }
}
