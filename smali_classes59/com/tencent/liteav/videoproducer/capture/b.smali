.class public final Lcom/tencent/liteav/videoproducer/capture/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:I

.field public b:Z

.field private final c:Ljava/util/LinkedList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedList<",
            "Lcom/tencent/liteav/videoproducer/capture/FaceRect;",
            ">;"
        }
    .end annotation
.end field

.field private d:Lcom/tencent/liteav/base/util/Size;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    const/4 v0, 0x0

    .line 5
    .line 6
    iput-object v0, p0, Lcom/tencent/liteav/videoproducer/capture/b;->d:Lcom/tencent/liteav/base/util/Size;

    .line 7
    const/4 v0, 0x0

    .line 8
    .line 9
    iput v0, p0, Lcom/tencent/liteav/videoproducer/capture/b;->a:I

    .line 10
    .line 11
    iput-boolean v0, p0, Lcom/tencent/liteav/videoproducer/capture/b;->b:Z

    .line 12
    .line 13
    new-instance v0, Ljava/util/LinkedList;

    .line 14
    .line 15
    .line 16
    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    .line 17
    .line 18
    iput-object v0, p0, Lcom/tencent/liteav/videoproducer/capture/b;->c:Ljava/util/LinkedList;

    .line 19
    return-void
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
.end method

.method private static a(Ljava/util/List;)Landroid/graphics/Rect;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroid/graphics/Rect;",
            ">;)",
            "Landroid/graphics/Rect;"
        }
    .end annotation

    if-eqz p0, :cond_3

    .line 49
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    if-gtz v0, :cond_0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    .line 50
    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Rect;

    .line 51
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_1
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/graphics/Rect;

    .line 52
    invoke-virtual {v1}, Landroid/graphics/Rect;->width()I

    move-result v2

    invoke-virtual {v1}, Landroid/graphics/Rect;->height()I

    move-result v3

    mul-int/2addr v2, v3

    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    move-result v3

    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    move-result v4

    mul-int/2addr v3, v4

    if-le v2, v3, :cond_1

    move-object v0, v1

    goto :goto_0

    :cond_2
    return-object v0

    :cond_3
    :goto_1
    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public final declared-synchronized a()Lcom/tencent/liteav/videoproducer/capture/FaceRect;
    .locals 1

    monitor-enter p0

    .line 53
    :try_start_0
    iget-object v0, p0, Lcom/tencent/liteav/videoproducer/capture/b;->c:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->size()I

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-gtz v0, :cond_0

    .line 54
    monitor-exit p0

    const/4 v0, 0x0

    return-object v0

    .line 55
    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/tencent/liteav/videoproducer/capture/b;->c:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->removeFirst()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/tencent/liteav/videoproducer/capture/FaceRect;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0
.end method

.method public final a(II)V
    .locals 1

    .line 1
    new-instance v0, Lcom/tencent/liteav/base/util/Size;

    invoke-direct {v0, p1, p2}, Lcom/tencent/liteav/base/util/Size;-><init>(II)V

    iput-object v0, p0, Lcom/tencent/liteav/videoproducer/capture/b;->d:Lcom/tencent/liteav/base/util/Size;

    return-void
.end method

.method public final a(Ljava/util/List;F)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroid/graphics/Rect;",
            ">;F)V"
        }
    .end annotation

    .line 2
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_2

    iget-object v0, p0, Lcom/tencent/liteav/videoproducer/capture/b;->d:Lcom/tencent/liteav/base/util/Size;

    if-eqz v0, :cond_2

    iget v1, v0, Lcom/tencent/liteav/base/util/Size;->width:I

    if-lez v1, :cond_2

    iget v0, v0, Lcom/tencent/liteav/base/util/Size;->height:I

    if-gtz v0, :cond_0

    goto :goto_1

    .line 3
    :cond_0
    invoke-static {p1}, Lcom/tencent/liteav/videoproducer/capture/b;->a(Ljava/util/List;)Landroid/graphics/Rect;

    move-result-object p1

    .line 4
    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0, p1}, Landroid/graphics/RectF;-><init>(Landroid/graphics/Rect;)V

    .line 5
    new-instance p1, Landroid/graphics/Matrix;

    invoke-direct {p1}, Landroid/graphics/Matrix;-><init>()V

    .line 6
    iget-boolean v1, p0, Lcom/tencent/liteav/videoproducer/capture/b;->b:Z

    const/high16 v2, 0x3f800000    # 1.0f

    if-eqz v1, :cond_1

    const/high16 v1, -0x40800000    # -1.0f

    goto :goto_0

    :cond_1
    move v1, v2

    :goto_0
    invoke-virtual {p1, v2, v1}, Landroid/graphics/Matrix;->setScale(FF)V

    .line 7
    iget v1, p0, Lcom/tencent/liteav/videoproducer/capture/b;->a:I

    int-to-float v1, v1

    invoke-virtual {p1, v1}, Landroid/graphics/Matrix;->postRotate(F)Z

    .line 8
    iget-object v1, p0, Lcom/tencent/liteav/videoproducer/capture/b;->d:Lcom/tencent/liteav/base/util/Size;

    iget v2, v1, Lcom/tencent/liteav/base/util/Size;->height:I

    int-to-float v2, v2

    const/high16 v3, 0x44fa0000    # 2000.0f

    div-float/2addr v2, v3

    iget v1, v1, Lcom/tencent/liteav/base/util/Size;->width:I

    int-to-float v1, v1

    div-float/2addr v1, v3

    invoke-virtual {p1, v2, v1}, Landroid/graphics/Matrix;->postScale(FF)Z

    .line 9
    invoke-virtual {p1, p2, p2}, Landroid/graphics/Matrix;->postScale(FF)Z

    .line 10
    iget-object p2, p0, Lcom/tencent/liteav/videoproducer/capture/b;->d:Lcom/tencent/liteav/base/util/Size;

    iget v1, p2, Lcom/tencent/liteav/base/util/Size;->height:I

    int-to-float v1, v1

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    iget p2, p2, Lcom/tencent/liteav/base/util/Size;->width:I

    int-to-float p2, p2

    div-float/2addr p2, v2

    invoke-virtual {p1, v1, p2}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 11
    invoke-virtual {p1, v0}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    .line 12
    monitor-enter p0

    .line 13
    :try_start_0
    iget-object p1, p0, Lcom/tencent/liteav/videoproducer/capture/b;->c:Ljava/util/LinkedList;

    invoke-virtual {p1}, Ljava/util/LinkedList;->clear()V

    .line 14
    iget-object p1, p0, Lcom/tencent/liteav/videoproducer/capture/b;->c:Ljava/util/LinkedList;

    new-instance p2, Lcom/tencent/liteav/videoproducer/capture/FaceRect;

    iget v1, v0, Landroid/graphics/RectF;->left:F

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    iget v2, v0, Landroid/graphics/RectF;->top:F

    .line 15
    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    move-result v2

    invoke-virtual {v0}, Landroid/graphics/RectF;->width()F

    move-result v3

    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    move-result v3

    invoke-virtual {v0}, Landroid/graphics/RectF;->height()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    invoke-direct {p2, v1, v2, v3, v0}, Lcom/tencent/liteav/videoproducer/capture/FaceRect;-><init>(IIII)V

    .line 16
    invoke-virtual {p1, p2}, Ljava/util/LinkedList;->addLast(Ljava/lang/Object;)V

    .line 17
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_2
    :goto_1
    return-void
.end method

.method public final a(Ljava/util/List;Landroid/graphics/Rect;Landroid/graphics/Rect;)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroid/graphics/Rect;",
            ">;",
            "Landroid/graphics/Rect;",
            "Landroid/graphics/Rect;",
            ")V"
        }
    .end annotation

    .line 18
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_4

    iget-object v0, p0, Lcom/tencent/liteav/videoproducer/capture/b;->d:Lcom/tencent/liteav/base/util/Size;

    if-eqz v0, :cond_4

    iget v1, v0, Lcom/tencent/liteav/base/util/Size;->width:I

    if-lez v1, :cond_4

    iget v0, v0, Lcom/tencent/liteav/base/util/Size;->height:I

    if-lez v0, :cond_4

    if-eqz p2, :cond_4

    .line 19
    invoke-virtual {p2}, Landroid/graphics/Rect;->width()I

    move-result v0

    if-lez v0, :cond_4

    invoke-virtual {p2}, Landroid/graphics/Rect;->height()I

    move-result v0

    if-lez v0, :cond_4

    if-eqz p3, :cond_4

    .line 20
    invoke-virtual {p3}, Landroid/graphics/Rect;->width()I

    move-result v0

    if-lez v0, :cond_4

    .line 21
    invoke-virtual {p3}, Landroid/graphics/Rect;->height()I

    move-result v0

    if-gtz v0, :cond_0

    goto/16 :goto_3

    .line 22
    :cond_0
    invoke-static {p1}, Lcom/tencent/liteav/videoproducer/capture/b;->a(Ljava/util/List;)Landroid/graphics/Rect;

    move-result-object p1

    .line 23
    iget-object v0, p0, Lcom/tencent/liteav/videoproducer/capture/b;->d:Lcom/tencent/liteav/base/util/Size;

    iget v1, v0, Lcom/tencent/liteav/base/util/Size;->width:I

    .line 24
    iget v0, v0, Lcom/tencent/liteav/base/util/Size;->height:I

    if-le v1, v0, :cond_1

    int-to-float v1, v1

    int-to-float v0, v0

    div-float/2addr v1, v0

    goto :goto_0

    :cond_1
    int-to-float v0, v0

    int-to-float v1, v1

    div-float v1, v0, v1

    .line 25
    :goto_0
    invoke-virtual {p2}, Landroid/graphics/Rect;->width()I

    move-result v0

    .line 26
    invoke-virtual {p2}, Landroid/graphics/Rect;->height()I

    move-result v2

    int-to-float v3, v0

    int-to-float v4, v2

    div-float v5, v3, v4

    cmpl-float v5, v1, v5

    if-lez v5, :cond_2

    div-float v1, v3, v1

    float-to-int v1, v1

    move v4, v1

    move v1, v0

    goto :goto_1

    :cond_2
    mul-float/2addr v4, v1

    float-to-int v1, v4

    move v4, v2

    :goto_1
    sub-int v0, v1, v0

    .line 27
    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v0

    sub-int v2, v4, v2

    .line 28
    invoke-static {v2}, Ljava/lang/Math;->abs(I)I

    move-result v2

    .line 29
    invoke-virtual {p3}, Landroid/graphics/Rect;->width()I

    move-result v5

    int-to-float v5, v5

    div-float/2addr v3, v5

    .line 30
    new-instance v5, Landroid/graphics/RectF;

    iget v6, p1, Landroid/graphics/Rect;->left:I

    iget v7, p3, Landroid/graphics/Rect;->left:I

    sub-int/2addr v6, v7

    int-to-float v6, v6

    mul-float/2addr v6, v3

    iget v7, p1, Landroid/graphics/Rect;->top:I

    iget v8, p3, Landroid/graphics/Rect;->top:I

    sub-int/2addr v7, v8

    int-to-float v7, v7

    mul-float/2addr v7, v3

    iget v8, p2, Landroid/graphics/Rect;->right:I

    int-to-float v8, v8

    iget v9, p3, Landroid/graphics/Rect;->right:I

    iget v10, p1, Landroid/graphics/Rect;->right:I

    sub-int/2addr v9, v10

    int-to-float v9, v9

    mul-float/2addr v9, v3

    sub-float/2addr v8, v9

    iget p2, p2, Landroid/graphics/Rect;->bottom:I

    int-to-float p2, p2

    iget p3, p3, Landroid/graphics/Rect;->bottom:I

    iget p1, p1, Landroid/graphics/Rect;->bottom:I

    sub-int/2addr p3, p1

    int-to-float p1, p3

    mul-float/2addr p1, v3

    sub-float/2addr p2, p1

    invoke-direct {v5, v6, v7, v8, p2}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 31
    new-instance p1, Landroid/graphics/Matrix;

    invoke-direct {p1}, Landroid/graphics/Matrix;-><init>()V

    neg-int p2, v0

    int-to-float p2, p2

    const/high16 p3, 0x40000000    # 2.0f

    div-float/2addr p2, p3

    neg-int v0, v2

    int-to-float v0, v0

    div-float/2addr v0, p3

    .line 32
    invoke-virtual {p1, p2, v0}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    neg-int p2, v1

    int-to-float p2, p2

    div-float/2addr p2, p3

    neg-int v0, v4

    int-to-float v0, v0

    div-float/2addr v0, p3

    .line 33
    invoke-virtual {p1, p2, v0}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 34
    iget-object p2, p0, Lcom/tencent/liteav/videoproducer/capture/b;->d:Lcom/tencent/liteav/base/util/Size;

    iget v0, p2, Lcom/tencent/liteav/base/util/Size;->height:I

    int-to-float v0, v0

    int-to-float v2, v4

    div-float/2addr v0, v2

    .line 35
    iget p2, p2, Lcom/tencent/liteav/base/util/Size;->width:I

    int-to-float p2, p2

    int-to-float v1, v1

    div-float/2addr p2, v1

    .line 36
    invoke-virtual {p1, v0, p2}, Landroid/graphics/Matrix;->postScale(FF)Z

    .line 37
    iget-boolean p2, p0, Lcom/tencent/liteav/videoproducer/capture/b;->b:Z

    const/high16 v0, 0x3f800000    # 1.0f

    if-eqz p2, :cond_3

    const/high16 p2, -0x40800000    # -1.0f

    goto :goto_2

    :cond_3
    move p2, v0

    :goto_2
    invoke-virtual {p1, v0, p2}, Landroid/graphics/Matrix;->postScale(FF)Z

    .line 38
    iget p2, p0, Lcom/tencent/liteav/videoproducer/capture/b;->a:I

    int-to-float p2, p2

    invoke-virtual {p1, p2}, Landroid/graphics/Matrix;->postRotate(F)Z

    .line 39
    iget-object p2, p0, Lcom/tencent/liteav/videoproducer/capture/b;->d:Lcom/tencent/liteav/base/util/Size;

    iget v0, p2, Lcom/tencent/liteav/base/util/Size;->height:I

    int-to-float v0, v0

    div-float/2addr v0, p3

    iget p2, p2, Lcom/tencent/liteav/base/util/Size;->width:I

    int-to-float p2, p2

    div-float/2addr p2, p3

    invoke-virtual {p1, v0, p2}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 40
    iget-object p2, p0, Lcom/tencent/liteav/videoproducer/capture/b;->d:Lcom/tencent/liteav/base/util/Size;

    iget v0, p2, Lcom/tencent/liteav/base/util/Size;->height:I

    int-to-float v0, v0

    div-float/2addr v0, p3

    iget p2, p2, Lcom/tencent/liteav/base/util/Size;->width:I

    int-to-float p2, p2

    div-float/2addr p2, p3

    invoke-virtual {p1, v3, v3, v0, p2}, Landroid/graphics/Matrix;->postScale(FFFF)Z

    .line 41
    invoke-virtual {p1, v5}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    .line 42
    monitor-enter p0

    .line 43
    :try_start_0
    iget-object p1, p0, Lcom/tencent/liteav/videoproducer/capture/b;->c:Ljava/util/LinkedList;

    invoke-virtual {p1}, Ljava/util/LinkedList;->clear()V

    .line 44
    iget-object p1, p0, Lcom/tencent/liteav/videoproducer/capture/b;->c:Ljava/util/LinkedList;

    new-instance p2, Lcom/tencent/liteav/videoproducer/capture/FaceRect;

    iget p3, v5, Landroid/graphics/RectF;->left:F

    .line 45
    invoke-static {p3}, Ljava/lang/Math;->round(F)I

    move-result p3

    iget v0, v5, Landroid/graphics/RectF;->top:F

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    .line 46
    invoke-virtual {v5}, Landroid/graphics/RectF;->width()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    invoke-virtual {v5}, Landroid/graphics/RectF;->height()F

    move-result v2

    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    move-result v2

    invoke-direct {p2, p3, v0, v1, v2}, Lcom/tencent/liteav/videoproducer/capture/FaceRect;-><init>(IIII)V

    .line 47
    invoke-virtual {p1, p2}, Ljava/util/LinkedList;->addLast(Ljava/lang/Object;)V

    .line 48
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_4
    :goto_3
    return-void
.end method

.method public final declared-synchronized b()V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    .line 3
    :try_start_0
    iget-object v0, p0, Lcom/tencent/liteav/videoproducer/capture/b;->c:Ljava/util/LinkedList;

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/util/LinkedList;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    monitor-exit p0

    .line 8
    return-void

    .line 9
    :catchall_0
    move-exception v0

    .line 10
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 11
    throw v0
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method
