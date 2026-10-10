package io.trtc.tuikit.atomicxcore.impl.view.call;

import io.trtc.tuikit.atomicxcore.api.device.DeviceStatus;
import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.view.call.e */
/* JADX INFO: loaded from: classes61.dex */
public final class C39988e implements InterfaceC41635f {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C40040x f88930a;

    public C39988e(C40040x c40040x) {
        this.f88930a = c40040x;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC41635f
    public final Object emit(Object obj, Continuation continuation) {
        this.f88930a.f89079l.setMicrophoneOpened(((DeviceStatus) obj) == DeviceStatus.ON);
        C40040x.m88415a(this.f88930a, 0);
        return Unit.INSTANCE;
    }
}
