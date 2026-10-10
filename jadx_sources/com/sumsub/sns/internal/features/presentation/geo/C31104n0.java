package com.sumsub.sns.internal.features.presentation.geo;

import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.geo.n0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31104n0 implements InterfaceC41635f {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC41635f f62890a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C31040B0 f62891b;

    public C31104n0(InterfaceC41635f interfaceC41635f, C31040B0 c31040b0) {
        this.f62890a = interfaceC41635f;
        this.f62891b = c31040b0;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.InterfaceC41635f
    public final Object emit(Object obj, Continuation continuation) {
        C31102m0 c31102m0;
        if (continuation instanceof C31102m0) {
            c31102m0 = (C31102m0) continuation;
            int i11 = c31102m0.f62887b;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c31102m0.f62887b = i11 - Integer.MIN_VALUE;
            } else {
                c31102m0 = new C31102m0(this, continuation);
            }
        } else {
            c31102m0 = new C31102m0(this, continuation);
        }
        Object obj2 = c31102m0.f62886a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c31102m0.f62887b;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj2);
            InterfaceC41635f interfaceC41635f = this.f62890a;
            C31038A0 c31038a0 = new C31038A0(this.f62891b, (C31126y0) obj);
            c31102m0.f62887b = 1;
            if (interfaceC41635f.emit(c31038a0, c31102m0) == coroutine_suspended) {
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
