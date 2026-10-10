package com.sumsub.sns.internal.features.presentation.preview.photo.identity;

import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.photo.identity.o */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31811o extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f64636a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C31816t f64637b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f64638c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f64639d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31811o(C31816t c31816t, String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.f64637b = c31816t;
        this.f64638c = str;
        this.f64639d = str2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C31811o(this.f64637b, this.f64638c, this.f64639d, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C31811o) create((InterfaceC41709m0) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f64636a;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            C31801e c31801e = this.f64637b.f64651n;
            String str = this.f64638c;
            String str2 = this.f64639d;
            this.f64636a = 1;
            if (c31801e.m70881b(str, str2, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
