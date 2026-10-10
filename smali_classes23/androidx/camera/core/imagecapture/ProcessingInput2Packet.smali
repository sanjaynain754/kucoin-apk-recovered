.class final Landroidx/camera/core/imagecapture/ProcessingInput2Packet;
.super Ljava/lang/Object;
.source "ProcessingInput2Packet.java"

# interfaces
.implements Landroidx/camera/core/processing/Operation;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroidx/camera/core/processing/Operation<",
        "Landroidx/camera/core/imagecapture/ProcessingNode$InputPacket;",
        "Landroidx/camera/core/processing/Packet<",
        "Landroidx/camera/core/ImageProxy;",
        ">;>;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
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

.method private static createPacket(Landroidx/camera/core/imagecapture/ProcessingRequest;Landroidx/camera/core/impl/utils/Exif;Landroidx/camera/core/ImageProxy;)Landroidx/camera/core/processing/Packet;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/camera/core/imagecapture/ProcessingRequest;",
            "Landroidx/camera/core/impl/utils/Exif;",
            "Landroidx/camera/core/ImageProxy;",
            ")",
            "Landroidx/camera/core/processing/Packet<",
            "Landroidx/camera/core/ImageProxy;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/camera/core/imagecapture/ProcessingRequest;->getCropRect()Landroid/graphics/Rect;

    .line 4
    move-result-object v2

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Landroidx/camera/core/imagecapture/ProcessingRequest;->getRotationDegrees()I

    .line 8
    move-result v3

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Landroidx/camera/core/imagecapture/ProcessingRequest;->getSensorToBufferTransform()Landroid/graphics/Matrix;

    .line 12
    move-result-object v4

    .line 13
    .line 14
    .line 15
    invoke-static {p2}, Landroidx/camera/core/imagecapture/ProcessingInput2Packet;->getCameraCaptureResult(Landroidx/camera/core/ImageProxy;)Landroidx/camera/core/impl/CameraCaptureResult;

    .line 16
    move-result-object v5

    .line 17
    move-object v1, p1

    .line 18
    move-object v0, p2

    .line 19
    .line 20
    .line 21
    invoke-static/range {v0 .. v5}, Landroidx/camera/core/processing/Packet;->of(Landroidx/camera/core/ImageProxy;Landroidx/camera/core/impl/utils/Exif;Landroid/graphics/Rect;ILandroid/graphics/Matrix;Landroidx/camera/core/impl/CameraCaptureResult;)Landroidx/camera/core/processing/Packet;

    .line 22
    move-result-object p0

    .line 23
    return-object p0
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
.end method

.method private static createPacketWithHalRotation(Landroidx/camera/core/imagecapture/ProcessingRequest;Landroidx/camera/core/impl/utils/Exif;Landroidx/camera/core/ImageProxy;)Landroidx/camera/core/processing/Packet;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/camera/core/imagecapture/ProcessingRequest;",
            "Landroidx/camera/core/impl/utils/Exif;",
            "Landroidx/camera/core/ImageProxy;",
            ")",
            "Landroidx/camera/core/processing/Packet<",
            "Landroidx/camera/core/ImageProxy;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    new-instance v0, Landroid/util/Size;

    .line 3
    .line 4
    .line 5
    invoke-interface {p2}, Landroidx/camera/core/ImageProxy;->getWidth()I

    .line 6
    move-result v1

    .line 7
    .line 8
    .line 9
    invoke-interface {p2}, Landroidx/camera/core/ImageProxy;->getHeight()I

    .line 10
    move-result v2

    .line 11
    .line 12
    .line 13
    invoke-direct {v0, v1, v2}, Landroid/util/Size;-><init>(II)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Landroidx/camera/core/imagecapture/ProcessingRequest;->getRotationDegrees()I

    .line 17
    move-result v1

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1}, Landroidx/camera/core/impl/utils/Exif;->getRotation()I

    .line 21
    move-result v2

    .line 22
    sub-int/2addr v1, v2

    .line 23
    .line 24
    .line 25
    invoke-static {v1, v0}, Landroidx/camera/core/imagecapture/ProcessingInput2Packet;->getRotatedSize(ILandroid/util/Size;)Landroid/util/Size;

    .line 26
    move-result-object v4

    .line 27
    .line 28
    new-instance v2, Landroid/graphics/RectF;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0}, Landroid/util/Size;->getWidth()I

    .line 32
    move-result v3

    .line 33
    int-to-float v3, v3

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0}, Landroid/util/Size;->getHeight()I

    .line 37
    move-result v0

    .line 38
    int-to-float v0, v0

    .line 39
    const/4 v5, 0x0

    .line 40
    .line 41
    .line 42
    invoke-direct {v2, v5, v5, v3, v0}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 43
    .line 44
    new-instance v0, Landroid/graphics/RectF;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v4}, Landroid/util/Size;->getWidth()I

    .line 48
    move-result v3

    .line 49
    int-to-float v3, v3

    .line 50
    .line 51
    .line 52
    invoke-virtual {v4}, Landroid/util/Size;->getHeight()I

    .line 53
    move-result v6

    .line 54
    int-to-float v6, v6

    .line 55
    .line 56
    .line 57
    invoke-direct {v0, v5, v5, v3, v6}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 58
    .line 59
    .line 60
    invoke-static {v2, v0, v1}, Landroidx/camera/core/impl/utils/TransformUtils;->getRectToRect(Landroid/graphics/RectF;Landroid/graphics/RectF;I)Landroid/graphics/Matrix;

    .line 61
    move-result-object v0

    .line 62
    .line 63
    .line 64
    invoke-virtual {p0}, Landroidx/camera/core/imagecapture/ProcessingRequest;->getCropRect()Landroid/graphics/Rect;

    .line 65
    move-result-object v1

    .line 66
    .line 67
    .line 68
    invoke-static {v1, v0}, Landroidx/camera/core/imagecapture/ProcessingInput2Packet;->getUpdatedCropRect(Landroid/graphics/Rect;Landroid/graphics/Matrix;)Landroid/graphics/Rect;

    .line 69
    move-result-object v5

    .line 70
    .line 71
    .line 72
    invoke-virtual {p1}, Landroidx/camera/core/impl/utils/Exif;->getRotation()I

    .line 73
    move-result v6

    .line 74
    .line 75
    .line 76
    invoke-virtual {p0}, Landroidx/camera/core/imagecapture/ProcessingRequest;->getSensorToBufferTransform()Landroid/graphics/Matrix;

    .line 77
    move-result-object p0

    .line 78
    .line 79
    .line 80
    invoke-static {p0, v0}, Landroidx/camera/core/imagecapture/ProcessingInput2Packet;->getUpdatedTransform(Landroid/graphics/Matrix;Landroid/graphics/Matrix;)Landroid/graphics/Matrix;

    .line 81
    move-result-object v7

    .line 82
    .line 83
    .line 84
    invoke-static {p2}, Landroidx/camera/core/imagecapture/ProcessingInput2Packet;->getCameraCaptureResult(Landroidx/camera/core/ImageProxy;)Landroidx/camera/core/impl/CameraCaptureResult;

    .line 85
    move-result-object v8

    .line 86
    move-object v3, p1

    .line 87
    move-object v2, p2

    .line 88
    .line 89
    .line 90
    invoke-static/range {v2 .. v8}, Landroidx/camera/core/processing/Packet;->of(Landroidx/camera/core/ImageProxy;Landroidx/camera/core/impl/utils/Exif;Landroid/util/Size;Landroid/graphics/Rect;ILandroid/graphics/Matrix;Landroidx/camera/core/impl/CameraCaptureResult;)Landroidx/camera/core/processing/Packet;

    .line 91
    move-result-object p0

    .line 92
    return-object p0
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

.method private static getCameraCaptureResult(Landroidx/camera/core/ImageProxy;)Landroidx/camera/core/impl/CameraCaptureResult;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-interface {p0}, Landroidx/camera/core/ImageProxy;->getImageInfo()Landroidx/camera/core/ImageInfo;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    instance-of v0, v0, Landroidx/camera/core/internal/CameraCaptureResultImageInfo;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    .line 11
    invoke-interface {p0}, Landroidx/camera/core/ImageProxy;->getImageInfo()Landroidx/camera/core/ImageInfo;

    .line 12
    move-result-object p0

    .line 13
    .line 14
    check-cast p0, Landroidx/camera/core/internal/CameraCaptureResultImageInfo;

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Landroidx/camera/core/internal/CameraCaptureResultImageInfo;->getCameraCaptureResult()Landroidx/camera/core/impl/CameraCaptureResult;

    .line 18
    move-result-object p0

    .line 19
    return-object p0

    .line 20
    .line 21
    .line 22
    :cond_0
    invoke-static {}, Landroidx/camera/core/impl/CameraCaptureResult$EmptyCameraCaptureResult;->create()Landroidx/camera/core/impl/CameraCaptureResult;

    .line 23
    move-result-object p0

    .line 24
    return-object p0
.end method

.method private static getRotatedSize(ILandroid/util/Size;)Landroid/util/Size;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Landroidx/camera/core/impl/utils/TransformUtils;->within360(I)I

    .line 4
    move-result p0

    .line 5
    .line 6
    .line 7
    invoke-static {p0}, Landroidx/camera/core/impl/utils/TransformUtils;->is90or270(I)Z

    .line 8
    move-result p0

    .line 9
    .line 10
    if-eqz p0, :cond_0

    .line 11
    .line 12
    new-instance p0, Landroid/util/Size;

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1}, Landroid/util/Size;->getHeight()I

    .line 16
    move-result v0

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1}, Landroid/util/Size;->getWidth()I

    .line 20
    move-result p1

    .line 21
    .line 22
    .line 23
    invoke-direct {p0, v0, p1}, Landroid/util/Size;-><init>(II)V

    .line 24
    return-object p0

    .line 25
    :cond_0
    return-object p1
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

.method private static getUpdatedCropRect(Landroid/graphics/Rect;Landroid/graphics/Matrix;)Landroid/graphics/Rect;
    .locals 1

    .line 1
    .line 2
    new-instance v0, Landroid/graphics/RectF;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p0}, Landroid/graphics/RectF;-><init>(Landroid/graphics/Rect;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1, v0}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Landroid/graphics/RectF;->sort()V

    .line 12
    .line 13
    new-instance p0, Landroid/graphics/Rect;

    .line 14
    .line 15
    .line 16
    invoke-direct {p0}, Landroid/graphics/Rect;-><init>()V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, p0}, Landroid/graphics/RectF;->round(Landroid/graphics/Rect;)V

    .line 20
    return-object p0
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

.method private static getUpdatedTransform(Landroid/graphics/Matrix;Landroid/graphics/Matrix;)Landroid/graphics/Matrix;
    .locals 1

    .line 1
    .line 2
    new-instance v0, Landroid/graphics/Matrix;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p0}, Landroid/graphics/Matrix;-><init>(Landroid/graphics/Matrix;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, p1}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 9
    return-object v0
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
.method public apply(Landroidx/camera/core/imagecapture/ProcessingNode$InputPacket;)Landroidx/camera/core/processing/Packet;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/camera/core/imagecapture/ProcessingNode$InputPacket;",
            ")",
            "Landroidx/camera/core/processing/Packet<",
            "Landroidx/camera/core/ImageProxy;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/camera/core/ImageCaptureException;
        }
    .end annotation

    .line 2
    invoke-virtual {p1}, Landroidx/camera/core/imagecapture/ProcessingNode$InputPacket;->getImageProxy()Landroidx/camera/core/ImageProxy;

    move-result-object v0

    .line 3
    invoke-virtual {p1}, Landroidx/camera/core/imagecapture/ProcessingNode$InputPacket;->getProcessingRequest()Landroidx/camera/core/imagecapture/ProcessingRequest;

    move-result-object p1

    .line 4
    invoke-interface {v0}, Landroidx/camera/core/ImageProxy;->getFormat()I

    move-result v1

    invoke-static {v1}, Landroidx/camera/core/internal/utils/ImageUtil;->isJpegFormats(I)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 5
    :try_start_0
    invoke-static {v0}, Landroidx/camera/core/impl/utils/Exif;->createFromImageProxy(Landroidx/camera/core/ImageProxy;)Landroidx/camera/core/impl/utils/Exif;

    move-result-object v1

    .line 6
    invoke-interface {v0}, Landroidx/camera/core/ImageProxy;->getPlanes()[Landroidx/camera/core/ImageProxy$PlaneProxy;

    move-result-object v2

    const/4 v3, 0x0

    aget-object v2, v2, v3

    invoke-interface {v2}, Landroidx/camera/core/ImageProxy$PlaneProxy;->getBuffer()Ljava/nio/ByteBuffer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 7
    new-instance v0, Landroidx/camera/core/ImageCaptureException;

    const/4 v1, 0x1

    const-string v2, "Failed to extract EXIF data."

    invoke-direct {v0, v1, v2, p1}, Landroidx/camera/core/ImageCaptureException;-><init>(ILjava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :cond_0
    const/4 v1, 0x0

    .line 8
    :goto_0
    sget-object v2, Landroidx/camera/core/imagecapture/ImagePipeline;->EXIF_ROTATION_AVAILABILITY:Landroidx/camera/core/internal/compat/workaround/ExifRotationAvailability;

    invoke-virtual {v2, v0}, Landroidx/camera/core/internal/compat/workaround/ExifRotationAvailability;->shouldUseExifOrientation(Landroidx/camera/core/ImageProxy;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 9
    const-string v2, "JPEG image must have exif."

    invoke-static {v1, v2}, Landroidx/core/util/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    invoke-static {p1, v1, v0}, Landroidx/camera/core/imagecapture/ProcessingInput2Packet;->createPacketWithHalRotation(Landroidx/camera/core/imagecapture/ProcessingRequest;Landroidx/camera/core/impl/utils/Exif;Landroidx/camera/core/ImageProxy;)Landroidx/camera/core/processing/Packet;

    move-result-object p1

    return-object p1

    .line 11
    :cond_1
    invoke-static {p1, v1, v0}, Landroidx/camera/core/imagecapture/ProcessingInput2Packet;->createPacket(Landroidx/camera/core/imagecapture/ProcessingRequest;Landroidx/camera/core/impl/utils/Exif;Landroidx/camera/core/ImageProxy;)Landroidx/camera/core/processing/Packet;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/camera/core/ImageCaptureException;
        }
    .end annotation

    .line 1
    check-cast p1, Landroidx/camera/core/imagecapture/ProcessingNode$InputPacket;

    invoke-virtual {p0, p1}, Landroidx/camera/core/imagecapture/ProcessingInput2Packet;->apply(Landroidx/camera/core/imagecapture/ProcessingNode$InputPacket;)Landroidx/camera/core/processing/Packet;

    move-result-object p1

    return-object p1
.end method
