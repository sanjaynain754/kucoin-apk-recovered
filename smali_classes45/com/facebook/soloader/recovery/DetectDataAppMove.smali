.class public Lcom/facebook/soloader/recovery/DetectDataAppMove;
.super Ljava/lang/Object;
.source "DetectDataAppMove.java"

# interfaces
.implements Lcom/facebook/soloader/recovery/RecoveryStrategy;


# static fields
.field private static final TAG:Ljava/lang/String; = "soloader.recovery.DetectDataAppMove"


# instance fields
.field private final mBaseApkPathHistory:Lcom/facebook/soloader/recovery/BaseApkPathHistory;

.field private final mContext:Landroid/content/Context;

.field private final mInitialHistorySize:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/facebook/soloader/recovery/BaseApkPathHistory;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Lcom/facebook/soloader/recovery/DetectDataAppMove;->mContext:Landroid/content/Context;

    .line 6
    .line 7
    iput-object p2, p0, Lcom/facebook/soloader/recovery/DetectDataAppMove;->mBaseApkPathHistory:Lcom/facebook/soloader/recovery/BaseApkPathHistory;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p2}, Lcom/facebook/soloader/recovery/BaseApkPathHistory;->size()I

    .line 11
    move-result p1

    .line 12
    .line 13
    iput p1, p0, Lcom/facebook/soloader/recovery/DetectDataAppMove;->mInitialHistorySize:I

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

.method private detectMove()Z
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/facebook/soloader/recovery/DetectDataAppMove;->getBaseApkPath()Ljava/lang/String;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    new-instance v1, Ljava/io/File;

    .line 7
    .line 8
    .line 9
    invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    .line 13
    move-result v1

    .line 14
    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    iget-object v1, p0, Lcom/facebook/soloader/recovery/DetectDataAppMove;->mBaseApkPathHistory:Lcom/facebook/soloader/recovery/BaseApkPathHistory;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1, v0}, Lcom/facebook/soloader/recovery/BaseApkPathHistory;->recordPathIfNew(Ljava/lang/String;)Z

    .line 21
    move-result v0

    .line 22
    .line 23
    if-eqz v0, :cond_0

    .line 24
    const/4 v0, 0x1

    .line 25
    return v0

    .line 26
    :cond_0
    const/4 v0, 0x0

    .line 27
    return v0
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
.end method

.method private getBaseApkPath()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/soloader/recovery/DetectDataAppMove;->mContext:Landroid/content/Context;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    iget-object v0, v0, Landroid/content/pm/ApplicationInfo;->sourceDir:Ljava/lang/String;

    .line 9
    return-object v0
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method private recoverSoSources([Lcom/facebook/soloader/SoSource;)V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    array-length v1, p1

    .line 3
    .line 4
    if-ge v0, v1, :cond_1

    .line 5
    .line 6
    aget-object v1, p1, v0

    .line 7
    .line 8
    instance-of v2, v1, Lcom/facebook/soloader/RecoverableSoSource;

    .line 9
    .line 10
    if-eqz v2, :cond_0

    .line 11
    .line 12
    check-cast v1, Lcom/facebook/soloader/RecoverableSoSource;

    .line 13
    .line 14
    iget-object v2, p0, Lcom/facebook/soloader/recovery/DetectDataAppMove;->mContext:Landroid/content/Context;

    .line 15
    .line 16
    .line 17
    invoke-interface {v1, v2}, Lcom/facebook/soloader/RecoverableSoSource;->recover(Landroid/content/Context;)Lcom/facebook/soloader/SoSource;

    .line 18
    move-result-object v1

    .line 19
    .line 20
    aput-object v1, p1, v0

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
.method public recover(Ljava/lang/UnsatisfiedLinkError;[Lcom/facebook/soloader/SoSource;)Z
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/facebook/soloader/recovery/DetectDataAppMove;->detectMove()Z

    .line 4
    move-result p1

    .line 5
    const/4 v0, 0x1

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    .line 10
    invoke-direct {p0, p2}, Lcom/facebook/soloader/recovery/DetectDataAppMove;->recoverSoSources([Lcom/facebook/soloader/SoSource;)V

    .line 11
    return v0

    .line 12
    .line 13
    :cond_0
    iget p1, p0, Lcom/facebook/soloader/recovery/DetectDataAppMove;->mInitialHistorySize:I

    .line 14
    .line 15
    iget-object p2, p0, Lcom/facebook/soloader/recovery/DetectDataAppMove;->mBaseApkPathHistory:Lcom/facebook/soloader/recovery/BaseApkPathHistory;

    .line 16
    .line 17
    .line 18
    invoke-virtual {p2}, Lcom/facebook/soloader/recovery/BaseApkPathHistory;->size()I

    .line 19
    move-result p2

    .line 20
    .line 21
    if-eq p1, p2, :cond_1

    .line 22
    .line 23
    .line 24
    const-string/jumbo p1, "soloader.recovery.DetectDataAppMove"

    .line 25
    .line 26
    const-string p2, "Context was updated (perhaps by another thread)"

    .line 27
    .line 28
    .line 29
    invoke-static {p1, p2}, Lcom/facebook/soloader/LogUtil;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 30
    return v0

    .line 31
    :cond_1
    const/4 p1, 0x0

    .line 32
    return p1
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
