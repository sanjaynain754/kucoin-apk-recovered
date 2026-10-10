package com.sumsub.sns.internal.features.presentation.verification;

import kotlinx.coroutines.DelayKt;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.reflect.KProperty;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.verification.g0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32714g0 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f66918a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C32720j0 f66919b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32714g0(C32720j0 c32720j0, Continuation continuation) {
        super(2, continuation);
        this.f66919b = c32720j0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C32714g0(this.f66919b, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C32714g0(this.f66919b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f66918a;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            this.f66918a = 1;
            if (DelayKt.m90350b(2000L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        C32720j0 c32720j0 = this.f66919b;
        C32734r c32734r = C32734r.f66985a;
        KProperty[] kPropertyArr = C32720j0.f66932t;
        c32720j0.fireEvent(c32734r);
        return Unit.INSTANCE;
    }
}
