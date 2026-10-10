package com.sumsub.sns.internal.features.presentation.verification2.phone;

import com.sumsub.sns.internal.features.presentation.verification2.host.C32818b;
import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.verification2.phone.y */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32880y implements InterfaceC41635f {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC41635f f67277a;

    public C32880y(InterfaceC41635f interfaceC41635f) {
        this.f67277a = interfaceC41635f;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.InterfaceC41635f
    public final Object emit(Object obj, Continuation continuation) {
        C32879x c32879x;
        if (continuation instanceof C32879x) {
            c32879x = (C32879x) continuation;
            int i11 = c32879x.f67275b;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c32879x.f67275b = i11 - Integer.MIN_VALUE;
            } else {
                c32879x = new C32879x(this, continuation);
            }
        } else {
            c32879x = new C32879x(this, continuation);
        }
        Object obj2 = c32879x.f67274a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c32879x.f67275b;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj2);
            InterfaceC41635f interfaceC41635f = this.f67277a;
            if (obj instanceof C32818b) {
                c32879x.f67275b = 1;
                if (interfaceC41635f.emit(obj, c32879x) == coroutine_suspended) {
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
