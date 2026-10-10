.class public final Lio/trtc/tuikit/atomicxcore/impl/barrage/a;
.super Lcom/tencent/cloud/tuikit/engine/room/TUIRoomObserver;
.source "SourceFile"


# instance fields
.field public final synthetic a:Lio/trtc/tuikit/atomicxcore/impl/barrage/e;


# direct methods
.method public constructor <init>(Lio/trtc/tuikit/atomicxcore/impl/barrage/e;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/barrage/a;->a:Lio/trtc/tuikit/atomicxcore/impl/barrage/e;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomObserver;-><init>()V

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
.method public final onReceiveCustomMessage(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomCustomMessage;)V
    .locals 18

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    move-object/from16 v1, p1

    .line 5
    .line 6
    const-string v2, "customMessage"

    .line 7
    .line 8
    .line 9
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    iget-object v2, v1, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomCustomMessage;->roomId:Ljava/lang/String;

    .line 12
    .line 13
    iget-object v3, v0, Lio/trtc/tuikit/atomicxcore/impl/barrage/a;->a:Lio/trtc/tuikit/atomicxcore/impl/barrage/e;

    .line 14
    .line 15
    iget-object v3, v3, Lio/trtc/tuikit/atomicxcore/impl/barrage/e;->a:Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 19
    move-result v2

    .line 20
    .line 21
    if-eqz v2, :cond_0

    .line 22
    .line 23
    iget-object v2, v0, Lio/trtc/tuikit/atomicxcore/impl/barrage/a;->a:Lio/trtc/tuikit/atomicxcore/impl/barrage/e;

    .line 24
    .line 25
    const-string v3, "message"

    .line 26
    .line 27
    .line 28
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    .line 30
    new-instance v4, Lio/trtc/tuikit/atomicxcore/api/barrage/Barrage;

    .line 31
    .line 32
    iget-object v5, v1, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomCustomMessage;->roomId:Ljava/lang/String;

    .line 33
    .line 34
    const-string v3, "roomId"

    .line 35
    .line 36
    .line 37
    invoke-static {v5, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    .line 39
    iget-object v3, v1, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomCustomMessage;->sender:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;

    .line 40
    .line 41
    const-string v6, "sender"

    .line 42
    .line 43
    .line 44
    invoke-static {v3, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    invoke-static {v3}, Lio/trtc/tuikit/atomicxcore/impl/live/j0;->a(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;)Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;

    .line 48
    move-result-object v6

    .line 49
    .line 50
    iget-wide v7, v1, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomCustomMessage;->sequence:J

    .line 51
    .line 52
    iget-wide v9, v1, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomCustomMessage;->timestampInSecond:J

    .line 53
    .line 54
    sget-object v11, Lio/trtc/tuikit/atomicxcore/api/barrage/BarrageType;->CUSTOM:Lio/trtc/tuikit/atomicxcore/api/barrage/BarrageType;

    .line 55
    .line 56
    iget-object v14, v1, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomCustomMessage;->businessId:Ljava/lang/String;

    .line 57
    .line 58
    const-string v3, "businessId"

    .line 59
    .line 60
    .line 61
    invoke-static {v14, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 62
    .line 63
    iget-object v15, v1, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomCustomMessage;->data:Ljava/lang/String;

    .line 64
    .line 65
    const-string v1, "data"

    .line 66
    .line 67
    .line 68
    invoke-static {v15, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 69
    .line 70
    const/16 v16, 0x60

    .line 71
    .line 72
    const/16 v17, 0x0

    .line 73
    const/4 v12, 0x0

    .line 74
    const/4 v13, 0x0

    .line 75
    .line 76
    .line 77
    invoke-direct/range {v4 .. v17}, Lio/trtc/tuikit/atomicxcore/api/barrage/Barrage;-><init>(Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;JJLio/trtc/tuikit/atomicxcore/api/barrage/BarrageType;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v2, v4}, Lio/trtc/tuikit/atomicxcore/impl/barrage/e;->a(Lio/trtc/tuikit/atomicxcore/api/barrage/Barrage;)V

    .line 81
    :cond_0
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

.method public final onReceiveTextMessage(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomTextMessage;)V
    .locals 18

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    move-object/from16 v1, p1

    .line 5
    .line 6
    .line 7
    const-string/jumbo v2, "textMessage"

    .line 8
    .line 9
    .line 10
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    iget-object v2, v1, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomTextMessage;->roomId:Ljava/lang/String;

    .line 13
    .line 14
    iget-object v3, v0, Lio/trtc/tuikit/atomicxcore/impl/barrage/a;->a:Lio/trtc/tuikit/atomicxcore/impl/barrage/e;

    .line 15
    .line 16
    iget-object v3, v3, Lio/trtc/tuikit/atomicxcore/impl/barrage/e;->a:Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 20
    move-result v2

    .line 21
    .line 22
    if-eqz v2, :cond_0

    .line 23
    .line 24
    iget-object v2, v0, Lio/trtc/tuikit/atomicxcore/impl/barrage/a;->a:Lio/trtc/tuikit/atomicxcore/impl/barrage/e;

    .line 25
    .line 26
    const-string v3, "message"

    .line 27
    .line 28
    .line 29
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    .line 31
    new-instance v4, Lio/trtc/tuikit/atomicxcore/api/barrage/Barrage;

    .line 32
    .line 33
    iget-object v5, v1, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomTextMessage;->roomId:Ljava/lang/String;

    .line 34
    .line 35
    const-string v3, "roomId"

    .line 36
    .line 37
    .line 38
    invoke-static {v5, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 39
    .line 40
    iget-object v3, v1, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomTextMessage;->sender:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;

    .line 41
    .line 42
    const-string v6, "sender"

    .line 43
    .line 44
    .line 45
    invoke-static {v3, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    invoke-static {v3}, Lio/trtc/tuikit/atomicxcore/impl/live/j0;->a(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;)Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;

    .line 49
    move-result-object v6

    .line 50
    .line 51
    iget-wide v7, v1, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomTextMessage;->sequence:J

    .line 52
    .line 53
    iget-wide v9, v1, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomTextMessage;->timestampInSecond:J

    .line 54
    .line 55
    sget-object v11, Lio/trtc/tuikit/atomicxcore/api/barrage/BarrageType;->TEXT:Lio/trtc/tuikit/atomicxcore/api/barrage/BarrageType;

    .line 56
    .line 57
    iget-object v12, v1, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomTextMessage;->textContent:Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    const-string/jumbo v3, "textContent"

    .line 61
    .line 62
    .line 63
    invoke-static {v12, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 64
    .line 65
    iget-object v13, v1, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomTextMessage;->extensionInfo:Ljava/util/Map;

    .line 66
    .line 67
    const-string v1, "extensionInfo"

    .line 68
    .line 69
    .line 70
    invoke-static {v13, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 71
    .line 72
    const/16 v16, 0x180

    .line 73
    .line 74
    const/16 v17, 0x0

    .line 75
    const/4 v14, 0x0

    .line 76
    const/4 v15, 0x0

    .line 77
    .line 78
    .line 79
    invoke-direct/range {v4 .. v17}, Lio/trtc/tuikit/atomicxcore/api/barrage/Barrage;-><init>(Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;JJLio/trtc/tuikit/atomicxcore/api/barrage/BarrageType;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v2, v4}, Lio/trtc/tuikit/atomicxcore/impl/barrage/e;->a(Lio/trtc/tuikit/atomicxcore/api/barrage/Barrage;)V

    .line 83
    :cond_0
    return-void
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

.method public final onSendMessageForAllUserDisableChanged(Ljava/lang/String;Z)V
    .locals 2

    .line 1
    .line 2
    const-string v0, "roomID"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/barrage/a;->a:Lio/trtc/tuikit/atomicxcore/impl/barrage/e;

    .line 8
    .line 9
    iget-object v0, v0, Lio/trtc/tuikit/atomicxcore/impl/barrage/e;->a:Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 13
    move-result p1

    .line 14
    .line 15
    if-eqz p1, :cond_1

    .line 16
    .line 17
    iget-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/barrage/a;->a:Lio/trtc/tuikit/atomicxcore/impl/barrage/e;

    .line 18
    .line 19
    iget-object p1, p1, Lio/trtc/tuikit/atomicxcore/impl/barrage/e;->g:Lkotlinx/coroutines/flow/n;

    .line 20
    .line 21
    .line 22
    :cond_0
    invoke-interface {p1}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    .line 23
    move-result-object v0

    .line 24
    move-object v1, v0

    .line 25
    .line 26
    check-cast v1, Ljava/lang/Boolean;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    xor-int/lit8 v1, p2, 0x1

    .line 32
    .line 33
    .line 34
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 35
    move-result-object v1

    .line 36
    .line 37
    .line 38
    invoke-interface {p1, v0, v1}, Lkotlinx/coroutines/flow/n;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 39
    move-result v0

    .line 40
    .line 41
    if-eqz v0, :cond_0

    .line 42
    :cond_1
    return-void
    .line 43
.end method
