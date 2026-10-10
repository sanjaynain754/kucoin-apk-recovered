package com.sumsub.sns.core.presentation.base;

import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.core.presentation.base.x */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28158x extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AbstractC28052C f57403a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28158x(AbstractC28052C abstractC28052C, Continuation continuation) {
        super(2, continuation);
        this.f57403a = abstractC28052C;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C28158x(this.f57403a, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C28158x(this.f57403a, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        this.f57403a.setAttachedToFragment(Boxing.boxBoolean(true));
        if (!this.f57403a.firstAttachHandled) {
            this.f57403a.firstAttachHandled = true;
            this.f57403a.onFirstAttach();
        }
        this.f57403a.onAttach();
        return Unit.INSTANCE;
    }
}
