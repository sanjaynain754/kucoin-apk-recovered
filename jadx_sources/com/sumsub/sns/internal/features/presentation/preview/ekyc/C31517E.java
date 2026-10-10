package com.sumsub.sns.internal.features.presentation.preview.ekyc;

import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.reflect.KProperty;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.ekyc.E */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31517E extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f63945a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C31707h0 f63946b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31517E(C31707h0 c31707h0, Continuation continuation) {
        super(2, continuation);
        this.f63946b = c31707h0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C31517E(this.f63946b, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C31517E(this.f63946b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f63945a;
        try {
            if (i11 != 0) {
                if (i11 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                C31707h0 c31707h0 = this.f63946b;
                this.f63945a = 1;
                KProperty[] kPropertyArr = C31707h0.f64357D;
                if (c31707h0.m70821e(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            this.f63946b.showProgress(false);
            return Unit.INSTANCE;
        } catch (Throwable th2) {
            this.f63946b.showProgress(false);
            throw th2;
        }
    }
}
