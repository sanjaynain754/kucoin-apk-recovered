.class Lio/flutter/embedding/engine/dart/DartMessenger$SerialTaskQueue;
.super Ljava/lang/Object;
.source "DartMessenger.java"

# interfaces
.implements Lio/flutter/embedding/engine/dart/DartMessenger$DartMessengerTaskQueue;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/flutter/embedding/engine/dart/DartMessenger;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "SerialTaskQueue"
.end annotation


# instance fields
.field private final executor:Ljava/util/concurrent/ExecutorService;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field private final isRunning:Ljava/util/concurrent/atomic/AtomicBoolean;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field private final queue:Ljava/util/concurrent/ConcurrentLinkedQueue;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentLinkedQueue<",
            "Ljava/lang/Runnable;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/concurrent/ExecutorService;)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Lio/flutter/embedding/engine/dart/DartMessenger$SerialTaskQueue;->executor:Ljava/util/concurrent/ExecutorService;

    .line 6
    .line 7
    new-instance p1, Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 8
    .line 9
    .line 10
    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentLinkedQueue;-><init>()V

    .line 11
    .line 12
    iput-object p1, p0, Lio/flutter/embedding/engine/dart/DartMessenger$SerialTaskQueue;->queue:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 13
    .line 14
    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 15
    const/4 v0, 0x0

    .line 16
    .line 17
    .line 18
    invoke-direct {p1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 19
    .line 20
    iput-object p1, p0, Lio/flutter/embedding/engine/dart/DartMessenger$SerialTaskQueue;->isRunning:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 21
    return-void
    .line 22
    .line 23
    .line 24
.end method

.method public static synthetic a(Lio/flutter/embedding/engine/dart/DartMessenger$SerialTaskQueue;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lio/flutter/embedding/engine/dart/DartMessenger$SerialTaskQueue;->flush()V

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
.end method

.method public static synthetic b(Lio/flutter/embedding/engine/dart/DartMessenger$SerialTaskQueue;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lio/flutter/embedding/engine/dart/DartMessenger$SerialTaskQueue;->flush()V

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
.end method

.method private flush()V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lio/flutter/embedding/engine/dart/DartMessenger$SerialTaskQueue;->isRunning:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0, v2, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 8
    move-result v0

    .line 9
    .line 10
    if-eqz v0, :cond_2

    .line 11
    .line 12
    :try_start_0
    iget-object v0, p0, Lio/flutter/embedding/engine/dart/DartMessenger$SerialTaskQueue;->queue:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->poll()Ljava/lang/Object;

    .line 16
    move-result-object v0

    .line 17
    .line 18
    check-cast v0, Ljava/lang/Runnable;

    .line 19
    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    .line 23
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    goto :goto_0

    .line 25
    :catchall_0
    move-exception v0

    .line 26
    goto :goto_1

    .line 27
    .line 28
    :cond_0
    :goto_0
    iget-object v0, p0, Lio/flutter/embedding/engine/dart/DartMessenger$SerialTaskQueue;->isRunning:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 32
    .line 33
    iget-object v0, p0, Lio/flutter/embedding/engine/dart/DartMessenger$SerialTaskQueue;->queue:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->isEmpty()Z

    .line 37
    move-result v0

    .line 38
    .line 39
    if-nez v0, :cond_2

    .line 40
    .line 41
    iget-object v0, p0, Lio/flutter/embedding/engine/dart/DartMessenger$SerialTaskQueue;->executor:Ljava/util/concurrent/ExecutorService;

    .line 42
    .line 43
    new-instance v1, Lio/flutter/embedding/engine/dart/c;

    .line 44
    .line 45
    .line 46
    invoke-direct {v1, p0}, Lio/flutter/embedding/engine/dart/c;-><init>(Lio/flutter/embedding/engine/dart/DartMessenger$SerialTaskQueue;)V

    .line 47
    .line 48
    .line 49
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 50
    return-void

    .line 51
    .line 52
    :goto_1
    iget-object v1, p0, Lio/flutter/embedding/engine/dart/DartMessenger$SerialTaskQueue;->isRunning:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 56
    .line 57
    iget-object v1, p0, Lio/flutter/embedding/engine/dart/DartMessenger$SerialTaskQueue;->queue:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->isEmpty()Z

    .line 61
    move-result v1

    .line 62
    .line 63
    if-nez v1, :cond_1

    .line 64
    .line 65
    iget-object v1, p0, Lio/flutter/embedding/engine/dart/DartMessenger$SerialTaskQueue;->executor:Ljava/util/concurrent/ExecutorService;

    .line 66
    .line 67
    new-instance v2, Lio/flutter/embedding/engine/dart/c;

    .line 68
    .line 69
    .line 70
    invoke-direct {v2, p0}, Lio/flutter/embedding/engine/dart/c;-><init>(Lio/flutter/embedding/engine/dart/DartMessenger$SerialTaskQueue;)V

    .line 71
    .line 72
    .line 73
    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 74
    :cond_1
    throw v0

    .line 75
    :cond_2
    return-void
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
.end method


# virtual methods
.method public dispatch(Ljava/lang/Runnable;)V
    .locals 1
    .param p1    # Ljava/lang/Runnable;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    .line 2
    iget-object v0, p0, Lio/flutter/embedding/engine/dart/DartMessenger$SerialTaskQueue;->queue:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->add(Ljava/lang/Object;)Z

    .line 6
    .line 7
    iget-object p1, p0, Lio/flutter/embedding/engine/dart/DartMessenger$SerialTaskQueue;->executor:Ljava/util/concurrent/ExecutorService;

    .line 8
    .line 9
    new-instance v0, Lio/flutter/embedding/engine/dart/b;

    .line 10
    .line 11
    .line 12
    invoke-direct {v0, p0}, Lio/flutter/embedding/engine/dart/b;-><init>(Lio/flutter/embedding/engine/dart/DartMessenger$SerialTaskQueue;)V

    .line 13
    .line 14
    .line 15
    invoke-interface {p1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 16
    return-void
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method
