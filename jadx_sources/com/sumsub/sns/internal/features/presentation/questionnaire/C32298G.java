package com.sumsub.sns.internal.features.presentation.questionnaire;

import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.reflect.KProperty;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.questionnaire.G */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32298G extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f65791a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C32300I f65792b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32298G(C32300I c32300i, Continuation continuation) {
        super(2, continuation);
        this.f65792b = c32300i;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C32298G(this.f65792b, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C32298G(this.f65792b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f65791a;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            C32300I c32300i = this.f65792b;
            this.f65791a = 1;
            KProperty[] kPropertyArr = C32300I.f65798w;
            if (c32300i.m71086a(false, (ContinuationImpl) this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
