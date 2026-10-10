package com.sumsub.sns.core.presentation.base;

import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: com.sumsub.sns.core.presentation.base.y */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28160y extends SuspendLambda implements Function3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AbstractC28052C f57407a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28160y(AbstractC28052C abstractC28052C, Continuation continuation) {
        super(3, continuation);
        this.f57407a = abstractC28052C;
    }

    @Override // p852kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        return new C28160y(this.f57407a, (Continuation) obj3).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        this.f57407a.setAttachedToFragment(Boxing.boxBoolean(false));
        this.f57407a.onDetach();
        return Unit.INSTANCE;
    }
}
