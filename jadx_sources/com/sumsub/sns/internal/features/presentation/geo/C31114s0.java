package com.sumsub.sns.internal.features.presentation.geo;

import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.geo.s0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31114s0 implements InterfaceC41635f {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC41635f f62905a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C31040B0 f62906b;

    public C31114s0(InterfaceC41635f interfaceC41635f, C31040B0 c31040b0) {
        this.f62905a = interfaceC41635f;
        this.f62906b = c31040b0;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.InterfaceC41635f
    public final Object emit(Object obj, Continuation continuation) {
        C31112r0 c31112r0;
        if (continuation instanceof C31112r0) {
            c31112r0 = (C31112r0) continuation;
            int i11 = c31112r0.f62902b;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c31112r0.f62902b = i11 - Integer.MIN_VALUE;
            } else {
                c31112r0 = new C31112r0(this, continuation);
            }
        } else {
            c31112r0 = new C31112r0(this, continuation);
        }
        Object obj2 = c31112r0.f62901a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c31112r0.f62902b;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj2);
            InterfaceC41635f interfaceC41635f = this.f62905a;
            C31038A0 c31038a0 = new C31038A0(this.f62906b, (C31126y0) obj);
            c31112r0.f62902b = 1;
            if (interfaceC41635f.emit(c31038a0, c31112r0) == coroutine_suspended) {
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
