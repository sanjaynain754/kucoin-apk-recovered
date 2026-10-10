.class public Landroidx/camera/core/imagecapture/NoMetadataImageReader;
.super Ljava/lang/Object;
.source "NoMetadataImageReader.java"

# interfaces
.implements Landroidx/camera/core/impl/ImageReaderProxy;


# instance fields
.field private mPendingRequest:Landroidx/camera/core/imagecapture/ProcessingRequest;

.field private final mWrappedImageReader:Landroidx/camera/core/impl/ImageReaderProxy;


# direct methods
.method public constructor <init>(Landroidx/camera/core/impl/ImageReaderProxy;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Landroidx/camera/core/imagecapture/NoMetadataImageReader;->mWrappedImageReader:Landroidx/camera/core/impl/ImageReaderProxy;

    .line 6
    return-void
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

.method public static synthetic a(Landroidx/camera/core/imagecapture/NoMetadataImageReader;Landroidx/camera/core/impl/ImageReaderProxy$OnImageAvailableListener;Landroidx/camera/core/impl/ImageReaderProxy;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-interface {p1, p0}, Landroidx/camera/core/impl/ImageReaderProxy$OnImageAvailableListener;->onImageAvailable(Landroidx/camera/core/impl/ImageReaderProxy;)V

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

.method private createImageProxyWithEmptyMetadata(Landroidx/camera/core/ImageProxy;)Landroidx/camera/core/ImageProxy;
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    return-object v0

    .line 5
    .line 6
    :cond_0
    iget-object v1, p0, Landroidx/camera/core/imagecapture/NoMetadataImageReader;->mPendingRequest:Landroidx/camera/core/imagecapture/ProcessingRequest;

    .line 7
    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    .line 11
    invoke-static {}, Landroidx/camera/core/impl/TagBundle;->emptyBundle()Landroidx/camera/core/impl/TagBundle;

    .line 12
    move-result-object v1

    .line 13
    goto :goto_0

    .line 14
    .line 15
    :cond_1
    new-instance v1, Landroid/util/Pair;

    .line 16
    .line 17
    iget-object v2, p0, Landroidx/camera/core/imagecapture/NoMetadataImageReader;->mPendingRequest:Landroidx/camera/core/imagecapture/ProcessingRequest;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v2}, Landroidx/camera/core/imagecapture/ProcessingRequest;->getTagBundleKey()Ljava/lang/String;

    .line 21
    move-result-object v2

    .line 22
    .line 23
    iget-object v3, p0, Landroidx/camera/core/imagecapture/NoMetadataImageReader;->mPendingRequest:Landroidx/camera/core/imagecapture/ProcessingRequest;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v3}, Landroidx/camera/core/imagecapture/ProcessingRequest;->getStageIds()Ljava/util/List;

    .line 27
    move-result-object v3

    .line 28
    const/4 v4, 0x0

    .line 29
    .line 30
    .line 31
    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 32
    move-result-object v3

    .line 33
    .line 34
    .line 35
    invoke-direct {v1, v2, v3}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    invoke-static {v1}, Landroidx/camera/core/impl/TagBundle;->create(Landroid/util/Pair;)Landroidx/camera/core/impl/TagBundle;

    .line 39
    move-result-object v1

    .line 40
    .line 41
    :goto_0
    iput-object v0, p0, Landroidx/camera/core/imagecapture/NoMetadataImageReader;->mPendingRequest:Landroidx/camera/core/imagecapture/ProcessingRequest;

    .line 42
    .line 43
    new-instance v0, Landroidx/camera/core/SettableImageProxy;

    .line 44
    .line 45
    new-instance v2, Landroid/util/Size;

    .line 46
    .line 47
    .line 48
    invoke-interface {p1}, Landroidx/camera/core/ImageProxy;->getWidth()I

    .line 49
    move-result v3

    .line 50
    .line 51
    .line 52
    invoke-interface {p1}, Landroidx/camera/core/ImageProxy;->getHeight()I

    .line 53
    move-result v4

    .line 54
    .line 55
    .line 56
    invoke-direct {v2, v3, v4}, Landroid/util/Size;-><init>(II)V

    .line 57
    .line 58
    new-instance v3, Landroidx/camera/core/internal/CameraCaptureResultImageInfo;

    .line 59
    .line 60
    new-instance v4, Landroidx/camera/core/streamsharing/VirtualCameraCaptureResult;

    .line 61
    .line 62
    .line 63
    invoke-interface {p1}, Landroidx/camera/core/ImageProxy;->getImageInfo()Landroidx/camera/core/ImageInfo;

    .line 64
    move-result-object v5

    .line 65
    .line 66
    .line 67
    invoke-interface {v5}, Landroidx/camera/core/ImageInfo;->getTimestamp()J

    .line 68
    move-result-wide v5

    .line 69
    .line 70
    .line 71
    invoke-direct {v4, v1, v5, v6}, Landroidx/camera/core/streamsharing/VirtualCameraCaptureResult;-><init>(Landroidx/camera/core/impl/TagBundle;J)V

    .line 72
    .line 73
    .line 74
    invoke-direct {v3, v4}, Landroidx/camera/core/internal/CameraCaptureResultImageInfo;-><init>(Landroidx/camera/core/impl/CameraCaptureResult;)V

    .line 75
    .line 76
    .line 77
    invoke-direct {v0, p1, v2, v3}, Landroidx/camera/core/SettableImageProxy;-><init>(Landroidx/camera/core/ImageProxy;Landroid/util/Size;Landroidx/camera/core/ImageInfo;)V

    .line 78
    return-object v0
.end method


# virtual methods
.method public acceptProcessingRequest(Landroidx/camera/core/imagecapture/ProcessingRequest;)V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/camera/core/imagecapture/NoMetadataImageReader;->mPendingRequest:Landroidx/camera/core/imagecapture/ProcessingRequest;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    const/4 v0, 0x1

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    .line 9
    :goto_0
    const-string v1, "Pending request should be null"

    .line 10
    .line 11
    .line 12
    invoke-static {v0, v1}, Landroidx/core/util/Preconditions;->checkState(ZLjava/lang/String;)V

    .line 13
    .line 14
    iput-object p1, p0, Landroidx/camera/core/imagecapture/NoMetadataImageReader;->mPendingRequest:Landroidx/camera/core/imagecapture/ProcessingRequest;

    .line 15
    return-void
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

.method public acquireLatestImage()Landroidx/camera/core/ImageProxy;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/camera/core/imagecapture/NoMetadataImageReader;->mWrappedImageReader:Landroidx/camera/core/impl/ImageReaderProxy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Landroidx/camera/core/impl/ImageReaderProxy;->acquireLatestImage()Landroidx/camera/core/ImageProxy;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-direct {p0, v0}, Landroidx/camera/core/imagecapture/NoMetadataImageReader;->createImageProxyWithEmptyMetadata(Landroidx/camera/core/ImageProxy;)Landroidx/camera/core/ImageProxy;

    .line 10
    move-result-object v0

    .line 11
    return-object v0
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

.method public acquireNextImage()Landroidx/camera/core/ImageProxy;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/camera/core/imagecapture/NoMetadataImageReader;->mWrappedImageReader:Landroidx/camera/core/impl/ImageReaderProxy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Landroidx/camera/core/impl/ImageReaderProxy;->acquireNextImage()Landroidx/camera/core/ImageProxy;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-direct {p0, v0}, Landroidx/camera/core/imagecapture/NoMetadataImageReader;->createImageProxyWithEmptyMetadata(Landroidx/camera/core/ImageProxy;)Landroidx/camera/core/ImageProxy;

    .line 10
    move-result-object v0

    .line 11
    return-object v0
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

.method public clearOnImageAvailableListener()V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/camera/core/imagecapture/NoMetadataImageReader;->mWrappedImageReader:Landroidx/camera/core/impl/ImageReaderProxy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Landroidx/camera/core/impl/ImageReaderProxy;->clearOnImageAvailableListener()V

    .line 6
    return-void
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

.method public clearProcessingRequest()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    iput-object v0, p0, Landroidx/camera/core/imagecapture/NoMetadataImageReader;->mPendingRequest:Landroidx/camera/core/imagecapture/ProcessingRequest;

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

.method public close()V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/camera/core/imagecapture/NoMetadataImageReader;->mWrappedImageReader:Landroidx/camera/core/impl/ImageReaderProxy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Landroidx/camera/core/impl/ImageReaderProxy;->close()V

    .line 6
    return-void
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

.method public getHeight()I
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/camera/core/imagecapture/NoMetadataImageReader;->mWrappedImageReader:Landroidx/camera/core/impl/ImageReaderProxy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Landroidx/camera/core/impl/ImageReaderProxy;->getHeight()I

    .line 6
    move-result v0

    .line 7
    return v0
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

.method public getImageFormat()I
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/camera/core/imagecapture/NoMetadataImageReader;->mWrappedImageReader:Landroidx/camera/core/impl/ImageReaderProxy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Landroidx/camera/core/impl/ImageReaderProxy;->getImageFormat()I

    .line 6
    move-result v0

    .line 7
    return v0
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

.method public getMaxImages()I
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/camera/core/imagecapture/NoMetadataImageReader;->mWrappedImageReader:Landroidx/camera/core/impl/ImageReaderProxy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Landroidx/camera/core/impl/ImageReaderProxy;->getMaxImages()I

    .line 6
    move-result v0

    .line 7
    return v0
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

.method public getSurface()Landroid/view/Surface;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/camera/core/imagecapture/NoMetadataImageReader;->mWrappedImageReader:Landroidx/camera/core/impl/ImageReaderProxy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Landroidx/camera/core/impl/ImageReaderProxy;->getSurface()Landroid/view/Surface;

    .line 6
    move-result-object v0

    .line 7
    return-object v0
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

.method public getWidth()I
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/camera/core/imagecapture/NoMetadataImageReader;->mWrappedImageReader:Landroidx/camera/core/impl/ImageReaderProxy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Landroidx/camera/core/impl/ImageReaderProxy;->getWidth()I

    .line 6
    move-result v0

    .line 7
    return v0
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

.method public setOnImageAvailableListener(Landroidx/camera/core/impl/ImageReaderProxy$OnImageAvailableListener;Ljava/util/concurrent/Executor;)V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/camera/core/imagecapture/NoMetadataImageReader;->mWrappedImageReader:Landroidx/camera/core/impl/ImageReaderProxy;

    .line 3
    .line 4
    new-instance v1, Landroidx/camera/core/imagecapture/k;

    .line 5
    .line 6
    .line 7
    invoke-direct {v1, p0, p1}, Landroidx/camera/core/imagecapture/k;-><init>(Landroidx/camera/core/imagecapture/NoMetadataImageReader;Landroidx/camera/core/impl/ImageReaderProxy$OnImageAvailableListener;)V

    .line 8
    .line 9
    .line 10
    invoke-interface {v0, v1, p2}, Landroidx/camera/core/impl/ImageReaderProxy;->setOnImageAvailableListener(Landroidx/camera/core/impl/ImageReaderProxy$OnImageAvailableListener;Ljava/util/concurrent/Executor;)V

    .line 11
    return-void
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
