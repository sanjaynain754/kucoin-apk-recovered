package com.sumsub.sns.internal.features.presentation.main;

import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.Pair;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.main.i1 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31274i1 implements InterfaceC41635f {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC41635f f63366a;

    public C31274i1(InterfaceC41635f interfaceC41635f) {
        this.f63366a = interfaceC41635f;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.InterfaceC41635f
    public final Object emit(Object obj, Continuation continuation) {
        C31270h1 c31270h1;
        if (continuation instanceof C31270h1) {
            c31270h1 = (C31270h1) continuation;
            int i11 = c31270h1.f63349b;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c31270h1.f63349b = i11 - Integer.MIN_VALUE;
            } else {
                c31270h1 = new C31270h1(this, continuation);
            }
        } else {
            c31270h1 = new C31270h1(this, continuation);
        }
        Object obj2 = c31270h1.f63348a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c31270h1.f63349b;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj2);
            InterfaceC41635f interfaceC41635f = this.f63366a;
            Object first = ((Pair) obj).getFirst();
            c31270h1.f63349b = 1;
            if (interfaceC41635f.emit(first, c31270h1) == coroutine_suspended) {
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
