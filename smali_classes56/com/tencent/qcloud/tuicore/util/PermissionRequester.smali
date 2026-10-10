.class public final Lcom/tencent/qcloud/tuicore/util/PermissionRequester;
.super Ljava/lang/Object;
.source "PermissionRequester.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/qcloud/tuicore/util/PermissionRequester$PermissionDialogCallback;,
        Lcom/tencent/qcloud/tuicore/util/PermissionRequester$PermissionConstants;,
        Lcom/tencent/qcloud/tuicore/util/PermissionRequester$FullCallback;,
        Lcom/tencent/qcloud/tuicore/util/PermissionRequester$SimpleCallback;,
        Lcom/tencent/qcloud/tuicore/util/PermissionRequester$PermissionActivity;,
        Lcom/tencent/qcloud/tuicore/util/PermissionRequester$PermissionRequestContent;
    }
.end annotation


# static fields
.field private static final PERMISSIONS:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static applicationContext:Landroid/content/Context;

.field private static instance:Lcom/tencent/qcloud/tuicore/util/PermissionRequester;

.field private static isRequesting:Z

.field private static final permissionRequestContentMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/tencent/qcloud/tuicore/util/PermissionRequester$PermissionRequestContent;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private mCurrentRequestPermission:Ljava/lang/String;

.field private mDeniedAlert:Ljava/lang/String;

.field private mDialogCallback:Lcom/tencent/qcloud/tuicore/util/PermissionRequester$PermissionDialogCallback;

.field private mFullCallback:Lcom/tencent/qcloud/tuicore/util/PermissionRequester$FullCallback;

.field private mIconId:I

.field private mPermissions:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private mPermissionsDenied:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private mPermissionsGranted:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private mPermissionsRequest:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private mReason:Ljava/lang/String;

.field private mReasonTitle:Ljava/lang/String;

.field private mSimpleCallback:Lcom/tencent/qcloud/tuicore/util/PermissionRequester$SimpleCallback;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/tencent/qcloud/tuicore/util/PermissionRequester;->getPermissions()Ljava/util/List;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    sput-object v0, Lcom/tencent/qcloud/tuicore/util/PermissionRequester;->PERMISSIONS:Ljava/util/List;

    .line 7
    const/4 v0, 0x0

    .line 8
    .line 9
    sput-boolean v0, Lcom/tencent/qcloud/tuicore/util/PermissionRequester;->isRequesting:Z

    .line 10
    .line 11
    new-instance v0, Ljava/util/HashMap;

    .line 12
    .line 13
    .line 14
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 15
    .line 16
    sput-object v0, Lcom/tencent/qcloud/tuicore/util/PermissionRequester;->permissionRequestContentMap:Ljava/util/Map;

    .line 17
    return-void
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
.end method

.method private constructor <init>(Ljava/lang/String;)V
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 9
    .line 10
    iput-object v0, p0, Lcom/tencent/qcloud/tuicore/util/PermissionRequester;->mPermissions:Ljava/util/Set;

    .line 11
    .line 12
    iput-object p1, p0, Lcom/tencent/qcloud/tuicore/util/PermissionRequester;->mCurrentRequestPermission:Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    invoke-static {p1}, Lcom/tencent/qcloud/tuicore/util/PermissionRequester$PermissionConstants;->getPermissions(Ljava/lang/String;)[Ljava/lang/String;

    .line 16
    move-result-object p1

    .line 17
    array-length v0, p1

    .line 18
    const/4 v1, 0x0

    .line 19
    .line 20
    :goto_0
    if-ge v1, v0, :cond_1

    .line 21
    .line 22
    aget-object v2, p1, v1

    .line 23
    .line 24
    sget-object v3, Lcom/tencent/qcloud/tuicore/util/PermissionRequester;->PERMISSIONS:Ljava/util/List;

    .line 25
    .line 26
    .line 27
    invoke-interface {v3, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 28
    move-result v3

    .line 29
    .line 30
    if-eqz v3, :cond_0

    .line 31
    .line 32
    iget-object v3, p0, Lcom/tencent/qcloud/tuicore/util/PermissionRequester;->mPermissions:Ljava/util/Set;

    .line 33
    .line 34
    .line 35
    invoke-interface {v3, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 36
    .line 37
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 38
    goto :goto_0

    .line 39
    :cond_1
    return-void
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
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
.end method

.method public static synthetic access$000(Lcom/tencent/qcloud/tuicore/util/PermissionRequester;)Lcom/tencent/qcloud/tuicore/util/PermissionRequester$PermissionDialogCallback;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/tencent/qcloud/tuicore/util/PermissionRequester;->mDialogCallback:Lcom/tencent/qcloud/tuicore/util/PermissionRequester$PermissionDialogCallback;

    .line 3
    return-object p0
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

.method public static synthetic access$002(Lcom/tencent/qcloud/tuicore/util/PermissionRequester;Lcom/tencent/qcloud/tuicore/util/PermissionRequester$PermissionDialogCallback;)Lcom/tencent/qcloud/tuicore/util/PermissionRequester$PermissionDialogCallback;
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/tencent/qcloud/tuicore/util/PermissionRequester;->mDialogCallback:Lcom/tencent/qcloud/tuicore/util/PermissionRequester$PermissionDialogCallback;

    .line 3
    return-object p1
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
.end method

.method public static synthetic access$100()Lcom/tencent/qcloud/tuicore/util/PermissionRequester;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/tencent/qcloud/tuicore/util/PermissionRequester;->instance:Lcom/tencent/qcloud/tuicore/util/PermissionRequester;

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

.method public static synthetic access$200(Lcom/tencent/qcloud/tuicore/util/PermissionRequester;)Ljava/util/List;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/tencent/qcloud/tuicore/util/PermissionRequester;->mPermissionsRequest:Ljava/util/List;

    .line 3
    return-object p0
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

.method public static synthetic access$300(Lcom/tencent/qcloud/tuicore/util/PermissionRequester;Landroid/app/Activity;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1}, Lcom/tencent/qcloud/tuicore/util/PermissionRequester;->onRequestPermissionsResult(Landroid/app/Activity;)V

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
.end method

.method public static synthetic access$400(Lcom/tencent/qcloud/tuicore/util/PermissionRequester;)Ljava/lang/String;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/tencent/qcloud/tuicore/util/PermissionRequester;->mCurrentRequestPermission:Ljava/lang/String;

    .line 3
    return-object p0
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

.method public static synthetic access$500()Ljava/util/Map;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/tencent/qcloud/tuicore/util/PermissionRequester;->permissionRequestContentMap:Ljava/util/Map;

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

.method public static synthetic access$600(Lcom/tencent/qcloud/tuicore/util/PermissionRequester;)I
    .locals 0

    .line 1
    .line 2
    iget p0, p0, Lcom/tencent/qcloud/tuicore/util/PermissionRequester;->mIconId:I

    .line 3
    return p0
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

.method public static synthetic access$700(Lcom/tencent/qcloud/tuicore/util/PermissionRequester;)Ljava/lang/String;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/tencent/qcloud/tuicore/util/PermissionRequester;->mReasonTitle:Ljava/lang/String;

    .line 3
    return-object p0
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

.method public static synthetic access$800(Lcom/tencent/qcloud/tuicore/util/PermissionRequester;)Ljava/lang/String;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/tencent/qcloud/tuicore/util/PermissionRequester;->mReason:Ljava/lang/String;

    .line 3
    return-object p0
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

.method public static synthetic access$902(Z)Z
    .locals 0

    .line 1
    .line 2
    sput-boolean p0, Lcom/tencent/qcloud/tuicore/util/PermissionRequester;->isRequesting:Z

    .line 3
    return p0
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

.method private static getApplicationContext()Landroid/content/Context;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/tencent/qcloud/tuicore/util/PermissionRequester;->applicationContext:Landroid/content/Context;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-static {}, Lcom/tencent/qcloud/tuicore/TUIConfig;->getAppContext()Landroid/content/Context;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    sput-object v0, Lcom/tencent/qcloud/tuicore/util/PermissionRequester;->applicationContext:Landroid/content/Context;

    .line 11
    .line 12
    :cond_0
    sget-object v0, Lcom/tencent/qcloud/tuicore/util/PermissionRequester;->applicationContext:Landroid/content/Context;

    .line 13
    return-object v0
    .line 14
    .line 15
    .line 16
.end method

.method public static getPermissions()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-static {}, Lcom/tencent/qcloud/tuicore/util/PermissionRequester;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/tencent/qcloud/tuicore/util/PermissionRequester;->getPermissions(Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public static getPermissions(Ljava/lang/String;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 2
    invoke-static {}, Lcom/tencent/qcloud/tuicore/util/PermissionRequester;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    const/16 v1, 0x1000

    .line 3
    :try_start_0
    invoke-virtual {v0, p0, v1}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object p0

    iget-object p0, p0, Landroid/content/pm/PackageInfo;->requestedPermissions:[Ljava/lang/String;

    if-nez p0, :cond_0

    .line 4
    sget-object p0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    return-object p0

    .line 5
    :cond_0
    invoke-static {p0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    .line 6
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 7
    sget-object p0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    return-object p0
.end method

.method private getPermissionsStatus()V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/qcloud/tuicore/util/PermissionRequester;->mPermissionsRequest:Ljava/util/List;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    move-result v1

    .line 11
    .line 12
    if-eqz v1, :cond_1

    .line 13
    .line 14
    .line 15
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    move-result-object v1

    .line 17
    .line 18
    check-cast v1, Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    invoke-static {v1}, Lcom/tencent/qcloud/tuicore/util/PermissionRequester;->isGranted(Ljava/lang/String;)Z

    .line 22
    move-result v2

    .line 23
    .line 24
    if-eqz v2, :cond_0

    .line 25
    .line 26
    iget-object v2, p0, Lcom/tencent/qcloud/tuicore/util/PermissionRequester;->mPermissionsGranted:Ljava/util/List;

    .line 27
    .line 28
    .line 29
    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 30
    goto :goto_0

    .line 31
    .line 32
    :cond_0
    iget-object v2, p0, Lcom/tencent/qcloud/tuicore/util/PermissionRequester;->mPermissionsDenied:Ljava/util/List;

    .line 33
    .line 34
    .line 35
    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 36
    goto :goto_0

    .line 37
    :cond_1
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

.method private static isGranted(Ljava/lang/String;)Z
    .locals 2

    .line 3
    invoke-static {}, Lcom/tencent/qcloud/tuicore/util/TUIBuild;->getVersionInt()I

    move-result v0

    const/16 v1, 0x17

    if-lt v0, v1, :cond_1

    .line 4
    invoke-static {}, Lcom/tencent/qcloud/tuicore/util/PermissionRequester;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p0}, Landroidx/core/content/ContextCompat;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result p0

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method

.method public static varargs isGranted([Ljava/lang/String;)Z
    .locals 4

    .line 1
    array-length v0, p0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_1

    aget-object v3, p0, v2

    .line 2
    invoke-static {v3}, Lcom/tencent/qcloud/tuicore/util/PermissionRequester;->isGranted(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_0

    return v1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, 0x1

    return p0
.end method

.method private static isIntentAvailable(Landroid/content/Intent;)Z
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/tencent/qcloud/tuicore/util/PermissionRequester;->getApplicationContext()Landroid/content/Context;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    const/high16 v1, 0x10000

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, p0, v1}, Landroid/content/pm/PackageManager;->queryIntentActivities(Landroid/content/Intent;I)Ljava/util/List;

    .line 14
    move-result-object p0

    .line 15
    .line 16
    .line 17
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 18
    move-result p0

    .line 19
    .line 20
    if-lez p0, :cond_0

    .line 21
    const/4 p0, 0x1

    .line 22
    return p0

    .line 23
    :cond_0
    const/4 p0, 0x0

    .line 24
    return p0
.end method

.method public static launchAppDetailsSettings()V
    .locals 3

    .line 1
    .line 2
    new-instance v0, Landroid/content/Intent;

    .line 3
    .line 4
    const-string v1, "android.settings.APPLICATION_DETAILS_SETTINGS"

    .line 5
    .line 6
    .line 7
    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    new-instance v1, Ljava/lang/StringBuilder;

    .line 10
    .line 11
    .line 12
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 13
    .line 14
    const-string v2, "package:"

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-static {}, Lcom/tencent/qcloud/tuicore/util/PermissionRequester;->getApplicationContext()Landroid/content/Context;

    .line 21
    move-result-object v2

    .line 22
    .line 23
    .line 24
    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 25
    move-result-object v2

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 32
    move-result-object v1

    .line 33
    .line 34
    .line 35
    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 36
    move-result-object v1

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 40
    .line 41
    .line 42
    invoke-static {v0}, Lcom/tencent/qcloud/tuicore/util/PermissionRequester;->isIntentAvailable(Landroid/content/Intent;)Z

    .line 43
    move-result v1

    .line 44
    .line 45
    if-nez v1, :cond_0

    .line 46
    return-void

    .line 47
    .line 48
    .line 49
    :cond_0
    invoke-static {}, Lcom/tencent/qcloud/tuicore/util/PermissionRequester;->getApplicationContext()Landroid/content/Context;

    .line 50
    move-result-object v1

    .line 51
    .line 52
    const/high16 v2, 0x10000000

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0, v2}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 56
    move-result-object v0

    .line 57
    .line 58
    .line 59
    invoke-virtual {v1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 60
    return-void
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

.method private onRequestPermissionsResult(Landroid/app/Activity;)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/tencent/qcloud/tuicore/util/PermissionRequester;->getPermissionsStatus()V

    .line 4
    .line 5
    iget-object v0, p0, Lcom/tencent/qcloud/tuicore/util/PermissionRequester;->mPermissionsDenied:Ljava/util/List;

    .line 6
    .line 7
    .line 8
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 9
    move-result v0

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    new-instance v0, Lcom/tencent/qcloud/tuicore/util/PermissionRequester$1;

    .line 14
    .line 15
    .line 16
    invoke-direct {v0, p0}, Lcom/tencent/qcloud/tuicore/util/PermissionRequester$1;-><init>(Lcom/tencent/qcloud/tuicore/util/PermissionRequester;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0, p1, v0}, Lcom/tencent/qcloud/tuicore/util/PermissionRequester;->showPermissionDialog(Landroid/app/Activity;Lcom/tencent/qcloud/tuicore/util/PermissionRequester$PermissionDialogCallback;)V

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/4 v0, 0x0

    .line 22
    .line 23
    sput-boolean v0, Lcom/tencent/qcloud/tuicore/util/PermissionRequester;->isRequesting:Z

    .line 24
    const/4 v0, 0x0

    .line 25
    .line 26
    iput-object v0, p0, Lcom/tencent/qcloud/tuicore/util/PermissionRequester;->mDialogCallback:Lcom/tencent/qcloud/tuicore/util/PermissionRequester$PermissionDialogCallback;

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1}, Landroid/app/Activity;->finish()V

    .line 30
    .line 31
    .line 32
    :goto_0
    invoke-direct {p0}, Lcom/tencent/qcloud/tuicore/util/PermissionRequester;->requestCallback()V

    .line 33
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

.method public static permission(Ljava/lang/String;)Lcom/tencent/qcloud/tuicore/util/PermissionRequester;
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/tencent/qcloud/tuicore/util/PermissionRequester;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p0}, Lcom/tencent/qcloud/tuicore/util/PermissionRequester;-><init>(Ljava/lang/String;)V

    .line 6
    return-object v0
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

.method private requestCallback()V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/qcloud/tuicore/util/PermissionRequester;->mSimpleCallback:Lcom/tencent/qcloud/tuicore/util/PermissionRequester$SimpleCallback;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    if-eqz v0, :cond_3

    .line 6
    .line 7
    iget-object v0, p0, Lcom/tencent/qcloud/tuicore/util/PermissionRequester;->mPermissionsRequest:Ljava/util/List;

    .line 8
    .line 9
    .line 10
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 11
    move-result v0

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    iget-object v0, p0, Lcom/tencent/qcloud/tuicore/util/PermissionRequester;->mPermissions:Ljava/util/Set;

    .line 16
    .line 17
    .line 18
    invoke-interface {v0}, Ljava/util/Set;->size()I

    .line 19
    move-result v0

    .line 20
    .line 21
    iget-object v2, p0, Lcom/tencent/qcloud/tuicore/util/PermissionRequester;->mPermissionsGranted:Ljava/util/List;

    .line 22
    .line 23
    .line 24
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 25
    move-result v2

    .line 26
    .line 27
    if-ne v0, v2, :cond_0

    .line 28
    goto :goto_0

    .line 29
    .line 30
    :cond_0
    iget-object v0, p0, Lcom/tencent/qcloud/tuicore/util/PermissionRequester;->mPermissionsDenied:Ljava/util/List;

    .line 31
    .line 32
    .line 33
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 34
    move-result v0

    .line 35
    .line 36
    if-nez v0, :cond_2

    .line 37
    .line 38
    iget-object v0, p0, Lcom/tencent/qcloud/tuicore/util/PermissionRequester;->mSimpleCallback:Lcom/tencent/qcloud/tuicore/util/PermissionRequester$SimpleCallback;

    .line 39
    .line 40
    .line 41
    invoke-interface {v0}, Lcom/tencent/qcloud/tuicore/util/PermissionRequester$SimpleCallback;->onDenied()V

    .line 42
    goto :goto_1

    .line 43
    .line 44
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/tencent/qcloud/tuicore/util/PermissionRequester;->mSimpleCallback:Lcom/tencent/qcloud/tuicore/util/PermissionRequester$SimpleCallback;

    .line 45
    .line 46
    .line 47
    invoke-interface {v0}, Lcom/tencent/qcloud/tuicore/util/PermissionRequester$SimpleCallback;->onGranted()V

    .line 48
    .line 49
    :cond_2
    :goto_1
    iput-object v1, p0, Lcom/tencent/qcloud/tuicore/util/PermissionRequester;->mSimpleCallback:Lcom/tencent/qcloud/tuicore/util/PermissionRequester$SimpleCallback;

    .line 50
    .line 51
    :cond_3
    iget-object v0, p0, Lcom/tencent/qcloud/tuicore/util/PermissionRequester;->mFullCallback:Lcom/tencent/qcloud/tuicore/util/PermissionRequester$FullCallback;

    .line 52
    .line 53
    if-eqz v0, :cond_7

    .line 54
    .line 55
    iget-object v0, p0, Lcom/tencent/qcloud/tuicore/util/PermissionRequester;->mPermissionsRequest:Ljava/util/List;

    .line 56
    .line 57
    .line 58
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 59
    move-result v0

    .line 60
    .line 61
    if-eqz v0, :cond_5

    .line 62
    .line 63
    iget-object v0, p0, Lcom/tencent/qcloud/tuicore/util/PermissionRequester;->mPermissions:Ljava/util/Set;

    .line 64
    .line 65
    .line 66
    invoke-interface {v0}, Ljava/util/Set;->size()I

    .line 67
    move-result v0

    .line 68
    .line 69
    iget-object v2, p0, Lcom/tencent/qcloud/tuicore/util/PermissionRequester;->mPermissionsGranted:Ljava/util/List;

    .line 70
    .line 71
    .line 72
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 73
    move-result v2

    .line 74
    .line 75
    if-ne v0, v2, :cond_4

    .line 76
    goto :goto_2

    .line 77
    .line 78
    :cond_4
    iget-object v0, p0, Lcom/tencent/qcloud/tuicore/util/PermissionRequester;->mPermissionsDenied:Ljava/util/List;

    .line 79
    .line 80
    .line 81
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 82
    move-result v0

    .line 83
    .line 84
    if-nez v0, :cond_6

    .line 85
    .line 86
    iget-object v0, p0, Lcom/tencent/qcloud/tuicore/util/PermissionRequester;->mFullCallback:Lcom/tencent/qcloud/tuicore/util/PermissionRequester$FullCallback;

    .line 87
    .line 88
    iget-object v2, p0, Lcom/tencent/qcloud/tuicore/util/PermissionRequester;->mPermissionsDenied:Ljava/util/List;

    .line 89
    .line 90
    .line 91
    invoke-interface {v0, v2}, Lcom/tencent/qcloud/tuicore/util/PermissionRequester$FullCallback;->onDenied(Ljava/util/List;)V

    .line 92
    goto :goto_3

    .line 93
    .line 94
    :cond_5
    :goto_2
    iget-object v0, p0, Lcom/tencent/qcloud/tuicore/util/PermissionRequester;->mFullCallback:Lcom/tencent/qcloud/tuicore/util/PermissionRequester$FullCallback;

    .line 95
    .line 96
    iget-object v2, p0, Lcom/tencent/qcloud/tuicore/util/PermissionRequester;->mPermissionsGranted:Ljava/util/List;

    .line 97
    .line 98
    .line 99
    invoke-interface {v0, v2}, Lcom/tencent/qcloud/tuicore/util/PermissionRequester$FullCallback;->onGranted(Ljava/util/List;)V

    .line 100
    .line 101
    :cond_6
    :goto_3
    iput-object v1, p0, Lcom/tencent/qcloud/tuicore/util/PermissionRequester;->mFullCallback:Lcom/tencent/qcloud/tuicore/util/PermissionRequester$FullCallback;

    .line 102
    :cond_7
    return-void
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
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
.end method

.method public static setPermissionRequestContent(Ljava/lang/String;Lcom/tencent/qcloud/tuicore/util/PermissionRequester$PermissionRequestContent;)V
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/tencent/qcloud/tuicore/util/PermissionRequester;->permissionRequestContentMap:Ljava/util/Map;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0, p0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

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
.end method

.method private startPermissionActivity()V
    .locals 3
    .annotation build Landroidx/annotation/RequiresApi;
        api = 0x17
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
    iput-object v0, p0, Lcom/tencent/qcloud/tuicore/util/PermissionRequester;->mPermissionsDenied:Ljava/util/List;

    .line 8
    .line 9
    .line 10
    invoke-static {}, Lcom/tencent/qcloud/tuicore/util/PermissionRequester;->getApplicationContext()Landroid/content/Context;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    return-void

    .line 15
    .line 16
    :cond_0
    new-instance v1, Landroid/content/Intent;

    .line 17
    .line 18
    const-class v2, Lcom/tencent/qcloud/tuicore/util/PermissionRequester$PermissionActivity;

    .line 19
    .line 20
    .line 21
    invoke-direct {v1, v0, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 22
    .line 23
    const/high16 v2, 0x10000000

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1, v2}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 30
    return-void
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
.end method


# virtual methods
.method public callback(Lcom/tencent/qcloud/tuicore/util/PermissionRequester$FullCallback;)Lcom/tencent/qcloud/tuicore/util/PermissionRequester;
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/tencent/qcloud/tuicore/util/PermissionRequester;->mFullCallback:Lcom/tencent/qcloud/tuicore/util/PermissionRequester$FullCallback;

    return-object p0
.end method

.method public callback(Lcom/tencent/qcloud/tuicore/util/PermissionRequester$SimpleCallback;)Lcom/tencent/qcloud/tuicore/util/PermissionRequester;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/tencent/qcloud/tuicore/util/PermissionRequester;->mSimpleCallback:Lcom/tencent/qcloud/tuicore/util/PermissionRequester$SimpleCallback;

    return-object p0
.end method

.method public deniedAlert(Ljava/lang/String;)Lcom/tencent/qcloud/tuicore/util/PermissionRequester;
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/tencent/qcloud/tuicore/util/PermissionRequester;->mDeniedAlert:Ljava/lang/String;

    .line 3
    return-object p0
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

.method public permissionDialogCallback(Lcom/tencent/qcloud/tuicore/util/PermissionRequester$PermissionDialogCallback;)Lcom/tencent/qcloud/tuicore/util/PermissionRequester;
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/tencent/qcloud/tuicore/util/PermissionRequester;->mDialogCallback:Lcom/tencent/qcloud/tuicore/util/PermissionRequester$PermissionDialogCallback;

    .line 3
    return-object p0
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

.method public reason(Ljava/lang/String;)Lcom/tencent/qcloud/tuicore/util/PermissionRequester;
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/tencent/qcloud/tuicore/util/PermissionRequester;->mReason:Ljava/lang/String;

    .line 3
    return-object p0
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

.method public reasonIcon(I)Lcom/tencent/qcloud/tuicore/util/PermissionRequester;
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcom/tencent/qcloud/tuicore/util/PermissionRequester;->mIconId:I

    .line 3
    return-object p0
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

.method public reasonTitle(Ljava/lang/String;)Lcom/tencent/qcloud/tuicore/util/PermissionRequester;
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/tencent/qcloud/tuicore/util/PermissionRequester;->mReasonTitle:Ljava/lang/String;

    .line 3
    return-object p0
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

.method public request()V
    .locals 5

    .line 1
    .line 2
    sget-boolean v0, Lcom/tencent/qcloud/tuicore/util/PermissionRequester;->isRequesting:Z

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    return-void

    .line 6
    :cond_0
    const/4 v0, 0x1

    .line 7
    .line 8
    sput-boolean v0, Lcom/tencent/qcloud/tuicore/util/PermissionRequester;->isRequesting:Z

    .line 9
    .line 10
    sput-object p0, Lcom/tencent/qcloud/tuicore/util/PermissionRequester;->instance:Lcom/tencent/qcloud/tuicore/util/PermissionRequester;

    .line 11
    .line 12
    new-instance v0, Ljava/util/ArrayList;

    .line 13
    .line 14
    .line 15
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 16
    .line 17
    iput-object v0, p0, Lcom/tencent/qcloud/tuicore/util/PermissionRequester;->mPermissionsGranted:Ljava/util/List;

    .line 18
    .line 19
    new-instance v0, Ljava/util/ArrayList;

    .line 20
    .line 21
    .line 22
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 23
    .line 24
    iput-object v0, p0, Lcom/tencent/qcloud/tuicore/util/PermissionRequester;->mPermissionsRequest:Ljava/util/List;

    .line 25
    .line 26
    .line 27
    invoke-static {}, Lcom/tencent/qcloud/tuicore/util/TUIBuild;->getVersionInt()I

    .line 28
    move-result v0

    .line 29
    .line 30
    const/16 v1, 0x17

    .line 31
    const/4 v2, 0x0

    .line 32
    const/4 v3, 0x0

    .line 33
    .line 34
    if-ge v0, v1, :cond_1

    .line 35
    .line 36
    iget-object v0, p0, Lcom/tencent/qcloud/tuicore/util/PermissionRequester;->mPermissionsGranted:Ljava/util/List;

    .line 37
    .line 38
    iget-object v1, p0, Lcom/tencent/qcloud/tuicore/util/PermissionRequester;->mPermissions:Ljava/util/Set;

    .line 39
    .line 40
    .line 41
    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 42
    .line 43
    sput-boolean v3, Lcom/tencent/qcloud/tuicore/util/PermissionRequester;->isRequesting:Z

    .line 44
    .line 45
    .line 46
    invoke-direct {p0}, Lcom/tencent/qcloud/tuicore/util/PermissionRequester;->requestCallback()V

    .line 47
    .line 48
    iput-object v2, p0, Lcom/tencent/qcloud/tuicore/util/PermissionRequester;->mDialogCallback:Lcom/tencent/qcloud/tuicore/util/PermissionRequester$PermissionDialogCallback;

    .line 49
    return-void

    .line 50
    .line 51
    :cond_1
    iget-object v0, p0, Lcom/tencent/qcloud/tuicore/util/PermissionRequester;->mPermissions:Ljava/util/Set;

    .line 52
    .line 53
    .line 54
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 55
    move-result-object v0

    .line 56
    .line 57
    .line 58
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 59
    move-result v1

    .line 60
    .line 61
    if-eqz v1, :cond_3

    .line 62
    .line 63
    .line 64
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 65
    move-result-object v1

    .line 66
    .line 67
    check-cast v1, Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    invoke-static {v1}, Lcom/tencent/qcloud/tuicore/util/PermissionRequester;->isGranted(Ljava/lang/String;)Z

    .line 71
    move-result v4

    .line 72
    .line 73
    if-eqz v4, :cond_2

    .line 74
    .line 75
    iget-object v4, p0, Lcom/tencent/qcloud/tuicore/util/PermissionRequester;->mPermissionsGranted:Ljava/util/List;

    .line 76
    .line 77
    .line 78
    invoke-interface {v4, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 79
    goto :goto_0

    .line 80
    .line 81
    :cond_2
    iget-object v4, p0, Lcom/tencent/qcloud/tuicore/util/PermissionRequester;->mPermissionsRequest:Ljava/util/List;

    .line 82
    .line 83
    .line 84
    invoke-interface {v4, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 85
    goto :goto_0

    .line 86
    .line 87
    :cond_3
    iget-object v0, p0, Lcom/tencent/qcloud/tuicore/util/PermissionRequester;->mPermissionsRequest:Ljava/util/List;

    .line 88
    .line 89
    .line 90
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 91
    move-result v0

    .line 92
    .line 93
    if-eqz v0, :cond_4

    .line 94
    .line 95
    sput-boolean v3, Lcom/tencent/qcloud/tuicore/util/PermissionRequester;->isRequesting:Z

    .line 96
    .line 97
    .line 98
    invoke-direct {p0}, Lcom/tencent/qcloud/tuicore/util/PermissionRequester;->requestCallback()V

    .line 99
    .line 100
    iput-object v2, p0, Lcom/tencent/qcloud/tuicore/util/PermissionRequester;->mDialogCallback:Lcom/tencent/qcloud/tuicore/util/PermissionRequester$PermissionDialogCallback;

    .line 101
    return-void

    .line 102
    .line 103
    .line 104
    :cond_4
    invoke-direct {p0}, Lcom/tencent/qcloud/tuicore/util/PermissionRequester;->startPermissionActivity()V

    .line 105
    return-void
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
.end method

.method public showPermissionDialog(Landroid/app/Activity;Lcom/tencent/qcloud/tuicore/util/PermissionRequester$PermissionDialogCallback;)V
    .locals 6

    .line 1
    .line 2
    sget-object v0, Lcom/tencent/qcloud/tuicore/util/PermissionRequester;->permissionRequestContentMap:Ljava/util/Map;

    .line 3
    .line 4
    sget-object v1, Lcom/tencent/qcloud/tuicore/util/PermissionRequester;->instance:Lcom/tencent/qcloud/tuicore/util/PermissionRequester;

    .line 5
    .line 6
    iget-object v1, v1, Lcom/tencent/qcloud/tuicore/util/PermissionRequester;->mCurrentRequestPermission:Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    check-cast v0, Lcom/tencent/qcloud/tuicore/util/PermissionRequester$PermissionRequestContent;

    .line 13
    .line 14
    iget-object v1, p0, Lcom/tencent/qcloud/tuicore/util/PermissionRequester;->mDeniedAlert:Ljava/lang/String;

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    iget-object v2, v0, Lcom/tencent/qcloud/tuicore/util/PermissionRequester$PermissionRequestContent;->deniedAlert:Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 22
    move-result v2

    .line 23
    .line 24
    if-nez v2, :cond_0

    .line 25
    .line 26
    iget-object v1, v0, Lcom/tencent/qcloud/tuicore/util/PermissionRequester$PermissionRequestContent;->deniedAlert:Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    :cond_0
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 30
    move-result v0

    .line 31
    .line 32
    if-eqz v0, :cond_1

    .line 33
    .line 34
    iget-object v1, p0, Lcom/tencent/qcloud/tuicore/util/PermissionRequester;->mReason:Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    :cond_1
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 38
    move-result v0

    .line 39
    const/4 v2, 0x0

    .line 40
    .line 41
    if-eqz v0, :cond_2

    .line 42
    .line 43
    sput-boolean v2, Lcom/tencent/qcloud/tuicore/util/PermissionRequester;->isRequesting:Z

    .line 44
    .line 45
    .line 46
    invoke-virtual {p1}, Landroid/app/Activity;->finish()V

    .line 47
    .line 48
    .line 49
    invoke-interface {p2}, Lcom/tencent/qcloud/tuicore/util/PermissionRequester$PermissionDialogCallback;->onRefused()V

    .line 50
    return-void

    .line 51
    .line 52
    :cond_2
    sget v0, Lcom/tencent/qcloud/tuicore/R$layout;->permission_activity_layout:I

    .line 53
    .line 54
    .line 55
    invoke-virtual {p1, v0}, Landroid/app/Activity;->setContentView(I)V

    .line 56
    .line 57
    .line 58
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 59
    move-result-object v0

    .line 60
    .line 61
    sget v3, Lcom/tencent/qcloud/tuicore/R$layout;->permission_tip_layout:I

    .line 62
    const/4 v4, 0x0

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0, v3, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 66
    move-result-object v0

    .line 67
    .line 68
    sget v3, Lcom/tencent/qcloud/tuicore/R$id;->tips:I

    .line 69
    .line 70
    .line 71
    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 72
    move-result-object v3

    .line 73
    .line 74
    check-cast v3, Landroid/widget/TextView;

    .line 75
    .line 76
    sget v4, Lcom/tencent/qcloud/tuicore/R$id;->positive_btn:I

    .line 77
    .line 78
    .line 79
    invoke-virtual {v0, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 80
    move-result-object v4

    .line 81
    .line 82
    check-cast v4, Landroid/widget/TextView;

    .line 83
    .line 84
    sget v5, Lcom/tencent/qcloud/tuicore/R$id;->negative_btn:I

    .line 85
    .line 86
    .line 87
    invoke-virtual {v0, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 88
    move-result-object v5

    .line 89
    .line 90
    check-cast v5, Landroid/widget/TextView;

    .line 91
    .line 92
    .line 93
    invoke-virtual {v3, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 94
    .line 95
    new-instance v1, Landroid/app/AlertDialog$Builder;

    .line 96
    .line 97
    .line 98
    invoke-direct {v1, p1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v1, v0}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    .line 102
    move-result-object v0

    .line 103
    .line 104
    .line 105
    invoke-virtual {v0, v2}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;

    .line 106
    move-result-object v0

    .line 107
    .line 108
    new-instance v1, Lcom/tencent/qcloud/tuicore/util/PermissionRequester$2;

    .line 109
    .line 110
    .line 111
    invoke-direct {v1, p0}, Lcom/tencent/qcloud/tuicore/util/PermissionRequester$2;-><init>(Lcom/tencent/qcloud/tuicore/util/PermissionRequester;)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)Landroid/app/AlertDialog$Builder;

    .line 115
    move-result-object v0

    .line 116
    .line 117
    .line 118
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    .line 119
    move-result-object v0

    .line 120
    .line 121
    new-instance v1, Lcom/tencent/qcloud/tuicore/util/PermissionRequester$3;

    .line 122
    .line 123
    .line 124
    invoke-direct {v1, p0, v0, p1, p2}, Lcom/tencent/qcloud/tuicore/util/PermissionRequester$3;-><init>(Lcom/tencent/qcloud/tuicore/util/PermissionRequester;Landroid/app/Dialog;Landroid/app/Activity;Lcom/tencent/qcloud/tuicore/util/PermissionRequester$PermissionDialogCallback;)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {v4, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 128
    .line 129
    new-instance v1, Lcom/tencent/qcloud/tuicore/util/PermissionRequester$4;

    .line 130
    .line 131
    .line 132
    invoke-direct {v1, p0, v0, p1, p2}, Lcom/tencent/qcloud/tuicore/util/PermissionRequester$4;-><init>(Lcom/tencent/qcloud/tuicore/util/PermissionRequester;Landroid/app/Dialog;Landroid/app/Activity;Lcom/tencent/qcloud/tuicore/util/PermissionRequester$PermissionDialogCallback;)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {v5, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 136
    .line 137
    new-instance v1, Lcom/tencent/qcloud/tuicore/util/PermissionRequester$5;

    .line 138
    .line 139
    .line 140
    invoke-direct {v1, p0, v0, p1, p2}, Lcom/tencent/qcloud/tuicore/util/PermissionRequester$5;-><init>(Lcom/tencent/qcloud/tuicore/util/PermissionRequester;Landroid/app/Dialog;Landroid/app/Activity;Lcom/tencent/qcloud/tuicore/util/PermissionRequester$PermissionDialogCallback;)V

    .line 141
    .line 142
    .line 143
    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setOnKeyListener(Landroid/content/DialogInterface$OnKeyListener;)V

    .line 144
    .line 145
    .line 146
    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    .line 147
    .line 148
    .line 149
    invoke-virtual {v0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 150
    move-result-object p1

    .line 151
    .line 152
    new-instance p2, Landroid/graphics/drawable/ColorDrawable;

    .line 153
    .line 154
    .line 155
    invoke-direct {p2}, Landroid/graphics/drawable/ColorDrawable;-><init>()V

    .line 156
    .line 157
    .line 158
    invoke-virtual {p1, p2}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 159
    .line 160
    .line 161
    invoke-virtual {p1}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    .line 162
    move-result-object p2

    .line 163
    const/4 v0, -0x2

    .line 164
    .line 165
    iput v0, p2, Landroid/view/WindowManager$LayoutParams;->width:I

    .line 166
    .line 167
    iput v0, p2, Landroid/view/WindowManager$LayoutParams;->height:I

    .line 168
    .line 169
    .line 170
    invoke-virtual {p1, p2}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V

    .line 171
    return-void
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
.end method
