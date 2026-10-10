.class public La3d20260409/d;
.super Landroid/graphics/YuvImage;
.source "SourceFile"


# instance fields
.field public a:I

.field public final b:J

.field public final c:I

.field public d:Landroid/graphics/Rect;

.field public final e:Z

.field public final f:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Ljava/io/ByteArrayOutputStream;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>([BIIIIZ)V
    .locals 6

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    .line 1
    invoke-direct/range {v0 .. v5}, Landroid/graphics/YuvImage;-><init>([BIII[I)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p1

    iput-wide p1, v0, La3d20260409/d;->b:J

    new-instance p1, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object p1, v0, La3d20260409/d;->f:Ljava/util/Map;

    iput p5, v0, La3d20260409/d;->c:I

    iput-boolean p6, v0, La3d20260409/d;->e:Z

    invoke-virtual {p0}, Landroid/graphics/YuvImage;->getWidth()I

    move-result p1

    invoke-virtual {p0}, Landroid/graphics/YuvImage;->getHeight()I

    move-result p2

    sub-int/2addr p1, p2

    div-int/lit8 p1, p1, 0x2

    invoke-virtual {p0}, Landroid/graphics/YuvImage;->getHeight()I

    move-result p2

    add-int/2addr p2, p1

    new-instance p3, Landroid/graphics/Rect;

    invoke-virtual {p0}, Landroid/graphics/YuvImage;->getHeight()I

    move-result p4

    const/4 p5, 0x0

    invoke-direct {p3, p1, p5, p2, p4}, Landroid/graphics/Rect;-><init>(IIII)V

    invoke-virtual {p0, p3}, La3d20260409/d;->g(Landroid/graphics/Rect;)V

    return-void
.end method

.method public constructor <init>([BIIIZ)V
    .locals 7

    const/16 v2, 0x11

    move-object v0, p0

    move-object v1, p1

    move v3, p2

    move v4, p3

    move v5, p4

    move v6, p5

    .line 2
    invoke-direct/range {v0 .. v6}, La3d20260409/d;-><init>([BIIIIZ)V

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, La3d20260409/d;->a:I

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

.method public b(I)Landroid/graphics/Bitmap;
    .locals 9

    .line 1
    .line 2
    mul-int v0, p1, p1

    .line 3
    .line 4
    mul-int/lit8 v0, v0, 0x4

    .line 5
    .line 6
    new-array v5, v0, [B

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/graphics/YuvImage;->getYuvData()[B

    .line 10
    move-result-object v1

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Landroid/graphics/YuvImage;->getYuvFormat()I

    .line 14
    move-result v2

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Landroid/graphics/YuvImage;->getWidth()I

    .line 18
    move-result v3

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Landroid/graphics/YuvImage;->getHeight()I

    .line 22
    move-result v4

    .line 23
    .line 24
    iget v8, p0, La3d20260409/d;->c:I

    .line 25
    const/4 v7, 0x1

    .line 26
    move v6, p1

    .line 27
    .line 28
    .line 29
    invoke-static/range {v1 .. v8}, La3d20260409/v;->k([BIII[BIZI)I

    .line 30
    move-result p1

    .line 31
    const/4 v0, -0x1

    .line 32
    .line 33
    if-eq p1, v0, :cond_0

    .line 34
    .line 35
    sget-object p1, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 36
    .line 37
    .line 38
    invoke-static {v6, v6, p1}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 39
    move-result-object p1

    .line 40
    .line 41
    .line 42
    invoke-static {v5}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 43
    move-result-object v0

    .line 44
    .line 45
    .line 46
    invoke-virtual {p1, v0}, Landroid/graphics/Bitmap;->copyPixelsFromBuffer(Ljava/nio/Buffer;)V

    .line 47
    return-object p1

    .line 48
    :cond_0
    const/4 p1, 0x0

    .line 49
    return-object p1
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

.method public final c(I)[B
    .locals 10

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/graphics/YuvImage;->getYuvData()[B

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-static {v0}, La3d20260409/j3d20260409;->oo0ooO([B)Z

    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x0

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    return-object v1

    .line 13
    .line 14
    :cond_0
    mul-int v0, p1, p1

    .line 15
    .line 16
    mul-int/lit8 v0, v0, 0x4

    .line 17
    .line 18
    new-array v6, v0, [B

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Landroid/graphics/YuvImage;->getYuvData()[B

    .line 22
    move-result-object v2

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0}, Landroid/graphics/YuvImage;->getYuvFormat()I

    .line 26
    move-result v3

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0}, Landroid/graphics/YuvImage;->getWidth()I

    .line 30
    move-result v4

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0}, Landroid/graphics/YuvImage;->getHeight()I

    .line 34
    move-result v5

    .line 35
    .line 36
    iget v9, p0, La3d20260409/d;->c:I

    .line 37
    const/4 v8, 0x1

    .line 38
    move v7, p1

    .line 39
    .line 40
    .line 41
    invoke-static/range {v2 .. v9}, La3d20260409/v;->k([BIII[BIZI)I

    .line 42
    move-result p1

    .line 43
    const/4 v0, -0x1

    .line 44
    .line 45
    if-ne p1, v0, :cond_1

    .line 46
    return-object v1

    .line 47
    :cond_1
    return-object v6
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

.method public d()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, La3d20260409/d;->c:I

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

.method public e(I)Landroid/graphics/Bitmap;
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, La3d20260409/d;->k(I)Ljava/io/ByteArrayOutputStream;

    .line 4
    move-result-object p1

    .line 5
    .line 6
    new-instance v0, Landroid/graphics/BitmapFactory$Options;

    .line 7
    .line 8
    .line 9
    invoke-direct {v0}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 10
    .line 11
    sget-object v1, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 12
    .line 13
    iput-object v1, v0, Landroid/graphics/BitmapFactory$Options;->inPreferredConfig:Landroid/graphics/Bitmap$Config;

    .line 14
    .line 15
    .line 16
    invoke-static {p1, v0}, Lk/a;->d(Ljava/io/ByteArrayOutputStream;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 17
    move-result-object p1

    .line 18
    .line 19
    iget-boolean v0, p0, La3d20260409/d;->e:Z

    .line 20
    .line 21
    iget v1, p0, La3d20260409/d;->c:I

    .line 22
    .line 23
    .line 24
    invoke-static {p1, v0, v1}, Lk/a;->e(Landroid/graphics/Bitmap;ZI)Landroid/graphics/Bitmap;

    .line 25
    move-result-object p1

    .line 26
    .line 27
    .line 28
    invoke-static {p1}, Lk/a;->f(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    .line 29
    move-result-object p1

    .line 30
    return-object p1
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
.end method

.method public f(IIZ)Landroid/graphics/Bitmap;
    .locals 1

    .line 1
    .line 2
    if-eqz p3, :cond_0

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p2}, La3d20260409/d;->b(I)Landroid/graphics/Bitmap;

    .line 6
    move-result-object p3

    .line 7
    .line 8
    if-eqz p3, :cond_0

    .line 9
    return-object p3

    .line 10
    .line 11
    .line 12
    :cond_0
    invoke-virtual {p0, p1}, La3d20260409/d;->e(I)Landroid/graphics/Bitmap;

    .line 13
    move-result-object p1

    .line 14
    .line 15
    .line 16
    invoke-static {}, La3d20260409/v;->D()Z

    .line 17
    move-result p3

    .line 18
    .line 19
    .line 20
    invoke-static {}, La3d20260409/v;->E()F

    .line 21
    move-result v0

    .line 22
    .line 23
    .line 24
    invoke-static {p1, p2, p3, v0}, Lk/a;->l(Landroid/graphics/Bitmap;IZF)Landroid/graphics/Bitmap;

    .line 25
    move-result-object p1

    .line 26
    return-object p1
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

.method public g(Landroid/graphics/Rect;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, La3d20260409/d;->d:Landroid/graphics/Rect;

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

.method public h(I)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, La3d20260409/d;->a:I

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

.method public i()J
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, La3d20260409/d;->b:J

    .line 3
    return-wide v0
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

.method public j(IIZ)Landroid/graphics/Bitmap;
    .locals 1

    .line 1
    .line 2
    if-eqz p3, :cond_0

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p2}, La3d20260409/d;->n(I)Landroid/graphics/Bitmap;

    .line 6
    move-result-object p3

    .line 7
    .line 8
    if-eqz p3, :cond_0

    .line 9
    return-object p3

    .line 10
    .line 11
    .line 12
    :cond_0
    invoke-virtual {p0, p1}, La3d20260409/d;->l(I)Landroid/graphics/Bitmap;

    .line 13
    move-result-object p1

    .line 14
    .line 15
    .line 16
    invoke-static {}, La3d20260409/v;->F()Z

    .line 17
    move-result p3

    .line 18
    .line 19
    .line 20
    invoke-static {}, La3d20260409/v;->G()F

    .line 21
    move-result v0

    .line 22
    .line 23
    .line 24
    invoke-static {p1, p2, p3, v0}, Lk/a;->l(Landroid/graphics/Bitmap;IZF)Landroid/graphics/Bitmap;

    .line 25
    move-result-object p2

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->isRecycled()Z

    .line 29
    move-result p3

    .line 30
    .line 31
    if-nez p3, :cond_1

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->recycle()V

    .line 35
    :cond_1
    return-object p2
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

.method public k(I)Ljava/io/ByteArrayOutputStream;
    .locals 5

    .line 1
    .line 2
    iget-object v0, p0, La3d20260409/d;->f:Ljava/util/Map;

    .line 3
    .line 4
    .line 5
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 6
    move-result-object v1

    .line 7
    .line 8
    .line 9
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    check-cast v0, Ljava/io/ByteArrayOutputStream;

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    return-object v0

    .line 16
    .line 17
    :cond_0
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    .line 18
    .line 19
    .line 20
    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 21
    .line 22
    iget-object v1, p0, La3d20260409/d;->d:Landroid/graphics/Rect;

    .line 23
    .line 24
    if-nez v1, :cond_1

    .line 25
    .line 26
    new-instance v1, Landroid/graphics/Rect;

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0}, Landroid/graphics/YuvImage;->getWidth()I

    .line 30
    move-result v2

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0}, Landroid/graphics/YuvImage;->getHeight()I

    .line 34
    move-result v3

    .line 35
    const/4 v4, 0x0

    .line 36
    .line 37
    .line 38
    invoke-direct {v1, v4, v4, v2, v3}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 39
    .line 40
    .line 41
    :cond_1
    invoke-virtual {p0, v1, p1, v0}, Landroid/graphics/YuvImage;->compressToJpeg(Landroid/graphics/Rect;ILjava/io/OutputStream;)Z

    .line 42
    .line 43
    iget-object v1, p0, La3d20260409/d;->f:Ljava/util/Map;

    .line 44
    .line 45
    .line 46
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 47
    move-result-object p1

    .line 48
    .line 49
    .line 50
    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    return-object v0
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

.method public l(I)Landroid/graphics/Bitmap;
    .locals 5

    .line 1
    .line 2
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-static {}, La3d20260409/s;->i()I

    .line 9
    move-result v1

    .line 10
    .line 11
    .line 12
    invoke-static {}, Lk/a;->g()I

    .line 13
    move-result v2

    .line 14
    const/4 v3, 0x0

    .line 15
    .line 16
    if-ne v1, v2, :cond_0

    .line 17
    .line 18
    new-instance v1, Landroid/graphics/Rect;

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Landroid/graphics/YuvImage;->getWidth()I

    .line 22
    move-result v2

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0}, Landroid/graphics/YuvImage;->getHeight()I

    .line 26
    move-result v4

    .line 27
    .line 28
    .line 29
    invoke-direct {v1, v3, v3, v2, v4}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 30
    .line 31
    .line 32
    :goto_0
    invoke-virtual {p0, v1, p1, v0}, Landroid/graphics/YuvImage;->compressToJpeg(Landroid/graphics/Rect;ILjava/io/OutputStream;)Z

    .line 33
    goto :goto_1

    .line 34
    .line 35
    :cond_0
    new-instance v1, Landroid/graphics/Rect;

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0}, Landroid/graphics/YuvImage;->getWidth()I

    .line 39
    move-result v2

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0}, Landroid/graphics/YuvImage;->getHeight()I

    .line 43
    move-result v4

    .line 44
    .line 45
    .line 46
    invoke-direct {v1, v3, v3, v2, v4}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 47
    goto :goto_0

    .line 48
    .line 49
    :goto_1
    new-instance p1, Landroid/graphics/BitmapFactory$Options;

    .line 50
    .line 51
    .line 52
    invoke-direct {p1}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 53
    .line 54
    sget-object v1, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 55
    .line 56
    iput-object v1, p1, Landroid/graphics/BitmapFactory$Options;->inPreferredConfig:Landroid/graphics/Bitmap$Config;

    .line 57
    .line 58
    .line 59
    invoke-static {v0, p1}, Lk/a;->d(Ljava/io/ByteArrayOutputStream;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 60
    move-result-object p1

    .line 61
    .line 62
    iget-boolean v0, p0, La3d20260409/d;->e:Z

    .line 63
    .line 64
    iget v1, p0, La3d20260409/d;->c:I

    .line 65
    .line 66
    .line 67
    invoke-static {p1, v0, v1}, Lk/a;->e(Landroid/graphics/Bitmap;ZI)Landroid/graphics/Bitmap;

    .line 68
    move-result-object p1

    .line 69
    .line 70
    .line 71
    invoke-static {p1}, Lk/a;->f(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    .line 72
    move-result-object p1

    .line 73
    return-object p1
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
.end method

.method public m(IIZ)[B
    .locals 7

    .line 1
    .line 2
    if-eqz p3, :cond_0

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p2}, La3d20260409/d;->c(I)[B

    .line 6
    move-result-object p3

    .line 7
    .line 8
    if-eqz p3, :cond_0

    .line 9
    return-object p3

    .line 10
    .line 11
    .line 12
    :cond_0
    invoke-virtual {p0}, Landroid/graphics/YuvImage;->getYuvData()[B

    .line 13
    move-result-object p3

    .line 14
    .line 15
    .line 16
    invoke-static {p3}, La3d20260409/j3d20260409;->oo0ooO([B)Z

    .line 17
    move-result p3

    .line 18
    .line 19
    if-nez p3, :cond_1

    .line 20
    .line 21
    new-instance p3, Landroid/graphics/BitmapFactory$Options;

    .line 22
    .line 23
    .line 24
    invoke-direct {p3}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 25
    .line 26
    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 27
    .line 28
    iput-object v0, p3, Landroid/graphics/BitmapFactory$Options;->inPreferredConfig:Landroid/graphics/Bitmap$Config;

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0}, Landroid/graphics/YuvImage;->getWidth()I

    .line 32
    move-result v0

    .line 33
    int-to-float v0, v0

    .line 34
    int-to-float p2, p2

    .line 35
    div-float/2addr v0, p2

    .line 36
    float-to-int v0, v0

    .line 37
    .line 38
    iput v0, p3, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0, p1}, La3d20260409/d;->k(I)Ljava/io/ByteArrayOutputStream;

    .line 42
    move-result-object p1

    .line 43
    .line 44
    .line 45
    invoke-static {p1, p3}, Lk/a;->d(Ljava/io/ByteArrayOutputStream;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 46
    move-result-object p1

    .line 47
    .line 48
    iget-boolean p3, p0, La3d20260409/d;->e:Z

    .line 49
    .line 50
    iget v0, p0, La3d20260409/d;->c:I

    .line 51
    .line 52
    .line 53
    invoke-static {p1, p3, v0}, Lk/a;->e(Landroid/graphics/Bitmap;ZI)Landroid/graphics/Bitmap;

    .line 54
    move-result-object p1

    .line 55
    .line 56
    .line 57
    invoke-static {p1}, Lk/a;->f(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    .line 58
    move-result-object v0

    .line 59
    .line 60
    new-instance v5, Landroid/graphics/Matrix;

    .line 61
    .line 62
    .line 63
    invoke-direct {v5}, Landroid/graphics/Matrix;-><init>()V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    .line 67
    move-result p1

    .line 68
    int-to-float p1, p1

    .line 69
    div-float/2addr p2, p1

    .line 70
    .line 71
    .line 72
    invoke-virtual {v5, p2, p2}, Landroid/graphics/Matrix;->setScale(FF)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    .line 76
    move-result v3

    .line 77
    .line 78
    .line 79
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    .line 80
    move-result v4

    .line 81
    const/4 v2, 0x0

    .line 82
    const/4 v6, 0x1

    .line 83
    const/4 v1, 0x0

    .line 84
    .line 85
    .line 86
    invoke-static/range {v0 .. v6}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;

    .line 87
    move-result-object p1

    .line 88
    .line 89
    .line 90
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    .line 91
    .line 92
    .line 93
    invoke-static {p1}, Lk/a;->h(Landroid/graphics/Bitmap;)[B

    .line 94
    move-result-object p2

    .line 95
    .line 96
    .line 97
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->recycle()V

    .line 98
    return-object p2

    .line 99
    :cond_1
    const/4 p1, 0x0

    .line 100
    return-object p1
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
.end method

.method public final n(I)Landroid/graphics/Bitmap;
    .locals 10

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/graphics/YuvImage;->getWidth()I

    .line 4
    move-result v0

    .line 5
    mul-int/2addr v0, p1

    .line 6
    int-to-float v0, v0

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/graphics/YuvImage;->getHeight()I

    .line 10
    move-result v1

    .line 11
    int-to-float v1, v1

    .line 12
    div-float/2addr v0, v1

    .line 13
    float-to-int v0, v0

    .line 14
    .line 15
    mul-int v1, p1, v0

    .line 16
    .line 17
    mul-int/lit8 v1, v1, 0x4

    .line 18
    .line 19
    new-array v6, v1, [B

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Landroid/graphics/YuvImage;->getYuvData()[B

    .line 23
    move-result-object v2

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, Landroid/graphics/YuvImage;->getYuvFormat()I

    .line 27
    move-result v3

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0}, Landroid/graphics/YuvImage;->getWidth()I

    .line 31
    move-result v4

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0}, Landroid/graphics/YuvImage;->getHeight()I

    .line 35
    move-result v5

    .line 36
    .line 37
    iget v9, p0, La3d20260409/d;->c:I

    .line 38
    const/4 v8, 0x0

    .line 39
    move v7, p1

    .line 40
    .line 41
    .line 42
    invoke-static/range {v2 .. v9}, La3d20260409/v;->k([BIII[BIZI)I

    .line 43
    move-result p1

    .line 44
    const/4 v1, -0x1

    .line 45
    .line 46
    if-eq p1, v1, :cond_0

    .line 47
    .line 48
    sget-object p1, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 49
    .line 50
    .line 51
    invoke-static {v7, v0, p1}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 52
    move-result-object p1

    .line 53
    .line 54
    .line 55
    invoke-static {v6}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 56
    move-result-object v0

    .line 57
    .line 58
    .line 59
    invoke-virtual {p1, v0}, Landroid/graphics/Bitmap;->copyPixelsFromBuffer(Ljava/nio/Buffer;)V

    .line 60
    return-object p1

    .line 61
    :cond_0
    const/4 p1, 0x0

    .line 62
    return-object p1
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
