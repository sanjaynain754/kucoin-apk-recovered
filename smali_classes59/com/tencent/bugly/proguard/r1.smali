.class public Lcom/tencent/bugly/proguard/r1;
.super Lcom/tencent/rmonitor/base/plugin/monitor/QAPMMonitorPlugin;
.source "BUGLY"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/bugly/proguard/r1$a;
    }
.end annotation


# static fields
.field public static final g:Ljava/lang/String; = "RMonitor_BigBitmap_Monitor"

.field public static volatile h:Lcom/tencent/bugly/proguard/r1;


# instance fields
.field public final b:Lcom/tencent/bugly/proguard/r1$a;

.field public final c:Lcom/tencent/bugly/proguard/q1;

.field public final d:Lcom/tencent/bugly/proguard/s1;

.field public final e:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public final f:Ljava/util/concurrent/atomic/AtomicBoolean;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/tencent/rmonitor/base/plugin/monitor/QAPMMonitorPlugin;-><init>()V

    .line 4
    .line 5
    new-instance v0, Lcom/tencent/bugly/proguard/r1$a;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, p0}, Lcom/tencent/bugly/proguard/r1$a;-><init>(Lcom/tencent/bugly/proguard/r1;)V

    .line 9
    .line 10
    iput-object v0, p0, Lcom/tencent/bugly/proguard/r1;->b:Lcom/tencent/bugly/proguard/r1$a;

    .line 11
    .line 12
    new-instance v0, Lcom/tencent/bugly/proguard/q1;

    .line 13
    .line 14
    new-instance v1, Lcom/tencent/bugly/proguard/j4;

    .line 15
    .line 16
    .line 17
    invoke-direct {v1}, Lcom/tencent/bugly/proguard/j4;-><init>()V

    .line 18
    .line 19
    .line 20
    invoke-direct {v0, v1}, Lcom/tencent/bugly/proguard/q1;-><init>(Lcom/tencent/bugly/proguard/h8;)V

    .line 21
    .line 22
    iput-object v0, p0, Lcom/tencent/bugly/proguard/r1;->c:Lcom/tencent/bugly/proguard/q1;

    .line 23
    .line 24
    new-instance v0, Lcom/tencent/bugly/proguard/s1;

    .line 25
    .line 26
    .line 27
    invoke-direct {v0}, Lcom/tencent/bugly/proguard/s1;-><init>()V

    .line 28
    .line 29
    iput-object v0, p0, Lcom/tencent/bugly/proguard/r1;->d:Lcom/tencent/bugly/proguard/s1;

    .line 30
    .line 31
    new-instance v0, Ljava/util/HashSet;

    .line 32
    .line 33
    .line 34
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 35
    .line 36
    iput-object v0, p0, Lcom/tencent/bugly/proguard/r1;->e:Ljava/util/Set;

    .line 37
    .line 38
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 39
    const/4 v1, 0x0

    .line 40
    .line 41
    .line 42
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 43
    .line 44
    iput-object v0, p0, Lcom/tencent/bugly/proguard/r1;->f:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 45
    return-void
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

.method public static synthetic a(Lcom/tencent/bugly/proguard/r1;)Lcom/tencent/bugly/proguard/q1;
    .locals 0

    .line 2
    iget-object p0, p0, Lcom/tencent/bugly/proguard/r1;->c:Lcom/tencent/bugly/proguard/q1;

    return-object p0
.end method

.method public static a()Lcom/tencent/bugly/proguard/r1;
    .locals 2

    .line 3
    sget-object v0, Lcom/tencent/bugly/proguard/r1;->h:Lcom/tencent/bugly/proguard/r1;

    if-nez v0, :cond_1

    .line 4
    const-class v0, Lcom/tencent/bugly/proguard/r1;

    monitor-enter v0

    .line 5
    :try_start_0
    sget-object v1, Lcom/tencent/bugly/proguard/r1;->h:Lcom/tencent/bugly/proguard/r1;

    if-nez v1, :cond_0

    .line 6
    new-instance v1, Lcom/tencent/bugly/proguard/r1;

    invoke-direct {v1}, Lcom/tencent/bugly/proguard/r1;-><init>()V

    sput-object v1, Lcom/tencent/bugly/proguard/r1;->h:Lcom/tencent/bugly/proguard/r1;

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    .line 7
    :cond_0
    :goto_0
    monitor-exit v0

    goto :goto_2

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    .line 8
    :cond_1
    :goto_2
    sget-object v0, Lcom/tencent/bugly/proguard/r1;->h:Lcom/tencent/bugly/proguard/r1;

    return-object v0
.end method

.method public static synthetic a(Lcom/tencent/bugly/proguard/r1;Ljava/lang/String;)Z
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/tencent/bugly/proguard/r1;->b(Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method public static synthetic b(Lcom/tencent/bugly/proguard/r1;)Lcom/tencent/bugly/proguard/s1;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/tencent/bugly/proguard/r1;->d:Lcom/tencent/bugly/proguard/s1;

    return-object p0
.end method


# virtual methods
.method public a(Ljava/util/List;)Lcom/tencent/bugly/proguard/r1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/tencent/bugly/proguard/r1;"
        }
    .end annotation

    .line 9
    iget-object v0, p0, Lcom/tencent/bugly/proguard/r1;->e:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    return-object p0
.end method

.method public final b()V
    .locals 4

    .line 2
    new-instance v0, Ljava/io/File;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 3
    invoke-static {}, Lcom/tencent/rmonitor/common/util/FileUtil;->getRootPath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v2, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "dumpfile"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "big_bitmap"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 4
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-nez v1, :cond_0

    .line 5
    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    .line 6
    :cond_0
    iget-object v0, p0, Lcom/tencent/bugly/proguard/r1;->f:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 7
    iget-object v0, p0, Lcom/tencent/bugly/proguard/r1;->c:Lcom/tencent/bugly/proguard/q1;

    new-instance v1, Lcom/tencent/bugly/proguard/u1;

    invoke-direct {v1}, Lcom/tencent/bugly/proguard/u1;-><init>()V

    invoke-virtual {v0, v1}, Lcom/tencent/bugly/proguard/q1;->a(Lcom/tencent/bugly/proguard/c;)V

    .line 8
    iget-object v0, p0, Lcom/tencent/bugly/proguard/r1;->c:Lcom/tencent/bugly/proguard/q1;

    new-instance v1, Lcom/tencent/bugly/proguard/og;

    invoke-direct {v1}, Lcom/tencent/bugly/proguard/og;-><init>()V

    invoke-virtual {v0, v1}, Lcom/tencent/bugly/proguard/q1;->a(Lcom/tencent/bugly/proguard/c;)V

    .line 9
    iget-object v0, p0, Lcom/tencent/bugly/proguard/r1;->c:Lcom/tencent/bugly/proguard/q1;

    new-instance v1, Lcom/tencent/bugly/proguard/xf;

    invoke-direct {v1}, Lcom/tencent/bugly/proguard/xf;-><init>()V

    invoke-virtual {v0, v1}, Lcom/tencent/bugly/proguard/q1;->a(Lcom/tencent/bugly/proguard/c;)V

    :cond_1
    return-void
.end method

.method public final b(Ljava/lang/String;)Z
    .locals 1

    .line 10
    iget-object v0, p0, Lcom/tencent/bugly/proguard/r1;->e:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public start()V
    .locals 3

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
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 9
    .line 10
    const-string v1, "RMonitor_BigBitmap_Monitor"

    .line 11
    .line 12
    const-string v2, "BigBitMap don\'t support below JellyBean"

    .line 13
    .line 14
    .line 15
    filled-new-array {v1, v2}, [Ljava/lang/String;

    .line 16
    move-result-object v1

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v1}, Lcom/tencent/rmonitor/common/logger/Logger;->w([Ljava/lang/String;)V

    .line 20
    return-void

    .line 21
    .line 22
    .line 23
    :cond_0
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/r1;->b()V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/r1;->stop()V

    .line 27
    .line 28
    iget-object v0, p0, Lcom/tencent/bugly/proguard/r1;->b:Lcom/tencent/bugly/proguard/r1$a;

    .line 29
    .line 30
    .line 31
    invoke-static {v0}, Lcom/tencent/rmonitor/common/lifecycle/LifecycleCallback;->register(Lcom/tencent/rmonitor/common/lifecycle/IActivityStateCallback;)V

    .line 32
    .line 33
    .line 34
    invoke-static {}, Lcom/tencent/bugly/proguard/cf;->a()Lcom/tencent/bugly/proguard/cf;

    .line 35
    move-result-object v0

    .line 36
    .line 37
    const-string v1, "big_bitmap"

    .line 38
    .line 39
    .line 40
    invoke-static {v1}, Lcom/tencent/bugly/proguard/vd;->a(Ljava/lang/String;)Lcom/tencent/bugly/proguard/ef;

    .line 41
    move-result-object v1

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0, v1}, Lcom/tencent/bugly/proguard/cf;->b(Lcom/tencent/bugly/proguard/ef;)V

    .line 45
    return-void
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

.method public stop()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/r1;->b:Lcom/tencent/bugly/proguard/r1$a;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Lcom/tencent/rmonitor/common/lifecycle/LifecycleCallback;->unRegister(Lcom/tencent/rmonitor/common/lifecycle/IActivityStateCallback;)V

    .line 6
    .line 7
    .line 8
    invoke-static {}, Lcom/tencent/bugly/proguard/cf;->a()Lcom/tencent/bugly/proguard/cf;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    const-string v1, "big_bitmap"

    .line 12
    .line 13
    .line 14
    invoke-static {v1}, Lcom/tencent/bugly/proguard/vd;->a(Ljava/lang/String;)Lcom/tencent/bugly/proguard/ef;

    .line 15
    move-result-object v1

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, v1}, Lcom/tencent/bugly/proguard/cf;->a(Lcom/tencent/bugly/proguard/ef;)V

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
