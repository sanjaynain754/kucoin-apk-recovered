package com.sumsub.sns.internal.features.presentation.prooface.session;

import com.sumsub.sns.internal.features.presentation.prooface.C32016L0;
import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.prooface.session.E */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32151E implements InterfaceC41635f {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC41635f f65442a;

    public C32151E(InterfaceC41635f interfaceC41635f) {
        this.f65442a = interfaceC41635f;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.InterfaceC41635f
    public final Object emit(Object obj, Continuation continuation) {
        C32149D c32149d;
        if (continuation instanceof C32149D) {
            c32149d = (C32149D) continuation;
            int i11 = c32149d.f65440b;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c32149d.f65440b = i11 - Integer.MIN_VALUE;
            } else {
                c32149d = new C32149D(this, continuation);
            }
        } else {
            c32149d = new C32149D(this, continuation);
        }
        Object obj2 = c32149d.f65439a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c32149d.f65440b;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj2);
            InterfaceC41635f interfaceC41635f = this.f65442a;
            if (obj instanceof C32016L0) {
                c32149d.f65440b = 1;
                if (interfaceC41635f.emit(obj, c32149d) == coroutine_suspended) {
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
