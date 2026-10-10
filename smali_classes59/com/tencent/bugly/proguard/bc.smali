.class public Lcom/tencent/bugly/proguard/bc;
.super Ljava/lang/Object;
.source "BUGLY"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/bugly/proguard/bc$c;,
        Lcom/tencent/bugly/proguard/bc$d;,
        Lcom/tencent/bugly/proguard/bc$b;
    }
.end annotation


# static fields
.field public static final d:Ljava/lang/String; = "RMonitor_MemoryLeak_LeakInspector"

.field public static final e:I = 0x1388

.field public static final f:I = 0x3e8

.field public static final g:I = 0x14

.field public static final h:Lcom/tencent/bugly/common/utils/RecyclablePool;

.field public static i:J = 0x0L

.field public static j:Ljava/lang/ref/ReferenceQueue; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/ReferenceQueue<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public static k:Ljava/util/List; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/tencent/bugly/proguard/bc$d;",
            ">;"
        }
    .end annotation
.end field

.field public static final l:Ljava/lang/Object;

.field public static final m:J = 0x5L

.field public static final n:J = 0x2bf20L

.field public static final o:J = 0x7530L


# instance fields
.field public final a:Landroid/os/Handler;

.field public final b:Lcom/tencent/rmonitor/base/plugin/listener/IMemoryLeakListener;

.field public final c:Lcom/tencent/bugly/proguard/ec;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 1
    .line 2
    new-instance v0, Lcom/tencent/bugly/common/utils/RecyclablePool;

    .line 3
    .line 4
    const-class v1, Lcom/tencent/rmonitor/base/meta/InspectUUID;

    .line 5
    .line 6
    const/16 v2, 0x14

    .line 7
    .line 8
    .line 9
    invoke-direct {v0, v1, v2}, Lcom/tencent/bugly/common/utils/RecyclablePool;-><init>(Ljava/lang/Class;I)V

    .line 10
    .line 11
    sput-object v0, Lcom/tencent/bugly/proguard/bc;->h:Lcom/tencent/bugly/common/utils/RecyclablePool;

    .line 12
    .line 13
    const-wide/16 v0, 0x0

    .line 14
    .line 15
    sput-wide v0, Lcom/tencent/bugly/proguard/bc;->i:J

    .line 16
    .line 17
    new-instance v0, Ljava/util/ArrayList;

    .line 18
    .line 19
    .line 20
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 21
    .line 22
    sput-object v0, Lcom/tencent/bugly/proguard/bc;->k:Ljava/util/List;

    .line 23
    .line 24
    new-instance v0, Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 28
    .line 29
    sput-object v0, Lcom/tencent/bugly/proguard/bc;->l:Ljava/lang/Object;

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
.end method

.method public constructor <init>(Landroid/os/Handler;Lcom/tencent/rmonitor/base/plugin/listener/IMemoryLeakListener;)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    new-instance v0, Lcom/tencent/bugly/proguard/ec;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0}, Lcom/tencent/bugly/proguard/ec;-><init>()V

    .line 9
    .line 10
    iput-object v0, p0, Lcom/tencent/bugly/proguard/bc;->c:Lcom/tencent/bugly/proguard/ec;

    .line 11
    .line 12
    iput-object p1, p0, Lcom/tencent/bugly/proguard/bc;->a:Landroid/os/Handler;

    .line 13
    .line 14
    iput-object p2, p0, Lcom/tencent/bugly/proguard/bc;->b:Lcom/tencent/rmonitor/base/plugin/listener/IMemoryLeakListener;

    .line 15
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

.method public static synthetic a(Lcom/tencent/bugly/proguard/bc;)Landroid/os/Handler;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/tencent/bugly/proguard/bc;->a:Landroid/os/Handler;

    return-object p0
.end method

.method public static synthetic a()Ljava/util/List;
    .locals 1

    .line 2
    sget-object v0, Lcom/tencent/bugly/proguard/bc;->k:Ljava/util/List;

    return-object v0
.end method

.method public static a(Ljava/lang/Object;Lcom/tencent/rmonitor/base/plugin/listener/IMemoryLeakListener;)V
    .locals 8

    const-string v0, "RMonitor_MemoryLeak_LeakInspector"

    if-nez p0, :cond_0

    .line 3
    sget-object p0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    const-string p1, "leakObj is null"

    filled-new-array {v0, p1}, [Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/tencent/rmonitor/common/logger/Logger;->i([Ljava/lang/String;)V

    return-void

    .line 4
    :cond_0
    invoke-static {}, Lcom/tencent/bugly/proguard/s7;->a()Lcom/tencent/bugly/proguard/e9;

    move-result-object v1

    instance-of v1, v1, Lcom/tencent/bugly/common/heapdump/ForkJvmHeapDumper;

    if-nez v1, :cond_1

    .line 5
    sget-object p0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    const-string/jumbo p1, "startInspect has not valid dumper"

    filled-new-array {v0, p1}, [Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/tencent/rmonitor/common/logger/Logger;->i([Ljava/lang/String;)V

    return-void

    .line 6
    :cond_1
    sget-object v1, Lcom/tencent/bugly/proguard/bc;->h:Lcom/tencent/bugly/common/utils/RecyclablePool;

    const-class v2, Lcom/tencent/rmonitor/base/meta/InspectUUID;

    invoke-virtual {v1, v2}, Lcom/tencent/bugly/common/utils/RecyclablePool;->obtain(Ljava/lang/Class;)Lcom/tencent/bugly/common/utils/RecyclablePool$Recyclable;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Lcom/tencent/rmonitor/base/meta/InspectUUID;

    if-nez v3, :cond_2

    return-void

    .line 7
    :cond_2
    sget-object v1, Lcom/tencent/rmonitor/base/plugin/monitor/PluginController;->INSTANCE:Lcom/tencent/rmonitor/base/plugin/monitor/PluginController;

    const-string v2, "activity_leak"

    invoke-virtual {v1, v2}, Lcom/tencent/rmonitor/base/plugin/monitor/PluginController;->whetherPluginSampling(Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_3

    .line 8
    sget-object p0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    const-string p1, "leakSampleLost for user"

    filled-new-array {v0, p1}, [Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/tencent/rmonitor/common/logger/Logger;->i([Ljava/lang/String;)V

    return-void

    .line 9
    :cond_3
    invoke-virtual {v1, v2}, Lcom/tencent/rmonitor/base/plugin/monitor/PluginController;->whetherPluginEventSampling(Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_4

    .line 10
    sget-object p0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    const-string p1, "leakSampleLost for event"

    filled-new-array {v0, p1}, [Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/tencent/rmonitor/common/logger/Logger;->i([Ljava/lang/String;)V

    return-void

    .line 11
    :cond_4
    invoke-virtual {v1, v2}, Lcom/tencent/rmonitor/base/plugin/monitor/PluginController;->canCollect(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_5

    .line 12
    sget-object p0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    const-string p1, "can not report again"

    filled-new-array {v0, p1}, [Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/tencent/rmonitor/common/logger/Logger;->i([Ljava/lang/String;)V

    return-void

    .line 13
    :cond_5
    new-instance v0, Ljava/lang/ref/WeakReference;

    sget-object v1, Lcom/tencent/bugly/proguard/bc;->j:Ljava/lang/ref/ReferenceQueue;

    invoke-direct {v0, p0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;Ljava/lang/ref/ReferenceQueue;)V

    iput-object v0, v3, Lcom/tencent/rmonitor/base/meta/InspectUUID;->weakObj:Ljava/lang/ref/WeakReference;

    .line 14
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v3, Lcom/tencent/rmonitor/base/meta/InspectUUID;->uuid:Ljava/lang/String;

    .line 15
    const-string v0, "digest"

    iput-object v0, v3, Lcom/tencent/rmonitor/base/meta/InspectUUID;->digest:Ljava/lang/String;

    .line 16
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p0

    iput-object p0, v3, Lcom/tencent/rmonitor/base/meta/InspectUUID;->className:Ljava/lang/String;

    if-nez p1, :cond_6

    .line 17
    new-instance p1, Lcom/tencent/bugly/proguard/y4;

    invoke-direct {p1}, Lcom/tencent/bugly/proguard/y4;-><init>()V

    :cond_6
    move-object v6, p1

    .line 18
    new-instance v2, Lcom/tencent/bugly/proguard/bc$c;

    new-instance v5, Landroid/os/Handler;

    .line 19
    invoke-static {}, Lcom/tencent/bugly/common/thread/ThreadManager;->getMonitorThreadLooper()Landroid/os/Looper;

    move-result-object p0

    invoke-direct {v5, p0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v7, Lcom/tencent/bugly/proguard/ec;

    invoke-direct {v7}, Lcom/tencent/bugly/proguard/ec;-><init>()V

    const/4 v4, 0x0

    invoke-direct/range {v2 .. v7}, Lcom/tencent/bugly/proguard/bc$c;-><init>(Lcom/tencent/rmonitor/base/meta/InspectUUID;ILandroid/os/Handler;Lcom/tencent/rmonitor/base/plugin/listener/IMemoryLeakListener;Lcom/tencent/bugly/proguard/ec;)V

    const-wide/16 p0, 0x0

    .line 20
    invoke-static {v2, p0, p1}, Lcom/tencent/bugly/common/thread/ThreadManager;->runInMonitorThread(Ljava/lang/Runnable;J)V

    return-void
.end method

.method public static synthetic b(Lcom/tencent/bugly/proguard/bc;)Lcom/tencent/rmonitor/base/plugin/listener/IMemoryLeakListener;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/tencent/bugly/proguard/bc;->b:Lcom/tencent/rmonitor/base/plugin/listener/IMemoryLeakListener;

    return-object p0
.end method

.method public static synthetic b()Ljava/lang/Object;
    .locals 1

    .line 2
    sget-object v0, Lcom/tencent/bugly/proguard/bc;->l:Ljava/lang/Object;

    return-object v0
.end method

.method public static synthetic c(Lcom/tencent/bugly/proguard/bc;)Lcom/tencent/bugly/proguard/ec;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/tencent/bugly/proguard/bc;->c:Lcom/tencent/bugly/proguard/ec;

    return-object p0
.end method

.method public static synthetic c()V
    .locals 0

    .line 2
    invoke-static {}, Lcom/tencent/bugly/proguard/bc;->e()V

    return-void
.end method

.method public static synthetic d()Lcom/tencent/bugly/common/utils/RecyclablePool;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/tencent/bugly/proguard/bc;->h:Lcom/tencent/bugly/common/utils/RecyclablePool;

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

.method public static e()V
    .locals 6

    .line 1
    .line 2
    .line 3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 4
    move-result-wide v0

    .line 5
    .line 6
    sget-wide v2, Lcom/tencent/bugly/proguard/bc;->i:J

    .line 7
    .line 8
    sub-long v2, v0, v2

    .line 9
    .line 10
    const-wide/16 v4, 0x1388

    .line 11
    .line 12
    cmp-long v2, v2, v4

    .line 13
    .line 14
    if-ltz v2, :cond_0

    .line 15
    .line 16
    .line 17
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    .line 18
    move-result-object v2

    .line 19
    .line 20
    .line 21
    invoke-virtual {v2}, Ljava/lang/Runtime;->gc()V

    .line 22
    .line 23
    .line 24
    invoke-static {}, Lcom/tencent/bugly/proguard/bc;->f()V

    .line 25
    .line 26
    .line 27
    invoke-static {}, Ljava/lang/System;->runFinalization()V

    .line 28
    .line 29
    sput-wide v0, Lcom/tencent/bugly/proguard/bc;->i:J

    .line 30
    :cond_0
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
.end method

.method public static f()V
    .locals 2

    .line 1
    .line 2
    const-wide/16 v0, 0x64

    .line 3
    .line 4
    .line 5
    :try_start_0
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 6
    return-void

    .line 7
    .line 8
    :catch_0
    new-instance v0, Ljava/lang/AssertionError;

    .line 9
    .line 10
    .line 11
    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    .line 12
    throw v0
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ljava/lang/String;)Lcom/tencent/rmonitor/base/meta/InspectUUID;
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    const/4 v0, 0x0

    .line 21
    :try_start_0
    sget-object v1, Lcom/tencent/bugly/proguard/bc;->h:Lcom/tencent/bugly/common/utils/RecyclablePool;

    const-class v2, Lcom/tencent/rmonitor/base/meta/InspectUUID;

    invoke-virtual {v1, v2}, Lcom/tencent/bugly/common/utils/RecyclablePool;->obtain(Ljava/lang/Class;)Lcom/tencent/bugly/common/utils/RecyclablePool$Recyclable;

    move-result-object v1

    check-cast v1, Lcom/tencent/rmonitor/base/meta/InspectUUID;

    if-nez v1, :cond_0

    return-object v0

    .line 22
    :cond_0
    new-instance v2, Ljava/lang/ref/WeakReference;

    sget-object v3, Lcom/tencent/bugly/proguard/bc;->j:Ljava/lang/ref/ReferenceQueue;

    invoke-direct {v2, p1, v3}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;Ljava/lang/ref/ReferenceQueue;)V

    iput-object v2, v1, Lcom/tencent/rmonitor/base/meta/InspectUUID;->weakObj:Ljava/lang/ref/WeakReference;

    .line 23
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v2

    iput-object v2, v1, Lcom/tencent/rmonitor/base/meta/InspectUUID;->uuid:Ljava/lang/String;

    .line 24
    iput-object p2, v1, Lcom/tencent/rmonitor/base/meta/InspectUUID;->digest:Ljava/lang/String;

    .line 25
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    iput-object p1, v1, Lcom/tencent/rmonitor/base/meta/InspectUUID;->className:Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v1

    :catch_0
    return-object v0
.end method

.method public final b(Ljava/lang/Object;Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 3
    iget-object v0, p0, Lcom/tencent/bugly/proguard/bc;->b:Lcom/tencent/rmonitor/base/plugin/listener/IMemoryLeakListener;

    invoke-interface {v0, p1}, Lcom/tencent/rmonitor/base/plugin/listener/IMemoryLeakListener;->onFilter(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 4
    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/tencent/bugly/proguard/bc;->a(Ljava/lang/Object;Ljava/lang/String;)Lcom/tencent/rmonitor/base/meta/InspectUUID;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 5
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    invoke-static {}, Landroid/os/Looper;->myQueue()Landroid/os/MessageQueue;

    move-result-object p2

    new-instance v0, Lcom/tencent/bugly/proguard/bc$a;

    invoke-direct {v0, p0, p1}, Lcom/tencent/bugly/proguard/bc$a;-><init>(Lcom/tencent/bugly/proguard/bc;Lcom/tencent/rmonitor/base/meta/InspectUUID;)V

    invoke-virtual {p2, v0}, Landroid/os/MessageQueue;->addIdleHandler(Landroid/os/MessageQueue$IdleHandler;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public c(Ljava/lang/Object;Ljava/lang/String;)V
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 3
    iget-object v0, p0, Lcom/tencent/bugly/proguard/bc;->b:Lcom/tencent/rmonitor/base/plugin/listener/IMemoryLeakListener;

    const-string v1, "RMonitor_MemoryLeak_LeakInspector"

    if-nez v0, :cond_0

    .line 4
    sget-object p1, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    const-string p2, "Please init a listener first!"

    filled-new-array {v1, p2}, [Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/tencent/rmonitor/common/logger/Logger;->e([Ljava/lang/String;)V

    return-void

    .line 5
    :cond_0
    sget-object v0, Lcom/tencent/rmonitor/base/plugin/monitor/PluginController;->INSTANCE:Lcom/tencent/rmonitor/base/plugin/monitor/PluginController;

    const-string v2, "activity_leak"

    invoke-virtual {v0, v2}, Lcom/tencent/rmonitor/base/plugin/monitor/PluginController;->whetherPluginEventSampling(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_1

    .line 6
    sget-object p1, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    const-string p2, "leakSampleLost"

    filled-new-array {v1, p2}, [Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/tencent/rmonitor/common/logger/Logger;->i([Ljava/lang/String;)V

    return-void

    .line 7
    :cond_1
    invoke-virtual {v0, v2}, Lcom/tencent/rmonitor/base/plugin/monitor/PluginController;->canCollect(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 8
    sget-object p1, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    const-string p2, "can not report again"

    filled-new-array {v1, p2}, [Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/tencent/rmonitor/common/logger/Logger;->i([Ljava/lang/String;)V

    return-void

    .line 9
    :cond_2
    invoke-virtual {p0, p1, p2}, Lcom/tencent/bugly/proguard/bc;->b(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public g()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/bc;->a:Landroid/os/Handler;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 7
    return-void
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
