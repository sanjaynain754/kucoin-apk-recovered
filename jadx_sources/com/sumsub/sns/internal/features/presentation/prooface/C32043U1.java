package com.sumsub.sns.internal.features.presentation.prooface;

import com.sumsub.sns.internal.features.presentation.prooface.session.C32240s;
import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.prooface.U1 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32043U1 implements InterfaceC41635f {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC41635f f65188a;

    public C32043U1(InterfaceC41635f interfaceC41635f) {
        this.f65188a = interfaceC41635f;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.InterfaceC41635f
    public final Object emit(Object obj, Continuation continuation) {
        C32040T1 c32040t1;
        if (continuation instanceof C32040T1) {
            c32040t1 = (C32040T1) continuation;
            int i11 = c32040t1.f65182b;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c32040t1.f65182b = i11 - Integer.MIN_VALUE;
            } else {
                c32040t1 = new C32040T1(this, continuation);
            }
        } else {
            c32040t1 = new C32040T1(this, continuation);
        }
        Object obj2 = c32040t1.f65181a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c32040t1.f65182b;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj2);
            InterfaceC41635f interfaceC41635f = this.f65188a;
            if (obj instanceof C32240s) {
                c32040t1.f65182b = 1;
                if (interfaceC41635f.emit(obj, c32040t1) == coroutine_suspended) {
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
