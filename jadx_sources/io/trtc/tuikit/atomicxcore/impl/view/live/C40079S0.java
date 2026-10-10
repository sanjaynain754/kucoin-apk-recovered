package io.trtc.tuikit.atomicxcore.impl.view.live;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import io.trtc.tuikit.atomicxcore.api.device.DeviceStatus;
import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.view.live.S0 */
/* JADX INFO: loaded from: classes61.dex */
public final class C40079S0 implements InterfaceC41635f {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C40085V0 f89148a;

    public C40079S0(C40085V0 c40085v0) {
        this.f89148a = c40085v0;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC41635f
    public final Object emit(Object obj, Continuation continuation) {
        DeviceStatus deviceStatus = (DeviceStatus) obj;
        LiveData<Boolean> liveData = this.f89148a.f89156a.mediaState.isMicrophoneOpened;
        Intrinsics.checkNotNull(liveData, "null cannot be cast to non-null type androidx.lifecycle.MutableLiveData<kotlin.Boolean>");
        ((MutableLiveData) liveData).setValue(Boxing.boxBoolean(deviceStatus == DeviceStatus.ON));
        return Unit.INSTANCE;
    }
}
