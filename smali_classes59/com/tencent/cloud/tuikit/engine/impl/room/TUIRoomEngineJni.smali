.class public Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;
.super Ljava/lang/Object;
.source "TUIRoomEngineJni.java"


# annotations
.annotation runtime Lcom/tencent/liteav/base/annotations/JNINamespace;
    value = "tuikit::engine"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$PlayCallback;,
        Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$RequestCallback;,
        Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$RequestListCallback;,
        Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$GetSeatListJniCallback;,
        Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$GetUserListJniCallback;,
        Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$GetUserInfoCallback;,
        Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$GetRoomMetadataCallback;,
        Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$GetRoomInfoCallback;,
        Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$ActionCallback;,
        Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$LoginUserInfo;,
        Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$Request;,
        Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$UserListResult;,
        Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$EnterRoomOptions;,
        Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$UserInfo;,
        Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$RoomInfo;,
        Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$VideoEncoderParams;,
        Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$SeatLockParams;
    }
.end annotation


# static fields
.field private static final TAG:Ljava/lang/String; = "TUIRoomEngineJni"


# instance fields
.field private mConferenceInvitationManager:Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceInvitationManager;

.field private mConferenceListManager:Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager;

.field private mDeviceManager:Lcom/tencent/cloud/tuikit/engine/extension/TUIRoomDeviceManager;

.field private mLiveBattleManager:Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager;

.field private mLiveConnectionManager:Lcom/tencent/cloud/tuikit/engine/extension/TUILiveConnectionManager;

.field private mLiveGiftManager:Lcom/tencent/cloud/tuikit/engine/extension/TUILiveGiftManager;

.field private mLiveLayoutManager:Lcom/tencent/cloud/tuikit/engine/extension/TUILiveLayoutManager;

.field private mLiveListManager:Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveListManagerImpl;

.field private mNativeTUIRoomEngineJni:J

.field private mObserverList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/tencent/cloud/tuikit/engine/room/TUIRoomObserver;",
            ">;"
        }
    .end annotation
.end field

.field private mPipelineBridge:Lcom/tencent/cloud/tuikit/engine/impl/pipelinebridge/TUIPipelineBridge;

.field private mSongListManager:Lcom/tencent/cloud/tuikit/engine/extension/internal/TUISongListManagerImpl;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/tencent/cloud/tuikit/engine/impl/utils/SoLoader;->loadAllLibraries()Z

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

.method public constructor <init>(Z)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 9
    .line 10
    iput-object v0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->mObserverList:Ljava/util/List;

    .line 11
    .line 12
    new-instance v0, Lcom/tencent/cloud/tuikit/engine/impl/pipelinebridge/TUIPipelineBridge;

    .line 13
    .line 14
    sget-object v1, Lcom/tencent/cloud/tuikit/engine/impl/pipelinebridge/TUIPipelineBridgeDefine$PipelineType;->Room:Lcom/tencent/cloud/tuikit/engine/impl/pipelinebridge/TUIPipelineBridgeDefine$PipelineType;

    .line 15
    .line 16
    .line 17
    invoke-direct {v0, v1, p1}, Lcom/tencent/cloud/tuikit/engine/impl/pipelinebridge/TUIPipelineBridge;-><init>(Lcom/tencent/cloud/tuikit/engine/impl/pipelinebridge/TUIPipelineBridgeDefine$PipelineType;Z)V

    .line 18
    .line 19
    iput-object v0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->mPipelineBridge:Lcom/tencent/cloud/tuikit/engine/impl/pipelinebridge/TUIPipelineBridge;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Lcom/tencent/cloud/tuikit/engine/impl/pipelinebridge/TUIPipelineBridge;->getNativePipelineBridge()J

    .line 23
    move-result-wide v0

    .line 24
    .line 25
    .line 26
    invoke-static {p0, p1, v0, v1}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->nativeCreatePipeline(Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;ZJ)J

    .line 27
    move-result-wide v0

    .line 28
    .line 29
    iput-wide v0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->mNativeTUIRoomEngineJni:J

    .line 30
    return-void
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
.end method

.method public static synthetic access$000(Ljava/lang/String;)Ljava/util/HashMap;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->jsonStringToMap(Ljava/lang/String;)Ljava/util/HashMap;

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

.method public static callExperimentalAPI(Ljava/lang/String;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->nativeCallExperimentalAPI(Ljava/lang/String;)V

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
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method

.method private checkPipeline()Z
    .locals 4

    .line 1
    iget-wide v0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->mNativeTUIRoomEngineJni:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    const/4 v0, 0x1

    return v0
.end method

.method private checkPipeline(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)Z
    .locals 4

    .line 2
    iget-wide v0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->mNativeTUIRoomEngineJni:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_1

    if-eqz p1, :cond_0

    .line 3
    sget-object v0, Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;->FAILED:Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;

    const-string/jumbo v1, "roomEngine is destroyed"

    invoke-interface {p1, v0, v1}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;->onError(Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;Ljava/lang/String;)V

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    const/4 p1, 0x1

    return p1
.end method

.method private checkPipeline(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$GetRoomInfoCallback;)Z
    .locals 4

    .line 4
    iget-wide v0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->mNativeTUIRoomEngineJni:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_1

    if-eqz p1, :cond_0

    .line 5
    sget-object v0, Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;->FAILED:Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;

    const-string/jumbo v1, "roomEngine is destroyed"

    invoke-interface {p1, v0, v1}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$GetRoomInfoCallback;->onError(Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;Ljava/lang/String;)V

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    const/4 p1, 0x1

    return p1
.end method

.method private checkPipeline(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$GetRoomMetadataCallback;)Z
    .locals 4

    .line 6
    iget-wide v0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->mNativeTUIRoomEngineJni:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_1

    if-eqz p1, :cond_0

    .line 7
    sget-object v0, Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;->FAILED:Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;

    const-string/jumbo v1, "roomEngine is destroyed"

    invoke-interface {p1, v0, v1}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$GetRoomMetadataCallback;->onError(Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;Ljava/lang/String;)V

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    const/4 p1, 0x1

    return p1
.end method

.method private checkPipeline(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$GetSeatListCallback;)Z
    .locals 4

    .line 14
    iget-wide v0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->mNativeTUIRoomEngineJni:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_1

    if-eqz p1, :cond_0

    .line 15
    sget-object v0, Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;->FAILED:Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;

    const-string/jumbo v1, "roomEngine is destroyed"

    invoke-interface {p1, v0, v1}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$GetSeatListCallback;->onError(Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;Ljava/lang/String;)V

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    const/4 p1, 0x1

    return p1
.end method

.method private checkPipeline(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$GetUserInfoCallback;)Z
    .locals 4

    .line 10
    iget-wide v0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->mNativeTUIRoomEngineJni:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_1

    if-eqz p1, :cond_0

    .line 11
    sget-object v0, Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;->FAILED:Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;

    const-string/jumbo v1, "roomEngine is destroyed"

    invoke-interface {p1, v0, v1}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$GetUserInfoCallback;->onError(Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;Ljava/lang/String;)V

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    const/4 p1, 0x1

    return p1
.end method

.method private checkPipeline(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$GetUserListCallback;)Z
    .locals 4

    .line 12
    iget-wide v0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->mNativeTUIRoomEngineJni:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_1

    if-eqz p1, :cond_0

    .line 13
    sget-object v0, Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;->FAILED:Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;

    const-string/jumbo v1, "roomEngine is destroyed"

    invoke-interface {p1, v0, v1}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$GetUserListCallback;->onError(Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;Ljava/lang/String;)V

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    const/4 p1, 0x1

    return p1
.end method

.method private checkPipeline(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RequestCallback;)Z
    .locals 4

    .line 16
    iget-wide v0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->mNativeTUIRoomEngineJni:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_1

    if-eqz p1, :cond_0

    .line 17
    sget-object v0, Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;->FAILED:Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;

    const-string/jumbo v1, "roomEngine is destroyed"

    const-string v2, ""

    invoke-interface {p1, v2, v2, v0, v1}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RequestCallback;->onError(Ljava/lang/String;Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;Ljava/lang/String;)V

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    const/4 p1, 0x1

    return p1
.end method

.method private checkPipeline(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RequestCompletion;)Z
    .locals 4

    .line 18
    iget-wide v0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->mNativeTUIRoomEngineJni:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_1

    if-eqz p1, :cond_0

    .line 19
    new-instance v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;

    invoke-direct {v0}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;-><init>()V

    sget-object v1, Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;->FAILED:Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;

    const-string/jumbo v2, "roomEngine is destroyed"

    const-string v3, ""

    invoke-interface {p1, v3, v0, v1, v2}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RequestCompletion;->onError(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;Ljava/lang/String;)V

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    const/4 p1, 0x1

    return p1
.end method

.method private checkPipeline(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RequestListCallback;)Z
    .locals 4

    .line 8
    iget-wide v0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->mNativeTUIRoomEngineJni:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_1

    if-eqz p1, :cond_0

    .line 9
    sget-object v0, Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;->FAILED:Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;

    const-string/jumbo v1, "roomEngine is destroyed"

    invoke-interface {p1, v0, v1}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RequestListCallback;->onError(Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;Ljava/lang/String;)V

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    const/4 p1, 0x1

    return p1
.end method

.method private checkPipeline(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$PlayCallback;)Z
    .locals 4

    .line 20
    iget-wide v0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->mNativeTUIRoomEngineJni:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_1

    if-eqz p2, :cond_0

    .line 21
    sget-object v0, Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;->FAILED:Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;

    const-string/jumbo v1, "roomEngine is destroyed"

    invoke-interface {p2, p1, v0, v1}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$PlayCallback;->onPlayError(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;Ljava/lang/String;)V

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    const/4 p1, 0x1

    return p1
.end method

.method private copyOnReadListeners()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/tencent/cloud/tuikit/engine/room/TUIRoomObserver;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->mObserverList:Ljava/util/List;

    .line 5
    .line 6
    .line 7
    invoke-direct {v0, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>(Ljava/util/Collection;)V

    .line 8
    return-object v0
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

.method public static createCustomInfo()Ljava/util/HashMap;
    .locals 1
    .annotation build Lcom/tencent/liteav/base/annotations/CalledByNative;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Ljava/util/HashMap;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 6
    return-object v0
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

.method public static createNetWorkMap([Ljava/lang/String;[Ljava/lang/String;[I[I[I[I)Ljava/util/HashMap;
    .locals 4
    .annotation build Lcom/tencent/liteav/base/annotations/CalledByNative;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Ljava/util/HashMap;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 6
    const/4 v1, 0x0

    .line 7
    :goto_0
    array-length v2, p0

    .line 8
    .line 9
    if-ge v1, v2, :cond_0

    .line 10
    .line 11
    new-instance v2, Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$NetworkInfo;

    .line 12
    .line 13
    .line 14
    invoke-direct {v2}, Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$NetworkInfo;-><init>()V

    .line 15
    .line 16
    aget-object v3, p1, v1

    .line 17
    .line 18
    iput-object v3, v2, Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$NetworkInfo;->userId:Ljava/lang/String;

    .line 19
    .line 20
    aget v3, p2, v1

    .line 21
    .line 22
    .line 23
    invoke-static {v3}, Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$NetworkQuality;->fromInt(I)Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$NetworkQuality;

    .line 24
    move-result-object v3

    .line 25
    .line 26
    iput-object v3, v2, Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$NetworkInfo;->quality:Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$NetworkQuality;

    .line 27
    .line 28
    aget v3, p3, v1

    .line 29
    .line 30
    iput v3, v2, Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$NetworkInfo;->upLoss:I

    .line 31
    .line 32
    aget v3, p4, v1

    .line 33
    .line 34
    iput v3, v2, Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$NetworkInfo;->downLoss:I

    .line 35
    .line 36
    aget v3, p5, v1

    .line 37
    .line 38
    iput v3, v2, Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$NetworkInfo;->delay:I

    .line 39
    .line 40
    aget-object v3, p0, v1

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    add-int/lit8 v1, v1, 0x1

    .line 46
    goto :goto_0

    .line 47
    :cond_0
    return-object v0
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
.end method

.method public static createRequestList([I[I[Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;[Ljava/lang/String;[Ljava/lang/String;)Ljava/util/ArrayList;
    .locals 5
    .annotation build Lcom/tencent/liteav/base/annotations/CalledByNative;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([I[I[",
            "Ljava/lang/String;",
            "Ljava/util/ArrayList<",
            "Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;",
            ">;",
            "Ljava/util/ArrayList<",
            "Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;",
            ">;",
            "Ljava/util/ArrayList<",
            "Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;",
            ">;[",
            "Ljava/lang/String;",
            "[",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/ArrayList;"
        }
    .end annotation

    .line 1
    .line 2
    new-instance v0, Ljava/util/ArrayList;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 6
    const/4 v1, 0x0

    .line 7
    :goto_0
    array-length v2, p0

    .line 8
    .line 9
    if-ge v1, v2, :cond_0

    .line 10
    .line 11
    new-instance v2, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$Request;

    .line 12
    .line 13
    .line 14
    invoke-direct {v2}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$Request;-><init>()V

    .line 15
    .line 16
    aget v3, p0, v1

    .line 17
    .line 18
    .line 19
    invoke-static {v3}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RequestAction;->fromInt(I)Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RequestAction;

    .line 20
    move-result-object v3

    .line 21
    .line 22
    iput-object v3, v2, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$Request;->requestAction:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RequestAction;

    .line 23
    .line 24
    aget v3, p1, v1

    .line 25
    int-to-long v3, v3

    .line 26
    .line 27
    iput-wide v3, v2, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$Request;->timestamp:J

    .line 28
    .line 29
    aget-object v3, p2, v1

    .line 30
    .line 31
    iput-object v3, v2, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$Request;->requestId:Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    invoke-virtual {p3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 35
    move-result-object v3

    .line 36
    .line 37
    check-cast v3, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;

    .line 38
    .line 39
    iget-object v3, v3, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;->userId:Ljava/lang/String;

    .line 40
    .line 41
    iput-object v3, v2, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$Request;->userId:Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    invoke-virtual {p3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 45
    move-result-object v3

    .line 46
    .line 47
    check-cast v3, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;

    .line 48
    .line 49
    iget-object v3, v3, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;->userName:Ljava/lang/String;

    .line 50
    .line 51
    iput-object v3, v2, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$Request;->userName:Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    invoke-virtual {p3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 55
    move-result-object v3

    .line 56
    .line 57
    check-cast v3, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;

    .line 58
    .line 59
    iget-object v3, v3, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;->nameCard:Ljava/lang/String;

    .line 60
    .line 61
    iput-object v3, v2, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$Request;->nameCard:Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    invoke-virtual {p3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 65
    move-result-object v3

    .line 66
    .line 67
    check-cast v3, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;

    .line 68
    .line 69
    iget-object v3, v3, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;->avatarUrl:Ljava/lang/String;

    .line 70
    .line 71
    iput-object v3, v2, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$Request;->avatarUrl:Ljava/lang/String;

    .line 72
    .line 73
    aget-object v3, p6, v1

    .line 74
    .line 75
    iput-object v3, v2, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$Request;->content:Ljava/lang/String;

    .line 76
    .line 77
    aget-object v3, p7, v1

    .line 78
    .line 79
    iput-object v3, v2, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$Request;->extensionInfo:Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    invoke-virtual {p4, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 83
    move-result-object v3

    .line 84
    .line 85
    check-cast v3, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;

    .line 86
    .line 87
    iput-object v3, v2, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$Request;->fromUser:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;

    .line 88
    .line 89
    .line 90
    invoke-virtual {p5, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 91
    move-result-object v3

    .line 92
    .line 93
    check-cast v3, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;

    .line 94
    .line 95
    iput-object v3, v2, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$Request;->toUser:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;

    .line 96
    .line 97
    .line 98
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 99
    .line 100
    add-int/lit8 v1, v1, 0x1

    .line 101
    goto :goto_0

    .line 102
    :cond_0
    return-object v0
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
.end method

.method public static createRoomInfo(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JILjava/lang/String;ILjava/lang/String;ZZZZZIIZLjava/lang/String;)Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;
    .locals 1
    .annotation build Lcom/tencent/liteav/base/annotations/CalledByNative;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;-><init>()V

    .line 6
    .line 7
    iput-object p6, v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;->roomId:Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    invoke-static {p7}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomType;->fromInt(I)Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomType;

    .line 11
    move-result-object p6

    .line 12
    .line 13
    iput-object p6, v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;->roomType:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomType;

    .line 14
    .line 15
    iput-object p8, v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;->name:Ljava/lang/String;

    .line 16
    .line 17
    iput-boolean p9, v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;->isCameraDisableForAllUser:Z

    .line 18
    .line 19
    iput-boolean p10, v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;->isMicrophoneDisableForAllUser:Z

    .line 20
    .line 21
    iput-boolean p11, v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;->isScreenShareDisableForAllUser:Z

    .line 22
    .line 23
    iput-boolean p12, v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;->isMessageDisableForAllUser:Z

    .line 24
    .line 25
    iput-boolean p13, v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;->isSeatEnabled:Z

    .line 26
    .line 27
    .line 28
    invoke-static {p14}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatMode;->fromInt(I)Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatMode;

    .line 29
    move-result-object p6

    .line 30
    .line 31
    iput-object p6, v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;->seatMode:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatMode;

    .line 32
    .line 33
    move/from16 p6, p15

    .line 34
    .line 35
    iput p6, v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;->maxSeatCount:I

    .line 36
    .line 37
    iput-object p0, v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;->ownerId:Ljava/lang/String;

    .line 38
    .line 39
    iput-object p1, v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;->ownerName:Ljava/lang/String;

    .line 40
    .line 41
    iput-object p2, v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;->ownerAvatarUrl:Ljava/lang/String;

    .line 42
    .line 43
    iput p5, v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;->memberCount:I

    .line 44
    .line 45
    move/from16 p0, p16

    .line 46
    .line 47
    iput-boolean p0, v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;->keepOwnerOnSeat:Z

    .line 48
    .line 49
    iput-wide p3, v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;->createTime:J

    .line 50
    .line 51
    move-object/from16 p0, p17

    .line 52
    .line 53
    iput-object p0, v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;->password:Ljava/lang/String;

    .line 54
    return-object v0
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
.end method

.method public static createSeatInfoList([I[Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;[Z[Z[Z)Ljava/util/ArrayList;
    .locals 4
    .annotation build Lcom/tencent/liteav/base/annotations/CalledByNative;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Ljava/util/ArrayList;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 6
    const/4 v1, 0x0

    .line 7
    :goto_0
    array-length v2, p0

    .line 8
    .line 9
    if-ge v1, v2, :cond_0

    .line 10
    .line 11
    new-instance v2, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatInfo;

    .line 12
    .line 13
    .line 14
    invoke-direct {v2}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatInfo;-><init>()V

    .line 15
    .line 16
    aget-object v3, p1, v1

    .line 17
    .line 18
    iput-object v3, v2, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatInfo;->roomId:Ljava/lang/String;

    .line 19
    .line 20
    aget v3, p0, v1

    .line 21
    .line 22
    iput v3, v2, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatInfo;->index:I

    .line 23
    .line 24
    aget-object v3, p2, v1

    .line 25
    .line 26
    iput-object v3, v2, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatInfo;->userId:Ljava/lang/String;

    .line 27
    .line 28
    aget-object v3, p3, v1

    .line 29
    .line 30
    iput-object v3, v2, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatInfo;->userName:Ljava/lang/String;

    .line 31
    .line 32
    aget-object v3, p4, v1

    .line 33
    .line 34
    iput-object v3, v2, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatInfo;->nameCard:Ljava/lang/String;

    .line 35
    .line 36
    aget-object v3, p5, v1

    .line 37
    .line 38
    iput-object v3, v2, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatInfo;->avatarUrl:Ljava/lang/String;

    .line 39
    .line 40
    aget-boolean v3, p6, v1

    .line 41
    .line 42
    iput-boolean v3, v2, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatInfo;->isLocked:Z

    .line 43
    .line 44
    aget-boolean v3, p7, v1

    .line 45
    .line 46
    iput-boolean v3, v2, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatInfo;->isVideoLocked:Z

    .line 47
    .line 48
    aget-boolean v3, p8, v1

    .line 49
    .line 50
    iput-boolean v3, v2, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatInfo;->isAudioLocked:Z

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 54
    .line 55
    add-int/lit8 v1, v1, 0x1

    .line 56
    goto :goto_0

    .line 57
    :cond_0
    return-object v0
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
.end method

.method public static createUserInfoList()Ljava/util/ArrayList;
    .locals 1
    .annotation build Lcom/tencent/liteav/base/annotations/CalledByNative;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    new-instance v0, Ljava/util/ArrayList;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 6
    return-object v0
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

.method public static createVolumeMap([Ljava/lang/String;[I)Ljava/util/HashMap;
    .locals 4
    .annotation build Lcom/tencent/liteav/base/annotations/CalledByNative;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Ljava/util/HashMap;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 6
    const/4 v1, 0x0

    .line 7
    :goto_0
    array-length v2, p0

    .line 8
    .line 9
    if-ge v1, v2, :cond_0

    .line 10
    .line 11
    aget-object v2, p0, v1

    .line 12
    .line 13
    aget v3, p1, v1

    .line 14
    .line 15
    .line 16
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 17
    move-result-object v3

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    add-int/lit8 v1, v1, 0x1

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    return-object v0
    .line 25
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
.end method

.method public static freeJObjectByAddress(J)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->nativeFreeJObjectByAddress(J)V

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
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method

.method public static getJObjectAddress(Ljava/lang/Object;)J
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->nativeGetJObjectAddress(Ljava/lang/Object;)J

    .line 4
    move-result-wide v0

    .line 5
    return-wide v0
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

.method public static getMapKeys(Ljava/util/Map;)[Ljava/lang/String;
    .locals 4
    .annotation build Lcom/tencent/liteav/base/annotations/CalledByNative;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "[B>;)[",
            "Ljava/lang/String;"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-interface {p0}, Ljava/util/Map;->size()I

    .line 4
    move-result v0

    .line 5
    .line 6
    new-array v0, v0, [Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    invoke-interface {p0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 10
    move-result-object p0

    .line 11
    .line 12
    .line 13
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 14
    move-result-object p0

    .line 15
    const/4 v1, 0x0

    .line 16
    .line 17
    .line 18
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    move-result v2

    .line 20
    .line 21
    if-eqz v2, :cond_0

    .line 22
    .line 23
    .line 24
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    move-result-object v2

    .line 26
    .line 27
    check-cast v2, Ljava/lang/String;

    .line 28
    .line 29
    add-int/lit8 v3, v1, 0x1

    .line 30
    .line 31
    aput-object v2, v0, v1

    .line 32
    move v1, v3

    .line 33
    goto :goto_0

    .line 34
    :cond_0
    return-object v0
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
.end method

.method public static getMapValue(Ljava/util/HashMap;Ljava/lang/String;)[B
    .locals 0
    .annotation build Lcom/tencent/liteav/base/annotations/CalledByNative;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "[B>;",
            "Ljava/lang/String;",
            ")[B"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    move-result-object p0

    .line 5
    .line 6
    check-cast p0, [B

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
.end method

.method public static getSelfInfo()Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$LoginUserInfo;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->nativeGetSelfInfo()Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$LoginUserInfo;

    .line 4
    move-result-object v0

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

.method public static insertCustomInfo(Ljava/util/HashMap;Ljava/lang/String;[B)V
    .locals 0
    .annotation build Lcom/tencent/liteav/base/annotations/CalledByNative;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "[B>;",
            "Ljava/lang/String;",
            "[B)V"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

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
.end method

.method public static insertUserInfo(Ljava/util/ArrayList;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;)V
    .locals 0
    .annotation build Lcom/tencent/liteav/base/annotations/CalledByNative;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;",
            ">;",
            "Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;",
            ")V"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

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
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method private static jsonStringToMap(Ljava/lang/String;)Ljava/util/HashMap;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    new-instance v0, Ljava/util/HashMap;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 9
    move-result v1

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    goto :goto_1

    .line 13
    .line 14
    :cond_0
    :try_start_0
    new-instance v1, Lorg/json/JSONObject;

    .line 15
    .line 16
    .line 17
    invoke-direct {v1, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    .line 21
    move-result-object p0

    .line 22
    .line 23
    .line 24
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 25
    move-result v2

    .line 26
    .line 27
    if-eqz v2, :cond_1

    .line 28
    .line 29
    .line 30
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 31
    move-result-object v2

    .line 32
    .line 33
    check-cast v2, Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 37
    move-result-object v3

    .line 38
    .line 39
    check-cast v3, Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 43
    goto :goto_0

    .line 44
    :catch_0
    move-exception p0

    .line 45
    .line 46
    new-instance v1, Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 50
    .line 51
    const-string v2, "jsonStringToMap error:"

    .line 52
    .line 53
    .line 54
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 58
    move-result-object p0

    .line 59
    .line 60
    .line 61
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 65
    move-result-object p0

    .line 66
    .line 67
    const-string v1, "TUIRoomEngineJni"

    .line 68
    .line 69
    .line 70
    invoke-static {v1, p0}, Lcom/tencent/liteav/base/util/LiteavLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 71
    :cond_1
    :goto_1
    return-object v0
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
.end method

.method public static login(Landroid/content/Context;ILjava/lang/String;Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V
    .locals 6

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/tencent/cloud/tuikit/engine/impl/utils/PathUtils;->getSDKInitPath(Landroid/content/Context;)Ljava/lang/String;

    .line 4
    move-result-object v3

    .line 5
    .line 6
    .line 7
    invoke-static {p0}, Lcom/tencent/cloud/tuikit/engine/impl/utils/PathUtils;->getSDKLogPath(Landroid/content/Context;)Ljava/lang/String;

    .line 8
    move-result-object v4

    .line 9
    .line 10
    new-instance v5, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$ActionCallback;

    .line 11
    .line 12
    .line 13
    invoke-direct {v5, p4}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$ActionCallback;-><init>(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

    .line 14
    move v0, p1

    .line 15
    move-object v1, p2

    .line 16
    move-object v2, p3

    .line 17
    .line 18
    .line 19
    invoke-static/range {v0 .. v5}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->nativeLogin(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$ActionCallback;)V

    .line 20
    return-void
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
.end method

.method public static logout(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$ActionCallback;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p0}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$ActionCallback;-><init>(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

    .line 6
    .line 7
    .line 8
    invoke-static {v0}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->nativeLogout(Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$ActionCallback;)V

    .line 9
    return-void
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

.method private static native nativeAddCategoryTagForUsers(JI[Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$ActionCallback;)V
.end method

.method private static native nativeApplyToAdminToOpenLocalDevice(JIILcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$RequestCallback;)Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$Request;
.end method

.method private static native nativeCallExperimentalAPI(Ljava/lang/String;)V
.end method

.method private static native nativeCancelRequest(JLjava/lang/String;Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$ActionCallback;)V
.end method

.method private static native nativeChangeUserNameCard(JLjava/lang/String;Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$ActionCallback;)V
.end method

.method private static native nativeChangeUserRole(JLjava/lang/String;ILcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$ActionCallback;)V
.end method

.method private static native nativeCloseLocalCamera(J)V
.end method

.method private static native nativeCloseLocalMicrophone(J)V
.end method

.method private static native nativeCloseRemoteDeviceByAdmin(JLjava/lang/String;ILcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$ActionCallback;)V
.end method

.method private static native nativeCreatePipeline(Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;ZJ)J
.end method

.method private static native nativeCreateRoom(JLcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$RoomInfo;Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$ActionCallback;)V
.end method

.method private static native nativeDestroyPipeline(J)V
.end method

.method private static native nativeDestroyRoom(JLcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$ActionCallback;)V
.end method

.method private static native nativeDisableDeviceForAllUserByAdmin(JZILcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$ActionCallback;)V
.end method

.method private static native nativeDisableSendingMessageByAdmin(JZLjava/lang/String;Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$ActionCallback;)V
.end method

.method private static native nativeDisableSendingMessageForAllUser(JZLcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$ActionCallback;)V
.end method

.method private static native nativeEnableGravitySensor(JZ)V
.end method

.method private static native nativeEnableSystemAudioSharing(JZ)V
.end method

.method private static native nativeEnterRoom(JLjava/lang/String;ILcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$EnterRoomOptions;Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$GetRoomInfoCallback;)V
.end method

.method private static native nativeExitRoom(JZLcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$ActionCallback;)V
.end method

.method private static native nativeFetchRoomInfo(JLcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$GetRoomInfoCallback;)V
.end method

.method private static native nativeFetchRoomInfoById(JLjava/lang/String;ILcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$GetRoomInfoCallback;)V
.end method

.method private static native nativeFreeJObjectByAddress(J)V
.end method

.method private static native nativeGetConferenceInvitationManager(J)J
.end method

.method private static native nativeGetConferenceListManager(J)J
.end method

.method private static native nativeGetExtension(JI)J
.end method

.method private static native nativeGetJObjectAddress(Ljava/lang/Object;)J
.end method

.method private static native nativeGetLiveBattleManager(J)J
.end method

.method private static native nativeGetLiveConnectionManager(J)J
.end method

.method private static native nativeGetLiveGiftManager(J)J
.end method

.method private static native nativeGetLiveLayoutManager(J)J
.end method

.method private static native nativeGetLiveListManager(J)J
.end method

.method private static native nativeGetMediaDeviceManager(J)J
.end method

.method private static native nativeGetRoomMetadata(J[Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$GetRoomMetadataCallback;)V
.end method

.method private static native nativeGetSeatApplicationList(JLcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$RequestListCallback;)V
.end method

.method private static native nativeGetSeatList(JLcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$GetSeatListJniCallback;)V
.end method

.method private static native nativeGetSelfInfo()Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$LoginUserInfo;
.end method

.method private static native nativeGetSongListManager(J)J
.end method

.method private static native nativeGetTRTCCloud(J)Lcom/tencent/trtc/TRTCCloud;
.end method

.method private static native nativeGetUserInfo(JLjava/lang/String;Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$GetUserInfoCallback;)V
.end method

.method private static native nativeGetUserList(JJLcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$GetUserListJniCallback;)V
.end method

.method private static native nativeGetUserListByTag(JIJLcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$GetUserListJniCallback;)V
.end method

.method private static native nativeKickRemoteUserOutOfRoom(JLjava/lang/String;Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$ActionCallback;)V
.end method

.method public static native nativeKickUserOffSeatByAdmin(JILjava/lang/String;Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$ActionCallback;)V
.end method

.method private static native nativeLeaveSeat(JLcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$ActionCallback;)V
.end method

.method private static native nativeLockSeatByAdmin(JILcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$SeatLockParams;Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$ActionCallback;)V
.end method

.method private static native nativeLogin(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$ActionCallback;)V
.end method

.method private static native nativeLogout(Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$ActionCallback;)V
.end method

.method private static native nativeMoveToSeat(JILcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$ActionCallback;)V
.end method

.method private static native nativeMuteLocalAudio(J)V
.end method

.method private static native nativeMuteRemoteAudioStream(JLjava/lang/String;Z)V
.end method

.method private static native nativeOpenLocalCamera(JIILcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$ActionCallback;)V
.end method

.method private static native nativeOpenLocalMicrophone(JILcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$ActionCallback;)V
.end method

.method private static native nativeOpenRemoteDeviceByAdmin(JLjava/lang/String;IILcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$RequestCallback;)Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$Request;
.end method

.method private static native nativeRemoveCategoryTagForUsers(JI[Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$ActionCallback;)V
.end method

.method private static native nativeResponseRemoteRequest(JLjava/lang/String;ZLjava/lang/String;Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$ActionCallback;)V
.end method

.method private static native nativeSetCustomInfoForUser(JLjava/lang/String;Ljava/util/HashMap;Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$ActionCallback;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Ljava/lang/String;",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "[B>;",
            "Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$ActionCallback;",
            ")V"
        }
    .end annotation
.end method

.method private static native nativeSetLocalVideoView(JLcom/tencent/rtmp/ui/TXCloudVideoView;)V
.end method

.method private static native nativeSetLocalVideoViewDeprecated(JILcom/tencent/rtmp/ui/TXCloudVideoView;)V
.end method

.method private static native nativeSetLoginInfo(Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$LoginUserInfo;Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$ActionCallback;)V
.end method

.method private static native nativeSetRemoteVideoView(JLjava/lang/String;ILcom/tencent/rtmp/ui/TXCloudVideoView;)V
.end method

.method private static native nativeSetRoomMetadataByAdmin(JLjava/lang/String;Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$ActionCallback;)V
.end method

.method private static native nativeSetSelfInfo(Ljava/lang/String;Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$ActionCallback;)V
.end method

.method private static native nativeSetVideoResolutionMode(JII)V
.end method

.method private static native nativeStartPlayRemoteVideo(JLjava/lang/String;ILcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$PlayCallback;)V
.end method

.method private static native nativeStartPushLocalVideo(J)V
.end method

.method private static native nativeStartScreenSharing(J)V
.end method

.method private static native nativeStopPlayRemoteVideo(JLjava/lang/String;I)V
.end method

.method private static native nativeStopPushLocalVideo(J)V
.end method

.method private static native nativeStopScreenSharing(J)V
.end method

.method private static native nativeTakeSeat(JIILjava/lang/String;Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$RequestCallback;)Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$Request;
.end method

.method public static native nativeTakeUserOnSeatByAdmin(JILjava/lang/String;ILjava/lang/String;Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$RequestCallback;)Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$Request;
.end method

.method private static native nativeUnmuteLocalAudio(JLcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$ActionCallback;)V
.end method

.method private static native nativeUpdateAudioQuality(JI)V
.end method

.method private static native nativeUpdateRoomNameByAdmin(JLjava/lang/String;Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$ActionCallback;)V
.end method

.method private static native nativeUpdateRoomPasswordByAdmin(JLjava/lang/String;Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$ActionCallback;)V
.end method

.method private static native nativeUpdateRoomSeatModeByAdmin(JILcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$ActionCallback;)V
.end method

.method private static native nativeUpdateVideoQuality(JI)V
.end method

.method private static native nativeUpdateVideoQualityEx(JILcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$VideoEncoderParams;)V
.end method

.method public static setLoginInfo(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$LoginUserInfo;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$LoginUserInfo;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p0}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$LoginUserInfo;-><init>(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$LoginUserInfo;)V

    .line 6
    .line 7
    new-instance p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$ActionCallback;

    .line 8
    .line 9
    .line 10
    invoke-direct {p0, p1}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$ActionCallback;-><init>(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

    .line 11
    .line 12
    .line 13
    invoke-static {v0, p0}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->nativeSetLoginInfo(Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$LoginUserInfo;Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$ActionCallback;)V

    .line 14
    return-void
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
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public static setSelfInfo(Ljava/lang/String;Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$ActionCallback;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p2}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$ActionCallback;-><init>(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

    .line 6
    .line 7
    .line 8
    invoke-static {p0, p1, v0}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->nativeSetSelfInfo(Ljava/lang/String;Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$ActionCallback;)V

    .line 9
    return-void
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
.end method


# virtual methods
.method public addCategoryTagForUsers(ILjava/util/List;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;",
            ")V"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p3}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->checkPipeline(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    return-void

    .line 8
    .line 9
    .line 10
    :cond_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 11
    move-result v0

    .line 12
    .line 13
    new-array v0, v0, [Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    invoke-interface {p2, v0}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 17
    move-result-object p2

    .line 18
    .line 19
    check-cast p2, [Ljava/lang/String;

    .line 20
    .line 21
    iget-wide v0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->mNativeTUIRoomEngineJni:J

    .line 22
    .line 23
    new-instance v2, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$ActionCallback;

    .line 24
    .line 25
    .line 26
    invoke-direct {v2, p3}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$ActionCallback;-><init>(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

    .line 27
    .line 28
    .line 29
    invoke-static {v0, v1, p1, p2, v2}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->nativeAddCategoryTagForUsers(JI[Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$ActionCallback;)V

    .line 30
    return-void
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
.end method

.method public addObserver(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomObserver;)V
    .locals 1

    .line 1
    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    iget-object v0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->mObserverList:Ljava/util/List;

    .line 5
    .line 6
    .line 7
    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 8
    move-result v0

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    iget-object v0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->mObserverList:Ljava/util/List;

    .line 13
    .line 14
    .line 15
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 16
    :cond_0
    return-void
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

.method public applyToAdminToOpenLocalDevice(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$MediaDevice;ILcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RequestCallback;)Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$Request;
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p3}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->checkPipeline(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RequestCallback;)Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    new-instance p1, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$Request;

    .line 9
    .line 10
    .line 11
    invoke-direct {p1}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$Request;-><init>()V

    .line 12
    return-object p1

    .line 13
    .line 14
    :cond_0
    iget-wide v0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->mNativeTUIRoomEngineJni:J

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$MediaDevice;->getValue()I

    .line 18
    move-result p1

    .line 19
    .line 20
    new-instance v2, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$RequestCallback;

    .line 21
    .line 22
    .line 23
    invoke-direct {v2, p3}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$RequestCallback;-><init>(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RequestCallback;)V

    .line 24
    .line 25
    .line 26
    invoke-static {v0, v1, p1, p2, v2}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->nativeApplyToAdminToOpenLocalDevice(JIILcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$RequestCallback;)Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$Request;

    .line 27
    move-result-object p1

    .line 28
    return-object p1
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
.end method

.method public cancelRequest(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p2}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->checkPipeline(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    return-void

    .line 8
    .line 9
    :cond_0
    iget-wide v0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->mNativeTUIRoomEngineJni:J

    .line 10
    .line 11
    new-instance v2, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$ActionCallback;

    .line 12
    .line 13
    .line 14
    invoke-direct {v2, p2}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$ActionCallback;-><init>(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

    .line 15
    .line 16
    .line 17
    invoke-static {v0, v1, p1, v2}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->nativeCancelRequest(JLjava/lang/String;Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$ActionCallback;)V

    .line 18
    return-void
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
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public changeUserNameCard(Ljava/lang/String;Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p3}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->checkPipeline(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    return-void

    .line 8
    .line 9
    :cond_0
    iget-wide v0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->mNativeTUIRoomEngineJni:J

    .line 10
    .line 11
    new-instance v2, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$ActionCallback;

    .line 12
    .line 13
    .line 14
    invoke-direct {v2, p3}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$ActionCallback;-><init>(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

    .line 15
    .line 16
    .line 17
    invoke-static {v0, v1, p1, p2, v2}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->nativeChangeUserNameCard(JLjava/lang/String;Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$ActionCallback;)V

    .line 18
    return-void
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
.end method

.method public changeUserRole(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$Role;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p3}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->checkPipeline(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    return-void

    .line 8
    .line 9
    :cond_0
    iget-wide v0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->mNativeTUIRoomEngineJni:J

    .line 10
    .line 11
    .line 12
    invoke-virtual {p2}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$Role;->getValue()I

    .line 13
    move-result p2

    .line 14
    .line 15
    new-instance v2, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$ActionCallback;

    .line 16
    .line 17
    .line 18
    invoke-direct {v2, p3}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$ActionCallback;-><init>(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

    .line 19
    .line 20
    .line 21
    invoke-static {v0, v1, p1, p2, v2}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->nativeChangeUserRole(JLjava/lang/String;ILcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$ActionCallback;)V

    .line 22
    return-void
    .line 23
    .line 24
    .line 25
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
.end method

.method public closeLocalCamera()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->checkPipeline()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    return-void

    .line 8
    .line 9
    :cond_0
    iget-wide v0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->mNativeTUIRoomEngineJni:J

    .line 10
    .line 11
    .line 12
    invoke-static {v0, v1}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->nativeCloseLocalCamera(J)V

    .line 13
    return-void
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public closeLocalMicrophone()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->checkPipeline()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    return-void

    .line 8
    .line 9
    :cond_0
    iget-wide v0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->mNativeTUIRoomEngineJni:J

    .line 10
    .line 11
    .line 12
    invoke-static {v0, v1}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->nativeCloseLocalMicrophone(J)V

    .line 13
    return-void
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public closeRemoteDeviceByAdmin(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$MediaDevice;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p3}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->checkPipeline(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    return-void

    .line 8
    .line 9
    :cond_0
    iget-wide v0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->mNativeTUIRoomEngineJni:J

    .line 10
    .line 11
    .line 12
    invoke-virtual {p2}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$MediaDevice;->getValue()I

    .line 13
    move-result p2

    .line 14
    .line 15
    new-instance v2, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$ActionCallback;

    .line 16
    .line 17
    .line 18
    invoke-direct {v2, p3}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$ActionCallback;-><init>(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

    .line 19
    .line 20
    .line 21
    invoke-static {v0, v1, p1, p2, v2}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->nativeCloseRemoteDeviceByAdmin(JLjava/lang/String;ILcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$ActionCallback;)V

    .line 22
    return-void
    .line 23
    .line 24
    .line 25
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
.end method

.method public createChangeReason(I)Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ChangeReason;
    .locals 0
    .annotation build Lcom/tencent/liteav/base/annotations/CalledByNative;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ChangeReason;->fromInt(I)Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ChangeReason;

    .line 4
    move-result-object p1

    .line 5
    return-object p1
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

.method public createKickedOutOfRoomReason(I)Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$KickedOutOfRoomReason;
    .locals 0
    .annotation build Lcom/tencent/liteav/base/annotations/CalledByNative;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$KickedOutOfRoomReason;->fromInt(I)Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$KickedOutOfRoomReason;

    .line 4
    move-result-object p1

    .line 5
    return-object p1
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

.method public createRoom(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p2}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->checkPipeline(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    return-void

    .line 8
    .line 9
    :cond_0
    iget-wide v0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->mNativeTUIRoomEngineJni:J

    .line 10
    .line 11
    new-instance v2, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$RoomInfo;

    .line 12
    .line 13
    .line 14
    invoke-direct {v2, p1}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$RoomInfo;-><init>(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;)V

    .line 15
    .line 16
    new-instance p1, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$ActionCallback;

    .line 17
    .line 18
    .line 19
    invoke-direct {p1, p2}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$ActionCallback;-><init>(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

    .line 20
    .line 21
    .line 22
    invoke-static {v0, v1, v2, p1}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->nativeCreateRoom(JLcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$RoomInfo;Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$ActionCallback;)V

    .line 23
    return-void
    .line 24
    .line 25
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
.end method

.method public createSeatMode(I)Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatMode;
    .locals 0
    .annotation build Lcom/tencent/liteav/base/annotations/CalledByNative;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatMode;->fromInt(I)Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatMode;

    .line 4
    move-result-object p1

    .line 5
    return-object p1
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

.method public createVideoStreamType(I)Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$VideoStreamType;
    .locals 0
    .annotation build Lcom/tencent/liteav/base/annotations/CalledByNative;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$VideoStreamType;->fromInt(I)Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$VideoStreamType;

    .line 4
    move-result-object p1

    .line 5
    return-object p1
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

.method public destroy()V
    .locals 4

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->mNativeTUIRoomEngineJni:J

    .line 3
    .line 4
    const-wide/16 v2, 0x0

    .line 5
    .line 6
    cmp-long v0, v0, v2

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->getLiveBattleManager()Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    check-cast v0, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveBattleManagerImpl;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveBattleManagerImpl;->destroy()V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->getLiveConnectionManager()Lcom/tencent/cloud/tuikit/engine/extension/TUILiveConnectionManager;

    .line 21
    move-result-object v0

    .line 22
    .line 23
    check-cast v0, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveConnectionManagerImpl;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0}, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveConnectionManagerImpl;->destroy()V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->getLiveLayoutManager()Lcom/tencent/cloud/tuikit/engine/extension/TUILiveLayoutManager;

    .line 30
    move-result-object v0

    .line 31
    .line 32
    check-cast v0, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveLayoutManagerImpl;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveLayoutManagerImpl;->destroy()V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->getLiveGiftManager()Lcom/tencent/cloud/tuikit/engine/extension/TUILiveGiftManager;

    .line 39
    move-result-object v0

    .line 40
    .line 41
    check-cast v0, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveGiftManagerImpl;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0}, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveGiftManagerImpl;->destroy()V

    .line 45
    .line 46
    iget-wide v0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->mNativeTUIRoomEngineJni:J

    .line 47
    .line 48
    .line 49
    invoke-static {v0, v1}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->nativeDestroyPipeline(J)V

    .line 50
    .line 51
    iput-wide v2, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->mNativeTUIRoomEngineJni:J

    .line 52
    .line 53
    :cond_0
    iget-object v0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->mObserverList:Ljava/util/List;

    .line 54
    .line 55
    .line 56
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 57
    .line 58
    iget-object v0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->mPipelineBridge:Lcom/tencent/cloud/tuikit/engine/impl/pipelinebridge/TUIPipelineBridge;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0}, Lcom/tencent/cloud/tuikit/engine/impl/pipelinebridge/TUIPipelineBridge;->destroy()V

    .line 62
    return-void
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
.end method

.method public destroyRoom(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->checkPipeline(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    return-void

    .line 8
    .line 9
    :cond_0
    iget-wide v0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->mNativeTUIRoomEngineJni:J

    .line 10
    .line 11
    new-instance v2, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$ActionCallback;

    .line 12
    .line 13
    .line 14
    invoke-direct {v2, p1}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$ActionCallback;-><init>(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

    .line 15
    .line 16
    .line 17
    invoke-static {v0, v1, v2}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->nativeDestroyRoom(JLcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$ActionCallback;)V

    .line 18
    return-void
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method

.method public disableDeviceForAllUserByAdmin(ZLcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$MediaDevice;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p3}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->checkPipeline(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    return-void

    .line 8
    .line 9
    :cond_0
    iget-wide v0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->mNativeTUIRoomEngineJni:J

    .line 10
    .line 11
    .line 12
    invoke-virtual {p2}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$MediaDevice;->getValue()I

    .line 13
    move-result p2

    .line 14
    .line 15
    new-instance v2, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$ActionCallback;

    .line 16
    .line 17
    .line 18
    invoke-direct {v2, p3}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$ActionCallback;-><init>(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

    .line 19
    .line 20
    .line 21
    invoke-static {v0, v1, p1, p2, v2}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->nativeDisableDeviceForAllUserByAdmin(JZILcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$ActionCallback;)V

    .line 22
    return-void
    .line 23
    .line 24
    .line 25
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
.end method

.method public disableSendingMessageByAdmin(ZLjava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p3}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->checkPipeline(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    return-void

    .line 8
    .line 9
    :cond_0
    iget-wide v0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->mNativeTUIRoomEngineJni:J

    .line 10
    .line 11
    new-instance v2, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$ActionCallback;

    .line 12
    .line 13
    .line 14
    invoke-direct {v2, p3}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$ActionCallback;-><init>(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

    .line 15
    .line 16
    .line 17
    invoke-static {v0, v1, p1, p2, v2}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->nativeDisableSendingMessageByAdmin(JZLjava/lang/String;Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$ActionCallback;)V

    .line 18
    return-void
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
.end method

.method public disableSendingMessageForAllUser(ZLcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p2}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->checkPipeline(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    return-void

    .line 8
    .line 9
    :cond_0
    iget-wide v0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->mNativeTUIRoomEngineJni:J

    .line 10
    .line 11
    new-instance v2, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$ActionCallback;

    .line 12
    .line 13
    .line 14
    invoke-direct {v2, p2}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$ActionCallback;-><init>(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

    .line 15
    .line 16
    .line 17
    invoke-static {v0, v1, p1, v2}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->nativeDisableSendingMessageForAllUser(JZLcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$ActionCallback;)V

    .line 18
    return-void
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
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public enableGravitySensor(Z)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->checkPipeline()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    return-void

    .line 8
    .line 9
    :cond_0
    iget-wide v0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->mNativeTUIRoomEngineJni:J

    .line 10
    .line 11
    .line 12
    invoke-static {v0, v1, p1}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->nativeEnableGravitySensor(JZ)V

    .line 13
    return-void
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

.method public enableSystemAudioSharing(Z)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->checkPipeline()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    return-void

    .line 8
    .line 9
    :cond_0
    iget-wide v0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->mNativeTUIRoomEngineJni:J

    .line 10
    .line 11
    .line 12
    invoke-static {v0, v1, p1}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->nativeEnableSystemAudioSharing(JZ)V

    .line 13
    return-void
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

.method public enterRoom(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomType;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$EnterRoomOptions;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$GetRoomInfoCallback;)V
    .locals 7

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p4}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->checkPipeline(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$GetRoomInfoCallback;)Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    return-void

    .line 8
    .line 9
    :cond_0
    iget-wide v1, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->mNativeTUIRoomEngineJni:J

    .line 10
    .line 11
    .line 12
    invoke-virtual {p2}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomType;->getValue()I

    .line 13
    move-result v4

    .line 14
    .line 15
    new-instance v5, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$EnterRoomOptions;

    .line 16
    .line 17
    .line 18
    invoke-direct {v5, p3}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$EnterRoomOptions;-><init>(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$EnterRoomOptions;)V

    .line 19
    .line 20
    new-instance v6, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$GetRoomInfoCallback;

    .line 21
    .line 22
    .line 23
    invoke-direct {v6, p4}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$GetRoomInfoCallback;-><init>(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$GetRoomInfoCallback;)V

    .line 24
    move-object v3, p1

    .line 25
    .line 26
    .line 27
    invoke-static/range {v1 .. v6}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->nativeEnterRoom(JLjava/lang/String;ILcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$EnterRoomOptions;Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$GetRoomInfoCallback;)V

    .line 28
    return-void
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
.end method

.method public exitRoom(ZLcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p2}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->checkPipeline(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    return-void

    .line 8
    .line 9
    :cond_0
    iget-wide v0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->mNativeTUIRoomEngineJni:J

    .line 10
    .line 11
    new-instance v2, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$ActionCallback;

    .line 12
    .line 13
    .line 14
    invoke-direct {v2, p2}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$ActionCallback;-><init>(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

    .line 15
    .line 16
    .line 17
    invoke-static {v0, v1, p1, v2}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->nativeExitRoom(JZLcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$ActionCallback;)V

    .line 18
    return-void
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
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public fetchRoomInfo(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$GetRoomInfoCallback;)V
    .locals 3

    .line 1
    invoke-direct {p0, p1}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->checkPipeline(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$GetRoomInfoCallback;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-wide v0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->mNativeTUIRoomEngineJni:J

    new-instance v2, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$GetRoomInfoCallback;

    invoke-direct {v2, p1}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$GetRoomInfoCallback;-><init>(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$GetRoomInfoCallback;)V

    invoke-static {v0, v1, v2}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->nativeFetchRoomInfo(JLcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$GetRoomInfoCallback;)V

    return-void
.end method

.method public fetchRoomInfo(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomType;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$GetRoomInfoCallback;)V
    .locals 3

    .line 3
    invoke-direct {p0, p3}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->checkPipeline(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$GetRoomInfoCallback;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 4
    :cond_0
    iget-wide v0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->mNativeTUIRoomEngineJni:J

    invoke-virtual {p2}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomType;->getValue()I

    move-result p2

    new-instance v2, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$GetRoomInfoCallback;

    invoke-direct {v2, p3}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$GetRoomInfoCallback;-><init>(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$GetRoomInfoCallback;)V

    invoke-static {v0, v1, p1, p2, v2}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->nativeFetchRoomInfoById(JLjava/lang/String;ILcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$GetRoomInfoCallback;)V

    return-void
.end method

.method public getConferenceInvitationManager()Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceInvitationManager;
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->mConferenceInvitationManager:Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceInvitationManager;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    new-instance v0, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUIConferenceInvitationManagerImpl;

    .line 7
    .line 8
    iget-wide v1, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->mNativeTUIRoomEngineJni:J

    .line 9
    .line 10
    .line 11
    invoke-static {v1, v2}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->nativeGetConferenceInvitationManager(J)J

    .line 12
    move-result-wide v1

    .line 13
    .line 14
    .line 15
    invoke-direct {v0, v1, v2}, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUIConferenceInvitationManagerImpl;-><init>(J)V

    .line 16
    .line 17
    iput-object v0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->mConferenceInvitationManager:Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceInvitationManager;

    .line 18
    .line 19
    :cond_0
    iget-object v0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->mConferenceInvitationManager:Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceInvitationManager;

    .line 20
    return-object v0
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

.method public getConferenceListManager()Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager;
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->mConferenceListManager:Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    new-instance v0, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUIConferenceListManagerImpl;

    .line 7
    .line 8
    iget-wide v1, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->mNativeTUIRoomEngineJni:J

    .line 9
    .line 10
    .line 11
    invoke-static {v1, v2}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->nativeGetConferenceListManager(J)J

    .line 12
    move-result-wide v1

    .line 13
    .line 14
    .line 15
    invoke-direct {v0, v1, v2}, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUIConferenceListManagerImpl;-><init>(J)V

    .line 16
    .line 17
    iput-object v0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->mConferenceListManager:Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager;

    .line 18
    .line 19
    :cond_0
    iget-object v0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->mConferenceListManager:Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager;

    .line 20
    return-object v0
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

.method public getLiveBattleManager()Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager;
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->mLiveBattleManager:Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    new-instance v0, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveBattleManagerImpl;

    .line 7
    .line 8
    iget-wide v1, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->mNativeTUIRoomEngineJni:J

    .line 9
    .line 10
    .line 11
    invoke-static {v1, v2}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->nativeGetLiveBattleManager(J)J

    .line 12
    move-result-wide v1

    .line 13
    .line 14
    .line 15
    invoke-direct {v0, v1, v2}, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveBattleManagerImpl;-><init>(J)V

    .line 16
    .line 17
    iput-object v0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->mLiveBattleManager:Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager;

    .line 18
    .line 19
    :cond_0
    iget-object v0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->mLiveBattleManager:Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager;

    .line 20
    return-object v0
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

.method public getLiveConnectionManager()Lcom/tencent/cloud/tuikit/engine/extension/TUILiveConnectionManager;
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->mLiveConnectionManager:Lcom/tencent/cloud/tuikit/engine/extension/TUILiveConnectionManager;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    new-instance v0, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveConnectionManagerImpl;

    .line 7
    .line 8
    iget-wide v1, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->mNativeTUIRoomEngineJni:J

    .line 9
    .line 10
    .line 11
    invoke-static {v1, v2}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->nativeGetLiveConnectionManager(J)J

    .line 12
    move-result-wide v1

    .line 13
    .line 14
    .line 15
    invoke-direct {v0, v1, v2}, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveConnectionManagerImpl;-><init>(J)V

    .line 16
    .line 17
    iput-object v0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->mLiveConnectionManager:Lcom/tencent/cloud/tuikit/engine/extension/TUILiveConnectionManager;

    .line 18
    .line 19
    :cond_0
    iget-object v0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->mLiveConnectionManager:Lcom/tencent/cloud/tuikit/engine/extension/TUILiveConnectionManager;

    .line 20
    return-object v0
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

.method public getLiveGiftManager()Lcom/tencent/cloud/tuikit/engine/extension/TUILiveGiftManager;
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->mLiveGiftManager:Lcom/tencent/cloud/tuikit/engine/extension/TUILiveGiftManager;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    new-instance v0, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveGiftManagerImpl;

    .line 7
    .line 8
    iget-wide v1, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->mNativeTUIRoomEngineJni:J

    .line 9
    .line 10
    .line 11
    invoke-static {v1, v2}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->nativeGetLiveGiftManager(J)J

    .line 12
    move-result-wide v1

    .line 13
    .line 14
    .line 15
    invoke-direct {v0, v1, v2}, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveGiftManagerImpl;-><init>(J)V

    .line 16
    .line 17
    iput-object v0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->mLiveGiftManager:Lcom/tencent/cloud/tuikit/engine/extension/TUILiveGiftManager;

    .line 18
    .line 19
    :cond_0
    iget-object v0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->mLiveGiftManager:Lcom/tencent/cloud/tuikit/engine/extension/TUILiveGiftManager;

    .line 20
    return-object v0
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

.method public getLiveLayoutManager()Lcom/tencent/cloud/tuikit/engine/extension/TUILiveLayoutManager;
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->mLiveLayoutManager:Lcom/tencent/cloud/tuikit/engine/extension/TUILiveLayoutManager;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    new-instance v0, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveLayoutManagerImpl;

    .line 7
    .line 8
    iget-wide v1, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->mNativeTUIRoomEngineJni:J

    .line 9
    .line 10
    .line 11
    invoke-static {v1, v2}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->nativeGetLiveLayoutManager(J)J

    .line 12
    move-result-wide v1

    .line 13
    .line 14
    .line 15
    invoke-direct {v0, v1, v2}, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveLayoutManagerImpl;-><init>(J)V

    .line 16
    .line 17
    iput-object v0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->mLiveLayoutManager:Lcom/tencent/cloud/tuikit/engine/extension/TUILiveLayoutManager;

    .line 18
    .line 19
    :cond_0
    iget-object v0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->mLiveLayoutManager:Lcom/tencent/cloud/tuikit/engine/extension/TUILiveLayoutManager;

    .line 20
    return-object v0
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

.method public getLiveListManager()Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveListManagerImpl;
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->mLiveListManager:Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveListManagerImpl;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    new-instance v0, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveListManagerImpl;

    .line 7
    .line 8
    iget-wide v1, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->mNativeTUIRoomEngineJni:J

    .line 9
    .line 10
    .line 11
    invoke-static {v1, v2}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->nativeGetLiveListManager(J)J

    .line 12
    move-result-wide v1

    .line 13
    .line 14
    .line 15
    invoke-direct {v0, p0, v1, v2}, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveListManagerImpl;-><init>(Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;J)V

    .line 16
    .line 17
    iput-object v0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->mLiveListManager:Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveListManagerImpl;

    .line 18
    .line 19
    :cond_0
    iget-object v0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->mLiveListManager:Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveListManagerImpl;

    .line 20
    return-object v0
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

.method public getMediaDeviceManager()Lcom/tencent/cloud/tuikit/engine/extension/TUIRoomDeviceManager;
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->mDeviceManager:Lcom/tencent/cloud/tuikit/engine/extension/TUIRoomDeviceManager;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    new-instance v0, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUIRoomDeviceManagerImpl;

    .line 7
    .line 8
    iget-wide v1, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->mNativeTUIRoomEngineJni:J

    .line 9
    .line 10
    .line 11
    invoke-static {v1, v2}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->nativeGetMediaDeviceManager(J)J

    .line 12
    move-result-wide v1

    .line 13
    .line 14
    .line 15
    invoke-direct {v0, v1, v2}, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUIRoomDeviceManagerImpl;-><init>(J)V

    .line 16
    .line 17
    iput-object v0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->mDeviceManager:Lcom/tencent/cloud/tuikit/engine/extension/TUIRoomDeviceManager;

    .line 18
    .line 19
    :cond_0
    iget-object v0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->mDeviceManager:Lcom/tencent/cloud/tuikit/engine/extension/TUIRoomDeviceManager;

    .line 20
    return-object v0
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

.method public getPipelineBridge()Lcom/tencent/cloud/tuikit/engine/impl/pipelinebridge/TUIPipelineBridge;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->mPipelineBridge:Lcom/tencent/cloud/tuikit/engine/impl/pipelinebridge/TUIPipelineBridge;

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
.end method

.method public getRoomMetadata(Ljava/util/List;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$GetRoomMetadataCallback;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$GetRoomMetadataCallback;",
            ")V"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p2}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->checkPipeline(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$GetRoomMetadataCallback;)Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    return-void

    .line 8
    .line 9
    :cond_0
    if-nez p1, :cond_1

    .line 10
    .line 11
    new-instance p1, Ljava/util/ArrayList;

    .line 12
    .line 13
    .line 14
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 15
    .line 16
    :cond_1
    iget-wide v0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->mNativeTUIRoomEngineJni:J

    .line 17
    const/4 v2, 0x0

    .line 18
    .line 19
    new-array v2, v2, [Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    invoke-interface {p1, v2}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 23
    move-result-object p1

    .line 24
    .line 25
    check-cast p1, [Ljava/lang/String;

    .line 26
    .line 27
    new-instance v2, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$GetRoomMetadataCallback;

    .line 28
    .line 29
    .line 30
    invoke-direct {v2, p2}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$GetRoomMetadataCallback;-><init>(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$GetRoomMetadataCallback;)V

    .line 31
    .line 32
    .line 33
    invoke-static {v0, v1, p1, v2}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->nativeGetRoomMetadata(J[Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$GetRoomMetadataCallback;)V

    .line 34
    return-void
    .line 35
    .line 36
    .line 37
.end method

.method public getSeatApplicationList(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RequestListCallback;)V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->checkPipeline(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RequestListCallback;)Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    return-void

    .line 8
    .line 9
    :cond_0
    iget-wide v0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->mNativeTUIRoomEngineJni:J

    .line 10
    .line 11
    new-instance v2, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$RequestListCallback;

    .line 12
    .line 13
    .line 14
    invoke-direct {v2, p1}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$RequestListCallback;-><init>(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RequestListCallback;)V

    .line 15
    .line 16
    .line 17
    invoke-static {v0, v1, v2}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->nativeGetSeatApplicationList(JLcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$RequestListCallback;)V

    .line 18
    return-void
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method

.method public getSeatList(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$GetSeatListCallback;)V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->checkPipeline(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$GetSeatListCallback;)Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    return-void

    .line 8
    .line 9
    :cond_0
    iget-wide v0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->mNativeTUIRoomEngineJni:J

    .line 10
    .line 11
    new-instance v2, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$GetSeatListJniCallback;

    .line 12
    .line 13
    .line 14
    invoke-direct {v2, p1}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$GetSeatListJniCallback;-><init>(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$GetSeatListCallback;)V

    .line 15
    .line 16
    .line 17
    invoke-static {v0, v1, v2}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->nativeGetSeatList(JLcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$GetSeatListJniCallback;)V

    .line 18
    return-void
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method

.method public getSongListManager()Lcom/tencent/cloud/tuikit/engine/extension/TUISongListManager;
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->mSongListManager:Lcom/tencent/cloud/tuikit/engine/extension/internal/TUISongListManagerImpl;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    new-instance v0, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUISongListManagerImpl;

    .line 7
    .line 8
    iget-wide v1, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->mNativeTUIRoomEngineJni:J

    .line 9
    .line 10
    .line 11
    invoke-static {v1, v2}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->nativeGetSongListManager(J)J

    .line 12
    move-result-wide v1

    .line 13
    .line 14
    .line 15
    invoke-direct {v0, p0, v1, v2}, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUISongListManagerImpl;-><init>(Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;J)V

    .line 16
    .line 17
    iput-object v0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->mSongListManager:Lcom/tencent/cloud/tuikit/engine/extension/internal/TUISongListManagerImpl;

    .line 18
    .line 19
    :cond_0
    iget-object v0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->mSongListManager:Lcom/tencent/cloud/tuikit/engine/extension/internal/TUISongListManagerImpl;

    .line 20
    return-object v0
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

.method public getTRTCCloud()Lcom/tencent/trtc/TRTCCloud;
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->checkPipeline()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    const/4 v0, 0x0

    .line 8
    return-object v0

    .line 9
    .line 10
    :cond_0
    iget-wide v0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->mNativeTUIRoomEngineJni:J

    .line 11
    .line 12
    .line 13
    invoke-static {v0, v1}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->nativeGetTRTCCloud(J)Lcom/tencent/trtc/TRTCCloud;

    .line 14
    move-result-object v0

    .line 15
    return-object v0
    .line 16
    .line 17
.end method

.method public getUserInfo(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$GetUserInfoCallback;)V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p2}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->checkPipeline(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$GetUserInfoCallback;)Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    return-void

    .line 8
    .line 9
    :cond_0
    iget-wide v0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->mNativeTUIRoomEngineJni:J

    .line 10
    .line 11
    new-instance v2, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$GetUserInfoCallback;

    .line 12
    .line 13
    .line 14
    invoke-direct {v2, p2}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$GetUserInfoCallback;-><init>(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$GetUserInfoCallback;)V

    .line 15
    .line 16
    .line 17
    invoke-static {v0, v1, p1, v2}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->nativeGetUserInfo(JLjava/lang/String;Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$GetUserInfoCallback;)V

    .line 18
    return-void
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
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public getUserList(JLcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$GetUserListCallback;)V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p3}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->checkPipeline(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$GetUserListCallback;)Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    return-void

    .line 8
    .line 9
    :cond_0
    iget-wide v0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->mNativeTUIRoomEngineJni:J

    .line 10
    .line 11
    new-instance v2, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$GetUserListJniCallback;

    .line 12
    .line 13
    .line 14
    invoke-direct {v2, p3}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$GetUserListJniCallback;-><init>(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$GetUserListCallback;)V

    .line 15
    .line 16
    .line 17
    invoke-static {v0, v1, p1, p2, v2}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->nativeGetUserList(JJLcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$GetUserListJniCallback;)V

    .line 18
    return-void
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
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public getUserListByTag(IJLcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$GetUserListCallback;)V
    .locals 7

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p4}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->checkPipeline(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$GetUserListCallback;)Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    return-void

    .line 8
    .line 9
    :cond_0
    iget-wide v1, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->mNativeTUIRoomEngineJni:J

    .line 10
    .line 11
    new-instance v6, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$GetUserListJniCallback;

    .line 12
    .line 13
    .line 14
    invoke-direct {v6, p4}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$GetUserListJniCallback;-><init>(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$GetUserListCallback;)V

    .line 15
    move v3, p1

    .line 16
    move-wide v4, p2

    .line 17
    .line 18
    .line 19
    invoke-static/range {v1 .. v6}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->nativeGetUserListByTag(JIJLcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$GetUserListJniCallback;)V

    .line 20
    return-void
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
.end method

.method public kickRemoteUserOutOfRoom(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p2}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->checkPipeline(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    return-void

    .line 8
    .line 9
    :cond_0
    iget-wide v0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->mNativeTUIRoomEngineJni:J

    .line 10
    .line 11
    new-instance v2, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$ActionCallback;

    .line 12
    .line 13
    .line 14
    invoke-direct {v2, p2}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$ActionCallback;-><init>(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

    .line 15
    .line 16
    .line 17
    invoke-static {v0, v1, p1, v2}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->nativeKickRemoteUserOutOfRoom(JLjava/lang/String;Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$ActionCallback;)V

    .line 18
    return-void
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
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public kickUserOffSeatByAdmin(ILjava/lang/String;Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V
    .locals 7

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p4}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->checkPipeline(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    return-void

    .line 8
    .line 9
    :cond_0
    iget-wide v1, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->mNativeTUIRoomEngineJni:J

    .line 10
    .line 11
    new-instance v6, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$ActionCallback;

    .line 12
    .line 13
    .line 14
    invoke-direct {v6, p4}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$ActionCallback;-><init>(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

    .line 15
    move v3, p1

    .line 16
    move-object v4, p2

    .line 17
    move-object v5, p3

    .line 18
    .line 19
    .line 20
    invoke-static/range {v1 .. v6}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->nativeKickUserOffSeatByAdmin(JILjava/lang/String;Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$ActionCallback;)V

    .line 21
    return-void
    .line 22
    .line 23
    .line 24
    .line 25
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
.end method

.method public leaveSeat(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->checkPipeline(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    return-void

    .line 8
    .line 9
    :cond_0
    iget-wide v0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->mNativeTUIRoomEngineJni:J

    .line 10
    .line 11
    new-instance v2, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$ActionCallback;

    .line 12
    .line 13
    .line 14
    invoke-direct {v2, p1}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$ActionCallback;-><init>(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

    .line 15
    .line 16
    .line 17
    invoke-static {v0, v1, v2}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->nativeLeaveSeat(JLcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$ActionCallback;)V

    .line 18
    return-void
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method

.method public lockSeatByAdmin(ILcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatLockParams;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p3}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->checkPipeline(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    return-void

    .line 8
    .line 9
    :cond_0
    iget-wide v0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->mNativeTUIRoomEngineJni:J

    .line 10
    .line 11
    new-instance v2, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$SeatLockParams;

    .line 12
    .line 13
    .line 14
    invoke-direct {v2, p2}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$SeatLockParams;-><init>(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatLockParams;)V

    .line 15
    .line 16
    new-instance p2, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$ActionCallback;

    .line 17
    .line 18
    .line 19
    invoke-direct {p2, p3}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$ActionCallback;-><init>(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

    .line 20
    .line 21
    .line 22
    invoke-static {v0, v1, p1, v2, p2}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->nativeLockSeatByAdmin(JILcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$SeatLockParams;Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$ActionCallback;)V

    .line 23
    return-void
    .line 24
    .line 25
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
.end method

.method public moveToSeat(ILcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p2}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->checkPipeline(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    return-void

    .line 8
    .line 9
    :cond_0
    iget-wide v0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->mNativeTUIRoomEngineJni:J

    .line 10
    .line 11
    new-instance v2, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$ActionCallback;

    .line 12
    .line 13
    .line 14
    invoke-direct {v2, p2}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$ActionCallback;-><init>(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

    .line 15
    .line 16
    .line 17
    invoke-static {v0, v1, p1, v2}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->nativeMoveToSeat(JILcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$ActionCallback;)V

    .line 18
    return-void
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
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public muteLocalAudio()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->checkPipeline()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    return-void

    .line 8
    .line 9
    :cond_0
    iget-wide v0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->mNativeTUIRoomEngineJni:J

    .line 10
    .line 11
    .line 12
    invoke-static {v0, v1}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->nativeMuteLocalAudio(J)V

    .line 13
    return-void
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public muteRemoteAudioStream(Ljava/lang/String;Z)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->checkPipeline()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    return-void

    .line 8
    .line 9
    :cond_0
    iget-wide v0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->mNativeTUIRoomEngineJni:J

    .line 10
    .line 11
    .line 12
    invoke-static {v0, v1, p1, p2}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->nativeMuteRemoteAudioStream(JLjava/lang/String;Z)V

    .line 13
    return-void
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
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public onAllUserCameraDisableChanged(Ljava/lang/String;Z)V
    .locals 2
    .annotation build Lcom/tencent/liteav/base/annotations/CalledByNative;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->copyOnReadListeners()Ljava/util/List;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    .line 11
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    move-result v1

    .line 13
    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    move-result-object v1

    .line 19
    .line 20
    check-cast v1, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomObserver;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1, p1, p2}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomObserver;->onAllUserCameraDisableChanged(Ljava/lang/String;Z)V

    .line 24
    goto :goto_0

    .line 25
    :cond_0
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
.end method

.method public onAllUserMicrophoneDisableChanged(Ljava/lang/String;Z)V
    .locals 2
    .annotation build Lcom/tencent/liteav/base/annotations/CalledByNative;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->copyOnReadListeners()Ljava/util/List;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    .line 11
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    move-result v1

    .line 13
    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    move-result-object v1

    .line 19
    .line 20
    check-cast v1, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomObserver;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1, p1, p2}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomObserver;->onAllUserMicrophoneDisableChanged(Ljava/lang/String;Z)V

    .line 24
    goto :goto_0

    .line 25
    :cond_0
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
.end method

.method public onError(ILjava/lang/String;)V
    .locals 3
    .annotation build Lcom/tencent/liteav/base/annotations/CalledByNative;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->copyOnReadListeners()Ljava/util/List;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    .line 11
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    move-result v1

    .line 13
    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    move-result-object v1

    .line 19
    .line 20
    check-cast v1, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomObserver;

    .line 21
    .line 22
    .line 23
    invoke-static {p1}, Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;->fromInt(I)Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;

    .line 24
    move-result-object v2

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1, v2, p2}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomObserver;->onError(Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;Ljava/lang/String;)V

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    return-void
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public onKickedOffLine(Ljava/lang/String;)V
    .locals 2
    .annotation build Lcom/tencent/liteav/base/annotations/CalledByNative;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->copyOnReadListeners()Ljava/util/List;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    .line 11
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    move-result v1

    .line 13
    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    move-result-object v1

    .line 19
    .line 20
    check-cast v1, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomObserver;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1, p1}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomObserver;->onKickedOffLine(Ljava/lang/String;)V

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    return-void
.end method

.method public onKickedOffSeat(ILcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;Ljava/lang/String;)V
    .locals 2
    .annotation build Lcom/tencent/liteav/base/annotations/CalledByNative;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->copyOnReadListeners()Ljava/util/List;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    .line 11
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    move-result v1

    .line 13
    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    move-result-object v1

    .line 19
    .line 20
    check-cast v1, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomObserver;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1, p1, p2}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomObserver;->onKickedOffSeat(ILcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1, p1, p2, p3}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomObserver;->onKickedOffSeat(ILcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;Ljava/lang/String;)V

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    return-void
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
.end method

.method public onKickedOutOfRoom(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$KickedOutOfRoomReason;Ljava/lang/String;)V
    .locals 2
    .annotation build Lcom/tencent/liteav/base/annotations/CalledByNative;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->copyOnReadListeners()Ljava/util/List;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    .line 11
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    move-result v1

    .line 13
    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    move-result-object v1

    .line 19
    .line 20
    check-cast v1, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomObserver;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1, p1, p2, p3}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomObserver;->onKickedOutOfRoom(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$KickedOutOfRoomReason;Ljava/lang/String;)V

    .line 24
    goto :goto_0

    .line 25
    :cond_0
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
.end method

.method public onRemoteUserEnterRoom(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;)V
    .locals 2
    .annotation build Lcom/tencent/liteav/base/annotations/CalledByNative;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->copyOnReadListeners()Ljava/util/List;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    .line 11
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    move-result v1

    .line 13
    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    move-result-object v1

    .line 19
    .line 20
    check-cast v1, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomObserver;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1, p1, p2}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomObserver;->onRemoteUserEnterRoom(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;)V

    .line 24
    goto :goto_0

    .line 25
    :cond_0
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
.end method

.method public onRemoteUserLeaveRoom(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;)V
    .locals 2
    .annotation build Lcom/tencent/liteav/base/annotations/CalledByNative;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->copyOnReadListeners()Ljava/util/List;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    .line 11
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    move-result v1

    .line 13
    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    move-result-object v1

    .line 19
    .line 20
    check-cast v1, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomObserver;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1, p1, p2}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomObserver;->onRemoteUserLeaveRoom(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;)V

    .line 24
    goto :goto_0

    .line 25
    :cond_0
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
.end method

.method public onRequestCancelled(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$Request;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;)V
    .locals 2
    .annotation build Lcom/tencent/liteav/base/annotations/CalledByNative;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->copyOnReadListeners()Ljava/util/List;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    .line 11
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    move-result v1

    .line 13
    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    move-result-object v1

    .line 19
    .line 20
    check-cast v1, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomObserver;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1, p1, p2}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomObserver;->onRequestCancelled(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$Request;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;)V

    .line 24
    goto :goto_0

    .line 25
    :cond_0
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
.end method

.method public onRequestProcessed(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$Request;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;)V
    .locals 2
    .annotation build Lcom/tencent/liteav/base/annotations/CalledByNative;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->copyOnReadListeners()Ljava/util/List;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    .line 11
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    move-result v1

    .line 13
    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    move-result-object v1

    .line 19
    .line 20
    check-cast v1, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomObserver;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1, p1, p2}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomObserver;->onRequestProcessed(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$Request;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;)V

    .line 24
    goto :goto_0

    .line 25
    :cond_0
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
.end method

.method public onRequestReceived(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$Request;)V
    .locals 2
    .annotation build Lcom/tencent/liteav/base/annotations/CalledByNative;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->copyOnReadListeners()Ljava/util/List;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    .line 11
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    move-result v1

    .line 13
    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    move-result-object v1

    .line 19
    .line 20
    check-cast v1, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomObserver;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1, p1}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomObserver;->onRequestReceived(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$Request;)V

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    return-void
.end method

.method public onRoomDismissed(Ljava/lang/String;I)V
    .locals 3
    .annotation build Lcom/tencent/liteav/base/annotations/CalledByNative;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->copyOnReadListeners()Ljava/util/List;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    .line 11
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    move-result v1

    .line 13
    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    move-result-object v1

    .line 19
    .line 20
    check-cast v1, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomObserver;

    .line 21
    .line 22
    .line 23
    invoke-static {p2}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomDismissedReason;->fromInt(I)Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomDismissedReason;

    .line 24
    move-result-object v2

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1, p1, v2}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomObserver;->onRoomDismissed(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomDismissedReason;)V

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    return-void
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public onRoomMetadataChanged(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2
    .annotation build Lcom/tencent/liteav/base/annotations/CalledByNative;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->copyOnReadListeners()Ljava/util/List;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    .line 11
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    move-result v1

    .line 13
    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    move-result-object v1

    .line 19
    .line 20
    check-cast v1, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomObserver;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1, p1, p2}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomObserver;->onRoomMetadataChanged(Ljava/lang/String;Ljava/lang/String;)V

    .line 24
    goto :goto_0

    .line 25
    :cond_0
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
.end method

.method public onRoomNameChanged(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2
    .annotation build Lcom/tencent/liteav/base/annotations/CalledByNative;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->copyOnReadListeners()Ljava/util/List;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    .line 11
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    move-result v1

    .line 13
    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    move-result-object v1

    .line 19
    .line 20
    check-cast v1, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomObserver;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1, p1, p2}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomObserver;->onRoomNameChanged(Ljava/lang/String;Ljava/lang/String;)V

    .line 24
    goto :goto_0

    .line 25
    :cond_0
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
.end method

.method public onRoomSeatModeChanged(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatMode;)V
    .locals 2
    .annotation build Lcom/tencent/liteav/base/annotations/CalledByNative;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->copyOnReadListeners()Ljava/util/List;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    .line 11
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    move-result v1

    .line 13
    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    move-result-object v1

    .line 19
    .line 20
    check-cast v1, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomObserver;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1, p1, p2}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomObserver;->onRoomSeatModeChanged(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatMode;)V

    .line 24
    goto :goto_0

    .line 25
    :cond_0
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
.end method

.method public onRoomUserCountChanged(Ljava/lang/String;I)V
    .locals 2
    .annotation build Lcom/tencent/liteav/base/annotations/CalledByNative;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->copyOnReadListeners()Ljava/util/List;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    .line 11
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    move-result v1

    .line 13
    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    move-result-object v1

    .line 19
    .line 20
    check-cast v1, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomObserver;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1, p1, p2}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomObserver;->onRoomUserCountChanged(Ljava/lang/String;I)V

    .line 24
    goto :goto_0

    .line 25
    :cond_0
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
.end method

.method public onScreenShareForAllUserDisableChanged(Ljava/lang/String;Z)V
    .locals 2
    .annotation build Lcom/tencent/liteav/base/annotations/CalledByNative;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->copyOnReadListeners()Ljava/util/List;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    .line 11
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    move-result v1

    .line 13
    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    move-result-object v1

    .line 19
    .line 20
    check-cast v1, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomObserver;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1, p1, p2}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomObserver;->onScreenShareForAllUserDisableChanged(Ljava/lang/String;Z)V

    .line 24
    goto :goto_0

    .line 25
    :cond_0
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
.end method

.method public onSeatListChanged(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V
    .locals 2
    .annotation build Lcom/tencent/liteav/base/annotations/CalledByNative;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatInfo;",
            ">;",
            "Ljava/util/List<",
            "Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatInfo;",
            ">;",
            "Ljava/util/List<",
            "Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatInfo;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->copyOnReadListeners()Ljava/util/List;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    .line 11
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    move-result v1

    .line 13
    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    move-result-object v1

    .line 19
    .line 20
    check-cast v1, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomObserver;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1, p1, p2, p3}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomObserver;->onSeatListChanged(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    .line 24
    goto :goto_0

    .line 25
    :cond_0
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
.end method

.method public onSendMessageForAllUserDisableChanged(Ljava/lang/String;Z)V
    .locals 2
    .annotation build Lcom/tencent/liteav/base/annotations/CalledByNative;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->copyOnReadListeners()Ljava/util/List;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    .line 11
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    move-result v1

    .line 13
    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    move-result-object v1

    .line 19
    .line 20
    check-cast v1, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomObserver;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1, p1, p2}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomObserver;->onSendMessageForAllUserDisableChanged(Ljava/lang/String;Z)V

    .line 24
    goto :goto_0

    .line 25
    :cond_0
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
.end method

.method public onSendMessageForUserDisableChanged(Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 2
    .annotation build Lcom/tencent/liteav/base/annotations/CalledByNative;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->copyOnReadListeners()Ljava/util/List;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    .line 11
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    move-result v1

    .line 13
    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    move-result-object v1

    .line 19
    .line 20
    check-cast v1, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomObserver;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1, p1, p2, p3}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomObserver;->onSendMessageForUserDisableChanged(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 24
    goto :goto_0

    .line 25
    :cond_0
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
.end method

.method public onUserAudioStateChanged(Ljava/lang/String;ZLcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ChangeReason;)V
    .locals 2
    .annotation build Lcom/tencent/liteav/base/annotations/CalledByNative;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->copyOnReadListeners()Ljava/util/List;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    .line 11
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    move-result v1

    .line 13
    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    move-result-object v1

    .line 19
    .line 20
    check-cast v1, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomObserver;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1, p1, p2, p3}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomObserver;->onUserAudioStateChanged(Ljava/lang/String;ZLcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ChangeReason;)V

    .line 24
    goto :goto_0

    .line 25
    :cond_0
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
.end method

.method public onUserInfoChanged(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;I)V
    .locals 5
    .annotation build Lcom/tencent/liteav/base/annotations/CalledByNative;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->copyOnReadListeners()Ljava/util/List;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    .line 11
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    move-result v1

    .line 13
    .line 14
    if-eqz v1, :cond_2

    .line 15
    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    move-result-object v1

    .line 19
    .line 20
    check-cast v1, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomObserver;

    .line 21
    .line 22
    new-instance v2, Ljava/util/ArrayList;

    .line 23
    .line 24
    .line 25
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 26
    .line 27
    sget-object v3, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfoModifyFlag;->USER_ROLE:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfoModifyFlag;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v3}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfoModifyFlag;->getValue()I

    .line 31
    move-result v4

    .line 32
    and-int/2addr v4, p2

    .line 33
    .line 34
    if-eqz v4, :cond_0

    .line 35
    .line 36
    .line 37
    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 38
    .line 39
    :cond_0
    sget-object v3, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfoModifyFlag;->NAME_CARD:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfoModifyFlag;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v3}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfoModifyFlag;->getValue()I

    .line 43
    move-result v4

    .line 44
    and-int/2addr v4, p2

    .line 45
    .line 46
    if-eqz v4, :cond_1

    .line 47
    .line 48
    .line 49
    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    :cond_1
    invoke-virtual {v1, p1, v2}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomObserver;->onUserInfoChanged(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;Ljava/util/List;)V

    .line 53
    goto :goto_0

    .line 54
    :cond_2
    return-void
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
.end method

.method public onUserNetworkQualityChanged(Ljava/util/Map;)V
    .locals 2
    .annotation build Lcom/tencent/liteav/base/annotations/CalledByNative;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$NetworkInfo;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->copyOnReadListeners()Ljava/util/List;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    .line 11
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    move-result v1

    .line 13
    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    move-result-object v1

    .line 19
    .line 20
    check-cast v1, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomObserver;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1, p1}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomObserver;->onUserNetworkQualityChanged(Ljava/util/Map;)V

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    return-void
.end method

.method public onUserScreenCaptureStopped(I)V
    .locals 2
    .annotation build Lcom/tencent/liteav/base/annotations/CalledByNative;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->copyOnReadListeners()Ljava/util/List;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    .line 11
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    move-result v1

    .line 13
    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    move-result-object v1

    .line 19
    .line 20
    check-cast v1, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomObserver;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1, p1}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomObserver;->onUserScreenCaptureStopped(I)V

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    return-void
.end method

.method public onUserSigExpired()V
    .locals 2
    .annotation build Lcom/tencent/liteav/base/annotations/CalledByNative;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->copyOnReadListeners()Ljava/util/List;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    .line 11
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    move-result v1

    .line 13
    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    move-result-object v1

    .line 19
    .line 20
    check-cast v1, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomObserver;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomObserver;->onUserSigExpired()V

    .line 24
    goto :goto_0

    .line 25
    :cond_0
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

.method public onUserVideoSizeChanged(Ljava/lang/String;Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$VideoStreamType;II)V
    .locals 8
    .annotation build Lcom/tencent/liteav/base/annotations/CalledByNative;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->copyOnReadListeners()Ljava/util/List;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    .line 11
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    move-result v1

    .line 13
    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    move-result-object v1

    .line 19
    move-object v2, v1

    .line 20
    .line 21
    check-cast v2, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomObserver;

    .line 22
    move-object v3, p1

    .line 23
    move-object v4, p2

    .line 24
    move-object v5, p3

    .line 25
    move v6, p4

    .line 26
    move v7, p5

    .line 27
    .line 28
    .line 29
    invoke-virtual/range {v2 .. v7}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomObserver;->onUserVideoSizeChanged(Ljava/lang/String;Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$VideoStreamType;II)V

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    return-void
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
.end method

.method public onUserVideoStateChanged(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$VideoStreamType;ZLcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ChangeReason;)V
    .locals 2
    .annotation build Lcom/tencent/liteav/base/annotations/CalledByNative;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->copyOnReadListeners()Ljava/util/List;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    .line 11
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    move-result v1

    .line 13
    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    move-result-object v1

    .line 19
    .line 20
    check-cast v1, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomObserver;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1, p1, p2, p3, p4}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomObserver;->onUserVideoStateChanged(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$VideoStreamType;ZLcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ChangeReason;)V

    .line 24
    goto :goto_0

    .line 25
    :cond_0
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
.end method

.method public onUserVoiceVolumeChanged(Ljava/util/Map;)V
    .locals 2
    .annotation build Lcom/tencent/liteav/base/annotations/CalledByNative;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->copyOnReadListeners()Ljava/util/List;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    .line 11
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    move-result v1

    .line 13
    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    move-result-object v1

    .line 19
    .line 20
    check-cast v1, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomObserver;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1, p1}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomObserver;->onUserVoiceVolumeChanged(Ljava/util/Map;)V

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    return-void
.end method

.method public openLocalCamera(ILcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$VideoQuality;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p3}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->checkPipeline(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    return-void

    .line 8
    .line 9
    :cond_0
    iget-wide v0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->mNativeTUIRoomEngineJni:J

    .line 10
    .line 11
    .line 12
    invoke-virtual {p2}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$VideoQuality;->getValue()I

    .line 13
    move-result p2

    .line 14
    .line 15
    new-instance v2, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$ActionCallback;

    .line 16
    .line 17
    .line 18
    invoke-direct {v2, p3}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$ActionCallback;-><init>(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

    .line 19
    .line 20
    .line 21
    invoke-static {v0, v1, p1, p2, v2}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->nativeOpenLocalCamera(JIILcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$ActionCallback;)V

    .line 22
    return-void
    .line 23
    .line 24
    .line 25
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
.end method

.method public openLocalMicrophone(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$AudioQuality;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p2}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->checkPipeline(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    return-void

    .line 8
    .line 9
    :cond_0
    iget-wide v0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->mNativeTUIRoomEngineJni:J

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$AudioQuality;->getValue()I

    .line 13
    move-result p1

    .line 14
    .line 15
    new-instance v2, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$ActionCallback;

    .line 16
    .line 17
    .line 18
    invoke-direct {v2, p2}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$ActionCallback;-><init>(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

    .line 19
    .line 20
    .line 21
    invoke-static {v0, v1, p1, v2}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->nativeOpenLocalMicrophone(JILcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$ActionCallback;)V

    .line 22
    return-void
    .line 23
    .line 24
    .line 25
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
.end method

.method public openRemoteDeviceByAdmin(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$MediaDevice;ILcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RequestCallback;)Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$Request;
    .locals 6

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p4}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->checkPipeline(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RequestCallback;)Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    new-instance p1, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$Request;

    .line 9
    .line 10
    .line 11
    invoke-direct {p1}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$Request;-><init>()V

    .line 12
    return-object p1

    .line 13
    .line 14
    :cond_0
    iget-wide v0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->mNativeTUIRoomEngineJni:J

    .line 15
    .line 16
    .line 17
    invoke-virtual {p2}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$MediaDevice;->getValue()I

    .line 18
    move-result v3

    .line 19
    .line 20
    new-instance v5, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$RequestCallback;

    .line 21
    .line 22
    .line 23
    invoke-direct {v5, p4}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$RequestCallback;-><init>(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RequestCallback;)V

    .line 24
    move-object v2, p1

    .line 25
    move v4, p3

    .line 26
    .line 27
    .line 28
    invoke-static/range {v0 .. v5}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->nativeOpenRemoteDeviceByAdmin(JLjava/lang/String;IILcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$RequestCallback;)Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$Request;

    .line 29
    move-result-object p1

    .line 30
    return-object p1
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
.end method

.method public removeCategoryTagForUsers(ILjava/util/List;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;",
            ")V"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p3}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->checkPipeline(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    return-void

    .line 8
    .line 9
    .line 10
    :cond_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 11
    move-result v0

    .line 12
    .line 13
    new-array v0, v0, [Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    invoke-interface {p2, v0}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 17
    move-result-object p2

    .line 18
    .line 19
    check-cast p2, [Ljava/lang/String;

    .line 20
    .line 21
    iget-wide v0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->mNativeTUIRoomEngineJni:J

    .line 22
    .line 23
    new-instance v2, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$ActionCallback;

    .line 24
    .line 25
    .line 26
    invoke-direct {v2, p3}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$ActionCallback;-><init>(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

    .line 27
    .line 28
    .line 29
    invoke-static {v0, v1, p1, p2, v2}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->nativeRemoveCategoryTagForUsers(JI[Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$ActionCallback;)V

    .line 30
    return-void
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
.end method

.method public removeObserver(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomObserver;)V
    .locals 1

    .line 1
    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    iget-object v0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->mObserverList:Ljava/util/List;

    .line 5
    .line 6
    .line 7
    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 8
    move-result v0

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget-object v0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->mObserverList:Ljava/util/List;

    .line 13
    .line 14
    .line 15
    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 16
    :cond_0
    return-void
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

.method public responseRemoteRequest(Ljava/lang/String;ZLjava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V
    .locals 7

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p4}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->checkPipeline(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    return-void

    .line 8
    .line 9
    :cond_0
    iget-wide v1, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->mNativeTUIRoomEngineJni:J

    .line 10
    .line 11
    new-instance v6, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$ActionCallback;

    .line 12
    .line 13
    .line 14
    invoke-direct {v6, p4}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$ActionCallback;-><init>(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

    .line 15
    move-object v3, p1

    .line 16
    move v4, p2

    .line 17
    move-object v5, p3

    .line 18
    .line 19
    .line 20
    invoke-static/range {v1 .. v6}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->nativeResponseRemoteRequest(JLjava/lang/String;ZLjava/lang/String;Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$ActionCallback;)V

    .line 21
    return-void
    .line 22
    .line 23
    .line 24
    .line 25
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
.end method

.method public setCustomInfoForUser(Ljava/lang/String;Ljava/util/HashMap;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "[B>;",
            "Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;",
            ")V"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p3}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->checkPipeline(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    return-void

    .line 8
    .line 9
    :cond_0
    iget-wide v0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->mNativeTUIRoomEngineJni:J

    .line 10
    .line 11
    new-instance v2, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$ActionCallback;

    .line 12
    .line 13
    .line 14
    invoke-direct {v2, p3}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$ActionCallback;-><init>(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

    .line 15
    .line 16
    .line 17
    invoke-static {v0, v1, p1, p2, v2}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->nativeSetCustomInfoForUser(JLjava/lang/String;Ljava/util/HashMap;Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$ActionCallback;)V

    .line 18
    return-void
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
.end method

.method public setLocalVideoView(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$VideoStreamType;Lcom/tencent/rtmp/ui/TXCloudVideoView;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->checkPipeline()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-wide v0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->mNativeTUIRoomEngineJni:J

    invoke-virtual {p1}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$VideoStreamType;->getValue()I

    move-result p1

    invoke-static {v0, v1, p1, p2}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->nativeSetLocalVideoViewDeprecated(JILcom/tencent/rtmp/ui/TXCloudVideoView;)V

    return-void
.end method

.method public setLocalVideoView(Lcom/tencent/rtmp/ui/TXCloudVideoView;)V
    .locals 2

    .line 3
    invoke-direct {p0}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->checkPipeline()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 4
    :cond_0
    iget-wide v0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->mNativeTUIRoomEngineJni:J

    invoke-static {v0, v1, p1}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->nativeSetLocalVideoView(JLcom/tencent/rtmp/ui/TXCloudVideoView;)V

    return-void
.end method

.method public setRemoteVideoView(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$VideoStreamType;Lcom/tencent/rtmp/ui/TXCloudVideoView;)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->checkPipeline()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    return-void

    .line 8
    .line 9
    :cond_0
    iget-wide v0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->mNativeTUIRoomEngineJni:J

    .line 10
    .line 11
    .line 12
    invoke-virtual {p2}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$VideoStreamType;->getValue()I

    .line 13
    move-result p2

    .line 14
    .line 15
    .line 16
    invoke-static {v0, v1, p1, p2, p3}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->nativeSetRemoteVideoView(JLjava/lang/String;ILcom/tencent/rtmp/ui/TXCloudVideoView;)V

    .line 17
    return-void
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
.end method

.method public setRoomMetadataByAdmin(Ljava/util/HashMap;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;",
            ")V"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p2}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->checkPipeline(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    goto :goto_0

    .line 8
    .line 9
    :cond_0
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    .line 10
    .line 11
    .line 12
    invoke-direct {v0, p1}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V

    .line 13
    .line 14
    iget-wide v1, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->mNativeTUIRoomEngineJni:J

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 18
    move-result-object p1

    .line 19
    .line 20
    new-instance v0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$ActionCallback;

    .line 21
    .line 22
    .line 23
    invoke-direct {v0, p2}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$ActionCallback;-><init>(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

    .line 24
    .line 25
    .line 26
    invoke-static {v1, v2, p1, v0}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->nativeSetRoomMetadataByAdmin(JLjava/lang/String;Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$ActionCallback;)V
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    .line 27
    return-void

    .line 28
    .line 29
    :catch_0
    const-string p1, "TUIRoomEngineJni"

    .line 30
    .line 31
    .line 32
    const-string/jumbo v0, "setRoomMetadataByAdmin error:"

    .line 33
    .line 34
    .line 35
    invoke-static {p1, v0}, Lcom/tencent/liteav/base/util/LiteavLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 36
    .line 37
    sget-object p1, Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;->FAILED:Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;

    .line 38
    .line 39
    .line 40
    const-string/jumbo v0, "the requested key cannot be empty"

    .line 41
    .line 42
    .line 43
    invoke-interface {p2, p1, v0}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;->onError(Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;Ljava/lang/String;)V

    .line 44
    :goto_0
    return-void
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
.end method

.method public setVideoResolutionMode(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$VideoStreamType;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ResolutionMode;)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->checkPipeline()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    return-void

    .line 8
    .line 9
    :cond_0
    iget-wide v0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->mNativeTUIRoomEngineJni:J

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$VideoStreamType;->getValue()I

    .line 13
    move-result p1

    .line 14
    .line 15
    .line 16
    invoke-virtual {p2}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ResolutionMode;->getValue()I

    .line 17
    move-result p2

    .line 18
    .line 19
    .line 20
    invoke-static {v0, v1, p1, p2}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->nativeSetVideoResolutionMode(JII)V

    .line 21
    return-void
    .line 22
    .line 23
    .line 24
    .line 25
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
.end method

.method public startPlayRemoteVideo(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$VideoStreamType;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$PlayCallback;)V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1, p3}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->checkPipeline(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$PlayCallback;)Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    return-void

    .line 8
    .line 9
    :cond_0
    iget-wide v0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->mNativeTUIRoomEngineJni:J

    .line 10
    .line 11
    .line 12
    invoke-virtual {p2}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$VideoStreamType;->getValue()I

    .line 13
    move-result p2

    .line 14
    .line 15
    new-instance v2, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$PlayCallback;

    .line 16
    .line 17
    .line 18
    invoke-direct {v2, p3}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$PlayCallback;-><init>(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$PlayCallback;)V

    .line 19
    .line 20
    .line 21
    invoke-static {v0, v1, p1, p2, v2}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->nativeStartPlayRemoteVideo(JLjava/lang/String;ILcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$PlayCallback;)V

    .line 22
    return-void
    .line 23
    .line 24
    .line 25
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
.end method

.method public startPushLocalVideo()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->checkPipeline()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    return-void

    .line 8
    .line 9
    :cond_0
    iget-wide v0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->mNativeTUIRoomEngineJni:J

    .line 10
    .line 11
    .line 12
    invoke-static {v0, v1}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->nativeStartPushLocalVideo(J)V

    .line 13
    return-void
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public startScreenSharing()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->checkPipeline()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    return-void

    .line 8
    .line 9
    :cond_0
    iget-wide v0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->mNativeTUIRoomEngineJni:J

    .line 10
    .line 11
    .line 12
    invoke-static {v0, v1}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->nativeStartScreenSharing(J)V

    .line 13
    return-void
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public stopPlayRemoteVideo(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$VideoStreamType;)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->checkPipeline()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    return-void

    .line 8
    .line 9
    :cond_0
    iget-wide v0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->mNativeTUIRoomEngineJni:J

    .line 10
    .line 11
    .line 12
    invoke-virtual {p2}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$VideoStreamType;->getValue()I

    .line 13
    move-result p2

    .line 14
    .line 15
    .line 16
    invoke-static {v0, v1, p1, p2}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->nativeStopPlayRemoteVideo(JLjava/lang/String;I)V

    .line 17
    return-void
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
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public stopPushLocalVideo()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->checkPipeline()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    return-void

    .line 8
    .line 9
    :cond_0
    iget-wide v0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->mNativeTUIRoomEngineJni:J

    .line 10
    .line 11
    .line 12
    invoke-static {v0, v1}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->nativeStopPushLocalVideo(J)V

    .line 13
    return-void
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public stopScreenSharing()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->checkPipeline()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    return-void

    .line 8
    .line 9
    :cond_0
    iget-wide v0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->mNativeTUIRoomEngineJni:J

    .line 10
    .line 11
    .line 12
    invoke-static {v0, v1}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->nativeStopScreenSharing(J)V

    .line 13
    return-void
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public takeSeat(IILcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RequestCallback;)Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$Request;
    .locals 6

    .line 1
    invoke-direct {p0, p3}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->checkPipeline(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RequestCallback;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    new-instance p1, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$Request;

    invoke-direct {p1}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$Request;-><init>()V

    return-object p1

    .line 3
    :cond_0
    iget-wide v0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->mNativeTUIRoomEngineJni:J

    new-instance v5, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$RequestCallback;

    invoke-direct {v5, p3}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$RequestCallback;-><init>(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RequestCallback;)V

    const-string v4, ""

    move v2, p1

    move v3, p2

    invoke-static/range {v0 .. v5}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->nativeTakeSeat(JIILjava/lang/String;Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$RequestCallback;)Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$Request;

    move-result-object p1

    return-object p1
.end method

.method public takeSeat(IILjava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RequestCompletion;)Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$Request;
    .locals 6

    .line 4
    invoke-direct {p0, p4}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->checkPipeline(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RequestCompletion;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 5
    new-instance p1, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$Request;

    invoke-direct {p1}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$Request;-><init>()V

    return-object p1

    .line 6
    :cond_0
    iget-wide v0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->mNativeTUIRoomEngineJni:J

    new-instance v5, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$RequestCallback;

    invoke-direct {v5, p4}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$RequestCallback;-><init>(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RequestCompletion;)V

    move v2, p1

    move v3, p2

    move-object v4, p3

    invoke-static/range {v0 .. v5}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->nativeTakeSeat(JIILjava/lang/String;Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$RequestCallback;)Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$Request;

    move-result-object p1

    return-object p1
.end method

.method public takeUserOnSeatByAdmin(ILjava/lang/String;ILcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RequestCallback;)Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$Request;
    .locals 7

    .line 1
    invoke-direct {p0, p4}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->checkPipeline(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RequestCallback;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    new-instance p1, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$Request;

    invoke-direct {p1}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$Request;-><init>()V

    return-object p1

    .line 3
    :cond_0
    iget-wide v0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->mNativeTUIRoomEngineJni:J

    new-instance v6, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$RequestCallback;

    invoke-direct {v6, p4}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$RequestCallback;-><init>(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RequestCallback;)V

    const-string v5, ""

    move v2, p1

    move-object v3, p2

    move v4, p3

    invoke-static/range {v0 .. v6}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->nativeTakeUserOnSeatByAdmin(JILjava/lang/String;ILjava/lang/String;Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$RequestCallback;)Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$Request;

    move-result-object p1

    return-object p1
.end method

.method public takeUserOnSeatByAdmin(ILjava/lang/String;ILjava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RequestCompletion;)Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$Request;
    .locals 7

    .line 4
    invoke-direct {p0, p5}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->checkPipeline(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RequestCompletion;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 5
    new-instance p1, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$Request;

    invoke-direct {p1}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$Request;-><init>()V

    return-object p1

    .line 6
    :cond_0
    iget-wide v0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->mNativeTUIRoomEngineJni:J

    new-instance v6, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$RequestCallback;

    invoke-direct {v6, p5}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$RequestCallback;-><init>(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RequestCompletion;)V

    move v2, p1

    move-object v3, p2

    move v4, p3

    move-object v5, p4

    invoke-static/range {v0 .. v6}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->nativeTakeUserOnSeatByAdmin(JILjava/lang/String;ILjava/lang/String;Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$RequestCallback;)Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$Request;

    move-result-object p1

    return-object p1
.end method

.method public unmuteLocalAudio(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->checkPipeline(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    return-void

    .line 8
    .line 9
    :cond_0
    iget-wide v0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->mNativeTUIRoomEngineJni:J

    .line 10
    .line 11
    new-instance v2, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$ActionCallback;

    .line 12
    .line 13
    .line 14
    invoke-direct {v2, p1}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$ActionCallback;-><init>(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

    .line 15
    .line 16
    .line 17
    invoke-static {v0, v1, v2}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->nativeUnmuteLocalAudio(JLcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$ActionCallback;)V

    .line 18
    return-void
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method

.method public updateAudioQuality(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$AudioQuality;)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->checkPipeline()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    return-void

    .line 8
    .line 9
    :cond_0
    iget-wide v0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->mNativeTUIRoomEngineJni:J

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$AudioQuality;->getValue()I

    .line 13
    move-result p1

    .line 14
    .line 15
    .line 16
    invoke-static {v0, v1, p1}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->nativeUpdateAudioQuality(JI)V

    .line 17
    return-void
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method

.method public updateRoomNameByAdmin(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p2}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->checkPipeline(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    return-void

    .line 8
    .line 9
    :cond_0
    iget-wide v0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->mNativeTUIRoomEngineJni:J

    .line 10
    .line 11
    new-instance v2, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$ActionCallback;

    .line 12
    .line 13
    .line 14
    invoke-direct {v2, p2}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$ActionCallback;-><init>(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

    .line 15
    .line 16
    .line 17
    invoke-static {v0, v1, p1, v2}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->nativeUpdateRoomNameByAdmin(JLjava/lang/String;Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$ActionCallback;)V

    .line 18
    return-void
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
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public updateRoomPasswordByAdmin(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p2}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->checkPipeline(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    return-void

    .line 8
    .line 9
    :cond_0
    iget-wide v0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->mNativeTUIRoomEngineJni:J

    .line 10
    .line 11
    new-instance v2, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$ActionCallback;

    .line 12
    .line 13
    .line 14
    invoke-direct {v2, p2}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$ActionCallback;-><init>(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

    .line 15
    .line 16
    .line 17
    invoke-static {v0, v1, p1, v2}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->nativeUpdateRoomPasswordByAdmin(JLjava/lang/String;Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$ActionCallback;)V

    .line 18
    return-void
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
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public updateRoomSeatModeByAdmin(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatMode;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p2}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->checkPipeline(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    return-void

    .line 8
    .line 9
    :cond_0
    iget-wide v0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->mNativeTUIRoomEngineJni:J

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatMode;->getValue()I

    .line 13
    move-result p1

    .line 14
    .line 15
    new-instance v2, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$ActionCallback;

    .line 16
    .line 17
    .line 18
    invoke-direct {v2, p2}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$ActionCallback;-><init>(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

    .line 19
    .line 20
    .line 21
    invoke-static {v0, v1, p1, v2}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->nativeUpdateRoomSeatModeByAdmin(JILcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$ActionCallback;)V

    .line 22
    return-void
    .line 23
    .line 24
    .line 25
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
.end method

.method public updateVideoQuality(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$VideoQuality;)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->checkPipeline()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    return-void

    .line 8
    .line 9
    :cond_0
    iget-wide v0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->mNativeTUIRoomEngineJni:J

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$VideoQuality;->getValue()I

    .line 13
    move-result p1

    .line 14
    .line 15
    .line 16
    invoke-static {v0, v1, p1}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->nativeUpdateVideoQuality(JI)V

    .line 17
    return-void
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method

.method public updateVideoQualityEx(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$VideoStreamType;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomVideoEncoderParams;)V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->checkPipeline()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    return-void

    .line 8
    .line 9
    :cond_0
    iget-wide v0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->mNativeTUIRoomEngineJni:J

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$VideoStreamType;->getValue()I

    .line 13
    move-result p1

    .line 14
    .line 15
    new-instance v2, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$VideoEncoderParams;

    .line 16
    .line 17
    .line 18
    invoke-direct {v2, p2}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$VideoEncoderParams;-><init>(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomVideoEncoderParams;)V

    .line 19
    .line 20
    .line 21
    invoke-static {v0, v1, p1, v2}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;->nativeUpdateVideoQualityEx(JILcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$VideoEncoderParams;)V

    .line 22
    return-void
    .line 23
    .line 24
    .line 25
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
.end method
