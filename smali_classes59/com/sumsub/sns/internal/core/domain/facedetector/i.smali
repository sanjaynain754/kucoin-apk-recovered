.class public final Lcom/sumsub/sns/internal/core/domain/facedetector/i;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"

# interfaces
.implements Lcom/sumsub/sns/internal/core/domain/facedetector/g;


# instance fields
.field public a:Landroid/media/FaceDetector;

.field public b:I

.field public c:I

.field public final d:Lcom/sumsub/sns/internal/core/common/a;

.field public volatile e:Z

.field public final f:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    new-instance v0, Lcom/sumsub/sns/internal/core/common/a;

    .line 6
    .line 7
    sget-object v1, Landroid/graphics/Bitmap$Config;->RGB_565:Landroid/graphics/Bitmap$Config;

    .line 8
    .line 9
    .line 10
    invoke-direct {v0, v1}, Lcom/sumsub/sns/internal/core/common/a;-><init>(Landroid/graphics/Bitmap$Config;)V

    .line 11
    .line 12
    iput-object v0, p0, Lcom/sumsub/sns/internal/core/domain/facedetector/i;->d:Lcom/sumsub/sns/internal/core/common/a;

    .line 13
    .line 14
    const-string v0, "Native"

    .line 15
    .line 16
    iput-object v0, p0, Lcom/sumsub/sns/internal/core/domain/facedetector/i;->f:Ljava/lang/String;

    .line 17
    return-void
.end method

.method public static a(Landroid/graphics/RectF;Landroid/media/FaceDetector$Face;Landroid/graphics/Bitmap;Landroid/util/Size;)Lcom/sumsub/sns/internal/core/domain/facedetector/n;
    .locals 9

    .line 46
    invoke-virtual {p1}, Landroid/media/FaceDetector$Face;->confidence()F

    move-result v0

    const v1, 0x3e99999a    # 0.3f

    cmpg-float v0, v0, v1

    const/4 v1, 0x0

    const-string v2, "NativeFaceDetector"

    if-gez v0, :cond_0

    .line 47
    invoke-virtual {p1}, Landroid/media/FaceDetector$Face;->confidence()F

    move-result p0

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "@processFace(), face confidence is too low ("

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string p0, ")"

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    .line 48
    sget-object p1, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 49
    iget-object p1, p1, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 50
    invoke-virtual {p1, v2, p0, v1}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 51
    new-instance p0, Lcom/sumsub/sns/internal/core/domain/facedetector/k;

    invoke-direct {p0, p2}, Lcom/sumsub/sns/internal/core/domain/facedetector/k;-><init>(Landroid/graphics/Bitmap;)V

    return-object p0

    .line 52
    :cond_0
    new-instance v0, Landroid/graphics/PointF;

    invoke-direct {v0}, Landroid/graphics/PointF;-><init>()V

    .line 53
    invoke-virtual {p1, v0}, Landroid/media/FaceDetector$Face;->getMidPoint(Landroid/graphics/PointF;)V

    .line 54
    new-instance v3, Landroid/graphics/RectF;

    .line 55
    iget v4, v0, Landroid/graphics/PointF;->x:F

    invoke-virtual {p1}, Landroid/media/FaceDetector$Face;->eyesDistance()F

    move-result v5

    sub-float/2addr v4, v5

    .line 56
    iget v5, v0, Landroid/graphics/PointF;->y:F

    float-to-int v5, v5

    int-to-float v5, v5

    invoke-virtual {p1}, Landroid/media/FaceDetector$Face;->eyesDistance()F

    move-result v6

    const/high16 v7, 0x3fc00000    # 1.5f

    mul-float/2addr v6, v7

    sub-float/2addr v5, v6

    .line 57
    iget v6, v0, Landroid/graphics/PointF;->x:F

    float-to-int v6, v6

    int-to-float v6, v6

    invoke-virtual {p1}, Landroid/media/FaceDetector$Face;->eyesDistance()F

    move-result v8

    add-float/2addr v8, v6

    .line 58
    iget v0, v0, Landroid/graphics/PointF;->y:F

    float-to-int v0, v0

    int-to-float v0, v0

    invoke-virtual {p1}, Landroid/media/FaceDetector$Face;->eyesDistance()F

    move-result p1

    mul-float/2addr p1, v7

    add-float/2addr p1, v0

    .line 59
    invoke-direct {v3, v4, v5, v8, p1}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 60
    new-instance p1, Landroid/graphics/RectF;

    .line 61
    invoke-virtual {p3}, Landroid/util/Size;->getWidth()I

    move-result v0

    int-to-float v0, v0

    iget v4, v3, Landroid/graphics/RectF;->right:F

    sub-float/2addr v0, v4

    invoke-virtual {p3}, Landroid/util/Size;->getWidth()I

    move-result v4

    int-to-float v4, v4

    div-float/2addr v0, v4

    .line 62
    iget v4, v3, Landroid/graphics/RectF;->top:F

    invoke-virtual {p3}, Landroid/util/Size;->getHeight()I

    move-result v5

    int-to-float v5, v5

    div-float/2addr v4, v5

    .line 63
    invoke-virtual {p3}, Landroid/util/Size;->getWidth()I

    move-result v5

    int-to-float v5, v5

    iget v6, v3, Landroid/graphics/RectF;->left:F

    sub-float/2addr v5, v6

    invoke-virtual {p3}, Landroid/util/Size;->getWidth()I

    move-result v6

    int-to-float v6, v6

    div-float/2addr v5, v6

    .line 64
    iget v3, v3, Landroid/graphics/RectF;->bottom:F

    invoke-virtual {p3}, Landroid/util/Size;->getHeight()I

    move-result v6

    int-to-float v6, v6

    div-float/2addr v3, v6

    .line 65
    invoke-direct {p1, v0, v4, v5, v3}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 66
    invoke-virtual {p0, p1}, Landroid/graphics/RectF;->contains(Landroid/graphics/RectF;)Z

    move-result p0

    if-eqz p0, :cond_1

    .line 67
    sget-object p0, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 68
    iget-object p0, p0, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 69
    const-string v0, "@processFace(), face is in capture box"

    invoke-virtual {p0, v2, v0, v1}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 70
    new-instance p0, Lcom/sumsub/sns/internal/core/domain/facedetector/j;

    invoke-direct {p0, p2, p3, p1}, Lcom/sumsub/sns/internal/core/domain/facedetector/j;-><init>(Landroid/graphics/Bitmap;Landroid/util/Size;Landroid/graphics/RectF;)V

    return-object p0

    .line 71
    :cond_1
    sget-object p0, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 72
    iget-object p0, p0, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 73
    const-string p3, "@processFace(), face is NOT in capture box"

    invoke-virtual {p0, v2, p3, v1}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 74
    new-instance p0, Lcom/sumsub/sns/internal/core/domain/facedetector/l;

    invoke-direct {p0, p2, p1}, Lcom/sumsub/sns/internal/core/domain/facedetector/l;-><init>(Landroid/graphics/Bitmap;Landroid/graphics/RectF;)V

    return-object p0
.end method


# virtual methods
.method public final a(Landroid/graphics/Bitmap;Landroid/graphics/RectF;)Lcom/sumsub/sns/internal/core/domain/facedetector/n;
    .locals 8

    .line 1
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "@processImage(), got "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string/jumbo v0, "x"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " frame"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 2
    sget-object v1, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 3
    iget-object v2, v1, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 4
    const-string v3, "NativeFaceDetector"

    const/4 v4, 0x0

    invoke-virtual {v2, v3, v0, v4}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 5
    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/core/domain/facedetector/i;->a(Landroid/graphics/Bitmap;)Lkotlin/Pair;

    move-result-object v0

    .line 6
    iget-object v2, v1, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 7
    const-string v5, "@processImage(), detector prepared, trying to find faces"

    invoke-virtual {v2, v3, v5, v4}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 v2, 0x1

    .line 8
    new-array v5, v2, [Landroid/media/FaceDetector$Face;

    .line 9
    invoke-virtual {v0}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroid/media/FaceDetector;

    invoke-virtual {v0}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Bitmap;

    invoke-virtual {v6, v0, v5}, Landroid/media/FaceDetector;->findFaces(Landroid/graphics/Bitmap;[Landroid/media/FaceDetector$Face;)I

    .line 10
    invoke-static {v5}, Lkotlin/collections/ArraysKt;->filterNotNull([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    .line 11
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "@processImage(), "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v7, " found"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 12
    iget-object v1, v1, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 13
    invoke-virtual {v1, v3, v6, v4}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    if-eqz v0, :cond_2

    if-eq v0, v2, :cond_0

    .line 14
    new-instance p2, Lcom/sumsub/sns/internal/core/domain/facedetector/m;

    invoke-direct {p2, p1}, Lcom/sumsub/sns/internal/core/domain/facedetector/m;-><init>(Landroid/graphics/Bitmap;)V

    return-object p2

    :cond_0
    const/4 v0, 0x0

    .line 15
    aget-object v0, v5, v0

    if-eqz v0, :cond_1

    .line 16
    new-instance v1, Landroid/util/Size;

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v2

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v3

    invoke-direct {v1, v2, v3}, Landroid/util/Size;-><init>(II)V

    .line 17
    invoke-static {p2, v0, p1, v1}, Lcom/sumsub/sns/internal/core/domain/facedetector/i;->a(Landroid/graphics/RectF;Landroid/media/FaceDetector$Face;Landroid/graphics/Bitmap;Landroid/util/Size;)Lcom/sumsub/sns/internal/core/domain/facedetector/n;

    move-result-object p1

    return-object p1

    .line 18
    :cond_1
    new-instance p1, Ljava/util/NoSuchElementException;

    const-string p2, "Array contains no element matching the predicate."

    invoke-direct {p1, p2}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 19
    :cond_2
    new-instance p2, Lcom/sumsub/sns/internal/core/domain/facedetector/k;

    invoke-direct {p2, p1}, Lcom/sumsub/sns/internal/core/domain/facedetector/k;-><init>(Landroid/graphics/Bitmap;)V

    return-object p2
.end method

.method public final a(Landroid/graphics/Bitmap;)Lkotlin/Pair;
    .locals 8

    .line 20
    sget-object v0, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 21
    iget-object v1, v0, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 22
    const-string v2, "NativeFaceDetector"

    const-string v3, "@prepareDetector()"

    const/4 v4, 0x0

    invoke-virtual {v1, v2, v3, v4}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 23
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v1

    .line 24
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v3

    .line 25
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "@prepareDetector(), got bitmap of size "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string/jumbo v6, "x"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 26
    iget-object v6, v0, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 27
    invoke-virtual {v6, v2, v5, v4}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 28
    iget-object v5, p0, Lcom/sumsub/sns/internal/core/domain/facedetector/i;->a:Landroid/media/FaceDetector;

    if-eqz v5, :cond_1

    .line 29
    iget v6, p0, Lcom/sumsub/sns/internal/core/domain/facedetector/i;->b:I

    if-ne v6, v1, :cond_1

    iget v6, p0, Lcom/sumsub/sns/internal/core/domain/facedetector/i;->c:I

    if-eq v6, v3, :cond_0

    goto :goto_0

    .line 30
    :cond_0
    iget-object v6, v0, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 31
    const-string v7, "@prepareDetector(), reuse old FaceDetector"

    invoke-virtual {v6, v2, v7, v4}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1

    .line 32
    :cond_1
    :goto_0
    iget-object v5, v0, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 33
    const-string v6, "@prepareDetector(), create FaceDetector"

    invoke-virtual {v5, v2, v6, v4}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 34
    iput v1, p0, Lcom/sumsub/sns/internal/core/domain/facedetector/i;->b:I

    .line 35
    iput v3, p0, Lcom/sumsub/sns/internal/core/domain/facedetector/i;->c:I

    .line 36
    new-instance v5, Landroid/media/FaceDetector;

    const/4 v6, 0x1

    invoke-direct {v5, v1, v3, v6}, Landroid/media/FaceDetector;-><init>(III)V

    .line 37
    :goto_1
    iput-object v5, p0, Lcom/sumsub/sns/internal/core/domain/facedetector/i;->a:Landroid/media/FaceDetector;

    .line 38
    iget-object v6, v0, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 39
    const-string v7, "@prepareDetector(), making RGB565 copy of Bitmap"

    invoke-virtual {v6, v2, v7, v4}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 40
    iget-object v6, p0, Lcom/sumsub/sns/internal/core/domain/facedetector/i;->d:Lcom/sumsub/sns/internal/core/common/a;

    invoke-virtual {v6, v1, v3}, Lcom/sumsub/sns/internal/core/common/a;->a(II)Landroid/graphics/Bitmap;

    move-result-object v1

    .line 41
    new-instance v3, Landroid/graphics/Canvas;

    invoke-direct {v3, v1}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    const/4 v6, 0x0

    .line 42
    invoke-virtual {v3, p1, v6, v6, v4}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 43
    iget-object p1, v0, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 44
    const-string v0, "@prepareDetector(), RGB565 copy made"

    invoke-virtual {p1, v2, v0, v4}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 45
    new-instance p1, Lkotlin/Pair;

    invoke-direct {p1, v1, v5}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p1
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/core/domain/facedetector/i;->f:Ljava/lang/String;

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

.method public final isStarted()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/sumsub/sns/internal/core/domain/facedetector/i;->e:Z

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

.method public final start()V
    .locals 4

    .line 1
    .line 2
    sget-object v0, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 3
    .line 4
    iget-object v0, v0, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 5
    .line 6
    const-string v1, "@start()"

    .line 7
    const/4 v2, 0x0

    .line 8
    .line 9
    const-string v3, "NativeFaceDetector"

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v3, v1, v2}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 13
    const/4 v0, 0x1

    .line 14
    .line 15
    iput-boolean v0, p0, Lcom/sumsub/sns/internal/core/domain/facedetector/i;->e:Z

    .line 16
    return-void
    .line 17
.end method

.method public final stop()V
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    iput-boolean v0, p0, Lcom/sumsub/sns/internal/core/domain/facedetector/i;->e:Z

    .line 4
    .line 5
    sget-object v1, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 6
    .line 7
    iget-object v1, v1, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 8
    .line 9
    const-string v2, "NativeFaceDetector"

    .line 10
    .line 11
    const-string v3, "@stop()"

    .line 12
    const/4 v4, 0x0

    .line 13
    .line 14
    .line 15
    invoke-virtual {v1, v2, v3, v4}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 16
    .line 17
    iput-object v4, p0, Lcom/sumsub/sns/internal/core/domain/facedetector/i;->a:Landroid/media/FaceDetector;

    .line 18
    .line 19
    iput v0, p0, Lcom/sumsub/sns/internal/core/domain/facedetector/i;->b:I

    .line 20
    .line 21
    iput v0, p0, Lcom/sumsub/sns/internal/core/domain/facedetector/i;->c:I

    .line 22
    .line 23
    iget-object v0, p0, Lcom/sumsub/sns/internal/core/domain/facedetector/i;->d:Lcom/sumsub/sns/internal/core/common/a;

    .line 24
    monitor-enter v0

    .line 25
    .line 26
    :try_start_0
    iget-object v1, v0, Lcom/sumsub/sns/internal/core/common/a;->b:Landroid/graphics/Bitmap;

    .line 27
    .line 28
    if-eqz v1, :cond_0

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->recycle()V

    .line 32
    goto :goto_0

    .line 33
    :catchall_0
    move-exception v1

    .line 34
    goto :goto_1

    .line 35
    .line 36
    :cond_0
    :goto_0
    iput-object v4, v0, Lcom/sumsub/sns/internal/core/common/a;->b:Landroid/graphics/Bitmap;

    .line 37
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 38
    return-void

    .line 39
    :goto_1
    monitor-exit v0

    .line 40
    throw v1
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
