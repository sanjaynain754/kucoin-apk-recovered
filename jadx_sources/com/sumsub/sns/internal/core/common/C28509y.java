package com.sumsub.sns.internal.core.common;

import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.common.y */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28509y implements InterfaceC41635f {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC41635f f58039a;

    public C28509y(InterfaceC41635f interfaceC41635f) {
        this.f58039a = interfaceC41635f;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.InterfaceC41635f
    public final Object emit(Object obj, Continuation continuation) {
        C28506x c28506x;
        if (continuation instanceof C28506x) {
            c28506x = (C28506x) continuation;
            int i11 = c28506x.f58036b;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c28506x.f58036b = i11 - Integer.MIN_VALUE;
            } else {
                c28506x = new C28506x(this, continuation);
            }
        } else {
            c28506x = new C28506x(this, continuation);
        }
        Object obj2 = c28506x.f58035a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c28506x.f58036b;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj2);
            InterfaceC41635f interfaceC41635f = this.f58039a;
            if (obj != null) {
                c28506x.f58036b = 1;
                if (interfaceC41635f.emit(obj, c28506x) == coroutine_suspended) {
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
