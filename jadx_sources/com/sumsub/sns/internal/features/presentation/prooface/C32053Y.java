package com.sumsub.sns.internal.features.presentation.prooface;

import kotlinx.coroutines.flow.InterfaceC41669n;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.prooface.Y */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32053Y extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public InterfaceC41669n f65211a;

    /* JADX INFO: renamed from: b */
    public int f65212b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C32109k0 f65213c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32053Y(C32109k0 c32109k0, Continuation continuation) {
        super(2, continuation);
        this.f65213c = c32109k0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C32053Y(this.f65213c, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C32053Y(this.f65213c, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC41669n interfaceC41669n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f65212b;
        if (i11 != 0) {
            if (i11 == 1) {
                interfaceC41669n = this.f65211a;
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            C32109k0 c32109k0 = this.f65213c;
            InterfaceC41669n interfaceC41669n2 = c32109k0.f65352I;
            this.f65211a = interfaceC41669n2;
            this.f65212b = 1;
            obj = c32109k0.getString("sns_facescan_hint_facePosition", this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            interfaceC41669n = interfaceC41669n2;
        }
        interfaceC41669n.setValue(new C32015L((CharSequence) obj, false));
        return Unit.INSTANCE;
    }
}
