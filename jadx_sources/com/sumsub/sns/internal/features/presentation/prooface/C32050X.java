package com.sumsub.sns.internal.features.presentation.prooface;

import kotlinx.coroutines.flow.InterfaceC41669n;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.prooface.X */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32050X extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public InterfaceC41669n f65203a;

    /* JADX INFO: renamed from: b */
    public boolean f65204b;

    /* JADX INFO: renamed from: c */
    public int f65205c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C32109k0 f65206d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ boolean f65207e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32050X(C32109k0 c32109k0, boolean z11, Continuation continuation) {
        super(2, continuation);
        this.f65206d = c32109k0;
        this.f65207e = z11;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C32050X(this.f65206d, this.f65207e, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C32050X(this.f65206d, this.f65207e, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC41669n interfaceC41669n;
        boolean z11;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f65205c;
        if (i11 != 0) {
            if (i11 == 1) {
                z11 = this.f65204b;
                interfaceC41669n = this.f65203a;
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            C32109k0 c32109k0 = this.f65206d;
            interfaceC41669n = c32109k0.f65352I;
            boolean z12 = this.f65207e;
            this.f65203a = interfaceC41669n;
            this.f65204b = z12;
            this.f65205c = 1;
            obj = c32109k0.getString("sns_facescan_hint_facePosition", this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            z11 = z12;
        }
        interfaceC41669n.setValue(new C32015L((CharSequence) obj, z11));
        return Unit.INSTANCE;
    }
}
