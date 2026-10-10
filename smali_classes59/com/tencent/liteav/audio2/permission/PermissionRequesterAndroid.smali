.class public Lcom/tencent/liteav/audio2/permission/PermissionRequesterAndroid;
.super Lcom/tencent/liteav/audio2/permission/PermissionActivity$a;
.source "SourceFile"


# annotations
.annotation runtime Lcom/tencent/liteav/base/annotations/JNINamespace;
    value = "liteav::audio"
.end annotation


# static fields
.field private static final TAG:Ljava/lang/String; = "PermissionRequesterAndroid"

.field private static final mRequestedPermissions:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final mNativePermissionRequesterAndroid:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Ljava/util/ArrayList;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/tencent/liteav/audio2/permission/PermissionRequesterAndroid;->mRequestedPermissions:Ljava/util/List;

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
.end method

.method public constructor <init>(J)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/tencent/liteav/audio2/permission/PermissionActivity$a;-><init>()V

    .line 4
    .line 5
    iput-wide p1, p0, Lcom/tencent/liteav/audio2/permission/PermissionRequesterAndroid;->mNativePermissionRequesterAndroid:J

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

.method private handleRequestPermissionsResult([Ljava/lang/String;)V
    .locals 5

    .line 1
    array-length v0, p1

    .line 2
    const/4 v1, 0x0

    .line 3
    .line 4
    :goto_0
    if-ge v1, v0, :cond_0

    .line 5
    .line 6
    aget-object v2, p1, v1

    .line 7
    .line 8
    iget-wide v3, p0, Lcom/tencent/liteav/audio2/permission/PermissionRequesterAndroid;->mNativePermissionRequesterAndroid:J

    .line 9
    .line 10
    .line 11
    invoke-direct {p0, v2}, Lcom/tencent/liteav/audio2/permission/PermissionRequesterAndroid;->hasPermission(Ljava/lang/String;)Z

    .line 12
    move-result v2

    .line 13
    .line 14
    .line 15
    invoke-static {v3, v4, v2}, Lcom/tencent/liteav/audio2/permission/PermissionRequesterAndroid;->nativeNotifyPermissionsResultFromJava(JZ)V

    .line 16
    .line 17
    add-int/lit8 v1, v1, 0x1

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    return-void
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method

.method private hasPermission(Ljava/lang/String;)Z
    .locals 6

    .line 1
    .line 2
    const-string v0, "PermissionRequesterAndroid"

    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    .line 6
    if-eqz p1, :cond_3

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    .line 10
    move-result v3

    .line 11
    .line 12
    if-eqz v3, :cond_0

    .line 13
    goto :goto_2

    .line 14
    .line 15
    .line 16
    :cond_0
    :try_start_0
    invoke-static {}, Lcom/tencent/liteav/base/system/LiteavSystemInfo;->getSystemOSVersionInt()I

    .line 17
    move-result v3

    .line 18
    .line 19
    const/16 v4, 0x17

    .line 20
    .line 21
    if-lt v3, v4, :cond_2

    .line 22
    .line 23
    .line 24
    invoke-static {}, Lcom/tencent/liteav/base/ContextUtils;->getApplicationContext()Landroid/content/Context;

    .line 25
    move-result-object v3

    .line 26
    .line 27
    .line 28
    invoke-static {}, Landroid/os/Process;->myPid()I

    .line 29
    move-result v4

    .line 30
    .line 31
    .line 32
    invoke-static {}, Landroid/os/Process;->myUid()I

    .line 33
    move-result v5

    .line 34
    .line 35
    .line 36
    invoke-virtual {v3, p1, v4, v5}, Landroid/content/Context;->checkPermission(Ljava/lang/String;II)I

    .line 37
    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 38
    .line 39
    if-nez p1, :cond_1

    .line 40
    goto :goto_0

    .line 41
    :cond_1
    return v1

    .line 42
    :catchall_0
    move-exception p1

    .line 43
    goto :goto_1

    .line 44
    :cond_2
    :goto_0
    return v2

    .line 45
    .line 46
    :goto_1
    new-instance v3, Ljava/lang/StringBuilder;

    .line 47
    .line 48
    const-string v4, "check permission exception, "

    .line 49
    .line 50
    .line 51
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 55
    move-result-object p1

    .line 56
    .line 57
    .line 58
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 62
    move-result-object p1

    .line 63
    .line 64
    new-array v1, v1, [Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    invoke-static {v0, p1, v1}, Lcom/tencent/liteav/base/Log;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 68
    return v2

    .line 69
    .line 70
    :cond_3
    :goto_2
    const-string p1, "check permission is null."

    .line 71
    .line 72
    new-array v1, v1, [Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    invoke-static {v0, p1, v1}, Lcom/tencent/liteav/base/Log;->w(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 76
    return v2
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
.end method

.method private static native nativeNotifyPermissionsResultFromJava(JZ)V
.end method


# virtual methods
.method public onRequestPermissionsResult([Ljava/lang/String;[I)V
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1}, Lcom/tencent/liteav/audio2/permission/PermissionRequesterAndroid;->handleRequestPermissionsResult([Ljava/lang/String;)V

    .line 4
    array-length p2, p1

    .line 5
    const/4 v0, 0x0

    .line 6
    .line 7
    :goto_0
    if-ge v0, p2, :cond_1

    .line 8
    .line 9
    aget-object v1, p1, v0

    .line 10
    .line 11
    sget-object v2, Lcom/tencent/liteav/audio2/permission/PermissionRequesterAndroid;->mRequestedPermissions:Ljava/util/List;

    .line 12
    .line 13
    .line 14
    invoke-interface {v2, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 15
    move-result v3

    .line 16
    .line 17
    if-nez v3, :cond_0

    .line 18
    .line 19
    .line 20
    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 21
    .line 22
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 23
    goto :goto_0

    .line 24
    :cond_1
    return-void
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
.end method

.method public requestPermission(Ljava/lang/String;)V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    if-eqz p1, :cond_3

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    .line 7
    move-result v1

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    goto :goto_0

    .line 11
    .line 12
    .line 13
    :cond_0
    invoke-static {}, Lcom/tencent/liteav/base/system/LiteavSystemInfo;->getSystemOSVersionInt()I

    .line 14
    move-result v1

    .line 15
    .line 16
    const/16 v2, 0x17

    .line 17
    .line 18
    if-ge v1, v2, :cond_1

    .line 19
    .line 20
    .line 21
    filled-new-array {p1}, [Ljava/lang/String;

    .line 22
    move-result-object p1

    .line 23
    .line 24
    .line 25
    invoke-direct {p0, p1}, Lcom/tencent/liteav/audio2/permission/PermissionRequesterAndroid;->handleRequestPermissionsResult([Ljava/lang/String;)V

    .line 26
    return-void

    .line 27
    .line 28
    :cond_1
    sget-object v1, Lcom/tencent/liteav/audio2/permission/PermissionRequesterAndroid;->mRequestedPermissions:Ljava/util/List;

    .line 29
    .line 30
    .line 31
    invoke-interface {v1, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 32
    move-result v2

    .line 33
    .line 34
    if-eqz v2, :cond_2

    .line 35
    .line 36
    new-array p1, v0, [Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    invoke-interface {v1, p1}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 40
    move-result-object p1

    .line 41
    .line 42
    check-cast p1, [Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    invoke-direct {p0, p1}, Lcom/tencent/liteav/audio2/permission/PermissionRequesterAndroid;->handleRequestPermissionsResult([Ljava/lang/String;)V

    .line 46
    return-void

    .line 47
    .line 48
    .line 49
    :cond_2
    invoke-static {}, Lcom/tencent/liteav/base/ContextUtils;->getApplicationContext()Landroid/content/Context;

    .line 50
    move-result-object v0

    .line 51
    .line 52
    .line 53
    filled-new-array {p1}, [Ljava/lang/String;

    .line 54
    move-result-object p1

    .line 55
    .line 56
    .line 57
    invoke-static {v0, p1, p0}, Lcom/tencent/liteav/audio2/permission/PermissionActivity;->a(Landroid/content/Context;[Ljava/lang/String;Lcom/tencent/liteav/audio2/permission/PermissionActivity$a;)V

    .line 58
    return-void

    .line 59
    .line 60
    .line 61
    :cond_3
    :goto_0
    const-string/jumbo p1, "request permission is null."

    .line 62
    .line 63
    new-array v0, v0, [Ljava/lang/Object;

    .line 64
    .line 65
    const-string v1, "PermissionRequesterAndroid"

    .line 66
    .line 67
    .line 68
    invoke-static {v1, p1, v0}, Lcom/tencent/liteav/base/Log;->w(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 69
    return-void
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
.end method
