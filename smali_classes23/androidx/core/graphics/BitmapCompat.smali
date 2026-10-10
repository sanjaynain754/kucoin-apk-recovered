.class public final Landroidx/core/graphics/BitmapCompat;
.super Ljava/lang/Object;
.source "BitmapCompat.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/core/graphics/BitmapCompat$Api27Impl;,
        Landroidx/core/graphics/BitmapCompat$Api29Impl;,
        Landroidx/core/graphics/BitmapCompat$Api31Impl;
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
.end method

.method public static createScaledBitmap(Landroid/graphics/Bitmap;IILandroid/graphics/Rect;Z)Landroid/graphics/Bitmap;
    .locals 20
    .param p0    # Landroid/graphics/Bitmap;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Landroid/graphics/Rect;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    move-object/from16 v0, p0

    move/from16 v1, p1

    move/from16 v2, p2

    move-object/from16 v3, p3

    if-lez v1, :cond_23

    if-lez v2, :cond_23

    if-eqz v3, :cond_1

    .line 1
    invoke-virtual {v3}, Landroid/graphics/Rect;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_0

    iget v4, v3, Landroid/graphics/Rect;->left:I

    if-ltz v4, :cond_0

    iget v4, v3, Landroid/graphics/Rect;->right:I

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v5

    if-gt v4, v5, :cond_0

    iget v4, v3, Landroid/graphics/Rect;->top:I

    if-ltz v4, :cond_0

    iget v4, v3, Landroid/graphics/Rect;->bottom:I

    .line 2
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v5

    if-gt v4, v5, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string/jumbo v1, "srcRect must be contained by srcBm!"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 4
    :cond_1
    :goto_0
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v5, 0x1b

    if-lt v4, v5, :cond_2

    .line 5
    invoke-static {v0}, Landroidx/core/graphics/BitmapCompat$Api27Impl;->copyBitmapIfHardware(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object v6

    goto :goto_1

    :cond_2
    move-object v6, v0

    :goto_1
    if-eqz v3, :cond_3

    .line 6
    invoke-virtual {v3}, Landroid/graphics/Rect;->width()I

    move-result v7

    goto :goto_2

    :cond_3
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v7

    :goto_2
    if-eqz v3, :cond_4

    .line 7
    invoke-virtual {v3}, Landroid/graphics/Rect;->height()I

    move-result v8

    goto :goto_3

    :cond_4
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v8

    :goto_3
    int-to-float v9, v1

    int-to-float v10, v7

    div-float/2addr v9, v10

    int-to-float v10, v2

    int-to-float v11, v8

    div-float/2addr v10, v11

    if-eqz v3, :cond_5

    .line 8
    iget v12, v3, Landroid/graphics/Rect;->left:I

    goto :goto_4

    :cond_5
    const/4 v12, 0x0

    :goto_4
    if-eqz v3, :cond_6

    .line 9
    iget v3, v3, Landroid/graphics/Rect;->top:I

    goto :goto_5

    :cond_6
    const/4 v3, 0x0

    :goto_5
    const/4 v13, 0x1

    if-nez v12, :cond_8

    if-nez v3, :cond_8

    .line 10
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v14

    if-ne v1, v14, :cond_8

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v14

    if-ne v2, v14, :cond_8

    .line 11
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isMutable()Z

    move-result v1

    if-eqz v1, :cond_7

    if-ne v0, v6, :cond_7

    .line 12
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;

    move-result-object v1

    invoke-virtual {v0, v1, v13}, Landroid/graphics/Bitmap;->copy(Landroid/graphics/Bitmap$Config;Z)Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0

    :cond_7
    return-object v6

    .line 13
    :cond_8
    new-instance v14, Landroid/graphics/Paint;

    invoke-direct {v14, v13}, Landroid/graphics/Paint;-><init>(I)V

    .line 14
    invoke-virtual {v14, v13}, Landroid/graphics/Paint;->setFilterBitmap(Z)V

    const/16 v15, 0x1d

    if-lt v4, v15, :cond_9

    .line 15
    invoke-static {v14}, Landroidx/core/graphics/BitmapCompat$Api29Impl;->setPaintBlendMode(Landroid/graphics/Paint;)V

    goto :goto_6

    .line 16
    :cond_9
    new-instance v15, Landroid/graphics/PorterDuffXfermode;

    sget-object v11, Landroid/graphics/PorterDuff$Mode;->SRC:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {v15, v11}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    invoke-virtual {v14, v15}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    :goto_6
    if-ne v7, v1, :cond_a

    if-ne v8, v2, :cond_a

    .line 17
    invoke-virtual {v6}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;

    move-result-object v0

    invoke-static {v1, v2, v0}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 18
    new-instance v1, Landroid/graphics/Canvas;

    invoke-direct {v1, v0}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    neg-int v2, v12

    int-to-float v2, v2

    neg-int v3, v3

    int-to-float v3, v3

    .line 19
    invoke-virtual {v1, v6, v2, v3, v14}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    return-object v0

    :cond_a
    const-wide/high16 v16, 0x4000000000000000L    # 2.0

    .line 20
    invoke-static/range {v16 .. v17}, Ljava/lang/Math;->log(D)D

    move-result-wide v16

    const/high16 v11, 0x3f800000    # 1.0f

    cmpl-float v15, v9, v11

    if-lez v15, :cond_b

    move/from16 p3, v11

    move v15, v12

    float-to-double v11, v9

    .line 21
    invoke-static {v11, v12}, Ljava/lang/Math;->log(D)D

    move-result-wide v11

    div-double v11, v11, v16

    invoke-static {v11, v12}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v11

    :goto_7
    double-to-int v9, v11

    goto :goto_8

    :cond_b
    move/from16 p3, v11

    move v15, v12

    float-to-double v11, v9

    .line 22
    invoke-static {v11, v12}, Ljava/lang/Math;->log(D)D

    move-result-wide v11

    div-double v11, v11, v16

    invoke-static {v11, v12}, Ljava/lang/Math;->floor(D)D

    move-result-wide v11

    goto :goto_7

    :goto_8
    cmpl-float v11, v10, p3

    if-lez v11, :cond_c

    float-to-double v10, v10

    .line 23
    invoke-static {v10, v11}, Ljava/lang/Math;->log(D)D

    move-result-wide v10

    div-double v10, v10, v16

    invoke-static {v10, v11}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v10

    :goto_9
    double-to-int v10, v10

    goto :goto_a

    :cond_c
    float-to-double v10, v10

    .line 24
    invoke-static {v10, v11}, Ljava/lang/Math;->log(D)D

    move-result-wide v10

    div-double v10, v10, v16

    invoke-static {v10, v11}, Ljava/lang/Math;->floor(D)D

    move-result-wide v10

    goto :goto_9

    :goto_a
    if-eqz p4, :cond_f

    if-lt v4, v5, :cond_f

    .line 25
    invoke-static {v0}, Landroidx/core/graphics/BitmapCompat$Api27Impl;->isAlreadyF16AndLinear(Landroid/graphics/Bitmap;)Z

    move-result v4

    if-nez v4, :cond_f

    if-lez v9, :cond_d

    .line 26
    invoke-static {v7, v1, v13, v9}, Landroidx/core/graphics/BitmapCompat;->sizeAtStep(IIII)I

    move-result v4

    goto :goto_b

    :cond_d
    move v4, v7

    :goto_b
    if-lez v10, :cond_e

    .line 27
    invoke-static {v8, v2, v13, v10}, Landroidx/core/graphics/BitmapCompat;->sizeAtStep(IIII)I

    move-result v11

    goto :goto_c

    :cond_e
    move v11, v8

    .line 28
    :goto_c
    invoke-static {v4, v11, v0, v13}, Landroidx/core/graphics/BitmapCompat$Api27Impl;->createBitmapWithSourceColorspace(IILandroid/graphics/Bitmap;Z)Landroid/graphics/Bitmap;

    move-result-object v4

    .line 29
    new-instance v11, Landroid/graphics/Canvas;

    invoke-direct {v11, v4}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    neg-int v12, v15

    int-to-float v12, v12

    neg-int v3, v3

    int-to-float v3, v3

    .line 30
    invoke-virtual {v11, v6, v12, v3, v14}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    move-object v3, v6

    move-object v6, v4

    move-object v4, v3

    move v11, v13

    const/4 v3, 0x0

    const/4 v12, 0x0

    goto :goto_d

    :cond_f
    const/4 v4, 0x0

    move v12, v15

    const/4 v11, 0x0

    .line 31
    :goto_d
    new-instance v15, Landroid/graphics/Rect;

    invoke-direct {v15, v12, v3, v7, v8}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 32
    new-instance v3, Landroid/graphics/Rect;

    invoke-direct {v3}, Landroid/graphics/Rect;-><init>()V

    move v12, v9

    move/from16 v16, v10

    :goto_e
    if-nez v12, :cond_12

    if-eqz v16, :cond_10

    goto :goto_f

    :cond_10
    if-eq v4, v0, :cond_11

    if-eqz v4, :cond_11

    .line 33
    invoke-virtual {v4}, Landroid/graphics/Bitmap;->recycle()V

    :cond_11
    return-object v6

    :cond_12
    :goto_f
    if-gez v12, :cond_13

    add-int/lit8 v12, v12, 0x1

    goto :goto_10

    :cond_13
    if-lez v12, :cond_14

    add-int/lit8 v12, v12, -0x1

    :cond_14
    :goto_10
    if-gez v16, :cond_16

    add-int/lit8 v16, v16, 0x1

    :cond_15
    :goto_11
    move/from16 v13, v16

    goto :goto_12

    :cond_16
    if-lez v16, :cond_15

    add-int/lit8 v16, v16, -0x1

    goto :goto_11

    .line 34
    :goto_12
    invoke-static {v7, v1, v12, v9}, Landroidx/core/graphics/BitmapCompat;->sizeAtStep(IIII)I

    move-result v5

    move/from16 v17, v11

    .line 35
    invoke-static {v8, v2, v13, v10}, Landroidx/core/graphics/BitmapCompat;->sizeAtStep(IIII)I

    move-result v11

    move/from16 v18, v12

    const/4 v12, 0x0

    .line 36
    invoke-virtual {v3, v12, v12, v5, v11}, Landroid/graphics/Rect;->set(IIII)V

    if-nez v18, :cond_17

    if-nez v13, :cond_17

    const/4 v5, 0x1

    goto :goto_13

    :cond_17
    move v5, v12

    :goto_13
    if-eqz v4, :cond_18

    .line 37
    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v11

    if-ne v11, v1, :cond_18

    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v11

    if-ne v11, v2, :cond_18

    const/4 v11, 0x1

    goto :goto_14

    :cond_18
    move v11, v12

    :goto_14
    if-eqz v4, :cond_1c

    if-eq v4, v0, :cond_1c

    if-eqz p4, :cond_19

    .line 38
    sget v12, Landroid/os/Build$VERSION;->SDK_INT:I

    move/from16 v19, v5

    const/16 v5, 0x1b

    if-lt v12, v5, :cond_1a

    .line 39
    invoke-static {v4}, Landroidx/core/graphics/BitmapCompat$Api27Impl;->isAlreadyF16AndLinear(Landroid/graphics/Bitmap;)Z

    move-result v5

    if-eqz v5, :cond_1d

    goto :goto_15

    :cond_19
    move/from16 v19, v5

    :cond_1a
    :goto_15
    if-eqz v19, :cond_1b

    if-eqz v11, :cond_1d

    if-eqz v17, :cond_1b

    goto :goto_16

    :cond_1b
    const/16 v12, 0x1b

    goto :goto_1a

    :cond_1c
    move/from16 v19, v5

    :cond_1d
    :goto_16
    if-eq v4, v0, :cond_1e

    if-eqz v4, :cond_1e

    .line 40
    invoke-virtual {v4}, Landroid/graphics/Bitmap;->recycle()V

    :cond_1e
    if-lez v18, :cond_1f

    move/from16 v4, v17

    goto :goto_17

    :cond_1f
    move/from16 v4, v18

    .line 41
    :goto_17
    invoke-static {v7, v1, v4, v9}, Landroidx/core/graphics/BitmapCompat;->sizeAtStep(IIII)I

    move-result v4

    if-lez v13, :cond_20

    move/from16 v5, v17

    goto :goto_18

    :cond_20
    move v5, v13

    .line 42
    :goto_18
    invoke-static {v8, v2, v5, v10}, Landroidx/core/graphics/BitmapCompat;->sizeAtStep(IIII)I

    move-result v5

    .line 43
    sget v11, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v12, 0x1b

    if-lt v11, v12, :cond_22

    if-eqz p4, :cond_21

    if-nez v19, :cond_21

    const/4 v11, 0x1

    goto :goto_19

    :cond_21
    const/4 v11, 0x0

    .line 44
    :goto_19
    invoke-static {v4, v5, v0, v11}, Landroidx/core/graphics/BitmapCompat$Api27Impl;->createBitmapWithSourceColorspace(IILandroid/graphics/Bitmap;Z)Landroid/graphics/Bitmap;

    move-result-object v4

    goto :goto_1a

    .line 45
    :cond_22
    invoke-virtual {v6}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;

    move-result-object v11

    invoke-static {v4, v5, v11}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v4

    .line 46
    :goto_1a
    new-instance v5, Landroid/graphics/Canvas;

    invoke-direct {v5, v4}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 47
    invoke-virtual {v5, v6, v15, v3, v14}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    .line 48
    invoke-virtual {v15, v3}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    move-object v5, v6

    move-object v6, v4

    move-object v4, v5

    move v5, v12

    move/from16 v16, v13

    move/from16 v11, v17

    move/from16 v12, v18

    const/4 v13, 0x1

    goto/16 :goto_e

    .line 49
    :cond_23
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "dstW and dstH must be > 0!"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static getAllocationByteCount(Landroid/graphics/Bitmap;)I
    .locals 0
    .param p0    # Landroid/graphics/Bitmap;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation runtime Landroidx/annotation/ReplaceWith;
        expression = "bitmap.getAllocationByteCount()"
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getAllocationByteCount()I

    .line 4
    move-result p0

    .line 5
    return p0
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

.method public static hasMipMap(Landroid/graphics/Bitmap;)Z
    .locals 0
    .param p0    # Landroid/graphics/Bitmap;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation runtime Landroidx/annotation/ReplaceWith;
        expression = "bitmap.hasMipMap()"
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->hasMipMap()Z

    .line 4
    move-result p0

    .line 5
    return p0
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

.method public static setHasMipMap(Landroid/graphics/Bitmap;Z)V
    .locals 0
    .param p0    # Landroid/graphics/Bitmap;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation runtime Landroidx/annotation/ReplaceWith;
        expression = "bitmap.setHasMipMap(hasMipMap)"
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroid/graphics/Bitmap;->setHasMipMap(Z)V

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

.method public static sizeAtStep(IIII)I
    .locals 1
    .annotation build Landroidx/annotation/VisibleForTesting;
    .end annotation

    .line 1
    .line 2
    if-nez p2, :cond_0

    .line 3
    return p1

    .line 4
    :cond_0
    const/4 v0, 0x1

    .line 5
    .line 6
    if-lez p2, :cond_1

    .line 7
    sub-int/2addr p3, p2

    .line 8
    .line 9
    shl-int p1, v0, p3

    .line 10
    mul-int/2addr p0, p1

    .line 11
    return p0

    .line 12
    :cond_1
    neg-int p0, p2

    .line 13
    sub-int/2addr p0, v0

    .line 14
    .line 15
    shl-int p0, p1, p0

    .line 16
    return p0
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
.end method
