.class public final Lcom/tencent/rtmp/video/a/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/rtmp/video/a/f$a;
    }
.end annotation


# instance fields
.field public a:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/app/Activity;",
            ">;"
        }
    .end annotation
.end field

.field final b:Landroid/os/Handler;

.field public final c:Lcom/tencent/rtmp/video/a/a;

.field final d:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Landroid/view/Surface;",
            "Lcom/tencent/rtmp/video/a/f$a;",
            ">;"
        }
    .end annotation
.end field

.field e:Landroid/media/projection/MediaProjection;

.field f:Z

.field final g:Ljava/lang/Runnable;

.field final h:Ljava/lang/Runnable;

.field final i:Landroid/media/projection/MediaProjection$Callback;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    const/4 v0, 0x0

    .line 5
    .line 6
    iput-object v0, p0, Lcom/tencent/rtmp/video/a/f;->a:Ljava/lang/ref/WeakReference;

    .line 7
    .line 8
    new-instance v0, Ljava/util/HashMap;

    .line 9
    .line 10
    .line 11
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 12
    .line 13
    iput-object v0, p0, Lcom/tencent/rtmp/video/a/f;->d:Ljava/util/Map;

    .line 14
    const/4 v0, 0x0

    .line 15
    .line 16
    iput-boolean v0, p0, Lcom/tencent/rtmp/video/a/f;->f:Z

    .line 17
    .line 18
    .line 19
    invoke-static {p0}, Lcom/tencent/rtmp/video/a/g;->a(Lcom/tencent/rtmp/video/a/f;)Ljava/lang/Runnable;

    .line 20
    move-result-object v0

    .line 21
    .line 22
    iput-object v0, p0, Lcom/tencent/rtmp/video/a/f;->g:Ljava/lang/Runnable;

    .line 23
    .line 24
    .line 25
    invoke-static {p0}, Lcom/tencent/rtmp/video/a/h;->a(Lcom/tencent/rtmp/video/a/f;)Ljava/lang/Runnable;

    .line 26
    move-result-object v0

    .line 27
    .line 28
    iput-object v0, p0, Lcom/tencent/rtmp/video/a/f;->h:Ljava/lang/Runnable;

    .line 29
    .line 30
    new-instance v0, Lcom/tencent/rtmp/video/a/f$1;

    .line 31
    .line 32
    .line 33
    invoke-direct {v0, p0}, Lcom/tencent/rtmp/video/a/f$1;-><init>(Lcom/tencent/rtmp/video/a/f;)V

    .line 34
    .line 35
    iput-object v0, p0, Lcom/tencent/rtmp/video/a/f;->i:Landroid/media/projection/MediaProjection$Callback;

    .line 36
    .line 37
    new-instance v0, Landroid/os/Handler;

    .line 38
    .line 39
    .line 40
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 41
    move-result-object v1

    .line 42
    .line 43
    .line 44
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 45
    .line 46
    iput-object v0, p0, Lcom/tencent/rtmp/video/a/f;->b:Landroid/os/Handler;

    .line 47
    .line 48
    new-instance v0, Lcom/tencent/rtmp/video/a/a;

    .line 49
    .line 50
    .line 51
    invoke-direct {v0}, Lcom/tencent/rtmp/video/a/a;-><init>()V

    .line 52
    .line 53
    iput-object v0, p0, Lcom/tencent/rtmp/video/a/f;->c:Lcom/tencent/rtmp/video/a/a;

    .line 54
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
.end method

.method public static a()V
    .locals 3

    .line 1
    invoke-static {}, Lcom/tencent/rtmp/video/BaseBridge;->getAppContext()Landroid/content/Context;

    move-result-object v0

    if-nez v0, :cond_0

    .line 2
    const-string v0, "VirtualDisplayManager"

    const-string v1, "context is null!"

    invoke-static {v0, v1}, Lcom/tencent/rtmp/video/BaseBridge;->printLog(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 3
    :cond_0
    new-instance v1, Landroid/content/Intent;

    const-class v2, Lcom/tencent/rtmp/video/TXScreenCapture$TXScreenCaptureAssistantActivity;

    invoke-direct {v1, v0, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const/high16 v2, 0x10000000

    .line 4
    invoke-virtual {v1, v2}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 5
    invoke-virtual {v0, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method public static b(Landroid/media/projection/MediaProjection;)V
    .locals 3

    .line 12
    :try_start_0
    const-class v0, Lcom/tencent/liteav/audio2/SystemLoopbackRecorder2;

    sget v1, Lcom/tencent/liteav/audio2/SystemLoopbackRecorder2;->a:I
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_1

    .line 13
    :try_start_1
    const-string v1, "notifyMediaProjectionState"

    const-class v2, Landroid/media/projection/MediaProjection;

    filled-new-array {v2}, [Ljava/lang/Class;

    move-result-object v2

    .line 14
    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    .line 15
    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catch Ljava/lang/ClassNotFoundException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_1 .. :try_end_1} :catch_0

    return-void

    :catch_0
    move-exception p0

    goto :goto_0

    :catch_1
    move-exception p0

    goto :goto_0

    :catch_2
    move-exception p0

    goto :goto_0

    :catch_3
    move-exception p0

    .line 16
    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "fail to send media projection session "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string v0, "VirtualDisplayManager"

    invoke-static {v0, p0}, Lcom/tencent/rtmp/video/BaseBridge;->printLog(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static d()V
    .locals 3

    .line 1
    .line 2
    const-string v0, "stopScreenCaptureService"

    .line 3
    .line 4
    const-string v1, "VirtualDisplayManager"

    .line 5
    .line 6
    .line 7
    invoke-static {v1, v0}, Lcom/tencent/rtmp/video/BaseBridge;->printLog(Ljava/lang/String;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    :try_start_0
    invoke-static {}, Lcom/tencent/rtmp/video/BaseBridge;->getAppContext()Landroid/content/Context;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    const-string v0, "context is null!"

    .line 16
    .line 17
    .line 18
    invoke-static {v1, v0}, Lcom/tencent/rtmp/video/BaseBridge;->printLog(Ljava/lang/String;Ljava/lang/String;)V

    .line 19
    return-void

    .line 20
    .line 21
    :cond_0
    new-instance v1, Landroid/content/Intent;

    .line 22
    .line 23
    const-class v2, Lcom/tencent/rtmp/video/ScreenCaptureService;

    .line 24
    .line 25
    .line 26
    invoke-direct {v1, v0, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, v1}, Landroid/content/Context;->stopService(Landroid/content/Intent;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 30
    :catchall_0
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
.end method


# virtual methods
.method public final declared-synchronized a(Landroid/app/Activity;)V
    .locals 3

    monitor-enter p0

    .line 7
    :try_start_0
    const-string v0, "VirtualDisplayManager"

    const-string v1, "Register request permission activity:"

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/tencent/rtmp/video/BaseBridge;->printLog(Ljava/lang/String;Ljava/lang/String;)V

    .line 8
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/tencent/rtmp/video/a/f;->a:Ljava/lang/ref/WeakReference;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final a(Landroid/media/projection/MediaProjection;)V
    .locals 1

    .line 6
    iget-object v0, p0, Lcom/tencent/rtmp/video/a/f;->c:Lcom/tencent/rtmp/video/a/a;

    invoke-static {p0, p1}, Lcom/tencent/rtmp/video/a/l;->a(Lcom/tencent/rtmp/video/a/f;Landroid/media/projection/MediaProjection;)Ljava/lang/Runnable;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/tencent/rtmp/video/a/a;->a(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final b()V
    .locals 14

    .line 1
    const-string v1, "VirtualDisplayManager"

    iget-object v0, p0, Lcom/tencent/rtmp/video/a/f;->d:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/tencent/rtmp/video/a/f$a;

    .line 2
    iget-object v0, v3, Lcom/tencent/rtmp/video/a/f$a;->e:Lcom/tencent/rtmp/video/VirtualDisplayWrapper;

    if-nez v0, :cond_0

    const/4 v4, 0x0

    .line 3
    :try_start_0
    iget-object v5, p0, Lcom/tencent/rtmp/video/a/f;->e:Landroid/media/projection/MediaProjection;

    const-string v6, "TXCScreenCapture"

    iget v7, v3, Lcom/tencent/rtmp/video/a/f$a;->b:I

    iget v8, v3, Lcom/tencent/rtmp/video/a/f$a;->c:I

    iget-object v11, v3, Lcom/tencent/rtmp/video/a/f$a;->a:Landroid/view/Surface;

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v9, 0x1

    const/4 v10, 0x1

    invoke-virtual/range {v5 .. v13}, Landroid/media/projection/MediaProjection;->createVirtualDisplay(Ljava/lang/String;IIIILandroid/view/Surface;Landroid/hardware/display/VirtualDisplay$Callback;Landroid/os/Handler;)Landroid/hardware/display/VirtualDisplay;

    move-result-object v0

    .line 4
    new-instance v5, Lcom/tencent/rtmp/video/VirtualDisplayWrapper;

    invoke-direct {v5, v0}, Lcom/tencent/rtmp/video/VirtualDisplayWrapper;-><init>(Landroid/hardware/display/VirtualDisplay;)V

    iput-object v5, v3, Lcom/tencent/rtmp/video/a/f$a;->e:Lcom/tencent/rtmp/video/VirtualDisplayWrapper;

    .line 5
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v5, "create VirtualDisplay "

    invoke-direct {v0, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v5, v3, Lcom/tencent/rtmp/video/a/f$a;->e:Lcom/tencent/rtmp/video/VirtualDisplayWrapper;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/tencent/rtmp/video/BaseBridge;->printLog(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    iget-object v0, v3, Lcom/tencent/rtmp/video/a/f$a;->d:Lcom/tencent/rtmp/video/VirtualDisplayListener;

    if-eqz v0, :cond_0

    .line 7
    iget-object v5, v3, Lcom/tencent/rtmp/video/a/f$a;->e:Lcom/tencent/rtmp/video/VirtualDisplayWrapper;

    invoke-interface {v0, v5}, Lcom/tencent/rtmp/video/VirtualDisplayListener;->onVirtualDisplayCreate(Lcom/tencent/rtmp/video/VirtualDisplayWrapper;)V

    .line 8
    iget-object v0, v3, Lcom/tencent/rtmp/video/a/f$a;->d:Lcom/tencent/rtmp/video/VirtualDisplayListener;

    const/4 v5, 0x1

    invoke-interface {v0, v5, v4}, Lcom/tencent/rtmp/video/VirtualDisplayListener;->onStartFinish(ZZ)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    .line 9
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v5, "create VirtualDisplay error "

    invoke-virtual {v5, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/tencent/rtmp/video/BaseBridge;->printLog(Ljava/lang/String;Ljava/lang/String;)V

    .line 10
    iget-object v0, v3, Lcom/tencent/rtmp/video/a/f$a;->d:Lcom/tencent/rtmp/video/VirtualDisplayListener;

    if-eqz v0, :cond_0

    .line 11
    invoke-interface {v0, v4, v4}, Lcom/tencent/rtmp/video/VirtualDisplayListener;->onStartFinish(ZZ)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final c()V
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/rtmp/video/a/f;->d:Ljava/util/Map;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    .line 6
    move-result v0

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    return-void

    .line 10
    .line 11
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    const-string v1, "Stop media projection session "

    .line 14
    .line 15
    .line 16
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    iget-object v1, p0, Lcom/tencent/rtmp/video/a/f;->e:Landroid/media/projection/MediaProjection;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 25
    move-result-object v0

    .line 26
    .line 27
    const-string v1, "VirtualDisplayManager"

    .line 28
    .line 29
    .line 30
    invoke-static {v1, v0}, Lcom/tencent/rtmp/video/BaseBridge;->printLog(Ljava/lang/String;Ljava/lang/String;)V

    .line 31
    .line 32
    iget-object v0, p0, Lcom/tencent/rtmp/video/a/f;->e:Landroid/media/projection/MediaProjection;

    .line 33
    .line 34
    if-eqz v0, :cond_1

    .line 35
    const/4 v0, 0x0

    .line 36
    .line 37
    .line 38
    invoke-static {v0}, Lcom/tencent/rtmp/video/a/f;->b(Landroid/media/projection/MediaProjection;)V

    .line 39
    .line 40
    :try_start_0
    iget-object v2, p0, Lcom/tencent/rtmp/video/a/f;->e:Landroid/media/projection/MediaProjection;

    .line 41
    .line 42
    iget-object v3, p0, Lcom/tencent/rtmp/video/a/f;->i:Landroid/media/projection/MediaProjection$Callback;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v2, v3}, Landroid/media/projection/MediaProjection;->unregisterCallback(Landroid/media/projection/MediaProjection$Callback;)V

    .line 46
    .line 47
    iget-object v2, p0, Lcom/tencent/rtmp/video/a/f;->e:Landroid/media/projection/MediaProjection;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v2}, Landroid/media/projection/MediaProjection;->stop()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 51
    goto :goto_0

    .line 52
    :catchall_0
    move-exception v2

    .line 53
    .line 54
    .line 55
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 56
    move-result-object v2

    .line 57
    .line 58
    const-string v3, "stop media projection session with exception "

    .line 59
    .line 60
    .line 61
    invoke-virtual {v3, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 62
    move-result-object v2

    .line 63
    .line 64
    .line 65
    invoke-static {v1, v2}, Lcom/tencent/rtmp/video/BaseBridge;->printLog(Ljava/lang/String;Ljava/lang/String;)V

    .line 66
    .line 67
    :goto_0
    iput-object v0, p0, Lcom/tencent/rtmp/video/a/f;->e:Landroid/media/projection/MediaProjection;

    .line 68
    .line 69
    .line 70
    :cond_1
    invoke-static {}, Lcom/tencent/rtmp/video/a/f;->d()V

    .line 71
    return-void
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
.end method
