package com.sumsub.sns.internal.features.presentation.verification2.status;

import com.sumsub.sns.internal.features.presentation.verification2.host.C32814J;
import com.sumsub.sns.internal.features.presentation.verification2.host.C32833q;
import kotlinx.coroutines.DelayKt;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.time.Duration;
import p852kotlin.time.DurationKt;
import p852kotlin.time.DurationUnit;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.verification2.status.j */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32891j extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f67290a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C32892k f67291b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32891j(C32892k c32892k, Continuation continuation) {
        super(2, continuation);
        this.f67291b = c32892k;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C32891j(this.f67291b, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C32891j(this.f67291b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f67290a;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            Duration.Companion companion = Duration.INSTANCE;
            long duration = DurationKt.toDuration(2000L, DurationUnit.MILLISECONDS);
            this.f67290a = 1;
            if (DelayKt.m90351c(duration, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        ((C32814J) this.f67291b.f67292a).f67154j.m71347a(C32833q.f67180a);
        return Unit.INSTANCE;
    }
}
