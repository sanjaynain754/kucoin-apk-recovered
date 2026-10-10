package com.sumsub.sns.internal.core.presentation.screen.base;

import com.sumsub.sns.core.presentation.base.C28080U;
import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.presentation.screen.base.o */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28931o implements InterfaceC41635f {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC41635f f58821a;

    public C28931o(InterfaceC41635f interfaceC41635f) {
        this.f58821a = interfaceC41635f;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.InterfaceC41635f
    public final Object emit(Object obj, Continuation continuation) {
        C28930n c28930n;
        Object obj2;
        if (continuation instanceof C28930n) {
            c28930n = (C28930n) continuation;
            int i11 = c28930n.f58819b;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c28930n.f58819b = i11 - Integer.MIN_VALUE;
            } else {
                c28930n = new C28930n(this, continuation);
            }
        } else {
            c28930n = new C28930n(this, continuation);
        }
        Object obj3 = c28930n.f58818a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c28930n.f58819b;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj3);
            InterfaceC41635f interfaceC41635f = this.f58821a;
            C28929m c28929m = (C28929m) obj;
            if (c28929m.f58817a.isEmpty()) {
                obj2 = c28929m;
                obj2 = C28080U.f57275a;
            }
            obj2 = c28929m;
            c28930n.f58819b = 1;
            if (interfaceC41635f.emit(obj2, c28930n) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj3);
        }
        return Unit.INSTANCE;
    }
}
