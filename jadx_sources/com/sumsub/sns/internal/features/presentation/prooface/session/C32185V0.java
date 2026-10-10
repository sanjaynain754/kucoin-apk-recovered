package com.sumsub.sns.internal.features.presentation.prooface.session;

import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.prooface.session.V0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32185V0 extends SuspendLambda implements Function3 {

    /* JADX INFO: renamed from: a */
    public int f65544a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ InterfaceC41635f f65545b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f65546c;

    public C32185V0(Continuation continuation) {
        super(3, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C32185V0 c32185v0 = new C32185V0((Continuation) obj3);
        c32185v0.f65545b = (InterfaceC41635f) obj;
        c32185v0.f65546c = obj2;
        return c32185v0.invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC41634e interfaceC41634eM90889M;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f65544a;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            InterfaceC41635f interfaceC41635f = this.f65545b;
            if (((Boolean) this.f65546c).booleanValue()) {
                interfaceC41634eM90889M = C41636g.m90887K(new C32177R0(null));
            } else {
                interfaceC41634eM90889M = C41636g.m90889M(Boxing.boxBoolean(false));
            }
            this.f65544a = 1;
            if (C41636g.m90878B(interfaceC41635f, interfaceC41634eM90889M, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
