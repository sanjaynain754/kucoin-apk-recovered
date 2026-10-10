package com.sumsub.sns.internal.features.domain.geo;

import com.sumsub.sns.core.data.model.SNSException;
import com.sumsub.sns.internal.core.domain.base.AbstractC28543c;
import com.sumsub.sns.internal.features.data.model.common.Document;
import com.sumsub.sns.internal.features.data.model.common.remote.C29227I;
import com.sumsub.sns.internal.features.data.repository.applicant.C29914J;
import com.sumsub.sns.internal.features.data.repository.applicant.C29917M;
import com.sumsub.sns.internal.features.data.repository.common.InterfaceC29953a;
import com.sumsub.sns.internal.features.presentation.main.C31292k2;
import kotlinx.coroutines.C41783z1;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.geo.z */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30215z {

    /* JADX INFO: renamed from: a */
    public final Document f60727a;

    /* JADX INFO: renamed from: b */
    public final C29917M f60728b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC29953a f60729c;

    /* JADX INFO: renamed from: d */
    public final C31292k2 f60730d;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m70142a(ContinuationImpl continuationImpl) {
        C30214y c30214y;
        if (continuationImpl instanceof C30214y) {
            c30214y = (C30214y) continuationImpl;
            int i11 = c30214y.f60726c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c30214y.f60726c = i11 - Integer.MIN_VALUE;
            } else {
                c30214y = new C30214y(this, continuationImpl);
            }
        } else {
            c30214y = new C30214y(this, continuationImpl);
        }
        Object objM69989c = c30214y.f60724a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c30214y.f60726c;
        try {
            if (i12 == 0) {
                ResultKt.throwOnFailure(objM69989c);
                C29917M c29917m = this.f60728b;
                c30214y.f60726c = 1;
                objM69989c = ((C29914J) c29917m.f60057a).f60051a.m69989c(c30214y);
                if (objM69989c == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objM69989c);
            }
            Integer num = ((C29227I) objM69989c).f59218a;
            if (num != null && num.intValue() == 1) {
                C31292k2 c31292k2 = this.f60730d;
                c31292k2.f63411a.add(this.f60727a.getType());
                Result.Companion companion = Result.INSTANCE;
                return Result.m103844constructorimpl(Unit.INSTANCE);
            }
            Result.Companion companion2 = Result.INSTANCE;
            return Result.m103844constructorimpl(ResultKt.createFailure(new SNSException.Unknown(null, 1, null)));
        } catch (Exception e11) {
            C41783z1.m91406l(c30214y.getContext());
            Result.Companion companion3 = Result.INSTANCE;
            return Result.m103844constructorimpl(ResultKt.createFailure(AbstractC28543c.m69413a(this.f60729c, e11)));
        }
    }

    public C30215z(Document document, C29917M c29917m, InterfaceC29953a interfaceC29953a, C31292k2 c31292k2) {
        this.f60727a = document;
        this.f60728b = c29917m;
        this.f60729c = interfaceC29953a;
        this.f60730d = c31292k2;
    }
}
