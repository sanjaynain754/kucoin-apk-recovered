package io.trtc.tuikit.atomicxcore.api.live;

import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0018\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0010"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/live/HostListener;", "", "()V", "onGuestApplicationCancelled", "", "guestUser", "Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;", "onGuestApplicationProcessedByOtherHost", "hostUser", "onGuestApplicationReceived", "onHostInvitationNoResponse", "reason", "Lio/trtc/tuikit/atomicxcore/api/live/NoResponseReason;", "onHostInvitationResponded", "isAccept", "", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
public abstract class HostListener {
    public void onGuestApplicationCancelled(@NotNull LiveUserInfo guestUser) {
        Intrinsics.checkNotNullParameter(guestUser, "guestUser");
    }

    public void onGuestApplicationProcessedByOtherHost(@NotNull LiveUserInfo guestUser, @NotNull LiveUserInfo hostUser) {
        Intrinsics.checkNotNullParameter(guestUser, "guestUser");
        Intrinsics.checkNotNullParameter(hostUser, "hostUser");
    }

    public void onGuestApplicationReceived(@NotNull LiveUserInfo guestUser) {
        Intrinsics.checkNotNullParameter(guestUser, "guestUser");
    }

    public void onHostInvitationNoResponse(@NotNull LiveUserInfo guestUser, @NotNull NoResponseReason reason) {
        Intrinsics.checkNotNullParameter(guestUser, "guestUser");
        Intrinsics.checkNotNullParameter(reason, "reason");
    }

    public void onHostInvitationResponded(boolean isAccept, @NotNull LiveUserInfo guestUser) {
        Intrinsics.checkNotNullParameter(guestUser, "guestUser");
    }
}
