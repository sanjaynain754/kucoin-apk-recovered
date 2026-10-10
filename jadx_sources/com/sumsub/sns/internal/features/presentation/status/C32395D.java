package com.sumsub.sns.internal.features.presentation.status;

import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.status.D */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32395D extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f65999a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f66000b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32395D(boolean z11, Continuation continuation) {
        super(2, continuation);
        this.f66000b = z11;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C32395D c32395d = new C32395D(this.f66000b, continuation);
        c32395d.f65999a = obj;
        return c32395d;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C32395D c32395d = new C32395D(this.f66000b, (Continuation) obj2);
        c32395d.f65999a = (AbstractC32410T) obj;
        return c32395d.invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C32411U c32411u;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        AbstractC32410T abstractC32410T = (AbstractC32410T) this.f65999a;
        boolean z11 = this.f66000b;
        C32411U c32411u2 = abstractC32410T.f66071g;
        if (c32411u2 != null) {
            c32411u = new C32411U(c32411u2.f66072a, c32411u2.f66073b, z11);
        } else {
            c32411u = null;
        }
        abstractC32410T.f66071g = c32411u;
        return abstractC32410T;
    }
}
