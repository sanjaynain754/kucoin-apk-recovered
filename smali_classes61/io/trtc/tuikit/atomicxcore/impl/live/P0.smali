.class public abstract Lio/trtc/tuikit/atomicxcore/impl/live/P0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;)Lcom/tencent/cloud/tuikit/engine/extension/TUILiveConnectionManager$ConnectionUser;
    .locals 3

    .line 7
    new-instance v0, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveConnectionManager$ConnectionUser;

    invoke-direct {v0}, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveConnectionManager$ConnectionUser;-><init>()V

    const/4 v1, 0x0

    if-eqz p0, :cond_0

    .line 8
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;->getUserID()Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :cond_0
    move-object v2, v1

    :goto_0
    iput-object v2, v0, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveConnectionManager$ConnectionUser;->userId:Ljava/lang/String;

    if-eqz p0, :cond_1

    .line 9
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;->getUserName()Ljava/lang/String;

    move-result-object v2

    goto :goto_1

    :cond_1
    move-object v2, v1

    :goto_1
    iput-object v2, v0, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveConnectionManager$ConnectionUser;->userName:Ljava/lang/String;

    if-eqz p0, :cond_2

    .line 10
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;->getAvatarURL()Ljava/lang/String;

    move-result-object v2

    goto :goto_2

    :cond_2
    move-object v2, v1

    :goto_2
    iput-object v2, v0, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveConnectionManager$ConnectionUser;->avatarUrl:Ljava/lang/String;

    if-eqz p0, :cond_3

    .line 11
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;->getLiveID()Ljava/lang/String;

    move-result-object v1

    :cond_3
    iput-object v1, v0, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveConnectionManager$ConnectionUser;->roomId:Ljava/lang/String;

    return-object v0
.end method

.method public static final a(Ljava/lang/String;)Lio/trtc/tuikit/atomicxcore/api/live/LiveCanvas;
    .locals 7

    const-string v0, "jsonString"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    new-instance v1, Lio/trtc/tuikit/atomicxcore/api/live/LiveCanvas;

    const/4 v5, 0x7

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v1 .. v6}, Lio/trtc/tuikit/atomicxcore/api/live/LiveCanvas;-><init>(IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 2
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 3
    const-string p0, "canvasHeight"

    const/4 v2, 0x0

    invoke-virtual {v0, p0, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result p0

    invoke-virtual {v1, p0}, Lio/trtc/tuikit/atomicxcore/api/live/LiveCanvas;->setH(I)V

    .line 4
    const-string p0, "canvasWidth"

    invoke-virtual {v0, p0, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result p0

    invoke-virtual {v1, p0}, Lio/trtc/tuikit/atomicxcore/api/live/LiveCanvas;->setW(I)V

    .line 5
    const-string/jumbo p0, "templateId"

    invoke-virtual {v0, p0, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result p0

    invoke-virtual {v1, p0}, Lio/trtc/tuikit/atomicxcore/api/live/LiveCanvas;->setTemplateID(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v1

    :catch_0
    move-exception v0

    move-object p0, v0

    .line 6
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    return-object v1
.end method

.method public static final a(Lcom/tencent/cloud/tuikit/engine/extension/TUILiveConnectionManager$ConnectionUser;)Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;
    .locals 14

    const-string v0, "seatInfo"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    iget-object v6, p0, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveConnectionManager$ConnectionUser;->roomId:Ljava/lang/String;

    .line 13
    iget-object v2, p0, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveConnectionManager$ConnectionUser;->userId:Ljava/lang/String;

    .line 14
    iget-object v3, p0, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveConnectionManager$ConnectionUser;->userName:Ljava/lang/String;

    .line 15
    iget-object v4, p0, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveConnectionManager$ConnectionUser;->avatarUrl:Ljava/lang/String;

    .line 16
    new-instance v1, Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;

    .line 17
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 18
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 19
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 20
    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    const/16 v12, 0x3e8

    const/4 v13, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    .line 21
    invoke-direct/range {v1 .. v13}, Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/live/Role;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/device/DeviceStatus;ZLio/trtc/tuikit/atomicxcore/api/device/DeviceStatus;ZLio/trtc/tuikit/atomicxcore/api/live/SuspendStatus;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method
