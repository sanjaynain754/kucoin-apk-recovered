package com.sumsub.sns.core.presentation.base;

import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41669n;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.core.presentation.base.z0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28163z0 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f57413a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractC28073M0 f57414b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28163z0(AbstractC28073M0 abstractC28073M0, Continuation continuation) {
        super(2, continuation);
        this.f57414b = abstractC28073M0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C28163z0(this.f57414b, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C28163z0(this.f57414b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f57413a;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        InterfaceC41669n interfaceC41669n = this.f57414b._viewModelInternalState;
        C28161y0 c28161y0 = new C28161y0(null);
        this.f57413a = 1;
        Object objM90883G = C41636g.m90883G(interfaceC41669n, c28161y0, this);
        if (objM90883G == coroutine_suspended) {
            return coroutine_suspended;
        }
        return objM90883G;
    }
}
