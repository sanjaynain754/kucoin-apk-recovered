.class public final Lio/trtc/tuikit/atomicxcore/impl/room/y0;
.super Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceInvitationManager$Observer;
.source "SourceFile"


# instance fields
.field public final synthetic a:Lio/trtc/tuikit/atomicxcore/impl/room/T0;


# direct methods
.method public constructor <init>(Lio/trtc/tuikit/atomicxcore/impl/room/T0;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/room/y0;->a:Lio/trtc/tuikit/atomicxcore/impl/room/T0;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceInvitationManager$Observer;-><init>()V

    .line 6
    return-void
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
.end method


# virtual methods
.method public final onInvitationAccepted(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceInvitationManager$Invitation;)V
    .locals 2

    .line 1
    .line 2
    const-string v0, "roomInfo"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "invitation"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/room/y0;->a:Lio/trtc/tuikit/atomicxcore/impl/room/T0;

    .line 13
    .line 14
    iget-object v0, v0, Lio/trtc/tuikit/atomicxcore/impl/room/T0;->i:Lio/trtc/tuikit/atomicxcore/impl/common/q;

    .line 15
    .line 16
    new-instance v1, Lio/trtc/tuikit/atomicxcore/impl/room/r0;

    .line 17
    .line 18
    .line 19
    invoke-direct {v1, p1, p2}, Lio/trtc/tuikit/atomicxcore/impl/room/r0;-><init>(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceInvitationManager$Invitation;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v1}, Lio/trtc/tuikit/atomicxcore/impl/common/q;->a(Lkotlin/jvm/functions/Function1;)V

    .line 23
    return-void
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
.end method

.method public final onInvitationCancelled(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceInvitationManager$Invitation;)V
    .locals 2

    .line 1
    .line 2
    const-string v0, "roomInfo"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "invitation"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/room/y0;->a:Lio/trtc/tuikit/atomicxcore/impl/room/T0;

    .line 13
    .line 14
    iget-object v0, v0, Lio/trtc/tuikit/atomicxcore/impl/room/T0;->i:Lio/trtc/tuikit/atomicxcore/impl/common/q;

    .line 15
    .line 16
    new-instance v1, Lio/trtc/tuikit/atomicxcore/impl/room/s0;

    .line 17
    .line 18
    .line 19
    invoke-direct {v1, p1, p2}, Lio/trtc/tuikit/atomicxcore/impl/room/s0;-><init>(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceInvitationManager$Invitation;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v1}, Lio/trtc/tuikit/atomicxcore/impl/common/q;->a(Lkotlin/jvm/functions/Function1;)V

    .line 23
    return-void
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
.end method

.method public final onInvitationHandledByOtherDevice(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;Z)V
    .locals 2

    .line 1
    .line 2
    const-string v0, "roomInfo"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/room/y0;->a:Lio/trtc/tuikit/atomicxcore/impl/room/T0;

    .line 8
    .line 9
    iget-object v0, v0, Lio/trtc/tuikit/atomicxcore/impl/room/T0;->i:Lio/trtc/tuikit/atomicxcore/impl/common/q;

    .line 10
    .line 11
    new-instance v1, Lio/trtc/tuikit/atomicxcore/impl/room/t0;

    .line 12
    .line 13
    .line 14
    invoke-direct {v1, p1, p2}, Lio/trtc/tuikit/atomicxcore/impl/room/t0;-><init>(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;Z)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1}, Lio/trtc/tuikit/atomicxcore/impl/common/q;->a(Lkotlin/jvm/functions/Function1;)V

    .line 18
    return-void
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
.end method

.method public final onInvitationRejected(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceInvitationManager$Invitation;Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceInvitationManager$RejectedReason;)V
    .locals 2

    .line 1
    .line 2
    const-string v0, "roomInfo"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "invitation"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    const-string v0, "reason"

    .line 13
    .line 14
    .line 15
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/room/y0;->a:Lio/trtc/tuikit/atomicxcore/impl/room/T0;

    .line 18
    .line 19
    iget-object v0, v0, Lio/trtc/tuikit/atomicxcore/impl/room/T0;->i:Lio/trtc/tuikit/atomicxcore/impl/common/q;

    .line 20
    .line 21
    new-instance v1, Lio/trtc/tuikit/atomicxcore/impl/room/u0;

    .line 22
    .line 23
    .line 24
    invoke-direct {v1, p1, p2, p3}, Lio/trtc/tuikit/atomicxcore/impl/room/u0;-><init>(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceInvitationManager$Invitation;Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceInvitationManager$RejectedReason;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, v1}, Lio/trtc/tuikit/atomicxcore/impl/common/q;->a(Lkotlin/jvm/functions/Function1;)V

    .line 28
    return-void
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
.end method

.method public final onInvitationRevokedByAdmin(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceInvitationManager$Invitation;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;)V
    .locals 2

    .line 1
    .line 2
    const-string v0, "roomInfo"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "invitation"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    const-string v0, "admin"

    .line 13
    .line 14
    .line 15
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/room/y0;->a:Lio/trtc/tuikit/atomicxcore/impl/room/T0;

    .line 18
    .line 19
    iget-object v0, v0, Lio/trtc/tuikit/atomicxcore/impl/room/T0;->i:Lio/trtc/tuikit/atomicxcore/impl/common/q;

    .line 20
    .line 21
    new-instance v1, Lio/trtc/tuikit/atomicxcore/impl/room/v0;

    .line 22
    .line 23
    .line 24
    invoke-direct {v1, p1, p2, p3}, Lio/trtc/tuikit/atomicxcore/impl/room/v0;-><init>(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceInvitationManager$Invitation;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, v1}, Lio/trtc/tuikit/atomicxcore/impl/common/q;->a(Lkotlin/jvm/functions/Function1;)V

    .line 28
    return-void
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
.end method

.method public final onInvitationTimeout(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceInvitationManager$Invitation;)V
    .locals 2

    .line 1
    .line 2
    const-string v0, "roomInfo"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "invitation"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/room/y0;->a:Lio/trtc/tuikit/atomicxcore/impl/room/T0;

    .line 13
    .line 14
    iget-object v0, v0, Lio/trtc/tuikit/atomicxcore/impl/room/T0;->i:Lio/trtc/tuikit/atomicxcore/impl/common/q;

    .line 15
    .line 16
    new-instance v1, Lio/trtc/tuikit/atomicxcore/impl/room/w0;

    .line 17
    .line 18
    .line 19
    invoke-direct {v1, p1, p2}, Lio/trtc/tuikit/atomicxcore/impl/room/w0;-><init>(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceInvitationManager$Invitation;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v1}, Lio/trtc/tuikit/atomicxcore/impl/common/q;->a(Lkotlin/jvm/functions/Function1;)V

    .line 23
    return-void
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
.end method

.method public final onReceiveInvitation(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceInvitationManager$Invitation;Ljava/lang/String;)V
    .locals 2

    .line 1
    .line 2
    const-string v0, "roomInfo"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "invitation"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    const-string v0, "extensionInfo"

    .line 13
    .line 14
    .line 15
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/room/y0;->a:Lio/trtc/tuikit/atomicxcore/impl/room/T0;

    .line 18
    .line 19
    iget-object v0, v0, Lio/trtc/tuikit/atomicxcore/impl/room/T0;->i:Lio/trtc/tuikit/atomicxcore/impl/common/q;

    .line 20
    .line 21
    new-instance v1, Lio/trtc/tuikit/atomicxcore/impl/room/x0;

    .line 22
    .line 23
    .line 24
    invoke-direct {v1, p1, p2, p3}, Lio/trtc/tuikit/atomicxcore/impl/room/x0;-><init>(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceInvitationManager$Invitation;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, v1}, Lio/trtc/tuikit/atomicxcore/impl/common/q;->a(Lkotlin/jvm/functions/Function1;)V

    .line 28
    return-void
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
.end method
