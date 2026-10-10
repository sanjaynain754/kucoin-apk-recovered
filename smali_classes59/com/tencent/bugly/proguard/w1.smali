.class public Lcom/tencent/bugly/proguard/w1;
.super Landroid/content/BroadcastReceiver;
.source "BUGLY"


# static fields
.field public static e:Lcom/tencent/bugly/proguard/w1;


# instance fields
.field public a:Landroid/content/IntentFilter;

.field public b:Landroid/content/Context;

.field public c:Ljava/lang/String;

.field public d:Z


# direct methods
.method public static constructor <clinit>()V
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
    .line 17
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    .line 4
    const/4 v0, 0x1

    .line 5
    .line 6
    iput-boolean v0, p0, Lcom/tencent/bugly/proguard/w1;->d:Z

    .line 7
    .line 8
    new-instance v0, Landroid/content/IntentFilter;

    .line 9
    .line 10
    .line 11
    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    .line 12
    .line 13
    iput-object v0, p0, Lcom/tencent/bugly/proguard/w1;->a:Landroid/content/IntentFilter;

    .line 14
    return-void
    .line 15
    .line 16
    .line 17
.end method

.method public static synthetic a(Lcom/tencent/bugly/proguard/w1;)Landroid/content/IntentFilter;
    .locals 0

    .line 2
    iget-object p0, p0, Lcom/tencent/bugly/proguard/w1;->a:Landroid/content/IntentFilter;

    return-object p0
.end method

.method public static synthetic a()Lcom/tencent/bugly/proguard/w1;
    .locals 1

    .line 1
    sget-object v0, Lcom/tencent/bugly/proguard/w1;->e:Lcom/tencent/bugly/proguard/w1;

    return-object v0
.end method

.method public static synthetic b(Lcom/tencent/bugly/proguard/w1;)Landroid/content/Context;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/tencent/bugly/proguard/w1;->b:Landroid/content/Context;

    return-object p0
.end method

.method public static declared-synchronized b()Lcom/tencent/bugly/proguard/w1;
    .locals 2

    const-class v0, Lcom/tencent/bugly/proguard/w1;

    monitor-enter v0

    .line 2
    :try_start_0
    sget-object v1, Lcom/tencent/bugly/proguard/w1;->e:Lcom/tencent/bugly/proguard/w1;

    if-nez v1, :cond_0

    .line 3
    new-instance v1, Lcom/tencent/bugly/proguard/w1;

    invoke-direct {v1}, Lcom/tencent/bugly/proguard/w1;-><init>()V

    sput-object v1, Lcom/tencent/bugly/proguard/w1;->e:Lcom/tencent/bugly/proguard/w1;

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    .line 4
    :cond_0
    :goto_0
    sget-object v1, Lcom/tencent/bugly/proguard/w1;->e:Lcom/tencent/bugly/proguard/w1;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method


# virtual methods
.method public declared-synchronized a(Landroid/content/Context;)V
    .locals 0

    monitor-enter p0

    .line 6
    :try_start_0
    iput-object p1, p0, Lcom/tencent/bugly/proguard/w1;->b:Landroid/content/Context;

    .line 7
    new-instance p1, Lcom/tencent/bugly/proguard/w1$a;

    invoke-direct {p1, p0, p0}, Lcom/tencent/bugly/proguard/w1$a;-><init>(Lcom/tencent/bugly/proguard/w1;Lcom/tencent/bugly/proguard/w1;)V

    invoke-static {p1}, Lcom/tencent/bugly/proguard/bi;->a(Ljava/lang/Runnable;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public declared-synchronized a(Ljava/lang/String;)V
    .locals 1

    monitor-enter p0

    .line 3
    :try_start_0
    iget-object v0, p0, Lcom/tencent/bugly/proguard/w1;->a:Landroid/content/IntentFilter;

    invoke-virtual {v0, p1}, Landroid/content/IntentFilter;->hasAction(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 4
    iget-object v0, p0, Lcom/tencent/bugly/proguard/w1;->a:Landroid/content/IntentFilter;

    invoke-virtual {v0, p1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    .line 5
    :cond_0
    :goto_0
    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    const-string v0, "add action %s"

    invoke-static {v0, p1}, Lcom/tencent/bugly/proguard/x4;->a(Ljava/lang/String;[Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final declared-synchronized a(Landroid/content/Context;Landroid/content/Intent;)Z
    .locals 8

    monitor-enter p0

    const/4 v0, 0x0

    if-eqz p1, :cond_7

    if-eqz p2, :cond_7

    .line 8
    :try_start_0
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object p2

    const-string v1, "android.net.conn.CONNECTIVITY_CHANGE"

    invoke-virtual {p2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_0

    goto/16 :goto_2

    .line 9
    :cond_0
    iget-boolean p2, p0, Lcom/tencent/bugly/proguard/w1;->d:Z

    const/4 v1, 0x1

    if-eqz p2, :cond_1

    .line 10
    iput-boolean v0, p0, Lcom/tencent/bugly/proguard/w1;->d:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return v1

    :catchall_0
    move-exception p1

    goto/16 :goto_1

    .line 11
    :cond_1
    :try_start_1
    iget-object p2, p0, Lcom/tencent/bugly/proguard/w1;->b:Landroid/content/Context;

    invoke-static {p2}, Lcom/tencent/bugly/proguard/o4;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p2

    .line 12
    const-string v2, "is Connect BC "

    invoke-static {v2, p2}, Lcom/tencent/bugly/proguard/l7;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 13
    new-array v3, v0, [Ljava/lang/Object;

    invoke-static {v2, v3}, Lcom/tencent/bugly/proguard/x4;->a(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 14
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, ""

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v3, p0, Lcom/tencent/bugly/proguard/w1;->c:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 15
    const-string v3, ""

    invoke-static {v3, p2}, Lcom/tencent/bugly/proguard/l7;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 16
    filled-new-array {v2, v3}, [Ljava/lang/Object;

    move-result-object v2

    .line 17
    sget-object v3, Lcom/tencent/rmonitor/common/logger/LogState;->INFO:Lcom/tencent/rmonitor/common/logger/LogState;

    const-string/jumbo v4, "network %s changed to %s"

    invoke-static {v3, v4, v2}, Lcom/tencent/bugly/proguard/x4;->a(Lcom/tencent/rmonitor/common/logger/LogState;Ljava/lang/String;[Ljava/lang/Object;)Z

    if-nez p2, :cond_2

    const/4 p1, 0x0

    .line 18
    iput-object p1, p0, Lcom/tencent/bugly/proguard/w1;->c:Ljava/lang/String;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return v1

    .line 19
    :cond_2
    :try_start_2
    iget-object v2, p0, Lcom/tencent/bugly/proguard/w1;->c:Ljava/lang/String;

    .line 20
    iput-object p2, p0, Lcom/tencent/bugly/proguard/w1;->c:Ljava/lang/String;

    .line 21
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    .line 22
    invoke-static {}, Lcom/tencent/bugly/proguard/pg;->b()Lcom/tencent/bugly/proguard/pg;

    move-result-object v6

    .line 23
    invoke-static {}, Lcom/tencent/bugly/proguard/rh;->d()Lcom/tencent/bugly/proguard/rh;

    move-result-object v7

    .line 24
    invoke-static {p1}, Lcom/tencent/bugly/proguard/l2;->a(Landroid/content/Context;)Lcom/tencent/bugly/proguard/l2;

    move-result-object p1

    if-eqz v6, :cond_6

    if-eqz v7, :cond_6

    if-nez p1, :cond_3

    goto :goto_0

    .line 25
    :cond_3
    invoke-virtual {p2, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    .line 26
    sget p1, Lcom/tencent/bugly/proguard/k3;->n:I

    .line 27
    invoke-virtual {v7, p1}, Lcom/tencent/bugly/proguard/rh;->c(I)J

    move-result-wide p1

    sub-long/2addr v4, p1

    const-wide/16 p1, 0x7530

    cmp-long p1, v4, p1

    if-lez p1, :cond_5

    .line 28
    new-array p1, v0, [Ljava/lang/Object;

    .line 29
    const-string/jumbo p2, "try to upload crash on network changed."

    invoke-static {v3, p2, p1}, Lcom/tencent/bugly/proguard/x4;->a(Lcom/tencent/rmonitor/common/logger/LogState;Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 30
    invoke-static {}, Lcom/tencent/bugly/proguard/k3;->l()Lcom/tencent/bugly/proguard/k3;

    move-result-object p1

    if-eqz p1, :cond_4

    const-wide/16 v4, 0x0

    .line 31
    invoke-virtual {p1, v4, v5, v0}, Lcom/tencent/bugly/proguard/k3;->a(JZ)V

    .line 32
    :cond_4
    new-array p1, v0, [Ljava/lang/Object;

    .line 33
    const-string/jumbo p2, "try to upload userinfo on network changed."

    invoke-static {v3, p2, p1}, Lcom/tencent/bugly/proguard/x4;->a(Lcom/tencent/rmonitor/common/logger/LogState;Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 34
    sget-object p1, Lcom/tencent/bugly/proguard/sa;->p:Lcom/tencent/bugly/proguard/v1;

    invoke-virtual {p1, v0}, Lcom/tencent/bugly/proguard/v1;->c(Z)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :cond_5
    monitor-exit p0

    return v1

    .line 35
    :cond_6
    :goto_0
    :try_start_3
    new-array p1, v0, [Ljava/lang/Object;

    .line 36
    sget-object p2, Lcom/tencent/rmonitor/common/logger/LogState;->WARN:Lcom/tencent/rmonitor/common/logger/LogState;

    const-string/jumbo v0, "not inited BC not work"

    invoke-static {p2, v0, p1}, Lcom/tencent/bugly/proguard/x4;->a(Lcom/tencent/rmonitor/common/logger/LogState;Ljava/lang/String;[Ljava/lang/Object;)Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    monitor-exit p0

    return v1

    :goto_1
    :try_start_4
    monitor-exit p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    throw p1

    :cond_7
    :goto_2
    monitor-exit p0

    return v0
.end method

.method public declared-synchronized b(Landroid/content/Context;)V
    .locals 3

    monitor-enter p0

    .line 5
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-string v1, "Unregister broadcast receiver of Bugly."

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v0, v1, v2}, Lcom/tencent/bugly/proguard/x4;->c(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 6
    invoke-virtual {p1, p0}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 7
    iput-object p1, p0, Lcom/tencent/bugly/proguard/w1;->b:Landroid/content/Context;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    .line 8
    :try_start_1
    invoke-static {p1}, Lcom/tencent/bugly/proguard/x4;->b(Ljava/lang/Throwable;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 9
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit p0

    return-void

    :goto_1
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw p1
.end method

.method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    :try_start_0
    invoke-virtual {p0, p1, p2}, Lcom/tencent/bugly/proguard/w1;->a(Landroid/content/Context;Landroid/content/Intent;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 4
    return-void

    .line 5
    :catchall_0
    move-exception p1

    .line 6
    .line 7
    .line 8
    invoke-static {p1}, Lcom/tencent/bugly/proguard/x4;->b(Ljava/lang/Throwable;)Z

    .line 9
    move-result p2

    .line 10
    .line 11
    if-nez p2, :cond_0

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 15
    :cond_0
    return-void
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
.end method
