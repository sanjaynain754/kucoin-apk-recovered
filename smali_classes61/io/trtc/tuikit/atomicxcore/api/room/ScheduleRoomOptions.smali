.class public final Lio/trtc/tuikit/atomicxcore/api/room/ScheduleRoomOptions;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/trtc/tuikit/atomicxcore/api/room/ScheduleRoomOptions$ModifyFlag;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\u0008/\u0008\u0086\u0008\u0018\u00002\u00020\u0001:\u0001;Bo\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\t\u0012\u000e\u0008\u0002\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u000b\u0012\u0008\u0008\u0002\u0010\u000c\u001a\u00020\r\u0012\u0008\u0008\u0002\u0010\u000e\u001a\u00020\r\u0012\u0008\u0008\u0002\u0010\u000f\u001a\u00020\r\u0012\u0008\u0008\u0002\u0010\u0010\u001a\u00020\r\u00a2\u0006\u0002\u0010\u0011J\t\u0010,\u001a\u00020\u0003H\u00c6\u0003J\t\u0010-\u001a\u00020\rH\u00c6\u0003J\t\u0010.\u001a\u00020\u0003H\u00c6\u0003J\t\u0010/\u001a\u00020\u0006H\u00c6\u0003J\t\u00100\u001a\u00020\u0006H\u00c6\u0003J\t\u00101\u001a\u00020\tH\u00c6\u0003J\u000f\u00102\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u000bH\u00c6\u0003J\t\u00103\u001a\u00020\rH\u00c6\u0003J\t\u00104\u001a\u00020\rH\u00c6\u0003J\t\u00105\u001a\u00020\rH\u00c6\u0003Js\u00106\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0008\u001a\u00020\t2\u000e\u0008\u0002\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u000b2\u0008\u0008\u0002\u0010\u000c\u001a\u00020\r2\u0008\u0008\u0002\u0010\u000e\u001a\u00020\r2\u0008\u0008\u0002\u0010\u000f\u001a\u00020\r2\u0008\u0008\u0002\u0010\u0010\u001a\u00020\rH\u00c6\u0001J\u0013\u00107\u001a\u00020\r2\u0008\u00108\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00109\u001a\u00020\tH\u00d6\u0001J\t\u0010:\u001a\u00020\u0003H\u00d6\u0001R\u001a\u0010\u000e\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u000e\u0010\u0012\"\u0004\u0008\u0013\u0010\u0014R\u001a\u0010\u0010\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0010\u0010\u0012\"\u0004\u0008\u0015\u0010\u0014R\u001a\u0010\u000c\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u000c\u0010\u0012\"\u0004\u0008\u0016\u0010\u0014R\u001a\u0010\u000f\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u000f\u0010\u0012\"\u0004\u0008\u0017\u0010\u0014R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0018\u0010\u0019\"\u0004\u0008\u001a\u0010\u001bR\u001a\u0010\u0008\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u001c\u0010\u001d\"\u0004\u0008\u001e\u0010\u001fR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008 \u0010\u0019\"\u0004\u0008!\u0010\u001bR \u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\"\u0010#\"\u0004\u0008$\u0010%R\u001a\u0010\u0007\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008&\u0010\'\"\u0004\u0008(\u0010)R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008*\u0010\'\"\u0004\u0008+\u0010)\u00a8\u0006<"
    }
    d2 = {
        "Lio/trtc/tuikit/atomicxcore/api/room/ScheduleRoomOptions;",
        "",
        "roomName",
        "",
        "password",
        "scheduleStartTime",
        "",
        "scheduleEndTime",
        "reminderSecondsBeforeStart",
        "",
        "scheduleAttendees",
        "",
        "isAllMicrophoneDisabled",
        "",
        "isAllCameraDisabled",
        "isAllScreenShareDisabled",
        "isAllMessageDisabled",
        "(Ljava/lang/String;Ljava/lang/String;JJILjava/util/List;ZZZZ)V",
        "()Z",
        "setAllCameraDisabled",
        "(Z)V",
        "setAllMessageDisabled",
        "setAllMicrophoneDisabled",
        "setAllScreenShareDisabled",
        "getPassword",
        "()Ljava/lang/String;",
        "setPassword",
        "(Ljava/lang/String;)V",
        "getReminderSecondsBeforeStart",
        "()I",
        "setReminderSecondsBeforeStart",
        "(I)V",
        "getRoomName",
        "setRoomName",
        "getScheduleAttendees",
        "()Ljava/util/List;",
        "setScheduleAttendees",
        "(Ljava/util/List;)V",
        "getScheduleEndTime",
        "()J",
        "setScheduleEndTime",
        "(J)V",
        "getScheduleStartTime",
        "setScheduleStartTime",
        "component1",
        "component10",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "component9",
        "copy",
        "equals",
        "other",
        "hashCode",
        "toString",
        "ModifyFlag",
        "atomicxcore_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private isAllCameraDisabled:Z

.field private isAllMessageDisabled:Z

.field private isAllMicrophoneDisabled:Z

.field private isAllScreenShareDisabled:Z

.field private password:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private reminderSecondsBeforeStart:I

.field private roomName:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private scheduleAttendees:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private scheduleEndTime:J

.field private scheduleStartTime:J


# direct methods
.method public constructor <init>()V
    .locals 15

    const/16 v13, 0x3ff

    const/4 v14, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const-wide/16 v3, 0x0

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    move-object v0, p0

    .line 1
    invoke-direct/range {v0 .. v14}, Lio/trtc/tuikit/atomicxcore/api/room/ScheduleRoomOptions;-><init>(Ljava/lang/String;Ljava/lang/String;JJILjava/util/List;ZZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;JJILjava/util/List;ZZZZ)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p8    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "JJI",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;ZZZZ)V"
        }
    .end annotation

    const-string v0, "roomName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "password"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scheduleAttendees"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/api/room/ScheduleRoomOptions;->roomName:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lio/trtc/tuikit/atomicxcore/api/room/ScheduleRoomOptions;->password:Ljava/lang/String;

    .line 5
    iput-wide p3, p0, Lio/trtc/tuikit/atomicxcore/api/room/ScheduleRoomOptions;->scheduleStartTime:J

    .line 6
    iput-wide p5, p0, Lio/trtc/tuikit/atomicxcore/api/room/ScheduleRoomOptions;->scheduleEndTime:J

    .line 7
    iput p7, p0, Lio/trtc/tuikit/atomicxcore/api/room/ScheduleRoomOptions;->reminderSecondsBeforeStart:I

    .line 8
    iput-object p8, p0, Lio/trtc/tuikit/atomicxcore/api/room/ScheduleRoomOptions;->scheduleAttendees:Ljava/util/List;

    .line 9
    iput-boolean p9, p0, Lio/trtc/tuikit/atomicxcore/api/room/ScheduleRoomOptions;->isAllMicrophoneDisabled:Z

    .line 10
    iput-boolean p10, p0, Lio/trtc/tuikit/atomicxcore/api/room/ScheduleRoomOptions;->isAllCameraDisabled:Z

    .line 11
    iput-boolean p11, p0, Lio/trtc/tuikit/atomicxcore/api/room/ScheduleRoomOptions;->isAllScreenShareDisabled:Z

    .line 12
    iput-boolean p12, p0, Lio/trtc/tuikit/atomicxcore/api/room/ScheduleRoomOptions;->isAllMessageDisabled:Z

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;JJILjava/util/List;ZZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 11

    move/from16 v0, p13

    and-int/lit8 v1, v0, 0x1

    const-string v2, ""

    if-eqz v1, :cond_0

    move-object p1, v2

    :cond_0
    and-int/lit8 v1, v0, 0x2

    if-eqz v1, :cond_1

    move-object p2, v2

    :cond_1
    and-int/lit8 v1, v0, 0x4

    const-wide/16 v2, 0x0

    if-eqz v1, :cond_2

    move-wide v4, v2

    goto :goto_0

    :cond_2
    move-wide v4, p3

    :goto_0
    and-int/lit8 v1, v0, 0x8

    if-eqz v1, :cond_3

    goto :goto_1

    :cond_3
    move-wide/from16 v2, p5

    :goto_1
    and-int/lit8 v1, v0, 0x10

    const/4 v6, 0x0

    if-eqz v1, :cond_4

    move v1, v6

    goto :goto_2

    :cond_4
    move/from16 v1, p7

    :goto_2
    and-int/lit8 v7, v0, 0x20

    if-eqz v7, :cond_5

    .line 13
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v7

    goto :goto_3

    :cond_5
    move-object/from16 v7, p8

    :goto_3
    and-int/lit8 v8, v0, 0x40

    if-eqz v8, :cond_6

    move v8, v6

    goto :goto_4

    :cond_6
    move/from16 v8, p9

    :goto_4
    and-int/lit16 v9, v0, 0x80

    if-eqz v9, :cond_7

    move v9, v6

    goto :goto_5

    :cond_7
    move/from16 v9, p10

    :goto_5
    and-int/lit16 v10, v0, 0x100

    if-eqz v10, :cond_8

    move v10, v6

    goto :goto_6

    :cond_8
    move/from16 v10, p11

    :goto_6
    and-int/lit16 v0, v0, 0x200

    if-eqz v0, :cond_9

    move/from16 p13, v6

    :goto_7
    move-object p3, p2

    move/from16 p8, v1

    move-wide/from16 p6, v2

    move-wide p4, v4

    move-object/from16 p9, v7

    move/from16 p10, v8

    move/from16 p11, v9

    move/from16 p12, v10

    move-object p2, p1

    move-object p1, p0

    goto :goto_8

    :cond_9
    move/from16 p13, p12

    goto :goto_7

    .line 14
    :goto_8
    invoke-direct/range {p1 .. p13}, Lio/trtc/tuikit/atomicxcore/api/room/ScheduleRoomOptions;-><init>(Ljava/lang/String;Ljava/lang/String;JJILjava/util/List;ZZZZ)V

    return-void
.end method

.method public static synthetic copy$default(Lio/trtc/tuikit/atomicxcore/api/room/ScheduleRoomOptions;Ljava/lang/String;Ljava/lang/String;JJILjava/util/List;ZZZZILjava/lang/Object;)Lio/trtc/tuikit/atomicxcore/api/room/ScheduleRoomOptions;
    .locals 0

    .line 1
    .line 2
    and-int/lit8 p14, p13, 0x1

    .line 3
    .line 4
    if-eqz p14, :cond_0

    .line 5
    .line 6
    iget-object p1, p0, Lio/trtc/tuikit/atomicxcore/api/room/ScheduleRoomOptions;->roomName:Ljava/lang/String;

    .line 7
    .line 8
    :cond_0
    and-int/lit8 p14, p13, 0x2

    .line 9
    .line 10
    if-eqz p14, :cond_1

    .line 11
    .line 12
    iget-object p2, p0, Lio/trtc/tuikit/atomicxcore/api/room/ScheduleRoomOptions;->password:Ljava/lang/String;

    .line 13
    .line 14
    :cond_1
    and-int/lit8 p14, p13, 0x4

    .line 15
    .line 16
    if-eqz p14, :cond_2

    .line 17
    .line 18
    iget-wide p3, p0, Lio/trtc/tuikit/atomicxcore/api/room/ScheduleRoomOptions;->scheduleStartTime:J

    .line 19
    .line 20
    :cond_2
    and-int/lit8 p14, p13, 0x8

    .line 21
    .line 22
    if-eqz p14, :cond_3

    .line 23
    .line 24
    iget-wide p5, p0, Lio/trtc/tuikit/atomicxcore/api/room/ScheduleRoomOptions;->scheduleEndTime:J

    .line 25
    .line 26
    :cond_3
    and-int/lit8 p14, p13, 0x10

    .line 27
    .line 28
    if-eqz p14, :cond_4

    .line 29
    .line 30
    iget p7, p0, Lio/trtc/tuikit/atomicxcore/api/room/ScheduleRoomOptions;->reminderSecondsBeforeStart:I

    .line 31
    .line 32
    :cond_4
    and-int/lit8 p14, p13, 0x20

    .line 33
    .line 34
    if-eqz p14, :cond_5

    .line 35
    .line 36
    iget-object p8, p0, Lio/trtc/tuikit/atomicxcore/api/room/ScheduleRoomOptions;->scheduleAttendees:Ljava/util/List;

    .line 37
    .line 38
    :cond_5
    and-int/lit8 p14, p13, 0x40

    .line 39
    .line 40
    if-eqz p14, :cond_6

    .line 41
    .line 42
    iget-boolean p9, p0, Lio/trtc/tuikit/atomicxcore/api/room/ScheduleRoomOptions;->isAllMicrophoneDisabled:Z

    .line 43
    .line 44
    :cond_6
    and-int/lit16 p14, p13, 0x80

    .line 45
    .line 46
    if-eqz p14, :cond_7

    .line 47
    .line 48
    iget-boolean p10, p0, Lio/trtc/tuikit/atomicxcore/api/room/ScheduleRoomOptions;->isAllCameraDisabled:Z

    .line 49
    .line 50
    :cond_7
    and-int/lit16 p14, p13, 0x100

    .line 51
    .line 52
    if-eqz p14, :cond_8

    .line 53
    .line 54
    iget-boolean p11, p0, Lio/trtc/tuikit/atomicxcore/api/room/ScheduleRoomOptions;->isAllScreenShareDisabled:Z

    .line 55
    .line 56
    :cond_8
    and-int/lit16 p13, p13, 0x200

    .line 57
    .line 58
    if-eqz p13, :cond_9

    .line 59
    .line 60
    iget-boolean p12, p0, Lio/trtc/tuikit/atomicxcore/api/room/ScheduleRoomOptions;->isAllMessageDisabled:Z

    .line 61
    :cond_9
    move p13, p11

    .line 62
    move p14, p12

    .line 63
    move p11, p9

    .line 64
    move p12, p10

    .line 65
    move p9, p7

    .line 66
    move-object p10, p8

    .line 67
    move-wide p7, p5

    .line 68
    move-wide p5, p3

    .line 69
    move-object p3, p1

    .line 70
    move-object p4, p2

    .line 71
    move-object p2, p0

    .line 72
    .line 73
    .line 74
    invoke-virtual/range {p2 .. p14}, Lio/trtc/tuikit/atomicxcore/api/room/ScheduleRoomOptions;->copy(Ljava/lang/String;Ljava/lang/String;JJILjava/util/List;ZZZZ)Lio/trtc/tuikit/atomicxcore/api/room/ScheduleRoomOptions;

    .line 75
    move-result-object p0

    .line 76
    return-object p0
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
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/api/room/ScheduleRoomOptions;->roomName:Ljava/lang/String;

    .line 3
    return-object v0
    .line 4
    .line 5
    .line 6
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
.end method

.method public final component10()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lio/trtc/tuikit/atomicxcore/api/room/ScheduleRoomOptions;->isAllMessageDisabled:Z

    .line 3
    return v0
    .line 4
    .line 5
    .line 6
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
.end method

.method public final component2()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/api/room/ScheduleRoomOptions;->password:Ljava/lang/String;

    .line 3
    return-object v0
    .line 4
    .line 5
    .line 6
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
.end method

.method public final component3()J
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lio/trtc/tuikit/atomicxcore/api/room/ScheduleRoomOptions;->scheduleStartTime:J

    .line 3
    return-wide v0
    .line 4
    .line 5
    .line 6
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
.end method

.method public final component4()J
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lio/trtc/tuikit/atomicxcore/api/room/ScheduleRoomOptions;->scheduleEndTime:J

    .line 3
    return-wide v0
    .line 4
    .line 5
    .line 6
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
.end method

.method public final component5()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lio/trtc/tuikit/atomicxcore/api/room/ScheduleRoomOptions;->reminderSecondsBeforeStart:I

    .line 3
    return v0
    .line 4
    .line 5
    .line 6
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
.end method

.method public final component6()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/api/room/ScheduleRoomOptions;->scheduleAttendees:Ljava/util/List;

    .line 3
    return-object v0
    .line 4
    .line 5
    .line 6
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
.end method

.method public final component7()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lio/trtc/tuikit/atomicxcore/api/room/ScheduleRoomOptions;->isAllMicrophoneDisabled:Z

    .line 3
    return v0
    .line 4
    .line 5
    .line 6
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
.end method

.method public final component8()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lio/trtc/tuikit/atomicxcore/api/room/ScheduleRoomOptions;->isAllCameraDisabled:Z

    .line 3
    return v0
    .line 4
    .line 5
    .line 6
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
.end method

.method public final component9()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lio/trtc/tuikit/atomicxcore/api/room/ScheduleRoomOptions;->isAllScreenShareDisabled:Z

    .line 3
    return v0
    .line 4
    .line 5
    .line 6
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
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;JJILjava/util/List;ZZZZ)Lio/trtc/tuikit/atomicxcore/api/room/ScheduleRoomOptions;
    .locals 14
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p8    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "JJI",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;ZZZZ)",
            "Lio/trtc/tuikit/atomicxcore/api/room/ScheduleRoomOptions;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const-string v0, "roomName"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "password"

    .line 8
    .line 9
    move-object/from16 v3, p2

    .line 10
    .line 11
    .line 12
    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    const-string v0, "scheduleAttendees"

    .line 15
    .line 16
    move-object/from16 v9, p8

    .line 17
    .line 18
    .line 19
    invoke-static {v9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    new-instance v1, Lio/trtc/tuikit/atomicxcore/api/room/ScheduleRoomOptions;

    .line 22
    move-object v2, p1

    .line 23
    .line 24
    move-wide/from16 v4, p3

    .line 25
    .line 26
    move-wide/from16 v6, p5

    .line 27
    .line 28
    move/from16 v8, p7

    .line 29
    .line 30
    move/from16 v10, p9

    .line 31
    .line 32
    move/from16 v11, p10

    .line 33
    .line 34
    move/from16 v12, p11

    .line 35
    .line 36
    move/from16 v13, p12

    .line 37
    .line 38
    .line 39
    invoke-direct/range {v1 .. v13}, Lio/trtc/tuikit/atomicxcore/api/room/ScheduleRoomOptions;-><init>(Ljava/lang/String;Ljava/lang/String;JJILjava/util/List;ZZZZ)V

    .line 40
    return-object v1
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
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    const/4 v0, 0x1

    .line 2
    .line 3
    if-ne p0, p1, :cond_0

    .line 4
    return v0

    .line 5
    .line 6
    :cond_0
    instance-of v1, p1, Lio/trtc/tuikit/atomicxcore/api/room/ScheduleRoomOptions;

    .line 7
    const/4 v2, 0x0

    .line 8
    .line 9
    if-nez v1, :cond_1

    .line 10
    return v2

    .line 11
    .line 12
    :cond_1
    check-cast p1, Lio/trtc/tuikit/atomicxcore/api/room/ScheduleRoomOptions;

    .line 13
    .line 14
    iget-object v1, p0, Lio/trtc/tuikit/atomicxcore/api/room/ScheduleRoomOptions;->roomName:Ljava/lang/String;

    .line 15
    .line 16
    iget-object v3, p1, Lio/trtc/tuikit/atomicxcore/api/room/ScheduleRoomOptions;->roomName:Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 20
    move-result v1

    .line 21
    .line 22
    if-nez v1, :cond_2

    .line 23
    return v2

    .line 24
    .line 25
    :cond_2
    iget-object v1, p0, Lio/trtc/tuikit/atomicxcore/api/room/ScheduleRoomOptions;->password:Ljava/lang/String;

    .line 26
    .line 27
    iget-object v3, p1, Lio/trtc/tuikit/atomicxcore/api/room/ScheduleRoomOptions;->password:Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 31
    move-result v1

    .line 32
    .line 33
    if-nez v1, :cond_3

    .line 34
    return v2

    .line 35
    .line 36
    :cond_3
    iget-wide v3, p0, Lio/trtc/tuikit/atomicxcore/api/room/ScheduleRoomOptions;->scheduleStartTime:J

    .line 37
    .line 38
    iget-wide v5, p1, Lio/trtc/tuikit/atomicxcore/api/room/ScheduleRoomOptions;->scheduleStartTime:J

    .line 39
    .line 40
    cmp-long v1, v3, v5

    .line 41
    .line 42
    if-eqz v1, :cond_4

    .line 43
    return v2

    .line 44
    .line 45
    :cond_4
    iget-wide v3, p0, Lio/trtc/tuikit/atomicxcore/api/room/ScheduleRoomOptions;->scheduleEndTime:J

    .line 46
    .line 47
    iget-wide v5, p1, Lio/trtc/tuikit/atomicxcore/api/room/ScheduleRoomOptions;->scheduleEndTime:J

    .line 48
    .line 49
    cmp-long v1, v3, v5

    .line 50
    .line 51
    if-eqz v1, :cond_5

    .line 52
    return v2

    .line 53
    .line 54
    :cond_5
    iget v1, p0, Lio/trtc/tuikit/atomicxcore/api/room/ScheduleRoomOptions;->reminderSecondsBeforeStart:I

    .line 55
    .line 56
    iget v3, p1, Lio/trtc/tuikit/atomicxcore/api/room/ScheduleRoomOptions;->reminderSecondsBeforeStart:I

    .line 57
    .line 58
    if-eq v1, v3, :cond_6

    .line 59
    return v2

    .line 60
    .line 61
    :cond_6
    iget-object v1, p0, Lio/trtc/tuikit/atomicxcore/api/room/ScheduleRoomOptions;->scheduleAttendees:Ljava/util/List;

    .line 62
    .line 63
    iget-object v3, p1, Lio/trtc/tuikit/atomicxcore/api/room/ScheduleRoomOptions;->scheduleAttendees:Ljava/util/List;

    .line 64
    .line 65
    .line 66
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 67
    move-result v1

    .line 68
    .line 69
    if-nez v1, :cond_7

    .line 70
    return v2

    .line 71
    .line 72
    :cond_7
    iget-boolean v1, p0, Lio/trtc/tuikit/atomicxcore/api/room/ScheduleRoomOptions;->isAllMicrophoneDisabled:Z

    .line 73
    .line 74
    iget-boolean v3, p1, Lio/trtc/tuikit/atomicxcore/api/room/ScheduleRoomOptions;->isAllMicrophoneDisabled:Z

    .line 75
    .line 76
    if-eq v1, v3, :cond_8

    .line 77
    return v2

    .line 78
    .line 79
    :cond_8
    iget-boolean v1, p0, Lio/trtc/tuikit/atomicxcore/api/room/ScheduleRoomOptions;->isAllCameraDisabled:Z

    .line 80
    .line 81
    iget-boolean v3, p1, Lio/trtc/tuikit/atomicxcore/api/room/ScheduleRoomOptions;->isAllCameraDisabled:Z

    .line 82
    .line 83
    if-eq v1, v3, :cond_9

    .line 84
    return v2

    .line 85
    .line 86
    :cond_9
    iget-boolean v1, p0, Lio/trtc/tuikit/atomicxcore/api/room/ScheduleRoomOptions;->isAllScreenShareDisabled:Z

    .line 87
    .line 88
    iget-boolean v3, p1, Lio/trtc/tuikit/atomicxcore/api/room/ScheduleRoomOptions;->isAllScreenShareDisabled:Z

    .line 89
    .line 90
    if-eq v1, v3, :cond_a

    .line 91
    return v2

    .line 92
    .line 93
    :cond_a
    iget-boolean v1, p0, Lio/trtc/tuikit/atomicxcore/api/room/ScheduleRoomOptions;->isAllMessageDisabled:Z

    .line 94
    .line 95
    iget-boolean p1, p1, Lio/trtc/tuikit/atomicxcore/api/room/ScheduleRoomOptions;->isAllMessageDisabled:Z

    .line 96
    .line 97
    if-eq v1, p1, :cond_b

    .line 98
    return v2

    .line 99
    :cond_b
    return v0
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

.method public final getPassword()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/api/room/ScheduleRoomOptions;->password:Ljava/lang/String;

    .line 3
    return-object v0
    .line 4
    .line 5
    .line 6
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
.end method

.method public final getReminderSecondsBeforeStart()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lio/trtc/tuikit/atomicxcore/api/room/ScheduleRoomOptions;->reminderSecondsBeforeStart:I

    .line 3
    return v0
    .line 4
    .line 5
    .line 6
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
.end method

.method public final getRoomName()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/api/room/ScheduleRoomOptions;->roomName:Ljava/lang/String;

    .line 3
    return-object v0
    .line 4
    .line 5
    .line 6
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
.end method

.method public final getScheduleAttendees()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/api/room/ScheduleRoomOptions;->scheduleAttendees:Ljava/util/List;

    .line 3
    return-object v0
    .line 4
    .line 5
    .line 6
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
.end method

.method public final getScheduleEndTime()J
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lio/trtc/tuikit/atomicxcore/api/room/ScheduleRoomOptions;->scheduleEndTime:J

    .line 3
    return-wide v0
    .line 4
    .line 5
    .line 6
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
.end method

.method public final getScheduleStartTime()J
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lio/trtc/tuikit/atomicxcore/api/room/ScheduleRoomOptions;->scheduleStartTime:J

    .line 3
    return-wide v0
    .line 4
    .line 5
    .line 6
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
.end method

.method public hashCode()I
    .locals 5

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/api/room/ScheduleRoomOptions;->roomName:Ljava/lang/String;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 6
    move-result v0

    .line 7
    .line 8
    const/16 v1, 0x1f

    .line 9
    mul-int/2addr v0, v1

    .line 10
    .line 11
    iget-object v2, p0, Lio/trtc/tuikit/atomicxcore/api/room/ScheduleRoomOptions;->password:Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    invoke-static {v2, v0, v1}, Lio/trtc/tuikit/atomicxcore/api/barrage/a;->a(Ljava/lang/String;II)I

    .line 15
    move-result v0

    .line 16
    .line 17
    iget-wide v2, p0, Lio/trtc/tuikit/atomicxcore/api/room/ScheduleRoomOptions;->scheduleStartTime:J

    .line 18
    .line 19
    .line 20
    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    .line 21
    move-result v2

    .line 22
    add-int/2addr v2, v0

    .line 23
    mul-int/2addr v2, v1

    .line 24
    .line 25
    iget-wide v3, p0, Lio/trtc/tuikit/atomicxcore/api/room/ScheduleRoomOptions;->scheduleEndTime:J

    .line 26
    .line 27
    .line 28
    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    .line 29
    move-result v0

    .line 30
    add-int/2addr v0, v2

    .line 31
    mul-int/2addr v0, v1

    .line 32
    .line 33
    iget v2, p0, Lio/trtc/tuikit/atomicxcore/api/room/ScheduleRoomOptions;->reminderSecondsBeforeStart:I

    .line 34
    .line 35
    .line 36
    invoke-static {v2, v0, v1}, Lio/trtc/tuikit/atomicxcore/api/call/a;->a(III)I

    .line 37
    move-result v0

    .line 38
    .line 39
    iget-object v2, p0, Lio/trtc/tuikit/atomicxcore/api/room/ScheduleRoomOptions;->scheduleAttendees:Ljava/util/List;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 43
    move-result v2

    .line 44
    add-int/2addr v2, v0

    .line 45
    mul-int/2addr v2, v1

    .line 46
    .line 47
    iget-boolean v0, p0, Lio/trtc/tuikit/atomicxcore/api/room/ScheduleRoomOptions;->isAllMicrophoneDisabled:Z

    .line 48
    const/4 v3, 0x1

    .line 49
    .line 50
    if-eqz v0, :cond_0

    .line 51
    move v0, v3

    .line 52
    :cond_0
    add-int/2addr v2, v0

    .line 53
    mul-int/2addr v2, v1

    .line 54
    .line 55
    iget-boolean v0, p0, Lio/trtc/tuikit/atomicxcore/api/room/ScheduleRoomOptions;->isAllCameraDisabled:Z

    .line 56
    .line 57
    if-eqz v0, :cond_1

    .line 58
    move v0, v3

    .line 59
    :cond_1
    add-int/2addr v2, v0

    .line 60
    mul-int/2addr v2, v1

    .line 61
    .line 62
    iget-boolean v0, p0, Lio/trtc/tuikit/atomicxcore/api/room/ScheduleRoomOptions;->isAllScreenShareDisabled:Z

    .line 63
    .line 64
    if-eqz v0, :cond_2

    .line 65
    move v0, v3

    .line 66
    :cond_2
    add-int/2addr v2, v0

    .line 67
    mul-int/2addr v2, v1

    .line 68
    .line 69
    iget-boolean v0, p0, Lio/trtc/tuikit/atomicxcore/api/room/ScheduleRoomOptions;->isAllMessageDisabled:Z

    .line 70
    .line 71
    if-eqz v0, :cond_3

    .line 72
    goto :goto_0

    .line 73
    :cond_3
    move v3, v0

    .line 74
    :goto_0
    add-int/2addr v2, v3

    .line 75
    return v2
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

.method public final isAllCameraDisabled()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lio/trtc/tuikit/atomicxcore/api/room/ScheduleRoomOptions;->isAllCameraDisabled:Z

    .line 3
    return v0
    .line 4
    .line 5
    .line 6
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
.end method

.method public final isAllMessageDisabled()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lio/trtc/tuikit/atomicxcore/api/room/ScheduleRoomOptions;->isAllMessageDisabled:Z

    .line 3
    return v0
    .line 4
    .line 5
    .line 6
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
.end method

.method public final isAllMicrophoneDisabled()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lio/trtc/tuikit/atomicxcore/api/room/ScheduleRoomOptions;->isAllMicrophoneDisabled:Z

    .line 3
    return v0
    .line 4
    .line 5
    .line 6
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
.end method

.method public final isAllScreenShareDisabled()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lio/trtc/tuikit/atomicxcore/api/room/ScheduleRoomOptions;->isAllScreenShareDisabled:Z

    .line 3
    return v0
    .line 4
    .line 5
    .line 6
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
.end method

.method public final setAllCameraDisabled(Z)V
    .locals 0

    .line 1
    .line 2
    iput-boolean p1, p0, Lio/trtc/tuikit/atomicxcore/api/room/ScheduleRoomOptions;->isAllCameraDisabled:Z

    .line 3
    return-void
    .line 4
    .line 5
    .line 6
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

.method public final setAllMessageDisabled(Z)V
    .locals 0

    .line 1
    .line 2
    iput-boolean p1, p0, Lio/trtc/tuikit/atomicxcore/api/room/ScheduleRoomOptions;->isAllMessageDisabled:Z

    .line 3
    return-void
    .line 4
    .line 5
    .line 6
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

.method public final setAllMicrophoneDisabled(Z)V
    .locals 0

    .line 1
    .line 2
    iput-boolean p1, p0, Lio/trtc/tuikit/atomicxcore/api/room/ScheduleRoomOptions;->isAllMicrophoneDisabled:Z

    .line 3
    return-void
    .line 4
    .line 5
    .line 6
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

.method public final setAllScreenShareDisabled(Z)V
    .locals 0

    .line 1
    .line 2
    iput-boolean p1, p0, Lio/trtc/tuikit/atomicxcore/api/room/ScheduleRoomOptions;->isAllScreenShareDisabled:Z

    .line 3
    return-void
    .line 4
    .line 5
    .line 6
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

.method public final setPassword(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "<set-?>"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/api/room/ScheduleRoomOptions;->password:Ljava/lang/String;

    .line 8
    return-void
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

.method public final setReminderSecondsBeforeStart(I)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lio/trtc/tuikit/atomicxcore/api/room/ScheduleRoomOptions;->reminderSecondsBeforeStart:I

    .line 3
    return-void
    .line 4
    .line 5
    .line 6
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

.method public final setRoomName(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "<set-?>"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/api/room/ScheduleRoomOptions;->roomName:Ljava/lang/String;

    .line 8
    return-void
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

.method public final setScheduleAttendees(Ljava/util/List;)V
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    const-string v0, "<set-?>"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/api/room/ScheduleRoomOptions;->scheduleAttendees:Ljava/util/List;

    .line 8
    return-void
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

.method public final setScheduleEndTime(J)V
    .locals 0

    .line 1
    .line 2
    iput-wide p1, p0, Lio/trtc/tuikit/atomicxcore/api/room/ScheduleRoomOptions;->scheduleEndTime:J

    .line 3
    return-void
    .line 4
    .line 5
    .line 6
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

.method public final setScheduleStartTime(J)V
    .locals 0

    .line 1
    .line 2
    iput-wide p1, p0, Lio/trtc/tuikit/atomicxcore/api/room/ScheduleRoomOptions;->scheduleStartTime:J

    .line 3
    return-void
    .line 4
    .line 5
    .line 6
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

.method public toString()Ljava/lang/String;
    .locals 3
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 3
    .line 4
    const-string v1, "ScheduleRoomOptions(roomName="

    .line 5
    .line 6
    .line 7
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    iget-object v1, p0, Lio/trtc/tuikit/atomicxcore/api/room/ScheduleRoomOptions;->roomName:Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    const-string v1, ", password="

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    iget-object v1, p0, Lio/trtc/tuikit/atomicxcore/api/room/ScheduleRoomOptions;->password:Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    const-string v1, ", scheduleStartTime="

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    iget-wide v1, p0, Lio/trtc/tuikit/atomicxcore/api/room/ScheduleRoomOptions;->scheduleStartTime:J

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    const-string v1, ", scheduleEndTime="

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    iget-wide v1, p0, Lio/trtc/tuikit/atomicxcore/api/room/ScheduleRoomOptions;->scheduleEndTime:J

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    const-string v1, ", reminderSecondsBeforeStart="

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    iget v1, p0, Lio/trtc/tuikit/atomicxcore/api/room/ScheduleRoomOptions;->reminderSecondsBeforeStart:I

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    const-string v1, ", scheduleAttendees="

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    iget-object v1, p0, Lio/trtc/tuikit/atomicxcore/api/room/ScheduleRoomOptions;->scheduleAttendees:Ljava/util/List;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    const-string v1, ", isAllMicrophoneDisabled="

    .line 65
    .line 66
    .line 67
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    iget-boolean v1, p0, Lio/trtc/tuikit/atomicxcore/api/room/ScheduleRoomOptions;->isAllMicrophoneDisabled:Z

    .line 70
    .line 71
    .line 72
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    const-string v1, ", isAllCameraDisabled="

    .line 75
    .line 76
    .line 77
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    iget-boolean v1, p0, Lio/trtc/tuikit/atomicxcore/api/room/ScheduleRoomOptions;->isAllCameraDisabled:Z

    .line 80
    .line 81
    .line 82
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    const-string v1, ", isAllScreenShareDisabled="

    .line 85
    .line 86
    .line 87
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    iget-boolean v1, p0, Lio/trtc/tuikit/atomicxcore/api/room/ScheduleRoomOptions;->isAllScreenShareDisabled:Z

    .line 90
    .line 91
    .line 92
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    const-string v1, ", isAllMessageDisabled="

    .line 95
    .line 96
    .line 97
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    iget-boolean v1, p0, Lio/trtc/tuikit/atomicxcore/api/room/ScheduleRoomOptions;->isAllMessageDisabled:Z

    .line 100
    .line 101
    .line 102
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    const/16 v1, 0x29

    .line 105
    .line 106
    .line 107
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 111
    move-result-object v0

    .line 112
    return-object v0
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
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
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
.end method
