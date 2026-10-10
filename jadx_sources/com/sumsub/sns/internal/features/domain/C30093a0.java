package com.sumsub.sns.internal.features.domain;

import com.sumsub.sns.internal.core.domain.base.AbstractC28543c;
import com.sumsub.sns.internal.features.data.repository.applicant.C29950z;
import com.sumsub.sns.internal.features.data.repository.applicant.InterfaceC29921d;
import com.sumsub.sns.internal.features.data.repository.common.InterfaceC29953a;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.a0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30093a0 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC29953a f60486a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC29921d f60487b;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m70110a(String str, ContinuationImpl continuationImpl) {
        C30091Z c30091z;
        if (continuationImpl instanceof C30091Z) {
            c30091z = (C30091Z) continuationImpl;
            int i11 = c30091z.f60482c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c30091z.f60482c = i11 - Integer.MIN_VALUE;
            } else {
                c30091z = new C30091Z(this, continuationImpl);
            }
        } else {
            c30091z = new C30091Z(this, continuationImpl);
        }
        Object obj = c30091z.f60480a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c30091z.f60482c;
        try {
            if (i12 == 0) {
                ResultKt.throwOnFailure(obj);
                InterfaceC29921d interfaceC29921d = this.f60487b;
                c30091z.f60482c = 1;
                if (((C29950z) interfaceC29921d).m70020b(str, c30091z) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            Result.Companion companion = Result.INSTANCE;
            return Result.m103844constructorimpl(Unit.INSTANCE);
        } catch (Exception e11) {
            Result.Companion companion2 = Result.INSTANCE;
            return Result.m103844constructorimpl(ResultKt.createFailure(AbstractC28543c.m69413a(this.f60486a, e11)));
        }
    }

    public C30093a0(InterfaceC29953a interfaceC29953a, InterfaceC29921d interfaceC29921d) {
        this.f60486a = interfaceC29953a;
        this.f60487b = interfaceC29921d;
    }
}
