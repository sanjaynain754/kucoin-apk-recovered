package com.sumsub.sns.internal.features.presentation.main;

import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.main.v0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31355v0 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f63545a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f63546b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31355v0(boolean z11, Continuation continuation) {
        super(2, continuation);
        this.f63546b = z11;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C31355v0 c31355v0 = new C31355v0(this.f63546b, continuation);
        c31355v0.f63545a = obj;
        return c31355v0;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C31355v0 c31355v0 = new C31355v0(this.f63546b, (Continuation) obj2);
        c31355v0.f63545a = (C31263f2) obj;
        return c31355v0.invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        return C31263f2.m70662a((C31263f2) this.f63545a, Boxing.boxBoolean(this.f63546b), false, null, null, 29);
    }
}
