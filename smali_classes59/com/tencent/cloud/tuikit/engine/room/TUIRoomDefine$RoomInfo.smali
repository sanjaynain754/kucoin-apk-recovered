.class public Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;
.super Ljava/lang/Object;
.source "TUIRoomDefine.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "RoomInfo"
.end annotation


# instance fields
.field public createTime:J

.field public isCameraDisableForAllUser:Z

.field public isMessageDisableForAllUser:Z

.field public isMicrophoneDisableForAllUser:Z

.field public isScreenShareDisableForAllUser:Z

.field public isSeatEnabled:Z

.field public keepOwnerOnSeat:Z

.field public maxSeatCount:I

.field public memberCount:I

.field public name:Ljava/lang/String;

.field public ownerAvatarUrl:Ljava/lang/String;

.field public ownerId:Ljava/lang/String;

.field public ownerName:Ljava/lang/String;

.field public password:Ljava/lang/String;

.field public roomId:Ljava/lang/String;

.field public roomType:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomType;

.field public seatMode:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatMode;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    sget-object v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomType;->CONFERENCE:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomType;

    .line 6
    .line 7
    iput-object v0, p0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;->roomType:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomType;

    .line 8
    const/4 v0, 0x0

    .line 9
    .line 10
    iput-boolean v0, p0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;->isCameraDisableForAllUser:Z

    .line 11
    .line 12
    iput-boolean v0, p0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;->isMicrophoneDisableForAllUser:Z

    .line 13
    .line 14
    iput-boolean v0, p0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;->isScreenShareDisableForAllUser:Z

    .line 15
    .line 16
    iput-boolean v0, p0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;->isMessageDisableForAllUser:Z

    .line 17
    .line 18
    iput-boolean v0, p0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;->isSeatEnabled:Z

    .line 19
    .line 20
    sget-object v1, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatMode;->FREE_TO_TAKE:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatMode;

    .line 21
    .line 22
    iput-object v1, p0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;->seatMode:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatMode;

    .line 23
    .line 24
    iput-boolean v0, p0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;->keepOwnerOnSeat:Z

    .line 25
    return-void
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
.end method
