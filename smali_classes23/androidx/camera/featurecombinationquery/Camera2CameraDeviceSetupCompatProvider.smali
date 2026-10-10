.class Landroidx/camera/featurecombinationquery/Camera2CameraDeviceSetupCompatProvider;
.super Ljava/lang/Object;
.source "Camera2CameraDeviceSetupCompatProvider.java"

# interfaces
.implements Landroidx/camera/featurecombinationquery/CameraDeviceSetupCompatProvider;


# annotations
.annotation build Landroidx/annotation/RequiresApi;
    api = 0x23
.end annotation


# instance fields
.field private final mCameraManager:Landroid/hardware/camera2/CameraManager;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    const-class v0, Landroid/hardware/camera2/CameraManager;

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    .line 9
    move-result-object p1

    .line 10
    .line 11
    check-cast p1, Landroid/hardware/camera2/CameraManager;

    .line 12
    .line 13
    iput-object p1, p0, Landroidx/camera/featurecombinationquery/Camera2CameraDeviceSetupCompatProvider;->mCameraManager:Landroid/hardware/camera2/CameraManager;

    .line 14
    return-void
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


# virtual methods
.method public getCameraDeviceSetupCompat(Ljava/lang/String;)Landroidx/camera/featurecombinationquery/CameraDeviceSetupCompat;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/hardware/camera2/CameraAccessException;
        }
    .end annotation

    .line 1
    .line 2
    new-instance v0, Landroidx/camera/featurecombinationquery/Camera2CameraDeviceSetupCompat;

    .line 3
    .line 4
    iget-object v1, p0, Landroidx/camera/featurecombinationquery/Camera2CameraDeviceSetupCompatProvider;->mCameraManager:Landroid/hardware/camera2/CameraManager;

    .line 5
    .line 6
    .line 7
    invoke-direct {v0, v1, p1}, Landroidx/camera/featurecombinationquery/Camera2CameraDeviceSetupCompat;-><init>(Landroid/hardware/camera2/CameraManager;Ljava/lang/String;)V

    .line 8
    return-object v0
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
