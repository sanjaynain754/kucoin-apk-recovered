.class public abstract synthetic Lio/trtc/tuikit/atomicxcore/impl/room/i;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final synthetic a:[I

.field public static final synthetic b:[I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$VideoStreamType;->values()[Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$VideoStreamType;

    .line 4
    move-result-object v0

    .line 5
    array-length v0, v0

    .line 6
    .line 7
    new-array v0, v0, [I

    .line 8
    const/4 v1, 0x1

    .line 9
    .line 10
    :try_start_0
    sget-object v2, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$VideoStreamType;->CAMERA_STREAM:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$VideoStreamType;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 14
    move-result v2

    .line 15
    .line 16
    aput v1, v0, v2
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_0

    .line 17
    :catch_0
    const/4 v2, 0x2

    .line 18
    .line 19
    :try_start_1
    sget-object v3, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$VideoStreamType;->SCREEN_STREAM:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$VideoStreamType;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 23
    move-result v3

    .line 24
    .line 25
    aput v2, v0, v3
    :try_end_1
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1 .. :try_end_1} :catch_1

    .line 26
    .line 27
    :catch_1
    sput-object v0, Lio/trtc/tuikit/atomicxcore/impl/room/i;->a:[I

    .line 28
    .line 29
    .line 30
    invoke-static {}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RequestAction;->values()[Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RequestAction;

    .line 31
    move-result-object v0

    .line 32
    array-length v0, v0

    .line 33
    .line 34
    new-array v0, v0, [I

    .line 35
    .line 36
    :try_start_2
    sget-object v3, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RequestAction;->REQUEST_APPLY_TO_ADMIN_TO_OPEN_LOCAL_CAMERA:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RequestAction;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 40
    move-result v3

    .line 41
    .line 42
    aput v1, v0, v3
    :try_end_2
    .catch Ljava/lang/NoSuchFieldError; {:try_start_2 .. :try_end_2} :catch_2

    .line 43
    .line 44
    :catch_2
    :try_start_3
    sget-object v1, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RequestAction;->REQUEST_APPLY_TO_ADMIN_TO_OPEN_LOCAL_MICROPHONE:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RequestAction;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 48
    move-result v1

    .line 49
    .line 50
    aput v2, v0, v1
    :try_end_3
    .catch Ljava/lang/NoSuchFieldError; {:try_start_3 .. :try_end_3} :catch_3

    .line 51
    .line 52
    :catch_3
    :try_start_4
    sget-object v1, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RequestAction;->REQUEST_TO_OPEN_REMOTE_CAMERA:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RequestAction;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 56
    move-result v1

    .line 57
    const/4 v2, 0x3

    .line 58
    .line 59
    aput v2, v0, v1
    :try_end_4
    .catch Ljava/lang/NoSuchFieldError; {:try_start_4 .. :try_end_4} :catch_4

    .line 60
    .line 61
    :catch_4
    :try_start_5
    sget-object v1, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RequestAction;->REQUEST_TO_OPEN_REMOTE_MICROPHONE:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RequestAction;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 65
    move-result v1

    .line 66
    const/4 v2, 0x4

    .line 67
    .line 68
    aput v2, v0, v1
    :try_end_5
    .catch Ljava/lang/NoSuchFieldError; {:try_start_5 .. :try_end_5} :catch_5

    .line 69
    .line 70
    :catch_5
    :try_start_6
    sget-object v1, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RequestAction;->REQUEST_TO_CLOSE_REMOTE_MICROPHONE:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RequestAction;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 74
    move-result v1

    .line 75
    const/4 v2, 0x5

    .line 76
    .line 77
    aput v2, v0, v1
    :try_end_6
    .catch Ljava/lang/NoSuchFieldError; {:try_start_6 .. :try_end_6} :catch_6

    .line 78
    .line 79
    :catch_6
    :try_start_7
    sget-object v1, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RequestAction;->REQUEST_TO_CLOSE_REMOTE_CAMERA:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RequestAction;

    .line 80
    .line 81
    .line 82
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 83
    move-result v1

    .line 84
    const/4 v2, 0x6

    .line 85
    .line 86
    aput v2, v0, v1
    :try_end_7
    .catch Ljava/lang/NoSuchFieldError; {:try_start_7 .. :try_end_7} :catch_7

    .line 87
    .line 88
    :catch_7
    :try_start_8
    sget-object v1, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RequestAction;->REQUEST_TO_CLOSE_REMOTE_SCREEN_SHARE:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RequestAction;

    .line 89
    .line 90
    .line 91
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 92
    move-result v1

    .line 93
    const/4 v2, 0x7

    .line 94
    .line 95
    aput v2, v0, v1
    :try_end_8
    .catch Ljava/lang/NoSuchFieldError; {:try_start_8 .. :try_end_8} :catch_8

    .line 96
    .line 97
    :catch_8
    sput-object v0, Lio/trtc/tuikit/atomicxcore/impl/room/i;->b:[I

    .line 98
    return-void
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
.end method
