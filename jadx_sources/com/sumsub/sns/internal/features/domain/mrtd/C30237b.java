package com.sumsub.sns.internal.features.domain.mrtd;

import com.sumsub.sns.internal.core.common.AbstractC28489r0;
import com.sumsub.sns.internal.core.domain.C28578h;
import com.sumsub.sns.internal.features.data.model.common.AbstractC28978A2;
import com.sumsub.sns.internal.features.data.model.common.MRTDError;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.mrtd.b */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30237b {

    /* JADX INFO: renamed from: a */
    public final C30253j f60777a;

    /* JADX INFO: renamed from: b */
    public final C30234G f60778b;

    public C30237b(C28578h c28578h) {
        C30253j c30253j = new C30253j(c28578h);
        C30234G c30234g = new C30234G(c28578h);
        this.f60777a = c30253j;
        this.f60778b = c30234g;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: a */
    public final Object m70152a(AbstractC28978A2 abstractC28978A2, ContinuationImpl continuationImpl) {
        C30235a c30235a;
        MRTDError mRTDError;
        if (continuationImpl instanceof C30235a) {
            c30235a = (C30235a) continuationImpl;
            int i11 = c30235a.f60776c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c30235a.f60776c = i11 - Integer.MIN_VALUE;
            } else {
                c30235a = new C30235a(this, continuationImpl);
            }
        } else {
            c30235a = new C30235a(this, continuationImpl);
        }
        C30235a c30235a2 = c30235a;
        Object obj = c30235a2.f60774a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c30235a2.f60776c;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            C30253j c30253j = this.f60777a;
            if (!((Boolean) c30253j.f60822c.getValue()).booleanValue()) {
                mRTDError = MRTDError.ModuleNotFound;
            } else if (C30253j.m70159a((AbstractC28489r0) c30253j.f60820a.invoke())) {
                mRTDError = !((Boolean) c30253j.f60823d.getValue()).booleanValue() ? MRTDError.ModuleMisconfigured : null;
            } else {
                mRTDError = MRTDError.HardwareUnavailable;
            }
            MRTDError mRTDError2 = mRTDError;
            if (mRTDError2 == null) {
                return Boxing.boxBoolean(false);
            }
            C30234G c30234g = this.f60778b;
            String strMo69722g = abstractC28978A2.mo69722g();
            String strMo69718c = abstractC28978A2.mo69718c();
            String strMo69721f = abstractC28978A2.mo69721f();
            c30235a2.f60776c = 1;
            if (c30234g.m70151a(strMo69722g, strMo69718c, strMo69721f, mRTDError2, c30235a2) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            ((Result) obj).getValue();
        }
        return Boxing.boxBoolean(true);
    }
}
