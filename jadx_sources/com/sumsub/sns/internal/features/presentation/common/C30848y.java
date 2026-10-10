package com.sumsub.sns.internal.features.presentation.common;

import com.sumsub.sns.core.presentation.base.InterfaceC28145r;
import com.sumsub.sns.internal.features.presentation.utils.C32635M;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.common.y */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30848y extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f62302a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractC30808G f62303b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f62304c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30848y(AbstractC30808G abstractC30808G, boolean z11, Continuation continuation) {
        super(2, continuation);
        this.f62303b = abstractC30808G;
        this.f62304c = z11;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C30848y(this.f62303b, this.f62304c, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C30848y(this.f62303b, this.f62304c, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f62302a;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            C32635M c32635m = this.f62303b.f62236a;
            boolean z11 = this.f62304c;
            this.f62302a = 1;
            c32635m.getClass();
            obj = C32635M.m71225a(c32635m, z11, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        InterfaceC28145r interfaceC28145r = (InterfaceC28145r) obj;
        if (interfaceC28145r != null) {
            AbstractC30808G abstractC30808G = this.f62303b;
            int i12 = AbstractC30808G.f62235V;
            abstractC30808G.fireEvent(interfaceC28145r);
        }
        return Unit.INSTANCE;
    }
}
