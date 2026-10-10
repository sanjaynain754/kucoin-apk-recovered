package com.sumsub.sns.internal.features.domain.videoident;

import com.sumsub.sns.internal.core.domain.base.AbstractC28543c;
import com.sumsub.sns.internal.features.data.repository.applicant.C29914J;
import com.sumsub.sns.internal.features.data.repository.applicant.C29917M;
import com.sumsub.sns.internal.features.data.repository.common.InterfaceC29953a;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.videoident.h */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30327h {

    /* JADX INFO: renamed from: a */
    public final InterfaceC29953a f60981a;

    /* JADX INFO: renamed from: b */
    public final C29917M f60982b;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m70189a(ContinuationImpl continuationImpl) {
        C30326g c30326g;
        if (continuationImpl instanceof C30326g) {
            c30326g = (C30326g) continuationImpl;
            int i11 = c30326g.f60980c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c30326g.f60980c = i11 - Integer.MIN_VALUE;
            } else {
                c30326g = new C30326g(this, continuationImpl);
            }
        } else {
            c30326g = new C30326g(this, continuationImpl);
        }
        Object objM69992d = c30326g.f60978a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c30326g.f60980c;
        try {
            if (i12 == 0) {
                ResultKt.throwOnFailure(objM69992d);
                Result.Companion companion = Result.INSTANCE;
                C29917M c29917m = this.f60982b;
                c30326g.f60980c = 1;
                objM69992d = ((C29914J) c29917m.f60057a).f60051a.m69992d(c30326g);
                if (objM69992d == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objM69992d);
            }
            return Result.m103844constructorimpl(objM69992d);
        } catch (Exception e11) {
            Result.Companion companion2 = Result.INSTANCE;
            return Result.m103844constructorimpl(ResultKt.createFailure(AbstractC28543c.m69413a(this.f60981a, e11)));
        }
    }

    public C30327h(C29917M c29917m, InterfaceC29953a interfaceC29953a) {
        this.f60981a = interfaceC29953a;
        this.f60982b = c29917m;
    }
}
