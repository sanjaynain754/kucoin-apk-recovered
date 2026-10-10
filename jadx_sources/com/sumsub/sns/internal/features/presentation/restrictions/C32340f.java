package com.sumsub.sns.internal.features.presentation.restrictions;

import com.sumsub.sns.internal.features.data.model.common.remote.response.C29586o0;
import com.sumsub.sns.internal.features.data.repository.common.C29957e;
import com.sumsub.sns.internal.features.data.repository.common.InterfaceC29953a;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.restrictions.f */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32340f {

    /* JADX INFO: renamed from: a */
    public final InterfaceC29953a f65898a;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m71100a(ContinuationImpl continuationImpl) {
        C32339e c32339e;
        Object objM70037b;
        if (continuationImpl instanceof C32339e) {
            c32339e = (C32339e) continuationImpl;
            int i11 = c32339e.f65897c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c32339e.f65897c = i11 - Integer.MIN_VALUE;
            } else {
                c32339e = new C32339e(this, continuationImpl);
            }
        } else {
            c32339e = new C32339e(this, continuationImpl);
        }
        Object obj = c32339e.f65895a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c32339e.f65897c;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            InterfaceC29953a interfaceC29953a = this.f65898a;
            c32339e.f65897c = 1;
            objM70037b = ((C29957e) interfaceC29953a).m70037b(c32339e);
            if (objM70037b == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            objM70037b = ((Result) obj).getValue();
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM70037b);
        if (thM103847exceptionOrNullimpl != null) {
            return new C32337c(thM103847exceptionOrNullimpl);
        }
        C29586o0 c29586o0 = (C29586o0) objM70037b;
        return c29586o0 == null ? C32334a.f65891a : new C32336b(c29586o0);
    }

    public C32340f(InterfaceC29953a interfaceC29953a) {
        this.f65898a = interfaceC29953a;
    }
}
