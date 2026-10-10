package com.sumsub.sns.internal.features.domain;

import com.sumsub.sns.internal.core.domain.C28578h;
import com.sumsub.sns.internal.features.data.model.common.AbstractC29172p;
import com.sumsub.sns.internal.features.data.model.common.C29134i3;
import com.sumsub.sns.internal.features.data.model.common.remote.response.C29550g0;
import com.sumsub.sns.internal.features.data.repository.applicant.C29914J;
import com.sumsub.sns.internal.features.data.repository.applicant.C29917M;
import com.sumsub.sns.internal.features.data.repository.dynamic.C29967J;
import com.sumsub.sns.internal.features.data.repository.dynamic.InterfaceC29984m;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.U */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30086U {

    /* JADX INFO: renamed from: a */
    public final C29917M f60468a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC29984m f60469b;

    public C30086U(C28578h c28578h) {
        C29917M c29917m = (C29917M) c28578h.f58172j.getValue();
        InterfaceC29984m interfaceC29984m = (InterfaceC29984m) c28578h.f58180r.getValue();
        this.f60468a = c29917m;
        this.f60469b = interfaceC29984m;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m70107a(String str, ContinuationImpl continuationImpl) {
        C30085T c30085t;
        AbstractC29172p abstractC29172p;
        String str2;
        String str3;
        if (continuationImpl instanceof C30085T) {
            c30085t = (C30085T) continuationImpl;
            int i11 = c30085t.f60467f;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c30085t.f60467f = i11 - Integer.MIN_VALUE;
            } else {
                c30085t = new C30085T(this, continuationImpl);
            }
        } else {
            c30085t = new C30085T(this, continuationImpl);
        }
        Object objM70043a = c30085t.f60465d;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c30085t.f60467f;
        try {
            if (i12 == 0) {
                ResultKt.throwOnFailure(objM70043a);
                InterfaceC29984m interfaceC29984m = this.f60469b;
                c30085t.f60462a = str;
                c30085t.f60467f = 1;
                objM70043a = ((C29967J) interfaceC29984m).m70043a(false, (ContinuationImpl) c30085t);
                if (objM70043a == coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i12 == 1) {
                str = c30085t.f60462a;
                ResultKt.throwOnFailure(objM70043a);
            } else {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str3 = c30085t.f60464c;
                abstractC29172p = c30085t.f60463b;
                str2 = c30085t.f60462a;
                ResultKt.throwOnFailure(objM70043a);
            }
            Result.Companion companion = Result.INSTANCE;
            return Result.m103844constructorimpl(new C30084S(str2, (C29550g0) objM70043a, new C29134i3(str3, abstractC29172p.mo69758i())));
            AbstractC29172p abstractC29172p2 = (AbstractC29172p) objM70043a;
            String strMo69754e = abstractC29172p2.mo69754e();
            C29917M c29917m = this.f60468a;
            c30085t.f60462a = str;
            c30085t.f60463b = abstractC29172p2;
            c30085t.f60464c = strMo69754e;
            c30085t.f60467f = 2;
            Object objM69985b = ((C29914J) c29917m.f60057a).f60051a.m69985b(str, c30085t);
            if (objM69985b != coroutine_suspended) {
                abstractC29172p = abstractC29172p2;
                objM70043a = objM69985b;
                str2 = str;
                str3 = strMo69754e;
                Result.Companion companion2 = Result.INSTANCE;
                return Result.m103844constructorimpl(new C30084S(str2, (C29550g0) objM70043a, new C29134i3(str3, abstractC29172p.mo69758i())));
            }
            return coroutine_suspended;
        } catch (Exception e11) {
            Result.Companion companion3 = Result.INSTANCE;
            return Result.m103844constructorimpl(ResultKt.createFailure(e11));
        }
    }
}
