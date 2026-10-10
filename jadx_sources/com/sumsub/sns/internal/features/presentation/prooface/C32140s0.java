package com.sumsub.sns.internal.features.presentation.prooface;

import com.sumsub.sns.core.widget.SNSLivenessFaceView;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.prooface.s0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32140s0 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f65427a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ SNSLiveness3dFaceFragment f65428b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32140s0(SNSLiveness3dFaceFragment sNSLiveness3dFaceFragment, Continuation continuation) {
        super(2, continuation);
        this.f65428b = sNSLiveness3dFaceFragment;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C32140s0 c32140s0 = new C32140s0(this.f65428b, continuation);
        c32140s0.f65427a = obj;
        return c32140s0;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C32140s0 c32140s0 = new C32140s0(this.f65428b, (Continuation) obj2);
        c32140s0.f65427a = (SNSLiveness3dFaceFragment.FaceViewState) obj;
        return c32140s0.invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        int i11 = AbstractC32136r0.f65420a[((SNSLiveness3dFaceFragment.FaceViewState) this.f65427a).ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 == 4) {
                        SNSLiveness3dFaceFragment sNSLiveness3dFaceFragment = this.f65428b;
                        SNSLiveness3dFaceFragment.Companion companion = SNSLiveness3dFaceFragment.f65167j;
                        SNSLivenessFaceView sNSLivenessFaceViewM71008g = sNSLiveness3dFaceFragment.m71008g();
                        if (sNSLivenessFaceViewM71008g != null) {
                            sNSLivenessFaceViewM71008g.setScanCompleteState();
                        }
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                } else {
                    SNSLiveness3dFaceFragment sNSLiveness3dFaceFragment2 = this.f65428b;
                    SNSLiveness3dFaceFragment.Companion companion2 = SNSLiveness3dFaceFragment.f65167j;
                    SNSLivenessFaceView sNSLivenessFaceViewM71008g2 = sNSLiveness3dFaceFragment2.m71008g();
                    if (sNSLivenessFaceViewM71008g2 != null) {
                        sNSLivenessFaceViewM71008g2.setFaceAnalyzingState();
                    }
                }
            } else {
                SNSLiveness3dFaceFragment sNSLiveness3dFaceFragment3 = this.f65428b;
                SNSLiveness3dFaceFragment.Companion companion3 = SNSLiveness3dFaceFragment.f65167j;
                SNSLivenessFaceView sNSLivenessFaceViewM71008g3 = sNSLiveness3dFaceFragment3.m71008g();
                if (sNSLivenessFaceViewM71008g3 != null) {
                    sNSLivenessFaceViewM71008g3.setFaceDetectedState();
                }
            }
        } else {
            SNSLiveness3dFaceFragment sNSLiveness3dFaceFragment4 = this.f65428b;
            SNSLiveness3dFaceFragment.Companion companion4 = SNSLiveness3dFaceFragment.f65167j;
            SNSLivenessFaceView sNSLivenessFaceViewM71008g4 = sNSLiveness3dFaceFragment4.m71008g();
            if (sNSLivenessFaceViewM71008g4 != null) {
                sNSLivenessFaceViewM71008g4.setRecognizingState();
            }
        }
        return Unit.INSTANCE;
    }
}
