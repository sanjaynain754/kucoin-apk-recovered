package com.sumsub.sns.core.presentation.base;

import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.core.presentation.base.c0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28107c0 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f57312a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractC28142p0 f57313b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28107c0(AbstractC28142p0 abstractC28142p0, Continuation continuation) {
        super(2, continuation);
        this.f57313b = abstractC28142p0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C28107c0(this.f57313b, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C28107c0(this.f57313b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f57312a;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            InterfaceC41634e<C28075O> dataFlow = this.f57313b.getDataFlow();
            this.f57312a = 1;
            obj = C41636g.m90884H(dataFlow, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        C28075O c28075o = (C28075O) obj;
        if (c28075o != null) {
            return c28075o.f57271c;
        }
        return null;
    }
}
