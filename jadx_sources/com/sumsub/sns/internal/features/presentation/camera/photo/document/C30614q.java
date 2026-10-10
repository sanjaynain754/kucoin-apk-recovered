package com.sumsub.sns.internal.features.presentation.camera.photo.document;

import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.photo.document.q */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30614q extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f61852a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C30471K f61853b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30614q(C30471K c30471k, Continuation continuation) {
        super(2, continuation);
        this.f61853b = c30471k;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C30614q c30614q = new C30614q(this.f61853b, continuation);
        c30614q.f61852a = obj;
        return c30614q;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C30614q c30614q = new C30614q(this.f61853b, (Continuation) obj2);
        c30614q.f61852a = (C30486P) obj;
        return c30614q.invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        C30486P c30486p = (C30486P) this.f61852a;
        C30471K c30471k = this.f61853b;
        C30590m c30590m = C30471K.f61458R;
        c30471k.m70399b(c30486p);
        return Unit.INSTANCE;
    }
}
