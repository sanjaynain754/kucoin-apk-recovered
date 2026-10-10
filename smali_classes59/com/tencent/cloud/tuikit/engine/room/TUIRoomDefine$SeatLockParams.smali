.class public Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatLockParams;
.super Ljava/lang/Object;
.source "TUIRoomDefine.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "SeatLockParams"
.end annotation


# instance fields
.field public lockAudio:Z

.field public lockFlag:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatLockFlag;

.field public lockSeat:Z

.field public lockVideo:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    const/4 v0, 0x0

    .line 5
    .line 6
    iput-boolean v0, p0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatLockParams;->lockSeat:Z

    .line 7
    .line 8
    iput-boolean v0, p0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatLockParams;->lockVideo:Z

    .line 9
    .line 10
    iput-boolean v0, p0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatLockParams;->lockAudio:Z

    .line 11
    .line 12
    sget-object v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatLockFlag;->ALL:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatLockFlag;

    .line 13
    .line 14
    iput-object v0, p0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatLockParams;->lockFlag:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatLockFlag;

    .line 15
    return-void
    .line 16
    .line 17
.end method
