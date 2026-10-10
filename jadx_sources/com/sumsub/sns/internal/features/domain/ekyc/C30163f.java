package com.sumsub.sns.internal.features.domain.ekyc;

import com.sumsub.sns.internal.features.data.model.common.AbstractC29172p;
import com.sumsub.sns.internal.features.data.model.common.remote.C29203D0;
import com.sumsub.sns.internal.features.data.model.common.remote.C29276S;
import com.sumsub.sns.internal.features.data.model.common.remote.C29412m;
import com.sumsub.sns.internal.features.data.model.common.remote.C29683z0;
import com.sumsub.sns.internal.features.data.model.common.remote.response.C29456A0;
import com.sumsub.sns.internal.features.data.repository.applicant.C29914J;
import com.sumsub.sns.internal.features.data.repository.applicant.C29917M;
import com.sumsub.sns.internal.features.data.repository.dynamic.C29967J;
import com.sumsub.sns.internal.features.data.repository.dynamic.InterfaceC29984m;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.ekyc.f */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30163f {

    /* JADX INFO: renamed from: a */
    public final String f60611a;

    /* JADX INFO: renamed from: b */
    public final C29917M f60612b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC29984m f60613c;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0077, code lost:
    
        if (r9 == r1) goto L29;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m70125a(String str, ContinuationImpl continuationImpl) {
        C30162e c30162e;
        if (continuationImpl instanceof C30162e) {
            c30162e = (C30162e) continuationImpl;
            int i11 = c30162e.f60610d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c30162e.f60610d = i11 - Integer.MIN_VALUE;
            } else {
                c30162e = new C30162e(this, continuationImpl);
            }
        } else {
            c30162e = new C30162e(this, continuationImpl);
        }
        Object objM70043a = c30162e.f60608b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c30162e.f60610d;
        try {
            if (i12 != 0) {
                if (i12 == 1) {
                    str = c30162e.f60607a;
                    ResultKt.throwOnFailure(objM70043a);
                } else {
                    if (i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(objM70043a);
                }
                return Result.m103844constructorimpl((C29456A0) objM70043a);
            }
            ResultKt.throwOnFailure(objM70043a);
            if (this.f60611a == null) {
                throw new IllegalStateException("Cannot report eid error as confirmation id is null");
            }
            InterfaceC29984m interfaceC29984m = this.f60613c;
            c30162e.f60607a = str;
            c30162e.f60610d = 1;
            objM70043a = ((C29967J) interfaceC29984m).m70043a(false, (ContinuationImpl) c30162e);
            if (objM70043a == coroutine_suspended) {
            }
            return coroutine_suspended;
            String strMo69754e = ((AbstractC29172p) objM70043a).mo69754e();
            C29412m c29412m = new C29412m((C29203D0) null, (C29683z0) null, new C29276S((String) null, str, 1), 3);
            C29917M c29917m = this.f60612b;
            String str2 = this.f60611a;
            c30162e.f60607a = null;
            c30162e.f60610d = 2;
            objM70043a = ((C29914J) c29917m.f60057a).f60051a.m69975a(strMo69754e, str2, c29412m, c30162e);
        } catch (Exception e11) {
            Result.Companion companion = Result.INSTANCE;
            return Result.m103844constructorimpl(ResultKt.createFailure(e11));
        }
    }

    public C30163f(String str, C29917M c29917m, InterfaceC29984m interfaceC29984m) {
        this.f60611a = str;
        this.f60612b = c29917m;
        this.f60613c = interfaceC29984m;
    }
}
