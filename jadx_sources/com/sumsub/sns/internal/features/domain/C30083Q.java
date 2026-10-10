package com.sumsub.sns.internal.features.domain;

import com.sumsub.sns.internal.features.data.model.common.remote.C29429o1;
import com.sumsub.sns.internal.features.data.model.common.remote.response.C29570k0;
import com.sumsub.sns.internal.features.data.repository.applicant.C29950z;
import com.sumsub.sns.internal.features.data.repository.applicant.InterfaceC29921d;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.Q */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30083Q {

    /* JADX INFO: renamed from: a */
    public final InterfaceC29921d f60458a;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m70106a(String str, String str2, ContinuationImpl continuationImpl) {
        C30082P c30082p;
        if (continuationImpl instanceof C30082P) {
            c30082p = (C30082P) continuationImpl;
            int i11 = c30082p.f60457c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c30082p.f60457c = i11 - Integer.MIN_VALUE;
            } else {
                c30082p = new C30082P(this, continuationImpl);
            }
        } else {
            c30082p = new C30082P(this, continuationImpl);
        }
        Object objM70010a = c30082p.f60455a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c30082p.f60457c;
        try {
            if (i12 == 0) {
                ResultKt.throwOnFailure(objM70010a);
                InterfaceC29921d interfaceC29921d = this.f60458a;
                C29429o1 c29429o1 = new C29429o1("applicant", str, str2);
                c30082p.f60457c = 1;
                objM70010a = ((C29950z) interfaceC29921d).m70010a(c29429o1, c30082p);
                if (objM70010a == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objM70010a);
            }
            return Result.m103844constructorimpl((C29570k0) objM70010a);
        } catch (Exception e11) {
            Result.Companion companion = Result.INSTANCE;
            return Result.m103844constructorimpl(ResultKt.createFailure(e11));
        }
    }

    public C30083Q(InterfaceC29921d interfaceC29921d) {
        this.f60458a = interfaceC29921d;
    }
}
