.class public Lcom/tencent/cloud/tuikit/engine/impl/pipelinebridge/TUIPipelineBridge;
.super Ljava/lang/Object;
.source "TUIPipelineBridge.java"


# annotations
.annotation runtime Lcom/tencent/liteav/base/annotations/JNINamespace;
    value = "tuikit::engine"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/cloud/tuikit/engine/impl/pipelinebridge/TUIPipelineBridge$APICallRespondCallback;
    }
.end annotation


# static fields
.field private static final TAG:Ljava/lang/String; = "TUIPipelineBridge"


# instance fields
.field private mNativePipelineBridge:J

.field private final mObserverList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/tencent/cloud/tuikit/engine/impl/pipelinebridge/TUIPipelineBridgeObserver;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/tencent/cloud/tuikit/engine/impl/pipelinebridge/TUIPipelineBridgeDefine$PipelineType;Z)V
    .locals 1

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
    iput-object v0, p0, Lcom/tencent/cloud/tuikit/engine/impl/pipelinebridge/TUIPipelineBridge;->mObserverList:Ljava/util/List;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1}, Lcom/tencent/cloud/tuikit/engine/impl/pipelinebridge/TUIPipelineBridgeDefine$PipelineType;->getValue()I

    .line 14
    move-result p1

    .line 15
    .line 16
    .line 17
    invoke-static {p0, p1, p2}, Lcom/tencent/cloud/tuikit/engine/impl/pipelinebridge/TUIPipelineBridge;->nativeCreatePipelineBridge(Lcom/tencent/cloud/tuikit/engine/impl/pipelinebridge/TUIPipelineBridge;IZ)J

    .line 18
    move-result-wide p1

    .line 19
    .line 20
    iput-wide p1, p0, Lcom/tencent/cloud/tuikit/engine/impl/pipelinebridge/TUIPipelineBridge;->mNativePipelineBridge:J

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

.method private checkPipelineBridge()Z
    .locals 4

    .line 1
    iget-wide v0, p0, Lcom/tencent/cloud/tuikit/engine/impl/pipelinebridge/TUIPipelineBridge;->mNativePipelineBridge:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    const/4 v0, 0x1

    return v0
.end method

.method private checkPipelineBridge(Lcom/tencent/cloud/tuikit/engine/impl/pipelinebridge/TUIPipelineBridgeDefine$APICallRespondCallback;)Z
    .locals 4

    .line 2
    iget-wide v0, p0, Lcom/tencent/cloud/tuikit/engine/impl/pipelinebridge/TUIPipelineBridge;->mNativePipelineBridge:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_1

    if-eqz p1, :cond_0

    .line 3
    sget-object v0, Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;->FAILED:Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;

    const-string v1, "bridge is destroyed"

    const-string v2, ""

    invoke-interface {p1, v0, v1, v2}, Lcom/tencent/cloud/tuikit/engine/impl/pipelinebridge/TUIPipelineBridgeDefine$APICallRespondCallback;->onCallback(Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    const/4 p1, 0x1

    return p1
.end method

.method private copyOnReadObservers()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/tencent/cloud/tuikit/engine/impl/pipelinebridge/TUIPipelineBridgeObserver;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/tencent/cloud/tuikit/engine/impl/pipelinebridge/TUIPipelineBridge;->mObserverList:Ljava/util/List;

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

.method private static native nativeCallAPI(JLjava/lang/String;Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/impl/pipelinebridge/TUIPipelineBridge$APICallRespondCallback;)Ljava/lang/String;
.end method

.method private static native nativeCreatePipelineBridge(Lcom/tencent/cloud/tuikit/engine/impl/pipelinebridge/TUIPipelineBridge;IZ)J
.end method

.method private static native nativeDestroyPipelineBridge(J)V
.end method

.method private static native nativeIsSyncAPI(JLjava/lang/String;Ljava/lang/String;)Z
.end method


# virtual methods
.method public addObserver(Lcom/tencent/cloud/tuikit/engine/impl/pipelinebridge/TUIPipelineBridgeObserver;)V
    .locals 1

    .line 1
    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    iget-object v0, p0, Lcom/tencent/cloud/tuikit/engine/impl/pipelinebridge/TUIPipelineBridge;->mObserverList:Ljava/util/List;

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
    iget-object v0, p0, Lcom/tencent/cloud/tuikit/engine/impl/pipelinebridge/TUIPipelineBridge;->mObserverList:Ljava/util/List;

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

.method public callAPI(Ljava/lang/String;Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/impl/pipelinebridge/TUIPipelineBridgeDefine$APICallRespondCallback;)Ljava/lang/String;
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p3}, Lcom/tencent/cloud/tuikit/engine/impl/pipelinebridge/TUIPipelineBridge;->checkPipelineBridge(Lcom/tencent/cloud/tuikit/engine/impl/pipelinebridge/TUIPipelineBridgeDefine$APICallRespondCallback;)Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    const-string p1, ""

    .line 9
    return-object p1

    .line 10
    .line 11
    :cond_0
    iget-wide v0, p0, Lcom/tencent/cloud/tuikit/engine/impl/pipelinebridge/TUIPipelineBridge;->mNativePipelineBridge:J

    .line 12
    .line 13
    new-instance v2, Lcom/tencent/cloud/tuikit/engine/impl/pipelinebridge/TUIPipelineBridge$APICallRespondCallback;

    .line 14
    .line 15
    .line 16
    invoke-direct {v2, p3}, Lcom/tencent/cloud/tuikit/engine/impl/pipelinebridge/TUIPipelineBridge$APICallRespondCallback;-><init>(Lcom/tencent/cloud/tuikit/engine/impl/pipelinebridge/TUIPipelineBridgeDefine$APICallRespondCallback;)V

    .line 17
    .line 18
    .line 19
    invoke-static {v0, v1, p1, p2, v2}, Lcom/tencent/cloud/tuikit/engine/impl/pipelinebridge/TUIPipelineBridge;->nativeCallAPI(JLjava/lang/String;Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/impl/pipelinebridge/TUIPipelineBridge$APICallRespondCallback;)Ljava/lang/String;

    .line 20
    move-result-object p1

    .line 21
    return-object p1
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

.method public destroy()V
    .locals 5

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/tencent/cloud/tuikit/engine/impl/pipelinebridge/TUIPipelineBridge;->mNativePipelineBridge:J

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
    invoke-static {v0, v1}, Lcom/tencent/cloud/tuikit/engine/impl/pipelinebridge/TUIPipelineBridge;->nativeDestroyPipelineBridge(J)V

    .line 12
    .line 13
    iput-wide v2, p0, Lcom/tencent/cloud/tuikit/engine/impl/pipelinebridge/TUIPipelineBridge;->mNativePipelineBridge:J

    .line 14
    :cond_0
    return-void
    .line 15
    .line 16
    .line 17
.end method

.method public getNativePipelineBridge()J
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/tencent/cloud/tuikit/engine/impl/pipelinebridge/TUIPipelineBridge;->mNativePipelineBridge:J

    .line 3
    return-wide v0
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

.method public isSyncAPI(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/tencent/cloud/tuikit/engine/impl/pipelinebridge/TUIPipelineBridge;->checkPipelineBridge()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    const/4 p1, 0x0

    .line 8
    return p1

    .line 9
    .line 10
    :cond_0
    iget-wide v0, p0, Lcom/tencent/cloud/tuikit/engine/impl/pipelinebridge/TUIPipelineBridge;->mNativePipelineBridge:J

    .line 11
    .line 12
    .line 13
    invoke-static {v0, v1, p1, p2}, Lcom/tencent/cloud/tuikit/engine/impl/pipelinebridge/TUIPipelineBridge;->nativeIsSyncAPI(JLjava/lang/String;Ljava/lang/String;)Z

    .line 14
    move-result p1

    .line 15
    return p1
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

.method public onReceiveEventFromPipeline(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2
    .annotation build Lcom/tencent/liteav/base/annotations/CalledByNative;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/tencent/cloud/tuikit/engine/impl/pipelinebridge/TUIPipelineBridge;->copyOnReadObservers()Ljava/util/List;

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
    check-cast v1, Lcom/tencent/cloud/tuikit/engine/impl/pipelinebridge/TUIPipelineBridgeObserver;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1, p1, p2}, Lcom/tencent/cloud/tuikit/engine/impl/pipelinebridge/TUIPipelineBridgeObserver;->onReceiveEventFromPipeline(Ljava/lang/String;Ljava/lang/String;)V

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

.method public removeObserver(Lcom/tencent/cloud/tuikit/engine/impl/pipelinebridge/TUIPipelineBridgeObserver;)V
    .locals 1

    .line 1
    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    iget-object v0, p0, Lcom/tencent/cloud/tuikit/engine/impl/pipelinebridge/TUIPipelineBridge;->mObserverList:Ljava/util/List;

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
    iget-object v0, p0, Lcom/tencent/cloud/tuikit/engine/impl/pipelinebridge/TUIPipelineBridge;->mObserverList:Ljava/util/List;

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
