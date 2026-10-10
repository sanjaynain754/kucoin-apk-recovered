package com.sumsub.sns.internal.features.domain.videoident;

import com.sumsub.sns.internal.core.domain.base.AbstractC28543c;
import com.sumsub.sns.internal.features.data.repository.applicant.C29914J;
import com.sumsub.sns.internal.features.data.repository.applicant.C29917M;
import com.sumsub.sns.internal.features.data.repository.common.InterfaceC29953a;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.videoident.b */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30321b {

    /* JADX INFO: renamed from: a */
    public final InterfaceC29953a f60954a;

    /* JADX INFO: renamed from: b */
    public final C29917M f60955b;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m70186a(ContinuationImpl continuationImpl) {
        C30320a c30320a;
        if (continuationImpl instanceof C30320a) {
            c30320a = (C30320a) continuationImpl;
            int i11 = c30320a.f60953c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c30320a.f60953c = i11 - Integer.MIN_VALUE;
            } else {
                c30320a = new C30320a(this, continuationImpl);
            }
        } else {
            c30320a = new C30320a(this, continuationImpl);
        }
        Object objM69958a = c30320a.f60951a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c30320a.f60953c;
        try {
            if (i12 == 0) {
                ResultKt.throwOnFailure(objM69958a);
                Result.Companion companion = Result.INSTANCE;
                C29917M c29917m = this.f60955b;
                c30320a.f60953c = 1;
                objM69958a = ((C29914J) c29917m.f60057a).m69958a(c30320a);
                if (objM69958a == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objM69958a);
            }
            return Result.m103844constructorimpl(objM69958a);
        } catch (Exception e11) {
            Result.Companion companion2 = Result.INSTANCE;
            return Result.m103844constructorimpl(ResultKt.createFailure(AbstractC28543c.m69413a(this.f60954a, e11)));
        }
    }

    public C30321b(C29917M c29917m, InterfaceC29953a interfaceC29953a) {
        this.f60954a = interfaceC29953a;
        this.f60955b = c29917m;
    }
}
