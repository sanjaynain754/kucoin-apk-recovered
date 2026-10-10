.class public Lcom/tencent/cloud/tuikit/engine/impl/call/TUICallEngineJni;
.super Ljava/lang/Object;
.source "TUICallEngineJni.java"


# annotations
.annotation runtime Lcom/tencent/liteav/base/annotations/JNINamespace;
    value = "tuikit::engine"
.end annotation


# instance fields
.field private mNativeTUICallEngineJni:J

.field private final mPipelineBridge:Lcom/tencent/cloud/tuikit/engine/impl/pipelinebridge/TUIPipelineBridge;


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

.method public constructor <init>()V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    new-instance v0, Lcom/tencent/cloud/tuikit/engine/impl/pipelinebridge/TUIPipelineBridge;

    .line 6
    .line 7
    sget-object v1, Lcom/tencent/cloud/tuikit/engine/impl/pipelinebridge/TUIPipelineBridgeDefine$PipelineType;->Call:Lcom/tencent/cloud/tuikit/engine/impl/pipelinebridge/TUIPipelineBridgeDefine$PipelineType;

    .line 8
    const/4 v2, 0x1

    .line 9
    .line 10
    .line 11
    invoke-direct {v0, v1, v2}, Lcom/tencent/cloud/tuikit/engine/impl/pipelinebridge/TUIPipelineBridge;-><init>(Lcom/tencent/cloud/tuikit/engine/impl/pipelinebridge/TUIPipelineBridgeDefine$PipelineType;Z)V

    .line 12
    .line 13
    iput-object v0, p0, Lcom/tencent/cloud/tuikit/engine/impl/call/TUICallEngineJni;->mPipelineBridge:Lcom/tencent/cloud/tuikit/engine/impl/pipelinebridge/TUIPipelineBridge;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Lcom/tencent/cloud/tuikit/engine/impl/pipelinebridge/TUIPipelineBridge;->getNativePipelineBridge()J

    .line 17
    move-result-wide v0

    .line 18
    .line 19
    .line 20
    invoke-static {p0, v0, v1}, Lcom/tencent/cloud/tuikit/engine/impl/call/TUICallEngineJni;->nativeCreatePipeline(Lcom/tencent/cloud/tuikit/engine/impl/call/TUICallEngineJni;J)J

    .line 21
    move-result-wide v0

    .line 22
    .line 23
    iput-wide v0, p0, Lcom/tencent/cloud/tuikit/engine/impl/call/TUICallEngineJni;->mNativeTUICallEngineJni:J

    .line 24
    return-void
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

.method public static getJObjectAddress(Ljava/lang/Object;)J
    .locals 2

    .line 1
    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    const-wide/16 v0, 0x0

    .line 5
    return-wide v0

    .line 6
    .line 7
    .line 8
    :cond_0
    invoke-static {p0}, Lcom/tencent/cloud/tuikit/engine/impl/call/TUICallEngineJni;->nativeGetJObjectAddress(Ljava/lang/Object;)J

    .line 9
    move-result-wide v0

    .line 10
    return-wide v0
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

.method private static native nativeCreatePipeline(Lcom/tencent/cloud/tuikit/engine/impl/call/TUICallEngineJni;J)J
.end method

.method private static native nativeDestroyPipeline(J)V
.end method

.method private static native nativeGetJObjectAddress(Ljava/lang/Object;)J
.end method

.method private static native nativeGetTRTCCloudInstance(J)Lcom/tencent/trtc/TRTCCloud;
.end method


# virtual methods
.method public destroy()V
    .locals 5

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/tencent/cloud/tuikit/engine/impl/call/TUICallEngineJni;->mNativeTUICallEngineJni:J

    .line 3
    .line 4
    const-wide/16 v2, 0x0

    .line 5
    .line 6
    cmp-long v4, v0, v2

    .line 7
    .line 8
    if-eqz v4, :cond_0

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1}, Lcom/tencent/cloud/tuikit/engine/impl/call/TUICallEngineJni;->nativeDestroyPipeline(J)V

    .line 12
    .line 13
    iput-wide v2, p0, Lcom/tencent/cloud/tuikit/engine/impl/call/TUICallEngineJni;->mNativeTUICallEngineJni:J

    .line 14
    .line 15
    :cond_0
    iget-object v0, p0, Lcom/tencent/cloud/tuikit/engine/impl/call/TUICallEngineJni;->mPipelineBridge:Lcom/tencent/cloud/tuikit/engine/impl/pipelinebridge/TUIPipelineBridge;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Lcom/tencent/cloud/tuikit/engine/impl/pipelinebridge/TUIPipelineBridge;->destroy()V

    .line 19
    return-void
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
.end method

.method public getPipelineBridge()Lcom/tencent/cloud/tuikit/engine/impl/pipelinebridge/TUIPipelineBridge;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/cloud/tuikit/engine/impl/call/TUICallEngineJni;->mPipelineBridge:Lcom/tencent/cloud/tuikit/engine/impl/pipelinebridge/TUIPipelineBridge;

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

.method public declared-synchronized getTRTCCloudInstance()Lcom/tencent/trtc/TRTCCloud;
    .locals 4

    .line 1
    monitor-enter p0

    .line 2
    .line 3
    :try_start_0
    iget-wide v0, p0, Lcom/tencent/cloud/tuikit/engine/impl/call/TUICallEngineJni;->mNativeTUICallEngineJni:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 4
    .line 5
    const-wide/16 v2, 0x0

    .line 6
    .line 7
    cmp-long v2, v0, v2

    .line 8
    .line 9
    if-nez v2, :cond_0

    .line 10
    monitor-exit p0

    .line 11
    const/4 v0, 0x0

    .line 12
    return-object v0

    .line 13
    .line 14
    .line 15
    :cond_0
    :try_start_1
    invoke-static {v0, v1}, Lcom/tencent/cloud/tuikit/engine/impl/call/TUICallEngineJni;->nativeGetTRTCCloudInstance(J)Lcom/tencent/trtc/TRTCCloud;

    .line 16
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 17
    monitor-exit p0

    .line 18
    return-object v0

    .line 19
    :catchall_0
    move-exception v0

    .line 20
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 21
    throw v0
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
