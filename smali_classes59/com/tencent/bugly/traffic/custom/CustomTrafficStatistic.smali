.class public Lcom/tencent/bugly/traffic/custom/CustomTrafficStatistic;
.super Ljava/lang/Object;
.source "BUGLY"


# static fields
.field public static final c:Ljava/lang/String; = "CustomTrafficStatistic"

.field public static volatile d:Z = false

.field public static volatile e:Lcom/tencent/bugly/traffic/custom/CustomTrafficStatistic; = null

.field public static f:Z = false

.field public static final g:I = 0x64

.field public static final h:I = 0xea60


# instance fields
.field public final a:Ljava/util/concurrent/ConcurrentLinkedQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentLinkedQueue<",
            "Lcom/tencent/bugly/traffic/custom/SocketInfo;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Ljava/util/concurrent/ConcurrentLinkedQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentLinkedQueue<",
            "Lcom/tencent/bugly/traffic/custom/SocketInfo;",
            ">;"
        }
    .end annotation
.end field


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
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    new-instance v0, Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;-><init>()V

    .line 9
    .line 10
    iput-object v0, p0, Lcom/tencent/bugly/traffic/custom/CustomTrafficStatistic;->a:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 11
    .line 12
    new-instance v0, Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 13
    .line 14
    .line 15
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;-><init>()V

    .line 16
    .line 17
    iput-object v0, p0, Lcom/tencent/bugly/traffic/custom/CustomTrafficStatistic;->b:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 18
    return-void
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

.method public static getInstance()Lcom/tencent/bugly/traffic/custom/CustomTrafficStatistic;
    .locals 2

    .line 1
    .line 2
    sget-object v0, Lcom/tencent/bugly/traffic/custom/CustomTrafficStatistic;->e:Lcom/tencent/bugly/traffic/custom/CustomTrafficStatistic;

    .line 3
    .line 4
    if-nez v0, :cond_1

    .line 5
    .line 6
    const-class v0, Lcom/tencent/bugly/traffic/custom/CustomTrafficStatistic;

    .line 7
    monitor-enter v0

    .line 8
    .line 9
    :try_start_0
    sget-object v1, Lcom/tencent/bugly/traffic/custom/CustomTrafficStatistic;->e:Lcom/tencent/bugly/traffic/custom/CustomTrafficStatistic;

    .line 10
    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    new-instance v1, Lcom/tencent/bugly/traffic/custom/CustomTrafficStatistic;

    .line 14
    .line 15
    .line 16
    invoke-direct {v1}, Lcom/tencent/bugly/traffic/custom/CustomTrafficStatistic;-><init>()V

    .line 17
    .line 18
    sput-object v1, Lcom/tencent/bugly/traffic/custom/CustomTrafficStatistic;->e:Lcom/tencent/bugly/traffic/custom/CustomTrafficStatistic;

    .line 19
    goto :goto_0

    .line 20
    :catchall_0
    move-exception v1

    .line 21
    goto :goto_1

    .line 22
    :cond_0
    :goto_0
    monitor-exit v0

    .line 23
    goto :goto_2

    .line 24
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    throw v1

    .line 26
    .line 27
    :cond_1
    :goto_2
    sget-object v0, Lcom/tencent/rmonitor/base/config/ConfigProxy;->INSTANCE:Lcom/tencent/rmonitor/base/config/ConfigProxy;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Lcom/tencent/rmonitor/base/config/ConfigProxy;->getConfig()Lcom/tencent/rmonitor/base/config/a;

    .line 31
    move-result-object v0

    .line 32
    .line 33
    .line 34
    const-string/jumbo v1, "traffic_detail"

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, v1}, Lcom/tencent/rmonitor/base/config/a;->c(Ljava/lang/String;)Lcom/tencent/rmonitor/base/config/DefaultPluginConfig;

    .line 38
    move-result-object v0

    .line 39
    .line 40
    iget-object v0, v0, Lcom/tencent/rmonitor/base/config/DefaultPluginConfig;->config:Lcom/tencent/bugly/proguard/hf;

    .line 41
    .line 42
    iget-boolean v0, v0, Lcom/tencent/bugly/proguard/hf;->g:Z

    .line 43
    .line 44
    sput-boolean v0, Lcom/tencent/bugly/traffic/custom/CustomTrafficStatistic;->f:Z

    .line 45
    .line 46
    sget-object v0, Lcom/tencent/bugly/traffic/custom/CustomTrafficStatistic;->e:Lcom/tencent/bugly/traffic/custom/CustomTrafficStatistic;

    .line 47
    return-object v0
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


# virtual methods
.method public addHttpToQueue(Lcom/tencent/bugly/traffic/custom/SocketInfo;)V
    .locals 2

    .line 1
    .line 2
    sget-boolean v0, Lcom/tencent/bugly/traffic/custom/CustomTrafficStatistic;->f:Z

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    sget-object p1, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 7
    .line 8
    const-string v0, "CustomTrafficStatistic"

    .line 9
    .line 10
    const-string v1, "addHttpToQueue failed"

    .line 11
    .line 12
    .line 13
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1, v0}, Lcom/tencent/rmonitor/common/logger/Logger;->i([Ljava/lang/String;)V

    .line 18
    return-void

    .line 19
    .line 20
    :cond_0
    iget-object v0, p0, Lcom/tencent/bugly/traffic/custom/CustomTrafficStatistic;->a:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->add(Ljava/lang/Object;)Z

    .line 24
    return-void
    .line 25
.end method

.method public getHttpQueue()Ljava/util/concurrent/ConcurrentLinkedQueue;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/concurrent/ConcurrentLinkedQueue<",
            "Lcom/tencent/bugly/traffic/custom/SocketInfo;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/traffic/custom/CustomTrafficStatistic;->a:Ljava/util/concurrent/ConcurrentLinkedQueue;

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

.method public getSocketToQueue()Ljava/util/concurrent/ConcurrentLinkedQueue;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/concurrent/ConcurrentLinkedQueue<",
            "Lcom/tencent/bugly/traffic/custom/SocketInfo;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/traffic/custom/CustomTrafficStatistic;->b:Ljava/util/concurrent/ConcurrentLinkedQueue;

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
