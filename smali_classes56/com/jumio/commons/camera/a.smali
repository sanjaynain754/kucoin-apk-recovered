.class public final Lcom/jumio/commons/camera/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jumio/commons/camera/ImageDataInterface;
.implements Ljava/io/Serializable;


# instance fields
.field public final a:Ljava/util/LinkedHashMap;

.field public b:Lcom/jumio/core/enums/UploadResolution;

.field public c:Lcom/jumio/core/camera/CameraDataModel;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 9
    .line 10
    iput-object v0, p0, Lcom/jumio/commons/camera/a;->a:Ljava/util/LinkedHashMap;

    .line 11
    .line 12
    sget-object v0, Lcom/jumio/core/enums/UploadResolution;->UHD:Lcom/jumio/core/enums/UploadResolution;

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, v0}, Lcom/jumio/commons/camera/a;->a(Lcom/jumio/core/enums/UploadResolution;)Lcom/jumio/commons/camera/ImageData;

    .line 16
    move-result-object v1

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1}, Lcom/jumio/core/data/scan/FileData;->getHasData()Z

    .line 20
    move-result v1

    .line 21
    .line 22
    if-eqz v1, :cond_0

    .line 23
    goto :goto_0

    .line 24
    .line 25
    :cond_0
    sget-object v0, Lcom/jumio/core/enums/UploadResolution;->FHD:Lcom/jumio/core/enums/UploadResolution;

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0, v0}, Lcom/jumio/commons/camera/a;->a(Lcom/jumio/core/enums/UploadResolution;)Lcom/jumio/commons/camera/ImageData;

    .line 29
    move-result-object v1

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1}, Lcom/jumio/core/data/scan/FileData;->getHasData()Z

    .line 33
    move-result v1

    .line 34
    .line 35
    if-eqz v1, :cond_1

    .line 36
    goto :goto_0

    .line 37
    .line 38
    :cond_1
    sget-object v1, Lcom/jumio/core/enums/UploadResolution;->DEBUG:Lcom/jumio/core/enums/UploadResolution;

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0, v1}, Lcom/jumio/commons/camera/a;->a(Lcom/jumio/core/enums/UploadResolution;)Lcom/jumio/commons/camera/ImageData;

    .line 42
    move-result-object v2

    .line 43
    .line 44
    .line 45
    invoke-virtual {v2}, Lcom/jumio/core/data/scan/FileData;->getHasData()Z

    .line 46
    move-result v2

    .line 47
    .line 48
    if-eqz v2, :cond_2

    .line 49
    move-object v0, v1

    .line 50
    .line 51
    :cond_2
    :goto_0
    iput-object v0, p0, Lcom/jumio/commons/camera/a;->b:Lcom/jumio/core/enums/UploadResolution;

    .line 52
    return-void
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
.end method


# virtual methods
.method public final a(Lcom/jumio/core/enums/UploadResolution;)Lcom/jumio/commons/camera/ImageData;
    .locals 2

    .line 1
    .line 2
    const-string v0, "uploadResolution"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v0, p0, Lcom/jumio/commons/camera/a;->a:Ljava/util/LinkedHashMap;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    move-result-object v1

    .line 12
    .line 13
    if-nez v1, :cond_0

    .line 14
    .line 15
    new-instance v1, Lcom/jumio/commons/camera/ImageData;

    .line 16
    .line 17
    .line 18
    invoke-direct {v1}, Lcom/jumio/commons/camera/ImageData;-><init>()V

    .line 19
    .line 20
    .line 21
    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    :cond_0
    check-cast v1, Lcom/jumio/commons/camera/ImageData;

    .line 24
    return-object v1
.end method

.method public final b(Lcom/jumio/core/enums/UploadResolution;)V
    .locals 2

    .line 1
    .line 2
    const-string v0, "uploadResolution"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    sget-object v0, Lcom/jumio/core/enums/UploadResolution;->UHD:Lcom/jumio/core/enums/UploadResolution;

    .line 8
    .line 9
    if-ne p1, v0, :cond_0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v0}, Lcom/jumio/commons/camera/a;->a(Lcom/jumio/core/enums/UploadResolution;)Lcom/jumio/commons/camera/ImageData;

    .line 13
    move-result-object v1

    .line 14
    .line 15
    .line 16
    invoke-virtual {v1}, Lcom/jumio/core/data/scan/FileData;->getHasData()Z

    .line 17
    move-result v1

    .line 18
    .line 19
    if-eqz v1, :cond_0

    .line 20
    goto :goto_0

    .line 21
    .line 22
    :cond_0
    sget-object v0, Lcom/jumio/core/enums/UploadResolution;->DEBUG:Lcom/jumio/core/enums/UploadResolution;

    .line 23
    .line 24
    if-ne p1, v0, :cond_1

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0, v0}, Lcom/jumio/commons/camera/a;->a(Lcom/jumio/core/enums/UploadResolution;)Lcom/jumio/commons/camera/ImageData;

    .line 28
    move-result-object p1

    .line 29
    .line 30
    .line 31
    invoke-virtual {p1}, Lcom/jumio/core/data/scan/FileData;->getHasData()Z

    .line 32
    move-result p1

    .line 33
    .line 34
    if-eqz p1, :cond_1

    .line 35
    goto :goto_0

    .line 36
    .line 37
    :cond_1
    sget-object v0, Lcom/jumio/core/enums/UploadResolution;->FHD:Lcom/jumio/core/enums/UploadResolution;

    .line 38
    .line 39
    :goto_0
    iput-object v0, p0, Lcom/jumio/commons/camera/a;->b:Lcom/jumio/core/enums/UploadResolution;

    .line 40
    return-void
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
.end method

.method public final clear()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/commons/camera/a;->a:Ljava/util/LinkedHashMap;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    .line 13
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    move-result v1

    .line 15
    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    .line 19
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    move-result-object v1

    .line 21
    .line 22
    check-cast v1, Ljava/util/Map$Entry;

    .line 23
    .line 24
    .line 25
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 26
    move-result-object v1

    .line 27
    .line 28
    check-cast v1, Lcom/jumio/commons/camera/ImageData;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1}, Lcom/jumio/commons/camera/ImageData;->clear()V

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    return-void
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
.end method

.method public final getCameraConnectionData()Lcom/jumio/core/camera/CameraConnectionData;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/commons/camera/a;->b:Lcom/jumio/core/enums/UploadResolution;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, v0}, Lcom/jumio/commons/camera/a;->a(Lcom/jumio/core/enums/UploadResolution;)Lcom/jumio/commons/camera/ImageData;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/jumio/commons/camera/ImageData;->getCameraConnectionData()Lcom/jumio/core/camera/CameraConnectionData;

    .line 10
    move-result-object v0

    .line 11
    return-object v0
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
.end method

.method public final getCameraDataModel()Lcom/jumio/core/camera/CameraDataModel;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/commons/camera/a;->c:Lcom/jumio/core/camera/CameraDataModel;

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
.end method

.method public final getCameraPosition()Lcom/jumio/commons/camera/ImageData$CameraPosition;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/commons/camera/a;->b:Lcom/jumio/core/enums/UploadResolution;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, v0}, Lcom/jumio/commons/camera/a;->a(Lcom/jumio/core/enums/UploadResolution;)Lcom/jumio/commons/camera/ImageData;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/jumio/commons/camera/ImageData;->getCameraPosition()Lcom/jumio/commons/camera/ImageData$CameraPosition;

    .line 10
    move-result-object v0

    .line 11
    return-object v0
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
.end method

.method public final getData()Ljava/lang/Object;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/commons/camera/a;->b:Lcom/jumio/core/enums/UploadResolution;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, v0}, Lcom/jumio/commons/camera/a;->a(Lcom/jumio/core/enums/UploadResolution;)Lcom/jumio/commons/camera/ImageData;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/jumio/core/data/scan/FileData;->getData()Ljava/lang/String;

    .line 10
    move-result-object v0

    .line 11
    return-object v0
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
.end method

.method public final getFileName()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/commons/camera/a;->b:Lcom/jumio/core/enums/UploadResolution;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, v0}, Lcom/jumio/commons/camera/a;->a(Lcom/jumio/core/enums/UploadResolution;)Lcom/jumio/commons/camera/ImageData;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/jumio/core/data/scan/FileData;->getFileName()Ljava/lang/String;

    .line 10
    move-result-object v0

    .line 11
    return-object v0
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
.end method

.method public final getFileType()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/commons/camera/a;->b:Lcom/jumio/core/enums/UploadResolution;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, v0}, Lcom/jumio/commons/camera/a;->a(Lcom/jumio/core/enums/UploadResolution;)Lcom/jumio/commons/camera/ImageData;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/jumio/core/data/scan/FileData;->getFileType()Ljava/lang/String;

    .line 10
    move-result-object v0

    .line 11
    return-object v0
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
.end method

.method public final getHasData()Z
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/commons/camera/a;->b:Lcom/jumio/core/enums/UploadResolution;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, v0}, Lcom/jumio/commons/camera/a;->a(Lcom/jumio/core/enums/UploadResolution;)Lcom/jumio/commons/camera/ImageData;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/jumio/core/data/scan/FileData;->getHasData()Z

    .line 10
    move-result v0

    .line 11
    return v0
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
.end method

.method public final getMetadata()Lcom/jumio/commons/camera/ImageMetadata;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/commons/camera/a;->b:Lcom/jumio/core/enums/UploadResolution;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, v0}, Lcom/jumio/commons/camera/a;->a(Lcom/jumio/core/enums/UploadResolution;)Lcom/jumio/commons/camera/ImageData;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/jumio/commons/camera/ImageData;->getMetadata()Lcom/jumio/commons/camera/ImageMetadata;

    .line 10
    move-result-object v0

    .line 11
    return-object v0
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
.end method

.method public final getMimeType()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/commons/camera/a;->b:Lcom/jumio/core/enums/UploadResolution;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, v0}, Lcom/jumio/commons/camera/a;->a(Lcom/jumio/core/enums/UploadResolution;)Lcom/jumio/commons/camera/ImageData;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/jumio/core/data/scan/FileData;->getMimeType()Ljava/lang/String;

    .line 10
    move-result-object v0

    .line 11
    return-object v0
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
.end method

.method public final getOrientationMode()Lcom/jumio/commons/enums/ScreenAngle;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/commons/camera/a;->b:Lcom/jumio/core/enums/UploadResolution;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, v0}, Lcom/jumio/commons/camera/a;->a(Lcom/jumio/core/enums/UploadResolution;)Lcom/jumio/commons/camera/ImageData;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/jumio/commons/camera/ImageData;->getOrientationMode()Lcom/jumio/commons/enums/ScreenAngle;

    .line 10
    move-result-object v0

    .line 11
    return-object v0
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
.end method

.method public final getSize()Lcom/jumio/commons/camera/Size;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/commons/camera/a;->b:Lcom/jumio/core/enums/UploadResolution;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, v0}, Lcom/jumio/commons/camera/a;->a(Lcom/jumio/core/enums/UploadResolution;)Lcom/jumio/commons/camera/ImageData;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/jumio/commons/camera/ImageData;->getSize()Lcom/jumio/commons/camera/Size;

    .line 10
    move-result-object v0

    .line 11
    return-object v0
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
.end method

.method public final getTimestamp()Ljava/lang/Long;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/commons/camera/a;->b:Lcom/jumio/core/enums/UploadResolution;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, v0}, Lcom/jumio/commons/camera/a;->a(Lcom/jumio/core/enums/UploadResolution;)Lcom/jumio/commons/camera/ImageData;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/jumio/core/data/scan/FileData;->getTimestamp()Ljava/lang/Long;

    .line 10
    move-result-object v0

    .line 11
    return-object v0
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
.end method

.method public final setCameraConnectionData(Lcom/jumio/core/camera/CameraConnectionData;)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/commons/camera/a;->b:Lcom/jumio/core/enums/UploadResolution;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, v0}, Lcom/jumio/commons/camera/a;->a(Lcom/jumio/core/enums/UploadResolution;)Lcom/jumio/commons/camera/ImageData;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, p1}, Lcom/jumio/commons/camera/ImageData;->setCameraConnectionData(Lcom/jumio/core/camera/CameraConnectionData;)V

    .line 10
    return-void
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

.method public final setCameraDataModel(Lcom/jumio/core/camera/CameraDataModel;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/jumio/commons/camera/a;->c:Lcom/jumio/core/camera/CameraDataModel;

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

.method public final setCameraPosition(Lcom/jumio/commons/camera/ImageData$CameraPosition;)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/commons/camera/a;->b:Lcom/jumio/core/enums/UploadResolution;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, v0}, Lcom/jumio/commons/camera/a;->a(Lcom/jumio/core/enums/UploadResolution;)Lcom/jumio/commons/camera/ImageData;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, p1}, Lcom/jumio/commons/camera/ImageData;->setCameraPosition(Lcom/jumio/commons/camera/ImageData$CameraPosition;)V

    .line 10
    return-void
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

.method public final setData(Ljava/lang/Object;)V
    .locals 1

    .line 1
    .line 2
    check-cast p1, Ljava/lang/String;

    .line 3
    .line 4
    const-string v0, "value"

    .line 5
    .line 6
    .line 7
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    iget-object v0, p0, Lcom/jumio/commons/camera/a;->b:Lcom/jumio/core/enums/UploadResolution;

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v0}, Lcom/jumio/commons/camera/a;->a(Lcom/jumio/core/enums/UploadResolution;)Lcom/jumio/commons/camera/ImageData;

    .line 13
    move-result-object v0

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, p1}, Lcom/jumio/core/data/scan/FileData;->setData(Ljava/lang/String;)V

    .line 17
    return-void
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public final setFileType(Ljava/lang/String;)V
    .locals 1

    .line 1
    .line 2
    const-string v0, "value"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v0, p0, Lcom/jumio/commons/camera/a;->b:Lcom/jumio/core/enums/UploadResolution;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, v0}, Lcom/jumio/commons/camera/a;->a(Lcom/jumio/core/enums/UploadResolution;)Lcom/jumio/commons/camera/ImageData;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, p1}, Lcom/jumio/core/data/scan/FileData;->setFileType(Ljava/lang/String;)V

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

.method public final setMetadata(Lcom/jumio/commons/camera/ImageMetadata;)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/commons/camera/a;->b:Lcom/jumio/core/enums/UploadResolution;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, v0}, Lcom/jumio/commons/camera/a;->a(Lcom/jumio/core/enums/UploadResolution;)Lcom/jumio/commons/camera/ImageData;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, p1}, Lcom/jumio/commons/camera/ImageData;->setMetadata(Lcom/jumio/commons/camera/ImageMetadata;)V

    .line 10
    return-void
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

.method public final setMimeType(Ljava/lang/String;)V
    .locals 1

    .line 1
    .line 2
    const-string v0, "value"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v0, p0, Lcom/jumio/commons/camera/a;->b:Lcom/jumio/core/enums/UploadResolution;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, v0}, Lcom/jumio/commons/camera/a;->a(Lcom/jumio/core/enums/UploadResolution;)Lcom/jumio/commons/camera/ImageData;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, p1}, Lcom/jumio/core/data/scan/FileData;->setMimeType(Ljava/lang/String;)V

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

.method public final setOrientationMode(Lcom/jumio/commons/enums/ScreenAngle;)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/commons/camera/a;->b:Lcom/jumio/core/enums/UploadResolution;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, v0}, Lcom/jumio/commons/camera/a;->a(Lcom/jumio/core/enums/UploadResolution;)Lcom/jumio/commons/camera/ImageData;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, p1}, Lcom/jumio/commons/camera/ImageData;->setOrientationMode(Lcom/jumio/commons/enums/ScreenAngle;)V

    .line 10
    return-void
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

.method public final setTimestamp(Ljava/lang/Long;)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/commons/camera/a;->b:Lcom/jumio/core/enums/UploadResolution;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, v0}, Lcom/jumio/commons/camera/a;->a(Lcom/jumio/core/enums/UploadResolution;)Lcom/jumio/commons/camera/ImageData;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, p1}, Lcom/jumio/core/data/scan/FileData;->setTimestamp(Ljava/lang/Long;)V

    .line 10
    return-void
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
