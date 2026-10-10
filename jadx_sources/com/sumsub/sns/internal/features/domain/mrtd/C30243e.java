package com.sumsub.sns.internal.features.domain.mrtd;

import com.sumsub.log.logger.Logger;
import com.sumsub.sns.internal.core.common.AbstractC28489r0;
import com.sumsub.sns.internal.core.domain.C28578h;
import com.sumsub.sns.internal.features.data.model.common.AbstractC29172p;
import com.sumsub.sns.internal.features.data.model.common.C29154m;
import com.sumsub.sns.internal.features.data.model.common.Document;
import com.sumsub.sns.internal.features.data.model.common.MRTDError;
import com.sumsub.sns.internal.features.data.repository.dynamic.AbstractC29971N;
import com.sumsub.sns.internal.features.data.repository.dynamic.C29967J;
import com.sumsub.sns.internal.features.data.repository.dynamic.InterfaceC29984m;
import com.sumsub.sns.internal.log.C33272c;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.mrtd.e */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30243e {

    /* JADX INFO: renamed from: a */
    public final InterfaceC29984m f60789a;

    /* JADX INFO: renamed from: b */
    public final C30253j f60790b;

    /* JADX INFO: renamed from: c */
    public final C30234G f60791c;

    public C30243e(C28578h c28578h) {
        InterfaceC29984m interfaceC29984m = (InterfaceC29984m) c28578h.f58180r.getValue();
        C30253j c30253j = new C30253j(c28578h);
        C30234G c30234g = new C30234G(c28578h);
        this.f60789a = interfaceC29984m;
        this.f60790b = c30253j;
        this.f60791c = c30234g;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0096 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:30:0x0097  */
    /* JADX WARN: Code duplicated, block: B:33:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:50:0x011b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x011d  */
    /* JADX WARN: Code duplicated, block: B:53:0x0120  */
    /* JADX WARN: Code duplicated, block: B:55:0x0126  */
    /* JADX WARN: Code duplicated, block: B:57:0x012c  */
    /* JADX WARN: Code duplicated, block: B:59:0x0132  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX INFO: renamed from: a */
    public final Object m70153a(Document document, String str, ContinuationImpl continuationImpl) {
        C30241d c30241d;
        MRTDError mRTDError;
        MRTDError mRTDError2;
        Document document2;
        MRTDError mRTDError3;
        String str2;
        Object objM70151a;
        MRTDError mRTDError4;
        Throwable thM103847exceptionOrNullimpl;
        int i11;
        if (continuationImpl instanceof C30241d) {
            c30241d = (C30241d) continuationImpl;
            int i12 = c30241d.f60787f;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                c30241d.f60787f = i12 - Integer.MIN_VALUE;
            } else {
                c30241d = new C30241d(this, continuationImpl);
            }
        } else {
            c30241d = new C30241d(this, continuationImpl);
        }
        C30241d c30241d2 = c30241d;
        Object objM70042a = c30241d2.f60785d;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i13 = c30241d2.f60787f;
        if (i13 != 0) {
            if (i13 == 1) {
                MRTDError mRTDError5 = c30241d2.f60784c;
                String str3 = c30241d2.f60783b;
                Document document3 = (Document) c30241d2.f60782a;
                ResultKt.throwOnFailure(objM70042a);
                mRTDError3 = mRTDError5;
                str2 = str3;
                document2 = document3;
            } else {
                if (i13 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                mRTDError4 = (MRTDError) c30241d2.f60782a;
                ResultKt.throwOnFailure(objM70042a);
                objM70151a = ((Result) objM70042a).getValue();
            }
            thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM70151a);
            i11 = AbstractC30239c.f60780a[mRTDError4.ordinal()];
            if (i11 != 1) {
                return new C30228A(thM103847exceptionOrNullimpl);
            }
            if (i11 != 2) {
                return i11 != 3 ? new C30230C(thM103847exceptionOrNullimpl) : new C30229B(thM103847exceptionOrNullimpl);
            }
            return new C30269z(thM103847exceptionOrNullimpl);
        }
        ResultKt.throwOnFailure(objM70042a);
        C30253j c30253j = this.f60790b;
        if (!((Boolean) c30253j.f60822c.getValue()).booleanValue()) {
            mRTDError2 = MRTDError.ModuleNotFound;
        } else {
            if (C30253j.m70159a((AbstractC28489r0) c30253j.f60820a.invoke())) {
                if (((Boolean) c30253j.f60823d.getValue()).booleanValue()) {
                    mRTDError = null;
                } else {
                    mRTDError2 = MRTDError.ModuleMisconfigured;
                }
                if (mRTDError == null) {
                    return null;
                }
                InterfaceC29984m interfaceC29984m = this.f60789a;
                document2 = document;
                c30241d2.f60782a = document2;
                c30241d2.f60783b = str;
                c30241d2.f60784c = mRTDError;
                c30241d2.f60787f = 1;
                objM70042a = ((C29967J) interfaceC29984m).m70042a(false, (Continuation) c30241d2);
                if (objM70042a != coroutine_suspended) {
                    mRTDError3 = mRTDError;
                    str2 = str;
                }
                return coroutine_suspended;
            }
            mRTDError2 = MRTDError.HardwareUnavailable;
        }
        mRTDError = mRTDError2;
        if (mRTDError == null) {
            return null;
        }
        InterfaceC29984m interfaceC29984m2 = this.f60789a;
        document2 = document;
        c30241d2.f60782a = document2;
        c30241d2.f60783b = str;
        c30241d2.f60784c = mRTDError;
        c30241d2.f60787f = 1;
        objM70042a = ((C29967J) interfaceC29984m2).m70042a(false, (Continuation) c30241d2);
        if (objM70042a != coroutine_suspended) {
            mRTDError3 = mRTDError;
            str2 = str;
        }
        return coroutine_suspended;
        AbstractC29172p abstractC29172p = (AbstractC29172p) ((AbstractC29971N) objM70042a).m70051c();
        C29154m c29154mM69794a = abstractC29172p != null ? abstractC29172p.m69794a(document2.getType()) : null;
        if (c29154mM69794a != null) {
            String str4 = c29154mM69794a.f59145n;
            if (str4 != null ? StringsKt.equals(str4, "required", true) : false) {
                Logger.DefaultImpls.d$default(C33272c.f67812a, "SumSubNfc", "NFC required but unavailable, docType=" + document2.getType(), null, 4, null);
                C30234G c30234g = this.f60791c;
                c30241d2.f60782a = mRTDError3;
                c30241d2.f60783b = null;
                c30241d2.f60784c = null;
                c30241d2.f60787f = 2;
                objM70151a = c30234g.m70151a(str2, null, null, mRTDError3, c30241d2);
                if (objM70151a != coroutine_suspended) {
                    mRTDError4 = mRTDError3;
                    thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM70151a);
                    i11 = AbstractC30239c.f60780a[mRTDError4.ordinal()];
                    if (i11 != 1) {
                        return new C30228A(thM103847exceptionOrNullimpl);
                    }
                    if (i11 != 2) {
                        if (i11 != 3) {
                        }
                    }
                    return new C30269z(thM103847exceptionOrNullimpl);
                }
                return coroutine_suspended;
            }
        }
        return null;
    }
}
