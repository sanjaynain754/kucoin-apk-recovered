package com.sumsub.sns.internal.features.presentation.sumsubid;

import com.sumsub.sns.core.presentation.base.C28075O;
import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.sumsubid.q0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32554q0 implements InterfaceC41635f {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC41635f f66407a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C28075O f66408b;

    public C32554q0(InterfaceC41635f interfaceC41635f, C28075O c28075o) {
        this.f66407a = interfaceC41635f;
        this.f66408b = c28075o;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.InterfaceC41635f
    public final Object emit(Object obj, Continuation continuation) {
        C32551p0 c32551p0;
        if (continuation instanceof C32551p0) {
            c32551p0 = (C32551p0) continuation;
            int i11 = c32551p0.f66399b;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c32551p0.f66399b = i11 - Integer.MIN_VALUE;
            } else {
                c32551p0 = new C32551p0(this, continuation);
            }
        } else {
            c32551p0 = new C32551p0(this, continuation);
        }
        Object obj2 = c32551p0.f66398a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c32551p0.f66399b;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj2);
            InterfaceC41635f interfaceC41635f = this.f66407a;
            C32489P0 c32489p0M71167a = AbstractC32500V0.m71167a(this.f66408b.f57270b, ((C32517e) obj).f66342a);
            c32551p0.f66399b = 1;
            if (interfaceC41635f.emit(c32489p0M71167a, c32551p0) == coroutine_suspended) {
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
