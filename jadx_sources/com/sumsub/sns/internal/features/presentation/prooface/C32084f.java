package com.sumsub.sns.internal.features.presentation.prooface;

import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.prooface.f */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32084f extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f65295a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ SNSDefaultLiveness3dFaceFragment f65296b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32084f(SNSDefaultLiveness3dFaceFragment sNSDefaultLiveness3dFaceFragment, Continuation continuation) {
        super(2, continuation);
        this.f65296b = sNSDefaultLiveness3dFaceFragment;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C32084f c32084f = new C32084f(this.f65296b, continuation);
        c32084f.f65295a = obj;
        return c32084f;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C32084f c32084f = new C32084f(this.f65296b, (Continuation) obj2);
        c32084f.f65295a = (AbstractC31985B) obj;
        return c32084f.invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        AbstractC31985B abstractC31985B = (AbstractC31985B) this.f65295a;
        if (abstractC31985B != null) {
            SNSDefaultLiveness3dFaceFragment sNSDefaultLiveness3dFaceFragment = this.f65296b;
            SNSDefaultLiveness3dFaceFragment.Companion companion = SNSDefaultLiveness3dFaceFragment.f65151p;
            sNSDefaultLiveness3dFaceFragment.m70986a(abstractC31985B);
        }
        return Unit.INSTANCE;
    }
}
