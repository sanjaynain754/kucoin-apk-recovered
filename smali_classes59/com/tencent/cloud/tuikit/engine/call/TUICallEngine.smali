.class public abstract Lcom/tencent/cloud/tuikit/engine/call/TUICallEngine;
.super Ljava/lang/Object;
.source "TUICallEngine.java"


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

.method public static createInstance(Landroid/content/Context;)Lcom/tencent/cloud/tuikit/engine/call/TUICallEngine;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/tencent/cloud/tuikit/engine/impl/call/TUICallEngineImpl;->createInstance(Landroid/content/Context;)Lcom/tencent/cloud/tuikit/engine/impl/call/TUICallEngineImpl;

    .line 4
    move-result-object p0

    .line 5
    return-object p0
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
.end method

.method public static destroyInstance()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/tencent/cloud/tuikit/engine/impl/call/TUICallEngineImpl;->destroySharedInstance()V

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


# virtual methods
.method public abstract accept(Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Callback;)V
.end method

.method public abstract addObserver(Lcom/tencent/cloud/tuikit/engine/call/TUICallObserver;)V
.end method

.method public abstract call(Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$RoomId;Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$MediaType;Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$CallParams;Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Callback;)V
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end method

.method public abstract call(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$MediaType;Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$CallParams;Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Callback;)V
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end method

.method public abstract callExperimentalAPI(Ljava/lang/String;)V
.end method

.method public abstract calls(Ljava/util/List;Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$MediaType;Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$CallParams;Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Callback;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$MediaType;",
            "Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$CallParams;",
            "Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Callback;",
            ")V"
        }
    .end annotation
.end method

.method public abstract closeCamera()V
.end method

.method public abstract closeMicrophone()V
.end method

.method public abstract deleteRecordCalls(Ljava/util/List;Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$ValueCallback;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$ValueCallback;",
            ")V"
        }
    .end annotation
.end method

.method public abstract enableMultiDeviceAbility(ZLcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Callback;)V
.end method

.method public abstract getTRTCCloudInstance()Lcom/tencent/trtc/TRTCCloud;
.end method

.method public abstract groupCall(Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$RoomId;Ljava/lang/String;Ljava/util/List;Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$MediaType;Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$CallParams;Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Callback;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$RoomId;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$MediaType;",
            "Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$CallParams;",
            "Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Callback;",
            ")V"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end method

.method public abstract groupCall(Ljava/lang/String;Ljava/util/List;Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$MediaType;Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$CallParams;Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Callback;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$MediaType;",
            "Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$CallParams;",
            "Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Callback;",
            ")V"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end method

.method public abstract hangup(Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Callback;)V
.end method

.method public abstract ignore(Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Callback;)V
.end method

.method public abstract init(ILjava/lang/String;Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Callback;)V
.end method

.method public abstract inviteUser(Ljava/util/List;Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$CallParams;Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$ValueCallback;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$CallParams;",
            "Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$ValueCallback<",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;)V"
        }
    .end annotation
.end method

.method public abstract join(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Callback;)V
.end method

.method public abstract joinInGroupCall(Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$RoomId;Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$MediaType;Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Callback;)V
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end method

.method public abstract openCamera(Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Camera;Lcom/tencent/cloud/tuikit/engine/common/TUIVideoView;Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Callback;)V
.end method

.method public abstract openMicrophone(Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Callback;)V
.end method

.method public abstract queryOfflineCall()V
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end method

.method public abstract queryRecentCalls(Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$RecentCallsFilter;Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$ValueCallback;)V
.end method

.method public abstract reject(Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Callback;)V
.end method

.method public abstract removeObserver(Lcom/tencent/cloud/tuikit/engine/call/TUICallObserver;)V
.end method

.method public abstract selectAudioPlaybackDevice(Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$AudioPlaybackDevice;)V
.end method

.method public abstract setBeautyLevel(FLcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Callback;)V
.end method

.method public abstract setBlurBackground(ILcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Callback;)V
.end method

.method public abstract setSelfInfo(Ljava/lang/String;Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Callback;)V
.end method

.method public abstract setVideoEncoderParams(Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$VideoEncoderParams;Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Callback;)V
.end method

.method public abstract setVideoRenderParams(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$VideoRenderParams;Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Callback;)V
.end method

.method public abstract setVirtualBackground(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Callback;)V
.end method

.method public abstract startRemoteView(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/common/TUIVideoView;Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$PlayCallback;)V
.end method

.method public abstract stopRemoteView(Ljava/lang/String;)V
.end method

.method public abstract switchCallMediaType(Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$MediaType;)V
.end method

.method public abstract switchCamera(Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Camera;)V
.end method
