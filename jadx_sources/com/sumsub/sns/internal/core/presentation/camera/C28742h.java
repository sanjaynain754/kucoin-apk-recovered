package com.sumsub.sns.internal.core.presentation.camera;

import androidx.camera.core.ImageProxy;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.presentation.camera.h */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28742h extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f58446a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C28746l f58447b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ImageProxy f58448c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28742h(C28746l c28746l, ImageProxy imageProxy, Continuation continuation) {
        super(2, continuation);
        this.f58447b = c28746l;
        this.f58448c = imageProxy;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C28742h(this.f58447b, this.f58448c, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C28742h(this.f58447b, this.f58448c, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f58446a;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            C28746l c28746l = this.f58447b;
            InterfaceC28753s interfaceC28753s = c28746l.f58460e;
            if (interfaceC28753s != null) {
                ImageProxy imageProxy = this.f58448c;
                C28758x c28758xM69571d = c28746l.m69571d();
                this.f58446a = 1;
                if (interfaceC28753s.mo69576a(imageProxy, c28758xM69571d, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        }
        return Unit.INSTANCE;
    }
}
