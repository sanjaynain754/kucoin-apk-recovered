package com.sumsub.sns.internal.features.presentation.esign;

import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.esign.d0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30978d0 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public C31014x f62594a;

    /* JADX INFO: renamed from: b */
    public C30998o f62595b;

    /* JADX INFO: renamed from: c */
    public int f62596c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f62597d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C30997n0 f62598e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30978d0(C30997n0 c30997n0, Continuation continuation) {
        super(2, continuation);
        this.f62598e = c30997n0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C30978d0 c30978d0 = new C30978d0(this.f62598e, continuation);
        c30978d0.f62597d = obj;
        return c30978d0;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C30978d0 c30978d0 = new C30978d0(this.f62598e, (Continuation) obj2);
        c30978d0.f62597d = (C31014x) obj;
        return c30978d0.invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C31014x c31014x;
        AbstractC31000p c30998o;
        C30998o c30998o2;
        C30998o c30998o3;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f62596c;
        if (i11 != 0) {
            if (i11 == 1) {
                c30998o3 = this.f62595b;
                c31014x = this.f62594a;
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            c31014x = (C31014x) this.f62597d;
            c30998o = c31014x.f62678a;
            if (c30998o instanceof C30998o) {
                c30998o2 = (C30998o) c30998o;
            } else {
                c30998o2 = null;
            }
            if (c30998o2 != null) {
                C30997n0 c30997n0 = this.f62598e;
                this.f62597d = c31014x;
                this.f62594a = c31014x;
                this.f62595b = c30998o2;
                this.f62596c = 1;
                obj = c30997n0.getString("sns_esign_documents_hint_downloading", this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                c30998o3 = c30998o2;
            }
            return C31014x.m70560a(c31014x, c30998o, false, null, false, 30);
        }
        C30996n c30996n = new C30996n((String) obj, null, true, null);
        c30998o3.getClass();
        c30998o = new C30998o(c30996n);
        return C31014x.m70560a(c31014x, c30998o, false, null, false, 30);
    }
}
