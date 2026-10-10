.class public final Lio/trtc/tuikit/atomicxcore/impl/room/l;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$KickedOutOfRoomReason;

.field public final synthetic b:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$KickedOutOfRoomReason;Ljava/lang/String;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/room/l;->a:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$KickedOutOfRoomReason;

    .line 3
    .line 4
    iput-object p2, p0, Lio/trtc/tuikit/atomicxcore/impl/room/l;->b:Ljava/lang/String;

    .line 5
    const/4 p1, 0x1

    .line 6
    .line 7
    .line 8
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    .line 9
    return-void
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


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    .line 2
    check-cast p1, Lio/trtc/tuikit/atomicxcore/api/room/RoomParticipantListener;

    .line 3
    .line 4
    const-string v0, "$this$notify"

    .line 5
    .line 6
    .line 7
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/room/l;->a:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$KickedOutOfRoomReason;

    .line 10
    .line 11
    const-string v1, "reason"

    .line 12
    .line 13
    .line 14
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    sget-object v1, Lio/trtc/tuikit/atomicxcore/impl/room/l0;->d:[I

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 20
    move-result v0

    .line 21
    .line 22
    aget v0, v1, v0

    .line 23
    .line 24
    .line 25
    packed-switch v0, :pswitch_data_0

    .line 26
    .line 27
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    .line 28
    .line 29
    .line 30
    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 31
    throw p1

    .line 32
    .line 33
    :pswitch_0
    sget-object v0, Lio/trtc/tuikit/atomicxcore/api/room/KickedOutOfRoomReason;->ROOM_LIMIT_EXCEEDED:Lio/trtc/tuikit/atomicxcore/api/room/KickedOutOfRoomReason;

    .line 34
    goto :goto_0

    .line 35
    .line 36
    :pswitch_1
    sget-object v0, Lio/trtc/tuikit/atomicxcore/api/room/KickedOutOfRoomReason;->INVALID_STATUS_ON_RECONNECT:Lio/trtc/tuikit/atomicxcore/api/room/KickedOutOfRoomReason;

    .line 37
    goto :goto_0

    .line 38
    .line 39
    :pswitch_2
    sget-object v0, Lio/trtc/tuikit/atomicxcore/api/room/KickedOutOfRoomReason;->CONNECTION_TIMEOUT:Lio/trtc/tuikit/atomicxcore/api/room/KickedOutOfRoomReason;

    .line 40
    goto :goto_0

    .line 41
    .line 42
    :pswitch_3
    sget-object v0, Lio/trtc/tuikit/atomicxcore/api/room/KickedOutOfRoomReason;->KICKED_BY_SERVER:Lio/trtc/tuikit/atomicxcore/api/room/KickedOutOfRoomReason;

    .line 43
    goto :goto_0

    .line 44
    .line 45
    :pswitch_4
    sget-object v0, Lio/trtc/tuikit/atomicxcore/api/room/KickedOutOfRoomReason;->REPLACED_BY_ANOTHER_DEVICE:Lio/trtc/tuikit/atomicxcore/api/room/KickedOutOfRoomReason;

    .line 46
    goto :goto_0

    .line 47
    .line 48
    :pswitch_5
    sget-object v0, Lio/trtc/tuikit/atomicxcore/api/room/KickedOutOfRoomReason;->KICKED_BY_ADMIN:Lio/trtc/tuikit/atomicxcore/api/room/KickedOutOfRoomReason;

    .line 49
    .line 50
    :goto_0
    iget-object v1, p0, Lio/trtc/tuikit/atomicxcore/impl/room/l;->b:Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    invoke-virtual {p1, v0, v1}, Lio/trtc/tuikit/atomicxcore/api/room/RoomParticipantListener;->onKickedFromRoom(Lio/trtc/tuikit/atomicxcore/api/room/KickedOutOfRoomReason;Ljava/lang/String;)V

    .line 54
    .line 55
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 56
    return-object p1

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
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
