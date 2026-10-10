package io.trtc.tuikit.atomicxcore.impl.view.live;

import io.trtc.tuikit.atomicxcore.api.device.DeviceStore;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.view.live.q0 */
/* JADX INFO: loaded from: classes61.dex */
public final class C40128q0 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f89256a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C40085V0 f89257b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ DeviceStore f89258c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40128q0(C40085V0 c40085v0, DeviceStore deviceStore, Continuation continuation) {
        super(2, continuation);
        this.f89257b = c40085v0;
        this.f89258c = deviceStore;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C40128q0(this.f89257b, this.f89258c, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C40128q0(this.f89257b, this.f89258c, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f89256a;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            C40085V0 c40085v0 = this.f89257b;
            DeviceStore deviceStore = this.f89258c;
            this.f89256a = 1;
            if (C40085V0.m88465a(c40085v0, deviceStore, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
