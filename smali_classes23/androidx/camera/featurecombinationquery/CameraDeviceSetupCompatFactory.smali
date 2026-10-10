.class public Landroidx/camera/featurecombinationquery/CameraDeviceSetupCompatFactory;
.super Ljava/lang/Object;
.source "CameraDeviceSetupCompatFactory.java"


# static fields
.field private static final PLAY_SERVICES_IMPL_KEY:Ljava/lang/String; = "androidx.camera.featurecombinationquery.PLAY_SERVICES_IMPL_PROVIDER_KEY"


# instance fields
.field private mCamera2Provider:Landroidx/camera/featurecombinationquery/CameraDeviceSetupCompatProvider;

.field private final mContext:Landroid/content/Context;

.field private mPlayServicesProvider:Landroidx/camera/featurecombinationquery/CameraDeviceSetupCompatProvider;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Landroidx/camera/featurecombinationquery/CameraDeviceSetupCompatFactory;->mContext:Landroid/content/Context;

    .line 6
    .line 7
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 8
    .line 9
    const/16 v1, 0x23

    .line 10
    .line 11
    if-lt v0, v1, :cond_0

    .line 12
    .line 13
    new-instance v0, Landroidx/camera/featurecombinationquery/Camera2CameraDeviceSetupCompatProvider;

    .line 14
    .line 15
    .line 16
    invoke-direct {v0, p1}, Landroidx/camera/featurecombinationquery/Camera2CameraDeviceSetupCompatProvider;-><init>(Landroid/content/Context;)V

    .line 17
    .line 18
    iput-object v0, p0, Landroidx/camera/featurecombinationquery/CameraDeviceSetupCompatFactory;->mCamera2Provider:Landroidx/camera/featurecombinationquery/CameraDeviceSetupCompatProvider;

    .line 19
    .line 20
    .line 21
    :cond_0
    invoke-direct {p0}, Landroidx/camera/featurecombinationquery/CameraDeviceSetupCompatFactory;->getPlayServicesCameraDeviceSetupCompatProvider()Landroidx/camera/featurecombinationquery/CameraDeviceSetupCompatProvider;

    .line 22
    move-result-object p1

    .line 23
    .line 24
    iput-object p1, p0, Landroidx/camera/featurecombinationquery/CameraDeviceSetupCompatFactory;->mPlayServicesProvider:Landroidx/camera/featurecombinationquery/CameraDeviceSetupCompatProvider;

    .line 25
    return-void
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
.end method

.method private getPlayServicesCameraDeviceSetupCompatProvider()Landroidx/camera/featurecombinationquery/CameraDeviceSetupCompatProvider;
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalStateException;
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    :try_start_0
    iget-object v1, p0, Landroidx/camera/featurecombinationquery/CameraDeviceSetupCompatFactory;->mContext:Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 7
    move-result-object v1

    .line 8
    .line 9
    iget-object v2, p0, Landroidx/camera/featurecombinationquery/CameraDeviceSetupCompatFactory;->mContext:Landroid/content/Context;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 13
    move-result-object v2

    .line 14
    .line 15
    const/16 v3, 0x84

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1, v2, v3}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 19
    move-result-object v1
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 20
    .line 21
    iget-object v1, v1, Landroid/content/pm/PackageInfo;->services:[Landroid/content/pm/ServiceInfo;

    .line 22
    .line 23
    if-nez v1, :cond_0

    .line 24
    return-object v0

    .line 25
    :cond_0
    array-length v2, v1

    .line 26
    const/4 v3, 0x0

    .line 27
    move-object v4, v0

    .line 28
    .line 29
    :goto_0
    if-ge v3, v2, :cond_4

    .line 30
    .line 31
    aget-object v5, v1, v3

    .line 32
    .line 33
    iget-object v5, v5, Landroid/content/pm/ServiceInfo;->metaData:Landroid/os/Bundle;

    .line 34
    .line 35
    if-nez v5, :cond_1

    .line 36
    goto :goto_1

    .line 37
    .line 38
    :cond_1
    const-string v6, "androidx.camera.featurecombinationquery.PLAY_SERVICES_IMPL_PROVIDER_KEY"

    .line 39
    .line 40
    .line 41
    invoke-virtual {v5, v6}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 42
    move-result-object v5

    .line 43
    .line 44
    if-eqz v5, :cond_3

    .line 45
    .line 46
    if-nez v4, :cond_2

    .line 47
    move-object v4, v5

    .line 48
    goto :goto_1

    .line 49
    .line 50
    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 51
    .line 52
    const-string v1, "Multiple Play Services CameraDeviceSetupCompat implementations found in the manifest."

    .line 53
    .line 54
    .line 55
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 56
    throw v0

    .line 57
    .line 58
    :cond_3
    :goto_1
    add-int/lit8 v3, v3, 0x1

    .line 59
    goto :goto_0

    .line 60
    .line 61
    :cond_4
    if-nez v4, :cond_5

    .line 62
    return-object v0

    .line 63
    .line 64
    .line 65
    :cond_5
    invoke-direct {p0, v4}, Landroidx/camera/featurecombinationquery/CameraDeviceSetupCompatFactory;->instantiatePlayServicesImplProvider(Ljava/lang/String;)Landroidx/camera/featurecombinationquery/CameraDeviceSetupCompatProvider;

    .line 66
    move-result-object v0

    .line 67
    :catch_0
    return-object v0
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
.end method

.method private instantiatePlayServicesImplProvider(Ljava/lang/String;)Landroidx/camera/featurecombinationquery/CameraDeviceSetupCompatProvider;
    .locals 2

    .line 1
    .line 2
    .line 3
    :try_start_0
    invoke-static {p1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 4
    move-result-object p1

    .line 5
    .line 6
    const-class v0, Landroid/content/Context;

    .line 7
    .line 8
    .line 9
    filled-new-array {v0}, [Ljava/lang/Class;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1, v0}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 14
    move-result-object p1

    .line 15
    .line 16
    iget-object v0, p0, Landroidx/camera/featurecombinationquery/CameraDeviceSetupCompatFactory;->mContext:Landroid/content/Context;

    .line 17
    .line 18
    .line 19
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 20
    move-result-object v0

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1, v0}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    move-result-object p1

    .line 25
    .line 26
    check-cast p1, Landroidx/camera/featurecombinationquery/CameraDeviceSetupCompatProvider;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 27
    return-object p1

    .line 28
    :catch_0
    move-exception p1

    .line 29
    .line 30
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 31
    .line 32
    const-string v1, "Failed to instantiate Play Services CameraDeviceSetupCompat implementation"

    .line 33
    .line 34
    .line 35
    invoke-direct {v0, v1, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 36
    throw v0
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
    new-instance v0, Ljava/util/ArrayList;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 6
    .line 7
    iget-object v1, p0, Landroidx/camera/featurecombinationquery/CameraDeviceSetupCompatFactory;->mPlayServicesProvider:Landroidx/camera/featurecombinationquery/CameraDeviceSetupCompatProvider;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    .line 12
    invoke-interface {v1, p1}, Landroidx/camera/featurecombinationquery/CameraDeviceSetupCompatProvider;->getCameraDeviceSetupCompat(Ljava/lang/String;)Landroidx/camera/featurecombinationquery/CameraDeviceSetupCompat;

    .line 13
    move-result-object v1

    .line 14
    .line 15
    .line 16
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 17
    .line 18
    :cond_0
    iget-object v1, p0, Landroidx/camera/featurecombinationquery/CameraDeviceSetupCompatFactory;->mCamera2Provider:Landroidx/camera/featurecombinationquery/CameraDeviceSetupCompatProvider;

    .line 19
    .line 20
    if-eqz v1, :cond_1

    .line 21
    .line 22
    .line 23
    :try_start_0
    invoke-interface {v1, p1}, Landroidx/camera/featurecombinationquery/CameraDeviceSetupCompatProvider;->getCameraDeviceSetupCompat(Ljava/lang/String;)Landroidx/camera/featurecombinationquery/CameraDeviceSetupCompat;

    .line 24
    move-result-object p1

    .line 25
    .line 26
    .line 27
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_0 .. :try_end_0} :catch_0

    .line 28
    .line 29
    :catch_0
    :cond_1
    new-instance p1, Landroidx/camera/featurecombinationquery/AggregatedCameraDeviceSetupCompat;

    .line 30
    .line 31
    .line 32
    invoke-direct {p1, v0}, Landroidx/camera/featurecombinationquery/AggregatedCameraDeviceSetupCompat;-><init>(Ljava/util/List;)V

    .line 33
    return-object p1
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
.end method
