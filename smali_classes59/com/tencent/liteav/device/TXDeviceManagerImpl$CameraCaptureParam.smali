.class Lcom/tencent/liteav/device/TXDeviceManagerImpl$CameraCaptureParam;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/liteav/device/TXDeviceManagerImpl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "CameraCaptureParam"
.end annotation


# instance fields
.field private mParams:Lcom/tencent/liteav/device/TXDeviceManager$TXCameraCaptureParam;


# direct methods
.method public constructor <init>(Lcom/tencent/liteav/device/TXDeviceManager$TXCameraCaptureParam;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Lcom/tencent/liteav/device/TXDeviceManagerImpl$CameraCaptureParam;->mParams:Lcom/tencent/liteav/device/TXDeviceManager$TXCameraCaptureParam;

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
    .line 25
.end method


# virtual methods
.method public getHeight()I
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/liteav/device/TXDeviceManagerImpl$CameraCaptureParam;->mParams:Lcom/tencent/liteav/device/TXDeviceManager$TXCameraCaptureParam;

    .line 3
    .line 4
    iget v0, v0, Lcom/tencent/liteav/device/TXDeviceManager$TXCameraCaptureParam;->height:I

    .line 5
    return v0
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

.method public getMode()I
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/liteav/device/TXDeviceManagerImpl$CameraCaptureParam;->mParams:Lcom/tencent/liteav/device/TXDeviceManager$TXCameraCaptureParam;

    .line 3
    .line 4
    iget-object v0, v0, Lcom/tencent/liteav/device/TXDeviceManager$TXCameraCaptureParam;->mode:Lcom/tencent/liteav/device/TXDeviceManager$TXCameraCaptureMode;

    .line 5
    .line 6
    .line 7
    invoke-static {v0}, Lcom/tencent/liteav/device/TXDeviceManagerImpl;->cameraCaptureModeAsInt(Lcom/tencent/liteav/device/TXDeviceManager$TXCameraCaptureMode;)I

    .line 8
    move-result v0

    .line 9
    return v0
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public getWidth()I
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/liteav/device/TXDeviceManagerImpl$CameraCaptureParam;->mParams:Lcom/tencent/liteav/device/TXDeviceManager$TXCameraCaptureParam;

    .line 3
    .line 4
    iget v0, v0, Lcom/tencent/liteav/device/TXDeviceManager$TXCameraCaptureParam;->width:I

    .line 5
    return v0
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
