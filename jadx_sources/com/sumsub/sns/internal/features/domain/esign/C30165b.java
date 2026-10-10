package com.sumsub.sns.internal.features.domain.esign;

import com.sumsub.sns.core.data.model.SNSGeneralException;
import com.sumsub.sns.internal.features.data.model.esign.C29733E;
import com.sumsub.sns.internal.features.data.model.esign.C29752Y;
import com.sumsub.sns.internal.features.data.repository.applicant.C29950z;
import com.sumsub.sns.internal.features.data.repository.applicant.InterfaceC29921d;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.esign.b */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30165b {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m70126a(InterfaceC29921d interfaceC29921d, C29733E c29733e, ContinuationImpl continuationImpl) {
        C30164a c30164a;
        if (continuationImpl instanceof C30164a) {
            c30164a = (C30164a) continuationImpl;
            int i11 = c30164a.f60616c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c30164a.f60616c = i11 - Integer.MIN_VALUE;
            } else {
                c30164a = new C30164a(this, continuationImpl);
            }
        } else {
            c30164a = new C30164a(this, continuationImpl);
        }
        Object objM70011a = c30164a.f60614a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c30164a.f60616c;
        try {
            if (i12 == 0) {
                ResultKt.throwOnFailure(objM70011a);
                c30164a.f60616c = 1;
                objM70011a = ((C29950z) interfaceC29921d).m70011a(c29733e, c30164a);
                if (objM70011a == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objM70011a);
            }
            C29752Y c29752y = (C29752Y) objM70011a;
            if (c29752y != null) {
                return Result.m103844constructorimpl(c29752y);
            }
            Result.Companion companion = Result.INSTANCE;
            return Result.m103844constructorimpl(ResultKt.createFailure(new SNSGeneralException("Response null", null, null, 6, null)));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            return Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
    }
}
