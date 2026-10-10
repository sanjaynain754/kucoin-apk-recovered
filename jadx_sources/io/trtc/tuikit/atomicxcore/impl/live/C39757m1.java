package io.trtc.tuikit.atomicxcore.impl.live;

import io.trtc.tuikit.atomicxcore.api.login.LoginStatus;
import io.trtc.tuikit.atomicxcore.impl.login.C39796h;
import kotlinx.coroutines.flow.InterfaceC41678w;
import p852kotlin.KotlinNothingValueException;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.live.m1 */
/* JADX INFO: loaded from: classes61.dex */
public final class C39757m1 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f88343a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C39796h f88344b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C39760n1 f88345c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39757m1(C39796h c39796h, C39760n1 c39760n1, Continuation continuation) {
        super(2, continuation);
        this.f88344b = c39796h;
        this.f88345c = c39760n1;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C39757m1(this.f88344b, this.f88345c, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C39757m1(this.f88344b, this.f88345c, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f88343a;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        } else {
            ResultKt.throwOnFailure(obj);
            InterfaceC41678w<LoginStatus> loginStatus = this.f88344b.f88436i.getLoginStatus();
            C39754l1 c39754l1 = new C39754l1(this.f88345c, this.f88344b);
            this.f88343a = 1;
            if (loginStatus.collect(c39754l1, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        throw new KotlinNothingValueException();
    }
}
