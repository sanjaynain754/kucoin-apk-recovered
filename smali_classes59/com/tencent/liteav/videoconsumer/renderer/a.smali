.class public final Lcom/tencent/liteav/videoconsumer/renderer/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field final a:Ljava/lang/String;

.field final b:Lcom/tencent/liteav/base/util/Size;

.field final c:Lcom/tencent/liteav/videobase/frame/e;

.field d:Lcom/tencent/liteav/videobase/b/b;

.field e:Ljava/nio/FloatBuffer;

.field f:Ljava/nio/FloatBuffer;

.field g:Lcom/tencent/liteav/videobase/frame/i;

.field h:Landroid/graphics/Matrix;

.field i:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroid/graphics/PointF;",
            ">;"
        }
    .end annotation
.end field

.field j:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroid/graphics/PointF;",
            ">;"
        }
    .end annotation
.end field

.field k:Z


# direct methods
.method public constructor <init>(Lcom/tencent/liteav/videobase/frame/e;II)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    new-instance v0, Ljava/lang/StringBuilder;

    .line 6
    .line 7
    const-string v1, "PostProcessor_"

    .line 8
    .line 9
    .line 10
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 14
    move-result v1

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    move-result-object v0

    .line 22
    .line 23
    iput-object v0, p0, Lcom/tencent/liteav/videoconsumer/renderer/a;->a:Ljava/lang/String;

    .line 24
    .line 25
    new-instance v0, Lcom/tencent/liteav/base/util/Size;

    .line 26
    .line 27
    .line 28
    invoke-direct {v0}, Lcom/tencent/liteav/base/util/Size;-><init>()V

    .line 29
    .line 30
    iput-object v0, p0, Lcom/tencent/liteav/videoconsumer/renderer/a;->b:Lcom/tencent/liteav/base/util/Size;

    .line 31
    const/4 v1, 0x0

    .line 32
    .line 33
    iput-boolean v1, p0, Lcom/tencent/liteav/videoconsumer/renderer/a;->k:Z

    .line 34
    .line 35
    iput-object p1, p0, Lcom/tencent/liteav/videoconsumer/renderer/a;->c:Lcom/tencent/liteav/videobase/frame/e;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0, p2, p3}, Lcom/tencent/liteav/base/util/Size;->set(II)V

    .line 39
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

.method private static a(Landroid/graphics/PointF;Landroid/graphics/Matrix;)Landroid/graphics/PointF;
    .locals 5

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x2

    if-nez p1, :cond_0

    goto :goto_0

    .line 19
    :cond_0
    new-instance v3, Landroid/graphics/Matrix;

    invoke-direct {v3}, Landroid/graphics/Matrix;-><init>()V

    .line 20
    invoke-virtual {p1, v3}, Landroid/graphics/Matrix;->invert(Landroid/graphics/Matrix;)Z

    move-result p1

    if-nez p1, :cond_1

    :goto_0
    return-object p0

    .line 21
    :cond_1
    new-array p1, v2, [F

    .line 22
    iget v4, p0, Landroid/graphics/PointF;->x:F

    iget p0, p0, Landroid/graphics/PointF;->y:F

    new-array v2, v2, [F

    aput v4, v2, v1

    aput p0, v2, v0

    invoke-virtual {v3, p1, v2}, Landroid/graphics/Matrix;->mapPoints([F[F)V

    .line 23
    new-instance p0, Landroid/graphics/PointF;

    aget v1, p1, v1

    aget p1, p1, v0

    invoke-direct {p0, v1, p1}, Landroid/graphics/PointF;-><init>(FF)V

    return-object p0
.end method

.method private a(Ljava/util/List;)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroid/graphics/PointF;",
            ">;)",
            "Ljava/util/List<",
            "Landroid/graphics/PointF;",
            ">;"
        }
    .end annotation

    .line 11
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 12
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/graphics/PointF;

    .line 13
    iget v2, v1, Landroid/graphics/PointF;->x:F

    iget-object v3, p0, Lcom/tencent/liteav/videoconsumer/renderer/a;->b:Lcom/tencent/liteav/base/util/Size;

    iget v4, v3, Lcom/tencent/liteav/base/util/Size;->width:I

    int-to-float v4, v4

    mul-float/2addr v2, v4

    .line 14
    iget v1, v1, Landroid/graphics/PointF;->y:F

    iget v3, v3, Lcom/tencent/liteav/base/util/Size;->height:I

    int-to-float v3, v3

    mul-float/2addr v1, v3

    .line 15
    new-instance v3, Landroid/graphics/PointF;

    invoke-direct {v3, v2, v1}, Landroid/graphics/PointF;-><init>(FF)V

    iget-object v1, p0, Lcom/tencent/liteav/videoconsumer/renderer/a;->h:Landroid/graphics/Matrix;

    invoke-static {v3, v1}, Lcom/tencent/liteav/videoconsumer/renderer/a;->a(Landroid/graphics/PointF;Landroid/graphics/Matrix;)Landroid/graphics/PointF;

    move-result-object v1

    .line 16
    new-instance v2, Landroid/graphics/PointF;

    iget v3, v1, Landroid/graphics/PointF;->x:F

    iget-object v4, p0, Lcom/tencent/liteav/videoconsumer/renderer/a;->b:Lcom/tencent/liteav/base/util/Size;

    iget v5, v4, Lcom/tencent/liteav/base/util/Size;->width:I

    int-to-float v5, v5

    div-float/2addr v3, v5

    iget v1, v1, Landroid/graphics/PointF;->y:F

    iget v4, v4, Lcom/tencent/liteav/base/util/Size;->height:I

    int-to-float v4, v4

    div-float/2addr v1, v4

    invoke-direct {v2, v3, v1}, Landroid/graphics/PointF;-><init>(FF)V

    const/high16 v1, 0x3f800000    # 1.0f

    .line 17
    iget v3, v2, Landroid/graphics/PointF;->y:F

    sub-float/2addr v1, v3

    iput v1, v2, Landroid/graphics/PointF;->y:F

    .line 18
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v0
.end method


# virtual methods
.method public final a(Ljava/util/List;Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroid/graphics/PointF;",
            ">;",
            "Ljava/util/List<",
            "Landroid/graphics/PointF;",
            ">;)V"
        }
    .end annotation

    if-eqz p1, :cond_3

    .line 1
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x4

    if-ne v0, v1, :cond_3

    if-eqz p2, :cond_3

    .line 2
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    if-eq v0, v1, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/tencent/liteav/videoconsumer/renderer/a;->b:Lcom/tencent/liteav/base/util/Size;

    invoke-virtual {v0}, Lcom/tencent/liteav/base/util/Size;->isValid()Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    .line 4
    :cond_1
    iget-object v0, p0, Lcom/tencent/liteav/videoconsumer/renderer/a;->d:Lcom/tencent/liteav/videobase/b/b;

    if-eqz v0, :cond_3

    .line 5
    invoke-direct {p0, p1}, Lcom/tencent/liteav/videoconsumer/renderer/a;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    .line 6
    invoke-direct {p0, p2}, Lcom/tencent/liteav/videoconsumer/renderer/a;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object p2

    .line 7
    iget-object v0, p0, Lcom/tencent/liteav/videoconsumer/renderer/a;->d:Lcom/tencent/liteav/videobase/b/b;

    .line 8
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    if-ne v2, v1, :cond_3

    .line 9
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v2

    if-eq v2, v1, :cond_2

    goto :goto_0

    .line 10
    :cond_2
    invoke-static {v0, p2, p1}, Lcom/tencent/liteav/videobase/b/c;->a(Lcom/tencent/liteav/videobase/b/b;Ljava/util/List;Ljava/util/List;)Ljava/lang/Runnable;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/tencent/liteav/videobase/a/a;->a(Ljava/lang/Runnable;)V

    :cond_3
    :goto_0
    return-void
.end method
