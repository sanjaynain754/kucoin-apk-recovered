package io.trtc.tuikit.atomicxcore.api.live;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001a\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0018\u0010\r\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0006H\u0016J\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0006H\u0016¨\u0006\u0011"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/live/CoHostListener;", "", "()V", "onCoHostRequestAccepted", "", "invitee", "Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;", "onCoHostRequestCancelled", "inviter", "onCoHostRequestReceived", "extensionInfo", "", "onCoHostRequestRejected", "onCoHostRequestTimeout", "onCoHostUserJoined", "userInfo", "onCoHostUserLeft", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
public abstract class CoHostListener {
    public void onCoHostRequestAccepted(@NotNull SeatUserInfo invitee) {
        Intrinsics.checkNotNullParameter(invitee, "invitee");
    }

    public void onCoHostRequestCancelled(@NotNull SeatUserInfo inviter, @Nullable SeatUserInfo invitee) {
        Intrinsics.checkNotNullParameter(inviter, "inviter");
    }

    public void onCoHostRequestReceived(@NotNull SeatUserInfo inviter, @NotNull String extensionInfo) {
        Intrinsics.checkNotNullParameter(inviter, "inviter");
        Intrinsics.checkNotNullParameter(extensionInfo, "extensionInfo");
    }

    public void onCoHostRequestRejected(@NotNull SeatUserInfo invitee) {
        Intrinsics.checkNotNullParameter(invitee, "invitee");
    }

    public void onCoHostRequestTimeout(@NotNull SeatUserInfo inviter, @NotNull SeatUserInfo invitee) {
        Intrinsics.checkNotNullParameter(inviter, "inviter");
        Intrinsics.checkNotNullParameter(invitee, "invitee");
    }

    public void onCoHostUserJoined(@NotNull SeatUserInfo userInfo) {
        Intrinsics.checkNotNullParameter(userInfo, "userInfo");
    }

    public void onCoHostUserLeft(@NotNull SeatUserInfo userInfo) {
        Intrinsics.checkNotNullParameter(userInfo, "userInfo");
    }
}
