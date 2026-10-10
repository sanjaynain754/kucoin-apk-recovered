.class public Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfo;
.super Ljava/lang/Object;
.source "TUILiveListManager.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "LiveInfo"
.end annotation


# instance fields
.field public activityStatus:I

.field public backgroundUrl:Ljava/lang/String;

.field public categoryList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public coverUrl:Ljava/lang/String;

.field public createTime:J

.field public isMessageDisableForAllUser:Z

.field public isPublicVisible:Z

.field public isSeatEnabled:Z

.field public keepOwnerOnSeat:Z

.field public maxSeatCount:I

.field public name:Ljava/lang/String;

.field public notice:Ljava/lang/String;

.field public ownerAvatarUrl:Ljava/lang/String;

.field public ownerId:Ljava/lang/String;

.field public ownerName:Ljava/lang/String;

.field public roomId:Ljava/lang/String;

.field public roomInfo:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public seatLayoutTemplateId:I

.field public seatMode:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatMode;

.field public viewCount:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    sget-object v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatMode;->FREE_TO_TAKE:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatMode;

    .line 6
    .line 7
    iput-object v0, p0, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfo;->seatMode:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatMode;

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
.end method
