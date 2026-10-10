package com.sumsub.sns.internal.features.presentation.prooface;

import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.prooface.f2 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32087f2 implements InterfaceC41635f {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC41635f f65299a;

    public C32087f2(InterfaceC41635f interfaceC41635f) {
        this.f65299a = interfaceC41635f;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.InterfaceC41635f
    public final Object emit(Object obj, Continuation continuation) {
        C32082e2 c32082e2;
        if (continuation instanceof C32082e2) {
            c32082e2 = (C32082e2) continuation;
            int i11 = c32082e2.f65292b;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c32082e2.f65292b = i11 - Integer.MIN_VALUE;
            } else {
                c32082e2 = new C32082e2(this, continuation);
            }
        } else {
            c32082e2 = new C32082e2(this, continuation);
        }
        Object obj2 = c32082e2.f65291a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c32082e2.f65292b;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj2);
            InterfaceC41635f interfaceC41635f = this.f65299a;
            if (((Boolean) obj).booleanValue()) {
                c32082e2.f65292b = 1;
                if (interfaceC41635f.emit(obj, c32082e2) == coroutine_suspended) {
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
