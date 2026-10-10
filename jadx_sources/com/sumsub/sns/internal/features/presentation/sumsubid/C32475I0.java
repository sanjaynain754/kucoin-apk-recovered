package com.sumsub.sns.internal.features.presentation.sumsubid;

import com.sumsub.sns.core.presentation.base.AbstractC28052C;
import com.sumsub.sns.internal.core.common.AbstractC28476n;
import com.sumsub.sns.internal.features.data.model.sumsubid.C29884y;
import com.sumsub.sns.internal.features.data.repository.sumsubid.C30059h;
import com.sumsub.sns.internal.features.data.repository.sumsubid.InterfaceC30056e;
import com.sumsub.sns.internal.log.C33272c;
import java.util.Map;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.reflect.KProperty;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.sumsubid.I0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32475I0 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f66220a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f66221b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C32487O0 f66222c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C32487O0 f66223d;

    /* JADX INFO: renamed from: e */
    public Throwable f66224e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32475I0(C32487O0 c32487o0, Continuation continuation, C32487O0 c32487o1) {
        super(2, continuation);
        this.f66222c = c32487o0;
        this.f66223d = c32487o1;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C32475I0 c32475i0 = new C32475I0(this.f66222c, continuation, this.f66223d);
        c32475i0.f66221b = obj;
        return c32475i0;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C32475I0) create((InterfaceC41709m0) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0095, code lost:
    
        if (r12 == r1) goto L40;
     */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objM103844constructorimpl;
        Throwable thM103847exceptionOrNullimpl;
        Map map;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f66220a;
        boolean z11 = true;
        try {
            try {
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 == 2) {
                            thM103847exceptionOrNullimpl = this.f66224e;
                            ResultKt.throwOnFailure(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.throwOnFailure(obj);
                    }
                    if (((Boolean) obj).booleanValue()) {
                        C32487O0 c32487o0 = this.f66223d;
                        KProperty[] kPropertyArr = C32487O0.f66261v;
                        AbstractC32493S.m71164a("Throw reload error");
                        AbstractC28052C.throwError$default(c32487o0, AbstractC28476n.m69376a(thM103847exceptionOrNullimpl, C32521f0.f66345a), "SumsubId", false, null, 12, null);
                    }
                    this.f66222c.showProgress(false);
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
                C32487O0 c32487o1 = this.f66223d;
                Result.Companion companion = Result.INSTANCE;
                InterfaceC30056e interfaceC30056e = c32487o1.f66263b;
                this.f66220a = 1;
                obj = ((C30059h) interfaceC30056e).f60399a.f60391a.m70087a(this);
                if (obj == coroutine_suspended) {
                }
                return coroutine_suspended;
                objM103844constructorimpl = Result.m103844constructorimpl((C29884y) obj);
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
            }
            if (Result.m103851isSuccessimpl(objM103844constructorimpl)) {
                C29884y c29884y = (C29884y) objM103844constructorimpl;
                if (c29884y == null || (map = c29884y.f59985b) == null || !(!map.isEmpty())) {
                    z11 = false;
                }
                C32487O0 c32487o2 = this.f66223d;
                KProperty[] kPropertyArr2 = C32487O0.f66261v;
                c32487o2.m71159c(z11);
            }
            thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
            if (thM103847exceptionOrNullimpl != null) {
                C33272c.f67816e.f67810a.mo68956e("SnsId", "reload documents failed", thM103847exceptionOrNullimpl);
                C32487O0 c32487o3 = this.f66223d;
                this.f66221b = objM103844constructorimpl;
                this.f66224e = thM103847exceptionOrNullimpl;
                this.f66220a = 2;
                KProperty[] kPropertyArr3 = C32487O0.f66261v;
                obj = c32487o3.m71154a(thM103847exceptionOrNullimpl, this);
            }
            this.f66222c.showProgress(false);
            return Unit.INSTANCE;
        } catch (Throwable th3) {
            this.f66222c.showProgress(false);
            throw th3;
        }
    }
}
