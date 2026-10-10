.class public Lcom/jumio/commons/camera/ImageData;
.super Lcom/jumio/core/data/scan/FileData;
.source "SourceFile"

# interfaces
.implements Lcom/jumio/commons/camera/ImageDataInterface;
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/jumio/commons/camera/ImageData$CameraPosition;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0016\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001,B\u0007\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0008\u0010(\u001a\u00020)H\u0016J\n\u0010*\u001a\u0004\u0018\u00010+H\u0016R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u000c\u0010\r\"\u0004\u0008\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0012\u0010\u0013\"\u0004\u0008\u0014\u0010\u0015R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0018\u0010\u0019\"\u0004\u0008\u001a\u0010\u001bR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u001e\u0010\u001f\"\u0004\u0008 \u0010!R\u001c\u0010\"\u001a\u0004\u0018\u00010#X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008$\u0010%\"\u0004\u0008&\u0010\'\u00a8\u0006-"
    }
    d2 = {
        "Lcom/jumio/commons/camera/ImageData;",
        "Lcom/jumio/core/data/scan/FileData;",
        "Lcom/jumio/commons/camera/ImageDataInterface;",
        "Ljava/io/Serializable;",
        "<init>",
        "()V",
        "size",
        "Lcom/jumio/commons/camera/Size;",
        "getSize",
        "()Lcom/jumio/commons/camera/Size;",
        "orientationMode",
        "Lcom/jumio/commons/enums/ScreenAngle;",
        "getOrientationMode",
        "()Lcom/jumio/commons/enums/ScreenAngle;",
        "setOrientationMode",
        "(Lcom/jumio/commons/enums/ScreenAngle;)V",
        "cameraPosition",
        "Lcom/jumio/commons/camera/ImageData$CameraPosition;",
        "getCameraPosition",
        "()Lcom/jumio/commons/camera/ImageData$CameraPosition;",
        "setCameraPosition",
        "(Lcom/jumio/commons/camera/ImageData$CameraPosition;)V",
        "metadata",
        "Lcom/jumio/commons/camera/ImageMetadata;",
        "getMetadata",
        "()Lcom/jumio/commons/camera/ImageMetadata;",
        "setMetadata",
        "(Lcom/jumio/commons/camera/ImageMetadata;)V",
        "cameraDataModel",
        "Lcom/jumio/core/camera/CameraDataModel;",
        "getCameraDataModel",
        "()Lcom/jumio/core/camera/CameraDataModel;",
        "setCameraDataModel",
        "(Lcom/jumio/core/camera/CameraDataModel;)V",
        "cameraConnectionData",
        "Lcom/jumio/core/camera/CameraConnectionData;",
        "getCameraConnectionData",
        "()Lcom/jumio/core/camera/CameraConnectionData;",
        "setCameraConnectionData",
        "(Lcom/jumio/core/camera/CameraConnectionData;)V",
        "clear",
        "",
        "getUploadMetadata",
        "Lorg/json/JSONObject;",
        "CameraPosition",
        "jumio-core_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private cameraConnectionData:Lcom/jumio/core/camera/CameraConnectionData;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private cameraDataModel:Lcom/jumio/core/camera/CameraDataModel;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private cameraPosition:Lcom/jumio/commons/camera/ImageData$CameraPosition;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private metadata:Lcom/jumio/commons/camera/ImageMetadata;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private orientationMode:Lcom/jumio/commons/enums/ScreenAngle;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final size:Lcom/jumio/commons/camera/Size;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/jumio/core/data/scan/FileData;-><init>()V

    .line 4
    .line 5
    new-instance v0, Lcom/jumio/commons/camera/Size;

    .line 6
    const/4 v1, 0x0

    .line 7
    .line 8
    .line 9
    invoke-direct {v0, v1, v1}, Lcom/jumio/commons/camera/Size;-><init>(II)V

    .line 10
    .line 11
    iput-object v0, p0, Lcom/jumio/commons/camera/ImageData;->size:Lcom/jumio/commons/camera/Size;

    .line 12
    return-void
    .line 13
    .line 14
    .line 15
    .line 16
.end method


# virtual methods
.method public clear()V
    .locals 2

    .line 1
    .line 2
    .line 3
    :try_start_0
    invoke-super {p0}, Lcom/jumio/core/data/scan/FileData;->clear()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/jumio/commons/camera/ImageData;->getSize()Lcom/jumio/commons/camera/Size;

    .line 7
    move-result-object v0

    .line 8
    const/4 v1, 0x0

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, v1}, Lcom/jumio/commons/camera/Size;->setWidth(I)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Lcom/jumio/commons/camera/ImageData;->getSize()Lcom/jumio/commons/camera/Size;

    .line 15
    move-result-object v0

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, v1}, Lcom/jumio/commons/camera/Size;->setHeight(I)V

    .line 19
    const/4 v0, 0x0

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0, v0}, Lcom/jumio/commons/camera/ImageData;->setOrientationMode(Lcom/jumio/commons/enums/ScreenAngle;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0, v0}, Lcom/jumio/commons/camera/ImageData;->setCameraPosition(Lcom/jumio/commons/camera/ImageData$CameraPosition;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0, v0}, Lcom/jumio/commons/camera/ImageData;->setMetadata(Lcom/jumio/commons/camera/ImageMetadata;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0, v0}, Lcom/jumio/commons/camera/ImageData;->setCameraDataModel(Lcom/jumio/core/camera/CameraDataModel;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 32
    return-void

    .line 33
    :catch_0
    move-exception v0

    .line 34
    .line 35
    .line 36
    invoke-static {v0}, Lcom/jumio/commons/log/Log;->printStackTrace(Ljava/lang/Throwable;)V

    .line 37
    return-void
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

.method public getCameraConnectionData()Lcom/jumio/core/camera/CameraConnectionData;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/commons/camera/ImageData;->cameraConnectionData:Lcom/jumio/core/camera/CameraConnectionData;

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

.method public getCameraDataModel()Lcom/jumio/core/camera/CameraDataModel;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/commons/camera/ImageData;->cameraDataModel:Lcom/jumio/core/camera/CameraDataModel;

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

.method public getCameraPosition()Lcom/jumio/commons/camera/ImageData$CameraPosition;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/commons/camera/ImageData;->cameraPosition:Lcom/jumio/commons/camera/ImageData$CameraPosition;

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

.method public getMetadata()Lcom/jumio/commons/camera/ImageMetadata;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/commons/camera/ImageData;->metadata:Lcom/jumio/commons/camera/ImageMetadata;

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

.method public getOrientationMode()Lcom/jumio/commons/enums/ScreenAngle;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/commons/camera/ImageData;->orientationMode:Lcom/jumio/commons/enums/ScreenAngle;

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

.method public getSize()Lcom/jumio/commons/camera/Size;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/commons/camera/ImageData;->size:Lcom/jumio/commons/camera/Size;

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

.method public getUploadMetadata()Lorg/json/JSONObject;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

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
.end method

.method public setCameraConnectionData(Lcom/jumio/core/camera/CameraConnectionData;)V
    .locals 0
    .param p1    # Lcom/jumio/core/camera/CameraConnectionData;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/jumio/commons/camera/ImageData;->cameraConnectionData:Lcom/jumio/core/camera/CameraConnectionData;

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

.method public setCameraDataModel(Lcom/jumio/core/camera/CameraDataModel;)V
    .locals 0
    .param p1    # Lcom/jumio/core/camera/CameraDataModel;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/jumio/commons/camera/ImageData;->cameraDataModel:Lcom/jumio/core/camera/CameraDataModel;

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

.method public setCameraPosition(Lcom/jumio/commons/camera/ImageData$CameraPosition;)V
    .locals 0
    .param p1    # Lcom/jumio/commons/camera/ImageData$CameraPosition;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/jumio/commons/camera/ImageData;->cameraPosition:Lcom/jumio/commons/camera/ImageData$CameraPosition;

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

.method public setMetadata(Lcom/jumio/commons/camera/ImageMetadata;)V
    .locals 0
    .param p1    # Lcom/jumio/commons/camera/ImageMetadata;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/jumio/commons/camera/ImageData;->metadata:Lcom/jumio/commons/camera/ImageMetadata;

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

.method public setOrientationMode(Lcom/jumio/commons/enums/ScreenAngle;)V
    .locals 0
    .param p1    # Lcom/jumio/commons/enums/ScreenAngle;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/jumio/commons/camera/ImageData;->orientationMode:Lcom/jumio/commons/enums/ScreenAngle;

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
