package com.sumsub.sns.internal.features.presentation.country.picker;

import java.util.Set;
import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.country.picker.u */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30909u implements InterfaceC41635f {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC41635f f62444a;

    public C30909u(InterfaceC41635f interfaceC41635f) {
        this.f62444a = interfaceC41635f;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.InterfaceC41635f
    public final Object emit(Object obj, Continuation continuation) {
        C30908t c30908t;
        if (continuation instanceof C30908t) {
            c30908t = (C30908t) continuation;
            int i11 = c30908t.f62442b;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c30908t.f62442b = i11 - Integer.MIN_VALUE;
            } else {
                c30908t = new C30908t(this, continuation);
            }
        } else {
            c30908t = new C30908t(this, continuation);
        }
        Object obj2 = c30908t.f62441a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c30908t.f62442b;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj2);
            InterfaceC41635f interfaceC41635f = this.f62444a;
            if (!((Set) obj).isEmpty()) {
                c30908t.f62442b = 1;
                if (interfaceC41635f.emit(obj, c30908t) == coroutine_suspended) {
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
