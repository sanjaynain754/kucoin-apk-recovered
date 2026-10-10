package io.trtc.tuikit.atomicxcore.impl.view.call;

import io.trtc.tuikit.atomicxcore.api.device.DeviceStatus;
import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.view.call.c */
/* JADX INFO: loaded from: classes61.dex */
public final class C39986c implements InterfaceC41635f {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C40040x f88926a;

    public C39986c(C40040x c40040x) {
        this.f88926a = c40040x;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC41635f
    public final Object emit(Object obj, Continuation continuation) {
        this.f88926a.f89079l.setCameraOpened(((DeviceStatus) obj) == DeviceStatus.ON);
        this.f88926a.m88425c();
        return Unit.INSTANCE;
    }
}
