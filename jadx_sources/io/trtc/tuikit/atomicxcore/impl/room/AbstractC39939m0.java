package io.trtc.tuikit.atomicxcore.impl.room;

import com.tencent.cloud.tuikit.engine.extension.TUIConferenceInvitationManager;
import com.tencent.cloud.tuikit.engine.extension.TUIConferenceListManager;
import com.tencent.cloud.tuikit.engine.room.TUIRoomDefine;
import io.trtc.tuikit.atomicxcore.api.device.DeviceStatus;
import io.trtc.tuikit.atomicxcore.api.device.DeviceType;
import io.trtc.tuikit.atomicxcore.api.room.DeviceRequestInfo;
import io.trtc.tuikit.atomicxcore.api.room.ParticipantRole;
import io.trtc.tuikit.atomicxcore.api.room.RoomCall;
import io.trtc.tuikit.atomicxcore.api.room.RoomCallStatus;
import io.trtc.tuikit.atomicxcore.api.room.RoomInfo;
import io.trtc.tuikit.atomicxcore.api.room.RoomParticipant;
import io.trtc.tuikit.atomicxcore.api.room.RoomParticipantStatus;
import io.trtc.tuikit.atomicxcore.api.room.RoomStatus;
import io.trtc.tuikit.atomicxcore.api.room.RoomUser;
import io.trtc.tuikit.atomicxcore.api.room.ScheduleRoomOptions;
import java.util.LinkedHashMap;
import java.util.Map;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.room.m0 */
/* JADX INFO: loaded from: classes61.dex */
public abstract class AbstractC39939m0 {
    /* JADX INFO: renamed from: a */
    public static final RoomParticipant m88367a(TUIRoomDefine.UserInfo userInfo, RoomParticipantStatus roomStatus) {
        Intrinsics.checkNotNullParameter(userInfo, "userInfo");
        Intrinsics.checkNotNullParameter(roomStatus, "roomStatus");
        String str = userInfo.userId;
        String str2 = userInfo.userName;
        String str3 = userInfo.avatarUrl;
        String str4 = userInfo.nameCard;
        TUIRoomDefine.Role userRole = userInfo.userRole;
        Intrinsics.checkNotNullExpressionValue(userRole, "userRole");
        ParticipantRole participantRoleM88362a = m88362a(userRole);
        Map linkedHashMap = userInfo.roomCustomInfo;
        if (linkedHashMap == null) {
            linkedHashMap = new LinkedHashMap();
        }
        Map map = linkedHashMap;
        DeviceStatus deviceStatusM88360a = m88360a(userInfo.hasAudioStream);
        DeviceStatus deviceStatusM88360a2 = m88360a(userInfo.hasVideoStream);
        DeviceStatus deviceStatusM88360a3 = m88360a(userInfo.hasScreenStream);
        boolean z11 = userInfo.isMessageDisabled;
        Intrinsics.checkNotNull(str);
        Intrinsics.checkNotNull(str2);
        Intrinsics.checkNotNull(str3);
        Intrinsics.checkNotNull(str4);
        return new RoomParticipant(str, str2, str3, str4, participantRoleM88362a, roomStatus, deviceStatusM88360a, deviceStatusM88360a2, deviceStatusM88360a3, z11, map);
    }

    /* JADX INFO: renamed from: a */
    public static final RoomParticipant m88366a(TUIRoomDefine.UserInfo userInfo, TUIConferenceInvitationManager.InvitationStatus status) {
        RoomParticipantStatus roomParticipantStatus;
        Intrinsics.checkNotNullParameter(userInfo, "userInfo");
        Intrinsics.checkNotNullParameter(status, "invitationStatus");
        String str = userInfo.userId;
        String str2 = userInfo.userName;
        String str3 = userInfo.avatarUrl;
        String str4 = userInfo.nameCard;
        TUIRoomDefine.Role userRole = userInfo.userRole;
        Intrinsics.checkNotNullExpressionValue(userRole, "userRole");
        ParticipantRole participantRoleM88362a = m88362a(userRole);
        Intrinsics.checkNotNullParameter(status, "status");
        int i11 = AbstractC39936l0.f88800f[status.ordinal()];
        if (i11 == 1) {
            roomParticipantStatus = RoomParticipantStatus.IN_CALLING;
        } else if (i11 == 2) {
            roomParticipantStatus = RoomParticipantStatus.CALL_TIMEOUT;
        } else if (i11 != 3) {
            roomParticipantStatus = RoomParticipantStatus.IN_ROOM;
        } else {
            roomParticipantStatus = RoomParticipantStatus.CALL_REJECTED;
        }
        RoomParticipantStatus roomParticipantStatus2 = roomParticipantStatus;
        Map linkedHashMap = userInfo.roomCustomInfo;
        if (linkedHashMap == null) {
            linkedHashMap = new LinkedHashMap();
        }
        Map map = linkedHashMap;
        DeviceStatus deviceStatusM88360a = m88360a(userInfo.hasAudioStream);
        DeviceStatus deviceStatusM88360a2 = m88360a(userInfo.hasVideoStream);
        DeviceStatus deviceStatusM88360a3 = m88360a(userInfo.hasScreenStream);
        boolean z11 = userInfo.isMessageDisabled;
        Intrinsics.checkNotNull(str);
        Intrinsics.checkNotNull(str2);
        Intrinsics.checkNotNull(str3);
        Intrinsics.checkNotNull(str4);
        return new RoomParticipant(str, str2, str3, str4, participantRoleM88362a, roomParticipantStatus2, deviceStatusM88360a, deviceStatusM88360a2, deviceStatusM88360a3, z11, map);
    }

    /* JADX INFO: renamed from: a */
    public static final RoomUser m88368a(TUIRoomDefine.UserInfo userInfo) {
        Intrinsics.checkNotNullParameter(userInfo, "userInfo");
        RoomUser roomUser = new RoomUser(null, null, null, 7, null);
        String userId = userInfo.userId;
        Intrinsics.checkNotNullExpressionValue(userId, "userId");
        roomUser.setUserID(userId);
        String userName = userInfo.userName;
        Intrinsics.checkNotNullExpressionValue(userName, "userName");
        roomUser.setUserName(userName);
        String avatarUrl = userInfo.avatarUrl;
        Intrinsics.checkNotNullExpressionValue(avatarUrl, "avatarUrl");
        roomUser.setAvatarURL(avatarUrl);
        return roomUser;
    }

    /* JADX INFO: renamed from: a */
    public static final DeviceRequestInfo m88361a(TUIRoomDefine.Request request) {
        DeviceType deviceType;
        Intrinsics.checkNotNullParameter(request, "request");
        TUIRoomDefine.RequestAction requestAction = request.requestAction;
        int i11 = requestAction == null ? -1 : AbstractC39936l0.f88795a[requestAction.ordinal()];
        if (i11 == 1 || i11 == 2) {
            deviceType = DeviceType.CAMERA;
        } else if (i11 == 3 || i11 == 4 || i11 != 5) {
            deviceType = DeviceType.MICROPHONE;
        } else {
            deviceType = DeviceType.SCREEN_SHARE;
        }
        DeviceType deviceType2 = deviceType;
        TUIRoomDefine.UserInfo userInfo = request.fromUser;
        String str = userInfo.userId;
        String str2 = userInfo.userName;
        String str3 = userInfo.nameCard;
        String str4 = userInfo.avatarUrl;
        String str5 = request.content;
        long j11 = request.timestamp;
        Intrinsics.checkNotNull(str);
        Intrinsics.checkNotNull(str2);
        Intrinsics.checkNotNull(str3);
        Intrinsics.checkNotNull(str4);
        Intrinsics.checkNotNull(str5);
        return new DeviceRequestInfo(j11, str, str2, str3, str4, str5, deviceType2);
    }

    /* JADX INFO: renamed from: a */
    public static final ParticipantRole m88362a(TUIRoomDefine.Role role) {
        Intrinsics.checkNotNullParameter(role, "role");
        int i11 = AbstractC39936l0.f88796b[role.ordinal()];
        if (i11 == 1) {
            return ParticipantRole.OWNER;
        }
        if (i11 == 2) {
            return ParticipantRole.ADMIN;
        }
        if (i11 == 3) {
            return ParticipantRole.GENERAL_USER;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: a */
    public static final DeviceStatus m88360a(boolean z11) {
        return z11 ? DeviceStatus.ON : DeviceStatus.OFF;
    }

    /* JADX INFO: renamed from: a */
    public static final TUIRoomDefine.MediaDevice m88359a(DeviceType deviceType) {
        Intrinsics.checkNotNullParameter(deviceType, "deviceType");
        int i11 = AbstractC39936l0.f88797c[deviceType.ordinal()];
        if (i11 == 1) {
            return TUIRoomDefine.MediaDevice.MICROPHONE;
        }
        if (i11 == 2) {
            return TUIRoomDefine.MediaDevice.CAMERA;
        }
        if (i11 == 3) {
            return TUIRoomDefine.MediaDevice.SCREEN_SHARING;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: a */
    public static final RoomInfo m88364a(TUIConferenceListManager.ConferenceInfo conferenceInfo) {
        RoomStatus roomStatus;
        Intrinsics.checkNotNullParameter(conferenceInfo, "conferenceInfo");
        TUIConferenceListManager.ConferenceStatus status = conferenceInfo.status;
        Intrinsics.checkNotNullExpressionValue(status, "status");
        Intrinsics.checkNotNullParameter(status, "status");
        if (AbstractC39936l0.f88801g[status.ordinal()] == 1) {
            roomStatus = RoomStatus.RUNNING;
        } else {
            roomStatus = RoomStatus.SCHEDULED;
        }
        TUIRoomDefine.RoomInfo basicRoomInfo = conferenceInfo.basicRoomInfo;
        Intrinsics.checkNotNullExpressionValue(basicRoomInfo, "basicRoomInfo");
        RoomInfo roomInfoM88365a = m88365a(basicRoomInfo, roomStatus);
        return roomInfoM88365a.copy((32319 & 1) != 0 ? roomInfoM88365a.roomID : null, (32319 & 2) != 0 ? roomInfoM88365a.roomName : null, (32319 & 4) != 0 ? roomInfoM88365a.roomOwner : null, (32319 & 8) != 0 ? roomInfoM88365a.participantCount : 0, (32319 & 16) != 0 ? roomInfoM88365a.createTime : 0L, (32319 & 32) != 0 ? roomInfoM88365a.roomStatus : null, (32319 & 64) != 0 ? roomInfoM88365a.scheduledStartTime : conferenceInfo.scheduleStartTime, (32319 & 128) != 0 ? roomInfoM88365a.scheduledEndTime : conferenceInfo.scheduleEndTime, (32319 & 256) != 0 ? roomInfoM88365a.startReminderInSeconds : conferenceInfo.reminderSecondsBeforeStart, (32319 & 512) != 0 ? roomInfoM88365a.scheduleAttendees : null, (32319 & 1024) != 0 ? roomInfoM88365a.password : null, (32319 & 2048) != 0 ? roomInfoM88365a.isAllMicrophoneDisabled : false, (32319 & 4096) != 0 ? roomInfoM88365a.isAllCameraDisabled : false, (32319 & 8192) != 0 ? roomInfoM88365a.isAllMessageDisabled : false, (32319 & 16384) != 0 ? roomInfoM88365a.isAllScreenShareDisabled : false);
    }

    /* JADX INFO: renamed from: a */
    public static final RoomInfo m88365a(TUIRoomDefine.RoomInfo roomInfo, RoomStatus roomStatus) {
        Intrinsics.checkNotNullParameter(roomInfo, "roomInfo");
        Intrinsics.checkNotNullParameter(roomStatus, "roomStatus");
        String str = roomInfo.roomId;
        String str2 = roomInfo.name;
        String ownerId = roomInfo.ownerId;
        Intrinsics.checkNotNullExpressionValue(ownerId, "ownerId");
        String ownerName = roomInfo.ownerName;
        Intrinsics.checkNotNullExpressionValue(ownerName, "ownerName");
        String ownerAvatarUrl = roomInfo.ownerAvatarUrl;
        Intrinsics.checkNotNullExpressionValue(ownerAvatarUrl, "ownerAvatarUrl");
        RoomUser roomUser = new RoomUser(ownerId, ownerName, ownerAvatarUrl);
        int i11 = roomInfo.memberCount;
        long j11 = roomInfo.createTime;
        String str3 = roomInfo.password;
        boolean z11 = roomInfo.isMicrophoneDisableForAllUser;
        boolean z12 = roomInfo.isCameraDisableForAllUser;
        boolean z13 = roomInfo.isScreenShareDisableForAllUser;
        boolean z14 = roomInfo.isMessageDisableForAllUser;
        Intrinsics.checkNotNull(str);
        Intrinsics.checkNotNull(str2);
        return new RoomInfo(str, str2, roomUser, i11, j11, roomStatus, 0L, 0L, 0, null, str3, z11, z12, z14, z13, 960, null);
    }

    /* JADX INFO: renamed from: a */
    public static final TUIConferenceListManager.ConferenceInfo m88358a(String roomID, ScheduleRoomOptions options) {
        Intrinsics.checkNotNullParameter(roomID, "roomID");
        Intrinsics.checkNotNullParameter(options, "options");
        TUIRoomDefine.RoomInfo roomInfo = new TUIRoomDefine.RoomInfo();
        roomInfo.roomId = roomID;
        roomInfo.name = options.getRoomName();
        roomInfo.password = options.getPassword();
        roomInfo.isMicrophoneDisableForAllUser = options.isAllMicrophoneDisabled();
        roomInfo.isCameraDisableForAllUser = options.isAllCameraDisabled();
        roomInfo.isScreenShareDisableForAllUser = options.isAllScreenShareDisabled();
        roomInfo.isMessageDisableForAllUser = options.isAllMessageDisabled();
        TUIConferenceListManager.ConferenceInfo conferenceInfo = new TUIConferenceListManager.ConferenceInfo();
        conferenceInfo.scheduleStartTime = options.getScheduleStartTime();
        conferenceInfo.scheduleEndTime = options.getScheduleEndTime();
        conferenceInfo.reminderSecondsBeforeStart = options.getReminderSecondsBeforeStart();
        conferenceInfo.scheduleAttendees = options.getScheduleAttendees();
        conferenceInfo.basicRoomInfo = roomInfo;
        return conferenceInfo;
    }

    /* JADX INFO: renamed from: a */
    public static final RoomCall m88363a(TUIConferenceInvitationManager.Invitation invitation) {
        RoomCallStatus roomCallStatus;
        Intrinsics.checkNotNullParameter(invitation, "invitation");
        TUIRoomDefine.UserInfo inviter = invitation.inviter;
        Intrinsics.checkNotNullExpressionValue(inviter, "inviter");
        RoomUser roomUserM88368a = m88368a(inviter);
        TUIRoomDefine.UserInfo invitee = invitation.invitee;
        Intrinsics.checkNotNullExpressionValue(invitee, "invitee");
        RoomUser roomUserM88368a2 = m88368a(invitee);
        TUIConferenceInvitationManager.InvitationStatus status = invitation.status;
        Intrinsics.checkNotNullExpressionValue(status, "status");
        Intrinsics.checkNotNullParameter(status, "status");
        int i11 = AbstractC39936l0.f88800f[status.ordinal()];
        if (i11 == 1) {
            roomCallStatus = RoomCallStatus.CALLING;
        } else if (i11 == 2) {
            roomCallStatus = RoomCallStatus.TIMEOUT;
        } else if (i11 != 3) {
            roomCallStatus = RoomCallStatus.NONE;
        } else {
            roomCallStatus = RoomCallStatus.REJECTED;
        }
        return new RoomCall(roomUserM88368a, roomUserM88368a2, roomCallStatus);
    }
}
