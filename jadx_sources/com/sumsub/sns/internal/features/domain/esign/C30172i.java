package com.sumsub.sns.internal.features.domain.esign;

import com.sumsub.sns.internal.features.data.model.esign.C29742N;
import com.sumsub.sns.internal.features.data.model.esign.C29752Y;
import com.sumsub.sns.internal.features.data.repository.applicant.C29950z;
import com.sumsub.sns.internal.features.data.repository.applicant.InterfaceC29921d;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.esign.i */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30172i {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m70129a(InterfaceC29921d interfaceC29921d, C29742N c29742n, ContinuationImpl continuationImpl) {
        C30171h c30171h;
        if (continuationImpl instanceof C30171h) {
            c30171h = (C30171h) continuationImpl;
            int i11 = c30171h.f60631c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c30171h.f60631c = i11 - Integer.MIN_VALUE;
            } else {
                c30171h = new C30171h(this, continuationImpl);
            }
        } else {
            c30171h = new C30171h(this, continuationImpl);
        }
        Object objM70013a = c30171h.f60629a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c30171h.f60631c;
        try {
            if (i12 == 0) {
                ResultKt.throwOnFailure(objM70013a);
                c30171h.f60631c = 1;
                objM70013a = ((C29950z) interfaceC29921d).m70013a(c29742n, c30171h);
                if (objM70013a == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objM70013a);
            }
            C29752Y c29752y = (C29752Y) objM70013a;
            if (c29752y != null) {
                return Result.m103844constructorimpl(c29752y);
            }
            Result.Companion companion = Result.INSTANCE;
            return Result.m103844constructorimpl(ResultKt.createFailure(new Exception("Response null")));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            return Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
    }
}
