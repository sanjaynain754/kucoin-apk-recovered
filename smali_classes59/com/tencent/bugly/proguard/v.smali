.class public Lcom/tencent/bugly/proguard/v;
.super Ljava/lang/Object;
.source "BUGLY"


# static fields
.field public static final a:J = 0x1f4L

.field public static final b:J = 0x1388L

.field public static c:Z


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
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
.end method

.method public static a(Landroid/app/ActivityManager;)Landroid/app/ActivityManager$ProcessErrorStateInfo;
    .locals 5

    .line 34
    invoke-virtual {p0}, Landroid/app/ActivityManager;->getProcessesInErrorState()Ljava/util/List;

    move-result-object p0

    const/4 v0, 0x0

    const/4 v1, 0x0

    if-eqz p0, :cond_3

    .line 35
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_1

    .line 36
    :cond_0
    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result v2

    .line 37
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/app/ActivityManager$ProcessErrorStateInfo;

    .line 38
    iget v4, v3, Landroid/app/ActivityManager$ProcessErrorStateInfo;->pid:I

    if-eq v4, v2, :cond_1

    goto :goto_0

    .line 39
    :cond_1
    new-array p0, v1, [Ljava/lang/Object;

    const-string v0, "found current proc in the error state"

    invoke-static {v0, p0}, Lcom/tencent/bugly/proguard/x4;->a(Ljava/lang/String;[Ljava/lang/Object;)Z

    return-object v3

    .line 40
    :cond_2
    new-array p0, v1, [Ljava/lang/Object;

    const-string v1, "current proc not in the error state"

    invoke-static {v1, p0}, Lcom/tencent/bugly/proguard/x4;->a(Ljava/lang/String;[Ljava/lang/Object;)Z

    return-object v0

    .line 41
    :cond_3
    :goto_1
    new-array p0, v1, [Ljava/lang/Object;

    const-string v1, "error state info list is null"

    invoke-static {v1, p0}, Lcom/tencent/bugly/proguard/x4;->a(Ljava/lang/String;[Ljava/lang/Object;)Z

    return-object v0
.end method

.method public static a(Landroid/app/ActivityManager;J)Landroid/app/ActivityManager$ProcessErrorStateInfo;
    .locals 8

    const/4 v0, 0x0

    const/4 v1, 0x0

    if-nez p0, :cond_0

    .line 18
    new-array p0, v1, [Ljava/lang/Object;

    const-string p1, "get anr state, ActivityManager is null"

    invoke-static {p1, p0}, Lcom/tencent/bugly/proguard/x4;->a(Ljava/lang/String;[Ljava/lang/Object;)Z

    return-object v0

    .line 19
    :cond_0
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v2

    const-string v3, "get anr state, timeout:%d"

    invoke-static {v3, v2}, Lcom/tencent/bugly/proguard/x4;->a(Ljava/lang/String;[Ljava/lang/Object;)Z

    const-wide/16 v2, 0x1f4

    .line 20
    div-long/2addr p1, v2

    move v4, v1

    .line 21
    :goto_0
    invoke-static {p0}, Lcom/tencent/bugly/proguard/v;->a(Landroid/app/ActivityManager;)Landroid/app/ActivityManager$ProcessErrorStateInfo;

    move-result-object v5

    if-nez v5, :cond_1

    .line 22
    new-array v5, v1, [Ljava/lang/Object;

    .line 23
    sget-object v6, Lcom/tencent/rmonitor/common/logger/LogState;->DEBUG:Lcom/tencent/rmonitor/common/logger/LogState;

    const-string v7, "found proc state is null, wait for it"

    invoke-static {v6, v7, v5}, Lcom/tencent/bugly/proguard/x4;->a(Lcom/tencent/rmonitor/common/logger/LogState;Ljava/lang/String;[Ljava/lang/Object;)Z

    goto :goto_1

    .line 24
    :cond_1
    iget v6, v5, Landroid/app/ActivityManager$ProcessErrorStateInfo;->condition:I

    const/4 v7, 0x1

    if-ne v6, v7, :cond_2

    .line 25
    new-array p0, v1, [Ljava/lang/Object;

    .line 26
    sget-object p1, Lcom/tencent/rmonitor/common/logger/LogState;->DEBUG:Lcom/tencent/rmonitor/common/logger/LogState;

    const-string p2, "found proc state is crashed!"

    invoke-static {p1, p2, p0}, Lcom/tencent/bugly/proguard/x4;->a(Lcom/tencent/rmonitor/common/logger/LogState;Ljava/lang/String;[Ljava/lang/Object;)Z

    return-object v0

    :cond_2
    const/4 v7, 0x2

    if-ne v6, v7, :cond_3

    .line 27
    iget-object p0, v5, Landroid/app/ActivityManager$ProcessErrorStateInfo;->processName:Ljava/lang/String;

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    .line 28
    sget-object p1, Lcom/tencent/rmonitor/common/logger/LogState;->DEBUG:Lcom/tencent/rmonitor/common/logger/LogState;

    const-string p2, "found proc state is anr! proc:%s"

    invoke-static {p1, p2, p0}, Lcom/tencent/bugly/proguard/x4;->a(Lcom/tencent/rmonitor/common/logger/LogState;Ljava/lang/String;[Ljava/lang/Object;)Z

    return-object v5

    :cond_3
    :goto_1
    add-int/lit8 v5, v4, 0x1

    int-to-long v6, v4

    cmp-long v4, v6, p1

    if-ltz v4, :cond_5

    .line 29
    sget-boolean p0, Lcom/tencent/bugly/proguard/v;->c:Z

    if-nez p0, :cond_4

    .line 30
    const-string p0, "Find process anr, but unable to get anr message."

    invoke-static {p0}, Lcom/tencent/bugly/proguard/v;->a(Ljava/lang/String;)Landroid/app/ActivityManager$ProcessErrorStateInfo;

    move-result-object p0

    return-object p0

    :cond_4
    return-object v0

    .line 31
    :cond_5
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    filled-new-array {v4}, [Ljava/lang/Object;

    move-result-object v4

    .line 32
    sget-object v6, Lcom/tencent/rmonitor/common/logger/LogState;->DEBUG:Lcom/tencent/rmonitor/common/logger/LogState;

    const-string/jumbo v7, "try the %s times:"

    invoke-static {v6, v7, v4}, Lcom/tencent/bugly/proguard/x4;->a(Lcom/tencent/rmonitor/common/logger/LogState;Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 33
    invoke-static {v2, v3}, Lcom/tencent/bugly/proguard/bi;->c(J)V

    move v4, v5

    goto :goto_0
.end method

.method public static a(Ljava/lang/String;)Landroid/app/ActivityManager$ProcessErrorStateInfo;
    .locals 2

    .line 42
    new-instance v0, Landroid/app/ActivityManager$ProcessErrorStateInfo;

    invoke-direct {v0}, Landroid/app/ActivityManager$ProcessErrorStateInfo;-><init>()V

    .line 43
    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result v1

    iput v1, v0, Landroid/app/ActivityManager$ProcessErrorStateInfo;->pid:I

    .line 44
    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result v1

    invoke-static {v1}, Lcom/tencent/bugly/proguard/x;->a(I)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Landroid/app/ActivityManager$ProcessErrorStateInfo;->processName:Ljava/lang/String;

    .line 45
    iput-object p0, v0, Landroid/app/ActivityManager$ProcessErrorStateInfo;->shortMsg:Ljava/lang/String;

    return-object v0
.end method

.method public static a()Z
    .locals 7

    const-string v0, "isMainThreadForeBlocked = "

    const/4 v1, 0x0

    .line 1
    :try_start_0
    invoke-static {}, Lcom/tencent/bugly/proguard/l2;->s()Lcom/tencent/bugly/proguard/l2;

    move-result-object v2

    invoke-virtual {v2}, Lcom/tencent/bugly/proguard/l2;->K()Z

    move-result v2

    if-nez v2, :cond_0

    .line 2
    const-string v0, "isMainThreadForeBlocked, not foreground"

    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Lcom/tencent/bugly/proguard/x4;->d(Ljava/lang/String;[Ljava/lang/Object;)Z

    return v1

    :catchall_0
    move-exception v0

    goto :goto_1

    .line 3
    :cond_0
    invoke-static {}, Lcom/tencent/bugly/proguard/d3;->c()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, Lcom/tencent/bugly/proguard/o4;->e(Landroid/content/Context;)Z

    move-result v2

    if-nez v2, :cond_1

    .line 4
    const-string v0, "isMainThreadForeBlocked, not vivo"

    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Lcom/tencent/bugly/proguard/x4;->d(Ljava/lang/String;[Ljava/lang/Object;)Z

    return v1

    .line 5
    :cond_1
    invoke-static {}, Lcom/tencent/bugly/common/utils/AndroidVersion;->isOverM()Z

    move-result v2

    if-eqz v2, :cond_4

    .line 6
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v2

    invoke-virtual {v2}, Landroid/os/Looper;->getQueue()Landroid/os/MessageQueue;

    move-result-object v2

    .line 7
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    const-string v4, "mMessages"

    invoke-virtual {v3, v4}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v3

    const/4 v4, 0x1

    .line 8
    invoke-virtual {v3, v4}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 9
    invoke-virtual {v3, v2}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/os/Message;

    if-eqz v2, :cond_4

    .line 10
    invoke-virtual {v2}, Landroid/os/Message;->getWhen()J

    move-result-wide v2

    const-wide/16 v5, 0x0

    cmp-long v5, v2, v5

    if-nez v5, :cond_2

    .line 11
    const-string v0, "isMainThreadForeBlocked, when == 0"

    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Lcom/tencent/bugly/proguard/x4;->d(Ljava/lang/String;[Ljava/lang/Object;)Z

    return v1

    .line 12
    :cond_2
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v5

    sub-long/2addr v5, v2

    const-wide/16 v2, 0x1388

    cmp-long v2, v5, v2

    if-lez v2, :cond_3

    goto :goto_0

    :cond_3
    move v4, v1

    .line 13
    :goto_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Lcom/tencent/bugly/proguard/x4;->d(Ljava/lang/String;[Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return v4

    .line 14
    :goto_1
    invoke-static {v0}, Lcom/tencent/bugly/proguard/x4;->a(Ljava/lang/Throwable;)Z

    .line 15
    :cond_4
    new-array v0, v1, [Ljava/lang/Object;

    const-string v2, "isMainThreadForeBlocked, return false"

    invoke-static {v2, v0}, Lcom/tencent/bugly/proguard/x4;->d(Ljava/lang/String;[Ljava/lang/Object;)Z

    return v1
.end method

.method public static a(Landroid/content/Context;)Z
    .locals 2

    .line 16
    invoke-static {p0}, Lcom/tencent/bugly/proguard/o4;->d(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {p0}, Lcom/tencent/bugly/proguard/o4;->e(Landroid/content/Context;)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 17
    :goto_1
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    const-string v1, "isAnrCrashDevice:%s"

    invoke-static {v1, v0}, Lcom/tencent/bugly/proguard/x4;->a(Ljava/lang/String;[Ljava/lang/Object;)Z

    return p0
.end method

.method public static b(Landroid/app/ActivityManager;)Z
    .locals 5

    .line 1
    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 3
    .line 4
    const-string v1, "enableNewAnrScheme: "

    .line 5
    .line 6
    .line 7
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    sget-boolean v1, Lcom/tencent/bugly/proguard/v;->c:Z

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 16
    move-result-object v0

    .line 17
    const/4 v1, 0x0

    .line 18
    .line 19
    new-array v2, v1, [Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    invoke-static {v0, v2}, Lcom/tencent/bugly/proguard/x4;->d(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 23
    .line 24
    sget-boolean v0, Lcom/tencent/bugly/proguard/v;->c:Z

    .line 25
    const/4 v2, 0x1

    .line 26
    .line 27
    if-eqz v0, :cond_2

    .line 28
    .line 29
    .line 30
    invoke-static {}, Lcom/tencent/bugly/proguard/v;->a()Z

    .line 31
    move-result v0

    .line 32
    .line 33
    if-nez v0, :cond_1

    .line 34
    .line 35
    .line 36
    invoke-static {p0}, Lcom/tencent/bugly/proguard/x;->a(Landroid/app/ActivityManager;)Z

    .line 37
    move-result v0

    .line 38
    .line 39
    if-eqz v0, :cond_1

    .line 40
    .line 41
    const-wide/16 v3, 0x5208

    .line 42
    .line 43
    .line 44
    invoke-static {p0, v3, v4}, Lcom/tencent/bugly/proguard/v;->a(Landroid/app/ActivityManager;J)Landroid/app/ActivityManager$ProcessErrorStateInfo;

    .line 45
    move-result-object p0

    .line 46
    .line 47
    if-eqz p0, :cond_0

    .line 48
    goto :goto_0

    .line 49
    :cond_0
    return v1

    .line 50
    :cond_1
    :goto_0
    return v2

    .line 51
    .line 52
    .line 53
    :cond_2
    invoke-static {p0}, Lcom/tencent/bugly/proguard/x;->a(Landroid/app/ActivityManager;)Z

    .line 54
    move-result v0

    .line 55
    .line 56
    if-eqz v0, :cond_3

    .line 57
    return v1

    .line 58
    .line 59
    :cond_3
    const-wide/16 v3, 0x0

    .line 60
    .line 61
    .line 62
    invoke-static {p0, v3, v4}, Lcom/tencent/bugly/proguard/v;->a(Landroid/app/ActivityManager;J)Landroid/app/ActivityManager$ProcessErrorStateInfo;

    .line 63
    move-result-object p0

    .line 64
    .line 65
    if-eqz p0, :cond_4

    .line 66
    return v2

    .line 67
    :cond_4
    return v1
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
