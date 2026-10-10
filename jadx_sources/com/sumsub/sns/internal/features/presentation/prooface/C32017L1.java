package com.sumsub.sns.internal.features.presentation.prooface;

import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.Pair;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.prooface.L1 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32017L1 implements InterfaceC41635f {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC41635f f65084a;

    public C32017L1(InterfaceC41635f interfaceC41635f) {
        this.f65084a = interfaceC41635f;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.InterfaceC41635f
    public final Object emit(Object obj, Continuation continuation) {
        C32014K1 c32014k1;
        if (continuation instanceof C32014K1) {
            c32014k1 = (C32014K1) continuation;
            int i11 = c32014k1.f65078b;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c32014k1.f65078b = i11 - Integer.MIN_VALUE;
            } else {
                c32014k1 = new C32014K1(this, continuation);
            }
        } else {
            c32014k1 = new C32014K1(this, continuation);
        }
        Object obj2 = c32014k1.f65077a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c32014k1.f65078b;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj2);
            InterfaceC41635f interfaceC41635f = this.f65084a;
            Function1 function1 = (Function1) ((Pair) obj).component1();
            c32014k1.f65078b = 1;
            if (interfaceC41635f.emit(function1, c32014k1) == coroutine_suspended) {
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
