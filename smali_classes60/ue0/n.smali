.class public Lue0/n;
.super Ljava/lang/Object;
.source "RenderEffectBlur.java"

# interfaces
.implements Lue0/a;


# annotations
.annotation build Landroidx/annotation/RequiresApi;
    value = 0x1f
.end annotation


# instance fields
.field public final a:Landroid/graphics/RenderNode;

.field public b:I

.field public c:I

.field public d:F

.field public e:Lue0/a;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field public f:Landroid/content/Context;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    const-string v0, "BlurViewNode"

    .line 6
    .line 7
    .line 8
    invoke-static {v0}, Lue0/m;->a(Ljava/lang/String;)Landroid/graphics/RenderNode;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    iput-object v0, p0, Lue0/n;->a:Landroid/graphics/RenderNode;

    .line 12
    .line 13
    const/high16 v0, 0x3f800000    # 1.0f

    .line 14
    .line 15
    iput v0, p0, Lue0/n;->d:F

    .line 16
    return-void
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
.end method


# virtual methods
.method public a()Landroid/graphics/Bitmap$Config;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

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
.end method

.method public b()Z
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
.end method

.method public c()F
    .locals 1

    .line 1
    .line 2
    const/high16 v0, 0x40c00000    # 6.0f

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
.end method

.method public d(Landroid/graphics/Canvas;Landroid/graphics/Bitmap;)V
    .locals 2
    .param p1    # Landroid/graphics/Canvas;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/graphics/Bitmap;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/graphics/Canvas;->isHardwareAccelerated()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget-object p2, p0, Lue0/n;->a:Landroid/graphics/RenderNode;

    .line 9
    .line 10
    .line 11
    invoke-static {p1, p2}, Lue0/h;->a(Landroid/graphics/Canvas;Landroid/graphics/RenderNode;)V

    .line 12
    return-void

    .line 13
    .line 14
    :cond_0
    iget-object v0, p0, Lue0/n;->e:Lue0/a;

    .line 15
    .line 16
    if-nez v0, :cond_1

    .line 17
    .line 18
    new-instance v0, Lue0/o;

    .line 19
    .line 20
    iget-object v1, p0, Lue0/n;->f:Landroid/content/Context;

    .line 21
    .line 22
    .line 23
    invoke-direct {v0, v1}, Lue0/o;-><init>(Landroid/content/Context;)V

    .line 24
    .line 25
    iput-object v0, p0, Lue0/n;->e:Lue0/a;

    .line 26
    .line 27
    :cond_1
    iget-object v0, p0, Lue0/n;->e:Lue0/a;

    .line 28
    .line 29
    iget v1, p0, Lue0/n;->d:F

    .line 30
    .line 31
    .line 32
    invoke-interface {v0, p2, v1}, Lue0/a;->e(Landroid/graphics/Bitmap;F)Landroid/graphics/Bitmap;

    .line 33
    .line 34
    iget-object v0, p0, Lue0/n;->e:Lue0/a;

    .line 35
    .line 36
    .line 37
    invoke-interface {v0, p1, p2}, Lue0/a;->d(Landroid/graphics/Canvas;Landroid/graphics/Bitmap;)V

    .line 38
    return-void
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

.method public destroy()V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lue0/n;->a:Landroid/graphics/RenderNode;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Lue0/g;->a(Landroid/graphics/RenderNode;)V

    .line 6
    .line 7
    iget-object v0, p0, Lue0/n;->e:Lue0/a;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    .line 12
    invoke-interface {v0}, Lue0/a;->destroy()V

    .line 13
    :cond_0
    return-void
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
.end method

.method public e(Landroid/graphics/Bitmap;F)Landroid/graphics/Bitmap;
    .locals 4
    .param p1    # Landroid/graphics/Bitmap;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    .line 2
    iput p2, p0, Lue0/n;->d:F

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    .line 6
    move-result v0

    .line 7
    .line 8
    iget v1, p0, Lue0/n;->b:I

    .line 9
    .line 10
    if-ne v0, v1, :cond_0

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    .line 14
    move-result v0

    .line 15
    .line 16
    iget v1, p0, Lue0/n;->c:I

    .line 17
    .line 18
    if-eq v0, v1, :cond_1

    .line 19
    .line 20
    .line 21
    :cond_0
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    .line 22
    move-result v0

    .line 23
    .line 24
    iput v0, p0, Lue0/n;->b:I

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    .line 28
    move-result v0

    .line 29
    .line 30
    iput v0, p0, Lue0/n;->c:I

    .line 31
    .line 32
    iget-object v1, p0, Lue0/n;->a:Landroid/graphics/RenderNode;

    .line 33
    .line 34
    iget v2, p0, Lue0/n;->b:I

    .line 35
    const/4 v3, 0x0

    .line 36
    .line 37
    .line 38
    invoke-static {v1, v3, v3, v0, v2}, Lue0/i;->a(Landroid/graphics/RenderNode;IIII)Z

    .line 39
    .line 40
    :cond_1
    iget-object v0, p0, Lue0/n;->a:Landroid/graphics/RenderNode;

    .line 41
    .line 42
    .line 43
    invoke-static {v0}, Lue0/j;->a(Landroid/graphics/RenderNode;)Landroid/graphics/RecordingCanvas;

    .line 44
    move-result-object v0

    .line 45
    const/4 v1, 0x0

    .line 46
    const/4 v2, 0x0

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0, p1, v2, v2, v1}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 50
    .line 51
    iget-object v0, p0, Lue0/n;->a:Landroid/graphics/RenderNode;

    .line 52
    .line 53
    .line 54
    invoke-static {v0}, Lue0/k;->a(Landroid/graphics/RenderNode;)V

    .line 55
    .line 56
    iget-object v0, p0, Lue0/n;->a:Landroid/graphics/RenderNode;

    .line 57
    .line 58
    sget-object v1, Landroid/graphics/Shader$TileMode;->MIRROR:Landroid/graphics/Shader$TileMode;

    .line 59
    .line 60
    .line 61
    invoke-static {p2, p2, v1}, Lcom/facebook/react/uimanager/y;->a(FFLandroid/graphics/Shader$TileMode;)Landroid/graphics/RenderEffect;

    .line 62
    move-result-object p2

    .line 63
    .line 64
    .line 65
    invoke-static {v0, p2}, Lue0/l;->a(Landroid/graphics/RenderNode;Landroid/graphics/RenderEffect;)Z

    .line 66
    return-object p1
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

.method public f(Landroid/content/Context;)V
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lue0/n;->f:Landroid/content/Context;

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
.end method
