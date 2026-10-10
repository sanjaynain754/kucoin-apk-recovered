package com.sumsub.sns.internal.features.presentation.preview.photo.util;

import com.sumsub.sns.internal.features.presentation.preview.photo.C31931t;
import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.photo.util.b */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31934b implements InterfaceC41635f {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC41635f f64923a;

    public C31934b(InterfaceC41635f interfaceC41635f) {
        this.f64923a = interfaceC41635f;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.InterfaceC41635f
    public final Object emit(Object obj, Continuation continuation) {
        C31933a c31933a;
        if (continuation instanceof C31933a) {
            c31933a = (C31933a) continuation;
            int i11 = c31933a.f64921b;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c31933a.f64921b = i11 - Integer.MIN_VALUE;
            } else {
                c31933a = new C31933a(this, continuation);
            }
        } else {
            c31933a = new C31933a(this, continuation);
        }
        Object obj2 = c31933a.f64920a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c31933a.f64921b;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj2);
            InterfaceC41635f interfaceC41635f = this.f64923a;
            if (((C31931t) obj).f64912d) {
                c31933a.f64921b = 1;
                if (interfaceC41635f.emit(obj, c31933a) == coroutine_suspended) {
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
