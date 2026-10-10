.class Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$RoomInfo;
.super Ljava/lang/Object;
.source "TUIRoomEngineJni.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "RoomInfo"
.end annotation


# instance fields
.field private mRoomInfo:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;


# direct methods
.method public constructor <init>(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$RoomInfo;->mRoomInfo:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;

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
.end method


# virtual methods
.method public getMaxSeatCount()I
    .locals 1
    .annotation build Lcom/tencent/liteav/base/annotations/CalledByNative;
        value = "RoomInfo"
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$RoomInfo;->mRoomInfo:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;

    .line 3
    .line 4
    iget v0, v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;->maxSeatCount:I

    .line 5
    return v0
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
.end method

.method public getName()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/tencent/liteav/base/annotations/CalledByNative;
        value = "RoomInfo"
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$RoomInfo;->mRoomInfo:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;

    .line 3
    .line 4
    iget-object v0, v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;->name:Ljava/lang/String;

    .line 5
    return-object v0
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
.end method

.method public getPassword()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/tencent/liteav/base/annotations/CalledByNative;
        value = "RoomInfo"
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$RoomInfo;->mRoomInfo:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;

    .line 3
    .line 4
    iget-object v0, v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;->password:Ljava/lang/String;

    .line 5
    return-object v0
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
.end method

.method public getRoomId()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/tencent/liteav/base/annotations/CalledByNative;
        value = "RoomInfo"
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$RoomInfo;->mRoomInfo:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;

    .line 3
    .line 4
    iget-object v0, v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;->roomId:Ljava/lang/String;

    .line 5
    return-object v0
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
.end method

.method public getRoomType()I
    .locals 1
    .annotation build Lcom/tencent/liteav/base/annotations/CalledByNative;
        value = "RoomInfo"
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$RoomInfo;->mRoomInfo:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;

    .line 3
    .line 4
    iget-object v0, v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;->roomType:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomType;

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomType;->getValue()I

    .line 8
    move-result v0

    .line 9
    return v0
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public getSeatMode()I
    .locals 1
    .annotation build Lcom/tencent/liteav/base/annotations/CalledByNative;
        value = "RoomInfo"
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$RoomInfo;->mRoomInfo:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;

    .line 3
    .line 4
    iget-object v0, v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;->seatMode:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatMode;

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatMode;->getValue()I

    .line 8
    move-result v0

    .line 9
    return v0
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public isCameraDisableForAllUser()Z
    .locals 1
    .annotation build Lcom/tencent/liteav/base/annotations/CalledByNative;
        value = "RoomInfo"
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$RoomInfo;->mRoomInfo:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;

    .line 3
    .line 4
    iget-boolean v0, v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;->isCameraDisableForAllUser:Z

    .line 5
    return v0
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
.end method

.method public isMessageDisableForAllUser()Z
    .locals 1
    .annotation build Lcom/tencent/liteav/base/annotations/CalledByNative;
        value = "RoomInfo"
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$RoomInfo;->mRoomInfo:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;

    .line 3
    .line 4
    iget-boolean v0, v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;->isMessageDisableForAllUser:Z

    .line 5
    return v0
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
.end method

.method public isMicrophoneDisableForAllUser()Z
    .locals 1
    .annotation build Lcom/tencent/liteav/base/annotations/CalledByNative;
        value = "RoomInfo"
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$RoomInfo;->mRoomInfo:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;

    .line 3
    .line 4
    iget-boolean v0, v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;->isMicrophoneDisableForAllUser:Z

    .line 5
    return v0
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
.end method

.method public isScreenShareDisableForAllUser()Z
    .locals 1
    .annotation build Lcom/tencent/liteav/base/annotations/CalledByNative;
        value = "RoomInfo"
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$RoomInfo;->mRoomInfo:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;

    .line 3
    .line 4
    iget-boolean v0, v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;->isScreenShareDisableForAllUser:Z

    .line 5
    return v0
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
.end method

.method public isSeatEnabled()Z
    .locals 1
    .annotation build Lcom/tencent/liteav/base/annotations/CalledByNative;
        value = "RoomInfo"
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$RoomInfo;->mRoomInfo:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;

    .line 3
    .line 4
    iget-boolean v0, v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;->isSeatEnabled:Z

    .line 5
    return v0
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
.end method

.method public keepOwnerOnSeat()Z
    .locals 1
    .annotation build Lcom/tencent/liteav/base/annotations/CalledByNative;
        value = "RoomInfo"
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$RoomInfo;->mRoomInfo:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;

    .line 3
    .line 4
    iget-boolean v0, v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;->keepOwnerOnSeat:Z

    .line 5
    return v0
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
.end method
