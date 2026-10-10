package com.sumsub.sns.internal.features.presentation.esign;

import com.sumsub.sns.internal.features.data.model.esign.C29752Y;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.reflect.KProperty;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.esign.Y */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30969Y extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f62580a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C30997n0 f62581b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C29752Y f62582c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30969Y(C30997n0 c30997n0, C29752Y c29752y, Continuation continuation) {
        super(2, continuation);
        this.f62581b = c30997n0;
        this.f62582c = c29752y;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C30969Y(this.f62581b, this.f62582c, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C30969Y(this.f62581b, this.f62582c, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f62580a;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            C30997n0 c30997n0 = this.f62581b;
            C29752Y c29752y = this.f62582c;
            this.f62580a = 1;
            KProperty[] kPropertyArr = C30997n0.f62640t;
            if (c30997n0.m70554c(c29752y, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
