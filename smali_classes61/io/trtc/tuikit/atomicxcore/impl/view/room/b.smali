.class public abstract Lio/trtc/tuikit/atomicxcore/impl/view/room/b;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lio/trtc/tuikit/atomicxcore/api/view/RoomParticipantView;)V
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    new-instance v0, Ljg0/a;

    invoke-direct {v0, p0}, Ljg0/a;-><init>(Lio/trtc/tuikit/atomicxcore/api/view/RoomParticipantView;)V

    invoke-virtual {p0, v0}, Lio/trtc/tuikit/atomicxcore/api/view/RoomParticipantView;->setMeasureLayoutRunnable$atomicxcore_release(Ljava/lang/Runnable;)V

    .line 2
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/view/RoomParticipantView;->getVideoView$atomicxcore_release()Lcom/tencent/cloud/tuikit/engine/common/TUIVideoView;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    return-void
.end method

.method public static final a(Lio/trtc/tuikit/atomicxcore/api/view/RoomParticipantView;Lio/trtc/tuikit/atomicxcore/api/view/VideoStreamType;Lio/trtc/tuikit/atomicxcore/api/room/RoomParticipant;)V
    .locals 5

    .line 18
    sget-object v0, Lio/trtc/tuikit/atomicxcore/api/login/LoginStore;->shared:Lio/trtc/tuikit/atomicxcore/api/login/LoginStore;

    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/login/LoginStore;->getLoginState()Lio/trtc/tuikit/atomicxcore/api/login/LoginState;

    move-result-object v0

    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/login/LoginState;->getLoginUserInfo()Lkotlinx/coroutines/flow/w;

    move-result-object v0

    invoke-interface {v0}, Lkotlinx/coroutines/flow/w;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/trtc/tuikit/atomicxcore/api/login/UserProfile;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/login/UserProfile;->getUserID()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const/4 v1, 0x2

    const-string v2, "message"

    if-eqz v0, :cond_a

    .line 19
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v3

    if-nez v3, :cond_1

    goto/16 :goto_2

    .line 20
    :cond_1
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/view/RoomParticipantView;->getFillMode$atomicxcore_release()Lio/trtc/tuikit/atomicxcore/api/view/FillMode;

    move-result-object v3

    if-eqz v3, :cond_2

    .line 21
    invoke-static {p1, p2, v3}, Lio/trtc/tuikit/atomicxcore/impl/view/room/b;->a(Lio/trtc/tuikit/atomicxcore/api/view/VideoStreamType;Lio/trtc/tuikit/atomicxcore/api/room/RoomParticipant;Lio/trtc/tuikit/atomicxcore/api/view/FillMode;)V

    .line 22
    :cond_2
    invoke-virtual {p2}, Lio/trtc/tuikit/atomicxcore/api/room/RoomParticipant;->getUserID()Ljava/lang/String;

    move-result-object v3

    .line 23
    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 24
    sget-object p1, Lio/trtc/tuikit/atomicxcore/impl/view/room/i;->f:Lkotlin/Lazy;

    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/view/room/d;->a()Lio/trtc/tuikit/atomicxcore/impl/view/room/i;

    move-result-object p1

    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/view/RoomParticipantView;->getVideoView$atomicxcore_release()Lcom/tencent/cloud/tuikit/engine/common/TUIVideoView;

    move-result-object p0

    .line 25
    iget-object p1, p1, Lio/trtc/tuikit/atomicxcore/impl/view/room/i;->b:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;

    .line 26
    invoke-virtual {p1, p0}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;->setLocalVideoView(Lcom/tencent/cloud/tuikit/engine/common/TUIVideoView;)V

    return-void

    .line 27
    :cond_3
    sget-object v0, Lio/trtc/tuikit/atomicxcore/impl/view/room/a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    const/4 v3, 0x0

    if-eq p1, v0, :cond_8

    if-eq p1, v1, :cond_4

    goto :goto_1

    .line 28
    :cond_4
    invoke-virtual {p2}, Lio/trtc/tuikit/atomicxcore/api/room/RoomParticipant;->getScreenShareStatus()Lio/trtc/tuikit/atomicxcore/api/device/DeviceStatus;

    move-result-object p1

    sget-object v0, Lio/trtc/tuikit/atomicxcore/api/device/DeviceStatus;->ON:Lio/trtc/tuikit/atomicxcore/api/device/DeviceStatus;

    if-ne p1, v0, :cond_7

    .line 29
    sget-object p1, Lio/trtc/tuikit/atomicxcore/impl/view/room/i;->f:Lkotlin/Lazy;

    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/view/room/d;->a()Lio/trtc/tuikit/atomicxcore/impl/view/room/i;

    move-result-object p1

    invoke-virtual {p2}, Lio/trtc/tuikit/atomicxcore/api/room/RoomParticipant;->getUserID()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/view/RoomParticipantView;->getVideoView$atomicxcore_release()Lcom/tencent/cloud/tuikit/engine/common/TUIVideoView;

    move-result-object p0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    const-string/jumbo v0, "userID"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "view"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    iget-object v0, p1, Lio/trtc/tuikit/atomicxcore/impl/view/room/i;->a:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string/jumbo v4, "startPlayScreenShareStream,userId:"

    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, " ,view:"

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v4

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 32
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    invoke-virtual {v0, v3, v1}, Lio/trtc/tuikit/atomicxcore/impl/common/r;->a(ILjava/lang/String;)V

    .line 34
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_5

    :goto_1
    return-void

    .line 35
    :cond_5
    new-instance v0, Lio/trtc/tuikit/atomicxcore/impl/view/room/e;

    sget-object v1, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$VideoStreamType;->SCREEN_STREAM:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$VideoStreamType;

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v4

    invoke-direct {v0, p2, v1, v4}, Lio/trtc/tuikit/atomicxcore/impl/view/room/e;-><init>(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$VideoStreamType;I)V

    .line 36
    iget-object v4, p1, Lio/trtc/tuikit/atomicxcore/impl/view/room/i;->e:Lio/trtc/tuikit/atomicxcore/impl/view/room/e;

    invoke-static {v0, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_6

    .line 37
    iget-object p0, p1, Lio/trtc/tuikit/atomicxcore/impl/view/room/i;->a:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 38
    const-string p1, "same user operation, ignore"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 39
    invoke-virtual {p0, v3, p1}, Lio/trtc/tuikit/atomicxcore/impl/common/r;->a(ILjava/lang/String;)V

    return-void

    .line 40
    :cond_6
    iget-object v2, p1, Lio/trtc/tuikit/atomicxcore/impl/view/room/i;->b:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;

    invoke-virtual {v2, p2, v1, p0}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;->setRemoteVideoView(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$VideoStreamType;Lcom/tencent/cloud/tuikit/engine/common/TUIVideoView;)V

    .line 41
    iget-object p0, p1, Lio/trtc/tuikit/atomicxcore/impl/view/room/i;->b:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;

    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/view/room/h;

    invoke-direct {v2, p1}, Lio/trtc/tuikit/atomicxcore/impl/view/room/h;-><init>(Lio/trtc/tuikit/atomicxcore/impl/view/room/i;)V

    invoke-virtual {p0, p2, v1, v2}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;->startPlayRemoteVideo(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$VideoStreamType;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$PlayCallback;)V

    .line 42
    iput-object v0, p1, Lio/trtc/tuikit/atomicxcore/impl/view/room/i;->e:Lio/trtc/tuikit/atomicxcore/impl/view/room/e;

    return-void

    .line 43
    :cond_7
    sget-object p1, Lio/trtc/tuikit/atomicxcore/impl/view/room/i;->f:Lkotlin/Lazy;

    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/view/room/d;->a()Lio/trtc/tuikit/atomicxcore/impl/view/room/i;

    move-result-object p1

    invoke-virtual {p2}, Lio/trtc/tuikit/atomicxcore/api/room/RoomParticipant;->getUserID()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/view/RoomParticipantView;->getVideoView$atomicxcore_release()Lcom/tencent/cloud/tuikit/engine/common/TUIVideoView;

    move-result-object p0

    .line 44
    invoke-virtual {p1, p2, p0, v3}, Lio/trtc/tuikit/atomicxcore/impl/view/room/i;->b(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/common/TUIVideoView;Z)V

    return-void

    .line 45
    :cond_8
    invoke-virtual {p2}, Lio/trtc/tuikit/atomicxcore/api/room/RoomParticipant;->getCameraStatus()Lio/trtc/tuikit/atomicxcore/api/device/DeviceStatus;

    move-result-object p1

    sget-object v0, Lio/trtc/tuikit/atomicxcore/api/device/DeviceStatus;->ON:Lio/trtc/tuikit/atomicxcore/api/device/DeviceStatus;

    if-ne p1, v0, :cond_9

    .line 46
    sget-object p1, Lio/trtc/tuikit/atomicxcore/impl/view/room/i;->f:Lkotlin/Lazy;

    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/view/room/d;->a()Lio/trtc/tuikit/atomicxcore/impl/view/room/i;

    move-result-object p1

    invoke-virtual {p2}, Lio/trtc/tuikit/atomicxcore/api/room/RoomParticipant;->getUserID()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/view/RoomParticipantView;->getVideoView$atomicxcore_release()Lcom/tencent/cloud/tuikit/engine/common/TUIVideoView;

    move-result-object p0

    invoke-virtual {p1, p2, p0}, Lio/trtc/tuikit/atomicxcore/impl/view/room/i;->a(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/common/TUIVideoView;)V

    return-void

    .line 47
    :cond_9
    sget-object p1, Lio/trtc/tuikit/atomicxcore/impl/view/room/i;->f:Lkotlin/Lazy;

    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/view/room/d;->a()Lio/trtc/tuikit/atomicxcore/impl/view/room/i;

    move-result-object p1

    invoke-virtual {p2}, Lio/trtc/tuikit/atomicxcore/api/room/RoomParticipant;->getUserID()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/view/RoomParticipantView;->getVideoView$atomicxcore_release()Lcom/tencent/cloud/tuikit/engine/common/TUIVideoView;

    move-result-object p0

    .line 48
    invoke-virtual {p1, p2, p0, v3}, Lio/trtc/tuikit/atomicxcore/impl/view/room/i;->a(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/common/TUIVideoView;Z)V

    return-void

    .line 49
    :cond_a
    :goto_2
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/view/RoomParticipantView;->getLog$atomicxcore_release()Lio/trtc/tuikit/atomicxcore/impl/common/r;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    const-string p1, "Invalid login userId"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 51
    invoke-virtual {p0, v1, p1}, Lio/trtc/tuikit/atomicxcore/impl/common/r;->a(ILjava/lang/String;)V

    return-void
.end method

.method public static final a(Lio/trtc/tuikit/atomicxcore/api/view/VideoStreamType;Lio/trtc/tuikit/atomicxcore/api/room/RoomParticipant;Lio/trtc/tuikit/atomicxcore/api/view/FillMode;)V
    .locals 7

    .line 3
    sget-object v0, Lio/trtc/tuikit/atomicxcore/impl/view/room/i;->f:Lkotlin/Lazy;

    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/view/room/d;->a()Lio/trtc/tuikit/atomicxcore/impl/view/room/i;

    move-result-object v0

    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/room/RoomParticipant;->getUserID()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    const-string/jumbo v1, "userID"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v1, "streamType"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "fillMode"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    sget-object v1, Lio/trtc/tuikit/atomicxcore/api/login/LoginStore;->shared:Lio/trtc/tuikit/atomicxcore/api/login/LoginStore;

    invoke-virtual {v1}, Lio/trtc/tuikit/atomicxcore/api/login/LoginStore;->getLoginState()Lio/trtc/tuikit/atomicxcore/api/login/LoginState;

    move-result-object v1

    invoke-virtual {v1}, Lio/trtc/tuikit/atomicxcore/api/login/LoginState;->getLoginUserInfo()Lkotlinx/coroutines/flow/w;

    move-result-object v1

    invoke-interface {v1}, Lkotlinx/coroutines/flow/w;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/trtc/tuikit/atomicxcore/api/login/UserProfile;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lio/trtc/tuikit/atomicxcore/api/login/UserProfile;->getUserID()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    const/4 v2, 0x2

    if-eqz v1, :cond_6

    .line 6
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v3

    if-nez v3, :cond_1

    goto :goto_2

    .line 7
    :cond_1
    new-instance v3, Lcom/tencent/trtc/TRTCCloudDef$TRTCRenderParams;

    invoke-direct {v3}, Lcom/tencent/trtc/TRTCCloudDef$TRTCRenderParams;-><init>()V

    .line 8
    sget-object v4, Lio/trtc/tuikit/atomicxcore/api/view/FillMode;->FILL:Lio/trtc/tuikit/atomicxcore/api/view/FillMode;

    const/4 v5, 0x0

    const/4 v6, 0x1

    if-ne p2, v4, :cond_2

    move p2, v5

    goto :goto_1

    :cond_2
    move p2, v6

    :goto_1
    iput p2, v3, Lcom/tencent/trtc/TRTCCloudDef$TRTCRenderParams;->fillMode:I

    .line 9
    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_3

    .line 10
    iget-object p0, v0, Lio/trtc/tuikit/atomicxcore/impl/view/room/i;->b:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;

    invoke-virtual {p0}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;->getTRTCCloud()Lcom/tencent/trtc/TRTCCloud;

    move-result-object p0

    invoke-virtual {p0, v3}, Lcom/tencent/trtc/TRTCCloud;->setLocalRenderParams(Lcom/tencent/trtc/TRTCCloudDef$TRTCRenderParams;)V

    return-void

    .line 11
    :cond_3
    sget-object p2, Lio/trtc/tuikit/atomicxcore/impl/view/room/f;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, p2, p0

    if-eq p0, v6, :cond_5

    if-eq p0, v2, :cond_4

    return-void

    .line 12
    :cond_4
    iget-object p0, v0, Lio/trtc/tuikit/atomicxcore/impl/view/room/i;->b:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;

    invoke-virtual {p0}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;->getTRTCCloud()Lcom/tencent/trtc/TRTCCloud;

    move-result-object p0

    invoke-virtual {p0, p1, v2, v3}, Lcom/tencent/trtc/TRTCCloud;->setRemoteRenderParams(Ljava/lang/String;ILcom/tencent/trtc/TRTCCloudDef$TRTCRenderParams;)V

    return-void

    .line 13
    :cond_5
    iget-object p0, v0, Lio/trtc/tuikit/atomicxcore/impl/view/room/i;->b:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;

    invoke-virtual {p0}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;->getTRTCCloud()Lcom/tencent/trtc/TRTCCloud;

    move-result-object p0

    invoke-virtual {p0, p1, v5, v3}, Lcom/tencent/trtc/TRTCCloud;->setRemoteRenderParams(Ljava/lang/String;ILcom/tencent/trtc/TRTCCloudDef$TRTCRenderParams;)V

    .line 14
    iget-object p0, v0, Lio/trtc/tuikit/atomicxcore/impl/view/room/i;->b:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;

    invoke-virtual {p0}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;->getTRTCCloud()Lcom/tencent/trtc/TRTCCloud;

    move-result-object p0

    invoke-virtual {p0, p1, v6, v3}, Lcom/tencent/trtc/TRTCCloud;->setRemoteRenderParams(Ljava/lang/String;ILcom/tencent/trtc/TRTCCloudDef$TRTCRenderParams;)V

    return-void

    .line 15
    :cond_6
    :goto_2
    iget-object p0, v0, Lio/trtc/tuikit/atomicxcore/impl/view/room/i;->a:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 16
    const-string p1, "message"

    const-string p2, "Invalid login userId"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    invoke-virtual {p0, v2, p2}, Lio/trtc/tuikit/atomicxcore/impl/common/r;->a(ILjava/lang/String;)V

    return-void
.end method

.method public static final a(Lio/trtc/tuikit/atomicxcore/api/view/RoomParticipantView;Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    const-string v2, "<this>"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v2, "view"

    move-object/from16 v3, p1

    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "event"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 52
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/view/RoomParticipantView;->getStreamType$atomicxcore_release()Lio/trtc/tuikit/atomicxcore/api/view/VideoStreamType;

    move-result-object v2

    sget-object v4, Lio/trtc/tuikit/atomicxcore/api/view/VideoStreamType;->SCREEN:Lio/trtc/tuikit/atomicxcore/api/view/VideoStreamType;

    const/4 v5, 0x0

    if-eq v2, v4, :cond_0

    return v5

    .line 53
    :cond_0
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getPointerCount()I

    move-result v2

    .line 54
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getAction()I

    move-result v4

    and-int/lit16 v4, v4, 0xff

    const/4 v6, 0x1

    if-eqz v4, :cond_14

    const/4 v7, 0x2

    const/4 v8, 0x0

    if-eq v4, v6, :cond_11

    if-eq v4, v7, :cond_7

    const/4 v3, 0x3

    if-eq v4, v3, :cond_5

    const/4 v3, 0x5

    if-eq v4, v3, :cond_2

    const/4 v1, 0x6

    if-eq v4, v1, :cond_1

    goto/16 :goto_4

    :cond_1
    if-ne v2, v7, :cond_15

    .line 55
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-eqz v0, :cond_15

    invoke-interface {v0, v5}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    goto/16 :goto_4

    :cond_2
    if-ne v2, v7, :cond_15

    .line 56
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v2

    if-eqz v2, :cond_3

    invoke-interface {v2, v6}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 57
    :cond_3
    invoke-virtual {v1, v5}, Landroid/view/MotionEvent;->getX(I)F

    move-result v2

    invoke-virtual {v0, v2}, Lio/trtc/tuikit/atomicxcore/api/view/RoomParticipantView;->setPressedPoint1X$atomicxcore_release(F)V

    .line 58
    invoke-virtual {v1, v6}, Landroid/view/MotionEvent;->getX(I)F

    move-result v2

    invoke-virtual {v0, v2}, Lio/trtc/tuikit/atomicxcore/api/view/RoomParticipantView;->setPressedPoint2X$atomicxcore_release(F)V

    .line 59
    invoke-virtual {v1, v5}, Landroid/view/MotionEvent;->getY(I)F

    move-result v2

    invoke-virtual {v0, v2}, Lio/trtc/tuikit/atomicxcore/api/view/RoomParticipantView;->setPressedPoint1Y$atomicxcore_release(F)V

    .line 60
    invoke-virtual {v1, v6}, Landroid/view/MotionEvent;->getY(I)F

    move-result v2

    invoke-virtual {v0, v2}, Lio/trtc/tuikit/atomicxcore/api/view/RoomParticipantView;->setPressedPoint2Y$atomicxcore_release(F)V

    .line 61
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getPointerCount()I

    move-result v2

    if-ne v2, v7, :cond_4

    .line 62
    invoke-virtual {v1, v5}, Landroid/view/MotionEvent;->getX(I)F

    move-result v2

    invoke-virtual {v1, v6}, Landroid/view/MotionEvent;->getX(I)F

    move-result v3

    sub-float/2addr v2, v3

    .line 63
    invoke-virtual {v1, v5}, Landroid/view/MotionEvent;->getY(I)F

    move-result v3

    invoke-virtual {v1, v6}, Landroid/view/MotionEvent;->getY(I)F

    move-result v1

    sub-float/2addr v3, v1

    mul-float/2addr v2, v2

    mul-float/2addr v3, v3

    add-float/2addr v3, v2

    float-to-double v1, v3

    .line 64
    invoke-static {v1, v2}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v9

    goto :goto_0

    :cond_4
    const-wide/16 v9, 0x0

    .line 65
    :goto_0
    invoke-virtual {v0, v9, v10}, Lio/trtc/tuikit/atomicxcore/api/view/RoomParticipantView;->setDistBeforeMove$atomicxcore_release(D)V

    goto/16 :goto_4

    .line 66
    :cond_5
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    if-eqz v1, :cond_6

    invoke-interface {v1, v5}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    :cond_6
    if-ne v2, v7, :cond_15

    .line 67
    invoke-virtual {v0, v8}, Lio/trtc/tuikit/atomicxcore/api/view/RoomParticipantView;->setPressedPoint1X$atomicxcore_release(F)V

    .line 68
    invoke-virtual {v0, v8}, Lio/trtc/tuikit/atomicxcore/api/view/RoomParticipantView;->setPressedPoint1Y$atomicxcore_release(F)V

    .line 69
    invoke-virtual {v0, v8}, Lio/trtc/tuikit/atomicxcore/api/view/RoomParticipantView;->setPressedPoint2X$atomicxcore_release(F)V

    .line 70
    invoke-virtual {v0, v8}, Lio/trtc/tuikit/atomicxcore/api/view/RoomParticipantView;->setPressedPoint2Y$atomicxcore_release(F)V

    goto/16 :goto_4

    :cond_7
    if-ne v2, v6, :cond_9

    .line 71
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getX()F

    move-result v4

    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/view/RoomParticipantView;->getTouchDownPointX$atomicxcore_release()F

    move-result v11

    sub-float/2addr v4, v11

    invoke-static {v4}, Ljava/lang/Math;->abs(F)F

    move-result v4

    .line 72
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getY()F

    move-result v11

    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/view/RoomParticipantView;->getTouchDownPointY$atomicxcore_release()F

    move-result v12

    sub-float/2addr v11, v12

    invoke-static {v11}, Ljava/lang/Math;->abs(F)F

    move-result v11

    const/high16 v12, 0x41200000    # 10.0f

    cmpl-float v4, v4, v12

    if-gez v4, :cond_8

    cmpl-float v4, v11, v12

    if-ltz v4, :cond_9

    .line 73
    :cond_8
    invoke-virtual {v0, v5}, Lio/trtc/tuikit/atomicxcore/api/view/RoomParticipantView;->setClickAction$atomicxcore_release(Z)V

    :cond_9
    if-ne v2, v7, :cond_15

    .line 74
    invoke-virtual {v1, v5}, Landroid/view/MotionEvent;->getX(I)F

    move-result v2

    .line 75
    invoke-virtual {v1, v6}, Landroid/view/MotionEvent;->getX(I)F

    move-result v4

    .line 76
    invoke-virtual {v1, v5}, Landroid/view/MotionEvent;->getY(I)F

    move-result v11

    .line 77
    invoke-virtual {v1, v6}, Landroid/view/MotionEvent;->getY(I)F

    move-result v12

    .line 78
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/view/RoomParticipantView;->getPressedPoint1X$atomicxcore_release()F

    move-result v13

    sub-float/2addr v2, v13

    float-to-double v13, v2

    .line 79
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/view/RoomParticipantView;->getPressedPoint2X$atomicxcore_release()F

    move-result v2

    sub-float/2addr v4, v2

    float-to-double v9, v4

    .line 80
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/view/RoomParticipantView;->getPressedPoint1Y$atomicxcore_release()F

    move-result v2

    sub-float/2addr v11, v2

    move v4, v8

    move-wide v15, v9

    float-to-double v8, v11

    .line 81
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/view/RoomParticipantView;->getPressedPoint2Y$atomicxcore_release()F

    move-result v2

    sub-float/2addr v12, v2

    float-to-double v10, v12

    .line 82
    invoke-virtual {v0}, Landroid/view/View;->getScaleX()F

    move-result v2

    const/high16 v12, 0x3f800000    # 1.0f

    cmpl-float v2, v2, v12

    if-lez v2, :cond_d

    move v2, v12

    move-wide/from16 v17, v13

    int-to-double v12, v7

    div-double v17, v17, v12

    div-double/2addr v15, v12

    move v14, v2

    add-double v2, v15, v17

    double-to-float v2, v2

    div-double/2addr v8, v12

    div-double/2addr v10, v12

    add-double/2addr v10, v8

    double-to-float v3, v10

    neg-float v2, v2

    neg-float v3, v3

    .line 83
    invoke-virtual {v0}, Landroid/view/View;->getPivotX()F

    move-result v8

    add-float/2addr v8, v2

    .line 84
    invoke-virtual {v0}, Landroid/view/View;->getPivotY()F

    move-result v2

    add-float/2addr v2, v3

    cmpg-float v3, v8, v4

    if-gez v3, :cond_a

    cmpg-float v9, v2, v4

    if-gez v9, :cond_a

    move v2, v4

    move v8, v2

    goto :goto_1

    :cond_a
    cmpl-float v9, v8, v4

    if-lez v9, :cond_b

    cmpg-float v9, v2, v4

    if-gez v9, :cond_b

    .line 85
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v2

    int-to-float v2, v2

    invoke-static {v8, v2}, Lkotlin/ranges/RangesKt;->coerceAtMost(FF)F

    move-result v2

    move v8, v2

    move v2, v4

    goto :goto_1

    :cond_b
    if-gez v3, :cond_c

    cmpl-float v3, v2, v4

    if-lez v3, :cond_c

    .line 86
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v3

    int-to-float v3, v3

    invoke-static {v2, v3}, Lkotlin/ranges/RangesKt;->coerceAtMost(FF)F

    move-result v2

    move v8, v4

    goto :goto_1

    .line 87
    :cond_c
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v3

    int-to-float v3, v3

    invoke-static {v8, v3}, Lkotlin/ranges/RangesKt;->coerceAtMost(FF)F

    move-result v8

    .line 88
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v3

    int-to-float v3, v3

    invoke-static {v2, v3}, Lkotlin/ranges/RangesKt;->coerceAtMost(FF)F

    move-result v2

    .line 89
    :goto_1
    invoke-virtual {v0, v8}, Landroid/view/View;->setPivotX(F)V

    .line 90
    invoke-virtual {v0, v2}, Landroid/view/View;->setPivotY(F)V

    goto :goto_2

    :cond_d
    move v14, v12

    .line 91
    :goto_2
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getPointerCount()I

    move-result v2

    if-ne v2, v7, :cond_e

    .line 92
    invoke-virtual {v1, v5}, Landroid/view/MotionEvent;->getX(I)F

    move-result v2

    invoke-virtual {v1, v6}, Landroid/view/MotionEvent;->getX(I)F

    move-result v3

    sub-float/2addr v2, v3

    .line 93
    invoke-virtual {v1, v5}, Landroid/view/MotionEvent;->getY(I)F

    move-result v3

    invoke-virtual {v1, v6}, Landroid/view/MotionEvent;->getY(I)F

    move-result v1

    sub-float/2addr v3, v1

    mul-float/2addr v2, v2

    mul-float/2addr v3, v3

    add-float/2addr v3, v2

    float-to-double v1, v3

    .line 94
    invoke-static {v1, v2}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v9

    goto :goto_3

    :cond_e
    const-wide/16 v9, 0x0

    .line 95
    :goto_3
    invoke-virtual {v0, v9, v10}, Lio/trtc/tuikit/atomicxcore/api/view/RoomParticipantView;->setDistAfterMove$atomicxcore_release(D)V

    .line 96
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/view/RoomParticipantView;->getDistAfterMove$atomicxcore_release()D

    move-result-wide v1

    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/view/RoomParticipantView;->getDistBeforeMove$atomicxcore_release()D

    move-result-wide v3

    sub-double/2addr v1, v3

    .line 97
    invoke-virtual {v0}, Landroid/view/View;->getScaleX()F

    move-result v3

    float-to-double v3, v3

    invoke-virtual/range {p1 .. p1}, Landroid/view/View;->getWidth()I

    move-result v5

    int-to-double v7, v5

    div-double/2addr v1, v7

    add-double/2addr v1, v3

    double-to-float v1, v1

    cmpg-float v2, v1, v14

    if-gez v2, :cond_f

    .line 98
    invoke-virtual {v0, v14}, Landroid/view/View;->setScaleX(F)V

    .line 99
    invoke-virtual {v0, v14}, Landroid/view/View;->setScaleY(F)V

    goto :goto_4

    :cond_f
    const/high16 v2, 0x40a00000    # 5.0f

    cmpl-float v3, v1, v2

    if-lez v3, :cond_10

    .line 100
    invoke-virtual {v0, v2}, Landroid/view/View;->setScaleX(F)V

    .line 101
    invoke-virtual {v0, v2}, Landroid/view/View;->setScaleY(F)V

    goto :goto_4

    .line 102
    :cond_10
    invoke-virtual {v0, v1}, Landroid/view/View;->setScaleX(F)V

    .line 103
    invoke-virtual {v0, v1}, Landroid/view/View;->setScaleY(F)V

    goto :goto_4

    :cond_11
    move v4, v8

    .line 104
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/view/RoomParticipantView;->isClickAction$atomicxcore_release()Z

    move-result v1

    if-eqz v1, :cond_12

    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/view/RoomParticipantView;->getClickListener$atomicxcore_release()Landroid/view/View$OnClickListener;

    move-result-object v1

    if-eqz v1, :cond_12

    .line 105
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/view/RoomParticipantView;->getClickListener$atomicxcore_release()Landroid/view/View$OnClickListener;

    move-result-object v1

    if-eqz v1, :cond_12

    invoke-interface {v1, v0}, Landroid/view/View$OnClickListener;->onClick(Landroid/view/View;)V

    :cond_12
    if-ne v2, v7, :cond_13

    .line 106
    invoke-virtual {v0, v4}, Lio/trtc/tuikit/atomicxcore/api/view/RoomParticipantView;->setPressedPoint1X$atomicxcore_release(F)V

    .line 107
    invoke-virtual {v0, v4}, Lio/trtc/tuikit/atomicxcore/api/view/RoomParticipantView;->setPressedPoint1Y$atomicxcore_release(F)V

    .line 108
    invoke-virtual {v0, v4}, Lio/trtc/tuikit/atomicxcore/api/view/RoomParticipantView;->setPressedPoint2X$atomicxcore_release(F)V

    .line 109
    invoke-virtual {v0, v4}, Lio/trtc/tuikit/atomicxcore/api/view/RoomParticipantView;->setPressedPoint2Y$atomicxcore_release(F)V

    .line 110
    :cond_13
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-eqz v0, :cond_15

    invoke-interface {v0, v5}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    goto :goto_4

    :cond_14
    if-ne v2, v6, :cond_15

    .line 111
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getX()F

    move-result v2

    invoke-virtual {v0, v2}, Lio/trtc/tuikit/atomicxcore/api/view/RoomParticipantView;->setTouchDownPointX$atomicxcore_release(F)V

    .line 112
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getY()F

    move-result v1

    invoke-virtual {v0, v1}, Lio/trtc/tuikit/atomicxcore/api/view/RoomParticipantView;->setTouchDownPointY$atomicxcore_release(F)V

    .line 113
    invoke-virtual {v0, v6}, Lio/trtc/tuikit/atomicxcore/api/view/RoomParticipantView;->setClickAction$atomicxcore_release(Z)V

    :cond_15
    :goto_4
    return v6
.end method

.method public static final b(Lio/trtc/tuikit/atomicxcore/api/view/RoomParticipantView;)V
    .locals 4

    .line 1
    .line 2
    const-string v0, "$this_initInternal"

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 9
    move-result v0

    .line 10
    .line 11
    const/high16 v1, 0x40000000    # 2.0f

    .line 12
    .line 13
    .line 14
    invoke-static {v0, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 15
    move-result v0

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 19
    move-result v2

    .line 20
    .line 21
    .line 22
    invoke-static {v2, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 23
    move-result v1

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0, v0, v1}, Landroid/view/View;->measure(II)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0}, Landroid/view/View;->getLeft()I

    .line 30
    move-result v0

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0}, Landroid/view/View;->getTop()I

    .line 34
    move-result v1

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0}, Landroid/view/View;->getRight()I

    .line 38
    move-result v2

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0}, Landroid/view/View;->getBottom()I

    .line 42
    move-result v3

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0, v0, v1, v2, v3}, Landroid/view/View;->layout(IIII)V

    .line 46
    return-void
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
.end method

.method public static final c(Lio/trtc/tuikit/atomicxcore/api/view/RoomParticipantView;)Z
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/view/RoomParticipantView;->getStreamType$atomicxcore_release()Lio/trtc/tuikit/atomicxcore/api/view/VideoStreamType;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/view/RoomParticipantView;->getParticipant$atomicxcore_release()Lio/trtc/tuikit/atomicxcore/api/room/RoomParticipant;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/view/RoomParticipantView;->isActive$atomicxcore_release()Z

    .line 16
    move-result p0

    .line 17
    .line 18
    if-eqz p0, :cond_0

    .line 19
    const/4 p0, 0x1

    .line 20
    return p0

    .line 21
    :cond_0
    const/4 p0, 0x0

    .line 22
    return p0
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
.end method

.method public static final d(Lio/trtc/tuikit/atomicxcore/api/view/RoomParticipantView;)V
    .locals 4

    .line 1
    .line 2
    const-string v0, "<this>"

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/view/RoomParticipantView;->getParticipant$atomicxcore_release()Lio/trtc/tuikit/atomicxcore/api/room/RoomParticipant;

    .line 9
    move-result-object v0

    .line 10
    const/4 v1, 0x0

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/room/RoomParticipant;->getUserID()Ljava/lang/String;

    .line 16
    move-result-object v0

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    move-object v0, v1

    .line 19
    .line 20
    :goto_0
    sget-object v2, Lio/trtc/tuikit/atomicxcore/api/login/LoginStore;->shared:Lio/trtc/tuikit/atomicxcore/api/login/LoginStore;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v2}, Lio/trtc/tuikit/atomicxcore/api/login/LoginStore;->getLoginState()Lio/trtc/tuikit/atomicxcore/api/login/LoginState;

    .line 24
    move-result-object v2

    .line 25
    .line 26
    .line 27
    invoke-virtual {v2}, Lio/trtc/tuikit/atomicxcore/api/login/LoginState;->getLoginUserInfo()Lkotlinx/coroutines/flow/w;

    .line 28
    move-result-object v2

    .line 29
    .line 30
    .line 31
    invoke-interface {v2}, Lkotlinx/coroutines/flow/w;->getValue()Ljava/lang/Object;

    .line 32
    move-result-object v2

    .line 33
    .line 34
    check-cast v2, Lio/trtc/tuikit/atomicxcore/api/login/UserProfile;

    .line 35
    .line 36
    if-eqz v2, :cond_1

    .line 37
    .line 38
    .line 39
    invoke-virtual {v2}, Lio/trtc/tuikit/atomicxcore/api/login/UserProfile;->getUserID()Ljava/lang/String;

    .line 40
    move-result-object v2

    .line 41
    goto :goto_1

    .line 42
    :cond_1
    move-object v2, v1

    .line 43
    .line 44
    :goto_1
    if-eqz v2, :cond_8

    .line 45
    .line 46
    .line 47
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 48
    move-result v3

    .line 49
    .line 50
    if-nez v3, :cond_2

    .line 51
    goto :goto_3

    .line 52
    .line 53
    :cond_2
    if-eqz v0, :cond_8

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 57
    move-result v3

    .line 58
    .line 59
    if-nez v3, :cond_3

    .line 60
    goto :goto_3

    .line 61
    .line 62
    .line 63
    :cond_3
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 64
    move-result v2

    .line 65
    .line 66
    if-eqz v2, :cond_4

    .line 67
    .line 68
    sget-object p0, Lio/trtc/tuikit/atomicxcore/impl/view/room/i;->f:Lkotlin/Lazy;

    .line 69
    .line 70
    .line 71
    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/view/room/d;->a()Lio/trtc/tuikit/atomicxcore/impl/view/room/i;

    .line 72
    move-result-object p0

    .line 73
    .line 74
    iget-object p0, p0, Lio/trtc/tuikit/atomicxcore/impl/view/room/i;->b:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;

    .line 75
    .line 76
    .line 77
    invoke-virtual {p0, v1}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;->setLocalVideoView(Lcom/tencent/cloud/tuikit/engine/common/TUIVideoView;)V

    .line 78
    return-void

    .line 79
    .line 80
    .line 81
    :cond_4
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/view/RoomParticipantView;->getStreamType$atomicxcore_release()Lio/trtc/tuikit/atomicxcore/api/view/VideoStreamType;

    .line 82
    move-result-object v1

    .line 83
    .line 84
    if-nez v1, :cond_5

    .line 85
    const/4 v1, -0x1

    .line 86
    goto :goto_2

    .line 87
    .line 88
    :cond_5
    sget-object v2, Lio/trtc/tuikit/atomicxcore/impl/view/room/a;->a:[I

    .line 89
    .line 90
    .line 91
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 92
    move-result v1

    .line 93
    .line 94
    aget v1, v2, v1

    .line 95
    :goto_2
    const/4 v2, 0x1

    .line 96
    .line 97
    if-eq v1, v2, :cond_7

    .line 98
    const/4 v3, 0x2

    .line 99
    .line 100
    if-eq v1, v3, :cond_6

    .line 101
    goto :goto_3

    .line 102
    .line 103
    :cond_6
    sget-object v1, Lio/trtc/tuikit/atomicxcore/impl/view/room/i;->f:Lkotlin/Lazy;

    .line 104
    .line 105
    .line 106
    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/view/room/d;->a()Lio/trtc/tuikit/atomicxcore/impl/view/room/i;

    .line 107
    move-result-object v1

    .line 108
    .line 109
    .line 110
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/view/RoomParticipantView;->getVideoView$atomicxcore_release()Lcom/tencent/cloud/tuikit/engine/common/TUIVideoView;

    .line 111
    move-result-object p0

    .line 112
    .line 113
    .line 114
    invoke-virtual {v1, v0, p0, v2}, Lio/trtc/tuikit/atomicxcore/impl/view/room/i;->b(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/common/TUIVideoView;Z)V

    .line 115
    return-void

    .line 116
    .line 117
    :cond_7
    sget-object v1, Lio/trtc/tuikit/atomicxcore/impl/view/room/i;->f:Lkotlin/Lazy;

    .line 118
    .line 119
    .line 120
    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/view/room/d;->a()Lio/trtc/tuikit/atomicxcore/impl/view/room/i;

    .line 121
    move-result-object v1

    .line 122
    .line 123
    .line 124
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/view/RoomParticipantView;->getVideoView$atomicxcore_release()Lcom/tencent/cloud/tuikit/engine/common/TUIVideoView;

    .line 125
    move-result-object p0

    .line 126
    .line 127
    .line 128
    invoke-virtual {v1, v0, p0, v2}, Lio/trtc/tuikit/atomicxcore/impl/view/room/i;->a(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/common/TUIVideoView;Z)V

    .line 129
    :cond_8
    :goto_3
    return-void
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
.end method
