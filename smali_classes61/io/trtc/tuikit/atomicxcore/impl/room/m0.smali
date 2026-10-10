.class public abstract Lio/trtc/tuikit/atomicxcore/impl/room/m0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/room/ScheduleRoomOptions;)Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$ConferenceInfo;
    .locals 3

    const-string v0, "roomID"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "options"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 100
    new-instance v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;

    invoke-direct {v0}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;-><init>()V

    .line 101
    iput-object p0, v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;->roomId:Ljava/lang/String;

    .line 102
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/room/ScheduleRoomOptions;->getRoomName()Ljava/lang/String;

    move-result-object p0

    iput-object p0, v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;->name:Ljava/lang/String;

    .line 103
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/room/ScheduleRoomOptions;->getPassword()Ljava/lang/String;

    move-result-object p0

    iput-object p0, v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;->password:Ljava/lang/String;

    .line 104
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/room/ScheduleRoomOptions;->isAllMicrophoneDisabled()Z

    move-result p0

    iput-boolean p0, v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;->isMicrophoneDisableForAllUser:Z

    .line 105
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/room/ScheduleRoomOptions;->isAllCameraDisabled()Z

    move-result p0

    iput-boolean p0, v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;->isCameraDisableForAllUser:Z

    .line 106
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/room/ScheduleRoomOptions;->isAllScreenShareDisabled()Z

    move-result p0

    iput-boolean p0, v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;->isScreenShareDisableForAllUser:Z

    .line 107
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/room/ScheduleRoomOptions;->isAllMessageDisabled()Z

    move-result p0

    iput-boolean p0, v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;->isMessageDisableForAllUser:Z

    .line 108
    new-instance p0, Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$ConferenceInfo;

    invoke-direct {p0}, Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$ConferenceInfo;-><init>()V

    .line 109
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/room/ScheduleRoomOptions;->getScheduleStartTime()J

    move-result-wide v1

    iput-wide v1, p0, Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$ConferenceInfo;->scheduleStartTime:J

    .line 110
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/room/ScheduleRoomOptions;->getScheduleEndTime()J

    move-result-wide v1

    iput-wide v1, p0, Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$ConferenceInfo;->scheduleEndTime:J

    .line 111
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/room/ScheduleRoomOptions;->getReminderSecondsBeforeStart()I

    move-result v1

    iput v1, p0, Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$ConferenceInfo;->reminderSecondsBeforeStart:I

    .line 112
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/room/ScheduleRoomOptions;->getScheduleAttendees()Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$ConferenceInfo;->scheduleAttendees:Ljava/util/List;

    .line 113
    iput-object v0, p0, Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$ConferenceInfo;->basicRoomInfo:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;

    return-object p0
.end method

.method public static final a(Lio/trtc/tuikit/atomicxcore/api/device/DeviceType;)Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$MediaDevice;
    .locals 1

    const-string v0, "deviceType"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 68
    sget-object v0, Lio/trtc/tuikit/atomicxcore/impl/room/l0;->c:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    if-eq p0, v0, :cond_2

    const/4 v0, 0x2

    if-eq p0, v0, :cond_1

    const/4 v0, 0x3

    if-ne p0, v0, :cond_0

    .line 69
    sget-object p0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$MediaDevice;->SCREEN_SHARING:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$MediaDevice;

    return-object p0

    :cond_0
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    .line 70
    :cond_1
    sget-object p0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$MediaDevice;->CAMERA:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$MediaDevice;

    return-object p0

    .line 71
    :cond_2
    sget-object p0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$MediaDevice;->MICROPHONE:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$MediaDevice;

    return-object p0
.end method

.method public static final a(Z)Lio/trtc/tuikit/atomicxcore/api/device/DeviceStatus;
    .locals 0

    if-eqz p0, :cond_0

    .line 67
    sget-object p0, Lio/trtc/tuikit/atomicxcore/api/device/DeviceStatus;->ON:Lio/trtc/tuikit/atomicxcore/api/device/DeviceStatus;

    return-object p0

    :cond_0
    sget-object p0, Lio/trtc/tuikit/atomicxcore/api/device/DeviceStatus;->OFF:Lio/trtc/tuikit/atomicxcore/api/device/DeviceStatus;

    return-object p0
.end method

.method public static final a(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$Request;)Lio/trtc/tuikit/atomicxcore/api/room/DeviceRequestInfo;
    .locals 10

    const-string v0, "request"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 43
    iget-object v0, p0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$Request;->requestAction:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RequestAction;

    if-nez v0, :cond_0

    const/4 v0, -0x1

    goto :goto_0

    :cond_0
    sget-object v1, Lio/trtc/tuikit/atomicxcore/impl/room/l0;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    :goto_0
    const/4 v1, 0x1

    if-eq v0, v1, :cond_5

    const/4 v1, 0x2

    if-eq v0, v1, :cond_4

    const/4 v1, 0x3

    if-eq v0, v1, :cond_3

    const/4 v1, 0x4

    if-eq v0, v1, :cond_2

    const/4 v1, 0x5

    if-eq v0, v1, :cond_1

    .line 44
    sget-object v0, Lio/trtc/tuikit/atomicxcore/api/device/DeviceType;->MICROPHONE:Lio/trtc/tuikit/atomicxcore/api/device/DeviceType;

    :goto_1
    move-object v9, v0

    goto :goto_2

    .line 45
    :cond_1
    sget-object v0, Lio/trtc/tuikit/atomicxcore/api/device/DeviceType;->SCREEN_SHARE:Lio/trtc/tuikit/atomicxcore/api/device/DeviceType;

    goto :goto_1

    .line 46
    :cond_2
    sget-object v0, Lio/trtc/tuikit/atomicxcore/api/device/DeviceType;->MICROPHONE:Lio/trtc/tuikit/atomicxcore/api/device/DeviceType;

    goto :goto_1

    .line 47
    :cond_3
    sget-object v0, Lio/trtc/tuikit/atomicxcore/api/device/DeviceType;->MICROPHONE:Lio/trtc/tuikit/atomicxcore/api/device/DeviceType;

    goto :goto_1

    .line 48
    :cond_4
    sget-object v0, Lio/trtc/tuikit/atomicxcore/api/device/DeviceType;->CAMERA:Lio/trtc/tuikit/atomicxcore/api/device/DeviceType;

    goto :goto_1

    .line 49
    :cond_5
    sget-object v0, Lio/trtc/tuikit/atomicxcore/api/device/DeviceType;->CAMERA:Lio/trtc/tuikit/atomicxcore/api/device/DeviceType;

    goto :goto_1

    .line 50
    :goto_2
    iget-object v0, p0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$Request;->fromUser:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;

    iget-object v4, v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;->userId:Ljava/lang/String;

    .line 51
    iget-object v5, v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;->userName:Ljava/lang/String;

    .line 52
    iget-object v6, v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;->nameCard:Ljava/lang/String;

    .line 53
    iget-object v7, v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;->avatarUrl:Ljava/lang/String;

    .line 54
    iget-object v8, p0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$Request;->content:Ljava/lang/String;

    .line 55
    iget-wide v2, p0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$Request;->timestamp:J

    .line 56
    new-instance v1, Lio/trtc/tuikit/atomicxcore/api/room/DeviceRequestInfo;

    .line 57
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 58
    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 59
    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 60
    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 61
    invoke-static {v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 62
    invoke-direct/range {v1 .. v9}, Lio/trtc/tuikit/atomicxcore/api/room/DeviceRequestInfo;-><init>(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/device/DeviceType;)V

    return-object v1
.end method

.method public static final a(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$Role;)Lio/trtc/tuikit/atomicxcore/api/room/ParticipantRole;
    .locals 1

    const-string v0, "role"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 63
    sget-object v0, Lio/trtc/tuikit/atomicxcore/impl/room/l0;->b:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    if-eq p0, v0, :cond_2

    const/4 v0, 0x2

    if-eq p0, v0, :cond_1

    const/4 v0, 0x3

    if-ne p0, v0, :cond_0

    .line 64
    sget-object p0, Lio/trtc/tuikit/atomicxcore/api/room/ParticipantRole;->GENERAL_USER:Lio/trtc/tuikit/atomicxcore/api/room/ParticipantRole;

    return-object p0

    :cond_0
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    .line 65
    :cond_1
    sget-object p0, Lio/trtc/tuikit/atomicxcore/api/room/ParticipantRole;->ADMIN:Lio/trtc/tuikit/atomicxcore/api/room/ParticipantRole;

    return-object p0

    .line 66
    :cond_2
    sget-object p0, Lio/trtc/tuikit/atomicxcore/api/room/ParticipantRole;->OWNER:Lio/trtc/tuikit/atomicxcore/api/room/ParticipantRole;

    return-object p0
.end method

.method public static final a(Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceInvitationManager$Invitation;)Lio/trtc/tuikit/atomicxcore/api/room/RoomCall;
    .locals 4

    const-string v0, "invitation"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 114
    new-instance v0, Lio/trtc/tuikit/atomicxcore/api/room/RoomCall;

    .line 115
    iget-object v1, p0, Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceInvitationManager$Invitation;->inviter:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;

    const-string v2, "inviter"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1}, Lio/trtc/tuikit/atomicxcore/impl/room/m0;->a(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;)Lio/trtc/tuikit/atomicxcore/api/room/RoomUser;

    move-result-object v1

    .line 116
    iget-object v2, p0, Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceInvitationManager$Invitation;->invitee:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;

    const-string v3, "invitee"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2}, Lio/trtc/tuikit/atomicxcore/impl/room/m0;->a(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;)Lio/trtc/tuikit/atomicxcore/api/room/RoomUser;

    move-result-object v2

    .line 117
    iget-object p0, p0, Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceInvitationManager$Invitation;->status:Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceInvitationManager$InvitationStatus;

    const-string/jumbo v3, "status"

    invoke-static {p0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 118
    invoke-static {p0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 119
    sget-object v3, Lio/trtc/tuikit/atomicxcore/impl/room/l0;->f:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v3, p0

    const/4 v3, 0x1

    if-eq p0, v3, :cond_2

    const/4 v3, 0x2

    if-eq p0, v3, :cond_1

    const/4 v3, 0x3

    if-eq p0, v3, :cond_0

    .line 120
    sget-object p0, Lio/trtc/tuikit/atomicxcore/api/room/RoomCallStatus;->NONE:Lio/trtc/tuikit/atomicxcore/api/room/RoomCallStatus;

    goto :goto_0

    .line 121
    :cond_0
    sget-object p0, Lio/trtc/tuikit/atomicxcore/api/room/RoomCallStatus;->REJECTED:Lio/trtc/tuikit/atomicxcore/api/room/RoomCallStatus;

    goto :goto_0

    .line 122
    :cond_1
    sget-object p0, Lio/trtc/tuikit/atomicxcore/api/room/RoomCallStatus;->TIMEOUT:Lio/trtc/tuikit/atomicxcore/api/room/RoomCallStatus;

    goto :goto_0

    .line 123
    :cond_2
    sget-object p0, Lio/trtc/tuikit/atomicxcore/api/room/RoomCallStatus;->CALLING:Lio/trtc/tuikit/atomicxcore/api/room/RoomCallStatus;

    .line 124
    :goto_0
    invoke-direct {v0, v1, v2, p0}, Lio/trtc/tuikit/atomicxcore/api/room/RoomCall;-><init>(Lio/trtc/tuikit/atomicxcore/api/room/RoomUser;Lio/trtc/tuikit/atomicxcore/api/room/RoomUser;Lio/trtc/tuikit/atomicxcore/api/room/RoomCallStatus;)V

    return-object v0
.end method

.method public static final a(Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$ConferenceInfo;)Lio/trtc/tuikit/atomicxcore/api/room/RoomInfo;
    .locals 25

    move-object/from16 v0, p0

    const-string v1, "conferenceInfo"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 72
    iget-object v1, v0, Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$ConferenceInfo;->status:Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$ConferenceStatus;

    const-string/jumbo v2, "status"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 73
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 74
    sget-object v2, Lio/trtc/tuikit/atomicxcore/impl/room/l0;->g:[I

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v1, v2, v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    .line 75
    sget-object v1, Lio/trtc/tuikit/atomicxcore/api/room/RoomStatus;->RUNNING:Lio/trtc/tuikit/atomicxcore/api/room/RoomStatus;

    goto :goto_0

    .line 76
    :cond_0
    sget-object v1, Lio/trtc/tuikit/atomicxcore/api/room/RoomStatus;->SCHEDULED:Lio/trtc/tuikit/atomicxcore/api/room/RoomStatus;

    .line 77
    :goto_0
    iget-object v2, v0, Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$ConferenceInfo;->basicRoomInfo:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;

    const-string v3, "basicRoomInfo"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/room/m0;->a(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;Lio/trtc/tuikit/atomicxcore/api/room/RoomStatus;)Lio/trtc/tuikit/atomicxcore/api/room/RoomInfo;

    move-result-object v4

    .line 78
    iget-wide v12, v0, Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$ConferenceInfo;->scheduleStartTime:J

    .line 79
    iget-wide v14, v0, Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$ConferenceInfo;->scheduleEndTime:J

    .line 80
    iget v0, v0, Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$ConferenceInfo;->reminderSecondsBeforeStart:I

    const/16 v23, 0x7e3f

    const/16 v24, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    move/from16 v16, v0

    .line 81
    invoke-static/range {v4 .. v24}, Lio/trtc/tuikit/atomicxcore/api/room/RoomInfo;->copy$default(Lio/trtc/tuikit/atomicxcore/api/room/RoomInfo;Ljava/lang/String;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/room/RoomUser;IJLio/trtc/tuikit/atomicxcore/api/room/RoomStatus;JJILjava/util/List;Ljava/lang/String;ZZZZILjava/lang/Object;)Lio/trtc/tuikit/atomicxcore/api/room/RoomInfo;

    move-result-object v0

    return-object v0
.end method

.method public static final a(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;Lio/trtc/tuikit/atomicxcore/api/room/RoomStatus;)Lio/trtc/tuikit/atomicxcore/api/room/RoomInfo;
    .locals 23

    move-object/from16 v0, p0

    const-string v1, "roomInfo"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "roomStatus"

    move-object/from16 v9, p1

    invoke-static {v9, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 82
    iget-object v3, v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;->roomId:Ljava/lang/String;

    .line 83
    iget-object v4, v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;->name:Ljava/lang/String;

    .line 84
    new-instance v5, Lio/trtc/tuikit/atomicxcore/api/room/RoomUser;

    .line 85
    iget-object v1, v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;->ownerId:Ljava/lang/String;

    const-string v2, "ownerId"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 86
    iget-object v2, v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;->ownerName:Ljava/lang/String;

    const-string v6, "ownerName"

    invoke-static {v2, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 87
    iget-object v6, v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;->ownerAvatarUrl:Ljava/lang/String;

    const-string v7, "ownerAvatarUrl"

    invoke-static {v6, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 88
    invoke-direct {v5, v1, v2, v6}, Lio/trtc/tuikit/atomicxcore/api/room/RoomUser;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 89
    iget v6, v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;->memberCount:I

    .line 90
    iget-wide v7, v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;->createTime:J

    .line 91
    iget-object v1, v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;->password:Ljava/lang/String;

    .line 92
    iget-boolean v2, v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;->isMicrophoneDisableForAllUser:Z

    .line 93
    iget-boolean v10, v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;->isCameraDisableForAllUser:Z

    .line 94
    iget-boolean v11, v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;->isScreenShareDisableForAllUser:Z

    .line 95
    iget-boolean v0, v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;->isMessageDisableForAllUser:Z

    move/from16 v17, v2

    .line 96
    new-instance v2, Lio/trtc/tuikit/atomicxcore/api/room/RoomInfo;

    .line 97
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 98
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    const/16 v21, 0x3c0

    const/16 v22, 0x0

    move/from16 v18, v10

    move/from16 v20, v11

    const-wide/16 v10, 0x0

    const-wide/16 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    move/from16 v19, v0

    move-object/from16 v16, v1

    .line 99
    invoke-direct/range {v2 .. v22}, Lio/trtc/tuikit/atomicxcore/api/room/RoomInfo;-><init>(Ljava/lang/String;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/room/RoomUser;IJLio/trtc/tuikit/atomicxcore/api/room/RoomStatus;JJILjava/util/List;Ljava/lang/String;ZZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v2
.end method

.method public static final a(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceInvitationManager$InvitationStatus;)Lio/trtc/tuikit/atomicxcore/api/room/RoomParticipant;
    .locals 13

    const-string/jumbo v0, "userInfo"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "invitationStatus"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    iget-object v2, p0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;->userId:Ljava/lang/String;

    .line 18
    iget-object v3, p0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;->userName:Ljava/lang/String;

    .line 19
    iget-object v4, p0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;->avatarUrl:Ljava/lang/String;

    .line 20
    iget-object v5, p0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;->nameCard:Ljava/lang/String;

    .line 21
    iget-object v0, p0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;->userRole:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$Role;

    const-string/jumbo v1, "userRole"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lio/trtc/tuikit/atomicxcore/impl/room/m0;->a(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$Role;)Lio/trtc/tuikit/atomicxcore/api/room/ParticipantRole;

    move-result-object v6

    .line 22
    const-string/jumbo v0, "status"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    sget-object v0, Lio/trtc/tuikit/atomicxcore/impl/room/l0;->f:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_2

    const/4 v0, 0x2

    if-eq p1, v0, :cond_1

    const/4 v0, 0x3

    if-eq p1, v0, :cond_0

    .line 24
    sget-object p1, Lio/trtc/tuikit/atomicxcore/api/room/RoomParticipantStatus;->IN_ROOM:Lio/trtc/tuikit/atomicxcore/api/room/RoomParticipantStatus;

    :goto_0
    move-object v7, p1

    goto :goto_1

    .line 25
    :cond_0
    sget-object p1, Lio/trtc/tuikit/atomicxcore/api/room/RoomParticipantStatus;->CALL_REJECTED:Lio/trtc/tuikit/atomicxcore/api/room/RoomParticipantStatus;

    goto :goto_0

    .line 26
    :cond_1
    sget-object p1, Lio/trtc/tuikit/atomicxcore/api/room/RoomParticipantStatus;->CALL_TIMEOUT:Lio/trtc/tuikit/atomicxcore/api/room/RoomParticipantStatus;

    goto :goto_0

    .line 27
    :cond_2
    sget-object p1, Lio/trtc/tuikit/atomicxcore/api/room/RoomParticipantStatus;->IN_CALLING:Lio/trtc/tuikit/atomicxcore/api/room/RoomParticipantStatus;

    goto :goto_0

    .line 28
    :goto_1
    iget-object p1, p0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;->roomCustomInfo:Ljava/util/HashMap;

    if-nez p1, :cond_3

    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    :cond_3
    move-object v12, p1

    .line 29
    iget-boolean p1, p0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;->hasAudioStream:Z

    invoke-static {p1}, Lio/trtc/tuikit/atomicxcore/impl/room/m0;->a(Z)Lio/trtc/tuikit/atomicxcore/api/device/DeviceStatus;

    move-result-object v8

    .line 30
    iget-boolean p1, p0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;->hasVideoStream:Z

    invoke-static {p1}, Lio/trtc/tuikit/atomicxcore/impl/room/m0;->a(Z)Lio/trtc/tuikit/atomicxcore/api/device/DeviceStatus;

    move-result-object v9

    .line 31
    iget-boolean p1, p0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;->hasScreenStream:Z

    invoke-static {p1}, Lio/trtc/tuikit/atomicxcore/impl/room/m0;->a(Z)Lio/trtc/tuikit/atomicxcore/api/device/DeviceStatus;

    move-result-object v10

    .line 32
    iget-boolean v11, p0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;->isMessageDisabled:Z

    .line 33
    new-instance v1, Lio/trtc/tuikit/atomicxcore/api/room/RoomParticipant;

    .line 34
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 35
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 36
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 37
    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 38
    invoke-direct/range {v1 .. v12}, Lio/trtc/tuikit/atomicxcore/api/room/RoomParticipant;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/room/ParticipantRole;Lio/trtc/tuikit/atomicxcore/api/room/RoomParticipantStatus;Lio/trtc/tuikit/atomicxcore/api/device/DeviceStatus;Lio/trtc/tuikit/atomicxcore/api/device/DeviceStatus;Lio/trtc/tuikit/atomicxcore/api/device/DeviceStatus;ZLjava/util/Map;)V

    return-object v1
.end method

.method public static final a(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;Lio/trtc/tuikit/atomicxcore/api/room/RoomParticipantStatus;)Lio/trtc/tuikit/atomicxcore/api/room/RoomParticipant;
    .locals 13

    const-string/jumbo v0, "userInfo"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "roomStatus"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object v2, p0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;->userId:Ljava/lang/String;

    .line 2
    iget-object v3, p0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;->userName:Ljava/lang/String;

    .line 3
    iget-object v4, p0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;->avatarUrl:Ljava/lang/String;

    .line 4
    iget-object v5, p0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;->nameCard:Ljava/lang/String;

    .line 5
    iget-object v0, p0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;->userRole:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$Role;

    const-string/jumbo v1, "userRole"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lio/trtc/tuikit/atomicxcore/impl/room/m0;->a(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$Role;)Lio/trtc/tuikit/atomicxcore/api/room/ParticipantRole;

    move-result-object v6

    .line 6
    iget-object v0, p0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;->roomCustomInfo:Ljava/util/HashMap;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    :cond_0
    move-object v12, v0

    .line 7
    iget-boolean v0, p0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;->hasAudioStream:Z

    invoke-static {v0}, Lio/trtc/tuikit/atomicxcore/impl/room/m0;->a(Z)Lio/trtc/tuikit/atomicxcore/api/device/DeviceStatus;

    move-result-object v8

    .line 8
    iget-boolean v0, p0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;->hasVideoStream:Z

    invoke-static {v0}, Lio/trtc/tuikit/atomicxcore/impl/room/m0;->a(Z)Lio/trtc/tuikit/atomicxcore/api/device/DeviceStatus;

    move-result-object v9

    .line 9
    iget-boolean v0, p0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;->hasScreenStream:Z

    invoke-static {v0}, Lio/trtc/tuikit/atomicxcore/impl/room/m0;->a(Z)Lio/trtc/tuikit/atomicxcore/api/device/DeviceStatus;

    move-result-object v10

    .line 10
    iget-boolean v11, p0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;->isMessageDisabled:Z

    .line 11
    new-instance v1, Lio/trtc/tuikit/atomicxcore/api/room/RoomParticipant;

    .line 12
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 13
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 14
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 15
    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    move-object v7, p1

    .line 16
    invoke-direct/range {v1 .. v12}, Lio/trtc/tuikit/atomicxcore/api/room/RoomParticipant;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/room/ParticipantRole;Lio/trtc/tuikit/atomicxcore/api/room/RoomParticipantStatus;Lio/trtc/tuikit/atomicxcore/api/device/DeviceStatus;Lio/trtc/tuikit/atomicxcore/api/device/DeviceStatus;Lio/trtc/tuikit/atomicxcore/api/device/DeviceStatus;ZLjava/util/Map;)V

    return-object v1
.end method

.method public static final a(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;)Lio/trtc/tuikit/atomicxcore/api/room/RoomUser;
    .locals 7

    const-string/jumbo v0, "userInfo"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 39
    new-instance v1, Lio/trtc/tuikit/atomicxcore/api/room/RoomUser;

    const/4 v5, 0x7

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v1 .. v6}, Lio/trtc/tuikit/atomicxcore/api/room/RoomUser;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 40
    iget-object v0, p0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;->userId:Ljava/lang/String;

    const-string/jumbo v2, "userId"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Lio/trtc/tuikit/atomicxcore/api/room/RoomUser;->setUserID(Ljava/lang/String;)V

    .line 41
    iget-object v0, p0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;->userName:Ljava/lang/String;

    const-string/jumbo v2, "userName"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Lio/trtc/tuikit/atomicxcore/api/room/RoomUser;->setUserName(Ljava/lang/String;)V

    .line 42
    iget-object p0, p0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;->avatarUrl:Ljava/lang/String;

    const-string v0, "avatarUrl"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Lio/trtc/tuikit/atomicxcore/api/room/RoomUser;->setAvatarURL(Ljava/lang/String;)V

    return-object v1
.end method
