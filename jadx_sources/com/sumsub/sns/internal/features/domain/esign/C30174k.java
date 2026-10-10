package com.sumsub.sns.internal.features.domain.esign;

import com.sumsub.sns.core.data.model.SNSGeneralException;
import com.sumsub.sns.internal.features.data.model.esign.C29736H;
import com.sumsub.sns.internal.features.data.model.esign.C29752Y;
import com.sumsub.sns.internal.features.data.repository.applicant.C29950z;
import com.sumsub.sns.internal.features.data.repository.applicant.InterfaceC29921d;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.TuplesKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.esign.k */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30174k {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m70130a(InterfaceC29921d interfaceC29921d, ContinuationImpl continuationImpl) {
        C30173j c30173j;
        if (continuationImpl instanceof C30173j) {
            c30173j = (C30173j) continuationImpl;
            int i11 = c30173j.f60634c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c30173j.f60634c = i11 - Integer.MIN_VALUE;
            } else {
                c30173j = new C30173j(this, continuationImpl);
            }
        } else {
            c30173j = new C30173j(this, continuationImpl);
        }
        Object objM70012a = c30173j.f60632a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c30173j.f60634c;
        try {
            if (i12 == 0) {
                ResultKt.throwOnFailure(objM70012a);
                C29736H c29736h = new C29736H(MapsKt.mapOf(TuplesKt.m90091to("accepted", Boxing.boxBoolean(true))));
                c30173j.f60634c = 1;
                objM70012a = ((C29950z) interfaceC29921d).m70012a(c29736h, c30173j);
                if (objM70012a == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objM70012a);
            }
            C29752Y c29752y = (C29752Y) objM70012a;
            if (c29752y != null) {
                return Result.m103844constructorimpl(c29752y);
            }
            Result.Companion companion = Result.INSTANCE;
            return Result.m103844constructorimpl(ResultKt.createFailure(new SNSGeneralException("Response null", null, null, 6, null)));
        } catch (Exception e11) {
            Result.Companion companion2 = Result.INSTANCE;
            return Result.m103844constructorimpl(ResultKt.createFailure(e11));
        }
    }
}
