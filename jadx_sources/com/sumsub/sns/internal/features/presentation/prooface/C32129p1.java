package com.sumsub.sns.internal.features.presentation.prooface;

import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.prooface.p1 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32129p1 implements InterfaceC41635f {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC41635f f65408a;

    public C32129p1(InterfaceC41635f interfaceC41635f) {
        this.f65408a = interfaceC41635f;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.InterfaceC41635f
    public final Object emit(Object obj, Continuation continuation) {
        C32125o1 c32125o1;
        if (continuation instanceof C32125o1) {
            c32125o1 = (C32125o1) continuation;
            int i11 = c32125o1.f65402b;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c32125o1.f65402b = i11 - Integer.MIN_VALUE;
            } else {
                c32125o1 = new C32125o1(this, continuation);
            }
        } else {
            c32125o1 = new C32125o1(this, continuation);
        }
        Object obj2 = c32125o1.f65401a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c32125o1.f65402b;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj2);
            InterfaceC41635f interfaceC41635f = this.f65408a;
            C32013K0 c32013k0 = C32013K0.f65076a;
            c32125o1.f65402b = 1;
            if (interfaceC41635f.emit(c32013k0, c32125o1) == coroutine_suspended) {
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
