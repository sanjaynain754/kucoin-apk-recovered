package io.trtc.tuikit.atomicxcore.impl.view.call.p851float;

import android.widget.ImageView;
import io.trtc.tuikit.atomicxcore.api.call.CallParticipantStatus;
import io.trtc.tuikit.atomicxcore.api.call.CallStore;
import io.trtc.tuikit.atomicxcore.api.device.DeviceStatus;
import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.view.call.float.c */
/* JADX INFO: loaded from: classes61.dex */
public final class C39992c implements InterfaceC41635f {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C40002m f88939a;

    public C39992c(C40002m c40002m) {
        this.f88939a = c40002m;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC41635f
    public final Object emit(Object obj, Continuation continuation) {
        DeviceStatus deviceStatus = (DeviceStatus) obj;
        if (CallStore.INSTANCE.getShared().getObserverState().getSelfInfo().getValue().getStatus() == CallParticipantStatus.Accept) {
            return Unit.INSTANCE;
        }
        boolean z11 = deviceStatus == DeviceStatus.OFF;
        ImageView imageView = this.f88939a.f88970m;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imageBackground");
            imageView = null;
        }
        imageView.setVisibility(z11 ? 0 : 8);
        return Unit.INSTANCE;
    }
}
