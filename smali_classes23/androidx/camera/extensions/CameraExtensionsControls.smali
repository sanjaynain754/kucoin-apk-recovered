.class Landroidx/camera/extensions/CameraExtensionsControls;
.super Ljava/lang/Object;
.source "CameraExtensionsControls.java"


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

.method public static from(Landroidx/camera/core/CameraControl;)Landroidx/camera/extensions/CameraExtensionsControl;
    .locals 2

    .line 1
    .line 2
    instance-of v0, p0, Landroidx/camera/core/impl/AdapterCameraControl;

    .line 3
    .line 4
    const-string v1, "The input camera control must be an instance retrieved from the camera that is returned by invoking CameraProvider#bindToLifecycle() with an extension enabled camera selector."

    .line 5
    .line 6
    .line 7
    invoke-static {v0, v1}, Landroidx/core/util/Preconditions;->checkArgument(ZLjava/lang/Object;)V

    .line 8
    .line 9
    check-cast p0, Landroidx/camera/core/impl/AdapterCameraControl;

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Landroidx/camera/core/impl/AdapterCameraControl;->getSessionProcessor()Landroidx/camera/core/impl/SessionProcessor;

    .line 13
    move-result-object p0

    .line 14
    .line 15
    instance-of v0, p0, Landroidx/camera/extensions/CameraExtensionsControl;

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    check-cast p0, Landroidx/camera/extensions/CameraExtensionsControl;

    .line 20
    return-object p0

    .line 21
    :cond_0
    const/4 p0, 0x0

    .line 22
    return-object p0
    .line 23
    .line 24
.end method
