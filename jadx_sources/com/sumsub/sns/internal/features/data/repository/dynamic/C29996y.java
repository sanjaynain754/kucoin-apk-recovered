package com.sumsub.sns.internal.features.data.repository.dynamic;

import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.repository.dynamic.y */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C29996y extends SuspendLambda implements Function1 {

    /* JADX INFO: renamed from: a */
    public AbstractC29971N f60278a;

    /* JADX INFO: renamed from: b */
    public int f60279b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C29967J f60280c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ boolean f60281d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29996y(C29967J c29967j, boolean z11, Continuation continuation) {
        super(1, continuation);
        this.f60280c = c29967j;
        this.f60281d = z11;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new C29996y(this.f60280c, this.f60281d, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new C29996y(this.f60280c, this.f60281d, (Continuation) obj).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f60279b;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    AbstractC29971N abstractC29971N = this.f60278a;
                    ResultKt.throwOnFailure(obj);
                    return abstractC29971N;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        } else {
            ResultKt.throwOnFailure(obj);
            C29978g c29978g = this.f60280c.f60203k;
            boolean z11 = this.f60281d;
            this.f60279b = 1;
            obj = c29978g.m70056a(z11, this);
            if (obj != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        AbstractC29971N abstractC29971N2 = (AbstractC29971N) obj;
        if (this.f60281d) {
            C29978g c29978g2 = this.f60280c.f60204l;
            this.f60278a = abstractC29971N2;
            this.f60279b = 2;
            if (c29978g2.m70056a(true, (ContinuationImpl) this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return abstractC29971N2;
    }
}
