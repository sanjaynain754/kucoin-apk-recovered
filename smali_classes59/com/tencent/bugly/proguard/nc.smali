.class public Lcom/tencent/bugly/proguard/nc;
.super Ljava/lang/Object;
.source "BUGLY"

# interfaces
.implements Lcom/tencent/bugly/proguard/i;


# static fields
.field public static final l:Ljava/lang/String; = "RMonitor_looper_metric"


# instance fields
.field public final b:Lcom/tencent/bugly/proguard/j9;

.field public c:Lcom/tencent/bugly/proguard/kc;

.field public d:J

.field public e:Z

.field public f:Ljava/lang/String;

.field public g:Ljava/lang/String;

.field public h:Z

.field public i:Lcom/tencent/bugly/proguard/jf;

.field public j:J

.field public final k:Ljava/lang/Runnable;


# direct methods
.method public constructor <init>(Lcom/tencent/bugly/proguard/j9;)V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    const-wide/16 v0, 0xc8

    .line 6
    .line 7
    iput-wide v0, p0, Lcom/tencent/bugly/proguard/nc;->d:J

    .line 8
    const/4 v0, 0x0

    .line 9
    .line 10
    iput-boolean v0, p0, Lcom/tencent/bugly/proguard/nc;->e:Z

    .line 11
    const/4 v1, 0x0

    .line 12
    .line 13
    iput-object v1, p0, Lcom/tencent/bugly/proguard/nc;->f:Ljava/lang/String;

    .line 14
    .line 15
    iput-object v1, p0, Lcom/tencent/bugly/proguard/nc;->g:Ljava/lang/String;

    .line 16
    .line 17
    iput-boolean v0, p0, Lcom/tencent/bugly/proguard/nc;->h:Z

    .line 18
    .line 19
    iput-object v1, p0, Lcom/tencent/bugly/proguard/nc;->i:Lcom/tencent/bugly/proguard/jf;

    .line 20
    .line 21
    const-wide/16 v0, 0x0

    .line 22
    .line 23
    iput-wide v0, p0, Lcom/tencent/bugly/proguard/nc;->j:J

    .line 24
    .line 25
    new-instance v0, Lcom/tencent/bugly/proguard/nc$c;

    .line 26
    .line 27
    .line 28
    invoke-direct {v0, p0}, Lcom/tencent/bugly/proguard/nc$c;-><init>(Lcom/tencent/bugly/proguard/nc;)V

    .line 29
    .line 30
    iput-object v0, p0, Lcom/tencent/bugly/proguard/nc;->k:Ljava/lang/Runnable;

    .line 31
    .line 32
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 33
    .line 34
    const-string v1, "RMonitor_looper_metric"

    .line 35
    .line 36
    const-string v2, "MetricMonitor init"

    .line 37
    .line 38
    .line 39
    filled-new-array {v1, v2}, [Ljava/lang/String;

    .line 40
    move-result-object v1

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0, v1}, Lcom/tencent/rmonitor/common/logger/Logger;->i([Ljava/lang/String;)V

    .line 44
    .line 45
    iput-object p1, p0, Lcom/tencent/bugly/proguard/nc;->b:Lcom/tencent/bugly/proguard/j9;

    .line 46
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

.method public static synthetic a(Lcom/tencent/bugly/proguard/nc;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/nc;->f()V

    return-void
.end method

.method public static synthetic b(Lcom/tencent/bugly/proguard/nc;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/nc;->h()V

    return-void
.end method

.method public static synthetic c(Lcom/tencent/bugly/proguard/nc;)J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/tencent/bugly/proguard/nc;->j:J

    return-wide v0
.end method

.method public static synthetic d(Lcom/tencent/bugly/proguard/nc;)Lcom/tencent/bugly/proguard/kc;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/tencent/bugly/proguard/nc;->c:Lcom/tencent/bugly/proguard/kc;

    return-object p0
.end method

.method public static synthetic e(Lcom/tencent/bugly/proguard/nc;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/nc;->d()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 5

    .line 11
    iget-object v0, p0, Lcom/tencent/bugly/proguard/nc;->c:Lcom/tencent/bugly/proguard/kc;

    if-nez v0, :cond_0

    goto :goto_0

    .line 12
    :cond_0
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/kc;->b()Lcom/tencent/rmonitor/base/meta/DropFrameResultMeta;

    move-result-object v0

    iget-object v0, v0, Lcom/tencent/rmonitor/base/meta/DropFrameResultMeta;->scene:Ljava/lang/String;

    .line 13
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/nc;->c()Ljava/lang/String;

    move-result-object v1

    .line 14
    invoke-static {v0, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_1

    :goto_0
    return-void

    .line 15
    :cond_1
    sget-boolean v2, Lcom/tencent/rmonitor/common/logger/Logger;->verbos:Z

    if-eqz v2, :cond_2

    .line 16
    sget-object v2, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "changeScene, "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " --> "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "RMonitor_looper_metric"

    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/tencent/rmonitor/common/logger/Logger;->v([Ljava/lang/String;)V

    .line 17
    :cond_2
    const-string v0, "changeScene"

    invoke-virtual {p0, v0}, Lcom/tencent/bugly/proguard/nc;->b(Ljava/lang/String;)V

    return-void
.end method

.method public a(Lcom/tencent/bugly/proguard/hb;)V
    .locals 2

    if-eqz p1, :cond_0

    .line 6
    iget v0, p1, Lcom/tencent/bugly/proguard/hf;->l:I

    int-to-long v0, v0

    iput-wide v0, p0, Lcom/tencent/bugly/proguard/nc;->d:J

    .line 7
    iget-object p1, p1, Lcom/tencent/bugly/proguard/hb;->s:Ljava/lang/String;

    const-string v0, "FrameMetric"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    iput-boolean p1, p0, Lcom/tencent/bugly/proguard/nc;->e:Z

    :cond_0
    return-void
.end method

.method public a(Lcom/tencent/bugly/proguard/jf;)V
    .locals 1

    .line 3
    iget-object v0, p0, Lcom/tencent/bugly/proguard/nc;->c:Lcom/tencent/bugly/proguard/kc;

    if-eqz v0, :cond_0

    .line 4
    invoke-virtual {v0, p1}, Lcom/tencent/bugly/proguard/kc;->a(Lcom/tencent/bugly/proguard/jf;)V

    return-void

    .line 5
    :cond_0
    iput-object p1, p0, Lcom/tencent/bugly/proguard/nc;->i:Lcom/tencent/bugly/proguard/jf;

    return-void
.end method

.method public a(Lcom/tencent/bugly/proguard/kc;)V
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/tencent/bugly/proguard/nc;->c:Lcom/tencent/bugly/proguard/kc;

    return-void
.end method

.method public a(Lcom/tencent/rmonitor/base/meta/DropFrameResultMeta;Ljava/lang/String;)V
    .locals 4

    .line 18
    iget-wide v0, p1, Lcom/tencent/rmonitor/base/meta/DropFrameResultMeta;->totalDuration:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-gtz v0, :cond_0

    return-void

    .line 19
    :cond_0
    new-instance v0, Lcom/tencent/rmonitor/base/meta/DropFrameResultMeta;

    invoke-direct {v0}, Lcom/tencent/rmonitor/base/meta/DropFrameResultMeta;-><init>()V

    .line 20
    invoke-virtual {v0, p1}, Lcom/tencent/rmonitor/base/meta/DropFrameResultMeta;->copyFrom(Lcom/tencent/rmonitor/base/meta/DropFrameResultMeta;)V

    .line 21
    iget-object p1, p0, Lcom/tencent/bugly/proguard/nc;->b:Lcom/tencent/bugly/proguard/j9;

    invoke-interface {p1, v0, p2}, Lcom/tencent/bugly/proguard/j9;->a(Lcom/tencent/rmonitor/base/meta/DropFrameResultMeta;Ljava/lang/String;)V

    .line 22
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide p1

    iput-wide p1, p0, Lcom/tencent/bugly/proguard/nc;->j:J

    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 1

    .line 8
    iget-object v0, p0, Lcom/tencent/bugly/proguard/nc;->f:Ljava/lang/String;

    invoke-static {v0, p1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 9
    :cond_0
    iput-object p1, p0, Lcom/tencent/bugly/proguard/nc;->f:Ljava/lang/String;

    .line 10
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/nc;->a()V

    return-void
.end method

.method public final b()Lcom/tencent/bugly/proguard/kc;
    .locals 5
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    .line 2
    iget-boolean v0, p0, Lcom/tencent/bugly/proguard/nc;->e:Z

    const-string v1, "RMonitor_looper_metric"

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/tencent/bugly/common/utils/AndroidVersion;->isOverO()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    new-instance v0, Lcom/tencent/bugly/proguard/mc;

    invoke-direct {v0}, Lcom/tencent/bugly/proguard/mc;-><init>()V

    .line 4
    sget-object v3, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    const-string v4, "collector use FrameMetric"

    filled-new-array {v1, v4}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Lcom/tencent/rmonitor/common/logger/Logger;->d([Ljava/lang/String;)V

    goto :goto_0

    .line 5
    :cond_0
    invoke-static {}, Lcom/tencent/bugly/common/utils/AndroidVersion;->isOverJellyBean()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 6
    new-instance v0, Lcom/tencent/bugly/proguard/lc;

    invoke-direct {v0}, Lcom/tencent/bugly/proguard/lc;-><init>()V

    .line 7
    sget-object v3, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    const-string v4, "collector use FrameCallback"

    filled-new-array {v1, v4}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Lcom/tencent/rmonitor/common/logger/Logger;->d([Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    move-object v0, v2

    :goto_0
    if-eqz v0, :cond_2

    .line 8
    iget-object v1, p0, Lcom/tencent/bugly/proguard/nc;->i:Lcom/tencent/bugly/proguard/jf;

    invoke-virtual {v0, v1}, Lcom/tencent/bugly/proguard/kc;->a(Lcom/tencent/bugly/proguard/jf;)V

    .line 9
    iput-object v2, p0, Lcom/tencent/bugly/proguard/nc;->i:Lcom/tencent/bugly/proguard/jf;

    :cond_2
    return-object v0
.end method

.method public b(Ljava/lang/String;)V
    .locals 2

    .line 10
    iget-object v0, p0, Lcom/tencent/bugly/proguard/nc;->c:Lcom/tencent/bugly/proguard/kc;

    if-eqz v0, :cond_0

    .line 11
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/kc;->d()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 12
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/kc;->b()Lcom/tencent/rmonitor/base/meta/DropFrameResultMeta;

    move-result-object v1

    invoke-virtual {p0, v1, p1}, Lcom/tencent/bugly/proguard/nc;->a(Lcom/tencent/rmonitor/base/meta/DropFrameResultMeta;Ljava/lang/String;)V

    .line 13
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/nc;->c()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/tencent/bugly/proguard/kc;->a(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public c()Ljava/lang/String;
    .locals 2

    .line 5
    iget-object v0, p0, Lcom/tencent/bugly/proguard/nc;->g:Ljava/lang/String;

    .line 6
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 7
    iget-object v0, p0, Lcom/tencent/bugly/proguard/nc;->f:Ljava/lang/String;

    :cond_0
    if-nez v0, :cond_1

    .line 8
    const-string v0, ""

    :cond_1
    return-object v0
.end method

.method public c(Ljava/lang/String;)V
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/nc;->g:Ljava/lang/String;

    invoke-static {v0, p1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 3
    iput-object p1, p0, Lcom/tencent/bugly/proguard/nc;->g:Ljava/lang/String;

    .line 4
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/nc;->a()V

    :cond_0
    return-void
.end method

.method public final d()V
    .locals 3

    .line 5
    invoke-static {}, Lcom/tencent/bugly/proguard/m7;->c()J

    move-result-wide v0

    .line 6
    iget-object v2, p0, Lcom/tencent/bugly/proguard/nc;->k:Ljava/lang/Runnable;

    invoke-static {v2}, Lcom/tencent/bugly/common/thread/ThreadManager;->cancelFromMainThread(Ljava/lang/Runnable;)V

    .line 7
    iget-object v2, p0, Lcom/tencent/bugly/proguard/nc;->k:Ljava/lang/Runnable;

    invoke-static {v2, v0, v1}, Lcom/tencent/bugly/common/thread/ThreadManager;->runInMainThread(Ljava/lang/Runnable;J)V

    return-void
.end method

.method public d(Ljava/lang/String;)V
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/nc;->g:Ljava/lang/String;

    invoke-static {v0, p1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    .line 3
    iput-object p1, p0, Lcom/tencent/bugly/proguard/nc;->g:Ljava/lang/String;

    .line 4
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/nc;->a()V

    :cond_0
    return-void
.end method

.method public declared-synchronized e()V
    .locals 3

    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, Lcom/tencent/bugly/proguard/nc;->h:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    .line 3
    iput-boolean v0, p0, Lcom/tencent/bugly/proguard/nc;->h:Z

    .line 4
    new-instance v0, Lcom/tencent/bugly/proguard/nc$a;

    invoke-direct {v0, p0}, Lcom/tencent/bugly/proguard/nc$a;-><init>(Lcom/tencent/bugly/proguard/nc;)V

    const-wide/16 v1, 0x0

    invoke-static {v0, v1, v2}, Lcom/tencent/bugly/common/thread/ThreadManager;->runInMainThread(Ljava/lang/Runnable;J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit p0

    return-void

    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final f()V
    .locals 5

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/nc;->c:Lcom/tencent/bugly/proguard/kc;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/nc;->b()Lcom/tencent/bugly/proguard/kc;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    iput-object v0, p0, Lcom/tencent/bugly/proguard/nc;->c:Lcom/tencent/bugly/proguard/kc;

    .line 11
    .line 12
    :cond_0
    sget-object v1, Lcom/tencent/rmonitor/common/lifecycle/LifecycleCallback;->INSTANCE:Lcom/tencent/rmonitor/common/lifecycle/LifecycleCallback;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v1}, Lcom/tencent/rmonitor/common/lifecycle/LifecycleCallback;->isCurrentForeground()Z

    .line 16
    move-result v1

    .line 17
    .line 18
    sget-boolean v2, Lcom/tencent/rmonitor/common/logger/Logger;->verbos:Z

    .line 19
    .line 20
    if-eqz v2, :cond_2

    .line 21
    .line 22
    sget-object v2, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 23
    .line 24
    new-instance v3, Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    const-string/jumbo v4, "startCollect, isStart: "

    .line 28
    .line 29
    .line 30
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 31
    .line 32
    if-nez v0, :cond_1

    .line 33
    .line 34
    .line 35
    const-string/jumbo v4, "null"

    .line 36
    goto :goto_0

    .line 37
    .line 38
    .line 39
    :cond_1
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/kc;->d()Z

    .line 40
    move-result v4

    .line 41
    .line 42
    .line 43
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 44
    move-result-object v4

    .line 45
    .line 46
    .line 47
    :goto_0
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    const-string v4, ", isForeground: "

    .line 50
    .line 51
    .line 52
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 59
    move-result-object v3

    .line 60
    .line 61
    const-string v4, "RMonitor_looper_metric"

    .line 62
    .line 63
    .line 64
    filled-new-array {v4, v3}, [Ljava/lang/String;

    .line 65
    move-result-object v3

    .line 66
    .line 67
    .line 68
    invoke-virtual {v2, v3}, Lcom/tencent/rmonitor/common/logger/Logger;->v([Ljava/lang/String;)V

    .line 69
    .line 70
    :cond_2
    if-eqz v0, :cond_3

    .line 71
    .line 72
    .line 73
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/kc;->d()Z

    .line 74
    move-result v2

    .line 75
    .line 76
    if-nez v2, :cond_3

    .line 77
    .line 78
    if-eqz v1, :cond_3

    .line 79
    .line 80
    .line 81
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/nc;->c()Ljava/lang/String;

    .line 82
    move-result-object v1

    .line 83
    .line 84
    iget-wide v2, p0, Lcom/tencent/bugly/proguard/nc;->d:J

    .line 85
    .line 86
    .line 87
    invoke-virtual {v0, v1, v2, v3}, Lcom/tencent/bugly/proguard/kc;->a(Ljava/lang/String;J)Z

    .line 88
    .line 89
    .line 90
    :cond_3
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/nc;->d()V

    .line 91
    return-void
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

.method public declared-synchronized g()V
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    .line 3
    :try_start_0
    iget-boolean v0, p0, Lcom/tencent/bugly/proguard/nc;->h:Z

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    const/4 v0, 0x0

    .line 7
    .line 8
    iput-boolean v0, p0, Lcom/tencent/bugly/proguard/nc;->h:Z

    .line 9
    .line 10
    new-instance v0, Lcom/tencent/bugly/proguard/nc$b;

    .line 11
    .line 12
    .line 13
    invoke-direct {v0, p0}, Lcom/tencent/bugly/proguard/nc$b;-><init>(Lcom/tencent/bugly/proguard/nc;)V

    .line 14
    .line 15
    const-wide/16 v1, 0x0

    .line 16
    .line 17
    .line 18
    invoke-static {v0, v1, v2}, Lcom/tencent/bugly/common/thread/ThreadManager;->runInMainThread(Ljava/lang/Runnable;J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    goto :goto_0

    .line 20
    :catchall_0
    move-exception v0

    .line 21
    goto :goto_1

    .line 22
    :cond_0
    :goto_0
    monitor-exit p0

    .line 23
    return-void

    .line 24
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 25
    throw v0
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
.end method

.method public final h()V
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/nc;->c:Lcom/tencent/bugly/proguard/kc;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    goto :goto_0

    .line 6
    .line 7
    :cond_0
    sget-boolean v1, Lcom/tencent/rmonitor/common/logger/Logger;->verbos:Z

    .line 8
    .line 9
    if-eqz v1, :cond_1

    .line 10
    .line 11
    sget-object v1, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 12
    .line 13
    new-instance v2, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    const-string/jumbo v3, "stopCollect, isStart: "

    .line 17
    .line 18
    .line 19
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/kc;->d()Z

    .line 23
    move-result v3

    .line 24
    .line 25
    .line 26
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    const-string v3, ", isForeground: "

    .line 29
    .line 30
    .line 31
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    sget-object v3, Lcom/tencent/rmonitor/common/lifecycle/LifecycleCallback;->INSTANCE:Lcom/tencent/rmonitor/common/lifecycle/LifecycleCallback;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v3}, Lcom/tencent/rmonitor/common/lifecycle/LifecycleCallback;->isCurrentForeground()Z

    .line 37
    move-result v3

    .line 38
    .line 39
    .line 40
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 44
    move-result-object v2

    .line 45
    .line 46
    const-string v3, "RMonitor_looper_metric"

    .line 47
    .line 48
    .line 49
    filled-new-array {v3, v2}, [Ljava/lang/String;

    .line 50
    move-result-object v2

    .line 51
    .line 52
    .line 53
    invoke-virtual {v1, v2}, Lcom/tencent/rmonitor/common/logger/Logger;->v([Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    :cond_1
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/kc;->d()Z

    .line 57
    move-result v1

    .line 58
    .line 59
    if-eqz v1, :cond_2

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/kc;->b()Lcom/tencent/rmonitor/base/meta/DropFrameResultMeta;

    .line 63
    move-result-object v1

    .line 64
    .line 65
    .line 66
    const-string/jumbo v2, "stop"

    .line 67
    .line 68
    .line 69
    invoke-virtual {p0, v1, v2}, Lcom/tencent/bugly/proguard/nc;->a(Lcom/tencent/rmonitor/base/meta/DropFrameResultMeta;Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/kc;->g()Z

    .line 73
    :cond_2
    :goto_0
    return-void
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

.method public onBackground()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/nc;->c:Lcom/tencent/bugly/proguard/kc;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/kc;->d()Z

    .line 8
    move-result v1

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/kc;->e()Z

    .line 14
    .line 15
    :cond_0
    const-string v0, "background"

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0, v0}, Lcom/tencent/bugly/proguard/nc;->b(Ljava/lang/String;)V

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

.method public onForeground()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/nc;->c:Lcom/tencent/bugly/proguard/kc;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/kc;->d()Z

    .line 8
    move-result v1

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/kc;->f()Z

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/nc;->d()V

    .line 17
    return-void

    .line 18
    .line 19
    .line 20
    :cond_0
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/nc;->f()V

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
.end method
