package com.sumsub.sns.internal.features.presentation.preview.photo.mrtd;

import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.photo.mrtd.b0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31856b0 implements InterfaceC41635f {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC41635f f64740a;

    public C31856b0(InterfaceC41635f interfaceC41635f) {
        this.f64740a = interfaceC41635f;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.InterfaceC41635f
    public final Object emit(Object obj, Continuation continuation) {
        C31853a0 c31853a0;
        AbstractC31897s c31889o;
        if (continuation instanceof C31853a0) {
            c31853a0 = (C31853a0) continuation;
            int i11 = c31853a0.f64735b;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c31853a0.f64735b = i11 - Integer.MIN_VALUE;
            } else {
                c31853a0 = new C31853a0(this, continuation);
            }
        } else {
            c31853a0 = new C31853a0(this, continuation);
        }
        Object obj2 = c31853a0.f64734a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c31853a0.f64735b;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj2);
            InterfaceC41635f interfaceC41635f = this.f64740a;
            AbstractC31844S abstractC31844S = (AbstractC31844S) obj;
            if (abstractC31844S instanceof C31841O) {
                C31841O c31841o = (C31841O) abstractC31844S;
                c31889o = new C31891p(c31841o.f64706a, c31841o.f64707b, c31841o.f64708c, c31841o.f64709d, c31841o.f64710e);
            } else if (abstractC31844S instanceof C31842P) {
                C31842P c31842p = (C31842P) abstractC31844S;
                c31889o = new C31893q(c31842p.f64711a, c31842p.f64712b, c31842p.f64713c);
            } else if (abstractC31844S instanceof C31843Q) {
                C31843Q c31843q = (C31843Q) abstractC31844S;
                c31889o = new C31895r(c31843q.f64714a, c31843q.f64715b, c31843q.f64716c, c31843q.f64717d);
            } else if (abstractC31844S instanceof C31839M) {
                c31889o = new C31887n(((C31839M) abstractC31844S).f64701a);
            } else {
                if (!(abstractC31844S instanceof C31840N)) {
                    throw new NoWhenBranchMatchedException();
                }
                C31840N c31840n = (C31840N) abstractC31844S;
                c31889o = new C31889o(c31840n.f64702a, c31840n.f64703b, c31840n.f64704c, c31840n.f64705d);
            }
            c31853a0.f64735b = 1;
            if (interfaceC41635f.emit(c31889o, c31853a0) == coroutine_suspended) {
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
