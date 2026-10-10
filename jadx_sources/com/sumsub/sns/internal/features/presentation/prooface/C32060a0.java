package com.sumsub.sns.internal.features.presentation.prooface;

import com.sumsub.sns.internal.features.data.network.prooface.C29894i;
import com.sumsub.sns.internal.features.data.network.prooface.Liveness3dFaceRepository$LivenessRepositoryResult;
import kotlinx.coroutines.flow.InterfaceC41669n;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.prooface.a0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32060a0 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public InterfaceC41669n f65227a;

    /* JADX INFO: renamed from: b */
    public int f65228b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C32109k0 f65229c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Liveness3dFaceRepository$LivenessRepositoryResult f65230d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32060a0(C32109k0 c32109k0, Liveness3dFaceRepository$LivenessRepositoryResult liveness3dFaceRepository$LivenessRepositoryResult, Continuation continuation) {
        super(2, continuation);
        this.f65229c = c32109k0;
        this.f65230d = liveness3dFaceRepository$LivenessRepositoryResult;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C32060a0(this.f65229c, this.f65230d, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C32060a0(this.f65229c, this.f65230d, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC41669n interfaceC41669n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f65228b;
        if (i11 != 0) {
            if (i11 == 1) {
                interfaceC41669n = this.f65227a;
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            C32109k0 c32109k0 = this.f65229c;
            InterfaceC41669n interfaceC41669n2 = c32109k0.f65352I;
            C29894i c29894i = (C29894i) this.f65230d;
            this.f65227a = interfaceC41669n2;
            this.f65228b = 1;
            obj = C32109k0.m71027a(c32109k0, c29894i, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            interfaceC41669n = interfaceC41669n2;
        }
        interfaceC41669n.setValue(obj);
        return Unit.INSTANCE;
    }
}
