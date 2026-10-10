package com.sumsub.sns.internal.features.presentation.prooface;

import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.Pair;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.prooface.I1 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32008I1 implements InterfaceC41635f {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC41635f f65070a;

    public C32008I1(InterfaceC41635f interfaceC41635f) {
        this.f65070a = interfaceC41635f;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.InterfaceC41635f
    public final Object emit(Object obj, Continuation continuation) {
        C32005H1 c32005h1;
        if (continuation instanceof C32005H1) {
            c32005h1 = (C32005H1) continuation;
            int i11 = c32005h1.f65062b;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c32005h1.f65062b = i11 - Integer.MIN_VALUE;
            } else {
                c32005h1 = new C32005H1(this, continuation);
            }
        } else {
            c32005h1 = new C32005H1(this, continuation);
        }
        Object obj2 = c32005h1.f65061a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c32005h1.f65062b;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj2);
            InterfaceC41635f interfaceC41635f = this.f65070a;
            if (((Boolean) ((Pair) obj).component2()).booleanValue()) {
                c32005h1.f65062b = 1;
                if (interfaceC41635f.emit(obj, c32005h1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
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
