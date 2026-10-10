package com.sumsub.sns.internal.features.presentation.prooface;

import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.prooface.C0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31989C0 implements InterfaceC41635f {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC41635f f65032a;

    public C31989C0(InterfaceC41635f interfaceC41635f) {
        this.f65032a = interfaceC41635f;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.InterfaceC41635f
    public final Object emit(Object obj, Continuation continuation) {
        C31986B0 c31986b0;
        Float fBoxFloat;
        if (continuation instanceof C31986B0) {
            c31986b0 = (C31986B0) continuation;
            int i11 = c31986b0.f65027b;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c31986b0.f65027b = i11 - Integer.MIN_VALUE;
            } else {
                c31986b0 = new C31986B0(this, continuation);
            }
        } else {
            c31986b0 = new C31986B0(this, continuation);
        }
        Object obj2 = c31986b0.f65026a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c31986b0.f65027b;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj2);
            InterfaceC41635f interfaceC41635f = this.f65032a;
            InterfaceC32076d1 interfaceC32076d1 = (InterfaceC32076d1) obj;
            if (Intrinsics.areEqual(interfaceC32076d1, C32057Z0.f65220a) || Intrinsics.areEqual(interfaceC32076d1, C32066b1.f65240a)) {
                fBoxFloat = null;
            } else {
                if (!(interfaceC32076d1 instanceof C32061a1)) {
                    throw new NoWhenBranchMatchedException();
                }
                fBoxFloat = Boxing.boxFloat(((C32061a1) interfaceC32076d1).f65231a);
            }
            c31986b0.f65027b = 1;
            if (interfaceC41635f.emit(fBoxFloat, c31986b0) == coroutine_suspended) {
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
