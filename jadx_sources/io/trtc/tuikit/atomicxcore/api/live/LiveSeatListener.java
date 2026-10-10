package io.trtc.tuikit.atomicxcore.api.live;

import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\u0004H\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\n"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatListener;", "", "()V", "onLocalCameraClosedByAdmin", "", "onLocalCameraOpenedByAdmin", "policy", "Lio/trtc/tuikit/atomicxcore/api/live/DeviceControlPolicy;", "onLocalMicrophoneClosedByAdmin", "onLocalMicrophoneOpenedByAdmin", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
public abstract class LiveSeatListener {
    public void onLocalCameraOpenedByAdmin(@NotNull DeviceControlPolicy policy) {
        Intrinsics.checkNotNullParameter(policy, "policy");
    }

    public void onLocalMicrophoneOpenedByAdmin(@NotNull DeviceControlPolicy policy) {
        Intrinsics.checkNotNullParameter(policy, "policy");
    }

    public void onLocalCameraClosedByAdmin() {
    }

    public void onLocalMicrophoneClosedByAdmin() {
    }
}
