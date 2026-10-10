package com.sumsub.sns.internal.features.domain.esign;

import com.sumsub.sns.core.data.model.SNSGeneralException;
import com.sumsub.sns.internal.features.data.model.esign.C29752Y;
import com.sumsub.sns.internal.features.data.repository.applicant.C29950z;
import com.sumsub.sns.internal.features.data.repository.applicant.InterfaceC29921d;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.esign.g */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30170g {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m70128a(InterfaceC29921d interfaceC29921d, ContinuationImpl continuationImpl) {
        C30169f c30169f;
        if (continuationImpl instanceof C30169f) {
            c30169f = (C30169f) continuationImpl;
            int i11 = c30169f.f60628c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c30169f.f60628c = i11 - Integer.MIN_VALUE;
            } else {
                c30169f = new C30169f(this, continuationImpl);
            }
        } else {
            c30169f = new C30169f(this, continuationImpl);
        }
        Object objM70024e = c30169f.f60626a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c30169f.f60628c;
        try {
            if (i12 == 0) {
                ResultKt.throwOnFailure(objM70024e);
                c30169f.f60628c = 1;
                objM70024e = ((C29950z) interfaceC29921d).m70024e(c30169f);
                if (objM70024e == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objM70024e);
            }
            C29752Y c29752y = (C29752Y) objM70024e;
            if (c29752y != null) {
                return Result.m103844constructorimpl(c29752y);
            }
            Result.Companion companion = Result.INSTANCE;
            return Result.m103844constructorimpl(ResultKt.createFailure(new SNSGeneralException(null, null, null, 7, null)));
        } catch (Exception e11) {
            Result.Companion companion2 = Result.INSTANCE;
            return Result.m103844constructorimpl(ResultKt.createFailure(e11));
        }
    }
}
