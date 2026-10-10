.class public final Lio/trtc/tuikit/atomicxcore/impl/live/X;
.super Lcom/tencent/cloud/tuikit/engine/extension/TUILiveConnectionManager$Observer;
.source "SourceFile"


# instance fields
.field public final synthetic a:Lio/trtc/tuikit/atomicxcore/impl/live/c0;


# direct methods
.method public constructor <init>(Lio/trtc/tuikit/atomicxcore/impl/live/c0;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/live/X;->a:Lio/trtc/tuikit/atomicxcore/impl/live/c0;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveConnectionManager$Observer;-><init>()V

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
.method public final onConnectionRequestAccept(Lcom/tencent/cloud/tuikit/engine/extension/TUILiveConnectionManager$ConnectionUser;)V
    .locals 6

    .line 1
    .line 2
    const-string v0, "invitee"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/live/X;->a:Lio/trtc/tuikit/atomicxcore/impl/live/c0;

    .line 8
    .line 9
    iget-object v0, v0, Lio/trtc/tuikit/atomicxcore/impl/live/c0;->g:Lkotlinx/coroutines/flow/n;

    .line 10
    .line 11
    .line 12
    invoke-interface {v0}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    .line 13
    move-result-object v1

    .line 14
    .line 15
    check-cast v1, Ljava/lang/Iterable;

    .line 16
    .line 17
    new-instance v2, Ljava/util/ArrayList;

    .line 18
    .line 19
    .line 20
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 21
    .line 22
    .line 23
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 24
    move-result-object v1

    .line 25
    .line 26
    .line 27
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 28
    move-result v3

    .line 29
    .line 30
    if-eqz v3, :cond_1

    .line 31
    .line 32
    .line 33
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 34
    move-result-object v3

    .line 35
    move-object v4, v3

    .line 36
    .line 37
    check-cast v4, Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v4}, Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;->getLiveID()Ljava/lang/String;

    .line 41
    move-result-object v4

    .line 42
    .line 43
    iget-object v5, p1, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveConnectionManager$ConnectionUser;->roomId:Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 47
    move-result v4

    .line 48
    .line 49
    if-nez v4, :cond_0

    .line 50
    .line 51
    .line 52
    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 53
    goto :goto_0

    .line 54
    .line 55
    .line 56
    :cond_1
    invoke-interface {v0, v2}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 57
    .line 58
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/live/X;->a:Lio/trtc/tuikit/atomicxcore/impl/live/c0;

    .line 59
    .line 60
    iget-object v0, v0, Lio/trtc/tuikit/atomicxcore/impl/live/c0;->i:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 61
    .line 62
    const-string v1, "message"

    .line 63
    const/4 v2, 0x0

    .line 64
    .line 65
    const-string v3, "Listener: onCoHostRequestAccepted called"

    .line 66
    .line 67
    .line 68
    invoke-static {v0, v3, v1, v2, v3}, Lio/trtc/tuikit/atomicxcore/impl/barrage/b;->a(Lio/trtc/tuikit/atomicxcore/impl/common/r;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V

    .line 69
    .line 70
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/live/X;->a:Lio/trtc/tuikit/atomicxcore/impl/live/c0;

    .line 71
    .line 72
    iget-object v0, v0, Lio/trtc/tuikit/atomicxcore/impl/live/c0;->j:Lio/trtc/tuikit/atomicxcore/impl/common/q;

    .line 73
    .line 74
    new-instance v1, Lio/trtc/tuikit/atomicxcore/impl/live/P;

    .line 75
    .line 76
    .line 77
    invoke-direct {v1, p1}, Lio/trtc/tuikit/atomicxcore/impl/live/P;-><init>(Lcom/tencent/cloud/tuikit/engine/extension/TUILiveConnectionManager$ConnectionUser;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v0, v1}, Lio/trtc/tuikit/atomicxcore/impl/common/q;->a(Lkotlin/jvm/functions/Function1;)V

    .line 81
    return-void
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
.end method

.method public final onConnectionRequestCancelled(Lcom/tencent/cloud/tuikit/engine/extension/TUILiveConnectionManager$ConnectionUser;)V
    .locals 17

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    move-object/from16 v1, p1

    .line 5
    .line 6
    iget-object v2, v0, Lio/trtc/tuikit/atomicxcore/impl/live/X;->a:Lio/trtc/tuikit/atomicxcore/impl/live/c0;

    .line 7
    .line 8
    iget-object v2, v2, Lio/trtc/tuikit/atomicxcore/impl/live/c0;->h:Lkotlinx/coroutines/flow/n;

    .line 9
    const/4 v3, 0x0

    .line 10
    .line 11
    .line 12
    invoke-interface {v2, v3}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    invoke-static {}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;->getSelfInfo()Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$LoginUserInfo;

    .line 16
    move-result-object v2

    .line 17
    .line 18
    iget-object v3, v0, Lio/trtc/tuikit/atomicxcore/impl/live/X;->a:Lio/trtc/tuikit/atomicxcore/impl/live/c0;

    .line 19
    .line 20
    iget-object v9, v3, Lio/trtc/tuikit/atomicxcore/impl/live/c0;->a:Ljava/lang/String;

    .line 21
    .line 22
    iget-object v5, v2, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$LoginUserInfo;->userId:Ljava/lang/String;

    .line 23
    .line 24
    iget-object v6, v2, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$LoginUserInfo;->userName:Ljava/lang/String;

    .line 25
    .line 26
    iget-object v7, v2, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$LoginUserInfo;->avatarUrl:Ljava/lang/String;

    .line 27
    .line 28
    new-instance v4, Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;

    .line 29
    .line 30
    .line 31
    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 38
    .line 39
    const/16 v15, 0x3e8

    .line 40
    .line 41
    const/16 v16, 0x0

    .line 42
    const/4 v8, 0x0

    .line 43
    const/4 v10, 0x0

    .line 44
    const/4 v11, 0x0

    .line 45
    const/4 v12, 0x0

    .line 46
    const/4 v13, 0x0

    .line 47
    const/4 v14, 0x0

    .line 48
    .line 49
    .line 50
    invoke-direct/range {v4 .. v16}, Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/live/Role;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/device/DeviceStatus;ZLio/trtc/tuikit/atomicxcore/api/device/DeviceStatus;ZLio/trtc/tuikit/atomicxcore/api/live/SuspendStatus;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 51
    .line 52
    if-eqz v1, :cond_0

    .line 53
    .line 54
    iget-object v2, v0, Lio/trtc/tuikit/atomicxcore/impl/live/X;->a:Lio/trtc/tuikit/atomicxcore/impl/live/c0;

    .line 55
    .line 56
    iget-object v3, v2, Lio/trtc/tuikit/atomicxcore/impl/live/c0;->i:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 57
    .line 58
    const-string v5, "message"

    .line 59
    const/4 v6, 0x0

    .line 60
    .line 61
    const-string v7, "Listener: onCoHostRequestCancelled called"

    .line 62
    .line 63
    .line 64
    invoke-static {v3, v7, v5, v6, v7}, Lio/trtc/tuikit/atomicxcore/impl/barrage/b;->a(Lio/trtc/tuikit/atomicxcore/impl/common/r;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V

    .line 65
    .line 66
    iget-object v2, v2, Lio/trtc/tuikit/atomicxcore/impl/live/c0;->j:Lio/trtc/tuikit/atomicxcore/impl/common/q;

    .line 67
    .line 68
    new-instance v3, Lio/trtc/tuikit/atomicxcore/impl/live/Q;

    .line 69
    .line 70
    .line 71
    invoke-direct {v3, v1, v4}, Lio/trtc/tuikit/atomicxcore/impl/live/Q;-><init>(Lcom/tencent/cloud/tuikit/engine/extension/TUILiveConnectionManager$ConnectionUser;Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v2, v3}, Lio/trtc/tuikit/atomicxcore/impl/common/q;->a(Lkotlin/jvm/functions/Function1;)V

    .line 75
    :cond_0
    return-void
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
.end method

.method public final onConnectionRequestReceived(Lcom/tencent/cloud/tuikit/engine/extension/TUILiveConnectionManager$ConnectionUser;Ljava/util/List;Ljava/lang/String;)V
    .locals 3

    .line 1
    .line 2
    const-string v0, "inviter"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "inviteeList"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    const-string p2, "extensionInfo"

    .line 13
    .line 14
    .line 15
    invoke-static {p3, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    iget-object p2, p0, Lio/trtc/tuikit/atomicxcore/impl/live/X;->a:Lio/trtc/tuikit/atomicxcore/impl/live/c0;

    .line 18
    .line 19
    iget-object p2, p2, Lio/trtc/tuikit/atomicxcore/impl/live/c0;->h:Lkotlinx/coroutines/flow/n;

    .line 20
    .line 21
    .line 22
    invoke-static {p1}, Lio/trtc/tuikit/atomicxcore/impl/live/P0;->a(Lcom/tencent/cloud/tuikit/engine/extension/TUILiveConnectionManager$ConnectionUser;)Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;

    .line 23
    move-result-object v0

    .line 24
    .line 25
    .line 26
    invoke-interface {p2, v0}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 27
    .line 28
    iget-object p2, p0, Lio/trtc/tuikit/atomicxcore/impl/live/X;->a:Lio/trtc/tuikit/atomicxcore/impl/live/c0;

    .line 29
    .line 30
    iget-object p2, p2, Lio/trtc/tuikit/atomicxcore/impl/live/c0;->i:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 31
    .line 32
    const-string v0, "message"

    .line 33
    const/4 v1, 0x0

    .line 34
    .line 35
    const-string v2, "Listener: onCoHostRequestReceived called"

    .line 36
    .line 37
    .line 38
    invoke-static {p2, v2, v0, v1, v2}, Lio/trtc/tuikit/atomicxcore/impl/barrage/b;->a(Lio/trtc/tuikit/atomicxcore/impl/common/r;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V

    .line 39
    .line 40
    iget-object p2, p0, Lio/trtc/tuikit/atomicxcore/impl/live/X;->a:Lio/trtc/tuikit/atomicxcore/impl/live/c0;

    .line 41
    .line 42
    iget-object p2, p2, Lio/trtc/tuikit/atomicxcore/impl/live/c0;->j:Lio/trtc/tuikit/atomicxcore/impl/common/q;

    .line 43
    .line 44
    new-instance v0, Lio/trtc/tuikit/atomicxcore/impl/live/S;

    .line 45
    .line 46
    .line 47
    invoke-direct {v0, p1, p3}, Lio/trtc/tuikit/atomicxcore/impl/live/S;-><init>(Lcom/tencent/cloud/tuikit/engine/extension/TUILiveConnectionManager$ConnectionUser;Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p2, v0}, Lio/trtc/tuikit/atomicxcore/impl/common/q;->a(Lkotlin/jvm/functions/Function1;)V

    .line 51
    return-void
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

.method public final onConnectionRequestReject(Lcom/tencent/cloud/tuikit/engine/extension/TUILiveConnectionManager$ConnectionUser;)V
    .locals 6

    .line 1
    .line 2
    const-string v0, "invitee"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/live/X;->a:Lio/trtc/tuikit/atomicxcore/impl/live/c0;

    .line 8
    .line 9
    iget-object v0, v0, Lio/trtc/tuikit/atomicxcore/impl/live/c0;->g:Lkotlinx/coroutines/flow/n;

    .line 10
    .line 11
    .line 12
    invoke-interface {v0}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    .line 13
    move-result-object v1

    .line 14
    .line 15
    check-cast v1, Ljava/lang/Iterable;

    .line 16
    .line 17
    new-instance v2, Ljava/util/ArrayList;

    .line 18
    .line 19
    .line 20
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 21
    .line 22
    .line 23
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 24
    move-result-object v1

    .line 25
    .line 26
    .line 27
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 28
    move-result v3

    .line 29
    .line 30
    if-eqz v3, :cond_1

    .line 31
    .line 32
    .line 33
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 34
    move-result-object v3

    .line 35
    move-object v4, v3

    .line 36
    .line 37
    check-cast v4, Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v4}, Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;->getLiveID()Ljava/lang/String;

    .line 41
    move-result-object v4

    .line 42
    .line 43
    iget-object v5, p1, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveConnectionManager$ConnectionUser;->roomId:Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 47
    move-result v4

    .line 48
    .line 49
    if-nez v4, :cond_0

    .line 50
    .line 51
    .line 52
    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 53
    goto :goto_0

    .line 54
    .line 55
    .line 56
    :cond_1
    invoke-interface {v0, v2}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 57
    .line 58
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/live/X;->a:Lio/trtc/tuikit/atomicxcore/impl/live/c0;

    .line 59
    .line 60
    iget-object v0, v0, Lio/trtc/tuikit/atomicxcore/impl/live/c0;->i:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 61
    .line 62
    const-string v1, "message"

    .line 63
    const/4 v2, 0x0

    .line 64
    .line 65
    const-string v3, "Listener: onCoHostRequestRejected called"

    .line 66
    .line 67
    .line 68
    invoke-static {v0, v3, v1, v2, v3}, Lio/trtc/tuikit/atomicxcore/impl/barrage/b;->a(Lio/trtc/tuikit/atomicxcore/impl/common/r;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V

    .line 69
    .line 70
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/live/X;->a:Lio/trtc/tuikit/atomicxcore/impl/live/c0;

    .line 71
    .line 72
    iget-object v0, v0, Lio/trtc/tuikit/atomicxcore/impl/live/c0;->j:Lio/trtc/tuikit/atomicxcore/impl/common/q;

    .line 73
    .line 74
    new-instance v1, Lio/trtc/tuikit/atomicxcore/impl/live/T;

    .line 75
    .line 76
    .line 77
    invoke-direct {v1, p1}, Lio/trtc/tuikit/atomicxcore/impl/live/T;-><init>(Lcom/tencent/cloud/tuikit/engine/extension/TUILiveConnectionManager$ConnectionUser;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v0, v1}, Lio/trtc/tuikit/atomicxcore/impl/common/q;->a(Lkotlin/jvm/functions/Function1;)V

    .line 81
    return-void
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
.end method

.method public final onConnectionRequestTimeout(Lcom/tencent/cloud/tuikit/engine/extension/TUILiveConnectionManager$ConnectionUser;Lcom/tencent/cloud/tuikit/engine/extension/TUILiveConnectionManager$ConnectionUser;)V
    .locals 6

    .line 1
    .line 2
    const-string v0, "inviter"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "invitee"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    iget-object v0, p1, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveConnectionManager$ConnectionUser;->roomId:Ljava/lang/String;

    .line 13
    .line 14
    iget-object v1, p0, Lio/trtc/tuikit/atomicxcore/impl/live/X;->a:Lio/trtc/tuikit/atomicxcore/impl/live/c0;

    .line 15
    .line 16
    iget-object v1, v1, Lio/trtc/tuikit/atomicxcore/impl/live/c0;->a:Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 20
    move-result v0

    .line 21
    .line 22
    if-eqz v0, :cond_2

    .line 23
    .line 24
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/live/X;->a:Lio/trtc/tuikit/atomicxcore/impl/live/c0;

    .line 25
    .line 26
    iget-object v0, v0, Lio/trtc/tuikit/atomicxcore/impl/live/c0;->g:Lkotlinx/coroutines/flow/n;

    .line 27
    .line 28
    .line 29
    invoke-interface {v0}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    .line 30
    move-result-object v1

    .line 31
    .line 32
    check-cast v1, Ljava/lang/Iterable;

    .line 33
    .line 34
    new-instance v2, Ljava/util/ArrayList;

    .line 35
    .line 36
    .line 37
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 38
    .line 39
    .line 40
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 41
    move-result-object v1

    .line 42
    .line 43
    .line 44
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 45
    move-result v3

    .line 46
    .line 47
    if-eqz v3, :cond_1

    .line 48
    .line 49
    .line 50
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 51
    move-result-object v3

    .line 52
    move-object v4, v3

    .line 53
    .line 54
    check-cast v4, Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v4}, Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;->getLiveID()Ljava/lang/String;

    .line 58
    move-result-object v4

    .line 59
    .line 60
    iget-object v5, p2, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveConnectionManager$ConnectionUser;->roomId:Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 64
    move-result v4

    .line 65
    .line 66
    if-nez v4, :cond_0

    .line 67
    .line 68
    .line 69
    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 70
    goto :goto_0

    .line 71
    .line 72
    .line 73
    :cond_1
    invoke-interface {v0, v2}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 74
    goto :goto_1

    .line 75
    .line 76
    :cond_2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/live/X;->a:Lio/trtc/tuikit/atomicxcore/impl/live/c0;

    .line 77
    .line 78
    iget-object v0, v0, Lio/trtc/tuikit/atomicxcore/impl/live/c0;->h:Lkotlinx/coroutines/flow/n;

    .line 79
    const/4 v1, 0x0

    .line 80
    .line 81
    .line 82
    invoke-interface {v0, v1}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 83
    .line 84
    :goto_1
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/live/X;->a:Lio/trtc/tuikit/atomicxcore/impl/live/c0;

    .line 85
    .line 86
    iget-object v0, v0, Lio/trtc/tuikit/atomicxcore/impl/live/c0;->i:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 87
    .line 88
    const-string v1, "message"

    .line 89
    const/4 v2, 0x0

    .line 90
    .line 91
    const-string v3, "Listener: onCoHostRequestTimeout called"

    .line 92
    .line 93
    .line 94
    invoke-static {v0, v3, v1, v2, v3}, Lio/trtc/tuikit/atomicxcore/impl/barrage/b;->a(Lio/trtc/tuikit/atomicxcore/impl/common/r;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V

    .line 95
    .line 96
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/live/X;->a:Lio/trtc/tuikit/atomicxcore/impl/live/c0;

    .line 97
    .line 98
    iget-object v0, v0, Lio/trtc/tuikit/atomicxcore/impl/live/c0;->j:Lio/trtc/tuikit/atomicxcore/impl/common/q;

    .line 99
    .line 100
    new-instance v1, Lio/trtc/tuikit/atomicxcore/impl/live/U;

    .line 101
    .line 102
    .line 103
    invoke-direct {v1, p1, p2}, Lio/trtc/tuikit/atomicxcore/impl/live/U;-><init>(Lcom/tencent/cloud/tuikit/engine/extension/TUILiveConnectionManager$ConnectionUser;Lcom/tencent/cloud/tuikit/engine/extension/TUILiveConnectionManager$ConnectionUser;)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v0, v1}, Lio/trtc/tuikit/atomicxcore/impl/common/q;->a(Lkotlin/jvm/functions/Function1;)V

    .line 107
    return-void
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
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
.end method

.method public final onConnectionUserListChanged(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    const/16 v1, 0xa

    .line 4
    .line 5
    if-eqz p1, :cond_2

    .line 6
    .line 7
    new-instance v2, Ljava/util/ArrayList;

    .line 8
    .line 9
    .line 10
    invoke-static {p1, v1}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 11
    move-result v3

    .line 12
    .line 13
    .line 14
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 15
    .line 16
    .line 17
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 18
    move-result-object v3

    .line 19
    .line 20
    .line 21
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    move-result v4

    .line 23
    .line 24
    if-eqz v4, :cond_1

    .line 25
    .line 26
    .line 27
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    move-result-object v4

    .line 29
    .line 30
    check-cast v4, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveConnectionManager$ConnectionUser;

    .line 31
    .line 32
    if-eqz v4, :cond_0

    .line 33
    .line 34
    iget-object v4, v4, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveConnectionManager$ConnectionUser;->roomId:Ljava/lang/String;

    .line 35
    goto :goto_1

    .line 36
    :cond_0
    move-object v4, v0

    .line 37
    .line 38
    .line 39
    :goto_1
    invoke-interface {v2, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 40
    goto :goto_0

    .line 41
    .line 42
    .line 43
    :cond_1
    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->toSet(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 44
    move-result-object v2

    .line 45
    goto :goto_2

    .line 46
    :cond_2
    move-object v2, v0

    .line 47
    .line 48
    :goto_2
    if-eqz v2, :cond_6

    .line 49
    .line 50
    iget-object v3, p0, Lio/trtc/tuikit/atomicxcore/impl/live/X;->a:Lio/trtc/tuikit/atomicxcore/impl/live/c0;

    .line 51
    .line 52
    iget-object v4, v3, Lio/trtc/tuikit/atomicxcore/impl/live/c0;->e:Lkotlinx/coroutines/flow/n;

    .line 53
    .line 54
    .line 55
    invoke-interface {v4}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    .line 56
    move-result-object v4

    .line 57
    .line 58
    check-cast v4, Ljava/lang/Iterable;

    .line 59
    .line 60
    new-instance v5, Ljava/util/ArrayList;

    .line 61
    .line 62
    .line 63
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 64
    .line 65
    .line 66
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 67
    move-result-object v4

    .line 68
    .line 69
    .line 70
    :cond_3
    :goto_3
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 71
    move-result v6

    .line 72
    .line 73
    if-eqz v6, :cond_4

    .line 74
    .line 75
    .line 76
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 77
    move-result-object v6

    .line 78
    move-object v7, v6

    .line 79
    .line 80
    check-cast v7, Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v7}, Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;->getLiveID()Ljava/lang/String;

    .line 84
    move-result-object v7

    .line 85
    .line 86
    .line 87
    invoke-interface {v2, v7}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 88
    move-result v7

    .line 89
    .line 90
    if-nez v7, :cond_3

    .line 91
    .line 92
    .line 93
    invoke-interface {v5, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 94
    goto :goto_3

    .line 95
    .line 96
    .line 97
    :cond_4
    invoke-static {v5}, Lkotlin/collections/CollectionsKt;->toMutableList(Ljava/util/Collection;)Ljava/util/List;

    .line 98
    move-result-object v2

    .line 99
    .line 100
    iget-object v3, v3, Lio/trtc/tuikit/atomicxcore/impl/live/c0;->e:Lkotlinx/coroutines/flow/n;

    .line 101
    .line 102
    .line 103
    :cond_5
    invoke-interface {v3}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    .line 104
    move-result-object v4

    .line 105
    move-object v5, v4

    .line 106
    .line 107
    check-cast v5, Ljava/util/List;

    .line 108
    .line 109
    .line 110
    invoke-interface {v3, v4, v2}, Lkotlinx/coroutines/flow/n;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 111
    move-result v4

    .line 112
    .line 113
    if-eqz v4, :cond_5

    .line 114
    .line 115
    :cond_6
    iget-object v2, p0, Lio/trtc/tuikit/atomicxcore/impl/live/X;->a:Lio/trtc/tuikit/atomicxcore/impl/live/c0;

    .line 116
    .line 117
    iget-object v2, v2, Lio/trtc/tuikit/atomicxcore/impl/live/c0;->c:Lkotlinx/coroutines/flow/n;

    .line 118
    .line 119
    if-eqz p1, :cond_9

    .line 120
    .line 121
    .line 122
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 123
    move-result-object v3

    .line 124
    .line 125
    .line 126
    :cond_7
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 127
    move-result v4

    .line 128
    .line 129
    if-eqz v4, :cond_8

    .line 130
    .line 131
    .line 132
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 133
    move-result-object v4

    .line 134
    move-object v5, v4

    .line 135
    .line 136
    check-cast v5, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveConnectionManager$ConnectionUser;

    .line 137
    .line 138
    if-eqz v5, :cond_7

    .line 139
    .line 140
    iget-object v5, v5, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveConnectionManager$ConnectionUser;->userId:Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    invoke-static {}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;->getSelfInfo()Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$LoginUserInfo;

    .line 144
    move-result-object v6

    .line 145
    .line 146
    iget-object v6, v6, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$LoginUserInfo;->userId:Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 150
    move-result v5

    .line 151
    .line 152
    if-eqz v5, :cond_7

    .line 153
    move-object v0, v4

    .line 154
    .line 155
    :cond_8
    check-cast v0, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveConnectionManager$ConnectionUser;

    .line 156
    .line 157
    :cond_9
    if-nez v0, :cond_a

    .line 158
    .line 159
    sget-object v0, Lio/trtc/tuikit/atomicxcore/api/live/CoHostStatus;->DISCONNECTED:Lio/trtc/tuikit/atomicxcore/api/live/CoHostStatus;

    .line 160
    goto :goto_4

    .line 161
    .line 162
    :cond_a
    sget-object v0, Lio/trtc/tuikit/atomicxcore/api/live/CoHostStatus;->CONNECTED:Lio/trtc/tuikit/atomicxcore/api/live/CoHostStatus;

    .line 163
    .line 164
    .line 165
    :goto_4
    invoke-interface {v2, v0}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 166
    .line 167
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/live/X;->a:Lio/trtc/tuikit/atomicxcore/impl/live/c0;

    .line 168
    .line 169
    iget-object v0, v0, Lio/trtc/tuikit/atomicxcore/impl/live/c0;->d:Lkotlinx/coroutines/flow/n;

    .line 170
    .line 171
    if-eqz p1, :cond_b

    .line 172
    .line 173
    .line 174
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->filterNotNull(Ljava/lang/Iterable;)Ljava/util/List;

    .line 175
    move-result-object p1

    .line 176
    .line 177
    if-eqz p1, :cond_b

    .line 178
    .line 179
    new-instance v2, Ljava/util/ArrayList;

    .line 180
    .line 181
    .line 182
    invoke-static {p1, v1}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 183
    move-result v3

    .line 184
    .line 185
    .line 186
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 187
    .line 188
    .line 189
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 190
    move-result-object p1

    .line 191
    .line 192
    .line 193
    :goto_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 194
    move-result v3

    .line 195
    .line 196
    if-eqz v3, :cond_c

    .line 197
    .line 198
    .line 199
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 200
    move-result-object v3

    .line 201
    .line 202
    check-cast v3, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveConnectionManager$ConnectionUser;

    .line 203
    .line 204
    .line 205
    invoke-static {v3}, Lio/trtc/tuikit/atomicxcore/impl/live/P0;->a(Lcom/tencent/cloud/tuikit/engine/extension/TUILiveConnectionManager$ConnectionUser;)Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;

    .line 206
    move-result-object v3

    .line 207
    .line 208
    .line 209
    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 210
    goto :goto_5

    .line 211
    .line 212
    .line 213
    :cond_b
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 214
    move-result-object v2

    .line 215
    .line 216
    .line 217
    :cond_c
    invoke-interface {v0, v2}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 218
    const/4 p1, 0x0

    .line 219
    .line 220
    const-string v0, "message"

    .line 221
    .line 222
    if-eqz p2, :cond_d

    .line 223
    .line 224
    .line 225
    invoke-static {p2}, Lkotlin/collections/CollectionsKt;->filterNotNull(Ljava/lang/Iterable;)Ljava/util/List;

    .line 226
    move-result-object p2

    .line 227
    .line 228
    if-eqz p2, :cond_d

    .line 229
    .line 230
    iget-object v2, p0, Lio/trtc/tuikit/atomicxcore/impl/live/X;->a:Lio/trtc/tuikit/atomicxcore/impl/live/c0;

    .line 231
    .line 232
    new-instance v3, Ljava/util/ArrayList;

    .line 233
    .line 234
    .line 235
    invoke-static {p2, v1}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 236
    move-result v4

    .line 237
    .line 238
    .line 239
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 240
    .line 241
    .line 242
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 243
    move-result-object p2

    .line 244
    .line 245
    .line 246
    :goto_6
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 247
    move-result v4

    .line 248
    .line 249
    if-eqz v4, :cond_d

    .line 250
    .line 251
    .line 252
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 253
    move-result-object v4

    .line 254
    .line 255
    check-cast v4, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveConnectionManager$ConnectionUser;

    .line 256
    .line 257
    iget-object v5, v2, Lio/trtc/tuikit/atomicxcore/impl/live/c0;->i:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 258
    .line 259
    const-string v6, "Listener: onCoHostUserJoined called"

    .line 260
    .line 261
    .line 262
    invoke-static {v5, v6, v0, p1, v6}, Lio/trtc/tuikit/atomicxcore/impl/barrage/b;->a(Lio/trtc/tuikit/atomicxcore/impl/common/r;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V

    .line 263
    .line 264
    iget-object v5, v2, Lio/trtc/tuikit/atomicxcore/impl/live/c0;->j:Lio/trtc/tuikit/atomicxcore/impl/common/q;

    .line 265
    .line 266
    new-instance v6, Lio/trtc/tuikit/atomicxcore/impl/live/V;

    .line 267
    .line 268
    .line 269
    invoke-direct {v6, v4}, Lio/trtc/tuikit/atomicxcore/impl/live/V;-><init>(Lcom/tencent/cloud/tuikit/engine/extension/TUILiveConnectionManager$ConnectionUser;)V

    .line 270
    .line 271
    .line 272
    invoke-virtual {v5, v6}, Lio/trtc/tuikit/atomicxcore/impl/common/q;->a(Lkotlin/jvm/functions/Function1;)V

    .line 273
    .line 274
    sget-object v4, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 275
    .line 276
    .line 277
    invoke-interface {v3, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 278
    goto :goto_6

    .line 279
    .line 280
    :cond_d
    if-eqz p3, :cond_e

    .line 281
    .line 282
    .line 283
    invoke-static {p3}, Lkotlin/collections/CollectionsKt;->filterNotNull(Ljava/lang/Iterable;)Ljava/util/List;

    .line 284
    move-result-object p2

    .line 285
    .line 286
    if-eqz p2, :cond_e

    .line 287
    .line 288
    iget-object p3, p0, Lio/trtc/tuikit/atomicxcore/impl/live/X;->a:Lio/trtc/tuikit/atomicxcore/impl/live/c0;

    .line 289
    .line 290
    new-instance v2, Ljava/util/ArrayList;

    .line 291
    .line 292
    .line 293
    invoke-static {p2, v1}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 294
    move-result v1

    .line 295
    .line 296
    .line 297
    invoke-direct {v2, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 298
    .line 299
    .line 300
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 301
    move-result-object p2

    .line 302
    .line 303
    .line 304
    :goto_7
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 305
    move-result v1

    .line 306
    .line 307
    if-eqz v1, :cond_e

    .line 308
    .line 309
    .line 310
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 311
    move-result-object v1

    .line 312
    .line 313
    check-cast v1, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveConnectionManager$ConnectionUser;

    .line 314
    .line 315
    iget-object v3, p3, Lio/trtc/tuikit/atomicxcore/impl/live/c0;->i:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 316
    .line 317
    const-string v4, "Listener: onCoHostUserLeft called"

    .line 318
    .line 319
    .line 320
    invoke-static {v3, v4, v0, p1, v4}, Lio/trtc/tuikit/atomicxcore/impl/barrage/b;->a(Lio/trtc/tuikit/atomicxcore/impl/common/r;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V

    .line 321
    .line 322
    iget-object v3, p3, Lio/trtc/tuikit/atomicxcore/impl/live/c0;->j:Lio/trtc/tuikit/atomicxcore/impl/common/q;

    .line 323
    .line 324
    new-instance v4, Lio/trtc/tuikit/atomicxcore/impl/live/W;

    .line 325
    .line 326
    .line 327
    invoke-direct {v4, v1}, Lio/trtc/tuikit/atomicxcore/impl/live/W;-><init>(Lcom/tencent/cloud/tuikit/engine/extension/TUILiveConnectionManager$ConnectionUser;)V

    .line 328
    .line 329
    .line 330
    invoke-virtual {v3, v4}, Lio/trtc/tuikit/atomicxcore/impl/common/q;->a(Lkotlin/jvm/functions/Function1;)V

    .line 331
    .line 332
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 333
    .line 334
    .line 335
    invoke-interface {v2, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 336
    goto :goto_7

    .line 337
    :cond_e
    return-void
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
.end method
