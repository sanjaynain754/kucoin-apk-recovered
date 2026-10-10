package io.trtc.tuikit.atomicxcore.api.room;

import com.tencent.bugly.proguard.C33675gh;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0018\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0016J \u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J \u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J \u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0018\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0018\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u001c"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/room/RoomListener;", "", "()V", "onAddedToScheduledRoom", "", "roomInfo", "Lio/trtc/tuikit/atomicxcore/api/room/RoomInfo;", "onCallAccepted", "call", "Lio/trtc/tuikit/atomicxcore/api/room/RoomCall;", "onCallCancelled", "onCallHandledByOtherDevice", "isAccepted", "", "onCallReceived", "extensionInfo", "", "onCallRejected", "reason", "Lio/trtc/tuikit/atomicxcore/api/room/CallRejectionReason;", "onCallRevokedByAdmin", C33675gh.f69997c, "Lio/trtc/tuikit/atomicxcore/api/room/RoomUser;", "onCallTimeout", "onRemovedFromScheduledRoom", "onRoomEnded", "onScheduledRoomCancelled", "onScheduledRoomStartingSoon", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
public abstract class RoomListener {
    public void onAddedToScheduledRoom(@NotNull RoomInfo roomInfo) {
        Intrinsics.checkNotNullParameter(roomInfo, "roomInfo");
    }

    public void onCallAccepted(@NotNull RoomInfo roomInfo, @NotNull RoomCall call) {
        Intrinsics.checkNotNullParameter(roomInfo, "roomInfo");
        Intrinsics.checkNotNullParameter(call, "call");
    }

    public void onCallCancelled(@NotNull RoomInfo roomInfo, @NotNull RoomCall call) {
        Intrinsics.checkNotNullParameter(roomInfo, "roomInfo");
        Intrinsics.checkNotNullParameter(call, "call");
    }

    public void onCallHandledByOtherDevice(@NotNull RoomInfo roomInfo, boolean isAccepted) {
        Intrinsics.checkNotNullParameter(roomInfo, "roomInfo");
    }

    public void onCallReceived(@NotNull RoomInfo roomInfo, @NotNull RoomCall call, @NotNull String extensionInfo) {
        Intrinsics.checkNotNullParameter(roomInfo, "roomInfo");
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(extensionInfo, "extensionInfo");
    }

    public void onCallRejected(@NotNull RoomInfo roomInfo, @NotNull RoomCall call, @NotNull CallRejectionReason reason) {
        Intrinsics.checkNotNullParameter(roomInfo, "roomInfo");
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(reason, "reason");
    }

    public void onCallRevokedByAdmin(@NotNull RoomInfo roomInfo, @NotNull RoomCall call, @NotNull RoomUser operator) {
        Intrinsics.checkNotNullParameter(roomInfo, "roomInfo");
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(operator, "operator");
    }

    public void onCallTimeout(@NotNull RoomInfo roomInfo, @NotNull RoomCall call) {
        Intrinsics.checkNotNullParameter(roomInfo, "roomInfo");
        Intrinsics.checkNotNullParameter(call, "call");
    }

    public void onRemovedFromScheduledRoom(@NotNull RoomInfo roomInfo, @NotNull RoomUser operator) {
        Intrinsics.checkNotNullParameter(roomInfo, "roomInfo");
        Intrinsics.checkNotNullParameter(operator, "operator");
    }

    public void onRoomEnded(@NotNull RoomInfo roomInfo) {
        Intrinsics.checkNotNullParameter(roomInfo, "roomInfo");
    }

    public void onScheduledRoomCancelled(@NotNull RoomInfo roomInfo, @NotNull RoomUser operator) {
        Intrinsics.checkNotNullParameter(roomInfo, "roomInfo");
        Intrinsics.checkNotNullParameter(operator, "operator");
    }

    public void onScheduledRoomStartingSoon(@NotNull RoomInfo roomInfo) {
        Intrinsics.checkNotNullParameter(roomInfo, "roomInfo");
    }
}
