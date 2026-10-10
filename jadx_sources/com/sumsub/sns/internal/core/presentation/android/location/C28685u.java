package com.sumsub.sns.internal.core.presentation.android.location;

import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.presentation.android.location.u */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28685u extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f58332a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C28686v f58333b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28685u(C28686v c28686v, Continuation continuation) {
        super(2, continuation);
        this.f58333b = c28686v;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C28685u c28685u = new C28685u(this.f58333b, continuation);
        c28685u.f58332a = obj;
        return c28685u;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C28685u c28685u = new C28685u(this.f58333b, (Continuation) obj2);
        c28685u.f58332a = (LocationServiceController$Phase) obj;
        return c28685u.invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        if (((LocationServiceController$Phase) this.f58332a) == LocationServiceController$Phase.CheckRequested) {
            C28686v c28686v = this.f58333b;
            if (((Boolean) AbstractC28684t.m69499a(c28686v.f58549a.requireContext()).invoke()).booleanValue()) {
                ((C28683s) c28686v.f58335g.getValue()).m69497a(true);
            } else {
                c28686v.mo69598p();
            }
        }
        return Unit.INSTANCE;
    }
}
