.class public abstract Lcom/jumio/commons/camera/renderer/CameraRenderer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/graphics/SurfaceTexture$OnFrameAvailableListener;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0012\u0008&\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000e\u0010*\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u0013J:\u0010\u000c\u001a\u00020\u00172\u0006\u0010+\u001a\u00020\r2\u0014\u0010,\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00152\u0014\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0015J\u000e\u0010-\u001a\u00020\u00172\u0006\u0010.\u001a\u00020\u000fJ\u0006\u0010/\u001a\u00020\u0017J\u000e\u00100\u001a\u00020\u00172\u0006\u00101\u001a\u00020\u0011J\r\u00102\u001a\u0004\u0018\u00010\u0017\u00a2\u0006\u0002\u00103J\u0006\u00104\u001a\u00020\u0017J\u0008\u00105\u001a\u00020\u0017H\u0017J\u0008\u00106\u001a\u00020\u000bH\u0016J\u0008\u00107\u001a\u00020\u0017H\u0002J\u0010\u00108\u001a\u00020\u00172\u0006\u0010.\u001a\u00020\u000fH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000c\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\r@BX\u0084\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\u001dX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u001e\u0010\u001f\"\u0004\u0008 \u0010!R\u0011\u0010\"\u001a\u00020#\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008$\u0010%R\u0011\u0010&\u001a\u00020\'8F\u00a2\u0006\u0006\u001a\u0004\u0008(\u0010)\u00a8\u00069"
    }
    d2 = {
        "Lcom/jumio/commons/camera/renderer/CameraRenderer;",
        "Landroid/graphics/SurfaceTexture$OnFrameAvailableListener;",
        "<init>",
        "()V",
        "thread",
        "Landroid/os/HandlerThread;",
        "handler",
        "Landroid/os/Handler;",
        "openGlRenderer",
        "Lcom/jumio/commons/camera/renderer/opengl/OpenGlRenderer;",
        "textureTransform",
        "",
        "enableShader",
        "",
        "inputSurfaceTexture",
        "Landroid/graphics/SurfaceTexture;",
        "outputSurface",
        "Landroid/view/Surface;",
        "shaderProvider",
        "Lcom/jumio/commons/camera/renderer/opengl/ShaderProvider;",
        "onRender",
        "Lkotlin/Function1;",
        "Lcom/jumio/commons/camera/renderer/opengl/GLUtils$Program2D;",
        "",
        "freezePreview",
        "value",
        "isReleased",
        "()Z",
        "frameSize",
        "Lcom/jumio/commons/camera/Size;",
        "getFrameSize",
        "()Lcom/jumio/commons/camera/Size;",
        "setFrameSize",
        "(Lcom/jumio/commons/camera/Size;)V",
        "executor",
        "Ljava/util/concurrent/ExecutorService;",
        "getExecutor",
        "()Ljava/util/concurrent/ExecutorService;",
        "textureName",
        "",
        "getTextureName",
        "()I",
        "setShader",
        "enable",
        "onEnable",
        "registerInputSurface",
        "surfaceTexture",
        "unregisterInputSurface",
        "registerOutputSurface",
        "surface",
        "unregisterOutputSurface",
        "()Lkotlin/Unit;",
        "release",
        "releaseInternal",
        "getRenderTransform",
        "checkGlThread",
        "onFrameAvailable",
        "jumio-core_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nCameraRenderer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CameraRenderer.kt\ncom/jumio/commons/camera/renderer/CameraRenderer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,229:1\n1#2:230\n*E\n"
    }
.end annotation


# instance fields
.field public final a:Landroid/os/HandlerThread;

.field public final b:Landroid/os/Handler;

.field public final c:Lcom/jumio/commons/camera/renderer/opengl/OpenGlRenderer;

.field public final d:[F

.field public e:Z

.field public f:Landroid/graphics/SurfaceTexture;

.field public g:Landroid/view/Surface;

.field public h:Lcom/jumio/commons/camera/renderer/opengl/ShaderProvider;

.field public i:Lkotlin/jvm/functions/Function1;

.field public j:Z

.field public k:Z

.field public l:Lcom/jumio/commons/camera/Size;

.field public final m:Ljumio/core/N1;


# direct methods
.method public constructor <init>()V
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    new-instance v0, Landroid/os/HandlerThread;

    .line 6
    .line 7
    const-string v1, "CameraRenderer"

    .line 8
    .line 9
    .line 10
    invoke-direct {v0, v1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    iput-object v0, p0, Lcom/jumio/commons/camera/renderer/CameraRenderer;->a:Landroid/os/HandlerThread;

    .line 13
    .line 14
    new-instance v1, Lcom/jumio/commons/camera/renderer/opengl/OpenGlRenderer;

    .line 15
    .line 16
    .line 17
    invoke-direct {v1}, Lcom/jumio/commons/camera/renderer/opengl/OpenGlRenderer;-><init>()V

    .line 18
    .line 19
    iput-object v1, p0, Lcom/jumio/commons/camera/renderer/CameraRenderer;->c:Lcom/jumio/commons/camera/renderer/opengl/OpenGlRenderer;

    .line 20
    .line 21
    const/16 v1, 0x10

    .line 22
    .line 23
    new-array v1, v1, [F

    .line 24
    .line 25
    iput-object v1, p0, Lcom/jumio/commons/camera/renderer/CameraRenderer;->d:[F

    .line 26
    .line 27
    new-instance v1, Lcom/jumio/commons/camera/Size;

    .line 28
    .line 29
    const/16 v2, 0x438

    .line 30
    .line 31
    const/16 v3, 0x780

    .line 32
    .line 33
    .line 34
    invoke-direct {v1, v2, v3}, Lcom/jumio/commons/camera/Size;-><init>(II)V

    .line 35
    .line 36
    iput-object v1, p0, Lcom/jumio/commons/camera/renderer/CameraRenderer;->l:Lcom/jumio/commons/camera/Size;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 40
    .line 41
    new-instance v1, Landroid/os/Handler;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    .line 45
    move-result-object v0

    .line 46
    .line 47
    .line 48
    invoke-direct {v1, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 49
    .line 50
    iput-object v1, p0, Lcom/jumio/commons/camera/renderer/CameraRenderer;->b:Landroid/os/Handler;

    .line 51
    .line 52
    new-instance v0, Ljumio/core/N1;

    .line 53
    .line 54
    .line 55
    invoke-direct {v0, v1}, Ljumio/core/N1;-><init>(Landroid/os/Handler;)V

    .line 56
    .line 57
    iput-object v0, p0, Lcom/jumio/commons/camera/renderer/CameraRenderer;->m:Ljumio/core/N1;

    .line 58
    .line 59
    new-instance v1, Lg9/f;

    .line 60
    .line 61
    .line 62
    invoke-direct {v1, p0}, Lg9/f;-><init>(Lcom/jumio/commons/camera/renderer/CameraRenderer;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0, v1}, Ljumio/core/N1;->execute(Ljava/lang/Runnable;)V

    .line 66
    return-void
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

.method public static final a()Lcom/jumio/commons/camera/renderer/utils/OpenGLInterface;
    .locals 1

    .line 15
    new-instance v0, Lcom/jumio/commons/camera/renderer/utils/DefaultOpenGLInterface;

    invoke-direct {v0}, Lcom/jumio/commons/camera/renderer/utils/DefaultOpenGLInterface;-><init>()V

    return-object v0
.end method

.method public static final a(ZLcom/jumio/commons/camera/renderer/CameraRenderer;Lkotlin/jvm/functions/Function1;Ljumio/core/C1;)Lkotlin/Unit;
    .locals 1

    const-string v0, "program"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p0, :cond_0

    .line 16
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0

    :cond_0
    const/high16 p0, 0x40000000    # 2.0f

    .line 17
    invoke-virtual {p3, p0}, Ljumio/core/C1;->b(F)V

    .line 18
    iget-object p0, p1, Lcom/jumio/commons/camera/renderer/CameraRenderer;->l:Lcom/jumio/commons/camera/Size;

    invoke-virtual {p0}, Lcom/jumio/commons/camera/Size;->getWidth()I

    move-result p0

    int-to-float p0, p0

    iget-object p1, p1, Lcom/jumio/commons/camera/renderer/CameraRenderer;->l:Lcom/jumio/commons/camera/Size;

    invoke-virtual {p1}, Lcom/jumio/commons/camera/Size;->getHeight()I

    move-result p1

    int-to-float p1, p1

    invoke-virtual {p3, p0, p1}, Ljumio/core/C1;->a(FF)V

    const/high16 p0, 0x3f800000    # 1.0f

    .line 19
    invoke-virtual {p3, p0}, Ljumio/core/C1;->a(F)V

    const/4 p0, 0x3

    .line 20
    invoke-virtual {p3, p0}, Ljumio/core/C1;->a(I)V

    if-eqz p2, :cond_1

    .line 21
    invoke-interface {p2, p3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    :cond_1
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final a(Lcom/jumio/commons/camera/renderer/CameraRenderer;)V
    .locals 1

    .line 1
    :try_start_0
    iget-object p0, p0, Lcom/jumio/commons/camera/renderer/CameraRenderer;->c:Lcom/jumio/commons/camera/renderer/opengl/OpenGlRenderer;

    sget-object v0, Ljumio/core/e1;->c:Lcom/jumio/commons/camera/renderer/graphics/DynamicRange$Companion;

    invoke-virtual {v0}, Lcom/jumio/commons/camera/renderer/graphics/DynamicRange$Companion;->getSDR()Ljumio/core/e1;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/jumio/commons/camera/renderer/opengl/OpenGlRenderer;->init(Ljumio/core/e1;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p0

    .line 2
    invoke-static {p0}, Lcom/jumio/commons/log/Log;->printStackTrace(Ljava/lang/Throwable;)V

    return-void
.end method

.method public static final a(Lcom/jumio/commons/camera/renderer/CameraRenderer;Lcom/jumio/commons/camera/renderer/opengl/ShaderProvider;)V
    .locals 2

    .line 3
    :try_start_0
    iget-object p0, p0, Lcom/jumio/commons/camera/renderer/CameraRenderer;->c:Lcom/jumio/commons/camera/renderer/opengl/OpenGlRenderer;

    sget-object v0, Ljumio/core/e1;->c:Lcom/jumio/commons/camera/renderer/graphics/DynamicRange$Companion;

    invoke-virtual {v0}, Lcom/jumio/commons/camera/renderer/graphics/DynamicRange$Companion;->getSDR()Ljumio/core/e1;

    move-result-object v0

    sget-object v1, Ljumio/core/B1;->b:Ljumio/core/B1;

    invoke-static {v1, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    invoke-static {p1}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lcom/jumio/commons/camera/renderer/opengl/OpenGlRenderer;->setShader(Ljumio/core/e1;Ljava/util/Map;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p0

    .line 4
    invoke-static {p0}, Lcom/jumio/commons/log/Log;->printStackTrace(Ljava/lang/Throwable;)V

    return-void
.end method

.method public static final a(Lcom/jumio/commons/camera/renderer/CameraRenderer;Lkotlin/jvm/functions/Function1;ZLkotlin/jvm/functions/Function1;)V
    .locals 2

    .line 5
    iput-object p1, p0, Lcom/jumio/commons/camera/renderer/CameraRenderer;->i:Lkotlin/jvm/functions/Function1;

    .line 6
    iget-boolean p1, p0, Lcom/jumio/commons/camera/renderer/CameraRenderer;->j:Z

    if-eqz p1, :cond_0

    if-nez p2, :cond_0

    const/4 p1, 0x0

    .line 7
    iput-boolean p1, p0, Lcom/jumio/commons/camera/renderer/CameraRenderer;->j:Z

    .line 8
    :cond_0
    iget-boolean p1, p0, Lcom/jumio/commons/camera/renderer/CameraRenderer;->e:Z

    if-ne p2, p1, :cond_1

    goto :goto_0

    .line 9
    :cond_1
    iput-boolean p2, p0, Lcom/jumio/commons/camera/renderer/CameraRenderer;->e:Z

    .line 10
    :try_start_0
    sget-object p1, Lcom/jumio/core/ServiceLocator;->INSTANCE:Lcom/jumio/core/ServiceLocator;

    const-class v0, Lcom/jumio/commons/camera/renderer/utils/OpenGLInterface;

    new-instance v1, Lg9/c;

    invoke-direct {v1}, Lg9/c;-><init>()V

    invoke-virtual {p1, v0, v1}, Lcom/jumio/core/ServiceLocator;->getServiceImplementation(Ljava/lang/Class;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/jumio/commons/camera/renderer/utils/OpenGLInterface;

    .line 11
    invoke-interface {p1}, Lcom/jumio/commons/camera/renderer/utils/OpenGLInterface;->onEnableShader()V

    .line 12
    iget-object p1, p0, Lcom/jumio/commons/camera/renderer/CameraRenderer;->c:Lcom/jumio/commons/camera/renderer/opengl/OpenGlRenderer;

    new-instance v0, Lg9/d;

    invoke-direct {v0, p2, p0, p3}, Lg9/d;-><init>(ZLcom/jumio/commons/camera/renderer/CameraRenderer;Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, p2, v0}, Lcom/jumio/commons/camera/renderer/opengl/OpenGlRenderer;->enableProgram(ZLkotlin/jvm/functions/Function1;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 13
    invoke-static {p1}, Lcom/jumio/commons/log/Log;->printStackTrace(Ljava/lang/Throwable;)V

    .line 14
    iput-boolean p2, p0, Lcom/jumio/commons/camera/renderer/CameraRenderer;->j:Z

    :goto_0
    return-void
.end method

.method public static final b(Lcom/jumio/commons/camera/renderer/CameraRenderer;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/jumio/commons/camera/renderer/CameraRenderer;->releaseInternal()V

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


# virtual methods
.method public final declared-synchronized enableShader(ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V
    .locals 2
    .param p2    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljumio/core/C1;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljumio/core/C1;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 1
    monitor-enter p0

    .line 2
    .line 3
    :try_start_0
    iget-object v0, p0, Lcom/jumio/commons/camera/renderer/CameraRenderer;->b:Landroid/os/Handler;

    .line 4
    .line 5
    new-instance v1, Lg9/b;

    .line 6
    .line 7
    .line 8
    invoke-direct {v1, p0, p3, p1, p2}, Lg9/b;-><init>(Lcom/jumio/commons/camera/renderer/CameraRenderer;Lkotlin/jvm/functions/Function1;ZLkotlin/jvm/functions/Function1;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    monitor-exit p0

    .line 13
    return-void

    .line 14
    :catchall_0
    move-exception p1

    .line 15
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 16
    throw p1
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
.end method

.method public final getExecutor()Ljava/util/concurrent/ExecutorService;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/commons/camera/renderer/CameraRenderer;->m:Ljumio/core/N1;

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
.end method

.method public final getFrameSize()Lcom/jumio/commons/camera/Size;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/commons/camera/renderer/CameraRenderer;->l:Lcom/jumio/commons/camera/Size;

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
.end method

.method public getRenderTransform()[F
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/commons/camera/renderer/CameraRenderer;->d:[F

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
.end method

.method public final getTextureName()I
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/commons/camera/renderer/CameraRenderer;->c:Lcom/jumio/commons/camera/renderer/opengl/OpenGlRenderer;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/jumio/commons/camera/renderer/opengl/OpenGlRenderer;->getTextureName()I

    .line 6
    move-result v0

    .line 7
    return v0
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
.end method

.method public final isReleased()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/jumio/commons/camera/renderer/CameraRenderer;->k:Z

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
.end method

.method public onFrameAvailable(Landroid/graphics/SurfaceTexture;)V
    .locals 7
    .param p1    # Landroid/graphics/SurfaceTexture;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "surfaceTexture"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    :try_start_0
    const-string v0, "CameraRenderer"

    .line 8
    .line 9
    .line 10
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 11
    move-result-object v1

    .line 12
    .line 13
    .line 14
    invoke-virtual {v1}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 15
    move-result-object v1

    .line 16
    .line 17
    .line 18
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 19
    move-result v0

    .line 20
    .line 21
    if-eqz v0, :cond_2

    .line 22
    .line 23
    iget-boolean v0, p0, Lcom/jumio/commons/camera/renderer/CameraRenderer;->k:Z

    .line 24
    .line 25
    if-eqz v0, :cond_0

    .line 26
    goto :goto_1

    .line 27
    .line 28
    .line 29
    :cond_0
    invoke-virtual {p1}, Landroid/graphics/SurfaceTexture;->updateTexImage()V

    .line 30
    .line 31
    iget-object v0, p0, Lcom/jumio/commons/camera/renderer/CameraRenderer;->d:[F

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1, v0}, Landroid/graphics/SurfaceTexture;->getTransformMatrix([F)V

    .line 35
    .line 36
    iget-boolean v0, p0, Lcom/jumio/commons/camera/renderer/CameraRenderer;->j:Z

    .line 37
    .line 38
    if-eqz v0, :cond_1

    .line 39
    goto :goto_1

    .line 40
    .line 41
    :cond_1
    iget-object v5, p0, Lcom/jumio/commons/camera/renderer/CameraRenderer;->g:Landroid/view/Surface;

    .line 42
    .line 43
    if-eqz v5, :cond_3

    .line 44
    .line 45
    iget-object v1, p0, Lcom/jumio/commons/camera/renderer/CameraRenderer;->c:Lcom/jumio/commons/camera/renderer/opengl/OpenGlRenderer;

    .line 46
    .line 47
    .line 48
    invoke-virtual {p1}, Landroid/graphics/SurfaceTexture;->getTimestamp()J

    .line 49
    move-result-wide v2

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0}, Lcom/jumio/commons/camera/renderer/CameraRenderer;->getRenderTransform()[F

    .line 53
    move-result-object v4

    .line 54
    .line 55
    iget-object v6, p0, Lcom/jumio/commons/camera/renderer/CameraRenderer;->i:Lkotlin/jvm/functions/Function1;

    .line 56
    .line 57
    .line 58
    invoke-virtual/range {v1 .. v6}, Lcom/jumio/commons/camera/renderer/opengl/OpenGlRenderer;->render(J[FLandroid/view/Surface;Lkotlin/jvm/functions/Function1;)V

    .line 59
    return-void

    .line 60
    :catch_0
    move-exception v0

    .line 61
    move-object p1, v0

    .line 62
    goto :goto_0

    .line 63
    .line 64
    :cond_2
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 65
    .line 66
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 67
    .line 68
    .line 69
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 70
    move-result-object p1

    .line 71
    .line 72
    .line 73
    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 74
    throw v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 75
    .line 76
    .line 77
    :goto_0
    invoke-static {p1}, Lcom/jumio/commons/log/Log;->printStackTrace(Ljava/lang/Throwable;)V

    .line 78
    :cond_3
    :goto_1
    return-void
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
.end method

.method public final registerInputSurface(Landroid/graphics/SurfaceTexture;)V
    .locals 2
    .param p1    # Landroid/graphics/SurfaceTexture;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "surfaceTexture"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    :try_start_0
    const-string v0, "CameraRenderer"

    .line 8
    .line 9
    .line 10
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 11
    move-result-object v1

    .line 12
    .line 13
    .line 14
    invoke-virtual {v1}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 15
    move-result-object v1

    .line 16
    .line 17
    .line 18
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 19
    move-result v0

    .line 20
    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0}, Lcom/jumio/commons/camera/renderer/CameraRenderer;->unregisterInputSurface()V

    .line 25
    .line 26
    iput-object p1, p0, Lcom/jumio/commons/camera/renderer/CameraRenderer;->f:Landroid/graphics/SurfaceTexture;

    .line 27
    .line 28
    iget-object v0, p0, Lcom/jumio/commons/camera/renderer/CameraRenderer;->b:Landroid/os/Handler;

    .line 29
    .line 30
    .line 31
    invoke-virtual {p1, p0, v0}, Landroid/graphics/SurfaceTexture;->setOnFrameAvailableListener(Landroid/graphics/SurfaceTexture$OnFrameAvailableListener;Landroid/os/Handler;)V

    .line 32
    return-void

    .line 33
    :catch_0
    move-exception p1

    .line 34
    goto :goto_0

    .line 35
    .line 36
    :cond_0
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 37
    .line 38
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 42
    move-result-object p1

    .line 43
    .line 44
    .line 45
    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 46
    throw v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 47
    .line 48
    .line 49
    :goto_0
    invoke-static {p1}, Lcom/jumio/commons/log/Log;->printStackTrace(Ljava/lang/Throwable;)V

    .line 50
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
.end method

.method public final registerOutputSurface(Landroid/view/Surface;)V
    .locals 2
    .param p1    # Landroid/view/Surface;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "surface"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    :try_start_0
    const-string v0, "CameraRenderer"

    .line 8
    .line 9
    .line 10
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 11
    move-result-object v1

    .line 12
    .line 13
    .line 14
    invoke-virtual {v1}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 15
    move-result-object v1

    .line 16
    .line 17
    .line 18
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 19
    move-result v0

    .line 20
    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0}, Lcom/jumio/commons/camera/renderer/CameraRenderer;->unregisterOutputSurface()Lkotlin/Unit;

    .line 25
    .line 26
    iput-object p1, p0, Lcom/jumio/commons/camera/renderer/CameraRenderer;->g:Landroid/view/Surface;

    .line 27
    .line 28
    iget-object v0, p0, Lcom/jumio/commons/camera/renderer/CameraRenderer;->c:Lcom/jumio/commons/camera/renderer/opengl/OpenGlRenderer;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, p1}, Lcom/jumio/commons/camera/renderer/opengl/OpenGlRenderer;->registerOutputSurface(Landroid/view/Surface;)V

    .line 32
    return-void

    .line 33
    :catch_0
    move-exception p1

    .line 34
    goto :goto_0

    .line 35
    .line 36
    :cond_0
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 37
    .line 38
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 42
    move-result-object p1

    .line 43
    .line 44
    .line 45
    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 46
    throw v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 47
    .line 48
    .line 49
    :goto_0
    invoke-static {p1}, Lcom/jumio/commons/log/Log;->printStackTrace(Ljava/lang/Throwable;)V

    .line 50
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
.end method

.method public final release()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/commons/camera/renderer/CameraRenderer;->m:Ljumio/core/N1;

    .line 3
    .line 4
    new-instance v1, Lg9/a;

    .line 5
    .line 6
    .line 7
    invoke-direct {v1, p0}, Lg9/a;-><init>(Lcom/jumio/commons/camera/renderer/CameraRenderer;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljumio/core/N1;->execute(Ljava/lang/Runnable;)V

    .line 11
    return-void
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
.end method

.method public releaseInternal()V
    .locals 2
    .annotation build Landroidx/annotation/CallSuper;
    .end annotation

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/jumio/commons/camera/renderer/CameraRenderer;->k:Z

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    return-void

    .line 6
    .line 7
    :cond_0
    :try_start_0
    const-string v0, "CameraRenderer"

    .line 8
    .line 9
    .line 10
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 11
    move-result-object v1

    .line 12
    .line 13
    .line 14
    invoke-virtual {v1}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 15
    move-result-object v1

    .line 16
    .line 17
    .line 18
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 19
    move-result v0

    .line 20
    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0}, Lcom/jumio/commons/camera/renderer/CameraRenderer;->unregisterInputSurface()V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, Lcom/jumio/commons/camera/renderer/CameraRenderer;->unregisterOutputSurface()Lkotlin/Unit;

    .line 28
    .line 29
    iget-object v0, p0, Lcom/jumio/commons/camera/renderer/CameraRenderer;->c:Lcom/jumio/commons/camera/renderer/opengl/OpenGlRenderer;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0}, Lcom/jumio/commons/camera/renderer/opengl/OpenGlRenderer;->release()V

    .line 33
    goto :goto_1

    .line 34
    :catch_0
    move-exception v0

    .line 35
    goto :goto_0

    .line 36
    .line 37
    :cond_1
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 38
    .line 39
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 43
    move-result-object v0

    .line 44
    .line 45
    .line 46
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 47
    throw v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 48
    .line 49
    .line 50
    :goto_0
    invoke-static {v0}, Lcom/jumio/commons/log/Log;->printStackTrace(Ljava/lang/Throwable;)V

    .line 51
    .line 52
    :goto_1
    iget-object v0, p0, Lcom/jumio/commons/camera/renderer/CameraRenderer;->a:Landroid/os/HandlerThread;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0}, Landroid/os/HandlerThread;->quitSafely()Z

    .line 56
    .line 57
    iget-object v0, p0, Lcom/jumio/commons/camera/renderer/CameraRenderer;->m:Ljumio/core/N1;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0}, Ljumio/core/N1;->shutdown()V

    .line 61
    .line 62
    iget-object v0, p0, Lcom/jumio/commons/camera/renderer/CameraRenderer;->b:Landroid/os/Handler;

    .line 63
    const/4 v1, 0x0

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 67
    const/4 v0, 0x1

    .line 68
    .line 69
    iput-boolean v0, p0, Lcom/jumio/commons/camera/renderer/CameraRenderer;->k:Z

    .line 70
    return-void
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

.method public final setFrameSize(Lcom/jumio/commons/camera/Size;)V
    .locals 1
    .param p1    # Lcom/jumio/commons/camera/Size;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "<set-?>"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iput-object p1, p0, Lcom/jumio/commons/camera/renderer/CameraRenderer;->l:Lcom/jumio/commons/camera/Size;

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
.end method

.method public final setShader(Lcom/jumio/commons/camera/renderer/opengl/ShaderProvider;)V
    .locals 2
    .param p1    # Lcom/jumio/commons/camera/renderer/opengl/ShaderProvider;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "shaderProvider"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v0, p0, Lcom/jumio/commons/camera/renderer/CameraRenderer;->h:Lcom/jumio/commons/camera/renderer/opengl/ShaderProvider;

    .line 8
    .line 9
    .line 10
    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 11
    move-result v0

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    return-void

    .line 15
    .line 16
    :cond_0
    iput-object p1, p0, Lcom/jumio/commons/camera/renderer/CameraRenderer;->h:Lcom/jumio/commons/camera/renderer/opengl/ShaderProvider;

    .line 17
    .line 18
    iget-object v0, p0, Lcom/jumio/commons/camera/renderer/CameraRenderer;->b:Landroid/os/Handler;

    .line 19
    .line 20
    new-instance v1, Lg9/e;

    .line 21
    .line 22
    .line 23
    invoke-direct {v1, p0, p1}, Lg9/e;-><init>(Lcom/jumio/commons/camera/renderer/CameraRenderer;Lcom/jumio/commons/camera/renderer/opengl/ShaderProvider;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 27
    return-void
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
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
.end method

.method public final unregisterInputSurface()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/commons/camera/renderer/CameraRenderer;->f:Landroid/graphics/SurfaceTexture;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, v1}, Landroid/graphics/SurfaceTexture;->setOnFrameAvailableListener(Landroid/graphics/SurfaceTexture$OnFrameAvailableListener;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Landroid/graphics/SurfaceTexture;->release()V

    .line 12
    .line 13
    :cond_0
    iput-object v1, p0, Lcom/jumio/commons/camera/renderer/CameraRenderer;->f:Landroid/graphics/SurfaceTexture;

    .line 14
    return-void
    .line 15
    .line 16
.end method

.method public final unregisterOutputSurface()Lkotlin/Unit;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/jumio/commons/camera/renderer/CameraRenderer;->g:Landroid/view/Surface;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iget-object v1, p0, Lcom/jumio/commons/camera/renderer/CameraRenderer;->c:Lcom/jumio/commons/camera/renderer/opengl/OpenGlRenderer;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v1, v0}, Lcom/jumio/commons/camera/renderer/opengl/OpenGlRenderer;->unregisterOutputSurface(Landroid/view/Surface;)V

    .line 10
    .line 11
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 12
    return-object v0

    .line 13
    :catch_0
    move-exception v0

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 v0, 0x0

    .line 16
    return-object v0

    .line 17
    .line 18
    .line 19
    :goto_0
    invoke-static {v0}, Lcom/jumio/commons/log/Log;->printStackTrace(Ljava/lang/Throwable;)V

    .line 20
    .line 21
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 22
    return-object v0
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
.end method
