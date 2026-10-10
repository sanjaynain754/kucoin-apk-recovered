package io.trtc.tuikit.atomicxcore.api.room;

import com.tencent.bugly.proguard.C33675gh;
import io.trtc.tuikit.atomicxcore.api.device.DeviceType;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J \u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0006H\u0016J\u0018\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0006H\u0016J\u0018\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u0006H\u0016J\u0010\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0018\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u0006H\u0016J\u0010\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0018\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u0006H\u0016J\u0010\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0011H\u0016J\u0018\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u0006H\u0016J\u0010\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0011H\u0016J\u0018\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u0006H\u0016J\u0010\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0011H\u0016J\u0018\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0016J\u0018\u0010\"\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u0006H\u0016J\u0018\u0010%\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0006H\u0016J\u0010\u0010&\u001a\u00020\u00042\u0006\u0010'\u001a\u00020\u0006H\u0016J\u0010\u0010(\u001a\u00020\u00042\u0006\u0010'\u001a\u00020\u0006H\u0016J\u0018\u0010)\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0006H\u0016¨\u0006*"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/room/RoomParticipantListener;", "", "()V", "onAdminRevoked", "", "userInfo", "Lio/trtc/tuikit/atomicxcore/api/room/RoomUser;", "onAdminSet", "onAllDevicesDisabled", "device", "Lio/trtc/tuikit/atomicxcore/api/device/DeviceType;", "disable", "", C33675gh.f69997c, "onAllMessagesDisabled", "onDeviceInvitationAccepted", "invitation", "Lio/trtc/tuikit/atomicxcore/api/room/DeviceRequestInfo;", "onDeviceInvitationCancelled", "onDeviceInvitationDeclined", "onDeviceInvitationReceived", "onDeviceInvitationTimeout", "onDeviceRequestApproved", "request", "onDeviceRequestCancelled", "onDeviceRequestProcessed", "onDeviceRequestReceived", "onDeviceRequestRejected", "onDeviceRequestTimeout", "onKickedFromRoom", "reason", "Lio/trtc/tuikit/atomicxcore/api/room/KickedOutOfRoomReason;", "message", "", "onOwnerChanged", "newOwner", "oldOwner", "onParticipantDeviceClosed", "onParticipantJoined", "participant", "onParticipantLeft", "onUserMessageDisabled", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
public abstract class RoomParticipantListener {
    public void onAllDevicesDisabled(@NotNull DeviceType device, boolean disable, @NotNull RoomUser operator) {
        Intrinsics.checkNotNullParameter(device, "device");
        Intrinsics.checkNotNullParameter(operator, "operator");
    }

    public void onAllMessagesDisabled(boolean disable, @NotNull RoomUser operator) {
        Intrinsics.checkNotNullParameter(operator, "operator");
    }

    public void onDeviceInvitationAccepted(@NotNull DeviceRequestInfo invitation, @NotNull RoomUser operator) {
        Intrinsics.checkNotNullParameter(invitation, "invitation");
        Intrinsics.checkNotNullParameter(operator, "operator");
    }

    public void onDeviceInvitationCancelled(@NotNull DeviceRequestInfo invitation) {
        Intrinsics.checkNotNullParameter(invitation, "invitation");
    }

    public void onDeviceInvitationDeclined(@NotNull DeviceRequestInfo invitation, @NotNull RoomUser operator) {
        Intrinsics.checkNotNullParameter(invitation, "invitation");
        Intrinsics.checkNotNullParameter(operator, "operator");
    }

    public void onDeviceInvitationReceived(@NotNull DeviceRequestInfo invitation) {
        Intrinsics.checkNotNullParameter(invitation, "invitation");
    }

    public void onDeviceInvitationTimeout(@NotNull DeviceRequestInfo invitation) {
        Intrinsics.checkNotNullParameter(invitation, "invitation");
    }

    public void onDeviceRequestApproved(@NotNull DeviceRequestInfo request, @NotNull RoomUser operator) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(operator, "operator");
    }

    public void onDeviceRequestCancelled(@NotNull DeviceRequestInfo request) {
        Intrinsics.checkNotNullParameter(request, "request");
    }

    public void onDeviceRequestProcessed(@NotNull DeviceRequestInfo request, @NotNull RoomUser operator) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(operator, "operator");
    }

    public void onDeviceRequestReceived(@NotNull DeviceRequestInfo request) {
        Intrinsics.checkNotNullParameter(request, "request");
    }

    public void onDeviceRequestRejected(@NotNull DeviceRequestInfo request, @NotNull RoomUser operator) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(operator, "operator");
    }

    public void onDeviceRequestTimeout(@NotNull DeviceRequestInfo request) {
        Intrinsics.checkNotNullParameter(request, "request");
    }

    public void onKickedFromRoom(@NotNull KickedOutOfRoomReason reason, @NotNull String message) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        Intrinsics.checkNotNullParameter(message, "message");
    }

    public void onOwnerChanged(@NotNull RoomUser newOwner, @NotNull RoomUser oldOwner) {
        Intrinsics.checkNotNullParameter(newOwner, "newOwner");
        Intrinsics.checkNotNullParameter(oldOwner, "oldOwner");
    }

    public void onParticipantDeviceClosed(@NotNull DeviceType device, @NotNull RoomUser operator) {
        Intrinsics.checkNotNullParameter(device, "device");
        Intrinsics.checkNotNullParameter(operator, "operator");
    }

    public void onParticipantJoined(@NotNull RoomUser participant) {
        Intrinsics.checkNotNullParameter(participant, "participant");
    }

    public void onParticipantLeft(@NotNull RoomUser participant) {
        Intrinsics.checkNotNullParameter(participant, "participant");
    }

    public void onUserMessageDisabled(boolean disable, @NotNull RoomUser operator) {
        Intrinsics.checkNotNullParameter(operator, "operator");
    }

    public void onAdminRevoked(@NotNull RoomUser userInfo) {
        Intrinsics.checkNotNullParameter(userInfo, "userInfo");
    }

    public void onAdminSet(@NotNull RoomUser userInfo) {
        Intrinsics.checkNotNullParameter(userInfo, "userInfo");
    }
}
