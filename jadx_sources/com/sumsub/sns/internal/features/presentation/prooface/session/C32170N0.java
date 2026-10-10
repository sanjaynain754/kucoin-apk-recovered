package com.sumsub.sns.internal.features.presentation.prooface.session;

import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.prooface.session.N0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32170N0 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ int f65512a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C32202c1 f65513b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32170N0(C32202c1 c32202c1, Continuation continuation) {
        super(2, continuation);
        this.f65513b = c32202c1;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C32170N0 c32170n0 = new C32170N0(this.f65513b, continuation);
        c32170n0.f65512a = ((Number) obj).intValue();
        return c32170n0;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int iIntValue = ((Number) obj).intValue();
        C32170N0 c32170n0 = new C32170N0(this.f65513b, (Continuation) obj2);
        c32170n0.f65512a = iIntValue;
        return c32170n0.invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean z11;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        if (this.f65512a >= this.f65513b.f65583f) {
            z11 = true;
        } else {
            z11 = false;
        }
        return Boxing.boxBoolean(z11);
    }
}
