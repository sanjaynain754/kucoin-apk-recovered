package com.sumsub.sns.core.presentation.base;

import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.core.presentation.base.Z */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28085Z extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f57282a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractC28142p0 f57283b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28085Z(AbstractC28142p0 abstractC28142p0, Continuation continuation) {
        super(2, continuation);
        this.f57283b = abstractC28142p0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C28085Z(this.f57283b, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C28085Z(this.f57283b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f57282a;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        InterfaceC41634e<C28075O> dataFlow = this.f57283b.getDataFlow();
        this.f57282a = 1;
        Object objM90884H = C41636g.m90884H(dataFlow, this);
        if (objM90884H == coroutine_suspended) {
            return coroutine_suspended;
        }
        return objM90884H;
    }
}
