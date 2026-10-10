package com.sumsub.sns.internal.features.presentation.preview.photo.mrtd;

import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.photo.mrtd.Y */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31850Y implements InterfaceC41635f {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC41635f f64732a;

    public C31850Y(InterfaceC41635f interfaceC41635f) {
        this.f64732a = interfaceC41635f;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.InterfaceC41635f
    public final Object emit(Object obj, Continuation continuation) {
        C31849X c31849x;
        if (continuation instanceof C31849X) {
            c31849x = (C31849X) continuation;
            int i11 = c31849x.f64730b;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c31849x.f64730b = i11 - Integer.MIN_VALUE;
            } else {
                c31849x = new C31849X(this, continuation);
            }
        } else {
            c31849x = new C31849X(this, continuation);
        }
        Object obj2 = c31849x.f64729a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c31849x.f64730b;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj2);
            InterfaceC41635f interfaceC41635f = this.f64732a;
            if (obj instanceof AbstractC31844S) {
                c31849x.f64730b = 1;
                if (interfaceC41635f.emit(obj, c31849x) == coroutine_suspended) {
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
