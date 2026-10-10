.class public Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final JSON_VERSION:Ljava/lang/String; = "version"

.field public static final TAG:Ljava/lang/String; = "TIMPushConfig"

.field private static instance:Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;


# instance fields
.field private mAutoRegisterPush:Z

.field private mBackupChannelsEnabled:Z

.field private mContext:Landroid/content/Context;

.field private mCustomBadgeNumber:I

.field private mEnableFCMPrivateRing:Z

.field private mHaveReadPushSDKRunningPlatform:Z

.field private mLastUserID:Ljava/lang/String;

.field private mNotificationPermissionDenied:Z

.field private mPostNotificationInForeground:I

.field public mPushChannelId:I

.field private mPushSDKRunningPlatform:J

.field private mPushSDKRunningScene:I

.field private mPushStatus:I

.field private mReadJsonVersion:Ljava/lang/String;

.field private mRegisterConfigBean:Lcom/tencent/qcloud/tim/push/bean/ConfigBean;

.field private mRequestPostNotificationPermission:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
    .line 2
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

.method private constructor <init>()V
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    const/4 v0, 0x0

    .line 5
    .line 6
    iput v0, p0, Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;->mPushChannelId:I

    .line 7
    .line 8
    new-instance v1, Lcom/tencent/qcloud/tim/push/bean/ConfigBean;

    .line 9
    .line 10
    .line 11
    invoke-direct {v1}, Lcom/tencent/qcloud/tim/push/bean/ConfigBean;-><init>()V

    .line 12
    .line 13
    iput-object v1, p0, Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;->mRegisterConfigBean:Lcom/tencent/qcloud/tim/push/bean/ConfigBean;

    .line 14
    const/4 v1, 0x1

    .line 15
    .line 16
    iput-boolean v1, p0, Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;->mAutoRegisterPush:Z

    .line 17
    .line 18
    const-wide/16 v2, 0x1

    .line 19
    .line 20
    iput-wide v2, p0, Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;->mPushSDKRunningPlatform:J

    .line 21
    .line 22
    iput-boolean v0, p0, Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;->mHaveReadPushSDKRunningPlatform:Z

    .line 23
    .line 24
    iput-boolean v0, p0, Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;->mBackupChannelsEnabled:Z

    .line 25
    const/4 v2, -0x1

    .line 26
    .line 27
    iput v2, p0, Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;->mPostNotificationInForeground:I

    .line 28
    .line 29
    iput-boolean v1, p0, Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;->mRequestPostNotificationPermission:Z

    .line 30
    .line 31
    iput-boolean v0, p0, Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;->mNotificationPermissionDenied:Z

    .line 32
    .line 33
    iput v0, p0, Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;->mPushSDKRunningScene:I

    .line 34
    .line 35
    iput v2, p0, Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;->mCustomBadgeNumber:I

    .line 36
    .line 37
    iput v2, p0, Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;->mPushStatus:I

    .line 38
    return-void
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

.method public static getInstance()Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;->instance:Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    new-instance v0, Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;

    .line 7
    .line 8
    .line 9
    invoke-direct {v0}, Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;-><init>()V

    .line 10
    .line 11
    sput-object v0, Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;->instance:Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;

    .line 12
    .line 13
    :cond_0
    sget-object v0, Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;->instance:Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;

    .line 14
    return-object v0
    .line 15
    .line 16
.end method


# virtual methods
.method public canPostNotificationInForeground()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;->mPostNotificationInForeground:I

    .line 3
    return v0
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

.method public canRequestPostNotificationPermission()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;->mRequestPostNotificationPermission:Z

    .line 3
    return v0
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

.method public enableBackupChannels(Z)V
    .locals 3

    .line 1
    .line 2
    sget-object v0, Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;->TAG:Ljava/lang/String;

    .line 3
    .line 4
    new-instance v1, Ljava/lang/StringBuilder;

    .line 5
    .line 6
    .line 7
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 8
    .line 9
    const-string v2, "enableBackupChannels = "

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    move-result-object v1

    .line 20
    .line 21
    .line 22
    invoke-static {v0, v1}, Lcom/tencent/qcloud/tim/push/utils/TIMPushLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 23
    .line 24
    iput-boolean p1, p0, Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;->mBackupChannelsEnabled:Z

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

.method public enablePostNotificationInForeground(I)V
    .locals 3

    .line 1
    .line 2
    sget-object v0, Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;->TAG:Ljava/lang/String;

    .line 3
    .line 4
    new-instance v1, Ljava/lang/StringBuilder;

    .line 5
    .line 6
    .line 7
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 8
    .line 9
    const-string v2, "enablePostNotificationInForeground = "

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    move-result-object v1

    .line 20
    .line 21
    .line 22
    invoke-static {v0, v1}, Lcom/tencent/qcloud/tim/push/utils/TIMPushLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 23
    .line 24
    iput p1, p0, Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;->mPostNotificationInForeground:I

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

.method public enableRequestPostNotificationPermission(Z)V
    .locals 3

    .line 1
    .line 2
    sget-object v0, Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;->TAG:Ljava/lang/String;

    .line 3
    .line 4
    new-instance v1, Ljava/lang/StringBuilder;

    .line 5
    .line 6
    .line 7
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 8
    .line 9
    const-string v2, "enableRequestPostNotificationPermission = "

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    move-result-object v1

    .line 20
    .line 21
    .line 22
    invoke-static {v0, v1}, Lcom/tencent/qcloud/tim/push/utils/TIMPushLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 23
    .line 24
    iput-boolean p1, p0, Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;->mRequestPostNotificationPermission:Z

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

.method public getAutoRegisterPush()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;->mAutoRegisterPush:Z

    .line 3
    return v0
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

.method public getContext()Landroid/content/Context;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;->mContext:Landroid/content/Context;

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

.method public getCustomBadgeNumber()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;->mCustomBadgeNumber:I

    .line 3
    return v0
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

.method public getEnableFCMPrivateRing()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;->mEnableFCMPrivateRing:Z

    .line 3
    return v0
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

.method public getNotificationPermissionDenied()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;->mNotificationPermissionDenied:Z

    .line 3
    return v0
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

.method public getPushChannelId()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;->mPushChannelId:I

    .line 3
    return v0
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

.method public getPushStatus()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;->mPushStatus:I

    .line 3
    return v0
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

.method public getReadJsonVersion()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;->mReadJsonVersion:Ljava/lang/String;

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

.method public getRegisterConfigBean()Lcom/tencent/qcloud/tim/push/bean/ConfigBean;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;->mRegisterConfigBean:Lcom/tencent/qcloud/tim/push/bean/ConfigBean;

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

.method public getRunningPlatform()J
    .locals 4

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;->mHaveReadPushSDKRunningPlatform:Z

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iget-wide v0, p0, Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;->mPushSDKRunningPlatform:J

    .line 7
    return-wide v0

    .line 8
    :cond_0
    const/4 v0, 0x1

    .line 9
    .line 10
    iput-boolean v0, p0, Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;->mHaveReadPushSDKRunningPlatform:Z

    .line 11
    .line 12
    iget-object v0, p0, Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;->mContext:Landroid/content/Context;

    .line 13
    .line 14
    const-string v1, "tpush_preference"

    .line 15
    const/4 v2, 0x0

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 19
    move-result-object v0

    .line 20
    .line 21
    const-string v1, "preference_platform"

    .line 22
    .line 23
    const-wide/16 v2, 0x1

    .line 24
    .line 25
    .line 26
    invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    .line 27
    move-result-wide v0

    .line 28
    .line 29
    iput-wide v0, p0, Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;->mPushSDKRunningPlatform:J

    .line 30
    return-wide v0
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

.method public getRunningScene()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;->mPushSDKRunningScene:I

    .line 3
    return v0
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

.method public isBackupChannelsEnabled()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;->mBackupChannelsEnabled:Z

    .line 3
    return v0
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

.method public setAutoRegisterPush(Z)V
    .locals 0

    .line 1
    .line 2
    iput-boolean p1, p0, Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;->mAutoRegisterPush:Z

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

.method public setContext(Landroid/content/Context;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;->mContext:Landroid/content/Context;

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

.method public setCustomBadgeNumber(I)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;->mCustomBadgeNumber:I

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

.method public setEnableFCMPrivateRing(Z)V
    .locals 0

    .line 1
    .line 2
    iput-boolean p1, p0, Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;->mEnableFCMPrivateRing:Z

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

.method public setNotificationPermissionDenied(Z)V
    .locals 0

    .line 1
    .line 2
    iput-boolean p1, p0, Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;->mNotificationPermissionDenied:Z

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

.method public setPushChannelId(I)V
    .locals 1

    .line 1
    .line 2
    iput p1, p0, Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;->mPushChannelId:I

    .line 3
    .line 4
    .line 5
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 6
    move-result-object p1

    .line 7
    .line 8
    const-string v0, "pushChannelId"

    .line 9
    .line 10
    .line 11
    invoke-static {v0, p1}, Lcom/tencent/qcloud/tuicore/TUIConfig;->setCustomData(Ljava/lang/String;Ljava/lang/Object;)V

    .line 12
    return-void
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

.method public setPushStatus(I)V
    .locals 1

    .line 1
    .line 2
    iput p1, p0, Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;->mPushStatus:I

    .line 3
    .line 4
    .line 5
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 6
    move-result-object p1

    .line 7
    .line 8
    const-string v0, "pushStatus"

    .line 9
    .line 10
    .line 11
    invoke-static {v0, p1}, Lcom/tencent/qcloud/tuicore/TUIConfig;->setCustomData(Ljava/lang/String;Ljava/lang/Object;)V

    .line 12
    return-void
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

.method public setReadJsonVersion(Ljava/lang/String;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;->mReadJsonVersion:Ljava/lang/String;

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

.method public setRegisterConfigBean(Lcom/tencent/qcloud/tim/push/bean/ConfigBean;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;->mRegisterConfigBean:Lcom/tencent/qcloud/tim/push/bean/ConfigBean;

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

.method public setRunningPlatform(J)V
    .locals 3

    .line 1
    .line 2
    const-wide/16 v0, 0x1

    .line 3
    .line 4
    cmp-long v0, p1, v0

    .line 5
    .line 6
    if-ltz v0, :cond_1

    .line 7
    .line 8
    const-wide/16 v0, 0x7

    .line 9
    .line 10
    cmp-long v0, p1, v0

    .line 11
    .line 12
    if-lez v0, :cond_0

    .line 13
    goto :goto_0

    .line 14
    .line 15
    :cond_0
    sget-object v0, Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;->TAG:Ljava/lang/String;

    .line 16
    .line 17
    new-instance v1, Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 21
    .line 22
    const-string v2, "setRunningPlatform "

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 32
    move-result-object v1

    .line 33
    .line 34
    .line 35
    invoke-static {v0, v1}, Lcom/tencent/qcloud/tim/push/utils/TIMPushLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 36
    .line 37
    iput-wide p1, p0, Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;->mPushSDKRunningPlatform:J

    .line 38
    .line 39
    iget-object v0, p0, Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;->mContext:Landroid/content/Context;

    .line 40
    .line 41
    const-string v1, "tpush_preference"

    .line 42
    const/4 v2, 0x0

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 46
    move-result-object v0

    .line 47
    .line 48
    .line 49
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 50
    move-result-object v0

    .line 51
    .line 52
    const-string v1, "preference_platform"

    .line 53
    .line 54
    .line 55
    invoke-interface {v0, v1, p1, p2}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 56
    .line 57
    .line 58
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 59
    return-void

    .line 60
    .line 61
    :cond_1
    :goto_0
    sget-object v0, Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;->TAG:Ljava/lang/String;

    .line 62
    .line 63
    new-instance v1, Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 67
    .line 68
    const-string v2, "setRunningPlatform invalid param "

    .line 69
    .line 70
    .line 71
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v1, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 78
    move-result-object p1

    .line 79
    .line 80
    .line 81
    invoke-static {v0, p1}, Lcom/tencent/qcloud/tim/push/utils/TIMPushLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 82
    return-void
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

.method public setRunningScene(ILjava/lang/String;)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;->mLastUserID:Ljava/lang/String;

    .line 3
    .line 4
    .line 5
    invoke-static {v0, p2}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 6
    move-result v0

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    iput p1, p0, Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;->mPushSDKRunningScene:I

    .line 11
    goto :goto_0

    .line 12
    .line 13
    :cond_0
    iget v0, p0, Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;->mPushSDKRunningScene:I

    .line 14
    or-int/2addr p1, v0

    .line 15
    .line 16
    iput p1, p0, Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;->mPushSDKRunningScene:I

    .line 17
    .line 18
    :goto_0
    iput-object p2, p0, Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;->mLastUserID:Ljava/lang/String;

    .line 19
    return-void
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
