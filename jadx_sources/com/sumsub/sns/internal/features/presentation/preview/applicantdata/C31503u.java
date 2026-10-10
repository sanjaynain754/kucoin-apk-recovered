package com.sumsub.sns.internal.features.presentation.preview.applicantdata;

import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.reflect.KProperty;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.applicantdata.u */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31503u extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f63919a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C31476A f63920b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31503u(C31476A c31476a, Continuation continuation) {
        super(2, continuation);
        this.f63920b = c31476a;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C31503u(this.f63920b, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C31503u(this.f63920b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f63919a;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            C31476A c31476a = this.f63920b;
            C31502t c31502t = new C31502t(c31476a, null);
            this.f63919a = 1;
            KProperty[] kPropertyArr = C31476A.f63854s;
            if (c31476a.m70854a(c31502t, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
