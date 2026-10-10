package com.sumsub.sns.internal.features.presentation.geo;

import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.geo.e0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31083e0 implements InterfaceC41635f {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC41635f f62848a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C31040B0 f62849b;

    public C31083e0(InterfaceC41635f interfaceC41635f, C31040B0 c31040b0) {
        this.f62848a = interfaceC41635f;
        this.f62849b = c31040b0;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.InterfaceC41635f
    public final Object emit(Object obj, Continuation continuation) {
        C31080d0 c31080d0;
        if (continuation instanceof C31080d0) {
            c31080d0 = (C31080d0) continuation;
            int i11 = c31080d0.f62844b;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c31080d0.f62844b = i11 - Integer.MIN_VALUE;
            } else {
                c31080d0 = new C31080d0(this, continuation);
            }
        } else {
            c31080d0 = new C31080d0(this, continuation);
        }
        Object obj2 = c31080d0.f62843a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c31080d0.f62844b;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj2);
            InterfaceC41635f interfaceC41635f = this.f62848a;
            C31038A0 c31038a0 = new C31038A0(this.f62849b, (C31126y0) obj);
            c31080d0.f62844b = 1;
            if (interfaceC41635f.emit(c31038a0, c31080d0) == coroutine_suspended) {
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
