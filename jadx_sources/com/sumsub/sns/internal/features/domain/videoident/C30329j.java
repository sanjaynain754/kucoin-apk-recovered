package com.sumsub.sns.internal.features.domain.videoident;

import com.sumsub.sns.core.data.model.SNSException;
import com.sumsub.sns.internal.core.domain.base.AbstractC28543c;
import com.sumsub.sns.internal.features.data.model.common.remote.C29227I;
import com.sumsub.sns.internal.features.data.repository.applicant.C29914J;
import com.sumsub.sns.internal.features.data.repository.applicant.C29917M;
import com.sumsub.sns.internal.features.data.repository.common.InterfaceC29953a;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.videoident.j */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30329j {

    /* JADX INFO: renamed from: a */
    public final InterfaceC29953a f60986a;

    /* JADX INFO: renamed from: b */
    public final C29917M f60987b;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m70190a(ContinuationImpl continuationImpl) {
        C30328i c30328i;
        if (continuationImpl instanceof C30328i) {
            c30328i = (C30328i) continuationImpl;
            int i11 = c30328i.f60985c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c30328i.f60985c = i11 - Integer.MIN_VALUE;
            } else {
                c30328i = new C30328i(this, continuationImpl);
            }
        } else {
            c30328i = new C30328i(this, continuationImpl);
        }
        Object objM69994e = c30328i.f60983a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c30328i.f60985c;
        try {
            if (i12 == 0) {
                ResultKt.throwOnFailure(objM69994e);
                C29917M c29917m = this.f60987b;
                c30328i.f60985c = 1;
                objM69994e = ((C29914J) c29917m.f60057a).f60051a.m69994e(c30328i);
                if (objM69994e == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objM69994e);
            }
            C29227I c29227i = (C29227I) objM69994e;
            Integer num = c29227i.f59218a;
            if (num != null && num.intValue() == 1) {
                return Result.m103844constructorimpl(c29227i);
            }
            SNSException.Unknown unknown = new SNSException.Unknown(new Exception("d=" + c29227i.f59219b + ", c=" + c29227i.f59220c));
            Result.Companion companion = Result.INSTANCE;
            return Result.m103844constructorimpl(ResultKt.createFailure(AbstractC28543c.m69413a(this.f60986a, unknown)));
        } catch (Exception e11) {
            Result.Companion companion2 = Result.INSTANCE;
            return Result.m103844constructorimpl(ResultKt.createFailure(AbstractC28543c.m69413a(this.f60986a, e11)));
        }
    }

    public C30329j(C29917M c29917m, InterfaceC29953a interfaceC29953a) {
        this.f60986a = interfaceC29953a;
        this.f60987b = c29917m;
    }
}
