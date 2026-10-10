.class final Lcom/tencent/liteav/txcvodplayer/renderer/TextureRenderView$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/tencent/liteav/txcvodplayer/renderer/a$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/liteav/txcvodplayer/renderer/TextureRenderView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private a:Lcom/tencent/liteav/txcvodplayer/renderer/TextureRenderView;

.field private b:Landroid/graphics/SurfaceTexture;

.field private c:Lcom/tencent/liteav/txcplayer/c;

.field private d:Landroid/view/Surface;


# direct methods
.method public constructor <init>(Lcom/tencent/liteav/txcvodplayer/renderer/TextureRenderView;Landroid/graphics/SurfaceTexture;Lcom/tencent/liteav/txcplayer/c;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Lcom/tencent/liteav/txcvodplayer/renderer/TextureRenderView$a;->a:Lcom/tencent/liteav/txcvodplayer/renderer/TextureRenderView;

    .line 6
    .line 7
    iput-object p2, p0, Lcom/tencent/liteav/txcvodplayer/renderer/TextureRenderView$a;->b:Landroid/graphics/SurfaceTexture;

    .line 8
    .line 9
    iput-object p3, p0, Lcom/tencent/liteav/txcvodplayer/renderer/TextureRenderView$a;->c:Lcom/tencent/liteav/txcplayer/c;

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


# virtual methods
.method public final a()Lcom/tencent/liteav/txcvodplayer/renderer/a;
    .locals 1

    .line 21
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/renderer/TextureRenderView$a;->a:Lcom/tencent/liteav/txcvodplayer/renderer/TextureRenderView;

    return-object v0
.end method

.method public final a(Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;)V
    .locals 3

    if-nez p1, :cond_0

    return-void

    .line 1
    :cond_0
    invoke-static {}, Lcom/tencent/liteav/base/system/LiteavSystemInfo;->getSystemOSVersionInt()I

    move-result v0

    const/16 v1, 0x10

    if-lt v0, v1, :cond_5

    instance-of v0, p1, Lcom/tencent/liteav/txcplayer/b;

    if-eqz v0, :cond_5

    .line 2
    move-object v0, p1

    check-cast v0, Lcom/tencent/liteav/txcplayer/b;

    .line 3
    iget-object v1, p0, Lcom/tencent/liteav/txcvodplayer/renderer/TextureRenderView$a;->a:Lcom/tencent/liteav/txcvodplayer/renderer/TextureRenderView;

    invoke-static {v1}, Lcom/tencent/liteav/txcvodplayer/renderer/TextureRenderView;->a(Lcom/tencent/liteav/txcvodplayer/renderer/TextureRenderView;)Lcom/tencent/liteav/txcvodplayer/renderer/TextureRenderView$b;

    move-result-object v1

    const/4 v2, 0x0

    .line 4
    iput-boolean v2, v1, Lcom/tencent/liteav/txcvodplayer/renderer/TextureRenderView$b;->e:Z

    .line 5
    iget-object v1, p0, Lcom/tencent/liteav/txcvodplayer/renderer/TextureRenderView$a;->a:Lcom/tencent/liteav/txcvodplayer/renderer/TextureRenderView;

    invoke-virtual {v1}, Landroid/view/TextureView;->getSurfaceTexture()Landroid/graphics/SurfaceTexture;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 6
    iget-object v1, p0, Lcom/tencent/liteav/txcvodplayer/renderer/TextureRenderView$a;->a:Lcom/tencent/liteav/txcvodplayer/renderer/TextureRenderView;

    invoke-virtual {v1}, Landroid/view/TextureView;->getSurfaceTexture()Landroid/graphics/SurfaceTexture;

    move-result-object v1

    iput-object v1, p0, Lcom/tencent/liteav/txcvodplayer/renderer/TextureRenderView$a;->b:Landroid/graphics/SurfaceTexture;

    .line 7
    :cond_1
    :try_start_0
    invoke-interface {v0}, Lcom/tencent/liteav/txcplayer/b;->getSurfaceTexture()Landroid/graphics/SurfaceTexture;

    move-result-object v1

    if-eqz v1, :cond_3

    .line 8
    iget-object v2, p0, Lcom/tencent/liteav/txcvodplayer/renderer/TextureRenderView$a;->a:Lcom/tencent/liteav/txcvodplayer/renderer/TextureRenderView;

    invoke-static {v2}, Lcom/tencent/liteav/txcvodplayer/renderer/TextureRenderView;->a(Lcom/tencent/liteav/txcvodplayer/renderer/TextureRenderView;)Lcom/tencent/liteav/txcvodplayer/renderer/TextureRenderView$b;

    move-result-object v2

    invoke-interface {v0, v2}, Lcom/tencent/liteav/txcplayer/b;->setSurfaceTextureHost(Lcom/tencent/liteav/txcplayer/c;)V

    .line 9
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/renderer/TextureRenderView$a;->a:Lcom/tencent/liteav/txcvodplayer/renderer/TextureRenderView;

    invoke-virtual {v0}, Landroid/view/TextureView;->getSurfaceTexture()Landroid/graphics/SurfaceTexture;

    move-result-object v0

    if-eq v0, v1, :cond_2

    .line 10
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/renderer/TextureRenderView$a;->a:Lcom/tencent/liteav/txcvodplayer/renderer/TextureRenderView;

    invoke-virtual {v0, v1}, Landroid/view/TextureView;->setSurfaceTexture(Landroid/graphics/SurfaceTexture;)V

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_2

    .line 11
    :cond_2
    :goto_0
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/renderer/TextureRenderView$a;->a:Lcom/tencent/liteav/txcvodplayer/renderer/TextureRenderView;

    invoke-static {v0}, Lcom/tencent/liteav/txcvodplayer/renderer/TextureRenderView;->a(Lcom/tencent/liteav/txcvodplayer/renderer/TextureRenderView;)Lcom/tencent/liteav/txcvodplayer/renderer/TextureRenderView$b;

    move-result-object v0

    .line 12
    iput-object v1, v0, Lcom/tencent/liteav/txcvodplayer/renderer/TextureRenderView$b;->a:Landroid/graphics/SurfaceTexture;

    goto :goto_1

    .line 13
    :cond_3
    iget-object v1, p0, Lcom/tencent/liteav/txcvodplayer/renderer/TextureRenderView$a;->d:Landroid/view/Surface;

    if-eqz v1, :cond_4

    .line 14
    invoke-interface {p1, v1}, Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;->setSurface(Landroid/view/Surface;)V

    .line 15
    :cond_4
    iget-object v1, p0, Lcom/tencent/liteav/txcvodplayer/renderer/TextureRenderView$a;->b:Landroid/graphics/SurfaceTexture;

    invoke-interface {v0, v1}, Lcom/tencent/liteav/txcplayer/b;->setSurfaceTexture(Landroid/graphics/SurfaceTexture;)V

    .line 16
    iget-object v1, p0, Lcom/tencent/liteav/txcvodplayer/renderer/TextureRenderView$a;->a:Lcom/tencent/liteav/txcvodplayer/renderer/TextureRenderView;

    invoke-static {v1}, Lcom/tencent/liteav/txcvodplayer/renderer/TextureRenderView;->a(Lcom/tencent/liteav/txcvodplayer/renderer/TextureRenderView;)Lcom/tencent/liteav/txcvodplayer/renderer/TextureRenderView$b;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/tencent/liteav/txcplayer/b;->setSurfaceTextureHost(Lcom/tencent/liteav/txcplayer/c;)V

    .line 17
    :goto_1
    invoke-interface {p1}, Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;->getSurface()Landroid/view/Surface;

    move-result-object p1

    iput-object p1, p0, Lcom/tencent/liteav/txcvodplayer/renderer/TextureRenderView$a;->d:Landroid/view/Surface;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    .line 18
    :goto_2
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    return-void

    .line 19
    :cond_5
    invoke-virtual {p0}, Lcom/tencent/liteav/txcvodplayer/renderer/TextureRenderView$a;->b()Landroid/view/Surface;

    move-result-object v0

    iput-object v0, p0, Lcom/tencent/liteav/txcvodplayer/renderer/TextureRenderView$a;->d:Landroid/view/Surface;

    .line 20
    invoke-interface {p1, v0}, Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;->setSurface(Landroid/view/Surface;)V

    return-void
.end method

.method public final b()Landroid/view/Surface;
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/renderer/TextureRenderView$a;->b:Landroid/graphics/SurfaceTexture;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    const/4 v0, 0x0

    .line 6
    return-object v0

    .line 7
    .line 8
    :cond_0
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/renderer/TextureRenderView$a;->d:Landroid/view/Surface;

    .line 9
    .line 10
    if-nez v0, :cond_1

    .line 11
    .line 12
    new-instance v0, Landroid/view/Surface;

    .line 13
    .line 14
    iget-object v1, p0, Lcom/tencent/liteav/txcvodplayer/renderer/TextureRenderView$a;->b:Landroid/graphics/SurfaceTexture;

    .line 15
    .line 16
    .line 17
    invoke-direct {v0, v1}, Landroid/view/Surface;-><init>(Landroid/graphics/SurfaceTexture;)V

    .line 18
    .line 19
    iput-object v0, p0, Lcom/tencent/liteav/txcvodplayer/renderer/TextureRenderView$a;->d:Landroid/view/Surface;

    .line 20
    .line 21
    :cond_1
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/renderer/TextureRenderView$a;->d:Landroid/view/Surface;

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
.end method

.method public final c()Landroid/view/Surface;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/renderer/TextureRenderView$a;->d:Landroid/view/Surface;

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
.end method
