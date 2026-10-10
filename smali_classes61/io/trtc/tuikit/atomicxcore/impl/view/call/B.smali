.class public final Lio/trtc/tuikit/atomicxcore/impl/view/call/B;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lio/trtc/tuikit/atomicxcore/impl/common/r;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 1
    .line 2
    const-string v0, "context"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    const-string p1, "file"

    .line 11
    .line 12
    const-string v0, "AtomicXCore-Call"

    .line 13
    .line 14
    const-string v1, "ImageLoader"

    .line 15
    .line 16
    .line 17
    invoke-static {v1, p1, v0, v1}, Lio/trtc/tuikit/atomicxcore/api/view/a;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 18
    move-result-object p1

    .line 19
    .line 20
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/B;->a:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 21
    return-void
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
.end method

.method public static a(Landroid/graphics/Bitmap;I)Landroid/graphics/Bitmap;
    .locals 18

    .line 69
    invoke-virtual/range {p0 .. p0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    int-to-float v0, v0

    const v1, 0x3e19999a    # 0.15f

    mul-float/2addr v0, v1

    float-to-int v0, v0

    const/4 v2, 0x1

    invoke-static {v0, v2}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    move-result v0

    .line 70
    invoke-virtual/range {p0 .. p0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v3

    int-to-float v3, v3

    mul-float/2addr v3, v1

    float-to-int v1, v3

    invoke-static {v1, v2}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    move-result v1

    move-object/from16 v3, p0

    .line 71
    invoke-static {v3, v0, v1, v2}, Landroid/graphics/Bitmap;->createScaledBitmap(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;

    move-result-object v4

    const-string v0, "createScaledBitmap(...)"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v1, 0xa

    move/from16 v5, p1

    .line 72
    invoke-static {v5, v1}, Lkotlin/ranges/RangesKt;->coerceAtMost(II)I

    move-result v1

    if-gtz v1, :cond_0

    move/from16 v17, v2

    goto/16 :goto_6

    .line 73
    :cond_0
    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v7

    .line 74
    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v11

    .line 75
    sget-object v5, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v7, v11, v5}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v12

    const-string v5, "createBitmap(...)"

    invoke-static {v12, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    mul-int v5, v7, v11

    .line 76
    new-array v5, v5, [I

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v6, 0x0

    move v10, v7

    .line 77
    invoke-virtual/range {v4 .. v11}, Landroid/graphics/Bitmap;->getPixels([IIIIIII)V

    const/4 v4, 0x0

    move v6, v4

    :goto_0
    if-ge v6, v11, :cond_5

    move v9, v4

    :goto_1
    if-ge v9, v7, :cond_4

    neg-int v10, v1

    if-gt v10, v1, :cond_1

    move v13, v4

    move v14, v13

    move v15, v14

    move/from16 v16, v15

    const/high16 p1, -0x1000000

    :goto_2
    add-int v8, v9, v10

    move/from16 v17, v2

    add-int/lit8 v2, v7, -0x1

    .line 78
    invoke-static {v8, v4, v2}, Lkotlin/ranges/RangesKt;->coerceIn(III)I

    move-result v2

    mul-int v8, v6, v7

    add-int/2addr v8, v2

    .line 79
    aget v2, v5, v8

    shr-int/lit8 v8, v2, 0x10

    and-int/lit16 v8, v8, 0xff

    add-int/2addr v15, v8

    shr-int/lit8 v8, v2, 0x8

    and-int/lit16 v8, v8, 0xff

    add-int/2addr v14, v8

    and-int/lit16 v2, v2, 0xff

    add-int/2addr v13, v2

    add-int/lit8 v16, v16, 0x1

    if-eq v10, v1, :cond_2

    add-int/lit8 v10, v10, 0x1

    move/from16 v2, v17

    goto :goto_2

    :cond_1
    move/from16 v17, v2

    const/high16 p1, -0x1000000

    move v13, v4

    move v14, v13

    move v15, v14

    move/from16 v16, v15

    :cond_2
    if-lez v16, :cond_3

    mul-int v2, v6, v7

    add-int/2addr v2, v9

    .line 80
    div-int v15, v15, v16

    shl-int/lit8 v8, v15, 0x10

    or-int v8, v8, p1

    .line 81
    div-int v14, v14, v16

    shl-int/lit8 v10, v14, 0x8

    or-int/2addr v8, v10

    .line 82
    div-int v13, v13, v16

    or-int/2addr v8, v13

    .line 83
    aput v8, v5, v2

    :cond_3
    add-int/lit8 v9, v9, 0x1

    move/from16 v2, v17

    goto :goto_1

    :cond_4
    move/from16 v17, v2

    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_5
    move/from16 v17, v2

    const/high16 p1, -0x1000000

    move v2, v4

    :goto_3
    if-ge v2, v7, :cond_9

    move v6, v4

    :goto_4
    if-ge v6, v11, :cond_8

    neg-int v8, v1

    move v9, v4

    move v10, v9

    move v13, v10

    move v14, v13

    if-gt v8, v1, :cond_6

    :goto_5
    add-int v15, v6, v8

    add-int/lit8 v3, v11, -0x1

    .line 84
    invoke-static {v15, v4, v3}, Lkotlin/ranges/RangesKt;->coerceIn(III)I

    move-result v3

    mul-int/2addr v3, v7

    add-int/2addr v3, v2

    .line 85
    aget v3, v5, v3

    shr-int/lit8 v15, v3, 0x10

    and-int/lit16 v15, v15, 0xff

    add-int/2addr v13, v15

    shr-int/lit8 v15, v3, 0x8

    and-int/lit16 v15, v15, 0xff

    add-int/2addr v10, v15

    and-int/lit16 v3, v3, 0xff

    add-int/2addr v9, v3

    add-int/lit8 v14, v14, 0x1

    if-eq v8, v1, :cond_6

    add-int/lit8 v8, v8, 0x1

    move-object/from16 v3, p0

    goto :goto_5

    :cond_6
    if-lez v14, :cond_7

    .line 86
    div-int/2addr v13, v14

    shl-int/lit8 v3, v13, 0x10

    or-int v3, v3, p1

    .line 87
    div-int/2addr v10, v14

    shl-int/lit8 v8, v10, 0x8

    or-int/2addr v3, v8

    .line 88
    div-int/2addr v9, v14

    or-int/2addr v3, v9

    .line 89
    invoke-virtual {v12, v2, v6, v3}, Landroid/graphics/Bitmap;->setPixel(III)V

    :cond_7
    add-int/lit8 v6, v6, 0x1

    move-object/from16 v3, p0

    goto :goto_4

    :cond_8
    add-int/lit8 v2, v2, 0x1

    move-object/from16 v3, p0

    goto :goto_3

    :cond_9
    move-object v4, v12

    .line 90
    :goto_6
    invoke-virtual/range {p0 .. p0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v1

    invoke-virtual/range {p0 .. p0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    move/from16 v3, v17

    invoke-static {v4, v1, v2, v3}, Landroid/graphics/Bitmap;->createScaledBitmap(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v1
.end method


# virtual methods
.method public final a(Ljava/io/File;)Landroid/graphics/Bitmap;
    .locals 6

    const-string v0, "message"

    const/4 v1, 0x2

    .line 60
    :try_start_0
    new-instance v2, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v2}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 61
    sget-object v3, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    iput-object v3, v2, Landroid/graphics/BitmapFactory$Options;->inPreferredConfig:Landroid/graphics/Bitmap$Config;

    .line 62
    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v2}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception v2

    .line 63
    iget-object v3, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/B;->a:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Error decoding bitmap: "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " e="

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 64
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 65
    invoke-virtual {v3, v1, p1}, Lio/trtc/tuikit/atomicxcore/impl/common/r;->a(ILjava/lang/String;)V

    goto :goto_0

    .line 66
    :catch_1
    iget-object v2, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/B;->a:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "OutOfMemoryError when decoding bitmap: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 67
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 68
    invoke-virtual {v2, v1, p1}, Lio/trtc/tuikit/atomicxcore/impl/common/r;->a(ILjava/lang/String;)V

    :goto_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final a(Landroid/widget/ImageView;Ljava/io/File;)V
    .locals 6

    .line 24
    const-string v0, "message"

    const-string v1, "Failed to decode GIF or GIF has no duration: "

    const/4 v2, 0x2

    .line 25
    :try_start_0
    new-instance v3, Ljava/io/FileInputStream;

    invoke-direct {v3, p2}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 26
    :try_start_1
    invoke-static {v3}, Landroid/graphics/Movie;->decodeStream(Ljava/io/InputStream;)Landroid/graphics/Movie;

    move-result-object v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const/4 v5, 0x0

    .line 27
    :try_start_2
    invoke-static {v3, v5}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    if-eqz v4, :cond_0

    .line 28
    invoke-virtual {v4}, Landroid/graphics/Movie;->duration()I

    move-result v3

    if-lez v3, :cond_0

    .line 29
    new-instance v1, Lio/trtc/tuikit/atomicxcore/impl/view/call/A;

    invoke-direct {v1, v4, p1}, Lio/trtc/tuikit/atomicxcore/impl/view/call/A;-><init>(Landroid/graphics/Movie;Landroid/widget/ImageView;)V

    .line 30
    invoke-virtual {p1, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void

    :catch_0
    move-exception v1

    goto :goto_0

    .line 31
    :cond_0
    iget-object v3, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/B;->a:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 32
    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    invoke-virtual {v3, v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/common/r;->a(ILjava/lang/String;)V

    .line 34
    invoke-virtual {p0, p2}, Lio/trtc/tuikit/atomicxcore/impl/view/call/B;->a(Ljava/io/File;)Landroid/graphics/Bitmap;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 35
    invoke-virtual {p1, v1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    return-void

    :catchall_0
    move-exception v1

    .line 36
    :try_start_3
    throw v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catchall_1
    move-exception v4

    :try_start_4
    invoke-static {v3, v1}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v4
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    .line 37
    :goto_0
    iget-object v3, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/B;->a:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Error loading GIF from: "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, " e="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 38
    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 39
    invoke-virtual {v3, v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/common/r;->a(ILjava/lang/String;)V

    .line 40
    invoke-virtual {p0, p2}, Lio/trtc/tuikit/atomicxcore/impl/view/call/B;->a(Ljava/io/File;)Landroid/graphics/Bitmap;

    move-result-object p2

    if-eqz p2, :cond_1

    .line 41
    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    :cond_1
    return-void
.end method

.method public final a(Landroid/widget/ImageView;Ljava/lang/String;)V
    .locals 8

    const-string v0, "image file not found: "

    const-string v1, "Failed to decode bitmap from: "

    const-string v2, "image path must be absolute path: "

    const-string v3, "imagePath"

    invoke-static {p2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "message"

    const/4 v4, 0x2

    if-nez p1, :cond_0

    .line 1
    iget-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/B;->a:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 2
    const-string p2, "ImageView is null"

    invoke-static {p2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-virtual {p1, v4, p2}, Lio/trtc/tuikit/atomicxcore/impl/common/r;->a(ILjava/lang/String;)V

    return-void

    .line 4
    :cond_0
    :try_start_0
    const-string v5, "/"

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static {p2, v5, v6, v4, v7}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_1

    .line 5
    iget-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/B;->a:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 6
    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    invoke-virtual {p1, v4, v0}, Lio/trtc/tuikit/atomicxcore/impl/common/r;->a(ILjava/lang/String;)V

    return-void

    :catch_0
    move-exception p1

    goto :goto_2

    .line 8
    :cond_1
    new-instance v2, Ljava/io/File;

    invoke-direct {v2, p2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 9
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v5

    if-eqz v5, :cond_6

    invoke-virtual {v2}, Ljava/io/File;->isFile()Z

    move-result v5

    if-nez v5, :cond_2

    goto :goto_1

    .line 10
    :cond_2
    const-string v0, ".gif"

    const/4 v5, 0x1

    invoke-static {p2, v0, v5}, Lkotlin/text/StringsKt;->endsWith(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_5

    .line 11
    const-string v0, ".GIF"

    invoke-static {p2, v0, v5}, Lkotlin/text/StringsKt;->endsWith(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_3

    goto :goto_0

    .line 12
    :cond_3
    invoke-virtual {p0, v2}, Lio/trtc/tuikit/atomicxcore/impl/view/call/B;->a(Ljava/io/File;)Landroid/graphics/Bitmap;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 13
    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    return-void

    .line 14
    :cond_4
    iget-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/B;->a:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 15
    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    invoke-virtual {p1, v4, v0}, Lio/trtc/tuikit/atomicxcore/impl/common/r;->a(ILjava/lang/String;)V

    return-void

    .line 17
    :cond_5
    :goto_0
    invoke-virtual {p0, p1, v2}, Lio/trtc/tuikit/atomicxcore/impl/view/call/B;->a(Landroid/widget/ImageView;Ljava/io/File;)V

    return-void

    .line 18
    :cond_6
    :goto_1
    iget-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/B;->a:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 19
    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    invoke-virtual {p1, v4, v0}, Lio/trtc/tuikit/atomicxcore/impl/common/r;->a(ILjava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    .line 21
    :goto_2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/B;->a:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Error loading image from: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, " e="

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 22
    invoke-static {p1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    invoke-virtual {v0, v4, p1}, Lio/trtc/tuikit/atomicxcore/impl/common/r;->a(ILjava/lang/String;)V

    return-void
.end method

.method public final a(Landroid/widget/ImageView;Ljava/lang/String;I)V
    .locals 8

    const-string v0, "message"

    const-string v1, "/"

    const-string v2, "Avatar path must be absolute path: "

    const-string v3, "imageView"

    invoke-static {p1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "avatarPath"

    invoke-static {p2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v3, -0x7fddd9d2

    const/4 v4, 0x2

    const/4 v5, 0x0

    const/4 v6, 0x0

    .line 42
    :try_start_0
    invoke-static {p2, v1, v5, v4, v6}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_0

    .line 43
    iget-object p3, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/B;->a:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 44
    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 45
    invoke-virtual {p3, v4, v1}, Lio/trtc/tuikit/atomicxcore/impl/common/r;->a(ILjava/lang/String;)V

    .line 46
    invoke-virtual {p1, v3}, Landroid/widget/ImageView;->setColorFilter(I)V

    return-void

    :catch_0
    move-exception p3

    goto :goto_1

    .line 47
    :cond_0
    invoke-static {p2, v1, v5, v4, v6}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    goto :goto_0

    .line 48
    :cond_1
    new-instance v1, Ljava/io/File;

    invoke-direct {v1, p2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 49
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {v1}, Ljava/io/File;->isFile()Z

    move-result v2

    if-eqz v2, :cond_2

    .line 50
    invoke-virtual {p0, v1}, Lio/trtc/tuikit/atomicxcore/impl/view/call/B;->a(Ljava/io/File;)Landroid/graphics/Bitmap;

    move-result-object v6

    :cond_2
    :goto_0
    if-eqz v6, :cond_3

    .line 51
    invoke-static {v6, p3}, Lio/trtc/tuikit/atomicxcore/impl/view/call/B;->a(Landroid/graphics/Bitmap;I)Landroid/graphics/Bitmap;

    move-result-object p3

    .line 52
    invoke-virtual {p1, p3}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 53
    sget-object p3, Landroid/graphics/PorterDuff$Mode;->OVERLAY:Landroid/graphics/PorterDuff$Mode;

    .line 54
    invoke-virtual {p1, v3, p3}, Landroid/widget/ImageView;->setColorFilter(ILandroid/graphics/PorterDuff$Mode;)V

    return-void

    .line 55
    :cond_3
    invoke-virtual {p1, v3}, Landroid/widget/ImageView;->setColorFilter(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    .line 56
    :goto_1
    iget-object v1, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/B;->a:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v5, "Error loading background avatar from: "

    invoke-direct {v2, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, " e="

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    .line 57
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 58
    invoke-virtual {v1, v4, p2}, Lio/trtc/tuikit/atomicxcore/impl/common/r;->a(ILjava/lang/String;)V

    .line 59
    invoke-virtual {p1, v3}, Landroid/widget/ImageView;->setColorFilter(I)V

    return-void
.end method
