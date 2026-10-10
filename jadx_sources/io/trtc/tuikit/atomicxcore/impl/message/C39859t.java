package io.trtc.tuikit.atomicxcore.impl.message;

import kotlinx.coroutines.flow.InterfaceC41673r;
import p852kotlin.KotlinNothingValueException;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.message.t */
/* JADX INFO: loaded from: classes61.dex */
public final class C39859t extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f88601a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C39857r0 f88602b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39859t(C39857r0 c39857r0, Continuation continuation) {
        super(2, continuation);
        this.f88602b = c39857r0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C39859t(this.f88602b, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C39859t(this.f88602b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f88601a;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        } else {
            ResultKt.throwOnFailure(obj);
            C39857r0 c39857r0 = this.f88602b;
            InterfaceC41673r interfaceC41673r = c39857r0.f88596j;
            C39858s c39858s = new C39858s(c39857r0);
            this.f88601a = 1;
            if (interfaceC41673r.collect(c39858s, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        throw new KotlinNothingValueException();
    }
}
