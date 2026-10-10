.class public Landroidx/camera/core/impl/utils/executor/AudioExecutor;
.super Ljava/lang/Object;
.source "AudioExecutor.java"

# interfaces
.implements Ljava/util/concurrent/Executor;


# static fields
.field private static volatile sExecutor:Ljava/util/concurrent/Executor;


# instance fields
.field private final mAudioService:Ljava/util/concurrent/ExecutorService;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    new-instance v0, Landroidx/camera/core/impl/utils/executor/AudioExecutor$1;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, p0}, Landroidx/camera/core/impl/utils/executor/AudioExecutor$1;-><init>(Landroidx/camera/core/impl/utils/executor/AudioExecutor;)V

    .line 9
    const/4 v1, 0x2

    .line 10
    .line 11
    .line 12
    invoke-static {v1, v0}, Ljava/util/concurrent/Executors;->newFixedThreadPool(ILjava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;

    .line 13
    move-result-object v0

    .line 14
    .line 15
    iput-object v0, p0, Landroidx/camera/core/impl/utils/executor/AudioExecutor;->mAudioService:Ljava/util/concurrent/ExecutorService;

    .line 16
    return-void
    .line 17
    .line 18
    .line 19
    .line 20
.end method

.method public static getInstance()Ljava/util/concurrent/Executor;
    .locals 2

    .line 1
    .line 2
    sget-object v0, Landroidx/camera/core/impl/utils/executor/AudioExecutor;->sExecutor:Ljava/util/concurrent/Executor;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    sget-object v0, Landroidx/camera/core/impl/utils/executor/AudioExecutor;->sExecutor:Ljava/util/concurrent/Executor;

    .line 7
    return-object v0

    .line 8
    .line 9
    :cond_0
    const-class v0, Landroidx/camera/core/impl/utils/executor/AudioExecutor;

    .line 10
    monitor-enter v0

    .line 11
    .line 12
    :try_start_0
    sget-object v1, Landroidx/camera/core/impl/utils/executor/AudioExecutor;->sExecutor:Ljava/util/concurrent/Executor;

    .line 13
    .line 14
    if-nez v1, :cond_1

    .line 15
    .line 16
    new-instance v1, Landroidx/camera/core/impl/utils/executor/AudioExecutor;

    .line 17
    .line 18
    .line 19
    invoke-direct {v1}, Landroidx/camera/core/impl/utils/executor/AudioExecutor;-><init>()V

    .line 20
    .line 21
    sput-object v1, Landroidx/camera/core/impl/utils/executor/AudioExecutor;->sExecutor:Ljava/util/concurrent/Executor;

    .line 22
    goto :goto_0

    .line 23
    :catchall_0
    move-exception v1

    .line 24
    goto :goto_1

    .line 25
    :cond_1
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    .line 27
    sget-object v0, Landroidx/camera/core/impl/utils/executor/AudioExecutor;->sExecutor:Ljava/util/concurrent/Executor;

    .line 28
    return-object v0

    .line 29
    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 30
    throw v1
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
.end method


# virtual methods
.method public execute(Ljava/lang/Runnable;)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/camera/core/impl/utils/executor/AudioExecutor;->mAudioService:Ljava/util/concurrent/ExecutorService;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0, p1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

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
.end method
