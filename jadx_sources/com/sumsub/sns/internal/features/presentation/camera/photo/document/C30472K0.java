package com.sumsub.sns.internal.features.presentation.camera.photo.document;

import com.sumsub.sns.internal.features.presentation.camera.C30351N;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.photo.document.K0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30472K0 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f61495a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C30444C2 f61496b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30472K0(C30444C2 c30444c2, Continuation continuation) {
        super(2, continuation);
        this.f61496b = c30444c2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C30472K0 c30472k0 = new C30472K0(this.f61496b, continuation);
        c30472k0.f61495a = obj;
        return c30472k0;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C30472K0 c30472k0 = new C30472K0(this.f61496b, (Continuation) obj2);
        c30472k0.f61495a = (C30351N) obj;
        return c30472k0.invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        C30351N c30351nM70242a = C30351N.m70242a((C30351N) this.f61495a, false, false, false, false, null, 55);
        if (!this.f61496b.f61338B) {
            return C30351N.m70242a(c30351nM70242a, true, true, false, false, null, 57);
        }
        return c30351nM70242a;
    }
}
