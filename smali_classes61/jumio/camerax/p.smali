.class public final Ljumio/camerax/p;
.super Lcom/jumio/commons/camera/renderer/CameraRenderer;
.source "SourceFile"

# interfaces
.implements Landroidx/camera/core/SurfaceProcessor;


# instance fields
.field public n:Landroid/view/Surface;

.field public o:Landroidx/camera/core/SurfaceOutput;

.field public final p:[F


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/jumio/commons/camera/renderer/CameraRenderer;-><init>()V

    .line 4
    .line 5
    const/16 v0, 0x10

    .line 6
    .line 7
    new-array v0, v0, [F

    .line 8
    .line 9
    iput-object v0, p0, Ljumio/camerax/p;->p:[F

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
.end method

.method public static final a(Ljumio/camerax/p;Landroid/view/Surface;Landroidx/camera/core/SurfaceRequest$Result;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/jumio/commons/camera/renderer/CameraRenderer;->unregisterInputSurface()V

    .line 2
    invoke-virtual {p1}, Landroid/view/Surface;->release()V

    return-void
.end method

.method public static final a(Ljumio/camerax/p;Landroidx/camera/core/SurfaceOutput$Event;)V
    .locals 0

    .line 3
    iget-object p1, p0, Ljumio/camerax/p;->o:Landroidx/camera/core/SurfaceOutput;

    if-eqz p1, :cond_0

    invoke-interface {p1}, Landroidx/camera/core/SurfaceOutput;->close()V

    .line 4
    :cond_0
    invoke-virtual {p0}, Lcom/jumio/commons/camera/renderer/CameraRenderer;->unregisterOutputSurface()Lkotlin/Unit;

    return-void
.end method


# virtual methods
.method public final getRenderTransform()[F
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Ljumio/camerax/p;->o:Landroidx/camera/core/SurfaceOutput;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iget-object v1, p0, Ljumio/camerax/p;->p:[F

    .line 7
    .line 8
    .line 9
    invoke-super {p0}, Lcom/jumio/commons/camera/renderer/CameraRenderer;->getRenderTransform()[F

    .line 10
    move-result-object v2

    .line 11
    .line 12
    .line 13
    invoke-interface {v0, v1, v2}, Landroidx/camera/core/SurfaceOutput;->updateTransformMatrix([F[F)V

    .line 14
    .line 15
    :cond_0
    iget-object v0, p0, Ljumio/camerax/p;->p:[F

    .line 16
    return-object v0
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final onInputSurface(Landroidx/camera/core/SurfaceRequest;)V
    .locals 4

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "surfaceRequest"

    .line 4
    .line 5
    .line 6
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    new-instance v0, Landroid/graphics/SurfaceTexture;

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/jumio/commons/camera/renderer/CameraRenderer;->getTextureName()I

    .line 12
    move-result v1

    .line 13
    .line 14
    .line 15
    invoke-direct {v0, v1}, Landroid/graphics/SurfaceTexture;-><init>(I)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1}, Landroidx/camera/core/SurfaceRequest;->getResolution()Landroid/util/Size;

    .line 19
    move-result-object v1

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1}, Landroid/util/Size;->getWidth()I

    .line 23
    move-result v1

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1}, Landroidx/camera/core/SurfaceRequest;->getResolution()Landroid/util/Size;

    .line 27
    move-result-object v2

    .line 28
    .line 29
    .line 30
    invoke-virtual {v2}, Landroid/util/Size;->getHeight()I

    .line 31
    move-result v2

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0, v1, v2}, Landroid/graphics/SurfaceTexture;->setDefaultBufferSize(II)V

    .line 35
    .line 36
    new-instance v1, Landroid/view/Surface;

    .line 37
    .line 38
    .line 39
    invoke-direct {v1, v0}, Landroid/view/Surface;-><init>(Landroid/graphics/SurfaceTexture;)V

    .line 40
    .line 41
    iput-object v1, p0, Ljumio/camerax/p;->n:Landroid/view/Surface;

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0}, Lcom/jumio/commons/camera/renderer/CameraRenderer;->getExecutor()Ljava/util/concurrent/ExecutorService;

    .line 45
    move-result-object v2

    .line 46
    .line 47
    new-instance v3, Lkg0/d;

    .line 48
    .line 49
    .line 50
    invoke-direct {v3, p0, v1}, Lkg0/d;-><init>(Ljumio/camerax/p;Landroid/view/Surface;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p1, v1, v2, v3}, Landroidx/camera/core/SurfaceRequest;->provideSurface(Landroid/view/Surface;Ljava/util/concurrent/Executor;Landroidx/core/util/Consumer;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p0, v0}, Lcom/jumio/commons/camera/renderer/CameraRenderer;->registerInputSurface(Landroid/graphics/SurfaceTexture;)V

    .line 57
    return-void
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
.end method

.method public final onOutputSurface(Landroidx/camera/core/SurfaceOutput;)V
    .locals 2

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "surfaceOutput"

    .line 4
    .line 5
    .line 6
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/jumio/commons/camera/renderer/CameraRenderer;->isReleased()Z

    .line 10
    move-result v0

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    .line 15
    invoke-interface {p1}, Landroidx/camera/core/SurfaceOutput;->close()V

    .line 16
    return-void

    .line 17
    .line 18
    .line 19
    :cond_0
    invoke-virtual {p0}, Lcom/jumio/commons/camera/renderer/CameraRenderer;->getExecutor()Ljava/util/concurrent/ExecutorService;

    .line 20
    move-result-object v0

    .line 21
    .line 22
    new-instance v1, Lkg0/c;

    .line 23
    .line 24
    .line 25
    invoke-direct {v1, p0}, Lkg0/c;-><init>(Ljumio/camerax/p;)V

    .line 26
    .line 27
    .line 28
    invoke-interface {p1, v0, v1}, Landroidx/camera/core/SurfaceOutput;->getSurface(Ljava/util/concurrent/Executor;Landroidx/core/util/Consumer;)Landroid/view/Surface;

    .line 29
    move-result-object v0

    .line 30
    .line 31
    const-string v1, "getSurface(...)"

    .line 32
    .line 33
    .line 34
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0, v0}, Lcom/jumio/commons/camera/renderer/CameraRenderer;->registerOutputSurface(Landroid/view/Surface;)V

    .line 38
    .line 39
    iput-object p1, p0, Ljumio/camerax/p;->o:Landroidx/camera/core/SurfaceOutput;

    .line 40
    return-void
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
.end method

.method public final releaseInternal()V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Ljumio/camerax/p;->n:Landroid/view/Surface;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/view/Surface;->release()V

    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    .line 10
    iput-object v0, p0, Ljumio/camerax/p;->n:Landroid/view/Surface;

    .line 11
    .line 12
    iget-object v0, p0, Ljumio/camerax/p;->o:Landroidx/camera/core/SurfaceOutput;

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    .line 17
    invoke-interface {v0}, Landroidx/camera/core/SurfaceOutput;->close()V

    .line 18
    .line 19
    .line 20
    :cond_1
    invoke-super {p0}, Lcom/jumio/commons/camera/renderer/CameraRenderer;->releaseInternal()V

    .line 21
    return-void
.end method
