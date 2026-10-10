package io.trtc.tuikit.atomicxcore.impl.message;

import io.trtc.tuikit.atomicxcore.api.message.MessageEvent;
import kotlinx.coroutines.flow.InterfaceC41668m;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.message.o0 */
/* JADX INFO: loaded from: classes61.dex */
public final class C39851o0 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f88576a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C39857r0 f88577b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ MessageEvent f88578c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39851o0(C39857r0 c39857r0, MessageEvent messageEvent, Continuation continuation) {
        super(2, continuation);
        this.f88577b = c39857r0;
        this.f88578c = messageEvent;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C39851o0(this.f88577b, this.f88578c, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C39851o0(this.f88577b, this.f88578c, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f88576a;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            InterfaceC41668m interfaceC41668m = this.f88577b.f88595i;
            MessageEvent messageEvent = this.f88578c;
            this.f88576a = 1;
            if (interfaceC41668m.emit(messageEvent, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
