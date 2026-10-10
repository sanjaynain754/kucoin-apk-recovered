package com.sumsub.sns.internal.features.presentation.esign;

import com.sumsub.sns.core.presentation.base.AbstractC28073M0;
import com.sumsub.sns.internal.core.presentation.screen.base.C28936t;
import com.sumsub.sns.internal.features.data.model.esign.C29742N;
import com.sumsub.sns.internal.features.data.repository.applicant.InterfaceC29921d;
import com.sumsub.sns.internal.features.domain.esign.C30172i;
import com.sumsub.sns.internal.log.C33272c;
import java.util.Map;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.MapsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.reflect.KProperty;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.esign.V */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30966V extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public Object f62575a;

    /* JADX INFO: renamed from: b */
    public int f62576b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C30997n0 f62577c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30966V(C30997n0 c30997n0, Continuation continuation) {
        super(2, continuation);
        this.f62577c = c30997n0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C30966V(this.f62577c, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C30966V(this.f62577c, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x007b  */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006e, code lost:
    
        if (r1.m70555d((com.sumsub.sns.internal.features.data.model.esign.C29752Y) r10, r9) == r0) goto L17;
     */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objM70129a;
        Object obj2;
        C30997n0 c30997n0;
        Throwable thM103847exceptionOrNullimpl;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f62576b;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    obj2 = this.f62575a;
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                objM70129a = ((Result) obj).getValue();
            }
            c30997n0 = this.f62577c;
            thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(obj2);
            if (thM103847exceptionOrNullimpl != null) {
                KProperty[] kPropertyArr = C30997n0.f62640t;
                AbstractC28073M0.updateState$default(c30997n0, false, new C30962Q(null), 1, null);
                c30997n0.throwError(thM103847exceptionOrNullimpl, c30997n0.getIdDocSetType(), C31004r.f62665a);
            }
            C33272c.f67816e.f67810a.mo68955d("SNSESignViewModel", "provideData: ok=" + Result.m103851isSuccessimpl(obj2), null);
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        C30997n0 c30997n1 = this.f62577c;
        C30172i c30172i = c30997n1.f62645e;
        InterfaceC29921d interfaceC29921d = c30997n1.f62642b;
        C29742N c29742n = new C29742N(MapsKt.toMap(this.f62577c.m70557f()));
        this.f62576b = 1;
        objM70129a = c30172i.m70129a(interfaceC29921d, c29742n, this);
        if (objM70129a != coroutine_suspended) {
        }
        return coroutine_suspended;
        C30997n0 c30997n2 = this.f62577c;
        if (Result.m103851isSuccessimpl(objM70129a)) {
            Map mapEmptyMap = MapsKt.emptyMap();
            KProperty[] kPropertyArr2 = C30997n0.f62640t;
            C28936t c28936t = c30997n2.f62651k;
            KProperty kProperty = C30997n0.f62640t[0];
            c28936t.f58834a.set(c28936t.f58835b, mapEmptyMap);
            this.f62575a = objM70129a;
            this.f62576b = 2;
        }
        obj2 = objM70129a;
        c30997n0 = this.f62577c;
        thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(obj2);
        if (thM103847exceptionOrNullimpl != null) {
            KProperty[] kPropertyArr3 = C30997n0.f62640t;
            AbstractC28073M0.updateState$default(c30997n0, false, new C30962Q(null), 1, null);
            c30997n0.throwError(thM103847exceptionOrNullimpl, c30997n0.getIdDocSetType(), C31004r.f62665a);
        }
        C33272c.f67816e.f67810a.mo68955d("SNSESignViewModel", "provideData: ok=" + Result.m103851isSuccessimpl(obj2), null);
        return Unit.INSTANCE;
    }
}
