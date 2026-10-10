package com.sumsub.sns.internal.features.presentation.prooface;

import com.sumsub.sns.internal.features.presentation.prooface.session.C32244u;
import com.sumsub.sns.internal.features.presentation.prooface.session.C32246v;
import com.sumsub.sns.internal.features.presentation.prooface.session.C32248w;
import com.sumsub.sns.internal.features.presentation.prooface.session.C32250x;
import com.sumsub.sns.internal.features.presentation.prooface.session.InterfaceC32252y;
import kotlinx.coroutines.flow.InterfaceC41668m;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.prooface.o0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32124o0 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f65398a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ SNSLiveness3dFaceFragment f65399b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ AbstractC32118m1 f65400c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32124o0(SNSLiveness3dFaceFragment sNSLiveness3dFaceFragment, AbstractC32118m1 abstractC32118m1, Continuation continuation) {
        super(2, continuation);
        this.f65399b = sNSLiveness3dFaceFragment;
        this.f65400c = abstractC32118m1;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C32124o0(this.f65399b, this.f65400c, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C32124o0(this.f65399b, this.f65400c, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        SNSLiveness3dFaceFragment.FaceViewState faceViewState;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f65398a;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            InterfaceC41668m interfaceC41668m = this.f65399b.f65175h;
            InterfaceC32252y interfaceC32252y = ((C32091g1) this.f65400c).f65308b;
            if (!(interfaceC32252y instanceof C32246v) && !(interfaceC32252y instanceof C32248w) && !(interfaceC32252y instanceof C32250x)) {
                if (interfaceC32252y instanceof C32244u) {
                    faceViewState = SNSLiveness3dFaceFragment.FaceViewState.FaceDetected;
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                faceViewState = SNSLiveness3dFaceFragment.FaceViewState.Recognizing;
            }
            this.f65398a = 1;
            if (interfaceC41668m.emit(faceViewState, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
