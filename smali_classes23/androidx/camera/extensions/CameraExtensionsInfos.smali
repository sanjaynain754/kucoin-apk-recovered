.class Landroidx/camera/extensions/CameraExtensionsInfos;
.super Ljava/lang/Object;
.source "CameraExtensionsInfos.java"


# static fields
.field private static final NORMAL_MODE_CAMERA_EXTENSIONS_INFO:Landroidx/camera/extensions/CameraExtensionsInfo;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Landroidx/camera/extensions/CameraExtensionsInfos$1;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Landroidx/camera/extensions/CameraExtensionsInfos$1;-><init>()V

    .line 6
    .line 7
    sput-object v0, Landroidx/camera/extensions/CameraExtensionsInfos;->NORMAL_MODE_CAMERA_EXTENSIONS_INFO:Landroidx/camera/extensions/CameraExtensionsInfo;

    .line 8
    return-void
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

.method public static from(Landroidx/camera/core/CameraInfo;)Landroidx/camera/extensions/CameraExtensionsInfo;
    .locals 2

    .line 1
    .line 2
    instance-of v0, p0, Landroidx/camera/core/impl/AdapterCameraInfo;

    .line 3
    .line 4
    const-string v1, "The input camera info must be an instance retrieved from the camera that is returned by invoking CameraProvider#bindToLifecycle() with an extension enabled camera selector."

    .line 5
    .line 6
    .line 7
    invoke-static {v0, v1}, Landroidx/core/util/Preconditions;->checkArgument(ZLjava/lang/Object;)V

    .line 8
    .line 9
    check-cast p0, Landroidx/camera/core/impl/AdapterCameraInfo;

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Landroidx/camera/core/impl/AdapterCameraInfo;->getSessionProcessor()Landroidx/camera/core/impl/SessionProcessor;

    .line 13
    move-result-object p0

    .line 14
    .line 15
    instance-of v0, p0, Landroidx/camera/extensions/CameraExtensionsInfo;

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    check-cast p0, Landroidx/camera/extensions/CameraExtensionsInfo;

    .line 20
    return-object p0

    .line 21
    .line 22
    :cond_0
    sget-object p0, Landroidx/camera/extensions/CameraExtensionsInfos;->NORMAL_MODE_CAMERA_EXTENSIONS_INFO:Landroidx/camera/extensions/CameraExtensionsInfo;

    .line 23
    return-object p0
    .line 24
.end method
