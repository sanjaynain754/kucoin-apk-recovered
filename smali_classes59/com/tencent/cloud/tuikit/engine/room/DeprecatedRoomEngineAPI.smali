.class public abstract Lcom/tencent/cloud/tuikit/engine/room/DeprecatedRoomEngineAPI;
.super Ljava/lang/Object;
.source "DeprecatedRoomEngineAPI.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    return-void
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
.end method

.method public static callExperimentalAPI(Ljava/lang/String;)Ljava/lang/Object;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    .line 2
    const-string v0, ""

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->callExperimentalAPI(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    move-result-object p0

    .line 7
    return-object p0
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
.method public abstract getAudioEffectManager()Lcom/tencent/liteav/audio/TXAudioEffectManager;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end method

.method public abstract getBeautyManager()Lcom/tencent/liteav/beauty/TXBeautyManager;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end method

.method public abstract getDeviceManager()Lcom/tencent/liteav/device/TXDeviceManager;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end method

.method public abstract kickUserOffSeatByAdmin(ILjava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end method

.method public abstract responseRemoteRequest(Ljava/lang/String;ZLcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end method

.method public abstract setLocalVideoView(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$VideoStreamType;Lcom/tencent/cloud/tuikit/engine/common/TUIVideoView;)V
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end method

.method public abstract switchCamera(Z)I
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end method

.method public abstract takeSeat(IILcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RequestCallback;)Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$Request;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end method

.method public abstract takeUserOnSeatByAdmin(ILjava/lang/String;ILcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RequestCallback;)Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$Request;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end method
