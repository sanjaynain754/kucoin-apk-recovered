.class public Lcom/tencent/rmonitor/natmem/NatMemMonitor;
.super Lcom/tencent/rmonitor/base/plugin/monitor/QAPMMonitorPlugin;
.source "BUGLY"


# static fields
.field public static final e:Ljava/lang/String; = "RMonitor_NatMem_Monitor"

.field public static f:Lcom/tencent/rmonitor/natmem/NatMemMonitor; = null

.field public static g:Z = false

.field public static h:Z = false

.field public static final i:J = 0x7530L


# instance fields
.field public b:Lcom/tencent/rmonitor/natmem/NatMemHandler;

.field public c:Lcom/tencent/bugly/proguard/wc;

.field public d:Ljava/util/concurrent/atomic/AtomicBoolean;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 1
    .line 2
    :try_start_0
    const-string v0, "rmonitor_memory"

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V

    .line 6
    const/4 v0, 0x1

    .line 7
    .line 8
    sput-boolean v0, Lcom/tencent/rmonitor/natmem/NatMemMonitor;->h:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    return-void

    .line 10
    :catchall_0
    move-exception v0

    .line 11
    .line 12
    sget-object v1, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 13
    .line 14
    const-string v2, "RMonitor_NatMem_Monitor"

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1, v2, v0}, Lcom/tencent/rmonitor/common/logger/Logger;->exception(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 18
    const/4 v0, 0x0

    .line 19
    .line 20
    sput-boolean v0, Lcom/tencent/rmonitor/natmem/NatMemMonitor;->h:Z

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

.method public constructor <init>()V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/tencent/rmonitor/base/plugin/monitor/QAPMMonitorPlugin;-><init>()V

    .line 4
    .line 5
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 6
    const/4 v1, 0x0

    .line 7
    .line 8
    .line 9
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 10
    .line 11
    iput-object v0, p0, Lcom/tencent/rmonitor/natmem/NatMemMonitor;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 12
    .line 13
    sget-boolean v0, Lcom/tencent/rmonitor/natmem/NatMemMonitor;->h:Z

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    sget-object v0, Lcom/tencent/rmonitor/base/config/ConfigProxy;->INSTANCE:Lcom/tencent/rmonitor/base/config/ConfigProxy;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Lcom/tencent/rmonitor/base/config/ConfigProxy;->getConfig()Lcom/tencent/rmonitor/base/config/a;

    .line 21
    move-result-object v0

    .line 22
    .line 23
    const-string v2, "native_memory"

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, v2}, Lcom/tencent/rmonitor/base/config/a;->e(Ljava/lang/String;)Lcom/tencent/bugly/proguard/hf;

    .line 27
    move-result-object v0

    .line 28
    .line 29
    check-cast v0, Lcom/tencent/bugly/proguard/wc;

    .line 30
    .line 31
    iput-object v0, p0, Lcom/tencent/rmonitor/natmem/NatMemMonitor;->c:Lcom/tencent/bugly/proguard/wc;

    .line 32
    .line 33
    new-instance v0, Lcom/tencent/rmonitor/natmem/NatMemHandler;

    .line 34
    .line 35
    .line 36
    invoke-static {}, Lcom/tencent/bugly/common/thread/ThreadManager;->getMonitorThreadLooper()Landroid/os/Looper;

    .line 37
    move-result-object v2

    .line 38
    .line 39
    .line 40
    invoke-direct {v0, v2}, Lcom/tencent/rmonitor/natmem/NatMemHandler;-><init>(Landroid/os/Looper;)V

    .line 41
    .line 42
    iput-object v0, p0, Lcom/tencent/rmonitor/natmem/NatMemMonitor;->b:Lcom/tencent/rmonitor/natmem/NatMemHandler;

    .line 43
    .line 44
    :cond_0
    sput-object p0, Lcom/tencent/rmonitor/natmem/NatMemMonitor;->f:Lcom/tencent/rmonitor/natmem/NatMemMonitor;

    .line 45
    .line 46
    iget-object v0, p0, Lcom/tencent/rmonitor/natmem/NatMemMonitor;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 50
    return-void
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

.method public static b()Lcom/tencent/rmonitor/natmem/NatMemMonitor;
    .locals 2

    .line 1
    sget-object v0, Lcom/tencent/rmonitor/natmem/NatMemMonitor;->f:Lcom/tencent/rmonitor/natmem/NatMemMonitor;

    if-nez v0, :cond_1

    .line 2
    const-class v0, Lcom/tencent/rmonitor/natmem/NatMemMonitor;

    monitor-enter v0

    .line 3
    :try_start_0
    sget-object v1, Lcom/tencent/rmonitor/natmem/NatMemMonitor;->f:Lcom/tencent/rmonitor/natmem/NatMemMonitor;

    if-nez v1, :cond_0

    .line 4
    new-instance v1, Lcom/tencent/rmonitor/natmem/NatMemMonitor;

    invoke-direct {v1}, Lcom/tencent/rmonitor/natmem/NatMemMonitor;-><init>()V

    sput-object v1, Lcom/tencent/rmonitor/natmem/NatMemMonitor;->f:Lcom/tencent/rmonitor/natmem/NatMemMonitor;

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    .line 5
    :cond_0
    :goto_0
    monitor-exit v0

    goto :goto_2

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    .line 6
    :cond_1
    :goto_2
    sget-object v0, Lcom/tencent/rmonitor/natmem/NatMemMonitor;->f:Lcom/tencent/rmonitor/natmem/NatMemMonitor;

    return-object v0
.end method


# virtual methods
.method public a()Lcom/tencent/bugly/proguard/wc;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/rmonitor/natmem/NatMemMonitor;->c:Lcom/tencent/bugly/proguard/wc;

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

.method public b(Ljava/lang/String;)V
    .locals 2

    .line 7
    sget-boolean v0, Lcom/tencent/rmonitor/natmem/NatMemMonitor;->h:Z

    if-eqz v0, :cond_1

    sget-boolean v0, Lcom/tencent/rmonitor/natmem/NatMemMonitor;->g:Z

    if-eqz v0, :cond_1

    .line 8
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v0

    .line 9
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-nez v1, :cond_0

    .line 10
    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    .line 11
    :cond_0
    invoke-virtual {p0, p1}, Lcom/tencent/rmonitor/natmem/NatMemMonitor;->nativeDumpNatMemLeakInfo(Ljava/lang/String;)I

    return-void

    .line 12
    :cond_1
    sget-object p1, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    const-string v0, "dumpNatMemLeakInfo failed"

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/tencent/rmonitor/common/logger/Logger;->e([Ljava/lang/String;)V

    return-void
.end method

.method public c()I
    .locals 4

    .line 7
    invoke-static {}, Lcom/tencent/bugly/common/utils/AndroidVersion;->isOverO()Z

    move-result v0

    const-string v1, "RMonitor_NatMem_Monitor"

    if-eqz v0, :cond_5

    const-wide/16 v2, 0x7530

    .line 8
    const-string v0, "native_memory"

    invoke-static {v0, v2, v3}, Lcom/tencent/bugly/proguard/m3;->a(Ljava/lang/String;J)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 9
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    const-string v2, "start native memory monitor fail, for start failed many times"

    filled-new-array {v1, v2}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/tencent/rmonitor/common/logger/Logger;->e([Ljava/lang/String;)V

    .line 10
    const-string v0, "crash_times"

    invoke-static {v0}, Lcom/tencent/bugly/proguard/vc;->a(Ljava/lang/String;)V

    const/4 v0, 0x1

    return v0

    .line 11
    :cond_0
    sget-object v2, Lcom/tencent/rmonitor/base/plugin/monitor/PluginController;->INSTANCE:Lcom/tencent/rmonitor/base/plugin/monitor/PluginController;

    invoke-virtual {v2, v0}, Lcom/tencent/rmonitor/base/plugin/monitor/PluginController;->canCollect(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_1

    .line 12
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    const-string v2, "start native memory monitor fail, for can not report again"

    filled-new-array {v1, v2}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/tencent/rmonitor/common/logger/Logger;->i([Ljava/lang/String;)V

    const/4 v0, 0x3

    return v0

    .line 13
    :cond_1
    invoke-static {}, Lcom/tencent/bugly/proguard/rb;->a()Lcom/tencent/bugly/proguard/rb;

    move-result-object v2

    invoke-virtual {v2}, Lcom/tencent/bugly/proguard/rb;->c()Z

    move-result v2

    if-eqz v2, :cond_2

    .line 14
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    const-string v2, "start native memory monitor fail, couldn\'t support x86 or x86_64 arch"

    filled-new-array {v1, v2}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/tencent/rmonitor/common/logger/Logger;->i([Ljava/lang/String;)V

    const/4 v0, 0x5

    return v0

    .line 15
    :cond_2
    invoke-static {}, Lcom/tencent/bugly/proguard/rb;->a()Lcom/tencent/bugly/proguard/rb;

    move-result-object v2

    invoke-virtual {v2, v0}, Lcom/tencent/bugly/proguard/rb;->a(Ljava/lang/String;)Z

    move-result v2

    const/4 v3, 0x4

    if-eqz v2, :cond_3

    .line 16
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    const-string v2, "start native memory monitor fail, couldn\'t open native memory with fd or asan same time."

    filled-new-array {v1, v2}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/tencent/rmonitor/common/logger/Logger;->i([Ljava/lang/String;)V

    return v3

    .line 17
    :cond_3
    invoke-static {}, Lcom/tencent/bugly/proguard/rb;->a()Lcom/tencent/bugly/proguard/rb;

    move-result-object v2

    invoke-virtual {v2}, Lcom/tencent/bugly/proguard/rb;->d()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 18
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    const-string v2, "start native memory monitor failed, local sample failed!"

    filled-new-array {v1, v2}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/tencent/rmonitor/common/logger/Logger;->i([Ljava/lang/String;)V

    return v3

    .line 19
    :cond_4
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    const-string v2, "prepare to start native memory monitor, local sample success!"

    filled-new-array {v1, v2}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/tencent/rmonitor/common/logger/Logger;->i([Ljava/lang/String;)V

    const/4 v0, 0x0

    return v0

    .line 20
    :cond_5
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    const-string v2, "start native memory monitor fail, for android version"

    filled-new-array {v1, v2}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/tencent/rmonitor/common/logger/Logger;->d([Ljava/lang/String;)V

    .line 21
    const-string v0, "android_verison"

    invoke-static {v0}, Lcom/tencent/bugly/proguard/vc;->a(Ljava/lang/String;)V

    const/4 v0, 0x2

    return v0
.end method

.method public c(Ljava/lang/String;)V
    .locals 2

    .line 1
    sget-boolean v0, Lcom/tencent/rmonitor/natmem/NatMemMonitor;->h:Z

    if-eqz v0, :cond_1

    sget-boolean v0, Lcom/tencent/rmonitor/natmem/NatMemMonitor;->g:Z

    if-eqz v0, :cond_1

    .line 2
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v0

    .line 3
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-nez v1, :cond_0

    .line 4
    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    .line 5
    :cond_0
    invoke-static {}, Lcom/tencent/bugly/proguard/ac;->l()Lcom/tencent/bugly/proguard/ac;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/tencent/bugly/proguard/ac;->a(Z)J

    move-result-wide v0

    invoke-virtual {p0, p1, v0, v1}, Lcom/tencent/rmonitor/natmem/NatMemMonitor;->nativeDumpNatMemUsageInfo(Ljava/lang/String;J)I

    return-void

    .line 6
    :cond_1
    sget-object p1, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    const-string v0, "dumpNatMemUsageInfo failed"

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/tencent/rmonitor/common/logger/Logger;->e([Ljava/lang/String;)V

    return-void
.end method

.method public d()V
    .locals 3

    .line 1
    sget-boolean v0, Lcom/tencent/rmonitor/natmem/NatMemMonitor;->h:Z

    if-eqz v0, :cond_0

    sget-boolean v0, Lcom/tencent/rmonitor/natmem/NatMemMonitor;->g:Z

    if-nez v0, :cond_0

    .line 2
    sget-object v0, Lcom/tencent/rmonitor/base/config/ConfigProxy;->INSTANCE:Lcom/tencent/rmonitor/base/config/ConfigProxy;

    invoke-virtual {v0}, Lcom/tencent/rmonitor/base/config/ConfigProxy;->getConfig()Lcom/tencent/rmonitor/base/config/a;

    move-result-object v0

    .line 3
    const-string v1, "native_memory"

    invoke-virtual {v0, v1}, Lcom/tencent/rmonitor/base/config/a;->e(Ljava/lang/String;)Lcom/tencent/bugly/proguard/hf;

    move-result-object v0

    check-cast v0, Lcom/tencent/bugly/proguard/wc;

    iput-object v0, p0, Lcom/tencent/rmonitor/natmem/NatMemMonitor;->c:Lcom/tencent/bugly/proguard/wc;

    .line 4
    iget-object v0, p0, Lcom/tencent/rmonitor/natmem/NatMemMonitor;->b:Lcom/tencent/rmonitor/natmem/NatMemHandler;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    .line 5
    iget-object v0, p0, Lcom/tencent/rmonitor/natmem/NatMemMonitor;->b:Lcom/tencent/rmonitor/natmem/NatMemHandler;

    const/4 v2, 0x2

    invoke-virtual {v0, v2}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    .line 6
    sput-boolean v1, Lcom/tencent/rmonitor/natmem/NatMemMonitor;->g:Z

    return-void

    .line 7
    :cond_0
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "startMonitor failed,mSoLoadSuccess = "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-boolean v2, Lcom/tencent/rmonitor/natmem/NatMemMonitor;->h:Z

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/tencent/rmonitor/common/logger/Logger;->e([Ljava/lang/String;)V

    return-void
.end method

.method public d(Ljava/lang/String;)V
    .locals 0

    .line 8
    invoke-virtual {p0, p1}, Lcom/tencent/rmonitor/natmem/NatMemMonitor;->nativeSetSceneInfo(Ljava/lang/String;)V

    return-void
.end method

.method public native nativeDumpNatMemLeakInfo(Ljava/lang/String;)I
.end method

.method public native nativeDumpNatMemUsageInfo(Ljava/lang/String;J)I
.end method

.method public native nativeIgnoreLib(Ljava/lang/String;)I
.end method

.method public native nativeInit()I
.end method

.method public native nativeInitAppHookParameter(I)V
.end method

.method public native nativeSetSceneInfo(Ljava/lang/String;)V
.end method

.method public native nativeSetUnwindSwtich(Z)V
.end method

.method public native nativeStartHook(JIZ)I
.end method

.method public start()V
    .locals 3

    .line 1
    .line 2
    sget-boolean v0, Lcom/tencent/rmonitor/natmem/NatMemMonitor;->h:Z

    .line 3
    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    iget-object v0, p0, Lcom/tencent/rmonitor/natmem/NatMemMonitor;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 10
    move-result v0

    .line 11
    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Lcom/tencent/rmonitor/natmem/NatMemMonitor;->c()I

    .line 16
    move-result v0

    .line 17
    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    .line 21
    invoke-static {v0}, Lcom/tencent/bugly/proguard/zc;->a(I)V

    .line 22
    return-void

    .line 23
    .line 24
    .line 25
    :cond_0
    invoke-virtual {p0}, Lcom/tencent/rmonitor/natmem/NatMemMonitor;->d()V

    .line 26
    const/4 v0, 0x1

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0, v0}, Lcom/tencent/rmonitor/natmem/NatMemMonitor;->nativeSetUnwindSwtich(Z)V

    .line 30
    .line 31
    .line 32
    invoke-static {}, Lcom/tencent/bugly/proguard/cf;->a()Lcom/tencent/bugly/proguard/cf;

    .line 33
    move-result-object v1

    .line 34
    .line 35
    const-string v2, "native_memory"

    .line 36
    .line 37
    .line 38
    invoke-static {v2}, Lcom/tencent/bugly/proguard/vd;->a(Ljava/lang/String;)Lcom/tencent/bugly/proguard/ef;

    .line 39
    move-result-object v2

    .line 40
    .line 41
    .line 42
    invoke-virtual {v1, v2}, Lcom/tencent/bugly/proguard/cf;->b(Lcom/tencent/bugly/proguard/ef;)V

    .line 43
    .line 44
    iget-object v1, p0, Lcom/tencent/rmonitor/natmem/NatMemMonitor;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 48
    .line 49
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 50
    .line 51
    const-string v1, "RMonitor_NatMem_Monitor"

    .line 52
    .line 53
    const-string v2, "start natmem monitor!!"

    .line 54
    .line 55
    .line 56
    filled-new-array {v1, v2}, [Ljava/lang/String;

    .line 57
    move-result-object v1

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0, v1}, Lcom/tencent/rmonitor/common/logger/Logger;->d([Ljava/lang/String;)V

    .line 61
    :cond_1
    return-void
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

.method public stop()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/rmonitor/natmem/NatMemMonitor;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 7
    .line 8
    sget-boolean v0, Lcom/tencent/rmonitor/natmem/NatMemMonitor;->h:Z

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, v1}, Lcom/tencent/rmonitor/natmem/NatMemMonitor;->nativeSetUnwindSwtich(Z)V

    .line 14
    .line 15
    .line 16
    :cond_0
    invoke-static {}, Lcom/tencent/bugly/proguard/cf;->a()Lcom/tencent/bugly/proguard/cf;

    .line 17
    move-result-object v0

    .line 18
    .line 19
    const-string v1, "native_memory"

    .line 20
    .line 21
    .line 22
    invoke-static {v1}, Lcom/tencent/bugly/proguard/vd;->a(Ljava/lang/String;)Lcom/tencent/bugly/proguard/ef;

    .line 23
    move-result-object v1

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, v1}, Lcom/tencent/bugly/proguard/cf;->a(Lcom/tencent/bugly/proguard/ef;)V

    .line 27
    return-void
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
