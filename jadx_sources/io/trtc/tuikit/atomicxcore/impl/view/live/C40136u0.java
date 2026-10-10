package io.trtc.tuikit.atomicxcore.impl.view.live;

import io.trtc.tuikit.atomicxcore.api.device.DeviceStore;
import kotlinx.coroutines.flow.C41636g;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.view.live.u0 */
/* JADX INFO: loaded from: classes61.dex */
public final class C40136u0 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f89273a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C40085V0 f89274b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ DeviceStore f89275c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40136u0(C40085V0 c40085v0, DeviceStore deviceStore, Continuation continuation) {
        super(2, continuation);
        this.f89274b = c40085v0;
        this.f89275c = deviceStore;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C40136u0(this.f89274b, this.f89275c, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C40136u0(this.f89274b, this.f89275c, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f89273a;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            C40085V0 c40085v0 = this.f89274b;
            DeviceStore deviceStore = this.f89275c;
            this.f89273a = 1;
            c40085v0.getClass();
            Object objCollect = C41636g.m90927m(deviceStore.getDeviceState().getLocalMirrorType(), deviceStore.getDeviceState().isFrontCamera(), new C40070N0(null)).collect(new C40072O0(c40085v0), this);
            if (objCollect != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                objCollect = Unit.INSTANCE;
            }
            if (objCollect == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
