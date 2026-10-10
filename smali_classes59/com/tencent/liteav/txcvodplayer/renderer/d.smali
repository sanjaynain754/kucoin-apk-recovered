.class public final Lcom/tencent/liteav/txcvodplayer/renderer/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/graphics/SurfaceTexture$OnFrameAvailableListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/liteav/txcvodplayer/renderer/d$a;
    }
.end annotation


# instance fields
.field public a:Lcom/tencent/liteav/base/util/CustomHandler;

.field protected b:Lcom/tencent/liteav/videobase/egl/EGLCore;

.field private c:Lcom/tencent/liteav/videoconsumer/renderer/u;

.field private d:Lcom/tencent/liteav/videobase/videobase/DisplayTarget;

.field private e:Lcom/tencent/liteav/videobase/base/GLConstants$GLScaleType;

.field private f:Lcom/tencent/liteav/base/util/l;

.field private g:Landroid/graphics/SurfaceTexture;

.field private h:I

.field private i:Lcom/tencent/liteav/videobase/frame/PixelFrame;

.field private j:Lcom/tencent/liteav/videobase/frame/k;

.field private k:Lcom/tencent/liteav/videobase/frame/i;

.field private l:Lcom/tencent/liteav/videobase/frame/e;

.field private final m:[F

.field private n:I

.field private o:I

.field private final p:Lcom/tencent/liteav/txcvodplayer/renderer/d$a;


# direct methods
.method public constructor <init>(Lcom/tencent/liteav/txcvodplayer/renderer/d$a;)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    sget-object v0, Lcom/tencent/liteav/videobase/base/GLConstants$GLScaleType;->b:Lcom/tencent/liteav/videobase/base/GLConstants$GLScaleType;

    .line 6
    .line 7
    iput-object v0, p0, Lcom/tencent/liteav/txcvodplayer/renderer/d;->e:Lcom/tencent/liteav/videobase/base/GLConstants$GLScaleType;

    .line 8
    .line 9
    sget-object v0, Lcom/tencent/liteav/base/util/l;->a:Lcom/tencent/liteav/base/util/l;

    .line 10
    .line 11
    iput-object v0, p0, Lcom/tencent/liteav/txcvodplayer/renderer/d;->f:Lcom/tencent/liteav/base/util/l;

    .line 12
    const/4 v0, -0x1

    .line 13
    .line 14
    iput v0, p0, Lcom/tencent/liteav/txcvodplayer/renderer/d;->h:I

    .line 15
    .line 16
    const/16 v0, 0x10

    .line 17
    .line 18
    new-array v0, v0, [F

    .line 19
    .line 20
    iput-object v0, p0, Lcom/tencent/liteav/txcvodplayer/renderer/d;->m:[F

    .line 21
    .line 22
    const/16 v0, 0x2d0

    .line 23
    .line 24
    iput v0, p0, Lcom/tencent/liteav/txcvodplayer/renderer/d;->n:I

    .line 25
    .line 26
    const/16 v0, 0x500

    .line 27
    .line 28
    iput v0, p0, Lcom/tencent/liteav/txcvodplayer/renderer/d;->o:I

    .line 29
    .line 30
    iput-object p1, p0, Lcom/tencent/liteav/txcvodplayer/renderer/d;->p:Lcom/tencent/liteav/txcvodplayer/renderer/d$a;

    .line 31
    return-void
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
.end method

.method public static synthetic a(Lcom/tencent/liteav/txcvodplayer/renderer/d;)V
    .locals 4

    .line 108
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/renderer/d;->b:Lcom/tencent/liteav/videobase/egl/EGLCore;

    if-nez v0, :cond_1

    .line 109
    new-instance v0, Lcom/tencent/liteav/videobase/egl/EGLCore;

    invoke-direct {v0}, Lcom/tencent/liteav/videobase/egl/EGLCore;-><init>()V

    iput-object v0, p0, Lcom/tencent/liteav/txcvodplayer/renderer/d;->b:Lcom/tencent/liteav/videobase/egl/EGLCore;

    .line 110
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/renderer/d;->j:Lcom/tencent/liteav/videobase/frame/k;

    if-nez v0, :cond_0

    .line 111
    new-instance v0, Lcom/tencent/liteav/videobase/frame/k;

    invoke-direct {v0}, Lcom/tencent/liteav/videobase/frame/k;-><init>()V

    iput-object v0, p0, Lcom/tencent/liteav/txcvodplayer/renderer/d;->j:Lcom/tencent/liteav/videobase/frame/k;

    :cond_0
    const/4 v0, 0x0

    .line 112
    :try_start_0
    iget-object v1, p0, Lcom/tencent/liteav/txcvodplayer/renderer/d;->b:Lcom/tencent/liteav/videobase/egl/EGLCore;

    const/16 v2, 0x80

    invoke-virtual {v1, v0, v0, v2, v2}, Lcom/tencent/liteav/videobase/egl/EGLCore;->initialize(Ljava/lang/Object;Landroid/view/Surface;II)V

    .line 113
    iget-object v1, p0, Lcom/tencent/liteav/txcvodplayer/renderer/d;->b:Lcom/tencent/liteav/videobase/egl/EGLCore;

    invoke-virtual {v1}, Lcom/tencent/liteav/videobase/egl/EGLCore;->makeCurrent()V

    .line 114
    invoke-static {}, Lcom/tencent/liteav/videobase/utils/OpenGlUtils;->generateTextureOES()I

    move-result v1

    iput v1, p0, Lcom/tencent/liteav/txcvodplayer/renderer/d;->h:I

    .line 115
    new-instance v1, Landroid/graphics/SurfaceTexture;

    iget v2, p0, Lcom/tencent/liteav/txcvodplayer/renderer/d;->h:I

    invoke-direct {v1, v2}, Landroid/graphics/SurfaceTexture;-><init>(I)V

    iput-object v1, p0, Lcom/tencent/liteav/txcvodplayer/renderer/d;->g:Landroid/graphics/SurfaceTexture;

    .line 116
    iget v2, p0, Lcom/tencent/liteav/txcvodplayer/renderer/d;->n:I

    iget v3, p0, Lcom/tencent/liteav/txcvodplayer/renderer/d;->o:I

    invoke-virtual {v1, v2, v3}, Landroid/graphics/SurfaceTexture;->setDefaultBufferSize(II)V

    .line 117
    iget-object v1, p0, Lcom/tencent/liteav/txcvodplayer/renderer/d;->g:Landroid/graphics/SurfaceTexture;

    invoke-virtual {v1, p0}, Landroid/graphics/SurfaceTexture;->setOnFrameAvailableListener(Landroid/graphics/SurfaceTexture$OnFrameAvailableListener;)V

    .line 118
    new-instance v1, Lcom/tencent/liteav/videobase/frame/PixelFrame;

    invoke-direct {v1}, Lcom/tencent/liteav/videobase/frame/PixelFrame;-><init>()V

    iput-object v1, p0, Lcom/tencent/liteav/txcvodplayer/renderer/d;->i:Lcom/tencent/liteav/videobase/frame/PixelFrame;

    .line 119
    iget v2, p0, Lcom/tencent/liteav/txcvodplayer/renderer/d;->n:I

    invoke-virtual {v1, v2}, Lcom/tencent/liteav/videobase/frame/PixelFrame;->setWidth(I)V

    .line 120
    iget-object v1, p0, Lcom/tencent/liteav/txcvodplayer/renderer/d;->i:Lcom/tencent/liteav/videobase/frame/PixelFrame;

    iget v2, p0, Lcom/tencent/liteav/txcvodplayer/renderer/d;->o:I

    invoke-virtual {v1, v2}, Lcom/tencent/liteav/videobase/frame/PixelFrame;->setHeight(I)V

    .line 121
    iget-object v1, p0, Lcom/tencent/liteav/txcvodplayer/renderer/d;->i:Lcom/tencent/liteav/videobase/frame/PixelFrame;

    sget-object v2, Lcom/tencent/liteav/videobase/base/GLConstants$a;->c:Lcom/tencent/liteav/videobase/base/GLConstants$a;

    invoke-virtual {v1, v2}, Lcom/tencent/liteav/videobase/frame/PixelFrame;->setPixelBufferType(Lcom/tencent/liteav/videobase/base/GLConstants$a;)V

    .line 122
    iget-object v1, p0, Lcom/tencent/liteav/txcvodplayer/renderer/d;->i:Lcom/tencent/liteav/videobase/frame/PixelFrame;

    sget-object v2, Lcom/tencent/liteav/videobase/base/GLConstants$PixelFormatType;->f:Lcom/tencent/liteav/videobase/base/GLConstants$PixelFormatType;

    invoke-virtual {v1, v2}, Lcom/tencent/liteav/videobase/frame/PixelFrame;->setPixelFormatType(Lcom/tencent/liteav/videobase/base/GLConstants$PixelFormatType;)V

    .line 123
    iget-object v1, p0, Lcom/tencent/liteav/txcvodplayer/renderer/d;->i:Lcom/tencent/liteav/videobase/frame/PixelFrame;

    sget-object v2, Lcom/tencent/liteav/base/util/l;->a:Lcom/tencent/liteav/base/util/l;

    invoke-virtual {v1, v2}, Lcom/tencent/liteav/videobase/frame/PixelFrame;->setRotation(Lcom/tencent/liteav/base/util/l;)V

    .line 124
    iget-object v1, p0, Lcom/tencent/liteav/txcvodplayer/renderer/d;->i:Lcom/tencent/liteav/videobase/frame/PixelFrame;

    iget-object v2, p0, Lcom/tencent/liteav/txcvodplayer/renderer/d;->b:Lcom/tencent/liteav/videobase/egl/EGLCore;

    invoke-virtual {v2}, Lcom/tencent/liteav/videobase/egl/EGLCore;->getEglContext()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/tencent/liteav/videobase/frame/PixelFrame;->setGLContext(Ljava/lang/Object;)V

    .line 125
    iget-object v1, p0, Lcom/tencent/liteav/txcvodplayer/renderer/d;->i:Lcom/tencent/liteav/videobase/frame/PixelFrame;

    iget v2, p0, Lcom/tencent/liteav/txcvodplayer/renderer/d;->h:I

    invoke-virtual {v1, v2}, Lcom/tencent/liteav/videobase/frame/PixelFrame;->setTextureId(I)V

    .line 126
    new-instance v1, Lcom/tencent/liteav/videobase/frame/e;

    invoke-direct {v1}, Lcom/tencent/liteav/videobase/frame/e;-><init>()V

    iput-object v1, p0, Lcom/tencent/liteav/txcvodplayer/renderer/d;->l:Lcom/tencent/liteav/videobase/frame/e;

    .line 127
    iget-object v1, p0, Lcom/tencent/liteav/txcvodplayer/renderer/d;->p:Lcom/tencent/liteav/txcvodplayer/renderer/d$a;

    if-eqz v1, :cond_1

    .line 128
    iget-object v2, p0, Lcom/tencent/liteav/txcvodplayer/renderer/d;->g:Landroid/graphics/SurfaceTexture;

    invoke-interface {v1, v2}, Lcom/tencent/liteav/txcvodplayer/renderer/d$a;->a(Landroid/graphics/SurfaceTexture;)V
    :try_end_0
    .catch Lcom/tencent/liteav/videobase/egl/d; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    .line 129
    const-string v2, "VodRenderer"

    const-string v3, "initializeEGL failed."

    invoke-static {v2, v3, v1}, Lcom/tencent/liteav/base/util/LiteavLog;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 130
    iput-object v0, p0, Lcom/tencent/liteav/txcvodplayer/renderer/d;->b:Lcom/tencent/liteav/videobase/egl/EGLCore;

    .line 131
    :cond_1
    :goto_0
    new-instance v0, Lcom/tencent/liteav/videoconsumer/renderer/u;

    iget-object v1, p0, Lcom/tencent/liteav/txcvodplayer/renderer/d;->a:Lcom/tencent/liteav/base/util/CustomHandler;

    invoke-virtual {v1}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    move-result-object v1

    new-instance v2, Lcom/tencent/liteav/videobase/videobase/d;

    invoke-direct {v2}, Lcom/tencent/liteav/videobase/videobase/d;-><init>()V

    invoke-direct {v0, v1, v2}, Lcom/tencent/liteav/videoconsumer/renderer/u;-><init>(Landroid/os/Looper;Lcom/tencent/liteav/videobase/videobase/c;)V

    iput-object v0, p0, Lcom/tencent/liteav/txcvodplayer/renderer/d;->c:Lcom/tencent/liteav/videoconsumer/renderer/u;

    return-void
.end method

.method public static synthetic a(Lcom/tencent/liteav/txcvodplayer/renderer/d;II)V
    .locals 3

    .line 9
    iget v0, p0, Lcom/tencent/liteav/txcvodplayer/renderer/d;->n:I

    if-ne v0, p1, :cond_0

    iget v0, p0, Lcom/tencent/liteav/txcvodplayer/renderer/d;->o:I

    if-eq v0, p2, :cond_2

    .line 10
    :cond_0
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    filled-new-array {v0, v1}, [Ljava/lang/Object;

    move-result-object v0

    const-string v1, "VodRenderer"

    const-string/jumbo v2, "setVideoSize: %d*%d"

    invoke-static {v1, v2, v0}, Lcom/tencent/liteav/base/util/LiteavLog;->i(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 11
    iput p1, p0, Lcom/tencent/liteav/txcvodplayer/renderer/d;->n:I

    .line 12
    iput p2, p0, Lcom/tencent/liteav/txcvodplayer/renderer/d;->o:I

    .line 13
    iget-object p2, p0, Lcom/tencent/liteav/txcvodplayer/renderer/d;->i:Lcom/tencent/liteav/videobase/frame/PixelFrame;

    invoke-virtual {p2, p1}, Lcom/tencent/liteav/videobase/frame/PixelFrame;->setWidth(I)V

    .line 14
    iget-object p1, p0, Lcom/tencent/liteav/txcvodplayer/renderer/d;->i:Lcom/tencent/liteav/videobase/frame/PixelFrame;

    iget p2, p0, Lcom/tencent/liteav/txcvodplayer/renderer/d;->o:I

    invoke-virtual {p1, p2}, Lcom/tencent/liteav/videobase/frame/PixelFrame;->setHeight(I)V

    .line 15
    iget-object p1, p0, Lcom/tencent/liteav/txcvodplayer/renderer/d;->k:Lcom/tencent/liteav/videobase/frame/i;

    if-eqz p1, :cond_1

    .line 16
    invoke-virtual {p1}, Lcom/tencent/liteav/videobase/frame/i;->a()V

    const/4 p1, 0x0

    .line 17
    iput-object p1, p0, Lcom/tencent/liteav/txcvodplayer/renderer/d;->k:Lcom/tencent/liteav/videobase/frame/i;

    .line 18
    :cond_1
    iget-object p0, p0, Lcom/tencent/liteav/txcvodplayer/renderer/d;->l:Lcom/tencent/liteav/videobase/frame/e;

    if-eqz p0, :cond_2

    .line 19
    invoke-virtual {p0}, Lcom/tencent/liteav/videobase/frame/e;->a()V

    :cond_2
    return-void
.end method

.method public static synthetic a(Lcom/tencent/liteav/txcvodplayer/renderer/d;Landroid/graphics/SurfaceTexture;)V
    .locals 6

    .line 63
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/renderer/d;->g:Landroid/graphics/SurfaceTexture;

    if-eqz v0, :cond_a

    if-eq p1, v0, :cond_0

    goto/16 :goto_6

    .line 64
    :cond_0
    invoke-direct {p0}, Lcom/tencent/liteav/txcvodplayer/renderer/d;->b()Z

    move-result p1

    if-nez p1, :cond_1

    return-void

    .line 65
    :cond_1
    iget-object p1, p0, Lcom/tencent/liteav/txcvodplayer/renderer/d;->l:Lcom/tencent/liteav/videobase/frame/e;

    if-eqz p1, :cond_9

    iget-object p1, p0, Lcom/tencent/liteav/txcvodplayer/renderer/d;->j:Lcom/tencent/liteav/videobase/frame/k;

    if-nez p1, :cond_2

    goto/16 :goto_5

    :cond_2
    const/4 v0, 0x0

    .line 66
    :try_start_0
    invoke-virtual {p1}, Lcom/tencent/liteav/videobase/frame/h;->a()Lcom/tencent/liteav/videobase/frame/j;

    move-result-object p1

    check-cast p1, Lcom/tencent/liteav/videobase/frame/k$b;
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-object p1, v0

    .line 67
    :goto_0
    :try_start_1
    iget-object v1, p0, Lcom/tencent/liteav/txcvodplayer/renderer/d;->g:Landroid/graphics/SurfaceTexture;

    invoke-virtual {v1}, Landroid/graphics/SurfaceTexture;->updateTexImage()V

    .line 68
    iget-object v1, p0, Lcom/tencent/liteav/txcvodplayer/renderer/d;->g:Landroid/graphics/SurfaceTexture;

    iget-object v2, p0, Lcom/tencent/liteav/txcvodplayer/renderer/d;->m:[F

    invoke-virtual {v1, v2}, Landroid/graphics/SurfaceTexture;->getTransformMatrix([F)V

    .line 69
    iget-object v1, p0, Lcom/tencent/liteav/txcvodplayer/renderer/d;->i:Lcom/tencent/liteav/videobase/frame/PixelFrame;

    iget-object v2, p0, Lcom/tencent/liteav/txcvodplayer/renderer/d;->m:[F

    invoke-virtual {v1, v2}, Lcom/tencent/liteav/videobase/frame/PixelFrame;->setMatrix([F)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    move-exception v1

    .line 70
    const-string v2, "VodRenderer"

    const-string/jumbo v3, "updateTexImage exception: "

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Lcom/tencent/liteav/base/util/LiteavLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 71
    :goto_1
    iget v1, p0, Lcom/tencent/liteav/txcvodplayer/renderer/d;->h:I

    iget-object v2, p0, Lcom/tencent/liteav/txcvodplayer/renderer/d;->i:Lcom/tencent/liteav/videobase/frame/PixelFrame;

    .line 72
    invoke-virtual {v2}, Lcom/tencent/liteav/videobase/frame/PixelFrame;->getWidth()I

    move-result v2

    iget-object v3, p0, Lcom/tencent/liteav/txcvodplayer/renderer/d;->i:Lcom/tencent/liteav/videobase/frame/PixelFrame;

    invoke-virtual {v3}, Lcom/tencent/liteav/videobase/frame/PixelFrame;->getHeight()I

    move-result v3

    const v4, 0x8d65

    .line 73
    iput v4, p1, Lcom/tencent/liteav/videobase/frame/k$b;->b:I

    .line 74
    iput v1, p1, Lcom/tencent/liteav/videobase/frame/k$b;->a:I

    .line 75
    iput v2, p1, Lcom/tencent/liteav/videobase/frame/k$b;->c:I

    .line 76
    iput v3, p1, Lcom/tencent/liteav/videobase/frame/k$b;->d:I

    .line 77
    iget-object v1, p0, Lcom/tencent/liteav/txcvodplayer/renderer/d;->i:Lcom/tencent/liteav/videobase/frame/PixelFrame;

    invoke-virtual {v1}, Lcom/tencent/liteav/videobase/frame/PixelFrame;->getGLContext()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/tencent/liteav/videobase/frame/k$b;->a(Ljava/lang/Object;)Lcom/tencent/liteav/videobase/frame/PixelFrame;

    move-result-object v1

    .line 78
    iget-object v2, p0, Lcom/tencent/liteav/txcvodplayer/renderer/d;->m:[F

    invoke-virtual {v1, v2}, Lcom/tencent/liteav/videobase/frame/PixelFrame;->setMatrix([F)V

    .line 79
    iget-object v2, p0, Lcom/tencent/liteav/txcvodplayer/renderer/d;->k:Lcom/tencent/liteav/videobase/frame/i;

    if-nez v2, :cond_3

    .line 80
    new-instance v2, Lcom/tencent/liteav/videobase/frame/i;

    iget v3, p0, Lcom/tencent/liteav/txcvodplayer/renderer/d;->n:I

    iget v4, p0, Lcom/tencent/liteav/txcvodplayer/renderer/d;->o:I

    invoke-direct {v2, v3, v4}, Lcom/tencent/liteav/videobase/frame/i;-><init>(II)V

    iput-object v2, p0, Lcom/tencent/liteav/txcvodplayer/renderer/d;->k:Lcom/tencent/liteav/videobase/frame/i;

    .line 81
    :cond_3
    iget v2, p0, Lcom/tencent/liteav/txcvodplayer/renderer/d;->n:I

    iget v3, p0, Lcom/tencent/liteav/txcvodplayer/renderer/d;->o:I

    const/4 v4, 0x0

    invoke-static {v4, v4, v2, v3}, Lcom/tencent/liteav/videobase/utils/OpenGlUtils;->glViewport(IIII)V

    .line 82
    iget-object v2, p0, Lcom/tencent/liteav/txcvodplayer/renderer/d;->l:Lcom/tencent/liteav/videobase/frame/e;

    iget v3, p0, Lcom/tencent/liteav/txcvodplayer/renderer/d;->n:I

    iget v4, p0, Lcom/tencent/liteav/txcvodplayer/renderer/d;->o:I

    invoke-virtual {v2, v3, v4}, Lcom/tencent/liteav/videobase/frame/e;->a(II)Lcom/tencent/liteav/videobase/frame/d;

    move-result-object v2

    .line 83
    iget-object v3, p0, Lcom/tencent/liteav/txcvodplayer/renderer/d;->k:Lcom/tencent/liteav/videobase/frame/i;

    sget-object v4, Lcom/tencent/liteav/videobase/base/GLConstants$GLScaleType;->a:Lcom/tencent/liteav/videobase/base/GLConstants$GLScaleType;

    invoke-virtual {v3, v1, v4, v2}, Lcom/tencent/liteav/videobase/frame/i;->a(Lcom/tencent/liteav/videobase/frame/PixelFrame;Lcom/tencent/liteav/videobase/base/GLConstants$GLScaleType;Lcom/tencent/liteav/videobase/frame/d;)V

    .line 84
    iget-object v3, p0, Lcom/tencent/liteav/txcvodplayer/renderer/d;->b:Lcom/tencent/liteav/videobase/egl/EGLCore;

    invoke-virtual {v3}, Lcom/tencent/liteav/videobase/egl/EGLCore;->getEglContext()Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/tencent/liteav/videobase/frame/d;->a(Ljava/lang/Object;)Lcom/tencent/liteav/videobase/frame/PixelFrame;

    move-result-object v3

    .line 85
    invoke-virtual {v2}, Lcom/tencent/liteav/videobase/frame/j;->release()V

    .line 86
    iget-object v2, p0, Lcom/tencent/liteav/txcvodplayer/renderer/d;->p:Lcom/tencent/liteav/txcvodplayer/renderer/d$a;

    if-eqz v2, :cond_4

    .line 87
    invoke-interface {v2, v3}, Lcom/tencent/liteav/txcvodplayer/renderer/d$a;->a(Lcom/tencent/liteav/videobase/frame/PixelFrame;)V

    .line 88
    :cond_4
    iget-object p0, p0, Lcom/tencent/liteav/txcvodplayer/renderer/d;->c:Lcom/tencent/liteav/videoconsumer/renderer/u;

    if-eqz p0, :cond_8

    .line 89
    iget-boolean v2, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->c:Z

    if-eqz v2, :cond_8

    .line 90
    iget-boolean v2, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->d:Z

    if-nez v2, :cond_5

    const/4 v2, 0x1

    .line 91
    iput-boolean v2, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->d:Z

    .line 92
    iget-object v2, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->a:Ljava/lang/String;

    const-string v4, "VideoRender receive first frame!"

    invoke-static {v2, v4}, Lcom/tencent/liteav/base/util/LiteavLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 93
    :cond_5
    iget-object v2, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->b:Lcom/tencent/liteav/videobase/utils/f;

    .line 94
    invoke-virtual {v3}, Lcom/tencent/liteav/videobase/frame/PixelFrame;->retain()I

    .line 95
    monitor-enter v2

    .line 96
    :try_start_2
    iget-object v4, v2, Lcom/tencent/liteav/videobase/utils/f;->a:Ljava/util/Deque;

    invoke-interface {v4}, Ljava/util/Deque;->size()I

    move-result v4

    iget v5, v2, Lcom/tencent/liteav/videobase/utils/f;->b:I

    if-lt v4, v5, :cond_6

    .line 97
    iget-object v0, v2, Lcom/tencent/liteav/videobase/utils/f;->a:Ljava/util/Deque;

    invoke-interface {v0}, Ljava/util/Deque;->removeFirst()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/tencent/liteav/videobase/frame/PixelFrame;

    goto :goto_2

    :catchall_0
    move-exception p0

    goto :goto_3

    .line 98
    :cond_6
    :goto_2
    iget-object v4, v2, Lcom/tencent/liteav/videobase/utils/f;->a:Ljava/util/Deque;

    invoke-interface {v4, v3}, Ljava/util/Deque;->addLast(Ljava/lang/Object;)V

    .line 99
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-eqz v0, :cond_7

    .line 100
    invoke-virtual {v0}, Lcom/tencent/liteav/videobase/frame/PixelFrame;->release()V

    .line 101
    :cond_7
    invoke-static {p0}, Lcom/tencent/liteav/videoconsumer/renderer/w;->a(Lcom/tencent/liteav/videoconsumer/renderer/u;)Ljava/lang/Runnable;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/tencent/liteav/videoconsumer/renderer/u;->a(Ljava/lang/Runnable;)V

    goto :goto_4

    .line 102
    :goto_3
    :try_start_3
    monitor-exit v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw p0

    .line 103
    :cond_8
    :goto_4
    invoke-virtual {p1}, Lcom/tencent/liteav/videobase/frame/j;->release()V

    .line 104
    invoke-virtual {v1}, Lcom/tencent/liteav/videobase/frame/PixelFrame;->release()V

    .line 105
    invoke-virtual {v3}, Lcom/tencent/liteav/videobase/frame/PixelFrame;->release()V

    return-void

    .line 106
    :cond_9
    :goto_5
    const-string p1, "VodRenderer"

    new-instance v0, Ljava/lang/StringBuilder;

    const-string/jumbo v1, "onCaptureFrameAvailable mGLTexturePool:"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/tencent/liteav/txcvodplayer/renderer/d;->l:Lcom/tencent/liteav/videobase/frame/e;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " mTextureHolderPool:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p0, p0, Lcom/tencent/liteav/txcvodplayer/renderer/d;->j:Lcom/tencent/liteav/videobase/frame/k;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p1, p0}, Lcom/tencent/liteav/base/util/LiteavLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 107
    :cond_a
    :goto_6
    const-string v0, "VodRenderer"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "mSurfaceTexture= "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object p0, p0, Lcom/tencent/liteav/txcvodplayer/renderer/d;->g:Landroid/graphics/SurfaceTexture;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, " ,surfaceTexture= "

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {v0, p0}, Lcom/tencent/liteav/base/util/LiteavLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic a(Lcom/tencent/liteav/txcvodplayer/renderer/d;Lcom/tencent/liteav/base/util/l;)V
    .locals 2

    .line 26
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string/jumbo v1, "setRenderRotation "

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "VodRenderer"

    invoke-static {v1, v0}, Lcom/tencent/liteav/base/util/LiteavLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 27
    iput-object p1, p0, Lcom/tencent/liteav/txcvodplayer/renderer/d;->f:Lcom/tencent/liteav/base/util/l;

    .line 28
    iget-object p0, p0, Lcom/tencent/liteav/txcvodplayer/renderer/d;->c:Lcom/tencent/liteav/videoconsumer/renderer/u;

    if-eqz p0, :cond_0

    .line 29
    invoke-virtual {p0, p1}, Lcom/tencent/liteav/videoconsumer/renderer/u;->a(Lcom/tencent/liteav/base/util/l;)V

    :cond_0
    return-void
.end method

.method public static synthetic a(Lcom/tencent/liteav/txcvodplayer/renderer/d;Lcom/tencent/liteav/videobase/base/GLConstants$GLScaleType;)V
    .locals 2

    .line 21
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string/jumbo v1, "setScaleType "

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "VodRenderer"

    invoke-static {v1, v0}, Lcom/tencent/liteav/base/util/LiteavLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 22
    iput-object p1, p0, Lcom/tencent/liteav/txcvodplayer/renderer/d;->e:Lcom/tencent/liteav/videobase/base/GLConstants$GLScaleType;

    .line 23
    iget-object p0, p0, Lcom/tencent/liteav/txcvodplayer/renderer/d;->c:Lcom/tencent/liteav/videoconsumer/renderer/u;

    if-eqz p0, :cond_0

    .line 24
    invoke-virtual {p0, p1}, Lcom/tencent/liteav/videoconsumer/renderer/u;->a(Lcom/tencent/liteav/videobase/base/GLConstants$GLScaleType;)V

    :cond_0
    return-void
.end method

.method public static synthetic a(Lcom/tencent/liteav/txcvodplayer/renderer/d;Lcom/tencent/liteav/videobase/videobase/DisplayTarget;)V
    .locals 2

    .line 5
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string/jumbo v1, "setDisplayTarget: "

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "VodRenderer"

    invoke-static {v1, v0}, Lcom/tencent/liteav/base/util/LiteavLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    iput-object p1, p0, Lcom/tencent/liteav/txcvodplayer/renderer/d;->d:Lcom/tencent/liteav/videobase/videobase/DisplayTarget;

    .line 7
    iget-object p0, p0, Lcom/tencent/liteav/txcvodplayer/renderer/d;->c:Lcom/tencent/liteav/videoconsumer/renderer/u;

    if-eqz p0, :cond_0

    const/4 v0, 0x1

    .line 8
    invoke-virtual {p0, p1, v0}, Lcom/tencent/liteav/videoconsumer/renderer/u;->a(Lcom/tencent/liteav/videobase/videobase/DisplayTarget;Z)V

    :cond_0
    return-void
.end method

.method public static synthetic a(Lcom/tencent/liteav/txcvodplayer/renderer/d;Z)V
    .locals 2

    .line 2
    const-string v0, "VodRenderer"

    const-string v1, "Stop"

    invoke-static {v0, v1}, Lcom/tencent/liteav/base/util/LiteavLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 3
    iget-object p0, p0, Lcom/tencent/liteav/txcvodplayer/renderer/d;->c:Lcom/tencent/liteav/videoconsumer/renderer/u;

    if-eqz p0, :cond_0

    .line 4
    invoke-static {p0, p1}, Lcom/tencent/liteav/videoconsumer/renderer/ac;->a(Lcom/tencent/liteav/videoconsumer/renderer/u;Z)Ljava/lang/Runnable;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/tencent/liteav/videoconsumer/renderer/u;->a(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method

.method public static synthetic b(Lcom/tencent/liteav/txcvodplayer/renderer/d;)V
    .locals 3

    .line 1
    const-string v0, "VodRenderer"

    const-string v1, "Start"

    invoke-static {v0, v1}, Lcom/tencent/liteav/base/util/LiteavLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/renderer/d;->c:Lcom/tencent/liteav/videoconsumer/renderer/u;

    if-eqz v0, :cond_0

    .line 3
    iget-object v1, p0, Lcom/tencent/liteav/txcvodplayer/renderer/d;->d:Lcom/tencent/liteav/videobase/videobase/DisplayTarget;

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lcom/tencent/liteav/videoconsumer/renderer/u;->a(Lcom/tencent/liteav/videobase/videobase/DisplayTarget;Z)V

    .line 4
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/renderer/d;->c:Lcom/tencent/liteav/videoconsumer/renderer/u;

    iget-object v1, p0, Lcom/tencent/liteav/txcvodplayer/renderer/d;->f:Lcom/tencent/liteav/base/util/l;

    invoke-virtual {v0, v1}, Lcom/tencent/liteav/videoconsumer/renderer/u;->a(Lcom/tencent/liteav/base/util/l;)V

    .line 5
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/renderer/d;->c:Lcom/tencent/liteav/videoconsumer/renderer/u;

    iget-object v1, p0, Lcom/tencent/liteav/txcvodplayer/renderer/d;->e:Lcom/tencent/liteav/videobase/base/GLConstants$GLScaleType;

    invoke-virtual {v0, v1}, Lcom/tencent/liteav/videoconsumer/renderer/u;->a(Lcom/tencent/liteav/videobase/base/GLConstants$GLScaleType;)V

    .line 6
    iget-object p0, p0, Lcom/tencent/liteav/txcvodplayer/renderer/d;->c:Lcom/tencent/liteav/videoconsumer/renderer/u;

    .line 7
    invoke-static {p0}, Lcom/tencent/liteav/videoconsumer/renderer/v;->a(Lcom/tencent/liteav/videoconsumer/renderer/u;)Ljava/lang/Runnable;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/tencent/liteav/videoconsumer/renderer/u;->a(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method

.method private b()Z
    .locals 4

    .line 8
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/renderer/d;->b:Lcom/tencent/liteav/videobase/egl/EGLCore;

    const/4 v1, 0x0

    const-string v2, "VodRenderer"

    if-nez v0, :cond_0

    .line 9
    const-string v0, "makeCurrent on mEGLCore is null"

    invoke-static {v2, v0}, Lcom/tencent/liteav/base/util/LiteavLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    return v1

    .line 10
    :cond_0
    :try_start_0
    invoke-virtual {v0}, Lcom/tencent/liteav/videobase/egl/EGLCore;->makeCurrent()V
    :try_end_0
    .catch Lcom/tencent/liteav/videobase/egl/d; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v0, 0x1

    return v0

    :catch_0
    move-exception v0

    .line 11
    const-string v3, "make current failed."

    invoke-static {v2, v3, v0}, Lcom/tencent/liteav/base/util/LiteavLog;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return v1
.end method

.method public static synthetic c(Lcom/tencent/liteav/txcvodplayer/renderer/d;)Lcom/tencent/liteav/videoconsumer/renderer/u;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/tencent/liteav/txcvodplayer/renderer/d;->c:Lcom/tencent/liteav/videoconsumer/renderer/u;

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
    .line 25
.end method

.method public static synthetic d(Lcom/tencent/liteav/txcvodplayer/renderer/d;)Lcom/tencent/liteav/videoconsumer/renderer/u;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    iput-object v0, p0, Lcom/tencent/liteav/txcvodplayer/renderer/d;->c:Lcom/tencent/liteav/videoconsumer/renderer/u;

    .line 4
    return-object v0
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
.end method

.method public static synthetic e(Lcom/tencent/liteav/txcvodplayer/renderer/d;)Lcom/tencent/liteav/videobase/videobase/DisplayTarget;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    iput-object v0, p0, Lcom/tencent/liteav/txcvodplayer/renderer/d;->d:Lcom/tencent/liteav/videobase/videobase/DisplayTarget;

    .line 4
    return-object v0
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
.end method

.method public static synthetic f(Lcom/tencent/liteav/txcvodplayer/renderer/d;)Lcom/tencent/liteav/base/util/CustomHandler;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/tencent/liteav/txcvodplayer/renderer/d;->a:Lcom/tencent/liteav/base/util/CustomHandler;

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
    .line 25
.end method

.method public static synthetic g(Lcom/tencent/liteav/txcvodplayer/renderer/d;)Lcom/tencent/liteav/base/util/CustomHandler;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    iput-object v0, p0, Lcom/tencent/liteav/txcvodplayer/renderer/d;->a:Lcom/tencent/liteav/base/util/CustomHandler;

    .line 4
    return-object v0
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
.end method


# virtual methods
.method public final a()V
    .locals 4

    .line 30
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/renderer/d;->b:Lcom/tencent/liteav/videobase/egl/EGLCore;

    if-nez v0, :cond_0

    return-void

    .line 31
    :cond_0
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/renderer/d;->j:Lcom/tencent/liteav/videobase/frame/k;

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    const/4 v2, 0x1

    .line 32
    iput-boolean v2, v0, Lcom/tencent/liteav/videobase/frame/h;->c:Z

    .line 33
    monitor-enter v0

    .line 34
    :try_start_0
    new-instance v2, Ljava/util/ArrayList;

    iget-object v3, v0, Lcom/tencent/liteav/videobase/frame/h;->a:Ljava/util/Deque;

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 35
    iget-object v3, v0, Lcom/tencent/liteav/videobase/frame/h;->a:Ljava/util/Deque;

    invoke-interface {v3}, Ljava/util/Collection;->clear()V

    .line 36
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 37
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    goto :goto_0

    .line 38
    :cond_1
    iput-object v1, p0, Lcom/tencent/liteav/txcvodplayer/renderer/d;->j:Lcom/tencent/liteav/videobase/frame/k;

    goto :goto_1

    :catchall_0
    move-exception v1

    .line 39
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1

    .line 40
    :cond_2
    :goto_1
    :try_start_2
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/renderer/d;->b:Lcom/tencent/liteav/videobase/egl/EGLCore;

    invoke-virtual {v0}, Lcom/tencent/liteav/videobase/egl/EGLCore;->makeCurrent()V

    .line 41
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/renderer/d;->p:Lcom/tencent/liteav/txcvodplayer/renderer/d$a;

    if-eqz v0, :cond_3

    .line 42
    invoke-interface {v0}, Lcom/tencent/liteav/txcvodplayer/renderer/d$a;->f()V

    goto :goto_2

    :catch_0
    move-exception v0

    goto :goto_3

    .line 43
    :cond_3
    :goto_2
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/renderer/d;->g:Landroid/graphics/SurfaceTexture;

    if-eqz v0, :cond_4

    .line 44
    invoke-virtual {v0}, Landroid/graphics/SurfaceTexture;->release()V

    .line 45
    iput-object v1, p0, Lcom/tencent/liteav/txcvodplayer/renderer/d;->g:Landroid/graphics/SurfaceTexture;

    .line 46
    :cond_4
    iget v0, p0, Lcom/tencent/liteav/txcvodplayer/renderer/d;->h:I

    invoke-static {v0}, Lcom/tencent/liteav/videobase/utils/OpenGlUtils;->deleteTexture(I)V

    const/4 v0, -0x1

    .line 47
    iput v0, p0, Lcom/tencent/liteav/txcvodplayer/renderer/d;->h:I

    .line 48
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/renderer/d;->k:Lcom/tencent/liteav/videobase/frame/i;

    if-eqz v0, :cond_5

    .line 49
    invoke-virtual {v0}, Lcom/tencent/liteav/videobase/frame/i;->a()V

    .line 50
    iput-object v1, p0, Lcom/tencent/liteav/txcvodplayer/renderer/d;->k:Lcom/tencent/liteav/videobase/frame/i;

    .line 51
    :cond_5
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/renderer/d;->l:Lcom/tencent/liteav/videobase/frame/e;

    if-eqz v0, :cond_6

    .line 52
    invoke-virtual {v0}, Lcom/tencent/liteav/videobase/frame/e;->a()V

    .line 53
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/renderer/d;->l:Lcom/tencent/liteav/videobase/frame/e;

    invoke-virtual {v0}, Lcom/tencent/liteav/videobase/frame/e;->b()V

    .line 54
    iput-object v1, p0, Lcom/tencent/liteav/txcvodplayer/renderer/d;->l:Lcom/tencent/liteav/videobase/frame/e;
    :try_end_2
    .catch Lcom/tencent/liteav/videobase/egl/d; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_4

    .line 55
    :goto_3
    const-string v2, "VodRenderer"

    const-string v3, "EGLCore destroy failed."

    invoke-static {v2, v3, v0}, Lcom/tencent/liteav/base/util/LiteavLog;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 56
    :cond_6
    :goto_4
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/renderer/d;->b:Lcom/tencent/liteav/videobase/egl/EGLCore;

    invoke-static {v0}, Lcom/tencent/liteav/videobase/egl/EGLCore;->destroy(Lcom/tencent/liteav/videobase/egl/EGLCore;)V

    .line 57
    iput-object v1, p0, Lcom/tencent/liteav/txcvodplayer/renderer/d;->b:Lcom/tencent/liteav/videobase/egl/EGLCore;

    return-void
.end method

.method public final a(Lcom/tencent/liteav/base/util/l;)V
    .locals 1

    .line 25
    invoke-static {p0, p1}, Lcom/tencent/liteav/txcvodplayer/renderer/j;->a(Lcom/tencent/liteav/txcvodplayer/renderer/d;Lcom/tencent/liteav/base/util/l;)Ljava/lang/Runnable;

    move-result-object p1

    const-string/jumbo v0, "setRenderRotation"

    invoke-virtual {p0, p1, v0}, Lcom/tencent/liteav/txcvodplayer/renderer/d;->a(Ljava/lang/Runnable;Ljava/lang/String;)V

    return-void
.end method

.method public final a(Lcom/tencent/liteav/videobase/base/GLConstants$GLScaleType;)V
    .locals 1

    .line 20
    invoke-static {p0, p1}, Lcom/tencent/liteav/txcvodplayer/renderer/i;->a(Lcom/tencent/liteav/txcvodplayer/renderer/d;Lcom/tencent/liteav/videobase/base/GLConstants$GLScaleType;)Ljava/lang/Runnable;

    move-result-object p1

    const-string/jumbo v0, "setScaleType"

    invoke-virtual {p0, p1, v0}, Lcom/tencent/liteav/txcvodplayer/renderer/d;->a(Ljava/lang/Runnable;Ljava/lang/String;)V

    return-void
.end method

.method public final a(Ljava/lang/Runnable;Ljava/lang/String;)V
    .locals 2

    .line 58
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/renderer/d;->a:Lcom/tencent/liteav/base/util/CustomHandler;

    if-nez v0, :cond_0

    .line 59
    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string p2, "ignore runnable: "

    invoke-virtual {p2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string p2, "VodRenderer"

    invoke-static {p2, p1}, Lcom/tencent/liteav/base/util/LiteavLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 60
    :cond_0
    invoke-virtual {v0}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    move-result-object p2

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v1

    if-eq p2, v1, :cond_1

    .line 61
    invoke-virtual {v0, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void

    .line 62
    :cond_1
    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    return-void
.end method

.method public final a(Z)V
    .locals 1

    .line 1
    invoke-static {p0, p1}, Lcom/tencent/liteav/txcvodplayer/renderer/f;->a(Lcom/tencent/liteav/txcvodplayer/renderer/d;Z)Ljava/lang/Runnable;

    move-result-object p1

    const-string v0, "Stop"

    invoke-virtual {p0, p1, v0}, Lcom/tencent/liteav/txcvodplayer/renderer/d;->a(Ljava/lang/Runnable;Ljava/lang/String;)V

    return-void
.end method

.method public final onFrameAvailable(Landroid/graphics/SurfaceTexture;)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/tencent/liteav/txcvodplayer/renderer/l;->a(Lcom/tencent/liteav/txcvodplayer/renderer/d;Landroid/graphics/SurfaceTexture;)Ljava/lang/Runnable;

    .line 4
    move-result-object p1

    .line 5
    .line 6
    .line 7
    const-string/jumbo v0, "onFrameAvailable"

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, p1, v0}, Lcom/tencent/liteav/txcvodplayer/renderer/d;->a(Ljava/lang/Runnable;Ljava/lang/String;)V

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
.end method
