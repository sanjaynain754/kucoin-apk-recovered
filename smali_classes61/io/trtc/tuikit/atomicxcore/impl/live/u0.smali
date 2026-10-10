.class public abstract Lio/trtc/tuikit/atomicxcore/impl/live/u0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;)Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfo;
    .locals 4

    const-string v0, "liveInfo"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    new-instance v0, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfo;

    invoke-direct {v0}, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfo;-><init>()V

    .line 29
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;->getLiveID()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfo;->roomId:Ljava/lang/String;

    .line 30
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;->getLiveName()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfo;->name:Ljava/lang/String;

    .line 31
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;->getNotice()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfo;->notice:Ljava/lang/String;

    .line 32
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;->isMessageDisable()Z

    move-result v1

    iput-boolean v1, v0, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfo;->isMessageDisableForAllUser:Z

    .line 33
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;->isPublicVisible()Z

    move-result v1

    iput-boolean v1, v0, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfo;->isPublicVisible:Z

    .line 34
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;->isSeatEnabled()Z

    move-result v1

    iput-boolean v1, v0, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfo;->isSeatEnabled:Z

    .line 35
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;->getKeepOwnerOnSeat()Z

    move-result v1

    iput-boolean v1, v0, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfo;->keepOwnerOnSeat:Z

    .line 36
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;->getMaxSeatCount()I

    move-result v1

    iput v1, v0, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfo;->maxSeatCount:I

    .line 37
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;->getSeatMode()Lio/trtc/tuikit/atomicxcore/api/live/TakeSeatMode;

    move-result-object v1

    .line 38
    const-string v2, "seatMode"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 39
    sget-object v2, Lio/trtc/tuikit/atomicxcore/impl/live/t0;->c:[I

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v1, v2, v1

    const/4 v2, 0x1

    if-eq v1, v2, :cond_1

    const/4 v2, 0x2

    if-ne v1, v2, :cond_0

    .line 40
    sget-object v1, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatMode;->APPLY_TO_TAKE:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatMode;

    goto :goto_0

    :cond_0
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    .line 41
    :cond_1
    sget-object v1, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatMode;->FREE_TO_TAKE:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatMode;

    .line 42
    :goto_0
    iput-object v1, v0, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfo;->seatMode:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatMode;

    .line 43
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;->getSeatLayoutTemplateID()I

    move-result v1

    iput v1, v0, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfo;->seatLayoutTemplateId:I

    .line 44
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;->getCoverURL()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfo;->coverUrl:Ljava/lang/String;

    .line 45
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;->getBackgroundURL()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfo;->backgroundUrl:Ljava/lang/String;

    .line 46
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;->getCategoryList()Ljava/util/List;

    move-result-object v1

    iput-object v1, v0, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfo;->categoryList:Ljava/util/List;

    .line 47
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;->getActivityStatus()I

    move-result v1

    iput v1, v0, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfo;->activityStatus:I

    .line 48
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;->getLiveOwner()Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;

    move-result-object v1

    invoke-virtual {v1}, Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;->getUserID()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfo;->ownerId:Ljava/lang/String;

    .line 49
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;->getLiveOwner()Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;

    move-result-object v1

    invoke-virtual {v1}, Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;->getUserName()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfo;->ownerName:Ljava/lang/String;

    .line 50
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;->getLiveOwner()Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;

    move-result-object v1

    invoke-virtual {v1}, Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;->getAvatarURL()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfo;->ownerAvatarUrl:Ljava/lang/String;

    .line 51
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;->getCreateTime()J

    move-result-wide v1

    iput-wide v1, v0, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfo;->createTime:J

    .line 52
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;->getTotalViewerCount()I

    move-result v1

    iput v1, v0, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfo;->viewCount:I

    .line 53
    new-instance v1, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;

    invoke-direct {v1}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;-><init>()V

    .line 54
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;->getLiveID()Ljava/lang/String;

    move-result-object v2

    iput-object v2, v1, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;->roomId:Ljava/lang/String;

    .line 55
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;->getLiveOwner()Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;

    move-result-object v2

    invoke-virtual {v2}, Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;->getUserID()Ljava/lang/String;

    move-result-object v2

    iput-object v2, v1, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;->ownerId:Ljava/lang/String;

    .line 56
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;->getLiveOwner()Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;

    move-result-object v2

    invoke-virtual {v2}, Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;->getUserName()Ljava/lang/String;

    move-result-object v2

    iput-object v2, v1, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;->ownerName:Ljava/lang/String;

    .line 57
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;->getLiveOwner()Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;

    move-result-object v2

    invoke-virtual {v2}, Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;->getAvatarURL()Ljava/lang/String;

    move-result-object v2

    iput-object v2, v1, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;->ownerAvatarUrl:Ljava/lang/String;

    .line 58
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;->getLiveName()Ljava/lang/String;

    move-result-object v2

    iput-object v2, v1, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;->name:Ljava/lang/String;

    .line 59
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;->isMessageDisable()Z

    move-result v2

    iput-boolean v2, v1, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;->isMessageDisableForAllUser:Z

    .line 60
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;->isSeatEnabled()Z

    move-result v2

    iput-boolean v2, v1, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;->isSeatEnabled:Z

    .line 61
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;->getKeepOwnerOnSeat()Z

    move-result v2

    iput-boolean v2, v1, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;->keepOwnerOnSeat:Z

    .line 62
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;->getMaxSeatCount()I

    move-result v2

    iput v2, v1, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;->maxSeatCount:I

    .line 63
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;->getSeatMode()Lio/trtc/tuikit/atomicxcore/api/live/TakeSeatMode;

    move-result-object v2

    sget-object v3, Lio/trtc/tuikit/atomicxcore/api/live/TakeSeatMode;->FREE:Lio/trtc/tuikit/atomicxcore/api/live/TakeSeatMode;

    if-ne v2, v3, :cond_2

    sget-object v2, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatMode;->FREE_TO_TAKE:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatMode;

    goto :goto_1

    .line 64
    :cond_2
    sget-object v2, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatMode;->APPLY_TO_TAKE:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatMode;

    .line 65
    :goto_1
    iput-object v2, v1, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;->seatMode:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatMode;

    .line 66
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;->getCreateTime()J

    move-result-wide v2

    iput-wide v2, v1, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;->createTime:J

    .line 67
    iput-object v1, v0, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfo;->roomInfo:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;

    return-object v0
.end method

.method public static final a(Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfo;)Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;
    .locals 23

    move-object/from16 v0, p0

    const-string v1, "liveInfo"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    new-instance v17, Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;

    const/4 v6, 0x7

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object/from16 v2, v17

    invoke-direct/range {v2 .. v7}, Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 2
    iget-object v1, v0, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfo;->ownerId:Ljava/lang/String;

    const-string v3, ""

    if-nez v1, :cond_0

    move-object v1, v3

    goto :goto_0

    :cond_0
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    :goto_0
    invoke-virtual {v2, v1}, Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;->setUserID(Ljava/lang/String;)V

    .line 3
    iget-object v1, v0, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfo;->ownerName:Ljava/lang/String;

    if-nez v1, :cond_1

    move-object v1, v3

    goto :goto_1

    :cond_1
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    :goto_1
    invoke-virtual {v2, v1}, Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;->setUserName(Ljava/lang/String;)V

    .line 4
    iget-object v1, v0, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfo;->ownerAvatarUrl:Ljava/lang/String;

    if-nez v1, :cond_2

    move-object v1, v3

    goto :goto_2

    :cond_2
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    :goto_2
    invoke-virtual {v2, v1}, Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;->setAvatarURL(Ljava/lang/String;)V

    move-object/from16 v17, v2

    .line 5
    new-instance v2, Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;

    .line 6
    iget-object v1, v0, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfo;->roomId:Ljava/lang/String;

    if-nez v1, :cond_3

    move-object v1, v3

    .line 7
    :cond_3
    iget-object v4, v0, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfo;->name:Ljava/lang/String;

    if-nez v4, :cond_4

    move-object v4, v3

    .line 8
    :cond_4
    iget-object v5, v0, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfo;->notice:Ljava/lang/String;

    if-nez v5, :cond_5

    move-object v5, v3

    .line 9
    :cond_5
    iget-boolean v6, v0, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfo;->isMessageDisableForAllUser:Z

    .line 10
    iget-boolean v7, v0, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfo;->isPublicVisible:Z

    .line 11
    iget-boolean v8, v0, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfo;->isSeatEnabled:Z

    .line 12
    iget-boolean v9, v0, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfo;->keepOwnerOnSeat:Z

    .line 13
    iget v10, v0, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfo;->maxSeatCount:I

    .line 14
    iget-object v11, v0, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfo;->seatMode:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatMode;

    const-string v12, "seatMode"

    invoke-static {v11, v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    invoke-static {v11, v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    sget-object v12, Lio/trtc/tuikit/atomicxcore/impl/live/t0;->d:[I

    invoke-virtual {v11}, Ljava/lang/Enum;->ordinal()I

    move-result v11

    aget v11, v12, v11

    const/4 v12, 0x1

    if-eq v11, v12, :cond_7

    const/4 v12, 0x2

    if-ne v11, v12, :cond_6

    .line 17
    sget-object v11, Lio/trtc/tuikit/atomicxcore/api/live/TakeSeatMode;->APPLY:Lio/trtc/tuikit/atomicxcore/api/live/TakeSeatMode;

    goto :goto_3

    :cond_6
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    .line 18
    :cond_7
    sget-object v11, Lio/trtc/tuikit/atomicxcore/api/live/TakeSeatMode;->FREE:Lio/trtc/tuikit/atomicxcore/api/live/TakeSeatMode;

    .line 19
    :goto_3
    iget v12, v0, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfo;->seatLayoutTemplateId:I

    .line 20
    iget-object v13, v0, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfo;->coverUrl:Ljava/lang/String;

    if-nez v13, :cond_8

    move-object v13, v3

    .line 21
    :cond_8
    iget-object v14, v0, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfo;->backgroundUrl:Ljava/lang/String;

    if-nez v14, :cond_9

    move-object v14, v3

    .line 22
    :cond_9
    iget-object v3, v0, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfo;->categoryList:Ljava/util/List;

    if-nez v3, :cond_a

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v3

    :cond_a
    move-object v15, v3

    .line 23
    iget v3, v0, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfo;->activityStatus:I

    move-object/from16 v18, v1

    move-object/from16 v16, v2

    .line 24
    iget-wide v1, v0, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfo;->createTime:J

    .line 25
    iget v0, v0, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfo;->viewCount:I

    .line 26
    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object v22

    const/16 v21, 0x1

    move-object/from16 v20, v16

    move/from16 v16, v3

    move-object/from16 v3, v18

    move-wide/from16 v18, v1

    move-object/from16 v2, v20

    move/from16 v20, v0

    .line 27
    invoke-direct/range {v2 .. v22}, Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZILio/trtc/tuikit/atomicxcore/api/live/TakeSeatMode;ILjava/lang/String;Ljava/lang/String;Ljava/util/List;ILio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;JIZLjava/util/Map;)V

    move-object/from16 v16, v2

    return-object v16
.end method
