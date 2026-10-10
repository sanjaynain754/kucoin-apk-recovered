package com.sumsub.sns.internal.features.data.repository.dynamic;

import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.repository.dynamic.v */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C29993v extends SuspendLambda implements Function1 {

    /* JADX INFO: renamed from: a */
    public int f60268a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C29967J f60269b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f60270c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29993v(C29967J c29967j, boolean z11, Continuation continuation) {
        super(1, continuation);
        this.f60269b = c29967j;
        this.f60270c = z11;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new C29993v(this.f60269b, this.f60270c, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new C29993v(this.f60269b, this.f60270c, (Continuation) obj).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f60268a;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        C29978g c29978g = this.f60269b.f60202j;
        boolean z11 = this.f60270c;
        this.f60268a = 1;
        Object objM70056a = c29978g.m70056a(z11, this);
        if (objM70056a == coroutine_suspended) {
            return coroutine_suspended;
        }
        return objM70056a;
    }
}
