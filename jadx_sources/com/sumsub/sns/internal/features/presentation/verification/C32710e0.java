package com.sumsub.sns.internal.features.presentation.verification;

import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.verification.e0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32710e0 extends SuspendLambda implements Function3 {

    /* JADX INFO: renamed from: a */
    public int f66907a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ InterfaceC41635f f66908b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f66909c;

    public C32710e0(Continuation continuation) {
        super(3, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C32710e0 c32710e0 = new C32710e0((Continuation) obj3);
        c32710e0.f66908b = (InterfaceC41635f) obj;
        c32710e0.f66909c = obj2;
        return c32710e0.invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f66907a;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            InterfaceC41635f interfaceC41635f = this.f66908b;
            InterfaceC41634e interfaceC41634e = (InterfaceC41634e) this.f66909c;
            this.f66907a = 1;
            if (C41636g.m90878B(interfaceC41635f, interfaceC41634e, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
