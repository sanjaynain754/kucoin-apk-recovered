package com.sumsub.sns.internal.features.presentation.preview.photo.mrtd;

import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.photo.mrtd.h */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31873h implements InterfaceC41635f {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC41635f f64779a;

    public C31873h(InterfaceC41635f interfaceC41635f) {
        this.f64779a = interfaceC41635f;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.InterfaceC41635f
    public final Object emit(Object obj, Continuation continuation) {
        C31870g c31870g;
        if (continuation instanceof C31870g) {
            c31870g = (C31870g) continuation;
            int i11 = c31870g.f64773b;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c31870g.f64773b = i11 - Integer.MIN_VALUE;
            } else {
                c31870g = new C31870g(this, continuation);
            }
        } else {
            c31870g = new C31870g(this, continuation);
        }
        Object obj2 = c31870g.f64772a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c31870g.f64773b;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj2);
            InterfaceC41635f interfaceC41635f = this.f64779a;
            InterfaceC31861d interfaceC31861d = ((Boolean) obj).booleanValue() ? C31867f.f64759a : C31864e.f64752a;
            c31870g.f64773b = 1;
            if (interfaceC41635f.emit(interfaceC31861d, c31870g) == coroutine_suspended) {
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
