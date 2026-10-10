package com.sumsub.sns.internal.features.presentation.camera.photo.document;

import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.reflect.KProperty;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.photo.document.Q1 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30491Q1 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f61556a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C30440B2 f61557b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30491Q1(C30440B2 c30440b2, Continuation continuation) {
        super(2, continuation);
        this.f61557b = c30440b2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C30491Q1(this.f61557b, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C30491Q1(this.f61557b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f61556a;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            C30440B2 c30440b2 = this.f61557b;
            this.f61556a = 1;
            KProperty[] kPropertyArr = C30440B2.f61279U;
            if (c30440b2.m70309c(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
