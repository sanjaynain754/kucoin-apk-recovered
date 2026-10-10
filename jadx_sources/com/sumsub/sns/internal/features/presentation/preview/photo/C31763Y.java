package com.sumsub.sns.internal.features.presentation.preview.photo;

import com.sumsub.sns.internal.features.presentation.utils.C32635M;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.photo.Y */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31763Y extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f64541a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractC31770c0 f64542b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31763Y(AbstractC31770c0 abstractC31770c0, Continuation continuation) {
        super(2, continuation);
        this.f64542b = abstractC31770c0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C31763Y(this.f64542b, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C31763Y(this.f64542b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f64541a;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            C32635M c32635m = this.f64542b.f64559h;
            C31760V c31760v = new C31760V(this.f64542b);
            C31761W c31761w = new C31761W(this.f64542b);
            C31762X c31762x = new C31762X(this.f64542b);
            this.f64541a = 1;
            if (c32635m.m71235a(c31760v, c31761w, c31762x, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
