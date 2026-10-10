.class public final Lcom/tencent/liteav/videoconsumer/renderer/k;
.super Lcom/tencent/liteav/videoconsumer/renderer/RenderViewHelperInterface;
.source "SourceFile"

# interfaces
.implements Landroid/view/TextureView$SurfaceTextureListener;


# instance fields
.field a:Landroid/view/TextureView;

.field private final b:Ljava/lang/String;

.field private final c:Lcom/tencent/liteav/base/util/CustomHandler;

.field private final d:Lcom/tencent/liteav/base/b/b;

.field private final e:Lcom/tencent/liteav/videoconsumer/renderer/RenderViewHelperInterface$RenderViewListener;

.field private final f:Lcom/tencent/rtmp/ui/TXCloudVideoView;

.field private g:Z

.field private final h:Lcom/tencent/liteav/base/util/Size;

.field private i:Lcom/tencent/liteav/videobase/base/GLConstants$GLScaleType;

.field private j:Z

.field private k:Z

.field private l:Landroid/graphics/Matrix;

.field private m:Z

.field private n:Z

.field private o:Landroid/graphics/SurfaceTexture;

.field private p:Landroid/view/Surface;

.field private final q:Lcom/tencent/liteav/base/util/Size;


# direct methods
.method public constructor <init>(Ljava/lang/String;Landroid/view/TextureView;Lcom/tencent/liteav/videoconsumer/renderer/RenderViewHelperInterface$RenderViewListener;)V
    .locals 1

    const/4 v0, 0x0

    .line 7
    invoke-direct {p0, p1, p3, v0, p2}, Lcom/tencent/liteav/videoconsumer/renderer/k;-><init>(Ljava/lang/String;Lcom/tencent/liteav/videoconsumer/renderer/RenderViewHelperInterface$RenderViewListener;Lcom/tencent/rtmp/ui/TXCloudVideoView;Landroid/view/TextureView;)V

    .line 8
    iget-object p1, p0, Lcom/tencent/liteav/videoconsumer/renderer/k;->a:Landroid/view/TextureView;

    if-nez p1, :cond_0

    .line 9
    iget-object p1, p0, Lcom/tencent/liteav/videoconsumer/renderer/k;->b:Ljava/lang/String;

    const-string p2, "construct: textureView is null."

    invoke-static {p1, p2}, Lcom/tencent/liteav/base/util/LiteavLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 10
    :cond_0
    iget-object p1, p0, Lcom/tencent/liteav/videoconsumer/renderer/k;->b:Ljava/lang/String;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string p3, "construct: textureView="

    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object p3, p0, Lcom/tencent/liteav/videoconsumer/renderer/k;->a:Landroid/view/TextureView;

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Lcom/tencent/liteav/base/util/LiteavLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p1, 0x1

    .line 11
    iput-boolean p1, p0, Lcom/tencent/liteav/videoconsumer/renderer/k;->n:Z

    .line 12
    iget-object p1, p0, Lcom/tencent/liteav/videoconsumer/renderer/k;->c:Lcom/tencent/liteav/base/util/CustomHandler;

    invoke-static {p0}, Lcom/tencent/liteav/videoconsumer/renderer/m;->a(Lcom/tencent/liteav/videoconsumer/renderer/k;)Ljava/lang/Runnable;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;Lcom/tencent/liteav/videoconsumer/renderer/RenderViewHelperInterface$RenderViewListener;Lcom/tencent/rtmp/ui/TXCloudVideoView;Landroid/view/TextureView;)V
    .locals 3

    .line 13
    invoke-direct {p0}, Lcom/tencent/liteav/videoconsumer/renderer/RenderViewHelperInterface;-><init>()V

    .line 14
    new-instance v0, Lcom/tencent/liteav/base/util/CustomHandler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/tencent/liteav/base/util/CustomHandler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/tencent/liteav/videoconsumer/renderer/k;->c:Lcom/tencent/liteav/base/util/CustomHandler;

    .line 15
    new-instance v0, Lcom/tencent/liteav/base/b/b;

    invoke-direct {v0}, Lcom/tencent/liteav/base/b/b;-><init>()V

    iput-object v0, p0, Lcom/tencent/liteav/videoconsumer/renderer/k;->d:Lcom/tencent/liteav/base/b/b;

    const/4 v0, 0x0

    .line 16
    iput-boolean v0, p0, Lcom/tencent/liteav/videoconsumer/renderer/k;->g:Z

    .line 17
    new-instance v1, Lcom/tencent/liteav/base/util/Size;

    invoke-direct {v1}, Lcom/tencent/liteav/base/util/Size;-><init>()V

    iput-object v1, p0, Lcom/tencent/liteav/videoconsumer/renderer/k;->h:Lcom/tencent/liteav/base/util/Size;

    const/4 v1, 0x0

    .line 18
    iput-object v1, p0, Lcom/tencent/liteav/videoconsumer/renderer/k;->i:Lcom/tencent/liteav/videobase/base/GLConstants$GLScaleType;

    const/4 v1, 0x1

    .line 19
    iput-boolean v1, p0, Lcom/tencent/liteav/videoconsumer/renderer/k;->j:Z

    .line 20
    iput-boolean v0, p0, Lcom/tencent/liteav/videoconsumer/renderer/k;->k:Z

    .line 21
    new-instance v2, Landroid/graphics/Matrix;

    invoke-direct {v2}, Landroid/graphics/Matrix;-><init>()V

    iput-object v2, p0, Lcom/tencent/liteav/videoconsumer/renderer/k;->l:Landroid/graphics/Matrix;

    .line 22
    iput-boolean v1, p0, Lcom/tencent/liteav/videoconsumer/renderer/k;->m:Z

    .line 23
    iput-boolean v0, p0, Lcom/tencent/liteav/videoconsumer/renderer/k;->n:Z

    .line 24
    new-instance v0, Lcom/tencent/liteav/base/util/Size;

    invoke-direct {v0}, Lcom/tencent/liteav/base/util/Size;-><init>()V

    iput-object v0, p0, Lcom/tencent/liteav/videoconsumer/renderer/k;->q:Lcom/tencent/liteav/base/util/Size;

    .line 25
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "TextureViewRenderHelper_"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/tencent/liteav/videoconsumer/renderer/k;->b:Ljava/lang/String;

    .line 26
    iput-object p2, p0, Lcom/tencent/liteav/videoconsumer/renderer/k;->e:Lcom/tencent/liteav/videoconsumer/renderer/RenderViewHelperInterface$RenderViewListener;

    .line 27
    iput-object p3, p0, Lcom/tencent/liteav/videoconsumer/renderer/k;->f:Lcom/tencent/rtmp/ui/TXCloudVideoView;

    .line 28
    iput-object p4, p0, Lcom/tencent/liteav/videoconsumer/renderer/k;->a:Landroid/view/TextureView;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/tencent/rtmp/ui/TXCloudVideoView;Lcom/tencent/liteav/videoconsumer/renderer/RenderViewHelperInterface$RenderViewListener;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, p3, p2, v0}, Lcom/tencent/liteav/videoconsumer/renderer/k;-><init>(Ljava/lang/String;Lcom/tencent/liteav/videoconsumer/renderer/RenderViewHelperInterface$RenderViewListener;Lcom/tencent/rtmp/ui/TXCloudVideoView;Landroid/view/TextureView;)V

    .line 2
    iget-object p1, p0, Lcom/tencent/liteav/videoconsumer/renderer/k;->f:Lcom/tencent/rtmp/ui/TXCloudVideoView;

    if-nez p1, :cond_0

    .line 3
    iget-object p1, p0, Lcom/tencent/liteav/videoconsumer/renderer/k;->b:Ljava/lang/String;

    const-string p2, "construct: txCloudVideoView is null."

    invoke-static {p1, p2}, Lcom/tencent/liteav/base/util/LiteavLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 4
    :cond_0
    iget-object p1, p0, Lcom/tencent/liteav/videoconsumer/renderer/k;->b:Ljava/lang/String;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string p3, "construct: txCloudVideoView="

    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object p3, p0, Lcom/tencent/liteav/videoconsumer/renderer/k;->f:Lcom/tencent/rtmp/ui/TXCloudVideoView;

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Lcom/tencent/liteav/base/util/LiteavLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p1, 0x0

    .line 5
    iput-boolean p1, p0, Lcom/tencent/liteav/videoconsumer/renderer/k;->n:Z

    .line 6
    iget-object p1, p0, Lcom/tencent/liteav/videoconsumer/renderer/k;->c:Lcom/tencent/liteav/base/util/CustomHandler;

    invoke-static {p0}, Lcom/tencent/liteav/videoconsumer/renderer/l;->a(Lcom/tencent/liteav/videoconsumer/renderer/k;)Ljava/lang/Runnable;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method private static a(Landroid/view/View;)Ljava/lang/String;
    .locals 7

    if-nez p0, :cond_0

    .line 15
    const-string/jumbo p0, "null"

    return-object p0

    .line 16
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Landroid/view/View;->isShown()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {p0}, Landroid/view/View;->getVisibility()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    .line 17
    invoke-virtual {p0}, Landroid/view/View;->getWindowVisibility()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    filled-new-array/range {v1 .. v6}, [Ljava/lang/Object;

    move-result-object v0

    .line 18
    const-string v1, "%s: is_shown:%b, visibility:%s, window_visibility:%s, size:%dx%d"

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 19
    invoke-static {}, Lcom/tencent/liteav/base/system/LiteavSystemInfo;->getSystemOSVersionInt()I

    move-result v1

    const/16 v2, 0x13

    if-lt v1, v2, :cond_1

    .line 20
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    const-string v2, ", is_attached:%b"

    invoke-static {v2, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 21
    :cond_1
    instance-of v1, p0, Landroid/view/TextureView;

    if-eqz v1, :cond_2

    .line 22
    check-cast p0, Landroid/view/TextureView;

    .line 23
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Landroid/view/TextureView;->isAvailable()Z

    move-result p0

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    const-string v0, ", is_surface_available:%s"

    invoke-static {v0, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_2
    return-object v0
.end method

.method private a()V
    .locals 4

    .line 26
    iget-object v0, p0, Lcom/tencent/liteav/videoconsumer/renderer/k;->a:Landroid/view/TextureView;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/tencent/liteav/videoconsumer/renderer/k;->f:Lcom/tencent/rtmp/ui/TXCloudVideoView;

    if-nez v0, :cond_0

    .line 27
    iget-object v0, p0, Lcom/tencent/liteav/videoconsumer/renderer/k;->b:Ljava/lang/String;

    const-string/jumbo v1, "setup: null view"

    invoke-static {v0, v1}, Lcom/tencent/liteav/base/util/LiteavLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 28
    :cond_0
    iget-object v0, p0, Lcom/tencent/liteav/videoconsumer/renderer/k;->f:Lcom/tencent/rtmp/ui/TXCloudVideoView;

    if-eqz v0, :cond_2

    .line 29
    invoke-static {v0}, Lcom/tencent/liteav/videobase/videobase/TXCCloudVideoViewMethodInvoker;->getFreeTextureView(Lcom/tencent/rtmp/ui/TXCloudVideoView;)Landroid/view/TextureView;

    move-result-object v0

    iput-object v0, p0, Lcom/tencent/liteav/videoconsumer/renderer/k;->a:Landroid/view/TextureView;

    if-nez v0, :cond_1

    .line 30
    new-instance v0, Landroid/view/TextureView;

    iget-object v1, p0, Lcom/tencent/liteav/videoconsumer/renderer/k;->f:Lcom/tencent/rtmp/ui/TXCloudVideoView;

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/view/TextureView;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/tencent/liteav/videoconsumer/renderer/k;->a:Landroid/view/TextureView;

    .line 31
    :cond_1
    iget-object v0, p0, Lcom/tencent/liteav/videoconsumer/renderer/k;->f:Lcom/tencent/rtmp/ui/TXCloudVideoView;

    iget-object v1, p0, Lcom/tencent/liteav/videoconsumer/renderer/k;->a:Landroid/view/TextureView;

    invoke-static {v0, v1}, Lcom/tencent/liteav/videobase/videobase/TXCCloudVideoViewMethodInvoker;->addViewInternal(Lcom/tencent/rtmp/ui/TXCloudVideoView;Landroid/view/TextureView;)V

    .line 32
    iget-object v0, p0, Lcom/tencent/liteav/videoconsumer/renderer/k;->b:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string/jumbo v2, "setup: add view: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/tencent/liteav/videoconsumer/renderer/k;->a:Landroid/view/TextureView;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/tencent/liteav/base/util/LiteavLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 33
    :cond_2
    iget-object v0, p0, Lcom/tencent/liteav/videoconsumer/renderer/k;->a:Landroid/view/TextureView;

    invoke-virtual {v0, p0}, Landroid/view/TextureView;->setSurfaceTextureListener(Landroid/view/TextureView$SurfaceTextureListener;)V

    .line 34
    iget-object v0, p0, Lcom/tencent/liteav/videoconsumer/renderer/k;->a:Landroid/view/TextureView;

    invoke-virtual {v0}, Landroid/view/TextureView;->isAvailable()Z

    move-result v0

    if-nez v0, :cond_3

    .line 35
    iget-object v0, p0, Lcom/tencent/liteav/videoconsumer/renderer/k;->b:Ljava/lang/String;

    const-string/jumbo v1, "setup: textureView not available."

    invoke-static {v0, v1}, Lcom/tencent/liteav/base/util/LiteavLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 36
    invoke-virtual {p0}, Lcom/tencent/liteav/videoconsumer/renderer/k;->checkViewAvailability()V

    return-void

    .line 37
    :cond_3
    new-instance v0, Lcom/tencent/liteav/base/util/Size;

    iget-object v1, p0, Lcom/tencent/liteav/videoconsumer/renderer/k;->a:Landroid/view/TextureView;

    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    move-result v1

    iget-object v2, p0, Lcom/tencent/liteav/videoconsumer/renderer/k;->a:Landroid/view/TextureView;

    invoke-virtual {v2}, Landroid/view/View;->getHeight()I

    move-result v2

    invoke-direct {v0, v1, v2}, Lcom/tencent/liteav/base/util/Size;-><init>(II)V

    .line 38
    iget-object v1, p0, Lcom/tencent/liteav/videoconsumer/renderer/k;->b:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string/jumbo v3, "setup: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v3, p0, Lcom/tencent/liteav/videoconsumer/renderer/k;->a:Landroid/view/TextureView;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, ","

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, ", isShown="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lcom/tencent/liteav/videoconsumer/renderer/k;->a:Landroid/view/TextureView;

    .line 39
    invoke-virtual {v3}, Landroid/view/View;->isShown()Z

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 40
    invoke-static {v1, v2}, Lcom/tencent/liteav/base/util/LiteavLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 41
    iget-object v1, p0, Lcom/tencent/liteav/videoconsumer/renderer/k;->a:Landroid/view/TextureView;

    .line 42
    invoke-virtual {v1}, Landroid/view/TextureView;->getSurfaceTexture()Landroid/graphics/SurfaceTexture;

    move-result-object v1

    iget v2, v0, Lcom/tencent/liteav/base/util/Size;->width:I

    iget v0, v0, Lcom/tencent/liteav/base/util/Size;->height:I

    .line 43
    invoke-direct {p0, v1, v2, v0}, Lcom/tencent/liteav/videoconsumer/renderer/k;->a(Landroid/graphics/SurfaceTexture;II)V

    return-void
.end method

.method private a(Landroid/graphics/SurfaceTexture;II)V
    .locals 2

    .line 44
    iget-object v0, p0, Lcom/tencent/liteav/videoconsumer/renderer/k;->o:Landroid/graphics/SurfaceTexture;

    if-nez v0, :cond_0

    .line 45
    iput-object p1, p0, Lcom/tencent/liteav/videoconsumer/renderer/k;->o:Landroid/graphics/SurfaceTexture;

    goto :goto_0

    :cond_0
    if-eq p1, v0, :cond_1

    .line 46
    iget-object p1, p0, Lcom/tencent/liteav/videoconsumer/renderer/k;->b:Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string/jumbo v1, "notifySurfaceChanged: reset surfaceTexture: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/tencent/liteav/videoconsumer/renderer/k;->o:Landroid/graphics/SurfaceTexture;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/tencent/liteav/base/util/LiteavLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 47
    iget-object p1, p0, Lcom/tencent/liteav/videoconsumer/renderer/k;->a:Landroid/view/TextureView;

    iget-object v0, p0, Lcom/tencent/liteav/videoconsumer/renderer/k;->o:Landroid/graphics/SurfaceTexture;

    invoke-virtual {p1, v0}, Landroid/view/TextureView;->setSurfaceTexture(Landroid/graphics/SurfaceTexture;)V

    .line 48
    :cond_1
    :goto_0
    iget-object p1, p0, Lcom/tencent/liteav/videoconsumer/renderer/k;->q:Lcom/tencent/liteav/base/util/Size;

    invoke-virtual {p1, p2, p3}, Lcom/tencent/liteav/base/util/Size;->set(II)V

    .line 49
    iget-object p1, p0, Lcom/tencent/liteav/videoconsumer/renderer/k;->p:Landroid/view/Surface;

    if-nez p1, :cond_2

    .line 50
    new-instance p1, Landroid/view/Surface;

    iget-object p2, p0, Lcom/tencent/liteav/videoconsumer/renderer/k;->o:Landroid/graphics/SurfaceTexture;

    invoke-direct {p1, p2}, Landroid/view/Surface;-><init>(Landroid/graphics/SurfaceTexture;)V

    iput-object p1, p0, Lcom/tencent/liteav/videoconsumer/renderer/k;->p:Landroid/view/Surface;

    .line 51
    iget-object p2, p0, Lcom/tencent/liteav/videoconsumer/renderer/k;->e:Lcom/tencent/liteav/videoconsumer/renderer/RenderViewHelperInterface$RenderViewListener;

    if-eqz p2, :cond_2

    const/4 p3, 0x0

    .line 52
    invoke-interface {p2, p1, p3}, Lcom/tencent/liteav/videoconsumer/renderer/RenderViewHelperInterface$RenderViewListener;->onSurfaceChanged(Landroid/view/Surface;Z)V

    :cond_2
    return-void
.end method

.method public static synthetic a(Lcom/tencent/liteav/videoconsumer/renderer/k;)V
    .locals 0

    .line 24
    invoke-direct {p0}, Lcom/tencent/liteav/videoconsumer/renderer/k;->b()V

    .line 25
    invoke-direct {p0}, Lcom/tencent/liteav/videoconsumer/renderer/k;->c()V

    return-void
.end method

.method public static synthetic a(Lcom/tencent/liteav/videoconsumer/renderer/k;Z)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/tencent/liteav/videoconsumer/renderer/k;->b:Ljava/lang/String;

    const-string/jumbo v1, "release: clearLastImage="

    invoke-static {p1}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/tencent/liteav/base/util/LiteavLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/tencent/liteav/videoconsumer/renderer/k;->a:Landroid/view/TextureView;

    if-nez v0, :cond_0

    return-void

    .line 3
    :cond_0
    invoke-virtual {v0}, Landroid/view/TextureView;->getSurfaceTextureListener()Landroid/view/TextureView$SurfaceTextureListener;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v0, p0, :cond_1

    .line 4
    iget-object v0, p0, Lcom/tencent/liteav/videoconsumer/renderer/k;->a:Landroid/view/TextureView;

    invoke-virtual {v0, v1}, Landroid/view/TextureView;->setSurfaceTextureListener(Landroid/view/TextureView$SurfaceTextureListener;)V

    .line 5
    :cond_1
    iget-object v0, p0, Lcom/tencent/liteav/videoconsumer/renderer/k;->p:Landroid/view/Surface;

    if-eqz v0, :cond_2

    .line 6
    invoke-virtual {v0}, Landroid/view/Surface;->release()V

    .line 7
    iput-object v1, p0, Lcom/tencent/liteav/videoconsumer/renderer/k;->p:Landroid/view/Surface;

    .line 8
    :cond_2
    iget-object v0, p0, Lcom/tencent/liteav/videoconsumer/renderer/k;->o:Landroid/graphics/SurfaceTexture;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/tencent/liteav/videoconsumer/renderer/k;->a:Landroid/view/TextureView;

    invoke-virtual {v0}, Landroid/view/TextureView;->getSurfaceTexture()Landroid/graphics/SurfaceTexture;

    move-result-object v0

    iget-object v2, p0, Lcom/tencent/liteav/videoconsumer/renderer/k;->o:Landroid/graphics/SurfaceTexture;

    if-eq v0, v2, :cond_3

    .line 9
    invoke-virtual {v2}, Landroid/graphics/SurfaceTexture;->release()V

    .line 10
    :cond_3
    iget-object v0, p0, Lcom/tencent/liteav/videoconsumer/renderer/k;->f:Lcom/tencent/rtmp/ui/TXCloudVideoView;

    if-eqz v0, :cond_4

    .line 11
    iget-object v2, p0, Lcom/tencent/liteav/videoconsumer/renderer/k;->a:Landroid/view/TextureView;

    invoke-static {v0, v2, p1}, Lcom/tencent/liteav/videobase/videobase/TXCCloudVideoViewMethodInvoker;->removeViewInternal(Lcom/tencent/rtmp/ui/TXCloudVideoView;Landroid/view/TextureView;Z)V

    .line 12
    :cond_4
    iput-object v1, p0, Lcom/tencent/liteav/videoconsumer/renderer/k;->o:Landroid/graphics/SurfaceTexture;

    .line 13
    iput-object v1, p0, Lcom/tencent/liteav/videoconsumer/renderer/k;->a:Landroid/view/TextureView;

    const/4 p1, 0x1

    .line 14
    iput-boolean p1, p0, Lcom/tencent/liteav/videoconsumer/renderer/k;->g:Z

    return-void
.end method

.method private declared-synchronized b()V
    .locals 11

    monitor-enter p0

    .line 5
    :try_start_0
    iget-object v0, p0, Lcom/tencent/liteav/videoconsumer/renderer/k;->a:Landroid/view/TextureView;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_0

    .line 6
    monitor-exit p0

    return-void

    .line 7
    :cond_0
    :try_start_1
    iget-boolean v1, p0, Lcom/tencent/liteav/videoconsumer/renderer/k;->m:Z

    if-nez v1, :cond_1

    .line 8
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Lcom/tencent/liteav/videoconsumer/renderer/k;->l:Landroid/graphics/Matrix;

    .line 9
    iget-object v1, p0, Lcom/tencent/liteav/videoconsumer/renderer/k;->a:Landroid/view/TextureView;

    invoke-virtual {v1, v0}, Landroid/view/TextureView;->setTransform(Landroid/graphics/Matrix;)V

    .line 10
    iget-object v0, p0, Lcom/tencent/liteav/videoconsumer/renderer/k;->a:Landroid/view/TextureView;

    invoke-virtual {v0}, Landroid/view/View;->postInvalidate()V

    .line 11
    iget-object v0, p0, Lcom/tencent/liteav/videoconsumer/renderer/k;->d:Lcom/tencent/liteav/base/b/b;

    const-string/jumbo v1, "resetTextureViewRenderMatrix"

    invoke-virtual {v0, v1}, Lcom/tencent/liteav/base/b/b;->a(Ljava/lang/String;)Lcom/tencent/liteav/base/b/a;

    move-result-object v0

    iget-object v1, p0, Lcom/tencent/liteav/videoconsumer/renderer/k;->b:Ljava/lang/String;

    const-string/jumbo v2, "resetTextureViewRenderMatrix"

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Object;

    invoke-static {v0, v1, v2, v3}, Lcom/tencent/liteav/base/util/LiteavLog;->i(Lcom/tencent/liteav/base/b/a;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 12
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    goto/16 :goto_4

    .line 13
    :cond_1
    :try_start_2
    new-instance v1, Lcom/tencent/liteav/base/util/Size;

    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v0

    iget-object v2, p0, Lcom/tencent/liteav/videoconsumer/renderer/k;->a:Landroid/view/TextureView;

    invoke-virtual {v2}, Landroid/view/View;->getHeight()I

    move-result v2

    invoke-direct {v1, v0, v2}, Lcom/tencent/liteav/base/util/Size;-><init>(II)V

    .line 14
    iget-object v0, p0, Lcom/tencent/liteav/videoconsumer/renderer/k;->h:Lcom/tencent/liteav/base/util/Size;

    invoke-virtual {v0}, Lcom/tencent/liteav/base/util/Size;->isValid()Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-virtual {v1}, Lcom/tencent/liteav/base/util/Size;->isValid()Z

    move-result v0

    if-nez v0, :cond_2

    goto/16 :goto_3

    .line 15
    :cond_2
    invoke-virtual {v1}, Lcom/tencent/liteav/base/util/Size;->aspectRatio()D

    move-result-wide v2

    .line 16
    iget-object v0, p0, Lcom/tencent/liteav/videoconsumer/renderer/k;->h:Lcom/tencent/liteav/base/util/Size;

    invoke-virtual {v0}, Lcom/tencent/liteav/base/util/Size;->aspectRatio()D

    move-result-wide v4

    cmpg-double v0, v4, v2

    const-wide/high16 v6, 0x3ff0000000000000L    # 1.0

    if-gez v0, :cond_4

    .line 17
    iget-object v0, p0, Lcom/tencent/liteav/videoconsumer/renderer/k;->i:Lcom/tencent/liteav/videobase/base/GLConstants$GLScaleType;

    sget-object v8, Lcom/tencent/liteav/videobase/base/GLConstants$GLScaleType;->b:Lcom/tencent/liteav/videobase/base/GLConstants$GLScaleType;

    if-ne v0, v8, :cond_3

    :goto_0
    div-double/2addr v4, v2

    move-wide v2, v6

    move-wide v6, v4

    goto :goto_2

    .line 18
    :cond_3
    sget-object v8, Lcom/tencent/liteav/videobase/base/GLConstants$GLScaleType;->a:Lcom/tencent/liteav/videobase/base/GLConstants$GLScaleType;

    if-ne v0, v8, :cond_6

    :goto_1
    div-double/2addr v2, v4

    goto :goto_2

    .line 19
    :cond_4
    iget-object v0, p0, Lcom/tencent/liteav/videoconsumer/renderer/k;->i:Lcom/tencent/liteav/videobase/base/GLConstants$GLScaleType;

    sget-object v8, Lcom/tencent/liteav/videobase/base/GLConstants$GLScaleType;->b:Lcom/tencent/liteav/videobase/base/GLConstants$GLScaleType;

    if-ne v0, v8, :cond_5

    goto :goto_1

    .line 20
    :cond_5
    sget-object v8, Lcom/tencent/liteav/videobase/base/GLConstants$GLScaleType;->a:Lcom/tencent/liteav/videobase/base/GLConstants$GLScaleType;

    if-ne v0, v8, :cond_6

    goto :goto_0

    :cond_6
    move-wide v2, v6

    .line 21
    :goto_2
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    double-to-float v4, v6

    double-to-float v5, v2

    .line 22
    iget v8, v1, Lcom/tencent/liteav/base/util/Size;->width:I

    int-to-float v8, v8

    const/high16 v9, 0x40000000    # 2.0f

    div-float/2addr v8, v9

    iget v10, v1, Lcom/tencent/liteav/base/util/Size;->height:I

    int-to-float v10, v10

    div-float/2addr v10, v9

    invoke-virtual {v0, v4, v5, v8, v10}, Landroid/graphics/Matrix;->setScale(FFFF)V

    .line 23
    iget-object v4, p0, Lcom/tencent/liteav/videoconsumer/renderer/k;->a:Landroid/view/TextureView;

    new-instance v5, Landroid/graphics/Matrix;

    invoke-direct {v5}, Landroid/graphics/Matrix;-><init>()V

    invoke-virtual {v4, v5}, Landroid/view/TextureView;->getTransform(Landroid/graphics/Matrix;)Landroid/graphics/Matrix;

    move-result-object v4

    invoke-virtual {v0, v4}, Landroid/graphics/Matrix;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_7

    .line 24
    iget-object v4, p0, Lcom/tencent/liteav/videoconsumer/renderer/k;->a:Landroid/view/TextureView;

    invoke-virtual {v4, v0}, Landroid/view/TextureView;->setTransform(Landroid/graphics/Matrix;)V

    .line 25
    iget-object v4, p0, Lcom/tencent/liteav/videoconsumer/renderer/k;->a:Landroid/view/TextureView;

    invoke-virtual {v4}, Landroid/view/View;->postInvalidate()V

    .line 26
    iget-object v4, p0, Lcom/tencent/liteav/videoconsumer/renderer/k;->d:Lcom/tencent/liteav/base/b/b;

    const-string/jumbo v5, "updateTextureViewMatrix"

    invoke-virtual {v4, v5}, Lcom/tencent/liteav/base/b/b;->a(Ljava/lang/String;)Lcom/tencent/liteav/base/b/a;

    move-result-object v4

    iget-object v5, p0, Lcom/tencent/liteav/videoconsumer/renderer/k;->b:Ljava/lang/String;

    const-string/jumbo v8, "updateTextureViewRenderMatrix: view: %s, scaleX: %.2f, scaleY: %.2f, frame: %s, view: %s"

    iget-object v9, p0, Lcom/tencent/liteav/videoconsumer/renderer/k;->a:Landroid/view/TextureView;

    .line 27
    invoke-static {v6, v7}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v6

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    iget-object v3, p0, Lcom/tencent/liteav/videoconsumer/renderer/k;->h:Lcom/tencent/liteav/base/util/Size;

    filled-new-array {v9, v6, v2, v3, v1}, [Ljava/lang/Object;

    move-result-object v1

    .line 28
    invoke-static {v4, v5, v8, v1}, Lcom/tencent/liteav/base/util/LiteavLog;->i(Lcom/tencent/liteav/base/b/a;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 29
    :cond_7
    iput-object v0, p0, Lcom/tencent/liteav/videoconsumer/renderer/k;->l:Landroid/graphics/Matrix;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 30
    monitor-exit p0

    return-void

    .line 31
    :cond_8
    :goto_3
    :try_start_3
    iget-object v0, p0, Lcom/tencent/liteav/videoconsumer/renderer/k;->d:Lcom/tencent/liteav/base/b/b;

    const-string/jumbo v2, "updateTextureViewMatrixFailure"

    invoke-virtual {v0, v2}, Lcom/tencent/liteav/base/b/b;->a(Ljava/lang/String;)Lcom/tencent/liteav/base/b/a;

    move-result-object v0

    iget-object v2, p0, Lcom/tencent/liteav/videoconsumer/renderer/k;->b:Ljava/lang/String;

    const-string/jumbo v3, "updateTextureViewRenderMatrix, invalid frameSize: %s, viewSize: %s"

    iget-object v4, p0, Lcom/tencent/liteav/videoconsumer/renderer/k;->h:Lcom/tencent/liteav/base/util/Size;

    .line 32
    invoke-virtual {v4}, Lcom/tencent/liteav/base/util/Size;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1}, Lcom/tencent/liteav/base/util/Size;->toString()Ljava/lang/String;

    move-result-object v1

    filled-new-array {v4, v1}, [Ljava/lang/Object;

    move-result-object v1

    .line 33
    invoke-static {v0, v2, v3, v1}, Lcom/tencent/liteav/base/util/LiteavLog;->i(Lcom/tencent/liteav/base/b/a;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 34
    monitor-exit p0

    return-void

    :goto_4
    :try_start_4
    monitor-exit p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    throw v0
.end method

.method public static synthetic b(Lcom/tencent/liteav/videoconsumer/renderer/k;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/tencent/liteav/videoconsumer/renderer/k;->b()V

    .line 2
    invoke-direct {p0}, Lcom/tencent/liteav/videoconsumer/renderer/k;->c()V

    .line 3
    iget-object v0, p0, Lcom/tencent/liteav/videoconsumer/renderer/k;->a:Landroid/view/TextureView;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-eqz v0, :cond_0

    .line 4
    iget-object p0, p0, Lcom/tencent/liteav/videoconsumer/renderer/k;->a:Landroid/view/TextureView;

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    :cond_0
    return-void
.end method

.method private declared-synchronized c()V
    .locals 3

    monitor-enter p0

    .line 13
    :try_start_0
    iget-object v0, p0, Lcom/tencent/liteav/videoconsumer/renderer/k;->a:Landroid/view/TextureView;

    if-eqz v0, :cond_2

    iget-boolean v1, p0, Lcom/tencent/liteav/videoconsumer/renderer/k;->n:Z

    if-eqz v1, :cond_0

    goto :goto_0

    .line 14
    :cond_0
    iget-boolean v1, p0, Lcom/tencent/liteav/videoconsumer/renderer/k;->m:Z

    if-nez v1, :cond_1

    iget-object v1, p0, Lcom/tencent/liteav/videoconsumer/renderer/k;->i:Lcom/tencent/liteav/videobase/base/GLConstants$GLScaleType;

    sget-object v2, Lcom/tencent/liteav/videobase/base/GLConstants$GLScaleType;->b:Lcom/tencent/liteav/videobase/base/GLConstants$GLScaleType;

    if-ne v1, v2, :cond_1

    const/4 v1, 0x0

    .line 15
    invoke-virtual {v0, v1}, Landroid/view/TextureView;->setOpaque(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    const/4 v1, 0x1

    .line 16
    :try_start_1
    invoke-virtual {v0, v1}, Landroid/view/TextureView;->setOpaque(Z)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 17
    monitor-exit p0

    return-void

    .line 18
    :cond_2
    :goto_0
    monitor-exit p0

    return-void

    :goto_1
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0
.end method

.method public static synthetic c(Lcom/tencent/liteav/videoconsumer/renderer/k;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/tencent/liteav/videoconsumer/renderer/k;->a:Landroid/view/TextureView;

    if-nez v0, :cond_0

    .line 2
    iget-object p0, p0, Lcom/tencent/liteav/videoconsumer/renderer/k;->b:Ljava/lang/String;

    const-string v0, "checkViewAvailability: textureView is null"

    invoke-static {p0, v0}, Lcom/tencent/liteav/base/util/LiteavLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 3
    :cond_0
    invoke-virtual {v0}, Landroid/view/TextureView;->isAvailable()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/tencent/liteav/videoconsumer/renderer/k;->a:Landroid/view/TextureView;

    .line 4
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/tencent/liteav/videoconsumer/renderer/k;->a:Landroid/view/TextureView;

    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/tencent/liteav/videoconsumer/renderer/k;->a:Landroid/view/TextureView;

    .line 5
    invoke-virtual {v0}, Landroid/view/View;->isShown()Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    .line 6
    :cond_1
    iget-object v0, p0, Lcom/tencent/liteav/videoconsumer/renderer/k;->b:Ljava/lang/String;

    iget-object v1, p0, Lcom/tencent/liteav/videoconsumer/renderer/k;->a:Landroid/view/TextureView;

    .line 7
    invoke-static {v1}, Lcom/tencent/liteav/videoconsumer/renderer/k;->a(Landroid/view/View;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/tencent/liteav/videoconsumer/renderer/k;->f:Lcom/tencent/rtmp/ui/TXCloudVideoView;

    .line 8
    invoke-static {v2}, Lcom/tencent/liteav/videoconsumer/renderer/k;->a(Landroid/view/View;)Ljava/lang/String;

    move-result-object v2

    filled-new-array {v1, v2}, [Ljava/lang/Object;

    move-result-object v1

    .line 9
    const-string v2, "checkViewAvailability: %s, %s"

    invoke-static {v0, v2, v1}, Lcom/tencent/liteav/base/util/LiteavLog;->w(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 10
    :goto_0
    iget-object v0, p0, Lcom/tencent/liteav/videoconsumer/renderer/k;->f:Lcom/tencent/rtmp/ui/TXCloudVideoView;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/tencent/liteav/videoconsumer/renderer/k;->a:Landroid/view/TextureView;

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-eqz v0, :cond_2

    .line 11
    iget-object v0, p0, Lcom/tencent/liteav/videoconsumer/renderer/k;->a:Landroid/view/TextureView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 12
    :cond_2
    iget-object v0, p0, Lcom/tencent/liteav/videoconsumer/renderer/k;->a:Landroid/view/TextureView;

    invoke-virtual {v0}, Landroid/view/View;->isShown()Z

    move-result v0

    iput-boolean v0, p0, Lcom/tencent/liteav/videoconsumer/renderer/k;->j:Z

    return-void
.end method

.method public static synthetic d(Lcom/tencent/liteav/videoconsumer/renderer/k;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/tencent/liteav/videoconsumer/renderer/k;->a()V

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
.end method

.method public static synthetic e(Lcom/tencent/liteav/videoconsumer/renderer/k;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/tencent/liteav/videoconsumer/renderer/k;->a()V

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
.end method

.method public static synthetic f(Lcom/tencent/liteav/videoconsumer/renderer/k;)V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/liteav/videoconsumer/renderer/k;->b:Ljava/lang/String;

    .line 3
    .line 4
    const-string v1, "first frame rendered"

    .line 5
    .line 6
    .line 7
    invoke-static {v0, v1}, Lcom/tencent/liteav/base/util/LiteavLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 8
    .line 9
    iget-object v0, p0, Lcom/tencent/liteav/videoconsumer/renderer/k;->f:Lcom/tencent/rtmp/ui/TXCloudVideoView;

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    iget-object p0, p0, Lcom/tencent/liteav/videoconsumer/renderer/k;->a:Landroid/view/TextureView;

    .line 14
    .line 15
    if-nez p0, :cond_0

    .line 16
    goto :goto_0

    .line 17
    .line 18
    .line 19
    :cond_0
    invoke-static {v0, p0}, Lcom/tencent/liteav/videobase/videobase/TXCCloudVideoViewMethodInvoker;->notifyFirstFrameRendered(Lcom/tencent/rtmp/ui/TXCloudVideoView;Landroid/view/TextureView;)V

    .line 20
    :cond_1
    :goto_0
    return-void
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method


# virtual methods
.method public final checkViewAvailability()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/liteav/videoconsumer/renderer/k;->c:Lcom/tencent/liteav/base/util/CustomHandler;

    .line 3
    .line 4
    .line 5
    invoke-static {p0}, Lcom/tencent/liteav/videoconsumer/renderer/o;->a(Lcom/tencent/liteav/videoconsumer/renderer/k;)Ljava/lang/Runnable;

    .line 6
    move-result-object v1

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, v1}, Lcom/tencent/liteav/base/util/CustomHandler;->runOrPost(Ljava/lang/Runnable;)Z

    .line 10
    return-void
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public final declared-synchronized enableNonUniformScale(Z)V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    .line 3
    :try_start_0
    iget-boolean v0, p0, Lcom/tencent/liteav/videoconsumer/renderer/k;->m:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 4
    .line 5
    if-ne v0, p1, :cond_0

    .line 6
    monitor-exit p0

    .line 7
    return-void

    .line 8
    .line 9
    :cond_0
    :try_start_1
    iput-boolean p1, p0, Lcom/tencent/liteav/videoconsumer/renderer/k;->m:Z

    .line 10
    .line 11
    iget-object v0, p0, Lcom/tencent/liteav/videoconsumer/renderer/k;->b:Ljava/lang/String;

    .line 12
    .line 13
    const-string v1, "enableNonUniformScale: "

    .line 14
    .line 15
    .line 16
    invoke-static {p1}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    .line 17
    move-result-object p1

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 21
    move-result-object p1

    .line 22
    .line 23
    .line 24
    invoke-static {v0, p1}, Lcom/tencent/liteav/base/util/LiteavLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 25
    .line 26
    iget-object p1, p0, Lcom/tencent/liteav/videoconsumer/renderer/k;->c:Lcom/tencent/liteav/base/util/CustomHandler;

    .line 27
    .line 28
    .line 29
    invoke-static {p0}, Lcom/tencent/liteav/videoconsumer/renderer/q;->a(Lcom/tencent/liteav/videoconsumer/renderer/k;)Ljava/lang/Runnable;

    .line 30
    move-result-object v0

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 34
    monitor-exit p0

    .line 35
    return-void

    .line 36
    :catchall_0
    move-exception p1

    .line 37
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 38
    throw p1
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

.method public final getTransformMatrix(II)Landroid/graphics/Matrix;
    .locals 3

    .line 1
    .line 2
    new-instance v0, Landroid/graphics/Matrix;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/tencent/liteav/videoconsumer/renderer/k;->l:Landroid/graphics/Matrix;

    .line 5
    .line 6
    .line 7
    invoke-direct {v0, v1}, Landroid/graphics/Matrix;-><init>(Landroid/graphics/Matrix;)V

    .line 8
    int-to-float p1, p1

    .line 9
    .line 10
    const/high16 v1, 0x40000000    # 2.0f

    .line 11
    div-float/2addr p1, v1

    .line 12
    int-to-float p2, p2

    .line 13
    div-float/2addr p2, v1

    .line 14
    .line 15
    const/high16 v1, 0x3f800000    # 1.0f

    .line 16
    .line 17
    const/high16 v2, -0x40800000    # -1.0f

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v1, v2, p1, p2}, Landroid/graphics/Matrix;->postScale(FFFF)Z

    .line 21
    return-object v0
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
.end method

.method public final isUsingTextureView()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
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
.end method

.method public final isVisible()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/tencent/liteav/videoconsumer/renderer/k;->j:Z

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
.end method

.method public final onSurfaceTextureAvailable(Landroid/graphics/SurfaceTexture;II)V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/liteav/videoconsumer/renderer/k;->b:Ljava/lang/String;

    .line 3
    .line 4
    new-instance v1, Ljava/lang/StringBuilder;

    .line 5
    .line 6
    .line 7
    const-string/jumbo v2, "onSurfaceTextureAvailable, size:"

    .line 8
    .line 9
    .line 10
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    const-string/jumbo v2, "x"

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    const-string v2, " surfaceTexture:"

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 34
    move-result-object v1

    .line 35
    .line 36
    .line 37
    invoke-static {v0, v1}, Lcom/tencent/liteav/base/util/LiteavLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    invoke-direct {p0, p1, p2, p3}, Lcom/tencent/liteav/videoconsumer/renderer/k;->a(Landroid/graphics/SurfaceTexture;II)V

    .line 41
    .line 42
    .line 43
    invoke-direct {p0}, Lcom/tencent/liteav/videoconsumer/renderer/k;->b()V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0}, Lcom/tencent/liteav/videoconsumer/renderer/k;->checkViewAvailability()V

    .line 47
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

.method public final onSurfaceTextureDestroyed(Landroid/graphics/SurfaceTexture;)Z
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/liteav/videoconsumer/renderer/k;->b:Ljava/lang/String;

    .line 3
    .line 4
    .line 5
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 6
    move-result-object v1

    .line 7
    .line 8
    .line 9
    const-string/jumbo v2, "onSurfaceTextureDestroyed surface:"

    .line 10
    .line 11
    .line 12
    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 13
    move-result-object v1

    .line 14
    .line 15
    .line 16
    invoke-static {v0, v1}, Lcom/tencent/liteav/base/util/LiteavLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 17
    const/4 v0, 0x0

    .line 18
    .line 19
    iput-boolean v0, p0, Lcom/tencent/liteav/videoconsumer/renderer/k;->k:Z

    .line 20
    .line 21
    iget-object v1, p0, Lcom/tencent/liteav/videoconsumer/renderer/k;->o:Landroid/graphics/SurfaceTexture;

    .line 22
    .line 23
    if-eq v1, p1, :cond_0

    .line 24
    const/4 p1, 0x1

    .line 25
    return p1

    .line 26
    :cond_0
    return v0
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
.end method

.method public final onSurfaceTextureSizeChanged(Landroid/graphics/SurfaceTexture;II)V
    .locals 6

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/liteav/videoconsumer/renderer/k;->d:Lcom/tencent/liteav/base/b/b;

    .line 3
    .line 4
    .line 5
    const-string/jumbo v1, "surfaceSizeChanged"

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, v1}, Lcom/tencent/liteav/base/b/b;->a(Ljava/lang/String;)Lcom/tencent/liteav/base/b/a;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    iget-object v1, p0, Lcom/tencent/liteav/videoconsumer/renderer/k;->b:Ljava/lang/String;

    .line 12
    .line 13
    iget-object v2, p0, Lcom/tencent/liteav/videoconsumer/renderer/k;->q:Lcom/tencent/liteav/base/util/Size;

    .line 14
    .line 15
    iget v2, v2, Lcom/tencent/liteav/base/util/Size;->width:I

    .line 16
    .line 17
    .line 18
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 19
    move-result-object v2

    .line 20
    .line 21
    iget-object v3, p0, Lcom/tencent/liteav/videoconsumer/renderer/k;->q:Lcom/tencent/liteav/base/util/Size;

    .line 22
    .line 23
    iget v3, v3, Lcom/tencent/liteav/base/util/Size;->height:I

    .line 24
    .line 25
    .line 26
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 27
    move-result-object v3

    .line 28
    .line 29
    .line 30
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 31
    move-result-object v4

    .line 32
    .line 33
    .line 34
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 35
    move-result-object v5

    .line 36
    .line 37
    .line 38
    filled-new-array {v2, v3, v4, v5}, [Ljava/lang/Object;

    .line 39
    move-result-object v2

    .line 40
    .line 41
    .line 42
    const-string/jumbo v3, "onSurfaceTextureSizeChanged: %dx%d --> %dx%d"

    .line 43
    .line 44
    .line 45
    invoke-static {v0, v1, v3, v2}, Lcom/tencent/liteav/base/util/LiteavLog;->i(Lcom/tencent/liteav/base/b/a;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 46
    .line 47
    iget-object v0, p0, Lcom/tencent/liteav/videoconsumer/renderer/k;->q:Lcom/tencent/liteav/base/util/Size;

    .line 48
    .line 49
    iget v1, v0, Lcom/tencent/liteav/base/util/Size;->width:I

    .line 50
    .line 51
    iget v0, v0, Lcom/tencent/liteav/base/util/Size;->height:I

    .line 52
    const/4 v2, 0x0

    .line 53
    const/4 v3, 0x1

    .line 54
    .line 55
    if-le v1, v0, :cond_0

    .line 56
    move v0, v3

    .line 57
    goto :goto_0

    .line 58
    :cond_0
    move v0, v2

    .line 59
    .line 60
    .line 61
    :goto_0
    invoke-direct {p0, p1, p2, p3}, Lcom/tencent/liteav/videoconsumer/renderer/k;->a(Landroid/graphics/SurfaceTexture;II)V

    .line 62
    .line 63
    .line 64
    invoke-direct {p0}, Lcom/tencent/liteav/videoconsumer/renderer/k;->b()V

    .line 65
    .line 66
    if-le p2, p3, :cond_1

    .line 67
    move v2, v3

    .line 68
    .line 69
    :cond_1
    if-eq v0, v2, :cond_3

    .line 70
    .line 71
    iget-object p1, p0, Lcom/tencent/liteav/videoconsumer/renderer/k;->e:Lcom/tencent/liteav/videoconsumer/renderer/RenderViewHelperInterface$RenderViewListener;

    .line 72
    .line 73
    if-eqz p1, :cond_3

    .line 74
    .line 75
    iget-object p1, p0, Lcom/tencent/liteav/videoconsumer/renderer/k;->a:Landroid/view/TextureView;

    .line 76
    .line 77
    if-nez p1, :cond_2

    .line 78
    goto :goto_1

    .line 79
    .line 80
    .line 81
    :cond_2
    invoke-virtual {p1}, Landroid/view/TextureView;->getBitmap()Landroid/graphics/Bitmap;

    .line 82
    move-result-object p1

    .line 83
    .line 84
    if-eqz p1, :cond_3

    .line 85
    .line 86
    iget-object p2, p0, Lcom/tencent/liteav/videoconsumer/renderer/k;->e:Lcom/tencent/liteav/videoconsumer/renderer/RenderViewHelperInterface$RenderViewListener;

    .line 87
    .line 88
    .line 89
    invoke-interface {p2, p1}, Lcom/tencent/liteav/videoconsumer/renderer/RenderViewHelperInterface$RenderViewListener;->onRequestRedraw(Landroid/graphics/Bitmap;)V

    .line 90
    :cond_3
    :goto_1
    return-void
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

.method public final onSurfaceTextureUpdated(Landroid/graphics/SurfaceTexture;)V
    .locals 1

    .line 1
    .line 2
    iget-boolean p1, p0, Lcom/tencent/liteav/videoconsumer/renderer/k;->k:Z

    .line 3
    .line 4
    if-eqz p1, :cond_0

    .line 5
    return-void

    .line 6
    :cond_0
    const/4 p1, 0x1

    .line 7
    .line 8
    iput-boolean p1, p0, Lcom/tencent/liteav/videoconsumer/renderer/k;->k:Z

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/tencent/liteav/videoconsumer/renderer/k;->checkViewAvailability()V

    .line 12
    .line 13
    iget-object p1, p0, Lcom/tencent/liteav/videoconsumer/renderer/k;->c:Lcom/tencent/liteav/base/util/CustomHandler;

    .line 14
    .line 15
    .line 16
    invoke-static {p0}, Lcom/tencent/liteav/videoconsumer/renderer/r;->a(Lcom/tencent/liteav/videoconsumer/renderer/k;)Ljava/lang/Runnable;

    .line 17
    move-result-object v0

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 21
    return-void
    .line 22
    .line 23
    .line 24
    .line 25
.end method

.method public final release(Z)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/liteav/videoconsumer/renderer/k;->c:Lcom/tencent/liteav/base/util/CustomHandler;

    .line 3
    .line 4
    .line 5
    invoke-static {p0, p1}, Lcom/tencent/liteav/videoconsumer/renderer/n;->a(Lcom/tencent/liteav/videoconsumer/renderer/k;Z)Ljava/lang/Runnable;

    .line 6
    move-result-object p1

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

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
.end method

.method public final declared-synchronized updateVideoFrameInfo(Lcom/tencent/liteav/videobase/base/GLConstants$GLScaleType;IIZ)V
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    .line 3
    :try_start_0
    iget-object p4, p0, Lcom/tencent/liteav/videoconsumer/renderer/k;->i:Lcom/tencent/liteav/videobase/base/GLConstants$GLScaleType;

    .line 4
    .line 5
    if-ne p4, p1, :cond_0

    .line 6
    .line 7
    iget-object p4, p0, Lcom/tencent/liteav/videoconsumer/renderer/k;->h:Lcom/tencent/liteav/base/util/Size;

    .line 8
    .line 9
    iget v0, p4, Lcom/tencent/liteav/base/util/Size;->width:I

    .line 10
    .line 11
    if-ne p2, v0, :cond_0

    .line 12
    .line 13
    iget p4, p4, Lcom/tencent/liteav/base/util/Size;->height:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    .line 15
    if-ne p3, p4, :cond_0

    .line 16
    monitor-exit p0

    .line 17
    return-void

    .line 18
    :catchall_0
    move-exception p1

    .line 19
    goto :goto_0

    .line 20
    .line 21
    :cond_0
    :try_start_1
    iget-object p4, p0, Lcom/tencent/liteav/videoconsumer/renderer/k;->b:Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    const-string/jumbo v0, "updateVideoFrameInfo: scaleType: %s, width: %d, height: %d"

    .line 25
    .line 26
    .line 27
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 28
    move-result-object v1

    .line 29
    .line 30
    .line 31
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 32
    move-result-object v2

    .line 33
    .line 34
    .line 35
    filled-new-array {p1, v1, v2}, [Ljava/lang/Object;

    .line 36
    move-result-object v1

    .line 37
    .line 38
    .line 39
    invoke-static {p4, v0, v1}, Lcom/tencent/liteav/base/util/LiteavLog;->i(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 40
    .line 41
    iput-object p1, p0, Lcom/tencent/liteav/videoconsumer/renderer/k;->i:Lcom/tencent/liteav/videobase/base/GLConstants$GLScaleType;

    .line 42
    .line 43
    iget-object p1, p0, Lcom/tencent/liteav/videoconsumer/renderer/k;->h:Lcom/tencent/liteav/base/util/Size;

    .line 44
    .line 45
    .line 46
    invoke-virtual {p1, p2, p3}, Lcom/tencent/liteav/base/util/Size;->set(II)V

    .line 47
    .line 48
    iget-object p1, p0, Lcom/tencent/liteav/videoconsumer/renderer/k;->c:Lcom/tencent/liteav/base/util/CustomHandler;

    .line 49
    .line 50
    .line 51
    invoke-static {p0}, Lcom/tencent/liteav/videoconsumer/renderer/p;->a(Lcom/tencent/liteav/videoconsumer/renderer/k;)Ljava/lang/Runnable;

    .line 52
    move-result-object p2

    .line 53
    .line 54
    .line 55
    invoke-virtual {p1, p2}, Lcom/tencent/liteav/base/util/CustomHandler;->runOrPost(Ljava/lang/Runnable;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 56
    monitor-exit p0

    .line 57
    return-void

    .line 58
    :goto_0
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 59
    throw p1
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
.end method
