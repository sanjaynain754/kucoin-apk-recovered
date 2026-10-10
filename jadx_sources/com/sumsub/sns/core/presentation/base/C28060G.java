package com.sumsub.sns.core.presentation.base;

import android.os.Bundle;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.core.presentation.base.G */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28060G extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f57228a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractC28064I f57229b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Bundle f57230c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28060G(AbstractC28064I abstractC28064I, Bundle bundle, Continuation continuation) {
        super(2, continuation);
        this.f57229b = abstractC28064I;
        this.f57230c = bundle;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C28060G c28060g = new C28060G(this.f57229b, this.f57230c, continuation);
        c28060g.f57228a = obj;
        return c28060g;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C28060G) create((C28150t0) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        C28150t0 c28150t0 = (C28150t0) this.f57228a;
        this.f57229b.updateCommonUiState(c28150t0);
        boolean isPrepared = this.f57229b.getIsPrepared();
        boolean z11 = c28150t0.f57391f;
        if (isPrepared != z11) {
            this.f57229b.isPrepared = z11;
            this.f57229b.onViewModelPrepared(this.f57230c);
        }
        return Unit.INSTANCE;
    }
}
