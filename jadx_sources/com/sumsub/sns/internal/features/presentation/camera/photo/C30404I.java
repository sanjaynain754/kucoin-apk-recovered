package com.sumsub.sns.internal.features.presentation.camera.photo;

import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function6;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.photo.I */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30404I extends SuspendLambda implements Function6 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ C30683n f61171a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ CharSequence f61172b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ C30398C f61173c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ InterfaceC30731t f61174d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ C30735v f61175e;

    public C30404I(Continuation continuation) {
        super(6, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function6
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        C30404I c30404i = new C30404I((Continuation) obj6);
        c30404i.f61171a = (C30683n) obj;
        c30404i.f61172b = (CharSequence) obj2;
        c30404i.f61173c = (C30398C) obj3;
        c30404i.f61174d = (InterfaceC30731t) obj4;
        c30404i.f61175e = (C30735v) obj5;
        return c30404i.invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        return new C30402G(this.f61171a, this.f61172b, this.f61173c, this.f61174d, this.f61175e);
    }
}
