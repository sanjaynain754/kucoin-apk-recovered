package io.trtc.tuikit.atomicxcore.api.live;

import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0018\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\u0011"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/live/GuestListener;", "", "()V", "onGuestApplicationNoResponse", "", "reason", "Lio/trtc/tuikit/atomicxcore/api/live/NoResponseReason;", "onGuestApplicationResponded", "isAccept", "", "hostUser", "Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;", "onHostInvitationCancelled", "onHostInvitationReceived", "onKickedOffSeat", "seatIndex", "", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
public abstract class GuestListener {
    public void onGuestApplicationNoResponse(@NotNull NoResponseReason reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
    }

    public void onGuestApplicationResponded(boolean isAccept, @NotNull LiveUserInfo hostUser) {
        Intrinsics.checkNotNullParameter(hostUser, "hostUser");
    }

    public void onHostInvitationCancelled(@NotNull LiveUserInfo hostUser) {
        Intrinsics.checkNotNullParameter(hostUser, "hostUser");
    }

    public void onHostInvitationReceived(@NotNull LiveUserInfo hostUser) {
        Intrinsics.checkNotNullParameter(hostUser, "hostUser");
    }

    public void onKickedOffSeat(int seatIndex, @NotNull LiveUserInfo hostUser) {
        Intrinsics.checkNotNullParameter(hostUser, "hostUser");
    }
}
