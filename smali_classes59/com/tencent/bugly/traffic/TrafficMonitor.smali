.class public Lcom/tencent/bugly/traffic/TrafficMonitor;
.super Ljava/lang/Object;
.source "BUGLY"

# interfaces
.implements Lcom/tencent/bugly/common/network/INetworkStateListener;
.implements Lcom/tencent/rmonitor/common/lifecycle/IActivityStateCallback;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/bugly/traffic/TrafficMonitor$b;
    }
.end annotation


# static fields
.field public static final t:Ljava/lang/String; = "TrafficMonitor"

.field public static final u:I = 0x1

.field public static final v:I = 0x2

.field public static final w:I = 0x1

.field public static final x:J = 0xea60L

.field public static final y:J = 0x927c0L

.field public static z:Ljava/lang/String; = "unknown"


# instance fields
.field public b:J

.field public final c:Lcom/tencent/bugly/proguard/fh;

.field public d:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public e:Z

.field public f:Z

.field public g:Z

.field public h:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/tencent/bugly/traffic/TrafficMsg;",
            ">;"
        }
    .end annotation
.end field

.field public i:Lcom/tencent/bugly/proguard/e;

.field public j:Lcom/tencent/bugly/proguard/e;

.field public k:Lcom/tencent/bugly/proguard/e;

.field public l:Lcom/tencent/bugly/proguard/e;

.field public m:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/tencent/bugly/proguard/e;",
            ">;"
        }
    .end annotation
.end field

.field public n:Lcom/tencent/bugly/proguard/e;

.field public o:Lcom/tencent/bugly/proguard/e;

.field public p:Lcom/tencent/bugly/proguard/e;

.field public q:Lcom/tencent/bugly/proguard/e;

.field public r:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/tencent/bugly/proguard/e;",
            ">;"
        }
    .end annotation
.end field

.field public final s:Landroid/os/Handler;


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
    .locals 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x0

    .line 3
    iput-wide v0, p0, Lcom/tencent/bugly/traffic/TrafficMonitor;->b:J

    .line 4
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lcom/tencent/bugly/traffic/TrafficMonitor;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 5
    iput-boolean v1, p0, Lcom/tencent/bugly/traffic/TrafficMonitor;->e:Z

    .line 6
    iput-boolean v1, p0, Lcom/tencent/bugly/traffic/TrafficMonitor;->f:Z

    .line 7
    iput-boolean v1, p0, Lcom/tencent/bugly/traffic/TrafficMonitor;->g:Z

    .line 8
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/tencent/bugly/traffic/TrafficMonitor;->h:Ljava/util/ArrayList;

    .line 9
    new-instance v0, Lcom/tencent/bugly/proguard/ri;

    invoke-direct {v0}, Lcom/tencent/bugly/proguard/ri;-><init>()V

    iput-object v0, p0, Lcom/tencent/bugly/traffic/TrafficMonitor;->i:Lcom/tencent/bugly/proguard/e;

    .line 10
    new-instance v0, Lcom/tencent/bugly/proguard/qi;

    invoke-direct {v0}, Lcom/tencent/bugly/proguard/qi;-><init>()V

    iput-object v0, p0, Lcom/tencent/bugly/traffic/TrafficMonitor;->j:Lcom/tencent/bugly/proguard/e;

    .line 11
    new-instance v0, Lcom/tencent/bugly/proguard/qc;

    invoke-direct {v0}, Lcom/tencent/bugly/proguard/qc;-><init>()V

    iput-object v0, p0, Lcom/tencent/bugly/traffic/TrafficMonitor;->k:Lcom/tencent/bugly/proguard/e;

    .line 12
    new-instance v0, Lcom/tencent/bugly/proguard/pc;

    invoke-direct {v0}, Lcom/tencent/bugly/proguard/pc;-><init>()V

    iput-object v0, p0, Lcom/tencent/bugly/traffic/TrafficMonitor;->l:Lcom/tencent/bugly/proguard/e;

    .line 13
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/tencent/bugly/traffic/TrafficMonitor;->m:Ljava/util/List;

    .line 14
    new-instance v0, Lcom/tencent/bugly/proguard/ri;

    invoke-direct {v0}, Lcom/tencent/bugly/proguard/ri;-><init>()V

    iput-object v0, p0, Lcom/tencent/bugly/traffic/TrafficMonitor;->n:Lcom/tencent/bugly/proguard/e;

    .line 15
    new-instance v0, Lcom/tencent/bugly/proguard/qi;

    invoke-direct {v0}, Lcom/tencent/bugly/proguard/qi;-><init>()V

    iput-object v0, p0, Lcom/tencent/bugly/traffic/TrafficMonitor;->o:Lcom/tencent/bugly/proguard/e;

    .line 16
    new-instance v0, Lcom/tencent/bugly/proguard/qc;

    invoke-direct {v0}, Lcom/tencent/bugly/proguard/qc;-><init>()V

    iput-object v0, p0, Lcom/tencent/bugly/traffic/TrafficMonitor;->p:Lcom/tencent/bugly/proguard/e;

    .line 17
    new-instance v0, Lcom/tencent/bugly/proguard/pc;

    invoke-direct {v0}, Lcom/tencent/bugly/proguard/pc;-><init>()V

    iput-object v0, p0, Lcom/tencent/bugly/traffic/TrafficMonitor;->q:Lcom/tencent/bugly/proguard/e;

    .line 18
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/tencent/bugly/traffic/TrafficMonitor;->r:Ljava/util/List;

    .line 19
    new-instance v0, Lcom/tencent/bugly/traffic/TrafficMonitor$a;

    invoke-static {}, Lcom/tencent/bugly/common/thread/ThreadManager;->getMonitorThreadLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lcom/tencent/bugly/traffic/TrafficMonitor$a;-><init>(Lcom/tencent/bugly/traffic/TrafficMonitor;Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/tencent/bugly/traffic/TrafficMonitor;->s:Landroid/os/Handler;

    .line 20
    sget-object v0, Lcom/tencent/rmonitor/base/config/ConfigProxy;->INSTANCE:Lcom/tencent/rmonitor/base/config/ConfigProxy;

    invoke-virtual {v0}, Lcom/tencent/rmonitor/base/config/ConfigProxy;->getConfig()Lcom/tencent/rmonitor/base/config/a;

    move-result-object v0

    .line 21
    const-string/jumbo v1, "traffic_detail"

    invoke-virtual {v0, v1}, Lcom/tencent/rmonitor/base/config/a;->e(Ljava/lang/String;)Lcom/tencent/bugly/proguard/hf;

    move-result-object v0

    check-cast v0, Lcom/tencent/bugly/proguard/fh;

    iput-object v0, p0, Lcom/tencent/bugly/traffic/TrafficMonitor;->c:Lcom/tencent/bugly/proguard/fh;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/tencent/bugly/traffic/TrafficMonitor$a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/tencent/bugly/traffic/TrafficMonitor;-><init>()V

    return-void
.end method

.method public static c()Lcom/tencent/bugly/traffic/TrafficMonitor;
    .locals 1

    .line 1
    sget-object v0, Lcom/tencent/bugly/traffic/TrafficMonitor$b;->a:Lcom/tencent/bugly/traffic/TrafficMonitor;

    return-object v0
.end method

.method private static native nativeClearTrafficInfo()V
.end method

.method private static native nativeGetTrafficInfo(Ljava/util/ArrayList;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/tencent/bugly/traffic/TrafficMsg;",
            ">;)V"
        }
    .end annotation
.end method

.method private static native nativeInitMatrixTraffic(ZZZ[Ljava/lang/String;)V
.end method

.method private static native nativeReleaseMatrixTraffic()V
.end method

.method private static native nativeRestart()V
.end method

.method private static native nativeSetForegroundState(I)V
.end method

.method private static native nativeSetNetworkState(I)V
.end method


# virtual methods
.method public final a(Ljava/lang/String;Lcom/tencent/bugly/traffic/TrafficMsg;)Ljava/util/ArrayList;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/tencent/bugly/traffic/TrafficMsg;",
            ")",
            "Ljava/util/ArrayList<",
            "Lcom/tencent/rmonitor/base/meta/TrafficInfo;",
            ">;"
        }
    .end annotation

    .line 4
    invoke-static {}, Lcom/tencent/rmonitor/base/db/table/TrafficInfoTable;->getInstance()Lcom/tencent/rmonitor/base/db/table/TrafficInfoTable;

    move-result-object v0

    iget v1, p2, Lcom/tencent/bugly/traffic/TrafficMsg;->mFore:I

    .line 5
    invoke-static {v1}, Lcom/tencent/bugly/proguard/jh;->a(I)Ljava/lang/String;

    move-result-object v3

    iget v1, p2, Lcom/tencent/bugly/traffic/TrafficMsg;->mNet:I

    .line 6
    invoke-static {v1}, Lcom/tencent/bugly/proguard/jh;->b(I)Ljava/lang/String;

    move-result-object v4

    sget-object v1, Lcom/tencent/rmonitor/base/meta/BaseInfo;->app:Landroid/app/Application;

    .line 7
    invoke-static {v1}, Lcom/tencent/rmonitor/common/util/AppInfo;->obtainProcessName(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v5

    .line 8
    invoke-static {}, Lcom/tencent/bugly/proguard/ch;->d()Ljava/lang/String;

    move-result-object v6

    iget-object v7, p2, Lcom/tencent/bugly/traffic/TrafficMsg;->mCollectType:Ljava/lang/String;

    move-object v2, p1

    filled-new-array/range {v2 .. v7}, [Ljava/lang/String;

    move-result-object v3

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v1, 0x0

    .line 9
    const-string v2, "host = ? AND front_state = ? AND net_state = ? AND process_name = ? AND process_launch_id = ? AND type = ?"

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-virtual/range {v0 .. v8}, Lcom/tencent/rmonitor/base/db/table/TrafficInfoTable;->query([Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/ArrayList;

    return-object p1
.end method

.method public a(Ljava/util/ArrayList;)Ljava/util/ArrayList;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/tencent/bugly/traffic/TrafficMsg;",
            ">;)",
            "Ljava/util/ArrayList<",
            "Lcom/tencent/bugly/traffic/TrafficMsg;",
            ">;"
        }
    .end annotation

    .line 27
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/tencent/bugly/traffic/TrafficMsg;

    .line 28
    invoke-virtual {p0, v0}, Lcom/tencent/bugly/traffic/TrafficMonitor;->a(Lcom/tencent/bugly/traffic/TrafficMsg;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 29
    iget-object v1, p0, Lcom/tencent/bugly/traffic/TrafficMonitor;->h:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 30
    :cond_1
    iget-object p1, p0, Lcom/tencent/bugly/traffic/TrafficMonitor;->h:Ljava/util/ArrayList;

    return-object p1
.end method

.method public final a(Ljava/util/Map;Ljava/util/Map;)Ljava/util/ArrayList;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/tencent/bugly/traffic/TrafficMsg;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/tencent/bugly/traffic/TrafficMsg;",
            ">;)",
            "Ljava/util/ArrayList<",
            "Lcom/tencent/bugly/traffic/TrafficMsg;",
            ">;"
        }
    .end annotation

    .line 10
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    if-eqz p1, :cond_0

    .line 11
    invoke-interface {p1}, Ljava/util/Map;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    .line 12
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 13
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/tencent/bugly/traffic/TrafficMsg;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    if-eqz p2, :cond_1

    .line 14
    invoke-interface {p2}, Ljava/util/Map;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_1

    .line 15
    invoke-interface {p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/Map$Entry;

    .line 16
    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/tencent/bugly/traffic/TrafficMsg;

    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    return-object v0
.end method

.method public a()V
    .locals 1

    .line 1
    invoke-static {}, Lcom/tencent/bugly/traffic/TrafficMonitor;->nativeClearTrafficInfo()V

    .line 2
    invoke-static {}, Lcom/tencent/bugly/traffic/custom/CustomTrafficStatistic;->getInstance()Lcom/tencent/bugly/traffic/custom/CustomTrafficStatistic;

    move-result-object v0

    invoke-virtual {v0}, Lcom/tencent/bugly/traffic/custom/CustomTrafficStatistic;->getHttpQueue()Ljava/util/concurrent/ConcurrentLinkedQueue;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->clear()V

    .line 3
    invoke-static {}, Lcom/tencent/bugly/traffic/custom/CustomTrafficStatistic;->getInstance()Lcom/tencent/bugly/traffic/custom/CustomTrafficStatistic;

    move-result-object v0

    invoke-virtual {v0}, Lcom/tencent/bugly/traffic/custom/CustomTrafficStatistic;->getSocketToQueue()Ljava/util/concurrent/ConcurrentLinkedQueue;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->clear()V

    return-void
.end method

.method public final a(Ljava/util/ArrayList;Z)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/tencent/bugly/traffic/TrafficMsg;",
            ">;Z)V"
        }
    .end annotation

    .line 31
    invoke-virtual {p0, p1}, Lcom/tencent/bugly/traffic/TrafficMonitor;->a(Ljava/util/ArrayList;)Ljava/util/ArrayList;

    .line 32
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    .line 33
    iget-wide v2, p0, Lcom/tencent/bugly/traffic/TrafficMonitor;->b:J

    sub-long v2, v0, v2

    const-wide/32 v4, 0x927c0

    cmp-long p1, v2, v4

    if-gez p1, :cond_1

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    return-void

    .line 34
    :cond_1
    :goto_0
    iput-wide v0, p0, Lcom/tencent/bugly/traffic/TrafficMonitor;->b:J

    .line 35
    iget-object p1, p0, Lcom/tencent/bugly/traffic/TrafficMonitor;->m:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/tencent/bugly/proguard/e;

    .line 36
    iget-object v0, p0, Lcom/tencent/bugly/traffic/TrafficMonitor;->h:Ljava/util/ArrayList;

    invoke-virtual {p2, v0}, Lcom/tencent/bugly/proguard/e;->a(Ljava/util/ArrayList;)V

    goto :goto_1

    .line 37
    :cond_2
    invoke-virtual {p0}, Lcom/tencent/bugly/traffic/TrafficMonitor;->b()I

    move-result p1

    if-nez p1, :cond_3

    .line 38
    invoke-static {}, Ljava/lang/Math;->random()D

    move-result-wide v0

    iget-object p2, p0, Lcom/tencent/bugly/traffic/TrafficMonitor;->c:Lcom/tencent/bugly/proguard/fh;

    iget-wide v2, p2, Lcom/tencent/bugly/proguard/fh;->t:D

    cmpg-double p2, v0, v2

    if-gez p2, :cond_3

    .line 39
    iget-object p2, p0, Lcom/tencent/bugly/traffic/TrafficMonitor;->h:Ljava/util/ArrayList;

    iget-object v0, p0, Lcom/tencent/bugly/traffic/TrafficMonitor;->m:Ljava/util/List;

    invoke-static {p1, p2, v0}, Lcom/tencent/bugly/proguard/ih;->b(ILjava/util/ArrayList;Ljava/util/List;)V

    goto :goto_2

    :cond_3
    if-eqz p1, :cond_4

    .line 40
    invoke-static {}, Ljava/lang/Math;->random()D

    move-result-wide v0

    iget-object p2, p0, Lcom/tencent/bugly/traffic/TrafficMonitor;->c:Lcom/tencent/bugly/proguard/fh;

    iget-wide v2, p2, Lcom/tencent/bugly/proguard/fh;->u:D

    cmpg-double p2, v0, v2

    if-gez p2, :cond_4

    .line 41
    iget-object p2, p0, Lcom/tencent/bugly/traffic/TrafficMonitor;->h:Ljava/util/ArrayList;

    iget-object v0, p0, Lcom/tencent/bugly/traffic/TrafficMonitor;->m:Ljava/util/List;

    invoke-static {p1, p2, v0}, Lcom/tencent/bugly/proguard/ih;->b(ILjava/util/ArrayList;Ljava/util/List;)V

    .line 42
    :cond_4
    :goto_2
    iget-object p1, p0, Lcom/tencent/bugly/traffic/TrafficMonitor;->h:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->clear()V

    return-void
.end method

.method public a(Z)V
    .locals 4

    .line 43
    invoke-virtual {p0}, Lcom/tencent/bugly/traffic/TrafficMonitor;->d()Ljava/util/ArrayList;

    move-result-object v0

    .line 44
    iget-boolean v1, p0, Lcom/tencent/bugly/traffic/TrafficMonitor;->e:Z

    const-string v2, "TrafficMonitor"

    if-eqz v1, :cond_0

    .line 45
    sget-object v1, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    const-string/jumbo v3, "saveTrafficMsgs"

    filled-new-array {v2, v3}, [Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/tencent/rmonitor/common/logger/Logger;->d([Ljava/lang/String;)V

    .line 46
    invoke-virtual {p0, v0}, Lcom/tencent/bugly/traffic/TrafficMonitor;->c(Ljava/util/ArrayList;)V

    .line 47
    :cond_0
    iget-boolean v1, p0, Lcom/tencent/bugly/traffic/TrafficMonitor;->f:Z

    if-eqz v1, :cond_1

    .line 48
    sget-object v1, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    const-string/jumbo v3, "reportTrafficMsgs"

    filled-new-array {v2, v3}, [Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/tencent/rmonitor/common/logger/Logger;->d([Ljava/lang/String;)V

    .line 49
    invoke-virtual {p0, v0, p1}, Lcom/tencent/bugly/traffic/TrafficMonitor;->a(Ljava/util/ArrayList;Z)V

    :cond_1
    return-void
.end method

.method public final a(Lcom/tencent/bugly/traffic/TrafficMsg;)Z
    .locals 8

    .line 17
    iget-object v0, p0, Lcom/tencent/bugly/traffic/TrafficMonitor;->h:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/tencent/bugly/traffic/TrafficMsg;

    .line 18
    iget-object v2, p1, Lcom/tencent/bugly/traffic/TrafficMsg;->mCollectType:Ljava/lang/String;

    iget-object v3, v1, Lcom/tencent/bugly/traffic/TrafficMsg;->mCollectType:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 19
    iget-object v2, p1, Lcom/tencent/bugly/traffic/TrafficMsg;->mCollectType:Ljava/lang/String;

    const-string v3, "custom"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    const/4 v3, 0x1

    if-eqz v2, :cond_1

    iget-object v2, v1, Lcom/tencent/bugly/traffic/TrafficMsg;->mHost:Ljava/lang/String;

    iget-object v4, p1, Lcom/tencent/bugly/traffic/TrafficMsg;->mHost:Ljava/lang/String;

    .line 20
    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 21
    iget v0, v1, Lcom/tencent/bugly/traffic/TrafficMsg;->mRx:I

    iget v2, p1, Lcom/tencent/bugly/traffic/TrafficMsg;->mRx:I

    add-int/2addr v0, v2

    iput v0, v1, Lcom/tencent/bugly/traffic/TrafficMsg;->mRx:I

    .line 22
    iget v0, v1, Lcom/tencent/bugly/traffic/TrafficMsg;->mTx:I

    iget p1, p1, Lcom/tencent/bugly/traffic/TrafficMsg;->mTx:I

    add-int/2addr v0, p1

    iput v0, v1, Lcom/tencent/bugly/traffic/TrafficMsg;->mTx:I

    return v3

    .line 23
    :cond_1
    iget-wide v4, p1, Lcom/tencent/bugly/traffic/TrafficMsg;->mId:J

    const-wide/16 v6, -0x1

    cmp-long v2, v4, v6

    if-eqz v2, :cond_0

    iget-wide v6, v1, Lcom/tencent/bugly/traffic/TrafficMsg;->mId:J

    cmp-long v2, v4, v6

    if-nez v2, :cond_0

    iget-object v2, p1, Lcom/tencent/bugly/traffic/TrafficMsg;->mCollectType:Ljava/lang/String;

    .line 24
    const-string v4, "auto"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 25
    iget v0, v1, Lcom/tencent/bugly/traffic/TrafficMsg;->mRx:I

    iget v2, p1, Lcom/tencent/bugly/traffic/TrafficMsg;->mRx:I

    add-int/2addr v0, v2

    iput v0, v1, Lcom/tencent/bugly/traffic/TrafficMsg;->mRx:I

    .line 26
    iget v0, v1, Lcom/tencent/bugly/traffic/TrafficMsg;->mTx:I

    iget p1, p1, Lcom/tencent/bugly/traffic/TrafficMsg;->mTx:I

    add-int/2addr v0, p1

    iput v0, v1, Lcom/tencent/bugly/traffic/TrafficMsg;->mTx:I

    return v3

    :cond_2
    const/4 p1, 0x0

    return p1
.end method

.method public final b()I
    .locals 8

    .line 16
    iget-object v0, p0, Lcom/tencent/bugly/traffic/TrafficMonitor;->i:Lcom/tencent/bugly/proguard/e;

    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/e;->c()J

    move-result-wide v0

    iget-object v2, p0, Lcom/tencent/bugly/traffic/TrafficMonitor;->j:Lcom/tencent/bugly/proguard/e;

    .line 17
    invoke-virtual {v2}, Lcom/tencent/bugly/proguard/e;->c()J

    move-result-wide v2

    add-long/2addr v2, v0

    iget-object v0, p0, Lcom/tencent/bugly/traffic/TrafficMonitor;->k:Lcom/tencent/bugly/proguard/e;

    .line 18
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/e;->c()J

    move-result-wide v0

    add-long/2addr v0, v2

    iget-object v2, p0, Lcom/tencent/bugly/traffic/TrafficMonitor;->l:Lcom/tencent/bugly/proguard/e;

    .line 19
    invoke-virtual {v2}, Lcom/tencent/bugly/proguard/e;->c()J

    move-result-wide v2

    add-long/2addr v2, v0

    long-to-double v0, v2

    .line 20
    iget-object v2, p0, Lcom/tencent/bugly/traffic/TrafficMonitor;->c:Lcom/tencent/bugly/proguard/fh;

    iget-wide v2, v2, Lcom/tencent/bugly/proguard/fh;->n:D

    const-wide/high16 v4, 0x4090000000000000L    # 1024.0

    mul-double/2addr v2, v4

    mul-double/2addr v2, v4

    cmpl-double v0, v0, v2

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 21
    :goto_0
    iget-object v1, p0, Lcom/tencent/bugly/traffic/TrafficMonitor;->l:Lcom/tencent/bugly/proguard/e;

    invoke-virtual {v1}, Lcom/tencent/bugly/proguard/e;->c()J

    move-result-wide v1

    iget-object v3, p0, Lcom/tencent/bugly/traffic/TrafficMonitor;->j:Lcom/tencent/bugly/proguard/e;

    invoke-virtual {v3}, Lcom/tencent/bugly/proguard/e;->c()J

    move-result-wide v6

    add-long/2addr v6, v1

    long-to-double v1, v6

    .line 22
    iget-object v3, p0, Lcom/tencent/bugly/traffic/TrafficMonitor;->c:Lcom/tencent/bugly/proguard/fh;

    iget-wide v6, v3, Lcom/tencent/bugly/proguard/fh;->o:D

    mul-double/2addr v6, v4

    mul-double/2addr v6, v4

    cmpl-double v1, v1, v6

    if-lez v1, :cond_1

    add-int/lit8 v0, v0, 0x2

    .line 23
    :cond_1
    iget-object v1, p0, Lcom/tencent/bugly/traffic/TrafficMonitor;->k:Lcom/tencent/bugly/proguard/e;

    invoke-virtual {v1}, Lcom/tencent/bugly/proguard/e;->c()J

    move-result-wide v1

    iget-object v3, p0, Lcom/tencent/bugly/traffic/TrafficMonitor;->l:Lcom/tencent/bugly/proguard/e;

    invoke-virtual {v3}, Lcom/tencent/bugly/proguard/e;->c()J

    move-result-wide v6

    add-long/2addr v6, v1

    long-to-double v1, v6

    .line 24
    iget-object v3, p0, Lcom/tencent/bugly/traffic/TrafficMonitor;->c:Lcom/tencent/bugly/proguard/fh;

    iget-wide v6, v3, Lcom/tencent/bugly/proguard/fh;->p:D

    mul-double/2addr v6, v4

    mul-double/2addr v6, v4

    cmpl-double v1, v1, v6

    if-lez v1, :cond_2

    add-int/lit8 v0, v0, 0x4

    .line 25
    :cond_2
    iget-object v1, p0, Lcom/tencent/bugly/traffic/TrafficMonitor;->j:Lcom/tencent/bugly/proguard/e;

    invoke-virtual {v1}, Lcom/tencent/bugly/proguard/e;->e()J

    move-result-wide v1

    iget-object v3, p0, Lcom/tencent/bugly/traffic/TrafficMonitor;->i:Lcom/tencent/bugly/proguard/e;

    .line 26
    invoke-virtual {v3}, Lcom/tencent/bugly/proguard/e;->e()J

    move-result-wide v6

    add-long/2addr v6, v1

    iget-object v1, p0, Lcom/tencent/bugly/traffic/TrafficMonitor;->k:Lcom/tencent/bugly/proguard/e;

    .line 27
    invoke-virtual {v1}, Lcom/tencent/bugly/proguard/e;->e()J

    move-result-wide v1

    add-long/2addr v1, v6

    iget-object v3, p0, Lcom/tencent/bugly/traffic/TrafficMonitor;->l:Lcom/tencent/bugly/proguard/e;

    .line 28
    invoke-virtual {v3}, Lcom/tencent/bugly/proguard/e;->e()J

    move-result-wide v6

    add-long/2addr v6, v1

    long-to-double v1, v6

    .line 29
    iget-object v3, p0, Lcom/tencent/bugly/traffic/TrafficMonitor;->c:Lcom/tencent/bugly/proguard/fh;

    iget-wide v6, v3, Lcom/tencent/bugly/proguard/fh;->q:D

    mul-double/2addr v6, v4

    mul-double/2addr v6, v4

    cmpl-double v1, v1, v6

    if-lez v1, :cond_3

    add-int/lit8 v0, v0, 0x10

    :cond_3
    return v0
.end method

.method public final b(Ljava/util/ArrayList;)Ljava/util/ArrayList;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/tencent/bugly/traffic/TrafficMsg;",
            ">;)",
            "Ljava/util/ArrayList<",
            "Lcom/tencent/bugly/traffic/TrafficMsg;",
            ">;"
        }
    .end annotation

    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/traffic/TrafficMonitor;->c:Lcom/tencent/bugly/proguard/fh;

    iget-boolean v0, v0, Lcom/tencent/bugly/proguard/fh;->s:Z

    if-eqz v0, :cond_2

    .line 3
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/tencent/bugly/traffic/TrafficMsg;

    .line 5
    iget-object v2, v1, Lcom/tencent/bugly/traffic/TrafficMsg;->mHost:Ljava/lang/String;

    invoke-static {v2}, Lcom/tencent/bugly/proguard/kd;->a(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 6
    new-instance v2, Lcom/tencent/bugly/traffic/TrafficMsg;

    invoke-direct {v2}, Lcom/tencent/bugly/traffic/TrafficMsg;-><init>()V

    .line 7
    iget-object v3, v1, Lcom/tencent/bugly/traffic/TrafficMsg;->mCollectType:Ljava/lang/String;

    iput-object v3, v2, Lcom/tencent/bugly/traffic/TrafficMsg;->mCollectType:Ljava/lang/String;

    .line 8
    iget-object v3, v1, Lcom/tencent/bugly/traffic/TrafficMsg;->mHost:Ljava/lang/String;

    iput-object v3, v2, Lcom/tencent/bugly/traffic/TrafficMsg;->mHost:Ljava/lang/String;

    .line 9
    iget v3, v1, Lcom/tencent/bugly/traffic/TrafficMsg;->mRx:I

    iput v3, v2, Lcom/tencent/bugly/traffic/TrafficMsg;->mRx:I

    .line 10
    iget v3, v1, Lcom/tencent/bugly/traffic/TrafficMsg;->mTx:I

    iput v3, v2, Lcom/tencent/bugly/traffic/TrafficMsg;->mTx:I

    .line 11
    iget v3, v1, Lcom/tencent/bugly/traffic/TrafficMsg;->mFore:I

    iput v3, v2, Lcom/tencent/bugly/traffic/TrafficMsg;->mFore:I

    .line 12
    iget-wide v3, v1, Lcom/tencent/bugly/traffic/TrafficMsg;->mId:J

    iput-wide v3, v2, Lcom/tencent/bugly/traffic/TrafficMsg;->mId:J

    .line 13
    iget v3, v1, Lcom/tencent/bugly/traffic/TrafficMsg;->mNet:I

    iput v3, v2, Lcom/tencent/bugly/traffic/TrafficMsg;->mNet:I

    .line 14
    iget-wide v3, v1, Lcom/tencent/bugly/traffic/TrafficMsg;->mTime:J

    iput-wide v3, v2, Lcom/tencent/bugly/traffic/TrafficMsg;->mTime:J

    .line 15
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v0

    :cond_2
    return-object p1
.end method

.method public b(Z)Z
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/tencent/bugly/traffic/TrafficMonitor;->f:Z

    return p1
.end method

.method public final c(Ljava/util/ArrayList;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/tencent/bugly/traffic/TrafficMsg;",
            ">;)V"
        }
    .end annotation

    .line 3
    iget-object v0, p0, Lcom/tencent/bugly/traffic/TrafficMonitor;->r:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/tencent/bugly/proguard/e;

    .line 4
    invoke-virtual {v1, p1}, Lcom/tencent/bugly/proguard/e;->a(Ljava/util/ArrayList;)V

    .line 5
    invoke-virtual {v1}, Lcom/tencent/bugly/proguard/e;->d()Ljava/util/Map;

    move-result-object v2

    invoke-virtual {v1}, Lcom/tencent/bugly/proguard/e;->b()Ljava/util/Map;

    move-result-object v1

    invoke-virtual {p0, v2, v1}, Lcom/tencent/bugly/traffic/TrafficMonitor;->a(Ljava/util/Map;Ljava/util/Map;)Ljava/util/ArrayList;

    move-result-object v1

    .line 6
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/tencent/bugly/traffic/TrafficMsg;

    .line 7
    iget-object v3, v2, Lcom/tencent/bugly/traffic/TrafficMsg;->mHost:Ljava/lang/String;

    invoke-virtual {p0, v3, v2}, Lcom/tencent/bugly/traffic/TrafficMonitor;->a(Ljava/lang/String;Lcom/tencent/bugly/traffic/TrafficMsg;)Ljava/util/ArrayList;

    move-result-object v3

    .line 8
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v4

    const/4 v5, 0x1

    if-lt v4, v5, :cond_2

    const/4 v4, 0x0

    .line 9
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/tencent/rmonitor/base/meta/TrafficInfo;

    .line 10
    :goto_1
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v6

    if-ge v5, v6, :cond_1

    .line 11
    invoke-virtual {v4}, Lcom/tencent/rmonitor/base/meta/TrafficInfo;->getRx()I

    move-result v6

    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/tencent/rmonitor/base/meta/TrafficInfo;

    invoke-virtual {v7}, Lcom/tencent/rmonitor/base/meta/TrafficInfo;->getRx()I

    move-result v7

    add-int/2addr v7, v6

    invoke-virtual {v4, v7}, Lcom/tencent/rmonitor/base/meta/TrafficInfo;->setRx(I)V

    .line 12
    invoke-virtual {v4}, Lcom/tencent/rmonitor/base/meta/TrafficInfo;->getTx()I

    move-result v6

    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/tencent/rmonitor/base/meta/TrafficInfo;

    invoke-virtual {v7}, Lcom/tencent/rmonitor/base/meta/TrafficInfo;->getTx()I

    move-result v7

    add-int/2addr v7, v6

    invoke-virtual {v4, v7}, Lcom/tencent/rmonitor/base/meta/TrafficInfo;->setTx(I)V

    .line 13
    invoke-static {}, Lcom/tencent/rmonitor/base/db/table/TrafficInfoTable;->getInstance()Lcom/tencent/rmonitor/base/db/table/TrafficInfoTable;

    move-result-object v6

    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/tencent/rmonitor/base/meta/TrafficInfo;

    invoke-virtual {v6, v7}, Lcom/tencent/rmonitor/base/db/table/TrafficInfoTable;->delete(Lcom/tencent/rmonitor/base/meta/TrafficInfo;)I

    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    .line 14
    :cond_1
    invoke-virtual {v4}, Lcom/tencent/rmonitor/base/meta/TrafficInfo;->getRx()I

    move-result v3

    iget v5, v2, Lcom/tencent/bugly/traffic/TrafficMsg;->mRx:I

    add-int/2addr v3, v5

    invoke-virtual {v4, v3}, Lcom/tencent/rmonitor/base/meta/TrafficInfo;->setRx(I)V

    .line 15
    invoke-virtual {v4}, Lcom/tencent/rmonitor/base/meta/TrafficInfo;->getTx()I

    move-result v3

    iget v2, v2, Lcom/tencent/bugly/traffic/TrafficMsg;->mTx:I

    add-int/2addr v3, v2

    invoke-virtual {v4, v3}, Lcom/tencent/rmonitor/base/meta/TrafficInfo;->setTx(I)V

    .line 16
    invoke-static {}, Lcom/tencent/rmonitor/base/db/table/TrafficInfoTable;->getInstance()Lcom/tencent/rmonitor/base/db/table/TrafficInfoTable;

    move-result-object v2

    invoke-virtual {v2, v4}, Lcom/tencent/rmonitor/base/db/table/TrafficInfoTable;->replace(Lcom/tencent/rmonitor/base/meta/TrafficInfo;)I

    goto :goto_0

    .line 17
    :cond_2
    new-instance v3, Lcom/tencent/rmonitor/base/meta/TrafficInfo;

    invoke-direct {v3}, Lcom/tencent/rmonitor/base/meta/TrafficInfo;-><init>()V

    .line 18
    iget-object v4, v2, Lcom/tencent/bugly/traffic/TrafficMsg;->mHost:Ljava/lang/String;

    invoke-virtual {v3, v4}, Lcom/tencent/rmonitor/base/meta/TrafficInfo;->setHost(Ljava/lang/String;)V

    .line 19
    sget-object v4, Lcom/tencent/rmonitor/base/meta/BaseInfo;->app:Landroid/app/Application;

    invoke-static {v4}, Lcom/tencent/bugly/proguard/ch;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/tencent/rmonitor/base/meta/TrafficInfo;->setLaunchID(Ljava/lang/String;)V

    .line 20
    sget-object v4, Lcom/tencent/rmonitor/base/meta/BaseInfo;->app:Landroid/app/Application;

    invoke-static {v4}, Lcom/tencent/rmonitor/common/util/AppInfo;->obtainProcessName(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/tencent/rmonitor/base/meta/TrafficInfo;->setProcessName(Ljava/lang/String;)V

    .line 21
    sget-object v4, Lcom/tencent/bugly/proguard/ch;->f:Ljava/lang/String;

    .line 22
    invoke-virtual {v3, v4}, Lcom/tencent/rmonitor/base/meta/TrafficInfo;->setProcessLaunchID(Ljava/lang/String;)V

    .line 23
    iget v4, v2, Lcom/tencent/bugly/traffic/TrafficMsg;->mFore:I

    invoke-static {v4}, Lcom/tencent/bugly/proguard/jh;->a(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/tencent/rmonitor/base/meta/TrafficInfo;->setFrontState(Ljava/lang/String;)V

    .line 24
    iget v4, v2, Lcom/tencent/bugly/traffic/TrafficMsg;->mNet:I

    invoke-static {v4}, Lcom/tencent/bugly/proguard/jh;->b(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/tencent/rmonitor/base/meta/TrafficInfo;->setNetState(Ljava/lang/String;)V

    .line 25
    iget v4, v2, Lcom/tencent/bugly/traffic/TrafficMsg;->mRx:I

    invoke-virtual {v3, v4}, Lcom/tencent/rmonitor/base/meta/TrafficInfo;->setRx(I)V

    .line 26
    iget v4, v2, Lcom/tencent/bugly/traffic/TrafficMsg;->mTx:I

    invoke-virtual {v3, v4}, Lcom/tencent/rmonitor/base/meta/TrafficInfo;->setTx(I)V

    .line 27
    sget-object v4, Lcom/tencent/rmonitor/base/meta/BaseInfo;->userMeta:Lcom/tencent/bugly/common/meta/UserMeta;

    iget-object v4, v4, Lcom/tencent/bugly/common/meta/UserMeta;->appVersion:Ljava/lang/String;

    invoke-virtual {v3, v4}, Lcom/tencent/rmonitor/base/meta/TrafficInfo;->setAppVersion(Ljava/lang/String;)V

    .line 28
    iget-object v2, v2, Lcom/tencent/bugly/traffic/TrafficMsg;->mCollectType:Ljava/lang/String;

    invoke-virtual {v3, v2}, Lcom/tencent/rmonitor/base/meta/TrafficInfo;->setType(Ljava/lang/String;)V

    .line 29
    invoke-static {}, Lcom/tencent/bugly/proguard/u7;->c()Lcom/tencent/bugly/proguard/u7;

    move-result-object v2

    invoke-virtual {v2}, Lcom/tencent/bugly/proguard/u7;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Lcom/tencent/rmonitor/base/meta/TrafficInfo;->setHotPatchNum(Ljava/lang/String;)V

    .line 30
    invoke-static {}, Lcom/tencent/bugly/proguard/w3;->a()Lcom/tencent/rmonitor/custom/a;

    move-result-object v2

    invoke-virtual {v2}, Lcom/tencent/rmonitor/custom/a;->g()Lorg/json/JSONObject;

    move-result-object v2

    if-eqz v2, :cond_3

    .line 31
    invoke-virtual {v3, v2}, Lcom/tencent/rmonitor/base/meta/TrafficInfo;->setUserData(Lorg/json/JSONObject;)V

    .line 32
    :cond_3
    invoke-static {}, Lcom/tencent/rmonitor/base/db/table/TrafficInfoTable;->getInstance()Lcom/tencent/rmonitor/base/db/table/TrafficInfoTable;

    move-result-object v2

    invoke-virtual {v2, v3}, Lcom/tencent/rmonitor/base/db/table/TrafficInfoTable;->replace(Lcom/tencent/rmonitor/base/meta/TrafficInfo;)I

    goto/16 :goto_0

    :cond_4
    return-void
.end method

.method public c(Z)Z
    .locals 0

    .line 2
    iput-boolean p1, p0, Lcom/tencent/bugly/traffic/TrafficMonitor;->e:Z

    return p1
.end method

.method public d()Ljava/util/ArrayList;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Lcom/tencent/bugly/traffic/TrafficMsg;",
            ">;"
        }
    .end annotation

    .line 10
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 11
    invoke-static {v0}, Lcom/tencent/bugly/traffic/TrafficMonitor;->nativeGetTrafficInfo(Ljava/util/ArrayList;)V

    .line 12
    invoke-static {}, Lcom/tencent/bugly/traffic/custom/CustomTrafficStatistic;->getInstance()Lcom/tencent/bugly/traffic/custom/CustomTrafficStatistic;

    move-result-object v1

    invoke-virtual {v1}, Lcom/tencent/bugly/traffic/custom/CustomTrafficStatistic;->getHttpQueue()Ljava/util/concurrent/ConcurrentLinkedQueue;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/tencent/bugly/traffic/custom/SocketInfo;

    .line 13
    new-instance v3, Lcom/tencent/bugly/traffic/TrafficMsg;

    invoke-direct {v3}, Lcom/tencent/bugly/traffic/TrafficMsg;-><init>()V

    .line 14
    iget-wide v4, v2, Lcom/tencent/bugly/traffic/custom/SocketInfo;->receivedBytes:J

    long-to-int v4, v4

    iput v4, v3, Lcom/tencent/bugly/traffic/TrafficMsg;->mRx:I

    .line 15
    iget-wide v4, v2, Lcom/tencent/bugly/traffic/custom/SocketInfo;->sendBytes:J

    long-to-int v4, v4

    iput v4, v3, Lcom/tencent/bugly/traffic/TrafficMsg;->mTx:I

    .line 16
    const-string v4, "custom"

    iput-object v4, v3, Lcom/tencent/bugly/traffic/TrafficMsg;->mCollectType:Ljava/lang/String;

    .line 17
    iget v4, v2, Lcom/tencent/bugly/traffic/custom/SocketInfo;->networkType:I

    iput v4, v3, Lcom/tencent/bugly/traffic/TrafficMsg;->mNet:I

    .line 18
    iget v4, v2, Lcom/tencent/bugly/traffic/custom/SocketInfo;->frontState:I

    iput v4, v3, Lcom/tencent/bugly/traffic/TrafficMsg;->mFore:I

    .line 19
    iget-object v4, v2, Lcom/tencent/bugly/traffic/custom/SocketInfo;->host:Ljava/lang/String;

    iput-object v4, v3, Lcom/tencent/bugly/traffic/TrafficMsg;->mHost:Ljava/lang/String;

    .line 20
    iget-wide v4, v2, Lcom/tencent/bugly/traffic/custom/SocketInfo;->startTimeStamp:J

    iput-wide v4, v3, Lcom/tencent/bugly/traffic/TrafficMsg;->mTime:J

    .line 21
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 22
    :cond_0
    invoke-virtual {p0, v0}, Lcom/tencent/bugly/traffic/TrafficMonitor;->b(Ljava/util/ArrayList;)Ljava/util/ArrayList;

    move-result-object v0

    return-object v0
.end method

.method public d(Z)V
    .locals 3

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    .line 1
    invoke-virtual {p0}, Lcom/tencent/bugly/traffic/TrafficMonitor;->d()Ljava/util/ArrayList;

    move-result-object p1

    .line 2
    invoke-virtual {p0, p1}, Lcom/tencent/bugly/traffic/TrafficMonitor;->c(Ljava/util/ArrayList;)V

    .line 3
    invoke-virtual {p0, p1, v0}, Lcom/tencent/bugly/traffic/TrafficMonitor;->a(Ljava/util/ArrayList;Z)V

    .line 4
    invoke-virtual {p0}, Lcom/tencent/bugly/traffic/TrafficMonitor;->a()V

    .line 5
    :cond_0
    iget-boolean p1, p0, Lcom/tencent/bugly/traffic/TrafficMonitor;->e:Z

    if-nez p1, :cond_1

    iget-boolean p1, p0, Lcom/tencent/bugly/traffic/TrafficMonitor;->f:Z

    if-nez p1, :cond_1

    .line 6
    sget-object p1, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    const-string v1, "TrafficMonitor"

    const-string/jumbo v2, "traffic monitor stop"

    filled-new-array {v1, v2}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/tencent/rmonitor/common/logger/Logger;->i([Ljava/lang/String;)V

    .line 7
    iget-object p1, p0, Lcom/tencent/bugly/traffic/TrafficMonitor;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {p1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 8
    iget-object p1, p0, Lcom/tencent/bugly/traffic/TrafficMonitor;->s:Landroid/os/Handler;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Landroid/os/Handler;->removeMessages(I)V

    .line 9
    invoke-static {}, Lcom/tencent/bugly/traffic/TrafficMonitor;->nativeReleaseMatrixTraffic()V

    :cond_1
    return-void
.end method

.method public final e()V
    .locals 5

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/traffic/TrafficMonitor;->m:Ljava/util/List;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/tencent/bugly/traffic/TrafficMonitor;->i:Lcom/tencent/bugly/proguard/e;

    .line 5
    .line 6
    .line 7
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 8
    .line 9
    iget-object v0, p0, Lcom/tencent/bugly/traffic/TrafficMonitor;->m:Ljava/util/List;

    .line 10
    .line 11
    iget-object v1, p0, Lcom/tencent/bugly/traffic/TrafficMonitor;->j:Lcom/tencent/bugly/proguard/e;

    .line 12
    .line 13
    .line 14
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 15
    .line 16
    iget-object v0, p0, Lcom/tencent/bugly/traffic/TrafficMonitor;->m:Ljava/util/List;

    .line 17
    .line 18
    iget-object v1, p0, Lcom/tencent/bugly/traffic/TrafficMonitor;->k:Lcom/tencent/bugly/proguard/e;

    .line 19
    .line 20
    .line 21
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 22
    .line 23
    iget-object v0, p0, Lcom/tencent/bugly/traffic/TrafficMonitor;->m:Ljava/util/List;

    .line 24
    .line 25
    iget-object v1, p0, Lcom/tencent/bugly/traffic/TrafficMonitor;->l:Lcom/tencent/bugly/proguard/e;

    .line 26
    .line 27
    .line 28
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 29
    .line 30
    iget-object v0, p0, Lcom/tencent/bugly/traffic/TrafficMonitor;->r:Ljava/util/List;

    .line 31
    .line 32
    iget-object v1, p0, Lcom/tencent/bugly/traffic/TrafficMonitor;->n:Lcom/tencent/bugly/proguard/e;

    .line 33
    .line 34
    .line 35
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 36
    .line 37
    iget-object v0, p0, Lcom/tencent/bugly/traffic/TrafficMonitor;->r:Ljava/util/List;

    .line 38
    .line 39
    iget-object v1, p0, Lcom/tencent/bugly/traffic/TrafficMonitor;->o:Lcom/tencent/bugly/proguard/e;

    .line 40
    .line 41
    .line 42
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 43
    .line 44
    iget-object v0, p0, Lcom/tencent/bugly/traffic/TrafficMonitor;->r:Ljava/util/List;

    .line 45
    .line 46
    iget-object v1, p0, Lcom/tencent/bugly/traffic/TrafficMonitor;->p:Lcom/tencent/bugly/proguard/e;

    .line 47
    .line 48
    .line 49
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 50
    .line 51
    iget-object v0, p0, Lcom/tencent/bugly/traffic/TrafficMonitor;->r:Ljava/util/List;

    .line 52
    .line 53
    iget-object v1, p0, Lcom/tencent/bugly/traffic/TrafficMonitor;->q:Lcom/tencent/bugly/proguard/e;

    .line 54
    .line 55
    .line 56
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 57
    .line 58
    sget-object v0, Lcom/tencent/bugly/common/network/NetworkWatcher;->INSTANCE:Lcom/tencent/bugly/common/network/NetworkWatcher;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0}, Lcom/tencent/bugly/common/network/NetworkWatcher;->getOperatorName()Ljava/lang/String;

    .line 62
    move-result-object v1

    .line 63
    .line 64
    sput-object v1, Lcom/tencent/bugly/traffic/TrafficMonitor;->z:Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    const-string/jumbo v1, "rmonitor_base"

    .line 68
    .line 69
    .line 70
    invoke-static {v1}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V

    .line 71
    const/4 v1, 0x0

    .line 72
    .line 73
    new-array v2, v1, [Ljava/lang/String;

    .line 74
    .line 75
    iget-object v3, p0, Lcom/tencent/bugly/traffic/TrafficMonitor;->c:Lcom/tencent/bugly/proguard/fh;

    .line 76
    .line 77
    iget-object v3, v3, Lcom/tencent/bugly/proguard/fh;->v:Ljava/util/List;

    .line 78
    .line 79
    if-eqz v3, :cond_0

    .line 80
    .line 81
    new-array v1, v1, [Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    invoke-interface {v3, v1}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 85
    move-result-object v1

    .line 86
    move-object v2, v1

    .line 87
    .line 88
    check-cast v2, [Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    :cond_0
    invoke-virtual {v0, p0}, Lcom/tencent/bugly/common/network/NetworkWatcher;->registerListener(Lcom/tencent/bugly/common/network/INetworkStateListener;)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v0}, Lcom/tencent/bugly/common/network/NetworkWatcher;->isWiFiConnectedRealtime()Z

    .line 95
    move-result v1

    .line 96
    const/4 v3, 0x2

    .line 97
    const/4 v4, 0x1

    .line 98
    .line 99
    if-eqz v1, :cond_1

    .line 100
    .line 101
    .line 102
    invoke-static {v4}, Lcom/tencent/bugly/traffic/TrafficMonitor;->nativeSetNetworkState(I)V

    .line 103
    goto :goto_0

    .line 104
    .line 105
    .line 106
    :cond_1
    invoke-virtual {v0}, Lcom/tencent/bugly/common/network/NetworkWatcher;->isNetworkConnectedRealtime()Z

    .line 107
    move-result v0

    .line 108
    .line 109
    if-eqz v0, :cond_2

    .line 110
    .line 111
    .line 112
    invoke-static {v3}, Lcom/tencent/bugly/traffic/TrafficMonitor;->nativeSetNetworkState(I)V

    .line 113
    goto :goto_0

    .line 114
    :cond_2
    const/4 v0, 0x3

    .line 115
    .line 116
    .line 117
    invoke-static {v0}, Lcom/tencent/bugly/traffic/TrafficMonitor;->nativeSetNetworkState(I)V

    .line 118
    .line 119
    .line 120
    :goto_0
    invoke-static {p0}, Lcom/tencent/rmonitor/common/lifecycle/LifecycleCallback;->register(Lcom/tencent/rmonitor/common/lifecycle/IActivityStateCallback;)V

    .line 121
    .line 122
    sget-object v0, Lcom/tencent/rmonitor/common/lifecycle/LifecycleCallback;->INSTANCE:Lcom/tencent/rmonitor/common/lifecycle/LifecycleCallback;

    .line 123
    .line 124
    .line 125
    invoke-virtual {v0}, Lcom/tencent/rmonitor/common/lifecycle/LifecycleCallback;->isCurrentForeground()Z

    .line 126
    move-result v0

    .line 127
    .line 128
    if-eqz v0, :cond_3

    .line 129
    .line 130
    .line 131
    invoke-static {v4}, Lcom/tencent/bugly/traffic/TrafficMonitor;->nativeSetForegroundState(I)V

    .line 132
    goto :goto_1

    .line 133
    .line 134
    .line 135
    :cond_3
    invoke-static {v3}, Lcom/tencent/bugly/traffic/TrafficMonitor;->nativeSetForegroundState(I)V

    .line 136
    .line 137
    .line 138
    :goto_1
    invoke-static {v4, v4, v4, v2}, Lcom/tencent/bugly/traffic/TrafficMonitor;->nativeInitMatrixTraffic(ZZZ[Ljava/lang/String;)V

    .line 139
    return-void
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

.method public final f()Z
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/tencent/bugly/common/utils/AndroidVersion;->isOverO()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 9
    .line 10
    const-string v1, "TrafficMonitor"

    .line 11
    .line 12
    const-string v2, "below android o, could not open traffic"

    .line 13
    .line 14
    .line 15
    filled-new-array {v1, v2}, [Ljava/lang/String;

    .line 16
    move-result-object v1

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v1}, Lcom/tencent/rmonitor/common/logger/Logger;->i([Ljava/lang/String;)V

    .line 20
    const/4 v0, 0x0

    .line 21
    return v0

    .line 22
    :cond_0
    const/4 v0, 0x1

    .line 23
    return v0
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

.method public g()V
    .locals 4

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/tencent/bugly/traffic/TrafficMonitor;->e:Z

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    iget-boolean v0, p0, Lcom/tencent/bugly/traffic/TrafficMonitor;->f:Z

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    goto :goto_1

    .line 10
    .line 11
    :cond_0
    iget-object v0, p0, Lcom/tencent/bugly/traffic/TrafficMonitor;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 15
    move-result v0

    .line 16
    .line 17
    if-nez v0, :cond_2

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0}, Lcom/tencent/bugly/traffic/TrafficMonitor;->f()Z

    .line 21
    move-result v0

    .line 22
    .line 23
    if-eqz v0, :cond_2

    .line 24
    .line 25
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 26
    .line 27
    const-string v1, "TrafficMonitor"

    .line 28
    .line 29
    .line 30
    const-string/jumbo v2, "traffic monitor start"

    .line 31
    .line 32
    .line 33
    filled-new-array {v1, v2}, [Ljava/lang/String;

    .line 34
    move-result-object v1

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, v1}, Lcom/tencent/rmonitor/common/logger/Logger;->i([Ljava/lang/String;)V

    .line 38
    .line 39
    iget-object v0, p0, Lcom/tencent/bugly/traffic/TrafficMonitor;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 40
    const/4 v1, 0x1

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 44
    .line 45
    .line 46
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 47
    move-result-wide v2

    .line 48
    .line 49
    iput-wide v2, p0, Lcom/tencent/bugly/traffic/TrafficMonitor;->b:J

    .line 50
    .line 51
    iget-boolean v0, p0, Lcom/tencent/bugly/traffic/TrafficMonitor;->g:Z

    .line 52
    .line 53
    if-nez v0, :cond_1

    .line 54
    .line 55
    .line 56
    invoke-virtual {p0}, Lcom/tencent/bugly/traffic/TrafficMonitor;->e()V

    .line 57
    .line 58
    iput-boolean v1, p0, Lcom/tencent/bugly/traffic/TrafficMonitor;->g:Z

    .line 59
    goto :goto_0

    .line 60
    .line 61
    .line 62
    :cond_1
    invoke-static {}, Lcom/tencent/bugly/traffic/TrafficMonitor;->nativeRestart()V

    .line 63
    .line 64
    :goto_0
    iget-object v0, p0, Lcom/tencent/bugly/traffic/TrafficMonitor;->s:Landroid/os/Handler;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    .line 68
    move-result-object v1

    .line 69
    .line 70
    .line 71
    const-wide/32 v2, 0xea60

    .line 72
    .line 73
    .line 74
    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 75
    :cond_2
    :goto_1
    return-void
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
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    .line 3
    .line 4
    invoke-static {v0}, Lcom/tencent/bugly/traffic/TrafficMonitor;->nativeSetForegroundState(I)V

    .line 5
    return-void
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

.method public onCreate(Landroid/app/Activity;)V
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
    .line 25
.end method

.method public onDestroy(Landroid/app/Activity;)V
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
    .line 25
.end method

.method public onForeground()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    .line 3
    .line 4
    invoke-static {v0}, Lcom/tencent/bugly/traffic/TrafficMonitor;->nativeSetForegroundState(I)V

    .line 5
    return-void
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

.method public onNetworkStateChanged(I)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Lcom/tencent/bugly/traffic/TrafficMonitor;->nativeSetNetworkState(I)V

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
.end method

.method public onPause(Landroid/app/Activity;)V
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
    .line 25
.end method

.method public onPostCreate(Landroid/app/Activity;)V
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
    .line 25
.end method

.method public onResume(Landroid/app/Activity;)V
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
    .line 25
.end method

.method public onStart(Landroid/app/Activity;)V
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
    .line 25
.end method

.method public onStop(Landroid/app/Activity;)V
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
    .line 25
.end method
