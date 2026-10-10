.class public abstract synthetic Lio/trtc/tuikit/atomicxcore/impl/room/F;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final synthetic a:[I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lio/trtc/tuikit/atomicxcore/api/room/ParticipantRole;->values()[Lio/trtc/tuikit/atomicxcore/api/room/ParticipantRole;

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
    sget-object v2, Lio/trtc/tuikit/atomicxcore/api/room/ParticipantRole;->ADMIN:Lio/trtc/tuikit/atomicxcore/api/room/ParticipantRole;

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
    sget-object v3, Lio/trtc/tuikit/atomicxcore/api/room/ParticipantRole;->GENERAL_USER:Lio/trtc/tuikit/atomicxcore/api/room/ParticipantRole;

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
    sput-object v0, Lio/trtc/tuikit/atomicxcore/impl/room/F;->a:[I

    .line 28
    .line 29
    .line 30
    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/room/U0;->values()[Lio/trtc/tuikit/atomicxcore/impl/room/U0;

    .line 31
    move-result-object v0

    .line 32
    array-length v0, v0

    .line 33
    .line 34
    new-array v0, v0, [I

    .line 35
    const/4 v3, 0x0

    .line 36
    .line 37
    :try_start_2
    aput v1, v0, v3
    :try_end_2
    .catch Ljava/lang/NoSuchFieldError; {:try_start_2 .. :try_end_2} :catch_2

    .line 38
    .line 39
    :catch_2
    :try_start_3
    sget-object v3, Lio/trtc/tuikit/atomicxcore/impl/room/U0;->a:Lio/trtc/tuikit/atomicxcore/impl/room/U0;

    .line 40
    .line 41
    aput v2, v0, v1
    :try_end_3
    .catch Ljava/lang/NoSuchFieldError; {:try_start_3 .. :try_end_3} :catch_3

    .line 42
    .line 43
    :catch_3
    :try_start_4
    sget-object v1, Lio/trtc/tuikit/atomicxcore/impl/room/U0;->a:Lio/trtc/tuikit/atomicxcore/impl/room/U0;

    .line 44
    const/4 v1, 0x3

    .line 45
    .line 46
    aput v1, v0, v2
    :try_end_4
    .catch Ljava/lang/NoSuchFieldError; {:try_start_4 .. :try_end_4} :catch_4

    .line 47
    :catch_4
    return-void
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
.end method
