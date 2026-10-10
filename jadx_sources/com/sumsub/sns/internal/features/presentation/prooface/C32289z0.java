package com.sumsub.sns.internal.features.presentation.prooface;

import com.sumsub.sns.internal.features.presentation.prooface.utils.AbstractC32267d;
import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.prooface.z0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32289z0 implements InterfaceC41635f {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC41635f f65767a;

    public C32289z0(InterfaceC41635f interfaceC41635f) {
        this.f65767a = interfaceC41635f;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.InterfaceC41635f
    public final Object emit(Object obj, Continuation continuation) {
        C32285y0 c32285y0;
        boolean z11;
        if (continuation instanceof C32285y0) {
            c32285y0 = (C32285y0) continuation;
            int i11 = c32285y0.f65760b;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c32285y0.f65760b = i11 - Integer.MIN_VALUE;
            } else {
                c32285y0 = new C32285y0(this, continuation);
            }
        } else {
            c32285y0 = new C32285y0(this, continuation);
        }
        Object obj2 = c32285y0.f65759a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c32285y0.f65760b;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj2);
            InterfaceC41635f interfaceC41635f = this.f65767a;
            InterfaceC32076d1 interfaceC32076d1 = (InterfaceC32076d1) obj;
            AbstractC32267d.m71078a("LivenessFragment: requiredCameraState: " + interfaceC32076d1);
            if (Intrinsics.areEqual(interfaceC32076d1, C32057Z0.f65220a)) {
                z11 = false;
            } else {
                if (!(interfaceC32076d1 instanceof InterfaceC32071c1)) {
                    throw new NoWhenBranchMatchedException();
                }
                z11 = true;
            }
            Boolean boolBoxBoolean = Boxing.boxBoolean(z11);
            c32285y0.f65760b = 1;
            if (interfaceC41635f.emit(boolBoxBoolean, c32285y0) == coroutine_suspended) {
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
