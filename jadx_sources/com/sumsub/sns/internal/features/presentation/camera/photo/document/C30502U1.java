package com.sumsub.sns.internal.features.presentation.camera.photo.document;

import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.photo.document.U1 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30502U1 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f61585a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C30440B2 f61586b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30502U1(C30440B2 c30440b2, Continuation continuation) {
        super(2, continuation);
        this.f61586b = c30440b2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C30502U1 c30502u1 = new C30502U1(this.f61586b, continuation);
        c30502u1.f61585a = obj;
        return c30502u1;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C30502U1 c30502u1 = new C30502U1(this.f61586b, (Continuation) obj2);
        c30502u1.f61585a = (C30627s1) obj;
        return c30502u1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean z11;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        C30627s1 c30627s1 = (C30627s1) this.f61585a;
        if (this.f61586b.f61310k == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        return C30627s1.m70414a(c30627s1, z11, null, 5);
    }
}
