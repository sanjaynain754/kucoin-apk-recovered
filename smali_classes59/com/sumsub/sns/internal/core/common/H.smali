.class public abstract Lcom/sumsub/sns/internal/core/common/H;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# direct methods
.method public static final a(Landroid/graphics/Bitmap;ILandroid/util/Size;)Landroid/graphics/Bitmap;
    .locals 8

    .line 13
    new-instance v6, Landroid/graphics/Matrix;

    invoke-direct {v6}, Landroid/graphics/Matrix;-><init>()V

    const/high16 v0, 0x43340000    # 180.0f

    const/high16 v1, 0x42b40000    # 90.0f

    const/high16 v2, -0x3d4c0000    # -90.0f

    const/high16 v3, 0x3f800000    # 1.0f

    const/high16 v4, -0x40800000    # -1.0f

    packed-switch p1, :pswitch_data_0

    goto :goto_0

    .line 14
    :pswitch_0
    invoke-virtual {v6, v2}, Landroid/graphics/Matrix;->setRotate(F)V

    goto :goto_0

    .line 15
    :pswitch_1
    invoke-virtual {v6, v2}, Landroid/graphics/Matrix;->setRotate(F)V

    .line 16
    invoke-virtual {v6, v4, v3}, Landroid/graphics/Matrix;->postScale(FF)Z

    goto :goto_0

    .line 17
    :pswitch_2
    invoke-virtual {v6, v1}, Landroid/graphics/Matrix;->setRotate(F)V

    goto :goto_0

    .line 18
    :pswitch_3
    invoke-virtual {v6, v1}, Landroid/graphics/Matrix;->setRotate(F)V

    .line 19
    invoke-virtual {v6, v4, v3}, Landroid/graphics/Matrix;->postScale(FF)Z

    goto :goto_0

    .line 20
    :pswitch_4
    invoke-virtual {v6, v0}, Landroid/graphics/Matrix;->setRotate(F)V

    .line 21
    invoke-virtual {v6, v4, v3}, Landroid/graphics/Matrix;->postScale(FF)Z

    goto :goto_0

    .line 22
    :pswitch_5
    invoke-virtual {v6, v0}, Landroid/graphics/Matrix;->setRotate(F)V

    goto :goto_0

    .line 23
    :pswitch_6
    invoke-virtual {v6, v4, v3}, Landroid/graphics/Matrix;->setScale(FF)V

    :goto_0
    if-eqz p2, :cond_0

    .line 24
    :try_start_0
    invoke-virtual {p2}, Landroid/util/Size;->getWidth()I

    move-result p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :goto_1
    move v4, p1

    goto :goto_2

    :catch_0
    move-exception v0

    move-object p1, v0

    move-object v1, p0

    goto :goto_6

    :cond_0
    :try_start_1
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result p1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2

    goto :goto_1

    :goto_2
    if-eqz p2, :cond_1

    .line 25
    :try_start_2
    invoke-virtual {p2}, Landroid/util/Size;->getHeight()I

    move-result p1
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    :goto_3
    move v5, p1

    goto :goto_4

    :cond_1
    :try_start_3
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result p1
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2

    goto :goto_3

    :goto_4
    const/4 v3, 0x0

    const/4 v7, 0x1

    const/4 v2, 0x0

    move-object v1, p0

    .line 26
    :try_start_4
    invoke-static/range {v1 .. v7}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;

    move-result-object p0
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1

    return-object p0

    :catch_1
    move-exception v0

    :goto_5
    move-object p1, v0

    goto :goto_6

    :catch_2
    move-exception v0

    move-object v1, p0

    goto :goto_5

    .line 27
    :goto_6
    sget-object p0, Lcom/sumsub/sns/internal/log/c;->c:Lcom/sumsub/sns/internal/log/logger/k;

    const-string p2, "ImageExtensions"

    const-string v0, "Rotate bitmap"

    invoke-virtual {p0, p2, v0, p1}, Lcom/sumsub/sns/internal/log/logger/k;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object v1

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static final a(Landroidx/camera/core/ImageProxy;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;
    .locals 2

    .line 1
    const-string v0, "ImageExtensions"

    new-instance v1, Lcom/sumsub/sns/internal/core/common/f1;

    invoke-direct {v1, p0, p1}, Lcom/sumsub/sns/internal/core/common/f1;-><init>(Landroidx/camera/core/ImageProxy;Lkotlin/jvm/functions/Function2;)V

    const/4 p0, 0x0

    .line 2
    :try_start_0
    sget-object p1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-interface {v1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p0

    :catchall_0
    move-exception p1

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_1

    .line 3
    :goto_0
    sget-object v1, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    .line 4
    const-string v1, "Caught unexpected exception while converting ImageProxy to Bitmap"

    invoke-static {v0, v1, p0}, Lcom/sumsub/sns/internal/log/d;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 5
    sget-object p0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    goto :goto_2

    .line 6
    :goto_1
    sget-object v1, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    .line 7
    const-string v1, "Caught OutOfMemoryError while converting ImageProxy to Bitmap"

    invoke-static {v0, v1, p0}, Lcom/sumsub/sns/internal/log/d;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 8
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Runtime;->gc()V

    const-wide/16 v0, 0x64

    .line 9
    :try_start_1
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_1

    .line 10
    invoke-static {}, Ljava/lang/System;->runFinalization()V

    .line 11
    sget-object p0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    :goto_2
    return-object p0

    .line 12
    :catch_1
    new-instance p0, Ljava/lang/AssertionError;

    invoke-direct {p0}, Ljava/lang/AssertionError;-><init>()V

    throw p0
.end method

.method public static final a(Landroid/graphics/Matrix;IIII)V
    .locals 2

    .line 28
    invoke-virtual {p0}, Landroid/graphics/Matrix;->reset()V

    const/4 v0, 0x0

    .line 29
    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v1

    add-int/lit8 v1, v1, 0x5a

    rem-int/lit16 v1, v1, 0xb4

    if-nez v1, :cond_0

    const/4 v0, 0x1

    :cond_0
    if-eqz v0, :cond_1

    move v1, p2

    goto :goto_0

    :cond_1
    move v1, p1

    :goto_0
    if-eqz v0, :cond_2

    goto :goto_1

    :cond_2
    move p1, p2

    :goto_1
    if-ne v1, p3, :cond_3

    if-eq p1, p4, :cond_4

    :cond_3
    int-to-float p2, p3

    int-to-float p3, v1

    div-float v0, p2, p3

    int-to-float p4, p4

    int-to-float p1, p1

    div-float/2addr p4, p1

    .line 30
    invoke-static {v0, p4}, Ljava/lang/Math;->max(FF)F

    move-result p1

    .line 31
    invoke-virtual {p0, p1, p1}, Landroid/graphics/Matrix;->postScale(FF)Z

    mul-float/2addr p3, p1

    cmpl-float p1, p3, p2

    if-lez p1, :cond_4

    sub-float/2addr p3, p2

    const/high16 p1, 0x40000000    # 2.0f

    div-float/2addr p3, p1

    const/high16 p1, -0x40800000    # -1.0f

    mul-float/2addr p3, p1

    const/4 p1, 0x0

    .line 32
    invoke-virtual {p0, p3, p1}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    :cond_4
    return-void
.end method

.method public static final b(Landroid/graphics/Bitmap;ILandroid/util/Size;)Landroid/graphics/Bitmap;
    .locals 8

    const/16 v0, 0x5a

    if-eq p1, v0, :cond_3

    const/16 v0, 0xb4

    if-eq p1, v0, :cond_2

    const/16 v0, 0x10e

    if-eq p1, v0, :cond_1

    if-eqz p2, :cond_0

    .line 14
    invoke-virtual {p2}, Landroid/util/Size;->getWidth()I

    move-result v4

    invoke-virtual {p2}, Landroid/util/Size;->getHeight()I

    move-result v5

    const/4 v6, 0x0

    const/4 v7, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v1, p0

    invoke-static/range {v1 .. v7}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;

    move-result-object p0

    goto :goto_0

    :cond_0
    move-object v1, p0

    .line 15
    sget-object p0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->isMutable()Z

    move-result p1

    invoke-virtual {v1, p0, p1}, Landroid/graphics/Bitmap;->copy(Landroid/graphics/Bitmap$Config;Z)Landroid/graphics/Bitmap;

    move-result-object p0

    goto :goto_0

    :cond_1
    move-object v1, p0

    const/16 p0, 0x8

    .line 16
    invoke-static {v1, p0, p2}, Lcom/sumsub/sns/internal/core/common/H;->a(Landroid/graphics/Bitmap;ILandroid/util/Size;)Landroid/graphics/Bitmap;

    move-result-object p0

    goto :goto_0

    :cond_2
    move-object v1, p0

    const/4 p0, 0x3

    .line 17
    invoke-static {v1, p0, p2}, Lcom/sumsub/sns/internal/core/common/H;->a(Landroid/graphics/Bitmap;ILandroid/util/Size;)Landroid/graphics/Bitmap;

    move-result-object p0

    goto :goto_0

    :cond_3
    move-object v1, p0

    const/4 p0, 0x6

    .line 18
    invoke-static {v1, p0, p2}, Lcom/sumsub/sns/internal/core/common/H;->a(Landroid/graphics/Bitmap;ILandroid/util/Size;)Landroid/graphics/Bitmap;

    move-result-object p0

    :goto_0
    if-ne p0, v1, :cond_4

    .line 19
    sget-object p1, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    sget-object p1, Lcom/sumsub/sns/internal/log/LoggerType;->KIBANA:Lcom/sumsub/sns/internal/log/LoggerType;

    filled-new-array {p1}, [Lcom/sumsub/sns/internal/log/LoggerType;

    move-result-object p1

    .line 20
    invoke-static {p1}, Lkotlin/collections/ArraysKt;->toList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, Lcom/sumsub/sns/internal/log/c;->b(Ljava/util/List;)Lcom/sumsub/sns/internal/log/logger/b;

    move-result-object p1

    .line 21
    new-instance p2, Ljava/lang/Exception;

    const-string v0, "creating an image copy. Rotated image is same as original"

    invoke-direct {p2, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    const-string v2, "ImageExtensions"

    invoke-virtual {p1, v2, v0, p2}, Lcom/sumsub/sns/internal/log/logger/b;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 22
    sget-object p1, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->isMutable()Z

    move-result p2

    invoke-virtual {p0, p1, p2}, Landroid/graphics/Bitmap;->copy(Landroid/graphics/Bitmap$Config;Z)Landroid/graphics/Bitmap;

    move-result-object p0

    :cond_4
    return-object p0
.end method

.method public static final b(Landroidx/camera/core/ImageProxy;Lkotlin/jvm/functions/Function2;)Landroid/graphics/Bitmap;
    .locals 5

    .line 1
    invoke-interface {p0}, Landroidx/camera/core/ImageProxy;->getPlanes()[Landroidx/camera/core/ImageProxy$PlaneProxy;

    move-result-object v0

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-interface {v0}, Landroidx/camera/core/ImageProxy$PlaneProxy;->getRowStride()I

    move-result v0

    div-int/lit8 v0, v0, 0x4

    const/4 v2, 0x0

    .line 2
    :try_start_0
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {p0}, Landroidx/camera/core/ImageProxy;->getHeight()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {p1, v3, v4}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/graphics/Bitmap;

    .line 3
    invoke-interface {p0}, Landroidx/camera/core/ImageProxy;->getPlanes()[Landroidx/camera/core/ImageProxy$PlaneProxy;

    move-result-object v3

    aget-object v1, v3, v1

    invoke-interface {v1}, Landroidx/camera/core/ImageProxy$PlaneProxy;->getBuffer()Ljava/nio/ByteBuffer;

    move-result-object v1

    .line 4
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    .line 5
    invoke-virtual {p1, v1}, Landroid/graphics/Bitmap;->copyPixelsFromBuffer(Ljava/nio/Buffer;)V

    .line 6
    invoke-interface {p0}, Landroidx/camera/core/ImageProxy;->getWidth()I

    move-result v1

    if-le v0, v1, :cond_0

    .line 7
    sget-object v1, Lcom/sumsub/sns/internal/ff/a;->M:Lcom/sumsub/sns/internal/ff/core/a;

    .line 8
    invoke-virtual {v1}, Lcom/sumsub/sns/internal/ff/core/a;->a()Z

    move-result v1

    if-nez v1, :cond_0

    .line 9
    new-instance v1, Landroid/util/Size;

    invoke-interface {p0}, Landroidx/camera/core/ImageProxy;->getWidth()I

    move-result v3

    invoke-interface {p0}, Landroidx/camera/core/ImageProxy;->getHeight()I

    move-result v4

    invoke-direct {v1, v3, v4}, Landroid/util/Size;-><init>(II)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    move-object v1, v2

    .line 10
    :goto_0
    invoke-interface {p0}, Landroidx/camera/core/ImageProxy;->getImageInfo()Landroidx/camera/core/ImageInfo;

    move-result-object v3

    invoke-interface {v3}, Landroidx/camera/core/ImageInfo;->getRotationDegrees()I

    move-result v3

    invoke-static {p1, v3, v1}, Lcom/sumsub/sns/internal/core/common/H;->b(Landroid/graphics/Bitmap;ILandroid/util/Size;)Landroid/graphics/Bitmap;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p0

    .line 11
    :goto_1
    sget-object v1, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    invoke-interface {p0}, Landroidx/camera/core/ImageProxy;->getWidth()I

    move-result p0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Failed to copyPixelsFromBuffer. Reported width: "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, ", real width: "

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    .line 12
    const-string v0, "ImageExtensions"

    invoke-static {v0, p0, v2}, Lcom/sumsub/sns/internal/log/d;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 13
    throw p1
.end method
