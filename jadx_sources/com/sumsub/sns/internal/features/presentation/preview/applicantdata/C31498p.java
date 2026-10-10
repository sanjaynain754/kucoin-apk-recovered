package com.sumsub.sns.internal.features.presentation.preview.applicantdata;

import java.util.List;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.reflect.KProperty;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.applicantdata.p */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31498p extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f63907a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C31476A f63908b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31498p(C31476A c31476a, Continuation continuation) {
        super(2, continuation);
        this.f63908b = c31476a;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C31498p(this.f63908b, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C31498p(this.f63908b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f63907a;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            C31476A c31476a = this.f63908b;
            this.f63907a = 1;
            KProperty[] kPropertyArr = C31476A.f63854s;
            if (c31476a.m70742a((List) null, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        this.f63908b.mo70746c(true);
        return Unit.INSTANCE;
    }
}
