package com.sumsub.sns.internal.features.domain.esign;

import com.sumsub.sns.internal.features.data.repository.applicant.InterfaceC29921d;
import java.io.File;
import kotlinx.coroutines.AbstractC41697j0;
import kotlinx.coroutines.C41686h;
import kotlinx.coroutines.C41782z0;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.esign.e */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30168e {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m70127a(File file, InterfaceC29921d interfaceC29921d, int i11, String str, ContinuationImpl continuationImpl) {
        C30166c c30166c;
        if (continuationImpl instanceof C30166c) {
            c30166c = (C30166c) continuationImpl;
            int i12 = c30166c.f60619c;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                c30166c.f60619c = i12 - Integer.MIN_VALUE;
            } else {
                c30166c = new C30166c(this, continuationImpl);
            }
        } else {
            c30166c = new C30166c(this, continuationImpl);
        }
        Object objM91049g = c30166c.f60617a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i13 = c30166c.f60619c;
        try {
            if (i13 == 0) {
                ResultKt.throwOnFailure(objM91049g);
                AbstractC41697j0 abstractC41697j0M91392b = C41782z0.m91392b();
                C30167d c30167d = new C30167d(file, str, interfaceC29921d, i11, null);
                c30166c.f60619c = 1;
                objM91049g = C41686h.m91049g(abstractC41697j0M91392b, c30167d, c30166c);
                if (objM91049g == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objM91049g);
            }
            return ((Result) objM91049g).getValue();
        } catch (Exception e11) {
            Result.Companion companion = Result.INSTANCE;
            return Result.m103844constructorimpl(ResultKt.createFailure(e11));
        }
    }
}
