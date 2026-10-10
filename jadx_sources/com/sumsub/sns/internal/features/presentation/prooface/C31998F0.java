package com.sumsub.sns.internal.features.presentation.prooface;

import com.sumsub.sns.internal.core.presentation.camera.C28746l;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.prooface.F0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31998F0 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ float f65047a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ SNSLiveness3dFaceFragment f65048b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31998F0(SNSLiveness3dFaceFragment sNSLiveness3dFaceFragment, Continuation continuation) {
        super(2, continuation);
        this.f65048b = sNSLiveness3dFaceFragment;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C31998F0 c31998f0 = new C31998F0(this.f65048b, continuation);
        c31998f0.f65047a = ((Number) obj).floatValue();
        return c31998f0;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        float fFloatValue = ((Number) obj).floatValue();
        C31998F0 c31998f0 = new C31998F0(this.f65048b, (Continuation) obj2);
        c31998f0.f65047a = fFloatValue;
        return c31998f0.invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        ((C28746l) this.f65048b.f65170c.getValue()).m69563a(this.f65047a);
        return Unit.INSTANCE;
    }
}
