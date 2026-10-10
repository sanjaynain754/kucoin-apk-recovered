package com.sumsub.sns.internal.features.presentation.prooface.session;

import com.sumsub.sns.internal.features.presentation.prooface.C32016L0;
import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.prooface.session.i */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32218i implements InterfaceC41635f {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC41635f f65633a;

    public C32218i(InterfaceC41635f interfaceC41635f) {
        this.f65633a = interfaceC41635f;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.InterfaceC41635f
    public final Object emit(Object obj, Continuation continuation) {
        C32215h c32215h;
        if (continuation instanceof C32215h) {
            c32215h = (C32215h) continuation;
            int i11 = c32215h.f65625b;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c32215h.f65625b = i11 - Integer.MIN_VALUE;
            } else {
                c32215h = new C32215h(this, continuation);
            }
        } else {
            c32215h = new C32215h(this, continuation);
        }
        Object obj2 = c32215h.f65624a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c32215h.f65625b;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj2);
            InterfaceC41635f interfaceC41635f = this.f65633a;
            if (obj instanceof C32016L0) {
                c32215h.f65625b = 1;
                if (interfaceC41635f.emit(obj, c32215h) == coroutine_suspended) {
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
