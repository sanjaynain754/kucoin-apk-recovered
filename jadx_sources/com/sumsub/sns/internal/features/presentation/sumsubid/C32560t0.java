package com.sumsub.sns.internal.features.presentation.sumsubid;

import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.sumsubid.t0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32560t0 implements InterfaceC41635f {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC41635f f66416a;

    public C32560t0(InterfaceC41635f interfaceC41635f) {
        this.f66416a = interfaceC41635f;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.InterfaceC41635f
    public final Object emit(Object obj, Continuation continuation) {
        C32558s0 c32558s0;
        if (continuation instanceof C32558s0) {
            c32558s0 = (C32558s0) continuation;
            int i11 = c32558s0.f66414b;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c32558s0.f66414b = i11 - Integer.MIN_VALUE;
            } else {
                c32558s0 = new C32558s0(this, continuation);
            }
        } else {
            c32558s0 = new C32558s0(this, continuation);
        }
        Object obj2 = c32558s0.f66413a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c32558s0.f66414b;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj2);
            InterfaceC41635f interfaceC41635f = this.f66416a;
            C32496T0 c32496t0M71169a = AbstractC32500V0.m71169a((C32511c) obj);
            c32558s0.f66414b = 1;
            if (interfaceC41635f.emit(c32496t0M71169a, c32558s0) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj2);
        }
        return Unit.INSTANCE;
    }
}
