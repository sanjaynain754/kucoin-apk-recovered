.class public abstract Lio/trtc/tuikit/atomicxcore/impl/live/a;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleUser;)Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;
    .locals 14

    .line 1
    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    new-instance v0, Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;

    .line 5
    .line 6
    const/16 v11, 0x3ff

    .line 7
    const/4 v12, 0x0

    .line 8
    const/4 v1, 0x0

    .line 9
    const/4 v2, 0x0

    .line 10
    const/4 v3, 0x0

    .line 11
    const/4 v4, 0x0

    .line 12
    const/4 v5, 0x0

    .line 13
    const/4 v6, 0x0

    .line 14
    const/4 v7, 0x0

    .line 15
    const/4 v8, 0x0

    .line 16
    const/4 v9, 0x0

    .line 17
    const/4 v10, 0x0

    .line 18
    .line 19
    .line 20
    invoke-direct/range {v0 .. v12}, Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/live/Role;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/device/DeviceStatus;ZLio/trtc/tuikit/atomicxcore/api/device/DeviceStatus;ZLio/trtc/tuikit/atomicxcore/api/live/SuspendStatus;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 21
    return-object v0

    .line 22
    .line 23
    :cond_0
    new-instance v1, Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;

    .line 24
    .line 25
    iget-object v2, p0, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleUser;->userId:Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    const-string/jumbo v0, "userId"

    .line 29
    .line 30
    .line 31
    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 32
    .line 33
    iget-object v3, p0, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleUser;->userName:Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    const-string/jumbo v0, "userName"

    .line 37
    .line 38
    .line 39
    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 40
    .line 41
    iget-object v4, p0, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleUser;->avatarUrl:Ljava/lang/String;

    .line 42
    .line 43
    const-string v0, "avatarUrl"

    .line 44
    .line 45
    .line 46
    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 47
    .line 48
    sget-object v5, Lio/trtc/tuikit/atomicxcore/api/live/Role;->GENERAL_USER:Lio/trtc/tuikit/atomicxcore/api/live/Role;

    .line 49
    .line 50
    iget-object v6, p0, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleUser;->roomId:Ljava/lang/String;

    .line 51
    .line 52
    const-string p0, "roomId"

    .line 53
    .line 54
    .line 55
    invoke-static {v6, p0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 56
    .line 57
    sget-object v7, Lio/trtc/tuikit/atomicxcore/api/device/DeviceStatus;->OFF:Lio/trtc/tuikit/atomicxcore/api/device/DeviceStatus;

    .line 58
    .line 59
    const/16 v12, 0x200

    .line 60
    const/4 v13, 0x0

    .line 61
    const/4 v8, 0x1

    .line 62
    const/4 v10, 0x1

    .line 63
    const/4 v11, 0x0

    .line 64
    move-object v9, v7

    .line 65
    .line 66
    .line 67
    invoke-direct/range {v1 .. v13}, Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/live/Role;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/device/DeviceStatus;ZLio/trtc/tuikit/atomicxcore/api/device/DeviceStatus;ZLio/trtc/tuikit/atomicxcore/api/live/SuspendStatus;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 68
    return-object v1
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
.end method
