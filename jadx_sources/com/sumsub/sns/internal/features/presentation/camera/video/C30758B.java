package com.sumsub.sns.internal.features.presentation.camera.video;

import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.video.B */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30758B extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f62143a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f62144b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30758B(String str, Continuation continuation) {
        super(2, continuation);
        this.f62144b = str;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C30758B c30758b = new C30758B(this.f62144b, continuation);
        c30758b.f62143a = obj;
        return c30758b;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C30758B c30758b = new C30758B(this.f62144b, (Continuation) obj2);
        c30758b.f62143a = (C30785r) obj;
        return c30758b.invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        C30785r c30785r = (C30785r) this.f62143a;
        C30786s c30786s = c30785r.f62194a;
        return C30785r.m70456a(c30785r, new C30786s(this.f62144b, c30786s.f62197b, c30786s.f62198c), null, 2);
    }
}
