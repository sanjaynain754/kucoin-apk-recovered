package com.sumsub.sns.internal.features.presentation.prooface;

import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.prooface.u1 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32262u1 implements InterfaceC41635f {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC41635f f65722a;

    public C32262u1(InterfaceC41635f interfaceC41635f) {
        this.f65722a = interfaceC41635f;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.InterfaceC41635f
    public final Object emit(Object obj, Continuation continuation) {
        C32258t1 c32258t1;
        if (continuation instanceof C32258t1) {
            c32258t1 = (C32258t1) continuation;
            int i11 = c32258t1.f65716b;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c32258t1.f65716b = i11 - Integer.MIN_VALUE;
            } else {
                c32258t1 = new C32258t1(this, continuation);
            }
        } else {
            c32258t1 = new C32258t1(this, continuation);
        }
        Object obj2 = c32258t1.f65715a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c32258t1.f65716b;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj2);
            InterfaceC41635f interfaceC41635f = this.f65722a;
            Boolean boolBoxBoolean = Boxing.boxBoolean(true);
            c32258t1.f65716b = 1;
            if (interfaceC41635f.emit(boolBoxBoolean, c32258t1) == coroutine_suspended) {
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
