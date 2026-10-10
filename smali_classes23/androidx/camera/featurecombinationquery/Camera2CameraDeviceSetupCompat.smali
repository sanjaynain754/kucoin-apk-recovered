.class Landroidx/camera/featurecombinationquery/Camera2CameraDeviceSetupCompat;
.super Ljava/lang/Object;
.source "Camera2CameraDeviceSetupCompat.java"

# interfaces
.implements Landroidx/camera/featurecombinationquery/CameraDeviceSetupCompat;


# annotations
.annotation build Landroidx/annotation/RequiresApi;
    api = 0x23
.end annotation


# instance fields
.field private final mCameraDeviceSetup:Landroid/hardware/camera2/CameraDevice$CameraDeviceSetup;


# direct methods
.method public constructor <init>(Landroid/hardware/camera2/CameraManager;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/hardware/camera2/CameraAccessException;
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {p1, p2}, Landroidx/camera/camera2/impl/h;->a(Landroid/hardware/camera2/CameraManager;Ljava/lang/String;)Landroid/hardware/camera2/CameraDevice$CameraDeviceSetup;

    .line 7
    move-result-object p1

    .line 8
    .line 9
    iput-object p1, p0, Landroidx/camera/featurecombinationquery/Camera2CameraDeviceSetupCompat;->mCameraDeviceSetup:Landroid/hardware/camera2/CameraDevice$CameraDeviceSetup;

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

.method public static getBuildTimeEpochMillis()J
    .locals 4

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "ro.build.date.utc"

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 7
    move-result-object v0

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    .line 12
    :try_start_0
    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 13
    move-result-wide v0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 14
    .line 15
    const-wide/16 v2, 0x3e8

    .line 16
    mul-long/2addr v0, v2

    .line 17
    return-wide v0

    .line 18
    .line 19
    :catch_0
    :cond_0
    const-wide/16 v0, 0x0

    .line 20
    return-wide v0
.end method


# virtual methods
.method public isSessionConfigurationSupported(Landroid/hardware/camera2/params/SessionConfiguration;)Landroidx/camera/featurecombinationquery/CameraDeviceSetupCompat$SupportQueryResult;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/hardware/camera2/CameraAccessException;
        }
    .end annotation

    .line 1
    .line 2
    new-instance v0, Landroidx/camera/featurecombinationquery/CameraDeviceSetupCompat$SupportQueryResult;

    .line 3
    .line 4
    iget-object v1, p0, Landroidx/camera/featurecombinationquery/Camera2CameraDeviceSetupCompat;->mCameraDeviceSetup:Landroid/hardware/camera2/CameraDevice$CameraDeviceSetup;

    .line 5
    .line 6
    .line 7
    invoke-static {v1, p1}, Landroidx/camera/featurecombinationquery/a;->a(Landroid/hardware/camera2/CameraDevice$CameraDeviceSetup;Landroid/hardware/camera2/params/SessionConfiguration;)Z

    .line 8
    move-result p1

    .line 9
    const/4 v1, 0x2

    .line 10
    .line 11
    if-eqz p1, :cond_0

    .line 12
    const/4 p1, 0x1

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move p1, v1

    .line 15
    .line 16
    .line 17
    :goto_0
    invoke-static {}, Landroidx/camera/featurecombinationquery/Camera2CameraDeviceSetupCompat;->getBuildTimeEpochMillis()J

    .line 18
    move-result-wide v2

    .line 19
    .line 20
    .line 21
    invoke-direct {v0, p1, v1, v2, v3}, Landroidx/camera/featurecombinationquery/CameraDeviceSetupCompat$SupportQueryResult;-><init>(IIJ)V

    .line 22
    return-object v0
    .line 23
    .line 24
.end method

.method public isSessionConfigurationSupportedLegacy(Landroidx/camera/featurecombinationquery/SessionConfigurationLegacy;)Landroidx/camera/featurecombinationquery/CameraDeviceSetupCompat$SupportQueryResult;
    .locals 1

    .line 1
    .line 2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 3
    .line 4
    const-string v0, "This device supports CameraDeviceSetup. Please use Camera2 SessionConfiguration for querying instead."

    .line 5
    .line 6
    .line 7
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 8
    throw p1
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
