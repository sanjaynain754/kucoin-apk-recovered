package com.sumsub.sns.internal.features.domain;

import com.sumsub.sns.internal.features.data.model.common.AbstractC29172p;
import com.sumsub.sns.internal.features.data.model.common.C29082a;
import com.sumsub.sns.internal.features.data.model.common.remote.C29218G0;
import com.sumsub.sns.internal.features.data.repository.applicant.C29917M;
import com.sumsub.sns.internal.features.data.repository.dynamic.C29967J;
import com.sumsub.sns.internal.features.data.repository.dynamic.InterfaceC29984m;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.c0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30104c0 {

    /* JADX INFO: renamed from: a */
    public final C29917M f60526a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC29984m f60527b;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007e, code lost:
    
        if ((r7 ? ((com.sumsub.sns.internal.features.data.repository.applicant.C29914J) r6.f60057a).f60051a.m69964a(r2, r0) : ((com.sumsub.sns.internal.features.data.repository.applicant.C29914J) r6.f60057a).f60051a.m69981b(r2, r0)) == r1) goto L31;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m70113a(C29218G0 c29218g0, ContinuationImpl continuationImpl) {
        C30102b0 c30102b0;
        C29218G0 c29218g1;
        C30104c0 c30104c0;
        if (continuationImpl instanceof C30102b0) {
            c30102b0 = (C30102b0) continuationImpl;
            int i11 = c30102b0.f60521e;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c30102b0.f60521e = i11 - Integer.MIN_VALUE;
            } else {
                c30102b0 = new C30102b0(this, continuationImpl);
            }
        } else {
            c30102b0 = new C30102b0(this, continuationImpl);
        }
        Object objM70043a = c30102b0.f60519c;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c30102b0.f60521e;
        try {
            if (i12 != 0) {
                if (i12 == 1) {
                    c30104c0 = c30102b0.f60518b;
                    c29218g1 = c30102b0.f60517a;
                    ResultKt.throwOnFailure(objM70043a);
                } else {
                    if (i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(objM70043a);
                }
                return Result.m103844constructorimpl(Unit.INSTANCE);
            }
            ResultKt.throwOnFailure(objM70043a);
            Result.Companion companion = Result.INSTANCE;
            InterfaceC29984m interfaceC29984m = this.f60527b;
            c30102b0.f60517a = c29218g0;
            c30102b0.f60518b = this;
            c30102b0.f60521e = 1;
            objM70043a = ((C29967J) interfaceC29984m).m70043a(false, (ContinuationImpl) c30102b0);
            if (objM70043a != coroutine_suspended) {
                c29218g1 = c29218g0;
                c30104c0 = this;
            }
            return coroutine_suspended;
            AbstractC29172p abstractC29172p = (AbstractC29172p) objM70043a;
            C29917M c29917m = c30104c0.f60526a;
            abstractC29172p.getClass();
            boolean z11 = abstractC29172p instanceof C29082a;
            c30102b0.f60517a = null;
            c30102b0.f60518b = null;
            c30102b0.f60521e = 2;
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            return Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
    }

    public C30104c0(C29917M c29917m, InterfaceC29984m interfaceC29984m) {
        this.f60526a = c29917m;
        this.f60527b = interfaceC29984m;
    }
}
