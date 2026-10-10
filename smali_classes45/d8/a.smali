.class public Ld8/a;
.super Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder;
.source "AVIFDecoder.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder<",
        "Le8/a;",
        "Le8/b;",
        ">;"
    }
.end annotation


# instance fields
.field public w:Lorg/aomedia/avif/android/AvifDecoder;


# direct methods
.method public constructor <init>(Lk8/b;Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder$j;)V
    .locals 0
    .param p2    # Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder$j;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1, p2}, Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder;-><init>(Lk8/b;Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder$j;)V

    .line 4
    const/4 p1, 0x0

    .line 5
    .line 6
    iput-object p1, p0, Ld8/a;->w:Lorg/aomedia/avif/android/AvifDecoder;

    .line 7
    return-void
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
    .line 43
    .line 44
    .line 45
.end method


# virtual methods
.method public bridge synthetic A(Lcom/github/penfeizhou/animation/io/Reader;)Lcom/github/penfeizhou/animation/io/Reader;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ld8/a;->T(Lcom/github/penfeizhou/animation/io/Reader;)Le8/a;

    .line 4
    move-result-object p1

    .line 5
    return-object p1
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
.end method

.method public B()I
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
.end method

.method public bridge synthetic C()Lcom/github/penfeizhou/animation/io/e;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Ld8/a;->U()Le8/b;

    .line 4
    move-result-object v0

    .line 5
    return-object v0
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
.end method

.method public bridge synthetic I(Lcom/github/penfeizhou/animation/io/Reader;)Landroid/graphics/Rect;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    check-cast p1, Le8/a;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1}, Ld8/a;->V(Le8/a;)Landroid/graphics/Rect;

    .line 6
    move-result-object p1

    .line 7
    return-object p1
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
.end method

.method public K()V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Ld8/a;->w:Lorg/aomedia/avif/android/AvifDecoder;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lorg/aomedia/avif/android/AvifDecoder;->release()V

    .line 8
    const/4 v0, 0x0

    .line 9
    .line 10
    iput-object v0, p0, Ld8/a;->w:Lorg/aomedia/avif/android/AvifDecoder;

    .line 11
    :cond_0
    return-void
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public M(Lcom/github/penfeizhou/animation/decode/a;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/github/penfeizhou/animation/decode/a<",
            "Le8/a;",
            "Le8/b;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Ld8/a;->w:Lorg/aomedia/avif/android/AvifDecoder;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lorg/aomedia/avif/android/AvifDecoder;->getWidth()I

    .line 6
    move-result v0

    .line 7
    .line 8
    iget-object v1, p0, Ld8/a;->w:Lorg/aomedia/avif/android/AvifDecoder;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v1}, Lorg/aomedia/avif/android/AvifDecoder;->getHeight()I

    .line 12
    move-result v1

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, v0, v1}, Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder;->H(II)Landroid/graphics/Bitmap;

    .line 16
    move-result-object v0

    .line 17
    .line 18
    iget-object v1, p0, Ld8/a;->w:Lorg/aomedia/avif/android/AvifDecoder;

    .line 19
    .line 20
    if-nez v1, :cond_0

    .line 21
    return-void

    .line 22
    .line 23
    :cond_0
    iget v2, p0, Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder;->e:I

    .line 24
    .line 25
    check-cast p1, Ld8/b;

    .line 26
    .line 27
    iget p1, p1, Ld8/b;->a:I

    .line 28
    .line 29
    if-eq v2, p1, :cond_1

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1, p1, v0}, Lorg/aomedia/avif/android/AvifDecoder;->nthFrame(ILandroid/graphics/Bitmap;)I

    .line 33
    goto :goto_0

    .line 34
    .line 35
    :cond_1
    if-nez v2, :cond_2

    .line 36
    const/4 p1, 0x0

    .line 37
    .line 38
    .line 39
    invoke-virtual {v1, p1, v0}, Lorg/aomedia/avif/android/AvifDecoder;->nthFrame(ILandroid/graphics/Bitmap;)I

    .line 40
    goto :goto_0

    .line 41
    .line 42
    .line 43
    :cond_2
    invoke-virtual {v1, v0}, Lorg/aomedia/avif/android/AvifDecoder;->nextFrame(Landroid/graphics/Bitmap;)I

    .line 44
    .line 45
    :goto_0
    iget-object p1, p0, Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder;->o:Ljava/nio/ByteBuffer;

    .line 46
    .line 47
    .line 48
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    .line 49
    .line 50
    :try_start_0
    iget-object p1, p0, Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder;->o:Ljava/nio/ByteBuffer;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0, p1}, Landroid/graphics/Bitmap;->copyPixelsToBuffer(Ljava/nio/Buffer;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 54
    goto :goto_1

    .line 55
    :catch_0
    move-exception p1

    .line 56
    .line 57
    .line 58
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 59
    .line 60
    .line 61
    :goto_1
    invoke-virtual {p0, v0}, Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder;->J(Landroid/graphics/Bitmap;)V

    .line 62
    return-void
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

.method public T(Lcom/github/penfeizhou/animation/io/Reader;)Le8/a;
    .locals 1

    .line 1
    .line 2
    new-instance v0, Le8/a;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p1}, Le8/a;-><init>(Lcom/github/penfeizhou/animation/io/Reader;)V

    .line 6
    return-object v0
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
.end method

.method public U()Le8/b;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
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
.end method

.method public V(Le8/a;)Landroid/graphics/Rect;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Le8/a;->a()Ljava/nio/ByteBuffer;

    .line 4
    move-result-object p1

    .line 5
    .line 6
    .line 7
    invoke-static {p1}, Lorg/aomedia/avif/android/AvifDecoder;->create(Ljava/nio/ByteBuffer;)Lorg/aomedia/avif/android/AvifDecoder;

    .line 8
    move-result-object p1

    .line 9
    .line 10
    iput-object p1, p0, Ld8/a;->w:Lorg/aomedia/avif/android/AvifDecoder;

    .line 11
    .line 12
    new-instance p1, Landroid/graphics/Rect;

    .line 13
    .line 14
    iget-object v0, p0, Ld8/a;->w:Lorg/aomedia/avif/android/AvifDecoder;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, Lorg/aomedia/avif/android/AvifDecoder;->getWidth()I

    .line 18
    move-result v0

    .line 19
    .line 20
    iget-object v1, p0, Ld8/a;->w:Lorg/aomedia/avif/android/AvifDecoder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1}, Lorg/aomedia/avif/android/AvifDecoder;->getHeight()I

    .line 24
    move-result v1

    .line 25
    const/4 v2, 0x0

    .line 26
    .line 27
    .line 28
    invoke-direct {p1, v2, v2, v0, v1}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 29
    return-object p1
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
.end method

.method public u(I)Lcom/github/penfeizhou/animation/decode/a;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Lcom/github/penfeizhou/animation/decode/a<",
            "Le8/a;",
            "Le8/b;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    new-instance v0, Ld8/b;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Ld8/b;-><init>(Le8/a;)V

    .line 7
    .line 8
    iput p1, v0, Ld8/b;->a:I

    .line 9
    .line 10
    iget-object v1, p0, Ld8/a;->w:Lorg/aomedia/avif/android/AvifDecoder;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v1}, Lorg/aomedia/avif/android/AvifDecoder;->getFrameDurations()[D

    .line 14
    move-result-object v1

    .line 15
    .line 16
    aget-wide v2, v1, p1

    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    const-wide v4, 0x408f400000000000L    # 1000.0

    .line 22
    mul-double/2addr v2, v4

    .line 23
    double-to-int p1, v2

    .line 24
    .line 25
    iput p1, v0, Lcom/github/penfeizhou/animation/decode/a;->frameDuration:I

    .line 26
    return-object v0
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
.end method

.method public v(I)Landroid/graphics/Bitmap;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Ld8/a;->w:Lorg/aomedia/avif/android/AvifDecoder;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    const/4 p1, 0x0

    .line 6
    return-object p1

    .line 7
    .line 8
    .line 9
    :cond_0
    invoke-virtual {p0}, Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder;->s()Landroid/graphics/Rect;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    .line 14
    move-result v0

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Ld8/a;->B()I

    .line 18
    move-result v1

    .line 19
    div-int/2addr v0, v1

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder;->s()Landroid/graphics/Rect;

    .line 23
    move-result-object v1

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1}, Landroid/graphics/Rect;->height()I

    .line 27
    move-result v1

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0}, Ld8/a;->B()I

    .line 31
    move-result v2

    .line 32
    div-int/2addr v1, v2

    .line 33
    .line 34
    sget-object v2, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 35
    .line 36
    .line 37
    invoke-static {v0, v1, v2}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 38
    move-result-object v0

    .line 39
    .line 40
    iget-object v1, p0, Ld8/a;->w:Lorg/aomedia/avif/android/AvifDecoder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v1, p1, v0}, Lorg/aomedia/avif/android/AvifDecoder;->nthFrame(ILandroid/graphics/Bitmap;)I

    .line 44
    return-object v0
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

.method public w()I
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Ld8/a;->w:Lorg/aomedia/avif/android/AvifDecoder;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    const/4 v0, 0x0

    .line 6
    return v0

    .line 7
    .line 8
    .line 9
    :cond_0
    invoke-virtual {v0}, Lorg/aomedia/avif/android/AvifDecoder;->getFrameCount()I

    .line 10
    move-result v0

    .line 11
    return v0
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public x()I
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Ld8/a;->w:Lorg/aomedia/avif/android/AvifDecoder;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    const/4 v0, 0x0

    .line 6
    return v0

    .line 7
    .line 8
    .line 9
    :cond_0
    invoke-virtual {v0}, Lorg/aomedia/avif/android/AvifDecoder;->getFrameCount()I

    .line 10
    move-result v0

    .line 11
    const/4 v1, 0x1

    .line 12
    .line 13
    if-ne v0, v1, :cond_1

    .line 14
    return v1

    .line 15
    .line 16
    :cond_1
    iget-object v0, p0, Ld8/a;->w:Lorg/aomedia/avif/android/AvifDecoder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Lorg/aomedia/avif/android/AvifDecoder;->getRepetitionCount()I

    .line 20
    move-result v0

    .line 21
    return v0
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
.end method
