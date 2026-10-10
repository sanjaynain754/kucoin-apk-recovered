package com.sumsub.sns.internal.features.presentation.utils;

import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.utils.K */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32633K extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f66597a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f66598b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Function3 f66599c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C32635M f66600d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32633K(Function3 function3, C32635M c32635m, Continuation continuation) {
        super(2, continuation);
        this.f66599c = function3;
        this.f66600d = c32635m;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C32633K c32633k = new C32633K(this.f66599c, this.f66600d, continuation);
        c32633k.f66598b = obj;
        return c32633k;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C32633K) create((Exception) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f66597a;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            Exception exc = (Exception) this.f66598b;
            Function3 function3 = this.f66599c;
            String strM71247b = this.f66600d.m71247b();
            this.f66597a = 1;
            if (function3.invoke(exc, strM71247b, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
