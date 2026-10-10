.class public final Lio/flutter/FlutterInjector$Builder;
.super Ljava/lang/Object;
.source "FlutterInjector.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/flutter/FlutterInjector;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/flutter/FlutterInjector$Builder$NamedThreadFactory;
    }
.end annotation


# instance fields
.field private deferredComponentManager:Lio/flutter/embedding/engine/deferredcomponents/DeferredComponentManager;

.field private executorService:Ljava/util/concurrent/ExecutorService;

.field private flutterJniFactory:Lio/flutter/embedding/engine/FlutterJNI$Factory;

.field private flutterLoader:Lio/flutter/embedding/engine/loader/FlutterLoader;


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
    .line 18
    .line 19
    .line 20
.end method

.method private fillDefaults()V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lio/flutter/FlutterInjector$Builder;->flutterJniFactory:Lio/flutter/embedding/engine/FlutterJNI$Factory;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    new-instance v0, Lio/flutter/embedding/engine/FlutterJNI$Factory;

    .line 7
    .line 8
    .line 9
    invoke-direct {v0}, Lio/flutter/embedding/engine/FlutterJNI$Factory;-><init>()V

    .line 10
    .line 11
    iput-object v0, p0, Lio/flutter/FlutterInjector$Builder;->flutterJniFactory:Lio/flutter/embedding/engine/FlutterJNI$Factory;

    .line 12
    .line 13
    :cond_0
    iget-object v0, p0, Lio/flutter/FlutterInjector$Builder;->executorService:Ljava/util/concurrent/ExecutorService;

    .line 14
    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    new-instance v0, Lio/flutter/FlutterInjector$Builder$NamedThreadFactory;

    .line 18
    const/4 v1, 0x0

    .line 19
    .line 20
    .line 21
    invoke-direct {v0, p0, v1}, Lio/flutter/FlutterInjector$Builder$NamedThreadFactory;-><init>(Lio/flutter/FlutterInjector$Builder;Lio/flutter/FlutterInjector$1;)V

    .line 22
    .line 23
    .line 24
    invoke-static {v0}, Ljava/util/concurrent/Executors;->newCachedThreadPool(Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;

    .line 25
    move-result-object v0

    .line 26
    .line 27
    iput-object v0, p0, Lio/flutter/FlutterInjector$Builder;->executorService:Ljava/util/concurrent/ExecutorService;

    .line 28
    .line 29
    :cond_1
    iget-object v0, p0, Lio/flutter/FlutterInjector$Builder;->flutterLoader:Lio/flutter/embedding/engine/loader/FlutterLoader;

    .line 30
    .line 31
    if-nez v0, :cond_2

    .line 32
    .line 33
    new-instance v0, Lio/flutter/embedding/engine/loader/FlutterLoader;

    .line 34
    .line 35
    iget-object v1, p0, Lio/flutter/FlutterInjector$Builder;->flutterJniFactory:Lio/flutter/embedding/engine/FlutterJNI$Factory;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1}, Lio/flutter/embedding/engine/FlutterJNI$Factory;->provideFlutterJNI()Lio/flutter/embedding/engine/FlutterJNI;

    .line 39
    move-result-object v1

    .line 40
    .line 41
    iget-object v2, p0, Lio/flutter/FlutterInjector$Builder;->executorService:Ljava/util/concurrent/ExecutorService;

    .line 42
    .line 43
    .line 44
    invoke-direct {v0, v1, v2}, Lio/flutter/embedding/engine/loader/FlutterLoader;-><init>(Lio/flutter/embedding/engine/FlutterJNI;Ljava/util/concurrent/ExecutorService;)V

    .line 45
    .line 46
    iput-object v0, p0, Lio/flutter/FlutterInjector$Builder;->flutterLoader:Lio/flutter/embedding/engine/loader/FlutterLoader;

    .line 47
    :cond_2
    return-void
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
.method public build()Lio/flutter/FlutterInjector;
    .locals 6

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lio/flutter/FlutterInjector$Builder;->fillDefaults()V

    .line 4
    .line 5
    new-instance v0, Lio/flutter/FlutterInjector;

    .line 6
    .line 7
    iget-object v1, p0, Lio/flutter/FlutterInjector$Builder;->flutterLoader:Lio/flutter/embedding/engine/loader/FlutterLoader;

    .line 8
    .line 9
    iget-object v2, p0, Lio/flutter/FlutterInjector$Builder;->deferredComponentManager:Lio/flutter/embedding/engine/deferredcomponents/DeferredComponentManager;

    .line 10
    .line 11
    iget-object v3, p0, Lio/flutter/FlutterInjector$Builder;->flutterJniFactory:Lio/flutter/embedding/engine/FlutterJNI$Factory;

    .line 12
    .line 13
    iget-object v4, p0, Lio/flutter/FlutterInjector$Builder;->executorService:Ljava/util/concurrent/ExecutorService;

    .line 14
    const/4 v5, 0x0

    .line 15
    .line 16
    .line 17
    invoke-direct/range {v0 .. v5}, Lio/flutter/FlutterInjector;-><init>(Lio/flutter/embedding/engine/loader/FlutterLoader;Lio/flutter/embedding/engine/deferredcomponents/DeferredComponentManager;Lio/flutter/embedding/engine/FlutterJNI$Factory;Ljava/util/concurrent/ExecutorService;Lio/flutter/FlutterInjector$1;)V

    .line 18
    return-object v0
    .line 19
    .line 20
.end method

.method public setDeferredComponentManager(Lio/flutter/embedding/engine/deferredcomponents/DeferredComponentManager;)Lio/flutter/FlutterInjector$Builder;
    .locals 0
    .param p1    # Lio/flutter/embedding/engine/deferredcomponents/DeferredComponentManager;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lio/flutter/FlutterInjector$Builder;->deferredComponentManager:Lio/flutter/embedding/engine/deferredcomponents/DeferredComponentManager;

    .line 3
    return-object p0
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
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public setExecutorService(Ljava/util/concurrent/ExecutorService;)Lio/flutter/FlutterInjector$Builder;
    .locals 0
    .param p1    # Ljava/util/concurrent/ExecutorService;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lio/flutter/FlutterInjector$Builder;->executorService:Ljava/util/concurrent/ExecutorService;

    .line 3
    return-object p0
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
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public setFlutterJNIFactory(Lio/flutter/embedding/engine/FlutterJNI$Factory;)Lio/flutter/FlutterInjector$Builder;
    .locals 0
    .param p1    # Lio/flutter/embedding/engine/FlutterJNI$Factory;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lio/flutter/FlutterInjector$Builder;->flutterJniFactory:Lio/flutter/embedding/engine/FlutterJNI$Factory;

    .line 3
    return-object p0
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
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public setFlutterLoader(Lio/flutter/embedding/engine/loader/FlutterLoader;)Lio/flutter/FlutterInjector$Builder;
    .locals 0
    .param p1    # Lio/flutter/embedding/engine/loader/FlutterLoader;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lio/flutter/FlutterInjector$Builder;->flutterLoader:Lio/flutter/embedding/engine/loader/FlutterLoader;

    .line 3
    return-object p0
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
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method
