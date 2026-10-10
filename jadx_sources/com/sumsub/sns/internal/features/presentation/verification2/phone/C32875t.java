package com.sumsub.sns.internal.features.presentation.verification2.phone;

import com.sumsub.sns.core.presentation.base.AbstractC28052C;
import com.sumsub.sns.core.presentation.base.C28075O;
import com.sumsub.sns.internal.features.data.model.common.AbstractC29172p;
import com.sumsub.sns.internal.features.data.model.common.C29062V;
import com.sumsub.sns.internal.features.data.model.common.C29070X;
import com.sumsub.sns.internal.features.data.model.common.C29107e0;
import com.sumsub.sns.internal.features.data.model.common.C29154m;
import com.sumsub.sns.internal.features.domain.C30156e;
import com.sumsub.sns.internal.features.domain.C30270n;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.verification2.phone.t */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32875t extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f67265a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C32847F f67266b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32875t(C32847F c32847f, Continuation continuation) {
        super(2, continuation);
        this.f67266b = c32847f;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C32875t(this.f67266b, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C32875t(this.f67266b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0055  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0060, code lost:
    
        if (r13 == r0) goto L24;
     */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        AbstractC29172p abstractC29172p;
        boolean zM69789c;
        Object objM70120a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f67265a;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    ResultKt.throwOnFailure(obj);
                    objM70120a = ((Result) obj).getValue();
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
            }
            C32847F c32847f = this.f67266b;
            Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM70120a);
            if (thM103847exceptionOrNullimpl == null) {
                this.f67266b.f67208d.setValue((C30270n) objM70120a);
                return Unit.INSTANCE;
            }
            AbstractC28052C.throwError$default(c32847f, new C29107e0(thM103847exceptionOrNullimpl, null, null, 6), "PHONE_VERIFICATION", false, null, 12, null);
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        C32847F c32847f2 = this.f67266b;
        this.f67265a = 1;
        int i12 = C32847F.f67204V;
        obj = c32847f2.getData(this);
        if (obj != coroutine_suspended) {
        }
        return coroutine_suspended;
        C28075O c28075o = (C28075O) obj;
        if (c28075o != null) {
            abstractC29172p = c28075o.f57269a;
        } else {
            abstractC29172p = null;
        }
        if (abstractC29172p != null) {
            C29070X.Companion.getClass();
            C29154m c29154mM69794a = abstractC29172p.m69794a(C29062V.m69739a("PHONE_VERIFICATION"));
            if (c29154mM69794a != null) {
                zM69789c = c29154mM69794a.m69789c();
            } else {
                zM69789c = false;
            }
        } else {
            zM69789c = false;
        }
        C30156e c30156e = this.f67266b.f67206b;
        this.f67265a = 2;
        objM70120a = c30156e.m70120a(zM69789c, this);
    }
}
