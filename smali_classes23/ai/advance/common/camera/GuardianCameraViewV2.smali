.class public Lai/advance/common/camera/GuardianCameraViewV2;
.super Landroid/view/TextureView;
.source "SourceFile"

# interfaces
.implements Landroid/hardware/Camera$PreviewCallback;
.implements Landroid/view/View$OnLayoutChangeListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lai/advance/common/camera/GuardianCameraViewV2$f;,
        Lai/advance/common/camera/GuardianCameraViewV2$g;,
        Lai/advance/common/camera/GuardianCameraViewV2$h;
    }
.end annotation


# instance fields
.field public A:Landroid/view/TextureView$SurfaceTextureListener;

.field public B:Landroid/graphics/Rect;

.field public b:Lh/b;

.field public c:J

.field public d:Landroid/app/Activity;

.field public e:Lai/advance/common/camera/GuardianCameraViewV2$g;

.field public f:Landroid/hardware/Camera;

.field public g:Landroid/hardware/Camera$Size;

.field public volatile h:Z

.field public i:I

.field public j:I

.field public k:I

.field public l:I

.field public volatile m:Z

.field public n:I

.field public o:I

.field public p:Lai/advance/common/camera/GuardianCameraViewV2$f;

.field public q:Landroid/hardware/Camera$AutoFocusCallback;

.field public r:Z

.field public s:Z

.field public t:Ljava/util/concurrent/ExecutorService;

.field public u:Z

.field public final v:Landroid/os/Handler;

.field public w:Z

.field public x:F

.field public y:F

.field public final z:Ljava/util/concurrent/ExecutorService;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Lai/advance/common/camera/GuardianCameraViewV2;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    .line 2
    invoke-direct {p0, p1, p2}, Landroid/view/TextureView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const-wide/16 v0, 0x514

    iput-wide v0, p0, Lai/advance/common/camera/GuardianCameraViewV2;->c:J

    const/4 p2, 0x0

    iput-boolean p2, p0, Lai/advance/common/camera/GuardianCameraViewV2;->u:Z

    const/4 p2, 0x1

    iput-boolean p2, p0, Lai/advance/common/camera/GuardianCameraViewV2;->w:Z

    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object p2

    iput-object p2, p0, Lai/advance/common/camera/GuardianCameraViewV2;->z:Ljava/util/concurrent/ExecutorService;

    new-instance p2, Lai/advance/common/camera/GuardianCameraViewV2$d;

    invoke-direct {p2, p0}, Lai/advance/common/camera/GuardianCameraViewV2$d;-><init>(Lai/advance/common/camera/GuardianCameraViewV2;)V

    iput-object p2, p0, Lai/advance/common/camera/GuardianCameraViewV2;->A:Landroid/view/TextureView$SurfaceTextureListener;

    instance-of p2, p1, Landroid/app/Activity;

    if-eqz p2, :cond_0

    check-cast p1, Landroid/app/Activity;

    iput-object p1, p0, Lai/advance/common/camera/GuardianCameraViewV2;->d:Landroid/app/Activity;

    :cond_0
    new-instance p1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p2

    invoke-direct {p1, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object p1, p0, Lai/advance/common/camera/GuardianCameraViewV2;->v:Landroid/os/Handler;

    invoke-virtual {p0}, Lai/advance/common/camera/GuardianCameraViewV2;->S()V

    iget-object p1, p0, Lai/advance/common/camera/GuardianCameraViewV2;->A:Landroid/view/TextureView$SurfaceTextureListener;

    invoke-virtual {p0, p1}, Landroid/view/TextureView;->setSurfaceTextureListener(Landroid/view/TextureView$SurfaceTextureListener;)V

    invoke-virtual {p0, p0}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    new-instance p1, Lai/advance/common/camera/GuardianCameraViewV2$a;

    invoke-direct {p1, p0}, Lai/advance/common/camera/GuardianCameraViewV2$a;-><init>(Lai/advance/common/camera/GuardianCameraViewV2;)V

    invoke-virtual {p0, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public static synthetic A(Lai/advance/common/camera/GuardianCameraViewV2;ILai/advance/common/camera/GuardianCameraViewV2$g;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lai/advance/common/camera/GuardianCameraViewV2;->D(ILai/advance/common/camera/GuardianCameraViewV2$g;)V

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

.method private synthetic B()V
    .locals 3

    .line 1
    .line 2
    :try_start_0
    iget-object v0, p0, Lai/advance/common/camera/GuardianCameraViewV2;->f:Landroid/hardware/Camera;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/view/TextureView;->getSurfaceTexture()Landroid/graphics/SurfaceTexture;

    .line 6
    move-result-object v1

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, v1}, Landroid/hardware/Camera;->setPreviewTexture(Landroid/graphics/SurfaceTexture;)V

    .line 10
    .line 11
    iget-object v0, p0, Lai/advance/common/camera/GuardianCameraViewV2;->f:Landroid/hardware/Camera;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, p0}, Landroid/hardware/Camera;->setPreviewCallback(Landroid/hardware/Camera$PreviewCallback;)V

    .line 15
    .line 16
    iget-object v0, p0, Lai/advance/common/camera/GuardianCameraViewV2;->f:Landroid/hardware/Camera;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Landroid/hardware/Camera;->startPreview()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 20
    return-void

    .line 21
    :catch_0
    move-exception v0

    .line 22
    const/4 v1, 0x0

    .line 23
    .line 24
    :try_start_1
    iget-object v2, p0, Lai/advance/common/camera/GuardianCameraViewV2;->f:Landroid/hardware/Camera;

    .line 25
    .line 26
    if-eqz v2, :cond_0

    .line 27
    .line 28
    .line 29
    invoke-virtual {v2, v1}, Landroid/hardware/Camera;->setPreviewCallback(Landroid/hardware/Camera$PreviewCallback;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 30
    .line 31
    :catch_1
    :cond_0
    iput-object v1, p0, Lai/advance/common/camera/GuardianCameraViewV2;->f:Landroid/hardware/Camera;

    .line 32
    .line 33
    iget-object v1, p0, Lai/advance/common/camera/GuardianCameraViewV2;->e:Lai/advance/common/camera/GuardianCameraViewV2$g;

    .line 34
    .line 35
    if-eqz v1, :cond_1

    .line 36
    .line 37
    .line 38
    invoke-interface {v1, v0}, Lai/advance/common/camera/GuardianCameraViewV2$g;->i(Ljava/lang/Exception;)V

    .line 39
    :cond_1
    return-void
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

.method private synthetic C(I)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lai/advance/common/camera/GuardianCameraViewV2;->e:Lai/advance/common/camera/GuardianCameraViewV2$g;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1, v0}, Lai/advance/common/camera/GuardianCameraViewV2;->b0(ILai/advance/common/camera/GuardianCameraViewV2$g;)V

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

.method public static synthetic F(Lai/advance/common/camera/GuardianCameraViewV2$h;)V
    .locals 0

    .line 1
    .line 2
    if-eqz p0, :cond_0

    .line 3
    .line 4
    .line 5
    invoke-interface {p0}, Lai/advance/common/camera/GuardianCameraViewV2$h;->a()V

    .line 6
    :cond_0
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

.method private synthetic G(Ljava/lang/Exception;)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lai/advance/common/camera/GuardianCameraViewV2;->e:Lai/advance/common/camera/GuardianCameraViewV2$g;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0, p1}, Lai/advance/common/camera/GuardianCameraViewV2$g;->i(Ljava/lang/Exception;)V

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

.method private declared-synchronized getMainHandler()Lai/advance/common/camera/GuardianCameraViewV2$f;
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    .line 3
    :try_start_0
    iget-object v0, p0, Lai/advance/common/camera/GuardianCameraViewV2;->p:Lai/advance/common/camera/GuardianCameraViewV2$f;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Lai/advance/common/camera/GuardianCameraViewV2$f;

    .line 8
    .line 9
    .line 10
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 11
    move-result-object v1

    .line 12
    .line 13
    .line 14
    invoke-direct {v0, p0, v1}, Lai/advance/common/camera/GuardianCameraViewV2$f;-><init>(Lai/advance/common/camera/GuardianCameraViewV2;Landroid/os/Looper;)V

    .line 15
    .line 16
    iput-object v0, p0, Lai/advance/common/camera/GuardianCameraViewV2;->p:Lai/advance/common/camera/GuardianCameraViewV2$f;

    .line 17
    goto :goto_0

    .line 18
    :catchall_0
    move-exception v0

    .line 19
    goto :goto_1

    .line 20
    .line 21
    :cond_0
    :goto_0
    iget-object v0, p0, Lai/advance/common/camera/GuardianCameraViewV2;->p:Lai/advance/common/camera/GuardianCameraViewV2$f;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    monitor-exit p0

    .line 23
    return-object v0

    .line 24
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 25
    throw v0
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

.method public static synthetic q(Lai/advance/common/camera/GuardianCameraViewV2;I)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1}, Lai/advance/common/camera/GuardianCameraViewV2;->C(I)V

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

.method public static synthetic s(Lai/advance/common/camera/GuardianCameraViewV2;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lai/advance/common/camera/GuardianCameraViewV2;->B()V

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

.method public static synthetic t(Lai/advance/common/camera/GuardianCameraViewV2;Lai/advance/common/camera/GuardianCameraViewV2$g;I)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lai/advance/common/camera/GuardianCameraViewV2;->E(Lai/advance/common/camera/GuardianCameraViewV2$g;I)V

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

.method public static synthetic u(Lai/advance/common/camera/GuardianCameraViewV2;Lai/advance/common/camera/GuardianCameraViewV2$h;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lai/advance/common/camera/GuardianCameraViewV2;->K(Lai/advance/common/camera/GuardianCameraViewV2$h;)V

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

.method public static synthetic v(Lai/advance/common/camera/GuardianCameraViewV2$h;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lai/advance/common/camera/GuardianCameraViewV2;->F(Lai/advance/common/camera/GuardianCameraViewV2$h;)V

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

.method public static synthetic w(Lai/advance/common/camera/GuardianCameraViewV2;ZLandroid/hardware/Camera;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lai/advance/common/camera/GuardianCameraViewV2;->H(ZLandroid/hardware/Camera;)V

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

.method public static synthetic x(Lai/advance/common/camera/GuardianCameraViewV2;Lai/advance/common/camera/GuardianCameraViewV2$h;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lai/advance/common/camera/GuardianCameraViewV2;->J(Lai/advance/common/camera/GuardianCameraViewV2$h;)V

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

.method public static synthetic z(Lai/advance/common/camera/GuardianCameraViewV2;Ljava/lang/Exception;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1}, Lai/advance/common/camera/GuardianCameraViewV2;->G(Ljava/lang/Exception;)V

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


# virtual methods
.method public final synthetic D(ILai/advance/common/camera/GuardianCameraViewV2$g;)V
    .locals 3

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
    iput-object v1, p0, Lai/advance/common/camera/GuardianCameraViewV2;->f:Landroid/hardware/Camera;

    .line 8
    .line 9
    iget-object v1, p0, Lai/advance/common/camera/GuardianCameraViewV2;->v:Landroid/os/Handler;

    .line 10
    .line 11
    new-instance v2, Li/k;

    .line 12
    .line 13
    .line 14
    invoke-direct {v2, p0, p2, p1}, Li/k;-><init>(Lai/advance/common/camera/GuardianCameraViewV2;Lai/advance/common/camera/GuardianCameraViewV2$g;I)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    .line 19
    iput-boolean v0, p0, Lai/advance/common/camera/GuardianCameraViewV2;->h:Z

    .line 20
    return-void

    .line 21
    :catchall_0
    move-exception p1

    .line 22
    goto :goto_0

    .line 23
    :catch_0
    move-exception p1

    .line 24
    .line 25
    :try_start_1
    iget-object p2, p0, Lai/advance/common/camera/GuardianCameraViewV2;->e:Lai/advance/common/camera/GuardianCameraViewV2$g;

    .line 26
    .line 27
    if-eqz p2, :cond_0

    .line 28
    .line 29
    iget-object p2, p0, Lai/advance/common/camera/GuardianCameraViewV2;->v:Landroid/os/Handler;

    .line 30
    .line 31
    new-instance v1, Li/l;

    .line 32
    .line 33
    .line 34
    invoke-direct {v1, p0, p1}, Li/l;-><init>(Lai/advance/common/camera/GuardianCameraViewV2;Ljava/lang/Exception;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p2, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 38
    .line 39
    :cond_0
    iput-boolean v0, p0, Lai/advance/common/camera/GuardianCameraViewV2;->h:Z

    .line 40
    return-void

    .line 41
    .line 42
    :goto_0
    iput-boolean v0, p0, Lai/advance/common/camera/GuardianCameraViewV2;->h:Z

    .line 43
    throw p1
    .line 44
    .line 45
.end method

.method public final synthetic E(Lai/advance/common/camera/GuardianCameraViewV2$g;I)V
    .locals 3

    .line 1
    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    :try_start_0
    iget-object v0, p0, Lai/advance/common/camera/GuardianCameraViewV2;->f:Landroid/hardware/Camera;

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/hardware/Camera;->getParameters()Landroid/hardware/Camera$Parameters;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    iget-object v1, p0, Lai/advance/common/camera/GuardianCameraViewV2;->f:Landroid/hardware/Camera;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v1}, Landroid/hardware/Camera;->getParameters()Landroid/hardware/Camera$Parameters;

    .line 14
    move-result-object v1

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, v1}, Lai/advance/common/camera/GuardianCameraViewV2;->L(Landroid/hardware/Camera$Parameters;)Landroid/hardware/Camera$Size;

    .line 18
    move-result-object v1

    .line 19
    .line 20
    iput-object v1, p0, Lai/advance/common/camera/GuardianCameraViewV2;->g:Landroid/hardware/Camera$Size;

    .line 21
    .line 22
    iget v2, v1, Landroid/hardware/Camera$Size;->width:I

    .line 23
    .line 24
    iget v1, v1, Landroid/hardware/Camera$Size;->height:I

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, v2, v1}, Landroid/hardware/Camera$Parameters;->setPreviewSize(II)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0, p2}, Lai/advance/common/camera/GuardianCameraViewV2;->T(I)I

    .line 31
    move-result p2

    .line 32
    .line 33
    iput p2, p0, Lai/advance/common/camera/GuardianCameraViewV2;->l:I

    .line 34
    .line 35
    iget-object v1, p0, Lai/advance/common/camera/GuardianCameraViewV2;->f:Landroid/hardware/Camera;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1, p2}, Landroid/hardware/Camera;->setDisplayOrientation(I)V

    .line 39
    .line 40
    iget-object p2, p0, Lai/advance/common/camera/GuardianCameraViewV2;->f:Landroid/hardware/Camera;

    .line 41
    .line 42
    .line 43
    invoke-virtual {p2, v0}, Landroid/hardware/Camera;->setParameters(Landroid/hardware/Camera$Parameters;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0}, Lai/advance/common/camera/GuardianCameraViewV2;->l0()V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0}, Lai/advance/common/camera/GuardianCameraViewV2;->g0()V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0}, Lai/advance/common/camera/GuardianCameraViewV2;->h0()V

    .line 53
    .line 54
    .line 55
    invoke-interface {p1}, Lai/advance/common/camera/GuardianCameraViewV2$g;->b()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 56
    return-void

    .line 57
    :catch_0
    move-exception p1

    .line 58
    .line 59
    iget-object p2, p0, Lai/advance/common/camera/GuardianCameraViewV2;->e:Lai/advance/common/camera/GuardianCameraViewV2$g;

    .line 60
    .line 61
    if-eqz p2, :cond_0

    .line 62
    .line 63
    .line 64
    invoke-interface {p2, p1}, Lai/advance/common/camera/GuardianCameraViewV2$g;->i(Ljava/lang/Exception;)V

    .line 65
    :cond_0
    return-void
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
.end method

.method public final synthetic H(ZLandroid/hardware/Camera;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lai/advance/common/camera/GuardianCameraViewV2;->getMainHandler()Lai/advance/common/camera/GuardianCameraViewV2$f;

    .line 4
    move-result-object p1

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1}, Lai/advance/common/camera/GuardianCameraViewV2$f;->b()V

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

.method public I()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lai/advance/common/camera/GuardianCameraViewV2;->getMainHandler()Lai/advance/common/camera/GuardianCameraViewV2$f;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lai/advance/common/camera/GuardianCameraViewV2$f;->a()V

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

.method public final synthetic J(Lai/advance/common/camera/GuardianCameraViewV2$h;)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lai/advance/common/camera/GuardianCameraViewV2;->O()V

    .line 4
    .line 5
    iget-object v0, p0, Lai/advance/common/camera/GuardianCameraViewV2;->v:Landroid/os/Handler;

    .line 6
    .line 7
    new-instance v1, Li/j;

    .line 8
    .line 9
    .line 10
    invoke-direct {v1, p1}, Li/j;-><init>(Lai/advance/common/camera/GuardianCameraViewV2$h;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

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
.end method

.method public final synthetic K(Lai/advance/common/camera/GuardianCameraViewV2$h;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lai/advance/common/camera/GuardianCameraViewV2;->O()V

    .line 4
    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    .line 8
    invoke-interface {p1}, Lai/advance/common/camera/GuardianCameraViewV2$h;->a()V

    .line 9
    :cond_0
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
.end method

.method public L(Landroid/hardware/Camera$Parameters;)Landroid/hardware/Camera$Size;
    .locals 9

    .line 1
    .line 2
    .line 3
    :try_start_0
    invoke-virtual {p1}, Landroid/hardware/Camera$Parameters;->getSupportedPreviewSizes()Ljava/util/List;

    .line 4
    move-result-object p1

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Lai/advance/common/camera/GuardianCameraViewV2;->getViewWidth()I

    .line 8
    move-result v0

    .line 9
    int-to-float v0, v0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Lai/advance/common/camera/GuardianCameraViewV2;->getViewHeight()I

    .line 13
    move-result v1

    .line 14
    int-to-float v1, v1

    .line 15
    div-float/2addr v0, v1

    .line 16
    .line 17
    new-instance v1, Lai/advance/common/camera/GuardianCameraViewV2$b;

    .line 18
    .line 19
    .line 20
    invoke-direct {v1, p0, v0}, Lai/advance/common/camera/GuardianCameraViewV2$b;-><init>(Lai/advance/common/camera/GuardianCameraViewV2;F)V

    .line 21
    .line 22
    .line 23
    invoke-static {p1, v1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 24
    .line 25
    new-instance v0, Ljava/util/ArrayList;

    .line 26
    .line 27
    .line 28
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 29
    .line 30
    .line 31
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 32
    move-result v1

    .line 33
    const/4 v2, 0x0

    .line 34
    .line 35
    if-lez v1, :cond_0

    .line 36
    .line 37
    .line 38
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 39
    move-result-object v1

    .line 40
    .line 41
    check-cast v1, Landroid/hardware/Camera$Size;

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0, v1}, Lai/advance/common/camera/GuardianCameraViewV2;->W(Landroid/hardware/Camera$Size;)F

    .line 45
    move-result v1

    .line 46
    goto :goto_0

    .line 47
    :cond_0
    const/4 v1, 0x0

    .line 48
    .line 49
    .line 50
    :goto_0
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 51
    move-result-object v3

    .line 52
    .line 53
    .line 54
    :cond_1
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 55
    move-result v4

    .line 56
    .line 57
    if-eqz v4, :cond_2

    .line 58
    .line 59
    .line 60
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 61
    move-result-object v4

    .line 62
    .line 63
    check-cast v4, Landroid/hardware/Camera$Size;

    .line 64
    .line 65
    .line 66
    invoke-virtual {p0, v4}, Lai/advance/common/camera/GuardianCameraViewV2;->W(Landroid/hardware/Camera$Size;)F

    .line 67
    move-result v5

    .line 68
    sub-float/2addr v5, v1

    .line 69
    .line 70
    .line 71
    invoke-static {v5}, Ljava/lang/Math;->abs(F)F

    .line 72
    move-result v5

    .line 73
    float-to-double v5, v5

    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    const-wide v7, 0x3fb999999999999aL    # 0.1

    .line 79
    .line 80
    cmpg-double v5, v5, v7

    .line 81
    .line 82
    if-gez v5, :cond_1

    .line 83
    .line 84
    .line 85
    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 86
    goto :goto_1

    .line 87
    .line 88
    :cond_2
    new-instance v1, Lai/advance/common/camera/GuardianCameraViewV2$c;

    .line 89
    .line 90
    .line 91
    invoke-direct {v1, p0}, Lai/advance/common/camera/GuardianCameraViewV2$c;-><init>(Lai/advance/common/camera/GuardianCameraViewV2;)V

    .line 92
    .line 93
    .line 94
    invoke-static {v0, v1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 95
    .line 96
    .line 97
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 98
    move-result v1

    .line 99
    .line 100
    if-lez v1, :cond_3

    .line 101
    .line 102
    .line 103
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 104
    move-result-object p1

    .line 105
    .line 106
    :goto_2
    check-cast p1, Landroid/hardware/Camera$Size;

    .line 107
    return-object p1

    .line 108
    .line 109
    .line 110
    :cond_3
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 111
    move-result v0

    .line 112
    .line 113
    if-lez v0, :cond_4

    .line 114
    .line 115
    .line 116
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 117
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 118
    goto :goto_2

    .line 119
    :catch_0
    :cond_4
    const/4 p1, 0x0

    .line 120
    return-object p1
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
.end method

.method public M()Z
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lai/advance/common/camera/GuardianCameraViewV2;->f:Landroid/hardware/Camera;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    const/4 v0, 0x1

    .line 6
    return v0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    return v0
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

.method public N([B)V
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lai/advance/common/camera/GuardianCameraViewV2;->s:Z

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    const/4 v0, 0x0

    .line 6
    .line 7
    iput-boolean v0, p0, Lai/advance/common/camera/GuardianCameraViewV2;->s:Z

    .line 8
    .line 9
    new-instance v0, Lai/advance/common/camera/GuardianCameraViewV2$e;

    .line 10
    .line 11
    .line 12
    invoke-direct {v0, p0, p1}, Lai/advance/common/camera/GuardianCameraViewV2$e;-><init>(Lai/advance/common/camera/GuardianCameraViewV2;[B)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Lai/advance/common/camera/GuardianCameraViewV2;->getExecutor()Ljava/util/concurrent/ExecutorService;

    .line 16
    move-result-object p1

    .line 17
    .line 18
    .line 19
    invoke-interface {p1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 20
    :cond_0
    return-void
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public O()V
    .locals 2

    .line 1
    .line 2
    .line 3
    :try_start_0
    invoke-virtual {p0}, Lai/advance/common/camera/GuardianCameraViewV2;->i0()V

    .line 4
    .line 5
    iget-object v0, p0, Lai/advance/common/camera/GuardianCameraViewV2;->f:Landroid/hardware/Camera;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Landroid/hardware/Camera;->stopPreview()V

    .line 11
    .line 12
    iget-object v0, p0, Lai/advance/common/camera/GuardianCameraViewV2;->f:Landroid/hardware/Camera;

    .line 13
    const/4 v1, 0x0

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v1}, Landroid/hardware/Camera;->setPreviewCallback(Landroid/hardware/Camera$PreviewCallback;)V

    .line 17
    .line 18
    iget-object v0, p0, Lai/advance/common/camera/GuardianCameraViewV2;->f:Landroid/hardware/Camera;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Landroid/hardware/Camera;->release()V

    .line 22
    .line 23
    iput-object v1, p0, Lai/advance/common/camera/GuardianCameraViewV2;->f:Landroid/hardware/Camera;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 24
    :catch_0
    :cond_0
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
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lai/advance/common/camera/GuardianCameraViewV2;->z:Ljava/util/concurrent/ExecutorService;

    .line 3
    .line 4
    new-instance v1, Li/g;

    .line 5
    .line 6
    .line 7
    invoke-direct {v1, p0, p1}, Li/g;-><init>(Lai/advance/common/camera/GuardianCameraViewV2;Lai/advance/common/camera/GuardianCameraViewV2$h;)V

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
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public Q(Lai/advance/common/camera/GuardianCameraViewV2$h;)V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lai/advance/common/camera/GuardianCameraViewV2;->z:Ljava/util/concurrent/ExecutorService;

    .line 3
    .line 4
    new-instance v1, Li/h;

    .line 5
    .line 6
    .line 7
    invoke-direct {v1, p0, p1}, Li/h;-><init>(Lai/advance/common/camera/GuardianCameraViewV2;Lai/advance/common/camera/GuardianCameraViewV2$h;)V

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
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public R()V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lai/advance/common/camera/GuardianCameraViewV2;->b:Lh/b;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lh/b;->e()V

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

.method public S()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lk/c;->d()I

    .line 4
    move-result v0

    .line 5
    .line 6
    iput v0, p0, Lai/advance/common/camera/GuardianCameraViewV2;->j:I

    .line 7
    .line 8
    .line 9
    invoke-static {}, Lk/c;->f()I

    .line 10
    move-result v0

    .line 11
    .line 12
    iput v0, p0, Lai/advance/common/camera/GuardianCameraViewV2;->k:I

    .line 13
    .line 14
    iget v0, p0, Lai/advance/common/camera/GuardianCameraViewV2;->j:I

    .line 15
    const/4 v1, -0x1

    .line 16
    .line 17
    if-ne v0, v1, :cond_0

    .line 18
    .line 19
    const-string v0, "No back facing camera detected on the device."

    .line 20
    .line 21
    .line 22
    invoke-static {v0}, Lk/h;->g(Ljava/lang/String;)V

    .line 23
    .line 24
    :cond_0
    iget v0, p0, Lai/advance/common/camera/GuardianCameraViewV2;->k:I

    .line 25
    .line 26
    if-ne v0, v1, :cond_1

    .line 27
    .line 28
    const-string v0, "No front facing camera detected on the device."

    .line 29
    .line 30
    .line 31
    invoke-static {v0}, Lk/h;->g(Ljava/lang/String;)V

    .line 32
    :cond_1
    return-void
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

.method public T(I)I
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lai/advance/common/camera/GuardianCameraViewV2;->d:Landroid/app/Activity;

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lk/c;->e(ILandroid/app/Activity;)I

    .line 6
    move-result p1

    .line 7
    return p1
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

.method public U(Landroid/hardware/Camera$Size;)I
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lai/advance/common/camera/GuardianCameraViewV2;->Y()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget p1, p1, Landroid/hardware/Camera$Size;->width:I

    .line 9
    return p1

    .line 10
    .line 11
    :cond_0
    iget p1, p1, Landroid/hardware/Camera$Size;->height:I

    .line 12
    return p1
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

.method public V(Landroid/hardware/Camera$Size;)I
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lai/advance/common/camera/GuardianCameraViewV2;->Y()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget p1, p1, Landroid/hardware/Camera$Size;->height:I

    .line 9
    return p1

    .line 10
    .line 11
    :cond_0
    iget p1, p1, Landroid/hardware/Camera$Size;->width:I

    .line 12
    return p1
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

.method public W(Landroid/hardware/Camera$Size;)F
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lai/advance/common/camera/GuardianCameraViewV2;->V(Landroid/hardware/Camera$Size;)I

    .line 4
    move-result v0

    .line 5
    int-to-float v0, v0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1}, Lai/advance/common/camera/GuardianCameraViewV2;->U(Landroid/hardware/Camera$Size;)I

    .line 9
    move-result p1

    .line 10
    int-to-float p1, p1

    .line 11
    div-float/2addr v0, p1

    .line 12
    return v0
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

.method public X()Z
    .locals 3

    .line 1
    .line 2
    iget v0, p0, Lai/advance/common/camera/GuardianCameraViewV2;->k:I

    .line 3
    const/4 v1, -0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    return v2

    .line 8
    .line 9
    :cond_0
    iget v1, p0, Lai/advance/common/camera/GuardianCameraViewV2;->i:I

    .line 10
    .line 11
    if-ne v1, v0, :cond_1

    .line 12
    const/4 v0, 0x1

    .line 13
    return v0

    .line 14
    :cond_1
    return v2
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
.end method

.method public Y()Z
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    iget v0, v0, Landroid/content/res/Configuration;->orientation:I

    .line 11
    const/4 v1, 0x1

    .line 12
    .line 13
    if-ne v0, v1, :cond_0

    .line 14
    return v1

    .line 15
    :cond_0
    const/4 v0, 0x0

    .line 16
    return v0
    .line 17
    .line 18
    .line 19
    .line 20
.end method

.method public Z()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lai/advance/common/camera/GuardianCameraViewV2;->w:Z

    .line 3
    return v0
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
.end method

.method public a0()V
    .locals 0

    .line 1
    return-void
    .line 2
    .line 3
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
.end method

.method public declared-synchronized b0(ILai/advance/common/camera/GuardianCameraViewV2$g;)V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    .line 3
    :try_start_0
    iput-object p2, p0, Lai/advance/common/camera/GuardianCameraViewV2;->e:Lai/advance/common/camera/GuardianCameraViewV2$g;

    .line 4
    .line 5
    iput p1, p0, Lai/advance/common/camera/GuardianCameraViewV2;->i:I

    .line 6
    .line 7
    iget-object v0, p0, Lai/advance/common/camera/GuardianCameraViewV2;->d:Landroid/app/Activity;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    monitor-exit p0

    .line 11
    return-void

    .line 12
    .line 13
    :cond_0
    :try_start_1
    iget v0, p0, Lai/advance/common/camera/GuardianCameraViewV2;->n:I

    .line 14
    const/4 v1, 0x1

    .line 15
    .line 16
    if-nez v0, :cond_1

    .line 17
    .line 18
    iput-boolean v1, p0, Lai/advance/common/camera/GuardianCameraViewV2;->m:Z

    .line 19
    goto :goto_0

    .line 20
    :catchall_0
    move-exception p1

    .line 21
    goto :goto_1

    .line 22
    :cond_1
    const/4 v0, 0x0

    .line 23
    .line 24
    iput-boolean v0, p0, Lai/advance/common/camera/GuardianCameraViewV2;->m:Z

    .line 25
    .line 26
    iget-boolean v0, p0, Lai/advance/common/camera/GuardianCameraViewV2;->h:Z

    .line 27
    .line 28
    if-nez v0, :cond_2

    .line 29
    .line 30
    iput-boolean v1, p0, Lai/advance/common/camera/GuardianCameraViewV2;->h:Z

    .line 31
    .line 32
    iget-object v0, p0, Lai/advance/common/camera/GuardianCameraViewV2;->z:Ljava/util/concurrent/ExecutorService;

    .line 33
    .line 34
    new-instance v1, Li/i;

    .line 35
    .line 36
    .line 37
    invoke-direct {v1, p0, p1, p2}, Li/i;-><init>(Lai/advance/common/camera/GuardianCameraViewV2;ILai/advance/common/camera/GuardianCameraViewV2$g;)V

    .line 38
    .line 39
    .line 40
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 41
    :cond_2
    :goto_0
    monitor-exit p0

    .line 42
    return-void

    .line 43
    :goto_1
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 44
    throw p1
    .line 45
.end method

.method public c0(IZJ)V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lai/advance/common/camera/GuardianCameraViewV2;->b:Lh/b;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    new-instance v0, Lh/b;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 10
    move-result-object v1

    .line 11
    .line 12
    .line 13
    invoke-direct {v0, v1}, Lh/b;-><init>(Landroid/content/Context;)V

    .line 14
    .line 15
    iput-object v0, p0, Lai/advance/common/camera/GuardianCameraViewV2;->b:Lh/b;

    .line 16
    .line 17
    :cond_0
    iget-object v0, p0, Lai/advance/common/camera/GuardianCameraViewV2;->b:Lh/b;

    .line 18
    .line 19
    iget-boolean v1, p0, Lai/advance/common/camera/GuardianCameraViewV2;->w:Z

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v1}, Lh/b;->h(Z)V

    .line 23
    .line 24
    iget-boolean v0, p0, Lai/advance/common/camera/GuardianCameraViewV2;->w:Z

    .line 25
    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    iget-object v0, p0, Lai/advance/common/camera/GuardianCameraViewV2;->b:Lh/b;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, p1, p2, p3, p4}, Lh/b;->f(IZJ)V

    .line 32
    :cond_1
    return-void
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

.method public d0(Landroid/hardware/Camera$Size;)V
    .locals 0

    .line 1
    return-void
    .line 2
    .line 3
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

.method public e0()V
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lai/advance/common/camera/GuardianCameraViewV2;->i:I

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, v0}, Lai/advance/common/camera/GuardianCameraViewV2;->f0(I)V

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
.end method

.method public f0(I)V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Li/f;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p0, p1}, Li/f;-><init>(Lai/advance/common/camera/GuardianCameraViewV2;I)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, v0}, Lai/advance/common/camera/GuardianCameraViewV2;->P(Lai/advance/common/camera/GuardianCameraViewV2$h;)V

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
.end method

.method public g0()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lai/advance/common/camera/GuardianCameraViewV2;->M()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    .line 9
    invoke-direct {p0}, Lai/advance/common/camera/GuardianCameraViewV2;->getMainHandler()Lai/advance/common/camera/GuardianCameraViewV2$f;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Lai/advance/common/camera/GuardianCameraViewV2$f;->b()V

    .line 14
    :cond_0
    return-void
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
.end method

.method public getAutoFocusCallback()Landroid/hardware/Camera$AutoFocusCallback;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lai/advance/common/camera/GuardianCameraViewV2;->q:Landroid/hardware/Camera$AutoFocusCallback;

    .line 3
    .line 4
    if-nez v0, :cond_1

    .line 5
    monitor-enter p0

    .line 6
    .line 7
    :try_start_0
    iget-object v0, p0, Lai/advance/common/camera/GuardianCameraViewV2;->q:Landroid/hardware/Camera$AutoFocusCallback;

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    new-instance v0, Li/e;

    .line 12
    .line 13
    .line 14
    invoke-direct {v0, p0}, Li/e;-><init>(Lai/advance/common/camera/GuardianCameraViewV2;)V

    .line 15
    .line 16
    iput-object v0, p0, Lai/advance/common/camera/GuardianCameraViewV2;->q:Landroid/hardware/Camera$AutoFocusCallback;

    .line 17
    goto :goto_0

    .line 18
    :catchall_0
    move-exception v0

    .line 19
    goto :goto_1

    .line 20
    :cond_0
    :goto_0
    monitor-exit p0

    .line 21
    goto :goto_2

    .line 22
    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    throw v0

    .line 24
    .line 25
    :cond_1
    :goto_2
    iget-object v0, p0, Lai/advance/common/camera/GuardianCameraViewV2;->q:Landroid/hardware/Camera$AutoFocusCallback;

    .line 26
    return-object v0
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

.method public getBackCameraId()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lai/advance/common/camera/GuardianCameraViewV2;->j:I

    .line 3
    return v0
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
.end method

.method public getCamera()Landroid/hardware/Camera;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lai/advance/common/camera/GuardianCameraViewV2;->f:Landroid/hardware/Camera;

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
    .line 18
    .line 19
    .line 20
.end method

.method public getCameraTransformHeightRatio()F
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lai/advance/common/camera/GuardianCameraViewV2;->y:F

    .line 3
    return v0
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
.end method

.method public getCameraTransformWidthRatio()F
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lai/advance/common/camera/GuardianCameraViewV2;->x:F

    .line 3
    return v0
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
.end method

.method public getExecutor()Ljava/util/concurrent/ExecutorService;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lai/advance/common/camera/GuardianCameraViewV2;->t:Ljava/util/concurrent/ExecutorService;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-static {}, Ljava/util/concurrent/Executors;->newCachedThreadPool()Ljava/util/concurrent/ExecutorService;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    iput-object v0, p0, Lai/advance/common/camera/GuardianCameraViewV2;->t:Ljava/util/concurrent/ExecutorService;

    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Lai/advance/common/camera/GuardianCameraViewV2;->t:Ljava/util/concurrent/ExecutorService;

    .line 13
    return-object v0
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
.end method

.method public getFrontCameraId()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lai/advance/common/camera/GuardianCameraViewV2;->k:I

    .line 3
    return v0
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
.end method

.method public getPreviewSize()Landroid/hardware/Camera$Size;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lai/advance/common/camera/GuardianCameraViewV2;->g:Landroid/hardware/Camera$Size;

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
    .line 18
    .line 19
    .line 20
.end method

.method public getScale()F
    .locals 1

    .line 1
    .line 2
    const/high16 v0, 0x3f800000    # 1.0f

    .line 3
    return v0
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
.end method

.method public getViewHeight()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lai/advance/common/camera/GuardianCameraViewV2;->o:I

    .line 3
    return v0
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
.end method

.method public getViewWidth()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lai/advance/common/camera/GuardianCameraViewV2;->n:I

    .line 3
    return v0
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
.end method

.method public h0()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lai/advance/common/camera/GuardianCameraViewV2;->M()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget-boolean v0, p0, Lai/advance/common/camera/GuardianCameraViewV2;->u:Z

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget-object v0, p0, Lai/advance/common/camera/GuardianCameraViewV2;->f:Landroid/hardware/Camera;

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    iget-object v0, p0, Lai/advance/common/camera/GuardianCameraViewV2;->z:Ljava/util/concurrent/ExecutorService;

    .line 17
    .line 18
    new-instance v1, Li/d;

    .line 19
    .line 20
    .line 21
    invoke-direct {v1, p0}, Li/d;-><init>(Lai/advance/common/camera/GuardianCameraViewV2;)V

    .line 22
    .line 23
    .line 24
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

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
.end method

.method public i0()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lai/advance/common/camera/GuardianCameraViewV2;->getMainHandler()Lai/advance/common/camera/GuardianCameraViewV2$f;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lai/advance/common/camera/GuardianCameraViewV2$f;->c()V

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
    .line 3
    :try_start_0
    invoke-virtual {p0}, Lai/advance/common/camera/GuardianCameraViewV2;->M()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget-object v0, p0, Lai/advance/common/camera/GuardianCameraViewV2;->f:Landroid/hardware/Camera;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Landroid/hardware/Camera;->stopPreview()V

    .line 12
    .line 13
    iget-object v0, p0, Lai/advance/common/camera/GuardianCameraViewV2;->f:Landroid/hardware/Camera;

    .line 14
    const/4 v1, 0x0

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1}, Landroid/hardware/Camera;->setPreviewCallback(Landroid/hardware/Camera$PreviewCallback;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 18
    :catch_0
    :cond_0
    return-void
    .line 19
    .line 20
.end method

.method public k0()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lai/advance/common/camera/GuardianCameraViewV2;->X()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    .line 9
    invoke-static {}, Lk/c;->d()I

    .line 10
    move-result v0

    .line 11
    goto :goto_0

    .line 12
    .line 13
    .line 14
    :cond_0
    invoke-static {}, Lk/c;->f()I

    .line 15
    move-result v0

    .line 16
    .line 17
    .line 18
    :goto_0
    invoke-virtual {p0, v0}, Lai/advance/common/camera/GuardianCameraViewV2;->f0(I)V

    .line 19
    return-void
    .line 20
.end method

.method public l0()V
    .locals 6

    .line 1
    .line 2
    iget-object v0, p0, Lai/advance/common/camera/GuardianCameraViewV2;->g:Landroid/hardware/Camera$Size;

    .line 3
    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Lai/advance/common/camera/GuardianCameraViewV2;->getViewWidth()I

    .line 8
    move-result v0

    .line 9
    int-to-float v0, v0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Lai/advance/common/camera/GuardianCameraViewV2;->getViewHeight()I

    .line 13
    move-result v1

    .line 14
    int-to-float v1, v1

    .line 15
    .line 16
    iget-object v2, p0, Lai/advance/common/camera/GuardianCameraViewV2;->g:Landroid/hardware/Camera$Size;

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0, v2}, Lai/advance/common/camera/GuardianCameraViewV2;->W(Landroid/hardware/Camera$Size;)F

    .line 20
    move-result v2

    .line 21
    .line 22
    new-instance v3, Landroid/graphics/RectF;

    .line 23
    const/4 v4, 0x0

    .line 24
    .line 25
    .line 26
    invoke-direct {v3, v4, v4, v1, v0}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0}, Lai/advance/common/camera/GuardianCameraViewV2;->Y()Z

    .line 30
    move-result v5

    .line 31
    .line 32
    if-eqz v5, :cond_0

    .line 33
    .line 34
    new-instance v0, Landroid/graphics/RectF;

    .line 35
    mul-float/2addr v2, v1

    .line 36
    .line 37
    .line 38
    invoke-direct {v0, v4, v4, v1, v2}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0}, Landroid/graphics/RectF;->width()F

    .line 42
    move-result v1

    .line 43
    .line 44
    .line 45
    invoke-virtual {v3}, Landroid/graphics/RectF;->width()F

    .line 46
    move-result v2

    .line 47
    div-float/2addr v1, v2

    .line 48
    .line 49
    iput v1, p0, Lai/advance/common/camera/GuardianCameraViewV2;->x:F

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0}, Landroid/graphics/RectF;->height()F

    .line 53
    move-result v1

    .line 54
    .line 55
    .line 56
    invoke-virtual {v3}, Landroid/graphics/RectF;->height()F

    .line 57
    move-result v2

    .line 58
    div-float/2addr v1, v2

    .line 59
    .line 60
    iput v1, p0, Lai/advance/common/camera/GuardianCameraViewV2;->y:F

    .line 61
    goto :goto_0

    .line 62
    .line 63
    :cond_0
    new-instance v1, Landroid/graphics/RectF;

    .line 64
    .line 65
    div-float v2, v0, v2

    .line 66
    .line 67
    .line 68
    invoke-direct {v1, v4, v4, v2, v0}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v1}, Landroid/graphics/RectF;->height()F

    .line 72
    move-result v0

    .line 73
    .line 74
    .line 75
    invoke-virtual {v3}, Landroid/graphics/RectF;->height()F

    .line 76
    move-result v2

    .line 77
    div-float/2addr v0, v2

    .line 78
    .line 79
    iput v0, p0, Lai/advance/common/camera/GuardianCameraViewV2;->x:F

    .line 80
    .line 81
    .line 82
    invoke-virtual {v1}, Landroid/graphics/RectF;->width()F

    .line 83
    move-result v0

    .line 84
    .line 85
    .line 86
    invoke-virtual {v3}, Landroid/graphics/RectF;->width()F

    .line 87
    move-result v2

    .line 88
    div-float/2addr v0, v2

    .line 89
    .line 90
    iput v0, p0, Lai/advance/common/camera/GuardianCameraViewV2;->y:F

    .line 91
    move-object v0, v1

    .line 92
    .line 93
    .line 94
    :goto_0
    invoke-virtual {v0}, Landroid/graphics/RectF;->width()F

    .line 95
    move-result v1

    .line 96
    .line 97
    .line 98
    invoke-virtual {v3}, Landroid/graphics/RectF;->width()F

    .line 99
    move-result v2

    .line 100
    div-float/2addr v1, v2

    .line 101
    .line 102
    iput v1, p0, Lai/advance/common/camera/GuardianCameraViewV2;->x:F

    .line 103
    .line 104
    .line 105
    invoke-virtual {v0}, Landroid/graphics/RectF;->height()F

    .line 106
    move-result v1

    .line 107
    .line 108
    .line 109
    invoke-virtual {v3}, Landroid/graphics/RectF;->height()F

    .line 110
    move-result v2

    .line 111
    div-float/2addr v1, v2

    .line 112
    .line 113
    iput v1, p0, Lai/advance/common/camera/GuardianCameraViewV2;->y:F

    .line 114
    .line 115
    new-instance v1, Landroid/graphics/Matrix;

    .line 116
    .line 117
    .line 118
    invoke-direct {v1}, Landroid/graphics/Matrix;-><init>()V

    .line 119
    .line 120
    sget-object v2, Landroid/graphics/Matrix$ScaleToFit;->FILL:Landroid/graphics/Matrix$ScaleToFit;

    .line 121
    .line 122
    .line 123
    invoke-virtual {v1, v0, v3, v2}, Landroid/graphics/Matrix;->setRectToRect(Landroid/graphics/RectF;Landroid/graphics/RectF;Landroid/graphics/Matrix$ScaleToFit;)Z

    .line 124
    .line 125
    .line 126
    invoke-virtual {p0, v1}, Landroid/view/TextureView;->setTransform(Landroid/graphics/Matrix;)V

    .line 127
    :cond_1
    return-void
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
.end method

.method public onLayoutChange(Landroid/view/View;IIIIIIII)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 4
    move-result p1

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 8
    move-result p2

    .line 9
    .line 10
    iget p3, p0, Lai/advance/common/camera/GuardianCameraViewV2;->n:I

    .line 11
    .line 12
    if-ne p3, p1, :cond_1

    .line 13
    .line 14
    iget p1, p0, Lai/advance/common/camera/GuardianCameraViewV2;->o:I

    .line 15
    .line 16
    if-eq p1, p2, :cond_0

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    return-void

    .line 19
    .line 20
    .line 21
    :cond_1
    :goto_0
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 22
    move-result p1

    .line 23
    .line 24
    iput p1, p0, Lai/advance/common/camera/GuardianCameraViewV2;->n:I

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 28
    move-result p1

    .line 29
    .line 30
    iput p1, p0, Lai/advance/common/camera/GuardianCameraViewV2;->o:I

    .line 31
    .line 32
    iget-boolean p1, p0, Lai/advance/common/camera/GuardianCameraViewV2;->m:Z

    .line 33
    .line 34
    if-eqz p1, :cond_2

    .line 35
    .line 36
    iget p1, p0, Lai/advance/common/camera/GuardianCameraViewV2;->i:I

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0, p1}, Lai/advance/common/camera/GuardianCameraViewV2;->f0(I)V

    .line 40
    return-void

    .line 41
    .line 42
    .line 43
    :cond_2
    invoke-virtual {p0}, Lai/advance/common/camera/GuardianCameraViewV2;->M()Z

    .line 44
    move-result p1

    .line 45
    .line 46
    if-eqz p1, :cond_3

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0}, Lai/advance/common/camera/GuardianCameraViewV2;->l0()V

    .line 50
    :cond_3
    return-void
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
.end method

.method public onPreviewFrame([BLandroid/hardware/Camera;)V
    .locals 1

    .line 1
    .line 2
    if-nez p1, :cond_0

    .line 3
    return-void

    .line 4
    .line 5
    :cond_0
    iget-object p2, p0, Lai/advance/common/camera/GuardianCameraViewV2;->e:Lai/advance/common/camera/GuardianCameraViewV2$g;

    .line 6
    .line 7
    if-eqz p2, :cond_1

    .line 8
    .line 9
    iget-object v0, p0, Lai/advance/common/camera/GuardianCameraViewV2;->f:Landroid/hardware/Camera;

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    iget-object v0, p0, Lai/advance/common/camera/GuardianCameraViewV2;->g:Landroid/hardware/Camera$Size;

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    .line 18
    invoke-interface {p2, p1, v0}, Lai/advance/common/camera/GuardianCameraViewV2$g;->c([BLandroid/hardware/Camera$Size;)V

    .line 19
    .line 20
    .line 21
    :cond_1
    invoke-virtual {p0, p1}, Lai/advance/common/camera/GuardianCameraViewV2;->N([B)V

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
.end method

.method public setAutoFocusEnable(J)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    .line 3
    iput-boolean v0, p0, Lai/advance/common/camera/GuardianCameraViewV2;->r:Z

    .line 4
    .line 5
    iput-wide p1, p0, Lai/advance/common/camera/GuardianCameraViewV2;->c:J

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lai/advance/common/camera/GuardianCameraViewV2;->M()Z

    .line 9
    move-result p1

    .line 10
    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Lai/advance/common/camera/GuardianCameraViewV2;->g0()V

    .line 15
    :cond_0
    return-void
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

.method public setSoundPlayEnable(Z)V
    .locals 0

    .line 1
    .line 2
    iput-boolean p1, p0, Lai/advance/common/camera/GuardianCameraViewV2;->w:Z

    .line 3
    return-void
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
