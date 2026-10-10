package com.sumsub.sns.internal.features.domain.mrtd;

import com.sumsub.sns.internal.core.domain.C28578h;
import com.sumsub.sns.internal.features.data.model.common.MRTDError;
import com.sumsub.sns.internal.features.data.model.common.remote.C29227I;
import com.sumsub.sns.internal.features.data.repository.applicant.C29917M;
import com.sumsub.sns.internal.log.C33272c;
import kotlinx.coroutines.C41685g2;
import kotlinx.coroutines.C41686h;
import kotlinx.coroutines.C41782z0;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.CoroutineContext;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.mrtd.G */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30234G {

    /* JADX INFO: renamed from: a */
    public final C29917M f60773a;

    public C30234G(C28578h c28578h) {
        this.f60773a = (C29917M) c28578h.f58172j.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX INFO: renamed from: a */
    public final Object m70151a(String str, String str2, String str3, MRTDError mRTDError, ContinuationImpl continuationImpl) {
        C30232E c30232e;
        Object objM103844constructorimpl;
        if (continuationImpl instanceof C30232E) {
            c30232e = (C30232E) continuationImpl;
            int i11 = c30232e.f60766c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c30232e.f60766c = i11 - Integer.MIN_VALUE;
            } else {
                c30232e = new C30232E(this, continuationImpl);
            }
        } else {
            c30232e = new C30232E(this, continuationImpl);
        }
        Object objM91049g = c30232e.f60764a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c30232e.f60766c;
        try {
            if (i12 == 0) {
                ResultKt.throwOnFailure(objM91049g);
                Result.Companion companion = Result.INSTANCE;
                CoroutineContext coroutineContextPlus = C41685g2.f91735b.plus(C41782z0.m91392b());
                C30233F c30233f = new C30233F(this, str, str2, str3, mRTDError, null);
                c30232e.f60766c = 1;
                objM91049g = C41686h.m91049g(coroutineContextPlus, c30233f, c30232e);
                if (objM91049g == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objM91049g);
            }
            objM103844constructorimpl = Result.m103844constructorimpl((C29227I) objM91049g);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            C33272c.f67814c.mo68956e("SumSubNfc", "Failed to send MRTD error", thM103847exceptionOrNullimpl);
        }
        if (Result.m103851isSuccessimpl(objM103844constructorimpl)) {
            objM103844constructorimpl = Unit.INSTANCE;
        }
        return Result.m103844constructorimpl(objM103844constructorimpl);
    }
}
