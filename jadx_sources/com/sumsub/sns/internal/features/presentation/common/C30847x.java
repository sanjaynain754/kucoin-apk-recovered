package com.sumsub.sns.internal.features.presentation.common;

import com.sumsub.sns.internal.features.domain.documents.AbstractC30117K;
import com.sumsub.sns.internal.features.domain.documents.C30116J;
import com.sumsub.sns.internal.features.presentation.utils.C32635M;
import java.util.List;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.common.x */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30847x extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f62297a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f62298b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ AbstractC30808G f62299c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ AbstractC30117K f62300d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ AbstractC30808G f62301e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30847x(AbstractC30808G abstractC30808G, Continuation continuation, AbstractC30117K abstractC30117K, AbstractC30808G abstractC30808G2) {
        super(2, continuation);
        this.f62299c = abstractC30808G;
        this.f62300d = abstractC30117K;
        this.f62301e = abstractC30808G2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C30847x c30847x = new C30847x(this.f62299c, continuation, this.f62300d, this.f62301e);
        c30847x.f62298b = obj;
        return c30847x;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C30847x) create((InterfaceC41709m0) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x006c, code lost:
    
        if (r4.mo70460a((com.sumsub.sns.internal.features.presentation.utils.C32666q) r7, r1) == r0) goto L25;
     */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f62297a;
        try {
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                }
                this.f62299c.showProgress(false);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            AbstractC30117K abstractC30117K = this.f62300d;
            if (((C30116J) abstractC30117K).f60549b != null && ((C30116J) abstractC30117K).f60548a != null) {
                this.f62301e.f62236a.m71238a(((C30116J) abstractC30117K).f60549b.intValue(), ((C30116J) abstractC30117K).f60548a);
            }
            C32635M c32635m = this.f62301e.f62236a;
            this.f62297a = 1;
            obj = C32635M.m71224a(c32635m, (List) null, this, 1);
            if (obj == coroutine_suspended) {
            }
            return coroutine_suspended;
            List listM71250c = this.f62301e.f62236a.m71250c();
            AbstractC30808G abstractC30808G = this.f62301e;
            this.f62297a = 2;
        } catch (Throwable th2) {
            this.f62299c.showProgress(false);
            throw th2;
        }
    }
}
