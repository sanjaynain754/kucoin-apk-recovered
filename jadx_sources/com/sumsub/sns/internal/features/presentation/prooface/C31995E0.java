package com.sumsub.sns.internal.features.presentation.prooface;

import com.sumsub.sns.internal.core.presentation.camera.C28746l;
import com.sumsub.sns.internal.features.presentation.prooface.utils.AbstractC32267d;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.prooface.E0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31995E0 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ boolean f65042a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ SNSLiveness3dFaceFragment f65043b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31995E0(SNSLiveness3dFaceFragment sNSLiveness3dFaceFragment, Continuation continuation) {
        super(2, continuation);
        this.f65043b = sNSLiveness3dFaceFragment;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C31995E0 c31995e0 = new C31995E0(this.f65043b, continuation);
        c31995e0.f65042a = ((Boolean) obj).booleanValue();
        return c31995e0;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.getClass();
        C31995E0 c31995e0 = new C31995E0(this.f65043b, (Continuation) obj2);
        c31995e0.f65042a = bool.booleanValue();
        return c31995e0.invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        if (this.f65042a) {
            SNSLiveness3dFaceFragment sNSLiveness3dFaceFragment = this.f65043b;
            SNSLiveness3dFaceFragment.Companion companion = SNSLiveness3dFaceFragment.f65167j;
            sNSLiveness3dFaceFragment.m71009h();
        } else {
            SNSLiveness3dFaceFragment sNSLiveness3dFaceFragment2 = this.f65043b;
            SNSLiveness3dFaceFragment.Companion companion2 = SNSLiveness3dFaceFragment.f65167j;
            AbstractC32267d.m71078a("LivenessFragment: stop camera");
            ((C28746l) sNSLiveness3dFaceFragment2.f65170c.getValue()).m69572e();
            ((C32072c2) sNSLiveness3dFaceFragment2.f65168a.getValue()).intent(C32039T0.f65180a);
        }
        return Unit.INSTANCE;
    }
}
