.class public Lcom/tencent/bugly/proguard/t4;
.super Lcom/tencent/rmonitor/base/plugin/monitor/QAPMScenePlugin;
.source "BUGLY"

# interfaces
.implements Lcom/tencent/bugly/proguard/i;


# annotations
.annotation build Landroid/annotation/TargetApi;
    value = 0x10
.end annotation


# static fields
.field public static final g:Ljava/lang/String; = "RMonitor_looper_metric"


# instance fields
.field public b:Z

.field public final c:Lcom/tencent/bugly/proguard/j;

.field public final d:Lcom/tencent/bugly/proguard/nc;

.field public e:Lcom/tencent/bugly/proguard/jb;

.field public f:Lcom/tencent/bugly/proguard/hb;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/tencent/rmonitor/base/plugin/monitor/QAPMScenePlugin;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/tencent/bugly/proguard/t4;->b:Z

    .line 3
    new-instance v0, Lcom/tencent/bugly/proguard/j;

    invoke-direct {v0, p0}, Lcom/tencent/bugly/proguard/j;-><init>(Lcom/tencent/bugly/proguard/i;)V

    iput-object v0, p0, Lcom/tencent/bugly/proguard/t4;->c:Lcom/tencent/bugly/proguard/j;

    const/4 v0, 0x0

    .line 4
    iput-object v0, p0, Lcom/tencent/bugly/proguard/t4;->e:Lcom/tencent/bugly/proguard/jb;

    .line 5
    iput-object v0, p0, Lcom/tencent/bugly/proguard/t4;->f:Lcom/tencent/bugly/proguard/hb;

    .line 6
    new-instance v0, Lcom/tencent/bugly/proguard/jb;

    invoke-direct {v0}, Lcom/tencent/bugly/proguard/jb;-><init>()V

    iput-object v0, p0, Lcom/tencent/bugly/proguard/t4;->e:Lcom/tencent/bugly/proguard/jb;

    .line 7
    new-instance v1, Lcom/tencent/bugly/proguard/nc;

    invoke-direct {v1, v0}, Lcom/tencent/bugly/proguard/nc;-><init>(Lcom/tencent/bugly/proguard/j9;)V

    iput-object v1, p0, Lcom/tencent/bugly/proguard/t4;->d:Lcom/tencent/bugly/proguard/nc;

    return-void
.end method

.method public constructor <init>(Lcom/tencent/bugly/proguard/nc;)V
    .locals 1

    .line 8
    invoke-direct {p0}, Lcom/tencent/rmonitor/base/plugin/monitor/QAPMScenePlugin;-><init>()V

    const/4 v0, 0x0

    .line 9
    iput-boolean v0, p0, Lcom/tencent/bugly/proguard/t4;->b:Z

    .line 10
    new-instance v0, Lcom/tencent/bugly/proguard/j;

    invoke-direct {v0, p0}, Lcom/tencent/bugly/proguard/j;-><init>(Lcom/tencent/bugly/proguard/i;)V

    iput-object v0, p0, Lcom/tencent/bugly/proguard/t4;->c:Lcom/tencent/bugly/proguard/j;

    const/4 v0, 0x0

    .line 11
    iput-object v0, p0, Lcom/tencent/bugly/proguard/t4;->e:Lcom/tencent/bugly/proguard/jb;

    .line 12
    iput-object v0, p0, Lcom/tencent/bugly/proguard/t4;->f:Lcom/tencent/bugly/proguard/hb;

    .line 13
    iput-object p1, p0, Lcom/tencent/bugly/proguard/t4;->d:Lcom/tencent/bugly/proguard/nc;

    return-void
.end method

.method public static synthetic a(Lcom/tencent/bugly/proguard/t4;)Lcom/tencent/bugly/proguard/nc;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/tencent/bugly/proguard/t4;->d:Lcom/tencent/bugly/proguard/nc;

    return-object p0
.end method


# virtual methods
.method public final a()V
    .locals 4

    .line 3
    invoke-static {}, Lcom/tencent/bugly/proguard/g;->h()Lcom/tencent/bugly/proguard/g;

    move-result-object v0

    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/g;->g()Ljava/lang/String;

    move-result-object v0

    .line 4
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 5
    new-instance v1, Lcom/tencent/bugly/proguard/t4$a;

    invoke-direct {v1, p0, v0}, Lcom/tencent/bugly/proguard/t4$a;-><init>(Lcom/tencent/bugly/proguard/t4;Ljava/lang/String;)V

    const-wide/16 v2, 0x0

    invoke-static {v1, v2, v3}, Lcom/tencent/bugly/common/thread/ThreadManager;->runInMainThread(Ljava/lang/Runnable;J)V

    :cond_0
    return-void
.end method

.method public a(Lcom/tencent/bugly/proguard/jf;)V
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/t4;->d:Lcom/tencent/bugly/proguard/nc;

    invoke-virtual {v0, p1}, Lcom/tencent/bugly/proguard/nc;->a(Lcom/tencent/bugly/proguard/jf;)V

    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 2

    .line 6
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/t4;->b()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 7
    :cond_0
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {v0}, Lcom/tencent/bugly/proguard/ah;->a(Landroid/os/Looper;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 8
    iget-object v0, p0, Lcom/tencent/bugly/proguard/t4;->d:Lcom/tencent/bugly/proguard/nc;

    invoke-virtual {v0, p1}, Lcom/tencent/bugly/proguard/nc;->a(Ljava/lang/String;)V

    return-void

    .line 9
    :cond_1
    new-instance p1, Lcom/tencent/bugly/proguard/t4$d;

    invoke-direct {p1, p0}, Lcom/tencent/bugly/proguard/t4$d;-><init>(Lcom/tencent/bugly/proguard/t4;)V

    const-wide/16 v0, 0x0

    invoke-static {p1, v0, v1}, Lcom/tencent/bugly/common/thread/ThreadManager;->runInMainThread(Ljava/lang/Runnable;J)V

    return-void
.end method

.method public final b()Z
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/t4;->d()Lcom/tencent/bugly/proguard/hb;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget-boolean v0, v0, Lcom/tencent/bugly/proguard/hb;->o:Z

    .line 9
    return v0

    .line 10
    :cond_0
    const/4 v0, 0x1

    .line 11
    return v0
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public final c()Z
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/t4;->d()Lcom/tencent/bugly/proguard/hb;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget-boolean v0, v0, Lcom/tencent/bugly/proguard/hb;->n:Z

    .line 9
    return v0

    .line 10
    :cond_0
    const/4 v0, 0x1

    .line 11
    return v0
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public final d()Lcom/tencent/bugly/proguard/hb;
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/t4;->f:Lcom/tencent/bugly/proguard/hb;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    sget-object v0, Lcom/tencent/rmonitor/base/config/ConfigProxy;->INSTANCE:Lcom/tencent/rmonitor/base/config/ConfigProxy;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/tencent/rmonitor/base/config/ConfigProxy;->getConfig()Lcom/tencent/rmonitor/base/config/a;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/t4;->getPluginName()Ljava/lang/String;

    .line 14
    move-result-object v1

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1}, Lcom/tencent/rmonitor/base/config/a;->e(Ljava/lang/String;)Lcom/tencent/bugly/proguard/hf;

    .line 18
    move-result-object v0

    .line 19
    .line 20
    instance-of v1, v0, Lcom/tencent/bugly/proguard/hb;

    .line 21
    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    check-cast v0, Lcom/tencent/bugly/proguard/hb;

    .line 25
    .line 26
    iput-object v0, p0, Lcom/tencent/bugly/proguard/t4;->f:Lcom/tencent/bugly/proguard/hb;

    .line 27
    .line 28
    :cond_0
    iget-object v0, p0, Lcom/tencent/bugly/proguard/t4;->f:Lcom/tencent/bugly/proguard/hb;

    .line 29
    return-object v0
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
.end method

.method public getPluginName()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    const-string v0, "looper_metric"

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
    .line 17
.end method

.method public isRunning()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/tencent/bugly/proguard/t4;->b:Z

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
    .line 17
.end method

.method public onBackground()V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/t4;->d:Lcom/tencent/bugly/proguard/nc;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/nc;->onBackground()V

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
.end method

.method public onEnterScene(Ljava/lang/String;)V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-nez v0, :cond_2

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/t4;->isRunning()Z

    .line 10
    move-result v0

    .line 11
    .line 12
    if-eqz v0, :cond_2

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/t4;->c()Z

    .line 16
    move-result v0

    .line 17
    .line 18
    if-nez v0, :cond_0

    .line 19
    goto :goto_0

    .line 20
    .line 21
    .line 22
    :cond_0
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 23
    move-result-object v0

    .line 24
    .line 25
    .line 26
    invoke-static {v0}, Lcom/tencent/bugly/proguard/ah;->a(Landroid/os/Looper;)Z

    .line 27
    move-result v0

    .line 28
    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    iget-object v0, p0, Lcom/tencent/bugly/proguard/t4;->d:Lcom/tencent/bugly/proguard/nc;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0, p1}, Lcom/tencent/bugly/proguard/nc;->c(Ljava/lang/String;)V

    .line 35
    return-void

    .line 36
    .line 37
    :cond_1
    new-instance v0, Lcom/tencent/bugly/proguard/t4$b;

    .line 38
    .line 39
    .line 40
    invoke-direct {v0, p0, p1}, Lcom/tencent/bugly/proguard/t4$b;-><init>(Lcom/tencent/bugly/proguard/t4;Ljava/lang/String;)V

    .line 41
    .line 42
    const-wide/16 v1, 0x0

    .line 43
    .line 44
    .line 45
    invoke-static {v0, v1, v2}, Lcom/tencent/bugly/common/thread/ThreadManager;->runInMainThread(Ljava/lang/Runnable;J)V

    .line 46
    :cond_2
    :goto_0
    return-void
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
.end method

.method public onExitScene(Ljava/lang/String;)V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/t4;->c()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    return-void

    .line 8
    .line 9
    .line 10
    :cond_0
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    .line 14
    invoke-static {v0}, Lcom/tencent/bugly/proguard/ah;->a(Landroid/os/Looper;)Z

    .line 15
    move-result v0

    .line 16
    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    iget-object v0, p0, Lcom/tencent/bugly/proguard/t4;->d:Lcom/tencent/bugly/proguard/nc;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, p1}, Lcom/tencent/bugly/proguard/nc;->d(Ljava/lang/String;)V

    .line 23
    return-void

    .line 24
    .line 25
    :cond_1
    new-instance v0, Lcom/tencent/bugly/proguard/t4$c;

    .line 26
    .line 27
    .line 28
    invoke-direct {v0, p0, p1}, Lcom/tencent/bugly/proguard/t4$c;-><init>(Lcom/tencent/bugly/proguard/t4;Ljava/lang/String;)V

    .line 29
    .line 30
    const-wide/16 v1, 0x0

    .line 31
    .line 32
    .line 33
    invoke-static {v0, v1, v2}, Lcom/tencent/bugly/common/thread/ThreadManager;->runInMainThread(Ljava/lang/Runnable;J)V

    .line 34
    return-void
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
.end method

.method public onForeground()V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/t4;->d:Lcom/tencent/bugly/proguard/nc;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/nc;->onForeground()V

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
.end method

.method public start()V
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/tencent/bugly/common/utils/AndroidVersion;->isOverJellyBean()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    new-instance v0, Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/t4;->getPluginName()Ljava/lang/String;

    .line 15
    move-result-object v1

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    const-string v1, " start fail for build version is lower than jelly bean."

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 27
    move-result-object v0

    .line 28
    const/4 v1, 0x2

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0, v1, v0}, Lcom/tencent/bugly/proguard/df;->notifyStartResult(ILjava/lang/String;)V

    .line 32
    return-void

    .line 33
    .line 34
    :cond_0
    iget-boolean v0, p0, Lcom/tencent/bugly/proguard/t4;->b:Z

    .line 35
    .line 36
    const-string v1, "RMonitor_looper_metric"

    .line 37
    .line 38
    if-eqz v0, :cond_1

    .line 39
    .line 40
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 41
    .line 42
    new-instance v2, Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/t4;->getPluginName()Ljava/lang/String;

    .line 49
    move-result-object v3

    .line 50
    .line 51
    .line 52
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    const-string v3, " has start before."

    .line 55
    .line 56
    .line 57
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 61
    move-result-object v2

    .line 62
    .line 63
    .line 64
    filled-new-array {v1, v2}, [Ljava/lang/String;

    .line 65
    move-result-object v1

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0, v1}, Lcom/tencent/rmonitor/common/logger/Logger;->e([Ljava/lang/String;)V

    .line 69
    return-void

    .line 70
    .line 71
    :cond_1
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 72
    .line 73
    new-instance v2, Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 77
    .line 78
    .line 79
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/t4;->getPluginName()Ljava/lang/String;

    .line 80
    move-result-object v3

    .line 81
    .line 82
    .line 83
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    const-string v3, " start"

    .line 86
    .line 87
    .line 88
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 92
    move-result-object v2

    .line 93
    .line 94
    .line 95
    filled-new-array {v1, v2}, [Ljava/lang/String;

    .line 96
    move-result-object v1

    .line 97
    .line 98
    .line 99
    invoke-virtual {v0, v1}, Lcom/tencent/rmonitor/common/logger/Logger;->d([Ljava/lang/String;)V

    .line 100
    const/4 v0, 0x1

    .line 101
    .line 102
    iput-boolean v0, p0, Lcom/tencent/bugly/proguard/t4;->b:Z

    .line 103
    .line 104
    iget-object v0, p0, Lcom/tencent/bugly/proguard/t4;->c:Lcom/tencent/bugly/proguard/j;

    .line 105
    .line 106
    .line 107
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/j;->a()V

    .line 108
    .line 109
    .line 110
    invoke-static {}, Lcom/tencent/bugly/proguard/g;->h()Lcom/tencent/bugly/proguard/g;

    .line 111
    move-result-object v0

    .line 112
    .line 113
    .line 114
    invoke-virtual {v0, p0}, Lcom/tencent/bugly/proguard/g;->a(Lcom/tencent/bugly/proguard/r8;)V

    .line 115
    .line 116
    sget-object v0, Lcom/tencent/bugly/proguard/g;->j:Lcom/tencent/bugly/proguard/g;

    .line 117
    .line 118
    .line 119
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/g;->k()Ljava/lang/String;

    .line 120
    move-result-object v0

    .line 121
    .line 122
    .line 123
    invoke-virtual {p0, v0}, Lcom/tencent/bugly/proguard/t4;->a(Ljava/lang/String;)V

    .line 124
    .line 125
    iget-object v0, p0, Lcom/tencent/bugly/proguard/t4;->d:Lcom/tencent/bugly/proguard/nc;

    .line 126
    .line 127
    .line 128
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/t4;->d()Lcom/tencent/bugly/proguard/hb;

    .line 129
    move-result-object v1

    .line 130
    .line 131
    .line 132
    invoke-virtual {v0, v1}, Lcom/tencent/bugly/proguard/nc;->a(Lcom/tencent/bugly/proguard/hb;)V

    .line 133
    .line 134
    iget-object v0, p0, Lcom/tencent/bugly/proguard/t4;->d:Lcom/tencent/bugly/proguard/nc;

    .line 135
    .line 136
    .line 137
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/nc;->e()V

    .line 138
    .line 139
    .line 140
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/t4;->a()V

    .line 141
    const/4 v0, 0x0

    .line 142
    const/4 v1, 0x0

    .line 143
    .line 144
    .line 145
    invoke-virtual {p0, v0, v1}, Lcom/tencent/bugly/proguard/df;->notifyStartResult(ILjava/lang/String;)V

    .line 146
    .line 147
    iget-object v0, p0, Lcom/tencent/bugly/proguard/t4;->e:Lcom/tencent/bugly/proguard/jb;

    .line 148
    .line 149
    if-eqz v0, :cond_2

    .line 150
    .line 151
    .line 152
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/t4;->d()Lcom/tencent/bugly/proguard/hb;

    .line 153
    move-result-object v1

    .line 154
    .line 155
    .line 156
    invoke-virtual {v0, v1}, Lcom/tencent/bugly/proguard/jb;->a(Lcom/tencent/bugly/proguard/hb;)V

    .line 157
    :cond_2
    return-void
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
.end method

.method public stop()V
    .locals 4

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/tencent/bugly/proguard/t4;->b:Z

    .line 3
    .line 4
    const-string v1, "RMonitor_looper_metric"

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 9
    .line 10
    new-instance v2, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/t4;->getPluginName()Ljava/lang/String;

    .line 17
    move-result-object v3

    .line 18
    .line 19
    .line 20
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    const-string v3, " not start yet."

    .line 23
    .line 24
    .line 25
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    move-result-object v2

    .line 30
    .line 31
    .line 32
    filled-new-array {v1, v2}, [Ljava/lang/String;

    .line 33
    move-result-object v1

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0, v1}, Lcom/tencent/rmonitor/common/logger/Logger;->e([Ljava/lang/String;)V

    .line 37
    return-void

    .line 38
    .line 39
    :cond_0
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 40
    .line 41
    new-instance v2, Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/t4;->getPluginName()Ljava/lang/String;

    .line 48
    move-result-object v3

    .line 49
    .line 50
    .line 51
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    const-string v3, " stop"

    .line 54
    .line 55
    .line 56
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 60
    move-result-object v2

    .line 61
    .line 62
    .line 63
    filled-new-array {v1, v2}, [Ljava/lang/String;

    .line 64
    move-result-object v1

    .line 65
    .line 66
    .line 67
    invoke-virtual {v0, v1}, Lcom/tencent/rmonitor/common/logger/Logger;->d([Ljava/lang/String;)V

    .line 68
    const/4 v0, 0x0

    .line 69
    .line 70
    iput-boolean v0, p0, Lcom/tencent/bugly/proguard/t4;->b:Z

    .line 71
    .line 72
    iget-object v1, p0, Lcom/tencent/bugly/proguard/t4;->c:Lcom/tencent/bugly/proguard/j;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v1}, Lcom/tencent/bugly/proguard/j;->b()V

    .line 76
    .line 77
    .line 78
    invoke-static {}, Lcom/tencent/bugly/proguard/g;->h()Lcom/tencent/bugly/proguard/g;

    .line 79
    move-result-object v1

    .line 80
    .line 81
    .line 82
    invoke-virtual {v1, p0}, Lcom/tencent/bugly/proguard/g;->b(Lcom/tencent/bugly/proguard/r8;)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/t4;->a()V

    .line 86
    .line 87
    iget-object v1, p0, Lcom/tencent/bugly/proguard/t4;->d:Lcom/tencent/bugly/proguard/nc;

    .line 88
    .line 89
    .line 90
    invoke-virtual {v1}, Lcom/tencent/bugly/proguard/nc;->g()V

    .line 91
    const/4 v1, 0x0

    .line 92
    .line 93
    .line 94
    invoke-virtual {p0, v0, v1}, Lcom/tencent/bugly/proguard/df;->notifyStopResult(ILjava/lang/String;)V

    .line 95
    .line 96
    iget-object v0, p0, Lcom/tencent/bugly/proguard/t4;->e:Lcom/tencent/bugly/proguard/jb;

    .line 97
    .line 98
    if-eqz v0, :cond_1

    .line 99
    .line 100
    .line 101
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/jb;->b()V

    .line 102
    :cond_1
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
.end method
