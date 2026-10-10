package com.sumsub.sns.internal.core.presentation.nfc;

import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.presentation.nfc.k */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28906k extends SuspendLambda implements Function3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f58771a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ int f58772b;

    public C28906k(Continuation continuation) {
        super(3, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int iIntValue = ((Number) obj2).intValue();
        C28906k c28906k = new C28906k((Continuation) obj3);
        c28906k.f58771a = (NfcReadController$ReadingStep) obj;
        c28906k.f58772b = iIntValue;
        return c28906k.invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        NfcReadController$ReadingStep nfcReadController$ReadingStep = (NfcReadController$ReadingStep) this.f58771a;
        int i11 = this.f58772b;
        int i12 = AbstractC28905j.f58770a[nfcReadController$ReadingStep.ordinal()];
        if (i12 != 1) {
            if (i12 != 2) {
                if (i12 != 3) {
                    if (i12 != 4) {
                        if (i12 == 5) {
                            return C28899d.f58762a;
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    return C28903h.f58766a;
                }
                return new C28902g(i11);
            }
            return C28901f.f58764a;
        }
        return C28900e.f58763a;
    }
}
