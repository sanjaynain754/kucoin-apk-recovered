package com.sumsub.sns.internal.features.presentation.error;

import com.sumsub.sns.core.presentation.base.C28143q;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.error.h */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30929h extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f62469a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C30935n f62470b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30929h(C30935n c30935n, Continuation continuation) {
        super(2, continuation);
        this.f62470b = c30935n;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C30929h c30929h = new C30929h(this.f62470b, continuation);
        c30929h.f62469a = obj;
        return c30929h;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C30929h c30929h = new C30929h(this.f62470b, (Continuation) obj2);
        c30929h.f62469a = (C28143q) obj;
        return c30929h.invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        C28143q c28143q = (C28143q) this.f62469a;
        C30935n c30935n = this.f62470b;
        C30927f c30927f = C30935n.f62476f;
        c30935n.updateCommonUiState(c28143q);
        return Unit.INSTANCE;
    }
}
