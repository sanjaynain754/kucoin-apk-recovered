package com.sumsub.sns.internal.features.domain;

import com.sumsub.sns.internal.features.data.model.common.remote.response.C29570k0;
import com.sumsub.sns.internal.features.data.repository.applicant.C29950z;
import com.sumsub.sns.internal.features.data.repository.applicant.InterfaceC29921d;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.b */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30101b {

    /* JADX INFO: renamed from: a */
    public final InterfaceC29921d f60516a;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m70112a(String str, String str2, ContinuationImpl continuationImpl) {
        C30092a c30092a;
        if (continuationImpl instanceof C30092a) {
            c30092a = (C30092a) continuationImpl;
            int i11 = c30092a.f60485c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c30092a.f60485c = i11 - Integer.MIN_VALUE;
            } else {
                c30092a = new C30092a(this, continuationImpl);
            }
        } else {
            c30092a = new C30092a(this, continuationImpl);
        }
        Object objM70015a = c30092a.f60483a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c30092a.f60485c;
        try {
            if (i12 == 0) {
                ResultKt.throwOnFailure(objM70015a);
                InterfaceC29921d interfaceC29921d = this.f60516a;
                c30092a.f60485c = 1;
                objM70015a = ((C29950z) interfaceC29921d).m70015a(str, str2, c30092a);
                if (objM70015a == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objM70015a);
            }
            return Result.m103844constructorimpl((C29570k0) objM70015a);
        } catch (Exception e11) {
            Result.Companion companion = Result.INSTANCE;
            return Result.m103844constructorimpl(ResultKt.createFailure(e11));
        }
    }

    public C30101b(InterfaceC29921d interfaceC29921d) {
        this.f60516a = interfaceC29921d;
    }
}
