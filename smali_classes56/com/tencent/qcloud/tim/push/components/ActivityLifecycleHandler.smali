.class public Lcom/tencent/qcloud/tim/push/components/ActivityLifecycleHandler;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/app/Application$ActivityLifecycleCallbacks;


# static fields
.field public static final h:Ljava/lang/String; = "ActivityLifecycleHandler"

.field public static i:Z


# instance fields
.field public a:I

.field public b:Z

.field public c:Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;

.field public d:Landroid/content/Context;

.field public e:I

.field public final f:Lcom/tencent/qcloud/tim/push/interfaces/IMEventListener;

.field public final g:Lcom/tencent/qcloud/tuicore/interfaces/ITUINotification;


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

.method public constructor <init>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    const/4 v0, 0x0

    .line 5
    .line 6
    iput v0, p0, Lcom/tencent/qcloud/tim/push/components/ActivityLifecycleHandler;->a:I

    .line 7
    .line 8
    new-instance v0, Lcom/tencent/qcloud/tim/push/components/ActivityLifecycleHandler$1;

    .line 9
    .line 10
    .line 11
    invoke-direct {v0, p0}, Lcom/tencent/qcloud/tim/push/components/ActivityLifecycleHandler$1;-><init>(Lcom/tencent/qcloud/tim/push/components/ActivityLifecycleHandler;)V

    .line 12
    .line 13
    iput-object v0, p0, Lcom/tencent/qcloud/tim/push/components/ActivityLifecycleHandler;->f:Lcom/tencent/qcloud/tim/push/interfaces/IMEventListener;

    .line 14
    .line 15
    new-instance v0, Lcom/tencent/qcloud/tim/push/components/ActivityLifecycleHandler$2;

    .line 16
    .line 17
    .line 18
    invoke-direct {v0, p0}, Lcom/tencent/qcloud/tim/push/components/ActivityLifecycleHandler$2;-><init>(Lcom/tencent/qcloud/tim/push/components/ActivityLifecycleHandler;)V

    .line 19
    .line 20
    iput-object v0, p0, Lcom/tencent/qcloud/tim/push/components/ActivityLifecycleHandler;->g:Lcom/tencent/qcloud/tuicore/interfaces/ITUINotification;

    .line 21
    return-void
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


# virtual methods
.method public a(J)V
    .locals 1

    long-to-int p1, p1

    .line 4
    iput p1, p0, Lcom/tencent/qcloud/tim/push/components/ActivityLifecycleHandler;->e:I

    .line 5
    iget-object p2, p0, Lcom/tencent/qcloud/tim/push/components/ActivityLifecycleHandler;->d:Landroid/content/Context;

    new-instance v0, Lcom/tencent/qcloud/tim/push/components/ActivityLifecycleHandler$7;

    invoke-direct {v0, p0}, Lcom/tencent/qcloud/tim/push/components/ActivityLifecycleHandler$7;-><init>(Lcom/tencent/qcloud/tim/push/components/ActivityLifecycleHandler;)V

    invoke-static {p2, p1, v0}, Lcom/tencent/qcloud/tim/push/utils/TIMPushUtils;->a(Landroid/content/Context;ILcom/tencent/qcloud/tim/push/TIMPushCallback;)V

    return-void
.end method

.method public a(Landroid/content/Context;Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/tencent/qcloud/tim/push/components/ActivityLifecycleHandler;->d:Landroid/content/Context;

    .line 2
    iput-object p2, p0, Lcom/tencent/qcloud/tim/push/components/ActivityLifecycleHandler;->c:Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;

    return-void
.end method

.method public a()Z
    .locals 1

    .line 3
    invoke-static {}, Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;->getInstance()Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;

    move-result-object v0

    invoke-virtual {v0}, Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;->getCustomBadgeNumber()I

    move-result v0

    if-ltz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public b()V
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;->getInstance()Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;->getRunningPlatform()J

    .line 8
    move-result-wide v0

    .line 9
    .line 10
    const-wide/16 v2, 0x3

    .line 11
    .line 12
    cmp-long v0, v0, v2

    .line 13
    .line 14
    if-nez v0, :cond_0

    .line 15
    return-void

    .line 16
    .line 17
    :cond_0
    sget-boolean v0, Lcom/tencent/qcloud/tim/push/components/ActivityLifecycleHandler;->i:Z

    .line 18
    .line 19
    if-nez v0, :cond_1

    .line 20
    .line 21
    iget-object v0, p0, Lcom/tencent/qcloud/tim/push/components/ActivityLifecycleHandler;->c:Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;

    .line 22
    .line 23
    iget v1, p0, Lcom/tencent/qcloud/tim/push/components/ActivityLifecycleHandler;->e:I

    .line 24
    .line 25
    new-instance v2, Lcom/tencent/qcloud/tim/push/components/ActivityLifecycleHandler$5;

    .line 26
    .line 27
    .line 28
    invoke-direct {v2, p0}, Lcom/tencent/qcloud/tim/push/components/ActivityLifecycleHandler$5;-><init>(Lcom/tencent/qcloud/tim/push/components/ActivityLifecycleHandler;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, v1, v2}, Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;->a(ILcom/tencent/qcloud/tim/push/TIMPushCallback;)V

    .line 32
    return-void

    .line 33
    .line 34
    :cond_1
    iget-object v0, p0, Lcom/tencent/qcloud/tim/push/components/ActivityLifecycleHandler;->c:Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;

    .line 35
    .line 36
    new-instance v1, Lcom/tencent/qcloud/tim/push/components/ActivityLifecycleHandler$6;

    .line 37
    .line 38
    .line 39
    invoke-direct {v1, p0}, Lcom/tencent/qcloud/tim/push/components/ActivityLifecycleHandler$6;-><init>(Lcom/tencent/qcloud/tim/push/components/ActivityLifecycleHandler;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, v1}, Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;->a(Lcom/tencent/qcloud/tim/push/TIMPushCallback;)V

    .line 43
    return-void
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

.method public onActivityCreated(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 2
    .param p1    # Landroid/app/Activity;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/os/Bundle;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    sget-object p1, Lcom/tencent/qcloud/tim/push/components/ActivityLifecycleHandler;->h:Ljava/lang/String;

    .line 3
    .line 4
    new-instance v0, Ljava/lang/StringBuilder;

    .line 5
    .line 6
    .line 7
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 8
    .line 9
    const-string v1, "onActivityCreated bundle: "

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    move-result-object p2

    .line 20
    .line 21
    .line 22
    invoke-static {p1, p2}, Lcom/tencent/qcloud/tim/push/utils/TIMPushLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 23
    return-void
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

.method public onActivityDestroyed(Landroid/app/Activity;)V
    .locals 0
    .param p1    # Landroid/app/Activity;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

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
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public onActivityPaused(Landroid/app/Activity;)V
    .locals 0
    .param p1    # Landroid/app/Activity;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

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
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public onActivityResumed(Landroid/app/Activity;)V
    .locals 0
    .param p1    # Landroid/app/Activity;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

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
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public onActivitySaveInstanceState(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 0
    .param p1    # Landroid/app/Activity;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/os/Bundle;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

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

.method public onActivityStarted(Landroid/app/Activity;)V
    .locals 4
    .param p1    # Landroid/app/Activity;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;->getInstance()Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;

    .line 4
    move-result-object p1

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1}, Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;->getRunningPlatform()J

    .line 8
    move-result-wide v0

    .line 9
    .line 10
    const-wide/16 v2, 0x3

    .line 11
    .line 12
    cmp-long p1, v0, v2

    .line 13
    .line 14
    if-nez p1, :cond_0

    .line 15
    return-void

    .line 16
    .line 17
    :cond_0
    iget p1, p0, Lcom/tencent/qcloud/tim/push/components/ActivityLifecycleHandler;->a:I

    .line 18
    const/4 v0, 0x1

    .line 19
    add-int/2addr p1, v0

    .line 20
    .line 21
    iput p1, p0, Lcom/tencent/qcloud/tim/push/components/ActivityLifecycleHandler;->a:I

    .line 22
    .line 23
    if-ne p1, v0, :cond_1

    .line 24
    .line 25
    iget-boolean p1, p0, Lcom/tencent/qcloud/tim/push/components/ActivityLifecycleHandler;->b:Z

    .line 26
    .line 27
    if-nez p1, :cond_1

    .line 28
    .line 29
    sget-object p1, Lcom/tencent/qcloud/tim/push/components/ActivityLifecycleHandler;->h:Ljava/lang/String;

    .line 30
    .line 31
    const-string v1, "enter foreground"

    .line 32
    .line 33
    .line 34
    invoke-static {p1, v1}, Lcom/tencent/qcloud/tim/push/utils/TIMPushLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 35
    .line 36
    iget-object p1, p0, Lcom/tencent/qcloud/tim/push/components/ActivityLifecycleHandler;->c:Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;

    .line 37
    .line 38
    new-instance v1, Lcom/tencent/qcloud/tim/push/components/ActivityLifecycleHandler$3;

    .line 39
    .line 40
    .line 41
    invoke-direct {v1, p0}, Lcom/tencent/qcloud/tim/push/components/ActivityLifecycleHandler$3;-><init>(Lcom/tencent/qcloud/tim/push/components/ActivityLifecycleHandler;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p1, v1}, Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;->a(Lcom/tencent/qcloud/tim/push/TIMPushCallback;)V

    .line 45
    .line 46
    sput-boolean v0, Lcom/tencent/qcloud/tim/push/components/ActivityLifecycleHandler;->i:Z

    .line 47
    .line 48
    iget-object p1, p0, Lcom/tencent/qcloud/tim/push/components/ActivityLifecycleHandler;->c:Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;

    .line 49
    .line 50
    iget-object v0, p0, Lcom/tencent/qcloud/tim/push/components/ActivityLifecycleHandler;->f:Lcom/tencent/qcloud/tim/push/interfaces/IMEventListener;

    .line 51
    .line 52
    .line 53
    invoke-virtual {p1, v0}, Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;->a(Lcom/tencent/qcloud/tim/push/interfaces/IMEventListener;)V

    .line 54
    .line 55
    iget-object p1, p0, Lcom/tencent/qcloud/tim/push/components/ActivityLifecycleHandler;->g:Lcom/tencent/qcloud/tuicore/interfaces/ITUINotification;

    .line 56
    .line 57
    const-string v0, "eventTotalUnreadCount"

    .line 58
    .line 59
    const-string v1, "unreadCountChanged"

    .line 60
    .line 61
    .line 62
    invoke-static {v0, v1, p1}, Lcom/tencent/qcloud/tuicore/TUICore;->registerEvent(Ljava/lang/String;Ljava/lang/String;Lcom/tencent/qcloud/tuicore/interfaces/ITUINotification;)V

    .line 63
    :cond_1
    const/4 p1, 0x0

    .line 64
    .line 65
    iput-boolean p1, p0, Lcom/tencent/qcloud/tim/push/components/ActivityLifecycleHandler;->b:Z

    .line 66
    return-void
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

.method public onActivityStopped(Landroid/app/Activity;)V
    .locals 4
    .param p1    # Landroid/app/Activity;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;->getInstance()Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;->getRunningPlatform()J

    .line 8
    move-result-wide v0

    .line 9
    .line 10
    const-wide/16 v2, 0x3

    .line 11
    .line 12
    cmp-long v0, v0, v2

    .line 13
    .line 14
    if-nez v0, :cond_0

    .line 15
    return-void

    .line 16
    .line 17
    :cond_0
    iget v0, p0, Lcom/tencent/qcloud/tim/push/components/ActivityLifecycleHandler;->a:I

    .line 18
    .line 19
    add-int/lit8 v0, v0, -0x1

    .line 20
    .line 21
    iput v0, p0, Lcom/tencent/qcloud/tim/push/components/ActivityLifecycleHandler;->a:I

    .line 22
    .line 23
    if-nez v0, :cond_2

    .line 24
    .line 25
    sget-object v0, Lcom/tencent/qcloud/tim/push/components/ActivityLifecycleHandler;->h:Ljava/lang/String;

    .line 26
    .line 27
    const-string v1, "enter background"

    .line 28
    .line 29
    .line 30
    invoke-static {v0, v1}, Lcom/tencent/qcloud/tim/push/utils/TIMPushLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 31
    .line 32
    iget v0, p0, Lcom/tencent/qcloud/tim/push/components/ActivityLifecycleHandler;->e:I

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0}, Lcom/tencent/qcloud/tim/push/components/ActivityLifecycleHandler;->a()Z

    .line 36
    move-result v1

    .line 37
    .line 38
    if-eqz v1, :cond_1

    .line 39
    .line 40
    .line 41
    invoke-static {}, Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;->getInstance()Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;

    .line 42
    move-result-object v0

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0}, Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;->getCustomBadgeNumber()I

    .line 46
    move-result v0

    .line 47
    .line 48
    :cond_1
    iget-object v1, p0, Lcom/tencent/qcloud/tim/push/components/ActivityLifecycleHandler;->c:Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;

    .line 49
    .line 50
    new-instance v2, Lcom/tencent/qcloud/tim/push/components/ActivityLifecycleHandler$4;

    .line 51
    .line 52
    .line 53
    invoke-direct {v2, p0}, Lcom/tencent/qcloud/tim/push/components/ActivityLifecycleHandler$4;-><init>(Lcom/tencent/qcloud/tim/push/components/ActivityLifecycleHandler;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v1, v0, v2}, Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;->a(ILcom/tencent/qcloud/tim/push/TIMPushCallback;)V

    .line 57
    const/4 v0, 0x0

    .line 58
    .line 59
    sput-boolean v0, Lcom/tencent/qcloud/tim/push/components/ActivityLifecycleHandler;->i:Z

    .line 60
    .line 61
    iget-object v0, p0, Lcom/tencent/qcloud/tim/push/components/ActivityLifecycleHandler;->c:Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0}, Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;->f()V

    .line 65
    .line 66
    iget-object v0, p0, Lcom/tencent/qcloud/tim/push/components/ActivityLifecycleHandler;->g:Lcom/tencent/qcloud/tuicore/interfaces/ITUINotification;

    .line 67
    .line 68
    const-string v1, "eventTotalUnreadCount"

    .line 69
    .line 70
    const-string v2, "unreadCountChanged"

    .line 71
    .line 72
    .line 73
    invoke-static {v1, v2, v0}, Lcom/tencent/qcloud/tuicore/TUICore;->unRegisterEvent(Ljava/lang/String;Ljava/lang/String;Lcom/tencent/qcloud/tuicore/interfaces/ITUINotification;)V

    .line 74
    .line 75
    .line 76
    :cond_2
    invoke-virtual {p1}, Landroid/app/Activity;->isChangingConfigurations()Z

    .line 77
    move-result p1

    .line 78
    .line 79
    iput-boolean p1, p0, Lcom/tencent/qcloud/tim/push/components/ActivityLifecycleHandler;->b:Z

    .line 80
    return-void
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
