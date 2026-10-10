.class public final Landroidx/camera/view/RotationProvider;
.super Ljava/lang/Object;
.source "RotationProvider.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/camera/view/RotationProvider$ListenerWrapper;,
        Landroidx/camera/view/RotationProvider$Listener;
    }
.end annotation


# instance fields
.field mIgnoreCanDetectForTest:Z
    .annotation build Landroidx/annotation/VisibleForTesting;
    .end annotation
.end field

.field final mListeners:Ljava/util/Map;
    .annotation build Landroidx/annotation/GuardedBy;
        value = "mLock"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Landroidx/camera/view/RotationProvider$Listener;",
            "Landroidx/camera/view/RotationProvider$ListenerWrapper;",
            ">;"
        }
    .end annotation
.end field

.field final mLock:Ljava/lang/Object;

.field final mOrientationListener:Landroid/view/OrientationEventListener;
    .annotation build Landroidx/annotation/GuardedBy;
        value = "mLock"
    .end annotation

    .annotation build Landroidx/annotation/VisibleForTesting;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    new-instance v0, Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    iput-object v0, p0, Landroidx/camera/view/RotationProvider;->mLock:Ljava/lang/Object;

    .line 11
    .line 12
    new-instance v0, Ljava/util/HashMap;

    .line 13
    .line 14
    .line 15
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 16
    .line 17
    iput-object v0, p0, Landroidx/camera/view/RotationProvider;->mListeners:Ljava/util/Map;

    .line 18
    const/4 v0, 0x0

    .line 19
    .line 20
    iput-boolean v0, p0, Landroidx/camera/view/RotationProvider;->mIgnoreCanDetectForTest:Z

    .line 21
    .line 22
    new-instance v0, Landroidx/camera/view/RotationProvider$1;

    .line 23
    .line 24
    .line 25
    invoke-direct {v0, p0, p1}, Landroidx/camera/view/RotationProvider$1;-><init>(Landroidx/camera/view/RotationProvider;Landroid/content/Context;)V

    .line 26
    .line 27
    iput-object v0, p0, Landroidx/camera/view/RotationProvider;->mOrientationListener:Landroid/view/OrientationEventListener;

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
.end method

.method public static orientationToSurfaceRotation(I)I
    .locals 1
    .annotation build Landroidx/annotation/VisibleForTesting;
    .end annotation

    .line 1
    .line 2
    const/16 v0, 0x13b

    .line 3
    .line 4
    if-ge p0, v0, :cond_3

    .line 5
    .line 6
    const/16 v0, 0x2d

    .line 7
    .line 8
    if-ge p0, v0, :cond_0

    .line 9
    goto :goto_0

    .line 10
    .line 11
    :cond_0
    const/16 v0, 0xe1

    .line 12
    .line 13
    if-lt p0, v0, :cond_1

    .line 14
    const/4 p0, 0x1

    .line 15
    return p0

    .line 16
    .line 17
    :cond_1
    const/16 v0, 0x87

    .line 18
    .line 19
    if-lt p0, v0, :cond_2

    .line 20
    const/4 p0, 0x2

    .line 21
    return p0

    .line 22
    :cond_2
    const/4 p0, 0x3

    .line 23
    return p0

    .line 24
    :cond_3
    :goto_0
    const/4 p0, 0x0

    .line 25
    return p0
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
.end method


# virtual methods
.method public addListener(Ljava/util/concurrent/Executor;Landroidx/camera/view/RotationProvider$Listener;)Z
    .locals 3
    .annotation build Landroidx/annotation/CheckResult;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/camera/view/RotationProvider;->mLock:Ljava/lang/Object;

    .line 3
    monitor-enter v0

    .line 4
    .line 5
    :try_start_0
    iget-object v1, p0, Landroidx/camera/view/RotationProvider;->mOrientationListener:Landroid/view/OrientationEventListener;

    .line 6
    .line 7
    .line 8
    invoke-virtual {v1}, Landroid/view/OrientationEventListener;->canDetectOrientation()Z

    .line 9
    move-result v1

    .line 10
    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    iget-boolean v1, p0, Landroidx/camera/view/RotationProvider;->mIgnoreCanDetectForTest:Z

    .line 14
    .line 15
    if-nez v1, :cond_0

    .line 16
    const/4 p1, 0x0

    .line 17
    monitor-exit v0

    .line 18
    return p1

    .line 19
    :catchall_0
    move-exception p1

    .line 20
    goto :goto_0

    .line 21
    .line 22
    :cond_0
    iget-object v1, p0, Landroidx/camera/view/RotationProvider;->mListeners:Ljava/util/Map;

    .line 23
    .line 24
    new-instance v2, Landroidx/camera/view/RotationProvider$ListenerWrapper;

    .line 25
    .line 26
    .line 27
    invoke-direct {v2, p2, p1}, Landroidx/camera/view/RotationProvider$ListenerWrapper;-><init>(Landroidx/camera/view/RotationProvider$Listener;Ljava/util/concurrent/Executor;)V

    .line 28
    .line 29
    .line 30
    invoke-interface {v1, p2, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    iget-object p1, p0, Landroidx/camera/view/RotationProvider;->mOrientationListener:Landroid/view/OrientationEventListener;

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1}, Landroid/view/OrientationEventListener;->enable()V

    .line 36
    monitor-exit v0

    .line 37
    const/4 p1, 0x1

    .line 38
    return p1

    .line 39
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 40
    throw p1
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
.end method

.method public removeListener(Landroidx/camera/view/RotationProvider$Listener;)V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/camera/view/RotationProvider;->mLock:Ljava/lang/Object;

    .line 3
    monitor-enter v0

    .line 4
    .line 5
    :try_start_0
    iget-object v1, p0, Landroidx/camera/view/RotationProvider;->mListeners:Ljava/util/Map;

    .line 6
    .line 7
    .line 8
    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    move-result-object v1

    .line 10
    .line 11
    check-cast v1, Landroidx/camera/view/RotationProvider$ListenerWrapper;

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    .line 16
    invoke-virtual {v1}, Landroidx/camera/view/RotationProvider$ListenerWrapper;->disable()V

    .line 17
    .line 18
    iget-object v1, p0, Landroidx/camera/view/RotationProvider;->mListeners:Ljava/util/Map;

    .line 19
    .line 20
    .line 21
    invoke-interface {v1, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    goto :goto_0

    .line 23
    :catchall_0
    move-exception p1

    .line 24
    goto :goto_1

    .line 25
    .line 26
    :cond_0
    :goto_0
    iget-object p1, p0, Landroidx/camera/view/RotationProvider;->mListeners:Ljava/util/Map;

    .line 27
    .line 28
    .line 29
    invoke-interface {p1}, Ljava/util/Map;->isEmpty()Z

    .line 30
    move-result p1

    .line 31
    .line 32
    if-eqz p1, :cond_1

    .line 33
    .line 34
    iget-object p1, p0, Landroidx/camera/view/RotationProvider;->mOrientationListener:Landroid/view/OrientationEventListener;

    .line 35
    .line 36
    .line 37
    invoke-virtual {p1}, Landroid/view/OrientationEventListener;->disable()V

    .line 38
    :cond_1
    monitor-exit v0

    .line 39
    return-void

    .line 40
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 41
    throw p1
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
.end method
