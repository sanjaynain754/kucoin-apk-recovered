package io.trtc.tuikit.atomicxcore.impl.view.call;

import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.view.call.q */
/* JADX INFO: loaded from: classes61.dex */
public final class C40033q extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f89054a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C40040x f89055b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40033q(C40040x c40040x, Continuation continuation) {
        super(2, continuation);
        this.f89055b = c40040x;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C40033q(this.f89055b, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C40033q(this.f89055b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f89054a;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            C40040x c40040x = this.f89055b;
            this.f89054a = 1;
            if (C40040x.m88418d(c40040x, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
