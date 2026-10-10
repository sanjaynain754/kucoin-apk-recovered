package io.trtc.tuikit.atomicxcore.impl.view.live;

import io.trtc.tuikit.atomicxcore.api.live.CoGuestStore;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.view.live.b0 */
/* JADX INFO: loaded from: classes61.dex */
public final class C40093b0 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f89178a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C40085V0 f89179b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ CoGuestStore f89180c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40093b0(C40085V0 c40085v0, CoGuestStore coGuestStore, Continuation continuation) {
        super(2, continuation);
        this.f89179b = c40085v0;
        this.f89180c = coGuestStore;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C40093b0(this.f89179b, this.f89180c, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C40093b0(this.f89179b, this.f89180c, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f89178a;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            C40085V0 c40085v0 = this.f89179b;
            CoGuestStore coGuestStore = this.f89180c;
            this.f89178a = 1;
            if (C40085V0.m88467a(c40085v0, coGuestStore, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
