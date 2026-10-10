.class public Lai/advance/common/camera/GuardianCameraViewV3;
.super Lai/advance/common/camera/GuardianCameraViewV2;
.source "SourceFile"


# static fields
.field public static final E:Ljava/lang/Object;


# instance fields
.field public final C:Ljava/lang/Object;

.field public volatile D:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Ljava/lang/Object;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lai/advance/common/camera/GuardianCameraViewV3;->E:Ljava/lang/Object;

    .line 8
    return-void
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

.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lai/advance/common/camera/GuardianCameraViewV2;-><init>(Landroid/content/Context;)V

    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lai/advance/common/camera/GuardianCameraViewV3;->C:Ljava/lang/Object;

    const/4 p1, 0x0

    iput-boolean p1, p0, Lai/advance/common/camera/GuardianCameraViewV3;->D:Z

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2}, Lai/advance/common/camera/GuardianCameraViewV2;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lai/advance/common/camera/GuardianCameraViewV3;->C:Ljava/lang/Object;

    const/4 p1, 0x0

    iput-boolean p1, p0, Lai/advance/common/camera/GuardianCameraViewV3;->D:Z

    return-void
.end method

.method private synthetic B0()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lai/advance/common/camera/GuardianCameraViewV3;->F0()V

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

.method private synthetic C0()V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lai/advance/common/camera/GuardianCameraViewV2;->e:Lai/advance/common/camera/GuardianCameraViewV2$g;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-interface {v0}, Lai/advance/common/camera/GuardianCameraViewV2$g;->b()V

    .line 8
    :cond_0
    return-void
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

.method private synthetic D0()V
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lai/advance/common/camera/GuardianCameraViewV3;->C:Ljava/lang/Object;

    .line 3
    monitor-enter v0

    .line 4
    .line 5
    :try_start_0
    iget-object v1, p0, Lai/advance/common/camera/GuardianCameraViewV2;->f:Landroid/hardware/Camera;

    .line 6
    .line 7
    if-eqz v1, :cond_1

    .line 8
    .line 9
    iget-boolean v1, p0, Lai/advance/common/camera/GuardianCameraViewV3;->D:Z

    .line 10
    .line 11
    if-nez v1, :cond_1

    .line 12
    .line 13
    iget-boolean v1, p0, Lai/advance/common/camera/GuardianCameraViewV2;->u:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    :try_start_1
    iget-object v1, p0, Lai/advance/common/camera/GuardianCameraViewV2;->f:Landroid/hardware/Camera;

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0}, Landroid/view/TextureView;->getSurfaceTexture()Landroid/graphics/SurfaceTexture;

    .line 21
    move-result-object v2

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1, v2}, Landroid/hardware/Camera;->setPreviewTexture(Landroid/graphics/SurfaceTexture;)V

    .line 25
    .line 26
    iget-object v1, p0, Lai/advance/common/camera/GuardianCameraViewV2;->f:Landroid/hardware/Camera;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1, p0}, Landroid/hardware/Camera;->setPreviewCallback(Landroid/hardware/Camera$PreviewCallback;)V

    .line 30
    .line 31
    iget-object v1, p0, Lai/advance/common/camera/GuardianCameraViewV2;->f:Landroid/hardware/Camera;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1}, Landroid/hardware/Camera;->startPreview()V

    .line 35
    .line 36
    iget-object v1, p0, Lai/advance/common/camera/GuardianCameraViewV2;->v:Landroid/os/Handler;

    .line 37
    .line 38
    if-eqz v1, :cond_1

    .line 39
    .line 40
    new-instance v2, Li/r;

    .line 41
    .line 42
    .line 43
    invoke-direct {v2, p0}, Li/r;-><init>(Lai/advance/common/camera/GuardianCameraViewV3;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 47
    goto :goto_0

    .line 48
    :catchall_0
    move-exception v1

    .line 49
    goto :goto_1

    .line 50
    :catch_0
    move-exception v1

    .line 51
    .line 52
    :try_start_2
    iget-object v2, p0, Lai/advance/common/camera/GuardianCameraViewV2;->f:Landroid/hardware/Camera;

    .line 53
    .line 54
    if-eqz v2, :cond_0

    .line 55
    const/4 v3, 0x0

    .line 56
    .line 57
    .line 58
    invoke-virtual {v2, v3}, Landroid/hardware/Camera;->setPreviewCallback(Landroid/hardware/Camera$PreviewCallback;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 59
    .line 60
    .line 61
    :catch_1
    :cond_0
    :try_start_3
    invoke-virtual {p0, v1}, Lai/advance/common/camera/GuardianCameraViewV3;->A0(Ljava/lang/Exception;)V

    .line 62
    :cond_1
    :goto_0
    monitor-exit v0

    .line 63
    return-void

    .line 64
    :goto_1
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 65
    throw v1
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

.method private synthetic E0()V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lai/advance/common/camera/GuardianCameraViewV3;->C:Ljava/lang/Object;

    .line 3
    monitor-enter v0

    .line 4
    .line 5
    :try_start_0
    iget-object v1, p0, Lai/advance/common/camera/GuardianCameraViewV2;->f:Landroid/hardware/Camera;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    iget-boolean v1, p0, Lai/advance/common/camera/GuardianCameraViewV3;->D:Z

    .line 10
    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    iget-object v1, p0, Lai/advance/common/camera/GuardianCameraViewV2;->f:Landroid/hardware/Camera;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v1}, Landroid/hardware/Camera;->stopPreview()V

    .line 17
    .line 18
    iget-object v1, p0, Lai/advance/common/camera/GuardianCameraViewV2;->f:Landroid/hardware/Camera;

    .line 19
    const/4 v2, 0x0

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1, v2}, Landroid/hardware/Camera;->setPreviewCallback(Landroid/hardware/Camera$PreviewCallback;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    goto :goto_0

    .line 24
    :catchall_0
    move-exception v1

    .line 25
    goto :goto_1

    .line 26
    :catch_0
    :cond_0
    :goto_0
    :try_start_1
    monitor-exit v0

    .line 27
    return-void

    .line 28
    :goto_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 29
    throw v1
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
.end method

.method private F0()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lai/advance/common/camera/GuardianCameraViewV2;->z:Ljava/util/concurrent/ExecutorService;

    .line 3
    .line 4
    new-instance v1, Li/q;

    .line 5
    .line 6
    .line 7
    invoke-direct {v1, p0}, Li/q;-><init>(Lai/advance/common/camera/GuardianCameraViewV3;)V

    .line 8
    .line 9
    .line 10
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 11
    return-void
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

.method private G0()V
    .locals 7

    .line 1
    .line 2
    iget-object v0, p0, Lai/advance/common/camera/GuardianCameraViewV2;->v:Landroid/os/Handler;

    .line 3
    .line 4
    sget-object v1, Lai/advance/common/camera/GuardianCameraViewV3;->E:Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 8
    .line 9
    iget-object v0, p0, Lai/advance/common/camera/GuardianCameraViewV2;->v:Landroid/os/Handler;

    .line 10
    .line 11
    new-instance v2, Li/n;

    .line 12
    .line 13
    .line 14
    invoke-direct {v2, p0}, Li/n;-><init>(Lai/advance/common/camera/GuardianCameraViewV3;)V

    .line 15
    .line 16
    .line 17
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 18
    move-result-wide v3

    .line 19
    .line 20
    iget-wide v5, p0, Lai/advance/common/camera/GuardianCameraViewV2;->c:J

    .line 21
    add-long/2addr v3, v5

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, v2, v1, v3, v4}, Landroid/os/Handler;->postAtTime(Ljava/lang/Runnable;Ljava/lang/Object;J)Z

    .line 25
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
.end method

.method public static synthetic m0(Lai/advance/common/camera/GuardianCameraViewV3;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lai/advance/common/camera/GuardianCameraViewV3;->E0()V

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

.method public static synthetic n0(Lai/advance/common/camera/GuardianCameraViewV3;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lai/advance/common/camera/GuardianCameraViewV3;->B0()V

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

.method public static synthetic o0(Lai/advance/common/camera/GuardianCameraViewV3;ZLandroid/hardware/Camera;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lai/advance/common/camera/GuardianCameraViewV3;->y0(ZLandroid/hardware/Camera;)V

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

.method public static synthetic p0(Lai/advance/common/camera/GuardianCameraViewV3;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lai/advance/common/camera/GuardianCameraViewV3;->C0()V

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

.method public static synthetic q0(Lai/advance/common/camera/GuardianCameraViewV3;I)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lai/advance/common/camera/GuardianCameraViewV3;->w0(I)V

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
.end method

.method public static synthetic r0(Lai/advance/common/camera/GuardianCameraViewV3;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lai/advance/common/camera/GuardianCameraViewV3;->D0()V

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

.method public static synthetic s0(Lai/advance/common/camera/GuardianCameraViewV3;Ljava/lang/Exception;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lai/advance/common/camera/GuardianCameraViewV3;->x0(Ljava/lang/Exception;)V

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
.end method

.method public static synthetic t0(Lai/advance/common/camera/GuardianCameraViewV3;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lai/advance/common/camera/GuardianCameraViewV3;->z0()V

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

.method public static synthetic u0(Lai/advance/common/camera/GuardianCameraViewV3;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lai/advance/common/camera/GuardianCameraViewV3;->v0()V

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

.method private synthetic v0()V
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lai/advance/common/camera/GuardianCameraViewV2;->r:Z

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Lai/advance/common/camera/GuardianCameraViewV3;->G0()V

    .line 8
    :cond_0
    return-void
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

.method private synthetic z0()V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lai/advance/common/camera/GuardianCameraViewV3;->C:Ljava/lang/Object;

    .line 3
    monitor-enter v0

    .line 4
    .line 5
    :try_start_0
    iget-object v1, p0, Lai/advance/common/camera/GuardianCameraViewV2;->f:Landroid/hardware/Camera;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    iget-boolean v1, p0, Lai/advance/common/camera/GuardianCameraViewV3;->D:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    :try_start_1
    iget-object v1, p0, Lai/advance/common/camera/GuardianCameraViewV2;->f:Landroid/hardware/Camera;

    .line 14
    .line 15
    new-instance v2, Li/t;

    .line 16
    .line 17
    .line 18
    invoke-direct {v2, p0}, Li/t;-><init>(Lai/advance/common/camera/GuardianCameraViewV3;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1, v2}, Landroid/hardware/Camera;->autoFocus(Landroid/hardware/Camera$AutoFocusCallback;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 22
    goto :goto_0

    .line 23
    :catchall_0
    move-exception v1

    .line 24
    goto :goto_1

    .line 25
    :catch_0
    :cond_0
    :goto_0
    :try_start_2
    monitor-exit v0

    .line 26
    return-void

    .line 27
    :goto_1
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 28
    throw v1
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
.end method


# virtual methods
.method public final A0(Ljava/lang/Exception;)V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lai/advance/common/camera/GuardianCameraViewV2;->v:Landroid/os/Handler;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iget-object v0, p0, Lai/advance/common/camera/GuardianCameraViewV3;->C:Ljava/lang/Object;

    .line 7
    monitor-enter v0

    .line 8
    const/4 v1, 0x0

    .line 9
    .line 10
    :try_start_0
    iput-object v1, p0, Lai/advance/common/camera/GuardianCameraViewV2;->f:Landroid/hardware/Camera;

    .line 11
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    .line 13
    iget-object v0, p0, Lai/advance/common/camera/GuardianCameraViewV2;->v:Landroid/os/Handler;

    .line 14
    .line 15
    new-instance v1, Li/u;

    .line 16
    .line 17
    .line 18
    invoke-direct {v1, p0, p1}, Li/u;-><init>(Lai/advance/common/camera/GuardianCameraViewV3;Ljava/lang/Exception;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 22
    return-void

    .line 23
    :catchall_0
    move-exception p1

    .line 24
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 25
    throw p1

    .line 26
    :cond_0
    return-void
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

.method public I()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lai/advance/common/camera/GuardianCameraViewV3;->F0()V

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

.method public M()Z
    .locals 3

    .line 1
    .line 2
    iget-boolean v0, p0, Lai/advance/common/camera/GuardianCameraViewV3;->D:Z

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    return v1

    .line 7
    .line 8
    :cond_0
    iget-object v0, p0, Lai/advance/common/camera/GuardianCameraViewV3;->C:Ljava/lang/Object;

    .line 9
    monitor-enter v0

    .line 10
    .line 11
    :try_start_0
    iget-object v2, p0, Lai/advance/common/camera/GuardianCameraViewV2;->f:Landroid/hardware/Camera;

    .line 12
    .line 13
    if-eqz v2, :cond_1

    .line 14
    .line 15
    iget-boolean v2, p0, Lai/advance/common/camera/GuardianCameraViewV3;->D:Z

    .line 16
    .line 17
    if-nez v2, :cond_1

    .line 18
    const/4 v1, 0x1

    .line 19
    goto :goto_0

    .line 20
    :catchall_0
    move-exception v1

    .line 21
    goto :goto_1

    .line 22
    :cond_1
    :goto_0
    monitor-exit v0

    .line 23
    return v1

    .line 24
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    throw v1
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
.end method

.method public O()V
    .locals 3

    .line 1
    .line 2
    .line 3
    :try_start_0
    invoke-virtual {p0}, Lai/advance/common/camera/GuardianCameraViewV3;->i0()V

    .line 4
    .line 5
    iget-object v0, p0, Lai/advance/common/camera/GuardianCameraViewV3;->C:Ljava/lang/Object;

    .line 6
    monitor-enter v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 7
    .line 8
    :try_start_1
    iget-object v1, p0, Lai/advance/common/camera/GuardianCameraViewV2;->f:Landroid/hardware/Camera;

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    .line 13
    invoke-virtual {v1}, Landroid/hardware/Camera;->stopPreview()V

    .line 14
    .line 15
    iget-object v1, p0, Lai/advance/common/camera/GuardianCameraViewV2;->f:Landroid/hardware/Camera;

    .line 16
    const/4 v2, 0x0

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1, v2}, Landroid/hardware/Camera;->setPreviewCallback(Landroid/hardware/Camera$PreviewCallback;)V

    .line 20
    .line 21
    iget-object v1, p0, Lai/advance/common/camera/GuardianCameraViewV2;->f:Landroid/hardware/Camera;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1}, Landroid/hardware/Camera;->release()V

    .line 25
    .line 26
    iput-object v2, p0, Lai/advance/common/camera/GuardianCameraViewV2;->f:Landroid/hardware/Camera;

    .line 27
    goto :goto_0

    .line 28
    :catchall_0
    move-exception v1

    .line 29
    goto :goto_1

    .line 30
    :cond_0
    :goto_0
    monitor-exit v0

    .line 31
    return-void

    .line 32
    :goto_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 33
    :try_start_2
    throw v1
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 34
    :catch_0
    return-void
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

.method public P(Lai/advance/common/camera/GuardianCameraViewV2$h;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    .line 3
    iput-boolean v0, p0, Lai/advance/common/camera/GuardianCameraViewV3;->D:Z

    .line 4
    const/4 v0, 0x0

    .line 5
    .line 6
    iput-boolean v0, p0, Lai/advance/common/camera/GuardianCameraViewV2;->h:Z

    .line 7
    .line 8
    .line 9
    invoke-super {p0, p1}, Lai/advance/common/camera/GuardianCameraViewV2;->P(Lai/advance/common/camera/GuardianCameraViewV2$h;)V

    .line 10
    return-void
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

.method public b0(ILai/advance/common/camera/GuardianCameraViewV2$g;)V
    .locals 1

    .line 1
    .line 2
    iput-object p2, p0, Lai/advance/common/camera/GuardianCameraViewV2;->e:Lai/advance/common/camera/GuardianCameraViewV2$g;

    .line 3
    .line 4
    iput p1, p0, Lai/advance/common/camera/GuardianCameraViewV2;->i:I

    .line 5
    .line 6
    iget-object p2, p0, Lai/advance/common/camera/GuardianCameraViewV2;->d:Landroid/app/Activity;

    .line 7
    .line 8
    if-nez p2, :cond_0

    .line 9
    goto :goto_0

    .line 10
    .line 11
    :cond_0
    iget p2, p0, Lai/advance/common/camera/GuardianCameraViewV2;->n:I

    .line 12
    const/4 v0, 0x1

    .line 13
    .line 14
    if-nez p2, :cond_1

    .line 15
    .line 16
    iput-boolean v0, p0, Lai/advance/common/camera/GuardianCameraViewV2;->m:Z

    .line 17
    return-void

    .line 18
    :cond_1
    const/4 p2, 0x0

    .line 19
    .line 20
    iput-boolean p2, p0, Lai/advance/common/camera/GuardianCameraViewV2;->m:Z

    .line 21
    .line 22
    iget-boolean p2, p0, Lai/advance/common/camera/GuardianCameraViewV2;->h:Z

    .line 23
    .line 24
    if-nez p2, :cond_2

    .line 25
    .line 26
    iput-boolean v0, p0, Lai/advance/common/camera/GuardianCameraViewV2;->h:Z

    .line 27
    .line 28
    iget-object p2, p0, Lai/advance/common/camera/GuardianCameraViewV2;->z:Ljava/util/concurrent/ExecutorService;

    .line 29
    .line 30
    new-instance v0, Li/m;

    .line 31
    .line 32
    .line 33
    invoke-direct {v0, p0, p1}, Li/m;-><init>(Lai/advance/common/camera/GuardianCameraViewV3;I)V

    .line 34
    .line 35
    .line 36
    invoke-interface {p2, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 37
    :cond_2
    :goto_0
    return-void
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
.end method

.method public g0()V
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lai/advance/common/camera/GuardianCameraViewV2;->r:Z

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Lai/advance/common/camera/GuardianCameraViewV3;->G0()V

    .line 8
    :cond_0
    return-void
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

.method public getCamera()Landroid/hardware/Camera;
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lai/advance/common/camera/GuardianCameraViewV3;->C:Ljava/lang/Object;

    .line 3
    monitor-enter v0

    .line 4
    .line 5
    :try_start_0
    iget-boolean v1, p0, Lai/advance/common/camera/GuardianCameraViewV3;->D:Z

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    const/4 v1, 0x0

    .line 9
    goto :goto_0

    .line 10
    .line 11
    .line 12
    :cond_0
    invoke-super {p0}, Lai/advance/common/camera/GuardianCameraViewV2;->getCamera()Landroid/hardware/Camera;

    .line 13
    move-result-object v1

    .line 14
    :goto_0
    monitor-exit v0

    .line 15
    return-object v1

    .line 16
    :catchall_0
    move-exception v1

    .line 17
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    throw v1
    .line 19
    .line 20
.end method

.method public h0()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lai/advance/common/camera/GuardianCameraViewV2;->z:Ljava/util/concurrent/ExecutorService;

    .line 3
    .line 4
    new-instance v1, Li/o;

    .line 5
    .line 6
    .line 7
    invoke-direct {v1, p0}, Li/o;-><init>(Lai/advance/common/camera/GuardianCameraViewV3;)V

    .line 8
    .line 9
    .line 10
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 11
    return-void
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

.method public i0()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lai/advance/common/camera/GuardianCameraViewV2;->v:Landroid/os/Handler;

    .line 3
    .line 4
    sget-object v1, Lai/advance/common/camera/GuardianCameraViewV3;->E:Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 8
    return-void
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

.method public j0()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lai/advance/common/camera/GuardianCameraViewV2;->z:Ljava/util/concurrent/ExecutorService;

    .line 3
    .line 4
    new-instance v1, Li/p;

    .line 5
    .line 6
    .line 7
    invoke-direct {v1, p0}, Li/p;-><init>(Lai/advance/common/camera/GuardianCameraViewV3;)V

    .line 8
    .line 9
    .line 10
    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    .line 11
    return-void
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

.method public final synthetic w0(I)V
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    .line 4
    :try_start_0
    invoke-static {p1}, Landroid/hardware/Camera;->open(I)Landroid/hardware/Camera;

    .line 5
    move-result-object v1

    .line 6
    .line 7
    .line 8
    invoke-virtual {v1}, Landroid/hardware/Camera;->getParameters()Landroid/hardware/Camera$Parameters;

    .line 9
    move-result-object v2

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v2}, Lai/advance/common/camera/GuardianCameraViewV2;->L(Landroid/hardware/Camera$Parameters;)Landroid/hardware/Camera$Size;

    .line 13
    move-result-object v3

    .line 14
    .line 15
    iget v4, v3, Landroid/hardware/Camera$Size;->width:I

    .line 16
    .line 17
    iget v5, v3, Landroid/hardware/Camera$Size;->height:I

    .line 18
    .line 19
    .line 20
    invoke-virtual {v2, v4, v5}, Landroid/hardware/Camera$Parameters;->setPreviewSize(II)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0, p1}, Lai/advance/common/camera/GuardianCameraViewV2;->T(I)I

    .line 24
    move-result p1

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1, p1}, Landroid/hardware/Camera;->setDisplayOrientation(I)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v1, v2}, Landroid/hardware/Camera;->setParameters(Landroid/hardware/Camera$Parameters;)V

    .line 31
    .line 32
    iget-object v2, p0, Lai/advance/common/camera/GuardianCameraViewV3;->C:Ljava/lang/Object;

    .line 33
    monitor-enter v2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 34
    .line 35
    :try_start_1
    iput-object v1, p0, Lai/advance/common/camera/GuardianCameraViewV2;->f:Landroid/hardware/Camera;

    .line 36
    .line 37
    iput-object v3, p0, Lai/advance/common/camera/GuardianCameraViewV2;->g:Landroid/hardware/Camera$Size;

    .line 38
    .line 39
    iput p1, p0, Lai/advance/common/camera/GuardianCameraViewV2;->l:I

    .line 40
    .line 41
    iput-boolean v0, p0, Lai/advance/common/camera/GuardianCameraViewV3;->D:Z

    .line 42
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 43
    .line 44
    :try_start_2
    iget-object p1, p0, Lai/advance/common/camera/GuardianCameraViewV2;->v:Landroid/os/Handler;

    .line 45
    .line 46
    new-instance v1, Li/s;

    .line 47
    .line 48
    .line 49
    invoke-direct {v1, p0}, Li/s;-><init>(Lai/advance/common/camera/GuardianCameraViewV3;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p1, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 53
    .line 54
    .line 55
    invoke-virtual {p0}, Lai/advance/common/camera/GuardianCameraViewV3;->g0()V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p0}, Lai/advance/common/camera/GuardianCameraViewV3;->h0()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 59
    goto :goto_1

    .line 60
    :catchall_0
    move-exception p1

    .line 61
    goto :goto_2

    .line 62
    :catch_0
    move-exception p1

    .line 63
    goto :goto_0

    .line 64
    :catchall_1
    move-exception p1

    .line 65
    :try_start_3
    monitor-exit v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 66
    :try_start_4
    throw p1
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 67
    .line 68
    .line 69
    :goto_0
    :try_start_5
    invoke-virtual {p0, p1}, Lai/advance/common/camera/GuardianCameraViewV3;->A0(Ljava/lang/Exception;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 70
    .line 71
    :goto_1
    iput-boolean v0, p0, Lai/advance/common/camera/GuardianCameraViewV2;->h:Z

    .line 72
    return-void

    .line 73
    .line 74
    :goto_2
    iput-boolean v0, p0, Lai/advance/common/camera/GuardianCameraViewV2;->h:Z

    .line 75
    throw p1
    .line 76
    .line 77
    .line 78
.end method

.method public final synthetic x0(Ljava/lang/Exception;)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lai/advance/common/camera/GuardianCameraViewV2;->e:Lai/advance/common/camera/GuardianCameraViewV2$g;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-interface {v0, p1}, Lai/advance/common/camera/GuardianCameraViewV2$g;->i(Ljava/lang/Exception;)V

    .line 8
    :cond_0
    return-void
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

.method public final synthetic y0(ZLandroid/hardware/Camera;)V
    .locals 0

    .line 1
    .line 2
    iget-object p1, p0, Lai/advance/common/camera/GuardianCameraViewV2;->v:Landroid/os/Handler;

    .line 3
    .line 4
    new-instance p2, Li/v;

    .line 5
    .line 6
    .line 7
    invoke-direct {p2, p0}, Li/v;-><init>(Lai/advance/common/camera/GuardianCameraViewV3;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1, p2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 11
    return-void
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
.end method
