package com.sumsub.sns.internal.features.presentation.main;

import com.sumsub.sns.internal.features.data.repository.dynamic.C29980i;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.main.O0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31206O0 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f63106a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C31251c2 f63107b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31206O0(C31251c2 c31251c2, Continuation continuation) {
        super(2, continuation);
        this.f63107b = c31251c2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C31206O0 c31206o0 = new C31206O0(this.f63107b, continuation);
        c31206o0.f63106a = obj;
        return c31206o0;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C31206O0 c31206o0 = new C31206O0(this.f63107b, (Continuation) obj2);
        c31206o0.f63106a = (C29980i) obj;
        return c31206o0.invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        C29980i c29980i = (C29980i) this.f63106a;
        C31251c2 c31251c2 = this.f63107b;
        C31363x0 c31363x0 = C31251c2.f63266C;
        c31251c2.m70652a(c29980i);
        return Unit.INSTANCE;
    }
}
